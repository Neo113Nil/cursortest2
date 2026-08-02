package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import y6.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class RegisteredKey extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new n(16);

    /* renamed from: a, reason: collision with root package name */
    public final KeyHandle f4817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4818b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4819c;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        v.h(keyHandle);
        this.f4817a = keyHandle;
        this.f4819c = str;
        this.f4818b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = registeredKey.f4818b;
        String str2 = registeredKey.f4819c;
        String str3 = this.f4819c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        if (!this.f4817a.equals(registeredKey.f4817a)) {
            return false;
        }
        String str4 = this.f4818b;
        if (str4 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str4.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f4819c;
        int hashCode = this.f4817a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f4818b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        KeyHandle keyHandle = this.f4817a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.f4797b, 11));
            ProtocolVersion protocolVersion = keyHandle.f4798c;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.f4802a);
            }
            List list = keyHandle.f4799d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.f4819c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f4818b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.N(parcel, 2, this.f4817a, i5, false);
        b.O(parcel, 3, this.f4819c, false);
        b.O(parcel, 4, this.f4818b, false);
        b.W(parcel, V);
    }
}
