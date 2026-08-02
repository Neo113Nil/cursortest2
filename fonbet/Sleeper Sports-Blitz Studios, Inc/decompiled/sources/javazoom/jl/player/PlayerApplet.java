package javazoom.jl.player;

import java.applet.Applet;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javazoom.jl.decoder.JavaLayerException;

/* loaded from: classes9.dex */
public class PlayerApplet extends Applet implements Runnable {
    public static final String AUDIO_PARAMETER = "audioURL";
    private Player player = null;
    private Thread playerThread = null;
    private String fileName = null;

    public void destroy() {
    }

    public void init() {
    }

    protected AudioDevice getAudioDevice() throws JavaLayerException {
        return FactoryRegistry.systemRegistry().createAudioDevice();
    }

    protected InputStream getAudioStream() {
        try {
            URL audioURL = getAudioURL();
            if (audioURL != null) {
                return audioURL.openStream();
            }
            return null;
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    protected String getAudioFileName() {
        String str = this.fileName;
        return str == null ? getParameter(AUDIO_PARAMETER) : str;
    }

    protected URL getAudioURL() {
        String audioFileName = getAudioFileName();
        if (audioFileName == null) {
            return null;
        }
        try {
            return new URL(getDocumentBase(), audioFileName);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public String getFileName() {
        return this.fileName;
    }

    protected void stopPlayer() throws JavaLayerException {
        Player player = this.player;
        if (player != null) {
            player.close();
            this.player = null;
            this.playerThread = null;
        }
    }

    protected void play(InputStream inputStream, AudioDevice audioDevice) throws JavaLayerException {
        stopPlayer();
        if (inputStream == null || audioDevice == null) {
            return;
        }
        this.player = new Player(inputStream, audioDevice);
        Thread createPlayerThread = createPlayerThread();
        this.playerThread = createPlayerThread;
        createPlayerThread.start();
    }

    protected Thread createPlayerThread() {
        return new Thread(this, "Audio player thread");
    }

    public void start() {
        String audioFileName = getAudioFileName();
        try {
            play(getAudioStream(), getAudioDevice());
        } catch (JavaLayerException e) {
            synchronized (System.err) {
                System.err.println("Unable to play " + audioFileName);
                e.printStackTrace(System.err);
            }
        }
    }

    public void stop() {
        try {
            stopPlayer();
        } catch (JavaLayerException e) {
            System.err.println(e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Player player = this.player;
        if (player != null) {
            try {
                player.play();
            } catch (JavaLayerException e) {
                System.err.println("Problem playing audio: " + e);
            }
        }
    }
}
