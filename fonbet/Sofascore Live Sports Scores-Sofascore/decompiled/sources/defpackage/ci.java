package defpackage;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ci implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ci(int i, Bitmap bitmap, jfj jfjVar, int i2, jfj jfjVar2, boolean z, jfj jfjVar3) {
        this.a = 11;
        this.d = i;
        this.f = bitmap;
        this.g = jfjVar;
        this.e = i2;
        this.b = jfjVar2;
        this.c = z;
        this.h = jfjVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.b;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hi.f((r9k) obj6, this.c, (String) obj5, (xtc) obj4, (tc3) obj3, (of3) obj, aba.K(1 | i2), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                j72.a((w22) obj6, (BrandLocation) obj5, (xtc) obj4, (Integer) obj3, this.c, (of3) obj, aba.K(1 | i2), this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                v9g.e(this.c, (Function1) obj6, (q80) obj5, (xtc) obj4, (dfj) obj3, (of3) obj, aba.K(1 | i2), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                o1j.g((FantasyTransferPlayers) obj6, this.c, (xtc) obj4, (FantasyCompetitionType) obj5, (Integer) obj3, (of3) obj, aba.K(1 | i2), this.e);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int K = aba.K(1 | i2);
                int i3 = this.e;
                m6k.h(K, i3, (of3) obj, (xtc) obj4, (ImageVector) obj6, (String) obj5, (Function0) obj3, this.c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                s02.k((do7) obj6, (ho7) obj5, (gv9) obj3, (xtc) obj4, this.c, (of3) obj, aba.K(1 | i2), this.e);
                break;
            case 6:
                ((Integer) obj2).getClass();
                tol.h((gv9) obj6, this.d, (FantasyCompetitionType) obj3, (String) obj5, this.e, this.c, (xtc) obj4, (of3) obj, aba.K(1572865));
                break;
            case 7:
                ((Integer) obj2).getClass();
                oea.a((xtc) obj4, (mea) obj6, this.d, this.e, this.c, (Function0) obj5, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                u0a.k(this.d, (String) obj5, (p4b) obj6, this.c, this.e, (Function0) obj3, (xtc) obj4, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                o3a.g((String) obj5, this.c, (Function1) obj6, (xtc) obj4, (String) obj3, (of3) obj, aba.K(i2 | 1), this.e);
                break;
            case 10:
                ((Integer) obj2).getClass();
                h5a.y((String) obj5, (tc3) obj3, (xtc) obj4, this.c, (Function0) obj6, (of3) obj, aba.K(i2 | 1), this.e);
                break;
            case 11:
                Bitmap bitmap = (Bitmap) obj6;
                jfj jfjVar = (jfj) obj5;
                jfj jfjVar2 = (jfj) obj4;
                jfj jfjVar3 = (jfj) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    c5n.n(new v20(i2), nq8.K(24.0f), 0, new t13(new fjj(new h1g(R.color.widget_sport_icon))), av8Var, 32816, 8);
                    rd0.b(nq8.A(ty8.a), 1, 0, yqo.H(882743077, av8Var, new v17(bitmap, jfjVar, this.e, jfjVar2, this.c, jfjVar3)), av8Var, 3072, 4);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qea.j((o5c) obj6, (Function1) obj5, (xtc) obj4, this.c, (Function0) obj3, (of3) obj, aba.K(i2 | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ci(int i, String str, p4b p4bVar, boolean z, int i2, Function0 function0, xtc xtcVar, int i3) {
        this.a = 8;
        this.d = i;
        this.g = str;
        this.f = p4bVar;
        this.c = z;
        this.e = i2;
        this.h = function0;
        this.b = xtcVar;
    }

    public /* synthetic */ ci(do7 do7Var, ho7 ho7Var, gv9 gv9Var, xtc xtcVar, boolean z, int i, int i2) {
        this.a = 5;
        this.f = do7Var;
        this.g = ho7Var;
        this.h = gv9Var;
        this.b = xtcVar;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ci(gv9 gv9Var, int i, FantasyCompetitionType fantasyCompetitionType, String str, int i2, boolean z, xtc xtcVar, int i3) {
        this.a = 6;
        this.f = gv9Var;
        this.d = i;
        this.h = fantasyCompetitionType;
        this.g = str;
        this.e = i2;
        this.c = z;
        this.b = xtcVar;
    }

    public /* synthetic */ ci(o5c o5cVar, Function1 function1, xtc xtcVar, boolean z, Function0 function0, int i, int i2) {
        this.a = 12;
        this.f = o5cVar;
        this.g = function1;
        this.b = xtcVar;
        this.c = z;
        this.h = function0;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ci(xtc xtcVar, mea meaVar, int i, int i2, boolean z, Function0 function0, Function1 function1, int i3) {
        this.a = 7;
        this.b = xtcVar;
        this.f = meaVar;
        this.d = i;
        this.e = i2;
        this.c = z;
        this.g = function0;
        this.h = function1;
    }

    public /* synthetic */ ci(r9k r9kVar, boolean z, String str, xtc xtcVar, tc3 tc3Var, int i, int i2) {
        this.a = 0;
        this.f = r9kVar;
        this.c = z;
        this.g = str;
        this.b = xtcVar;
        this.h = tc3Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ci(FantasyTransferPlayers fantasyTransferPlayers, boolean z, xtc xtcVar, FantasyCompetitionType fantasyCompetitionType, Integer num, int i, int i2) {
        this.a = 3;
        this.f = fantasyTransferPlayers;
        this.c = z;
        this.b = xtcVar;
        this.g = fantasyCompetitionType;
        this.h = num;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ci(Object obj, Object obj2, xtc xtcVar, Object obj3, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.g = obj2;
        this.b = xtcVar;
        this.h = obj3;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ci(String str, tc3 tc3Var, xtc xtcVar, boolean z, Function0 function0, int i, int i2) {
        this.a = 10;
        this.g = str;
        this.h = tc3Var;
        this.b = xtcVar;
        this.c = z;
        this.f = function0;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ci(String str, boolean z, Function1 function1, xtc xtcVar, String str2, int i, int i2) {
        this.a = 9;
        this.g = str;
        this.c = z;
        this.f = function1;
        this.b = xtcVar;
        this.h = str2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ ci(boolean z, Function1 function1, q80 q80Var, xtc xtcVar, dfj dfjVar, int i, int i2) {
        this.a = 2;
        this.c = z;
        this.f = function1;
        this.g = q80Var;
        this.b = xtcVar;
        this.h = dfjVar;
        this.d = i;
        this.e = i2;
    }
}
