package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ow3 {
    public static final mx9 c = new mx9();
    public final nvd a;
    public final AtomicReference b = new AtomicReference(null);

    public ow3(nvd nvdVar) {
        this.a = nvdVar;
        nvdVar.a(new l1(this, 15));
    }

    public final mx9 a() {
        ow3 ow3Var = (ow3) this.b.get();
        return ow3Var == null ? c : ow3Var.a();
    }

    public final boolean b() {
        ow3 ow3Var = (ow3) this.b.get();
        return ow3Var != null && ow3Var.b();
    }

    public final boolean c() {
        ow3 ow3Var = (ow3) this.b.get();
        return ow3Var != null && ow3Var.c();
    }
}
