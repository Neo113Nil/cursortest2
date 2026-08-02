package zi;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$cycleZoom$1", f = "CameraScreenViewModel.kt", l = {462}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class n extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f109257d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f109258e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f109259f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ yi.g f109260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(m mVar, float f7, yi.g gVar, kotlin.coroutines.d<? super n> dVar) {
        super(2, dVar);
        this.f109258e = mVar;
        this.f109259f = f7;
        this.f109260g = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new n(this.f109258e, this.f109259f, this.f109260g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object s02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f109257d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f109257d = 1;
            s02 = this.f109258e.s0(this.f109259f, this.f109260g, this);
            if (s02 == aVar) {
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
