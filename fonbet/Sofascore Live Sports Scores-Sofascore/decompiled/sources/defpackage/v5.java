package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr2 b;

    public /* synthetic */ v5(nr2 nr2Var, int i) {
        this.a = i;
        this.b = nr2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        nr2 nr2Var = this.b;
        switch (i) {
            case 0:
                nv.z0(nr2Var.b, kv.IMPRESSION, "aircash_promotion", "chat");
                nr2Var.e = false;
                return Unit.a;
            default:
                return Boolean.valueOf(nr2Var.e);
        }
    }
}
