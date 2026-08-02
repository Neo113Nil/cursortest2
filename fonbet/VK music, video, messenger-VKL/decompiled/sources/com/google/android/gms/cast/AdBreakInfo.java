package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.f201;
import xsna.o0a;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class AdBreakInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdBreakInfo> CREATOR = new f201();
    public final long b;
    public final String c;
    public final long d;
    public final boolean e;
    public final String[] f;
    public final boolean g;
    public final boolean h;

    public AdBreakInfo(long j, @NonNull String str, long j2, boolean z, @NonNull String[] strArr, boolean z2, boolean z3) {
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = z;
        this.f = strArr;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        return o0a.c(this.c, adBreakInfo.c) && this.b == adBreakInfo.b && this.d == adBreakInfo.d && this.e == adBreakInfo.e && Arrays.equals(this.f, adBreakInfo.f) && this.g == adBreakInfo.g && this.h == adBreakInfo.h;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @NonNull
    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.c);
            long j = this.b;
            Pattern pattern = o0a.a;
            jSONObject.put(X3.i.L, j / 1000.0d);
            jSONObject.put("isWatched", this.e);
            jSONObject.put("isEmbedded", this.g);
            jSONObject.put("duration", this.d / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f;
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

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.b);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.d);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.r(parcel, 6, this.f, false);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
