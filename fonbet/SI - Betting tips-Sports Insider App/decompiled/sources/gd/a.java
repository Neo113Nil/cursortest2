package gd;

import com.sports.insider.MyApp;
import eg.b2;
import eg.c0;
import eg.m0;
import eg.z;
import ge.f;
import io.sentry.e;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocketFactory;
import jg.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f9949b;

    /* renamed from: c, reason: collision with root package name */
    public int f9950c;

    /* renamed from: d, reason: collision with root package name */
    public int f9951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f9952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f9953f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z5, c cVar, Continuation continuation) {
        super(2, continuation);
        this.f9952e = z5;
        this.f9953f = cVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f9952e, this.f9953f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r12, java.lang.Boolean.FALSE) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r12 != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i5;
        SSLSocketFactory sSLSocketFactory;
        lf.a aVar = lf.a.f20034a;
        int i10 = this.f9951d;
        Continuation continuation = null;
        int i11 = 1;
        try {
        } catch (CancellationException unused) {
        } catch (Exception ex) {
            if (ex instanceof UnknownHostException) {
                r3 = 3;
            } else {
                if (ex instanceof SSLHandshakeException) {
                    i5 = 2;
                } else {
                    i5 = ex instanceof SSLException ? 4 : 0;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i5);
                sb2.append(" sslSocketFactory is ");
                e eVar = new e(d9.e.l(sb2, i10 != 0 ? "" : "not ", "null"));
                Intrinsics.checkNotNullParameter(ex, "ex");
                d dVar = MyApp.f6830c;
                lg.e eVar2 = m0.f9201a;
                c0.t(dVar, lg.d.f20063c, null, new f((Object) ex, (Comparable) eVar, "pingServer", continuation, 18), 2);
                r3 = i5;
            }
        }
        if (i10 == 0) {
            h8.b.B(obj);
            boolean z5 = this.f9952e;
            if (z5) {
                c cVar = this.f9953f;
                this.f9949b = z5;
                this.f9951d = 1;
                obj = c.a(cVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                sSLSocketFactory = null;
                i10 = sSLSocketFactory != null ? 1 : 0;
                ad.a aVar2 = new ad.a(sSLSocketFactory, continuation, 8);
                this.f9950c = i10;
                this.f9951d = 2;
                obj = b2.c(10000L, aVar2, this);
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f9950c;
                h8.b.B(obj);
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                }
                i11 = 0;
                r3 = i11;
                return new Integer(r3);
            }
            boolean z7 = this.f9949b;
            h8.b.B(obj);
        }
        sSLSocketFactory = (SSLSocketFactory) obj;
        if (sSLSocketFactory != null) {
        }
        ad.a aVar22 = new ad.a(sSLSocketFactory, continuation, 8);
        this.f9950c = i10;
        this.f9951d = 2;
        obj = b2.c(10000L, aVar22, this);
    }
}
