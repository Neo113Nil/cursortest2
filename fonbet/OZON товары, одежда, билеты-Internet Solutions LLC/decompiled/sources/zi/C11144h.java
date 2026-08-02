package zi;

import S0.InterfaceC3974n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import org.maplibre.android.log.Logger;
import ve.EnumC10311b;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenKt$rememberDurationState$1$1", f = "CameraScreen.kt", l = {Logger.NONE}, m = "invokeSuspend")
/* renamed from: zi.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C11144h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    long f109186d;

    /* renamed from: e, reason: collision with root package name */
    int f109187e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3974n0 f109188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11144h(InterfaceC3974n0 interfaceC3974n0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f109188f = interfaceC3974n0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C11144h(this.f109188f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C11144h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        long g10;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f109187e;
        if (i11 == 0) {
            Sc.s.b(obj);
            currentTimeMillis = System.currentTimeMillis();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            currentTimeMillis = this.f109186d;
            Sc.s.b(obj);
        }
        do {
            this.f109188f.t(System.currentTimeMillis() - currentTimeMillis);
            b.Companion companion = kotlin.time.b.INSTANCE;
            g10 = kotlin.time.c.g(100, EnumC10311b.MILLISECONDS);
            this.f109186d = currentTimeMillis;
            this.f109187e = 1;
        } while (Y.c(g10, this) != aVar);
        return aVar;
    }
}
