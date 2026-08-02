package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vm7 implements Function2 {
    public final /* synthetic */ int a = 6;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vm7(int i, int i2, boolean z, Function0 function0, Function1 function1, xtc xtcVar, int i3) {
        this.c = i;
        this.d = i2;
        this.b = z;
        this.e = function0;
        this.f = function1;
        this.g = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                v9g.k((FantasyTransferPlayers) obj5, this.c, (FantasyCompetitionType) obj4, this.b, (xtc) obj3, (of3) obj, aba.K(1 | this.d));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nz9.d((h0a) obj5, this.b, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1 | i2), this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                aik.c((cn2) obj5, this.b, this.c, this.d, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                uaa.e((scj) obj5, (String) obj4, (xtc) obj3, this.b, (of3) obj, aba.K(1 | i2), this.d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                r5i.a((zmd) obj5, (xtc) obj3, this.b, (Function2) obj4, (of3) obj, aba.K(1 | i2), this.d);
                break;
            case 5:
                mze mzeVar = (mze) obj;
                ((Float) obj2).floatValue();
                mzeVar.getClass();
                mzeVar.a();
                ooi ooiVar = (ooi) ((qze) obj4);
                ((Function1) obj3).invoke(Integer.valueOf(new aq2((zp2) obj5, (int) (((ooi) r4).x >> 32), (int) (ooiVar.x & 4294967295L), this.c, this.d).c(Float.intBitsToFloat((int) (mzeVar.c >> 32)), (int) (ooiVar.x >> 32), this.b)));
                break;
            default:
                ((Integer) obj2).getClass();
                i9a.n(this.c, this.d, this.b, (Function0) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vm7(cn2 cn2Var, boolean z, int i, int i2, Function0 function0, xtc xtcVar, int i3) {
        this.e = cn2Var;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.f = function0;
        this.g = xtcVar;
    }

    public /* synthetic */ vm7(zp2 zp2Var, qze qzeVar, int i, int i2, Function1 function1, boolean z) {
        this.e = zp2Var;
        this.f = qzeVar;
        this.c = i;
        this.d = i2;
        this.g = function1;
        this.b = z;
    }

    public /* synthetic */ vm7(h0a h0aVar, boolean z, Function0 function0, Function0 function02, int i, int i2) {
        this.e = h0aVar;
        this.b = z;
        this.f = function0;
        this.g = function02;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ vm7(zmd zmdVar, xtc xtcVar, boolean z, Function2 function2, int i, int i2) {
        this.e = zmdVar;
        this.g = xtcVar;
        this.b = z;
        this.f = function2;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ vm7(scj scjVar, String str, xtc xtcVar, boolean z, int i, int i2) {
        this.e = scjVar;
        this.f = str;
        this.g = xtcVar;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ vm7(FantasyTransferPlayers fantasyTransferPlayers, int i, FantasyCompetitionType fantasyCompetitionType, boolean z, xtc xtcVar, int i2) {
        this.e = fantasyTransferPlayers;
        this.c = i;
        this.f = fantasyCompetitionType;
        this.b = z;
        this.g = xtcVar;
        this.d = i2;
    }
}
