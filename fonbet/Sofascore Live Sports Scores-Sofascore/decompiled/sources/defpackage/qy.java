package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qy extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ fsf j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy(fsf fsfVar, int i) {
        super(1);
        this.i = i;
        this.j = fsfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.i;
        fsf fsfVar = this.j;
        switch (i) {
            case 0:
                fsfVar.a = (ne8) obj;
                return Boolean.TRUE;
            case 1:
                rf9 rf9Var = (rf9) obj;
                Object obj2 = fsfVar.a;
                if (obj2 == null && rf9Var.q) {
                    fsfVar.a = rf9Var;
                } else if (obj2 != null) {
                    rf9Var.getClass();
                }
                return Boolean.TRUE;
            default:
                xv4 xv4Var = (jyj) obj;
                if (((wtc) xv4Var).a.n) {
                    fsfVar.a = xv4Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
