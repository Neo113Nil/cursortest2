package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380oc implements InterfaceC0284kg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0405pc f14409a;

    public C0380oc(C0405pc c0405pc) {
        this.f14409a = c0405pc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0284kg
    public final void a(C0359ng c0359ng) {
        if (c0359ng == null) {
            return;
        }
        P5 p52 = new P5("", "", 0);
        p52.setValueBytes(c0359ng.a());
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        p52.f12730d = 4097;
        this.f14409a.a(p52);
    }
}
