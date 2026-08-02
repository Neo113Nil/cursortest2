package com.google.android.gms.fido.u2f.api.common;

import S9.e;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public class RegisteredKey extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final KeyHandle f33014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33015b;

    /* renamed from: c, reason: collision with root package name */
    public String f33016c;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        this.f33014a = (KeyHandle) AbstractC3191o.m(keyHandle);
        this.f33016c = str;
        this.f33015b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.f33016c;
        if (str == null) {
            if (registeredKey.f33016c != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.f33016c)) {
            return false;
        }
        if (!this.f33014a.equals(registeredKey.f33014a)) {
            return false;
        }
        String str2 = this.f33015b;
        if (str2 == null) {
            if (registeredKey.f33015b != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.f33015b)) {
            return false;
        }
        return true;
    }

    public String g() {
        return this.f33015b;
    }

    public String h() {
        return this.f33016c;
    }

    public int hashCode() {
        String str = this.f33016c;
        int hashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f33014a.hashCode();
        String str2 = this.f33015b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public KeyHandle i() {
        return this.f33014a;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f33014a.g(), 11));
            if (this.f33014a.h() != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", this.f33014a.h().toString());
            }
            if (this.f33014a.i() != null) {
                jSONObject.put("transports", this.f33014a.i().toString());
            }
            String str = this.f33016c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f33015b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, i(), i10, false);
        E9.b.F(parcel, 3, h(), false);
        E9.b.F(parcel, 4, g(), false);
        E9.b.b(parcel, a10);
    }
}
