package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.o0a;
import xsna.o701;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class VastAdsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<VastAdsRequest> CREATOR = new o701();

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    public VastAdsRequest(@Nullable String str, @Nullable String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastAdsRequest)) {
            return false;
        }
        VastAdsRequest vastAdsRequest = (VastAdsRequest) obj;
        return o0a.c(this.b, vastAdsRequest.b) && o0a.c(this.c, vastAdsRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @NonNull
    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.b;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.c;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
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
        ozg0.x(w, parcel);
    }
}
