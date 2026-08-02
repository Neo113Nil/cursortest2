package defpackage;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dr2 {
    public final int a;
    public final String b;
    public final boolean c;
    public boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public dr2(int i, int i2, String str, boolean z) {
        str = (i2 & 4) != 0 ? null : str;
        boolean z2 = (i2 & 64) == 0;
        boolean z3 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) == 0;
        boolean z4 = (i2 & 512) == 0;
        boolean z5 = (i2 & 4096) == 0;
        this.a = i;
        this.b = str;
        this.c = z2;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }
}
