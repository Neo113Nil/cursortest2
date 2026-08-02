package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasyTeamOfTheRoundResponse;
import com.sofascore.model.fantasy.FantasyTopPlayersResponse;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mr6 extends hoi implements Function2 {
    public zu4 A;
    public do7 B;
    public List C;
    public List D;
    public mj7 E;
    public mj7 F;
    public ho7 G;
    public ho7 H;
    public mj7 I;
    public zu4 J;
    public List K;
    public sd7 L;
    public Object M;
    public List N;
    public List O;
    public Object P;
    public Object Q;
    public List R;
    public List S;
    public fo1 T;
    public int U;
    public int V;
    public int W;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ nr6 Z;
    public zu4 r;
    public av4 s;
    public zu4 t;
    public zu4 u;
    public zu4 v;
    public zu4 w;
    public zu4 x;
    public zu4 y;
    public zu4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr6(nr6 nr6Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.Z = nr6Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        mr6 mr6Var = new mr6(this.Z, rq3Var);
        mr6Var.Y = obj;
        return mr6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mr6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0f30  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0f48  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0ae0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x11c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0b2a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x11c6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x1199  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x1091  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x1127  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x107a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0e01  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0e84 A[LOOP:0: B:49:0x0e7e->B:51:0x0e84, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0f6f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x1002  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0cd1  */
    /* JADX WARN: Type inference failed for: r12v16, types: [km5] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6, types: [zu4] */
    /* JADX WARN: Type inference failed for: r14v11, types: [int] */
    /* JADX WARN: Type inference failed for: r14v13, types: [zu4] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v9, types: [zu4] */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v16, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        boolean z;
        boolean z2;
        zu4 p;
        Object T;
        lu3 lu3Var;
        zu4 zu4Var;
        av4 av4Var;
        av4 av4Var2;
        zu4 zu4Var2;
        zu4 zu4Var3;
        zu4 zu4Var4;
        zu4 zu4Var5;
        zu4 zu4Var6;
        int i;
        boolean z3;
        nr6 nr6Var;
        do7 do7Var;
        Object T2;
        zu4 zu4Var7;
        do7 do7Var2;
        av4 av4Var3;
        ?? r14;
        List list;
        ku3 ku3Var;
        Object T3;
        List list2;
        int i2;
        zu4 zu4Var8;
        zu4 zu4Var9;
        zu4 zu4Var10;
        zu4 zu4Var11;
        do7 do7Var3;
        zu4 zu4Var12;
        zu4 zu4Var13;
        zu4 zu4Var14;
        List list3;
        lu3 lu3Var2;
        Object obj2;
        int i3;
        Object obj3;
        mj7 mj7Var;
        ho7 ho7Var;
        List list4;
        Object obj4;
        ho7 ho7Var2;
        ho7 ho7Var3;
        ho7 ho7Var4;
        mj7 mj7Var2;
        mj7 mj7Var3;
        mj7 mj7Var4;
        Pair pair;
        mj7 mj7Var5;
        ku3 ku3Var2;
        av4 av4Var4;
        av4 av4Var5;
        Object T4;
        lu3 lu3Var3;
        mj7 mj7Var6;
        int i4;
        mj7 mj7Var7;
        av4 av4Var6;
        int i5;
        lu3 lu3Var4;
        mj7 mj7Var8;
        zu4 zu4Var15;
        ho7 ho7Var5;
        List list5;
        ho7 ho7Var6;
        zu4 zu4Var16;
        do7 do7Var4;
        Object obj5;
        ho7 ho7Var7;
        mj7 mj7Var9;
        List list6;
        zu4 zu4Var17;
        zu4 zu4Var18;
        List list7;
        ?? g;
        List list8;
        Iterator it;
        int i6;
        boolean z4;
        zu4 zu4Var19;
        Object P;
        lu3 lu3Var5;
        lu3 lu3Var6;
        do7 do7Var5;
        ho7 ho7Var8;
        List list9;
        ho7 ho7Var9;
        int i7;
        av4 av4Var7;
        mj7 mj7Var10;
        int i8;
        mj7 mj7Var11;
        mj7 mj7Var12;
        int i9;
        zu4 zu4Var20;
        nr6 nr6Var2;
        zu4 zu4Var21;
        List list10;
        mj7 mj7Var13;
        ku3 ku3Var3;
        do7 do7Var6;
        ho7 ho7Var10;
        List list11;
        List list12;
        int i10;
        zu4 zu4Var22;
        Object T5;
        mj7 mj7Var14;
        int i11;
        zu4 zu4Var23;
        zu4 zu4Var24;
        ho7 ho7Var11;
        int i12;
        zu4 zu4Var25;
        mj7 mj7Var15;
        zu4 zu4Var26;
        List list13;
        lu3 lu3Var7;
        List list14;
        int i13;
        zu4 zu4Var27;
        mj7 mj7Var16;
        ho7 ho7Var12;
        ho7 ho7Var13;
        zu4 zu4Var28;
        List list15;
        do7 do7Var7;
        mj7 mj7Var17;
        zu4 zu4Var29;
        mj7 mj7Var18;
        Iterator it2;
        Iterator it3;
        Object next;
        ku3 ku3Var4;
        ho7 ho7Var14;
        Object T6;
        do7 do7Var8;
        zu4 zu4Var30;
        int i14;
        int i15;
        int i16;
        sd7 sd7Var;
        nr6 nr6Var3;
        lu3 lu3Var8;
        List list16;
        zu4 zu4Var31;
        nr6 nr6Var4;
        zu4 zu4Var32;
        mj7 mj7Var19;
        mj7 mj7Var20;
        List list17;
        ku3 ku3Var5;
        Object T7;
        lu3 lu3Var9;
        List list18;
        mj7 mj7Var21;
        lu3 lu3Var10;
        sd7 sd7Var2;
        List list19;
        List list20;
        List list21;
        zu4 zu4Var33;
        mj7 mj7Var22;
        mj7 mj7Var23;
        sd7 sd7Var3;
        List list22;
        ho7 ho7Var15;
        List list23;
        ho7 ho7Var16;
        int i17;
        List list24;
        List list25;
        sd7 sd7Var4;
        zu4 zu4Var34;
        List list26;
        int i18;
        int i19;
        List list27;
        mj7 mj7Var24;
        mj7 mj7Var25;
        List list28;
        ku3 ku3Var6;
        boolean z5;
        List list29;
        mj7 mj7Var26;
        lu3 lu3Var11;
        zu4 zu4Var35;
        sd7 sd7Var5;
        int i20;
        List list30;
        int i21;
        List list31;
        int i22;
        ho7 ho7Var17;
        List list32;
        ho7 ho7Var18;
        nl7 nl7Var;
        FantasyTeamOfTheRoundResponse fantasyTeamOfTheRoundResponse;
        sd7 sd7Var6;
        List list33;
        List list34;
        int i23;
        List list35;
        mj7 mj7Var27;
        int i24;
        ho7 ho7Var19;
        nl7 nl7Var2;
        fo1 fo1Var;
        fo1 fo1Var2;
        gv9 gv9Var;
        List list36;
        int i25;
        nr6 nr6Var5;
        ho7 ho7Var20;
        int i26;
        ho7 ho7Var21;
        FantasyTeamOfTheRoundResponse fantasyTeamOfTheRoundResponse2;
        Object T8;
        int i27;
        List list37;
        int i28;
        mj7 mj7Var28;
        int i29;
        List list38;
        ho7 ho7Var22;
        ol7 ol7Var;
        int i30;
        FantasyTeamOfTheRoundResponse fantasyTeamOfTheRoundResponse3;
        zu4 zu4Var36;
        gv9 gv9Var2;
        int i31;
        sd7 sd7Var7;
        zu4 zu4Var37;
        List list39;
        ho7 ho7Var23;
        List list40;
        List list41;
        do7 do7Var9;
        nl7 nl7Var3;
        zu4 zu4Var38;
        ho7 ho7Var24;
        int i32;
        int i33;
        zu4 zu4Var39;
        ku3 ku3Var7;
        List list42;
        List list43;
        ku3 ku3Var8;
        Object T9;
        do7 do7Var10;
        List list44;
        List list45;
        ho7 ho7Var25;
        zu4 zu4Var40;
        zu4 zu4Var41;
        nl7 nl7Var4;
        zu4 zu4Var42;
        ho7 ho7Var26;
        int i34;
        List list46;
        mj7 mj7Var29;
        int i35;
        Iterator it4;
        List list47;
        ku3 ku3Var9;
        Object T10;
        lu3 lu3Var12;
        lu3 lu3Var13;
        sd7 sd7Var8;
        List list48;
        zu4 zu4Var43;
        List list49;
        List list50;
        List list51;
        nl7 nl7Var5;
        int i36;
        mj7 mj7Var30;
        ho7 ho7Var27;
        List list52;
        List list53;
        zu4 zu4Var44;
        List list54;
        do7 do7Var11;
        List list55;
        List list56;
        List list57;
        sd7 sd7Var9;
        int i37;
        int i38;
        int i39;
        Object T11;
        zu4 zu4Var45;
        ho7 ho7Var28;
        int i40;
        mj7 mj7Var31;
        int i41;
        List list58;
        sd7 sd7Var10;
        do7 do7Var12;
        nl7 nl7Var6;
        List list59;
        List list60;
        List list61;
        int i42;
        Object T12;
        mj7 mj7Var32;
        sd7 sd7Var11;
        List list62;
        List list63;
        List list64;
        List list65;
        ho7 ho7Var29;
        mj7 mj7Var33;
        int i43;
        List list66;
        List list67;
        ku3 ku3Var10;
        do7 do7Var13;
        ho7 ho7Var30;
        r69 r69Var;
        kr6 kr6Var;
        ku3 ku3Var11 = (ku3) this.Y;
        lu3 lu3Var14 = lu3.a;
        int i44 = this.X;
        nr6 nr6Var6 = this.Z;
        ho7 ho7Var31 = null;
        switch (i44) {
            case 0:
                y6a.M(obj);
                do7 do7Var14 = nr6Var6.k().a;
                ev6 ev6Var = do7Var14.c;
                mj7 mj7Var34 = ev6Var.k;
                mj7 mj7Var35 = ev6Var.i;
                int i45 = ev6Var.c;
                boolean z6 = ev6Var.d == FantasyCompetitionType.WEEKLY;
                rq3 rq3Var = null;
                av4 t2 = xw3.t(ku3Var11, null, new jr6(nr6Var6, i45, rq3Var, 7), 3);
                av4 t3 = xw3.t(ku3Var11, null, new jr6(nr6Var6, i45, rq3Var, 4), 3);
                t = xw3.t(ku3Var11, null, new jr6(nr6Var6, i45, rq3Var, 8), 3);
                av4 t4 = xw3.t(ku3Var11, null, new jr6(nr6Var6, i45, rq3Var, 2), 3);
                mj7 mj7Var36 = mj7Var34;
                av4 t5 = xw3.t(ku3Var11, null, new jr6(nr6Var6, i45, rq3Var, 5), 3);
                av4 t6 = xw3.t(ku3Var11, null, new jr6(nr6Var6, i45, rq3Var, 6), 3);
                if (nr6Var6.k().n == null) {
                    if ((mj7Var35.d() ? mj7Var35 : mj7Var36) != null) {
                        z = true;
                        av4 p2 = yaa.p(ku3Var11, z, new lr6(nr6Var6, do7Var14, null, 0));
                        if (z6 && nr6Var6.k().n == null) {
                            if (mj7Var35.d()) {
                                mj7Var36 = mj7Var35;
                            }
                            if (mj7Var36 != null) {
                                z2 = true;
                                rq3 rq3Var2 = null;
                                p = yaa.p(ku3Var11, z2, new lr6(nr6Var6, do7Var14, rq3Var2, 1));
                                ok0 ok0Var = new ok0(nr6Var6, i45, do7Var14, rq3Var2, 17);
                                nr6Var6 = nr6Var6;
                                av4 p3 = yaa.p(ku3Var11, z6, ok0Var);
                                av4 p4 = yaa.p(ku3Var11, !z6, new jr6(nr6Var6, i45, rq3Var2, 3));
                                av4 t7 = xw3.t(ku3Var11, null, new ok0(nr6Var6, i45, rq3Var2, 18), 3);
                                this.Y = ku3Var11;
                                this.r = t3;
                                this.s = t;
                                this.t = t4;
                                this.u = t5;
                                this.v = t6;
                                this.w = p2;
                                this.x = p;
                                this.y = p3;
                                this.z = p4;
                                this.A = t7;
                                this.U = i45;
                                boolean z7 = z6;
                                this.V = z7 ? 1 : 0;
                                this.X = 1;
                                T = t2.T(this);
                                lu3Var = lu3Var14;
                                if (T != lu3Var) {
                                    zu4Var = t5;
                                    av4Var = t4;
                                    obj = T;
                                    av4Var2 = t3;
                                    zu4Var2 = t6;
                                    zu4Var3 = t7;
                                    zu4Var4 = p3;
                                    zu4Var5 = p2;
                                    zu4Var6 = p4;
                                    i = i45;
                                    z3 = z7;
                                    nr6Var = nr6Var6;
                                    do7Var = (do7) obj;
                                    if (do7Var != null) {
                                        return Unit.a;
                                    }
                                    this.Y = ku3Var11;
                                    this.r = av4Var2;
                                    av4 av4Var8 = av4Var2;
                                    this.s = null;
                                    this.t = av4Var;
                                    this.u = zu4Var;
                                    this.v = zu4Var2;
                                    this.w = zu4Var5;
                                    this.x = p;
                                    this.y = zu4Var4;
                                    this.z = zu4Var6;
                                    this.A = zu4Var3;
                                    this.B = do7Var;
                                    this.U = i;
                                    this.V = z3 ? 1 : 0;
                                    this.X = 2;
                                    T2 = t.T(this);
                                    if (T2 != lu3Var) {
                                        zu4Var7 = av4Var;
                                        do7Var2 = do7Var;
                                        av4Var3 = av4Var8;
                                        r14 = z3;
                                        list = (List) T2;
                                        if (list != null) {
                                            return Unit.a;
                                        }
                                        this.Y = ku3Var11;
                                        ku3Var = ku3Var11;
                                        this.r = null;
                                        this.s = null;
                                        this.t = zu4Var7;
                                        this.u = zu4Var;
                                        this.v = zu4Var2;
                                        this.w = zu4Var5;
                                        this.x = p;
                                        this.y = zu4Var4;
                                        this.z = zu4Var6;
                                        this.A = zu4Var3;
                                        this.B = do7Var2;
                                        this.C = list;
                                        this.U = i;
                                        this.V = r14;
                                        this.X = 3;
                                        T3 = av4Var3.T(this);
                                        if (T3 != lu3Var) {
                                            do7 do7Var15 = do7Var2;
                                            list2 = list;
                                            i2 = r14;
                                            zu4Var8 = zu4Var5;
                                            zu4Var9 = zu4Var6;
                                            zu4Var10 = zu4Var;
                                            zu4Var11 = zu4Var3;
                                            do7Var3 = do7Var15;
                                            zu4 zu4Var46 = zu4Var7;
                                            zu4Var12 = p;
                                            zu4Var13 = zu4Var2;
                                            zu4Var14 = zu4Var46;
                                            if (((List) T3).isEmpty()) {
                                                T3 = null;
                                            }
                                            list3 = (List) T3;
                                            if (list3 != null) {
                                                return Unit.a;
                                            }
                                            Iterator it5 = list3.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    obj2 = it5.next();
                                                    Iterator it6 = it5;
                                                    lu3Var2 = lu3Var;
                                                    if (((mj7) obj2).a != do7Var3.c.n) {
                                                        it5 = it6;
                                                        lu3Var = lu3Var2;
                                                    }
                                                } else {
                                                    lu3Var2 = lu3Var;
                                                    obj2 = null;
                                                }
                                            }
                                            mj7 mj7Var37 = (mj7) obj2;
                                            if (mj7Var37 == null) {
                                                mj7Var37 = (mj7) CollectionsKt.h0(list3);
                                            }
                                            mj7 mj7Var38 = mj7Var37;
                                            Iterator it7 = list3.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    obj3 = it7.next();
                                                    Iterator it8 = it7;
                                                    int i46 = ((mj7) obj3).a;
                                                    i3 = i2;
                                                    Integer num = do7Var3.c.m;
                                                    if (num == null || i46 != num.intValue()) {
                                                        it7 = it8;
                                                        i2 = i3;
                                                    }
                                                } else {
                                                    i3 = i2;
                                                    obj3 = null;
                                                }
                                            }
                                            mj7 mj7Var39 = (mj7) obj3;
                                            if (mj7Var39 == null) {
                                                mj7Var39 = (mj7) CollectionsKt.h0(list3);
                                            }
                                            Iterator it9 = list3.iterator();
                                            while (true) {
                                                if (it9.hasNext()) {
                                                    ?? next2 = it9.next();
                                                    Iterator it10 = it9;
                                                    int i47 = ((mj7) next2).a;
                                                    mj7Var = next2;
                                                    Integer num2 = do7Var3.c.l;
                                                    if (num2 == null || i47 != num2.intValue()) {
                                                        it9 = it10;
                                                    }
                                                } else {
                                                    mj7Var = null;
                                                }
                                            }
                                            mj7 mj7Var40 = mj7Var38.d() ? mj7Var38 : mj7Var;
                                            if (yaa.w() > mj7Var38.d) {
                                                mj7Var38 = mj7Var39;
                                            }
                                            Iterator it11 = list2.iterator();
                                            while (true) {
                                                if (it11.hasNext()) {
                                                    ?? next3 = it11.next();
                                                    Iterator it12 = it11;
                                                    ho7Var = next3;
                                                    if (((ho7) next3).a.a != do7Var3.c.n) {
                                                        it11 = it12;
                                                    }
                                                } else {
                                                    ho7Var = null;
                                                }
                                            }
                                            ho7 ho7Var32 = ho7Var;
                                            ho7 ho7Var33 = ho7Var32 == null ? (ho7) CollectionsKt.h0(list2) : ho7Var32;
                                            ev6 ev6Var2 = do7Var3.c;
                                            int i48 = ir6.a[ev6Var2.d.ordinal()];
                                            int i49 = i;
                                            if (i48 == 1) {
                                                Iterator it13 = list2.iterator();
                                                while (true) {
                                                    if (it13.hasNext()) {
                                                        obj4 = it13.next();
                                                        Iterator it14 = it13;
                                                        list4 = list2;
                                                        if (((ho7) obj4).a.a != ev6Var2.n) {
                                                            it13 = it14;
                                                            list2 = list4;
                                                        }
                                                    } else {
                                                        list4 = list2;
                                                        obj4 = null;
                                                    }
                                                }
                                                ho7 ho7Var34 = (ho7) obj4;
                                                ho7Var2 = ho7Var34 == null ? (ho7) CollectionsKt.h0(list4) : ho7Var34;
                                                Iterator it15 = list4.iterator();
                                                while (true) {
                                                    if (it15.hasNext()) {
                                                        ?? next4 = it15.next();
                                                        Iterator it16 = it15;
                                                        int i50 = ((ho7) next4).a.a;
                                                        Integer num3 = ev6Var2.m;
                                                        if (num3 != null && i50 == num3.intValue()) {
                                                            ho7Var3 = next4;
                                                        } else {
                                                            it15 = it16;
                                                        }
                                                    } else {
                                                        ho7Var3 = null;
                                                    }
                                                }
                                                ho7 ho7Var35 = ho7Var3;
                                                Iterator it17 = list4.iterator();
                                                while (true) {
                                                    if (it17.hasNext()) {
                                                        ?? next5 = it17.next();
                                                        Iterator it18 = it17;
                                                        int i51 = ((ho7) next5).a.a;
                                                        ho7Var4 = ho7Var33;
                                                        Integer num4 = ev6Var2.l;
                                                        if (num4 != null && i51 == num4.intValue()) {
                                                            ho7Var31 = next5;
                                                        } else {
                                                            it17 = it18;
                                                            ho7Var33 = ho7Var4;
                                                        }
                                                    } else {
                                                        ho7Var4 = ho7Var33;
                                                    }
                                                }
                                                ho7 ho7Var36 = ho7Var31;
                                                mj7Var2 = ho7Var2.a;
                                                if (mj7Var2.h()) {
                                                    mj7Var3 = (ho7Var35 == null || (mj7Var4 = ho7Var35.a) == null) ? mj7Var2 : mj7Var4;
                                                } else {
                                                    if (ho7Var36 != null) {
                                                        ho7Var2 = ho7Var36;
                                                    }
                                                    pair = new Pair(ho7Var2, mj7Var2);
                                                    ho7 ho7Var37 = (ho7) pair.a;
                                                    mj7Var5 = (mj7) pair.b;
                                                    nr6Var6 = nr6Var;
                                                    mj7 mj7Var41 = mj7Var38;
                                                    rq3 rq3Var3 = null;
                                                    ku3Var2 = ku3Var;
                                                    av4 t8 = xw3.t(ku3Var2, null, new ce4(nr6Var6, ho7Var37, rq3Var3, 27), 3);
                                                    if (mj7Var5 != null) {
                                                    }
                                                    this.Y = ku3Var2;
                                                    this.r = null;
                                                    this.s = null;
                                                    this.t = zu4Var14;
                                                    this.u = zu4Var10;
                                                    this.v = zu4Var13;
                                                    this.w = zu4Var8;
                                                    this.x = zu4Var12;
                                                    this.y = zu4Var4;
                                                    this.z = zu4Var9;
                                                    this.A = zu4Var11;
                                                    this.B = do7Var3;
                                                    this.C = null;
                                                    this.D = list3;
                                                    this.E = mj7Var40;
                                                    this.F = mj7Var41;
                                                    this.G = ho7Var4;
                                                    this.H = ho7Var37;
                                                    this.I = mj7Var5;
                                                    this.J = av4Var5;
                                                    av4 av4Var9 = av4Var5;
                                                    this.U = i49;
                                                    this.V = i3;
                                                    this.X = 4;
                                                    T4 = av4Var4.T(this);
                                                    lu3Var3 = lu3Var2;
                                                    if (T4 == lu3Var3) {
                                                    }
                                                }
                                            } else if (i48 == 2) {
                                                ListIterator listIterator = list2.listIterator(list2.size());
                                                while (true) {
                                                    if (listIterator.hasPrevious()) {
                                                        obj5 = listIterator.previous();
                                                        if (((ho7) obj5).a.h()) {
                                                        }
                                                    } else {
                                                        obj5 = null;
                                                    }
                                                }
                                                ho7 ho7Var38 = (ho7) obj5;
                                                if (ho7Var38 == null) {
                                                    ho7Var38 = (ho7) CollectionsKt.h0(list2);
                                                }
                                                Iterator it19 = list3.iterator();
                                                while (true) {
                                                    if (it19.hasNext()) {
                                                        ?? next6 = it19.next();
                                                        mj7 mj7Var42 = (mj7) next6;
                                                        Iterator it20 = it19;
                                                        Long l = mj7Var42.h;
                                                        if (l != null) {
                                                            long longValue = l.longValue();
                                                            ho7Var7 = ho7Var38;
                                                            mj7Var9 = next6;
                                                            long j = mj7Var42.d;
                                                            long w = yaa.w();
                                                            if (longValue <= w && w <= j) {
                                                            }
                                                        } else {
                                                            ho7Var7 = ho7Var38;
                                                        }
                                                        ho7Var38 = ho7Var7;
                                                        it19 = it20;
                                                    } else {
                                                        ho7Var7 = ho7Var38;
                                                        mj7Var9 = null;
                                                    }
                                                }
                                                mj7Var3 = mj7Var9;
                                                ho7Var4 = ho7Var33;
                                                ho7Var2 = ho7Var7;
                                            } else {
                                                zzl.b();
                                                ho7Var4 = ho7Var33;
                                                pair = null;
                                                ho7 ho7Var372 = (ho7) pair.a;
                                                mj7Var5 = (mj7) pair.b;
                                                nr6Var6 = nr6Var;
                                                mj7 mj7Var412 = mj7Var38;
                                                rq3 rq3Var32 = null;
                                                ku3Var2 = ku3Var;
                                                av4 t82 = xw3.t(ku3Var2, null, new ce4(nr6Var6, ho7Var372, rq3Var32, 27), 3);
                                                if (mj7Var5 != null) {
                                                    av4Var4 = t82;
                                                    av4Var5 = xw3.t(ku3Var2, null, new ce4(nr6Var6, mj7Var5, rq3Var32, 26), 3);
                                                } else {
                                                    av4Var4 = t82;
                                                    av4Var5 = null;
                                                }
                                                this.Y = ku3Var2;
                                                this.r = null;
                                                this.s = null;
                                                this.t = zu4Var14;
                                                this.u = zu4Var10;
                                                this.v = zu4Var13;
                                                this.w = zu4Var8;
                                                this.x = zu4Var12;
                                                this.y = zu4Var4;
                                                this.z = zu4Var9;
                                                this.A = zu4Var11;
                                                this.B = do7Var3;
                                                this.C = null;
                                                this.D = list3;
                                                this.E = mj7Var40;
                                                this.F = mj7Var412;
                                                this.G = ho7Var4;
                                                this.H = ho7Var372;
                                                this.I = mj7Var5;
                                                this.J = av4Var5;
                                                av4 av4Var92 = av4Var5;
                                                this.U = i49;
                                                this.V = i3;
                                                this.X = 4;
                                                T4 = av4Var4.T(this);
                                                lu3Var3 = lu3Var2;
                                                if (T4 == lu3Var3) {
                                                    return lu3Var3;
                                                }
                                                mj7Var6 = mj7Var412;
                                                i4 = i3;
                                                mj7Var7 = mj7Var5;
                                                av4Var6 = av4Var92;
                                                i5 = i49;
                                                lu3Var4 = lu3Var3;
                                                mj7Var8 = mj7Var40;
                                                zu4Var15 = zu4Var11;
                                                ho7Var5 = ho7Var4;
                                                list5 = list3;
                                                obj = T4;
                                                ho7Var6 = ho7Var372;
                                                zu4Var16 = zu4Var14;
                                                do7Var4 = do7Var3;
                                                list6 = (List) obj;
                                                if (list6 == null) {
                                                    list7 = list5;
                                                    zu4Var17 = zu4Var15;
                                                    zu4Var18 = zu4Var9;
                                                    g = new ArrayList(k13.r(list6, 10));
                                                    Iterator it21 = list6.iterator();
                                                    while (it21.hasNext()) {
                                                        g.add(hkg.g0((FantasyRoundPlayer) it21.next(), nr6Var6.i()));
                                                    }
                                                } else {
                                                    zu4Var17 = zu4Var15;
                                                    zu4Var18 = zu4Var9;
                                                    list7 = list5;
                                                    g = b.g();
                                                }
                                                list8 = g;
                                                if (list8 != null || !list8.isEmpty()) {
                                                    it = list8.iterator();
                                                    while (it.hasNext()) {
                                                        if (((FantasyRoundPlayerUiModel) it.next()).w) {
                                                            i6 = 1;
                                                            tj7 tj7Var = nr6Var6.g;
                                                            boolean z8 = ho7Var5.g;
                                                            mj7 mj7Var43 = ho7Var6.a;
                                                            z4 = true;
                                                            boolean z9 = !mj7Var43.o;
                                                            int i52 = mj7Var43.a;
                                                            Integer num5 = do7Var4.c.B;
                                                            int intValue = num5 != null ? num5.intValue() : 0;
                                                            this.Y = ku3Var2;
                                                            this.r = null;
                                                            this.s = null;
                                                            this.t = zu4Var16;
                                                            this.u = zu4Var10;
                                                            this.v = zu4Var13;
                                                            this.w = zu4Var8;
                                                            this.x = zu4Var12;
                                                            this.y = zu4Var4;
                                                            zu4Var19 = zu4Var18;
                                                            this.z = zu4Var19;
                                                            zu4 zu4Var47 = zu4Var16;
                                                            this.A = zu4Var17;
                                                            this.B = do7Var4;
                                                            this.C = null;
                                                            this.D = list7;
                                                            this.E = mj7Var8;
                                                            mj7 mj7Var44 = mj7Var6;
                                                            this.F = mj7Var44;
                                                            this.G = ho7Var5;
                                                            this.H = ho7Var6;
                                                            ho7 ho7Var39 = ho7Var6;
                                                            this.I = mj7Var7;
                                                            this.J = av4Var6;
                                                            this.U = i5;
                                                            this.V = i4;
                                                            this.W = i6;
                                                            this.X = 5;
                                                            tj7Var.getClass();
                                                            P = tz9.P(new sj7(z9, list8, tj7Var, i52, intValue, z8, null), this);
                                                            lu3Var5 = lu3Var4;
                                                            if (P == lu3Var5) {
                                                                return lu3Var5;
                                                            }
                                                            obj = P;
                                                            lu3Var6 = lu3Var5;
                                                            do7Var5 = do7Var4;
                                                            ho7Var8 = ho7Var39;
                                                            list9 = list7;
                                                            ho7Var9 = ho7Var5;
                                                            i7 = i5;
                                                            av4Var7 = av4Var6;
                                                            mj7Var10 = mj7Var8;
                                                            i8 = i6;
                                                            mj7Var11 = mj7Var7;
                                                            mj7Var12 = mj7Var44;
                                                            i9 = i4;
                                                            zu4Var20 = zu4Var47;
                                                            nr6Var2 = nr6Var6;
                                                            zu4Var21 = zu4Var17;
                                                            list10 = (List) obj;
                                                            if (av4Var7 == null) {
                                                                this.Y = ku3Var2;
                                                                ku3Var3 = ku3Var2;
                                                                this.r = null;
                                                                this.s = null;
                                                                this.t = zu4Var20;
                                                                this.u = zu4Var10;
                                                                this.v = zu4Var13;
                                                                this.w = zu4Var8;
                                                                this.x = zu4Var12;
                                                                this.y = zu4Var4;
                                                                this.z = zu4Var19;
                                                                this.A = zu4Var21;
                                                                this.B = do7Var5;
                                                                this.C = null;
                                                                this.D = list9;
                                                                this.E = mj7Var10;
                                                                this.F = mj7Var12;
                                                                this.G = ho7Var9;
                                                                ho7 ho7Var40 = ho7Var8;
                                                                this.H = ho7Var40;
                                                                do7Var6 = do7Var5;
                                                                this.I = mj7Var11;
                                                                this.J = null;
                                                                this.K = list10;
                                                                this.U = i7;
                                                                this.V = i9;
                                                                this.W = i8;
                                                                this.X = 6;
                                                                T5 = av4Var7.T(this);
                                                                mj7 mj7Var45 = mj7Var10;
                                                                lu3Var14 = lu3Var6;
                                                                if (T5 == lu3Var14) {
                                                                    return lu3Var14;
                                                                }
                                                                zu4 zu4Var48 = zu4Var19;
                                                                mj7Var14 = mj7Var12;
                                                                i11 = i8;
                                                                zu4Var23 = zu4Var4;
                                                                zu4Var24 = zu4Var21;
                                                                list12 = list9;
                                                                ho7Var11 = ho7Var40;
                                                                i12 = i7;
                                                                zu4Var25 = zu4Var12;
                                                                mj7Var15 = mj7Var45;
                                                                zu4Var26 = zu4Var48;
                                                                list17 = (List) T5;
                                                                if (list17 != null) {
                                                                    zu4 zu4Var49 = zu4Var23;
                                                                    i8 = i11;
                                                                    mj7Var12 = mj7Var14;
                                                                    zu4Var19 = zu4Var26;
                                                                    mj7Var13 = mj7Var15;
                                                                    zu4Var12 = zu4Var25;
                                                                    zu4Var22 = zu4Var24;
                                                                    zu4Var4 = zu4Var49;
                                                                    ho7 ho7Var41 = ho7Var11;
                                                                    i10 = i12;
                                                                    list11 = list10;
                                                                    ho7Var10 = ho7Var41;
                                                                    do7 do7Var16 = do7Var6;
                                                                    zu4 zu4Var50 = zu4Var22;
                                                                    i13 = i10;
                                                                    zu4Var28 = zu4Var50;
                                                                    lu3Var7 = lu3Var14;
                                                                    zu4Var29 = zu4Var19;
                                                                    list13 = b.g();
                                                                    ho7Var12 = ho7Var9;
                                                                    ho7Var13 = ho7Var10;
                                                                    list15 = list12;
                                                                    zu4Var27 = zu4Var8;
                                                                    mj7Var16 = mj7Var12;
                                                                    mj7Var17 = mj7Var11;
                                                                    list14 = list11;
                                                                    do7Var7 = do7Var16;
                                                                    mj7Var18 = mj7Var13;
                                                                    zu4 zu4Var51 = zu4Var10;
                                                                    ArrayList arrayList = new ArrayList();
                                                                    for (Object obj6 : list13) {
                                                                        mj7 mj7Var46 = mj7Var17;
                                                                        ho7 ho7Var42 = ho7Var13;
                                                                        if (!((FantasyRoundPlayerUiModel) obj6).k) {
                                                                            arrayList.add(obj6);
                                                                        }
                                                                        mj7Var17 = mj7Var46;
                                                                        ho7Var13 = ho7Var42;
                                                                    }
                                                                    mj7 mj7Var47 = mj7Var17;
                                                                    ho7 ho7Var43 = ho7Var13;
                                                                    ArrayList arrayList2 = new ArrayList();
                                                                    it2 = arrayList.iterator();
                                                                    while (it2.hasNext()) {
                                                                        FantasyPlayerMissingData fantasyPlayerMissingData = ((FantasyRoundPlayerUiModel) it2.next()).l;
                                                                        sd7 sd7Var12 = fantasyPlayerMissingData != null ? fantasyPlayerMissingData.a : null;
                                                                        if (sd7Var12 != null) {
                                                                            arrayList2.add(sd7Var12);
                                                                        }
                                                                    }
                                                                    it3 = arrayList2.iterator();
                                                                    if (it3.hasNext()) {
                                                                        next = it3.next();
                                                                        if (it3.hasNext()) {
                                                                            int ordinal = ((sd7) next).ordinal();
                                                                            while (true) {
                                                                                Object next7 = it3.next();
                                                                                Iterator it22 = it3;
                                                                                int ordinal2 = ((sd7) next7).ordinal();
                                                                                if (ordinal < ordinal2) {
                                                                                    ordinal = ordinal2;
                                                                                    next = next7;
                                                                                }
                                                                                if (it22.hasNext()) {
                                                                                    list15 = list15;
                                                                                    ku3Var3 = ku3Var3;
                                                                                    it3 = it22;
                                                                                    do7Var7 = do7Var7;
                                                                                    mj7Var18 = mj7Var18;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        next = null;
                                                                    }
                                                                    sd7 sd7Var13 = (sd7) next;
                                                                    ku3Var4 = ku3Var3;
                                                                    this.Y = ku3Var4;
                                                                    this.r = null;
                                                                    this.s = null;
                                                                    this.t = zu4Var20;
                                                                    this.u = null;
                                                                    this.v = zu4Var13;
                                                                    this.w = zu4Var27;
                                                                    this.x = zu4Var12;
                                                                    this.y = zu4Var4;
                                                                    this.z = zu4Var29;
                                                                    this.A = zu4Var28;
                                                                    this.B = do7Var7;
                                                                    this.C = null;
                                                                    this.D = list15;
                                                                    this.E = mj7Var18;
                                                                    this.F = mj7Var16;
                                                                    this.G = ho7Var12;
                                                                    ho7Var14 = ho7Var43;
                                                                    this.H = ho7Var14;
                                                                    mj7 mj7Var48 = mj7Var18;
                                                                    this.I = mj7Var47;
                                                                    this.J = null;
                                                                    this.K = list14;
                                                                    this.L = sd7Var13;
                                                                    nr6 nr6Var7 = nr6Var2;
                                                                    this.M = nr6Var7;
                                                                    zu4 zu4Var52 = zu4Var29;
                                                                    this.U = i13;
                                                                    this.V = i9;
                                                                    this.W = i8;
                                                                    this.X = 7;
                                                                    T6 = zu4Var51.T(this);
                                                                    zu4 zu4Var53 = zu4Var20;
                                                                    lu3Var = lu3Var7;
                                                                    if (T6 != lu3Var) {
                                                                        do7Var8 = do7Var7;
                                                                        zu4Var30 = zu4Var53;
                                                                        i14 = i8;
                                                                        i15 = i9;
                                                                        i16 = i13;
                                                                        sd7Var = sd7Var13;
                                                                        nr6Var3 = nr6Var7;
                                                                        obj = T6;
                                                                        lu3Var8 = lu3Var;
                                                                        list16 = list15;
                                                                        zu4Var31 = zu4Var52;
                                                                        nr6Var4 = nr6Var3;
                                                                        zu4Var32 = zu4Var13;
                                                                        mj7Var19 = mj7Var48;
                                                                        mj7Var20 = mj7Var47;
                                                                        Pair l2 = nr6Var4.l((FantasyTopPlayersResponse) obj);
                                                                        List list68 = (List) l2.a;
                                                                        List list69 = (List) l2.b;
                                                                        this.Y = ku3Var4;
                                                                        ku3Var5 = ku3Var4;
                                                                        this.r = null;
                                                                        this.s = null;
                                                                        this.t = zu4Var30;
                                                                        this.u = null;
                                                                        this.v = null;
                                                                        this.w = zu4Var27;
                                                                        this.x = zu4Var12;
                                                                        this.y = zu4Var4;
                                                                        this.z = zu4Var31;
                                                                        this.A = zu4Var28;
                                                                        this.B = do7Var8;
                                                                        this.C = null;
                                                                        this.D = list16;
                                                                        this.E = mj7Var19;
                                                                        this.F = mj7Var16;
                                                                        this.G = ho7Var12;
                                                                        this.H = ho7Var14;
                                                                        mj7 mj7Var49 = mj7Var19;
                                                                        mj7 mj7Var50 = mj7Var20;
                                                                        this.I = mj7Var50;
                                                                        this.J = null;
                                                                        List list70 = list14;
                                                                        this.K = list70;
                                                                        this.L = sd7Var;
                                                                        this.M = list68;
                                                                        this.N = list69;
                                                                        this.U = i16;
                                                                        this.V = i15;
                                                                        this.W = i14;
                                                                        this.X = 8;
                                                                        T7 = zu4Var32.T(this);
                                                                        List list71 = list16;
                                                                        lu3Var9 = lu3Var8;
                                                                        if (T7 != lu3Var9) {
                                                                            return lu3Var9;
                                                                        }
                                                                        list18 = list68;
                                                                        mj7Var21 = mj7Var50;
                                                                        obj = T7;
                                                                        lu3Var10 = lu3Var9;
                                                                        sd7Var2 = sd7Var;
                                                                        list19 = list69;
                                                                        list20 = list70;
                                                                        list21 = list71;
                                                                        zu4Var33 = zu4Var27;
                                                                        mj7Var22 = mj7Var16;
                                                                        mj7Var23 = mj7Var49;
                                                                        List list72 = (List) obj;
                                                                        if (zu4Var33 == null) {
                                                                            this.Y = ku3Var5;
                                                                            this.r = null;
                                                                            this.s = null;
                                                                            this.t = zu4Var30;
                                                                            this.u = null;
                                                                            this.v = null;
                                                                            this.w = null;
                                                                            this.x = zu4Var12;
                                                                            this.y = zu4Var4;
                                                                            this.z = zu4Var31;
                                                                            this.A = zu4Var28;
                                                                            this.B = do7Var8;
                                                                            this.C = null;
                                                                            this.D = list21;
                                                                            this.E = mj7Var23;
                                                                            this.F = mj7Var22;
                                                                            this.G = ho7Var12;
                                                                            this.H = ho7Var14;
                                                                            this.I = mj7Var21;
                                                                            this.J = null;
                                                                            this.K = list20;
                                                                            this.L = sd7Var2;
                                                                            this.M = list18;
                                                                            this.N = list19;
                                                                            this.O = list72;
                                                                            this.U = i16;
                                                                            this.V = i15;
                                                                            this.W = i14;
                                                                            this.X = 9;
                                                                            Object T13 = zu4Var33.T(this);
                                                                            sd7 sd7Var14 = sd7Var2;
                                                                            lu3Var14 = lu3Var10;
                                                                            if (T13 == lu3Var14) {
                                                                                return lu3Var14;
                                                                            }
                                                                            List list73 = list18;
                                                                            list25 = list72;
                                                                            obj = T13;
                                                                            sd7Var4 = sd7Var14;
                                                                            zu4Var34 = zu4Var12;
                                                                            list26 = list19;
                                                                            i18 = i16;
                                                                            i19 = i15;
                                                                            list27 = list21;
                                                                            list22 = list20;
                                                                            mj7Var24 = mj7Var23;
                                                                            mj7Var25 = mj7Var22;
                                                                            list28 = list73;
                                                                            lu3Var10 = lu3Var14;
                                                                            fantasyTeamOfTheRoundResponse = (FantasyTeamOfTheRoundResponse) obj;
                                                                            if (fantasyTeamOfTheRoundResponse != null) {
                                                                                sd7 sd7Var15 = sd7Var4;
                                                                                list24 = list25;
                                                                                ho7 ho7Var44 = ho7Var12;
                                                                                ho7Var16 = ho7Var14;
                                                                                i17 = i19;
                                                                                i16 = i18;
                                                                                list19 = list26;
                                                                                ho7Var15 = ho7Var44;
                                                                                list23 = list28;
                                                                                sd7Var3 = sd7Var15;
                                                                                mj7Var22 = mj7Var25;
                                                                                ku3Var6 = ku3Var5;
                                                                                z5 = false;
                                                                                mj7 mj7Var51 = mj7Var21;
                                                                                list29 = list22;
                                                                                mj7Var26 = mj7Var51;
                                                                                lu3Var11 = lu3Var10;
                                                                                zu4Var35 = zu4Var4;
                                                                                sd7Var5 = sd7Var3;
                                                                                i20 = i14;
                                                                                list30 = list24;
                                                                                i21 = i16;
                                                                                list31 = list19;
                                                                                i22 = i17;
                                                                                ho7Var17 = ho7Var16;
                                                                                list32 = list23;
                                                                                ho7Var18 = ho7Var15;
                                                                                nl7Var = null;
                                                                                if (zu4Var35 != null) {
                                                                                }
                                                                            } else if (mj7Var24 != null) {
                                                                                nl7 nl7Var7 = nr6Var3.k().n;
                                                                                if (nl7Var7 == null || (ol7Var = nl7Var7.b) == null || (fo1Var = ol7Var.a) == null) {
                                                                                    sd7Var6 = sd7Var4;
                                                                                    fo1Var = new fo1(mj7Var24.a, mj7Var24.c, mj7Var24.b, mj7Var24.d);
                                                                                } else {
                                                                                    sd7Var6 = sd7Var4;
                                                                                }
                                                                                ArrayList arrayList3 = new ArrayList();
                                                                                Iterator it23 = list27.iterator();
                                                                                while (it23.hasNext()) {
                                                                                    Iterator it24 = it23;
                                                                                    Object next8 = it24.next();
                                                                                    fo1 fo1Var3 = fo1Var;
                                                                                    ho7 ho7Var45 = ho7Var14;
                                                                                    ho7 ho7Var46 = ho7Var12;
                                                                                    if (((mj7) next8).f < yaa.w()) {
                                                                                        arrayList3.add(next8);
                                                                                    }
                                                                                    it23 = it24;
                                                                                    fo1Var = fo1Var3;
                                                                                    ho7Var12 = ho7Var46;
                                                                                    ho7Var14 = ho7Var45;
                                                                                }
                                                                                fo1Var2 = fo1Var;
                                                                                ho7 ho7Var47 = ho7Var14;
                                                                                ho7 ho7Var48 = ho7Var12;
                                                                                ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                                                                                Iterator it25 = arrayList3.iterator();
                                                                                while (it25.hasNext()) {
                                                                                    mj7 mj7Var52 = (mj7) it25.next();
                                                                                    arrayList4.add(new fo1(mj7Var52.a, mj7Var52.c, mj7Var52.b, mj7Var52.d));
                                                                                }
                                                                                gv9 W = l6g.W(arrayList4);
                                                                                if (zu4Var34 != null) {
                                                                                    ku3Var6 = ku3Var5;
                                                                                    this.Y = ku3Var6;
                                                                                    this.r = null;
                                                                                    this.s = null;
                                                                                    this.t = zu4Var30;
                                                                                    this.u = null;
                                                                                    this.v = null;
                                                                                    this.w = null;
                                                                                    this.x = null;
                                                                                    this.y = zu4Var4;
                                                                                    this.z = zu4Var31;
                                                                                    this.A = zu4Var28;
                                                                                    this.B = do7Var8;
                                                                                    this.C = null;
                                                                                    this.D = null;
                                                                                    this.E = null;
                                                                                    this.F = mj7Var25;
                                                                                    this.G = ho7Var48;
                                                                                    this.H = ho7Var47;
                                                                                    this.I = mj7Var21;
                                                                                    this.J = null;
                                                                                    this.K = list22;
                                                                                    this.L = sd7Var6;
                                                                                    this.M = list28;
                                                                                    this.N = list26;
                                                                                    List list74 = list25;
                                                                                    this.O = list74;
                                                                                    this.P = nr6Var3;
                                                                                    this.Q = fantasyTeamOfTheRoundResponse;
                                                                                    this.R = null;
                                                                                    this.S = W;
                                                                                    this.T = fo1Var2;
                                                                                    gv9Var = W;
                                                                                    this.U = i18;
                                                                                    this.V = i19;
                                                                                    this.W = i14;
                                                                                    this.X = 10;
                                                                                    T8 = zu4Var34.T(this);
                                                                                    lu3Var = lu3Var10;
                                                                                    if (T8 != lu3Var) {
                                                                                        List list75 = list28;
                                                                                        list34 = list22;
                                                                                        i27 = i19;
                                                                                        list37 = list75;
                                                                                        i28 = i14;
                                                                                        nr6Var5 = nr6Var3;
                                                                                        mj7Var28 = mj7Var21;
                                                                                        i29 = i18;
                                                                                        ho7Var20 = ho7Var48;
                                                                                        list38 = list74;
                                                                                        ho7Var22 = ho7Var47;
                                                                                        fantasyTeamOfTheRoundResponse2 = fantasyTeamOfTheRoundResponse;
                                                                                        list47 = (List) T8;
                                                                                        if (list47 != null) {
                                                                                            if (list47.isEmpty()) {
                                                                                                list47 = null;
                                                                                            }
                                                                                            if (list47 != null) {
                                                                                                i30 = i29;
                                                                                                mj7Var21 = mj7Var28;
                                                                                                list35 = list37;
                                                                                                i19 = i27;
                                                                                                i26 = i28;
                                                                                                mj7Var27 = mj7Var25;
                                                                                                list31 = list26;
                                                                                                ho7Var19 = ho7Var22;
                                                                                                list33 = list38;
                                                                                                fantasyTeamOfTheRoundResponse3 = fantasyTeamOfTheRoundResponse2;
                                                                                                zu4Var36 = zu4Var28;
                                                                                                gv9Var2 = l6g.W(list47);
                                                                                                gv9 gv9Var3 = gv9Var;
                                                                                                nr6 nr6Var8 = nr6Var5;
                                                                                                fo1 fo1Var4 = fo1Var2;
                                                                                                int score = fantasyTeamOfTheRoundResponse3.getScore();
                                                                                                int i53 = i26;
                                                                                                List<FantasyRoundPlayer> players = fantasyTeamOfTheRoundResponse3.getPlayers();
                                                                                                zu4 zu4Var54 = zu4Var30;
                                                                                                zu4 zu4Var55 = zu4Var31;
                                                                                                ArrayList arrayList5 = new ArrayList(k13.r(players, 10));
                                                                                                for (it4 = players.iterator(); it4.hasNext(); it4 = it4) {
                                                                                                    arrayList5.add(hkg.g0((FantasyRoundPlayer) it4.next(), nr6Var8.i()));
                                                                                                }
                                                                                                nl7 nl7Var8 = new nl7(gv9Var3, new ol7(fo1Var4, score, l6g.W(arrayList5), new pl7(fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getScore(), fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getNameCode()), new pl7(fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getScore(), fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getNameCode())), gv9Var2, false);
                                                                                                i24 = i30;
                                                                                                z5 = false;
                                                                                                zu4Var28 = zu4Var36;
                                                                                                ho7Var12 = ho7Var20;
                                                                                                do7Var8 = do7Var8;
                                                                                                i23 = i53;
                                                                                                zu4Var31 = zu4Var55;
                                                                                                nl7Var2 = nl7Var8;
                                                                                                zu4Var30 = zu4Var54;
                                                                                                mj7 mj7Var53 = mj7Var27;
                                                                                                i20 = i23;
                                                                                                mj7Var26 = mj7Var21;
                                                                                                list29 = list34;
                                                                                                mj7Var22 = mj7Var53;
                                                                                                ho7 ho7Var49 = ho7Var19;
                                                                                                nl7Var = nl7Var2;
                                                                                                ho7Var17 = ho7Var49;
                                                                                                lu3Var11 = lu3Var;
                                                                                                zu4Var35 = zu4Var4;
                                                                                                list30 = list33;
                                                                                                sd7Var5 = sd7Var6;
                                                                                                i21 = i24;
                                                                                                ho7Var18 = ho7Var12;
                                                                                                list32 = list35;
                                                                                                i22 = i19;
                                                                                                if (zu4Var35 != null) {
                                                                                                    this.Y = ku3Var6;
                                                                                                    ku3Var8 = ku3Var6;
                                                                                                    this.r = null;
                                                                                                    this.s = null;
                                                                                                    this.t = zu4Var30;
                                                                                                    this.u = null;
                                                                                                    this.v = null;
                                                                                                    this.w = null;
                                                                                                    this.x = null;
                                                                                                    this.y = null;
                                                                                                    this.z = zu4Var31;
                                                                                                    this.A = zu4Var28;
                                                                                                    this.B = do7Var8;
                                                                                                    this.C = null;
                                                                                                    this.D = null;
                                                                                                    this.E = null;
                                                                                                    this.F = mj7Var22;
                                                                                                    this.G = ho7Var18;
                                                                                                    this.H = ho7Var17;
                                                                                                    this.I = mj7Var26;
                                                                                                    this.J = null;
                                                                                                    this.K = list29;
                                                                                                    this.L = sd7Var5;
                                                                                                    this.M = list32;
                                                                                                    this.N = list31;
                                                                                                    this.O = list30;
                                                                                                    this.P = nl7Var;
                                                                                                    this.Q = null;
                                                                                                    this.R = null;
                                                                                                    this.S = null;
                                                                                                    this.T = null;
                                                                                                    int i54 = i21;
                                                                                                    this.U = i54;
                                                                                                    ho7 ho7Var50 = ho7Var18;
                                                                                                    this.V = i22;
                                                                                                    this.W = i20;
                                                                                                    this.X = 11;
                                                                                                    T9 = zu4Var35.T(this);
                                                                                                    lu3Var14 = lu3Var11;
                                                                                                    if (T9 == lu3Var14) {
                                                                                                        return lu3Var14;
                                                                                                    }
                                                                                                    do7Var10 = do7Var8;
                                                                                                    list44 = list30;
                                                                                                    list45 = list31;
                                                                                                    ho7Var25 = ho7Var50;
                                                                                                    zu4Var40 = zu4Var31;
                                                                                                    zu4Var41 = zu4Var28;
                                                                                                    nl7Var4 = nl7Var;
                                                                                                    sd7Var7 = sd7Var5;
                                                                                                    zu4Var42 = zu4Var30;
                                                                                                    ho7Var26 = ho7Var17;
                                                                                                    i34 = i54;
                                                                                                    list40 = list29;
                                                                                                    list46 = list32;
                                                                                                    mj7Var29 = mj7Var26;
                                                                                                    i35 = i22;
                                                                                                    lu3Var11 = lu3Var14;
                                                                                                    i31 = i34;
                                                                                                    list42 = list46;
                                                                                                    i33 = i20;
                                                                                                    ku3Var7 = ku3Var8;
                                                                                                    zu4Var39 = zu4Var42;
                                                                                                    list41 = list44;
                                                                                                    zu4Var37 = zu4Var40;
                                                                                                    nl7Var3 = nl7Var4;
                                                                                                    list39 = list45;
                                                                                                    do7Var9 = do7Var10;
                                                                                                    i32 = i35;
                                                                                                    mj7Var26 = mj7Var29;
                                                                                                    list43 = (List) T9;
                                                                                                    ho7Var24 = ho7Var25;
                                                                                                    ho7Var23 = ho7Var26;
                                                                                                    zu4Var38 = zu4Var41;
                                                                                                    this.Y = ku3Var7;
                                                                                                    ku3Var9 = ku3Var7;
                                                                                                    this.r = null;
                                                                                                    this.s = null;
                                                                                                    this.t = null;
                                                                                                    this.u = null;
                                                                                                    this.v = null;
                                                                                                    this.w = null;
                                                                                                    this.x = null;
                                                                                                    this.y = null;
                                                                                                    this.z = zu4Var37;
                                                                                                    this.A = zu4Var38;
                                                                                                    this.B = do7Var9;
                                                                                                    this.C = null;
                                                                                                    this.D = null;
                                                                                                    this.E = null;
                                                                                                    this.F = mj7Var22;
                                                                                                    this.G = ho7Var24;
                                                                                                    this.H = ho7Var23;
                                                                                                    this.I = mj7Var26;
                                                                                                    this.J = null;
                                                                                                    this.K = list40;
                                                                                                    this.L = sd7Var7;
                                                                                                    this.M = list42;
                                                                                                    this.N = list39;
                                                                                                    this.O = list41;
                                                                                                    this.P = nl7Var3;
                                                                                                    this.Q = list43;
                                                                                                    this.R = null;
                                                                                                    this.S = null;
                                                                                                    this.T = null;
                                                                                                    int i55 = i31;
                                                                                                    this.U = i55;
                                                                                                    ho7 ho7Var51 = ho7Var24;
                                                                                                    this.V = i32;
                                                                                                    this.W = i33;
                                                                                                    this.X = 12;
                                                                                                    T10 = zu4Var39.T(this);
                                                                                                    List list76 = list42;
                                                                                                    lu3Var12 = lu3Var11;
                                                                                                    if (T10 == lu3Var12) {
                                                                                                        return lu3Var12;
                                                                                                    }
                                                                                                    obj = T10;
                                                                                                    lu3Var13 = lu3Var12;
                                                                                                    sd7Var8 = sd7Var7;
                                                                                                    list48 = list76;
                                                                                                    zu4Var43 = zu4Var37;
                                                                                                    list49 = list41;
                                                                                                    list50 = list40;
                                                                                                    list51 = list39;
                                                                                                    nl7Var5 = nl7Var3;
                                                                                                    i36 = i55;
                                                                                                    mj7Var30 = mj7Var26;
                                                                                                    ho7Var27 = ho7Var51;
                                                                                                    list52 = (List) obj;
                                                                                                    if (zu4Var43 == null) {
                                                                                                        int i56 = i36;
                                                                                                        this.Y = ku3Var9;
                                                                                                        this.r = null;
                                                                                                        this.s = null;
                                                                                                        this.t = null;
                                                                                                        this.u = null;
                                                                                                        this.v = null;
                                                                                                        this.w = null;
                                                                                                        this.x = null;
                                                                                                        this.y = null;
                                                                                                        this.z = null;
                                                                                                        this.A = zu4Var38;
                                                                                                        this.B = do7Var9;
                                                                                                        this.C = null;
                                                                                                        this.D = null;
                                                                                                        this.E = null;
                                                                                                        this.F = mj7Var22;
                                                                                                        this.G = ho7Var27;
                                                                                                        this.H = ho7Var23;
                                                                                                        this.I = mj7Var30;
                                                                                                        this.J = null;
                                                                                                        this.K = list50;
                                                                                                        this.L = sd7Var8;
                                                                                                        this.M = list48;
                                                                                                        this.N = list51;
                                                                                                        this.O = list49;
                                                                                                        this.P = nl7Var5;
                                                                                                        this.Q = list43;
                                                                                                        this.R = list52;
                                                                                                        this.U = i56;
                                                                                                        List list77 = list48;
                                                                                                        this.V = i32;
                                                                                                        this.W = i33;
                                                                                                        this.X = 13;
                                                                                                        T11 = zu4Var43.T(this);
                                                                                                        sd7 sd7Var16 = sd7Var8;
                                                                                                        lu3Var14 = lu3Var13;
                                                                                                        if (T11 == lu3Var14) {
                                                                                                            return lu3Var14;
                                                                                                        }
                                                                                                        zu4 zu4Var56 = zu4Var38;
                                                                                                        list54 = list50;
                                                                                                        zu4Var45 = zu4Var56;
                                                                                                        int i57 = i32;
                                                                                                        ho7Var28 = ho7Var27;
                                                                                                        i40 = i57;
                                                                                                        int i58 = i33;
                                                                                                        mj7Var31 = mj7Var30;
                                                                                                        i41 = i56;
                                                                                                        list58 = list43;
                                                                                                        sd7Var10 = sd7Var16;
                                                                                                        i37 = i58;
                                                                                                        do7Var12 = do7Var9;
                                                                                                        nl7Var6 = nl7Var5;
                                                                                                        list59 = list49;
                                                                                                        list60 = list51;
                                                                                                        list61 = list77;
                                                                                                        mj7 mj7Var54 = mj7Var31;
                                                                                                        i38 = i40;
                                                                                                        ho7Var27 = ho7Var28;
                                                                                                        i39 = i41;
                                                                                                        mj7Var30 = mj7Var54;
                                                                                                        lu3Var13 = lu3Var14;
                                                                                                        zu4Var44 = zu4Var45;
                                                                                                        list53 = list60;
                                                                                                        do7Var11 = do7Var12;
                                                                                                        list56 = (List) T11;
                                                                                                        list48 = list61;
                                                                                                        list55 = list59;
                                                                                                        nl7Var5 = nl7Var6;
                                                                                                        list57 = list52;
                                                                                                        sd7Var9 = sd7Var10;
                                                                                                        list43 = list58;
                                                                                                        ku3 ku3Var12 = ku3Var9;
                                                                                                        this.Y = ku3Var12;
                                                                                                        this.r = null;
                                                                                                        this.s = null;
                                                                                                        this.t = null;
                                                                                                        this.u = null;
                                                                                                        this.v = null;
                                                                                                        this.w = null;
                                                                                                        this.x = null;
                                                                                                        this.y = null;
                                                                                                        this.z = null;
                                                                                                        this.A = null;
                                                                                                        this.B = do7Var11;
                                                                                                        this.C = null;
                                                                                                        this.D = null;
                                                                                                        this.E = null;
                                                                                                        this.F = mj7Var22;
                                                                                                        this.G = ho7Var27;
                                                                                                        this.H = ho7Var23;
                                                                                                        this.I = mj7Var30;
                                                                                                        this.J = null;
                                                                                                        this.K = list54;
                                                                                                        this.L = sd7Var9;
                                                                                                        this.M = list48;
                                                                                                        this.N = list53;
                                                                                                        this.O = list55;
                                                                                                        this.P = nl7Var5;
                                                                                                        this.Q = list43;
                                                                                                        this.R = list57;
                                                                                                        this.S = list56;
                                                                                                        i42 = i39;
                                                                                                        this.U = i42;
                                                                                                        List list78 = list48;
                                                                                                        this.V = i38;
                                                                                                        this.W = i37;
                                                                                                        this.X = 14;
                                                                                                        T12 = zu4Var44.T(this);
                                                                                                        List list79 = list53;
                                                                                                        lu3Var14 = lu3Var13;
                                                                                                        if (T12 == lu3Var14) {
                                                                                                            return lu3Var14;
                                                                                                        }
                                                                                                        mj7Var32 = mj7Var30;
                                                                                                        sd7Var11 = sd7Var9;
                                                                                                        list62 = list57;
                                                                                                        list63 = list56;
                                                                                                        list64 = list43;
                                                                                                        list65 = list54;
                                                                                                        ho7Var29 = ho7Var23;
                                                                                                        mj7Var33 = mj7Var22;
                                                                                                        i43 = i38;
                                                                                                        list66 = list78;
                                                                                                        list67 = list79;
                                                                                                        ku3Var10 = ku3Var12;
                                                                                                        do7Var13 = do7Var11;
                                                                                                        ho7Var30 = ho7Var27;
                                                                                                        nl7 nl7Var9 = nl7Var5;
                                                                                                        List list80 = list55;
                                                                                                        int i59 = i37;
                                                                                                        List list81 = (List) T12;
                                                                                                        s9a.t(ku3Var10);
                                                                                                        hs4 hs4Var = z45.a;
                                                                                                        r69Var = rob.a;
                                                                                                        kr6Var = new kr6(nr6Var3, list66, list67, list80, list63, list81, list65, list64, nl7Var9, list62, ho7Var30, ho7Var29, i59 == 0 ? z4 : z5, do7Var13, mj7Var32, mj7Var33, sd7Var11, null);
                                                                                                        this.Y = null;
                                                                                                        this.r = null;
                                                                                                        this.s = null;
                                                                                                        this.t = null;
                                                                                                        this.u = null;
                                                                                                        this.v = null;
                                                                                                        this.w = null;
                                                                                                        this.x = null;
                                                                                                        this.y = null;
                                                                                                        this.z = null;
                                                                                                        this.A = null;
                                                                                                        this.B = null;
                                                                                                        this.C = null;
                                                                                                        this.D = null;
                                                                                                        this.E = null;
                                                                                                        this.F = null;
                                                                                                        this.G = null;
                                                                                                        this.H = null;
                                                                                                        this.I = null;
                                                                                                        this.J = null;
                                                                                                        this.K = null;
                                                                                                        this.L = null;
                                                                                                        this.M = null;
                                                                                                        this.N = null;
                                                                                                        this.O = null;
                                                                                                        this.P = null;
                                                                                                        this.Q = null;
                                                                                                        this.R = null;
                                                                                                        this.S = null;
                                                                                                        this.T = null;
                                                                                                        this.U = i42;
                                                                                                        this.V = i43;
                                                                                                        this.W = i59;
                                                                                                        this.X = 15;
                                                                                                        if (xw3.R(r69Var, kr6Var, this) == lu3Var14) {
                                                                                                            return lu3Var14;
                                                                                                        }
                                                                                                        return Unit.a;
                                                                                                    }
                                                                                                    sd7 sd7Var17 = sd7Var8;
                                                                                                    list53 = list51;
                                                                                                    zu4Var44 = zu4Var38;
                                                                                                    list54 = list50;
                                                                                                    do7Var11 = do7Var9;
                                                                                                    list55 = list49;
                                                                                                    list56 = null;
                                                                                                    list57 = list52;
                                                                                                    sd7Var9 = sd7Var17;
                                                                                                    i37 = i33;
                                                                                                    i38 = i32;
                                                                                                    i39 = i36;
                                                                                                    ku3 ku3Var122 = ku3Var9;
                                                                                                    this.Y = ku3Var122;
                                                                                                    this.r = null;
                                                                                                    this.s = null;
                                                                                                    this.t = null;
                                                                                                    this.u = null;
                                                                                                    this.v = null;
                                                                                                    this.w = null;
                                                                                                    this.x = null;
                                                                                                    this.y = null;
                                                                                                    this.z = null;
                                                                                                    this.A = null;
                                                                                                    this.B = do7Var11;
                                                                                                    this.C = null;
                                                                                                    this.D = null;
                                                                                                    this.E = null;
                                                                                                    this.F = mj7Var22;
                                                                                                    this.G = ho7Var27;
                                                                                                    this.H = ho7Var23;
                                                                                                    this.I = mj7Var30;
                                                                                                    this.J = null;
                                                                                                    this.K = list54;
                                                                                                    this.L = sd7Var9;
                                                                                                    this.M = list48;
                                                                                                    this.N = list53;
                                                                                                    this.O = list55;
                                                                                                    this.P = nl7Var5;
                                                                                                    this.Q = list43;
                                                                                                    this.R = list57;
                                                                                                    this.S = list56;
                                                                                                    i42 = i39;
                                                                                                    this.U = i42;
                                                                                                    List list782 = list48;
                                                                                                    this.V = i38;
                                                                                                    this.W = i37;
                                                                                                    this.X = 14;
                                                                                                    T12 = zu4Var44.T(this);
                                                                                                    List list792 = list53;
                                                                                                    lu3Var14 = lu3Var13;
                                                                                                    if (T12 == lu3Var14) {
                                                                                                    }
                                                                                                } else {
                                                                                                    i31 = i21;
                                                                                                    ho7 ho7Var52 = ho7Var18;
                                                                                                    zu4 zu4Var57 = zu4Var28;
                                                                                                    sd7Var7 = sd7Var5;
                                                                                                    zu4Var37 = zu4Var31;
                                                                                                    list39 = list31;
                                                                                                    ho7Var23 = ho7Var17;
                                                                                                    list40 = list29;
                                                                                                    list41 = list30;
                                                                                                    do7Var9 = do7Var8;
                                                                                                    nl7Var3 = nl7Var;
                                                                                                    zu4Var38 = zu4Var57;
                                                                                                    ho7Var24 = ho7Var52;
                                                                                                    i32 = i22;
                                                                                                    i33 = i20;
                                                                                                    zu4Var39 = zu4Var30;
                                                                                                    ku3Var7 = ku3Var6;
                                                                                                    list42 = list32;
                                                                                                    list43 = null;
                                                                                                    this.Y = ku3Var7;
                                                                                                    ku3Var9 = ku3Var7;
                                                                                                    this.r = null;
                                                                                                    this.s = null;
                                                                                                    this.t = null;
                                                                                                    this.u = null;
                                                                                                    this.v = null;
                                                                                                    this.w = null;
                                                                                                    this.x = null;
                                                                                                    this.y = null;
                                                                                                    this.z = zu4Var37;
                                                                                                    this.A = zu4Var38;
                                                                                                    this.B = do7Var9;
                                                                                                    this.C = null;
                                                                                                    this.D = null;
                                                                                                    this.E = null;
                                                                                                    this.F = mj7Var22;
                                                                                                    this.G = ho7Var24;
                                                                                                    this.H = ho7Var23;
                                                                                                    this.I = mj7Var26;
                                                                                                    this.J = null;
                                                                                                    this.K = list40;
                                                                                                    this.L = sd7Var7;
                                                                                                    this.M = list42;
                                                                                                    this.N = list39;
                                                                                                    this.O = list41;
                                                                                                    this.P = nl7Var3;
                                                                                                    this.Q = list43;
                                                                                                    this.R = null;
                                                                                                    this.S = null;
                                                                                                    this.T = null;
                                                                                                    int i552 = i31;
                                                                                                    this.U = i552;
                                                                                                    ho7 ho7Var512 = ho7Var24;
                                                                                                    this.V = i32;
                                                                                                    this.W = i33;
                                                                                                    this.X = 12;
                                                                                                    T10 = zu4Var39.T(this);
                                                                                                    List list762 = list42;
                                                                                                    lu3Var12 = lu3Var11;
                                                                                                    if (T10 == lu3Var12) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        List list82 = list37;
                                                                                        i19 = i27;
                                                                                        i26 = i28;
                                                                                        list36 = list82;
                                                                                        ho7 ho7Var53 = ho7Var22;
                                                                                        list33 = list38;
                                                                                        ho7Var21 = ho7Var53;
                                                                                        i25 = i29;
                                                                                        mj7Var21 = mj7Var28;
                                                                                        i30 = i25;
                                                                                        list35 = list36;
                                                                                        mj7Var27 = mj7Var25;
                                                                                        list31 = list26;
                                                                                        ho7Var19 = ho7Var21;
                                                                                        fantasyTeamOfTheRoundResponse3 = fantasyTeamOfTheRoundResponse2;
                                                                                        zu4Var36 = zu4Var28;
                                                                                        gv9Var2 = null;
                                                                                        gv9 gv9Var32 = gv9Var;
                                                                                        nr6 nr6Var82 = nr6Var5;
                                                                                        fo1 fo1Var42 = fo1Var2;
                                                                                        int score2 = fantasyTeamOfTheRoundResponse3.getScore();
                                                                                        int i532 = i26;
                                                                                        List<FantasyRoundPlayer> players2 = fantasyTeamOfTheRoundResponse3.getPlayers();
                                                                                        zu4 zu4Var542 = zu4Var30;
                                                                                        zu4 zu4Var552 = zu4Var31;
                                                                                        ArrayList arrayList52 = new ArrayList(k13.r(players2, 10));
                                                                                        while (it4.hasNext()) {
                                                                                        }
                                                                                        nl7 nl7Var82 = new nl7(gv9Var32, new ol7(fo1Var42, score2, l6g.W(arrayList52), new pl7(fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getScore(), fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getNameCode()), new pl7(fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getScore(), fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getNameCode())), gv9Var2, false);
                                                                                        i24 = i30;
                                                                                        z5 = false;
                                                                                        zu4Var28 = zu4Var36;
                                                                                        ho7Var12 = ho7Var20;
                                                                                        do7Var8 = do7Var8;
                                                                                        i23 = i532;
                                                                                        zu4Var31 = zu4Var552;
                                                                                        nl7Var2 = nl7Var82;
                                                                                        zu4Var30 = zu4Var542;
                                                                                        mj7 mj7Var532 = mj7Var27;
                                                                                        i20 = i23;
                                                                                        mj7Var26 = mj7Var21;
                                                                                        list29 = list34;
                                                                                        mj7Var22 = mj7Var532;
                                                                                        ho7 ho7Var492 = ho7Var19;
                                                                                        nl7Var = nl7Var2;
                                                                                        ho7Var17 = ho7Var492;
                                                                                        lu3Var11 = lu3Var;
                                                                                        zu4Var35 = zu4Var4;
                                                                                        list30 = list33;
                                                                                        sd7Var5 = sd7Var6;
                                                                                        i21 = i24;
                                                                                        ho7Var18 = ho7Var12;
                                                                                        list32 = list35;
                                                                                        i22 = i19;
                                                                                        if (zu4Var35 != null) {
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    list33 = list25;
                                                                                    ku3Var6 = ku3Var5;
                                                                                    lu3Var = lu3Var10;
                                                                                    gv9Var = W;
                                                                                    list36 = list28;
                                                                                    i25 = i18;
                                                                                    nr6Var5 = nr6Var3;
                                                                                    list34 = list22;
                                                                                    ho7Var20 = ho7Var48;
                                                                                    i26 = i14;
                                                                                    ho7Var21 = ho7Var47;
                                                                                    fantasyTeamOfTheRoundResponse2 = fantasyTeamOfTheRoundResponse;
                                                                                    i30 = i25;
                                                                                    list35 = list36;
                                                                                    mj7Var27 = mj7Var25;
                                                                                    list31 = list26;
                                                                                    ho7Var19 = ho7Var21;
                                                                                    fantasyTeamOfTheRoundResponse3 = fantasyTeamOfTheRoundResponse2;
                                                                                    zu4Var36 = zu4Var28;
                                                                                    gv9Var2 = null;
                                                                                    gv9 gv9Var322 = gv9Var;
                                                                                    nr6 nr6Var822 = nr6Var5;
                                                                                    fo1 fo1Var422 = fo1Var2;
                                                                                    int score22 = fantasyTeamOfTheRoundResponse3.getScore();
                                                                                    int i5322 = i26;
                                                                                    List<FantasyRoundPlayer> players22 = fantasyTeamOfTheRoundResponse3.getPlayers();
                                                                                    zu4 zu4Var5422 = zu4Var30;
                                                                                    zu4 zu4Var5522 = zu4Var31;
                                                                                    ArrayList arrayList522 = new ArrayList(k13.r(players22, 10));
                                                                                    while (it4.hasNext()) {
                                                                                    }
                                                                                    nl7 nl7Var822 = new nl7(gv9Var322, new ol7(fo1Var422, score22, l6g.W(arrayList522), new pl7(fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getScore(), fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getNameCode()), new pl7(fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getScore(), fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getNameCode())), gv9Var2, false);
                                                                                    i24 = i30;
                                                                                    z5 = false;
                                                                                    zu4Var28 = zu4Var36;
                                                                                    ho7Var12 = ho7Var20;
                                                                                    do7Var8 = do7Var8;
                                                                                    i23 = i5322;
                                                                                    zu4Var31 = zu4Var5522;
                                                                                    nl7Var2 = nl7Var822;
                                                                                    zu4Var30 = zu4Var5422;
                                                                                    mj7 mj7Var5322 = mj7Var27;
                                                                                    i20 = i23;
                                                                                    mj7Var26 = mj7Var21;
                                                                                    list29 = list34;
                                                                                    mj7Var22 = mj7Var5322;
                                                                                    ho7 ho7Var4922 = ho7Var19;
                                                                                    nl7Var = nl7Var2;
                                                                                    ho7Var17 = ho7Var4922;
                                                                                    lu3Var11 = lu3Var;
                                                                                    zu4Var35 = zu4Var4;
                                                                                    list30 = list33;
                                                                                    sd7Var5 = sd7Var6;
                                                                                    i21 = i24;
                                                                                    ho7Var18 = ho7Var12;
                                                                                    list32 = list35;
                                                                                    i22 = i19;
                                                                                    if (zu4Var35 != null) {
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                sd7Var6 = sd7Var4;
                                                                                list33 = list25;
                                                                                ku3Var6 = ku3Var5;
                                                                                lu3Var = lu3Var10;
                                                                                z5 = false;
                                                                                List list83 = list28;
                                                                                list34 = list22;
                                                                                i23 = i14;
                                                                                list35 = list83;
                                                                                mj7Var27 = mj7Var25;
                                                                                i24 = i18;
                                                                                list31 = list26;
                                                                                ho7Var19 = ho7Var14;
                                                                                nl7Var2 = null;
                                                                                mj7 mj7Var53222 = mj7Var27;
                                                                                i20 = i23;
                                                                                mj7Var26 = mj7Var21;
                                                                                list29 = list34;
                                                                                mj7Var22 = mj7Var53222;
                                                                                ho7 ho7Var49222 = ho7Var19;
                                                                                nl7Var = nl7Var2;
                                                                                ho7Var17 = ho7Var49222;
                                                                                lu3Var11 = lu3Var;
                                                                                zu4Var35 = zu4Var4;
                                                                                list30 = list33;
                                                                                sd7Var5 = sd7Var6;
                                                                                i21 = i24;
                                                                                ho7Var18 = ho7Var12;
                                                                                list32 = list35;
                                                                                i22 = i19;
                                                                                if (zu4Var35 != null) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            sd7Var3 = sd7Var2;
                                                                            list22 = list20;
                                                                            ho7Var15 = ho7Var12;
                                                                            list23 = list18;
                                                                            ho7Var16 = ho7Var14;
                                                                            i17 = i15;
                                                                            list24 = list72;
                                                                            ku3Var6 = ku3Var5;
                                                                            z5 = false;
                                                                            mj7 mj7Var512 = mj7Var21;
                                                                            list29 = list22;
                                                                            mj7Var26 = mj7Var512;
                                                                            lu3Var11 = lu3Var10;
                                                                            zu4Var35 = zu4Var4;
                                                                            sd7Var5 = sd7Var3;
                                                                            i20 = i14;
                                                                            list30 = list24;
                                                                            i21 = i16;
                                                                            list31 = list19;
                                                                            i22 = i17;
                                                                            ho7Var17 = ho7Var16;
                                                                            list32 = list23;
                                                                            ho7Var18 = ho7Var15;
                                                                            nl7Var = null;
                                                                            if (zu4Var35 != null) {
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    zu4 zu4Var58 = zu4Var23;
                                                                    i8 = i11;
                                                                    mj7Var17 = mj7Var11;
                                                                    list14 = list10;
                                                                    list15 = list12;
                                                                    zu4Var27 = zu4Var8;
                                                                    mj7Var16 = mj7Var14;
                                                                    ho7Var12 = ho7Var9;
                                                                    ho7Var13 = ho7Var11;
                                                                    zu4Var28 = zu4Var24;
                                                                    zu4Var4 = zu4Var58;
                                                                    list13 = list17;
                                                                    lu3Var7 = lu3Var14;
                                                                    mj7Var18 = mj7Var15;
                                                                    zu4Var29 = zu4Var26;
                                                                    zu4Var12 = zu4Var25;
                                                                    i13 = i12;
                                                                    do7Var7 = do7Var6;
                                                                    zu4 zu4Var512 = zu4Var10;
                                                                    ArrayList arrayList6 = new ArrayList();
                                                                    while (r27.hasNext()) {
                                                                    }
                                                                    mj7 mj7Var472 = mj7Var17;
                                                                    ho7 ho7Var432 = ho7Var13;
                                                                    ArrayList arrayList22 = new ArrayList();
                                                                    it2 = arrayList6.iterator();
                                                                    while (it2.hasNext()) {
                                                                    }
                                                                    it3 = arrayList22.iterator();
                                                                    if (it3.hasNext()) {
                                                                    }
                                                                    sd7 sd7Var132 = (sd7) next;
                                                                    ku3Var4 = ku3Var3;
                                                                    this.Y = ku3Var4;
                                                                    this.r = null;
                                                                    this.s = null;
                                                                    this.t = zu4Var20;
                                                                    this.u = null;
                                                                    this.v = zu4Var13;
                                                                    this.w = zu4Var27;
                                                                    this.x = zu4Var12;
                                                                    this.y = zu4Var4;
                                                                    this.z = zu4Var29;
                                                                    this.A = zu4Var28;
                                                                    this.B = do7Var7;
                                                                    this.C = null;
                                                                    this.D = list15;
                                                                    this.E = mj7Var18;
                                                                    this.F = mj7Var16;
                                                                    this.G = ho7Var12;
                                                                    ho7Var14 = ho7Var432;
                                                                    this.H = ho7Var14;
                                                                    mj7 mj7Var482 = mj7Var18;
                                                                    this.I = mj7Var472;
                                                                    this.J = null;
                                                                    this.K = list14;
                                                                    this.L = sd7Var132;
                                                                    nr6 nr6Var72 = nr6Var2;
                                                                    this.M = nr6Var72;
                                                                    zu4 zu4Var522 = zu4Var29;
                                                                    this.U = i13;
                                                                    this.V = i9;
                                                                    this.W = i8;
                                                                    this.X = 7;
                                                                    T6 = zu4Var512.T(this);
                                                                    zu4 zu4Var532 = zu4Var20;
                                                                    lu3Var = lu3Var7;
                                                                    if (T6 != lu3Var) {
                                                                    }
                                                                }
                                                            } else {
                                                                mj7Var13 = mj7Var10;
                                                                ku3Var3 = ku3Var2;
                                                                ho7 ho7Var54 = ho7Var8;
                                                                lu3Var14 = lu3Var6;
                                                                do7Var6 = do7Var5;
                                                                ho7Var10 = ho7Var54;
                                                                list11 = list10;
                                                                zu4 zu4Var59 = zu4Var21;
                                                                list12 = list9;
                                                                i10 = i7;
                                                                zu4Var22 = zu4Var59;
                                                                do7 do7Var162 = do7Var6;
                                                                zu4 zu4Var502 = zu4Var22;
                                                                i13 = i10;
                                                                zu4Var28 = zu4Var502;
                                                                lu3Var7 = lu3Var14;
                                                                zu4Var29 = zu4Var19;
                                                                list13 = b.g();
                                                                ho7Var12 = ho7Var9;
                                                                ho7Var13 = ho7Var10;
                                                                list15 = list12;
                                                                zu4Var27 = zu4Var8;
                                                                mj7Var16 = mj7Var12;
                                                                mj7Var17 = mj7Var11;
                                                                list14 = list11;
                                                                do7Var7 = do7Var162;
                                                                mj7Var18 = mj7Var13;
                                                                zu4 zu4Var5122 = zu4Var10;
                                                                ArrayList arrayList62 = new ArrayList();
                                                                while (r27.hasNext()) {
                                                                }
                                                                mj7 mj7Var4722 = mj7Var17;
                                                                ho7 ho7Var4322 = ho7Var13;
                                                                ArrayList arrayList222 = new ArrayList();
                                                                it2 = arrayList62.iterator();
                                                                while (it2.hasNext()) {
                                                                }
                                                                it3 = arrayList222.iterator();
                                                                if (it3.hasNext()) {
                                                                }
                                                                sd7 sd7Var1322 = (sd7) next;
                                                                ku3Var4 = ku3Var3;
                                                                this.Y = ku3Var4;
                                                                this.r = null;
                                                                this.s = null;
                                                                this.t = zu4Var20;
                                                                this.u = null;
                                                                this.v = zu4Var13;
                                                                this.w = zu4Var27;
                                                                this.x = zu4Var12;
                                                                this.y = zu4Var4;
                                                                this.z = zu4Var29;
                                                                this.A = zu4Var28;
                                                                this.B = do7Var7;
                                                                this.C = null;
                                                                this.D = list15;
                                                                this.E = mj7Var18;
                                                                this.F = mj7Var16;
                                                                this.G = ho7Var12;
                                                                ho7Var14 = ho7Var4322;
                                                                this.H = ho7Var14;
                                                                mj7 mj7Var4822 = mj7Var18;
                                                                this.I = mj7Var4722;
                                                                this.J = null;
                                                                this.K = list14;
                                                                this.L = sd7Var1322;
                                                                nr6 nr6Var722 = nr6Var2;
                                                                this.M = nr6Var722;
                                                                zu4 zu4Var5222 = zu4Var29;
                                                                this.U = i13;
                                                                this.V = i9;
                                                                this.W = i8;
                                                                this.X = 7;
                                                                T6 = zu4Var5122.T(this);
                                                                zu4 zu4Var5322 = zu4Var20;
                                                                lu3Var = lu3Var7;
                                                                if (T6 != lu3Var) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i6 = 0;
                                                tj7 tj7Var2 = nr6Var6.g;
                                                boolean z82 = ho7Var5.g;
                                                mj7 mj7Var432 = ho7Var6.a;
                                                z4 = true;
                                                boolean z92 = !mj7Var432.o;
                                                int i522 = mj7Var432.a;
                                                Integer num52 = do7Var4.c.B;
                                                if (num52 != null) {
                                                }
                                                this.Y = ku3Var2;
                                                this.r = null;
                                                this.s = null;
                                                this.t = zu4Var16;
                                                this.u = zu4Var10;
                                                this.v = zu4Var13;
                                                this.w = zu4Var8;
                                                this.x = zu4Var12;
                                                this.y = zu4Var4;
                                                zu4Var19 = zu4Var18;
                                                this.z = zu4Var19;
                                                zu4 zu4Var472 = zu4Var16;
                                                this.A = zu4Var17;
                                                this.B = do7Var4;
                                                this.C = null;
                                                this.D = list7;
                                                this.E = mj7Var8;
                                                mj7 mj7Var442 = mj7Var6;
                                                this.F = mj7Var442;
                                                this.G = ho7Var5;
                                                this.H = ho7Var6;
                                                ho7 ho7Var392 = ho7Var6;
                                                this.I = mj7Var7;
                                                this.J = av4Var6;
                                                this.U = i5;
                                                this.V = i4;
                                                this.W = i6;
                                                this.X = 5;
                                                tj7Var2.getClass();
                                                P = tz9.P(new sj7(z92, list8, tj7Var2, i522, intValue, z82, null), this);
                                                lu3Var5 = lu3Var4;
                                                if (P == lu3Var5) {
                                                }
                                            }
                                            mj7Var2 = mj7Var3;
                                            pair = new Pair(ho7Var2, mj7Var2);
                                            ho7 ho7Var3722 = (ho7) pair.a;
                                            mj7Var5 = (mj7) pair.b;
                                            nr6Var6 = nr6Var;
                                            mj7 mj7Var4122 = mj7Var38;
                                            rq3 rq3Var322 = null;
                                            ku3Var2 = ku3Var;
                                            av4 t822 = xw3.t(ku3Var2, null, new ce4(nr6Var6, ho7Var3722, rq3Var322, 27), 3);
                                            if (mj7Var5 != null) {
                                            }
                                            this.Y = ku3Var2;
                                            this.r = null;
                                            this.s = null;
                                            this.t = zu4Var14;
                                            this.u = zu4Var10;
                                            this.v = zu4Var13;
                                            this.w = zu4Var8;
                                            this.x = zu4Var12;
                                            this.y = zu4Var4;
                                            this.z = zu4Var9;
                                            this.A = zu4Var11;
                                            this.B = do7Var3;
                                            this.C = null;
                                            this.D = list3;
                                            this.E = mj7Var40;
                                            this.F = mj7Var4122;
                                            this.G = ho7Var4;
                                            this.H = ho7Var3722;
                                            this.I = mj7Var5;
                                            this.J = av4Var5;
                                            av4 av4Var922 = av4Var5;
                                            this.U = i49;
                                            this.V = i3;
                                            this.X = 4;
                                            T4 = av4Var4.T(this);
                                            lu3Var3 = lu3Var2;
                                            if (T4 == lu3Var3) {
                                            }
                                        }
                                    }
                                }
                                return lu3Var;
                            }
                        }
                        z2 = false;
                        rq3 rq3Var22 = null;
                        p = yaa.p(ku3Var11, z2, new lr6(nr6Var6, do7Var14, rq3Var22, 1));
                        ok0 ok0Var2 = new ok0(nr6Var6, i45, do7Var14, rq3Var22, 17);
                        nr6Var6 = nr6Var6;
                        av4 p32 = yaa.p(ku3Var11, z6, ok0Var2);
                        av4 p42 = yaa.p(ku3Var11, !z6, new jr6(nr6Var6, i45, rq3Var22, 3));
                        av4 t72 = xw3.t(ku3Var11, null, new ok0(nr6Var6, i45, rq3Var22, 18), 3);
                        this.Y = ku3Var11;
                        this.r = t3;
                        this.s = t;
                        this.t = t4;
                        this.u = t5;
                        this.v = t6;
                        this.w = p2;
                        this.x = p;
                        this.y = p32;
                        this.z = p42;
                        this.A = t72;
                        this.U = i45;
                        boolean z72 = z6;
                        this.V = z72 ? 1 : 0;
                        this.X = 1;
                        T = t2.T(this);
                        lu3Var = lu3Var14;
                        if (T != lu3Var) {
                        }
                        return lu3Var;
                    }
                }
                z = false;
                av4 p22 = yaa.p(ku3Var11, z, new lr6(nr6Var6, do7Var14, null, 0));
                if (z6) {
                    if (mj7Var35.d()) {
                    }
                    if (mj7Var36 != null) {
                    }
                }
                z2 = false;
                rq3 rq3Var222 = null;
                p = yaa.p(ku3Var11, z2, new lr6(nr6Var6, do7Var14, rq3Var222, 1));
                ok0 ok0Var22 = new ok0(nr6Var6, i45, do7Var14, rq3Var222, 17);
                nr6Var6 = nr6Var6;
                av4 p322 = yaa.p(ku3Var11, z6, ok0Var22);
                av4 p422 = yaa.p(ku3Var11, !z6, new jr6(nr6Var6, i45, rq3Var222, 3));
                av4 t722 = xw3.t(ku3Var11, null, new ok0(nr6Var6, i45, rq3Var222, 18), 3);
                this.Y = ku3Var11;
                this.r = t3;
                this.s = t;
                this.t = t4;
                this.u = t5;
                this.v = t6;
                this.w = p22;
                this.x = p;
                this.y = p322;
                this.z = p422;
                this.A = t722;
                this.U = i45;
                boolean z722 = z6;
                this.V = z722 ? 1 : 0;
                this.X = 1;
                T = t2.T(this);
                lu3Var = lu3Var14;
                if (T != lu3Var) {
                }
                return lu3Var;
            case 1:
                ?? r3 = this.V;
                i = this.U;
                zu4 zu4Var60 = this.A;
                zu4 zu4Var61 = this.z;
                zu4 zu4Var62 = this.y;
                zu4 zu4Var63 = this.x;
                zu4 zu4Var64 = this.w;
                zu4 zu4Var65 = this.v;
                zu4 zu4Var66 = this.u;
                ?? r12 = this.t;
                t = this.s;
                ?? r142 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var14;
                av4Var2 = r142;
                z3 = r3;
                zu4Var3 = zu4Var60;
                av4Var = r12;
                zu4Var = zu4Var66;
                zu4Var2 = zu4Var65;
                zu4Var5 = zu4Var64;
                p = zu4Var63;
                zu4Var4 = zu4Var62;
                zu4Var6 = zu4Var61;
                nr6Var = nr6Var6;
                do7Var = (do7) obj;
                if (do7Var != null) {
                }
                break;
            case 2:
                int i60 = this.V;
                i = this.U;
                do7Var2 = this.B;
                zu4Var3 = this.A;
                zu4Var6 = this.z;
                zu4Var4 = this.y;
                p = this.x;
                zu4Var5 = this.w;
                zu4Var2 = this.v;
                zu4Var = this.u;
                zu4Var7 = this.t;
                ?? r143 = this.r;
                y6a.M(obj);
                nr6Var = nr6Var6;
                av4Var3 = r143;
                r14 = i60;
                lu3Var = lu3Var14;
                T2 = obj;
                list = (List) T2;
                if (list != null) {
                }
                break;
            case 3:
                int i61 = this.V;
                i = this.U;
                list2 = this.C;
                do7Var3 = this.B;
                zu4 zu4Var67 = this.A;
                zu4Var9 = this.z;
                zu4 zu4Var68 = this.y;
                zu4Var12 = this.x;
                zu4Var8 = this.w;
                zu4Var13 = this.v;
                zu4Var10 = this.u;
                zu4Var14 = this.t;
                y6a.M(obj);
                lu3Var = lu3Var14;
                i2 = i61;
                zu4Var11 = zu4Var67;
                zu4Var4 = zu4Var68;
                ku3Var = ku3Var11;
                nr6Var = nr6Var6;
                T3 = obj;
                if (((List) T3).isEmpty()) {
                }
                list3 = (List) T3;
                if (list3 != null) {
                }
                break;
            case 4:
                int i62 = this.V;
                int i63 = this.U;
                ?? r6 = this.J;
                mj7 mj7Var55 = this.I;
                ho7 ho7Var55 = this.H;
                ho7 ho7Var56 = this.G;
                mj7 mj7Var56 = this.F;
                mj7 mj7Var57 = this.E;
                list5 = this.D;
                do7 do7Var17 = this.B;
                zu4 zu4Var69 = this.A;
                zu4 zu4Var70 = this.z;
                i4 = i62;
                zu4 zu4Var71 = this.y;
                zu4 zu4Var72 = this.x;
                zu4 zu4Var73 = this.w;
                zu4 zu4Var74 = this.v;
                zu4 zu4Var75 = this.u;
                zu4Var16 = this.t;
                y6a.M(obj);
                ku3Var2 = ku3Var11;
                ho7Var6 = ho7Var55;
                zu4Var4 = zu4Var71;
                i5 = i63;
                zu4Var15 = zu4Var69;
                zu4Var8 = zu4Var73;
                mj7Var6 = mj7Var56;
                zu4Var9 = zu4Var70;
                lu3Var4 = lu3Var14;
                mj7Var7 = mj7Var55;
                ho7Var5 = ho7Var56;
                zu4Var13 = zu4Var74;
                zu4Var10 = zu4Var75;
                mj7Var8 = mj7Var57;
                do7Var4 = do7Var17;
                zu4Var12 = zu4Var72;
                av4Var6 = r6;
                list6 = (List) obj;
                if (list6 == null) {
                }
                list8 = g;
                if (list8 != null) {
                    break;
                }
                it = list8.iterator();
                while (it.hasNext()) {
                }
                i6 = 0;
                tj7 tj7Var22 = nr6Var6.g;
                boolean z822 = ho7Var5.g;
                mj7 mj7Var4322 = ho7Var6.a;
                z4 = true;
                boolean z922 = !mj7Var4322.o;
                int i5222 = mj7Var4322.a;
                Integer num522 = do7Var4.c.B;
                if (num522 != null) {
                }
                this.Y = ku3Var2;
                this.r = null;
                this.s = null;
                this.t = zu4Var16;
                this.u = zu4Var10;
                this.v = zu4Var13;
                this.w = zu4Var8;
                this.x = zu4Var12;
                this.y = zu4Var4;
                zu4Var19 = zu4Var18;
                this.z = zu4Var19;
                zu4 zu4Var4722 = zu4Var16;
                this.A = zu4Var17;
                this.B = do7Var4;
                this.C = null;
                this.D = list7;
                this.E = mj7Var8;
                mj7 mj7Var4422 = mj7Var6;
                this.F = mj7Var4422;
                this.G = ho7Var5;
                this.H = ho7Var6;
                ho7 ho7Var3922 = ho7Var6;
                this.I = mj7Var7;
                this.J = av4Var6;
                this.U = i5;
                this.V = i4;
                this.W = i6;
                this.X = 5;
                tj7Var22.getClass();
                P = tz9.P(new sj7(z922, list8, tj7Var22, i5222, intValue, z822, null), this);
                lu3Var5 = lu3Var4;
                if (P == lu3Var5) {
                }
                break;
            case 5:
                int i64 = this.W;
                int i65 = this.V;
                int i66 = this.U;
                ?? r7 = this.J;
                mj7 mj7Var58 = this.I;
                ho7 ho7Var57 = this.H;
                ho7 ho7Var58 = this.G;
                mj7 mj7Var59 = this.F;
                mj7 mj7Var60 = this.E;
                List list84 = this.D;
                do7 do7Var18 = this.B;
                zu4 zu4Var76 = this.A;
                zu4 zu4Var77 = this.z;
                zu4 zu4Var78 = this.y;
                zu4 zu4Var79 = this.x;
                zu4 zu4Var80 = this.w;
                zu4 zu4Var81 = this.v;
                zu4 zu4Var82 = this.u;
                zu4Var20 = this.t;
                y6a.M(obj);
                ho7Var8 = ho7Var57;
                zu4Var13 = zu4Var81;
                lu3Var6 = lu3Var14;
                i9 = i65;
                mj7Var10 = mj7Var60;
                zu4Var19 = zu4Var77;
                z4 = true;
                ku3Var2 = ku3Var11;
                av4Var7 = r7;
                do7Var5 = do7Var18;
                zu4Var8 = zu4Var80;
                zu4Var10 = zu4Var82;
                mj7Var11 = mj7Var58;
                zu4Var4 = zu4Var78;
                i8 = i64;
                nr6Var2 = nr6Var6;
                zu4Var21 = zu4Var76;
                mj7Var12 = mj7Var59;
                ho7Var9 = ho7Var58;
                list9 = list84;
                zu4Var12 = zu4Var79;
                i7 = i66;
                list10 = (List) obj;
                if (av4Var7 == null) {
                }
                break;
            case 6:
                int i67 = this.W;
                int i68 = this.V;
                i12 = this.U;
                list10 = this.K;
                mj7 mj7Var61 = this.I;
                ho7 ho7Var59 = this.H;
                ho7 ho7Var60 = this.G;
                mj7 mj7Var62 = this.F;
                mj7 mj7Var63 = this.E;
                List list85 = this.D;
                do7 do7Var19 = this.B;
                zu4Var24 = this.A;
                zu4Var26 = this.z;
                zu4Var23 = this.y;
                zu4Var25 = this.x;
                zu4 zu4Var83 = this.w;
                zu4 zu4Var84 = this.v;
                zu4 zu4Var85 = this.u;
                zu4Var20 = this.t;
                y6a.M(obj);
                mj7Var11 = mj7Var61;
                zu4Var10 = zu4Var85;
                do7Var6 = do7Var19;
                zu4Var8 = zu4Var83;
                ku3Var3 = ku3Var11;
                i9 = i68;
                i11 = i67;
                z4 = true;
                T5 = obj;
                nr6Var2 = nr6Var6;
                list12 = list85;
                mj7Var15 = mj7Var63;
                mj7Var14 = mj7Var62;
                ho7Var9 = ho7Var60;
                ho7Var11 = ho7Var59;
                zu4Var13 = zu4Var84;
                list17 = (List) T5;
                if (list17 != null) {
                }
                break;
            case 7:
                int i69 = this.W;
                int i70 = this.V;
                int i71 = this.U;
                nr6 nr6Var9 = (nr6) this.M;
                sd7 sd7Var18 = this.L;
                List list86 = this.K;
                mj7 mj7Var64 = this.I;
                ho7Var14 = this.H;
                ho7Var12 = this.G;
                mj7 mj7Var65 = this.F;
                mj7 mj7Var66 = this.E;
                List list87 = this.D;
                do7 do7Var20 = this.B;
                zu4 zu4Var86 = this.A;
                zu4 zu4Var87 = this.z;
                zu4 zu4Var88 = this.y;
                zu4 zu4Var89 = this.x;
                zu4 zu4Var90 = this.w;
                zu4 zu4Var91 = this.v;
                zu4 zu4Var92 = this.t;
                y6a.M(obj);
                ku3Var4 = ku3Var11;
                mj7Var19 = mj7Var66;
                mj7Var16 = mj7Var65;
                zu4Var12 = zu4Var89;
                nr6Var3 = nr6Var6;
                zu4Var27 = zu4Var90;
                mj7Var20 = mj7Var64;
                zu4Var28 = zu4Var86;
                i15 = i70;
                lu3Var8 = lu3Var14;
                i16 = i71;
                list16 = list87;
                zu4Var31 = zu4Var87;
                z4 = true;
                zu4Var30 = zu4Var92;
                nr6Var4 = nr6Var9;
                sd7Var = sd7Var18;
                do7Var8 = do7Var20;
                zu4Var4 = zu4Var88;
                list14 = list86;
                i14 = i69;
                zu4Var32 = zu4Var91;
                Pair l22 = nr6Var4.l((FantasyTopPlayersResponse) obj);
                List list682 = (List) l22.a;
                List list692 = (List) l22.b;
                this.Y = ku3Var4;
                ku3Var5 = ku3Var4;
                this.r = null;
                this.s = null;
                this.t = zu4Var30;
                this.u = null;
                this.v = null;
                this.w = zu4Var27;
                this.x = zu4Var12;
                this.y = zu4Var4;
                this.z = zu4Var31;
                this.A = zu4Var28;
                this.B = do7Var8;
                this.C = null;
                this.D = list16;
                this.E = mj7Var19;
                this.F = mj7Var16;
                this.G = ho7Var12;
                this.H = ho7Var14;
                mj7 mj7Var492 = mj7Var19;
                mj7 mj7Var502 = mj7Var20;
                this.I = mj7Var502;
                this.J = null;
                List list702 = list14;
                this.K = list702;
                this.L = sd7Var;
                this.M = list682;
                this.N = list692;
                this.U = i16;
                this.V = i15;
                this.W = i14;
                this.X = 8;
                T7 = zu4Var32.T(this);
                List list712 = list16;
                lu3Var9 = lu3Var8;
                if (T7 != lu3Var9) {
                }
                break;
            case 8:
                int i72 = this.W;
                int i73 = this.V;
                int i74 = this.U;
                List list88 = this.N;
                List list89 = (List) this.M;
                sd7 sd7Var19 = this.L;
                List list90 = this.K;
                mj7 mj7Var67 = this.I;
                ho7Var14 = this.H;
                ho7Var12 = this.G;
                mj7 mj7Var68 = this.F;
                mj7Var23 = this.E;
                List list91 = this.D;
                do7 do7Var21 = this.B;
                zu4 zu4Var93 = this.A;
                zu4 zu4Var94 = this.z;
                zu4 zu4Var95 = this.y;
                zu4 zu4Var96 = this.x;
                zu4 zu4Var97 = this.w;
                zu4 zu4Var98 = this.t;
                y6a.M(obj);
                mj7Var22 = mj7Var68;
                zu4Var12 = zu4Var96;
                nr6Var3 = nr6Var6;
                ku3Var5 = ku3Var11;
                lu3Var10 = lu3Var14;
                i16 = i74;
                sd7Var2 = sd7Var19;
                zu4Var4 = zu4Var95;
                z4 = true;
                zu4Var30 = zu4Var98;
                list20 = list90;
                mj7Var21 = mj7Var67;
                zu4Var28 = zu4Var93;
                list19 = list88;
                zu4Var31 = zu4Var94;
                list18 = list89;
                do7Var8 = do7Var21;
                i15 = i73;
                list21 = list91;
                i14 = i72;
                zu4Var33 = zu4Var97;
                List list722 = (List) obj;
                if (zu4Var33 == null) {
                }
                break;
            case 9:
                int i75 = this.W;
                int i76 = this.V;
                int i77 = this.U;
                List list92 = this.O;
                List list93 = this.N;
                List list94 = (List) this.M;
                sd7 sd7Var20 = this.L;
                List list95 = this.K;
                mj7 mj7Var69 = this.I;
                ho7 ho7Var61 = this.H;
                ho7 ho7Var62 = this.G;
                mj7Var25 = this.F;
                mj7 mj7Var70 = this.E;
                list27 = this.D;
                do7 do7Var22 = this.B;
                zu4 zu4Var99 = this.A;
                zu4 zu4Var100 = this.z;
                zu4 zu4Var101 = this.y;
                zu4 zu4Var102 = this.x;
                zu4 zu4Var103 = this.t;
                y6a.M(obj);
                list28 = list94;
                zu4Var4 = zu4Var101;
                nr6Var3 = nr6Var6;
                ku3Var5 = ku3Var11;
                i19 = i76;
                sd7Var4 = sd7Var20;
                list22 = list95;
                mj7Var21 = mj7Var69;
                ho7Var14 = ho7Var61;
                ho7Var12 = ho7Var62;
                zu4Var28 = zu4Var99;
                z4 = true;
                list25 = list92;
                list26 = list93;
                do7Var8 = do7Var22;
                zu4Var31 = zu4Var100;
                i18 = i77;
                zu4Var30 = zu4Var103;
                mj7Var24 = mj7Var70;
                i14 = i75;
                zu4Var34 = zu4Var102;
                lu3Var10 = lu3Var14;
                fantasyTeamOfTheRoundResponse = (FantasyTeamOfTheRoundResponse) obj;
                if (fantasyTeamOfTheRoundResponse != null) {
                }
                break;
            case 10:
                int i78 = this.W;
                i27 = this.V;
                int i79 = this.U;
                fo1 fo1Var5 = this.T;
                gv9 gv9Var4 = (gv9) this.S;
                FantasyTeamOfTheRoundResponse fantasyTeamOfTheRoundResponse4 = (FantasyTeamOfTheRoundResponse) this.Q;
                nr6 nr6Var10 = (nr6) this.P;
                List list96 = this.O;
                List list97 = this.N;
                List list98 = (List) this.M;
                sd7 sd7Var21 = this.L;
                List list99 = this.K;
                i28 = i78;
                mj7Var28 = this.I;
                ho7Var22 = this.H;
                ho7Var20 = this.G;
                mj7 mj7Var71 = this.F;
                do7 do7Var23 = this.B;
                zu4 zu4Var104 = this.A;
                zu4 zu4Var105 = this.z;
                zu4 zu4Var106 = this.y;
                zu4 zu4Var107 = this.t;
                y6a.M(obj);
                fo1Var2 = fo1Var5;
                zu4Var31 = zu4Var105;
                gv9Var = gv9Var4;
                do7Var8 = do7Var23;
                sd7Var6 = sd7Var21;
                mj7Var25 = mj7Var71;
                list38 = list96;
                zu4Var28 = zu4Var104;
                nr6Var3 = nr6Var6;
                list34 = list99;
                list37 = list98;
                z4 = true;
                list26 = list97;
                fantasyTeamOfTheRoundResponse2 = fantasyTeamOfTheRoundResponse4;
                zu4Var4 = zu4Var106;
                nr6Var5 = nr6Var10;
                i29 = i79;
                zu4Var30 = zu4Var107;
                lu3Var = lu3Var14;
                ku3Var6 = ku3Var11;
                T8 = obj;
                list47 = (List) T8;
                if (list47 != null) {
                }
                List list822 = list37;
                i19 = i27;
                i26 = i28;
                list36 = list822;
                ho7 ho7Var532 = ho7Var22;
                list33 = list38;
                ho7Var21 = ho7Var532;
                i25 = i29;
                mj7Var21 = mj7Var28;
                i30 = i25;
                list35 = list36;
                mj7Var27 = mj7Var25;
                list31 = list26;
                ho7Var19 = ho7Var21;
                fantasyTeamOfTheRoundResponse3 = fantasyTeamOfTheRoundResponse2;
                zu4Var36 = zu4Var28;
                gv9Var2 = null;
                gv9 gv9Var3222 = gv9Var;
                nr6 nr6Var8222 = nr6Var5;
                fo1 fo1Var4222 = fo1Var2;
                int score222 = fantasyTeamOfTheRoundResponse3.getScore();
                int i53222 = i26;
                List<FantasyRoundPlayer> players222 = fantasyTeamOfTheRoundResponse3.getPlayers();
                zu4 zu4Var54222 = zu4Var30;
                zu4 zu4Var55222 = zu4Var31;
                ArrayList arrayList5222 = new ArrayList(k13.r(players222, 10));
                while (it4.hasNext()) {
                }
                nl7 nl7Var8222 = new nl7(gv9Var3222, new ol7(fo1Var4222, score222, l6g.W(arrayList5222), new pl7(fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getScore(), fantasyTeamOfTheRoundResponse3.getMaxScoreTeam().getNameCode()), new pl7(fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getScore(), fantasyTeamOfTheRoundResponse3.getMinScoreTeam().getNameCode())), gv9Var2, false);
                i24 = i30;
                z5 = false;
                zu4Var28 = zu4Var36;
                ho7Var12 = ho7Var20;
                do7Var8 = do7Var8;
                i23 = i53222;
                zu4Var31 = zu4Var55222;
                nl7Var2 = nl7Var8222;
                zu4Var30 = zu4Var54222;
                mj7 mj7Var532222 = mj7Var27;
                i20 = i23;
                mj7Var26 = mj7Var21;
                list29 = list34;
                mj7Var22 = mj7Var532222;
                ho7 ho7Var492222 = ho7Var19;
                nl7Var = nl7Var2;
                ho7Var17 = ho7Var492222;
                lu3Var11 = lu3Var;
                zu4Var35 = zu4Var4;
                list30 = list33;
                sd7Var5 = sd7Var6;
                i21 = i24;
                ho7Var18 = ho7Var12;
                list32 = list35;
                i22 = i19;
                if (zu4Var35 != null) {
                }
                break;
            case 11:
                int i80 = this.W;
                i35 = this.V;
                i34 = this.U;
                nl7Var4 = (nl7) this.P;
                list44 = this.O;
                list45 = this.N;
                list46 = (List) this.M;
                sd7Var7 = this.L;
                list40 = this.K;
                mj7Var29 = this.I;
                ho7Var26 = this.H;
                ho7Var25 = this.G;
                i20 = i80;
                mj7 mj7Var72 = this.F;
                do7Var10 = this.B;
                zu4Var41 = this.A;
                zu4Var40 = this.z;
                zu4Var42 = this.t;
                y6a.M(obj);
                ku3Var8 = ku3Var11;
                nr6Var3 = nr6Var6;
                mj7Var22 = mj7Var72;
                z4 = true;
                z5 = false;
                T9 = obj;
                lu3Var11 = lu3Var14;
                i31 = i34;
                list42 = list46;
                i33 = i20;
                ku3Var7 = ku3Var8;
                zu4Var39 = zu4Var42;
                list41 = list44;
                zu4Var37 = zu4Var40;
                nl7Var3 = nl7Var4;
                list39 = list45;
                do7Var9 = do7Var10;
                i32 = i35;
                mj7Var26 = mj7Var29;
                list43 = (List) T9;
                ho7Var24 = ho7Var25;
                ho7Var23 = ho7Var26;
                zu4Var38 = zu4Var41;
                this.Y = ku3Var7;
                ku3Var9 = ku3Var7;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = null;
                this.z = zu4Var37;
                this.A = zu4Var38;
                this.B = do7Var9;
                this.C = null;
                this.D = null;
                this.E = null;
                this.F = mj7Var22;
                this.G = ho7Var24;
                this.H = ho7Var23;
                this.I = mj7Var26;
                this.J = null;
                this.K = list40;
                this.L = sd7Var7;
                this.M = list42;
                this.N = list39;
                this.O = list41;
                this.P = nl7Var3;
                this.Q = list43;
                this.R = null;
                this.S = null;
                this.T = null;
                int i5522 = i31;
                this.U = i5522;
                ho7 ho7Var5122 = ho7Var24;
                this.V = i32;
                this.W = i33;
                this.X = 12;
                T10 = zu4Var39.T(this);
                List list7622 = list42;
                lu3Var12 = lu3Var11;
                if (T10 == lu3Var12) {
                }
                break;
            case 12:
                int i81 = this.W;
                int i82 = this.V;
                int i83 = this.U;
                List list100 = (List) this.Q;
                nl7 nl7Var10 = (nl7) this.P;
                List list101 = this.O;
                List list102 = this.N;
                List list103 = (List) this.M;
                sd7 sd7Var22 = this.L;
                List list104 = this.K;
                mj7 mj7Var73 = this.I;
                ho7Var23 = this.H;
                ho7 ho7Var63 = this.G;
                mj7 mj7Var74 = this.F;
                do7 do7Var24 = this.B;
                zu4 zu4Var108 = this.A;
                zu4 zu4Var109 = this.z;
                y6a.M(obj);
                ku3Var9 = ku3Var11;
                lu3Var13 = lu3Var14;
                list48 = list103;
                sd7Var8 = sd7Var22;
                nr6Var3 = nr6Var6;
                mj7Var22 = mj7Var74;
                z4 = true;
                z5 = false;
                i32 = i82;
                list49 = list101;
                list51 = list102;
                ho7Var27 = ho7Var63;
                do7Var9 = do7Var24;
                nl7Var5 = nl7Var10;
                i33 = i81;
                zu4Var43 = zu4Var109;
                i36 = i83;
                list50 = list104;
                mj7Var30 = mj7Var73;
                zu4Var38 = zu4Var108;
                list43 = list100;
                list52 = (List) obj;
                if (zu4Var43 == null) {
                }
                break;
            case 13:
                int i84 = this.W;
                i40 = this.V;
                i41 = this.U;
                list52 = this.R;
                list58 = (List) this.Q;
                nl7Var6 = (nl7) this.P;
                list59 = this.O;
                list60 = this.N;
                list61 = (List) this.M;
                sd7Var10 = this.L;
                list54 = this.K;
                mj7 mj7Var75 = this.I;
                i37 = i84;
                ho7 ho7Var64 = this.H;
                ho7Var28 = this.G;
                mj7 mj7Var76 = this.F;
                do7Var12 = this.B;
                zu4Var45 = this.A;
                y6a.M(obj);
                mj7Var31 = mj7Var75;
                ho7Var23 = ho7Var64;
                ku3Var9 = ku3Var11;
                nr6Var3 = nr6Var6;
                mj7Var22 = mj7Var76;
                z4 = true;
                z5 = false;
                T11 = obj;
                mj7 mj7Var542 = mj7Var31;
                i38 = i40;
                ho7Var27 = ho7Var28;
                i39 = i41;
                mj7Var30 = mj7Var542;
                lu3Var13 = lu3Var14;
                zu4Var44 = zu4Var45;
                list53 = list60;
                do7Var11 = do7Var12;
                list56 = (List) T11;
                list48 = list61;
                list55 = list59;
                nl7Var5 = nl7Var6;
                list57 = list52;
                sd7Var9 = sd7Var10;
                list43 = list58;
                ku3 ku3Var1222 = ku3Var9;
                this.Y = ku3Var1222;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = null;
                this.z = null;
                this.A = null;
                this.B = do7Var11;
                this.C = null;
                this.D = null;
                this.E = null;
                this.F = mj7Var22;
                this.G = ho7Var27;
                this.H = ho7Var23;
                this.I = mj7Var30;
                this.J = null;
                this.K = list54;
                this.L = sd7Var9;
                this.M = list48;
                this.N = list53;
                this.O = list55;
                this.P = nl7Var5;
                this.Q = list43;
                this.R = list57;
                this.S = list56;
                i42 = i39;
                this.U = i42;
                List list7822 = list48;
                this.V = i38;
                this.W = i37;
                this.X = 14;
                T12 = zu4Var44.T(this);
                List list7922 = list53;
                lu3Var14 = lu3Var13;
                if (T12 == lu3Var14) {
                }
                break;
            case 14:
                int i85 = this.W;
                int i86 = this.V;
                int i87 = this.U;
                List list105 = this.S;
                List list106 = this.R;
                list64 = (List) this.Q;
                nl7Var5 = (nl7) this.P;
                list55 = this.O;
                List list107 = this.N;
                List list108 = (List) this.M;
                sd7 sd7Var23 = this.L;
                list65 = this.K;
                i37 = i85;
                mj7 mj7Var77 = this.I;
                ho7 ho7Var65 = this.H;
                ho7 ho7Var66 = this.G;
                mj7 mj7Var78 = this.F;
                do7 do7Var25 = this.B;
                y6a.M(obj);
                ku3Var10 = ku3Var11;
                do7Var13 = do7Var25;
                list62 = list106;
                sd7Var11 = sd7Var23;
                nr6Var3 = nr6Var6;
                mj7Var32 = mj7Var77;
                ho7Var29 = ho7Var65;
                ho7Var30 = ho7Var66;
                mj7Var33 = mj7Var78;
                z4 = true;
                z5 = false;
                T12 = obj;
                i42 = i87;
                list63 = list105;
                list67 = list107;
                list66 = list108;
                i43 = i86;
                nl7 nl7Var92 = nl7Var5;
                List list802 = list55;
                int i592 = i37;
                List list812 = (List) T12;
                s9a.t(ku3Var10);
                hs4 hs4Var2 = z45.a;
                r69Var = rob.a;
                kr6Var = new kr6(nr6Var3, list66, list67, list802, list63, list812, list65, list64, nl7Var92, list62, ho7Var30, ho7Var29, i592 == 0 ? z4 : z5, do7Var13, mj7Var32, mj7Var33, sd7Var11, null);
                this.Y = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = null;
                this.z = null;
                this.A = null;
                this.B = null;
                this.C = null;
                this.D = null;
                this.E = null;
                this.F = null;
                this.G = null;
                this.H = null;
                this.I = null;
                this.J = null;
                this.K = null;
                this.L = null;
                this.M = null;
                this.N = null;
                this.O = null;
                this.P = null;
                this.Q = null;
                this.R = null;
                this.S = null;
                this.T = null;
                this.U = i42;
                this.V = i43;
                this.W = i592;
                this.X = 15;
                if (xw3.R(r69Var, kr6Var, this) == lu3Var14) {
                }
                return Unit.a;
            case 15:
                y6a.M(obj);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
