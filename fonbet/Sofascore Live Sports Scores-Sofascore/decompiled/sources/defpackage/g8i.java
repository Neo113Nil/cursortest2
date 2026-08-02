package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g8i extends hoi implements Function2 {
    public Serializable A;
    public List B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int r = 0;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public boolean v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8i(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, fsf fsfVar2, fsf fsfVar3, ArrayList arrayList, ArrayList arrayList2, fsf fsfVar4, boolean z, ArrayList arrayList3) {
        super(2, rq3Var);
        this.w = xmlPullParser;
        this.x = fsfVar;
        this.y = fsfVar2;
        this.z = fsfVar3;
        this.A = arrayList;
        this.B = arrayList2;
        this.C = fsfVar4;
        this.v = z;
        this.D = arrayList3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.D;
        switch (i) {
            case 0:
                g8i g8iVar = new g8i((h8i) obj2, rq3Var);
                g8iVar.u = obj;
                return g8iVar;
            default:
                g8i g8iVar2 = new g8i((XmlPullParser) this.w, rq3Var, (fsf) this.x, (fsf) this.y, (fsf) this.z, (ArrayList) this.A, (ArrayList) this.B, (fsf) this.C, this.v, (ArrayList) obj2);
                g8iVar2.u = obj;
                return g8iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((g8i) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0287, code lost:
    
        if (r3 == r10) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f8, code lost:
    
        if (r11 == r9) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015d, code lost:
    
        if (r11 == r9) goto L79;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01dc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00a2 -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ac -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b2 -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b8 -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c3 -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e6 -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f8 -> B:9:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0109 -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x012c -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x014b -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0174 -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01bf -> B:10:0x01d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01d2 -> B:10:0x01d7). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object w;
        TeamDetailsResponse teamDetailsResponse;
        av4 t;
        Team team;
        List<Team> relatedTeams;
        Object w2;
        zu4 zu4Var;
        List<Team> list;
        Object T;
        List<Team> list2;
        int i;
        Object T2;
        boolean z;
        Team team2;
        List<Team> list3;
        int depth;
        fsf fsfVar;
        Object obj2;
        String text;
        String name;
        List list4;
        Object h;
        int i2 = this.r;
        Object obj3 = this.D;
        int i3 = 1;
        int i4 = 2;
        int i5 = 3;
        rq3 rq3Var = null;
        switch (i2) {
            case 0:
                h8i h8iVar = (h8i) obj3;
                yzc yzcVar = h8iVar.j;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var = lu3.a;
                int i6 = this.t;
                if (i6 == 0) {
                    y6a.M(obj);
                    av4 t2 = xw3.t(ku3Var, null, new f8i(h8iVar, rq3Var, i3), 3);
                    if (h8iVar.h && !h8iVar.i) {
                        h8iVar.h = false;
                        this.u = ku3Var;
                        this.t = 1;
                        w = t2.w(this);
                        break;
                    }
                    return Unit.a;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        List<Team> list5 = (List) this.C;
                        list = this.B;
                        Team team3 = (Team) this.A;
                        yzc yzcVar2 = (yzc) this.z;
                        zu4Var = (zu4) this.y;
                        t = (av4) this.x;
                        teamDetailsResponse = (TeamDetailsResponse) this.w;
                        y6a.M(obj);
                        relatedTeams = list5;
                        yzcVar = yzcVar2;
                        team = team3;
                        w2 = obj;
                        int i7 = (((Boolean) w2).booleanValue() || Intrinsics.c(teamDetailsResponse.getTeam().getSportSlug(), Sports.CYCLING)) ? 0 : 1;
                        this.u = null;
                        this.w = null;
                        this.x = null;
                        this.y = zu4Var;
                        this.z = yzcVar;
                        this.A = team;
                        this.B = list;
                        this.C = relatedTeams;
                        this.s = i7;
                        this.t = 3;
                        T = t.T(this);
                        if (T != lu3Var) {
                            int i8 = i7;
                            list2 = list;
                            i = i8;
                            boolean booleanValue = ((Boolean) T).booleanValue();
                            this.u = null;
                            this.w = null;
                            this.x = null;
                            this.y = null;
                            this.z = yzcVar;
                            this.A = team;
                            this.B = list2;
                            this.C = relatedTeams;
                            this.s = i;
                            this.v = booleanValue;
                            this.t = 4;
                            T2 = zu4Var.T(this);
                            if (T2 != lu3Var) {
                            }
                        }
                        return lu3Var;
                    }
                    if (i6 != 3) {
                        if (i6 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = this.v;
                        i = this.s;
                        List<Team> list6 = (List) this.C;
                        list2 = this.B;
                        Team team4 = (Team) this.A;
                        yzc yzcVar3 = (yzc) this.z;
                        y6a.M(obj);
                        z = z2;
                        list3 = list6;
                        team2 = team4;
                        yzcVar = yzcVar3;
                        T2 = obj;
                        yzcVar.j(new e8i(team2, list2, list3, i == 0, z, ((Boolean) T2).booleanValue()));
                        h8iVar.h = true;
                        return Unit.a;
                    }
                    int i9 = this.s;
                    List<Team> list7 = (List) this.C;
                    list2 = this.B;
                    Team team5 = (Team) this.A;
                    yzc yzcVar4 = (yzc) this.z;
                    zu4Var = (zu4) this.y;
                    y6a.M(obj);
                    relatedTeams = list7;
                    i = i9;
                    yzcVar = yzcVar4;
                    team = team5;
                    T = obj;
                    boolean booleanValue2 = ((Boolean) T).booleanValue();
                    this.u = null;
                    this.w = null;
                    this.x = null;
                    this.y = null;
                    this.z = yzcVar;
                    this.A = team;
                    this.B = list2;
                    this.C = relatedTeams;
                    this.s = i;
                    this.v = booleanValue2;
                    this.t = 4;
                    T2 = zu4Var.T(this);
                    if (T2 != lu3Var) {
                        z = booleanValue2;
                        team2 = team;
                        list3 = relatedTeams;
                        yzcVar.j(new e8i(team2, list2, list3, i == 0, z, ((Boolean) T2).booleanValue()));
                        h8iVar.h = true;
                        return Unit.a;
                    }
                    return lu3Var;
                }
                y6a.M(obj);
                w = obj;
                teamDetailsResponse = (TeamDetailsResponse) w;
                if (teamDetailsResponse == null) {
                    yzcVar.j(null);
                    h8iVar.h = true;
                    return Unit.a;
                }
                h8iVar.i = true;
                t = xw3.t(ku3Var, null, new f8i(h8iVar, rq3Var, i5), 3);
                av4 t3 = xw3.t(ku3Var, null, new f8i(h8iVar, rq3Var, i4), 3);
                team = teamDetailsResponse.getTeam();
                List<Team> drivers = teamDetailsResponse.getDrivers();
                relatedTeams = teamDetailsResponse.getRelatedTeams();
                this.u = null;
                this.w = teamDetailsResponse;
                this.x = t;
                this.y = t3;
                this.z = yzcVar;
                this.A = team;
                this.B = drivers;
                this.C = relatedTeams;
                this.t = 2;
                w2 = t.w(this);
                if (w2 != lu3Var) {
                    zu4Var = t3;
                    list = drivers;
                    if (((Boolean) w2).booleanValue()) {
                    }
                    this.u = null;
                    this.w = null;
                    this.x = null;
                    this.y = zu4Var;
                    this.z = yzcVar;
                    this.A = team;
                    this.B = list;
                    this.C = relatedTeams;
                    this.s = i7;
                    this.t = 3;
                    T = t.T(this);
                    if (T != lu3Var) {
                    }
                }
                return lu3Var;
            default:
                XmlPullParser xmlPullParser = (XmlPullParser) this.w;
                lu3 lu3Var2 = lu3.a;
                switch (this.t) {
                    case 0:
                        y6a.M(obj);
                        s9a.t((ku3) this.u);
                        if (d1.B(xmlPullParser)) {
                            xmlPullParser.nextTag();
                        }
                        if (xmlPullParser.getEventType() == 1) {
                            return Unit.a;
                        }
                        if (xmlPullParser.getEventType() != 2) {
                            pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                            return null;
                        }
                        depth = xmlPullParser.getDepth();
                        if (xmlPullParser.getDepth() < depth) {
                            return Unit.a;
                        }
                        int depth2 = xmlPullParser.getDepth() - depth;
                        if (depth2 != 0) {
                            if (depth2 == 1) {
                                mqi mqiVar = d1.a;
                                if (xmlPullParser.getEventType() == 2 && (name = xmlPullParser.getName()) != null) {
                                    switch (name.hashCode()) {
                                        case -2049897434:
                                            if (name.equals("VideoClicks")) {
                                                fsf fsfVar2 = (fsf) this.C;
                                                boolean z3 = this.v;
                                                this.u = fsfVar2;
                                                this.s = depth;
                                                this.t = 5;
                                                Object A = d1.A(xmlPullParser, z3, this);
                                                if (A != lu3Var2) {
                                                    fsfVar2.a = A;
                                                    break;
                                                }
                                                return lu3Var2;
                                            }
                                            break;
                                        case -1927368268:
                                            if (name.equals("Duration")) {
                                                fsfVar = (fsf) this.z;
                                                this.u = fsfVar;
                                                this.s = depth;
                                                this.t = 2;
                                                obj2 = d1.o(xmlPullParser, this);
                                                break;
                                            }
                                            break;
                                        case -1348833651:
                                            if (name.equals("AdParameters")) {
                                                fsf fsfVar3 = (fsf) this.y;
                                                this.u = fsfVar3;
                                                this.s = depth;
                                                this.t = 1;
                                                Object D = d1.D(xmlPullParser, this);
                                                if (D != lu3Var2) {
                                                    fsfVar3.a = D;
                                                    break;
                                                }
                                                return lu3Var2;
                                            }
                                            break;
                                        case -385055469:
                                            if (name.equals("MediaFiles")) {
                                                ArrayList arrayList = (ArrayList) this.A;
                                                this.u = arrayList;
                                                this.s = depth;
                                                this.t = 3;
                                                Object l = d1.l(xmlPullParser, this);
                                                if (l != lu3Var2) {
                                                    arrayList.addAll((Collection) l);
                                                    break;
                                                }
                                                return lu3Var2;
                                            }
                                            break;
                                        case 70476538:
                                            if (name.equals("Icons")) {
                                                list4 = (ArrayList) obj3;
                                                this.u = list4;
                                                this.s = depth;
                                                this.t = 6;
                                                h = d1.h(xmlPullParser, this);
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name.equals("TrackingEvents")) {
                                                ArrayList arrayList2 = (ArrayList) this.B;
                                                this.u = arrayList2;
                                                this.s = depth;
                                                this.t = 4;
                                                Object p = d1.p(xmlPullParser, this);
                                                if (p != lu3Var2) {
                                                    arrayList2.addAll((Collection) p);
                                                    break;
                                                }
                                                return lu3Var2;
                                            }
                                            break;
                                    }
                                }
                            }
                        } else {
                            mqi mqiVar2 = d1.a;
                            if (xmlPullParser.getEventType() == 2) {
                                fsf fsfVar4 = (fsf) this.x;
                                String u = d1.u(xmlPullParser, "skipoffset");
                                if (u != null) {
                                    fsfVar4.a = d1.y(u);
                                } else {
                                    fsfVar4.a = null;
                                }
                            } else if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                                String text2 = xmlPullParser.getText();
                                text2.getClass();
                                StringsKt.l0(text2).toString();
                            } else if (xmlPullParser.getEventType() == 3) {
                                return Unit.a;
                            }
                        }
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 1:
                        depth = this.s;
                        fsf fsfVar5 = (fsf) this.u;
                        y6a.M(obj);
                        fsfVar5.a = obj;
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 2:
                        depth = this.s;
                        fsfVar = (fsf) this.u;
                        y6a.M(obj);
                        obj2 = obj;
                        String str = (String) obj2;
                        if (str != null) {
                            fsfVar.a = d1.w(str);
                        } else {
                            fsfVar.a = null;
                        }
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 3:
                        depth = this.s;
                        List list8 = (List) this.u;
                        y6a.M(obj);
                        list8.addAll((Collection) obj);
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 4:
                        depth = this.s;
                        List list9 = (List) this.u;
                        y6a.M(obj);
                        list9.addAll((Collection) obj);
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 5:
                        depth = this.s;
                        fsf fsfVar6 = (fsf) this.u;
                        y6a.M(obj);
                        fsfVar6.a = obj;
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 6:
                        depth = this.s;
                        list4 = (List) this.u;
                        y6a.M(obj);
                        h = obj;
                        list4.addAll((Collection) h);
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8i(h8i h8iVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.D = h8iVar;
    }
}
