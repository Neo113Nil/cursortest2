package javazoom.jl.decoder;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.OpusUtil;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* loaded from: classes9.dex */
public final class Header {
    public static final int DUAL_CHANNEL = 2;
    public static final int FOURTYEIGHT = 1;
    public static final int FOURTYFOUR_POINT_ONE = 0;
    public static final int JOINT_STEREO = 1;
    public static final int MPEG1 = 1;
    public static final int MPEG25_LSF = 2;
    public static final int MPEG2_LSF = 0;
    public static final int SINGLE_CHANNEL = 3;
    public static final int STEREO = 0;
    public static final int THIRTYTWO = 2;
    public short checksum;
    private Crc16 crc;
    public int framesize;
    private int h_bitrate_index;
    private boolean h_copyright;
    private int h_intensity_stereo_bound;
    private int h_layer;
    private int h_mode;
    private int h_mode_extension;
    private int h_number_of_subbands;
    private boolean h_original;
    private int h_padding_bit;
    private int h_protection_bit;
    private int h_sample_frequency;
    private boolean h_vbr;
    private int h_vbr_bytes;
    private int h_vbr_frames;
    private int h_vbr_scale;
    private byte[] h_vbr_toc;
    private int h_version;
    public int nSlots;
    public static final int[][] frequencies = {new int[]{22050, 24000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 1}, new int[]{AudioConstants.AUDIO_SAMPLE_RATE, OpusUtil.SAMPLE_RATE, 32000, 1}, new int[]{11025, 12000, 8000, 1}};
    public static final int[][][] bitrates = {new int[][]{new int[]{0, 32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 0}, new int[]{0, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000, 0}, new int[]{0, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000, 0}}, new int[][]{new int[]{0, 32000, 64000, 96000, AudioConstants.AUDIO_BIT_RATE, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000, 0}, new int[]{0, 32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000, 0}, new int[]{0, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 0}}, new int[][]{new int[]{0, 32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 0}, new int[]{0, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000, 0}, new int[]{0, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, AudioConstants.AUDIO_BIT_RATE, 144000, 160000, 0}}};
    public static final String[][][] bitrate_str = {new String[][]{new String[]{"free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "176 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "forbidden"}, new String[]{"free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden"}, new String[]{"free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden"}}, new String[][]{new String[]{"free format", "32 kbit/s", "64 kbit/s", "96 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "288 kbit/s", "320 kbit/s", "352 kbit/s", "384 kbit/s", "416 kbit/s", "448 kbit/s", "forbidden"}, new String[]{"free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "320 kbit/s", "384 kbit/s", "forbidden"}, new String[]{"free format", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "320 kbit/s", "forbidden"}}, new String[][]{new String[]{"free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "176 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "forbidden"}, new String[]{"free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden"}, new String[]{"free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden"}}};
    private double[] h_vbr_time_per_frame = {-1.0d, 384.0d, 1152.0d, 1152.0d};
    private byte syncmode = Bitstream.INITIAL_SYNC;
    private int _headerstring = -1;

    Header() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append("Layer ");
        stringBuffer.append(layer_string());
        stringBuffer.append(" frame ");
        stringBuffer.append(mode_string());
        stringBuffer.append(' ');
        stringBuffer.append(version_string());
        if (!checksums()) {
            stringBuffer.append(" no");
        }
        stringBuffer.append(" checksums ");
        stringBuffer.append(sample_frequency_string());
        stringBuffer.append(", ");
        stringBuffer.append(bitrate_string());
        return stringBuffer.toString();
    }

    void read_header(Bitstream bitstream, Crc16[] crc16Arr) throws BitstreamException {
        int syncHeader;
        boolean z = false;
        do {
            syncHeader = bitstream.syncHeader(this.syncmode);
            this._headerstring = syncHeader;
            if (this.syncmode == Bitstream.INITIAL_SYNC) {
                int i = (syncHeader >>> 19) & 1;
                this.h_version = i;
                if (((syncHeader >>> 20) & 1) == 0) {
                    if (i == 0) {
                        this.h_version = 2;
                    } else {
                        throw bitstream.newBitstreamException(256);
                    }
                }
                int i2 = (syncHeader >>> 10) & 3;
                this.h_sample_frequency = i2;
                if (i2 == 3) {
                    throw bitstream.newBitstreamException(256);
                }
            }
            int i3 = (4 - (syncHeader >>> 17)) & 3;
            this.h_layer = i3;
            this.h_protection_bit = (syncHeader >>> 16) & 1;
            int i4 = (syncHeader >>> 12) & 15;
            this.h_bitrate_index = i4;
            this.h_padding_bit = (syncHeader >>> 9) & 1;
            int i5 = (syncHeader >>> 6) & 3;
            this.h_mode = i5;
            int i6 = (syncHeader >>> 4) & 3;
            this.h_mode_extension = i6;
            if (i5 == 1) {
                this.h_intensity_stereo_bound = (i6 << 2) + 4;
            } else {
                this.h_intensity_stereo_bound = 0;
            }
            if (((syncHeader >>> 3) & 1) == 1) {
                this.h_copyright = true;
            }
            if (((syncHeader >>> 2) & 1) == 1) {
                this.h_original = true;
            }
            if (i3 == 1) {
                this.h_number_of_subbands = 32;
            } else {
                if (i5 != 3) {
                    i4 = i4 == 4 ? 1 : i4 - 4;
                }
                if (i4 == 1 || i4 == 2) {
                    if (this.h_sample_frequency == 2) {
                        this.h_number_of_subbands = 12;
                    } else {
                        this.h_number_of_subbands = 8;
                    }
                } else if (this.h_sample_frequency == 1 || (i4 >= 3 && i4 <= 5)) {
                    this.h_number_of_subbands = 27;
                } else {
                    this.h_number_of_subbands = 30;
                }
            }
            int i7 = this.h_intensity_stereo_bound;
            int i8 = this.h_number_of_subbands;
            if (i7 > i8) {
                this.h_intensity_stereo_bound = i8;
            }
            calculate_framesize();
            int read_frame_data = bitstream.read_frame_data(this.framesize);
            int i9 = this.framesize;
            if (i9 >= 0 && read_frame_data != i9) {
                throw bitstream.newBitstreamException(BitstreamErrors.INVALIDFRAME);
            }
            if (bitstream.isSyncCurrentPosition(this.syncmode)) {
                if (this.syncmode == Bitstream.INITIAL_SYNC) {
                    this.syncmode = Bitstream.STRICT_SYNC;
                    bitstream.set_syncword((-521024) & syncHeader);
                }
                z = true;
            } else {
                bitstream.unreadFrame();
            }
        } while (!z);
        bitstream.parse_frame();
        if (this.h_protection_bit == 0) {
            this.checksum = (short) bitstream.get_bits(16);
            if (this.crc == null) {
                this.crc = new Crc16();
            }
            this.crc.add_bits(syncHeader, 16);
            crc16Arr[0] = this.crc;
            return;
        }
        crc16Arr[0] = null;
    }

    void parseVBR(byte[] bArr) throws BitstreamException {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr2 = new byte[4];
        int i5 = 17;
        if (this.h_version == 1) {
            if (this.h_mode != 3) {
                i5 = 32;
            }
        } else if (this.h_mode == 3) {
            i5 = 9;
        }
        try {
            System.arraycopy(bArr, i5, bArr2, 0, 4);
            if ("Xing".equals(new String(bArr2))) {
                this.h_vbr = true;
                this.h_vbr_frames = -1;
                this.h_vbr_bytes = -1;
                this.h_vbr_scale = -1;
                this.h_vbr_toc = new byte[100];
                byte[] bArr3 = new byte[4];
                c = 3;
                System.arraycopy(bArr, i5 + 4, bArr3, 0, 4);
                if ((bArr3[3] & 1) != 0) {
                    System.arraycopy(bArr, i5 + 8, bArr2, 0, 4);
                    i = 65280;
                    this.h_vbr_frames = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr2[3] & 255);
                    i4 = 12;
                } else {
                    i = 65280;
                    i4 = 8;
                }
                if ((bArr3[3] & 2) != 0) {
                    System.arraycopy(bArr, i5 + i4, bArr2, 0, 4);
                    i2 = 16711680;
                    this.h_vbr_bytes = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & i) | (bArr2[3] & 255);
                    i4 += 4;
                } else {
                    i2 = 16711680;
                }
                if ((bArr3[3] & 4) != 0) {
                    byte[] bArr4 = this.h_vbr_toc;
                    i3 = -16777216;
                    System.arraycopy(bArr, i5 + i4, bArr4, 0, bArr4.length);
                    i4 += this.h_vbr_toc.length;
                } else {
                    i3 = -16777216;
                }
                if ((bArr3[3] & 8) != 0) {
                    System.arraycopy(bArr, i5 + i4, bArr2, 0, 4);
                    this.h_vbr_scale = ((bArr2[0] << 24) & i3) | ((bArr2[1] << 16) & i2) | ((bArr2[2] << 8) & i) | (bArr2[3] & 255);
                }
            } else {
                c = 3;
                i = 65280;
                i2 = 16711680;
                i3 = -16777216;
            }
            try {
                System.arraycopy(bArr, 32, bArr2, 0, 4);
                if ("VBRI".equals(new String(bArr2))) {
                    this.h_vbr = true;
                    this.h_vbr_frames = -1;
                    this.h_vbr_bytes = -1;
                    this.h_vbr_scale = -1;
                    this.h_vbr_toc = new byte[100];
                    System.arraycopy(bArr, 42, bArr2, 0, 4);
                    this.h_vbr_bytes = ((bArr2[0] << 24) & i3) | ((bArr2[1] << 16) & i2) | ((bArr2[2] << 8) & i) | (bArr2[c] & 255);
                    System.arraycopy(bArr, 46, bArr2, 0, 4);
                    this.h_vbr_frames = ((bArr2[0] << 24) & i3) | ((bArr2[1] << 16) & i2) | ((bArr2[2] << 8) & i) | (bArr2[c] & 255);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new BitstreamException("VBRIVBRHeader Corrupted", e);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new BitstreamException("XingVBRHeader Corrupted", e2);
        }
    }

    public int version() {
        return this.h_version;
    }

    public int layer() {
        return this.h_layer;
    }

    public int bitrate_index() {
        return this.h_bitrate_index;
    }

    public int sample_frequency() {
        return this.h_sample_frequency;
    }

    public int frequency() {
        return frequencies[this.h_version][this.h_sample_frequency];
    }

    public int mode() {
        return this.h_mode;
    }

    public boolean checksums() {
        return this.h_protection_bit == 0;
    }

    public boolean copyright() {
        return this.h_copyright;
    }

    public boolean original() {
        return this.h_original;
    }

    public boolean vbr() {
        return this.h_vbr;
    }

    public int vbr_scale() {
        return this.h_vbr_scale;
    }

    public byte[] vbr_toc() {
        return this.h_vbr_toc;
    }

    public boolean checksum_ok() {
        return this.checksum == this.crc.checksum();
    }

    public boolean padding() {
        return this.h_padding_bit != 0;
    }

    public int slots() {
        return this.nSlots;
    }

    public int mode_extension() {
        return this.h_mode_extension;
    }

    public int calculate_framesize() {
        int i = this.h_layer;
        if (i == 1) {
            int[][][] iArr = bitrates;
            int i2 = this.h_version;
            int i3 = (iArr[i2][0][this.h_bitrate_index] * 12) / frequencies[i2][this.h_sample_frequency];
            this.framesize = i3;
            if (this.h_padding_bit != 0) {
                this.framesize = i3 + 1;
            }
            this.framesize <<= 2;
            this.nSlots = 0;
        } else {
            int[][][] iArr2 = bitrates;
            int i4 = this.h_version;
            int i5 = (iArr2[i4][i - 1][this.h_bitrate_index] * 144) / frequencies[i4][this.h_sample_frequency];
            this.framesize = i5;
            if (i4 == 0 || i4 == 2) {
                this.framesize = i5 >> 1;
            }
            if (this.h_padding_bit != 0) {
                this.framesize++;
            }
            if (i == 3) {
                if (i4 == 1) {
                    this.nSlots = ((this.framesize - (this.h_mode != 3 ? 32 : 17)) - (this.h_protection_bit != 0 ? 0 : 2)) - 4;
                } else {
                    this.nSlots = ((this.framesize - (this.h_mode == 3 ? 9 : 17)) - (this.h_protection_bit != 0 ? 0 : 2)) - 4;
                }
            } else {
                this.nSlots = 0;
            }
        }
        int i6 = this.framesize - 4;
        this.framesize = i6;
        return i6;
    }

    public int max_number_of_frames(int i) {
        if (this.h_vbr) {
            return this.h_vbr_frames;
        }
        int i2 = this.framesize;
        int i3 = this.h_padding_bit;
        if ((i2 + 4) - i3 == 0) {
            return 0;
        }
        return i / ((i2 + 4) - i3);
    }

    public int min_number_of_frames(int i) {
        if (this.h_vbr) {
            return this.h_vbr_frames;
        }
        int i2 = this.framesize;
        int i3 = this.h_padding_bit;
        if ((i2 + 5) - i3 == 0) {
            return 0;
        }
        return i / ((i2 + 5) - i3);
    }

    public float ms_per_frame() {
        if (this.h_vbr) {
            double frequency = this.h_vbr_time_per_frame[layer()] / frequency();
            int i = this.h_version;
            if (i == 0 || i == 2) {
                frequency /= 2.0d;
            }
            return (float) (frequency * 1000.0d);
        }
        return new float[][]{new float[]{8.707483f, 8.0f, 12.0f}, new float[]{26.12245f, 24.0f, 36.0f}, new float[]{26.12245f, 24.0f, 36.0f}}[this.h_layer - 1][this.h_sample_frequency];
    }

    public float total_ms(int i) {
        return max_number_of_frames(i) * ms_per_frame();
    }

    public int getSyncHeader() {
        return this._headerstring;
    }

    public String layer_string() {
        int i = this.h_layer;
        if (i == 1) {
            return "I";
        }
        if (i == 2) {
            return "II";
        }
        if (i != 3) {
            return null;
        }
        return "III";
    }

    public String bitrate_string() {
        if (this.h_vbr) {
            return Integer.toString(bitrate() / 1000) + " kb/s";
        }
        return bitrate_str[this.h_version][this.h_layer - 1][this.h_bitrate_index];
    }

    public int bitrate() {
        if (this.h_vbr) {
            return ((int) ((this.h_vbr_bytes * 8) / (ms_per_frame() * this.h_vbr_frames))) * 1000;
        }
        return bitrates[this.h_version][this.h_layer - 1][this.h_bitrate_index];
    }

    public int bitrate_instant() {
        return bitrates[this.h_version][this.h_layer - 1][this.h_bitrate_index];
    }

    public String sample_frequency_string() {
        int i = this.h_sample_frequency;
        if (i == 0) {
            int i2 = this.h_version;
            if (i2 == 1) {
                return "44.1 kHz";
            }
            if (i2 == 0) {
                return "22.05 kHz";
            }
            return "11.025 kHz";
        }
        if (i == 1) {
            int i3 = this.h_version;
            if (i3 == 1) {
                return "48 kHz";
            }
            if (i3 == 0) {
                return "24 kHz";
            }
            return "12 kHz";
        }
        if (i != 2) {
            return null;
        }
        int i4 = this.h_version;
        if (i4 == 1) {
            return "32 kHz";
        }
        if (i4 == 0) {
            return "16 kHz";
        }
        return "8 kHz";
    }

    public String mode_string() {
        int i = this.h_mode;
        if (i == 0) {
            return "Stereo";
        }
        if (i == 1) {
            return "Joint stereo";
        }
        if (i == 2) {
            return "Dual channel";
        }
        if (i != 3) {
            return null;
        }
        return "Single channel";
    }

    public String version_string() {
        int i = this.h_version;
        if (i == 0) {
            return "MPEG-2 LSF";
        }
        if (i == 1) {
            return "MPEG-1";
        }
        if (i != 2) {
            return null;
        }
        return "MPEG-2.5 LSF";
    }

    public int number_of_subbands() {
        return this.h_number_of_subbands;
    }

    public int intensity_stereo_bound() {
        return this.h_intensity_stereo_bound;
    }
}
