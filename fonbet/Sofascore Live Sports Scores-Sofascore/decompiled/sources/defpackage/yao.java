package defpackage;

import com.google.android.gms.measurement.internal.zzic;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class yao extends y6o {
    public boolean c;

    public yao(zzic zzicVar) {
        super(zzicVar);
        ((zzic) this.b).A++;
    }

    public final void R() {
        if (this.c) {
            return;
        }
        a70.r("Not initialized");
    }

    public final void S() {
        if (this.c) {
            a70.r("Can't initialize twice");
        } else {
            if (T()) {
                return;
            }
            ((zzic) this.b).C.incrementAndGet();
            this.c = true;
        }
    }

    public abstract boolean T();
}
