package defpackage;

import com.sofascore.model.newNetwork.StandingsFormMultipleTournamentsResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qbi extends hoi implements Function2 {
    public Serializable A;
    public Object B;
    public Serializable C;
    public int D;
    public boolean E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ rbi H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Integer K;
    public final /* synthetic */ String L;
    public final /* synthetic */ Integer M;
    public av4 r;
    public zu4 s;
    public zu4 t;
    public String u;
    public Object v;
    public Serializable w;
    public Object x;
    public StandingsFormMultipleTournamentsResponse y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbi(rbi rbiVar, int i, int i2, Integer num, String str, Integer num2, rq3 rq3Var) {
        super(2, rq3Var);
        this.H = rbiVar;
        this.I = i;
        this.J = i2;
        this.K = num;
        this.L = str;
        this.M = num2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        qbi qbiVar = new qbi(this.H, this.I, this.J, this.K, this.L, this.M, rq3Var);
        qbiVar.G = obj;
        return qbiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qbi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0226, code lost:
    
        if (r0 != r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ac  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [av4, com.sofascore.model.newNetwork.StandingsFormMultipleTournamentsResponse, java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3, types: [av4, com.sofascore.model.newNetwork.StandingsFormMultipleTournamentsResponse, java.lang.Object, zu4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [av4, java.lang.Object, java.lang.String, zu4] */
    /* JADX WARN: Type inference failed for: r3v5, types: [av4, com.sofascore.model.newNetwork.StandingsFormMultipleTournamentsResponse, java.io.Serializable, java.lang.Object, java.lang.String, zu4] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 av4Var;
        zu4 t;
        Object w;
        zu4 zu4Var;
        ?? r3;
        StandingsResponse standingsResponse;
        String str;
        Integer num;
        Object T;
        zu4 zu4Var2;
        yzc yzcVar;
        Integer num2;
        int i;
        Integer num3;
        ?? r32;
        Object T2;
        StandingsResponse standingsResponse2;
        String str2;
        StandingsFormMultipleTournamentsResponse standingsFormMultipleTournamentsResponse;
        yzc yzcVar2;
        Integer num4;
        ?? r33;
        Object T3;
        int i2;
        yzc yzcVar3;
        boolean z;
        Integer num5;
        StandingsResponse standingsResponse3;
        ?? r34;
        Object r;
        ku3 ku3Var = (ku3) this.G;
        lu3 lu3Var = lu3.a;
        int i3 = this.F;
        rbi rbiVar = this.H;
        if (i3 == 0) {
            y6a.M(obj);
            rq3 rq3Var = null;
            rv8 l = rbiVar.l();
            rq3 rq3Var2 = null;
            av4 t2 = xw3.t(ku3Var, null, new obi(rbiVar, this.I, this.J, l, rq3Var2, 3), 3);
            av4 t3 = xw3.t(ku3Var, null, new obi(rbiVar, this.I, this.J, l, rq3Var2, 2), 3);
            av4 t4 = xw3.t(ku3Var, null, new jbi(rbiVar, this.I, this.J, rq3Var, 4), 3);
            av4Var = t3;
            t = xw3.t(ku3Var, null, new nbi(rbiVar, this.I, this.J, this.K, t2, null, 1), 3);
            this.G = null;
            this.r = av4Var;
            this.s = t4;
            this.t = t;
            this.F = 1;
            w = t2.w(this);
            if (w != lu3Var) {
                zu4Var = t4;
                r3 = rq3Var;
            }
            return lu3Var;
        }
        if (i3 == 1) {
            t = this.t;
            zu4 zu4Var3 = this.s;
            av4 av4Var2 = this.r;
            y6a.M(obj);
            zu4Var = zu4Var3;
            av4Var = av4Var2;
            r3 = 0;
            w = obj;
        } else {
            if (i3 == 2) {
                i = this.D;
                rbiVar = (rbi) this.B;
                StandingsResponse standingsResponse4 = (StandingsResponse) this.A;
                yzcVar = (yzc) this.z;
                num2 = (Integer) this.x;
                Integer num6 = (Integer) this.w;
                num = (Integer) this.v;
                str = this.u;
                zu4Var2 = this.t;
                zu4Var = this.s;
                y6a.M(obj);
                T = obj;
                standingsResponse = standingsResponse4;
                r32 = 0;
                num3 = num6;
                StandingsFormMultipleTournamentsResponse standingsFormMultipleTournamentsResponse2 = (StandingsFormMultipleTournamentsResponse) T;
                this.G = r32;
                this.r = r32;
                this.s = r32;
                this.t = zu4Var2;
                this.u = str;
                this.v = num;
                this.w = num3;
                this.x = num2;
                this.y = r32;
                this.z = yzcVar;
                this.A = standingsResponse;
                this.B = rbiVar;
                this.C = standingsFormMultipleTournamentsResponse2;
                this.D = i;
                this.F = 3;
                T2 = zu4Var.T(this);
                if (T2 != lu3Var) {
                    String str3 = str;
                    standingsResponse2 = standingsResponse;
                    str2 = str3;
                    standingsFormMultipleTournamentsResponse = standingsFormMultipleTournamentsResponse2;
                    yzcVar2 = yzcVar;
                    num4 = num3;
                    r33 = r32;
                    boolean c = Intrinsics.c((Boolean) T2, Boolean.TRUE);
                    this.G = r33;
                    this.r = r33;
                    this.s = r33;
                    this.t = r33;
                    this.u = r33;
                    this.v = yzcVar2;
                    this.w = standingsResponse2;
                    this.x = rbiVar;
                    this.y = standingsFormMultipleTournamentsResponse;
                    this.z = num2;
                    this.A = num4;
                    this.B = num;
                    this.C = str2;
                    this.D = i;
                    this.E = c;
                    this.F = 4;
                    T3 = zu4Var2.T(this);
                    if (T3 != lu3Var) {
                    }
                }
                return lu3Var;
            }
            if (i3 == 3) {
                i = this.D;
                StandingsFormMultipleTournamentsResponse standingsFormMultipleTournamentsResponse3 = (StandingsFormMultipleTournamentsResponse) this.C;
                rbi rbiVar2 = (rbi) this.B;
                StandingsResponse standingsResponse5 = (StandingsResponse) this.A;
                yzc yzcVar4 = (yzc) this.z;
                Integer num7 = (Integer) this.x;
                Integer num8 = (Integer) this.w;
                num = (Integer) this.v;
                String str4 = this.u;
                zu4Var2 = this.t;
                y6a.M(obj);
                yzcVar2 = yzcVar4;
                num2 = num7;
                str2 = str4;
                standingsFormMultipleTournamentsResponse = standingsFormMultipleTournamentsResponse3;
                standingsResponse2 = standingsResponse5;
                num4 = num8;
                r33 = 0;
                rbiVar = rbiVar2;
                T2 = obj;
                boolean c2 = Intrinsics.c((Boolean) T2, Boolean.TRUE);
                this.G = r33;
                this.r = r33;
                this.s = r33;
                this.t = r33;
                this.u = r33;
                this.v = yzcVar2;
                this.w = standingsResponse2;
                this.x = rbiVar;
                this.y = standingsFormMultipleTournamentsResponse;
                this.z = num2;
                this.A = num4;
                this.B = num;
                this.C = str2;
                this.D = i;
                this.E = c2;
                this.F = 4;
                T3 = zu4Var2.T(this);
                if (T3 != lu3Var) {
                    yzc yzcVar5 = yzcVar2;
                    i2 = i;
                    yzcVar3 = yzcVar5;
                    z = c2;
                    num5 = num;
                    standingsResponse3 = standingsResponse2;
                    r34 = r33;
                    String str5 = str2;
                    Integer num9 = num4;
                    Integer num10 = num2;
                    StandingsFormMultipleTournamentsResponse standingsFormMultipleTournamentsResponse4 = standingsFormMultipleTournamentsResponse;
                    rbi rbiVar3 = rbiVar;
                    boolean booleanValue = ((Boolean) T3).booleanValue();
                    this.G = r34;
                    this.r = r34;
                    this.s = r34;
                    this.t = r34;
                    this.u = r34;
                    this.v = yzcVar3;
                    this.w = r34;
                    this.x = r34;
                    this.y = r34;
                    this.z = r34;
                    this.A = r34;
                    this.B = r34;
                    this.C = r34;
                    this.D = i2;
                    this.F = 5;
                    rbiVar3.getClass();
                    r = s9a.r(new mbi(standingsResponse3, rbiVar3, str5, z, num5, num9, num10, booleanValue, standingsFormMultipleTournamentsResponse4, null, 1), this);
                }
                return lu3Var;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yzcVar3 = (yzc) this.v;
                y6a.M(obj);
                r = obj;
                yzcVar3.j(r);
                return Unit.a;
            }
            boolean z2 = this.E;
            int i4 = this.D;
            str2 = (String) this.C;
            Integer num11 = (Integer) this.B;
            num4 = (Integer) this.A;
            num2 = (Integer) this.z;
            standingsFormMultipleTournamentsResponse = this.y;
            rbiVar = (rbi) this.x;
            StandingsResponse standingsResponse6 = (StandingsResponse) this.w;
            yzc yzcVar6 = (yzc) this.v;
            y6a.M(obj);
            z = z2;
            i2 = i4;
            num5 = num11;
            standingsResponse3 = standingsResponse6;
            yzcVar3 = yzcVar6;
            r34 = 0;
            T3 = obj;
            String str52 = str2;
            Integer num92 = num4;
            Integer num102 = num2;
            StandingsFormMultipleTournamentsResponse standingsFormMultipleTournamentsResponse42 = standingsFormMultipleTournamentsResponse;
            rbi rbiVar32 = rbiVar;
            boolean booleanValue2 = ((Boolean) T3).booleanValue();
            this.G = r34;
            this.r = r34;
            this.s = r34;
            this.t = r34;
            this.u = r34;
            this.v = yzcVar3;
            this.w = r34;
            this.x = r34;
            this.y = r34;
            this.z = r34;
            this.A = r34;
            this.B = r34;
            this.C = r34;
            this.D = i2;
            this.F = 5;
            rbiVar32.getClass();
            r = s9a.r(new mbi(standingsResponse3, rbiVar32, str52, z, num5, num92, num102, booleanValue2, standingsFormMultipleTournamentsResponse42, null, 1), this);
        }
        standingsResponse = (StandingsResponse) w;
        if (standingsResponse != null) {
            yzc yzcVar7 = rbiVar.h;
            this.G = r3;
            this.r = r3;
            this.s = zu4Var;
            this.t = t;
            str = this.L;
            this.u = str;
            num = this.K;
            this.v = num;
            this.w = r3;
            Integer num12 = this.M;
            this.x = num12;
            this.y = r3;
            this.z = yzcVar7;
            this.A = standingsResponse;
            this.B = rbiVar;
            this.D = 0;
            this.F = 2;
            T = av4Var.T(this);
            if (T != lu3Var) {
                zu4Var2 = t;
                yzcVar = yzcVar7;
                num2 = num12;
                i = 0;
                num3 = r3;
                r32 = r3;
                StandingsFormMultipleTournamentsResponse standingsFormMultipleTournamentsResponse22 = (StandingsFormMultipleTournamentsResponse) T;
                this.G = r32;
                this.r = r32;
                this.s = r32;
                this.t = zu4Var2;
                this.u = str;
                this.v = num;
                this.w = num3;
                this.x = num2;
                this.y = r32;
                this.z = yzcVar;
                this.A = standingsResponse;
                this.B = rbiVar;
                this.C = standingsFormMultipleTournamentsResponse22;
                this.D = i;
                this.F = 3;
                T2 = zu4Var.T(this);
                if (T2 != lu3Var) {
                }
            }
            return lu3Var;
        }
        return Unit.a;
    }
}
