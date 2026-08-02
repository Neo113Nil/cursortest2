package zi;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$toggleFlash$3", f = "CameraScreenViewModel.kt", l = {344}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f109286d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f109287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(m mVar, kotlin.coroutines.d<? super s> dVar) {
        super(2, dVar);
        this.f109287e = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new s(this.f109287e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f109286d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f109286d = 1;
            if (this.f109287e.v0(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
