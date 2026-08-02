package id;

import com.sports.insider.R;
import eg.c0;
import eg.m0;
import hg.t0;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import la.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11219b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f11220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(je.c cVar, int i5, boolean z5, Continuation continuation) {
        super(2, continuation);
        this.f11223f = cVar;
        this.f11221d = i5;
        this.f11222e = z5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f11219b) {
            case 0:
                return new w(this.f11222e, (x) this.f11223f, this.f11221d, continuation);
            default:
                return new w((je.c) this.f11223f, this.f11221d, this.f11222e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f11219b) {
        }
        return ((w) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Object[] objArr = 0;
        switch (this.f11219b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f11220c;
                try {
                    if (i5 == 0) {
                        h8.b.B(obj);
                        if (!this.f11222e) {
                            LocalDateTime now = LocalDateTime.now();
                            ChronoUnit chronoUnit = ChronoUnit.SECONDS;
                            LocalDateTime truncatedTo = now.truncatedTo(chronoUnit);
                            ZoneOffset zoneOffset = ZoneOffset.UTC;
                            long epochSecond = truncatedTo.toEpochSecond(zoneOffset);
                            long j = 60;
                            if (epochSecond <= LocalDateTime.ofEpochSecond(x.f11225b, 0, zoneOffset).truncatedTo(chronoUnit).toEpochSecond(zoneOffset) + j && LocalDateTime.ofEpochSecond(x.f11225b, 0, zoneOffset).truncatedTo(chronoUnit).toEpochSecond(zoneOffset) - j <= epochSecond) {
                                return Unit.f19194a;
                            }
                        }
                        ((x) this.f11223f).getClass();
                        s0 d10 = x.d();
                        Integer num = this.f11222e ? new Integer(this.f11221d) : null;
                        this.f11220c = 1;
                        d10.getClass();
                        lg.e eVar = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new kd.e((Object) d10, (Object) num, (Continuation) (objArr == true ? 1 : 0), 5), this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    int intValue = ((Number) obj).intValue();
                    if (200 > intValue || intValue >= 400) {
                        x.a((x) this.f11223f);
                    } else {
                        LocalDateTime now2 = LocalDateTime.now();
                        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
                        LocalDateTime truncatedTo2 = now2.truncatedTo(chronoUnit2);
                        ZoneOffset zoneOffset2 = ZoneOffset.UTC;
                        x.f11225b = LocalDateTime.ofEpochSecond(truncatedTo2.toEpochSecond(zoneOffset2), 0, zoneOffset2).truncatedTo(chronoUnit2).toEpochSecond(zoneOffset2);
                    }
                } catch (Exception e7) {
                    if (!(e7 instanceof CancellationException) && !(e7 instanceof EOFException) && !(e7 instanceof SSLHandshakeException) && !(e7 instanceof SSLException) && !(e7 instanceof SocketTimeoutException) && !(e7 instanceof SocketException) && !(e7 instanceof UnknownHostException) && !(e7 instanceof IOException)) {
                        zc.d.b(6, null, e7);
                    }
                    x.a((x) this.f11223f);
                }
                return Unit.f19194a;
            default:
                je.c cVar = (je.c) this.f11223f;
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f11220c;
                try {
                    try {
                        if (i10 == 0) {
                            h8.b.B(obj);
                            fd.d dVar = (fd.d) cVar.f18480i.getValue();
                            int i11 = this.f11221d;
                            boolean z5 = this.f11222e;
                            this.f11220c = 1;
                            obj = dVar.d(i11, z5, this);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                        }
                        List list = (List) obj;
                        cVar.f18475d.j(list != null ? (hc.h) CollectionsKt.firstOrNull(list) : null);
                    } finally {
                        cVar.f18478g.h(Boolean.FALSE);
                    }
                } catch (CancellationException unused) {
                } catch (Exception unused2) {
                    t0 t0Var = rc.x.f22455a;
                    rc.x.a(R.string.error_loading_news, true);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z5, x xVar, int i5, Continuation continuation) {
        super(2, continuation);
        this.f11222e = z5;
        this.f11223f = xVar;
        this.f11221d = i5;
    }
}
