package com.davidehrmann.vcdiff.engine;

import com.davidehrmann.vcdiff.util.VarInt;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes6.dex */
class VCDiffHeaderParser {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) VCDiffHeaderParser.class);
    public static final short RESULT_END_OF_DATA = -2;
    public static final short RESULT_SUCCESS = 0;
    public static final byte VCD_ADDRCOMP = 4;
    public static final byte VCD_CODETABLE = 2;
    public static final byte VCD_DATACOMP = 1;
    public static final byte VCD_DECOMPRESS = 1;
    public static final byte VCD_INSTCOMP = 2;
    protected final ByteBuffer buffer;
    protected ByteBuffer deltaEncodingStart;
    protected IOException exception;
    protected short returnCode = 0;
    protected Integer deltaEncodingLength = 0;

    public VCDiffHeaderParser(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer.duplicate();
    }

    public Byte parseByte() throws IOException {
        if (this.returnCode != 0) {
            return null;
        }
        IOException iOException = this.exception;
        if (iOException != null) {
            throw iOException;
        }
        if (!this.buffer.hasRemaining()) {
            this.returnCode = (short) -2;
            return null;
        }
        return Byte.valueOf(this.buffer.get());
    }

    public Integer parseInt32(String str) throws IOException {
        if (this.returnCode != 0) {
            return null;
        }
        IOException iOException = this.exception;
        if (iOException != null) {
            throw iOException;
        }
        this.buffer.mark();
        try {
            return Integer.valueOf(VarInt.getInt(this.buffer));
        } catch (VarInt.VarIntEndOfBufferException unused) {
            this.buffer.reset();
            this.returnCode = (short) -2;
            return null;
        } catch (VarInt.VarIntParseException unused2) {
            this.buffer.reset();
            IOException iOException2 = new IOException("Expected " + str + "; found invalid variable-length integer");
            this.exception = iOException2;
            throw iOException2;
        }
    }

    public Integer parseUInt32(String str) throws IOException {
        if (this.returnCode != 0) {
            return null;
        }
        IOException iOException = this.exception;
        if (iOException != null) {
            throw iOException;
        }
        try {
            this.buffer.mark();
            long j = VarInt.getLong(this.buffer);
            if (((-4294967296L) & j) != 0) {
                this.buffer.reset();
                IOException iOException2 = new IOException(String.format("Value of {} ({}) is too large for unsigned 32-bit integer", str, Long.valueOf(j)));
                this.exception = iOException2;
                throw iOException2;
            }
            return Integer.valueOf((int) j);
        } catch (VarInt.VarIntEndOfBufferException unused) {
            this.returnCode = (short) -2;
            this.buffer.reset();
            return null;
        } catch (VarInt.VarIntParseException unused2) {
            this.buffer.reset();
            IOException iOException3 = new IOException(String.format("Expected {}; found invalid variable-length integer", str));
            this.exception = iOException3;
            throw iOException3;
        }
    }

    public Integer parseChecksum(String str) throws IOException {
        return parseUInt32(str);
    }

    public Integer parseSize(String str) throws IOException {
        return parseInt32(str);
    }

    public DeltaWindowHeader parseWinIndicatorAndSourceSegment(int i, int i2, boolean z) throws IOException {
        Byte parseByte = parseByte();
        if (parseByte == null) {
            return null;
        }
        int byteValue = parseByte.byteValue() & 248;
        if (byteValue != 0) {
            LOGGER.warn(String.format("Unrecognized win_indicator flags: 0x%02x", Integer.valueOf(byteValue)));
        }
        int byteValue2 = parseByte.byteValue() & 3;
        if (byteValue2 == 1) {
            return parseSourceSegmentLengthAndPosition(i, parseByte.byteValue(), "end of dictionary", "dictionary");
        }
        if (byteValue2 != 2) {
            if (byteValue2 == 3) {
                IOException iOException = new IOException("Win_Indicator must not have both VCD_SOURCE and VCD_TARGET set");
                this.exception = iOException;
                throw iOException;
            }
            return new DeltaWindowHeader(parseByte.byteValue(), 0, 0);
        }
        if (!z) {
            IOException iOException2 = new IOException("Delta file contains VCD_TARGET flag, which is not allowed by current decoder settings");
            this.exception = iOException2;
            throw iOException2;
        }
        return parseSourceSegmentLengthAndPosition(i2, parseByte.byteValue(), "current target position", "target file");
    }

    public Integer ParseWindowLengths() throws IOException {
        if (this.deltaEncodingStart != null) {
            IOException iOException = new IOException("Internal error: VCDiffHeaderParser.ParseWindowLengths was called twice for the same delta window");
            this.exception = iOException;
            throw iOException;
        }
        Integer parseSize = parseSize("length of the delta encoding");
        this.deltaEncodingLength = parseSize;
        if (parseSize == null) {
            return null;
        }
        this.deltaEncodingStart = this.buffer.duplicate();
        return parseSize("size of the target window");
    }

    public Integer endOfDeltaWindow() {
        ByteBuffer byteBuffer = this.deltaEncodingStart;
        if (byteBuffer == null) {
            throw new IllegalStateException("Internal error: VCDiffHeaderParser.GetDeltaWindowEnd was called before ParseWindowLengths");
        }
        return Integer.valueOf(byteBuffer.position() + this.deltaEncodingLength.intValue());
    }

    public boolean parseDeltaIndicator() throws IOException {
        Byte parseByte = parseByte();
        if (parseByte == null) {
            return false;
        }
        if ((parseByte.byteValue() & 7) == 0) {
            return true;
        }
        IOException iOException = new IOException("Secondary compression of delta file sections is not supported");
        this.exception = iOException;
        throw iOException;
    }

    public SectionLengths parseSectionLengths(boolean z) throws IOException {
        Integer parseSize = parseSize("length of data for ADDs and RUNs");
        Integer parseSize2 = parseSize("length of instructions section");
        Integer parseSize3 = parseSize("length of addresses for COPYs");
        Integer parseChecksum = z ? parseChecksum("Adler32 checksum value") : null;
        if (this.returnCode != 0) {
            return null;
        }
        IOException iOException = this.exception;
        if (iOException != null) {
            throw iOException;
        }
        if (this.deltaEncodingStart == null) {
            IOException iOException2 = new IOException("Internal error: VCDiffHeaderParser.parseSectionLengths was called before ParseWindowLengths");
            this.exception = iOException2;
            throw iOException2;
        }
        if (this.deltaEncodingLength.intValue() != (this.buffer.position() - this.deltaEncodingStart.position()) + parseSize.intValue() + parseSize2.intValue() + parseSize3.intValue()) {
            IOException iOException3 = new IOException("The length of the delta encoding does not match the size of the header plus the sizes of the data sections");
            this.exception = iOException3;
            throw iOException3;
        }
        return new SectionLengths(parseSize.intValue(), parseSize2.intValue(), parseSize3.intValue(), parseChecksum != null ? parseChecksum.intValue() : 0);
    }

    public short getResult() {
        return this.returnCode;
    }

    public ByteBuffer unparsedData() {
        return this.buffer.duplicate().asReadOnlyBuffer();
    }

    private DeltaWindowHeader parseSourceSegmentLengthAndPosition(long j, byte b, String str, String str2) throws IOException {
        Integer parseSize = parseSize("source segment length");
        if (parseSize == null) {
            return null;
        }
        if (parseSize.intValue() > j) {
            IOException iOException = new IOException(String.format("Source segment length (%d) is larger than %s (%d)", parseSize, str2, Long.valueOf(j)));
            this.exception = iOException;
            throw iOException;
        }
        Integer parseSize2 = parseSize("source segment position");
        if (parseSize2 == null) {
            return null;
        }
        if (parseSize2.intValue() >= j && parseSize.intValue() > 0) {
            IOException iOException2 = new IOException(String.format("Source segment position (%d) is past %s (%d)", parseSize2, str, Long.valueOf(j)));
            this.exception = iOException2;
            throw iOException2;
        }
        int intValue = parseSize2.intValue() + parseSize.intValue();
        if (intValue > j) {
            IOException iOException3 = new IOException(String.format("Source segment end position ({}) is past {} ({})", Integer.valueOf(intValue), str, Long.valueOf(j)));
            this.exception = iOException3;
            throw iOException3;
        }
        return new DeltaWindowHeader(b, parseSize.intValue(), parseSize2.intValue());
    }

    public static final class DeltaWindowHeader {
        public final int source_segment_length;
        public final int source_segment_position;
        public final byte win_indicator;

        public DeltaWindowHeader(byte b, int i, int i2) {
            this.win_indicator = b;
            this.source_segment_length = i;
            this.source_segment_position = i2;
        }
    }

    public static final class SectionLengths {
        public final int add_and_run_data_length;
        public final int addresses_length;
        public final int checksum;
        public final int instructions_and_sizes_length;

        public SectionLengths(int i, int i2, int i3, int i4) {
            this.add_and_run_data_length = i;
            this.instructions_and_sizes_length = i2;
            this.addresses_length = i3;
            this.checksum = i4;
        }
    }
}
