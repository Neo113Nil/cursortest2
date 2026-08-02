package wc;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f25051c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f25052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f25053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f25054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f25056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f25057i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, Activity activity, String str, boolean z5, int i5, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f25051c = d0Var;
        this.f25052d = activity;
        this.f25053e = str;
        this.f25054f = z5;
        this.f25055g = i5;
        this.f25056h = str2;
        this.f25057i = str3;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a0(this.f25051c, this.f25052d, this.f25053e, this.f25054f, this.f25055g, this.f25056h, this.f25057i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f25050b;
        if (i5 == 0) {
            h8.b.B(obj);
            pc.u b10 = d0.b();
            int i10 = this.f25054f ? 2 : 0;
            this.f25050b = 1;
            if (b10.t(this.f25052d, this.f25053e, i10, this.f25055g, this.f25056h, this.f25057i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }
}
