package javazoom.jl.decoder;

import androidx.media3.extractor.ts.PsExtractor;
import java.lang.reflect.Array;
import org.chromium.net.NetError;
import org.objectweb.asm.Opcodes;
import org.socure.imgcodecs.Imgcodecs;

/* loaded from: classes9.dex */
final class LayerIIIDecoder implements FrameDecoder {
    private static final int SBLIMIT = 32;
    private static final int SSLIMIT = 18;
    private static int[][] reorder_table;
    private temporaire2[] III_scalefac_t;
    private BitReserve br;
    private Obuffer buffer;
    private int channels;
    private SynthesisFilter filter1;
    private SynthesisFilter filter2;
    private int first_channel;
    private int frame_start;
    private Header header;
    private int[] is_1d;
    private float[][] k;
    private int last_channel;
    private float[][][] lr;
    private int max_gr;
    private int[] nonzero;
    private float[] out_1d;
    private int part2_start;
    private float[][] prevblck;
    private float[][][] ro;
    private temporaire2[] scalefac;
    public int[] scalefac_buffer;
    private SBI[] sfBandIndex;
    private int sfreq;
    public Sftable sftable;
    private III_side_info_t si;
    private Bitstream stream;
    private int which_channels;
    private static final int[][] slen = {new int[]{0, 0, 0, 0, 3, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4}, new int[]{0, 1, 2, 3, 0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3}};
    public static final int[] pretab = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 3, 2, 0};
    public static final float[] two_to_negative_half_pow = {1.0f, 0.70710677f, 0.5f, 0.35355338f, 0.25f, 0.17677669f, 0.125f, 0.088388346f, 0.0625f, 0.044194173f, 0.03125f, 0.022097087f, 0.015625f, 0.011048543f, 0.0078125f, 0.0055242716f, 0.00390625f, 0.0027621358f, 0.001953125f, 0.0013810679f, 9.765625E-4f, 6.9053395E-4f, 4.8828125E-4f, 3.4526698E-4f, 2.4414062E-4f, 1.7263349E-4f, 1.2207031E-4f, 8.6316744E-5f, 6.1035156E-5f, 4.3158372E-5f, 3.0517578E-5f, 2.1579186E-5f, 1.5258789E-5f, 1.0789593E-5f, 7.6293945E-6f, 5.3947965E-6f, 3.8146973E-6f, 2.6973983E-6f, 1.9073486E-6f, 1.3486991E-6f, 9.536743E-7f, 6.7434956E-7f, 4.7683716E-7f, 3.3717478E-7f, 2.3841858E-7f, 1.6858739E-7f, 1.1920929E-7f, 8.4293696E-8f, 5.9604645E-8f, 4.2146848E-8f, 2.9802322E-8f, 2.1073424E-8f, 1.4901161E-8f, 1.0536712E-8f, 7.450581E-9f, 5.268356E-9f, 3.7252903E-9f, 2.634178E-9f, 1.8626451E-9f, 1.317089E-9f, 9.313226E-10f, 6.585445E-10f, 4.656613E-10f, 3.2927225E-10f};
    public static final float[] t_43 = create_t_43();

    /* renamed from: io, reason: collision with root package name */
    public static final float[][] f905io = {new float[]{1.0f, 0.8408964f, 0.70710677f, 0.59460354f, 0.5f, 0.4204482f, 0.35355338f, 0.29730177f, 0.25f, 0.2102241f, 0.17677669f, 0.14865088f, 0.125f, 0.10511205f, 0.088388346f, 0.07432544f, 0.0625f, 0.052556027f, 0.044194173f, 0.03716272f, 0.03125f, 0.026278013f, 0.022097087f, 0.01858136f, 0.015625f, 0.013139007f, 0.011048543f, 0.00929068f, 0.0078125f, 0.0065695033f, 0.0055242716f, 0.00464534f}, new float[]{1.0f, 0.70710677f, 0.5f, 0.35355338f, 0.25f, 0.17677669f, 0.125f, 0.088388346f, 0.0625f, 0.044194173f, 0.03125f, 0.022097087f, 0.015625f, 0.011048543f, 0.0078125f, 0.0055242716f, 0.00390625f, 0.0027621358f, 0.001953125f, 0.0013810679f, 9.765625E-4f, 6.9053395E-4f, 4.8828125E-4f, 3.4526698E-4f, 2.4414062E-4f, 1.7263349E-4f, 1.2207031E-4f, 8.6316744E-5f, 6.1035156E-5f, 4.3158372E-5f, 3.0517578E-5f, 2.1579186E-5f}};
    public static final float[] TAN12 = {0.0f, 0.2679492f, 0.57735026f, 1.0f, 1.7320508f, 3.732051f, 1.0E11f, -3.732051f, -1.7320508f, -1.0f, -0.57735026f, -0.2679492f, 0.0f, 0.2679492f, 0.57735026f, 1.0f};
    private static final float[] cs = {0.8574929f, 0.881742f, 0.94962865f, 0.9833146f, 0.9955178f, 0.9991606f, 0.9998992f, 0.99999315f};
    private static final float[] ca = {-0.51449573f, -0.47173196f, -0.31337744f, -0.1819132f, -0.09457419f, -0.040965583f, -0.014198569f, -0.0036999746f};
    public static final float[][] win = {new float[]{-0.016141215f, -0.05360318f, -0.100707136f, -0.16280818f, -0.5f, -0.38388735f, -0.6206114f, -1.1659756f, -3.8720753f, -4.225629f, -1.519529f, -0.97416484f, -0.73744076f, -1.2071068f, -0.5163616f, -0.45426053f, -0.40715656f, -0.3696946f, -0.3387627f, -0.31242222f, -0.28939587f, -0.26880082f, -0.5f, -0.23251417f, -0.21596715f, -0.20004979f, -0.18449493f, -0.16905846f, -0.15350361f, -0.13758625f, -0.12103922f, -0.20710678f, -0.084752575f, -0.06415752f, -0.041131172f, -0.014790705f}, new float[]{-0.016141215f, -0.05360318f, -0.100707136f, -0.16280818f, -0.5f, -0.38388735f, -0.6206114f, -1.1659756f, -3.8720753f, -4.225629f, -1.519529f, -0.97416484f, -0.73744076f, -1.2071068f, -0.5163616f, -0.45426053f, -0.40715656f, -0.3696946f, -0.33908543f, -0.3151181f, -0.29642227f, -0.28184548f, -0.5411961f, -0.2621323f, -0.25387916f, -0.2329629f, -0.19852729f, -0.15233535f, -0.0964964f, -0.03342383f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{-0.0483008f, -0.15715657f, -0.28325045f, -0.42953748f, -1.2071068f, -0.8242648f, -1.1451749f, -1.769529f, -4.5470223f, -3.489053f, -0.7329629f, -0.15076515f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.15076514f, -0.7329629f, -3.489053f, -4.5470223f, -1.769529f, -1.1451749f, -0.8313774f, -1.306563f, -0.54142016f, -0.46528974f, -0.4106699f, -0.3700468f, -0.3387627f, -0.31242222f, -0.28939587f, -0.26880082f, -0.5f, -0.23251417f, -0.21596715f, -0.20004979f, -0.18449493f, -0.16905846f, -0.15350361f, -0.13758625f, -0.12103922f, -0.20710678f, -0.084752575f, -0.06415752f, -0.041131172f, -0.014790705f}};
    public static final int[][][] nr_of_sfb_block = {new int[][]{new int[]{6, 5, 5, 5}, new int[]{9, 9, 9, 9}, new int[]{6, 9, 9, 9}}, new int[][]{new int[]{6, 5, 7, 3}, new int[]{9, 9, 12, 6}, new int[]{6, 9, 12, 6}}, new int[][]{new int[]{11, 10, 0, 0}, new int[]{18, 18, 0, 0}, new int[]{15, 18, 0, 0}}, new int[][]{new int[]{7, 7, 7, 0}, new int[]{12, 12, 12, 0}, new int[]{6, 15, 12, 0}}, new int[][]{new int[]{6, 6, 6, 3}, new int[]{12, 9, 9, 6}, new int[]{6, 12, 9, 6}}, new int[][]{new int[]{8, 8, 5, 0}, new int[]{15, 12, 9, 0}, new int[]{6, 18, 9, 0}}};
    final double d43 = 1.3333333333333333d;
    private int CheckSumHuff = 0;
    private float[] samples1 = new float[32];
    private float[] samples2 = new float[32];
    private final int[] new_slen = new int[4];
    int[] x = {0};
    int[] y = {0};
    int[] v = {0};
    int[] w = {0};
    int[] is_pos = new int[576];
    float[] is_ratio = new float[576];
    float[] tsOutCopy = new float[18];
    float[] rawout = new float[36];
    private int counter = 0;

    static class gr_info_s {
        public int part2_3_length = 0;
        public int big_values = 0;
        public int global_gain = 0;
        public int scalefac_compress = 0;
        public int window_switching_flag = 0;
        public int block_type = 0;
        public int mixed_block_flag = 0;
        public int region0_count = 0;
        public int region1_count = 0;
        public int preflag = 0;
        public int scalefac_scale = 0;
        public int count1table_select = 0;
        public int[] table_select = new int[3];
        public int[] subblock_gain = new int[3];
    }

    static class temporaire2 {
        public int[] l = new int[23];
        public int[][] s = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 13);
    }

    public LayerIIIDecoder(Bitstream bitstream, Header header, SynthesisFilter synthesisFilter, SynthesisFilter synthesisFilter2, Obuffer obuffer, int i) {
        int i2;
        huffcodetab.inithuff();
        this.is_1d = new int[580];
        this.ro = (float[][][]) Array.newInstance((Class<?>) Float.TYPE, 2, 32, 18);
        this.lr = (float[][][]) Array.newInstance((Class<?>) Float.TYPE, 2, 32, 18);
        this.out_1d = new float[576];
        this.prevblck = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 576);
        this.k = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 576);
        this.nonzero = new int[2];
        temporaire2[] temporaire2VarArr = new temporaire2[2];
        this.III_scalefac_t = temporaire2VarArr;
        temporaire2VarArr[0] = new temporaire2();
        this.III_scalefac_t[1] = new temporaire2();
        this.scalefac = this.III_scalefac_t;
        SBI[] sbiArr = new SBI[9];
        this.sfBandIndex = sbiArr;
        int[] iArr = {0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, Opcodes.JSR, 200, 238, 284, 336, 396, 464, 522, 576};
        int[] iArr2 = {0, 4, 8, 12, 18, 24, 32, 42, 56, 74, 100, 132, Opcodes.FRETURN, 192};
        int[] iArr3 = {0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, Opcodes.JSR, 200, 238, 284, 336, 396, 464, 522, 576};
        int[] iArr4 = {0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, Opcodes.FRETURN, 192};
        int[] iArr5 = {0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, Opcodes.JSR, 200, 238, 284, 336, 396, 464, 522, 576};
        int[] iArr6 = {0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, Opcodes.FRETURN, 192};
        int[] iArr7 = {0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, Opcodes.JSR, 200, 238, 284, 336, 396, 464, 522, 576};
        int[] iArr8 = {0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, Opcodes.FRETURN, 192};
        int[] iArr9 = {0, 8, 16, 24, 36, 52, 72, 96, 124, 160, Opcodes.IF_ICMPGE, Opcodes.IF_ICMPLE, Opcodes.IF_ACMPNE, 192};
        sbiArr[0] = new SBI(iArr, iArr2);
        this.sfBandIndex[1] = new SBI(new int[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 114, 136, Opcodes.IF_ICMPGE, Opcodes.MONITORENTER, 232, Imgcodecs.IMWRITE_TIFF_ROWSPERSTRIP, 330, 394, 464, 540, 576}, new int[]{0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 136, 180, 192});
        this.sfBandIndex[2] = new SBI(iArr3, iArr4);
        this.sfBandIndex[3] = new SBI(new int[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 52, 62, 74, 90, 110, 134, Opcodes.IF_ICMPGE, 196, 238, 288, 342, 418, 576}, new int[]{0, 4, 8, 12, 16, 22, 30, 40, 52, 66, 84, 106, 136, 192});
        this.sfBandIndex[4] = new SBI(new int[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 42, 50, 60, 72, 88, 106, 128, 156, 190, 230, 276, 330, 384, 576}, new int[]{0, 4, 8, 12, 16, 22, 28, 38, 50, 64, 80, 100, 126, 192});
        this.sfBandIndex[5] = new SBI(new int[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 54, 66, 82, 102, 126, 156, Opcodes.MONITORENTER, PsExtractor.VIDEO_STREAM_MASK, 296, 364, 448, 550, 576}, new int[]{0, 4, 8, 12, 16, 22, 30, 42, 58, 78, 104, 138, 180, 192});
        int i3 = 6;
        this.sfBandIndex[6] = new SBI(iArr5, iArr6);
        this.sfBandIndex[7] = new SBI(iArr7, iArr8);
        this.sfBandIndex[8] = new SBI(new int[]{0, 12, 24, 36, 48, 60, 72, 88, 108, 132, 160, 192, 232, 280, 336, 400, 476, 566, 568, 570, 572, 574, 576}, iArr9);
        if (reorder_table == null) {
            reorder_table = new int[9][];
            for (int i4 = 0; i4 < 9; i4++) {
                reorder_table[i4] = reorder(this.sfBandIndex[i4].s);
            }
        }
        this.sftable = new Sftable(new int[]{0, 6, 11, 16, 21}, new int[]{0, 6, 12});
        this.scalefac_buffer = new int[54];
        this.stream = bitstream;
        this.header = header;
        this.filter1 = synthesisFilter;
        this.filter2 = synthesisFilter2;
        this.buffer = obuffer;
        this.which_channels = i;
        this.frame_start = 0;
        this.channels = header.mode() == 3 ? 1 : 2;
        this.max_gr = this.header.version() == 1 ? 2 : 1;
        int sample_frequency = this.header.sample_frequency();
        if (this.header.version() == 1) {
            i2 = 2;
            i3 = 3;
        } else {
            i2 = 2;
            if (this.header.version() != 2) {
                i3 = 0;
            }
        }
        this.sfreq = sample_frequency + i3;
        if (this.channels == i2) {
            int i5 = this.which_channels;
            if (i5 != 1) {
                if (i5 == i2) {
                    this.last_channel = 1;
                    this.first_channel = 1;
                } else if (i5 != 3) {
                    this.first_channel = 0;
                    this.last_channel = 1;
                }
            }
            this.last_channel = 0;
            this.first_channel = 0;
        } else {
            this.last_channel = 0;
            this.first_channel = 0;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            for (int i7 = 0; i7 < 576; i7++) {
                this.prevblck[i6][i7] = 0.0f;
            }
        }
        int[] iArr10 = this.nonzero;
        iArr10[1] = 576;
        iArr10[0] = 576;
        this.br = new BitReserve();
        this.si = new III_side_info_t();
    }

    public void seek_notify() {
        this.frame_start = 0;
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 576; i2++) {
                this.prevblck[i][i2] = 0.0f;
            }
        }
        this.br = new BitReserve();
    }

    @Override // javazoom.jl.decoder.FrameDecoder
    public void decodeFrame() {
        decode();
    }

    public void decode() {
        int slots = this.header.slots();
        get_side_info();
        for (int i = 0; i < slots; i++) {
            this.br.hputbuf(this.stream.get_bits(8));
        }
        int hsstell = this.br.hsstell() >>> 3;
        int hsstell2 = this.br.hsstell() & 7;
        if (hsstell2 != 0) {
            this.br.hgetbits(8 - hsstell2);
            hsstell++;
        }
        int i2 = (this.frame_start - hsstell) - this.si.main_data_begin;
        int i3 = this.frame_start + slots;
        this.frame_start = i3;
        if (i2 < 0) {
            return;
        }
        if (hsstell > 4096) {
            this.frame_start = i3 - 4096;
            this.br.rewindNbytes(4096);
        }
        while (i2 > 0) {
            this.br.hgetbits(8);
            i2--;
        }
        for (int i4 = 0; i4 < this.max_gr; i4++) {
            for (int i5 = 0; i5 < this.channels; i5++) {
                this.part2_start = this.br.hsstell();
                if (this.header.version() == 1) {
                    get_scale_factors(i5, i4);
                } else {
                    get_LSF_scale_factors(i5, i4);
                }
                huffman_decode(i5, i4);
                dequantize_sample(this.ro[i5], i5, i4);
            }
            stereo(i4);
            if (this.which_channels == 3 && this.channels > 1) {
                do_downmix();
            }
            for (int i6 = this.first_channel; i6 <= this.last_channel; i6++) {
                reorder(this.lr[i6], i6, i4);
                antialias(i6, i4);
                hybrid(i6, i4);
                for (int i7 = 18; i7 < 576; i7 += 36) {
                    for (int i8 = 1; i8 < 18; i8 += 2) {
                        float[] fArr = this.out_1d;
                        int i9 = i7 + i8;
                        fArr[i9] = -fArr[i9];
                    }
                }
                if (i6 == 0 || this.which_channels == 2) {
                    for (int i10 = 0; i10 < 18; i10++) {
                        int i11 = 0;
                        for (int i12 = 0; i12 < 576; i12 += 18) {
                            this.samples1[i11] = this.out_1d[i12 + i10];
                            i11++;
                        }
                        this.filter1.input_samples(this.samples1);
                        this.filter1.calculate_pcm_samples(this.buffer);
                    }
                } else {
                    for (int i13 = 0; i13 < 18; i13++) {
                        int i14 = 0;
                        for (int i15 = 0; i15 < 576; i15 += 18) {
                            this.samples2[i14] = this.out_1d[i15 + i13];
                            i14++;
                        }
                        this.filter2.input_samples(this.samples2);
                        this.filter2.calculate_pcm_samples(this.buffer);
                    }
                }
            }
        }
        this.counter++;
        this.buffer.write_buffer(1);
    }

    private boolean get_side_info() {
        if (this.header.version() == 1) {
            this.si.main_data_begin = this.stream.get_bits(9);
            if (this.channels == 1) {
                this.si.private_bits = this.stream.get_bits(5);
            } else {
                this.si.private_bits = this.stream.get_bits(3);
            }
            for (int i = 0; i < this.channels; i++) {
                this.si.ch[i].scfsi[0] = this.stream.get_bits(1);
                this.si.ch[i].scfsi[1] = this.stream.get_bits(1);
                this.si.ch[i].scfsi[2] = this.stream.get_bits(1);
                this.si.ch[i].scfsi[3] = this.stream.get_bits(1);
            }
            for (int i2 = 0; i2 < 2; i2++) {
                for (int i3 = 0; i3 < this.channels; i3++) {
                    this.si.ch[i3].gr[i2].part2_3_length = this.stream.get_bits(12);
                    this.si.ch[i3].gr[i2].big_values = this.stream.get_bits(9);
                    this.si.ch[i3].gr[i2].global_gain = this.stream.get_bits(8);
                    this.si.ch[i3].gr[i2].scalefac_compress = this.stream.get_bits(4);
                    this.si.ch[i3].gr[i2].window_switching_flag = this.stream.get_bits(1);
                    if (this.si.ch[i3].gr[i2].window_switching_flag != 0) {
                        this.si.ch[i3].gr[i2].block_type = this.stream.get_bits(2);
                        this.si.ch[i3].gr[i2].mixed_block_flag = this.stream.get_bits(1);
                        this.si.ch[i3].gr[i2].table_select[0] = this.stream.get_bits(5);
                        this.si.ch[i3].gr[i2].table_select[1] = this.stream.get_bits(5);
                        this.si.ch[i3].gr[i2].subblock_gain[0] = this.stream.get_bits(3);
                        this.si.ch[i3].gr[i2].subblock_gain[1] = this.stream.get_bits(3);
                        this.si.ch[i3].gr[i2].subblock_gain[2] = this.stream.get_bits(3);
                        if (this.si.ch[i3].gr[i2].block_type == 0) {
                            return false;
                        }
                        if (this.si.ch[i3].gr[i2].block_type == 2 && this.si.ch[i3].gr[i2].mixed_block_flag == 0) {
                            this.si.ch[i3].gr[i2].region0_count = 8;
                        } else {
                            this.si.ch[i3].gr[i2].region0_count = 7;
                        }
                        this.si.ch[i3].gr[i2].region1_count = 20 - this.si.ch[i3].gr[i2].region0_count;
                    } else {
                        this.si.ch[i3].gr[i2].table_select[0] = this.stream.get_bits(5);
                        this.si.ch[i3].gr[i2].table_select[1] = this.stream.get_bits(5);
                        this.si.ch[i3].gr[i2].table_select[2] = this.stream.get_bits(5);
                        this.si.ch[i3].gr[i2].region0_count = this.stream.get_bits(4);
                        this.si.ch[i3].gr[i2].region1_count = this.stream.get_bits(3);
                        this.si.ch[i3].gr[i2].block_type = 0;
                    }
                    this.si.ch[i3].gr[i2].preflag = this.stream.get_bits(1);
                    this.si.ch[i3].gr[i2].scalefac_scale = this.stream.get_bits(1);
                    this.si.ch[i3].gr[i2].count1table_select = this.stream.get_bits(1);
                }
            }
        } else {
            this.si.main_data_begin = this.stream.get_bits(8);
            if (this.channels == 1) {
                this.si.private_bits = this.stream.get_bits(1);
            } else {
                this.si.private_bits = this.stream.get_bits(2);
            }
            for (int i4 = 0; i4 < this.channels; i4++) {
                this.si.ch[i4].gr[0].part2_3_length = this.stream.get_bits(12);
                this.si.ch[i4].gr[0].big_values = this.stream.get_bits(9);
                this.si.ch[i4].gr[0].global_gain = this.stream.get_bits(8);
                this.si.ch[i4].gr[0].scalefac_compress = this.stream.get_bits(9);
                this.si.ch[i4].gr[0].window_switching_flag = this.stream.get_bits(1);
                if (this.si.ch[i4].gr[0].window_switching_flag != 0) {
                    this.si.ch[i4].gr[0].block_type = this.stream.get_bits(2);
                    this.si.ch[i4].gr[0].mixed_block_flag = this.stream.get_bits(1);
                    this.si.ch[i4].gr[0].table_select[0] = this.stream.get_bits(5);
                    this.si.ch[i4].gr[0].table_select[1] = this.stream.get_bits(5);
                    this.si.ch[i4].gr[0].subblock_gain[0] = this.stream.get_bits(3);
                    this.si.ch[i4].gr[0].subblock_gain[1] = this.stream.get_bits(3);
                    this.si.ch[i4].gr[0].subblock_gain[2] = this.stream.get_bits(3);
                    if (this.si.ch[i4].gr[0].block_type == 0) {
                        return false;
                    }
                    if (this.si.ch[i4].gr[0].block_type == 2 && this.si.ch[i4].gr[0].mixed_block_flag == 0) {
                        this.si.ch[i4].gr[0].region0_count = 8;
                    } else {
                        this.si.ch[i4].gr[0].region0_count = 7;
                        this.si.ch[i4].gr[0].region1_count = 20 - this.si.ch[i4].gr[0].region0_count;
                    }
                } else {
                    this.si.ch[i4].gr[0].table_select[0] = this.stream.get_bits(5);
                    this.si.ch[i4].gr[0].table_select[1] = this.stream.get_bits(5);
                    this.si.ch[i4].gr[0].table_select[2] = this.stream.get_bits(5);
                    this.si.ch[i4].gr[0].region0_count = this.stream.get_bits(4);
                    this.si.ch[i4].gr[0].region1_count = this.stream.get_bits(3);
                    this.si.ch[i4].gr[0].block_type = 0;
                }
                this.si.ch[i4].gr[0].scalefac_scale = this.stream.get_bits(1);
                this.si.ch[i4].gr[0].count1table_select = this.stream.get_bits(1);
            }
        }
        return true;
    }

    private void get_scale_factors(int i, int i2) {
        gr_info_s gr_info_sVar = this.si.ch[i].gr[i2];
        int i3 = gr_info_sVar.scalefac_compress;
        int[][] iArr = slen;
        int i4 = iArr[0][i3];
        int i5 = iArr[1][i3];
        if (gr_info_sVar.window_switching_flag != 0 && gr_info_sVar.block_type == 2) {
            if (gr_info_sVar.mixed_block_flag != 0) {
                for (int i6 = 0; i6 < 8; i6++) {
                    this.scalefac[i].l[i6] = this.br.hgetbits(slen[0][gr_info_sVar.scalefac_compress]);
                }
                for (int i7 = 3; i7 < 6; i7++) {
                    for (int i8 = 0; i8 < 3; i8++) {
                        this.scalefac[i].s[i8][i7] = this.br.hgetbits(slen[0][gr_info_sVar.scalefac_compress]);
                    }
                }
                for (int i9 = 6; i9 < 12; i9++) {
                    for (int i10 = 0; i10 < 3; i10++) {
                        this.scalefac[i].s[i10][i9] = this.br.hgetbits(slen[1][gr_info_sVar.scalefac_compress]);
                    }
                }
                for (int i11 = 0; i11 < 3; i11++) {
                    this.scalefac[i].s[i11][12] = 0;
                }
                return;
            }
            this.scalefac[i].s[0][0] = this.br.hgetbits(i4);
            this.scalefac[i].s[1][0] = this.br.hgetbits(i4);
            this.scalefac[i].s[2][0] = this.br.hgetbits(i4);
            this.scalefac[i].s[0][1] = this.br.hgetbits(i4);
            this.scalefac[i].s[1][1] = this.br.hgetbits(i4);
            this.scalefac[i].s[2][1] = this.br.hgetbits(i4);
            this.scalefac[i].s[0][2] = this.br.hgetbits(i4);
            this.scalefac[i].s[1][2] = this.br.hgetbits(i4);
            this.scalefac[i].s[2][2] = this.br.hgetbits(i4);
            this.scalefac[i].s[0][3] = this.br.hgetbits(i4);
            this.scalefac[i].s[1][3] = this.br.hgetbits(i4);
            this.scalefac[i].s[2][3] = this.br.hgetbits(i4);
            this.scalefac[i].s[0][4] = this.br.hgetbits(i4);
            this.scalefac[i].s[1][4] = this.br.hgetbits(i4);
            this.scalefac[i].s[2][4] = this.br.hgetbits(i4);
            this.scalefac[i].s[0][5] = this.br.hgetbits(i4);
            this.scalefac[i].s[1][5] = this.br.hgetbits(i4);
            this.scalefac[i].s[2][5] = this.br.hgetbits(i4);
            this.scalefac[i].s[0][6] = this.br.hgetbits(i5);
            this.scalefac[i].s[1][6] = this.br.hgetbits(i5);
            this.scalefac[i].s[2][6] = this.br.hgetbits(i5);
            this.scalefac[i].s[0][7] = this.br.hgetbits(i5);
            this.scalefac[i].s[1][7] = this.br.hgetbits(i5);
            this.scalefac[i].s[2][7] = this.br.hgetbits(i5);
            this.scalefac[i].s[0][8] = this.br.hgetbits(i5);
            this.scalefac[i].s[1][8] = this.br.hgetbits(i5);
            this.scalefac[i].s[2][8] = this.br.hgetbits(i5);
            this.scalefac[i].s[0][9] = this.br.hgetbits(i5);
            this.scalefac[i].s[1][9] = this.br.hgetbits(i5);
            this.scalefac[i].s[2][9] = this.br.hgetbits(i5);
            this.scalefac[i].s[0][10] = this.br.hgetbits(i5);
            this.scalefac[i].s[1][10] = this.br.hgetbits(i5);
            this.scalefac[i].s[2][10] = this.br.hgetbits(i5);
            this.scalefac[i].s[0][11] = this.br.hgetbits(i5);
            this.scalefac[i].s[1][11] = this.br.hgetbits(i5);
            this.scalefac[i].s[2][11] = this.br.hgetbits(i5);
            this.scalefac[i].s[0][12] = 0;
            this.scalefac[i].s[1][12] = 0;
            this.scalefac[i].s[2][12] = 0;
            return;
        }
        if (this.si.ch[i].scfsi[0] == 0 || i2 == 0) {
            this.scalefac[i].l[0] = this.br.hgetbits(i4);
            this.scalefac[i].l[1] = this.br.hgetbits(i4);
            this.scalefac[i].l[2] = this.br.hgetbits(i4);
            this.scalefac[i].l[3] = this.br.hgetbits(i4);
            this.scalefac[i].l[4] = this.br.hgetbits(i4);
            this.scalefac[i].l[5] = this.br.hgetbits(i4);
        }
        if (this.si.ch[i].scfsi[1] == 0 || i2 == 0) {
            this.scalefac[i].l[6] = this.br.hgetbits(i4);
            this.scalefac[i].l[7] = this.br.hgetbits(i4);
            this.scalefac[i].l[8] = this.br.hgetbits(i4);
            this.scalefac[i].l[9] = this.br.hgetbits(i4);
            this.scalefac[i].l[10] = this.br.hgetbits(i4);
        }
        if (this.si.ch[i].scfsi[2] == 0 || i2 == 0) {
            this.scalefac[i].l[11] = this.br.hgetbits(i5);
            this.scalefac[i].l[12] = this.br.hgetbits(i5);
            this.scalefac[i].l[13] = this.br.hgetbits(i5);
            this.scalefac[i].l[14] = this.br.hgetbits(i5);
            this.scalefac[i].l[15] = this.br.hgetbits(i5);
        }
        if (this.si.ch[i].scfsi[3] == 0 || i2 == 0) {
            this.scalefac[i].l[16] = this.br.hgetbits(i5);
            this.scalefac[i].l[17] = this.br.hgetbits(i5);
            this.scalefac[i].l[18] = this.br.hgetbits(i5);
            this.scalefac[i].l[19] = this.br.hgetbits(i5);
            this.scalefac[i].l[20] = this.br.hgetbits(i5);
        }
        this.scalefac[i].l[21] = 0;
        this.scalefac[i].l[22] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010f A[LOOP:0: B:18:0x010b->B:20:0x010f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void get_LSF_scale_data(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int mode_extension = this.header.mode_extension();
        gr_info_s gr_info_sVar = this.si.ch[i].gr[i2];
        int i6 = gr_info_sVar.scalefac_compress;
        if (gr_info_sVar.block_type == 2) {
            if (gr_info_sVar.mixed_block_flag == 0) {
                c = 1;
            } else if (gr_info_sVar.mixed_block_flag == 1) {
                c = 2;
            }
            char c3 = 5;
            if ((mode_extension != 1 && mode_extension != 3) || i != 1) {
                if (i6 >= 400) {
                    if (i6 < 500) {
                        int[] iArr = this.new_slen;
                        int i7 = i6 + NetError.ERR_CACHE_MISS;
                        int i8 = i7 >>> 2;
                        iArr[0] = i8 / 5;
                        iArr[1] = i8 % 5;
                        iArr[2] = i7 & 3;
                        iArr[3] = 0;
                        this.si.ch[i].gr[i2].preflag = 0;
                        c2 = 1;
                    } else if (i6 < 512) {
                        int[] iArr2 = this.new_slen;
                        int i9 = i6 - 500;
                        iArr2[0] = i9 / 3;
                        iArr2[1] = i9 % 3;
                        iArr2[2] = 0;
                        iArr2[3] = 0;
                        this.si.ch[i].gr[i2].preflag = 1;
                        c2 = 2;
                    }
                    if ((mode_extension != 1 || mode_extension == 3) && i == 1) {
                        i3 = i6 >>> 1;
                        if (i3 >= 180) {
                            int[] iArr3 = this.new_slen;
                            iArr3[0] = i3 / 36;
                            int i10 = i3 % 36;
                            iArr3[1] = i10 / 6;
                            iArr3[2] = i10 % 6;
                            iArr3[3] = 0;
                            this.si.ch[i].gr[i2].preflag = 0;
                            c3 = 3;
                        } else if (i3 < 244) {
                            int[] iArr4 = this.new_slen;
                            int i11 = i3 - 180;
                            iArr4[0] = (i11 & 63) >>> 4;
                            iArr4[1] = (i11 & 15) >>> 2;
                            iArr4[2] = i11 & 3;
                            iArr4[3] = 0;
                            this.si.ch[i].gr[i2].preflag = 0;
                            c3 = 4;
                        } else if (i3 < 255) {
                            int[] iArr5 = this.new_slen;
                            int i12 = i3 - 244;
                            iArr5[0] = i12 / 3;
                            iArr5[1] = i12 % 3;
                            iArr5[2] = 0;
                            iArr5[3] = 0;
                            this.si.ch[i].gr[i2].preflag = 0;
                        }
                        for (i4 = 0; i4 < 45; i4++) {
                            this.scalefac_buffer[i4] = 0;
                        }
                        int i13 = 0;
                        for (i5 = 0; i5 < 4; i5++) {
                            for (int i14 = 0; i14 < nr_of_sfb_block[c3][c][i5]; i14++) {
                                int[] iArr6 = this.scalefac_buffer;
                                int i15 = this.new_slen[i5];
                                iArr6[i13] = i15 == 0 ? 0 : this.br.hgetbits(i15);
                                i13++;
                            }
                        }
                    }
                    c3 = c2;
                    while (i4 < 45) {
                    }
                    int i132 = 0;
                    while (i5 < 4) {
                    }
                }
                int[] iArr7 = this.new_slen;
                int i16 = i6 >>> 4;
                iArr7[0] = i16 / 5;
                iArr7[1] = i16 % 5;
                iArr7[2] = (i6 & 15) >>> 2;
                iArr7[3] = i6 & 3;
                this.si.ch[i].gr[i2].preflag = 0;
            }
            c2 = 0;
            if (mode_extension != 1) {
            }
            i3 = i6 >>> 1;
            if (i3 >= 180) {
            }
            while (i4 < 45) {
            }
            int i1322 = 0;
            while (i5 < 4) {
            }
        }
        c = 0;
        char c32 = 5;
        if (mode_extension != 1) {
            if (i6 >= 400) {
            }
            c2 = 0;
            if (mode_extension != 1) {
            }
            i3 = i6 >>> 1;
            if (i3 >= 180) {
            }
            while (i4 < 45) {
            }
            int i13222 = 0;
            while (i5 < 4) {
            }
        }
        if (i6 >= 400) {
        }
        c2 = 0;
        if (mode_extension != 1) {
        }
        i3 = i6 >>> 1;
        if (i3 >= 180) {
        }
        while (i4 < 45) {
        }
        int i132222 = 0;
        while (i5 < 4) {
        }
    }

    private void get_LSF_scale_factors(int i, int i2) {
        gr_info_s gr_info_sVar = this.si.ch[i].gr[i2];
        get_LSF_scale_data(i, i2);
        if (gr_info_sVar.window_switching_flag != 0 && gr_info_sVar.block_type == 2) {
            if (gr_info_sVar.mixed_block_flag == 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < 12; i4++) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        this.scalefac[i].s[i5][i4] = this.scalefac_buffer[i3];
                        i3++;
                    }
                }
                for (int i6 = 0; i6 < 3; i6++) {
                    this.scalefac[i].s[i6][12] = 0;
                }
                return;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < 8; i8++) {
                this.scalefac[i].l[i8] = this.scalefac_buffer[i7];
                i7++;
            }
            for (int i9 = 3; i9 < 12; i9++) {
                for (int i10 = 0; i10 < 3; i10++) {
                    this.scalefac[i].s[i10][i9] = this.scalefac_buffer[i7];
                    i7++;
                }
            }
            for (int i11 = 0; i11 < 3; i11++) {
                this.scalefac[i].s[i11][12] = 0;
            }
            return;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 21; i13++) {
            this.scalefac[i].l[i13] = this.scalefac_buffer[i12];
            i12++;
        }
        this.scalefac[i].l[21] = 0;
        this.scalefac[i].l[22] = 0;
    }

    private void huffman_decode(int i, int i2) {
        int i3;
        int i4;
        huffcodetab huffcodetabVar;
        this.x[0] = 0;
        this.y[0] = 0;
        this.v[0] = 0;
        this.w[0] = 0;
        int i5 = this.part2_start + this.si.ch[i].gr[i2].part2_3_length;
        if (this.si.ch[i].gr[i2].window_switching_flag != 0 && this.si.ch[i].gr[i2].block_type == 2) {
            i3 = this.sfreq == 8 ? 72 : 36;
            i4 = 576;
        } else {
            int i6 = this.si.ch[i].gr[i2].region0_count + 1;
            int i7 = this.si.ch[i].gr[i2].region1_count + i6 + 1;
            if (i7 > this.sfBandIndex[this.sfreq].l.length - 1) {
                i7 = this.sfBandIndex[this.sfreq].l.length - 1;
            }
            i3 = this.sfBandIndex[this.sfreq].l[i6];
            i4 = this.sfBandIndex[this.sfreq].l[i7];
        }
        int i8 = 0;
        for (int i9 = 0; i9 < (this.si.ch[i].gr[i2].big_values << 1); i9 += 2) {
            if (i9 < i3) {
                huffcodetabVar = huffcodetab.ht[this.si.ch[i].gr[i2].table_select[0]];
            } else if (i9 < i4) {
                huffcodetabVar = huffcodetab.ht[this.si.ch[i].gr[i2].table_select[1]];
            } else {
                huffcodetabVar = huffcodetab.ht[this.si.ch[i].gr[i2].table_select[2]];
            }
            huffcodetab.huffman_decoder(huffcodetabVar, this.x, this.y, this.v, this.w, this.br);
            int[] iArr = this.is_1d;
            int i10 = i8 + 1;
            int[] iArr2 = this.x;
            iArr[i8] = iArr2[0];
            i8 += 2;
            int[] iArr3 = this.y;
            iArr[i10] = iArr3[0];
            this.CheckSumHuff = this.CheckSumHuff + iArr2[0] + iArr3[0];
        }
        huffcodetab huffcodetabVar2 = huffcodetab.ht[this.si.ch[i].gr[i2].count1table_select + 32];
        int hsstell = this.br.hsstell();
        while (hsstell < i5 && i8 < 576) {
            huffcodetab.huffman_decoder(huffcodetabVar2, this.x, this.y, this.v, this.w, this.br);
            int[] iArr4 = this.is_1d;
            int[] iArr5 = this.v;
            iArr4[i8] = iArr5[0];
            int[] iArr6 = this.w;
            iArr4[i8 + 1] = iArr6[0];
            int i11 = i8 + 3;
            int[] iArr7 = this.x;
            iArr4[i8 + 2] = iArr7[0];
            i8 += 4;
            int[] iArr8 = this.y;
            iArr4[i11] = iArr8[0];
            this.CheckSumHuff = this.CheckSumHuff + iArr5[0] + iArr6[0] + iArr7[0] + iArr8[0];
            hsstell = this.br.hsstell();
        }
        if (hsstell > i5) {
            this.br.rewindNbits(hsstell - i5);
            i8 -= 4;
        }
        int hsstell2 = this.br.hsstell();
        if (hsstell2 < i5) {
            this.br.hgetbits(i5 - hsstell2);
        }
        if (i8 < 576) {
            this.nonzero[i] = i8;
        } else {
            this.nonzero[i] = 576;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < 576) {
            this.is_1d[i8] = 0;
            i8++;
        }
    }

    private void i_stereo_k_values(int i, int i2, int i3) {
        if (i == 0) {
            float[][] fArr = this.k;
            fArr[0][i3] = 1.0f;
            fArr[1][i3] = 1.0f;
        } else if ((i & 1) != 0) {
            float[][] fArr2 = this.k;
            fArr2[0][i3] = f905io[i2][(i + 1) >>> 1];
            fArr2[1][i3] = 1.0f;
        } else {
            float[][] fArr3 = this.k;
            fArr3[0][i3] = 1.0f;
            fArr3[1][i3] = f905io[i2][i >>> 1];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0207 A[EDGE_INSN: B:76:0x0207->B:77:0x0207 BREAK  A[LOOP:1: B:35:0x00c0->B:64:0x0201], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void dequantize_sample(float[][] fArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        gr_info_s gr_info_sVar = this.si.ch[i].gr[i2];
        if (gr_info_sVar.window_switching_flag != 0 && gr_info_sVar.block_type == 2) {
            if (gr_info_sVar.mixed_block_flag != 0) {
                i3 = this.sfBandIndex[this.sfreq].l[1];
            } else {
                int i14 = this.sfBandIndex[this.sfreq].s[1];
                i4 = i14;
                i3 = (i14 << 2) - i14;
                float pow = (float) Math.pow(2.0d, (gr_info_sVar.global_gain - 210.0d) * 0.25d);
                for (i5 = 0; i5 < this.nonzero[i]; i5++) {
                    int i15 = i5 % 18;
                    int i16 = (i5 - i15) / 18;
                    int i17 = this.is_1d[i5];
                    if (i17 == 0) {
                        fArr[i16][i15] = 0.0f;
                    } else {
                        float[] fArr2 = t_43;
                        if (i17 < fArr2.length) {
                            if (i17 > 0) {
                                fArr[i16][i15] = fArr2[i17] * pow;
                            } else {
                                int i18 = -i17;
                                if (i18 < fArr2.length) {
                                    fArr[i16][i15] = (-pow) * fArr2[i18];
                                } else {
                                    fArr[i16][i15] = (-pow) * ((float) Math.pow(i18, 1.3333333333333333d));
                                }
                            }
                        } else if (i17 > 0) {
                            fArr[i16][i15] = ((float) Math.pow(i17, 1.3333333333333333d)) * pow;
                        } else {
                            fArr[i16][i15] = (-pow) * ((float) Math.pow(-i17, 1.3333333333333333d));
                        }
                    }
                }
                i6 = 0;
                i7 = 0;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    i8 = this.nonzero[i];
                    if (i6 < i8) {
                        break;
                    }
                    int i21 = i6 % 18;
                    int i22 = (i6 - i21) / 18;
                    if (i7 == i3) {
                        if (gr_info_sVar.window_switching_flag != 0 && gr_info_sVar.block_type == 2) {
                            if (gr_info_sVar.mixed_block_flag != 0) {
                                if (i7 == this.sfBandIndex[this.sfreq].l[8]) {
                                    int i23 = this.sfBandIndex[this.sfreq].s[4];
                                    int i24 = (i23 << 2) - i23;
                                    int i25 = this.sfBandIndex[this.sfreq].s[4] - this.sfBandIndex[this.sfreq].s[3];
                                    int i26 = this.sfBandIndex[this.sfreq].s[3];
                                    int i27 = (i26 << 2) - i26;
                                    i4 = i25;
                                    i3 = i24;
                                    i19 = 3;
                                    i20 = i27;
                                } else if (i7 < this.sfBandIndex[this.sfreq].l[8]) {
                                    i9 = i19 + 1;
                                    i3 = this.sfBandIndex[this.sfreq].l[i19 + 2];
                                } else {
                                    i10 = i19 + 1;
                                    int i28 = i19 + 2;
                                    int i29 = this.sfBandIndex[this.sfreq].s[i28];
                                    i11 = (i29 << 2) - i29;
                                    i12 = this.sfBandIndex[this.sfreq].s[i10];
                                    i13 = this.sfBandIndex[this.sfreq].s[i28];
                                }
                            } else {
                                i10 = i19 + 1;
                                int i30 = i19 + 2;
                                int i31 = this.sfBandIndex[this.sfreq].s[i30];
                                i11 = (i31 << 2) - i31;
                                i12 = this.sfBandIndex[this.sfreq].s[i10];
                                i13 = this.sfBandIndex[this.sfreq].s[i30];
                            }
                            int i32 = i13 - i12;
                            int i33 = i11;
                            i20 = (i12 << 2) - i12;
                            i3 = i33;
                            i19 = i10;
                            i4 = i32;
                        } else {
                            i9 = i19 + 1;
                            i3 = this.sfBandIndex[this.sfreq].l[i19 + 2];
                        }
                        i19 = i9;
                    }
                    if (gr_info_sVar.window_switching_flag != 0 && ((gr_info_sVar.block_type == 2 && gr_info_sVar.mixed_block_flag == 0) || (gr_info_sVar.block_type == 2 && gr_info_sVar.mixed_block_flag != 0 && i6 >= 36))) {
                        int i34 = (i7 - i20) / i4;
                        int i35 = (this.scalefac[i].s[i34][i19] << gr_info_sVar.scalefac_scale) + (gr_info_sVar.subblock_gain[i34] << 2);
                        float[] fArr3 = fArr[i22];
                        fArr3[i21] = fArr3[i21] * two_to_negative_half_pow[i35];
                    } else {
                        int i36 = this.scalefac[i].l[i19];
                        if (gr_info_sVar.preflag != 0) {
                            i36 += pretab[i19];
                        }
                        int i37 = i36 << gr_info_sVar.scalefac_scale;
                        float[] fArr4 = fArr[i22];
                        fArr4[i21] = fArr4[i21] * two_to_negative_half_pow[i37];
                    }
                    i7++;
                    i6++;
                }
                while (i8 < 576) {
                    int i38 = i8 % 18;
                    int i39 = (i8 - i38) / 18;
                    if (i38 < 0) {
                        i38 = 0;
                    }
                    if (i39 < 0) {
                        i39 = 0;
                    }
                    fArr[i39][i38] = 0.0f;
                    i8++;
                }
            }
        } else {
            i3 = this.sfBandIndex[this.sfreq].l[1];
        }
        i4 = 0;
        float pow2 = (float) Math.pow(2.0d, (gr_info_sVar.global_gain - 210.0d) * 0.25d);
        while (i5 < this.nonzero[i]) {
        }
        i6 = 0;
        i7 = 0;
        int i192 = 0;
        int i202 = 0;
        while (true) {
            i8 = this.nonzero[i];
            if (i6 < i8) {
            }
            i7++;
            i6++;
        }
        while (i8 < 576) {
        }
    }

    private void reorder(float[][] fArr, int i, int i2) {
        gr_info_s gr_info_sVar = this.si.ch[i].gr[i2];
        int i3 = 0;
        if (gr_info_sVar.window_switching_flag == 0 || gr_info_sVar.block_type != 2) {
            while (i3 < 576) {
                int i4 = i3 % 18;
                this.out_1d[i3] = fArr[(i3 - i4) / 18][i4];
                i3++;
            }
            return;
        }
        for (int i5 = 0; i5 < 576; i5++) {
            this.out_1d[i5] = 0.0f;
        }
        if (gr_info_sVar.mixed_block_flag == 0) {
            while (i3 < 576) {
                int i6 = reorder_table[this.sfreq][i3];
                int i7 = i6 % 18;
                this.out_1d[i3] = fArr[(i6 - i7) / 18][i7];
                i3++;
            }
            return;
        }
        for (int i8 = 0; i8 < 36; i8++) {
            int i9 = i8 % 18;
            this.out_1d[i8] = fArr[(i8 - i9) / 18][i9];
        }
        int i10 = 3;
        while (i10 < 13) {
            int i11 = this.sfBandIndex[this.sfreq].s[i10];
            i10++;
            int i12 = this.sfBandIndex[this.sfreq].s[i10] - i11;
            int i13 = (i11 << 2) - i11;
            int i14 = 0;
            int i15 = 0;
            while (i14 < i12) {
                int i16 = i13 + i14;
                int i17 = i13 + i15;
                int i18 = i16 % 18;
                float[] fArr2 = this.out_1d;
                fArr2[i17] = fArr[(i16 - i18) / 18][i18];
                int i19 = i16 + i12;
                int i20 = i19 % 18;
                fArr2[i17 + 1] = fArr[(i19 - i20) / 18][i20];
                int i21 = i19 + i12;
                int i22 = i21 % 18;
                fArr2[i17 + 2] = fArr[(i21 - i22) / 18][i22];
                i14++;
                i15 += 3;
            }
        }
    }

    private void stereo(int i) {
        float f;
        int i2;
        char c;
        if (this.channels == 1) {
            for (int i3 = 0; i3 < 32; i3++) {
                for (int i4 = 0; i4 < 18; i4 += 3) {
                    float[] fArr = this.lr[0][i3];
                    float[] fArr2 = this.ro[0][i3];
                    fArr[i4] = fArr2[i4];
                    int i5 = i4 + 1;
                    fArr[i5] = fArr2[i5];
                    int i6 = i4 + 2;
                    fArr[i6] = fArr2[i6];
                }
            }
            return;
        }
        gr_info_s gr_info_sVar = this.si.ch[0].gr[i];
        int mode_extension = this.header.mode_extension();
        boolean z = this.header.mode() == 1 && (mode_extension & 2) != 0;
        boolean z2 = this.header.mode() == 1 && (mode_extension & 1) != 0;
        boolean z3 = this.header.version() == 0 || this.header.version() == 2;
        int i7 = gr_info_sVar.scalefac_compress & 1;
        int i8 = 0;
        while (true) {
            f = 0.0f;
            if (i8 >= 576) {
                break;
            }
            this.is_pos[i8] = 7;
            this.is_ratio[i8] = 0.0f;
            i8++;
        }
        if (!z2) {
            i2 = 0;
            c = 1;
        } else if (gr_info_sVar.window_switching_flag != 0 && gr_info_sVar.block_type == 2) {
            i2 = 0;
            c = 1;
            if (gr_info_sVar.mixed_block_flag != 0) {
                int i9 = 0;
                int i10 = 0;
                while (i9 < 3) {
                    int i11 = 12;
                    int i12 = 2;
                    while (i11 >= 3) {
                        float f2 = f;
                        int i13 = this.sfBandIndex[this.sfreq].s[i11];
                        int i14 = this.sfBandIndex[this.sfreq].s[i11 + 1] - i13;
                        int i15 = (((i13 << 2) - i13) + ((i9 + 1) * i14)) - 1;
                        while (i14 > 0) {
                            if (this.ro[1][i15 / 18][i15 % 18] != f2) {
                                i12 = i11;
                                i11 = -10;
                                i14 = -10;
                            }
                            i14--;
                            i15--;
                        }
                        i11--;
                        f = f2;
                    }
                    float f3 = f;
                    int i16 = i12 + 1;
                    if (i16 > i10) {
                        i10 = i16;
                    }
                    while (i16 < 12) {
                        int i17 = this.sfBandIndex[this.sfreq].s[i16];
                        int i18 = i16 + 1;
                        int i19 = this.sfBandIndex[this.sfreq].s[i18] - i17;
                        int i20 = ((i17 << 2) - i17) + (i9 * i19);
                        while (i19 > 0) {
                            this.is_pos[i20] = this.scalefac[1].s[i9][i16];
                            int i21 = this.is_pos[i20];
                            if (i21 != 7) {
                                if (z3) {
                                    i_stereo_k_values(i21, i7, i20);
                                } else {
                                    this.is_ratio[i20] = TAN12[i21];
                                }
                            }
                            i20++;
                            i19--;
                        }
                        i16 = i18;
                    }
                    int i22 = this.sfBandIndex[this.sfreq].s[10];
                    int i23 = ((i22 << 2) - i22) + ((this.sfBandIndex[this.sfreq].s[11] - i22) * i9);
                    int i24 = this.sfBandIndex[this.sfreq].s[11];
                    int i25 = this.sfBandIndex[this.sfreq].s[12] - i24;
                    int i26 = ((i24 << 2) - i24) + (i9 * i25);
                    while (i25 > 0) {
                        int[] iArr = this.is_pos;
                        iArr[i26] = iArr[i23];
                        if (z3) {
                            float[][] fArr3 = this.k;
                            float[] fArr4 = fArr3[0];
                            fArr4[i26] = fArr4[i23];
                            float[] fArr5 = fArr3[1];
                            fArr5[i26] = fArr5[i23];
                        } else {
                            float[] fArr6 = this.is_ratio;
                            fArr6[i26] = fArr6[i23];
                        }
                        i26++;
                        i25--;
                    }
                    i9++;
                    f = f3;
                }
                float f4 = f;
                if (i10 <= 3) {
                    int i27 = -1;
                    int i28 = 17;
                    int i29 = 2;
                    while (i29 >= 0) {
                        if (this.ro[1][i29][i28] != f4) {
                            i27 = (i29 << 4) + (i29 << 1) + i28;
                            i29 = -1;
                        } else {
                            i28--;
                            if (i28 < 0) {
                                i29--;
                                i28 = 17;
                            }
                        }
                    }
                    int i30 = 0;
                    while (this.sfBandIndex[this.sfreq].l[i30] <= i27) {
                        i30++;
                    }
                    int i31 = this.sfBandIndex[this.sfreq].l[i30];
                    while (i30 < 8) {
                        int i32 = i30 + 1;
                        for (int i33 = this.sfBandIndex[this.sfreq].l[i32] - this.sfBandIndex[this.sfreq].l[i30]; i33 > 0; i33--) {
                            this.is_pos[i31] = this.scalefac[1].l[i30];
                            int i34 = this.is_pos[i31];
                            if (i34 != 7) {
                                if (z3) {
                                    i_stereo_k_values(i34, i7, i31);
                                } else {
                                    this.is_ratio[i31] = TAN12[i34];
                                }
                            }
                            i31++;
                        }
                        i30 = i32;
                    }
                }
            } else {
                for (int i35 = 0; i35 < 3; i35++) {
                    int i36 = 12;
                    int i37 = -1;
                    while (i36 >= 0) {
                        int i38 = this.sfBandIndex[this.sfreq].s[i36];
                        int i39 = this.sfBandIndex[this.sfreq].s[i36 + 1] - i38;
                        int i40 = (((i38 << 2) - i38) + ((i35 + 1) * i39)) - 1;
                        while (i39 > 0) {
                            if (this.ro[1][i40 / 18][i40 % 18] != 0.0f) {
                                i37 = i36;
                                i36 = -10;
                                i39 = -10;
                            }
                            i39--;
                            i40--;
                        }
                        i36--;
                    }
                    int i41 = i37 + 1;
                    while (i41 < 12) {
                        int i42 = this.sfBandIndex[this.sfreq].s[i41];
                        int i43 = i41 + 1;
                        int i44 = this.sfBandIndex[this.sfreq].s[i43] - i42;
                        int i45 = ((i42 << 2) - i42) + (i35 * i44);
                        while (i44 > 0) {
                            this.is_pos[i45] = this.scalefac[1].s[i35][i41];
                            int i46 = this.is_pos[i45];
                            if (i46 != 7) {
                                if (z3) {
                                    i_stereo_k_values(i46, i7, i45);
                                } else {
                                    this.is_ratio[i45] = TAN12[i46];
                                }
                            }
                            i45++;
                            i44--;
                        }
                        i41 = i43;
                    }
                    int i47 = this.sfBandIndex[this.sfreq].s[10];
                    int i48 = this.sfBandIndex[this.sfreq].s[11];
                    int i49 = ((i47 << 2) - i47) + ((i48 - i47) * i35);
                    int i50 = this.sfBandIndex[this.sfreq].s[12] - i48;
                    int i51 = ((i48 << 2) - i48) + (i35 * i50);
                    while (i50 > 0) {
                        int[] iArr2 = this.is_pos;
                        iArr2[i51] = iArr2[i49];
                        if (z3) {
                            float[][] fArr7 = this.k;
                            float[] fArr8 = fArr7[0];
                            fArr8[i51] = fArr8[i49];
                            float[] fArr9 = fArr7[1];
                            fArr9[i51] = fArr9[i49];
                        } else {
                            float[] fArr10 = this.is_ratio;
                            fArr10[i51] = fArr10[i49];
                        }
                        i51++;
                        i50--;
                    }
                }
            }
        } else {
            i2 = 0;
            c = 1;
            int i52 = 31;
            int i53 = 0;
            loop21: while (true) {
                int i54 = 17;
                while (i52 >= 0) {
                    if (this.ro[1][i52][i54] == 0.0f) {
                        i54--;
                        if (i54 < 0) {
                            break;
                        }
                    } else {
                        i53 = (i52 << 4) + (i52 << 1) + i54;
                        i52 = -1;
                    }
                }
                i52--;
            }
            int i55 = 0;
            while (this.sfBandIndex[this.sfreq].l[i55] <= i53) {
                i55++;
            }
            int i56 = this.sfBandIndex[this.sfreq].l[i55];
            while (i55 < 21) {
                int i57 = i55 + 1;
                for (int i58 = this.sfBandIndex[this.sfreq].l[i57] - this.sfBandIndex[this.sfreq].l[i55]; i58 > 0; i58--) {
                    this.is_pos[i56] = this.scalefac[1].l[i55];
                    int i59 = this.is_pos[i56];
                    if (i59 != 7) {
                        if (z3) {
                            i_stereo_k_values(i59, i7, i56);
                        } else {
                            this.is_ratio[i56] = TAN12[i59];
                        }
                    }
                    i56++;
                }
                i55 = i57;
            }
            int i60 = this.sfBandIndex[this.sfreq].l[20];
            for (int i61 = 576 - this.sfBandIndex[this.sfreq].l[21]; i61 > 0 && i56 < 576; i61--) {
                int[] iArr3 = this.is_pos;
                iArr3[i56] = iArr3[i60];
                if (z3) {
                    float[][] fArr11 = this.k;
                    float[] fArr12 = fArr11[0];
                    fArr12[i56] = fArr12[i60];
                    float[] fArr13 = fArr11[1];
                    fArr13[i56] = fArr13[i60];
                } else {
                    float[] fArr14 = this.is_ratio;
                    fArr14[i56] = fArr14[i60];
                }
                i56++;
            }
        }
        int i62 = i2;
        int i63 = i62;
        while (i62 < 32) {
            for (int i64 = i2; i64 < 18; i64++) {
                if (this.is_pos[i63] == 7) {
                    if (z) {
                        float[][][] fArr15 = this.lr;
                        float[] fArr16 = fArr15[i2][i62];
                        float[][][] fArr17 = this.ro;
                        float[] fArr18 = fArr17[i2][i62];
                        float f5 = fArr18[i64];
                        float[] fArr19 = fArr17[c][i62];
                        fArr16[i64] = (f5 + fArr19[i64]) * 0.70710677f;
                        fArr15[c][i62][i64] = (fArr18[i64] - fArr19[i64]) * 0.70710677f;
                    } else {
                        float[][][] fArr20 = this.lr;
                        float[] fArr21 = fArr20[i2][i62];
                        float[][][] fArr22 = this.ro;
                        fArr21[i64] = fArr22[i2][i62][i64];
                        fArr20[c][i62][i64] = fArr22[c][i62][i64];
                    }
                } else if (z2) {
                    if (z3) {
                        float[][][] fArr23 = this.lr;
                        float[] fArr24 = fArr23[i2][i62];
                        float[] fArr25 = this.ro[i2][i62];
                        float f6 = fArr25[i64];
                        float[][] fArr26 = this.k;
                        fArr24[i64] = f6 * fArr26[i2][i63];
                        fArr23[c][i62][i64] = fArr25[i64] * fArr26[c][i63];
                    } else {
                        float[][][] fArr27 = this.lr;
                        float[] fArr28 = fArr27[c][i62];
                        float f7 = this.ro[i2][i62][i64];
                        float[] fArr29 = this.is_ratio;
                        float f8 = f7 / (fArr29[i63] + 1.0f);
                        fArr28[i64] = f8;
                        fArr27[i2][i62][i64] = f8 * fArr29[i63];
                    }
                }
                i63++;
            }
            i62++;
        }
    }

    private void antialias(int i, int i2) {
        gr_info_s gr_info_sVar = this.si.ch[i].gr[i2];
        if (gr_info_sVar.window_switching_flag != 0 && gr_info_sVar.block_type == 2 && gr_info_sVar.mixed_block_flag == 0) {
            return;
        }
        int i3 = (gr_info_sVar.window_switching_flag == 0 || gr_info_sVar.mixed_block_flag == 0 || gr_info_sVar.block_type != 2) ? 558 : 18;
        for (int i4 = 0; i4 < i3; i4 += 18) {
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = (i4 + 17) - i5;
                int i7 = i4 + 18 + i5;
                float[] fArr = this.out_1d;
                float f = fArr[i6];
                float f2 = fArr[i7];
                float[] fArr2 = cs;
                float f3 = fArr2[i5] * f;
                float[] fArr3 = ca;
                fArr[i6] = f3 - (fArr3[i5] * f2);
                fArr[i7] = (f2 * fArr2[i5]) + (f * fArr3[i5]);
            }
        }
    }

    private void hybrid(int i, int i2) {
        gr_info_s gr_info_sVar = this.si.ch[i].gr[i2];
        int i3 = 0;
        while (i3 < 576) {
            int i4 = (gr_info_sVar.window_switching_flag == 0 || gr_info_sVar.mixed_block_flag == 0 || i3 >= 36) ? gr_info_sVar.block_type : 0;
            float[] fArr = this.out_1d;
            for (int i5 = 0; i5 < 18; i5++) {
                this.tsOutCopy[i5] = fArr[i5 + i3];
            }
            inv_mdct(this.tsOutCopy, this.rawout, i4);
            for (int i6 = 0; i6 < 18; i6++) {
                fArr[i6 + i3] = this.tsOutCopy[i6];
            }
            float[][] fArr2 = this.prevblck;
            float[] fArr3 = this.rawout;
            float f = fArr3[0];
            float[] fArr4 = fArr2[i];
            fArr[i3] = f + fArr4[i3];
            fArr4[i3] = fArr3[18];
            int i7 = i3 + 1;
            fArr[i7] = fArr3[1] + fArr4[i7];
            fArr4[i7] = fArr3[19];
            int i8 = i3 + 2;
            fArr[i8] = fArr3[2] + fArr4[i8];
            fArr4[i8] = fArr3[20];
            int i9 = i3 + 3;
            fArr[i9] = fArr3[3] + fArr4[i9];
            fArr4[i9] = fArr3[21];
            int i10 = i3 + 4;
            fArr[i10] = fArr3[4] + fArr4[i10];
            fArr4[i10] = fArr3[22];
            int i11 = i3 + 5;
            fArr[i11] = fArr3[5] + fArr4[i11];
            fArr4[i11] = fArr3[23];
            int i12 = i3 + 6;
            fArr[i12] = fArr3[6] + fArr4[i12];
            fArr4[i12] = fArr3[24];
            int i13 = i3 + 7;
            fArr[i13] = fArr3[7] + fArr4[i13];
            fArr4[i13] = fArr3[25];
            int i14 = i3 + 8;
            fArr[i14] = fArr3[8] + fArr4[i14];
            fArr4[i14] = fArr3[26];
            int i15 = i3 + 9;
            fArr[i15] = fArr3[9] + fArr4[i15];
            fArr4[i15] = fArr3[27];
            int i16 = i3 + 10;
            fArr[i16] = fArr3[10] + fArr4[i16];
            fArr4[i16] = fArr3[28];
            int i17 = i3 + 11;
            fArr[i17] = fArr3[11] + fArr4[i17];
            fArr4[i17] = fArr3[29];
            int i18 = i3 + 12;
            fArr[i18] = fArr3[12] + fArr4[i18];
            fArr4[i18] = fArr3[30];
            int i19 = i3 + 13;
            fArr[i19] = fArr3[13] + fArr4[i19];
            fArr4[i19] = fArr3[31];
            int i20 = i3 + 14;
            fArr[i20] = fArr3[14] + fArr4[i20];
            fArr4[i20] = fArr3[32];
            int i21 = i3 + 15;
            fArr[i21] = fArr3[15] + fArr4[i21];
            fArr4[i21] = fArr3[33];
            int i22 = i3 + 16;
            fArr[i22] = fArr3[16] + fArr4[i22];
            fArr4[i22] = fArr3[34];
            int i23 = i3 + 17;
            fArr[i23] = fArr3[17] + fArr4[i23];
            fArr4[i23] = fArr3[35];
            i3 += 18;
        }
    }

    private void do_downmix() {
        for (int i = 0; i < 18; i++) {
            for (int i2 = 0; i2 < 18; i2 += 3) {
                float[][][] fArr = this.lr;
                float[] fArr2 = fArr[0][i];
                float f = fArr2[i2];
                float[] fArr3 = fArr[1][i];
                fArr2[i2] = (f + fArr3[i2]) * 0.5f;
                int i3 = i2 + 1;
                fArr2[i3] = (fArr2[i3] + fArr3[i3]) * 0.5f;
                int i4 = i2 + 2;
                fArr2[i4] = (fArr2[i4] + fArr3[i4]) * 0.5f;
            }
        }
    }

    public void inv_mdct(float[] fArr, float[] fArr2, int i) {
        int i2 = 0;
        if (i == 2) {
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = 0.0f;
            fArr2[6] = 0.0f;
            fArr2[7] = 0.0f;
            fArr2[8] = 0.0f;
            fArr2[9] = 0.0f;
            fArr2[10] = 0.0f;
            fArr2[11] = 0.0f;
            fArr2[12] = 0.0f;
            fArr2[13] = 0.0f;
            fArr2[14] = 0.0f;
            fArr2[15] = 0.0f;
            fArr2[16] = 0.0f;
            fArr2[17] = 0.0f;
            fArr2[18] = 0.0f;
            fArr2[19] = 0.0f;
            fArr2[20] = 0.0f;
            fArr2[21] = 0.0f;
            fArr2[22] = 0.0f;
            fArr2[23] = 0.0f;
            fArr2[24] = 0.0f;
            fArr2[25] = 0.0f;
            fArr2[26] = 0.0f;
            fArr2[27] = 0.0f;
            fArr2[28] = 0.0f;
            fArr2[29] = 0.0f;
            fArr2[30] = 0.0f;
            fArr2[31] = 0.0f;
            fArr2[32] = 0.0f;
            fArr2[33] = 0.0f;
            fArr2[34] = 0.0f;
            fArr2[35] = 0.0f;
            int i3 = 0;
            while (i3 < 3) {
                int i4 = i3 + 15;
                int i5 = i3 + 12;
                fArr[i4] = fArr[i4] + fArr[i5];
                int i6 = i3 + 9;
                fArr[i5] = fArr[i5] + fArr[i6];
                int i7 = i3 + 6;
                fArr[i6] = fArr[i6] + fArr[i7];
                int i8 = i3 + 3;
                fArr[i7] = fArr[i7] + fArr[i8];
                fArr[i8] = fArr[i8] + fArr[i3];
                fArr[i4] = fArr[i4] + fArr[i6];
                float f = fArr[i6] + fArr[i8];
                fArr[i6] = f;
                float f2 = fArr[i5];
                float f3 = fArr[i7] * 0.8660254f;
                float f4 = fArr[i3];
                float f5 = (0.5f * f2) + f4;
                float f6 = f4 - f2;
                float f7 = f5 + f3;
                float f8 = f5 - f3;
                float f9 = fArr[i4];
                float f10 = f * 0.8660254f;
                float f11 = fArr[i8];
                float f12 = (0.5f * f9) + f11;
                float f13 = f11 - f9;
                float f14 = f12 + f10;
                float f15 = (f12 - f10) * 1.9318516f;
                float f16 = f13 * 0.70710677f;
                float f17 = f14 * 0.5176381f;
                float f18 = f7 + f17;
                float f19 = f7 - f17;
                float f20 = f6 + f16;
                float f21 = f6 - f16;
                float f22 = f8 + f15;
                float f23 = (f8 - f15) * 0.8213398f;
                float f24 = f21 * 1.306563f;
                float f25 = f19 * 3.830649f;
                float f26 = -(f18 * 0.5043145f);
                float f27 = -(f20 * 0.5411961f);
                float f28 = -(f22 * 0.6302362f);
                float f29 = (-f23) * 0.9914449f;
                int i9 = i2 + 6;
                fArr2[i9] = fArr2[i9] + (f23 * 0.13052619f);
                int i10 = i2 + 7;
                fArr2[i10] = fArr2[i10] + (0.38268343f * f24);
                int i11 = i2 + 8;
                fArr2[i11] = fArr2[i11] + (0.6087614f * f25);
                int i12 = i2 + 9;
                fArr2[i12] = fArr2[i12] + ((-f25) * 0.7933533f);
                int i13 = i2 + 10;
                fArr2[i13] = fArr2[i13] + ((-f24) * 0.9238795f);
                int i14 = i2 + 11;
                fArr2[i14] = fArr2[i14] + f29;
                int i15 = i2 + 12;
                fArr2[i15] = fArr2[i15] + (0.9914449f * f28);
                int i16 = i2 + 13;
                fArr2[i16] = fArr2[i16] + (0.9238795f * f27);
                int i17 = i2 + 14;
                fArr2[i17] = fArr2[i17] + (0.7933533f * f26);
                int i18 = i2 + 15;
                fArr2[i18] = fArr2[i18] + (f26 * 0.6087614f);
                int i19 = i2 + 16;
                fArr2[i19] = fArr2[i19] + (f27 * 0.38268343f);
                int i20 = i2 + 17;
                fArr2[i20] = fArr2[i20] + (f28 * 0.13052619f);
                i3++;
                i2 = i9;
            }
            return;
        }
        float f30 = fArr[17];
        float f31 = fArr[16];
        float f32 = f30 + f31;
        fArr[17] = f32;
        float f33 = fArr[15];
        float f34 = f31 + f33;
        fArr[16] = f34;
        float f35 = fArr[14];
        float f36 = f33 + f35;
        fArr[15] = f36;
        float f37 = fArr[13];
        float f38 = f35 + f37;
        fArr[14] = f38;
        float f39 = fArr[12];
        float f40 = f37 + f39;
        fArr[13] = f40;
        float f41 = fArr[11];
        float f42 = f39 + f41;
        fArr[12] = f42;
        float f43 = fArr[10];
        float f44 = f41 + f43;
        fArr[11] = f44;
        float f45 = fArr[9];
        float f46 = f43 + f45;
        fArr[10] = f46;
        float f47 = fArr[8];
        float f48 = f45 + f47;
        fArr[9] = f48;
        float f49 = fArr[7];
        float f50 = f47 + f49;
        fArr[8] = f50;
        float f51 = fArr[6];
        float f52 = f49 + f51;
        fArr[7] = f52;
        float f53 = fArr[5];
        float f54 = f51 + f53;
        fArr[6] = f54;
        float f55 = fArr[4];
        float f56 = f53 + f55;
        fArr[5] = f56;
        float f57 = fArr[3];
        float f58 = f55 + f57;
        fArr[4] = f58;
        float f59 = fArr[2];
        float f60 = f57 + f59;
        fArr[3] = f60;
        float f61 = fArr[1];
        float f62 = f59 + f61;
        fArr[2] = f62;
        float f63 = fArr[0];
        float f64 = f61 + f63;
        fArr[1] = f64;
        float f65 = f32 + f36;
        fArr[17] = f65;
        float f66 = f36 + f40;
        fArr[15] = f66;
        float f67 = f40 + f44;
        fArr[13] = f67;
        float f68 = f44 + f48;
        fArr[11] = f68;
        float f69 = f48 + f52;
        fArr[9] = f69;
        float f70 = f52 + f56;
        fArr[7] = f70;
        float f71 = f56 + f60;
        fArr[5] = f71;
        float f72 = f60 + f64;
        fArr[3] = f72;
        float f73 = f63 + f63;
        float f74 = f73 + f42;
        float f75 = f74 + (f58 * 1.8793852f) + (f50 * 1.5320889f) + (f34 * 0.34729636f);
        float f76 = ((((f73 + f58) - f50) - f42) - f42) - f34;
        float f77 = ((f74 - (f58 * 0.34729636f)) - (f50 * 1.8793852f)) + (f34 * 1.5320889f);
        float f78 = ((f74 - (f58 * 1.5320889f)) + (f50 * 0.34729636f)) - (f34 * 1.8793852f);
        float f79 = (((f63 - f58) + f50) - f42) + f34;
        float f80 = f54 * 1.7320508f;
        float f81 = (f62 * 1.9696155f) + f80 + (1.2855753f * f46) + (0.6840403f * f38);
        float f82 = ((f62 - f46) - f38) * 1.7320508f;
        float f83 = (((1.2855753f * f62) - f80) - (0.6840403f * f46)) + (f38 * 1.9696155f);
        float f84 = (((f62 * 0.6840403f) - f80) + (f46 * 1.9696155f)) - (f38 * 1.2855753f);
        float f85 = f64 + f64;
        float f86 = f85 + f67;
        float f87 = f86 + (f71 * 1.8793852f) + (f69 * 1.5320889f) + (f65 * 0.34729636f);
        float f88 = ((((f85 + f71) - f69) - f67) - f67) - f65;
        float f89 = ((f86 - (f71 * 0.34729636f)) - (f69 * 1.8793852f)) + (f65 * 1.5320889f);
        float f90 = ((f86 - (1.5320889f * f71)) + (0.34729636f * f69)) - (1.8793852f * f65);
        float f91 = ((((f64 - f71) + f69) - f67) + f65) * 0.70710677f;
        float f92 = f70 * 1.7320508f;
        float f93 = (f72 * 1.9696155f) + f92 + (1.2855753f * f68) + (0.6840403f * f66);
        float f94 = ((f72 - f68) - f66) * 1.7320508f;
        float f95 = (((1.2855753f * f72) - f92) - (0.6840403f * f68)) + (f66 * 1.9696155f);
        float f96 = (((f72 * 0.6840403f) - f92) + (f68 * 1.9696155f)) - (f66 * 1.2855753f);
        float f97 = f75 + f81;
        float f98 = (f87 + f93) * 0.5019099f;
        float f99 = f97 + f98;
        float f100 = f97 - f98;
        float f101 = f76 + f82;
        float f102 = (f88 + f94) * 0.5176381f;
        float f103 = f101 + f102;
        float f104 = f101 - f102;
        float f105 = f77 + f83;
        float f106 = (f89 + f95) * 0.55168897f;
        float f107 = f105 + f106;
        float f108 = f105 - f106;
        float f109 = f78 + f84;
        float f110 = (f90 + f96) * 0.61038727f;
        float f111 = f109 + f110;
        float f112 = f109 - f110;
        float f113 = f79 + f91;
        float f114 = f79 - f91;
        float f115 = f78 - f84;
        float f116 = (f90 - f96) * 0.8717234f;
        float f117 = f115 + f116;
        float f118 = f115 - f116;
        float f119 = f77 - f83;
        float f120 = (f89 - f95) * 1.1831008f;
        float f121 = f119 + f120;
        float f122 = f119 - f120;
        float f123 = f76 - f82;
        float f124 = (f88 - f94) * 1.9318516f;
        float f125 = f123 + f124;
        float f126 = f123 - f124;
        float f127 = f75 - f81;
        float f128 = (f87 - f93) * 5.7368565f;
        float f129 = f127 + f128;
        float f130 = f127 - f128;
        float[] fArr3 = win[i];
        fArr2[0] = (-f130) * fArr3[0];
        fArr2[1] = (-f126) * fArr3[1];
        fArr2[2] = (-f122) * fArr3[2];
        fArr2[3] = (-f118) * fArr3[3];
        fArr2[4] = (-f114) * fArr3[4];
        fArr2[5] = (-f112) * fArr3[5];
        fArr2[6] = (-f108) * fArr3[6];
        fArr2[7] = (-f104) * fArr3[7];
        fArr2[8] = (-f100) * fArr3[8];
        fArr2[9] = f100 * fArr3[9];
        fArr2[10] = f104 * fArr3[10];
        fArr2[11] = f108 * fArr3[11];
        fArr2[12] = f112 * fArr3[12];
        fArr2[13] = f114 * fArr3[13];
        fArr2[14] = f118 * fArr3[14];
        fArr2[15] = f122 * fArr3[15];
        fArr2[16] = f126 * fArr3[16];
        fArr2[17] = f130 * fArr3[17];
        fArr2[18] = fArr3[18] * f129;
        fArr2[19] = fArr3[19] * f125;
        fArr2[20] = fArr3[20] * f121;
        fArr2[21] = fArr3[21] * f117;
        fArr2[22] = fArr3[22] * f113;
        fArr2[23] = fArr3[23] * f111;
        fArr2[24] = fArr3[24] * f107;
        fArr2[25] = fArr3[25] * f103;
        fArr2[26] = fArr3[26] * f99;
        fArr2[27] = f99 * fArr3[27];
        fArr2[28] = f103 * fArr3[28];
        fArr2[29] = f107 * fArr3[29];
        fArr2[30] = f111 * fArr3[30];
        fArr2[31] = f113 * fArr3[31];
        fArr2[32] = f117 * fArr3[32];
        fArr2[33] = f121 * fArr3[33];
        fArr2[34] = f125 * fArr3[34];
        fArr2[35] = f129 * fArr3[35];
    }

    static class SBI {
        public int[] l;
        public int[] s;

        public SBI() {
            this.l = new int[23];
            this.s = new int[14];
        }

        public SBI(int[] iArr, int[] iArr2) {
            this.l = iArr;
            this.s = iArr2;
        }
    }

    static class temporaire {
        public gr_info_s[] gr;
        public int[] scfsi = new int[4];

        public temporaire() {
            gr_info_s[] gr_info_sVarArr = new gr_info_s[2];
            this.gr = gr_info_sVarArr;
            gr_info_sVarArr[0] = new gr_info_s();
            this.gr[1] = new gr_info_s();
        }
    }

    static class III_side_info_t {
        public temporaire[] ch;
        public int main_data_begin = 0;
        public int private_bits = 0;

        public III_side_info_t() {
            temporaire[] temporaireVarArr = new temporaire[2];
            this.ch = temporaireVarArr;
            temporaireVarArr[0] = new temporaire();
            this.ch[1] = new temporaire();
        }
    }

    private static float[] create_t_43() {
        float[] fArr = new float[8192];
        for (int i = 0; i < 8192; i++) {
            fArr[i] = (float) Math.pow(i, 1.3333333333333333d);
        }
        return fArr;
    }

    static int[] reorder(int[] iArr) {
        int[] iArr2 = new int[576];
        int i = 0;
        int i2 = 0;
        while (i < 13) {
            int i3 = iArr[i];
            i++;
            int i4 = iArr[i];
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = i3;
                while (i6 < i4) {
                    iArr2[(i6 * 3) + i5] = i2;
                    i6++;
                    i2++;
                }
            }
        }
        return iArr2;
    }

    class Sftable {
        public int[] l;
        public int[] s;

        public Sftable() {
            this.l = new int[5];
            this.s = new int[3];
        }

        public Sftable(int[] iArr, int[] iArr2) {
            this.l = iArr;
            this.s = iArr2;
        }
    }
}
