package defpackage;

import com.mbridge.msdk.foundation.entity.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wq0 implements sjd {
    public static final wq0 a = new wq0();
    public static final nz7 b = nz7.a("type");
    public static final nz7 c = nz7.a("reason");
    public static final nz7 d = nz7.a(b.JSON_KEY_FRAME_ADS);
    public static final nz7 e = nz7.a("causedBy");
    public static final nz7 f = nz7.a("overflowCount");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        bx3 bx3Var = (bx3) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.a(b, ((kt0) bx3Var).a);
        kt0 kt0Var = (kt0) bx3Var;
        tjdVar.a(c, kt0Var.b);
        tjdVar.a(d, kt0Var.c);
        tjdVar.a(e, kt0Var.d);
        tjdVar.e(f, kt0Var.e);
    }
}
