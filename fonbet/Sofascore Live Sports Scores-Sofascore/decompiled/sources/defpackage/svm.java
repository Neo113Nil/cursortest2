package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.a;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.t0;
import com.blaze.blazesdk.shared.results.x0;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class svm extends hoi implements Function1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ B B;
    public final /* synthetic */ String C;
    public Object r;
    public BlazeStoryPlayerStyle s;
    public int t;
    public final /* synthetic */ BlazeDataSourceType u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ BlazeStoryPlayerStyle x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svm(BlazeDataSourceType blazeDataSourceType, Function1 function1, String str, BlazeStoryPlayerStyle blazeStoryPlayerStyle, String str2, boolean z, String str3, B b, String str4, rq3 rq3Var) {
        super(1, rq3Var);
        this.u = blazeDataSourceType;
        this.v = function1;
        this.w = str;
        this.x = blazeStoryPlayerStyle;
        this.y = str2;
        this.z = z;
        this.A = str3;
        this.B = b;
        this.C = str4;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new svm(this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((svm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x018c, code lost:
    
        if (defpackage.evl.b(r13, r1, r28) == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0125, code lost:
    
        if (defpackage.evl.b(r13, r1, r28) == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d7, code lost:
    
        if (defpackage.evl.b(r2, r0, r28) != r12) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String sb;
        String sb2;
        StoriesRepositoryImpl storiesRepositoryImpl;
        List o;
        BlazeStoryPlayerStyle blazeStoryPlayerStyle;
        BlazeDataSourceType blazeDataSourceType;
        BlazeStoryPlayerStyle blazeStoryPlayerStyle2;
        Function1 function1;
        Object fetchStories$default;
        BlazeStoryPlayerStyle blazeStoryPlayerStyle3;
        String str2;
        a9m a9mVar;
        BlazeDataSourceType blazeDataSourceType2;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        Function1 function12 = this.v;
        BlazeDataSourceType blazeDataSourceType3 = this.u;
        if (i == 0) {
            y6a.M(obj);
            try {
                a.validate$default(blazeDataSourceType3, ogm.ENTRYPOINT, false, 2, null);
                str = this.w;
                String str3 = (str == null || StringsKt.R(str)) ? null : str;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(blazeDataSourceType3.getStringRepresentation$blazesdk_release());
                if (str3 != null) {
                    sb3.append(str3);
                }
                sb3.append("prepare");
                sb = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(blazeDataSourceType3.getStringRepresentation$blazesdk_release());
                if (str3 != null) {
                    sb4.append(str3);
                }
                sb2 = sb4.toString();
                bxm bxmVar = bxm.a;
                storiesRepositoryImpl = StoriesRepositoryImpl.a;
                storiesRepositoryImpl.getClass();
                o = StoriesRepositoryImpl.o(sb);
                bmm.e(sb);
                blazeStoryPlayerStyle = (BlazeStoryPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(this.x);
            } catch (Exception e) {
                j1m j1mVar = j1m.a;
                x0 x0Var = new x0();
                x0Var.f = e;
                j1m.a(x0Var);
                BlazeResult.Error d = x0Var.d();
                this.t = 1;
            }
            if (!o.isEmpty()) {
                if (this.z) {
                    StoriesRepositoryImpl.q(sb);
                }
                bxm.d(sb, blazeDataSourceType3.getStringRepresentation$blazesdk_release(), blazeDataSourceType3.getAnalyticsLabelExpressionRepresentation$blazesdk_release(), blazeStoryPlayerStyle, this.B, this.A, this.w, this.C, new tpm(blazeDataSourceType3, function12, 3));
                return Unit.a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str4 = this.y;
            if (str4 != null) {
                linkedHashMap.put("eventId", str4);
            }
            if (str != null) {
                linkedHashMap.put("forcedFirstContentId", str);
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            this.r = sb2;
            this.s = blazeStoryPlayerStyle;
            this.t = 2;
            blazeDataSourceType = blazeDataSourceType3;
            blazeStoryPlayerStyle2 = null;
            function1 = function12;
            fetchStories$default = yrl.fetchStories$default(storiesRepositoryImpl, this.u, sb2, linkedHashMap, "entry_points_broadcast_id", this.z, false, this.A, this.w, this, 32, null);
            if (fetchStories$default != lu3Var) {
                blazeStoryPlayerStyle3 = blazeStoryPlayerStyle;
                str2 = sb2;
                a9mVar = (a9m) fetchStories$default;
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
            BlazeStoryPlayerStyle blazeStoryPlayerStyle4 = this.s;
            String str5 = (String) this.r;
            y6a.M(obj);
            blazeStoryPlayerStyle3 = blazeStoryPlayerStyle4;
            str2 = str5;
            function1 = function12;
            blazeStoryPlayerStyle2 = null;
            fetchStories$default = obj;
            blazeDataSourceType = blazeDataSourceType3;
            a9mVar = (a9m) fetchStories$default;
            if (a9mVar instanceof qbm) {
                if (((List) ((qbm) a9mVar).a).isEmpty()) {
                    BlazeResult.Error d2 = new y0().d();
                    this.r = a9mVar;
                    this.s = blazeStoryPlayerStyle2;
                    this.t = 3;
                } else {
                    bxm bxmVar2 = bxm.a;
                    blazeDataSourceType2 = blazeDataSourceType;
                    bxm.d(str2, blazeDataSourceType.getStringRepresentation$blazesdk_release(), blazeDataSourceType.getAnalyticsLabelExpressionRepresentation$blazesdk_release(), blazeStoryPlayerStyle3, this.B, this.A, this.w, this.C, new tpm(blazeDataSourceType2, function1, 2));
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
            blazeStoryPlayerStyle2 = null;
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
            this.s = blazeStoryPlayerStyle2;
            this.t = 4;
        }
        return Unit.a;
    }
}
