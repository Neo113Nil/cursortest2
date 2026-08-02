package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x9e implements yfb {
    public final long a = lfb.g.getAndIncrement();
    public final xe4 b;
    public final int c;
    public final tei d;
    public final w9e e;
    public volatile Object f;

    public x9e(re4 re4Var, xe4 xe4Var, int i, w9e w9eVar) {
        this.d = new tei(re4Var);
        this.b = xe4Var;
        this.c = i;
        this.e = w9eVar;
    }

    @Override // defpackage.yfb
    public final void load() {
        this.d.b = 0L;
        ue4 ue4Var = new ue4(this.d, this.b);
        try {
            ue4Var.a.b(ue4Var.b);
            ue4Var.d = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.e(uri, ue4Var);
        } finally {
            nik.h(ue4Var);
        }
    }

    @Override // defpackage.yfb
    public final void cancelLoad() {
    }
}
