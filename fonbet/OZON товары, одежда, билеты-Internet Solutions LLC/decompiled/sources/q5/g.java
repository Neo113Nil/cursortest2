package q5;

import Sc.s;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l5.InterfaceC7874c;
import n5.EnumC8444d;
import org.jetbrains.annotations.NotNull;
import q5.C8986a;
import t5.C9759d;
import t5.InterfaceC9758c;
import v5.C10234h;
import v5.C10239m;
import v5.C10243q;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super C10243q>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f81678d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8986a f81679e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10234h f81680f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f81681g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10239m f81682h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC7874c f81683i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC9758c.b f81684j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ k f81685k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(C8986a c8986a, C10234h c10234h, Object obj, C10239m c10239m, InterfaceC7874c interfaceC7874c, InterfaceC9758c.b bVar, k kVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f81679e = c8986a;
        this.f81680f = c10234h;
        this.f81681g = obj;
        this.f81682h = c10239m;
        this.f81683i = interfaceC7874c;
        this.f81684j = bVar;
        this.f81685k = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new g(this.f81679e, this.f81680f, this.f81681g, this.f81682h, this.f81683i, this.f81684j, this.f81685k, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super C10243q> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        g gVar;
        C9759d c9759d;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f81678d;
        C10234h c10234h = this.f81680f;
        if (i11 == 0) {
            s.b(obj);
            this.f81678d = 1;
            obj = C8986a.c(this.f81679e, c10234h, this.f81681g, this.f81682h, this.f81683i, this);
            gVar = this;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            gVar = this;
        }
        C8986a.C1375a c1375a = (C8986a.C1375a) obj;
        c9759d = gVar.f81679e.f81626c;
        InterfaceC9758c.b bVar = gVar.f81684j;
        boolean d11 = c9759d.d(bVar, c10234h, c1375a);
        Drawable d12 = c1375a.d();
        EnumC8444d b11 = c1375a.b();
        if (!d11) {
            bVar = null;
        }
        InterfaceC9758c.b bVar2 = bVar;
        String c11 = c1375a.c();
        boolean e11 = c1375a.e();
        int i12 = A5.k.f430d;
        k kVar = gVar.f81685k;
        return new C10243q(d12, c10234h, b11, bVar2, c11, e11, kVar != null && kVar.d());
    }
}
