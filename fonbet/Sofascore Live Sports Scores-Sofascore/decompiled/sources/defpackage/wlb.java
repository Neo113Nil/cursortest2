package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wlb extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ xlb j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wlb(xlb xlbVar, int i) {
        super(0);
        this.i = i;
        this.j = xlbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        xlb xlbVar = this.j;
        switch (i) {
            case 0:
                return Boolean.valueOf((((plb) ((eoh) xlbVar.b).getValue()) == null && ((Throwable) ((eoh) xlbVar.c).getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) ((eoh) xlbVar.c).getValue()) != null);
            case 2:
                if (((plb) ((eoh) xlbVar.b).getValue()) == null && ((Throwable) ((eoh) xlbVar.c).getValue()) == null) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                return Boolean.valueOf(((plb) ((eoh) xlbVar.b).getValue()) != null);
        }
    }
}
