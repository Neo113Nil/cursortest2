package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.audio.Ac3Util;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ChunkIndex;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.LongArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.AvcConfig;
import com.mbridge.msdk.playercommon.exoplayer2.video.ColorInfo;
import com.mbridge.msdk.playercommon.exoplayer2.video.HevcConfig;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.vxd;
import defpackage.yhk;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class MatroskaExtractor implements Extractor {
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private long blockDurationUs;
    private int blockFlags;
    private int blockLacingSampleCount;
    private int blockLacingSampleIndex;
    private int[] blockLacingSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private LongArray cueClusterPositions;
    private LongArray cueTimesUs;
    private long cuesContentPosition;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private boolean sampleRead;
    private boolean sampleSeenReferenceBlock;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.MatroskaExtractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new MatroskaExtractor()};
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SUBRIP_TIMECODE_EMPTY = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] SSA_TIMECODE_EMPTY = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class InnerEbmlReaderOutput implements EbmlReaderOutput {
        private InnerEbmlReaderOutput() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException, InterruptedException {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public void endMasterElement(int i) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public void floatElement(int i, double d) throws ParserException {
            MatroskaExtractor.this.floatElement(i, d);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public int getElementType(int i) {
            switch (i) {
                case 131:
                case 136:
                case MatroskaExtractor.ID_BLOCK_DURATION /* 155 */:
                case MatroskaExtractor.ID_CHANNELS /* 159 */:
                case MatroskaExtractor.ID_PIXEL_WIDTH /* 176 */:
                case MatroskaExtractor.ID_CUE_TIME /* 179 */:
                case MatroskaExtractor.ID_PIXEL_HEIGHT /* 186 */:
                case 215:
                case MatroskaExtractor.ID_TIME_CODE /* 231 */:
                case MatroskaExtractor.ID_CUE_CLUSTER_POSITION /* 241 */:
                case MatroskaExtractor.ID_REFERENCE_BLOCK /* 251 */:
                case MatroskaExtractor.ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                case MatroskaExtractor.ID_DOC_TYPE_READ_VERSION /* 17029 */:
                case MatroskaExtractor.ID_EBML_READ_VERSION /* 17143 */:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                case MatroskaExtractor.ID_CONTENT_ENCODING_ORDER /* 20529 */:
                case MatroskaExtractor.ID_CONTENT_ENCODING_SCOPE /* 20530 */:
                case MatroskaExtractor.ID_SEEK_POSITION /* 21420 */:
                case MatroskaExtractor.ID_STEREO_MODE /* 21432 */:
                case MatroskaExtractor.ID_DISPLAY_WIDTH /* 21680 */:
                case MatroskaExtractor.ID_DISPLAY_UNIT /* 21682 */:
                case MatroskaExtractor.ID_DISPLAY_HEIGHT /* 21690 */:
                case MatroskaExtractor.ID_FLAG_FORCED /* 21930 */:
                case MatroskaExtractor.ID_COLOUR_RANGE /* 21945 */:
                case MatroskaExtractor.ID_COLOUR_TRANSFER /* 21946 */:
                case MatroskaExtractor.ID_COLOUR_PRIMARIES /* 21947 */:
                case MatroskaExtractor.ID_MAX_CLL /* 21948 */:
                case MatroskaExtractor.ID_MAX_FALL /* 21949 */:
                case MatroskaExtractor.ID_CODEC_DELAY /* 22186 */:
                case MatroskaExtractor.ID_SEEK_PRE_ROLL /* 22203 */:
                case MatroskaExtractor.ID_AUDIO_BIT_DEPTH /* 25188 */:
                case MatroskaExtractor.ID_DEFAULT_DURATION /* 2352003 */:
                case MatroskaExtractor.ID_TIMECODE_SCALE /* 2807729 */:
                    return 2;
                case 134:
                case MatroskaExtractor.ID_DOC_TYPE /* 17026 */:
                case MatroskaExtractor.ID_LANGUAGE /* 2274716 */:
                    return 3;
                case MatroskaExtractor.ID_BLOCK_GROUP /* 160 */:
                case MatroskaExtractor.ID_TRACK_ENTRY /* 174 */:
                case MatroskaExtractor.ID_CUE_TRACK_POSITIONS /* 183 */:
                case MatroskaExtractor.ID_CUE_POINT /* 187 */:
                case 224:
                case 225:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
                case MatroskaExtractor.ID_SEEK /* 19899 */:
                case MatroskaExtractor.ID_CONTENT_COMPRESSION /* 20532 */:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION /* 20533 */:
                case MatroskaExtractor.ID_COLOUR /* 21936 */:
                case MatroskaExtractor.ID_MASTERING_METADATA /* 21968 */:
                case MatroskaExtractor.ID_CONTENT_ENCODING /* 25152 */:
                case MatroskaExtractor.ID_CONTENT_ENCODINGS /* 28032 */:
                case MatroskaExtractor.ID_PROJECTION /* 30320 */:
                case MatroskaExtractor.ID_SEEK_HEAD /* 290298740 */:
                case 357149030:
                case MatroskaExtractor.ID_TRACKS /* 374648427 */:
                case MatroskaExtractor.ID_SEGMENT /* 408125543 */:
                case MatroskaExtractor.ID_EBML /* 440786851 */:
                case MatroskaExtractor.ID_CUES /* 475249515 */:
                case MatroskaExtractor.ID_CLUSTER /* 524531317 */:
                    return 1;
                case MatroskaExtractor.ID_BLOCK /* 161 */:
                case MatroskaExtractor.ID_SIMPLE_BLOCK /* 163 */:
                case MatroskaExtractor.ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
                case MatroskaExtractor.ID_SEEK_ID /* 21419 */:
                case MatroskaExtractor.ID_CODEC_PRIVATE /* 25506 */:
                case MatroskaExtractor.ID_PROJECTION_PRIVATE /* 30322 */:
                    return 4;
                case MatroskaExtractor.ID_SAMPLING_FREQUENCY /* 181 */:
                case MatroskaExtractor.ID_DURATION /* 17545 */:
                case MatroskaExtractor.ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                case MatroskaExtractor.ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                case MatroskaExtractor.ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                case MatroskaExtractor.ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                case MatroskaExtractor.ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                case MatroskaExtractor.ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                case MatroskaExtractor.ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                case MatroskaExtractor.ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                case MatroskaExtractor.ID_LUMNINANCE_MAX /* 21977 */:
                case MatroskaExtractor.ID_LUMNINANCE_MIN /* 21978 */:
                    return 5;
                default:
                    return 0;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public void integerElement(int i, long j) throws ParserException {
            MatroskaExtractor.this.integerElement(i, j);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public boolean isLevel1Element(int i) {
            return i == 357149030 || i == MatroskaExtractor.ID_CLUSTER || i == MatroskaExtractor.ID_CUES || i == MatroskaExtractor.ID_TRACKS;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public void startMasterElement(int i, long j, long j2) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.EbmlReaderOutput
        public void stringElement(int i, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i, str);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        public int audioBitDepth;
        public int channelCount;
        public long codecDelayNs;
        public String codecId;
        public byte[] codecPrivate;
        public int colorRange;
        public int colorSpace;
        public int colorTransfer;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public int displayHeight;
        public int displayUnit;
        public int displayWidth;
        public DrmInitData drmInitData;
        public boolean flagDefault;
        public boolean flagForced;
        public boolean hasColorInfo;
        public boolean hasContentEncryption;
        public int height;
        private String language;
        public int maxContentLuminance;
        public int maxFrameAverageLuminance;
        public float maxMasteringLuminance;
        public float minMasteringLuminance;
        public int nalUnitLengthFieldLength;
        public int number;
        public TrackOutput output;
        public float primaryBChromaticityX;
        public float primaryBChromaticityY;
        public float primaryGChromaticityX;
        public float primaryGChromaticityY;
        public float primaryRChromaticityX;
        public float primaryRChromaticityY;
        public byte[] projectionData;
        public int sampleRate;
        public byte[] sampleStrippedBytes;
        public long seekPreRollNs;
        public int stereoMode;

        @Nullable
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public float whitePointChromaticityX;
        public float whitePointChromaticityY;
        public int width;

        private Track() {
            this.width = -1;
            this.height = -1;
            this.displayWidth = -1;
            this.displayHeight = -1;
            this.displayUnit = 0;
            this.projectionData = null;
            this.stereoMode = -1;
            this.hasColorInfo = false;
            this.colorSpace = -1;
            this.colorTransfer = -1;
            this.colorRange = -1;
            this.maxContentLuminance = 1000;
            this.maxFrameAverageLuminance = 200;
            this.primaryRChromaticityX = -1.0f;
            this.primaryRChromaticityY = -1.0f;
            this.primaryGChromaticityX = -1.0f;
            this.primaryGChromaticityY = -1.0f;
            this.primaryBChromaticityX = -1.0f;
            this.primaryBChromaticityY = -1.0f;
            this.whitePointChromaticityX = -1.0f;
            this.whitePointChromaticityY = -1.0f;
            this.maxMasteringLuminance = -1.0f;
            this.minMasteringLuminance = -1.0f;
            this.channelCount = 1;
            this.audioBitDepth = -1;
            this.sampleRate = 8000;
            this.codecDelayNs = 0L;
            this.seekPreRollNs = 0L;
            this.flagDefault = true;
            this.language = "eng";
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put((byte) 0);
            wrap.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            wrap.putShort((short) (this.maxMasteringLuminance + 0.5f));
            wrap.putShort((short) (this.minMasteringLuminance + 0.5f));
            wrap.putShort((short) this.maxContentLuminance);
            wrap.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (readLittleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (readLittleEndianUnsignedInt != 826496599) {
                    return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] bArr = parsableByteArray.data;
                for (int position = parsableByteArray.getPosition() + 20; position < bArr.length - 4; position++) {
                    if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length)));
                    }
                }
                throw new ParserException("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                yhk.k("Error parsing FourCC private data");
                return null;
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort == 1) {
                    return true;
                }
                if (readLittleEndianUnsignedShort == MatroskaExtractor.WAVE_FORMAT_EXTENSIBLE) {
                    parsableByteArray.setPosition(24);
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                        if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                yhk.k("Error parsing MS/ACM codec private");
                return false;
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4];
                    if (i != -1) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if (i2 != -1) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] != 1) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                yhk.k("Error parsing vorbis codec private");
                return null;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x024f, code lost:
        
            if (r1 == 0) goto L139;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0345, code lost:
        
            if (r1 != 0) goto L162;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x036d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0379  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x039f  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x036f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void initializeOutput(ExtractorOutput extractorOutput, int i) throws ParserException {
            char c;
            int i2;
            int i3;
            List<byte[]> singletonList;
            String str;
            int pcmEncoding;
            String str2;
            int i4;
            String str3;
            String str4;
            int i5;
            int i6;
            List<byte[]> list;
            List<byte[]> singletonList2;
            String str5;
            Format createImageSampleFormat;
            int i7;
            int i8;
            List<byte[]> list2;
            String str6 = this.codecId;
            str6.getClass();
            switch (str6.hashCode()) {
                case -2095576542:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_MPEG4_AP)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -2095575984:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_MPEG4_SP)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1985379776:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_ACM)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784763192:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_TRUEHD)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1730367663:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_VORBIS)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641358:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_MP2)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641357:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_MP3)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1373388978:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_FOURCC)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -933872740:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_DVBSUB)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363189:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_MPEG4_ASP)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363109:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_H264)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -425012669:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_VOBSUB)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -356037306:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_DTS_LOSSLESS)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923557:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_AAC)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923603:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_AC3)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 62927045:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_DTS)) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338133:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_VP8)) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338134:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_VP9)) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 99146302:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_PGS)) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 444813526:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_THEORA)) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 542569478:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_DTS_EXPRESS)) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 725957860:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_PCM_INT_LIT)) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 738597099:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_ASS)) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_H265)) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422270023:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_SUBRIP)) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809237540:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_MPEG2)) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950749482:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_E_AC3)) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950789798:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_FLAC)) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951062397:
                    if (str6.equals(MatroskaExtractor.CODEC_ID_OPUS)) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str7 = MimeTypes.AUDIO_RAW;
            switch (c) {
                case 0:
                case 1:
                case '\t':
                    i2 = 1;
                    i3 = 0;
                    byte[] bArr = this.codecPrivate;
                    singletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str = MimeTypes.VIDEO_MP4V;
                    str7 = str;
                    singletonList2 = singletonList;
                    pcmEncoding = -1;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i9 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                        createImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str4, null, -1, i5, this.channelCount, this.sampleRate, i6, list, this.drmInitData, i9, this.language);
                        i7 = i2;
                    } else if (MimeTypes.isVideo(str4)) {
                        if (this.displayUnit == 0) {
                            int i10 = this.displayWidth;
                            if (i10 == -1) {
                                i10 = this.width;
                            }
                            this.displayWidth = i10;
                            int i11 = this.displayHeight;
                            if (i11 == -1) {
                                i11 = this.height;
                            }
                            this.displayHeight = i11;
                        }
                        createImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str4, null, -1, i5, this.width, this.height, -1.0f, list, -1, (this.displayWidth == -1 || (i8 = this.displayHeight) == -1) ? -1.0f : (this.height * r1) / (this.width * i8), this.projectionData, this.stereoMode, this.hasColorInfo ? new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo()) : null, this.drmInitData);
                        i7 = 2;
                    } else {
                        String str8 = str4;
                        if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                            if (!MimeTypes.TEXT_SSA.equals(str8)) {
                                if (!MimeTypes.APPLICATION_VOBSUB.equals(str8) && !MimeTypes.APPLICATION_PGS.equals(str8) && !MimeTypes.APPLICATION_DVBSUBS.equals(str8)) {
                                    yhk.k("Unexpected MIME type.");
                                    break;
                                } else {
                                    createImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str8, null, -1, i9, list, this.language, this.drmInitData);
                                }
                            } else {
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList.add(this.codecPrivate);
                                createImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str8, null, -1, i9, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList);
                            }
                        } else {
                            createImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str8, i9, this.language, this.drmInitData);
                        }
                        i7 = 3;
                    }
                    TrackOutput track = extractorOutput.track(this.number, i7);
                    this.output = track;
                    track.format(createImageSampleFormat);
                    break;
                case 2:
                    i2 = 1;
                    i3 = 0;
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(this.codecPrivate))) {
                        pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                        break;
                    }
                    pcmEncoding = -1;
                    str7 = MimeTypes.AUDIO_UNKNOWN;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i92 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track2 = extractorOutput.track(this.number, i7);
                    this.output = track2;
                    track2.format(createImageSampleFormat);
                    break;
                case 3:
                    i2 = 1;
                    i3 = 0;
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str7 = MimeTypes.AUDIO_TRUEHD;
                    pcmEncoding = -1;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i922 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track22 = extractorOutput.track(this.number, i7);
                    this.output = track22;
                    track22.format(createImageSampleFormat);
                    break;
                case 4:
                    i2 = 1;
                    i3 = 0;
                    List<byte[]> parseVorbisCodecPrivate = parseVorbisCodecPrivate(this.codecPrivate);
                    str2 = MimeTypes.AUDIO_VORBIS;
                    i4 = MatroskaExtractor.VORBIS_MAX_INPUT_SIZE;
                    list2 = parseVorbisCodecPrivate;
                    list = list2;
                    str4 = str2;
                    i5 = i4;
                    i6 = -1;
                    int i9222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track222 = extractorOutput.track(this.number, i7);
                    this.output = track222;
                    track222.format(createImageSampleFormat);
                    break;
                case 5:
                    i2 = 1;
                    i3 = 0;
                    str3 = MimeTypes.AUDIO_MPEG_L2;
                    str4 = str3;
                    i5 = 4096;
                    i6 = -1;
                    list = null;
                    int i92222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track2222 = extractorOutput.track(this.number, i7);
                    this.output = track2222;
                    track2222.format(createImageSampleFormat);
                    break;
                case 6:
                    i2 = 1;
                    i3 = 0;
                    str3 = MimeTypes.AUDIO_MPEG;
                    str4 = str3;
                    i5 = 4096;
                    i6 = -1;
                    list = null;
                    int i922222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track22222 = extractorOutput.track(this.number, i7);
                    this.output = track22222;
                    track22222.format(createImageSampleFormat);
                    break;
                case 7:
                    i2 = 1;
                    i3 = 0;
                    Pair<String, List<byte[]>> parseFourCcPrivate = parseFourCcPrivate(new ParsableByteArray(this.codecPrivate));
                    str = (String) parseFourCcPrivate.first;
                    singletonList = (List) parseFourCcPrivate.second;
                    str7 = str;
                    singletonList2 = singletonList;
                    pcmEncoding = -1;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i9222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track222222 = extractorOutput.track(this.number, i7);
                    this.output = track222222;
                    track222222.format(createImageSampleFormat);
                    break;
                case '\b':
                    i2 = 1;
                    i3 = 0;
                    byte[] bArr2 = this.codecPrivate;
                    singletonList2 = Collections.singletonList(new byte[]{bArr2[0], bArr2[1], bArr2[2], bArr2[3]});
                    pcmEncoding = -1;
                    str7 = MimeTypes.APPLICATION_DVBSUBS;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i92222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track2222222 = extractorOutput.track(this.number, i7);
                    this.output = track2222222;
                    track2222222.format(createImageSampleFormat);
                    break;
                case '\n':
                    i2 = 1;
                    i3 = 0;
                    AvcConfig parse = AvcConfig.parse(new ParsableByteArray(this.codecPrivate));
                    singletonList2 = parse.initializationData;
                    this.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                    str5 = "video/avc";
                    str7 = str5;
                    pcmEncoding = -1;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i922222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track22222222 = extractorOutput.track(this.number, i7);
                    this.output = track22222222;
                    track22222222.format(createImageSampleFormat);
                    break;
                case 11:
                    i2 = 1;
                    i3 = 0;
                    singletonList2 = Collections.singletonList(this.codecPrivate);
                    pcmEncoding = -1;
                    str7 = MimeTypes.APPLICATION_VOBSUB;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i9222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track222222222 = extractorOutput.track(this.number, i7);
                    this.output = track222222222;
                    track222222222.format(createImageSampleFormat);
                    break;
                case '\f':
                    i2 = 1;
                    i3 = 0;
                    str7 = MimeTypes.AUDIO_DTS_HD;
                    pcmEncoding = -1;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i92222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track2222222222 = extractorOutput.track(this.number, i7);
                    this.output = track2222222222;
                    track2222222222.format(createImageSampleFormat);
                    break;
                case '\r':
                    i2 = 1;
                    i3 = 0;
                    singletonList = Collections.singletonList(this.codecPrivate);
                    str = MimeTypes.AUDIO_AAC;
                    str7 = str;
                    singletonList2 = singletonList;
                    pcmEncoding = -1;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i922222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track22222222222 = extractorOutput.track(this.number, i7);
                    this.output = track22222222222;
                    track22222222222.format(createImageSampleFormat);
                    break;
                case 14:
                    i2 = 1;
                    i3 = 0;
                    str7 = MimeTypes.AUDIO_AC3;
                    pcmEncoding = -1;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i9222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track222222222222;
                    track222222222222.format(createImageSampleFormat);
                    break;
                case 15:
                case 20:
                    i2 = 1;
                    i3 = 0;
                    str7 = MimeTypes.AUDIO_DTS;
                    pcmEncoding = -1;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i92222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track2222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track2222222222222;
                    track2222222222222.format(createImageSampleFormat);
                    break;
                case 16:
                    i2 = 1;
                    i3 = 0;
                    str7 = MimeTypes.VIDEO_VP8;
                    pcmEncoding = -1;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i922222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track22222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track22222222222222;
                    track22222222222222.format(createImageSampleFormat);
                    break;
                case 17:
                    i2 = 1;
                    i3 = 0;
                    str7 = MimeTypes.VIDEO_VP9;
                    pcmEncoding = -1;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i9222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track222222222222222;
                    track222222222222222.format(createImageSampleFormat);
                    break;
                case 18:
                    i2 = 1;
                    i3 = 0;
                    pcmEncoding = -1;
                    str7 = MimeTypes.APPLICATION_PGS;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i92222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track2222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track2222222222222222;
                    track2222222222222222.format(createImageSampleFormat);
                    break;
                case 19:
                    i2 = 1;
                    i3 = 0;
                    str7 = MimeTypes.VIDEO_UNKNOWN;
                    pcmEncoding = -1;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i922222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track22222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track22222222222222222;
                    track22222222222222222.format(createImageSampleFormat);
                    break;
                case 21:
                    i2 = 1;
                    i3 = 0;
                    pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                    break;
                case 22:
                    i2 = 1;
                    i3 = 0;
                    pcmEncoding = -1;
                    str7 = MimeTypes.TEXT_SSA;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i9222222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track222222222222222222;
                    track222222222222222222.format(createImageSampleFormat);
                    break;
                case 23:
                    i2 = 1;
                    i3 = 0;
                    HevcConfig parse2 = HevcConfig.parse(new ParsableByteArray(this.codecPrivate));
                    singletonList2 = parse2.initializationData;
                    this.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                    str5 = "video/hevc";
                    str7 = str5;
                    pcmEncoding = -1;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i92222222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track2222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track2222222222222222222;
                    track2222222222222222222.format(createImageSampleFormat);
                    break;
                case 24:
                    i2 = 1;
                    i3 = 0;
                    pcmEncoding = -1;
                    str7 = MimeTypes.APPLICATION_SUBRIP;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i922222222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track22222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track22222222222222222222;
                    track22222222222222222222.format(createImageSampleFormat);
                    break;
                case 25:
                    i2 = 1;
                    i3 = 0;
                    str7 = MimeTypes.VIDEO_MPEG2;
                    pcmEncoding = -1;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i9222222222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track222222222222222222222;
                    track222222222222222222222.format(createImageSampleFormat);
                    break;
                case 26:
                    i2 = 1;
                    i3 = 0;
                    str7 = MimeTypes.AUDIO_E_AC3;
                    pcmEncoding = -1;
                    singletonList2 = null;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i92222222222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track2222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track2222222222222222222222;
                    track2222222222222222222222.format(createImageSampleFormat);
                    break;
                case 27:
                    i2 = 1;
                    i3 = 0;
                    singletonList = Collections.singletonList(this.codecPrivate);
                    str = MimeTypes.AUDIO_FLAC;
                    str7 = str;
                    singletonList2 = singletonList;
                    pcmEncoding = -1;
                    i6 = pcmEncoding;
                    list = singletonList2;
                    i5 = -1;
                    str4 = str7;
                    int i922222222222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track22222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track22222222222222222222222;
                    track22222222222222222222222.format(createImageSampleFormat);
                    break;
                case 28:
                    ArrayList arrayList2 = new ArrayList(3);
                    arrayList2.add(this.codecPrivate);
                    i2 = 1;
                    i3 = 0;
                    arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.codecDelayNs).array());
                    arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.seekPreRollNs).array());
                    str2 = MimeTypes.AUDIO_OPUS;
                    i4 = MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    list2 = arrayList2;
                    list = list2;
                    str4 = str2;
                    i5 = i4;
                    i6 = -1;
                    int i9222222222222222222222222 = (this.flagDefault ? 1 : 0) | (this.flagForced ? 2 : i3);
                    if (MimeTypes.isAudio(str4)) {
                    }
                    TrackOutput track222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = track222222222222222222222222;
                    track222222222222222222222222.format(createImageSampleFormat);
                    break;
                default:
                    yhk.k("Unrecognized codec identifier.");
                    break;
            }
        }

        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class TrueHdSampleRechunker {
        private int blockFlags;
        private int chunkSize;
        private boolean foundSyncframe;
        private int sampleCount;
        private final byte[] syncframePrefix = new byte[10];
        private long timeUs;

        public void outputPendingSampleMetadata(Track track) {
            if (!this.foundSyncframe || this.sampleCount <= 0) {
                return;
            }
            track.output.sampleMetadata(this.timeUs, this.blockFlags, this.chunkSize, 0, track.cryptoData);
            this.sampleCount = 0;
        }

        public void reset() {
            this.foundSyncframe = false;
        }

        public void sampleMetadata(Track track, long j) {
            if (this.foundSyncframe) {
                int i = this.sampleCount;
                int i2 = i + 1;
                this.sampleCount = i2;
                if (i == 0) {
                    this.timeUs = j;
                }
                if (i2 < 16) {
                    return;
                }
                track.output.sampleMetadata(this.timeUs, this.blockFlags, this.chunkSize, 0, track.cryptoData);
                this.sampleCount = 0;
            }
        }

        public void startSample(ExtractorInput extractorInput, int i, int i2) throws IOException, InterruptedException {
            if (!this.foundSyncframe) {
                extractorInput.peekFully(this.syncframePrefix, 0, 10);
                extractorInput.resetPeekPosition();
                if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.syncframePrefix) == -1) {
                    return;
                }
                this.foundSyncframe = true;
                this.sampleCount = 0;
            }
            if (this.sampleCount == 0) {
                this.blockFlags = i;
                this.chunkSize = 0;
            }
            this.chunkSize += i2;
        }
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlReaderOutput());
        this.seekForCuesEnabled = (i & 1) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
    }

    private SeekMap buildSeekMap() {
        LongArray longArray;
        LongArray longArray2;
        if (this.segmentContentPosition == -1 || this.durationUs == C.TIME_UNSET || (longArray = this.cueTimesUs) == null || longArray.size() == 0 || (longArray2 = this.cueClusterPositions) == null || longArray2.size() != this.cueTimesUs.size()) {
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = this.cueTimesUs.size();
        int[] iArr = new int[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jArr3[i2] = this.cueTimesUs.get(i2);
            jArr[i2] = this.cueClusterPositions.get(i2) + this.segmentContentPosition;
        }
        while (true) {
            int i3 = size - 1;
            if (i >= i3) {
                iArr[i3] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArr[i3]);
                jArr2[i3] = this.durationUs - jArr3[i3];
                this.cueTimesUs = null;
                this.cueClusterPositions = null;
                return new ChunkIndex(iArr, jArr, jArr2, jArr3);
            }
            int i4 = i + 1;
            iArr[i] = (int) (jArr[i4] - jArr[i]);
            jArr2[i] = jArr3[i4] - jArr3[i];
            i = i4;
        }
    }

    private void commitSampleToOutput(Track track, long j) {
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track, j);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId)) {
                commitSubtitleSample(track, SUBRIP_TIMECODE_FORMAT, 19, 1000L, SUBRIP_TIMECODE_EMPTY);
            } else if (CODEC_ID_ASS.equals(track.codecId)) {
                commitSubtitleSample(track, SSA_TIMECODE_FORMAT, 21, 10000L, SSA_TIMECODE_EMPTY);
            }
            track.output.sampleMetadata(j, this.blockFlags, this.sampleBytesWritten, 0, track.cryptoData);
        }
        this.sampleRead = true;
        resetSample();
    }

    private void commitSubtitleSample(Track track, String str, int i, long j, byte[] bArr) {
        setSampleDuration(this.subtitleSample.data, this.blockDurationUs, str, i, j, bArr);
        TrackOutput trackOutput = track.output;
        ParsableByteArray parsableByteArray = this.subtitleSample;
        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
        this.sampleBytesWritten = this.subtitleSample.limit() + this.sampleBytesWritten;
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    private static boolean isCodecSupported(String str) {
        return CODEC_ID_VP8.equals(str) || CODEC_ID_VP9.equals(str) || CODEC_ID_MPEG2.equals(str) || CODEC_ID_MPEG4_SP.equals(str) || CODEC_ID_MPEG4_ASP.equals(str) || CODEC_ID_MPEG4_AP.equals(str) || CODEC_ID_H264.equals(str) || CODEC_ID_H265.equals(str) || CODEC_ID_FOURCC.equals(str) || CODEC_ID_THEORA.equals(str) || CODEC_ID_OPUS.equals(str) || CODEC_ID_VORBIS.equals(str) || CODEC_ID_AAC.equals(str) || CODEC_ID_MP2.equals(str) || CODEC_ID_MP3.equals(str) || CODEC_ID_AC3.equals(str) || CODEC_ID_E_AC3.equals(str) || CODEC_ID_TRUEHD.equals(str) || CODEC_ID_DTS.equals(str) || CODEC_ID_DTS_EXPRESS.equals(str) || CODEC_ID_DTS_LOSSLESS.equals(str) || CODEC_ID_FLAC.equals(str) || CODEC_ID_ACM.equals(str) || CODEC_ID_PCM_INT_LIT.equals(str) || CODEC_ID_SUBRIP.equals(str) || CODEC_ID_ASS.equals(str) || CODEC_ID_VOBSUB.equals(str) || CODEC_ID_PGS.equals(str) || CODEC_ID_DVBSUB.equals(str);
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private void readScratch(ExtractorInput extractorInput, int i) throws IOException, InterruptedException {
        if (this.scratch.limit() >= i) {
            return;
        }
        if (this.scratch.capacity() < i) {
            ParsableByteArray parsableByteArray = this.scratch;
            byte[] bArr = parsableByteArray.data;
            parsableByteArray.reset(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.scratch.limit());
        }
        ParsableByteArray parsableByteArray2 = this.scratch;
        extractorInput.readFully(parsableByteArray2.data, parsableByteArray2.limit(), i - this.scratch.limit());
        this.scratch.setLimit(i);
    }

    private int readToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) throws IOException, InterruptedException {
        int sampleData;
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft > 0) {
            sampleData = Math.min(i, bytesLeft);
            trackOutput.sampleData(this.sampleStrippedBytes, sampleData);
        } else {
            sampleData = trackOutput.sampleData(extractorInput, i, false);
        }
        this.sampleBytesRead += sampleData;
        this.sampleBytesWritten += sampleData;
        return sampleData;
    }

    private void readToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int min = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, min);
        }
        this.sampleBytesRead += i2;
    }

    private void resetSample() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset();
    }

    private long scaleTimecodeToUs(long j) throws ParserException {
        long j2 = this.timecodeScale;
        if (j2 != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j, j2, 1000L);
        }
        yhk.k("Can't scale timecode prior to timecodeScale being set.");
        return 0L;
    }

    private static void setSampleDuration(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] utf8Bytes;
        if (j == C.TIME_UNSET) {
            utf8Bytes = bArr2;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - ((i2 * 3600) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - ((i3 * 60) * 1000000);
            int i4 = (int) (j4 / 1000000);
            utf8Bytes = Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j4 - (i4 * 1000000)) / j2))));
        }
        System.arraycopy(utf8Bytes, 0, bArr, i, bArr2.length);
    }

    private void writeSampleData(ExtractorInput extractorInput, Track track, int i) throws IOException, InterruptedException {
        int i2;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            return;
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            return;
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.data, 0, 1);
                    this.sampleBytesRead++;
                    byte b = this.scratch.data[0];
                    if ((b & 128) == 128) {
                        yhk.k("Extension bit is set in signal byte");
                        return;
                    } else {
                        this.sampleSignalByte = b;
                        this.sampleSignalByteRead = true;
                    }
                }
                byte b2 = this.sampleSignalByte;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.data, 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        ParsableByteArray parsableByteArray = this.scratch;
                        parsableByteArray.data[0] = (byte) ((z ? 128 : 0) | 8);
                        parsableByteArray.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8);
                        this.sampleBytesWritten += 8;
                    }
                    if (z) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.data, 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i3 = this.samplePartitionCount * 4;
                        this.scratch.reset(i3);
                        extractorInput.readFully(this.scratch.data, 0, i3);
                        this.sampleBytesRead += i3;
                        short s = (short) ((this.samplePartitionCount / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i4);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.samplePartitionCount;
                            if (i5 >= i2) {
                                break;
                            }
                            int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            int i7 = i5 % 2;
                            ByteBuffer byteBuffer2 = this.encryptionSubsampleDataBuffer;
                            if (i7 == 0) {
                                byteBuffer2.putShort((short) (readUnsignedIntToInt - i6));
                            } else {
                                byteBuffer2.putInt(readUnsignedIntToInt - i6);
                            }
                            i5++;
                            i6 = readUnsignedIntToInt;
                        }
                        int i8 = (i - this.sampleBytesRead) - i6;
                        int i9 = i2 % 2;
                        ByteBuffer byteBuffer3 = this.encryptionSubsampleDataBuffer;
                        if (i9 == 1) {
                            byteBuffer3.putInt(i8);
                        } else {
                            byteBuffer3.putShort((short) i8);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i4);
                        trackOutput.sampleData(this.encryptionSubsampleData, i4);
                        this.sampleBytesWritten += i4;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            this.sampleEncodingHandled = true;
        }
        int limit = this.sampleStrippedBytes.limit() + i;
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput, this.blockFlags, limit);
            }
            while (true) {
                int i10 = this.sampleBytesRead;
                if (i10 >= limit) {
                    break;
                } else {
                    readToOutput(extractorInput, trackOutput, limit - i10);
                }
            }
        } else {
            byte[] bArr2 = this.nalLength.data;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i11 = track.nalUnitLengthFieldLength;
            int i12 = 4 - i11;
            while (this.sampleBytesRead < limit) {
                int i13 = this.sampleCurrentNalBytesRemaining;
                if (i13 == 0) {
                    readToTarget(extractorInput, bArr2, i12, i11);
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    this.sampleCurrentNalBytesRemaining = i13 - readToOutput(extractorInput, trackOutput, i13);
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) throws IOException, InterruptedException {
        int length = bArr.length + i;
        int capacity = this.subtitleSample.capacity();
        ParsableByteArray parsableByteArray = this.subtitleSample;
        if (capacity < length) {
            parsableByteArray.data = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, parsableByteArray.data, 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.data, bArr.length, i);
        this.subtitleSample.reset(length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ec, code lost:
    
        defpackage.yhk.k("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14 = 1;
        int i15 = 0;
        if (i != ID_BLOCK && i != ID_SIMPLE_BLOCK) {
            if (i == ID_CONTENT_COMPRESSION_SETTINGS) {
                byte[] bArr = new byte[i2];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput.readFully(bArr, 0, i2);
                return;
            }
            if (i == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr2 = new byte[i2];
                extractorInput.readFully(bArr2, 0, i2);
                this.currentTrack.cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (i == ID_SEEK_ID) {
                Arrays.fill(this.seekEntryIdBytes.data, (byte) 0);
                extractorInput.readFully(this.seekEntryIdBytes.data, 4 - i2, i2);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i == ID_CODEC_PRIVATE) {
                byte[] bArr3 = new byte[i2];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput.readFully(bArr3, 0, i2);
                return;
            } else {
                if (i != ID_PROJECTION_PRIVATE) {
                    yhk.k(ljg.j(i, "Unexpected id: "));
                    return;
                }
                byte[] bArr4 = new byte[i2];
                this.currentTrack.projectionData = bArr4;
                extractorInput.readFully(bArr4, 0, i2);
                return;
            }
        }
        int i16 = 8;
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset();
        }
        Track track = this.tracks.get(this.blockTrackNumber);
        if (track == null) {
            extractorInput.skipFully(i2 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i17 = (this.scratch.data[2] & 6) >> 1;
            if (i17 == 0) {
                this.blockLacingSampleCount = 1;
                int[] ensureArrayCapacity = ensureArrayCapacity(this.blockLacingSampleSizes, 1);
                this.blockLacingSampleSizes = ensureArrayCapacity;
                ensureArrayCapacity[0] = (i2 - this.blockTrackNumberLength) - 3;
            } else {
                if (i != ID_SIMPLE_BLOCK) {
                    yhk.k("Lacing only supported in SimpleBlocks.");
                    return;
                }
                int i18 = 4;
                readScratch(extractorInput, 4);
                int i19 = (this.scratch.data[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1;
                this.blockLacingSampleCount = i19;
                int[] ensureArrayCapacity2 = ensureArrayCapacity(this.blockLacingSampleSizes, i19);
                this.blockLacingSampleSizes = ensureArrayCapacity2;
                if (i17 == 2) {
                    int i20 = (i2 - this.blockTrackNumberLength) - 4;
                    int i21 = this.blockLacingSampleCount;
                    Arrays.fill(ensureArrayCapacity2, 0, i21, i20 / i21);
                } else if (i17 == 1) {
                    int i22 = 0;
                    int i23 = 0;
                    while (true) {
                        i11 = this.blockLacingSampleCount - 1;
                        iArr = this.blockLacingSampleSizes;
                        if (i22 >= i11) {
                            break;
                        }
                        iArr[i22] = 0;
                        while (true) {
                            i12 = i18 + 1;
                            readScratch(extractorInput, i12);
                            int i24 = this.scratch.data[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            int[] iArr2 = this.blockLacingSampleSizes;
                            i13 = iArr2[i22] + i24;
                            iArr2[i22] = i13;
                            if (i24 != 255) {
                                break;
                            } else {
                                i18 = i12;
                            }
                        }
                        i23 += i13;
                        i22++;
                        i18 = i12;
                    }
                    iArr[i11] = ((i2 - this.blockTrackNumberLength) - i18) - i23;
                } else {
                    if (i17 != 3) {
                        yhk.k(ljg.j(i17, "Unexpected lacing value: "));
                        return;
                    }
                    int i25 = 0;
                    int i26 = 0;
                    while (true) {
                        int i27 = this.blockLacingSampleCount - i14;
                        int[] iArr3 = this.blockLacingSampleSizes;
                        if (i25 >= i27) {
                            i4 = i14;
                            i5 = i15;
                            i6 = i16;
                            iArr3[i27] = ((i2 - this.blockTrackNumberLength) - i18) - i26;
                            break;
                        }
                        iArr3[i25] = i15;
                        int i28 = i18 + 1;
                        readScratch(extractorInput, i28);
                        if (this.scratch.data[i18] == 0) {
                            yhk.k("No valid varint length mask found");
                            return;
                        }
                        int i29 = i15;
                        while (true) {
                            if (i29 >= i16) {
                                i7 = i14;
                                i8 = i15;
                                i9 = i16;
                                i10 = i25;
                                j = 0;
                                break;
                            }
                            i7 = i14;
                            int i30 = i7 << (7 - i29);
                            i8 = i15;
                            if ((this.scratch.data[i18] & i30) != 0) {
                                i28 += i29;
                                readScratch(extractorInput, i28);
                                j = (~i30) & this.scratch.data[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                int i31 = i18 + 1;
                                while (i31 < i28) {
                                    j = (j << i16) | (this.scratch.data[i31] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    i31++;
                                    i16 = i16;
                                    i25 = i25;
                                }
                                i9 = i16;
                                i10 = i25;
                                if (i10 > 0) {
                                    j -= (1 << ((i29 * 7) + 6)) - 1;
                                }
                            } else {
                                i29++;
                                i15 = i8;
                                i14 = i7;
                            }
                        }
                        i18 = i28;
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int i32 = (int) j;
                        int[] iArr4 = this.blockLacingSampleSizes;
                        if (i10 != 0) {
                            i32 += iArr4[i10 - 1];
                        }
                        iArr4[i10] = i32;
                        i26 += i32;
                        i25 = i10 + 1;
                        i15 = i8;
                        i14 = i7;
                        i16 = i9;
                    }
                }
            }
            i4 = 1;
            i5 = 0;
            i6 = 8;
            byte[] bArr5 = this.scratch.data;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((bArr5[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr5[i5] << 8));
            byte b = this.scratch.data[2];
            this.blockFlags = ((track.type == 2 || (i == ID_SIMPLE_BLOCK && (b & 128) == 128)) ? i4 : i5) | (((b & 8) == i6 ? i4 : i5) != 0 ? Integer.MIN_VALUE : i5);
            this.blockState = 2;
            this.blockLacingSampleIndex = i5;
            i3 = ID_SIMPLE_BLOCK;
        } else {
            i3 = ID_SIMPLE_BLOCK;
        }
        if (i != i3) {
            writeSampleData(extractorInput, track, this.blockLacingSampleSizes[0]);
            return;
        }
        while (true) {
            int i33 = this.blockLacingSampleIndex;
            if (i33 >= this.blockLacingSampleCount) {
                this.blockState = 0;
                return;
            } else {
                writeSampleData(extractorInput, track, this.blockLacingSampleSizes[i33]);
                commitSampleToOutput(track, this.blockTimeUs + ((this.blockLacingSampleIndex * track.defaultSampleDurationNs) / 1000));
                this.blockLacingSampleIndex++;
            }
        }
    }

    public void endMasterElement(int i) throws ParserException {
        if (i == ID_BLOCK_GROUP) {
            if (this.blockState != 2) {
                return;
            }
            if (!this.sampleSeenReferenceBlock) {
                this.blockFlags |= 1;
            }
            commitSampleToOutput(this.tracks.get(this.blockTrackNumber), this.blockTimeUs);
            this.blockState = 0;
            return;
        }
        if (i == ID_TRACK_ENTRY) {
            if (isCodecSupported(this.currentTrack.codecId)) {
                Track track = this.currentTrack;
                track.initializeOutput(this.extractorOutput, track.number);
                SparseArray<Track> sparseArray = this.tracks;
                Track track2 = this.currentTrack;
                sparseArray.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i == ID_SEEK) {
            int i2 = this.seekEntryId;
            if (i2 != -1) {
                long j = this.seekEntryPosition;
                if (j != -1) {
                    if (i2 == ID_CUES) {
                        this.cuesContentPosition = j;
                        return;
                    }
                    return;
                }
            }
            yhk.k("Mandatory element SeekID or SeekPosition not found");
            return;
        }
        if (i == ID_CONTENT_ENCODING) {
            Track track3 = this.currentTrack;
            if (track3.hasContentEncryption) {
                if (track3.cryptoData != null) {
                    track3.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, "video/webm", this.currentTrack.cryptoData.encryptionKey));
                    return;
                } else {
                    yhk.k("Encrypted Track found but ContentEncKeyID was not found");
                    return;
                }
            }
            return;
        }
        if (i == ID_CONTENT_ENCODINGS) {
            Track track4 = this.currentTrack;
            if (!track4.hasContentEncryption || track4.sampleStrippedBytes == null) {
                return;
            }
            yhk.k("Combining encryption and compression is not supported");
            return;
        }
        if (i == 357149030) {
            if (this.timecodeScale == C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j2 = this.durationTimecode;
            if (j2 != C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j2);
                return;
            }
            return;
        }
        if (i == ID_TRACKS) {
            if (this.tracks.size() != 0) {
                this.extractorOutput.endTracks();
                return;
            } else {
                yhk.k("No valid tracks were found");
                return;
            }
        }
        if (i == ID_CUES && !this.sentSeekMap) {
            this.extractorOutput.seekMap(buildSeekMap());
            this.sentSeekMap = true;
        }
    }

    public void floatElement(int i, double d) {
        if (i == ID_SAMPLING_FREQUENCY) {
            this.currentTrack.sampleRate = (int) d;
            return;
        }
        if (i == ID_DURATION) {
            this.durationTimecode = (long) d;
            return;
        }
        switch (i) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                this.currentTrack.primaryRChromaticityX = (float) d;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                this.currentTrack.primaryRChromaticityY = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                this.currentTrack.primaryGChromaticityX = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                this.currentTrack.primaryGChromaticityY = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                this.currentTrack.primaryBChromaticityX = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                this.currentTrack.primaryBChromaticityY = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                this.currentTrack.whitePointChromaticityX = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                this.currentTrack.whitePointChromaticityY = (float) d;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                this.currentTrack.maxMasteringLuminance = (float) d;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                this.currentTrack.minMasteringLuminance = (float) d;
                break;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public void integerElement(int i, long j) throws ParserException {
        if (i == ID_CONTENT_ENCODING_ORDER) {
            if (j == 0) {
                return;
            }
            yhk.k(vxd.m("ContentEncodingOrder ", j, " not supported"));
            return;
        }
        if (i == ID_CONTENT_ENCODING_SCOPE) {
            if (j == 1) {
                return;
            }
            yhk.k(vxd.m("ContentEncodingScope ", j, " not supported"));
            return;
        }
        switch (i) {
            case 131:
                this.currentTrack.type = (int) j;
                break;
            case 136:
                this.currentTrack.flagDefault = j == 1;
                break;
            case ID_BLOCK_DURATION /* 155 */:
                this.blockDurationUs = scaleTimecodeToUs(j);
                break;
            case ID_CHANNELS /* 159 */:
                this.currentTrack.channelCount = (int) j;
                break;
            case ID_PIXEL_WIDTH /* 176 */:
                this.currentTrack.width = (int) j;
                break;
            case ID_CUE_TIME /* 179 */:
                this.cueTimesUs.add(scaleTimecodeToUs(j));
                break;
            case ID_PIXEL_HEIGHT /* 186 */:
                this.currentTrack.height = (int) j;
                break;
            case 215:
                this.currentTrack.number = (int) j;
                break;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j);
                break;
            case ID_CUE_CLUSTER_POSITION /* 241 */:
                if (!this.seenClusterPositionForCurrentCuePoint) {
                    this.cueClusterPositions.add(j);
                    this.seenClusterPositionForCurrentCuePoint = true;
                    break;
                }
                break;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.sampleSeenReferenceBlock = true;
                break;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j != 3) {
                    yhk.k(vxd.m("ContentCompAlgo ", j, " not supported"));
                    break;
                }
                break;
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j < 1 || j > 2) {
                    yhk.k(vxd.m("DocTypeReadVersion ", j, " not supported"));
                    break;
                }
                break;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j != 1) {
                    yhk.k(vxd.m("EBMLReadVersion ", j, " not supported"));
                    break;
                }
                break;
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j != 5) {
                    yhk.k(vxd.m("ContentEncAlgo ", j, " not supported"));
                    break;
                }
                break;
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j != 1) {
                    yhk.k(vxd.m("AESSettingsCipherMode ", j, " not supported"));
                    break;
                }
                break;
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j + this.segmentContentPosition;
                break;
            case ID_STEREO_MODE /* 21432 */:
                int i2 = (int) j;
                if (i2 == 0) {
                    this.currentTrack.stereoMode = 0;
                    break;
                } else if (i2 == 1) {
                    this.currentTrack.stereoMode = 2;
                    break;
                } else if (i2 == 3) {
                    this.currentTrack.stereoMode = 1;
                    break;
                } else if (i2 == 15) {
                    this.currentTrack.stereoMode = 3;
                    break;
                }
                break;
            case ID_DISPLAY_WIDTH /* 21680 */:
                this.currentTrack.displayWidth = (int) j;
                break;
            case ID_DISPLAY_UNIT /* 21682 */:
                this.currentTrack.displayUnit = (int) j;
                break;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                this.currentTrack.displayHeight = (int) j;
                break;
            case ID_FLAG_FORCED /* 21930 */:
                this.currentTrack.flagForced = j == 1;
                break;
            case ID_CODEC_DELAY /* 22186 */:
                this.currentTrack.codecDelayNs = j;
                break;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                this.currentTrack.seekPreRollNs = j;
                break;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                this.currentTrack.audioBitDepth = (int) j;
                break;
            case ID_DEFAULT_DURATION /* 2352003 */:
                this.currentTrack.defaultSampleDurationNs = (int) j;
                break;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j;
                break;
            default:
                switch (i) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        int i3 = (int) j;
                        if (i3 == 1) {
                            this.currentTrack.colorRange = 2;
                            break;
                        } else if (i3 == 2) {
                            this.currentTrack.colorRange = 1;
                            break;
                        }
                        break;
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        int i4 = (int) j;
                        if (i4 != 1) {
                            if (i4 == 16) {
                                this.currentTrack.colorTransfer = 6;
                                break;
                            } else if (i4 == 18) {
                                this.currentTrack.colorTransfer = 7;
                                break;
                            } else if (i4 != 6 && i4 != 7) {
                            }
                        }
                        this.currentTrack.colorTransfer = 3;
                        break;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        Track track = this.currentTrack;
                        track.hasColorInfo = true;
                        int i5 = (int) j;
                        if (i5 == 1) {
                            track.colorSpace = 1;
                            break;
                        } else if (i5 == 9) {
                            track.colorSpace = 6;
                            break;
                        } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                            track.colorSpace = 2;
                            break;
                        }
                        break;
                    case ID_MAX_CLL /* 21948 */:
                        this.currentTrack.maxContentLuminance = (int) j;
                        break;
                    case ID_MAX_FALL /* 21949 */:
                        this.currentTrack.maxFrameAverageLuminance = (int) j;
                        break;
                }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        this.sampleRead = false;
        boolean z = true;
        while (z && !this.sampleRead) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetSample();
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return new Sniffer().sniff(extractorInput);
    }

    public void startMasterElement(int i, long j, long j2) throws ParserException {
        if (i == ID_BLOCK_GROUP) {
            this.sampleSeenReferenceBlock = false;
            return;
        }
        if (i == ID_TRACK_ENTRY) {
            this.currentTrack = new Track();
            return;
        }
        if (i == ID_CUE_POINT) {
            this.seenClusterPositionForCurrentCuePoint = false;
            return;
        }
        if (i == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i == ID_CONTENT_ENCRYPTION) {
            this.currentTrack.hasContentEncryption = true;
            return;
        }
        if (i == ID_MASTERING_METADATA) {
            this.currentTrack.hasColorInfo = true;
            return;
        }
        if (i == ID_SEGMENT) {
            long j3 = this.segmentContentPosition;
            if (j3 != -1 && j3 != j) {
                yhk.k("Multiple Segment elements not supported");
                return;
            } else {
                this.segmentContentPosition = j;
                this.segmentContentSize = j2;
                return;
            }
        }
        if (i == ID_CUES) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i == ID_CLUSTER && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
            } else {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
            }
        }
    }

    public void stringElement(int i, String str) throws ParserException {
        if (i == 134) {
            this.currentTrack.codecId = str;
            return;
        }
        if (i != ID_DOC_TYPE) {
            if (i != ID_LANGUAGE) {
                return;
            }
            this.currentTrack.language = str;
        } else {
            if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
                return;
            }
            yhk.k(lnb.o("DocType ", str, " not supported"));
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void release() {
    }

    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i);
    }

    public MatroskaExtractor() {
        this(0);
    }
}
