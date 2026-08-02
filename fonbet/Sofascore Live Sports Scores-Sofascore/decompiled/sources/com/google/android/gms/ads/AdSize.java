package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.fc6;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;

    @NonNull
    public static final AdSize BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "320x50_mb");

    @NonNull
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");

    @NonNull
    public static final AdSize LARGE_BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 100, "320x100_as");

    @NonNull
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");

    @NonNull
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");

    @NonNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @NonNull
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");

    @NonNull
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");

    @NonNull
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");

    @NonNull
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            a70.p(me4.g(i, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i).length() + 26)));
            throw null;
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            a70.p(me4.g(i2, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i2).length() + 27)));
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @NonNull
    @Deprecated
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize zzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i, 50, 0);
        zzk.d = true;
        return zzk;
    }

    @NonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int zzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 0);
        if (zzr == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.g = zzr;
        adSize.f = true;
        return adSize;
    }

    @NonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.g = i2;
        adSize.f = true;
        if (i2 < 32) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i2);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            zzo.zzi(sb.toString());
        }
        return adSize;
    }

    @NonNull
    @Deprecated
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize zzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i, 50, 2);
        zzk.d = true;
        return zzk;
    }

    @NonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int zzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (zzr == -1) {
            return INVALID;
        }
        adSize.g = zzr;
        adSize.f = true;
        return adSize;
    }

    @NonNull
    public static AdSize getLargeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize zzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i, 0);
        zzl.e = true;
        return zzl;
    }

    @NonNull
    public static AdSize getLargeLandscapeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize zzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i, 2);
        zzl.e = true;
        return zzl;
    }

    @NonNull
    public static AdSize getLargePortraitAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize zzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i, 1);
        zzl.e = true;
        return zzl;
    }

    @NonNull
    @Deprecated
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize zzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i, 50, 1);
        zzk.d = true;
        return zzk;
    }

    @NonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int zzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (zzr == -1) {
            return INVALID;
        }
        adSize.g = zzr;
        adSize.f = true;
        return adSize;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.a == adSize.a && this.b == adSize.b && this.c.equals(adSize.c);
    }

    public int getHeight() {
        return this.b;
    }

    public int getHeightInPixels(@NonNull Context context) {
        int i = this.b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzr.zza(context.getResources().getDisplayMetrics());
        }
        zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
    }

    public int getWidth() {
        return this.a;
    }

    public int getWidthInPixels(@NonNull Context context) {
        int i = this.a;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            zzay.zza();
            return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzr> creator = zzr.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public boolean isAutoHeight() {
        return this.b == -2;
    }

    public boolean isFluid() {
        return this.a == -3 && this.b == -4;
    }

    public boolean isFullWidth() {
        return this.a == -1;
    }

    @NonNull
    public String toString() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdSize(int i, int i2) {
        this(i, i2, fc6.o(new StringBuilder(String.valueOf(r1).length() + String.valueOf(r0).length() + 1 + 3), r0, "x", r1, "_as"));
        String valueOf;
        if (i == -1) {
            valueOf = "FULL";
        } else {
            valueOf = String.valueOf(i);
        }
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
    }
}
