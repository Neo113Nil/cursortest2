package com.google.android.gms.fido.fido2.api.common;

import R9.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.internal.fido.zzbc;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialType f32936a;

    /* renamed from: b, reason: collision with root package name */
    public final List f32937b;

    @NonNull
    private final byte[] zzc;

    /* renamed from: c, reason: collision with root package name */
    public static final zzbc f32935c = zzbc.zzk(com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new k();

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        AbstractC3191o.m(str);
        try {
            this.f32936a = PublicKeyCredentialType.a(str);
            this.zzc = (byte[]) AbstractC3191o.m(bArr);
            this.f32937b = list;
        } catch (PublicKeyCredentialType.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.f32936a.equals(publicKeyCredentialDescriptor.f32936a) || !Arrays.equals(this.zzc, publicKeyCredentialDescriptor.zzc)) {
            return false;
        }
        List list2 = this.f32937b;
        if (list2 == null && publicKeyCredentialDescriptor.f32937b == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.f32937b) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.f32937b.containsAll(this.f32937b);
    }

    public byte[] g() {
        return this.zzc;
    }

    public List h() {
        return this.f32937b;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32936a, Integer.valueOf(Arrays.hashCode(this.zzc)), this.f32937b);
    }

    public String i() {
        return this.f32936a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, i(), false);
        E9.b.l(parcel, 3, g(), false);
        E9.b.J(parcel, 4, h(), false);
        E9.b.b(parcel, a10);
    }
}
