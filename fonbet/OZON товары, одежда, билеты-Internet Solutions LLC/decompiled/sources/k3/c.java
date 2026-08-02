package k3;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import m3.C8060b;
import m3.C8067i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static AudioManager f70377a;

    public static /* synthetic */ void a(Context context, C8067i c8067i) {
        f70377a = (AudioManager) context.getSystemService("audio");
        c8067i.g();
    }

    public static void b(AudioManager audioManager, C7476a c7476a) {
        audioManager.abandonAudioFocusRequest(c7476a.c());
    }

    public static synchronized AudioManager c(Context context) {
        synchronized (c.class) {
            try {
                final Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f70377a = null;
                }
                AudioManager audioManager = f70377a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    final C8067i c8067i = new C8067i();
                    C8060b.b().execute(new Runnable() { // from class: k3.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(applicationContext, c8067i);
                        }
                    });
                    c8067i.c();
                    AudioManager audioManager2 = f70377a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                f70377a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int d(AudioManager audioManager, C7476a c7476a) {
        return audioManager.requestAudioFocus(c7476a.c());
    }
}
