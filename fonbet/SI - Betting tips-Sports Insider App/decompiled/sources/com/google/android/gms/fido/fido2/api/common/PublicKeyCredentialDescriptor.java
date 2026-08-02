package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import g6.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.o;
import k7.r0;
import q6.b;
import r4.k;
import y6.h;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialType f4729a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f4730b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4731c;

    static {
        o.f(2, k7.a.f18844c, k7.a.f18845d);
        CREATOR = new l(1);
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
        r0 r0Var = r0.f18913c;
        r0 h10 = r0.h(bArr.length, bArr);
        v.h(str);
        try {
            this.f4729a = PublicKeyCredentialType.a(str);
            this.f4730b = h10;
            this.f4731c = arrayList;
        } catch (h e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        List list = publicKeyCredentialDescriptor.f4731c;
        if (!this.f4729a.equals(publicKeyCredentialDescriptor.f4729a) || !v.k(this.f4730b, publicKeyCredentialDescriptor.f4730b)) {
            return false;
        }
        List list2 = this.f4731c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4729a, this.f4730b, this.f4731c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4729a);
        String c2 = b.c(this.f4730b.i());
        return e.l(k.q("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c2, ", \n transports="), String.valueOf(this.f4731c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        this.f4729a.getClass();
        h8.b.O(parcel, 2, "public-key", false);
        h8.b.G(parcel, 3, this.f4730b.i(), false);
        h8.b.R(parcel, 4, this.f4731c, false);
        h8.b.W(parcel, V);
    }
}
