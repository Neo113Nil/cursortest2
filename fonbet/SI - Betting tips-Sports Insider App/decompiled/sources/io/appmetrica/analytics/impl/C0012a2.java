package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012a2 implements AppSetIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13327a;

    /* renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f13328b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AppSetId f13329c;

    /* renamed from: d, reason: collision with root package name */
    public CountDownLatch f13330d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13331e;

    /* renamed from: f, reason: collision with root package name */
    public final Z1 f13332f;

    public C0012a2(@NotNull Context context, @NotNull IAppSetIdRetriever iAppSetIdRetriever) {
        this.f13327a = context;
        this.f13328b = iAppSetIdRetriever;
        this.f13330d = new CountDownLatch(1);
        this.f13331e = 20L;
        this.f13332f = new Z1(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    @NotNull
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f13329c == null) {
            try {
                this.f13330d = new CountDownLatch(1);
                this.f13328b.retrieveAppSetId(this.f13327a, this.f13332f);
                this.f13330d.await(this.f13331e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f13329c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f13329c = appSetId;
        }
        return appSetId;
    }

    public C0012a2(@NotNull Context context) {
        this(context, AbstractC0038b2.a());
    }
}
