package jd;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import eg.c0;
import eg.t1;
import eg.z;
import j$.time.Instant;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.i;
import nh.d0;
import rc.b0;
import yb.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18449b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f18450c;

    /* renamed from: d, reason: collision with root package name */
    public long f18451d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t1 t1Var, za.b bVar, long j, Continuation continuation) {
        super(2, continuation);
        this.f18452e = t1Var;
        this.f18453f = bVar;
        this.f18451d = j;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f18449b) {
            case 0:
                return new c((y8.d) this.f18453f, continuation);
            default:
                return new c((t1) this.f18452e, (za.b) this.f18453f, this.f18451d, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f18449b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:22:0x004b, B:24:0x00c8, B:30:0x005e, B:32:0x00a9, B:34:0x00ae, B:41:0x00c1, B:43:0x0066, B:45:0x008a, B:50:0x0094, B:56:0x006f), top: B:16:0x0041 }] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        Object i5;
        Object obj2;
        Object obj3;
        switch (this.f18449b) {
            case 0:
                y8.d dVar = (y8.d) this.f18453f;
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f18450c;
                Continuation continuation = null;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        long epochMilli = Instant.now().toEpochMilli();
                        this.f18451d = epochMilli;
                        this.f18450c = 1;
                        j = epochMilli;
                        i5 = c0.i(new d(dVar, j, continuation, 0), this);
                        if (i5 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj3 = this.f18452e;
                                h8.b.B(obj);
                                obj2 = obj3;
                                return (String) obj2;
                            }
                            j = this.f18451d;
                            h8.b.B(obj);
                            obj2 = obj;
                            if (((String) obj2) != null) {
                                this.f18452e = obj2;
                                this.f18451d = j;
                                this.f18450c = 3;
                                Object i11 = c0.i(new d(dVar, j, continuation, 1), this);
                                if (i11 != aVar) {
                                    i11 = Unit.f19194a;
                                }
                                if (i11 == aVar) {
                                    return aVar;
                                }
                                obj3 = obj2;
                                obj2 = obj3;
                            }
                            return (String) obj2;
                        }
                        j = this.f18451d;
                        h8.b.B(obj);
                        i5 = obj;
                    }
                } catch (Exception e7) {
                    ed.b bVar = new ed.b();
                    Intrinsics.checkNotNullParameter(e7, "e");
                    if (!(e7 instanceof CancellationException) && !(e7 instanceof nh.a) && !(e7 instanceof d0) && !(e7 instanceof ConnectException) && !(e7 instanceof SocketException) && !(e7 instanceof SSLPeerUnverifiedException) && !(e7 instanceof SSLHandshakeException) && !(e7 instanceof SSLException) && !(e7 instanceof TimeoutException) && !(e7 instanceof SocketTimeoutException) && !(e7 instanceof UnknownHostException) && !(e7 instanceof IOException)) {
                        zc.d.b(6, null, e7);
                        c0.t(MyApp.f6830c, b0.b(), null, new qb.a(bVar, "GetPushToken", e7, e7.getMessage(), (Continuation) null), 2);
                    }
                }
                if (((Boolean) i5).booleanValue()) {
                    return null;
                }
                m mVar = (m) y3.m(m.class, null, 6);
                this.f18451d = j;
                this.f18450c = 2;
                Object b10 = mVar.b(this);
                if (b10 == aVar) {
                    return aVar;
                }
                obj2 = b10;
                if (((String) obj2) != null) {
                }
                return (String) obj2;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f18450c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    t1 t1Var = (t1) this.f18452e;
                    this.f18450c = 1;
                    if (t1Var.w(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return za.b.b(this.f18451d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y8.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f18453f = dVar;
    }
}
