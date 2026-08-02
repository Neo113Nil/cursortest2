package kc0;

import com.vk.id.auth.VKIDAuthUiParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$setVkIdOneTapButtonCallbacks$4", f = "EntryCredentialsFragment.kt", l = {286}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class z extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71416d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7645c f71417e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.id.nativeauth.data.models.b f71418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(C7645c c7645c, ru.ozon.id.nativeauth.data.models.b bVar, kotlin.coroutines.d<? super z> dVar) {
        super(1, dVar);
        this.f71417e = c7645c;
        this.f71418f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new z(this.f71417e, this.f71418f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super VKIDAuthUiParams> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71416d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        C7629C C11 = this.f71417e.C();
        this.f71416d = 1;
        Object F02 = C11.F0(this.f71418f, this);
        return F02 == aVar ? aVar : F02;
    }
}
