package zi;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$handlePinchZoom$1", f = "CameraScreenViewModel.kt", l = {419}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class p extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f109271d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f109272e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f109273f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ yi.g f109274g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(m mVar, float f7, yi.g gVar, kotlin.coroutines.d<? super p> dVar) {
        super(2, dVar);
        this.f109272e = mVar;
        this.f109273f = f7;
        this.f109274g = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new p(this.f109272e, this.f109273f, this.f109274g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object s02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f109271d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f109271d = 1;
            s02 = this.f109272e.s0(this.f109273f, this.f109274g, this);
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
