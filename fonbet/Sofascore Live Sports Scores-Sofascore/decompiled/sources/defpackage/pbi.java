package defpackage;

import com.sofascore.model.newNetwork.StandingsFormResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pbi extends hoi implements Function2 {
    public Object A;
    public Serializable B;
    public Object C;
    public Serializable D;
    public int E;
    public boolean F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ rbi I;
    public final /* synthetic */ Integer J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ Integer M;
    public final /* synthetic */ String N;
    public final /* synthetic */ Integer O;
    public final /* synthetic */ Integer P;
    public av4 r;
    public zu4 s;
    public zu4 t;
    public Object u;
    public String v;
    public Object w;
    public Serializable x;
    public Object y;
    public StandingsFormResponse z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbi(rbi rbiVar, Integer num, int i, int i2, Integer num2, String str, Integer num3, Integer num4, rq3 rq3Var) {
        super(2, rq3Var);
        this.I = rbiVar;
        this.J = num;
        this.K = i;
        this.L = i2;
        this.M = num2;
        this.N = str;
        this.O = num3;
        this.P = num4;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        pbi pbiVar = new pbi(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, rq3Var);
        pbiVar.H = obj;
        return pbiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pbi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x024d, code lost:
    
        if (r0 == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014f, code lost:
    
        if (r1 == r2) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b8  */
    /* JADX WARN: Type inference failed for: r1v11, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [av4, com.sofascore.model.newNetwork.StandingsFormResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3, types: [av4, com.sofascore.model.newNetwork.StandingsFormResponse, java.lang.Object, zu4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [av4, java.lang.Object, java.lang.String, zu4] */
    /* JADX WARN: Type inference failed for: r3v5, types: [av4, com.sofascore.model.newNetwork.StandingsFormResponse, java.io.Serializable, java.lang.Object, java.lang.String, zu4] */
    /* JADX WARN: Type inference failed for: r3v9, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r3;
        av4 av4Var;
        av4 av4Var2;
        int i;
        av4 av4Var3;
        av4 av4Var4;
        Object w;
        StandingsResponse standingsResponse;
        yzc yzcVar;
        List list;
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        Object T;
        zu4 zu4Var;
        zu4 zu4Var2;
        Object obj2;
        int i2;
        ?? r32;
        Object T2;
        rbi rbiVar;
        String str2;
        Object obj3;
        yzc yzcVar2;
        Integer num4;
        Integer num5;
        StandingsResponse standingsResponse2;
        Integer num6;
        StandingsFormResponse standingsFormResponse;
        ?? r33;
        Boolean bool;
        boolean z;
        int i3;
        Object T3;
        boolean z2;
        ?? r34;
        yzc yzcVar3;
        Object r;
        Object obj4;
        ku3 ku3Var = (ku3) this.H;
        lu3 lu3Var = lu3.a;
        int i4 = this.G;
        rbi rbiVar2 = this.I;
        if (i4 == 0) {
            y6a.M(obj);
            rv8 l = rbiVar2.l();
            rq3 rq3Var = null;
            r3 = 0;
            av4 t = xw3.t(ku3Var, null, new obi(rbiVar2, this.K, this.L, l, rq3Var, 1), 3);
            av4 t2 = xw3.t(ku3Var, null, new obi(rbiVar2, this.K, this.L, l, rq3Var, 0), 3);
            av4 t3 = xw3.t(ku3Var, null, new lbi(rbiVar2, this.J, this.K, this.L, (rq3) null), 3);
            Integer num7 = this.J;
            if (num7 != null) {
                i = 1;
                av4Var3 = t;
                av4Var = t3;
                av4Var2 = t2;
                av4Var4 = xw3.t(ku3Var, null, new nbi(rbiVar2, num7.intValue(), this.L, this.M, av4Var3, null, 0), 3);
            } else {
                av4Var = t3;
                av4Var2 = t2;
                i = 1;
                av4Var3 = t;
                av4Var4 = null;
            }
            this.H = null;
            this.r = av4Var2;
            this.s = av4Var;
            this.t = av4Var4;
            this.G = i;
            w = av4Var3.w(this);
        } else if (i4 == 1) {
            ?? r1 = this.t;
            ?? r35 = this.s;
            av4 av4Var5 = this.r;
            y6a.M(obj);
            av4Var = r35;
            av4Var2 = av4Var5;
            r3 = 0;
            av4Var4 = r1;
            w = obj;
        } else {
            if (i4 == 2) {
                i2 = this.E;
                rbiVar2 = (rbi) this.C;
                StandingsResponse standingsResponse3 = (StandingsResponse) this.B;
                yzc yzcVar4 = (yzc) this.A;
                Integer num8 = (Integer) this.y;
                num2 = (Integer) this.x;
                num = (Integer) this.w;
                str = this.v;
                Object obj5 = this.u;
                zu4Var = this.t;
                zu4Var2 = this.s;
                y6a.M(obj);
                T = obj;
                obj2 = obj5;
                num3 = num8;
                yzcVar = yzcVar4;
                standingsResponse = standingsResponse3;
                r32 = 0;
                StandingsFormResponse standingsFormResponse2 = (StandingsFormResponse) T;
                this.H = r32;
                this.r = r32;
                this.s = r32;
                this.t = zu4Var;
                this.u = obj2;
                this.v = str;
                this.w = num;
                this.x = num2;
                this.y = num3;
                this.z = r32;
                this.A = yzcVar;
                this.B = standingsResponse;
                this.C = rbiVar2;
                this.D = standingsFormResponse2;
                this.E = i2;
                this.G = 3;
                T2 = zu4Var2.T(this);
                if (T2 != lu3Var) {
                    String str3 = str;
                    rbiVar = rbiVar2;
                    str2 = str3;
                    obj3 = obj2;
                    yzcVar2 = yzcVar;
                    num4 = num2;
                    num5 = num3;
                    standingsResponse2 = standingsResponse;
                    num6 = num;
                    standingsFormResponse = standingsFormResponse2;
                    r33 = r32;
                    boolean c = Intrinsics.c((Boolean) T2, Boolean.TRUE);
                    if (zu4Var == null) {
                    }
                }
                return lu3Var;
            }
            if (i4 == 3) {
                i2 = this.E;
                StandingsFormResponse standingsFormResponse3 = (StandingsFormResponse) this.D;
                rbi rbiVar3 = (rbi) this.C;
                StandingsResponse standingsResponse4 = (StandingsResponse) this.B;
                yzc yzcVar5 = (yzc) this.A;
                num5 = (Integer) this.y;
                Integer num9 = (Integer) this.x;
                Integer num10 = (Integer) this.w;
                String str4 = this.v;
                obj3 = this.u;
                zu4Var = this.t;
                y6a.M(obj);
                rbiVar = rbiVar3;
                str2 = str4;
                standingsResponse2 = standingsResponse4;
                num6 = num10;
                yzcVar2 = yzcVar5;
                num4 = num9;
                standingsFormResponse = standingsFormResponse3;
                r33 = 0;
                T2 = obj;
                boolean c2 = Intrinsics.c((Boolean) T2, Boolean.TRUE);
                if (zu4Var == null) {
                    this.H = r33;
                    this.r = r33;
                    this.s = r33;
                    this.t = r33;
                    this.u = obj3;
                    this.v = r33;
                    this.w = yzcVar2;
                    this.x = standingsResponse2;
                    this.y = rbiVar;
                    this.z = standingsFormResponse;
                    this.A = num5;
                    this.B = num4;
                    this.C = num6;
                    this.D = str2;
                    this.E = i2;
                    this.F = c2;
                    this.G = 4;
                    T3 = zu4Var.T(this);
                    if (T3 != lu3Var) {
                        i3 = i2;
                        z2 = c2;
                        obj4 = r33;
                        bool = (Boolean) T3;
                        z = z2;
                        r34 = obj4;
                        String str5 = str2;
                        Integer num11 = num6;
                        Integer num12 = num4;
                        Integer num13 = num5;
                        StandingsFormResponse standingsFormResponse4 = standingsFormResponse;
                        rbi rbiVar4 = rbiVar;
                        StandingsResponse standingsResponse5 = standingsResponse2;
                        yzcVar3 = yzcVar2;
                        boolean c3 = Intrinsics.c(bool, Boolean.TRUE);
                        this.H = r34;
                        this.r = r34;
                        this.s = r34;
                        this.t = r34;
                        this.u = obj3;
                        this.v = r34;
                        this.w = yzcVar3;
                        this.x = r34;
                        this.y = r34;
                        this.z = r34;
                        this.A = r34;
                        this.B = r34;
                        this.C = r34;
                        this.D = r34;
                        this.E = i3;
                        this.G = 5;
                        rbiVar4.getClass();
                        r = s9a.r(new mbi(standingsResponse5, rbiVar4, str5, z, num11, num12, num13, c3, standingsFormResponse4, null, 0), this);
                    }
                    return lu3Var;
                }
                bool = r33;
                z = c2;
                i3 = i2;
                r34 = r33;
                String str52 = str2;
                Integer num112 = num6;
                Integer num122 = num4;
                Integer num132 = num5;
                StandingsFormResponse standingsFormResponse42 = standingsFormResponse;
                rbi rbiVar42 = rbiVar;
                StandingsResponse standingsResponse52 = standingsResponse2;
                yzcVar3 = yzcVar2;
                boolean c32 = Intrinsics.c(bool, Boolean.TRUE);
                this.H = r34;
                this.r = r34;
                this.s = r34;
                this.t = r34;
                this.u = obj3;
                this.v = r34;
                this.w = yzcVar3;
                this.x = r34;
                this.y = r34;
                this.z = r34;
                this.A = r34;
                this.B = r34;
                this.C = r34;
                this.D = r34;
                this.E = i3;
                this.G = 5;
                rbiVar42.getClass();
                r = s9a.r(new mbi(standingsResponse52, rbiVar42, str52, z, num112, num122, num132, c32, standingsFormResponse42, null, 0), this);
            } else {
                if (i4 != 4) {
                    if (i4 != 5) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzcVar3 = (yzc) this.w;
                    y6a.M(obj);
                    r = obj;
                    list = (List) r;
                    yzcVar = yzcVar3;
                    yzcVar.j(list);
                    return Unit.a;
                }
                z2 = this.F;
                int i5 = this.E;
                str2 = (String) this.D;
                num6 = (Integer) this.C;
                num4 = (Integer) this.B;
                num5 = (Integer) this.A;
                standingsFormResponse = this.z;
                rbiVar = (rbi) this.y;
                standingsResponse2 = (StandingsResponse) this.x;
                yzcVar2 = (yzc) this.w;
                obj3 = this.u;
                y6a.M(obj);
                i3 = i5;
                obj4 = null;
                T3 = obj;
                bool = (Boolean) T3;
                z = z2;
                r34 = obj4;
                String str522 = str2;
                Integer num1122 = num6;
                Integer num1222 = num4;
                Integer num1322 = num5;
                StandingsFormResponse standingsFormResponse422 = standingsFormResponse;
                rbi rbiVar422 = rbiVar;
                StandingsResponse standingsResponse522 = standingsResponse2;
                yzcVar3 = yzcVar2;
                boolean c322 = Intrinsics.c(bool, Boolean.TRUE);
                this.H = r34;
                this.r = r34;
                this.s = r34;
                this.t = r34;
                this.u = obj3;
                this.v = r34;
                this.w = yzcVar3;
                this.x = r34;
                this.y = r34;
                this.z = r34;
                this.A = r34;
                this.B = r34;
                this.C = r34;
                this.D = r34;
                this.E = i3;
                this.G = 5;
                rbiVar422.getClass();
                r = s9a.r(new mbi(standingsResponse522, rbiVar422, str522, z, num1122, num1222, num1322, c322, standingsFormResponse422, null, 0), this);
            }
        }
        standingsResponse = (StandingsResponse) w;
        yzcVar = rbiVar2.h;
        if (standingsResponse == null) {
            list = r3;
            yzcVar.j(list);
            return Unit.a;
        }
        this.H = r3;
        this.r = r3;
        this.s = av4Var;
        this.t = av4Var4;
        this.u = w;
        str = this.N;
        this.v = str;
        num = this.M;
        this.w = num;
        num2 = this.O;
        this.x = num2;
        num3 = this.P;
        this.y = num3;
        this.z = r3;
        this.A = yzcVar;
        this.B = standingsResponse;
        this.C = rbiVar2;
        this.E = 0;
        this.G = 2;
        T = av4Var2.T(this);
        if (T != lu3Var) {
            zu4Var = av4Var4;
            zu4Var2 = av4Var;
            obj2 = w;
            i2 = 0;
            r32 = r3;
            StandingsFormResponse standingsFormResponse22 = (StandingsFormResponse) T;
            this.H = r32;
            this.r = r32;
            this.s = r32;
            this.t = zu4Var;
            this.u = obj2;
            this.v = str;
            this.w = num;
            this.x = num2;
            this.y = num3;
            this.z = r32;
            this.A = yzcVar;
            this.B = standingsResponse;
            this.C = rbiVar2;
            this.D = standingsFormResponse22;
            this.E = i2;
            this.G = 3;
            T2 = zu4Var2.T(this);
            if (T2 != lu3Var) {
            }
        }
        return lu3Var;
    }
}
