package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j;
import com.sofascore.model.newNetwork.EventIdsResponse;
import com.sofascore.results.league.service.LeagueWorker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g5b extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ boolean v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5b(LeagueWorker leagueWorker, int i, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = leagueWorker;
        this.t = i;
        this.v = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        boolean z = this.v;
        switch (i) {
            case 0:
                g5b g5bVar = new g5b((LeagueWorker) obj2, this.t, z, rq3Var);
                g5bVar.u = obj;
                return g5bVar;
            default:
                g5b g5bVar2 = new g5b((XmlPullParser) this.w, rq3Var, z, (ArrayList) obj2);
                g5bVar2.u = obj;
                return g5bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((g5b) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0134, code lost:
    
        if (r5 == r12) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0112, code lost:
    
        if (r5 == r12) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01dd, code lost:
    
        if (r3.f(r4, r14) == r12) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cf, code lost:
    
        if (r9.p(r0, r14) == r12) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bb, code lost:
    
        if (r0 == r12) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0154, code lost:
    
        if (r0 == r12) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005c -> B:10:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0065 -> B:10:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0071 -> B:10:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007b -> B:7:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0090 -> B:10:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a6 -> B:10:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b9 -> B:10:0x00be). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object B;
        Object P;
        List<Integer> eventIds;
        Object d;
        Object u;
        int depth;
        String text;
        int i = this.r;
        Object obj2 = this.x;
        boolean z = this.v;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                int i2 = this.t;
                LeagueWorker leagueWorker = (LeagueWorker) obj2;
                qa6 qa6Var = leagueWorker.c;
                w3b w3bVar = leagueWorker.b;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var = lu3.a;
                switch (this.s) {
                    case 0:
                        y6a.M(obj);
                        this.u = ku3Var;
                        this.s = 1;
                        B = w3bVar.B(i2, this);
                        break;
                    case 1:
                        y6a.M(obj);
                        B = obj;
                        if (!((Boolean) B).booleanValue()) {
                            return Unit.a;
                        }
                        this.u = ku3Var;
                        this.s = 2;
                        w3bVar.getClass();
                        P = yaa.P(new d0b(i2, 11, rq3Var, w3bVar), this);
                        break;
                    case 2:
                        y6a.M(obj);
                        P = obj;
                        EventIdsResponse eventIdsResponse = (EventIdsResponse) yaa.x((x2g) P);
                        if (eventIdsResponse != null && (eventIds = eventIdsResponse.getEventIds()) != null) {
                            this.u = ku3Var;
                            this.w = eventIds;
                            this.s = 3;
                            d = qa6Var.d(i2, this);
                            break;
                        } else {
                            return Unit.a;
                        }
                        break;
                    case 3:
                        List<Integer> list = (List) this.w;
                        y6a.M(obj);
                        eventIds = list;
                        d = obj;
                        HashSet hashSet = (HashSet) d;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : eventIds) {
                            if (!hashSet.contains(new Integer(((Number) obj3).intValue()))) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(xw3.t(ku3Var, null, new qu1(leagueWorker, ((Number) it.next()).intValue(), rq3Var, 16), 3));
                        }
                        this.u = null;
                        this.w = null;
                        this.s = 4;
                        u = m6k.u(arrayList2, this);
                        break;
                    case 4:
                        y6a.M(obj);
                        u = obj;
                        ArrayList W = CollectionsKt.W((Iterable) u);
                        this.u = null;
                        this.w = null;
                        this.s = 5;
                        break;
                    case 5:
                        y6a.M(obj);
                        this.u = null;
                        this.w = null;
                        this.s = 6;
                        break;
                    case 6:
                        y6a.M(obj);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            default:
                XmlPullParser xmlPullParser = (XmlPullParser) this.w;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
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
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    depth = this.s;
                    y6a.M(obj);
                    Object v = obj;
                    j jVar = (j) v;
                    if (jVar != null) {
                        ((ArrayList) obj2).add(jVar);
                    }
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth) {
                        return Unit.a;
                    }
                    int depth2 = xmlPullParser.getDepth() - depth;
                    if (depth2 == 0) {
                        mqi mqiVar = d1.a;
                        if (xmlPullParser.getEventType() != 2) {
                            if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                                String text2 = xmlPullParser.getText();
                                text2.getClass();
                                StringsKt.l0(text2).toString();
                            } else if (xmlPullParser.getEventType() == 3) {
                                return Unit.a;
                            }
                        }
                    } else if (depth2 == 1) {
                        mqi mqiVar2 = d1.a;
                        if (xmlPullParser.getEventType() == 2 && Intrinsics.c(xmlPullParser.getName(), "Creative")) {
                            this.s = depth;
                            this.t = 1;
                            v = d1.v(xmlPullParser, z, this);
                            if (v == lu3Var2) {
                                return lu3Var2;
                            }
                            j jVar2 = (j) v;
                            if (jVar2 != null) {
                            }
                        }
                    }
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth) {
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5b(XmlPullParser xmlPullParser, rq3 rq3Var, boolean z, ArrayList arrayList) {
        super(2, rq3Var);
        this.w = xmlPullParser;
        this.v = z;
        this.x = arrayList;
    }
}
