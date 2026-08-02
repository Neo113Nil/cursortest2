package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import b6.p;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.location.LocationRequest;
import d6.f;
import e6.c0;
import e6.i;
import e6.j;
import e6.m;
import e6.w;
import e6.x;
import e6.y;
import g6.v;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.LongCompanionObject;
import p7.a;
import p7.b;
import p7.c;
import p7.e;
import w7.g;
import y8.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a, reason: collision with root package name */
    private final a f11791a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationListener f11792b;

    /* renamed from: c, reason: collision with root package name */
    private final b f11793c;

    /* renamed from: d, reason: collision with root package name */
    private final Looper f11794d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f11795e;

    /* renamed from: f, reason: collision with root package name */
    private final long f11796f;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11797a;

        static {
            int[] iArr = new int[Priority.values().length];
            f11797a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11797a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11797a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class ClientProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Context f11798a;

        public ClientProvider(Context context) {
            this.f11798a = context;
        }

        public final a a() {
            Context context = this.f11798a;
            int i5 = c.f21523a;
            return new m7.a(context, null, m7.a.f20426l, d6.b.f8244d0, f.f8246c);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) throws Throwable {
        a aVar = this.f11791a;
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
        long j = this.f11796f;
        v.a("intervalMillis must be greater than or equal to 0", j >= 0);
        long j6 = locationRequest.f5716c;
        long j10 = locationRequest.f5715b;
        if (j6 == j10 / 6) {
            locationRequest.f5716c = j / 6;
        }
        if (locationRequest.f5722i == j10) {
            locationRequest.f5722i = j;
        }
        locationRequest.f5715b = j;
        int i5 = AnonymousClass1.f11797a[priority.ordinal()];
        int i10 = i5 != 1 ? i5 != 2 ? i5 != 3 ? 105 : 100 : 102 : 104;
        e.a(i10);
        locationRequest.f5714a = i10;
        b bVar = this.f11793c;
        Looper looper = this.f11794d;
        m7.a aVar2 = (m7.a) aVar;
        aVar2.getClass();
        if (looper == null) {
            looper = Looper.myLooper();
            v.i(looper, "invalid null looper");
        }
        String simpleName = b.class.getSimpleName();
        v.i(bVar, "Listener must not be null");
        j jVar = new j(looper, bVar, simpleName);
        g4 g4Var = new g4();
        g4Var.f5059c = aVar2;
        g4Var.f5057a = true;
        g4Var.f5058b = jVar;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(12, g4Var, locationRequest);
        p pVar = new p();
        pVar.f3079b = cVar;
        pVar.f3080c = g4Var;
        pVar.f3081d = jVar;
        pVar.f3078a = 2436;
        i iVar = (i) jVar.f8719b;
        v.i(iVar, "Key must not be null");
        j jVar2 = (j) pVar.f3081d;
        int i11 = pVar.f3078a;
        y yVar = new y(pVar, jVar2, i11);
        h9.c cVar2 = new h9.c(pVar, iVar);
        v.i((i) jVar2.f8719b, "Listener has already been released.");
        e6.e eVar = aVar2.f8258k;
        eVar.getClass();
        g gVar = new g();
        eVar.c(gVar, i11, aVar2);
        w wVar = new w(new c0(new x(yVar, cVar2), gVar), eVar.f8701i.get(), aVar2);
        h0 h0Var = eVar.f8705n;
        h0Var.sendMessage(h0Var.obtainMessage(8, wVar));
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        a aVar = this.f11791a;
        b bVar = this.f11793c;
        m7.a aVar2 = (m7.a) aVar;
        aVar2.getClass();
        String simpleName = b.class.getSimpleName();
        v.i(bVar, "Listener must not be null");
        v.f(simpleName, "Listener type must not be empty");
        aVar2.b(new i(bVar, simpleName), 2418).g(g6.p.f9862e, m3.f.f20311c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        m7.a aVar = (m7.a) this.f11791a;
        aVar.getClass();
        m a7 = y.a();
        a7.f8722a = d.f25730c;
        a7.f8726e = 2414;
        aVar.c(0, a7.a()).e(this.f11795e, new GplOnSuccessListener(this.f11792b));
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j) {
        this.f11791a = clientProvider.a();
        this.f11792b = locationListener;
        this.f11794d = looper;
        this.f11795e = executor;
        this.f11796f = j;
        this.f11793c = new GplLocationCallback(locationListener);
    }
}
