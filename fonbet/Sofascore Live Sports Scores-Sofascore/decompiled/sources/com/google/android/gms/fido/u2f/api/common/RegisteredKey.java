package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.is8;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* loaded from: classes3.dex */
public class RegisteredKey extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new zzj();
    public final KeyHandle a;
    public final String b;
    public final String c;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        Preconditions.i(keyHandle);
        this.a = keyHandle;
        this.c = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = registeredKey.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.a.equals(registeredKey.a)) {
            return false;
        }
        String str3 = registeredKey.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = this.a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        KeyHandle keyHandle = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.b, 11));
            ProtocolVersion protocolVersion = keyHandle.c;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.a);
            }
            List list = keyHandle.d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            is8.h(e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.m(parcel, 4, this.b, false);
        SafeParcelWriter.t(parcel, s);
    }
}
