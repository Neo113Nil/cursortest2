package bd;

import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3130c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f3131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f3133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f3134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3135h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f3136i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i5, j jVar, long j, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.f3129b = i5;
        this.f3130c = jVar;
        this.f3131d = j;
        this.f3132e = str;
        this.f3133f = str2;
        this.f3134g = str3;
        this.f3135h = str4;
        this.f3136i = str5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f3129b, this.f3130c, this.f3131d, this.f3132e, this.f3133f, this.f3134g, this.f3135h, this.f3136i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        if (this.f3129b < 0) {
            return Unit.f19194a;
        }
        try {
            j.c().a(this.f3129b, (int) this.f3131d, this.f3132e, this.f3133f, this.f3134g, this.f3135h, this.f3136i);
        } catch (Exception ex) {
            io.sentry.e eVar = new io.sentry.e("add live to room");
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar2 = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new ge.f((Object) ex, (Comparable) eVar, "addLiveToRoom", (Continuation) null, 18), 2);
        }
        return Unit.f19194a;
    }
}
