package kd;

import android.app.PendingIntent;
import android.content.Context;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f18993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f18994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f18996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f18997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f18998g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f18999h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f19000i;
    public final /* synthetic */ boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f19001k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19002l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f19003m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i5, PendingIntent pendingIntent, String str, String str2, Context context, boolean z5, boolean z7, String str3, int i10, PendingIntent pendingIntent2, Continuation continuation) {
        super(2, continuation);
        this.f18994c = cVar;
        this.f18995d = i5;
        this.f18996e = pendingIntent;
        this.f18997f = str;
        this.f18998g = str2;
        this.f18999h = context;
        this.f19000i = z5;
        this.j = z7;
        this.f19001k = str3;
        this.f19002l = i10;
        this.f19003m = pendingIntent2;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f18994c, this.f18995d, this.f18996e, this.f18997f, this.f18998g, this.f18999h, this.f19000i, this.j, this.f19001k, this.f19002l, this.f19003m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Object g10;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f18993b;
        c cVar = this.f18994c;
        if (i5 == 0) {
            h8.b.B(obj);
            this.f18993b = 1;
            g10 = cVar.g(this);
            if (g10 == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            g10 = obj;
        }
        if (!((Boolean) g10).booleanValue()) {
            return Unit.f19194a;
        }
        ((jd.a) cVar.f19008a.getValue()).d(this.f18995d, (String) cVar.b().f10039a, (String) cVar.b().f10040b, (String) cVar.b().f10041c, this.f18996e, this.f18997f, this.f18998g, this.f18999h, this.f19000i, this.j, this.f19001k, this.f19002l, this.f19003m);
        return Unit.f19194a;
    }
}
