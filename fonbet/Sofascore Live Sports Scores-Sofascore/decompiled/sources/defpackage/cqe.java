package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.FootballShotmapResponse;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.model.newNetwork.PlayerShotmapResponse;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cqe extends hoi implements Function2 {
    public zu4 A;
    public av4 B;
    public zu4 C;
    public Object D;
    public Serializable E;
    public Object F;
    public Object G;
    public Object H;
    public Serializable I;
    public Player J;
    public Player K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public /* synthetic */ Object R;
    public final /* synthetic */ String S;
    public final /* synthetic */ int T;
    public final /* synthetic */ Integer U;
    public final /* synthetic */ Integer V;
    public final /* synthetic */ String W;
    public final /* synthetic */ fqe X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ boolean Z;
    public fsf r;
    public fsf s;
    public fsf t;
    public fsf u;
    public fsf v;
    public fsf w;
    public fsf x;
    public fsf y;
    public zu4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqe(String str, int i, Integer num, Integer num2, String str2, fqe fqeVar, int i2, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.S = str;
        this.T = i;
        this.U = num;
        this.V = num2;
        this.W = str2;
        this.X = fqeVar;
        this.Y = i2;
        this.Z = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        cqe cqeVar = new cqe(this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, rq3Var);
        cqeVar.R = obj;
        return cqeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cqe) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x0dae, code lost:
    
        if (r9 != r3) goto L217;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x107b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x101d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x117b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x1197  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x1104  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x11a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x1223  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x11b2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x11c0  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0cc5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0c67  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x11e0  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x1200  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x1211  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x11b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x11a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x119c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x1184  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x1174  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0ec7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x100e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x116b  */
    /* JADX WARN: Type inference failed for: r10v42, types: [zu4] */
    /* JADX WARN: Type inference failed for: r10v46, types: [zu4] */
    /* JADX WARN: Type inference failed for: r10v84, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v23, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v56, types: [zu4] */
    /* JADX WARN: Type inference failed for: r16v49 */
    /* JADX WARN: Type inference failed for: r16v50 */
    /* JADX WARN: Type inference failed for: r16v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v54 */
    /* JADX WARN: Type inference failed for: r17v55 */
    /* JADX WARN: Type inference failed for: r17v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v154, types: [ll1] */
    /* JADX WARN: Type inference failed for: r3v106, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v107, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v135, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v136, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v157, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v177 */
    /* JADX WARN: Type inference failed for: r3v178, types: [ql1] */
    /* JADX WARN: Type inference failed for: r3v185 */
    /* JADX WARN: Type inference failed for: r3v52, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v56, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v62, types: [zu4] */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v82, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r5v106 */
    /* JADX WARN: Type inference failed for: r5v107, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v113 */
    /* JADX WARN: Type inference failed for: r5v12, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v16, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v20, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v35, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v39, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v43, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v58, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v64, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v9, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v104 */
    /* JADX WARN: Type inference failed for: r6v105, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v106 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v67, types: [av4, com.sofascore.model.mvvm.model.Player, java.io.Serializable, java.lang.Object, zu4] */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v14, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v29, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v32, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v35, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v41, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v6, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v60, types: [zu4] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v21, types: [zu4] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [zu4] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fsf fsfVar;
        fsf fsfVar2;
        Integer num;
        fsf fsfVar3;
        Object obj2;
        Object obj3;
        int i;
        fqe fqeVar;
        av4 t;
        av4 t2;
        fsf fsfVar4;
        fsf fsfVar5;
        fsf fsfVar6;
        av4 av4Var;
        fsf fsfVar7;
        lu3 lu3Var;
        fsf fsfVar8;
        Object T;
        fsf fsfVar9;
        Object obj4;
        fsf fsfVar10;
        fsf fsfVar11;
        fqe fqeVar2;
        zu4 zu4Var;
        String str;
        fsf fsfVar12;
        int i2;
        av4 av4Var2;
        Integer num2;
        Object obj5;
        fqe fqeVar3;
        int i3;
        ?? r6;
        zu4 zu4Var2;
        fsf fsfVar13;
        fsf fsfVar14;
        fsf fsfVar15;
        fsf fsfVar16;
        fsf fsfVar17;
        Object w;
        String str2;
        fqe fqeVar4;
        int i4;
        lu3 lu3Var2;
        av4 av4Var3;
        av4 av4Var4;
        int i5;
        fsf fsfVar18;
        Integer num3;
        int i6;
        fsf fsfVar19;
        fsf fsfVar20;
        Integer num4;
        fsf fsfVar21;
        fsf fsfVar22;
        fsf fsfVar23;
        fsf fsfVar24;
        int i7;
        fsf fsfVar25;
        Object T2;
        fsf fsfVar26;
        av4 av4Var5;
        fsf fsfVar27;
        av4 av4Var6;
        EventResponse eventResponse;
        Event event;
        av4 av4Var7;
        fsf fsfVar28;
        String str3;
        lu3 lu3Var3;
        zu4 zu4Var3;
        fqe fqeVar5;
        zu4 zu4Var4;
        Object T3;
        lu3 lu3Var4;
        fsf fsfVar29;
        fsf fsfVar30;
        av4 av4Var8;
        fsf fsfVar31;
        fsf fsfVar32;
        fsf fsfVar33;
        fsf fsfVar34;
        fqe fqeVar6;
        int i8;
        mpe mpeVar;
        String str4;
        fqe fqeVar7;
        av4 av4Var9;
        Object T4;
        lu3 lu3Var5;
        av4 av4Var10;
        fsf fsfVar35;
        av4 av4Var11;
        av4 av4Var12;
        av4 av4Var13;
        fsf fsfVar36;
        String str5;
        Object T5;
        lu3 lu3Var6;
        fsf fsfVar37;
        fsf fsfVar38;
        fsf fsfVar39;
        fsf fsfVar40;
        fsf fsfVar41;
        Object T6;
        lu3 lu3Var7;
        fsf fsfVar42;
        ?? r8;
        lu3 lu3Var8;
        fsf fsfVar43;
        av4 av4Var14;
        fsf fsfVar44;
        lu3 lu3Var9;
        av4 av4Var15;
        fsf fsfVar45;
        av4 av4Var16;
        fsf fsfVar46;
        FootballShotmapResponse footballShotmapResponse;
        fsf fsfVar47;
        Object T7;
        fsf fsfVar48;
        fsf fsfVar49;
        av4 av4Var17;
        fsf fsfVar50;
        ?? r82;
        fsf fsfVar51;
        av4 av4Var18;
        Object T8;
        fsf fsfVar52;
        fsf fsfVar53;
        zu4 zu4Var5;
        fsf fsfVar54;
        fsf fsfVar55;
        av4 av4Var19;
        av4 av4Var20;
        av4 av4Var21;
        Integer num5;
        int i9;
        String str6;
        int i10;
        Integer num6;
        String str7;
        int i11;
        Player player;
        Object T9;
        Integer num7;
        Integer num8;
        fsf fsfVar56;
        int i12;
        fsf fsfVar57;
        fsf fsfVar58;
        int i13;
        int i14;
        fsf fsfVar59;
        Player player2;
        int i15;
        fqe fqeVar8;
        String str8;
        Player player3;
        fsf fsfVar60;
        Object obj6;
        av4 av4Var22;
        int i16;
        int i17;
        Object T10;
        av4 av4Var23;
        av4 av4Var24;
        fsf fsfVar61;
        av4 av4Var25;
        lu3 lu3Var10;
        fsf fsfVar62;
        fsf fsfVar63;
        fsf fsfVar64;
        Object T11;
        fsf fsfVar65;
        fsf fsfVar66;
        fsf fsfVar67;
        fsf fsfVar68;
        fsf fsfVar69;
        fsf fsfVar70;
        av4 av4Var26;
        fsf fsfVar71;
        fsf fsfVar72;
        Object T12;
        fsf fsfVar73;
        av4 av4Var27;
        EventIncidentsResponse eventIncidentsResponse;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i18;
        Incident.SubstitutionIncident substitutionIncident;
        Object obj7;
        Incident.SubstitutionIncident substitutionIncident2;
        int i19;
        Object T13;
        Incident.SubstitutionIncident substitutionIncident3;
        Incident.SubstitutionIncident substitutionIncident4;
        Iterator it;
        List<Incident> incidents;
        boolean z;
        Incident.SubstitutionIncident substitutionIncident5;
        fsf fsfVar74;
        Incident.SubstitutionIncident substitutionIncident6;
        String str9;
        fsf fsfVar75;
        PlayerEventStatisticsResponse playerEventStatisticsResponse;
        boolean z2;
        fsf fsfVar76;
        fsf fsfVar77;
        int i20;
        fsf fsfVar78;
        fsf fsfVar79;
        PlayerEventStatisticsResponse playerEventStatisticsResponse2;
        Object T14;
        Player player4;
        int i21;
        fsf fsfVar80;
        fsf fsfVar81;
        int i22;
        PlayerEventStatisticsResponse playerEventStatisticsResponse3;
        String str10;
        fsf fsfVar82;
        int i23;
        boolean z3;
        ppe ppeVar;
        fqe fqeVar9;
        kl1 kl1Var;
        fqe fqeVar10;
        ppe ppeVar2;
        mpe mpeVar2;
        Object T15;
        fqe fqeVar11;
        ppe ppeVar3;
        fsf fsfVar83;
        xbb xbbVar;
        int i24;
        int i25;
        boolean z4;
        Player player5;
        fsf fsfVar84;
        boolean c;
        ?? r62;
        vl1 vl1Var;
        jl1 jl1Var;
        nl1 b;
        vl1 vl1Var2;
        jl1 jl1Var2;
        nl1 a;
        ku3 ku3Var = (ku3) this.R;
        lu3 lu3Var11 = lu3.a;
        int i26 = this.Q;
        Integer num9 = this.U;
        String str11 = this.S;
        int i27 = this.Y;
        int i28 = this.T;
        fqe fqeVar12 = this.X;
        rq3 rq3Var = null;
        switch (i26) {
            case 0:
                y6a.M(obj);
                fsf fsfVar85 = new fsf();
                fsfVar = new fsf();
                fsfVar2 = new fsf();
                fsf fsfVar86 = new fsf();
                fsf fsfVar87 = new fsf();
                num = num9;
                fsfVar3 = new fsf();
                obj2 = Sports.BASEBALL;
                fsf fsfVar88 = new fsf();
                obj3 = "G";
                fsf fsfVar89 = new fsf();
                i = i27;
                av4 t3 = xw3.t(ku3Var, null, new aqe(i28, i, 6, rq3Var, fqeVar12), 3);
                fqeVar = fqeVar12;
                anc ancVar = new anc(fqeVar, i28, str11, rq3Var, 6);
                i28 = i28;
                t = xw3.t(ku3Var, null, ancVar, 3);
                t2 = xw3.t(ku3Var, null, new bqe(fqeVar, i28, rq3Var, 0), 3);
                if (Intrinsics.c(str11, Sports.FOOTBALL) && ((num != null && i28 == num.intValue()) || num == null)) {
                    this.R = ku3Var;
                    this.r = fsfVar85;
                    this.s = fsfVar;
                    this.t = fsfVar2;
                    this.u = fsfVar86;
                    this.v = fsfVar87;
                    this.w = fsfVar3;
                    fsfVar6 = fsfVar88;
                    this.x = fsfVar6;
                    fsfVar4 = fsfVar89;
                    this.y = fsfVar4;
                    av4Var = t3;
                    this.z = av4Var;
                    this.A = t;
                    this.B = t2;
                    this.Q = 1;
                    T = t2.T(this);
                    fsfVar7 = fsfVar85;
                    lu3Var = lu3Var11;
                    if (T != lu3Var) {
                        fsfVar8 = fsfVar87;
                        fsfVar9 = fsfVar86;
                        eventResponse = (EventResponse) yaa.x((x2g) T);
                        if (fkf.F((eventResponse != null || (event = eventResponse.getEvent()) == null) ? null : Boolean.valueOf(ok3.C(event)))) {
                            fsfVar5 = fsfVar9;
                            av4 av4Var28 = t2;
                            fsf fsfVar90 = fsfVar5;
                            fsfVar4 = fsfVar4;
                            obj4 = Sports.FOOTBALL;
                            fsfVar10 = fsfVar90;
                            fsfVar11 = fsfVar8;
                            t2 = av4Var28;
                            fqeVar2 = fqeVar;
                            zu4Var = null;
                            str = str11;
                            fsfVar12 = fsfVar7;
                            i2 = i28;
                            av4Var2 = t;
                            num2 = this.V;
                            if (num2 == null) {
                            }
                        } else {
                            av4 t4 = xw3.t(ku3Var, null, new bqe(fqeVar, i28, null, 1), 3);
                            fsfVar10 = fsfVar9;
                            obj4 = Sports.FOOTBALL;
                            fsfVar11 = fsfVar8;
                            fsfVar = fsfVar;
                            fqeVar2 = fqeVar;
                            zu4Var = t4;
                            str = str11;
                            fsfVar12 = fsfVar7;
                            i2 = i28;
                            av4Var2 = t;
                            num2 = this.V;
                            if (num2 == null) {
                            }
                        }
                    }
                    return lu3Var;
                }
                fsfVar4 = fsfVar89;
                fsfVar5 = fsfVar86;
                fsfVar6 = fsfVar88;
                av4Var = t3;
                fsfVar7 = fsfVar85;
                lu3Var = lu3Var11;
                fsfVar8 = fsfVar87;
                av4 av4Var282 = t2;
                fsf fsfVar902 = fsfVar5;
                fsfVar4 = fsfVar4;
                obj4 = Sports.FOOTBALL;
                fsfVar10 = fsfVar902;
                fsfVar11 = fsfVar8;
                t2 = av4Var282;
                fqeVar2 = fqeVar;
                zu4Var = null;
                str = str11;
                fsfVar12 = fsfVar7;
                i2 = i28;
                av4Var2 = t;
                num2 = this.V;
                if (num2 == null) {
                    this.R = ku3Var;
                    this.r = fsfVar12;
                    this.s = fsfVar;
                    this.t = fsfVar2;
                    this.u = fsfVar10;
                    this.v = fsfVar11;
                    this.w = fsfVar3;
                    this.x = fsfVar6;
                    this.y = fsfVar4;
                    this.z = av4Var;
                    this.A = av4Var2;
                    this.B = null;
                    this.C = zu4Var;
                    this.Q = 2;
                    T2 = t2.T(this);
                    if (T2 != lu3Var) {
                        av4 av4Var29 = av4Var;
                        fsfVar26 = fsfVar3;
                        av4Var5 = av4Var29;
                        fsfVar27 = fsfVar6;
                        av4Var6 = av4Var2;
                        EventResponse eventResponse2 = (EventResponse) yaa.x((x2g) T2);
                        Event event2 = eventResponse2 == null ? eventResponse2.getEvent() : null;
                        switch (str.hashCode()) {
                            case -2002238939:
                                av4Var7 = av4Var6;
                                fsfVar28 = fsfVar26;
                                i3 = i;
                                obj5 = obj4;
                                str3 = str;
                                lu3Var3 = lu3Var;
                                zu4Var3 = zu4Var;
                                fqeVar5 = fqeVar2;
                                if (str3.equals(Sports.ICE_HOCKEY)) {
                                    av4 t5 = xw3.t(ku3Var, null, new gz6(fqeVar5, this.T, this.Y, event2, (rq3) null, 7), 3);
                                    this.R = null;
                                    this.r = fsfVar12;
                                    this.s = fsfVar;
                                    this.t = fsfVar2;
                                    this.u = fsfVar10;
                                    this.v = fsfVar11;
                                    this.w = fsfVar28;
                                    this.x = fsfVar27;
                                    this.y = fsfVar4;
                                    this.z = av4Var5;
                                    av4Var6 = av4Var7;
                                    this.A = av4Var6;
                                    this.B = null;
                                    zu4Var4 = zu4Var3;
                                    this.C = zu4Var4;
                                    this.D = null;
                                    this.E = null;
                                    this.F = fsfVar11;
                                    this.Q = 8;
                                    T3 = t5.T(this);
                                    lu3Var4 = lu3Var3;
                                    if (T3 == lu3Var4) {
                                        return lu3Var4;
                                    }
                                    fsfVar29 = fsfVar10;
                                    fsfVar30 = fsfVar2;
                                    av4Var8 = av4Var5;
                                    fsfVar31 = fsfVar28;
                                    fsfVar32 = fsfVar4;
                                    fsfVar33 = fsfVar27;
                                    fsfVar34 = fsfVar11;
                                    fsfVar11.a = T3;
                                    fsfVar27 = fsfVar33;
                                    fsfVar11 = fsfVar34;
                                    fsfVar28 = fsfVar31;
                                    fsfVar4 = fsfVar32;
                                    fsfVar10 = fsfVar29;
                                    av4Var5 = av4Var8;
                                    fsfVar2 = fsfVar30;
                                    Unit unit = Unit.a;
                                    fsfVar13 = fsfVar12;
                                    fqeVar3 = fqeVar5;
                                    lu3Var = lu3Var4;
                                    zu4Var2 = zu4Var4;
                                    str = str3;
                                    fsfVar14 = fsfVar10;
                                    av4Var2 = av4Var6;
                                    av4Var = av4Var5;
                                    fsfVar3 = fsfVar28;
                                    r6 = 0;
                                    fsfVar15 = fsfVar11;
                                    fsfVar16 = fsfVar2;
                                    fsfVar17 = fsfVar27;
                                    this.R = r6;
                                    this.r = fsfVar13;
                                    this.s = fsfVar;
                                    this.t = fsfVar16;
                                    this.u = fsfVar14;
                                    this.v = fsfVar15;
                                    this.w = fsfVar3;
                                    this.x = fsfVar17;
                                    this.y = fsfVar4;
                                    this.z = av4Var;
                                    this.A = r6;
                                    this.B = r6;
                                    this.C = zu4Var2;
                                    this.D = r6;
                                    this.E = r6;
                                    this.F = r6;
                                    this.G = r6;
                                    this.H = r6;
                                    this.I = r6;
                                    this.J = r6;
                                    this.Q = 13;
                                    T12 = av4Var2.T(this);
                                    if (T12 != lu3Var) {
                                        fsfVar73 = fsfVar16;
                                        eventIncidentsResponse = (EventIncidentsResponse) yaa.x((x2g) T12);
                                        if (eventIncidentsResponse != null || (incidents = eventIncidentsResponse.getIncidents()) == null) {
                                            arrayList = null;
                                        } else {
                                            arrayList = new ArrayList();
                                            for (Object obj8 : incidents) {
                                                if (obj8 instanceof Incident.SubstitutionIncident) {
                                                    arrayList.add(obj8);
                                                }
                                            }
                                        }
                                        str11 = str;
                                        Object obj9 = obj5;
                                        if (arrayList != null) {
                                            ArrayList arrayList3 = Intrinsics.c(str11, obj9) ? arrayList : null;
                                            if (arrayList3 != null) {
                                                Iterator it2 = arrayList3.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        substitutionIncident4 = it2.next();
                                                        Player playerIn = ((Incident.SubstitutionIncident) substitutionIncident4).getPlayerIn();
                                                        arrayList2 = arrayList;
                                                        if (playerIn != null) {
                                                            int id = playerIn.getId();
                                                            it = it2;
                                                            i18 = i3;
                                                            if (id == i18) {
                                                            }
                                                        } else {
                                                            it = it2;
                                                            i18 = i3;
                                                        }
                                                        arrayList = arrayList2;
                                                        i3 = i18;
                                                        it2 = it;
                                                    } else {
                                                        arrayList2 = arrayList;
                                                        i18 = i3;
                                                        substitutionIncident4 = 0;
                                                    }
                                                }
                                                substitutionIncident = substitutionIncident4;
                                                if (arrayList2 != null) {
                                                    ArrayList arrayList4 = Intrinsics.c(str11, obj9) ? arrayList2 : null;
                                                    if (arrayList4 != null) {
                                                        Iterator it3 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                substitutionIncident3 = it3.next();
                                                                Player playerOut = ((Incident.SubstitutionIncident) substitutionIncident3).getPlayerOut();
                                                                obj7 = obj9;
                                                                if (playerOut == null || playerOut.getId() != i18) {
                                                                    obj9 = obj7;
                                                                }
                                                            } else {
                                                                obj7 = obj9;
                                                                substitutionIncident3 = 0;
                                                            }
                                                        }
                                                        substitutionIncident2 = substitutionIncident3;
                                                        i19 = i18;
                                                        this.R = null;
                                                        this.r = fsfVar13;
                                                        this.s = fsfVar;
                                                        this.t = fsfVar73;
                                                        this.u = fsfVar14;
                                                        this.v = fsfVar15;
                                                        this.w = fsfVar3;
                                                        this.x = fsfVar17;
                                                        this.y = fsfVar4;
                                                        this.z = null;
                                                        this.A = null;
                                                        this.B = null;
                                                        this.C = zu4Var2;
                                                        this.D = null;
                                                        this.E = substitutionIncident;
                                                        this.F = substitutionIncident2;
                                                        this.Q = 14;
                                                        T13 = av4Var.T(this);
                                                        break;
                                                    }
                                                }
                                                obj7 = obj9;
                                                substitutionIncident2 = null;
                                                i19 = i18;
                                                this.R = null;
                                                this.r = fsfVar13;
                                                this.s = fsfVar;
                                                this.t = fsfVar73;
                                                this.u = fsfVar14;
                                                this.v = fsfVar15;
                                                this.w = fsfVar3;
                                                this.x = fsfVar17;
                                                this.y = fsfVar4;
                                                this.z = null;
                                                this.A = null;
                                                this.B = null;
                                                this.C = zu4Var2;
                                                this.D = null;
                                                this.E = substitutionIncident;
                                                this.F = substitutionIncident2;
                                                this.Q = 14;
                                                T13 = av4Var.T(this);
                                            }
                                        }
                                        arrayList2 = arrayList;
                                        i18 = i3;
                                        substitutionIncident = null;
                                        if (arrayList2 != null) {
                                        }
                                        obj7 = obj9;
                                        substitutionIncident2 = null;
                                        i19 = i18;
                                        this.R = null;
                                        this.r = fsfVar13;
                                        this.s = fsfVar;
                                        this.t = fsfVar73;
                                        this.u = fsfVar14;
                                        this.v = fsfVar15;
                                        this.w = fsfVar3;
                                        this.x = fsfVar17;
                                        this.y = fsfVar4;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = zu4Var2;
                                        this.D = null;
                                        this.E = substitutionIncident;
                                        this.F = substitutionIncident2;
                                        this.Q = 14;
                                        T13 = av4Var.T(this);
                                    }
                                }
                                lu3Var4 = lu3Var3;
                                zu4Var4 = zu4Var3;
                                av4Var6 = av4Var7;
                                Unit unit2 = Unit.a;
                                fsfVar13 = fsfVar12;
                                fqeVar3 = fqeVar5;
                                lu3Var = lu3Var4;
                                zu4Var2 = zu4Var4;
                                str = str3;
                                fsfVar14 = fsfVar10;
                                av4Var2 = av4Var6;
                                av4Var = av4Var5;
                                fsfVar3 = fsfVar28;
                                r6 = 0;
                                fsfVar15 = fsfVar11;
                                fsfVar16 = fsfVar2;
                                fsfVar17 = fsfVar27;
                                this.R = r6;
                                this.r = fsfVar13;
                                this.s = fsfVar;
                                this.t = fsfVar16;
                                this.u = fsfVar14;
                                this.v = fsfVar15;
                                this.w = fsfVar3;
                                this.x = fsfVar17;
                                this.y = fsfVar4;
                                this.z = av4Var;
                                this.A = r6;
                                this.B = r6;
                                this.C = zu4Var2;
                                this.D = r6;
                                this.E = r6;
                                this.F = r6;
                                this.G = r6;
                                this.H = r6;
                                this.I = r6;
                                this.J = r6;
                                this.Q = 13;
                                T12 = av4Var2.T(this);
                                if (T12 != lu3Var) {
                                }
                                break;
                            case -1721090992:
                                fsfVar28 = fsfVar26;
                                i3 = i;
                                fqe fqeVar13 = fqeVar2;
                                obj5 = obj4;
                                str3 = str;
                                lu3 lu3Var12 = lu3Var;
                                Object obj10 = obj2;
                                if (str3.equals(obj10)) {
                                    obj2 = obj10;
                                    lu3Var3 = lu3Var12;
                                    av4 av4Var30 = fqeVar13.z;
                                    zu4Var3 = zu4Var;
                                    if (av4Var30 != null) {
                                        av4Var30.e(null);
                                        Unit unit3 = Unit.a;
                                    }
                                    mpe mpeVar3 = fqeVar13.A;
                                    if (mpeVar3 != null) {
                                        fqeVar6 = fqeVar13;
                                        i8 = i3;
                                        if (mpeVar3.a == i8) {
                                            mpeVar = mpeVar3;
                                            i3 = i8;
                                            av4Var7 = av4Var6;
                                            fqeVar5 = fqeVar6;
                                            fqeVar5.z = xw3.t(ku3Var, null, new zb9(mpeVar, this.Y, fqeVar6, this.T, null), 3);
                                        }
                                    } else {
                                        fqeVar6 = fqeVar13;
                                        i8 = i3;
                                    }
                                    mpeVar = null;
                                    i3 = i8;
                                    av4Var7 = av4Var6;
                                    fqeVar5 = fqeVar6;
                                    fqeVar5.z = xw3.t(ku3Var, null, new zb9(mpeVar, this.Y, fqeVar6, this.T, null), 3);
                                } else {
                                    obj2 = obj10;
                                    av4Var7 = av4Var6;
                                    zu4Var3 = zu4Var;
                                    lu3Var3 = lu3Var12;
                                    fqeVar5 = fqeVar13;
                                }
                                lu3Var4 = lu3Var3;
                                zu4Var4 = zu4Var3;
                                av4Var6 = av4Var7;
                                Unit unit22 = Unit.a;
                                fsfVar13 = fsfVar12;
                                fqeVar3 = fqeVar5;
                                lu3Var = lu3Var4;
                                zu4Var2 = zu4Var4;
                                str = str3;
                                fsfVar14 = fsfVar10;
                                av4Var2 = av4Var6;
                                av4Var = av4Var5;
                                fsfVar3 = fsfVar28;
                                r6 = 0;
                                fsfVar15 = fsfVar11;
                                fsfVar16 = fsfVar2;
                                fsfVar17 = fsfVar27;
                                this.R = r6;
                                this.r = fsfVar13;
                                this.s = fsfVar;
                                this.t = fsfVar16;
                                this.u = fsfVar14;
                                this.v = fsfVar15;
                                this.w = fsfVar3;
                                this.x = fsfVar17;
                                this.y = fsfVar4;
                                this.z = av4Var;
                                this.A = r6;
                                this.B = r6;
                                this.C = zu4Var2;
                                this.D = r6;
                                this.E = r6;
                                this.F = r6;
                                this.G = r6;
                                this.H = r6;
                                this.I = r6;
                                this.J = r6;
                                this.Q = 13;
                                T12 = av4Var2.T(this);
                                if (T12 != lu3Var) {
                                }
                                break;
                            case 394668909:
                                fsfVar28 = fsfVar26;
                                Object obj11 = obj4;
                                lu3 lu3Var13 = lu3Var;
                                String str12 = str;
                                if (str12.equals(obj11)) {
                                    int i29 = i2;
                                    str4 = str12;
                                    obj5 = obj11;
                                    rq3 rq3Var2 = null;
                                    av4 t6 = xw3.t(ku3Var, null, new aqe(i29, i, 3, rq3Var2, fqeVar2), 3);
                                    av4 t7 = xw3.t(ku3Var, null, new aqe(i29, i, 5, rq3Var2, fqeVar2), 3);
                                    rq3 rq3Var3 = null;
                                    av4 p = yaa.p(ku3Var, Intrinsics.c(this.W, obj3), new aqe(i29, i, 2, rq3Var3, fqeVar2));
                                    i3 = i;
                                    fqeVar7 = fqeVar2;
                                    av4 t8 = xw3.t(ku3Var, null, new aqe(i29, i, 4, rq3Var3, fqeVar2), 3);
                                    this.R = null;
                                    this.r = fsfVar12;
                                    this.s = fsfVar;
                                    this.t = fsfVar2;
                                    this.u = fsfVar10;
                                    this.v = fsfVar11;
                                    this.w = fsfVar28;
                                    this.x = fsfVar27;
                                    this.y = fsfVar4;
                                    this.z = av4Var5;
                                    this.A = av4Var6;
                                    this.B = null;
                                    this.C = zu4Var;
                                    this.D = null;
                                    this.E = null;
                                    this.F = t7;
                                    av4Var9 = p;
                                    this.G = av4Var9;
                                    this.H = t8;
                                    this.I = fsfVar12;
                                    this.Q = 3;
                                    T4 = t6.T(this);
                                    lu3Var = lu3Var13;
                                    if (T4 != lu3Var) {
                                        lu3Var5 = lu3Var;
                                        av4Var10 = av4Var5;
                                        fsfVar35 = fsfVar4;
                                        av4Var11 = t7;
                                        av4Var12 = av4Var6;
                                        av4Var13 = t8;
                                        fsfVar36 = fsfVar12;
                                        fsfVar36.a = T4;
                                        this.R = null;
                                        this.r = fsfVar12;
                                        this.s = fsfVar;
                                        this.t = fsfVar2;
                                        this.u = fsfVar10;
                                        this.v = fsfVar11;
                                        this.w = fsfVar28;
                                        this.x = fsfVar27;
                                        this.y = fsfVar35;
                                        this.z = av4Var10;
                                        this.A = av4Var12;
                                        this.B = null;
                                        this.C = zu4Var;
                                        this.D = null;
                                        this.E = null;
                                        this.F = null;
                                        this.G = av4Var9;
                                        this.H = av4Var13;
                                        this.I = fsfVar2;
                                        this.Q = 4;
                                        T6 = av4Var11.T(this);
                                        lu3Var7 = lu3Var5;
                                        if (T6 != lu3Var7) {
                                            return lu3Var7;
                                        }
                                        av4 av4Var31 = av4Var12;
                                        fsfVar42 = fsfVar35;
                                        r8 = av4Var31;
                                        lu3Var8 = lu3Var7;
                                        fsfVar43 = fsfVar28;
                                        av4Var14 = av4Var10;
                                        fsfVar44 = fsfVar2;
                                        fsfVar2.a = T6;
                                        if (av4Var9 == null) {
                                            this.R = null;
                                            this.r = fsfVar12;
                                            this.s = fsfVar;
                                            this.t = fsfVar44;
                                            this.u = fsfVar10;
                                            this.v = fsfVar11;
                                            this.w = fsfVar43;
                                            this.x = fsfVar27;
                                            this.y = fsfVar42;
                                            this.z = av4Var14;
                                            this.A = r8;
                                            this.B = null;
                                            this.C = zu4Var;
                                            this.D = null;
                                            this.E = null;
                                            this.F = null;
                                            this.G = null;
                                            this.H = av4Var13;
                                            this.I = fsfVar10;
                                            this.Q = 5;
                                            T7 = av4Var9.T(this);
                                            lu3Var9 = lu3Var8;
                                            if (T7 == lu3Var9) {
                                                return lu3Var9;
                                            }
                                            fsfVar48 = fsfVar10;
                                            fsfVar49 = fsfVar48;
                                            av4Var17 = r8;
                                            fsfVar50 = fsfVar11;
                                            r82 = av4Var14;
                                            fsfVar51 = fsfVar42;
                                            FootballShotmapResponse footballShotmapResponse2 = (FootballShotmapResponse) T7;
                                            fsfVar42 = fsfVar51;
                                            fsfVar45 = fsfVar43;
                                            fsfVar46 = fsfVar50;
                                            footballShotmapResponse = footballShotmapResponse2;
                                            fsfVar10 = fsfVar49;
                                            av4Var18 = r82;
                                            av4Var16 = av4Var13;
                                            fsfVar47 = fsfVar48;
                                            av4Var15 = av4Var17;
                                            fsfVar47.a = footballShotmapResponse;
                                            this.R = null;
                                            this.r = fsfVar12;
                                            this.s = fsfVar;
                                            this.t = fsfVar44;
                                            this.u = fsfVar10;
                                            this.v = fsfVar46;
                                            this.w = fsfVar45;
                                            this.x = fsfVar27;
                                            this.y = fsfVar42;
                                            this.z = av4Var18;
                                            this.A = av4Var15;
                                            this.B = null;
                                            this.C = zu4Var;
                                            this.D = null;
                                            this.E = null;
                                            this.F = null;
                                            this.G = null;
                                            this.H = null;
                                            this.I = fsfVar45;
                                            this.Q = 6;
                                            T8 = av4Var16.T(this);
                                            if (T8 == lu3Var9) {
                                                return lu3Var9;
                                            }
                                            fsfVar52 = fsfVar44;
                                            fsfVar53 = fsfVar10;
                                            zu4Var5 = zu4Var;
                                            fsfVar54 = fsfVar42;
                                            fsfVar55 = fsfVar45;
                                            av4Var20 = av4Var15;
                                            av4Var19 = av4Var18;
                                            fsfVar45.a = T8;
                                            av4Var6 = av4Var20;
                                            fsfVar4 = fsfVar54;
                                            av4Var5 = av4Var19;
                                            fsfVar28 = fsfVar55;
                                            lu3Var4 = lu3Var9;
                                            fsfVar11 = fsfVar46;
                                            fsfVar10 = fsfVar53;
                                            fsfVar2 = fsfVar52;
                                            str3 = str4;
                                            zu4Var4 = zu4Var5;
                                            fqeVar5 = fqeVar7;
                                            Unit unit222 = Unit.a;
                                            fsfVar13 = fsfVar12;
                                            fqeVar3 = fqeVar5;
                                            lu3Var = lu3Var4;
                                            zu4Var2 = zu4Var4;
                                            str = str3;
                                            fsfVar14 = fsfVar10;
                                            av4Var2 = av4Var6;
                                            av4Var = av4Var5;
                                            fsfVar3 = fsfVar28;
                                            r6 = 0;
                                            fsfVar15 = fsfVar11;
                                            fsfVar16 = fsfVar2;
                                            fsfVar17 = fsfVar27;
                                            this.R = r6;
                                            this.r = fsfVar13;
                                            this.s = fsfVar;
                                            this.t = fsfVar16;
                                            this.u = fsfVar14;
                                            this.v = fsfVar15;
                                            this.w = fsfVar3;
                                            this.x = fsfVar17;
                                            this.y = fsfVar4;
                                            this.z = av4Var;
                                            this.A = r6;
                                            this.B = r6;
                                            this.C = zu4Var2;
                                            this.D = r6;
                                            this.E = r6;
                                            this.F = r6;
                                            this.G = r6;
                                            this.H = r6;
                                            this.I = r6;
                                            this.J = r6;
                                            this.Q = 13;
                                            T12 = av4Var2.T(this);
                                            if (T12 != lu3Var) {
                                            }
                                        } else {
                                            lu3Var9 = lu3Var8;
                                            av4Var15 = r8;
                                            fsfVar45 = fsfVar43;
                                            av4Var16 = av4Var13;
                                            fsfVar46 = fsfVar11;
                                            footballShotmapResponse = null;
                                            fsfVar47 = fsfVar10;
                                            av4Var18 = av4Var14;
                                            fsfVar47.a = footballShotmapResponse;
                                            this.R = null;
                                            this.r = fsfVar12;
                                            this.s = fsfVar;
                                            this.t = fsfVar44;
                                            this.u = fsfVar10;
                                            this.v = fsfVar46;
                                            this.w = fsfVar45;
                                            this.x = fsfVar27;
                                            this.y = fsfVar42;
                                            this.z = av4Var18;
                                            this.A = av4Var15;
                                            this.B = null;
                                            this.C = zu4Var;
                                            this.D = null;
                                            this.E = null;
                                            this.F = null;
                                            this.G = null;
                                            this.H = null;
                                            this.I = fsfVar45;
                                            this.Q = 6;
                                            T8 = av4Var16.T(this);
                                            if (T8 == lu3Var9) {
                                            }
                                        }
                                    }
                                } else {
                                    av4Var7 = av4Var6;
                                    zu4Var3 = zu4Var;
                                    lu3Var3 = lu3Var13;
                                    obj5 = obj11;
                                    i3 = i;
                                    str3 = str12;
                                    fqeVar5 = fqeVar2;
                                    lu3Var4 = lu3Var3;
                                    zu4Var4 = zu4Var3;
                                    av4Var6 = av4Var7;
                                    Unit unit2222 = Unit.a;
                                    fsfVar13 = fsfVar12;
                                    fqeVar3 = fqeVar5;
                                    lu3Var = lu3Var4;
                                    zu4Var2 = zu4Var4;
                                    str = str3;
                                    fsfVar14 = fsfVar10;
                                    av4Var2 = av4Var6;
                                    av4Var = av4Var5;
                                    fsfVar3 = fsfVar28;
                                    r6 = 0;
                                    fsfVar15 = fsfVar11;
                                    fsfVar16 = fsfVar2;
                                    fsfVar17 = fsfVar27;
                                    this.R = r6;
                                    this.r = fsfVar13;
                                    this.s = fsfVar;
                                    this.t = fsfVar16;
                                    this.u = fsfVar14;
                                    this.v = fsfVar15;
                                    this.w = fsfVar3;
                                    this.x = fsfVar17;
                                    this.y = fsfVar4;
                                    this.z = av4Var;
                                    this.A = r6;
                                    this.B = r6;
                                    this.C = zu4Var2;
                                    this.D = r6;
                                    this.E = r6;
                                    this.F = r6;
                                    this.G = r6;
                                    this.H = r6;
                                    this.I = r6;
                                    this.J = r6;
                                    this.Q = 13;
                                    T12 = av4Var2.T(this);
                                    if (T12 != lu3Var) {
                                    }
                                }
                                break;
                            case 727149765:
                                str3 = str;
                                if (str3.equals(Sports.BASKETBALL)) {
                                    fsf fsfVar91 = fsfVar26;
                                    str5 = str3;
                                    av4 t9 = xw3.t(ku3Var, null, new aqe(i2, i, 1, null, fqeVar2), 3);
                                    this.R = null;
                                    this.r = fsfVar12;
                                    this.s = fsfVar;
                                    this.t = fsfVar2;
                                    this.u = fsfVar10;
                                    this.v = fsfVar11;
                                    this.w = fsfVar91;
                                    this.x = fsfVar27;
                                    this.y = fsfVar4;
                                    this.z = av4Var5;
                                    this.A = av4Var6;
                                    this.B = null;
                                    this.C = zu4Var;
                                    this.D = null;
                                    this.E = null;
                                    this.F = fsfVar;
                                    this.Q = 7;
                                    T5 = t9.T(this);
                                    lu3Var6 = lu3Var;
                                    if (T5 == lu3Var6) {
                                        return lu3Var6;
                                    }
                                    fsfVar37 = fsfVar10;
                                    fsfVar38 = fsfVar;
                                    fsfVar39 = fsfVar11;
                                    fsfVar40 = fsfVar91;
                                    fsfVar41 = fsfVar27;
                                    fsfVar.a = T5;
                                    lu3 lu3Var14 = lu3Var6;
                                    zu4Var4 = zu4Var;
                                    lu3Var4 = lu3Var14;
                                    fsfVar27 = fsfVar41;
                                    fsfVar11 = fsfVar39;
                                    i3 = i;
                                    fqeVar5 = fqeVar2;
                                    fsfVar = fsfVar38;
                                    obj5 = obj4;
                                    str3 = str5;
                                    fsfVar28 = fsfVar40;
                                    fsfVar10 = fsfVar37;
                                    Unit unit22222 = Unit.a;
                                    fsfVar13 = fsfVar12;
                                    fqeVar3 = fqeVar5;
                                    lu3Var = lu3Var4;
                                    zu4Var2 = zu4Var4;
                                    str = str3;
                                    fsfVar14 = fsfVar10;
                                    av4Var2 = av4Var6;
                                    av4Var = av4Var5;
                                    fsfVar3 = fsfVar28;
                                    r6 = 0;
                                    fsfVar15 = fsfVar11;
                                    fsfVar16 = fsfVar2;
                                    fsfVar17 = fsfVar27;
                                    this.R = r6;
                                    this.r = fsfVar13;
                                    this.s = fsfVar;
                                    this.t = fsfVar16;
                                    this.u = fsfVar14;
                                    this.v = fsfVar15;
                                    this.w = fsfVar3;
                                    this.x = fsfVar17;
                                    this.y = fsfVar4;
                                    this.z = av4Var;
                                    this.A = r6;
                                    this.B = r6;
                                    this.C = zu4Var2;
                                    this.D = r6;
                                    this.E = r6;
                                    this.F = r6;
                                    this.G = r6;
                                    this.H = r6;
                                    this.I = r6;
                                    this.J = r6;
                                    this.Q = 13;
                                    T12 = av4Var2.T(this);
                                    if (T12 != lu3Var) {
                                    }
                                } else {
                                    av4Var7 = av4Var6;
                                    zu4Var3 = zu4Var;
                                    fsfVar28 = fsfVar26;
                                    i3 = i;
                                    obj5 = obj4;
                                    lu3Var3 = lu3Var;
                                    fqeVar5 = fqeVar2;
                                    lu3Var4 = lu3Var3;
                                    zu4Var4 = zu4Var3;
                                    av4Var6 = av4Var7;
                                    Unit unit222222 = Unit.a;
                                    fsfVar13 = fsfVar12;
                                    fqeVar3 = fqeVar5;
                                    lu3Var = lu3Var4;
                                    zu4Var2 = zu4Var4;
                                    str = str3;
                                    fsfVar14 = fsfVar10;
                                    av4Var2 = av4Var6;
                                    av4Var = av4Var5;
                                    fsfVar3 = fsfVar28;
                                    r6 = 0;
                                    fsfVar15 = fsfVar11;
                                    fsfVar16 = fsfVar2;
                                    fsfVar17 = fsfVar27;
                                    this.R = r6;
                                    this.r = fsfVar13;
                                    this.s = fsfVar;
                                    this.t = fsfVar16;
                                    this.u = fsfVar14;
                                    this.v = fsfVar15;
                                    this.w = fsfVar3;
                                    this.x = fsfVar17;
                                    this.y = fsfVar4;
                                    this.z = av4Var;
                                    this.A = r6;
                                    this.B = r6;
                                    this.C = zu4Var2;
                                    this.D = r6;
                                    this.E = r6;
                                    this.F = r6;
                                    this.G = r6;
                                    this.H = r6;
                                    this.I = r6;
                                    this.J = r6;
                                    this.Q = 13;
                                    T12 = av4Var2.T(this);
                                    if (T12 != lu3Var) {
                                    }
                                }
                                break;
                            default:
                                av4Var7 = av4Var6;
                                fsfVar28 = fsfVar26;
                                i3 = i;
                                obj5 = obj4;
                                str3 = str;
                                lu3Var3 = lu3Var;
                                zu4Var3 = zu4Var;
                                fqeVar5 = fqeVar2;
                                lu3Var4 = lu3Var3;
                                zu4Var4 = zu4Var3;
                                av4Var6 = av4Var7;
                                Unit unit2222222 = Unit.a;
                                fsfVar13 = fsfVar12;
                                fqeVar3 = fqeVar5;
                                lu3Var = lu3Var4;
                                zu4Var2 = zu4Var4;
                                str = str3;
                                fsfVar14 = fsfVar10;
                                av4Var2 = av4Var6;
                                av4Var = av4Var5;
                                fsfVar3 = fsfVar28;
                                r6 = 0;
                                fsfVar15 = fsfVar11;
                                fsfVar16 = fsfVar2;
                                fsfVar17 = fsfVar27;
                                this.R = r6;
                                this.r = fsfVar13;
                                this.s = fsfVar;
                                this.t = fsfVar16;
                                this.u = fsfVar14;
                                this.v = fsfVar15;
                                this.w = fsfVar3;
                                this.x = fsfVar17;
                                this.y = fsfVar4;
                                this.z = av4Var;
                                this.A = r6;
                                this.B = r6;
                                this.C = zu4Var2;
                                this.D = r6;
                                this.E = r6;
                                this.F = r6;
                                this.G = r6;
                                this.H = r6;
                                this.I = r6;
                                this.J = r6;
                                this.Q = 13;
                                T12 = av4Var2.T(this);
                                if (T12 != lu3Var) {
                                }
                                break;
                        }
                    }
                    return lu3Var;
                }
                int i30 = i;
                obj5 = obj4;
                lu3 lu3Var15 = lu3Var;
                fqe fqeVar14 = fqeVar2;
                if (num == null) {
                    fqeVar3 = fqeVar14;
                    fsf fsfVar92 = fsfVar6;
                    lu3Var = lu3Var15;
                    i3 = i30;
                    r6 = 0;
                    zu4Var2 = zu4Var;
                    fsfVar13 = fsfVar12;
                    fsfVar14 = fsfVar10;
                    fsfVar15 = fsfVar11;
                    fsfVar16 = fsfVar2;
                    fsfVar17 = fsfVar92;
                    this.R = r6;
                    this.r = fsfVar13;
                    this.s = fsfVar;
                    this.t = fsfVar16;
                    this.u = fsfVar14;
                    this.v = fsfVar15;
                    this.w = fsfVar3;
                    this.x = fsfVar17;
                    this.y = fsfVar4;
                    this.z = av4Var;
                    this.A = r6;
                    this.B = r6;
                    this.C = zu4Var2;
                    this.D = r6;
                    this.E = r6;
                    this.F = r6;
                    this.G = r6;
                    this.H = r6;
                    this.I = r6;
                    this.J = r6;
                    this.Q = 13;
                    T12 = av4Var2.T(this);
                    if (T12 != lu3Var) {
                    }
                    return lu3Var;
                }
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                this.R = ku3Var;
                this.r = fsfVar12;
                this.s = fsfVar;
                this.t = fsfVar2;
                this.u = fsfVar10;
                this.v = fsfVar11;
                this.w = fsfVar3;
                this.x = fsfVar6;
                this.y = fsfVar4;
                this.z = av4Var;
                this.A = av4Var2;
                this.B = null;
                this.C = zu4Var;
                this.D = fqeVar14;
                this.E = num2;
                this.F = str;
                fsf fsfVar93 = fsfVar10;
                this.G = num;
                this.H = fsfVar6;
                this.L = i2;
                this.M = i30;
                fsf fsfVar94 = fsfVar;
                this.N = intValue;
                fsf fsfVar95 = fsfVar6;
                this.O = 0;
                this.Q = 9;
                yzd yzdVar = fqe.B;
                w = fqeVar14.w(intValue, intValue2, this);
                if (w == lu3Var15) {
                    return lu3Var15;
                }
                str = str;
                str2 = str;
                fqeVar4 = fqeVar14;
                fqeVar3 = fqeVar4;
                i3 = i30;
                i4 = i3;
                lu3Var2 = lu3Var15;
                av4Var3 = av4Var;
                av4Var4 = av4Var2;
                i5 = i2;
                fsfVar18 = fsfVar95;
                num3 = num;
                i6 = 0;
                fsfVar19 = fsfVar3;
                fsfVar20 = fsfVar4;
                num4 = num2;
                fsfVar21 = fsfVar93;
                fsfVar22 = fsfVar94;
                fsfVar23 = fsfVar11;
                fsfVar16 = fsfVar2;
                fsfVar24 = fsfVar12;
                i7 = intValue;
                fsfVar25 = fsfVar18;
                fsfVar18.a = w;
                if (zu4Var == null) {
                    PlayerEventStatisticsResponse playerEventStatisticsResponse4 = (PlayerEventStatisticsResponse) fsfVar25.a;
                    if (playerEventStatisticsResponse4 != null && (player = playerEventStatisticsResponse4.getPlayer()) != null) {
                        PlayerEventStatisticsResponse playerEventStatisticsResponse5 = (PlayerEventStatisticsResponse) fsfVar25.a;
                        Integer K = (playerEventStatisticsResponse5 == null || (player3 = playerEventStatisticsResponse5.getPlayer()) == null) ? null : o02.K(player3.getId());
                        this.R = ku3Var;
                        this.r = fsfVar24;
                        this.s = fsfVar22;
                        this.t = fsfVar16;
                        this.u = fsfVar21;
                        this.v = fsfVar23;
                        this.w = fsfVar19;
                        this.x = fsfVar25;
                        this.y = fsfVar20;
                        this.z = av4Var3;
                        this.A = av4Var4;
                        av4Var21 = av4Var3;
                        this.B = null;
                        this.C = zu4Var;
                        this.D = fqeVar4;
                        Integer num10 = num4;
                        this.E = num10;
                        fqe fqeVar15 = fqeVar4;
                        String str13 = str2;
                        this.F = str13;
                        Integer num11 = num3;
                        this.G = num11;
                        num6 = num11;
                        this.H = null;
                        this.I = K;
                        this.J = player;
                        int i31 = i5;
                        this.L = i31;
                        int i32 = i4;
                        this.M = i32;
                        this.N = i7;
                        int i33 = i6;
                        this.O = i33;
                        this.Q = 10;
                        T9 = zu4Var.T(this);
                        lu3Var = lu3Var2;
                        if (T9 != lu3Var) {
                            fsf fsfVar96 = fsfVar23;
                            num7 = K;
                            num8 = num10;
                            fsfVar56 = fsfVar16;
                            i12 = i32;
                            fsfVar57 = fsfVar96;
                            fsfVar58 = fsfVar22;
                            i13 = i7;
                            i14 = i33;
                            fsfVar59 = fsfVar21;
                            player2 = player;
                            i15 = i31;
                            fqeVar8 = fqeVar15;
                            str8 = str13;
                            player2.setTopRated(Intrinsics.c(num7, T9));
                            Unit unit4 = Unit.a;
                            i4 = i12;
                            i5 = i15;
                            i11 = i14;
                            str7 = str8;
                            fqeVar4 = fqeVar8;
                            fsfVar23 = fsfVar57;
                            fsfVar21 = fsfVar59;
                            fsfVar16 = fsfVar56;
                            num5 = num8;
                            i9 = i13;
                            fsfVar22 = fsfVar58;
                            num3 = num6;
                            Unit unit5 = Unit.a;
                            lu3Var2 = lu3Var;
                            i10 = i11;
                            str6 = str7;
                            fqe fqeVar16 = fqeVar4;
                            fsfVar60 = fsfVar25;
                            obj6 = obj5;
                            av4 av4Var32 = av4Var4;
                            av4Var22 = av4Var21;
                            if (Intrinsics.c(str6, obj6)) {
                            }
                        }
                        return lu3Var;
                    }
                    av4Var21 = av4Var3;
                    num5 = num4;
                    lu3Var = lu3Var2;
                    num6 = num3;
                    i9 = i7;
                    fqeVar4 = fqeVar4;
                    str7 = str2;
                    i5 = i5;
                    i4 = i4;
                    i11 = i6;
                    num3 = num6;
                    Unit unit52 = Unit.a;
                    lu3Var2 = lu3Var;
                    i10 = i11;
                    str6 = str7;
                    fqe fqeVar162 = fqeVar4;
                    fsfVar60 = fsfVar25;
                    obj6 = obj5;
                    av4 av4Var322 = av4Var4;
                    av4Var22 = av4Var21;
                    if (Intrinsics.c(str6, obj6)) {
                        obj5 = obj6;
                        lu3Var = lu3Var2;
                        av4Var27 = av4Var322;
                        Unit unit6 = Unit.a;
                        fsfVar13 = fsfVar24;
                        zu4Var2 = zu4Var;
                        fsfVar14 = fsfVar21;
                        fsfVar15 = fsfVar23;
                        fsfVar4 = fsfVar20;
                        av4Var2 = av4Var27;
                        fsfVar17 = fsfVar60;
                        fsfVar = fsfVar22;
                        fsfVar3 = fsfVar19;
                        r6 = 0;
                        av4Var = av4Var22;
                        this.R = r6;
                        this.r = fsfVar13;
                        this.s = fsfVar;
                        this.t = fsfVar16;
                        this.u = fsfVar14;
                        this.v = fsfVar15;
                        this.w = fsfVar3;
                        this.x = fsfVar17;
                        this.y = fsfVar4;
                        this.z = av4Var;
                        this.A = r6;
                        this.B = r6;
                        this.C = zu4Var2;
                        this.D = r6;
                        this.E = r6;
                        this.F = r6;
                        this.G = r6;
                        this.H = r6;
                        this.I = r6;
                        this.J = r6;
                        this.Q = 13;
                        T12 = av4Var2.T(this);
                        if (T12 != lu3Var) {
                        }
                        return lu3Var;
                    }
                    rq3 rq3Var4 = null;
                    obj5 = obj6;
                    av4 t10 = xw3.t(ku3Var, null, new aqe(i5, i4, 0, rq3Var4, fqeVar162), 3);
                    av4 t11 = xw3.t(ku3Var, null, new j8c(fqeVar162, num3, num5, rq3Var4, 25), 3);
                    this.R = null;
                    this.r = fsfVar24;
                    this.s = fsfVar22;
                    this.t = fsfVar16;
                    this.u = fsfVar21;
                    this.v = fsfVar23;
                    this.w = fsfVar19;
                    this.x = fsfVar60;
                    this.y = fsfVar20;
                    this.z = av4Var22;
                    this.A = av4Var322;
                    this.B = null;
                    this.C = zu4Var;
                    this.D = fsfVar24;
                    this.E = null;
                    this.F = t11;
                    this.G = null;
                    this.H = null;
                    this.I = null;
                    this.J = null;
                    i16 = i9;
                    this.L = i16;
                    i17 = i10;
                    this.M = i17;
                    this.Q = 11;
                    T10 = t10.T(this);
                    lu3 lu3Var16 = lu3Var2;
                    if (T10 == lu3Var16) {
                        return lu3Var16;
                    }
                    fsf fsfVar97 = fsfVar23;
                    av4Var23 = av4Var22;
                    av4Var24 = av4Var322;
                    fsfVar61 = fsfVar97;
                    av4Var25 = t11;
                    lu3Var10 = lu3Var16;
                    fsfVar62 = fsfVar19;
                    fsfVar63 = fsfVar60;
                    fsfVar64 = fsfVar24;
                    fsfVar64.a = T10;
                    this.R = null;
                    this.r = fsfVar24;
                    this.s = fsfVar22;
                    this.t = fsfVar16;
                    this.u = fsfVar21;
                    this.v = fsfVar61;
                    this.w = fsfVar62;
                    this.x = fsfVar63;
                    this.y = fsfVar20;
                    this.z = av4Var23;
                    this.A = av4Var24;
                    this.B = null;
                    this.C = zu4Var;
                    this.D = fsfVar20;
                    this.E = null;
                    this.F = null;
                    this.L = i16;
                    this.M = i17;
                    this.Q = 12;
                    T11 = av4Var25.T(this);
                    lu3Var = lu3Var10;
                    if (T11 != lu3Var) {
                        fsfVar65 = fsfVar22;
                        fsfVar66 = fsfVar16;
                        fsfVar67 = fsfVar21;
                        fsfVar68 = fsfVar63;
                        fsfVar69 = fsfVar20;
                        fsfVar70 = fsfVar61;
                        av4Var26 = av4Var24;
                        fsfVar71 = fsfVar62;
                        fsfVar72 = fsfVar69;
                        fsfVar72.a = T11;
                        fsfVar19 = fsfVar71;
                        fsfVar60 = fsfVar68;
                        av4Var22 = av4Var23;
                        fsfVar23 = fsfVar70;
                        fsfVar21 = fsfVar67;
                        fsfVar16 = fsfVar66;
                        fsfVar20 = fsfVar69;
                        fsfVar22 = fsfVar65;
                        av4Var27 = av4Var26;
                        Unit unit62 = Unit.a;
                        fsfVar13 = fsfVar24;
                        zu4Var2 = zu4Var;
                        fsfVar14 = fsfVar21;
                        fsfVar15 = fsfVar23;
                        fsfVar4 = fsfVar20;
                        av4Var2 = av4Var27;
                        fsfVar17 = fsfVar60;
                        fsfVar = fsfVar22;
                        fsfVar3 = fsfVar19;
                        r6 = 0;
                        av4Var = av4Var22;
                        this.R = r6;
                        this.r = fsfVar13;
                        this.s = fsfVar;
                        this.t = fsfVar16;
                        this.u = fsfVar14;
                        this.v = fsfVar15;
                        this.w = fsfVar3;
                        this.x = fsfVar17;
                        this.y = fsfVar4;
                        this.z = av4Var;
                        this.A = r6;
                        this.B = r6;
                        this.C = zu4Var2;
                        this.D = r6;
                        this.E = r6;
                        this.F = r6;
                        this.G = r6;
                        this.H = r6;
                        this.I = r6;
                        this.J = r6;
                        this.Q = 13;
                        T12 = av4Var2.T(this);
                        if (T12 != lu3Var) {
                        }
                    }
                    return lu3Var;
                }
                av4Var21 = av4Var3;
                num5 = num4;
                i9 = i7;
                str6 = str2;
                i10 = i6;
                fqe fqeVar1622 = fqeVar4;
                fsfVar60 = fsfVar25;
                obj6 = obj5;
                av4 av4Var3222 = av4Var4;
                av4Var22 = av4Var21;
                if (Intrinsics.c(str6, obj6)) {
                }
                break;
            case 1:
                av4 av4Var33 = this.B;
                ?? r5 = this.A;
                ?? r7 = this.z;
                fsf fsfVar98 = this.y;
                fsf fsfVar99 = this.x;
                fsf fsfVar100 = this.w;
                fsfVar8 = this.v;
                fsf fsfVar101 = this.u;
                fsf fsfVar102 = this.t;
                fsf fsfVar103 = this.s;
                fsf fsfVar104 = this.r;
                y6a.M(obj);
                obj2 = Sports.BASEBALL;
                fsfVar6 = fsfVar99;
                fqeVar = fqeVar12;
                av4Var = r7;
                fsfVar2 = fsfVar102;
                fsfVar4 = fsfVar98;
                t2 = av4Var33;
                i = i27;
                t = r5;
                fsfVar = fsfVar103;
                obj3 = "G";
                fsfVar9 = fsfVar101;
                num = num9;
                fsfVar3 = fsfVar100;
                fsfVar7 = fsfVar104;
                lu3Var = lu3Var11;
                T = obj;
                eventResponse = (EventResponse) yaa.x((x2g) T);
                if (eventResponse != null) {
                    break;
                }
                if (fkf.F((eventResponse != null || (event = eventResponse.getEvent()) == null) ? null : Boolean.valueOf(ok3.C(event)))) {
                }
                break;
            case 2:
                zu4 zu4Var6 = this.C;
                ?? r52 = this.A;
                ?? r72 = this.z;
                fsf fsfVar105 = this.y;
                fsf fsfVar106 = this.x;
                fsf fsfVar107 = this.w;
                fsf fsfVar108 = this.v;
                fsf fsfVar109 = this.u;
                fsf fsfVar110 = this.t;
                fsf fsfVar111 = this.s;
                fsf fsfVar112 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var11;
                fsfVar12 = fsfVar112;
                av4Var6 = r52;
                fsfVar = fsfVar111;
                obj2 = Sports.BASEBALL;
                obj3 = "G";
                obj4 = Sports.FOOTBALL;
                str = str11;
                fsfVar11 = fsfVar108;
                fsfVar10 = fsfVar109;
                fsfVar27 = fsfVar106;
                fqeVar2 = fqeVar12;
                i2 = i28;
                T2 = obj;
                fsfVar26 = fsfVar107;
                zu4Var = zu4Var6;
                i = i27;
                fsfVar4 = fsfVar105;
                av4Var5 = r72;
                fsfVar2 = fsfVar110;
                EventResponse eventResponse22 = (EventResponse) yaa.x((x2g) T2);
                if (eventResponse22 == null) {
                }
                switch (str.hashCode()) {
                    case -2002238939:
                        break;
                    case -1721090992:
                        break;
                    case 394668909:
                        break;
                    case 727149765:
                        break;
                }
            case 3:
                fsf fsfVar113 = (fsf) this.I;
                ?? r3 = (zu4) this.H;
                ?? r53 = (zu4) this.G;
                ?? r73 = (zu4) this.F;
                zu4 zu4Var7 = this.C;
                ?? r10 = this.A;
                ?? r11 = this.z;
                fsf fsfVar114 = this.y;
                fsf fsfVar115 = this.x;
                fsf fsfVar116 = this.w;
                fsf fsfVar117 = this.v;
                fsf fsfVar118 = this.u;
                fsf fsfVar119 = this.t;
                fsf fsfVar120 = this.s;
                fsf fsfVar121 = this.r;
                y6a.M(obj);
                obj5 = Sports.FOOTBALL;
                i3 = i27;
                str4 = str11;
                fqeVar7 = fqeVar12;
                fsfVar27 = fsfVar115;
                fsfVar11 = fsfVar117;
                av4Var9 = r53;
                av4Var12 = r10;
                fsfVar28 = fsfVar116;
                fsfVar = fsfVar120;
                lu3Var5 = lu3Var11;
                fsfVar12 = fsfVar121;
                fsfVar36 = fsfVar113;
                av4Var11 = r73;
                fsfVar2 = fsfVar119;
                obj3 = "G";
                fsfVar10 = fsfVar118;
                obj2 = Sports.BASEBALL;
                av4Var13 = r3;
                av4Var10 = r11;
                zu4Var = zu4Var7;
                fsfVar35 = fsfVar114;
                T4 = obj;
                fsfVar36.a = T4;
                this.R = null;
                this.r = fsfVar12;
                this.s = fsfVar;
                this.t = fsfVar2;
                this.u = fsfVar10;
                this.v = fsfVar11;
                this.w = fsfVar28;
                this.x = fsfVar27;
                this.y = fsfVar35;
                this.z = av4Var10;
                this.A = av4Var12;
                this.B = null;
                this.C = zu4Var;
                this.D = null;
                this.E = null;
                this.F = null;
                this.G = av4Var9;
                this.H = av4Var13;
                this.I = fsfVar2;
                this.Q = 4;
                T6 = av4Var11.T(this);
                lu3Var7 = lu3Var5;
                if (T6 != lu3Var7) {
                }
                break;
            case 4:
                fsf fsfVar122 = (fsf) this.I;
                ?? r32 = (zu4) this.H;
                ?? r54 = (zu4) this.G;
                zu4 zu4Var8 = this.C;
                r8 = this.A;
                ?? r102 = this.z;
                fsf fsfVar123 = this.y;
                fsf fsfVar124 = this.x;
                fsf fsfVar125 = this.w;
                fsf fsfVar126 = this.v;
                fsf fsfVar127 = this.u;
                fsf fsfVar128 = this.t;
                fsf fsfVar129 = this.s;
                fsf fsfVar130 = this.r;
                y6a.M(obj);
                av4Var13 = r32;
                fsfVar44 = fsfVar128;
                obj2 = Sports.BASEBALL;
                lu3Var8 = lu3Var11;
                obj5 = Sports.FOOTBALL;
                i3 = i27;
                str4 = str11;
                fqeVar7 = fqeVar12;
                fsfVar27 = fsfVar124;
                fsfVar43 = fsfVar125;
                fsfVar11 = fsfVar126;
                fsfVar12 = fsfVar130;
                av4Var9 = r54;
                fsfVar42 = fsfVar123;
                fsfVar = fsfVar129;
                T6 = obj;
                obj3 = "G";
                zu4Var = zu4Var8;
                fsfVar2 = fsfVar122;
                fsfVar10 = fsfVar127;
                av4Var14 = r102;
                fsfVar2.a = T6;
                if (av4Var9 == null) {
                }
                break;
            case 5:
                fsf fsfVar131 = (fsf) this.I;
                ?? r33 = (zu4) this.H;
                zu4 zu4Var9 = this.C;
                ?? r74 = this.A;
                r82 = this.z;
                fsfVar51 = this.y;
                fsf fsfVar132 = this.x;
                fsfVar43 = this.w;
                fsfVar48 = fsfVar131;
                fsfVar50 = this.v;
                fsfVar49 = this.u;
                fsf fsfVar133 = this.t;
                fsf fsfVar134 = this.s;
                fsf fsfVar135 = this.r;
                y6a.M(obj);
                obj3 = "G";
                obj5 = Sports.FOOTBALL;
                i3 = i27;
                str4 = str11;
                fqeVar7 = fqeVar12;
                lu3Var9 = lu3Var11;
                fsfVar27 = fsfVar132;
                fsfVar12 = fsfVar135;
                zu4Var = zu4Var9;
                fsfVar = fsfVar134;
                T7 = obj;
                obj2 = Sports.BASEBALL;
                av4Var13 = r33;
                fsfVar44 = fsfVar133;
                av4Var17 = r74;
                FootballShotmapResponse footballShotmapResponse22 = (FootballShotmapResponse) T7;
                fsfVar42 = fsfVar51;
                fsfVar45 = fsfVar43;
                fsfVar46 = fsfVar50;
                footballShotmapResponse = footballShotmapResponse22;
                fsfVar10 = fsfVar49;
                av4Var18 = r82;
                av4Var16 = av4Var13;
                fsfVar47 = fsfVar48;
                av4Var15 = av4Var17;
                fsfVar47.a = footballShotmapResponse;
                this.R = null;
                this.r = fsfVar12;
                this.s = fsfVar;
                this.t = fsfVar44;
                this.u = fsfVar10;
                this.v = fsfVar46;
                this.w = fsfVar45;
                this.x = fsfVar27;
                this.y = fsfVar42;
                this.z = av4Var18;
                this.A = av4Var15;
                this.B = null;
                this.C = zu4Var;
                this.D = null;
                this.E = null;
                this.F = null;
                this.G = null;
                this.H = null;
                this.I = fsfVar45;
                this.Q = 6;
                T8 = av4Var16.T(this);
                if (T8 == lu3Var9) {
                }
                break;
            case 6:
                fsf fsfVar136 = (fsf) this.I;
                zu4Var5 = this.C;
                ?? r55 = this.A;
                ?? r75 = this.z;
                fsfVar54 = this.y;
                fsf fsfVar137 = this.x;
                fsfVar55 = this.w;
                fsfVar46 = this.v;
                fsfVar53 = this.u;
                fsfVar52 = this.t;
                fsf fsfVar138 = this.s;
                fsf fsfVar139 = this.r;
                y6a.M(obj);
                obj3 = "G";
                obj2 = Sports.BASEBALL;
                obj5 = Sports.FOOTBALL;
                i3 = i27;
                str4 = str11;
                fqeVar7 = fqeVar12;
                T8 = obj;
                lu3Var9 = lu3Var11;
                fsfVar27 = fsfVar137;
                fsfVar12 = fsfVar139;
                av4Var19 = r75;
                fsfVar45 = fsfVar136;
                av4Var20 = r55;
                fsfVar = fsfVar138;
                fsfVar45.a = T8;
                av4Var6 = av4Var20;
                fsfVar4 = fsfVar54;
                av4Var5 = av4Var19;
                fsfVar28 = fsfVar55;
                lu3Var4 = lu3Var9;
                fsfVar11 = fsfVar46;
                fsfVar10 = fsfVar53;
                fsfVar2 = fsfVar52;
                str3 = str4;
                zu4Var4 = zu4Var5;
                fqeVar5 = fqeVar7;
                Unit unit22222222 = Unit.a;
                fsfVar13 = fsfVar12;
                fqeVar3 = fqeVar5;
                lu3Var = lu3Var4;
                zu4Var2 = zu4Var4;
                str = str3;
                fsfVar14 = fsfVar10;
                av4Var2 = av4Var6;
                av4Var = av4Var5;
                fsfVar3 = fsfVar28;
                r6 = 0;
                fsfVar15 = fsfVar11;
                fsfVar16 = fsfVar2;
                fsfVar17 = fsfVar27;
                this.R = r6;
                this.r = fsfVar13;
                this.s = fsfVar;
                this.t = fsfVar16;
                this.u = fsfVar14;
                this.v = fsfVar15;
                this.w = fsfVar3;
                this.x = fsfVar17;
                this.y = fsfVar4;
                this.z = av4Var;
                this.A = r6;
                this.B = r6;
                this.C = zu4Var2;
                this.D = r6;
                this.E = r6;
                this.F = r6;
                this.G = r6;
                this.H = r6;
                this.I = r6;
                this.J = r6;
                this.Q = 13;
                T12 = av4Var2.T(this);
                if (T12 != lu3Var) {
                }
                return lu3Var;
            case 7:
                fsf fsfVar140 = (fsf) this.F;
                zu4 zu4Var10 = this.C;
                ?? r56 = this.A;
                ?? r76 = this.z;
                fsf fsfVar141 = this.y;
                fsfVar41 = this.x;
                fsf fsfVar142 = this.w;
                fsfVar39 = this.v;
                fsfVar37 = this.u;
                fsf fsfVar143 = this.t;
                fsfVar38 = this.s;
                fsf fsfVar144 = this.r;
                y6a.M(obj);
                obj3 = "G";
                obj2 = Sports.BASEBALL;
                obj4 = Sports.FOOTBALL;
                fsfVar40 = fsfVar142;
                str5 = str11;
                zu4Var = zu4Var10;
                av4Var6 = r56;
                fsfVar = fsfVar140;
                i = i27;
                fsfVar4 = fsfVar141;
                av4Var5 = r76;
                fsfVar2 = fsfVar143;
                fqeVar2 = fqeVar12;
                lu3Var6 = lu3Var11;
                fsfVar12 = fsfVar144;
                T5 = obj;
                fsfVar.a = T5;
                lu3 lu3Var142 = lu3Var6;
                zu4Var4 = zu4Var;
                lu3Var4 = lu3Var142;
                fsfVar27 = fsfVar41;
                fsfVar11 = fsfVar39;
                i3 = i;
                fqeVar5 = fqeVar2;
                fsfVar = fsfVar38;
                obj5 = obj4;
                str3 = str5;
                fsfVar28 = fsfVar40;
                fsfVar10 = fsfVar37;
                Unit unit222222222 = Unit.a;
                fsfVar13 = fsfVar12;
                fqeVar3 = fqeVar5;
                lu3Var = lu3Var4;
                zu4Var2 = zu4Var4;
                str = str3;
                fsfVar14 = fsfVar10;
                av4Var2 = av4Var6;
                av4Var = av4Var5;
                fsfVar3 = fsfVar28;
                r6 = 0;
                fsfVar15 = fsfVar11;
                fsfVar16 = fsfVar2;
                fsfVar17 = fsfVar27;
                this.R = r6;
                this.r = fsfVar13;
                this.s = fsfVar;
                this.t = fsfVar16;
                this.u = fsfVar14;
                this.v = fsfVar15;
                this.w = fsfVar3;
                this.x = fsfVar17;
                this.y = fsfVar4;
                this.z = av4Var;
                this.A = r6;
                this.B = r6;
                this.C = zu4Var2;
                this.D = r6;
                this.E = r6;
                this.F = r6;
                this.G = r6;
                this.H = r6;
                this.I = r6;
                this.J = r6;
                this.Q = 13;
                T12 = av4Var2.T(this);
                if (T12 != lu3Var) {
                }
                return lu3Var;
            case 8:
                fsf fsfVar145 = (fsf) this.F;
                zu4 zu4Var11 = this.C;
                ?? r57 = this.A;
                ?? r77 = this.z;
                fsfVar32 = this.y;
                fsfVar33 = this.x;
                fsf fsfVar146 = this.w;
                fsf fsfVar147 = this.v;
                fsfVar29 = this.u;
                fsfVar30 = this.t;
                fsf fsfVar148 = this.s;
                fsf fsfVar149 = this.r;
                y6a.M(obj);
                zu4Var4 = zu4Var11;
                fqeVar5 = fqeVar12;
                obj3 = "G";
                obj2 = Sports.BASEBALL;
                obj5 = Sports.FOOTBALL;
                fsfVar31 = fsfVar146;
                i3 = i27;
                fsfVar34 = fsfVar147;
                fsfVar11 = fsfVar145;
                lu3Var4 = lu3Var11;
                av4Var6 = r57;
                str3 = str11;
                fsfVar = fsfVar148;
                fsfVar12 = fsfVar149;
                T3 = obj;
                av4Var8 = r77;
                fsfVar11.a = T3;
                fsfVar27 = fsfVar33;
                fsfVar11 = fsfVar34;
                fsfVar28 = fsfVar31;
                fsfVar4 = fsfVar32;
                fsfVar10 = fsfVar29;
                av4Var5 = av4Var8;
                fsfVar2 = fsfVar30;
                Unit unit2222222222 = Unit.a;
                fsfVar13 = fsfVar12;
                fqeVar3 = fqeVar5;
                lu3Var = lu3Var4;
                zu4Var2 = zu4Var4;
                str = str3;
                fsfVar14 = fsfVar10;
                av4Var2 = av4Var6;
                av4Var = av4Var5;
                fsfVar3 = fsfVar28;
                r6 = 0;
                fsfVar15 = fsfVar11;
                fsfVar16 = fsfVar2;
                fsfVar17 = fsfVar27;
                this.R = r6;
                this.r = fsfVar13;
                this.s = fsfVar;
                this.t = fsfVar16;
                this.u = fsfVar14;
                this.v = fsfVar15;
                this.w = fsfVar3;
                this.x = fsfVar17;
                this.y = fsfVar4;
                this.z = av4Var;
                this.A = r6;
                this.B = r6;
                this.C = zu4Var2;
                this.D = r6;
                this.E = r6;
                this.F = r6;
                this.G = r6;
                this.H = r6;
                this.I = r6;
                this.J = r6;
                this.Q = 13;
                T12 = av4Var2.T(this);
                if (T12 != lu3Var) {
                }
                return lu3Var;
            case 9:
                int i34 = this.O;
                int i35 = this.N;
                int i36 = this.M;
                int i37 = this.L;
                fsf fsfVar150 = (fsf) this.H;
                Integer num12 = (Integer) this.G;
                String str14 = (String) this.F;
                num4 = (Integer) this.E;
                fqe fqeVar17 = (fqe) this.D;
                zu4 zu4Var12 = this.C;
                ?? r34 = this.A;
                ?? r35 = this.z;
                fsf fsfVar151 = this.y;
                fsf fsfVar152 = this.x;
                fsf fsfVar153 = this.w;
                fsf fsfVar154 = this.v;
                fsf fsfVar155 = this.u;
                fsf fsfVar156 = this.t;
                fsf fsfVar157 = this.s;
                fsf fsfVar158 = this.r;
                y6a.M(obj);
                i4 = i36;
                obj5 = Sports.FOOTBALL;
                num3 = num12;
                str2 = str14;
                fqeVar3 = fqeVar12;
                i5 = i37;
                i6 = i34;
                zu4Var = zu4Var12;
                fsfVar20 = fsfVar151;
                fsfVar19 = fsfVar153;
                fsfVar16 = fsfVar156;
                lu3Var2 = lu3Var11;
                fsfVar24 = fsfVar158;
                i7 = i35;
                fsfVar18 = fsfVar150;
                str = str11;
                fqeVar4 = fqeVar17;
                av4Var3 = r35;
                fsfVar25 = fsfVar152;
                fsfVar23 = fsfVar154;
                fsfVar22 = fsfVar157;
                obj3 = "G";
                i3 = i27;
                av4Var4 = r34;
                fsfVar21 = fsfVar155;
                obj2 = Sports.BASEBALL;
                w = obj;
                fsfVar18.a = w;
                if (zu4Var == null) {
                }
                break;
            case 10:
                int i38 = this.O;
                int i39 = this.N;
                int i40 = this.M;
                int i41 = this.L;
                Player player6 = this.J;
                Integer num13 = (Integer) this.I;
                Integer num14 = (Integer) this.G;
                i14 = i38;
                str8 = (String) this.F;
                Integer num15 = (Integer) this.E;
                fqeVar8 = (fqe) this.D;
                zu4 zu4Var13 = this.C;
                ?? r36 = this.A;
                ?? r37 = this.z;
                fsf fsfVar159 = this.y;
                fsf fsfVar160 = this.x;
                fsf fsfVar161 = this.w;
                fsfVar57 = this.v;
                fsfVar59 = this.u;
                fsfVar56 = this.t;
                fsfVar58 = this.s;
                fsf fsfVar162 = this.r;
                y6a.M(obj);
                obj3 = "G";
                av4Var4 = r36;
                obj5 = Sports.FOOTBALL;
                fqeVar3 = fqeVar12;
                num6 = num14;
                fsfVar20 = fsfVar159;
                fsfVar19 = fsfVar161;
                i12 = i40;
                i3 = i27;
                fsfVar24 = fsfVar162;
                player2 = player6;
                lu3Var = lu3Var11;
                i15 = i41;
                T9 = obj;
                i13 = i39;
                fsfVar25 = fsfVar160;
                str = str11;
                num7 = num13;
                zu4Var = zu4Var13;
                obj2 = Sports.BASEBALL;
                num8 = num15;
                av4Var21 = r37;
                player2.setTopRated(Intrinsics.c(num7, T9));
                Unit unit42 = Unit.a;
                i4 = i12;
                i5 = i15;
                i11 = i14;
                str7 = str8;
                fqeVar4 = fqeVar8;
                fsfVar23 = fsfVar57;
                fsfVar21 = fsfVar59;
                fsfVar16 = fsfVar56;
                num5 = num8;
                i9 = i13;
                fsfVar22 = fsfVar58;
                num3 = num6;
                Unit unit522 = Unit.a;
                lu3Var2 = lu3Var;
                i10 = i11;
                str6 = str7;
                fqe fqeVar16222 = fqeVar4;
                fsfVar60 = fsfVar25;
                obj6 = obj5;
                av4 av4Var32222 = av4Var4;
                av4Var22 = av4Var21;
                if (Intrinsics.c(str6, obj6)) {
                }
                break;
            case 11:
                int i42 = this.M;
                int i43 = this.L;
                ?? r58 = (zu4) this.F;
                fsf fsfVar163 = (fsf) this.D;
                zu4 zu4Var14 = this.C;
                ?? r103 = this.A;
                ?? r112 = this.z;
                fsfVar20 = this.y;
                fsf fsfVar164 = this.x;
                fsf fsfVar165 = this.w;
                fsf fsfVar166 = this.v;
                fsf fsfVar167 = this.u;
                fsf fsfVar168 = this.t;
                fsf fsfVar169 = this.s;
                fsf fsfVar170 = this.r;
                y6a.M(obj);
                obj5 = Sports.FOOTBALL;
                i3 = i27;
                str = str11;
                fqeVar3 = fqeVar12;
                fsfVar63 = fsfVar164;
                fsfVar21 = fsfVar167;
                fsfVar16 = fsfVar168;
                obj3 = "G";
                obj2 = Sports.BASEBALL;
                fsfVar64 = fsfVar163;
                av4Var24 = r103;
                av4Var23 = r112;
                T10 = obj;
                fsfVar24 = fsfVar170;
                zu4Var = zu4Var14;
                fsfVar62 = fsfVar165;
                fsfVar22 = fsfVar169;
                lu3Var10 = lu3Var11;
                i16 = i43;
                i17 = i42;
                av4Var25 = r58;
                fsfVar61 = fsfVar166;
                fsfVar64.a = T10;
                this.R = null;
                this.r = fsfVar24;
                this.s = fsfVar22;
                this.t = fsfVar16;
                this.u = fsfVar21;
                this.v = fsfVar61;
                this.w = fsfVar62;
                this.x = fsfVar63;
                this.y = fsfVar20;
                this.z = av4Var23;
                this.A = av4Var24;
                this.B = null;
                this.C = zu4Var;
                this.D = fsfVar20;
                this.E = null;
                this.F = null;
                this.L = i16;
                this.M = i17;
                this.Q = 12;
                T11 = av4Var25.T(this);
                lu3Var = lu3Var10;
                if (T11 != lu3Var) {
                }
                return lu3Var;
            case 12:
                fsf fsfVar171 = (fsf) this.D;
                zu4 zu4Var15 = this.C;
                ?? r59 = this.A;
                ?? r78 = this.z;
                fsfVar69 = this.y;
                fsfVar68 = this.x;
                fsf fsfVar172 = this.w;
                fsfVar70 = this.v;
                fsfVar67 = this.u;
                fsfVar66 = this.t;
                fsfVar65 = this.s;
                fsf fsfVar173 = this.r;
                y6a.M(obj);
                obj3 = "G";
                obj2 = Sports.BASEBALL;
                obj5 = Sports.FOOTBALL;
                fsfVar71 = fsfVar172;
                i3 = i27;
                str = str11;
                fqeVar3 = fqeVar12;
                zu4Var = zu4Var15;
                av4Var23 = r78;
                fsfVar24 = fsfVar173;
                lu3Var = lu3Var11;
                fsfVar72 = fsfVar171;
                T11 = obj;
                av4Var26 = r59;
                fsfVar72.a = T11;
                fsfVar19 = fsfVar71;
                fsfVar60 = fsfVar68;
                av4Var22 = av4Var23;
                fsfVar23 = fsfVar70;
                fsfVar21 = fsfVar67;
                fsfVar16 = fsfVar66;
                fsfVar20 = fsfVar69;
                fsfVar22 = fsfVar65;
                av4Var27 = av4Var26;
                Unit unit622 = Unit.a;
                fsfVar13 = fsfVar24;
                zu4Var2 = zu4Var;
                fsfVar14 = fsfVar21;
                fsfVar15 = fsfVar23;
                fsfVar4 = fsfVar20;
                av4Var2 = av4Var27;
                fsfVar17 = fsfVar60;
                fsfVar = fsfVar22;
                fsfVar3 = fsfVar19;
                r6 = 0;
                av4Var = av4Var22;
                this.R = r6;
                this.r = fsfVar13;
                this.s = fsfVar;
                this.t = fsfVar16;
                this.u = fsfVar14;
                this.v = fsfVar15;
                this.w = fsfVar3;
                this.x = fsfVar17;
                this.y = fsfVar4;
                this.z = av4Var;
                this.A = r6;
                this.B = r6;
                this.C = zu4Var2;
                this.D = r6;
                this.E = r6;
                this.F = r6;
                this.G = r6;
                this.H = r6;
                this.I = r6;
                this.J = r6;
                this.Q = 13;
                T12 = av4Var2.T(this);
                if (T12 != lu3Var) {
                }
                return lu3Var;
            case 13:
                zu4 zu4Var16 = this.C;
                ?? r38 = this.z;
                fsf fsfVar174 = this.y;
                fsfVar17 = this.x;
                fsfVar3 = this.w;
                fsfVar15 = this.v;
                fsfVar14 = this.u;
                fsfVar73 = this.t;
                fsf fsfVar175 = this.s;
                fsfVar13 = this.r;
                y6a.M(obj);
                obj3 = "G";
                obj2 = Sports.BASEBALL;
                obj5 = Sports.FOOTBALL;
                i3 = i27;
                str = str11;
                fqeVar3 = fqeVar12;
                T12 = obj;
                av4Var = r38;
                fsfVar4 = fsfVar174;
                fsfVar = fsfVar175;
                lu3Var = lu3Var11;
                zu4Var2 = zu4Var16;
                eventIncidentsResponse = (EventIncidentsResponse) yaa.x((x2g) T12);
                if (eventIncidentsResponse != null) {
                    break;
                }
                arrayList = null;
                str11 = str;
                Object obj92 = obj5;
                if (arrayList != null) {
                }
                arrayList2 = arrayList;
                i18 = i3;
                substitutionIncident = null;
                if (arrayList2 != null) {
                }
                obj7 = obj92;
                substitutionIncident2 = null;
                i19 = i18;
                this.R = null;
                this.r = fsfVar13;
                this.s = fsfVar;
                this.t = fsfVar73;
                this.u = fsfVar14;
                this.v = fsfVar15;
                this.w = fsfVar3;
                this.x = fsfVar17;
                this.y = fsfVar4;
                this.z = null;
                this.A = null;
                this.B = null;
                this.C = zu4Var2;
                this.D = null;
                this.E = substitutionIncident;
                this.F = substitutionIncident2;
                this.Q = 14;
                T13 = av4Var.T(this);
                break;
            case 14:
                Incident.SubstitutionIncident substitutionIncident7 = (Incident.SubstitutionIncident) this.F;
                Incident.SubstitutionIncident substitutionIncident8 = (Incident.SubstitutionIncident) this.E;
                zu4 zu4Var17 = this.C;
                fsf fsfVar176 = this.y;
                fsf fsfVar177 = this.x;
                fsf fsfVar178 = this.w;
                fsf fsfVar179 = this.v;
                fsf fsfVar180 = this.u;
                fsf fsfVar181 = this.t;
                fsf fsfVar182 = this.s;
                fsfVar13 = this.r;
                y6a.M(obj);
                obj3 = "G";
                obj2 = Sports.BASEBALL;
                obj7 = Sports.FOOTBALL;
                fqeVar3 = fqeVar12;
                substitutionIncident2 = substitutionIncident7;
                T13 = obj;
                substitutionIncident = substitutionIncident8;
                i19 = i27;
                lu3Var = lu3Var11;
                zu4Var2 = zu4Var17;
                fsfVar4 = fsfVar176;
                fsfVar17 = fsfVar177;
                fsfVar3 = fsfVar178;
                fsfVar15 = fsfVar179;
                fsfVar14 = fsfVar180;
                fsfVar73 = fsfVar181;
                fsfVar = fsfVar182;
                PlayerEventStatisticsResponse playerEventStatisticsResponse6 = (PlayerEventStatisticsResponse) T13;
                z = this.Z;
                if (zu4Var2 != null) {
                    if (playerEventStatisticsResponse6 != null) {
                        lu3 lu3Var17 = lu3Var;
                        Player player7 = playerEventStatisticsResponse6.getPlayer();
                        if (player7 != null) {
                            zu4 zu4Var18 = zu4Var2;
                            int id2 = playerEventStatisticsResponse6.getPlayer().getId();
                            this.R = null;
                            this.r = fsfVar13;
                            this.s = fsfVar;
                            this.t = fsfVar73;
                            this.u = fsfVar14;
                            this.v = fsfVar15;
                            this.w = fsfVar3;
                            this.x = fsfVar17;
                            this.y = fsfVar4;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = null;
                            this.D = null;
                            this.E = substitutionIncident;
                            this.F = substitutionIncident2;
                            this.G = fqeVar3;
                            this.H = str11;
                            this.I = playerEventStatisticsResponse6;
                            fsfVar78 = fsfVar13;
                            this.J = null;
                            this.K = player7;
                            this.P = z;
                            this.L = i19;
                            this.M = 0;
                            this.N = 0;
                            this.O = id2;
                            this.Q = 15;
                            T14 = zu4Var18.T(this);
                            lu3Var11 = lu3Var17;
                            if (T14 == lu3Var11) {
                                return lu3Var11;
                            }
                            String str15 = str11;
                            player4 = player7;
                            i21 = id2;
                            fsfVar80 = fsfVar17;
                            fsfVar81 = fsfVar4;
                            i22 = i19;
                            playerEventStatisticsResponse3 = playerEventStatisticsResponse6;
                            str10 = str15;
                            fsfVar82 = fsfVar15;
                            i23 = 0;
                            Integer num16 = (Integer) T14;
                            player4.setTopRated(num16 != null && i21 == num16.intValue());
                            Unit unit7 = Unit.a;
                            int i44 = i22;
                            fsfVar4 = fsfVar81;
                            fsfVar17 = fsfVar80;
                            fsfVar79 = fsfVar73;
                            playerEventStatisticsResponse2 = playerEventStatisticsResponse3;
                            i19 = i44;
                            i20 = i23;
                            str11 = str10;
                            fsfVar15 = fsfVar82;
                            fsfVar77 = fsfVar78;
                            fqe fqeVar18 = fqeVar3;
                            Unit unit8 = Unit.a;
                            String str16 = str11;
                            substitutionIncident5 = substitutionIncident2;
                            fsfVar74 = fsfVar4;
                            substitutionIncident6 = substitutionIncident;
                            str9 = str16;
                            fqeVar3 = fqeVar18;
                            fsfVar75 = fsfVar3;
                            playerEventStatisticsResponse = playerEventStatisticsResponse2;
                            z2 = z;
                            fsfVar76 = fsfVar79;
                            PlayerEventStatisticsResponse playerEventStatisticsResponse7 = playerEventStatisticsResponse;
                            lu3 lu3Var18 = lu3Var11;
                            int i45 = i20;
                            z3 = z2;
                            int i46 = i19;
                            String str17 = str9;
                            fqeVar9 = fqeVar3;
                            ppeVar = new ppe(playerEventStatisticsResponse7, (PlayerEventStatisticsResponse) fsfVar17.a, (PlayerHeatmapResponse) fsfVar77.a, (PlayerHeatmapResponse) fsfVar74.a, (PlayerShotmapResponse) fsfVar.a, (FootballShotmapResponse) fsfVar76.a, (FootballShotmapResponse) fsfVar14.a, (List) fsfVar15.a, substitutionIncident6, substitutionIncident5);
                            fqeVar9.v = (List) fsfVar75.a;
                            if (z3) {
                                fqeVar9.k.j(ppeVar);
                                return Unit.a;
                            }
                            if (Intrinsics.c(str17, obj7)) {
                                if (playerEventStatisticsResponse7 != null) {
                                    hzd hzdVar = fqeVar9.h;
                                    if (hzdVar != null) {
                                        xoe e = hzdVar.e(Integer.valueOf(playerEventStatisticsResponse7.getPlayer().getId()));
                                        PlayerEventStatistics statistics = playerEventStatisticsResponse7.getStatistics();
                                        if (!(statistics instanceof FootballPlayerEventStatistics)) {
                                            statistics = null;
                                        }
                                        FootballPlayerEventStatistics footballPlayerEventStatistics = (FootballPlayerEventStatistics) statistics;
                                        if (footballPlayerEventStatistics != null) {
                                            Double d = e.c;
                                            Player player8 = e.a;
                                            if (d != null) {
                                                double doubleValue = d.doubleValue();
                                                fdi fdiVar = fqeVar9.o;
                                                while (true) {
                                                    Object value = fdiVar.getValue();
                                                    xbb b2 = a.b();
                                                    Object obj12 = obj3;
                                                    if (Intrinsics.c(player8.getPosition(), obj12)) {
                                                        Double shotValueNormalized = footballPlayerEventStatistics.getShotValueNormalized();
                                                        if (shotValueNormalized != null) {
                                                            fsfVar84 = fsfVar75;
                                                            double doubleValue2 = shotValueNormalized.doubleValue();
                                                            player5 = player8;
                                                            String string = fqeVar9.i().getString(R.string.football_rating_shooting_category);
                                                            string.getClass();
                                                            b2.add(new qzd(string, doubleValue2));
                                                        } else {
                                                            player5 = player8;
                                                            fsfVar84 = fsfVar75;
                                                        }
                                                    } else {
                                                        player5 = player8;
                                                        fsfVar84 = fsfVar75;
                                                        String string2 = fqeVar9.i().getString(R.string.football_rating_shooting_category);
                                                        string2.getClass();
                                                        b2.add(new qzd(string2, yid.k(footballPlayerEventStatistics.getShotValueNormalized())));
                                                    }
                                                    String string3 = fqeVar9.i().getString(R.string.football_passing_category);
                                                    string3.getClass();
                                                    b2.add(new qzd(string3, yid.k(footballPlayerEventStatistics.getPassValueNormalized())));
                                                    String string4 = fqeVar9.i().getString(R.string.football_dribbling_category);
                                                    string4.getClass();
                                                    b2.add(new qzd(string4, yid.k(footballPlayerEventStatistics.getDribbleValueNormalized())));
                                                    String string5 = fqeVar9.i().getString(R.string.football_defending_category);
                                                    string5.getClass();
                                                    b2.add(new qzd(string5, yid.k(footballPlayerEventStatistics.getDefensiveValueNormalized())));
                                                    if (Intrinsics.c(player5.getPosition(), obj12)) {
                                                        String string6 = fqeVar9.i().getString(R.string.football_goalkeeping_category);
                                                        string6.getClass();
                                                        b2.add(new qzd(string6, yid.k(footballPlayerEventStatistics.getGoalkeeperValueNormalized())));
                                                    }
                                                    Unit unit9 = Unit.a;
                                                    if (fdiVar.k(value, new uzd(doubleValue, l6g.W(a.a(b2)), player5.getGender()))) {
                                                        fsfVar83 = fsfVar84;
                                                        if (((List) fsfVar83.a) == null) {
                                                            xbb b3 = a.b();
                                                            kp5 kp5Var = pzd.I;
                                                            ArrayList arrayList5 = new ArrayList();
                                                            for (Object obj13 : kp5Var) {
                                                                pzd pzdVar = (pzd) obj13;
                                                                if (pzdVar.d) {
                                                                    Iterable<npe> iterable = (Iterable) fsfVar83.a;
                                                                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                                                        for (npe npeVar : iterable) {
                                                                            ozd ozdVar = (ozd) fqeVar9.y.getValue();
                                                                            ozdVar.getClass();
                                                                            Set set = (Set) ozdVar.a.get(pzdVar);
                                                                            if (set == null) {
                                                                                set = rm5.a;
                                                                            }
                                                                            if (set.contains(npeVar.a)) {
                                                                                z4 = true;
                                                                                if (!fkf.F(Boolean.valueOf(z4))) {
                                                                                    arrayList5.add(obj13);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    z4 = false;
                                                                    if (!fkf.F(Boolean.valueOf(z4))) {
                                                                    }
                                                                }
                                                            }
                                                            b3.addAll(arrayList5);
                                                            if (b3.isEmpty()) {
                                                                i24 = 0;
                                                            } else {
                                                                Iterator it4 = b3.iterator();
                                                                i24 = 0;
                                                                while (true) {
                                                                    hc9 hc9Var = (hc9) it4;
                                                                    if (hc9Var.hasNext()) {
                                                                        if (((pzd) hc9Var.next()).b == mzd.Dribbling && (i24 = i24 + 1) < 0) {
                                                                            b.p();
                                                                            throw null;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (1 <= i24 && i24 < 3) {
                                                                b3.remove(pzd.v);
                                                            }
                                                            if (b3.isEmpty()) {
                                                                i25 = 0;
                                                            } else {
                                                                Iterator it5 = b3.iterator();
                                                                i25 = 0;
                                                                while (true) {
                                                                    hc9 hc9Var2 = (hc9) it5;
                                                                    if (hc9Var2.hasNext()) {
                                                                        if (((pzd) hc9Var2.next()).b == mzd.Defending && (i25 = i25 + 1) < 0) {
                                                                            b.p();
                                                                            throw null;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (1 <= i25 && i25 < 3) {
                                                                b3.remove(pzd.A);
                                                            }
                                                            xbb a2 = a.a(b3);
                                                            xbbVar = !a2.isEmpty() ? a2 : null;
                                                        } else {
                                                            xbbVar = null;
                                                        }
                                                        fqeVar9.B(i46, xbbVar, playerEventStatisticsResponse7);
                                                    } else {
                                                        obj3 = obj12;
                                                        fsfVar75 = fsfVar84;
                                                        player8 = player5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    fsfVar83 = fsfVar75;
                                    if (((List) fsfVar83.a) == null) {
                                    }
                                    fqeVar9.B(i46, xbbVar, playerEventStatisticsResponse7);
                                }
                            } else if (Intrinsics.c(str17, obj2)) {
                                if (playerEventStatisticsResponse7 != null) {
                                    fqeVar9.C(playerEventStatisticsResponse7);
                                    Unit unit10 = Unit.a;
                                }
                                av4 av4Var34 = fqeVar9.z;
                                kl1Var = null;
                                if (av4Var34 != null) {
                                    this.R = null;
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
                                    this.G = fqeVar9;
                                    this.H = null;
                                    this.I = ppeVar;
                                    this.J = null;
                                    this.K = null;
                                    this.L = i45;
                                    this.Q = 16;
                                    T15 = av4Var34.T(this);
                                    if (T15 == lu3Var18) {
                                        return lu3Var18;
                                    }
                                    fqeVar11 = fqeVar9;
                                    ppeVar3 = ppeVar;
                                    ppeVar2 = ppeVar3;
                                    fqeVar10 = fqeVar11;
                                    mpeVar2 = (mpe) T15;
                                    Object K2 = mpeVar2 != null ? o02.K(mpeVar2.a) : kl1Var;
                                    mpe mpeVar4 = fqeVar10.A;
                                    fdi fdiVar2 = fqeVar10.w;
                                    c = Intrinsics.c(K2, mpeVar4 != null ? o02.K(mpeVar4.a) : kl1Var);
                                    fqeVar10.A = mpeVar2;
                                    wj1 wj1Var = fqeVar10.s.b;
                                    vl1 vl1Var3 = (vl1) fdiVar2.getValue();
                                    Enum r18 = vl1Var3 != null ? vl1Var3.e : kl1Var;
                                    vl1 vl1Var4 = (vl1) fdiVar2.getValue();
                                    kl1 kl1Var2 = vl1Var4 != null ? vl1Var4.g : kl1Var;
                                    vl1 vl1Var5 = (vl1) fdiVar2.getValue();
                                    ?? r39 = vl1Var5 != null ? vl1Var5.h : kl1Var;
                                    ?? r4 = (fkf.F(Boolean.valueOf(c)) || (vl1Var2 = (vl1) fdiVar2.getValue()) == null || (jl1Var2 = vl1Var2.j) == null || (a = jl1Var2.a()) == null) ? kl1Var : a.c;
                                    ?? r510 = (fkf.F(Boolean.valueOf(c)) || (vl1Var = (vl1) fdiVar2.getValue()) == null || (jl1Var = vl1Var.j) == null || (b = jl1Var.b()) == null) ? kl1Var : b.c;
                                    if (fkf.F(Boolean.valueOf(c))) {
                                        vl1 vl1Var6 = (vl1) fdiVar2.getValue();
                                        r62 = vl1Var6 != null ? vl1Var6.i : kl1Var;
                                    } else {
                                        r62 = kl1Var;
                                    }
                                    fdiVar2.l(fqe.l(wj1Var, r18, kl1Var2, r39, r4, r510, r62, mpeVar2));
                                    fqeVar9 = fqeVar10;
                                    ppeVar = ppeVar2;
                                } else {
                                    fqeVar10 = fqeVar9;
                                    ppeVar2 = ppeVar;
                                    mpeVar2 = null;
                                    if (mpeVar2 != null) {
                                    }
                                    mpe mpeVar42 = fqeVar10.A;
                                    fdi fdiVar22 = fqeVar10.w;
                                    c = Intrinsics.c(K2, mpeVar42 != null ? o02.K(mpeVar42.a) : kl1Var);
                                    fqeVar10.A = mpeVar2;
                                    wj1 wj1Var2 = fqeVar10.s.b;
                                    vl1 vl1Var32 = (vl1) fdiVar22.getValue();
                                    if (vl1Var32 != null) {
                                    }
                                    vl1 vl1Var42 = (vl1) fdiVar22.getValue();
                                    if (vl1Var42 != null) {
                                    }
                                    vl1 vl1Var52 = (vl1) fdiVar22.getValue();
                                    if (vl1Var52 != null) {
                                    }
                                    if (fkf.F(Boolean.valueOf(c))) {
                                    }
                                    if (fkf.F(Boolean.valueOf(c))) {
                                    }
                                    if (fkf.F(Boolean.valueOf(c))) {
                                    }
                                    fdiVar22.l(fqe.l(wj1Var2, r18, kl1Var2, r39, r4, r510, r62, mpeVar2));
                                    fqeVar9 = fqeVar10;
                                    ppeVar = ppeVar2;
                                }
                            }
                            fqeVar9.i.j(ppeVar);
                            return Unit.a;
                        }
                        lu3Var11 = lu3Var17;
                    } else {
                        lu3Var11 = lu3Var;
                    }
                    fsfVar78 = fsfVar13;
                    fsfVar79 = fsfVar73;
                    i20 = 0;
                    playerEventStatisticsResponse2 = playerEventStatisticsResponse6;
                    fsfVar77 = fsfVar78;
                    fqe fqeVar182 = fqeVar3;
                    Unit unit82 = Unit.a;
                    String str162 = str11;
                    substitutionIncident5 = substitutionIncident2;
                    fsfVar74 = fsfVar4;
                    substitutionIncident6 = substitutionIncident;
                    str9 = str162;
                    fqeVar3 = fqeVar182;
                    fsfVar75 = fsfVar3;
                    playerEventStatisticsResponse = playerEventStatisticsResponse2;
                    z2 = z;
                    fsfVar76 = fsfVar79;
                    PlayerEventStatisticsResponse playerEventStatisticsResponse72 = playerEventStatisticsResponse;
                    lu3 lu3Var182 = lu3Var11;
                    int i452 = i20;
                    z3 = z2;
                    int i462 = i19;
                    String str172 = str9;
                    fqeVar9 = fqeVar3;
                    ppeVar = new ppe(playerEventStatisticsResponse72, (PlayerEventStatisticsResponse) fsfVar17.a, (PlayerHeatmapResponse) fsfVar77.a, (PlayerHeatmapResponse) fsfVar74.a, (PlayerShotmapResponse) fsfVar.a, (FootballShotmapResponse) fsfVar76.a, (FootballShotmapResponse) fsfVar14.a, (List) fsfVar15.a, substitutionIncident6, substitutionIncident5);
                    fqeVar9.v = (List) fsfVar75.a;
                    if (z3) {
                    }
                } else {
                    fsf fsfVar183 = fsfVar13;
                    lu3Var11 = lu3Var;
                    String str18 = str11;
                    substitutionIncident5 = substitutionIncident2;
                    fsfVar74 = fsfVar4;
                    substitutionIncident6 = substitutionIncident;
                    str9 = str18;
                    fsfVar75 = fsfVar3;
                    playerEventStatisticsResponse = playerEventStatisticsResponse6;
                    fsf fsfVar184 = fsfVar73;
                    z2 = z;
                    fsfVar76 = fsfVar184;
                    fsfVar77 = fsfVar183;
                    i20 = 0;
                    PlayerEventStatisticsResponse playerEventStatisticsResponse722 = playerEventStatisticsResponse;
                    lu3 lu3Var1822 = lu3Var11;
                    int i4522 = i20;
                    z3 = z2;
                    int i4622 = i19;
                    String str1722 = str9;
                    fqeVar9 = fqeVar3;
                    ppeVar = new ppe(playerEventStatisticsResponse722, (PlayerEventStatisticsResponse) fsfVar17.a, (PlayerHeatmapResponse) fsfVar77.a, (PlayerHeatmapResponse) fsfVar74.a, (PlayerShotmapResponse) fsfVar.a, (FootballShotmapResponse) fsfVar76.a, (FootballShotmapResponse) fsfVar14.a, (List) fsfVar15.a, substitutionIncident6, substitutionIncident5);
                    fqeVar9.v = (List) fsfVar75.a;
                    if (z3) {
                    }
                }
                break;
            case 15:
                int i47 = this.O;
                int i48 = this.M;
                i22 = this.L;
                boolean z5 = this.P;
                player4 = this.K;
                PlayerEventStatisticsResponse playerEventStatisticsResponse8 = (PlayerEventStatisticsResponse) this.I;
                String str19 = (String) this.H;
                fqe fqeVar19 = (fqe) this.G;
                Incident.SubstitutionIncident substitutionIncident9 = (Incident.SubstitutionIncident) this.F;
                Incident.SubstitutionIncident substitutionIncident10 = (Incident.SubstitutionIncident) this.E;
                fsfVar81 = this.y;
                fsfVar80 = this.x;
                fsf fsfVar185 = this.w;
                fsfVar82 = this.v;
                fsf fsfVar186 = this.u;
                fsf fsfVar187 = this.t;
                fsf fsfVar188 = this.s;
                fsf fsfVar189 = this.r;
                y6a.M(obj);
                fqeVar3 = fqeVar19;
                i23 = i48;
                i21 = i47;
                playerEventStatisticsResponse3 = playerEventStatisticsResponse8;
                str10 = str19;
                fsfVar73 = fsfVar187;
                obj3 = "G";
                substitutionIncident2 = substitutionIncident9;
                fsfVar14 = fsfVar186;
                obj2 = Sports.BASEBALL;
                substitutionIncident = substitutionIncident10;
                fsfVar = fsfVar188;
                obj7 = Sports.FOOTBALL;
                z = z5;
                fsfVar3 = fsfVar185;
                fsfVar78 = fsfVar189;
                T14 = obj;
                Integer num162 = (Integer) T14;
                if (num162 != null) {
                    player4.setTopRated(num162 != null && i21 == num162.intValue());
                    Unit unit72 = Unit.a;
                    int i442 = i22;
                    fsfVar4 = fsfVar81;
                    fsfVar17 = fsfVar80;
                    fsfVar79 = fsfVar73;
                    playerEventStatisticsResponse2 = playerEventStatisticsResponse3;
                    i19 = i442;
                    i20 = i23;
                    str11 = str10;
                    fsfVar15 = fsfVar82;
                    fsfVar77 = fsfVar78;
                    fqe fqeVar1822 = fqeVar3;
                    Unit unit822 = Unit.a;
                    String str1622 = str11;
                    substitutionIncident5 = substitutionIncident2;
                    fsfVar74 = fsfVar4;
                    substitutionIncident6 = substitutionIncident;
                    str9 = str1622;
                    fqeVar3 = fqeVar1822;
                    fsfVar75 = fsfVar3;
                    playerEventStatisticsResponse = playerEventStatisticsResponse2;
                    z2 = z;
                    fsfVar76 = fsfVar79;
                    PlayerEventStatisticsResponse playerEventStatisticsResponse7222 = playerEventStatisticsResponse;
                    lu3 lu3Var18222 = lu3Var11;
                    int i45222 = i20;
                    z3 = z2;
                    int i46222 = i19;
                    String str17222 = str9;
                    fqeVar9 = fqeVar3;
                    ppeVar = new ppe(playerEventStatisticsResponse7222, (PlayerEventStatisticsResponse) fsfVar17.a, (PlayerHeatmapResponse) fsfVar77.a, (PlayerHeatmapResponse) fsfVar74.a, (PlayerShotmapResponse) fsfVar.a, (FootballShotmapResponse) fsfVar76.a, (FootballShotmapResponse) fsfVar14.a, (List) fsfVar15.a, substitutionIncident6, substitutionIncident5);
                    fqeVar9.v = (List) fsfVar75.a;
                    if (z3) {
                    }
                    break;
                }
                player4.setTopRated(num162 != null && i21 == num162.intValue());
                Unit unit722 = Unit.a;
                int i4422 = i22;
                fsfVar4 = fsfVar81;
                fsfVar17 = fsfVar80;
                fsfVar79 = fsfVar73;
                playerEventStatisticsResponse2 = playerEventStatisticsResponse3;
                i19 = i4422;
                i20 = i23;
                str11 = str10;
                fsfVar15 = fsfVar82;
                fsfVar77 = fsfVar78;
                fqe fqeVar18222 = fqeVar3;
                Unit unit8222 = Unit.a;
                String str16222 = str11;
                substitutionIncident5 = substitutionIncident2;
                fsfVar74 = fsfVar4;
                substitutionIncident6 = substitutionIncident;
                str9 = str16222;
                fqeVar3 = fqeVar18222;
                fsfVar75 = fsfVar3;
                playerEventStatisticsResponse = playerEventStatisticsResponse2;
                z2 = z;
                fsfVar76 = fsfVar79;
                PlayerEventStatisticsResponse playerEventStatisticsResponse72222 = playerEventStatisticsResponse;
                lu3 lu3Var182222 = lu3Var11;
                int i452222 = i20;
                z3 = z2;
                int i462222 = i19;
                String str172222 = str9;
                fqeVar9 = fqeVar3;
                ppeVar = new ppe(playerEventStatisticsResponse72222, (PlayerEventStatisticsResponse) fsfVar17.a, (PlayerHeatmapResponse) fsfVar77.a, (PlayerHeatmapResponse) fsfVar74.a, (PlayerShotmapResponse) fsfVar.a, (FootballShotmapResponse) fsfVar76.a, (FootballShotmapResponse) fsfVar14.a, (List) fsfVar15.a, substitutionIncident6, substitutionIncident5);
                fqeVar9.v = (List) fsfVar75.a;
                if (z3) {
                }
                break;
            case 16:
                ppeVar3 = (ppe) this.I;
                fqeVar11 = (fqe) this.G;
                y6a.M(obj);
                T15 = obj;
                kl1Var = null;
                ppeVar2 = ppeVar3;
                fqeVar10 = fqeVar11;
                mpeVar2 = (mpe) T15;
                if (mpeVar2 != null) {
                }
                mpe mpeVar422 = fqeVar10.A;
                fdi fdiVar222 = fqeVar10.w;
                c = Intrinsics.c(K2, mpeVar422 != null ? o02.K(mpeVar422.a) : kl1Var);
                fqeVar10.A = mpeVar2;
                wj1 wj1Var22 = fqeVar10.s.b;
                vl1 vl1Var322 = (vl1) fdiVar222.getValue();
                if (vl1Var322 != null) {
                }
                vl1 vl1Var422 = (vl1) fdiVar222.getValue();
                if (vl1Var422 != null) {
                }
                vl1 vl1Var522 = (vl1) fdiVar222.getValue();
                if (vl1Var522 != null) {
                }
                if (fkf.F(Boolean.valueOf(c))) {
                }
                if (fkf.F(Boolean.valueOf(c))) {
                }
                if (fkf.F(Boolean.valueOf(c))) {
                }
                fdiVar222.l(fqe.l(wj1Var22, r18, kl1Var2, r39, r4, r510, r62, mpeVar2));
                fqeVar9 = fqeVar10;
                ppeVar = ppeVar2;
                fqeVar9.i.j(ppeVar);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
