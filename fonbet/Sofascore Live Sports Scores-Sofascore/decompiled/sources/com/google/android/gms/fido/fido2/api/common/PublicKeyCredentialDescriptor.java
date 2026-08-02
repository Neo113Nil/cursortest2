package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.ilg;
import defpackage.mz1;
import defpackage.xgo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final PublicKeyCredentialType a;
    public final xgo b;
    public final List c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
    }

    static {
        zzcf.p(2, com.google.android.gms.internal.fido.zzh.a, com.google.android.gms.internal.fido.zzh.b);
        CREATOR = new zzap();
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
        xgo xgoVar = zzgx.b;
        xgo r = zzgx.r(bArr.length, bArr);
        Preconditions.i(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            this.b = r;
            this.c = arrayList;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            ilg.k(e);
            throw null;
        }
    }

    public static PublicKeyCredentialDescriptor Y0(JSONObject jSONObject) {
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

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        List list = publicKeyCredentialDescriptor.c;
        if (!this.a.equals(publicKeyCredentialDescriptor.a) || !Objects.a(this.b, publicKeyCredentialDescriptor.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String b = Base64Utils.b(this.b.s());
        return mz1.o(mz1.s("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", b, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        this.a.getClass();
        SafeParcelWriter.m(parcel, 2, "public-key", false);
        SafeParcelWriter.c(parcel, 3, this.b.s(), false);
        SafeParcelWriter.q(parcel, 4, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
