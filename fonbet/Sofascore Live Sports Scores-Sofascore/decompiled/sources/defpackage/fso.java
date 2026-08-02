package defpackage;

import com.google.android.gms.measurement.internal.zzic;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class fso extends t01 {
    public boolean c;

    public fso(zzic zzicVar) {
        super(zzicVar);
        ((zzic) this.b).A++;
    }

    public abstract boolean R();

    public final void S() {
        if (this.c) {
            return;
        }
        a70.r("Not initialized");
    }

    public final void T() {
        if (this.c) {
            a70.r("Can't initialize twice");
        } else {
            if (R()) {
                return;
            }
            ((zzic) this.b).C.incrementAndGet();
            this.c = true;
        }
    }
}
