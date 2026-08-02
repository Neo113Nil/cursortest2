package defpackage;

import com.google.android.gms.measurement.internal.zzpg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class p0p extends h0p {
    public boolean d;

    public p0p(zzpg zzpgVar) {
        super(zzpgVar);
        this.c.r++;
    }

    public final void R() {
        if (this.d) {
            return;
        }
        a70.r("Not initialized");
    }

    public final void S() {
        if (this.d) {
            a70.r("Can't initialize twice");
            return;
        }
        T();
        this.c.s++;
        this.d = true;
    }

    public abstract void T();
}
