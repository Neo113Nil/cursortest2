package defpackage;

import com.mbridge.msdk.foundation.entity.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yq0 implements sjd {
    public static final yq0 a = new yq0();
    public static final nz7 b = nz7.a("name");
    public static final nz7 c = nz7.a("importance");
    public static final nz7 d = nz7.a(b.JSON_KEY_FRAME_ADS);

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        ex3 ex3Var = (ex3) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.a(b, ((mt0) ex3Var).a);
        mt0 mt0Var = (mt0) ex3Var;
        tjdVar.e(c, mt0Var.b);
        tjdVar.a(d, mt0Var.c);
    }
}
