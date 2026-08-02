package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.facebook.internal.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class chi {
    public final Context a;
    public final Handler b;
    public final lg6 c;
    public final AudioManager d;
    public d e;
    public int f;
    public int g;
    public boolean h;

    public chi(Context context, Handler handler, lg6 lg6Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = lg6Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        qx9.u(audioManager);
        this.d = audioManager;
        this.f = 3;
        this.g = b(audioManager, 3);
        int i = this.f;
        this.h = lik.a >= 23 ? audioManager.isStreamMute(i) : b(audioManager, i) == 0;
        d dVar = new d(this, 9);
        try {
            lik.C(applicationContext, dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = dVar;
        } catch (RuntimeException e) {
            m6k.g0("Error registering stream volume receiver", e);
        }
    }

    public static int b(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            m6k.g0("Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final int a() {
        if (lik.a >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    public final void c() {
        int i = this.f;
        AudioManager audioManager = this.d;
        int b = b(audioManager, i);
        int i2 = this.f;
        boolean isStreamMute = lik.a >= 23 ? audioManager.isStreamMute(i2) : b(audioManager, i2) == 0;
        if (this.g == b && this.h == isStreamMute) {
            return;
        }
        this.g = b;
        this.h = isStreamMute;
        this.c.a.l.k(30, new jg6(b, isStreamMute, 0));
    }
}
