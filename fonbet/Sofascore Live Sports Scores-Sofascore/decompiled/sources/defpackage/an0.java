package defpackage;

import android.media.AudioAttributes;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class an0 {
    public static final an0 b = new an0();
    public AudioAttributes a;

    static {
        wt3.s(0, 1, 2, 3, 4);
        nik.N(5);
        nik.N(6);
    }

    public final AudioAttributes a() {
        AudioAttributes audioAttributes = this.a;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            eq3.M(usage);
            eq3.R(usage);
        }
        if (i >= 32) {
            ym0.b(usage);
            ym0.a(usage);
        }
        AudioAttributes build = usage.build();
        this.a = build;
        return build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || an0.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
