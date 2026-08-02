package defpackage;

import android.content.Context;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.players.ui.StoriesPlayerActivity;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uum extends hoi implements Function1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public Object r;
    public int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ BlazeStoryPlayerStyle y;
    public final /* synthetic */ B z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uum(String str, String str2, String str3, Function1 function1, boolean z, BlazeStoryPlayerStyle blazeStoryPlayerStyle, B b, String str4, String str5, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.w = function1;
        this.x = z;
        this.y = blazeStoryPlayerStyle;
        this.z = b;
        this.A = str4;
        this.B = str5;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new uum(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((uum) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x01bb, code lost:
    
        if (defpackage.evl.d(r13, r2, r32) == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01bd, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (defpackage.evl.d(r13, r0, r32) == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (defpackage.evl.d(r13, (com.blaze.blazesdk.shared.results.g0) r3, r32) == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0159, code lost:
    
        if (defpackage.evl.d(r13, r1, r32) == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017f, code lost:
    
        if (defpackage.evl.d(r13, r3, r32) != r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0081, code lost:
    
        if (r0 == r12) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0194  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BlazeDataSourceType.Ids ids;
        String str;
        Object fetchStories$default;
        a9m a9mVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Function1 function1 = this.w;
        String str2 = this.t;
        switch (i) {
            case 0:
                y6a.M(obj);
                BlazeDataSourceType.Ids ids2 = new BlazeDataSourceType.Ids(a.c(str2), null, null, 6, null);
                bxm bxmVar = bxm.a;
                StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str3 = this.u;
                if (str3 != null) {
                    linkedHashMap.put("eventId", str3);
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                this.r = ids2;
                this.s = 1;
                ids = ids2;
                str = str2;
                fetchStories$default = yrl.fetchStories$default(storiesRepositoryImpl, ids, this.t, linkedHashMap, "entry_points_broadcast_id", true, true, this.v, null, this, 128, null);
                break;
            case 1:
                BlazeDataSourceType.Ids ids3 = (BlazeDataSourceType.Ids) this.r;
                y6a.M(obj);
                str = str2;
                ids = ids3;
                fetchStories$default = obj;
                a9m a9mVar2 = (a9m) fetchStories$default;
                if (a9mVar2 instanceof qbm) {
                    List list = (List) ((qbm) a9mVar2).a;
                    if (list.isEmpty()) {
                        y0 y0Var = new y0();
                        y0Var.g = i9a.p("storyId", str);
                        this.r = a9mVar2;
                        this.s = 2;
                        break;
                    } else {
                        if (this.x) {
                            StoryModel storyModel = (StoryModel) CollectionsKt.firstOrNull(list);
                            gfm l = wba.l(storyModel != null ? storyModel.k : null);
                            if (l instanceof g0) {
                                this.r = a9mVar2;
                                this.s = 3;
                                break;
                            }
                        }
                        yda ydaVar = bmm.a;
                        String stringRepresentation$blazesdk_release = ids.getStringRepresentation$blazesdk_release();
                        BlazePlayerType blazePlayerType = BlazePlayerType.STORIES;
                        ArrayList arrayList = new ArrayList(k13.r(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((StoryModel) it.next()).id);
                        }
                        String str4 = this.v;
                        bmm.c(str, str4, stringRepresentation$blazesdk_release, blazePlayerType, arrayList);
                        com.blaze.blazesdk.features.stories.models.args.a aVar = new com.blaze.blazesdk.features.stories.models.args.a(this.y, str, "entry_points_broadcast_id", null, null, this.z, BlazeStoriesAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG, str, this.A, true, null, false, str4, 3072, null);
                        ihm ihmVar = new ihm(Unit.a);
                        try {
                            try {
                                Context currActivityOrApplicationContext$blazesdk_release = BlazeSDK.INSTANCE.getCurrActivityOrApplicationContext$blazesdk_release();
                                if (currActivityOrApplicationContext$blazesdk_release != null) {
                                    StoriesPlayerActivity.n.getClass();
                                    StoriesPlayerActivity.a.a(currActivityOrApplicationContext$blazesdk_release, aVar);
                                }
                                this.r = a9mVar2;
                                this.s = 4;
                                break;
                            } catch (Exception e) {
                                j1m j1mVar = j1m.a;
                                y0 y0Var2 = new y0();
                                y0Var2.f = e;
                                Map d = sub.d(new Pair("storyId", str));
                                d.getClass();
                                y0Var2.g = d;
                                j1m.a(y0Var2);
                                this.r = a9mVar2;
                                this.s = 5;
                                break;
                            }
                        } catch (Throwable th) {
                            this.r = th;
                            this.s = 6;
                            if (evl.d(function1, ihmVar, this) != lu3Var) {
                                throw th;
                            }
                        }
                    }
                }
                a9mVar = a9mVar2;
                if (a9mVar instanceof a6m) {
                    j1m j1mVar2 = j1m.a;
                    y0 y0Var3 = new y0();
                    y0Var3.f = ((a6m) a9mVar).a();
                    y0Var3.g = i9a.p("storyId", str);
                    y0Var3.b(this.B);
                    j1m.a(y0Var3);
                    this.r = a9mVar;
                    this.s = 7;
                    break;
                }
                return Unit.a;
            case 2:
            case 3:
            case 4:
            case 5:
                a9mVar = (a9m) this.r;
                y6a.M(obj);
                str = str2;
                if (a9mVar instanceof a6m) {
                }
                return Unit.a;
            case 6:
                Throwable th2 = (Throwable) this.r;
                y6a.M(obj);
                throw th2;
            case 7:
                y6a.M(obj);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
