package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.Nk;
import java.util.HashMap;
import java.util.Timer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Nk {
    public final AbstractC3587m1 a;
    public final HashMap b;

    public Nk(AbstractC3587m1 abstractC3587m1) {
        abstractC3587m1.getClass();
        this.a = abstractC3587m1;
        this.b = new HashMap();
    }

    public final boolean a(byte b, long j) {
        if (this.b.containsKey(Byte.valueOf(b))) {
            a(b);
        }
        try {
            Timer timer = new Timer("Nk");
            this.b.put(Byte.valueOf(b), timer);
            timer.schedule(new Mk(this, b), j);
            return true;
        } catch (InternalError e) {
            e.toString();
            return false;
        }
    }

    public final void b(final byte b) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: bdd
            @Override // java.lang.Runnable
            public final void run() {
                Nk.a(Nk.this, b);
            }
        });
    }

    public static final void a(Nk nk, byte b) {
        nk.a.a(b);
    }

    public final void a(byte b) {
        Timer timer = (Timer) this.b.get(Byte.valueOf(b));
        if (timer != null) {
            timer.cancel();
            this.b.remove(Byte.valueOf(b));
        }
    }
}
