package io.appmetrica.analytics.idsync.impl;

import android.net.Uri;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.impl.r;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f11908a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11909b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11910c = CommonUrlParts.ADV_ID;

    /* renamed from: d, reason: collision with root package name */
    public final String f11911d = CommonUrlParts.HUAWEI_OAID;

    /* renamed from: e, reason: collision with root package name */
    public final String f11912e = CommonUrlParts.YANDEX_ADV_ID;

    /* renamed from: f, reason: collision with root package name */
    public final String f11913f = CommonUrlParts.UUID;

    /* renamed from: g, reason: collision with root package name */
    public final String f11914g = CommonUrlParts.DEVICE_ID;

    /* renamed from: h, reason: collision with root package name */
    public final String f11915h = CommonUrlParts.APP_SET_ID;

    /* renamed from: i, reason: collision with root package name */
    public final long f11916i = TimeUnit.SECONDS.toMillis(60);
    public final long j = 1000;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f11917k = new SystemTimeProvider();

    /* renamed from: l, reason: collision with root package name */
    public final u f11918l;

    public r(@NotNull ServiceContext serviceContext, @NotNull String str) {
        this.f11908a = serviceContext;
        this.f11909b = str;
        this.f11918l = new u(serviceContext);
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(@NotNull final String str, @NotNull SdkIdentifiers sdkIdentifiers) {
        PlatformIdentifiers platformIdentifiers = this.f11908a.getPlatformIdentifiers();
        AdvertisingIdsHolder identifiers = platformIdentifiers.getAdvIdentifiersProvider().getIdentifiers(this.f11908a.getContext());
        Uri.Builder buildUpon = Uri.parse(this.f11909b).buildUpon();
        AdTrackingInfo adTrackingInfo = identifiers.getGoogle().mAdTrackingInfo;
        if (adTrackingInfo != null) {
            buildUpon.appendQueryParameter(this.f11910c, adTrackingInfo.advId);
        }
        AdTrackingInfo adTrackingInfo2 = identifiers.getHuawei().mAdTrackingInfo;
        if (adTrackingInfo2 != null) {
            buildUpon.appendQueryParameter(this.f11911d, adTrackingInfo2.advId);
        }
        AdTrackingInfo adTrackingInfo3 = identifiers.getYandex().mAdTrackingInfo;
        if (adTrackingInfo3 != null) {
            buildUpon.appendQueryParameter(this.f11912e, adTrackingInfo3.advId);
        }
        buildUpon.appendQueryParameter(this.f11913f, sdkIdentifiers.getUuid());
        buildUpon.appendQueryParameter(this.f11914g, sdkIdentifiers.getDeviceId());
        String id2 = platformIdentifiers.getAppSetIdProvider().getAppSetId().getId();
        if (id2 != null) {
            buildUpon.appendQueryParameter(this.f11915h, id2);
        }
        final String uri = buildUpon.build().toString();
        final IHandlerExecutor supportIOExecutor = this.f11908a.getExecutorProvider().getSupportIOExecutor();
        final long currentTimeMillis = this.f11917k.currentTimeMillis();
        supportIOExecutor.execute(new Runnable() { // from class: cf.a
            @Override // java.lang.Runnable
            public final void run() {
                r.a(r.this, uri, str, supportIOExecutor, currentTimeMillis);
            }
        });
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j) {
        long j6 = rVar.j;
        if (rVar.f11918l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j, 0, j6);
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j, int i5, long j6) {
        int i10 = i5 + 1;
        if (rVar.f11918l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j, i10, j6);
    }

    public final void a(final String str, final String str2, final IHandlerExecutor iHandlerExecutor, final long j, final int i5, long j6) {
        final long j10 = j6 * 2;
        if ((this.f11917k.currentTimeMillis() - j) + j10 <= this.f11916i) {
            iHandlerExecutor.executeDelayed(new Runnable() { // from class: cf.b
                @Override // java.lang.Runnable
                public final void run() {
                    r.a(r.this, str, str2, iHandlerExecutor, j, i5, j10);
                }
            }, j6);
        }
    }
}
