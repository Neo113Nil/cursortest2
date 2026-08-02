package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qt1 extends g21 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt1(um3 um3Var, int i) {
        super(um3Var);
        this.b = i;
    }

    @Override // defpackage.pl3
    public final boolean b(lcl lclVar) {
        switch (this.b) {
            case 0:
                return lclVar.j.c;
            case 1:
                return lclVar.j.e;
            case 2:
                return lclVar.j.a == jbd.b;
            case 3:
                return lclVar.j.a == jbd.c;
            default:
                return lclVar.j.f;
        }
    }

    @Override // defpackage.g21
    public final int c() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // defpackage.g21
    public final boolean d(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                bbd bbdVar = (bbd) obj;
                bbdVar.getClass();
                return (!bbdVar.e && bbdVar.a && bbdVar.b) ? false : true;
            case 3:
                bbd bbdVar2 = (bbd) obj;
                bbdVar2.getClass();
                return !bbdVar2.a || bbdVar2.c || bbdVar2.e;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
