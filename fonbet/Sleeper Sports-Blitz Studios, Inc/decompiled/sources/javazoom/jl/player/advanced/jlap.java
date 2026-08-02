package javazoom.jl.player.advanced;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javazoom.jl.decoder.JavaLayerException;

/* loaded from: classes9.dex */
public class jlap {
    public static void main(String[] strArr) {
        jlap jlapVar = new jlap();
        if (strArr.length != 1) {
            jlapVar.showUsage();
            System.exit(0);
            return;
        }
        try {
            jlapVar.play(strArr[0]);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
    }

    public void play(String str) throws JavaLayerException, IOException {
        playMp3(new File(str), new InfoListener());
    }

    public void showUsage() {
        System.out.println("Usage: jla <filename>");
        System.out.println("");
        System.out.println(" e.g. : java javazoom.jl.player.advanced.jlap localfile.mp3");
    }

    public static AdvancedPlayer playMp3(File file, PlaybackListener playbackListener) throws IOException, JavaLayerException {
        return playMp3(file, 0, Integer.MAX_VALUE, playbackListener);
    }

    public static AdvancedPlayer playMp3(File file, int i, int i2, PlaybackListener playbackListener) throws IOException, JavaLayerException {
        return playMp3(new BufferedInputStream(new FileInputStream(file)), i, i2, playbackListener);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [javazoom.jl.player.advanced.jlap$1] */
    public static AdvancedPlayer playMp3(InputStream inputStream, final int i, final int i2, PlaybackListener playbackListener) throws JavaLayerException {
        final AdvancedPlayer advancedPlayer = new AdvancedPlayer(inputStream);
        advancedPlayer.setPlayBackListener(playbackListener);
        new Thread() { // from class: javazoom.jl.player.advanced.jlap.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    AdvancedPlayer.this.play(i, i2);
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                }
            }
        }.start();
        return advancedPlayer;
    }

    public class InfoListener extends PlaybackListener {
        public InfoListener() {
        }

        @Override // javazoom.jl.player.advanced.PlaybackListener
        public void playbackStarted(PlaybackEvent playbackEvent) {
            System.out.println("Play started from frame " + playbackEvent.getFrame());
        }

        @Override // javazoom.jl.player.advanced.PlaybackListener
        public void playbackFinished(PlaybackEvent playbackEvent) {
            System.out.println("Play completed at frame " + playbackEvent.getFrame());
            System.exit(0);
        }
    }
}
