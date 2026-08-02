package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import defpackage.ilg;
import defpackage.qbo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* loaded from: classes3.dex */
public class RegisterResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new zzi();
    public final byte[] a;
    public final ProtocolVersion b;
    public final String c;

    public RegisterResponseData(String str, String str2, byte[] bArr) {
        this.a = bArr;
        try {
            this.b = ProtocolVersion.a(str);
            this.c = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            ilg.k(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return Objects.a(this.b, registerResponseData.b) && Arrays.equals(this.a, registerResponseData.a) && Objects.a(this.c, registerResponseData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(Arrays.hashCode(this.a)), this.c});
    }

    public final String toString() {
        zzbi a = zzbj.a(this);
        a.a(this.b, "protocolVersion");
        qbo qboVar = zzgf.a;
        byte[] bArr = this.a;
        a.a(qboVar.c(bArr.length, bArr), "registerData");
        String str = this.c;
        if (str != null) {
            a.a(str, "clientDataString");
        }
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b.a, false);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
