package ru.ozon.app.android.analytics.datalayer;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/analytics/datalayer/AnalyticsDevice;", "", "", "osVersion", "model", "resolution", "wirelessCarrier", "locale", "timeZone", "adId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOsVersion", "getModel", "setModel", "(Ljava/lang/String;)V", "getLocale", "setLocale", "getAdId", "setAdId", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AnalyticsDevice {
    private String adId;
    private String locale;
    private String model;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String resolution;

    @NotNull
    private final String timeZone;

    @NotNull
    private final String wirelessCarrier;

    public AnalyticsDevice(@NotNull String osVersion, String str, @NotNull String resolution, @NotNull String wirelessCarrier, String str2, @NotNull String timeZone, String str3) {
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(wirelessCarrier, "wirelessCarrier");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        this.osVersion = osVersion;
        this.model = str;
        this.resolution = resolution;
        this.wirelessCarrier = wirelessCarrier;
        this.locale = str2;
        this.timeZone = timeZone;
        this.adId = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsDevice)) {
            return false;
        }
        AnalyticsDevice analyticsDevice = (AnalyticsDevice) other;
        return Intrinsics.d(this.osVersion, analyticsDevice.osVersion) && Intrinsics.d(this.model, analyticsDevice.model) && Intrinsics.d(this.resolution, analyticsDevice.resolution) && Intrinsics.d(this.wirelessCarrier, analyticsDevice.wirelessCarrier) && Intrinsics.d(this.locale, analyticsDevice.locale) && Intrinsics.d(this.timeZone, analyticsDevice.timeZone) && Intrinsics.d(this.adId, analyticsDevice.adId);
    }

    public int hashCode() {
        int hashCode = this.osVersion.hashCode() * 31;
        String str = this.model;
        int a11 = g.a(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.resolution), 31, this.wirelessCarrier);
        String str2 = this.locale;
        int a12 = g.a((a11 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.timeZone);
        String str3 = this.adId;
        return a12 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAdId(String str) {
        this.adId = str;
    }

    @NotNull
    public String toString() {
        String str = this.osVersion;
        String str2 = this.model;
        String str3 = this.resolution;
        String str4 = this.wirelessCarrier;
        String str5 = this.locale;
        String str6 = this.timeZone;
        String str7 = this.adId;
        StringBuilder d11 = C3660k.d("AnalyticsDevice(osVersion=", str, ", model=", str2, ", resolution=");
        a.h(d11, str3, ", wirelessCarrier=", str4, ", locale=");
        a.h(d11, str5, ", timeZone=", str6, ", adId=");
        return o0.c(d11, str7, ")");
    }
}
