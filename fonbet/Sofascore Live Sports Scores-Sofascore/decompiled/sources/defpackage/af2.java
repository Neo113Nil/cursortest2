package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class af2 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ bf2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af2(bf2 bf2Var, int i) {
        super(0);
        this.i = i;
        this.j = bf2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        bf2 bf2Var = this.j;
        switch (i) {
            case 0:
                je2 je2Var = je2.n;
                return c5n.M(bf2Var.f);
            default:
                String a = bf2Var.f.a("Content-Type");
                if (a == null) {
                    return null;
                }
                Regex regex = zdc.e;
                try {
                    return bea.v(a);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
