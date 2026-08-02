package defpackage;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.MmaMonthsWithEventsResponse;
import com.sofascore.model.util.MonthWithYear;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tpc extends hoi implements Function2 {
    public Serializable A;
    public Serializable B;
    public Serializable C;
    public Serializable D;
    public Serializable E;
    public Object F;
    public final /* synthetic */ int r = 0;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public Object v;
    public Object w;
    public Object x;
    public Serializable y;
    public final /* synthetic */ Serializable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpc(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, fsf fsfVar2, fsf fsfVar3, fsf fsfVar4, fsf fsfVar5, fsf fsfVar6, ArrayList arrayList, fsf fsfVar7, ArrayList arrayList2, ArrayList arrayList3) {
        super(2, rq3Var);
        this.v = xmlPullParser;
        this.w = fsfVar;
        this.x = fsfVar2;
        this.y = fsfVar3;
        this.z = fsfVar4;
        this.A = fsfVar5;
        this.B = fsfVar6;
        this.C = arrayList;
        this.D = fsfVar7;
        this.E = arrayList2;
        this.F = arrayList3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Serializable serializable = this.z;
        switch (i) {
            case 0:
                tpc tpcVar = new tpc((MonthWithYear) serializable, (vpc) this.F, this.t, rq3Var);
                tpcVar.u = obj;
                return tpcVar;
            case 1:
                tpc tpcVar2 = new tpc((XmlPullParser) this.v, rq3Var, (fsf) this.w, (fsf) this.x, (fsf) this.y, (fsf) serializable, (fsf) this.A, (fsf) this.B, (ArrayList) this.C, (fsf) this.D, (ArrayList) this.E, (ArrayList) this.F);
                tpcVar2.u = obj;
                return tpcVar2;
            default:
                tpc tpcVar3 = new tpc((XmlPullParser) this.v, rq3Var, (fsf) this.w, (fsf) this.x, (fsf) this.y, (fsf) serializable, (fsf) this.A, (fsf) this.B, (fsf) this.C, (fsf) this.D, (ArrayList) this.E);
                tpcVar3.u = obj;
                return tpcVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((tpc) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x031d, code lost:
    
        if (r11 == r12) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0348, code lost:
    
        if (r11 == r12) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x038a, code lost:
    
        if (r11 == r12) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03b3, code lost:
    
        if (r13 == r12) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0424, code lost:
    
        if (r7 == r12) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05cd, code lost:
    
        if (r7 != r6) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0599, code lost:
    
        if (r5 == r6) goto L320;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0672 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0146  */
    /* JADX WARN: Type inference failed for: r5v20, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v16, types: [zu4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0233 -> B:16:0x0238). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x02f2 -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x02fb -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x0301 -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0307 -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x030f -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x0323 -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0325 -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0338 -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x0348 -> B:125:0x034c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x035e -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x037b -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x0390 -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x0392 -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x03a1 -> B:127:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x03e2 -> B:128:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x03f3 -> B:128:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x0414 -> B:128:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x0429 -> B:128:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x042b -> B:128:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:191:0x043d -> B:128:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x04b4 -> B:129:0x04cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x04c8 -> B:129:0x04cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b5 -> B:16:0x0238). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bf -> B:16:0x0238). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0180 -> B:16:0x0238). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0190 -> B:13:0x0194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x021f -> B:16:0x0238). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        av4 t2;
        List<MonthWithYear> list;
        Object w;
        Object obj2;
        Object T;
        Object T2;
        MonthWithYear monthWithYear;
        EventListResponse eventListResponse;
        EventListResponse eventListResponse2;
        ltb ltbVar;
        ltb ltbVar2;
        Object k;
        rpc rpcVar;
        ltb ltbVar3;
        List<Event> events;
        int depth;
        Object obj3;
        Object obj4;
        String str;
        Object obj5;
        List list2;
        Object obj6;
        String text;
        String name;
        Object o;
        int depth2;
        XmlPullParser xmlPullParser;
        Object obj7;
        fsf fsfVar;
        p pVar;
        Object g0Var;
        Object obj8;
        a0 a0Var;
        String name2;
        Object obj9;
        o oVar;
        String text2;
        int i = this.r;
        String str2 = "StaticResource";
        Serializable serializable = this.z;
        int i2 = 1;
        int i3 = 2;
        switch (i) {
            case 0:
                MonthWithYear monthWithYear2 = (MonthWithYear) serializable;
                int i4 = this.t;
                vpc vpcVar = (vpc) this.F;
                yzc yzcVar = vpcVar.h;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                if (i5 == 4) {
                                    ltbVar3 = (ltb) this.D;
                                    rpcVar = (rpc) this.E;
                                    ltb ltbVar4 = (ltb) this.C;
                                    ltbVar2 = (ltb) this.B;
                                    monthWithYear = (MonthWithYear) this.y;
                                    List<MonthWithYear> list3 = (List) this.x;
                                    y6a.M(obj);
                                    ltbVar = ltbVar4;
                                    list = list3;
                                    k = obj;
                                    if (ltbVar.isEmpty() && list != null && !list.isEmpty()) {
                                        ltbVar.put(rpc.c, km5.a);
                                    }
                                    ltbVar2.getClass();
                                    vpcVar.f.j(new qpc(ltbVar2.d(), monthWithYear));
                                    if (!Intrinsics.c(list, yzcVar.d())) {
                                        yzcVar.j(list);
                                    }
                                    break;
                                } else {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                eventListResponse = (EventListResponse) this.A;
                                MonthWithYear monthWithYear3 = (MonthWithYear) this.y;
                                List<MonthWithYear> list4 = (List) this.x;
                                y6a.M(obj);
                                monthWithYear = monthWithYear3;
                                list = list4;
                                T2 = obj;
                                eventListResponse2 = (EventListResponse) T2;
                                ltbVar = new ltb();
                                if (eventListResponse != null) {
                                }
                                if (eventListResponse2 != null) {
                                    rpc rpcVar2 = rpc.b;
                                    List<Event> events2 = eventListResponse2.getEvents();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj10 : events2) {
                                        Event event = (Event) obj10;
                                        if (eventListResponse != null && (events = eventListResponse.getEvents()) != null) {
                                            if (events.contains(event)) {
                                            }
                                        }
                                        arrayList.add(obj10);
                                    }
                                }
                                if (monthWithYear == null) {
                                    rpc rpcVar3 = rpc.c;
                                    this.u = null;
                                    this.v = null;
                                    this.w = null;
                                    this.x = list;
                                    this.y = monthWithYear;
                                    this.A = null;
                                    this.B = ltbVar;
                                    this.C = ltbVar;
                                    this.E = rpcVar3;
                                    this.D = ltbVar;
                                    this.s = 4;
                                    k = vpcVar.k(i4, monthWithYear, this);
                                    if (k != lu3Var) {
                                        rpcVar = rpcVar3;
                                        ltbVar3 = ltbVar;
                                        ltbVar2 = ltbVar3;
                                        if (ltbVar.isEmpty()) {
                                            ltbVar.put(rpc.c, km5.a);
                                        }
                                        ltbVar2.getClass();
                                        vpcVar.f.j(new qpc(ltbVar2.d(), monthWithYear));
                                        if (!Intrinsics.c(list, yzcVar.d())) {
                                        }
                                    }
                                    break;
                                } else {
                                    ltbVar2 = ltbVar;
                                    if (ltbVar.isEmpty()) {
                                    }
                                    ltbVar2.getClass();
                                    vpcVar.f.j(new qpc(ltbVar2.d(), monthWithYear));
                                    if (!Intrinsics.c(list, yzcVar.d())) {
                                    }
                                }
                            }
                        } else {
                            monthWithYear2 = (MonthWithYear) this.y;
                            list = (List) this.x;
                            ?? r7 = (zu4) this.w;
                            y6a.M(obj);
                            t2 = r7;
                            obj2 = null;
                            T = obj;
                            EventListResponse eventListResponse3 = (EventListResponse) T;
                            this.u = obj2;
                            this.v = obj2;
                            this.w = obj2;
                            this.x = list;
                            this.y = monthWithYear2;
                            this.A = eventListResponse3;
                            this.s = 3;
                            T2 = t2.T(this);
                            if (T2 != lu3Var) {
                                monthWithYear = monthWithYear2;
                                eventListResponse = eventListResponse3;
                                eventListResponse2 = (EventListResponse) T2;
                                ltbVar = new ltb();
                                if (eventListResponse != null) {
                                }
                                if (eventListResponse2 != null) {
                                }
                                if (monthWithYear == null) {
                                }
                            }
                        }
                    } else {
                        ?? r5 = (zu4) this.w;
                        t = (av4) this.v;
                        y6a.M(obj);
                        t2 = r5;
                        w = obj;
                    }
                } else {
                    y6a.M(obj);
                    rq3 rq3Var = null;
                    t = xw3.t(ku3Var, null, new spc(vpcVar, i4, rq3Var, 0), 3);
                    t2 = xw3.t(ku3Var, null, new spc(vpcVar, i4, rq3Var, 1), 3);
                    if (monthWithYear2 == null) {
                        av4 t3 = xw3.t(ku3Var, null, new spc(vpcVar, i4, rq3Var, 2), 3);
                        this.u = null;
                        this.v = t;
                        this.w = t2;
                        this.x = null;
                        this.s = 1;
                        w = t3.w(this);
                        break;
                    } else {
                        list = (List) yzcVar.d();
                        if (monthWithYear2 == null) {
                            monthWithYear2 = list != null ? (MonthWithYear) CollectionsKt.firstOrNull(list) : null;
                        }
                        obj2 = null;
                        this.u = null;
                        this.v = null;
                        this.w = t2;
                        this.x = list;
                        this.y = monthWithYear2;
                        this.s = 2;
                        T = t.T(this);
                        break;
                    }
                }
                MmaMonthsWithEventsResponse mmaMonthsWithEventsResponse = (MmaMonthsWithEventsResponse) w;
                list = mmaMonthsWithEventsResponse != null ? mmaMonthsWithEventsResponse.getMonthsWithEvents() : null;
                if (monthWithYear2 == null) {
                }
                obj2 = null;
                this.u = null;
                this.v = null;
                this.w = t2;
                this.x = list;
                this.y = monthWithYear2;
                this.s = 2;
                T = t.T(this);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.E;
                XmlPullParser xmlPullParser2 = (XmlPullParser) this.v;
                lu3 lu3Var2 = lu3.a;
                switch (this.t) {
                    case 0:
                        y6a.M(obj);
                        s9a.t((ku3) this.u);
                        if (d1.B(xmlPullParser2)) {
                            xmlPullParser2.nextTag();
                        }
                        if (xmlPullParser2.getEventType() == 1) {
                            break;
                        } else if (xmlPullParser2.getEventType() != 2) {
                            pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                            break;
                        } else {
                            depth = xmlPullParser2.getDepth();
                            if (xmlPullParser2.getDepth() < depth) {
                                break;
                            } else {
                                int depth3 = xmlPullParser2.getDepth() - depth;
                                if (depth3 == 0) {
                                    str = str2;
                                    mqi mqiVar = d1.a;
                                    if (xmlPullParser2.getEventType() != 2) {
                                        if (xmlPullParser2.getEventType() == 4 && (text = xmlPullParser2.getText()) != null && !StringsKt.R(text)) {
                                            String text3 = xmlPullParser2.getText();
                                            text3.getClass();
                                            StringsKt.l0(text3).toString();
                                        } else if (xmlPullParser2.getEventType() == 3) {
                                            break;
                                        }
                                    } else {
                                        ((fsf) this.w).a = d1.u(xmlPullParser2, "id");
                                        fsf fsfVar2 = (fsf) this.x;
                                        String u = d1.u(xmlPullParser2, "width");
                                        fsfVar2.a = u != null ? StringsKt.toIntOrNull(u) : null;
                                        fsf fsfVar3 = (fsf) this.y;
                                        String u2 = d1.u(xmlPullParser2, "height");
                                        if (u2 != null) {
                                            fsfVar3.a = StringsKt.toIntOrNull(u2);
                                            ((fsf) serializable).a = d1.u(xmlPullParser2, "apiFramework");
                                        } else {
                                            fsfVar3.a = null;
                                            ((fsf) serializable).a = d1.u(xmlPullParser2, "apiFramework");
                                        }
                                    }
                                } else {
                                    if (depth3 == 1) {
                                        mqi mqiVar2 = d1.a;
                                        if (xmlPullParser2.getEventType() == i3 && (name = xmlPullParser2.getName()) != null) {
                                            switch (name.hashCode()) {
                                                case -1348833651:
                                                    str = str2;
                                                    if (name.equals("AdParameters")) {
                                                        fsf fsfVar4 = (fsf) this.B;
                                                        this.u = fsfVar4;
                                                        this.s = depth;
                                                        this.t = 5;
                                                        Object D = d1.D(xmlPullParser2, this);
                                                        if (D != lu3Var2) {
                                                            fsfVar4.a = D;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case -375340334:
                                                    str = str2;
                                                    if (name.equals("IFrameResource")) {
                                                        this.u = null;
                                                        this.s = depth;
                                                        this.t = 3;
                                                        obj5 = d1.e(xmlPullParser2, this);
                                                        break;
                                                    }
                                                    break;
                                                case -348198615:
                                                    str = str2;
                                                    if (name.equals("CompanionClickThrough")) {
                                                        fsf fsfVar5 = (fsf) this.D;
                                                        this.u = fsfVar5;
                                                        this.s = depth;
                                                        this.t = 7;
                                                        Object o2 = d1.o(xmlPullParser2, this);
                                                        if (o2 != lu3Var2) {
                                                            fsfVar5.a = o2;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 611554000:
                                                    if (name.equals("TrackingEvents")) {
                                                        list2 = (ArrayList) this.C;
                                                        this.u = list2;
                                                        this.s = depth;
                                                        this.t = 6;
                                                        obj6 = d1.p(xmlPullParser2, this);
                                                        break;
                                                    }
                                                    break;
                                                case 676623548:
                                                    if (name.equals(str2)) {
                                                        this.u = null;
                                                        this.s = depth;
                                                        this.t = 1;
                                                        obj3 = d1.n(xmlPullParser2, this);
                                                        break;
                                                    }
                                                    break;
                                                case 759877206:
                                                    if (name.equals("AltText")) {
                                                        fsf fsfVar6 = (fsf) this.A;
                                                        this.u = fsfVar6;
                                                        this.s = depth;
                                                        this.t = 4;
                                                        Object o3 = d1.o(xmlPullParser2, this);
                                                        if (o3 != lu3Var2) {
                                                            fsfVar6.a = o3;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 1877773523:
                                                    if (name.equals("CompanionClickTracking")) {
                                                        this.u = null;
                                                        this.s = depth;
                                                        this.t = 8;
                                                        o = d1.o(xmlPullParser2, this);
                                                        break;
                                                    }
                                                    break;
                                                case 1928285401:
                                                    if (name.equals("HTMLResource")) {
                                                        this.u = null;
                                                        this.s = depth;
                                                        this.t = i3;
                                                        obj4 = d1.d(xmlPullParser2, this);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                    str = str2;
                                }
                                xmlPullParser2.next();
                                str2 = str;
                                i3 = 2;
                                if (xmlPullParser2.getDepth() < depth) {
                                }
                            }
                        }
                        break;
                    case 1:
                        depth = this.s;
                        y6a.M(obj);
                        obj3 = obj;
                        a0 a0Var2 = (a0) obj3;
                        if (a0Var2 != null) {
                            arrayList2.add(new h0(a0Var2));
                        }
                        str = str2;
                        xmlPullParser2.next();
                        str2 = str;
                        i3 = 2;
                        if (xmlPullParser2.getDepth() < depth) {
                        }
                        break;
                    case 2:
                        depth = this.s;
                        y6a.M(obj);
                        obj4 = obj;
                        o oVar2 = (o) obj4;
                        if (oVar2 != null) {
                            arrayList2.add(new f0(oVar2));
                        }
                        str = str2;
                        xmlPullParser2.next();
                        str2 = str;
                        i3 = 2;
                        if (xmlPullParser2.getDepth() < depth) {
                        }
                        break;
                    case 3:
                        depth = this.s;
                        y6a.M(obj);
                        str = "StaticResource";
                        obj5 = obj;
                        p pVar2 = (p) obj5;
                        if (pVar2 != null) {
                            arrayList2.add(new g0(pVar2));
                        }
                        xmlPullParser2.next();
                        str2 = str;
                        i3 = 2;
                        if (xmlPullParser2.getDepth() < depth) {
                        }
                        break;
                    case 4:
                        depth = this.s;
                        fsf fsfVar7 = (fsf) this.u;
                        y6a.M(obj);
                        fsfVar7.a = obj;
                        str = str2;
                        xmlPullParser2.next();
                        str2 = str;
                        i3 = 2;
                        if (xmlPullParser2.getDepth() < depth) {
                        }
                        break;
                    case 5:
                        depth = this.s;
                        fsf fsfVar8 = (fsf) this.u;
                        y6a.M(obj);
                        str = "StaticResource";
                        fsfVar8.a = obj;
                        xmlPullParser2.next();
                        str2 = str;
                        i3 = 2;
                        if (xmlPullParser2.getDepth() < depth) {
                        }
                        break;
                    case 6:
                        depth = this.s;
                        list2 = (List) this.u;
                        y6a.M(obj);
                        obj6 = obj;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj11 : (Iterable) obj6) {
                            int i6 = depth;
                            String str3 = str2;
                            if (((b0) obj11).a == c0.a) {
                                arrayList3.add(obj11);
                            }
                            depth = i6;
                            str2 = str3;
                        }
                        str = str2;
                        list2.addAll(arrayList3);
                        xmlPullParser2.next();
                        str2 = str;
                        i3 = 2;
                        if (xmlPullParser2.getDepth() < depth) {
                        }
                        break;
                    case 7:
                        depth = this.s;
                        fsf fsfVar9 = (fsf) this.u;
                        y6a.M(obj);
                        str = "StaticResource";
                        fsfVar9.a = obj;
                        xmlPullParser2.next();
                        str2 = str;
                        i3 = 2;
                        if (xmlPullParser2.getDepth() < depth) {
                        }
                        break;
                    case 8:
                        depth = this.s;
                        y6a.M(obj);
                        o = obj;
                        String str4 = (String) o;
                        if (str4 != null) {
                            ((ArrayList) this.F).add(str4);
                        }
                        str = str2;
                        xmlPullParser2.next();
                        str2 = str;
                        i3 = 2;
                        if (xmlPullParser2.getDepth() < depth) {
                        }
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
            default:
                XmlPullParser xmlPullParser3 = (XmlPullParser) this.v;
                lu3 lu3Var3 = lu3.a;
                int i7 = this.t;
                if (i7 == 0) {
                    y6a.M(obj);
                    s9a.t((ku3) this.u);
                    if (d1.B(xmlPullParser3)) {
                        xmlPullParser3.nextTag();
                    }
                    if (xmlPullParser3.getEventType() == 1) {
                        break;
                    } else if (xmlPullParser3.getEventType() != 2) {
                        pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                        break;
                    } else {
                        depth2 = xmlPullParser3.getDepth();
                        if (xmlPullParser3.getDepth() < depth2) {
                        }
                    }
                } else if (i7 == 1) {
                    depth2 = this.s;
                    fsfVar = (fsf) this.F;
                    xmlPullParser = (XmlPullParser) this.u;
                    y6a.M(obj);
                    obj8 = obj;
                    a0Var = (a0) obj8;
                    if (a0Var != null) {
                    }
                    g0Var = null;
                    fsfVar.a = g0Var;
                    name2 = xmlPullParser.getName();
                    if (Intrinsics.c(name2, "IconClicks")) {
                    }
                    xmlPullParser3.next();
                    i2 = 1;
                    if (xmlPullParser3.getDepth() < depth2) {
                    }
                } else if (i7 == 2) {
                    depth2 = this.s;
                    fsfVar = (fsf) this.F;
                    xmlPullParser = (XmlPullParser) this.u;
                    y6a.M(obj);
                    obj9 = obj;
                    oVar = (o) obj9;
                    if (oVar != null) {
                    }
                    g0Var = null;
                    fsfVar.a = g0Var;
                    name2 = xmlPullParser.getName();
                    if (Intrinsics.c(name2, "IconClicks")) {
                    }
                    xmlPullParser3.next();
                    i2 = 1;
                    if (xmlPullParser3.getDepth() < depth2) {
                    }
                } else if (i7 == 3) {
                    depth2 = this.s;
                    fsfVar = (fsf) this.F;
                    xmlPullParser = (XmlPullParser) this.u;
                    y6a.M(obj);
                    obj7 = obj;
                    pVar = (p) obj7;
                    if (pVar != null) {
                    }
                    g0Var = null;
                    fsfVar.a = g0Var;
                    name2 = xmlPullParser.getName();
                    if (Intrinsics.c(name2, "IconClicks")) {
                    }
                    xmlPullParser3.next();
                    i2 = 1;
                    if (xmlPullParser3.getDepth() < depth2) {
                    }
                } else if (i7 == 4) {
                    depth2 = this.s;
                    fsf fsfVar10 = (fsf) this.u;
                    y6a.M(obj);
                    fsfVar10.a = obj;
                    xmlPullParser3.next();
                    i2 = 1;
                    if (xmlPullParser3.getDepth() < depth2) {
                    }
                } else if (i7 != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    depth2 = this.s;
                    y6a.M(obj);
                    Object o4 = obj;
                    String str5 = (String) o4;
                    if (str5 != null) {
                        ((ArrayList) this.E).add(str5);
                    }
                    xmlPullParser3.next();
                    i2 = 1;
                    if (xmlPullParser3.getDepth() < depth2) {
                        break;
                    } else {
                        int depth4 = xmlPullParser3.getDepth() - depth2;
                        if (depth4 == 0) {
                            mqi mqiVar3 = d1.a;
                            if (xmlPullParser3.getEventType() != 2) {
                                if (xmlPullParser3.getEventType() == 4 && (text2 = xmlPullParser3.getText()) != null && !StringsKt.R(text2)) {
                                    String text4 = xmlPullParser3.getText();
                                    text4.getClass();
                                    StringsKt.l0(text4).toString();
                                } else if (xmlPullParser3.getEventType() == 3) {
                                    break;
                                }
                            } else {
                                ((fsf) this.w).a = d1.u(xmlPullParser3, "program");
                                fsf fsfVar11 = (fsf) this.x;
                                String u3 = d1.u(xmlPullParser3, "width");
                                fsfVar11.a = u3 != null ? StringsKt.toIntOrNull(u3) : null;
                                fsf fsfVar12 = (fsf) this.y;
                                String u4 = d1.u(xmlPullParser3, "height");
                                fsfVar12.a = u4 != null ? StringsKt.toIntOrNull(u4) : null;
                                ((fsf) serializable).a = d1.u(xmlPullParser3, "apiFramework");
                                fsf fsfVar13 = (fsf) this.A;
                                String u5 = d1.u(xmlPullParser3, "offset");
                                fsfVar13.a = u5 != null ? d1.y(u5) : null;
                                fsf fsfVar14 = (fsf) this.B;
                                String u6 = d1.u(xmlPullParser3, IronSourceConstants.EVENTS_DURATION);
                                if (u6 != null) {
                                    fsfVar14.a = d1.w(u6);
                                } else {
                                    fsfVar14.a = null;
                                }
                            }
                        } else if (depth4 == i2) {
                            mqi mqiVar4 = d1.a;
                            if (xmlPullParser3.getEventType() == 2) {
                                fsfVar = (fsf) this.C;
                                if (fsfVar.a != null) {
                                    xmlPullParser = xmlPullParser3;
                                    name2 = xmlPullParser.getName();
                                    if (Intrinsics.c(name2, "IconClicks")) {
                                        fsf fsfVar15 = (fsf) this.D;
                                        this.u = fsfVar15;
                                        this.F = null;
                                        this.s = depth2;
                                        this.t = 4;
                                        Object f = d1.f(xmlPullParser, this);
                                        if (f != lu3Var3) {
                                            fsfVar15.a = f;
                                        }
                                    } else if (Intrinsics.c(name2, "IconViewTracking")) {
                                        this.u = null;
                                        this.F = null;
                                        this.s = depth2;
                                        this.t = 5;
                                        o4 = d1.o(xmlPullParser, this);
                                        if (o4 == lu3Var3) {
                                        }
                                        String str52 = (String) o4;
                                        if (str52 != null) {
                                        }
                                    }
                                } else {
                                    String name3 = xmlPullParser3.getName();
                                    if (name3 != null) {
                                        int hashCode = name3.hashCode();
                                        if (hashCode == -375340334) {
                                            if (name3.equals("IFrameResource")) {
                                                this.u = xmlPullParser3;
                                                this.F = fsfVar;
                                                this.s = depth2;
                                                this.t = 3;
                                                obj7 = d1.e(xmlPullParser3, this);
                                                if (obj7 != lu3Var3) {
                                                    xmlPullParser = xmlPullParser3;
                                                    pVar = (p) obj7;
                                                    if (pVar != null) {
                                                        g0Var = new g0(pVar);
                                                        fsfVar.a = g0Var;
                                                        name2 = xmlPullParser.getName();
                                                        if (Intrinsics.c(name2, "IconClicks")) {
                                                        }
                                                    }
                                                    g0Var = null;
                                                    fsfVar.a = g0Var;
                                                    name2 = xmlPullParser.getName();
                                                    if (Intrinsics.c(name2, "IconClicks")) {
                                                    }
                                                }
                                            }
                                        } else if (hashCode == 676623548) {
                                            if (name3.equals("StaticResource")) {
                                                this.u = xmlPullParser3;
                                                this.F = fsfVar;
                                                this.s = depth2;
                                                this.t = 1;
                                                obj8 = d1.n(xmlPullParser3, this);
                                                if (obj8 != lu3Var3) {
                                                    xmlPullParser = xmlPullParser3;
                                                    a0Var = (a0) obj8;
                                                    if (a0Var != null) {
                                                        g0Var = new h0(a0Var);
                                                        fsfVar.a = g0Var;
                                                        name2 = xmlPullParser.getName();
                                                        if (Intrinsics.c(name2, "IconClicks")) {
                                                        }
                                                    }
                                                    g0Var = null;
                                                    fsfVar.a = g0Var;
                                                    name2 = xmlPullParser.getName();
                                                    if (Intrinsics.c(name2, "IconClicks")) {
                                                    }
                                                }
                                            }
                                        } else if (hashCode == 1928285401 && name3.equals("HTMLResource")) {
                                            this.u = xmlPullParser3;
                                            this.F = fsfVar;
                                            this.s = depth2;
                                            this.t = 2;
                                            obj9 = d1.d(xmlPullParser3, this);
                                            if (obj9 != lu3Var3) {
                                                xmlPullParser = xmlPullParser3;
                                                oVar = (o) obj9;
                                                if (oVar != null) {
                                                    g0Var = new f0(oVar);
                                                    fsfVar.a = g0Var;
                                                    name2 = xmlPullParser.getName();
                                                    if (Intrinsics.c(name2, "IconClicks")) {
                                                    }
                                                }
                                                g0Var = null;
                                                fsfVar.a = g0Var;
                                                name2 = xmlPullParser.getName();
                                                if (Intrinsics.c(name2, "IconClicks")) {
                                                }
                                            }
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    g0Var = null;
                                    fsfVar.a = g0Var;
                                    name2 = xmlPullParser.getName();
                                    if (Intrinsics.c(name2, "IconClicks")) {
                                    }
                                }
                            }
                        }
                        xmlPullParser3.next();
                        i2 = 1;
                        if (xmlPullParser3.getDepth() < depth2) {
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpc(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, fsf fsfVar2, fsf fsfVar3, fsf fsfVar4, fsf fsfVar5, fsf fsfVar6, fsf fsfVar7, fsf fsfVar8, ArrayList arrayList) {
        super(2, rq3Var);
        this.v = xmlPullParser;
        this.w = fsfVar;
        this.x = fsfVar2;
        this.y = fsfVar3;
        this.z = fsfVar4;
        this.A = fsfVar5;
        this.B = fsfVar6;
        this.C = fsfVar7;
        this.D = fsfVar8;
        this.E = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpc(MonthWithYear monthWithYear, vpc vpcVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = monthWithYear;
        this.F = vpcVar;
        this.t = i;
    }
}
