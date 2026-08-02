package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.v0;
import g6.v;
import java.util.Arrays;
import k7.j0;
import k7.l0;
import y6.n;
import z6.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class RegisterResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new n(15);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4814a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtocolVersion f4815b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4816c;

    public RegisterResponseData(String str, String str2, byte[] bArr) {
        this.f4814a = bArr;
        try {
            this.f4815b = ProtocolVersion.a(str);
            this.f4816c = str2;
        } catch (b e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return v.k(this.f4815b, registerResponseData.f4815b) && Arrays.equals(this.f4814a, registerResponseData.f4814a) && v.k(this.f4816c, registerResponseData.f4816c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4815b, Integer.valueOf(Arrays.hashCode(this.f4814a)), this.f4816c});
    }

    public final String toString() {
        v0 c2 = k7.a.c(this);
        c2.a0(this.f4815b, "protocolVersion");
        j0 j0Var = l0.f18889d;
        byte[] bArr = this.f4814a;
        c2.a0(j0Var.c(bArr.length, bArr), "registerData");
        String str = this.f4816c;
        if (str != null) {
            c2.a0(str, "clientDataString");
        }
        return c2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.G(parcel, 2, this.f4814a, false);
        h8.b.O(parcel, 3, this.f4815b.f4802a, false);
        h8.b.O(parcel, 4, this.f4816c, false);
        h8.b.W(parcel, V);
    }
}
