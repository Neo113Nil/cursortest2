package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzcct extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcct> CREATOR = new zzccu();
    public final String a;
    public final int b;

    public zzcct(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static zzcct Y0(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcct(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcct)) {
            return false;
        }
        zzcct zzcctVar = (zzcct) obj;
        return Objects.a(this.a, zzcctVar.a) && Objects.a(Integer.valueOf(this.b), Integer.valueOf(zzcctVar.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.t(parcel, s);
    }
}
