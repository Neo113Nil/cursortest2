package m9;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f74651a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f74652b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f74653c = false;

    public e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f74651a = activity.getApplicationContext();
    }

    public final void a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new c());
        mediaPlayer.setOnErrorListener(new d());
        try {
            AssetFileDescriptor openRawResourceFd = this.f74651a.getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th2) {
                openRawResourceFd.close();
                throw th2;
            }
        } catch (IOException e11) {
            Log.w("e", e11);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    @SuppressLint({"MissingPermission"})
    public final synchronized void b() {
        Vibrator vibrator;
        try {
            if (this.f74652b) {
                a();
            }
            if (this.f74653c && (vibrator = (Vibrator) this.f74651a.getSystemService("vibrator")) != null) {
                vibrator.vibrate(200L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(boolean z11) {
        this.f74652b = z11;
    }

    public final void d(boolean z11) {
        this.f74653c = z11;
    }
}
