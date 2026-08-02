package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.exc0;
import xsna.jh01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes12.dex */
public class RegisteredKey extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new jh01();
    public final KeyHandle b;
    public final String c;
    public final String d;

    public RegisteredKey(@NonNull KeyHandle keyHandle, @NonNull String str, @NonNull String str2) {
        exc0.i(keyHandle);
        this.b = keyHandle;
        this.d = str;
        this.c = str2;
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.d;
        if (str == null) {
            if (registeredKey.d != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.d)) {
            return false;
        }
        KeyHandle keyHandle = registeredKey.b;
        String str2 = registeredKey.c;
        if (!this.b.equals(keyHandle)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.d;
        int hashCode = this.b.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.c;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @NonNull
    public final String toString() {
        KeyHandle keyHandle = this.b;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.c, 11));
            ProtocolVersion protocolVersion = keyHandle.d;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.toString());
            }
            List list = keyHandle.e;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.d;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.c;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.c, false);
        ozg0.x(w, parcel);
    }
}
