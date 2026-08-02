package zi;

import Ae.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import xi.C10779a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$initialize$1", f = "CameraScreenViewModel.kt", l = {135, 140}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class q extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f109275d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f109276e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10779a f109277f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(m mVar, C10779a c10779a, kotlin.coroutines.d<? super q> dVar) {
        super(2, dVar);
        this.f109276e = mVar;
        this.f109277f = c10779a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new q(this.f109276e, this.f109277f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        if (r3.v0(r26) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r2.j(r26) == r1) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        l lVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f109275d;
        m mVar = this.f109276e;
        C10779a c10779a = this.f109277f;
        if (i11 == 0) {
            Sc.s.b(obj);
            mVar.f109225g = 1.0f;
            x0 x0Var = mVar.f109221c;
            do {
                value = x0Var.getValue();
                lVar = (l) value;
            } while (!x0Var.b(value, l.a(lVar, false, null, t.a(lVar.c(), (c10779a != null ? c10779a.c() : null) == C10779a.b.VIDEO ? yi.q.VIDEO : yi.q.PHOTO, false, (c10779a != null ? c10779a.c() : null) == C10779a.b.PHOTO_AND_VIDEO, false, 10), 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, null, 32763)));
            yi.i iVar = mVar.f109219a;
            this.f109275d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        if ((c10779a != null ? c10779a.d() : null) != null) {
            m.d0(mVar, c10779a.d());
        }
        this.f109275d = 2;
    }
}
