package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class AdBreakClipInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdBreakClipInfo> CREATOR = new zza();
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final VastAdsRequest l;
    public final JSONObject m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
    }

    public AdBreakClipInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, VastAdsRequest vastAdsRequest) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j2;
        this.k = str9;
        this.l = vastAdsRequest;
        if (TextUtils.isEmpty(str6)) {
            this.m = new JSONObject();
            return;
        }
        try {
            this.m = new JSONObject(str6);
        } catch (JSONException e) {
            Locale locale = Locale.ROOT;
            new StringBuilder("Error creating AdBreakClipInfo: ").append(e.getMessage());
            this.g = null;
            this.m = new JSONObject();
        }
    }

    public final JSONObject Y0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            long j = this.c;
            Pattern pattern = CastUtils.a;
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, j / 1000.0d);
            long j2 = this.j;
            if (j2 != -1) {
                jSONObject.put("whenSkippable", j2 / 1000.0d);
            }
            String str = this.h;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.m;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.i;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.k;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            VastAdsRequest vastAdsRequest = this.l;
            if (vastAdsRequest != null) {
                jSONObject.put("vastAdsRequest", vastAdsRequest.Y0());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        return CastUtils.c(this.a, adBreakClipInfo.a) && CastUtils.c(this.b, adBreakClipInfo.b) && this.c == adBreakClipInfo.c && CastUtils.c(this.d, adBreakClipInfo.d) && CastUtils.c(this.e, adBreakClipInfo.e) && CastUtils.c(this.f, adBreakClipInfo.f) && CastUtils.c(this.g, adBreakClipInfo.g) && CastUtils.c(this.h, adBreakClipInfo.h) && CastUtils.c(this.i, adBreakClipInfo.i) && this.j == adBreakClipInfo.j && CastUtils.c(this.k, adBreakClipInfo.k) && CastUtils.c(this.l, adBreakClipInfo.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.r(parcel, 4, 8);
        parcel.writeLong(this.c);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.m(parcel, 6, this.e, false);
        SafeParcelWriter.m(parcel, 7, this.f, false);
        SafeParcelWriter.m(parcel, 8, this.g, false);
        SafeParcelWriter.m(parcel, 9, this.h, false);
        SafeParcelWriter.m(parcel, 10, this.i, false);
        SafeParcelWriter.r(parcel, 11, 8);
        parcel.writeLong(this.j);
        SafeParcelWriter.m(parcel, 12, this.k, false);
        SafeParcelWriter.l(parcel, 13, this.l, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
