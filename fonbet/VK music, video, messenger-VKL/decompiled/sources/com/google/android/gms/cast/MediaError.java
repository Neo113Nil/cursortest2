package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;
import xsna.g401;
import xsna.o0a;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class MediaError extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaError> CREATOR = new g401();

    @Nullable
    public final String b;
    public final long c;

    @Nullable
    public final Integer d;

    @Nullable
    public final String e;

    @Nullable
    public String f;

    @Nullable
    public final JSONObject g;

    public MediaError(@Nullable String str, long j, @Nullable Integer num, @Nullable String str2, @Nullable JSONObject jSONObject) {
        this.b = str;
        this.c = j;
        this.d = num;
        this.e = str2;
        this.g = jSONObject;
    }

    @NonNull
    public static MediaError b(@NonNull JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, o0a.a(jSONObject, "reason"), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.g;
        this.f = jSONObject == null ? null : jSONObject.toString();
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.c);
        ozg0.k(parcel, 4, this.d);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.x(w, parcel);
    }
}
