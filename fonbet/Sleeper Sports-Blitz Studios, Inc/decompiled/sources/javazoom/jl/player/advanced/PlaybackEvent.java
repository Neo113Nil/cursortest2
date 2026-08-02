package javazoom.jl.player.advanced;

/* loaded from: classes9.dex */
public class PlaybackEvent {
    public static int STARTED = 2;
    public static int STOPPED = 1;
    private int frame;
    private int id;
    private AdvancedPlayer source;

    public PlaybackEvent(AdvancedPlayer advancedPlayer, int i, int i2) {
        this.id = i;
        this.source = advancedPlayer;
        this.frame = i2;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getFrame() {
        return this.frame;
    }

    public void setFrame(int i) {
        this.frame = i;
    }

    public AdvancedPlayer getSource() {
        return this.source;
    }

    public void setSource(AdvancedPlayer advancedPlayer) {
        this.source = advancedPlayer;
    }
}
