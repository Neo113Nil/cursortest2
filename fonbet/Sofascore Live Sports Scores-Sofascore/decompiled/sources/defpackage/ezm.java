package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.a;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.t0;
import com.blaze.blazesdk.shared.results.x0;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ezm extends hoi implements Function1 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ B D;
    public Object r;
    public BlazeVideosPlayerStyle s;
    public i t;
    public int u;
    public final /* synthetic */ BlazeDataSourceType v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ BlazeVideosPlayerStyle y;
    public final /* synthetic */ BlazeVideosPlaybackConfiguration z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezm(BlazeDataSourceType blazeDataSourceType, Function1 function1, String str, BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, boolean z, String str2, String str3, B b, rq3 rq3Var) {
        super(1, rq3Var);
        this.v = blazeDataSourceType;
        this.w = function1;
        this.x = str;
        this.y = blazeVideosPlayerStyle;
        this.z = blazeVideosPlaybackConfiguration;
        this.A = z;
        this.B = str2;
        this.C = str3;
        this.D = b;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new ezm(this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ezm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01bd, code lost:
    
        if (defpackage.evl.b(r4, r1, r35) == r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023b, code lost:
    
        if (defpackage.evl.b(r3, r0, r35) != r12) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.blaze.blazesdk.features.videos.models.ui.i, com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle] */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.blaze.blazesdk.features.videos.models.ui.i, com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String sb;
        String sb2;
        qom qomVar;
        List l;
        BlazeVideosPlayerStyle blazeVideosPlayerStyle;
        i iVar;
        List list;
        String str;
        Function1 function1;
        ?? r14;
        BlazeDataSourceType blazeDataSourceType;
        Object videos$default;
        i iVar2;
        BlazeVideosPlayerStyle blazeVideosPlayerStyle2;
        a9m a9mVar;
        BlazeDataSourceType blazeDataSourceType2;
        Function1 function12;
        ?? r142;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        Function1 function13 = this.w;
        BlazeDataSourceType blazeDataSourceType3 = this.v;
        if (i == 0) {
            y6a.M(obj);
            try {
                a.validate$default(blazeDataSourceType3, ogm.ENTRYPOINT, false, 2, null);
                String str2 = this.x;
                if (str2 == null || StringsKt.R(str2)) {
                    str2 = null;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(blazeDataSourceType3.getStringRepresentation$blazesdk_release());
                if (str2 != null) {
                    sb3.append(str2);
                }
                sb3.append("prepare");
                sb = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(blazeDataSourceType3.getStringRepresentation$blazesdk_release());
                if (str2 != null) {
                    sb4.append(str2);
                }
                sb2 = sb4.toString();
                n0n n0nVar = n0n.a;
                qomVar = qom.b;
                qomVar.getClass();
                l = qom.l(sb);
                bmm.e(sb);
                blazeVideosPlayerStyle = (BlazeVideosPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(this.y);
                BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration = this.z;
                blazeVideosPlaybackConfiguration.getClass();
                iVar = new i(blazeVideosPlaybackConfiguration.getMultiAspectRatio(), blazeVideosPlaybackConfiguration.getShouldOpenOnLandscape(), blazeVideosPlaybackConfiguration.getPip());
            } catch (Exception e) {
                j1m j1mVar = j1m.a;
                x0 x0Var = new x0();
                x0Var.f = e;
                x0Var.g = fn0.p("dataSource", blazeDataSourceType3.getStringRepresentation$blazesdk_release());
                j1m.a(x0Var);
                BlazeResult.Error d = x0Var.d();
                this.u = 1;
            }
            if (!l.isEmpty()) {
                if (this.A && (list = (List) qom.c.get(sb)) != null) {
                    n13.u(o93.a(new w5m(9), new w5m(12)), list);
                }
                n0n.d(sb, blazeDataSourceType3.getStringRepresentation$blazesdk_release(), blazeDataSourceType3.getAnalyticsLabelExpressionRepresentation$blazesdk_release(), blazeVideosPlayerStyle, this.D, this.B, this.x, iVar, new tpm(blazeDataSourceType3, function13, 5));
                return Unit.a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str3 = this.C;
            if (str3 != null) {
                linkedHashMap.put("eventId", str3);
            }
            String str4 = this.x;
            if (str4 != null) {
                linkedHashMap.put("forcedFirstContentId", str4);
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            this.r = sb2;
            this.s = blazeVideosPlayerStyle;
            this.t = iVar;
            this.u = 2;
            str = sb2;
            function1 = function13;
            r14 = 0;
            blazeDataSourceType = blazeDataSourceType3;
            videos$default = fsl.getVideos$default(qomVar, this.v, str, "entry_points_broadcast_id", false, this.A, this.B, str4, linkedHashMap, this, 8, null);
            if (videos$default != lu3Var) {
                iVar2 = iVar;
                blazeVideosPlayerStyle2 = blazeVideosPlayerStyle;
                String str5 = str;
                a9mVar = (a9m) videos$default;
                if (a9mVar instanceof qbm) {
                }
            }
            return lu3Var;
        }
        if (i == 1) {
            y6a.M(obj);
            return Unit.a;
        }
        if (i == 2) {
            i iVar3 = this.t;
            BlazeVideosPlayerStyle blazeVideosPlayerStyle3 = this.s;
            str = (String) this.r;
            y6a.M(obj);
            iVar2 = iVar3;
            blazeVideosPlayerStyle2 = blazeVideosPlayerStyle3;
            function1 = function13;
            r14 = 0;
            blazeDataSourceType = blazeDataSourceType3;
            videos$default = obj;
            String str52 = str;
            a9mVar = (a9m) videos$default;
            if (a9mVar instanceof qbm) {
                blazeDataSourceType2 = blazeDataSourceType;
                function12 = function1;
                r142 = r14;
            } else {
                if (((List) ((qbm) a9mVar).a).isEmpty()) {
                    y0 y0Var = new y0();
                    y0Var.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                    BlazeResult.Error d2 = y0Var.d();
                    this.r = a9mVar;
                    this.s = r14;
                    this.t = r14;
                    this.u = 3;
                    function12 = function1;
                    if (evl.b(function12, d2, this) != lu3Var) {
                        blazeDataSourceType2 = blazeDataSourceType;
                        r142 = r14;
                    }
                    return lu3Var;
                }
                function12 = function1;
                n0n n0nVar2 = n0n.a;
                blazeDataSourceType2 = blazeDataSourceType;
                n0n.d(str52, blazeDataSourceType.getStringRepresentation$blazesdk_release(), blazeDataSourceType.getAnalyticsLabelExpressionRepresentation$blazesdk_release(), blazeVideosPlayerStyle2, this.D, this.B, this.x, iVar2, new tpm(blazeDataSourceType2, function12, 4));
                r142 = r14;
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                return Unit.a;
            }
            a9mVar = (a9m) this.r;
            y6a.M(obj);
            r142 = 0;
            function12 = function13;
            blazeDataSourceType2 = blazeDataSourceType3;
        }
        if (a9mVar instanceof a6m) {
            a6m a6mVar = (a6m) a9mVar;
            j1m j1mVar2 = j1m.a;
            t0 t0Var = new t0();
            t0Var.f = a6mVar.a();
            t0Var.g = fn0.p("dataSource", blazeDataSourceType2.getStringRepresentation$blazesdk_release());
            t0Var.b(a6mVar.b());
            j1m.a(t0Var);
            BlazeResult.Error d3 = t0Var.d();
            this.r = a9mVar;
            this.s = r142;
            this.t = r142;
            this.u = 4;
        }
        return Unit.a;
    }
}
