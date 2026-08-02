package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class SessionState extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SessionState> CREATOR = new zzde();
    public final MediaLoadRequestData a;
    public String b;
    public final JSONObject c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
    }

    public SessionState(MediaLoadRequestData mediaLoadRequestData, JSONObject jSONObject) {
        this.a = mediaLoadRequestData;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (JsonUtils.a(this.c, sessionState.c)) {
            return Objects.a(this.a, sessionState.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, String.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.c;
        this.b = jSONObject == null ? null : jSONObject.toString();
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.t(parcel, s);
    }
}
