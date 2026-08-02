package x60;

import Sc.s;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.DangerPermissions;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.GetAppsBridgeInterface$handleRequestSync$1", f = "GetAppsBridgeInterface.kt", l = {60}, m = "invokeSuspend")
/* renamed from: x60.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10672d extends j implements Function2<M, kotlin.coroutines.d<? super NativeResult>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105057d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f105058e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ DangerPermissions f105059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10672d(e eVar, DangerPermissions dangerPermissions, kotlin.coroutines.d<? super C10672d> dVar) {
        super(2, dVar);
        this.f105058e = eVar;
        this.f105059f = dangerPermissions;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C10672d(this.f105058e, this.f105059f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super NativeResult> dVar) {
        return ((C10672d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105057d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        List<String> list = this.f105059f.getList();
        this.f105057d = 1;
        Object f7 = e.f(this.f105058e, list, this);
        return f7 == aVar ? aVar : f7;
    }
}
