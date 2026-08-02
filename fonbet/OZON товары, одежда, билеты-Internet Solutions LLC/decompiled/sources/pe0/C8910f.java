package pe0;

import Ae.C0;
import Sc.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.maplibre.android.log.Logger;
import te0.C9867b;
import we0.p;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.LocationInterpolatorImpl$startInterpolation$3", f = "LocationInterpolatorImpl.kt", l = {98, Logger.NONE}, m = "invokeSuspend")
/* renamed from: pe0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8910f extends kotlin.coroutines.jvm.internal.j implements Function2<Pair<? extends p, ? extends Long>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f80451d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f80452e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8912h f80453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8910f(C8912h c8912h, kotlin.coroutines.d<? super C8910f> dVar) {
        super(2, dVar);
        this.f80453f = c8912h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8910f c8910f = new C8910f(this.f80453f, dVar);
        c8910f.f80452e = obj;
        return c8910f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends p, ? extends Long> pair, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8910f) create(pair, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (xe.Y.b(r5, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f80451d;
        if (i11 == 0) {
            s.b(obj);
            pair = (Pair) this.f80452e;
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("New interpolated coords: " + pair.e(), null, 6);
            long longValue = ((Number) pair.f()).longValue();
            this.f80452e = pair;
            this.f80451d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            pair = (Pair) this.f80452e;
            s.b(obj);
        }
        C0 d11 = this.f80453f.d();
        Object e11 = pair.e();
        this.f80452e = null;
        this.f80451d = 2;
    }
}
