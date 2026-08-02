package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.RecentStageIdsResponse;
import com.sofascore.results.service.SyncWorker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rpi extends hoi implements Function2 {
    public final /* synthetic */ SyncWorker A;
    public final /* synthetic */ List B;
    public Set r;
    public SyncWorker s;
    public Collection t;
    public Iterator u;
    public int v;
    public int w;
    public int x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpi(SyncWorker syncWorker, List list, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = syncWorker;
        this.B = list;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        rpi rpiVar = new rpi(this.A, this.B, rq3Var);
        rpiVar.z = obj;
        return rpiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rpi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0183, code lost:
    
        if (r3.q(r1, r16) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0164, code lost:
    
        if (r1 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        if (r4 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0129, code lost:
    
        if (r3 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (r8.b(r11, r16) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
    
        if (r3 == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d3 -> B:21:0x00d7). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object n;
        Set set;
        Iterator it;
        Collection collection;
        SyncWorker syncWorker;
        int i;
        int i2;
        int i3;
        Object u;
        Object O;
        Object u2;
        ku3 ku3Var = (ku3) this.z;
        lu3 lu3Var = lu3.a;
        int i4 = this.y;
        SyncWorker syncWorker2 = this.A;
        rq3 rq3Var = null;
        switch (i4) {
            case 0:
                y6a.M(obj);
                this.z = ku3Var;
                this.y = 1;
                n = syncWorker2.n(this.B, this);
                break;
            case 1:
                y6a.M(obj);
                n = obj;
                set = (Set) n;
                tak takVar = syncWorker2.j;
                List S0 = CollectionsKt.S0(set);
                this.z = ku3Var;
                this.r = set;
                this.y = 2;
                break;
            case 2:
                set = this.r;
                y6a.M(obj);
                ArrayList arrayList = new ArrayList();
                it = set.iterator();
                collection = arrayList;
                syncWorker = syncWorker2;
                i = 0;
                i2 = 0;
                i3 = 0;
                if (!it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    s96 s96Var = syncWorker.f;
                    this.z = ku3Var;
                    this.r = null;
                    this.s = syncWorker;
                    this.t = collection;
                    this.u = it;
                    this.v = i3;
                    this.w = i2;
                    this.x = i;
                    this.y = 3;
                    O = s96Var.O(intValue, this);
                    break;
                } else {
                    ArrayList s = k13.s((List) collection);
                    ArrayList arrayList2 = new ArrayList(k13.r(s, 10));
                    Iterator it2 = s.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(xw3.t(ku3Var, null, new npi(syncWorker2, ((Number) it2.next()).intValue(), rq3Var, 6), 3));
                    }
                    this.z = ku3Var;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                    this.y = 4;
                    u = m6k.u(arrayList2, this);
                    break;
                }
                return lu3Var;
            case 3:
                i = this.x;
                i2 = this.w;
                i3 = this.v;
                it = this.u;
                collection = this.t;
                syncWorker = this.s;
                Set set2 = this.r;
                y6a.M(obj);
                O = obj;
                RecentStageIdsResponse recentStageIdsResponse = (RecentStageIdsResponse) O;
                List<Integer> stageIds = recentStageIdsResponse != null ? recentStageIdsResponse.getStageIds() : null;
                if (stageIds != null) {
                    collection.add(stageIds);
                }
                if (!it.hasNext()) {
                }
                return lu3Var;
            case 4:
                Set set3 = this.r;
                y6a.M(obj);
                u = obj;
                ArrayList W = CollectionsKt.W((Iterable) u);
                ArrayList arrayList3 = new ArrayList(k13.r(W, 10));
                Iterator it3 = W.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(xw3.t(ku3Var, null, new vki(syncWorker2, (Stage) it3.next(), rq3Var, 4), 3));
                }
                this.z = null;
                this.r = null;
                this.y = 5;
                u2 = m6k.u(arrayList3, this);
                break;
            case 5:
                Set set4 = this.r;
                y6a.M(obj);
                u2 = obj;
                ArrayList s2 = k13.s(CollectionsKt.W((Iterable) u2));
                qa6 qa6Var = syncWorker2.e;
                this.z = null;
                this.r = null;
                this.s = null;
                this.v = 0;
                this.y = 6;
                break;
            case 6:
                Set set5 = this.r;
                y6a.M(obj);
                ugj.a.getClass();
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
