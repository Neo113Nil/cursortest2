package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class AdBreakInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdBreakInfo> CREATOR = new zzb();
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
    }

    public AdBreakInfo(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
        this.g = z3;
    }

    public final JSONObject Y0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b);
            long j = this.a;
            Pattern pattern = CastUtils.a;
            jSONObject.put("position", j / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.c / 1000.0d);
            jSONObject.put("expanded", this.g);
            String[] strArr = this.e;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        return CastUtils.c(this.b, adBreakInfo.b) && this.a == adBreakInfo.a && this.c == adBreakInfo.c && this.d == adBreakInfo.d && Arrays.equals(this.e, adBreakInfo.e) && this.f == adBreakInfo.f && this.g == adBreakInfo.g;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.r(parcel, 4, 8);
        parcel.writeLong(this.c);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.n(parcel, 6, this.e);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
