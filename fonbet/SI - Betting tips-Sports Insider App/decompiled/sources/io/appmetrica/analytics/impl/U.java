package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class U implements Aa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12941a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f12942b;

    /* renamed from: i, reason: collision with root package name */
    public FutureTask f12949i;
    public final J j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12952m;

    /* renamed from: c, reason: collision with root package name */
    public final String f12943c = "advertising identifiers collecting is forbidden by client configuration";

    /* renamed from: d, reason: collision with root package name */
    public final String f12944d = "advertising identifiers collecting is forbidden by startup";

    /* renamed from: e, reason: collision with root package name */
    public final String f12945e = "advertising identifiers collecting is forbidden by unknown reason";

    /* renamed from: f, reason: collision with root package name */
    public final N f12946f = new N(new C0658zg("google"));

    /* renamed from: g, reason: collision with root package name */
    public final N f12947g = new N(new C0658zg("huawei"));

    /* renamed from: h, reason: collision with root package name */
    public final N f12948h = new N(new C0658zg("yandex"));

    /* renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f12950k = new AdvertisingIdsHolder();

    /* renamed from: l, reason: collision with root package name */
    public G f12951l = new G(4, 4, 4);

    public U(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor, @NotNull C0161fm c0161fm) {
        this.f12941a = context;
        this.f12942b = iCommonExecutor;
        this.j = new J(c0161fm);
    }

    public static final Void e(U u10) {
        u10.f12950k = new AdvertisingIdsHolder(u10.a(u10.f12951l.f12242a, new Q(u10)), u10.a(u10.f12951l.f12243b, new S(u10)), u10.a(u10.f12951l.f12244c, new T(u10, new Xd())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers(@NotNull Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void init() {
        if (this.f12949i == null) {
            this.f12951l = this.j.a();
            FutureTask futureTask = new FutureTask(new d4.z(2, this));
            this.f12949i = futureTask;
            this.f12942b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Aa, io.appmetrica.analytics.impl.InterfaceC0290km
    public final synchronized void a(@NotNull C0161fm c0161fm) {
        this.j.a(c0161fm);
        a((Gi) new Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void b(boolean z5) {
        this.f12952m = true;
        this.j.f12398b.update(z5);
        a((Gi) new Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void c(boolean z5) {
        if (!this.f12952m) {
            b(z5);
        }
    }

    @Override // io.appmetrica.analytics.impl.Aa
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f12949i;
        if (futureTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refresh");
            futureTask = null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f12950k;
    }

    @Override // io.appmetrica.analytics.impl.Aa
    @NotNull
    public final synchronized AdvertisingIdsHolder a() {
        return a(new Xd());
    }

    @Override // io.appmetrica.analytics.impl.Aa
    @NotNull
    public final synchronized AdvertisingIdsHolder a(@NotNull Gi gi2) {
        try {
            a(gi2, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f12950k;
    }

    public final FutureTask a(final Gi gi2, final boolean z5) {
        final G a7 = this.j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.fp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z5, a7, this, gi2);
            }
        });
        this.f12949i = futureTask;
        this.f12942b.execute(futureTask);
        FutureTask futureTask2 = this.f12949i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("refresh");
        return null;
    }

    public static final Void a(boolean z5, G g10, U u10, Gi gi2) {
        if (!z5 && Intrinsics.areEqual(g10, u10.f12951l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u10.f12950k;
        AdTrackingInfoResult a7 = u10.a(g10.f12242a, new Q(u10));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = a7.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a7 = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a7.mErrorExplanation);
        }
        AdTrackingInfoResult a10 = u10.a(g10.f12243b, new S(u10));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = a10.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a10 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a10.mErrorExplanation);
        }
        AdTrackingInfoResult a11 = u10.a(g10.f12244c, new T(u10, gi2));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = a11.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a11 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a11.mErrorExplanation);
        }
        u10.f12950k = new AdvertisingIdsHolder(a7, a10, a11);
        return null;
    }

    public final AdTrackingInfoResult a(int i5, Function0 function0) {
        if (i5 == 0) {
            throw null;
        }
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (AdTrackingInfoResult) function0.invoke();
        }
        if (i10 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f12943c);
        }
        if (i10 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f12944d);
        }
        if (i10 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f12945e);
        }
        throw new gf.m();
    }
}
