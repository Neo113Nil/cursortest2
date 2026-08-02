package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dq70;
import xsna.exc0;
import xsna.i5s;
import xsna.k46;
import xsna.myz0;
import xsna.ozg0;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;

    @NonNull
    public final PublicKeyCredentialType b;

    @NonNull
    public final zzgx c;

    @Nullable
    public final List d;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
    }

    static {
        zzcf.zzm(com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);
        CREATOR = new myz0();
    }

    public PublicKeyCredentialDescriptor(String str, zzgx zzgxVar, @Nullable List<Transport> list) {
        exc0.i(str);
        try {
            this.b = PublicKeyCredentialType.a(str);
            exc0.i(zzgxVar);
            this.c = zzgxVar;
            this.d = list;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static PublicKeyCredentialDescriptor b(@NonNull JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        String string = jSONObject.getString("type");
        byte[] decode = Base64.decode(jSONObject.getString("id"), 11);
        ArrayList arrayList = null;
        if (jSONObject.has("transports") && (jSONArray = jSONObject.getJSONArray("transports")) != null) {
            HashSet hashSet = new HashSet(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                String string2 = jSONArray.getString(i);
                if (string2 != null && !string2.isEmpty()) {
                    try {
                        hashSet.add(Transport.a(string2));
                    } catch (Transport.UnsupportedTransportException unused) {
                        "Ignoring unrecognized transport ".concat(string2);
                    }
                }
            }
            arrayList = new ArrayList(hashSet);
        }
        return new PublicKeyCredentialDescriptor(string, decode, arrayList);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        PublicKeyCredentialType publicKeyCredentialType = publicKeyCredentialDescriptor.b;
        List list = publicKeyCredentialDescriptor.d;
        if (!this.b.equals(publicKeyCredentialType) || !dq70.b(this.c, publicKeyCredentialDescriptor.c)) {
            return false;
        }
        List list2 = this.d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String c = k46.c(this.c.zzm());
        return i5s.a(xe9.a("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c, ", \n transports="), String.valueOf(this.d), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b.toString(), false);
        ozg0.e(parcel, 3, this.c.zzm(), false);
        ozg0.u(parcel, 4, this.d, false);
        ozg0.x(w, parcel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredentialDescriptor(@NonNull String str, @NonNull byte[] bArr, @Nullable List<Transport> list) {
        this(str, zzgx.zzl(bArr, 0, bArr.length), list);
        zzgx zzgxVar = zzgx.zzb;
    }
}
