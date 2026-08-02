package javazoom.jl.decoder;

/* loaded from: classes9.dex */
public interface Control {
    double getPosition();

    boolean isPlaying();

    boolean isRandomAccess();

    void pause();

    void setPosition(double d);

    void start();

    void stop();
}
