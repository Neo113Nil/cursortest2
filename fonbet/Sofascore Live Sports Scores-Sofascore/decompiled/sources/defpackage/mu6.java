package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetitionResponse;
import com.sofascore.model.fantasy.FantasyUserRoundSquadResponse;
import com.sofascore.model.fantasy.FantasyUserSquad;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mu6 extends hoi implements Function2 {
    public zu4 A;
    public zu4 B;
    public do7 C;
    public FantasyUserSquad D;
    public Object E;
    public List F;
    public zu4 G;
    public ho7 H;
    public gv9 I;
    public u77 J;
    public List K;
    public gv9 L;
    public gv9 M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public /* synthetic */ Object X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ pu6 Z;
    public final /* synthetic */ boolean a0;
    public yda r;
    public av4 s;
    public List t;
    public ArrayList u;
    public gv9 v;
    public List w;
    public ho7 x;
    public zu4 y;
    public av4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu6(boolean z, pu6 pu6Var, boolean z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.Y = z;
        this.Z = pu6Var;
        this.a0 = z2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        mu6 mu6Var = new mu6(this.Y, this.Z, this.a0, rq3Var);
        mu6Var.X = obj;
        return mu6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mu6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x0531, code lost:
    
        if (r5.w(r51) == r10) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0411, code lost:
    
        if (r3.w(r51) == r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x031c, code lost:
    
        if (r3.w(r51) == r11) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0bb7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0b47  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0745  */
    /* JADX WARN: Type inference failed for: r10v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v106, types: [zu4] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [km5] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v56, types: [zu4] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v81, types: [zu4] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r43v0 */
    /* JADX WARN: Type inference failed for: r43v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.coroutines.CoroutineContext, rq3] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v17, types: [av4, do7, gv9, ho7, java.lang.Object, java.util.ArrayList, java.util.List, yda, zu4] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3, types: [av4, java.lang.Object, java.util.List, yda] */
    /* JADX WARN: Type inference failed for: r6v52, types: [av4, com.sofascore.model.fantasy.FantasyUserSquad, do7, gv9, ho7, java.lang.Object, java.util.ArrayList, java.util.List, rq3, u77, yda, zu4] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [zu4] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v33, types: [av4, java.lang.Object, java.util.ArrayList, java.util.List, zu4] */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r6;
        int i;
        g9i g9iVar;
        Object T;
        yda ydaVar;
        av4 av4Var;
        ?? r62;
        List list;
        ArrayList arrayList;
        Object T2;
        yda ydaVar2;
        Iterator it;
        Object obj2;
        ArrayList W;
        ho7 ho7Var;
        int i2;
        boolean z;
        av4 av4Var2;
        av4 av4Var3;
        int i3;
        pu6 pu6Var;
        ?? r63;
        av4 p;
        Object T3;
        lu3 lu3Var;
        ho7 ho7Var2;
        zu4 zu4Var;
        yda ydaVar3;
        gv9 gv9Var;
        ho7 ho7Var3;
        FantasyUserCompetitionResponse fantasyUserCompetitionResponse;
        lu3 lu3Var2;
        FantasyUserCompetition userCompetition;
        do7 O;
        Object T4;
        zu4 zu4Var2;
        zu4 zu4Var3;
        zu4 zu4Var4;
        yda ydaVar4;
        ho7 ho7Var4;
        FantasyUserSquad squad;
        boolean z2;
        lu3 lu3Var3;
        int i4;
        ?? r1;
        List list2;
        int i5;
        Iterator it2;
        int i6;
        int i7;
        int i8;
        Object P;
        boolean z3;
        zu4 zu4Var5;
        List list3;
        int i9;
        ho7 ho7Var5;
        int i10;
        List<FantasyRoundPlayer> players;
        List<FantasyRoundPlayerUiModel> list4;
        int i11;
        zu4 zu4Var6;
        Pair R;
        boolean z4;
        Iterator it3;
        int i12;
        Iterator it4;
        gv9 W2;
        pu6 pu6Var2;
        gv9 gv9Var2;
        u77 u77Var;
        int i13;
        SharedPreferences sharedPreferences;
        int i14;
        Iterator it5;
        int i15;
        int i16;
        boolean z5;
        int i17;
        int i18;
        zu4 zu4Var7;
        boolean z6;
        gv9 gv9Var3;
        int i19;
        boolean z7;
        int i20;
        boolean z8;
        List list5;
        ho7 ho7Var6;
        ho7 ho7Var7;
        do7 do7Var;
        lu3 lu3Var4;
        u77 u77Var2;
        zu4 zu4Var8;
        int i21;
        av4 av4Var4;
        int i22;
        boolean z9;
        List list6;
        ?? r9;
        av4 av4Var5;
        gv9 gv9Var4;
        List list7;
        Object T5;
        do7 do7Var2;
        lu3 lu3Var5;
        ho7 ho7Var8;
        zu4 zu4Var9;
        zu4 zu4Var10;
        ho7 ho7Var9;
        boolean z10;
        int i23;
        boolean z11;
        int i24;
        int i25;
        SharedPreferences d;
        ho7 a;
        Object T6;
        lu3 lu3Var6;
        lu3 lu3Var7;
        u77 u77Var3;
        List list8;
        int i26;
        int i27;
        int i28;
        FantasyUserSquad fantasyUserSquad;
        gv9 gv9Var5;
        av4 av4Var6;
        zu4 zu4Var11;
        yda ydaVar5;
        boolean z12;
        gv9 gv9Var6;
        u77 u77Var4;
        av4 av4Var7;
        int i29;
        int i30;
        yda ydaVar6;
        List list9;
        int i31;
        gv9 gv9Var7;
        gv9 gv9Var8;
        Object T7;
        lu3 lu3Var8;
        gv9 gv9Var9;
        int i32;
        ho7 ho7Var10;
        boolean z13;
        u77 u77Var5;
        boolean z14;
        gv9 gv9Var10;
        int i33;
        List list10;
        int i34;
        List list11;
        Object T8;
        lu3 lu3Var9;
        u77 u77Var6;
        List list12;
        FantasyUserSquad fantasyUserSquad2;
        do7 do7Var3;
        ho7 ho7Var11;
        gv9 gv9Var11;
        List list13;
        gv9 gv9Var12;
        gv9 gv9Var13;
        ho7 ho7Var12;
        int i35;
        boolean z15;
        int i36;
        int i37;
        boolean z16;
        boolean z17;
        gv9 gv9Var14;
        int i38;
        int i39;
        boolean z18;
        r69 r69Var;
        lu6 lu6Var;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        int i40;
        int i41;
        int i42;
        ho7 ho7Var13;
        yda ydaVar7;
        Object obj3;
        r69 r69Var2;
        lu3 lu3Var10;
        l84 l84Var;
        boolean z23 = this.a0;
        boolean z24 = this.Y;
        pu6 pu6Var3 = this.Z;
        ku3 ku3Var = (ku3) this.X;
        lu3 lu3Var11 = lu3.a;
        int i43 = 5;
        switch (this.W) {
            case 0:
                y6a.M(obj);
                if (z24) {
                    r6 = 0;
                    i = 3;
                    g9iVar = xw3.L(ku3Var, null, null, new u41(), 3);
                } else {
                    r6 = 0;
                    i = 3;
                    g9iVar = null;
                }
                av4 t = xw3.t(ku3Var, r6, new ku6(pu6Var3, r6, 2), i);
                av4 t2 = xw3.t(ku3Var, r6, new ku6(pu6Var3, r6, i43), i);
                this.X = ku3Var;
                this.r = g9iVar;
                this.s = t;
                this.W = 1;
                T = t2.T(this);
                if (T != lu3Var11) {
                    ydaVar = g9iVar;
                    av4Var = t;
                    r62 = r6;
                    list = (List) T;
                    if (list != null) {
                        this.X = r62;
                        this.r = r62;
                        this.s = r62;
                        this.t = r62;
                        this.N = 0;
                        this.W = 2;
                        break;
                    } else {
                        arrayList = new ArrayList(k13.r(list, 10));
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            arrayList.add(o02.K(((ho7) it6.next()).a.a));
                        }
                        this.X = ku3Var;
                        this.r = ydaVar;
                        this.s = null;
                        this.t = list;
                        this.u = arrayList;
                        this.W = 3;
                        T2 = av4Var.T(this);
                        if (T2 != lu3Var11) {
                            ydaVar2 = ydaVar;
                            gv9 gv9Var15 = (gv9) T2;
                            it = gv9Var15.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = null;
                                } else {
                                    obj2 = it.next();
                                    mj7 mj7Var = (mj7) obj2;
                                    if (!z23 || mj7Var.h() || arrayList.contains(o02.K(mj7Var.a))) {
                                    }
                                }
                            }
                            mj7 mj7Var2 = (mj7) obj2;
                            W = CollectionsKt.W(CollectionsKt.x0(list, mj7Var2 == null ? new ho7(mj7Var2, (Integer) null, 0, 0, false, false, false, 254) : null));
                            ho7Var = pu6Var3.l().c;
                            int i44 = 4;
                            if (ho7Var == null) {
                                Iterator it7 = W.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        ho7Var3 = it7.next();
                                        ho7 ho7Var14 = (ho7) ho7Var3;
                                        mj7 mj7Var3 = pu6Var3.m().m;
                                        if (!arrayList.contains(o02.K(mj7Var3.a))) {
                                            mj7Var3 = null;
                                        }
                                        if (mj7Var3 == null || ho7Var14.a.a != mj7Var3.a) {
                                        }
                                    } else {
                                        ho7Var3 = 0;
                                    }
                                }
                                ho7Var = ho7Var3;
                                if (ho7Var == null && (ho7Var = (ho7) CollectionsKt.j0(W)) == null) {
                                    this.X = null;
                                    this.r = null;
                                    this.s = null;
                                    this.t = null;
                                    this.u = null;
                                    this.v = null;
                                    this.w = null;
                                    this.x = null;
                                    this.N = 0;
                                    this.W = 4;
                                    break;
                                }
                            }
                            i2 = pu6Var3.m().h.a != ho7Var.a.a ? 1 : 0;
                            rq3 rq3Var = null;
                            av4 t3 = xw3.t(ku3Var, null, new ku6(pu6Var3, rq3Var, i44), 3);
                            av4 t4 = xw3.t(ku3Var, null, new ku6(pu6Var3, rq3Var, 3), 3);
                            z = z24;
                            av4 t5 = xw3.t(ku3Var, null, new hs6(pu6Var3, ho7Var, rq3Var, i44), 3);
                            av4 p2 = yaa.p(ku3Var, z23, new ku6(pu6Var3, rq3Var, 1));
                            ho7 ho7Var15 = ho7Var;
                            av4Var2 = t4;
                            av4Var3 = t5;
                            i3 = 1;
                            pu6Var = pu6Var3;
                            r63 = 0;
                            p = yaa.p(ku3Var, z23, new rh4(pu6Var3, ho7Var15, av4Var3, rq3Var, 23));
                            this.X = ku3Var;
                            this.r = ydaVar2;
                            this.s = null;
                            this.t = null;
                            this.u = null;
                            this.v = gv9Var15;
                            this.w = W;
                            this.x = ho7Var15;
                            this.y = av4Var2;
                            this.z = av4Var3;
                            this.A = p2;
                            this.B = p;
                            this.N = i2;
                            this.W = 5;
                            T3 = t3.T(this);
                            lu3Var = lu3Var11;
                            if (T3 != lu3Var) {
                                ho7Var2 = ho7Var15;
                                zu4Var = p2;
                                ydaVar3 = ydaVar2;
                                gv9Var = gv9Var15;
                                fantasyUserCompetitionResponse = (FantasyUserCompetitionResponse) T3;
                                if (fantasyUserCompetitionResponse != null || (userCompetition = fantasyUserCompetitionResponse.getUserCompetition()) == null) {
                                    lu3Var2 = lu3Var;
                                    this.X = r63;
                                    this.r = r63;
                                    this.s = r63;
                                    this.t = r63;
                                    this.u = r63;
                                    this.v = r63;
                                    this.w = r63;
                                    this.x = r63;
                                    this.y = r63;
                                    this.z = r63;
                                    this.A = r63;
                                    this.B = r63;
                                    this.C = r63;
                                    this.N = i2;
                                    this.O = 0;
                                    this.W = 6;
                                    if (pu6Var.w(this) == lu3Var2) {
                                        return lu3Var2;
                                    }
                                    return Unit.a;
                                }
                                O = fkf.O(userCompetition, pu6Var.i());
                                this.X = ku3Var;
                                this.r = ydaVar3;
                                this.s = null;
                                this.t = null;
                                this.u = null;
                                this.v = gv9Var;
                                this.w = W;
                                this.x = ho7Var2;
                                this.y = av4Var2;
                                this.z = null;
                                this.A = zu4Var;
                                this.B = p;
                                this.C = O;
                                this.N = i2;
                                this.W = 7;
                                T4 = av4Var3.T(this);
                                if (T4 != lu3Var) {
                                    zu4Var2 = zu4Var;
                                    zu4Var3 = p;
                                    zu4Var4 = av4Var2;
                                    ydaVar4 = ydaVar3;
                                    ho7Var4 = ho7Var2;
                                    FantasyUserRoundSquadResponse fantasyUserRoundSquadResponse = (FantasyUserRoundSquadResponse) T4;
                                    squad = fantasyUserRoundSquadResponse == null ? fantasyUserRoundSquadResponse.getSquad() : null;
                                    if (!z23) {
                                        List<FantasyRoundPlayer> players2 = squad != null ? squad.getPlayers() : null;
                                        if (players2 == null || players2.isEmpty()) {
                                            this.X = null;
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
                                            this.N = i2;
                                            this.O = 0;
                                            this.W = 8;
                                            break;
                                        }
                                    }
                                    if (squad != null || (players = squad.getPlayers()) == null) {
                                        z2 = z23;
                                        lu3Var3 = lu3Var;
                                        i4 = i2;
                                        r1 = 0;
                                    } else {
                                        z2 = z23;
                                        lu3Var3 = lu3Var;
                                        i4 = i2;
                                        r1 = new ArrayList(k13.r(players, 10));
                                        Iterator it8 = players.iterator();
                                        while (it8.hasNext()) {
                                            r1.add(hkg.g0((FantasyRoundPlayer) it8.next(), pu6Var.i()));
                                        }
                                    }
                                    if (r1 == 0) {
                                        r1 = b.g();
                                    }
                                    list2 = r1;
                                    long longValue = ((Number) n9e.x(pu6Var.i(), new q13(O.c.c, 24))).longValue();
                                    mj7 mj7Var4 = ho7Var4.a;
                                    Long l = mj7Var4.h;
                                    i5 = longValue < (l == null ? l.longValue() : 0L) ? i3 : 0;
                                    int i45 = (z2 || (mj7Var4.i() && i5 != 0)) ? i3 : 0;
                                    if (list2 != null || !list2.isEmpty()) {
                                        it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            Iterator it9 = it2;
                                            if (((FantasyRoundPlayerUiModel) it2.next()).w) {
                                                i6 = i3;
                                                if (i6 != 0) {
                                                    i7 = i6;
                                                    pu6Var.q = o02.K(mj7Var4.a);
                                                    i8 = i45;
                                                } else {
                                                    i7 = i6;
                                                    Integer num = pu6Var.q;
                                                    int i46 = mj7Var4.a;
                                                    i8 = i45;
                                                    if (num != null && num.intValue() == i46) {
                                                        pu6Var.q = null;
                                                    }
                                                }
                                                tj7 tj7Var = pu6Var.h;
                                                boolean z25 = ho7Var4.g;
                                                boolean z26 = !mj7Var4.o;
                                                int i47 = mj7Var4.a;
                                                Integer num2 = pu6Var.m().c.B;
                                                int intValue = num2 != null ? num2.intValue() : 0;
                                                this.X = ku3Var;
                                                this.r = ydaVar4;
                                                this.s = null;
                                                this.t = null;
                                                this.u = null;
                                                this.v = gv9Var;
                                                this.w = W;
                                                this.x = ho7Var4;
                                                this.y = zu4Var4;
                                                this.z = null;
                                                this.A = zu4Var2;
                                                this.B = zu4Var3;
                                                this.C = O;
                                                this.D = squad;
                                                this.E = list2;
                                                this.N = i4;
                                                this.O = i5;
                                                this.P = i8;
                                                this.S = i7;
                                                this.W = 9;
                                                tj7Var.getClass();
                                                P = tz9.P(new sj7(z26, list2, tj7Var, i47, intValue, z25, null), this);
                                                lu3Var11 = lu3Var3;
                                                if (P != lu3Var11) {
                                                    z3 = i7;
                                                    zu4Var5 = zu4Var3;
                                                    list3 = list2;
                                                    i9 = i8;
                                                    ho7Var5 = ho7Var4;
                                                    i10 = i4;
                                                    list4 = (List) P;
                                                    i11 = i9;
                                                    int i48 = i5;
                                                    lu3 lu3Var12 = lu3Var11;
                                                    zu4Var6 = zu4Var5;
                                                    ho7 ho7Var16 = ho7Var5;
                                                    av4 t6 = xw3.t(ku3Var, null, new db4(this.a0, i9 == 0 ? i3 : 0, list3, ho7Var5, this.Z, list4, null), 3);
                                                    if (list4.isEmpty()) {
                                                        R = pu6Var.k(list4, W, ho7Var16);
                                                    } else {
                                                        Boolean bool = Boolean.FALSE;
                                                        R = tz9.R(bool, bool);
                                                    }
                                                    boolean booleanValue = ((Boolean) R.a).booleanValue();
                                                    boolean booleanValue2 = ((Boolean) R.b).booleanValue();
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (Object obj4 : list4) {
                                                        boolean z27 = booleanValue2;
                                                        boolean z28 = booleanValue;
                                                        if (!((FantasyRoundPlayerUiModel) obj4).k) {
                                                            arrayList2.add(obj4);
                                                        }
                                                        booleanValue2 = z27;
                                                        booleanValue = z28;
                                                    }
                                                    z4 = booleanValue2;
                                                    boolean z29 = booleanValue;
                                                    it3 = arrayList2.iterator();
                                                    int i49 = 0;
                                                    while (it3.hasNext()) {
                                                        Integer num3 = ((FantasyRoundPlayerUiModel) it3.next()).n;
                                                        i49 += num3 != null ? num3.intValue() : 0;
                                                    }
                                                    int i50 = ho7Var16.d;
                                                    mj7 mj7Var5 = ho7Var16.a;
                                                    ho7 a2 = ho7.a(ho7Var16, o02.K(i49 - i50), 0, false, false, false, z3, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                                                    i12 = i10;
                                                    ArrayList arrayList3 = new ArrayList(k13.r(W, 10));
                                                    it4 = W.iterator();
                                                    while (it4.hasNext()) {
                                                        ho7 ho7Var17 = (ho7) it4.next();
                                                        int i51 = ho7Var17.a.a;
                                                        Iterator it10 = it4;
                                                        if (i51 == mj7Var5.a) {
                                                            a = a2;
                                                        } else {
                                                            Integer num4 = pu6Var.q;
                                                            a = (num4 != null && i51 == num4.intValue()) ? ho7.a(ho7Var17, null, 0, false, false, false, true, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) : ho7Var17;
                                                        }
                                                        arrayList3.add(a);
                                                        it4 = it10;
                                                    }
                                                    W2 = l6g.W(arrayList3);
                                                    if (i11 != 0 || list4.isEmpty() || mj7Var5.n) {
                                                        pu6Var2 = pu6Var;
                                                        gv9Var2 = W2;
                                                        u77Var = u77.a;
                                                    } else {
                                                        gv9Var2 = W2;
                                                        Long L = o02.L(a2.a.f);
                                                        pu6Var.getClass();
                                                        if (z4 || z29) {
                                                            pu6Var2 = pu6Var;
                                                            u77Var = u77.a;
                                                        } else {
                                                            long w = yaa.w();
                                                            long longValue2 = L.longValue();
                                                            wd5 wd5Var = xd5.b;
                                                            pu6Var2 = pu6Var;
                                                            u77Var = w > xd5.k(wkn.R(2, be5.HOURS), be5.SECONDS) + longValue2 ? u77.b : u77.c;
                                                        }
                                                    }
                                                    long w2 = mj7Var5.d - yaa.w();
                                                    wd5 wd5Var2 = xd5.b;
                                                    gv9 gv9Var16 = gv9Var2;
                                                    i13 = w2 >= xd5.k(wkn.R(60, be5.MINUTES), be5.SECONDS) ? i3 : 0;
                                                    Boolean bool2 = pu6Var2.l().l;
                                                    if (z) {
                                                        bool2 = null;
                                                    }
                                                    int i52 = ((bool2 == null ? bool2.booleanValue() : !mj7Var5.h() ? i3 : 0) != 0 || i13 == 0) ? 0 : i3;
                                                    int i53 = (ho7Var16.a.g() || ho7Var16.a.n) ? 0 : i3;
                                                    Context i54 = pu6Var2.i();
                                                    sharedPreferences = uic.j;
                                                    if (sharedPreferences == null) {
                                                        Context applicationContext = i54.getApplicationContext();
                                                        synchronized (uic.i) {
                                                            d = a5f.d(applicationContext);
                                                            uic.j = d;
                                                        }
                                                        d.getClass();
                                                        sharedPreferences = d;
                                                    }
                                                    i14 = i53;
                                                    boolean z30 = sharedPreferences.getBoolean("PREF_SUBSTITUTIONS_INFO_DISMISSED", false);
                                                    if (list4 != null || !list4.isEmpty()) {
                                                        it5 = list4.iterator();
                                                        while (it5.hasNext()) {
                                                            if (((FantasyRoundPlayerUiModel) it5.next()).v) {
                                                                i15 = i3;
                                                                if (list4 != null || !list4.isEmpty()) {
                                                                    for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel : list4) {
                                                                        i16 = i15;
                                                                        z5 = z30;
                                                                        if (!fantasyRoundPlayerUiModel.k || fantasyRoundPlayerUiModel.v) {
                                                                            z30 = z5;
                                                                            i15 = i16;
                                                                        } else {
                                                                            i17 = i3;
                                                                            ?? r12 = (i14 != 0 || z5 || i16 == 0 || i17 == 0) ? 0 : i3;
                                                                            if (zu4Var6 == null) {
                                                                                this.X = null;
                                                                                this.r = ydaVar4;
                                                                                this.s = null;
                                                                                this.t = null;
                                                                                this.u = null;
                                                                                this.v = gv9Var;
                                                                                this.w = null;
                                                                                this.x = ho7Var16;
                                                                                this.y = zu4Var4;
                                                                                this.z = null;
                                                                                this.A = zu4Var2;
                                                                                this.B = null;
                                                                                this.C = O;
                                                                                this.D = squad;
                                                                                this.E = null;
                                                                                this.F = list4;
                                                                                av4Var5 = t6;
                                                                                this.G = av4Var5;
                                                                                this.H = a2;
                                                                                gv9Var4 = gv9Var16;
                                                                                this.I = gv9Var4;
                                                                                this.J = u77Var;
                                                                                list7 = list4;
                                                                                this.N = i12;
                                                                                this.O = i48;
                                                                                this.P = i11;
                                                                                this.S = z3;
                                                                                this.T = z29;
                                                                                this.U = z4;
                                                                                this.Q = i13;
                                                                                this.R = i52;
                                                                                this.V = r12;
                                                                                this.W = 10;
                                                                                T5 = zu4Var6.T(this);
                                                                                do7Var2 = O;
                                                                                lu3Var5 = lu3Var12;
                                                                                if (T5 == lu3Var5) {
                                                                                    return lu3Var5;
                                                                                }
                                                                                ho7Var8 = a2;
                                                                                zu4Var9 = zu4Var2;
                                                                                zu4Var10 = zu4Var4;
                                                                                ho7Var9 = ho7Var16;
                                                                                z10 = z3;
                                                                                i23 = i11;
                                                                                z11 = z29;
                                                                                u77Var2 = u77Var;
                                                                                i24 = i52;
                                                                                i25 = i48;
                                                                                z12 = r12;
                                                                                i21 = i24;
                                                                                z7 = z10;
                                                                                i20 = i23;
                                                                                av4Var4 = av4Var5;
                                                                                ho7Var6 = ho7Var8;
                                                                                i22 = i25;
                                                                                z6 = z12;
                                                                                list5 = (List) T5;
                                                                                zu4Var7 = zu4Var9;
                                                                                i18 = i13;
                                                                                i19 = i12;
                                                                                lu3Var4 = lu3Var5;
                                                                                gv9Var3 = gv9Var4;
                                                                                ho7Var7 = ho7Var9;
                                                                                z8 = z11;
                                                                                do7Var = do7Var2;
                                                                                zu4Var8 = zu4Var10;
                                                                                r9 = 0;
                                                                                list6 = list7;
                                                                                z9 = z4;
                                                                                this.X = r9;
                                                                                this.r = ydaVar4;
                                                                                this.s = r9;
                                                                                this.t = r9;
                                                                                this.u = r9;
                                                                                this.v = gv9Var;
                                                                                this.w = r9;
                                                                                this.x = ho7Var7;
                                                                                this.y = r9;
                                                                                this.z = r9;
                                                                                this.A = zu4Var7;
                                                                                this.B = r9;
                                                                                this.C = do7Var;
                                                                                this.D = squad;
                                                                                this.E = r9;
                                                                                this.F = list6;
                                                                                this.G = av4Var4;
                                                                                this.H = ho7Var6;
                                                                                this.I = gv9Var3;
                                                                                this.J = u77Var2;
                                                                                this.K = list5;
                                                                                this.N = i19;
                                                                                this.O = i22;
                                                                                int i55 = i20;
                                                                                this.P = i55;
                                                                                zu4 zu4Var12 = zu4Var7;
                                                                                this.S = z7;
                                                                                this.T = z8;
                                                                                this.U = z9;
                                                                                this.Q = i18;
                                                                                this.R = i21;
                                                                                this.V = z6;
                                                                                this.W = 11;
                                                                                T6 = zu4Var8.T(this);
                                                                                av4 av4Var8 = av4Var4;
                                                                                lu3Var6 = lu3Var4;
                                                                                if (T6 == lu3Var6) {
                                                                                    return lu3Var6;
                                                                                }
                                                                                obj = T6;
                                                                                lu3Var7 = lu3Var6;
                                                                                u77Var3 = u77Var2;
                                                                                list8 = list5;
                                                                                i26 = i22;
                                                                                i27 = i19;
                                                                                i28 = i55;
                                                                                fantasyUserSquad = squad;
                                                                                gv9Var5 = gv9Var3;
                                                                                av4Var6 = av4Var8;
                                                                                zu4Var11 = zu4Var12;
                                                                                ydaVar5 = ydaVar4;
                                                                                gv9 gv9Var17 = (gv9) obj;
                                                                                if (zu4Var11 == null) {
                                                                                    int i56 = i28;
                                                                                    this.X = null;
                                                                                    this.r = ydaVar5;
                                                                                    this.s = null;
                                                                                    this.t = null;
                                                                                    this.u = null;
                                                                                    this.v = gv9Var;
                                                                                    this.w = null;
                                                                                    this.x = ho7Var7;
                                                                                    this.y = null;
                                                                                    this.z = null;
                                                                                    this.A = null;
                                                                                    this.B = null;
                                                                                    this.C = do7Var;
                                                                                    this.D = fantasyUserSquad;
                                                                                    this.E = null;
                                                                                    this.F = list6;
                                                                                    this.G = av4Var6;
                                                                                    this.H = ho7Var6;
                                                                                    this.I = gv9Var5;
                                                                                    this.J = u77Var3;
                                                                                    this.K = list8;
                                                                                    this.L = gv9Var17;
                                                                                    this.N = i27;
                                                                                    this.O = i26;
                                                                                    this.P = i56;
                                                                                    List list14 = list8;
                                                                                    this.S = z7;
                                                                                    this.T = z8;
                                                                                    this.U = z9;
                                                                                    this.Q = i18;
                                                                                    this.R = i21;
                                                                                    this.V = z6;
                                                                                    this.W = 12;
                                                                                    T7 = zu4Var11.T(this);
                                                                                    u77 u77Var7 = u77Var3;
                                                                                    lu3Var8 = lu3Var7;
                                                                                    if (T7 == lu3Var8) {
                                                                                        return lu3Var8;
                                                                                    }
                                                                                    gv9Var9 = gv9Var17;
                                                                                    i32 = i21;
                                                                                    ho7Var10 = ho7Var6;
                                                                                    z13 = z7;
                                                                                    u77Var5 = u77Var7;
                                                                                    z14 = z6;
                                                                                    gv9Var10 = gv9Var5;
                                                                                    i33 = i56;
                                                                                    list10 = list6;
                                                                                    i34 = i26;
                                                                                    i30 = i27;
                                                                                    list11 = list14;
                                                                                    gv9 gv9Var18 = gv9Var;
                                                                                    gv9Var8 = (gv9) T7;
                                                                                    gv9Var7 = gv9Var18;
                                                                                    ho7 ho7Var18 = ho7Var10;
                                                                                    i21 = i32;
                                                                                    u77Var4 = u77Var5;
                                                                                    z7 = z13;
                                                                                    ho7Var6 = ho7Var18;
                                                                                    gv9 gv9Var19 = gv9Var9;
                                                                                    ydaVar6 = ydaVar5;
                                                                                    list9 = list11;
                                                                                    gv9Var6 = gv9Var19;
                                                                                    i31 = i33;
                                                                                    gv9Var5 = gv9Var10;
                                                                                    z6 = z14;
                                                                                    av4Var7 = av4Var6;
                                                                                    i29 = i34;
                                                                                    list6 = list10;
                                                                                    lu3Var7 = lu3Var8;
                                                                                    this.X = null;
                                                                                    this.r = ydaVar6;
                                                                                    this.s = null;
                                                                                    this.t = null;
                                                                                    this.u = null;
                                                                                    this.v = gv9Var7;
                                                                                    this.w = null;
                                                                                    this.x = ho7Var7;
                                                                                    this.y = null;
                                                                                    this.z = null;
                                                                                    this.A = null;
                                                                                    this.B = null;
                                                                                    this.C = do7Var;
                                                                                    this.D = fantasyUserSquad;
                                                                                    this.E = null;
                                                                                    this.F = list6;
                                                                                    this.G = null;
                                                                                    this.H = ho7Var6;
                                                                                    this.I = gv9Var5;
                                                                                    this.J = u77Var4;
                                                                                    this.K = list9;
                                                                                    this.L = gv9Var6;
                                                                                    this.M = gv9Var8;
                                                                                    this.N = i30;
                                                                                    this.O = i29;
                                                                                    int i57 = i31;
                                                                                    this.P = i57;
                                                                                    gv9 gv9Var20 = gv9Var7;
                                                                                    this.S = z7;
                                                                                    this.T = z8;
                                                                                    this.U = z9;
                                                                                    this.Q = i18;
                                                                                    this.R = i21;
                                                                                    this.V = z6;
                                                                                    this.W = 13;
                                                                                    T8 = av4Var7.T(this);
                                                                                    lu3Var9 = lu3Var7;
                                                                                    if (T8 == lu3Var9) {
                                                                                        return lu3Var9;
                                                                                    }
                                                                                    u77Var6 = u77Var4;
                                                                                    list12 = list9;
                                                                                    fantasyUserSquad2 = fantasyUserSquad;
                                                                                    do7Var3 = do7Var;
                                                                                    ho7Var11 = ho7Var6;
                                                                                    gv9Var11 = gv9Var5;
                                                                                    list13 = list6;
                                                                                    gv9Var12 = gv9Var8;
                                                                                    gv9Var13 = gv9Var6;
                                                                                    ho7Var12 = ho7Var7;
                                                                                    i35 = i57;
                                                                                    z15 = z6;
                                                                                    i36 = i21;
                                                                                    i37 = i18;
                                                                                    z16 = z9;
                                                                                    z17 = z8;
                                                                                    gv9Var14 = gv9Var20;
                                                                                    i38 = i29;
                                                                                    i39 = i30;
                                                                                    z18 = z7;
                                                                                    rx6 rx6Var = (rx6) T8;
                                                                                    hs4 hs4Var = z45.a;
                                                                                    r69Var = rob.a;
                                                                                    lu6Var = new lu6(this.Z, list13, i35 == 0 ? i3 : 0, z16, z17, ho7Var12, fantasyUserSquad2, list12, do7Var3, ho7Var11, i39 == 0 ? i3 : 0, gv9Var11, gv9Var14, gv9Var12, gv9Var13, i36 == 0 ? i3 : 0, z15, u77Var6, rx6Var, this.Y, null);
                                                                                    boolean z31 = z16;
                                                                                    boolean z32 = z17;
                                                                                    ho7 ho7Var19 = ho7Var12;
                                                                                    boolean z33 = z15;
                                                                                    this.X = null;
                                                                                    this.r = ydaVar6;
                                                                                    this.s = null;
                                                                                    this.t = null;
                                                                                    this.u = null;
                                                                                    this.v = null;
                                                                                    this.w = null;
                                                                                    this.x = ho7Var19;
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
                                                                                    this.N = i39;
                                                                                    this.O = i38;
                                                                                    this.P = i35;
                                                                                    this.S = z18;
                                                                                    this.T = z32;
                                                                                    this.U = z31;
                                                                                    this.Q = i37;
                                                                                    this.R = i36;
                                                                                    this.V = z33;
                                                                                    this.W = 14;
                                                                                    if (xw3.R(r69Var, lu6Var, this) != lu3Var9) {
                                                                                        return lu3Var9;
                                                                                    }
                                                                                    z19 = z33;
                                                                                    z20 = z31;
                                                                                    z21 = z32;
                                                                                    z22 = z18;
                                                                                    i40 = i35;
                                                                                    i41 = i38;
                                                                                    i42 = i39;
                                                                                    ho7Var13 = ho7Var19;
                                                                                    ydaVar7 = ydaVar6;
                                                                                    obj3 = null;
                                                                                    if (ydaVar7 != null) {
                                                                                        this.X = null;
                                                                                        this.r = null;
                                                                                        this.s = null;
                                                                                        this.t = null;
                                                                                        this.u = null;
                                                                                        this.v = null;
                                                                                        this.w = null;
                                                                                        this.x = ho7Var13;
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
                                                                                        this.N = i42;
                                                                                        this.O = i41;
                                                                                        this.P = i40;
                                                                                        this.S = z22;
                                                                                        this.T = z21;
                                                                                        this.U = z20;
                                                                                        this.Q = i37;
                                                                                        this.R = i36;
                                                                                        this.V = z19;
                                                                                        this.W = 15;
                                                                                        if (ydaVar7.Z(this) == lu3Var9) {
                                                                                            return lu3Var9;
                                                                                        }
                                                                                        Unit unit = Unit.a;
                                                                                    }
                                                                                    boolean z34 = z20;
                                                                                    hs4 hs4Var2 = z45.a;
                                                                                    r69Var2 = rob.a;
                                                                                    lu3Var10 = lu3Var9;
                                                                                    ?? r64 = obj3;
                                                                                    l84Var = new l84(pu6Var2, z, ho7Var13, (rq3) r64, 3);
                                                                                    this.X = r64;
                                                                                    this.r = r64;
                                                                                    this.s = r64;
                                                                                    this.t = r64;
                                                                                    this.u = r64;
                                                                                    this.v = r64;
                                                                                    this.w = r64;
                                                                                    this.x = r64;
                                                                                    this.y = r64;
                                                                                    this.z = r64;
                                                                                    this.A = r64;
                                                                                    this.B = r64;
                                                                                    this.C = r64;
                                                                                    this.D = r64;
                                                                                    this.E = r64;
                                                                                    this.F = r64;
                                                                                    this.G = r64;
                                                                                    this.H = r64;
                                                                                    this.I = r64;
                                                                                    this.J = r64;
                                                                                    this.K = r64;
                                                                                    this.L = r64;
                                                                                    this.M = r64;
                                                                                    this.N = i42;
                                                                                    this.O = i41;
                                                                                    this.P = i40;
                                                                                    this.S = z22;
                                                                                    this.T = z21;
                                                                                    this.U = z34;
                                                                                    this.Q = i37;
                                                                                    this.R = i36;
                                                                                    this.V = z19;
                                                                                    this.W = 16;
                                                                                    if (xw3.R(r69Var2, l84Var, this) == lu3Var10) {
                                                                                        return lu3Var10;
                                                                                    }
                                                                                    return Unit.a;
                                                                                }
                                                                                List list15 = list8;
                                                                                int i58 = i27;
                                                                                gv9Var6 = gv9Var17;
                                                                                u77Var4 = u77Var3;
                                                                                av4Var7 = av4Var6;
                                                                                i29 = i26;
                                                                                i30 = i58;
                                                                                int i59 = i28;
                                                                                ydaVar6 = ydaVar5;
                                                                                list9 = list15;
                                                                                i31 = i59;
                                                                                gv9Var7 = gv9Var;
                                                                                gv9Var8 = null;
                                                                                this.X = null;
                                                                                this.r = ydaVar6;
                                                                                this.s = null;
                                                                                this.t = null;
                                                                                this.u = null;
                                                                                this.v = gv9Var7;
                                                                                this.w = null;
                                                                                this.x = ho7Var7;
                                                                                this.y = null;
                                                                                this.z = null;
                                                                                this.A = null;
                                                                                this.B = null;
                                                                                this.C = do7Var;
                                                                                this.D = fantasyUserSquad;
                                                                                this.E = null;
                                                                                this.F = list6;
                                                                                this.G = null;
                                                                                this.H = ho7Var6;
                                                                                this.I = gv9Var5;
                                                                                this.J = u77Var4;
                                                                                this.K = list9;
                                                                                this.L = gv9Var6;
                                                                                this.M = gv9Var8;
                                                                                this.N = i30;
                                                                                this.O = i29;
                                                                                int i572 = i31;
                                                                                this.P = i572;
                                                                                gv9 gv9Var202 = gv9Var7;
                                                                                this.S = z7;
                                                                                this.T = z8;
                                                                                this.U = z9;
                                                                                this.Q = i18;
                                                                                this.R = i21;
                                                                                this.V = z6;
                                                                                this.W = 13;
                                                                                T8 = av4Var7.T(this);
                                                                                lu3Var9 = lu3Var7;
                                                                                if (T8 == lu3Var9) {
                                                                                }
                                                                            } else {
                                                                                do7 do7Var4 = O;
                                                                                i18 = i13;
                                                                                zu4Var7 = zu4Var2;
                                                                                z6 = r12 == true ? 1 : 0;
                                                                                gv9Var3 = gv9Var16;
                                                                                i19 = i12;
                                                                                z7 = z3;
                                                                                i20 = i11;
                                                                                z8 = z29;
                                                                                list5 = null;
                                                                                ho7Var6 = a2;
                                                                                ho7Var7 = ho7Var16;
                                                                                do7Var = do7Var4;
                                                                                lu3Var4 = lu3Var12;
                                                                                u77Var2 = u77Var;
                                                                                zu4Var8 = zu4Var4;
                                                                                i21 = i52;
                                                                                av4Var4 = t6;
                                                                                i22 = i48;
                                                                                z9 = z4;
                                                                                list6 = list4;
                                                                                r9 = 0;
                                                                                this.X = r9;
                                                                                this.r = ydaVar4;
                                                                                this.s = r9;
                                                                                this.t = r9;
                                                                                this.u = r9;
                                                                                this.v = gv9Var;
                                                                                this.w = r9;
                                                                                this.x = ho7Var7;
                                                                                this.y = r9;
                                                                                this.z = r9;
                                                                                this.A = zu4Var7;
                                                                                this.B = r9;
                                                                                this.C = do7Var;
                                                                                this.D = squad;
                                                                                this.E = r9;
                                                                                this.F = list6;
                                                                                this.G = av4Var4;
                                                                                this.H = ho7Var6;
                                                                                this.I = gv9Var3;
                                                                                this.J = u77Var2;
                                                                                this.K = list5;
                                                                                this.N = i19;
                                                                                this.O = i22;
                                                                                int i552 = i20;
                                                                                this.P = i552;
                                                                                zu4 zu4Var122 = zu4Var7;
                                                                                this.S = z7;
                                                                                this.T = z8;
                                                                                this.U = z9;
                                                                                this.Q = i18;
                                                                                this.R = i21;
                                                                                this.V = z6;
                                                                                this.W = 11;
                                                                                T6 = zu4Var8.T(this);
                                                                                av4 av4Var82 = av4Var4;
                                                                                lu3Var6 = lu3Var4;
                                                                                if (T6 == lu3Var6) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i16 = i15;
                                                                z5 = z30;
                                                                i17 = 0;
                                                                if (i14 != 0) {
                                                                }
                                                                if (zu4Var6 == null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i15 = 0;
                                                    if (list4 != null) {
                                                    }
                                                    while (r15.hasNext()) {
                                                    }
                                                    i16 = i15;
                                                    z5 = z30;
                                                    i17 = 0;
                                                    if (i14 != 0) {
                                                    }
                                                    if (zu4Var6 == null) {
                                                    }
                                                }
                                            } else {
                                                it2 = it9;
                                            }
                                        }
                                    }
                                    i6 = 0;
                                    if (i6 != 0) {
                                    }
                                    tj7 tj7Var2 = pu6Var.h;
                                    boolean z252 = ho7Var4.g;
                                    boolean z262 = !mj7Var4.o;
                                    int i472 = mj7Var4.a;
                                    Integer num22 = pu6Var.m().c.B;
                                    if (num22 != null) {
                                    }
                                    this.X = ku3Var;
                                    this.r = ydaVar4;
                                    this.s = null;
                                    this.t = null;
                                    this.u = null;
                                    this.v = gv9Var;
                                    this.w = W;
                                    this.x = ho7Var4;
                                    this.y = zu4Var4;
                                    this.z = null;
                                    this.A = zu4Var2;
                                    this.B = zu4Var3;
                                    this.C = O;
                                    this.D = squad;
                                    this.E = list2;
                                    this.N = i4;
                                    this.O = i5;
                                    this.P = i8;
                                    this.S = i7;
                                    this.W = 9;
                                    tj7Var2.getClass();
                                    P = tz9.P(new sj7(z262, list2, tj7Var2, i472, intValue, z252, null), this);
                                    lu3Var11 = lu3Var3;
                                    if (P != lu3Var11) {
                                    }
                                }
                            }
                            return lu3Var;
                        }
                    }
                }
                return lu3Var11;
            case 1:
                av4Var = this.s;
                yda ydaVar8 = this.r;
                y6a.M(obj);
                T = obj;
                ydaVar = ydaVar8;
                r62 = 0;
                list = (List) T;
                if (list != null) {
                }
                return lu3Var11;
            case 2:
                y6a.M(obj);
                return Unit.a;
            case 3:
                ArrayList arrayList4 = this.u;
                List list16 = this.t;
                yda ydaVar9 = this.r;
                y6a.M(obj);
                ydaVar2 = ydaVar9;
                list = list16;
                arrayList = arrayList4;
                T2 = obj;
                gv9 gv9Var152 = (gv9) T2;
                it = gv9Var152.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                mj7 mj7Var22 = (mj7) obj2;
                W = CollectionsKt.W(CollectionsKt.x0(list, mj7Var22 == null ? new ho7(mj7Var22, (Integer) null, 0, 0, false, false, false, 254) : null));
                ho7Var = pu6Var3.l().c;
                int i442 = 4;
                if (ho7Var == null) {
                }
                if (pu6Var3.m().h.a != ho7Var.a.a) {
                }
                rq3 rq3Var2 = null;
                av4 t32 = xw3.t(ku3Var, null, new ku6(pu6Var3, rq3Var2, i442), 3);
                av4 t42 = xw3.t(ku3Var, null, new ku6(pu6Var3, rq3Var2, 3), 3);
                z = z24;
                av4 t52 = xw3.t(ku3Var, null, new hs6(pu6Var3, ho7Var, rq3Var2, i442), 3);
                av4 p22 = yaa.p(ku3Var, z23, new ku6(pu6Var3, rq3Var2, 1));
                ho7 ho7Var152 = ho7Var;
                av4Var2 = t42;
                av4Var3 = t52;
                i3 = 1;
                pu6Var = pu6Var3;
                r63 = 0;
                p = yaa.p(ku3Var, z23, new rh4(pu6Var3, ho7Var152, av4Var3, rq3Var2, 23));
                this.X = ku3Var;
                this.r = ydaVar2;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = gv9Var152;
                this.w = W;
                this.x = ho7Var152;
                this.y = av4Var2;
                this.z = av4Var3;
                this.A = p22;
                this.B = p;
                this.N = i2;
                this.W = 5;
                T3 = t32.T(this);
                lu3Var = lu3Var11;
                if (T3 != lu3Var) {
                }
                return lu3Var;
            case 4:
                y6a.M(obj);
                return Unit.a;
            case 5:
                int i60 = this.N;
                ?? r65 = this.B;
                zu4Var = this.A;
                av4Var3 = this.z;
                ?? r92 = this.y;
                ho7 ho7Var20 = this.x;
                ?? r122 = this.w;
                gv9Var = this.v;
                ydaVar3 = this.r;
                y6a.M(obj);
                ho7Var2 = ho7Var20;
                lu3Var = lu3Var11;
                z = z24;
                W = r122;
                i3 = 1;
                T3 = obj;
                i2 = i60;
                pu6Var = pu6Var3;
                av4Var2 = r92;
                p = r65;
                r63 = 0;
                fantasyUserCompetitionResponse = (FantasyUserCompetitionResponse) T3;
                if (fantasyUserCompetitionResponse != null) {
                    break;
                }
                lu3Var2 = lu3Var;
                this.X = r63;
                this.r = r63;
                this.s = r63;
                this.t = r63;
                this.u = r63;
                this.v = r63;
                this.w = r63;
                this.x = r63;
                this.y = r63;
                this.z = r63;
                this.A = r63;
                this.B = r63;
                this.C = r63;
                this.N = i2;
                this.O = 0;
                this.W = 6;
                if (pu6Var.w(this) == lu3Var2) {
                }
                return Unit.a;
            case 6:
                y6a.M(obj);
                return Unit.a;
            case 7:
                int i61 = this.N;
                O = this.C;
                zu4Var3 = this.B;
                zu4Var2 = this.A;
                zu4Var4 = this.y;
                ho7 ho7Var21 = this.x;
                ?? r123 = this.w;
                gv9Var = this.v;
                yda ydaVar10 = this.r;
                y6a.M(obj);
                z = z24;
                W = r123;
                i3 = 1;
                T4 = obj;
                i2 = i61;
                pu6Var = pu6Var3;
                ydaVar4 = ydaVar10;
                ho7Var4 = ho7Var21;
                lu3Var = lu3Var11;
                FantasyUserRoundSquadResponse fantasyUserRoundSquadResponse2 = (FantasyUserRoundSquadResponse) T4;
                if (fantasyUserRoundSquadResponse2 == null) {
                }
                if (!z23) {
                }
                if (squad != null) {
                    break;
                }
                z2 = z23;
                lu3Var3 = lu3Var;
                i4 = i2;
                r1 = 0;
                if (r1 == 0) {
                }
                list2 = r1;
                long longValue3 = ((Number) n9e.x(pu6Var.i(), new q13(O.c.c, 24))).longValue();
                mj7 mj7Var42 = ho7Var4.a;
                Long l2 = mj7Var42.h;
                if (longValue3 < (l2 == null ? l2.longValue() : 0L)) {
                }
                if (z2) {
                    break;
                }
                if (list2 != null) {
                    break;
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                }
                i6 = 0;
                if (i6 != 0) {
                }
                tj7 tj7Var22 = pu6Var.h;
                boolean z2522 = ho7Var4.g;
                boolean z2622 = !mj7Var42.o;
                int i4722 = mj7Var42.a;
                Integer num222 = pu6Var.m().c.B;
                if (num222 != null) {
                }
                this.X = ku3Var;
                this.r = ydaVar4;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = gv9Var;
                this.w = W;
                this.x = ho7Var4;
                this.y = zu4Var4;
                this.z = null;
                this.A = zu4Var2;
                this.B = zu4Var3;
                this.C = O;
                this.D = squad;
                this.E = list2;
                this.N = i4;
                this.O = i5;
                this.P = i8;
                this.S = i7;
                this.W = 9;
                tj7Var22.getClass();
                P = tz9.P(new sj7(z2622, list2, tj7Var22, i4722, intValue, z2522, null), this);
                lu3Var11 = lu3Var3;
                if (P != lu3Var11) {
                }
                return lu3Var11;
            case 8:
                y6a.M(obj);
                return Unit.a;
            case 9:
                boolean z35 = this.S;
                int i62 = this.P;
                int i63 = this.O;
                int i64 = this.N;
                List list17 = (List) this.E;
                FantasyUserSquad fantasyUserSquad3 = this.D;
                do7 do7Var5 = this.C;
                zu4Var5 = this.B;
                zu4 zu4Var13 = this.A;
                zu4 zu4Var14 = this.y;
                ho7 ho7Var22 = this.x;
                ?? r13 = this.w;
                gv9 gv9Var21 = this.v;
                yda ydaVar11 = this.r;
                y6a.M(obj);
                i5 = i63;
                O = do7Var5;
                z = z24;
                list3 = list17;
                squad = fantasyUserSquad3;
                zu4Var4 = zu4Var14;
                ho7Var5 = ho7Var22;
                zu4Var2 = zu4Var13;
                z3 = z35;
                W = r13;
                gv9Var = gv9Var21;
                i3 = 1;
                i10 = i64;
                i9 = i62;
                pu6Var = pu6Var3;
                ydaVar4 = ydaVar11;
                P = obj;
                list4 = (List) P;
                i11 = i9;
                int i482 = i5;
                lu3 lu3Var122 = lu3Var11;
                zu4Var6 = zu4Var5;
                ho7 ho7Var162 = ho7Var5;
                av4 t62 = xw3.t(ku3Var, null, new db4(this.a0, i9 == 0 ? i3 : 0, list3, ho7Var5, this.Z, list4, null), 3);
                if (list4.isEmpty()) {
                }
                boolean booleanValue3 = ((Boolean) R.a).booleanValue();
                boolean booleanValue22 = ((Boolean) R.b).booleanValue();
                ArrayList arrayList22 = new ArrayList();
                while (r22.hasNext()) {
                }
                z4 = booleanValue22;
                boolean z292 = booleanValue3;
                it3 = arrayList22.iterator();
                int i492 = 0;
                while (it3.hasNext()) {
                }
                int i502 = ho7Var162.d;
                mj7 mj7Var52 = ho7Var162.a;
                ho7 a22 = ho7.a(ho7Var162, o02.K(i492 - i502), 0, false, false, false, z3, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                i12 = i10;
                ArrayList arrayList32 = new ArrayList(k13.r(W, 10));
                it4 = W.iterator();
                while (it4.hasNext()) {
                }
                W2 = l6g.W(arrayList32);
                if (i11 != 0) {
                    break;
                }
                pu6Var2 = pu6Var;
                gv9Var2 = W2;
                u77Var = u77.a;
                long w22 = mj7Var52.d - yaa.w();
                wd5 wd5Var22 = xd5.b;
                gv9 gv9Var162 = gv9Var2;
                if (w22 >= xd5.k(wkn.R(60, be5.MINUTES), be5.SECONDS)) {
                }
                Boolean bool22 = pu6Var2.l().l;
                if (z) {
                }
                if ((bool22 == null ? bool22.booleanValue() : !mj7Var52.h() ? i3 : 0) != 0) {
                }
                if (ho7Var162.a.g()) {
                    break;
                }
                Context i542 = pu6Var2.i();
                sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                }
                i14 = i53;
                boolean z302 = sharedPreferences.getBoolean("PREF_SUBSTITUTIONS_INFO_DISMISSED", false);
                if (list4 != null) {
                    break;
                }
                it5 = list4.iterator();
                while (it5.hasNext()) {
                }
                i15 = 0;
                if (list4 != null) {
                }
                while (r15.hasNext()) {
                }
                i16 = i15;
                z5 = z302;
                i17 = 0;
                if (i14 != 0) {
                }
                if (zu4Var6 == null) {
                }
                break;
            case 10:
                boolean z36 = this.V;
                i24 = this.R;
                i13 = this.Q;
                boolean z37 = this.U;
                z11 = this.T;
                z10 = this.S;
                i23 = this.P;
                i25 = this.O;
                int i65 = this.N;
                u77 u77Var8 = this.J;
                gv9 gv9Var22 = this.I;
                ho7 ho7Var23 = this.H;
                ?? r14 = this.G;
                List list18 = this.F;
                FantasyUserSquad fantasyUserSquad4 = this.D;
                do7 do7Var6 = this.C;
                zu4Var9 = this.A;
                zu4Var10 = this.y;
                ho7Var9 = this.x;
                gv9 gv9Var23 = this.v;
                yda ydaVar12 = this.r;
                y6a.M(obj);
                i12 = i65;
                z12 = z36;
                do7Var2 = do7Var6;
                gv9Var4 = gv9Var22;
                av4Var5 = r14;
                ho7Var8 = ho7Var23;
                z = z24;
                z4 = z37;
                lu3Var5 = lu3Var11;
                u77Var2 = u77Var8;
                list7 = list18;
                squad = fantasyUserSquad4;
                gv9Var = gv9Var23;
                i3 = 1;
                pu6Var2 = pu6Var3;
                ydaVar4 = ydaVar12;
                T5 = obj;
                i21 = i24;
                z7 = z10;
                i20 = i23;
                av4Var4 = av4Var5;
                ho7Var6 = ho7Var8;
                i22 = i25;
                z6 = z12;
                list5 = (List) T5;
                zu4Var7 = zu4Var9;
                i18 = i13;
                i19 = i12;
                lu3Var4 = lu3Var5;
                gv9Var3 = gv9Var4;
                ho7Var7 = ho7Var9;
                z8 = z11;
                do7Var = do7Var2;
                zu4Var8 = zu4Var10;
                r9 = 0;
                list6 = list7;
                z9 = z4;
                this.X = r9;
                this.r = ydaVar4;
                this.s = r9;
                this.t = r9;
                this.u = r9;
                this.v = gv9Var;
                this.w = r9;
                this.x = ho7Var7;
                this.y = r9;
                this.z = r9;
                this.A = zu4Var7;
                this.B = r9;
                this.C = do7Var;
                this.D = squad;
                this.E = r9;
                this.F = list6;
                this.G = av4Var4;
                this.H = ho7Var6;
                this.I = gv9Var3;
                this.J = u77Var2;
                this.K = list5;
                this.N = i19;
                this.O = i22;
                int i5522 = i20;
                this.P = i5522;
                zu4 zu4Var1222 = zu4Var7;
                this.S = z7;
                this.T = z8;
                this.U = z9;
                this.Q = i18;
                this.R = i21;
                this.V = z6;
                this.W = 11;
                T6 = zu4Var8.T(this);
                av4 av4Var822 = av4Var4;
                lu3Var6 = lu3Var4;
                if (T6 == lu3Var6) {
                }
                break;
            case 11:
                boolean z38 = this.V;
                int i66 = this.R;
                int i67 = this.Q;
                boolean z39 = this.U;
                boolean z40 = this.T;
                boolean z41 = this.S;
                int i68 = this.P;
                int i69 = this.O;
                int i70 = this.N;
                List list19 = this.K;
                u77 u77Var9 = this.J;
                gv9 gv9Var24 = this.I;
                ho7 ho7Var24 = this.H;
                ?? r15 = this.G;
                List list20 = this.F;
                FantasyUserSquad fantasyUserSquad5 = this.D;
                do7 do7Var7 = this.C;
                zu4 zu4Var15 = this.A;
                ho7 ho7Var25 = this.x;
                gv9 gv9Var25 = this.v;
                yda ydaVar13 = this.r;
                y6a.M(obj);
                i18 = i67;
                fantasyUserSquad = fantasyUserSquad5;
                lu3Var7 = lu3Var11;
                i28 = i68;
                gv9Var5 = gv9Var24;
                ho7Var7 = ho7Var25;
                z8 = z40;
                do7Var = do7Var7;
                z = z24;
                z7 = z41;
                ho7Var6 = ho7Var24;
                i3 = 1;
                ydaVar5 = ydaVar13;
                list8 = list19;
                z6 = z38;
                zu4Var11 = zu4Var15;
                gv9Var = gv9Var25;
                pu6Var2 = pu6Var3;
                z9 = z39;
                av4Var6 = r15;
                i21 = i66;
                u77Var3 = u77Var9;
                i27 = i70;
                i26 = i69;
                list6 = list20;
                gv9 gv9Var172 = (gv9) obj;
                if (zu4Var11 == null) {
                }
                break;
            case 12:
                boolean z42 = this.V;
                int i71 = this.R;
                int i72 = this.Q;
                boolean z43 = this.U;
                boolean z44 = this.T;
                z13 = this.S;
                i33 = this.P;
                i34 = this.O;
                i30 = this.N;
                gv9 gv9Var26 = this.L;
                list11 = this.K;
                u77 u77Var10 = this.J;
                z14 = z42;
                gv9Var10 = this.I;
                ho7Var10 = this.H;
                ?? r16 = this.G;
                list10 = this.F;
                FantasyUserSquad fantasyUserSquad6 = this.D;
                do7 do7Var8 = this.C;
                ho7 ho7Var26 = this.x;
                gv9 gv9Var27 = this.v;
                yda ydaVar14 = this.r;
                y6a.M(obj);
                i32 = i71;
                lu3Var8 = lu3Var11;
                gv9Var9 = gv9Var26;
                gv9Var = gv9Var27;
                pu6Var2 = pu6Var3;
                i18 = i72;
                fantasyUserSquad = fantasyUserSquad6;
                z = z24;
                u77Var5 = u77Var10;
                ho7Var7 = ho7Var26;
                i3 = 1;
                ydaVar5 = ydaVar14;
                z8 = z44;
                do7Var = do7Var8;
                T7 = obj;
                z9 = z43;
                av4Var6 = r16;
                gv9 gv9Var182 = gv9Var;
                gv9Var8 = (gv9) T7;
                gv9Var7 = gv9Var182;
                ho7 ho7Var182 = ho7Var10;
                i21 = i32;
                u77Var4 = u77Var5;
                z7 = z13;
                ho7Var6 = ho7Var182;
                gv9 gv9Var192 = gv9Var9;
                ydaVar6 = ydaVar5;
                list9 = list11;
                gv9Var6 = gv9Var192;
                i31 = i33;
                gv9Var5 = gv9Var10;
                z6 = z14;
                av4Var7 = av4Var6;
                i29 = i34;
                list6 = list10;
                lu3Var7 = lu3Var8;
                this.X = null;
                this.r = ydaVar6;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = gv9Var7;
                this.w = null;
                this.x = ho7Var7;
                this.y = null;
                this.z = null;
                this.A = null;
                this.B = null;
                this.C = do7Var;
                this.D = fantasyUserSquad;
                this.E = null;
                this.F = list6;
                this.G = null;
                this.H = ho7Var6;
                this.I = gv9Var5;
                this.J = u77Var4;
                this.K = list9;
                this.L = gv9Var6;
                this.M = gv9Var8;
                this.N = i30;
                this.O = i29;
                int i5722 = i31;
                this.P = i5722;
                gv9 gv9Var2022 = gv9Var7;
                this.S = z7;
                this.T = z8;
                this.U = z9;
                this.Q = i18;
                this.R = i21;
                this.V = z6;
                this.W = 13;
                T8 = av4Var7.T(this);
                lu3Var9 = lu3Var7;
                if (T8 == lu3Var9) {
                }
                break;
            case 13:
                boolean z45 = this.V;
                int i73 = this.R;
                i37 = this.Q;
                boolean z46 = this.U;
                boolean z47 = this.T;
                z18 = this.S;
                i35 = this.P;
                i38 = this.O;
                i39 = this.N;
                gv9 gv9Var28 = this.M;
                gv9 gv9Var29 = this.L;
                List list21 = this.K;
                u77 u77Var11 = this.J;
                gv9 gv9Var30 = this.I;
                ho7 ho7Var27 = this.H;
                List list22 = this.F;
                FantasyUserSquad fantasyUserSquad7 = this.D;
                do7 do7Var9 = this.C;
                ho7 ho7Var28 = this.x;
                gv9 gv9Var31 = this.v;
                yda ydaVar15 = this.r;
                y6a.M(obj);
                z = z24;
                gv9Var13 = gv9Var29;
                gv9Var12 = gv9Var28;
                z16 = z46;
                list12 = list21;
                z17 = z47;
                z15 = z45;
                u77Var6 = u77Var11;
                gv9Var11 = gv9Var30;
                ho7Var11 = ho7Var27;
                list13 = list22;
                fantasyUserSquad2 = fantasyUserSquad7;
                do7Var3 = do7Var9;
                ho7Var12 = ho7Var28;
                gv9Var14 = gv9Var31;
                i3 = 1;
                pu6Var2 = pu6Var3;
                i36 = i73;
                lu3Var9 = lu3Var11;
                ydaVar6 = ydaVar15;
                T8 = obj;
                rx6 rx6Var2 = (rx6) T8;
                hs4 hs4Var3 = z45.a;
                r69Var = rob.a;
                lu6Var = new lu6(this.Z, list13, i35 == 0 ? i3 : 0, z16, z17, ho7Var12, fantasyUserSquad2, list12, do7Var3, ho7Var11, i39 == 0 ? i3 : 0, gv9Var11, gv9Var14, gv9Var12, gv9Var13, i36 == 0 ? i3 : 0, z15, u77Var6, rx6Var2, this.Y, null);
                boolean z312 = z16;
                boolean z322 = z17;
                ho7 ho7Var192 = ho7Var12;
                boolean z332 = z15;
                this.X = null;
                this.r = ydaVar6;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = ho7Var192;
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
                this.N = i39;
                this.O = i38;
                this.P = i35;
                this.S = z18;
                this.T = z322;
                this.U = z312;
                this.Q = i37;
                this.R = i36;
                this.V = z332;
                this.W = 14;
                if (xw3.R(r69Var, lu6Var, this) != lu3Var9) {
                }
                break;
            case 14:
                z19 = this.V;
                int i74 = this.R;
                i37 = this.Q;
                z20 = this.U;
                z21 = this.T;
                z22 = this.S;
                i40 = this.P;
                i41 = this.O;
                i42 = this.N;
                ho7Var13 = this.x;
                ydaVar7 = this.r;
                y6a.M(obj);
                pu6Var2 = pu6Var3;
                z = z24;
                i36 = i74;
                lu3Var9 = lu3Var11;
                obj3 = null;
                if (ydaVar7 != null) {
                }
                boolean z342 = z20;
                hs4 hs4Var22 = z45.a;
                r69Var2 = rob.a;
                lu3Var10 = lu3Var9;
                ?? r642 = obj3;
                l84Var = new l84(pu6Var2, z, ho7Var13, (rq3) r642, 3);
                this.X = r642;
                this.r = r642;
                this.s = r642;
                this.t = r642;
                this.u = r642;
                this.v = r642;
                this.w = r642;
                this.x = r642;
                this.y = r642;
                this.z = r642;
                this.A = r642;
                this.B = r642;
                this.C = r642;
                this.D = r642;
                this.E = r642;
                this.F = r642;
                this.G = r642;
                this.H = r642;
                this.I = r642;
                this.J = r642;
                this.K = r642;
                this.L = r642;
                this.M = r642;
                this.N = i42;
                this.O = i41;
                this.P = i40;
                this.S = z22;
                this.T = z21;
                this.U = z342;
                this.Q = i37;
                this.R = i36;
                this.V = z19;
                this.W = 16;
                if (xw3.R(r69Var2, l84Var, this) == lu3Var10) {
                }
                return Unit.a;
            case 15:
                z19 = this.V;
                int i75 = this.R;
                i37 = this.Q;
                z20 = this.U;
                z21 = this.T;
                z22 = this.S;
                i40 = this.P;
                i41 = this.O;
                i42 = this.N;
                ho7Var13 = this.x;
                y6a.M(obj);
                pu6Var2 = pu6Var3;
                z = z24;
                obj3 = null;
                i36 = i75;
                lu3Var9 = lu3Var11;
                Unit unit2 = Unit.a;
                boolean z3422 = z20;
                hs4 hs4Var222 = z45.a;
                r69Var2 = rob.a;
                lu3Var10 = lu3Var9;
                ?? r6422 = obj3;
                l84Var = new l84(pu6Var2, z, ho7Var13, (rq3) r6422, 3);
                this.X = r6422;
                this.r = r6422;
                this.s = r6422;
                this.t = r6422;
                this.u = r6422;
                this.v = r6422;
                this.w = r6422;
                this.x = r6422;
                this.y = r6422;
                this.z = r6422;
                this.A = r6422;
                this.B = r6422;
                this.C = r6422;
                this.D = r6422;
                this.E = r6422;
                this.F = r6422;
                this.G = r6422;
                this.H = r6422;
                this.I = r6422;
                this.J = r6422;
                this.K = r6422;
                this.L = r6422;
                this.M = r6422;
                this.N = i42;
                this.O = i41;
                this.P = i40;
                this.S = z22;
                this.T = z21;
                this.U = z3422;
                this.Q = i37;
                this.R = i36;
                this.V = z19;
                this.W = 16;
                if (xw3.R(r69Var2, l84Var, this) == lu3Var10) {
                }
                return Unit.a;
            case 16:
                y6a.M(obj);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
