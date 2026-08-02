package com.squareup.wire;

import java.io.IOException;
import okio.ByteString;
import xsna.an8;
import xsna.zcl;

/* compiled from: ProtoWriter.kt */
/* loaded from: classes14.dex */
public final class ProtoWriter {
    public static final Companion Companion = new Companion(null);
    private final an8 sink;

    /* compiled from: ProtoWriter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final int decodeZigZag32$wire_runtime(int i) {
            return (-(i & 1)) ^ (i >>> 1);
        }

        public final long decodeZigZag64$wire_runtime(long j) {
            return (-(j & 1)) ^ (j >>> 1);
        }

        public final int encodeZigZag32$wire_runtime(int i) {
            return (i >> 31) ^ (i << 1);
        }

        public final long encodeZigZag64$wire_runtime(long j) {
            return (j >> 63) ^ (j << 1);
        }

        public final int int32Size$wire_runtime(int i) {
            if (i >= 0) {
                return varint32Size$wire_runtime(i);
            }
            return 10;
        }

        public final int makeTag$wire_runtime(int i, FieldEncoding fieldEncoding) {
            return (i << 3) | fieldEncoding.getValue$wire_runtime();
        }

        public final int tagSize$wire_runtime(int i) {
            return varint32Size$wire_runtime(makeTag$wire_runtime(i, FieldEncoding.VARINT));
        }

        public final int varint32Size$wire_runtime(int i) {
            if ((i & (-128)) == 0) {
                return 1;
            }
            if ((i & (-16384)) == 0) {
                return 2;
            }
            if (((-2097152) & i) == 0) {
                return 3;
            }
            return (i & (-268435456)) == 0 ? 4 : 5;
        }

        public final int varint64Size$wire_runtime(long j) {
            if (((-128) & j) == 0) {
                return 1;
            }
            if (((-16384) & j) == 0) {
                return 2;
            }
            if (((-2097152) & j) == 0) {
                return 3;
            }
            if (((-268435456) & j) == 0) {
                return 4;
            }
            if (((-34359738368L) & j) == 0) {
                return 5;
            }
            if (((-4398046511104L) & j) == 0) {
                return 6;
            }
            if (((-562949953421312L) & j) == 0) {
                return 7;
            }
            if (((-72057594037927936L) & j) == 0) {
                return 8;
            }
            return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
        }

        private Companion() {
        }
    }

    public ProtoWriter(an8 an8Var) {
        this.sink = an8Var;
    }

    public final void writeBytes(ByteString byteString) throws IOException {
        this.sink.P0(byteString);
    }

    public final void writeFixed32(int i) throws IOException {
        this.sink.W2(i);
    }

    public final void writeFixed64(long j) throws IOException {
        this.sink.y2(j);
    }

    public final void writeSignedVarint32$wire_runtime(int i) throws IOException {
        if (i >= 0) {
            writeVarint32(i);
        } else {
            writeVarint64(i);
        }
    }

    public final void writeString(String str) throws IOException {
        this.sink.y1(str);
    }

    public final void writeTag(int i, FieldEncoding fieldEncoding) throws IOException {
        writeVarint32(Companion.makeTag$wire_runtime(i, fieldEncoding));
    }

    public final void writeVarint32(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.sink.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        this.sink.writeByte(i);
    }

    public final void writeVarint64(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.sink.writeByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.sink.writeByte((int) j);
    }
}
