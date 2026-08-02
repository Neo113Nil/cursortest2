package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.o0a;
import xsna.ozg0;
import xsna.qtz0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class AdBreakClipInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdBreakClipInfo> CREATOR = new qtz0();
    public final String b;

    @Nullable
    public final String c;
    public final long d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @Nullable
    public final String i;

    @Nullable
    public final String j;
    public final long k;

    @Nullable
    public final String l;

    @Nullable
    public final VastAdsRequest m;
    public final JSONObject n;

    public AdBreakClipInfo(String str, @Nullable String str2, long j, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, long j2, @Nullable String str9, @Nullable VastAdsRequest vastAdsRequest) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = j2;
        this.l = str9;
        this.m = vastAdsRequest;
        if (TextUtils.isEmpty(str6)) {
            this.n = new JSONObject();
            return;
        }
        try {
            this.n = new JSONObject(str6);
        } catch (JSONException e) {
            Locale locale = Locale.ROOT;
            new StringBuilder("Error creating AdBreakClipInfo: ").append(e.getMessage());
            this.h = null;
            this.n = new JSONObject();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        return o0a.c(this.b, adBreakClipInfo.b) && o0a.c(this.c, adBreakClipInfo.c) && this.d == adBreakClipInfo.d && o0a.c(this.e, adBreakClipInfo.e) && o0a.c(this.f, adBreakClipInfo.f) && o0a.c(this.g, adBreakClipInfo.g) && o0a.c(this.h, adBreakClipInfo.h) && o0a.c(this.i, adBreakClipInfo.i) && o0a.c(this.j, adBreakClipInfo.j) && this.k == adBreakClipInfo.k && o0a.c(this.l, adBreakClipInfo.l) && o0a.c(this.m, adBreakClipInfo.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, this.j, Long.valueOf(this.k), this.l, this.m});
    }

    @NonNull
    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b);
            long j = this.d;
            Pattern pattern = o0a.a;
            jSONObject.put("duration", j / 1000.0d);
            long j2 = this.k;
            if (j2 != -1) {
                jSONObject.put("whenSkippable", j2 / 1000.0d);
            }
            String str = this.i;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.c;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.e;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.g;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.n;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.j;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.l;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            VastAdsRequest vastAdsRequest = this.m;
            if (vastAdsRequest != null) {
                jSONObject.put("vastAdsRequest", vastAdsRequest.i());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.d);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.q(parcel, 7, this.g, false);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.q(parcel, 9, this.i, false);
        ozg0.q(parcel, 10, this.j, false);
        ozg0.v(parcel, 11, 8);
        parcel.writeLong(this.k);
        ozg0.q(parcel, 12, this.l, false);
        ozg0.p(parcel, 13, this.m, i, false);
        ozg0.x(w, parcel);
    }
}
