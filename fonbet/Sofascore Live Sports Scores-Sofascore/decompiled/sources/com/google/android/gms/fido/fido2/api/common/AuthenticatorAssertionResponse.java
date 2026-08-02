package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.qbo;
import defpackage.vp2;
import defpackage.xgo;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzj();
    public final xgo a;
    public final xgo b;
    public final xgo c;
    public final xgo d;
    public final xgo e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        Preconditions.i(bArr);
        xgo r = zzgx.r(bArr.length, bArr);
        Preconditions.i(bArr2);
        xgo r2 = zzgx.r(bArr2.length, bArr2);
        Preconditions.i(bArr3);
        xgo r3 = zzgx.r(bArr3.length, bArr3);
        Preconditions.i(bArr4);
        xgo r4 = zzgx.r(bArr4.length, bArr4);
        xgo r5 = bArr5 == null ? null : zzgx.r(bArr5.length, bArr5);
        this.a = r;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public final JSONObject Y0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", Base64Utils.b(this.b.s()));
            jSONObject.put("authenticatorData", Base64Utils.b(this.c.s()));
            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, Base64Utils.b(this.d.s()));
            xgo xgoVar = this.e;
            if (xgoVar == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", Base64Utils.b(xgoVar == null ? null : xgoVar.s()));
            return jSONObject;
        } catch (JSONException e) {
            vp2.e("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Objects.a(this.a, authenticatorAssertionResponse.a) && Objects.a(this.b, authenticatorAssertionResponse.b) && Objects.a(this.c, authenticatorAssertionResponse.c) && Objects.a(this.d, authenticatorAssertionResponse.d) && Objects.a(this.e, authenticatorAssertionResponse.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        zzbi a = zzbj.a(this);
        qbo qboVar = zzgf.a;
        byte[] s = this.a.s();
        a.a(qboVar.c(s.length, s), "keyHandle");
        byte[] s2 = this.b.s();
        a.a(qboVar.c(s2.length, s2), "clientDataJSON");
        byte[] s3 = this.c.s();
        a.a(qboVar.c(s3.length, s3), "authenticatorData");
        byte[] s4 = this.d.s();
        a.a(qboVar.c(s4.length, s4), InAppPurchaseMetaData.KEY_SIGNATURE);
        xgo xgoVar = this.e;
        byte[] s5 = xgoVar == null ? null : xgoVar.s();
        if (s5 != null) {
            a.a(qboVar.c(s5.length, s5), "userHandle");
        }
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.a.s(), false);
        SafeParcelWriter.c(parcel, 3, this.b.s(), false);
        SafeParcelWriter.c(parcel, 4, this.c.s(), false);
        SafeParcelWriter.c(parcel, 5, this.d.s(), false);
        xgo xgoVar = this.e;
        SafeParcelWriter.c(parcel, 6, xgoVar == null ? null : xgoVar.s(), false);
        SafeParcelWriter.t(parcel, s);
    }
}
