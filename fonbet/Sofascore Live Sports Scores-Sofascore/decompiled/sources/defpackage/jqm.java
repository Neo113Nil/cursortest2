package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.a;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.t0;
import com.blaze.blazesdk.shared.results.x0;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jqm extends hoi implements Function1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ BlazeMomentsPlaybackConfiguration B;
    public final /* synthetic */ B C;
    public Object r;
    public BlazeMomentsPlayerStyle s;
    public int t;
    public final /* synthetic */ BlazeDataSourceType u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ BlazeMomentsPlayerStyle x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqm(BlazeDataSourceType blazeDataSourceType, Function1 function1, String str, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, boolean z, String str2, String str3, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, B b, rq3 rq3Var) {
        super(1, rq3Var);
        this.u = blazeDataSourceType;
        this.v = function1;
        this.w = str;
        this.x = blazeMomentsPlayerStyle;
        this.y = z;
        this.z = str2;
        this.A = str3;
        this.B = blazeMomentsPlaybackConfiguration;
        this.C = b;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new jqm(this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((jqm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0180, code lost:
    
        if (defpackage.evl.b(r14, r1, r25) == r13) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0123, code lost:
    
        if (defpackage.evl.b(r14, r1, r25) == r13) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ed, code lost:
    
        if (defpackage.evl.b(r4, r0, r25) != r13) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0102  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String sb;
        String sb2;
        gum gumVar;
        List q;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle;
        List list;
        BlazeDataSourceType blazeDataSourceType;
        String str;
        Function1 function1;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2;
        Object momentsAndSaveToCache$default;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle3;
        a9m a9mVar;
        BlazeDataSourceType blazeDataSourceType2;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        int i2 = 1;
        int i3 = 2;
        Function1 function12 = this.v;
        BlazeDataSourceType blazeDataSourceType3 = this.u;
        if (i == 0) {
            y6a.M(obj);
            try {
                a.validate$default(blazeDataSourceType3, ogm.ENTRYPOINT, false, 2, null);
                String str2 = this.w;
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
                rsm rsmVar = rsm.a;
                gumVar = gum.b;
                gumVar.getClass();
                q = gum.q(sb);
                bmm.e(sb);
                blazeMomentsPlayerStyle = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(this.x);
            } catch (Exception e) {
                j1m j1mVar = j1m.a;
                x0 x0Var = new x0();
                x0Var.f = e;
                j1m.a(x0Var);
                BlazeResult.Error d = x0Var.d();
                this.t = 1;
            }
            if (!q.isEmpty()) {
                if (this.y && (list = (List) gum.c.get(sb)) != null) {
                    n13.u(o93.a(new fsm(i2), new fsm(i3)), list);
                }
                rsm.d(sb, blazeDataSourceType3.getStringRepresentation$blazesdk_release(), blazeDataSourceType3.getAnalyticsLabelExpressionRepresentation$blazesdk_release(), blazeMomentsPlayerStyle, this.B, this.C, this.z, this.w, new tpm(blazeDataSourceType3, function12, 1));
                return Unit.a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str3 = this.A;
            if (str3 != null) {
                linkedHashMap.put("eventId", str3);
            }
            String str4 = this.w;
            if (str4 != null) {
                linkedHashMap.put("forcedFirstContentId", str4);
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            this.r = sb2;
            this.s = blazeMomentsPlayerStyle;
            this.t = 2;
            blazeDataSourceType = blazeDataSourceType3;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            str = sb2;
            function1 = function12;
            blazeMomentsPlayerStyle2 = null;
            momentsAndSaveToCache$default = jrl.getMomentsAndSaveToCache$default(gumVar, this.u, str, "entry_points_broadcast_id", false, this.y, this.z, str4, linkedHashMap2, false, this, 264, null);
            if (momentsAndSaveToCache$default != lu3Var) {
                blazeMomentsPlayerStyle3 = blazeMomentsPlayerStyle;
                String str5 = str;
                a9mVar = (a9m) momentsAndSaveToCache$default;
                if (a9mVar instanceof qbm) {
                }
                blazeDataSourceType2 = blazeDataSourceType;
            }
            return lu3Var;
        }
        if (i == 1) {
            y6a.M(obj);
            return Unit.a;
        }
        if (i == 2) {
            BlazeMomentsPlayerStyle blazeMomentsPlayerStyle4 = this.s;
            str = (String) this.r;
            y6a.M(obj);
            function1 = function12;
            blazeMomentsPlayerStyle2 = null;
            blazeDataSourceType = blazeDataSourceType3;
            blazeMomentsPlayerStyle3 = blazeMomentsPlayerStyle4;
            momentsAndSaveToCache$default = obj;
            String str52 = str;
            a9mVar = (a9m) momentsAndSaveToCache$default;
            if (a9mVar instanceof qbm) {
                if (((List) ((qbm) a9mVar).a).isEmpty()) {
                    BlazeResult.Error d2 = new y0().d();
                    this.r = a9mVar;
                    this.s = blazeMomentsPlayerStyle2;
                    this.t = 3;
                } else {
                    rsm rsmVar2 = rsm.a;
                    blazeDataSourceType2 = blazeDataSourceType;
                    rsm.d(str52, blazeDataSourceType.getStringRepresentation$blazesdk_release(), blazeDataSourceType.getAnalyticsLabelExpressionRepresentation$blazesdk_release(), blazeMomentsPlayerStyle3, this.B, this.C, this.z, this.w, new tpm(blazeDataSourceType2, function1, 0));
                }
            }
            blazeDataSourceType2 = blazeDataSourceType;
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
            function1 = function12;
            blazeMomentsPlayerStyle2 = null;
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
            this.s = blazeMomentsPlayerStyle2;
            this.t = 4;
        }
        return Unit.a;
    }
}
