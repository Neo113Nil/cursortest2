package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mae implements enf, i0f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mae(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i0f
    public final Object c(String str, Function1 function1, sq3 sq3Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((pae) obj).c(str, function1, sq3Var);
            default:
                return ((p0f) obj).c(str, function1, sq3Var);
        }
    }

    @Override // defpackage.enf
    public final glg d() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((pae) obj).b;
            default:
                return ((p0f) obj).b;
        }
    }
}
