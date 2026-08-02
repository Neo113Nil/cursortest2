package defpackage;

import android.content.Context;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.moments.players.ui.MomentsPlayerActivity;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.vungle.ads.internal.protos.Sdk;
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
public final class epm extends hoi implements Function1 {
    public final /* synthetic */ String A;
    public Object r;
    public int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ BlazeMomentsPlayerStyle x;
    public final /* synthetic */ B y;
    public final /* synthetic */ BlazeMomentsPlaybackConfiguration z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(String str, String str2, Function1 function1, boolean z, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, B b, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, String str3, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = str;
        this.u = str2;
        this.v = function1;
        this.w = z;
        this.x = blazeMomentsPlayerStyle;
        this.y = b;
        this.z = blazeMomentsPlaybackConfiguration;
        this.A = str3;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new epm(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((epm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x01de, code lost:
    
        if (defpackage.evl.d(r3, r2, r36) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01e0, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        if (defpackage.evl.d(r3, r0, r36) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        if (defpackage.evl.d(r3, (com.blaze.blazesdk.shared.results.g0) r4, r36) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0175, code lost:
    
        if (defpackage.evl.d(r3, r1, r36) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a0, code lost:
    
        if (defpackage.evl.d(r3, r4, r36) != r13) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0094, code lost:
    
        if (r0 == r13) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b9  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BlazeDataSourceType.Ids ids;
        String str;
        Function1 function1;
        String str2;
        String str3;
        Object momentsAndSaveToCache$default;
        String str4;
        Function1 function12;
        a9m a9mVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        String str5 = this.A;
        Function1 function13 = this.v;
        String str6 = this.t;
        switch (i) {
            case 0:
                y6a.M(obj);
                BlazeDataSourceType.Ids ids2 = new BlazeDataSourceType.Ids(a.c(str6), null, null, 6, null);
                rsm rsmVar = rsm.a;
                gum gumVar = gum.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = linkedHashMap.isEmpty() ? null : linkedHashMap;
                this.r = ids2;
                this.s = 1;
                ids = ids2;
                str = str5;
                function1 = function13;
                str2 = "momentId";
                str3 = str6;
                momentsAndSaveToCache$default = jrl.getMomentsAndSaveToCache$default(gumVar, ids, this.t, "entry_points_broadcast_id", true, true, this.u, null, linkedHashMap2, false, this, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, null);
                break;
            case 1:
                BlazeDataSourceType.Ids ids3 = (BlazeDataSourceType.Ids) this.r;
                y6a.M(obj);
                str = str5;
                function1 = function13;
                str2 = "momentId";
                str3 = str6;
                ids = ids3;
                momentsAndSaveToCache$default = obj;
                a9m a9mVar2 = (a9m) momentsAndSaveToCache$default;
                if (a9mVar2 instanceof qbm) {
                    List list = (List) ((qbm) a9mVar2).a;
                    if (list.isEmpty()) {
                        y0 y0Var = new y0();
                        y0Var.g = i9a.p(str2, str3);
                        this.r = a9mVar2;
                        this.s = 2;
                        function12 = function1;
                        break;
                    } else {
                        function12 = function1;
                        if (this.w) {
                            MomentModel momentModel = (MomentModel) CollectionsKt.firstOrNull(list);
                            gfm l = wba.l(momentModel != null ? momentModel.o : null);
                            if (l instanceof g0) {
                                this.r = a9mVar2;
                                this.s = 3;
                                break;
                            }
                        }
                        yda ydaVar = bmm.a;
                        String stringRepresentation$blazesdk_release = ids.getStringRepresentation$blazesdk_release();
                        BlazePlayerType blazePlayerType = BlazePlayerType.MOMENTS;
                        ArrayList arrayList = new ArrayList(k13.r(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MomentModel) it.next()).id);
                        }
                        String str7 = this.u;
                        bmm.c(str3, str7, stringRepresentation$blazesdk_release, blazePlayerType, arrayList);
                        String str8 = str3;
                        com.blaze.blazesdk.features.moments.models.args.a aVar = new com.blaze.blazesdk.features.moments.models.args.a(this.x, str8, "entry_points_broadcast_id", null, null, this.y, BlazeMomentsAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG, str3, true, null, false, false, str7, i2a.p(this.z), 3584, null);
                        ihm ihmVar = new ihm(Unit.a);
                        try {
                            try {
                                Context currActivityOrApplicationContext$blazesdk_release = BlazeSDK.INSTANCE.getCurrActivityOrApplicationContext$blazesdk_release();
                                if (currActivityOrApplicationContext$blazesdk_release != null) {
                                    MomentsPlayerActivity.n.getClass();
                                    MomentsPlayerActivity.a.a(currActivityOrApplicationContext$blazesdk_release, aVar);
                                }
                                this.r = a9mVar2;
                                this.s = 4;
                                break;
                            } catch (Exception e) {
                                j1m j1mVar = j1m.a;
                                y0 y0Var2 = new y0();
                                y0Var2.f = e;
                                Map d = sub.d(new Pair(str2, str3));
                                d.getClass();
                                y0Var2.g = d;
                                str4 = str;
                                y0Var2.b(str4);
                                j1m.a(y0Var2);
                                this.r = a9mVar2;
                                this.s = 5;
                                break;
                            }
                        } catch (Throwable th) {
                            this.r = th;
                            this.s = 6;
                            if (evl.d(function12, ihmVar, this) != lu3Var) {
                                throw th;
                            }
                        }
                    }
                    str4 = str;
                } else {
                    str4 = str;
                    function12 = function1;
                }
                a9mVar = a9mVar2;
                if (a9mVar instanceof a6m) {
                    j1m j1mVar2 = j1m.a;
                    y0 y0Var3 = new y0();
                    y0Var3.f = ((a6m) a9mVar).a();
                    y0Var3.g = i9a.p(str2, str3);
                    y0Var3.b(str4);
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
                str4 = str5;
                function12 = function13;
                str2 = "momentId";
                str3 = str6;
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
