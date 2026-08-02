package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;
import xsna.dq70;
import xsna.m701;
import xsna.nby;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class SessionState extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SessionState> CREATOR = new m701();

    @Nullable
    public final MediaLoadRequestData b;

    @Nullable
    public String c;

    @Nullable
    public final JSONObject d;

    public SessionState(@Nullable MediaLoadRequestData mediaLoadRequestData, @Nullable JSONObject jSONObject) {
        this.b = mediaLoadRequestData;
        this.d = jSONObject;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (nby.a(this.d, sessionState.d)) {
            return dq70.b(this.b, sessionState.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, String.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.d;
        this.c = jSONObject == null ? null : jSONObject.toString();
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.x(w, parcel);
    }
}
