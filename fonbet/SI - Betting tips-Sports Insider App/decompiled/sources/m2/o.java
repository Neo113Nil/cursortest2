package m2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f20254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f20256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, String str, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.f20254b = qVar;
        this.f20255c = str;
        this.f20256d = function1;
    }

    @Override // mf.a
    public final Continuation create(Continuation continuation) {
        return new o(this.f20254b, this.f20255c, this.f20256d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o) create((Continuation) obj)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        s2.c r02 = this.f20254b.f20262b.r0(this.f20255c);
        try {
            Object invoke = this.f20256d.invoke(r02);
            u6.h.g(r02, null);
            return invoke;
        } finally {
        }
    }
}
