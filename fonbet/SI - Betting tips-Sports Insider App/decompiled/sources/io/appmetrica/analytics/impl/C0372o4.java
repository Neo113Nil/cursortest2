package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372o4 implements ArgumentsMerger {

    /* renamed from: a, reason: collision with root package name */
    public final String f14381a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f14382b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f14383c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f14384d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f14385e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f14386f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f14387g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f14388h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f14389i;
    public final Map<String, String> j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f14390k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f14391l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f14392m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f14393n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final Set<String> f14394o;

    public C0372o4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f14381a = str;
        this.f14382b = bool;
        this.f14383c = location;
        this.f14384d = bool2;
        this.f14385e = num;
        this.f14386f = num2;
        this.f14387g = num3;
        this.f14388h = bool3;
        this.f14389i = bool4;
        this.j = map;
        this.f14390k = num4;
        this.f14391l = bool5;
        this.f14392m = bool6;
        this.f14393n = bool7;
        this.f14394o = set;
    }

    public final boolean a(@NonNull C0372o4 c0372o4) {
        return equals(c0372o4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0372o4 mergeFrom(@NonNull C0372o4 c0372o4) {
        return new C0372o4((String) WrapUtils.getOrDefaultNullable(this.f14381a, c0372o4.f14381a), (Boolean) WrapUtils.getOrDefaultNullable(this.f14382b, c0372o4.f14382b), (Location) WrapUtils.getOrDefaultNullable(this.f14383c, c0372o4.f14383c), (Boolean) WrapUtils.getOrDefaultNullable(this.f14384d, c0372o4.f14384d), (Integer) WrapUtils.getOrDefaultNullable(this.f14385e, c0372o4.f14385e), (Integer) WrapUtils.getOrDefaultNullable(this.f14386f, c0372o4.f14386f), (Integer) WrapUtils.getOrDefaultNullable(this.f14387g, c0372o4.f14387g), (Boolean) WrapUtils.getOrDefaultNullable(this.f14388h, c0372o4.f14388h), (Boolean) WrapUtils.getOrDefaultNullable(this.f14389i, c0372o4.f14389i), (Map) WrapUtils.getOrDefaultNullable(this.j, c0372o4.j), (Integer) WrapUtils.getOrDefaultNullable(this.f14390k, c0372o4.f14390k), (Boolean) WrapUtils.getOrDefaultNullable(this.f14391l, c0372o4.f14391l), (Boolean) WrapUtils.getOrDefaultNullable(this.f14392m, c0372o4.f14392m), (Boolean) WrapUtils.getOrDefaultNullable(this.f14393n, c0372o4.f14393n), CollectionUtils.merge(this.f14394o, c0372o4.f14394o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((C0372o4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C0372o4.class == obj.getClass()) {
            C0372o4 c0372o4 = (C0372o4) obj;
            if (Objects.equals(this.f14381a, c0372o4.f14381a) && Objects.equals(this.f14382b, c0372o4.f14382b) && Objects.equals(this.f14383c, c0372o4.f14383c) && Objects.equals(this.f14384d, c0372o4.f14384d) && Objects.equals(this.f14385e, c0372o4.f14385e) && Objects.equals(this.f14386f, c0372o4.f14386f) && Objects.equals(this.f14387g, c0372o4.f14387g) && Objects.equals(this.f14388h, c0372o4.f14388h) && Objects.equals(this.f14389i, c0372o4.f14389i) && Objects.equals(this.j, c0372o4.j) && Objects.equals(this.f14390k, c0372o4.f14390k) && Objects.equals(this.f14391l, c0372o4.f14391l) && Objects.equals(this.f14392m, c0372o4.f14392m) && Objects.equals(this.f14393n, c0372o4.f14393n) && Objects.equals(this.f14394o, c0372o4.f14394o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14381a, this.f14382b, this.f14383c, this.f14384d, this.f14385e, this.f14386f, this.f14387g, this.f14388h, this.f14389i, this.j, this.f14390k, this.f14391l, this.f14392m, this.f14393n, this.f14394o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f14381a + "', locationTracking=" + this.f14382b + ", manualLocation=" + this.f14383c + ", firstActivationAsUpdate=" + this.f14384d + ", sessionTimeout=" + this.f14385e + ", maxReportsCount=" + this.f14386f + ", dispatchPeriod=" + this.f14387g + ", logEnabled=" + this.f14388h + ", dataSendingEnabled=" + this.f14389i + ", clidsFromClient=" + this.j + ", maxReportsInDbCount=" + this.f14390k + ", nativeCrashesEnabled=" + this.f14391l + ", revenueAutoTrackingEnabled=" + this.f14392m + ", advIdentifiersTrackingEnabled=" + this.f14393n + ", autoCollectedDataSubscribers=" + this.f14394o + '}';
    }

    public C0372o4(@NonNull CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C0372o4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
