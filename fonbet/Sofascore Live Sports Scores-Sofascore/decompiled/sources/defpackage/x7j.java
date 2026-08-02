package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x7j extends t6a {
    public final /* synthetic */ pea d;
    public final /* synthetic */ z7j e;

    public x7j(z7j z7jVar, pea peaVar) {
        this.e = z7jVar;
        this.d = peaVar;
    }

    @Override // defpackage.t6a
    public final void B(int i) {
        this.e.n = true;
        this.d.z(i);
    }

    @Override // defpackage.t6a
    public final void C(Typeface typeface) {
        z7j z7jVar = this.e;
        Typeface create = Typeface.create(typeface, z7jVar.d);
        z7jVar.p = create;
        z7jVar.n = true;
        this.d.A(create, false);
    }
}
