package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sr0 implements sjd {
    public static final sr0 a = new sr0();
    public static final nz7 b = new nz7("currentCacheSizeBytes", fn0.q(fn0.o(iff.class, new ql0(1))));
    public static final nz7 c = new nz7("maxCacheSizeBytes", fn0.q(fn0.o(iff.class, new ql0(2))));

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        mfi mfiVar = (mfi) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.g(b, mfiVar.a);
        tjdVar.g(c, mfiVar.b);
    }
}
