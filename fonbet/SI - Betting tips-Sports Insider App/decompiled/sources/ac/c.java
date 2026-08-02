package ac;

import android.content.Context;
import c4.y;
import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import eg.r;
import eg.z;
import f3.x;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.StartupParamsCallback;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f123b;

    /* renamed from: c, reason: collision with root package name */
    public int f124c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, Continuation continuation, int i5) {
        super(2, continuation);
        this.f123b = i5;
        this.f125d = context;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f123b) {
            case 0:
                return new c(this.f125d, continuation, 0);
            default:
                return new c(this.f125d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f123b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f123b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f124c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                r a7 = c0.a();
                AppMetrica.requestStartupParams(this.f125d, new b(a7), u.f(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID));
                this.f124c = 1;
                Object m6 = a7.m(this);
                return m6 == aVar ? aVar : m6;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f124c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    gc.a aVar3 = (gc.a) y3.m(gc.a.class, null, 6);
                    this.f124c = 1;
                    aVar3.getClass();
                    obj = c0.i(new ad.a(aVar3, null, 7), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Pair pair = (Pair) obj;
                y.f3634a.set(x.k0(this.f125d, (SSLContext) pair.f19192a, (X509TrustManager) pair.f19193b));
                return Unit.f19194a;
        }
    }
}
