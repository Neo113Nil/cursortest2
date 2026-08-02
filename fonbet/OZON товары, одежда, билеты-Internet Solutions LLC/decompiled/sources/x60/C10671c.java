package x60;

import Sc.s;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.DangerPermissions;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.GetAppsBridgeInterface$handleRequest$1", f = "GetAppsBridgeInterface.kt", l = {49}, m = "invokeSuspend")
/* renamed from: x60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10671c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    U50.j f105051d;

    /* renamed from: e, reason: collision with root package name */
    int f105052e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ U50.j f105053f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f105054g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ DangerPermissions f105055h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f105056i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10671c(U50.j jVar, e eVar, DangerPermissions dangerPermissions, long j11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f105053f = jVar;
        this.f105054g = eVar;
        this.f105055h = dangerPermissions;
        this.f105056i = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C10671c(this.f105053f, this.f105054g, this.f105055h, this.f105056i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10671c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        U50.j jVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105052e;
        if (i11 == 0) {
            s.b(obj);
            List<String> list = this.f105055h.getList();
            U50.j jVar2 = this.f105053f;
            this.f105051d = jVar2;
            this.f105052e = 1;
            obj = e.f(this.f105054g, list, this);
            if (obj == aVar) {
                return aVar;
            }
            jVar = jVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = this.f105051d;
            s.b(obj);
        }
        jVar.invoke(obj);
        L80.a.a("GetAppsBridgeInterface", "Time: " + (System.currentTimeMillis() - this.f105056i));
        return Unit.f71690a;
    }
}
