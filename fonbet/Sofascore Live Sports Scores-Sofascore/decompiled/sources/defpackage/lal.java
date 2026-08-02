package defpackage;

import android.os.Build;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lal implements kal {
    public final lx4 b;

    public lal() {
        this.b = Build.VERSION.SDK_INT >= 34 ? mx4.a : q1f.c;
        b.e(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
