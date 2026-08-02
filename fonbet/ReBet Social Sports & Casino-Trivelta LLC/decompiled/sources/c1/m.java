package c1;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import e1.AbstractC4134a;
import e1.AbstractC4136c;
import e1.AbstractC4156x;
import e1.C4146m;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static AudioManager f26771a;

    /* renamed from: b, reason: collision with root package name */
    public static Context f26772b;

    public static /* synthetic */ void a(Context context, C4146m c4146m) {
        f26771a = (AudioManager) context.getSystemService("audio");
        c4146m.f();
    }

    public static int b(AudioManager audioManager, C2483g c2483g) {
        int abandonAudioFocusRequest;
        if (Build.VERSION.SDK_INT < 26) {
            return audioManager.abandonAudioFocus(c2483g.f());
        }
        abandonAudioFocusRequest = audioManager.abandonAudioFocusRequest(c2483g.c());
        return abandonAudioFocusRequest;
    }

    public static synchronized AudioManager c(Context context) {
        synchronized (m.class) {
            try {
                final Context applicationContext = context.getApplicationContext();
                if (f26772b != applicationContext) {
                    f26771a = null;
                }
                AudioManager audioManager = f26771a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    final C4146m c4146m = new C4146m();
                    AbstractC4136c.a().execute(new Runnable() { // from class: c1.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.a(applicationContext, c4146m);
                        }
                    });
                    c4146m.b();
                    return (AudioManager) AbstractC4134a.e(f26771a);
                }
                AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
                f26771a = audioManager2;
                return (AudioManager) AbstractC4134a.e(audioManager2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int d(AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    public static int e(AudioManager audioManager, int i10) {
        int streamMinVolume;
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        streamMinVolume = audioManager.getStreamMinVolume(i10);
        return streamMinVolume;
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            AbstractC4156x.j("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean g(AudioManager audioManager, int i10) {
        return audioManager.isStreamMute(i10);
    }

    public static int h(AudioManager audioManager, C2483g c2483g) {
        int requestAudioFocus;
        if (Build.VERSION.SDK_INT < 26) {
            return audioManager.requestAudioFocus(c2483g.f(), c2483g.b().b(), c2483g.e());
        }
        requestAudioFocus = audioManager.requestAudioFocus(c2483g.c());
        return requestAudioFocus;
    }
}
