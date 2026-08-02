package javazoom.jl.decoder;

/* loaded from: classes9.dex */
public class OutputChannels {
    public static final int BOTH_CHANNELS = 0;
    public static final int DOWNMIX_CHANNELS = 3;
    public static final int LEFT_CHANNEL = 1;
    public static final int RIGHT_CHANNEL = 2;
    private int outputChannels;
    public static final OutputChannels LEFT = new OutputChannels(1);
    public static final OutputChannels RIGHT = new OutputChannels(2);
    public static final OutputChannels BOTH = new OutputChannels(0);
    public static final OutputChannels DOWNMIX = new OutputChannels(3);

    public static OutputChannels fromInt(int i) {
        if (i == 0) {
            return BOTH;
        }
        if (i == 1) {
            return LEFT;
        }
        if (i == 2) {
            return RIGHT;
        }
        if (i == 3) {
            return DOWNMIX;
        }
        throw new IllegalArgumentException("Invalid channel code: " + i);
    }

    private OutputChannels(int i) {
        this.outputChannels = i;
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("channels");
        }
    }

    public int getChannelsOutputCode() {
        return this.outputChannels;
    }

    public int getChannelCount() {
        return this.outputChannels == 0 ? 2 : 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof OutputChannels) && ((OutputChannels) obj).outputChannels == this.outputChannels;
    }

    public int hashCode() {
        return this.outputChannels;
    }
}
