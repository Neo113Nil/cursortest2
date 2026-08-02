package id;

import com.sports.insider.MyApp;
import eg.b2;
import eg.c0;
import eg.g0;
import eg.y1;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11169b;

    /* renamed from: c, reason: collision with root package name */
    public int f11170c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.a f11172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11173f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(boolean z5, l1.a aVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f11169b = i10;
        this.f11171d = z5;
        this.f11172e = aVar;
        this.f11173f = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f11169b) {
            case 0:
                return new j(this.f11171d, this.f11172e, this.f11173f, continuation, 0);
            default:
                return new j(this.f11171d, this.f11172e, this.f11173f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f11169b) {
        }
        return ((j) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5;
        switch (this.f11169b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f11170c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                boolean z5 = this.f11171d;
                Continuation continuation = null;
                int i11 = this.f11173f;
                l1.a aVar2 = this.f11172e;
                g0 e7 = z5 ? c0.e(MyApp.f6830c, new eg.y("loadPredictionInfo"), new g(aVar2, i11, continuation, 1), 2) : c0.e(MyApp.f6830c, new eg.y("loadPrediction"), new g(aVar2, i11, continuation, 0), 2);
                this.f11170c = 1;
                Object m6 = e7.m(this);
                return m6 == aVar ? aVar : m6;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f11170c;
                Continuation continuation2 = null;
                int i13 = 1;
                try {
                    if (i12 == 0) {
                        h8.b.B(obj);
                        j jVar = new j(this.f11171d, this.f11172e, this.f11173f, continuation2, 0);
                        this.f11170c = 1;
                        obj = b2.b(20000L, jVar, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    i5 = ((Number) obj).intValue();
                } catch (Exception ex) {
                    if ((ex instanceof EOFException) || (ex instanceof SSLHandshakeException) || (ex instanceof SSLException) || (ex instanceof SocketTimeoutException) || (ex instanceof SocketException) || (ex instanceof UnknownHostException) || (ex instanceof IOException)) {
                        Intrinsics.checkNotNullParameter(ex, "ex");
                        i13 = 0;
                    } else if (ex instanceof y1) {
                        Intrinsics.checkNotNullParameter(ex, "ex");
                        i13 = 2;
                    } else if (ex instanceof CancellationException) {
                        Intrinsics.checkNotNullParameter(ex, "ex");
                    } else {
                        zc.d.b(6, null, ex);
                        i13 = 400;
                    }
                    i5 = i13;
                }
                return new Integer(i5);
        }
    }
}
