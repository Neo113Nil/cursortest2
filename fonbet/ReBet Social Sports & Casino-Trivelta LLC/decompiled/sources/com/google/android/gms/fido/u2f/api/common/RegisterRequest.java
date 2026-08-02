package com.google.android.gms.fido.u2f.api.common;

import S9.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public class RegisterRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f33003a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtocolVersion f33004b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33005c;
    private final byte[] zzc;

    public RegisterRequest(int i10, String str, byte[] bArr, String str2) {
        this.f33003a = i10;
        try {
            this.f33004b = ProtocolVersion.a(str);
            this.zzc = bArr;
            this.f33005c = str2;
        } catch (ProtocolVersion.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.zzc, registerRequest.zzc) || this.f33004b != registerRequest.f33004b) {
            return false;
        }
        String str = this.f33005c;
        if (str == null) {
            if (registerRequest.f33005c != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.f33005c)) {
            return false;
        }
        return true;
    }

    public String g() {
        return this.f33005c;
    }

    public byte[] h() {
        return this.zzc;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.zzc) + 31) * 31) + this.f33004b.hashCode();
        String str = this.f33005c;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public int i() {
        return this.f33003a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i());
        E9.b.F(parcel, 2, this.f33004b.toString(), false);
        E9.b.l(parcel, 3, h(), false);
        E9.b.F(parcel, 4, g(), false);
        E9.b.b(parcel, a10);
    }
}
