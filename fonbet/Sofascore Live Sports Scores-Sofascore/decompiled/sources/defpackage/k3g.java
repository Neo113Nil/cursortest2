package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k3g implements m3g {
    public final /* synthetic */ Object a;
    public final /* synthetic */ grb b;

    public k3g(grb grbVar, Object obj) {
        this.b = grbVar;
        this.a = obj;
    }

    @Override // defpackage.m3g
    public final void a(r3g r3gVar) {
        r3gVar.a.k(new zef((MessageLite) this.a, ((aff) this.b.a.d).a));
        r3gVar.a.flush();
    }
}
