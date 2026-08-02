package javazoom.jl.player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javazoom.jl.decoder.JavaLayerException;

/* loaded from: classes9.dex */
public class jlp {
    private String fFilename = null;
    private boolean remote = false;

    public static void main(String[] strArr) {
        int i;
        try {
            jlp createInstance = createInstance(strArr);
            if (createInstance != null) {
                createInstance.play();
            }
            i = 0;
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace(System.err);
            i = 1;
        }
        System.exit(i);
    }

    public static jlp createInstance(String[] strArr) {
        jlp jlpVar = new jlp();
        if (jlpVar.parseArgs(strArr)) {
            return jlpVar;
        }
        return null;
    }

    private jlp() {
    }

    public jlp(String str) {
        init(str);
    }

    protected void init(String str) {
        this.fFilename = str;
    }

    protected boolean parseArgs(String[] strArr) {
        if (strArr.length == 1) {
            init(strArr[0]);
            this.remote = false;
            return true;
        }
        if (strArr.length == 2) {
            if (!strArr[0].equals("-url")) {
                showUsage();
                return false;
            }
            init(strArr[1]);
            this.remote = true;
            return true;
        }
        showUsage();
        return false;
    }

    public void showUsage() {
        System.out.println("Usage: jlp [-url] <filename>");
        System.out.println("");
        System.out.println(" e.g. : java javazoom.jl.player.jlp localfile.mp3");
        System.out.println("        java javazoom.jl.player.jlp -url http://www.server.com/remotefile.mp3");
        System.out.println("        java javazoom.jl.player.jlp -url http://www.shoutcastserver.com:8000");
    }

    public void play() throws JavaLayerException {
        try {
            System.out.println("playing " + this.fFilename + "...");
            new Player(this.remote ? getURLInputStream() : getInputStream(), getAudioDevice()).play();
        } catch (IOException e) {
            throw new JavaLayerException("Problem playing file " + this.fFilename, e);
        } catch (Exception e2) {
            throw new JavaLayerException("Problem playing file " + this.fFilename, e2);
        }
    }

    protected InputStream getURLInputStream() throws Exception {
        return new BufferedInputStream(new URL(this.fFilename).openStream());
    }

    protected InputStream getInputStream() throws IOException {
        return new BufferedInputStream(new FileInputStream(this.fFilename));
    }

    protected AudioDevice getAudioDevice() throws JavaLayerException {
        return FactoryRegistry.systemRegistry().createAudioDevice();
    }
}
