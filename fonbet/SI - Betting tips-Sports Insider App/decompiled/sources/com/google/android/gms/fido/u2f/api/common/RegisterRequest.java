package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import y6.n;
import z6.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class RegisterRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new n(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f4803a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtocolVersion f4804b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4805c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4806d;

    public RegisterRequest(String str, String str2, byte[] bArr, int i5) {
        this.f4803a = i5;
        try {
            this.f4804b = ProtocolVersion.a(str);
            this.f4805c = bArr;
            this.f4806d = str2;
        } catch (b e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        String str = registerRequest.f4806d;
        if (!Arrays.equals(this.f4805c, registerRequest.f4805c) || this.f4804b != registerRequest.f4804b) {
            return false;
        }
        String str2 = this.f4806d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f4804b.hashCode() + ((Arrays.hashCode(this.f4805c) + 31) * 31);
        String str = this.f4806d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4803a);
        h8.b.O(parcel, 2, this.f4804b.f4802a, false);
        h8.b.G(parcel, 3, this.f4805c, false);
        h8.b.O(parcel, 4, this.f4806d, false);
        h8.b.W(parcel, V);
    }
}
