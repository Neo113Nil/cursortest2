package javazoom.jl.decoder;

/* loaded from: classes9.dex */
public class Decoder implements DecoderErrors {
    private static final Params DEFAULT_PARAMS = new Params();
    private Equalizer equalizer;
    private SynthesisFilter filter1;
    private SynthesisFilter filter2;
    private boolean initialized;
    private LayerIDecoder l1decoder;
    private LayerIIDecoder l2decoder;
    private LayerIIIDecoder l3decoder;
    private Obuffer output;
    private int outputChannels;
    private int outputFrequency;
    private Params params;

    public int getOutputBlockSize() {
        return Obuffer.OBUFFERSIZE;
    }

    public Decoder() {
        this(null);
    }

    public Decoder(Params params) {
        this.equalizer = new Equalizer();
        params = params == null ? DEFAULT_PARAMS : params;
        this.params = params;
        Equalizer initialEqualizerSettings = params.getInitialEqualizerSettings();
        if (initialEqualizerSettings != null) {
            this.equalizer.setFrom(initialEqualizerSettings);
        }
    }

    public static Params getDefaultParams() {
        return (Params) DEFAULT_PARAMS.clone();
    }

    public void setEqualizer(Equalizer equalizer) {
        if (equalizer == null) {
            equalizer = Equalizer.PASS_THRU_EQ;
        }
        this.equalizer.setFrom(equalizer);
        float[] bandFactors = this.equalizer.getBandFactors();
        SynthesisFilter synthesisFilter = this.filter1;
        if (synthesisFilter != null) {
            synthesisFilter.setEQ(bandFactors);
        }
        SynthesisFilter synthesisFilter2 = this.filter2;
        if (synthesisFilter2 != null) {
            synthesisFilter2.setEQ(bandFactors);
        }
    }

    public Obuffer decodeFrame(Header header, Bitstream bitstream) throws DecoderException {
        if (!this.initialized) {
            initialize(header);
        }
        int layer = header.layer();
        this.output.clear_buffer();
        retrieveDecoder(header, bitstream, layer).decodeFrame();
        this.output.write_buffer(1);
        return this.output;
    }

    public void setOutputBuffer(Obuffer obuffer) {
        this.output = obuffer;
    }

    public int getOutputFrequency() {
        return this.outputFrequency;
    }

    public int getOutputChannels() {
        return this.outputChannels;
    }

    protected DecoderException newDecoderException(int i) {
        return new DecoderException(i, (Throwable) null);
    }

    protected DecoderException newDecoderException(int i, Throwable th) {
        return new DecoderException(i, th);
    }

    protected FrameDecoder retrieveDecoder(Header header, Bitstream bitstream, int i) throws DecoderException {
        FrameDecoder frameDecoder;
        if (i == 1) {
            if (this.l1decoder == null) {
                LayerIDecoder layerIDecoder = new LayerIDecoder();
                this.l1decoder = layerIDecoder;
                layerIDecoder.create(bitstream, header, this.filter1, this.filter2, this.output, 0);
            }
            frameDecoder = this.l1decoder;
        } else if (i == 2) {
            if (this.l2decoder == null) {
                LayerIIDecoder layerIIDecoder = new LayerIIDecoder();
                this.l2decoder = layerIIDecoder;
                layerIIDecoder.create(bitstream, header, this.filter1, this.filter2, this.output, 0);
            }
            frameDecoder = this.l2decoder;
        } else if (i != 3) {
            frameDecoder = null;
        } else {
            if (this.l3decoder == null) {
                this.l3decoder = new LayerIIIDecoder(bitstream, header, this.filter1, this.filter2, this.output, 0);
            }
            frameDecoder = this.l3decoder;
        }
        if (frameDecoder != null) {
            return frameDecoder;
        }
        throw newDecoderException(513, null);
    }

    private void initialize(Header header) throws DecoderException {
        int mode = header.mode();
        header.layer();
        int i = mode == 3 ? 1 : 2;
        if (this.output == null) {
            this.output = new SampleBuffer(header.frequency(), i);
        }
        float[] bandFactors = this.equalizer.getBandFactors();
        this.filter1 = new SynthesisFilter(0, 32700.0f, bandFactors);
        if (i == 2) {
            this.filter2 = new SynthesisFilter(1, 32700.0f, bandFactors);
        }
        this.outputChannels = i;
        this.outputFrequency = header.frequency();
        this.initialized = true;
    }

    public static class Params implements Cloneable {
        private OutputChannels outputChannels = OutputChannels.BOTH;
        private Equalizer equalizer = new Equalizer();

        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                throw new InternalError(this + ": " + e);
            }
        }

        public void setOutputChannels(OutputChannels outputChannels) {
            if (outputChannels == null) {
                throw new NullPointerException("out");
            }
            this.outputChannels = outputChannels;
        }

        public OutputChannels getOutputChannels() {
            return this.outputChannels;
        }

        public Equalizer getInitialEqualizerSettings() {
            return this.equalizer;
        }
    }
}
