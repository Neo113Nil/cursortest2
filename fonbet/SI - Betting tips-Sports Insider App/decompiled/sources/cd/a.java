package cd;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3753c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f3754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f3756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i5, String str, long j, String str2, b bVar, Continuation continuation) {
        super(2, continuation);
        this.f3752b = i5;
        this.f3753c = str;
        this.f3754d = j;
        this.f3755e = str2;
        this.f3756f = bVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f3752b, this.f3753c, this.f3754d, this.f3755e, this.f3756f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        int i5 = this.f3752b;
        if (i5 < 1) {
            return Unit.f19194a;
        }
        String str = this.f3753c;
        if (str == null || str.length() == 0) {
            return Unit.f19194a;
        }
        long j = this.f3754d;
        if (j < 0) {
            return Unit.f19194a;
        }
        String str2 = this.f3755e;
        if (str2 == null || str2.length() == 0) {
            return Unit.f19194a;
        }
        JSONObject put = new JSONObject().put("announcementId", i5).put("product", str).put("price", j).put("currency", str2);
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        this.f3756f.n("buyAfterAnnouncement", put.toString());
        return Unit.f19194a;
    }
}
