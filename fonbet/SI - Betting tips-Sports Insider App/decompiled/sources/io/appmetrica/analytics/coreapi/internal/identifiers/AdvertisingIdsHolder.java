package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f11615a;

    /* renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f11616b;

    /* renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f11617c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.f11615a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.f11616b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.f11617c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f11615a + ", mHuawei=" + this.f11616b + ", yandex=" + this.f11617c + '}';
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.f11615a = adTrackingInfoResult;
        this.f11616b = adTrackingInfoResult2;
        this.f11617c = adTrackingInfoResult3;
    }
}
