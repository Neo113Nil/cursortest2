package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.shared.results.BlazeResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q9m extends hoi implements Function1 {
    public a9m r;
    public int s;
    public final /* synthetic */ BlazeDataSourceType t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Function1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9m(BlazeDataSourceType blazeDataSourceType, String str, String str2, String str3, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = blazeDataSourceType;
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new q9m(this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q9m) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bb, code lost:
    
        if (defpackage.evl.b(r13, r15, r24) == r12) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bd, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (defpackage.evl.c(r13, r2, r24) == r12) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r0 == r12) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object fetchStories$default;
        a9m a9mVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Function1 function1 = this.x;
        if (i == 0) {
            y6a.M(obj);
            StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
            this.s = 1;
            fetchStories$default = yrl.fetchStories$default(storiesRepositoryImpl, this.t, this.u, null, "entry_points_broadcast_id", false, false, this.v, this.w, this, 36, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a9mVar = this.r;
                y6a.M(obj);
                if (a9mVar instanceof a6m) {
                    BlazeResult.Error error = new BlazeResult.Error(null, null, null, "Failed To prepare stories", null, null, 55, null);
                    this.r = a9mVar;
                    this.s = 3;
                }
                return Unit.a;
            }
            y6a.M(obj);
            fetchStories$default = obj;
        }
        a9mVar = (a9m) fetchStories$default;
        if (a9mVar instanceof qbm) {
            List list = (List) ((qbm) a9mVar).a;
            irm irmVar = new irm();
            list.getClass();
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(v7a.g((StoryModel) it.next()));
            }
            irm.prefetchPlaylists$default(irmVar, arrayList, null, tum.a, 2, null);
            BlazeResult.Success success = new BlazeResult.Success(list);
            this.r = a9mVar;
            this.s = 2;
        }
        if (a9mVar instanceof a6m) {
        }
        return Unit.a;
    }
}
