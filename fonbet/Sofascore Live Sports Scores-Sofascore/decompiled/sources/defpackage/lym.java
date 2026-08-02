package defpackage;

import android.content.Context;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.e;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
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
public final class lym extends hoi implements Function1 {
    public Object r;
    public int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ BlazeVideosPlayerStyle x;
    public final /* synthetic */ B y;
    public final /* synthetic */ i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lym(String str, String str2, Function1 function1, boolean z, BlazeVideosPlayerStyle blazeVideosPlayerStyle, B b, i iVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = str;
        this.u = str2;
        this.v = function1;
        this.w = z;
        this.x = blazeVideosPlayerStyle;
        this.y = b;
        this.z = iVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new lym(this.t, this.u, this.v, this.w, this.x, this.y, this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((lym) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x01c6, code lost:
    
        if (defpackage.evl.d(r13, r2, r34) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01c8, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        if (defpackage.evl.d(r13, r0, r34) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (defpackage.evl.d(r13, (com.blaze.blazesdk.shared.results.g0) r3, r34) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0162, code lost:
    
        if (defpackage.evl.d(r13, r1, r34) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0188, code lost:
    
        if (defpackage.evl.d(r13, r3, r34) != r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007a, code lost:
    
        if (r0 == r12) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x019d  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BlazeDataSourceType.Ids ids;
        String str;
        Object videos$default;
        a9m a9mVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Function1 function1 = this.v;
        String str2 = this.t;
        switch (i) {
            case 0:
                y6a.M(obj);
                BlazeDataSourceType.Ids ids2 = new BlazeDataSourceType.Ids(a.c(str2), null, null, 6, null);
                n0n n0nVar = n0n.a;
                qom qomVar = qom.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = linkedHashMap.isEmpty() ? null : linkedHashMap;
                this.r = ids2;
                this.s = 1;
                ids = ids2;
                str = str2;
                videos$default = fsl.getVideos$default(qomVar, ids, this.t, "entry_points_broadcast_id", true, true, this.u, null, linkedHashMap2, this, 64, null);
                break;
            case 1:
                BlazeDataSourceType.Ids ids3 = (BlazeDataSourceType.Ids) this.r;
                y6a.M(obj);
                str = str2;
                ids = ids3;
                videos$default = obj;
                a9m a9mVar2 = (a9m) videos$default;
                if (a9mVar2 instanceof qbm) {
                    List list = (List) ((qbm) a9mVar2).a;
                    if (list.isEmpty()) {
                        y0 y0Var = new y0();
                        y0Var.g = i9a.p("videoId", str);
                        this.r = a9mVar2;
                        this.s = 2;
                        break;
                    } else {
                        if (this.w) {
                            VideoModel videoModel = (VideoModel) CollectionsKt.firstOrNull(list);
                            gfm l = wba.l(videoModel != null ? videoModel.o : null);
                            if (l instanceof g0) {
                                this.r = a9mVar2;
                                this.s = 3;
                                break;
                            }
                        }
                        yda ydaVar = bmm.a;
                        String stringRepresentation$blazesdk_release = ids.getStringRepresentation$blazesdk_release();
                        BlazePlayerType blazePlayerType = BlazePlayerType.VIDEOS;
                        ArrayList arrayList = new ArrayList(k13.r(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((VideoModel) it.next()).id);
                        }
                        String str3 = this.u;
                        bmm.c(str, str3, stringRepresentation$blazesdk_release, blazePlayerType, arrayList);
                        com.blaze.blazesdk.features.videos.models.args.a aVar = new com.blaze.blazesdk.features.videos.models.args.a(new a.e(this.x, new a.d.C0014a(e.a)), str, "entry_points_broadcast_id", null, null, this.y, BlazeVideosAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG, str, true, null, false, false, false, str3, this.z, 7680, null);
                        ihm ihmVar = new ihm(Unit.a);
                        try {
                            try {
                                Context currActivityOrApplicationContext$blazesdk_release = BlazeSDK.INSTANCE.getCurrActivityOrApplicationContext$blazesdk_release();
                                if (currActivityOrApplicationContext$blazesdk_release != null) {
                                    VideosPlayerActivity.u.getClass();
                                    VideosPlayerActivity.a.b(currActivityOrApplicationContext$blazesdk_release, aVar);
                                }
                                this.r = a9mVar2;
                                this.s = 4;
                                break;
                            } catch (Exception e) {
                                j1m j1mVar = j1m.a;
                                y0 y0Var2 = new y0();
                                y0Var2.f = e;
                                Map d = sub.d(new Pair("videoId", str));
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
                    a6m a6mVar = (a6m) a9mVar;
                    j1m j1mVar2 = j1m.a;
                    y0 y0Var3 = new y0();
                    y0Var3.f = a6mVar.a();
                    y0Var3.g = i9a.p("videoId", str);
                    y0Var3.b(a6mVar.b());
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
