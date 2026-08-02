package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class or0 implements sjd {
    public static final or0 a = new or0();
    public static final nz7 b = new nz7("projectNumber", fn0.q(fn0.o(iff.class, new ql0(1))));
    public static final nz7 c = new nz7("messageId", fn0.q(fn0.o(iff.class, new ql0(2))));
    public static final nz7 d = new nz7("instanceId", fn0.q(fn0.o(iff.class, new ql0(3))));
    public static final nz7 e = new nz7("messageType", fn0.q(fn0.o(iff.class, new ql0(4))));
    public static final nz7 f = new nz7("sdkPlatform", fn0.q(fn0.o(iff.class, new ql0(5))));
    public static final nz7 g = new nz7(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, fn0.q(fn0.o(iff.class, new ql0(6))));
    public static final nz7 h = new nz7("collapseKey", fn0.q(fn0.o(iff.class, new ql0(7))));
    public static final nz7 i = new nz7(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, fn0.q(fn0.o(iff.class, new ql0(8))));
    public static final nz7 j = new nz7("ttl", fn0.q(fn0.o(iff.class, new ql0(9))));
    public static final nz7 k = new nz7("topic", fn0.q(fn0.o(iff.class, new ql0(10))));
    public static final nz7 l = new nz7("bulkId", fn0.q(fn0.o(iff.class, new ql0(11))));
    public static final nz7 m = new nz7("event", fn0.q(fn0.o(iff.class, new ql0(12))));
    public static final nz7 n = new nz7("analyticsLabel", fn0.q(fn0.o(iff.class, new ql0(13))));
    public static final nz7 o = new nz7("campaignId", fn0.q(fn0.o(iff.class, new ql0(14))));
    public static final nz7 p = new nz7("composerLabel", fn0.q(fn0.o(iff.class, new ql0(15))));

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        eic eicVar = (eic) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.g(b, eicVar.a);
        tjdVar.a(c, eicVar.b);
        tjdVar.a(d, eicVar.c);
        tjdVar.a(e, eicVar.d);
        tjdVar.a(f, dic.ANDROID);
        tjdVar.a(g, eicVar.e);
        tjdVar.a(h, eicVar.f);
        tjdVar.e(i, eicVar.g);
        tjdVar.e(j, eicVar.h);
        tjdVar.a(k, eicVar.i);
        tjdVar.g(l, 0L);
        tjdVar.a(m, bic.MESSAGE_DELIVERED);
        tjdVar.a(n, eicVar.j);
        tjdVar.g(o, 0L);
        tjdVar.a(p, eicVar.k);
    }
}
