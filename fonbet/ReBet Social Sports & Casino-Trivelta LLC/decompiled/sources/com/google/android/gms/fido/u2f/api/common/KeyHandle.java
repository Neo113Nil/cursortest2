package com.google.android.gms.fido.u2f.api.common;

import K9.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class KeyHandle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<KeyHandle> CREATOR = new S9.b();

    /* renamed from: a, reason: collision with root package name */
    public final int f32996a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtocolVersion f32997b;

    /* renamed from: c, reason: collision with root package name */
    public final List f32998c;
    private final byte[] zzb;

    public KeyHandle(int i10, byte[] bArr, String str, List list) {
        this.f32996a = i10;
        this.zzb = bArr;
        try {
            this.f32997b = ProtocolVersion.a(str);
            this.f32998c = list;
        } catch (ProtocolVersion.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.zzb, keyHandle.zzb) || !this.f32997b.equals(keyHandle.f32997b)) {
            return false;
        }
        List list2 = this.f32998c;
        if (list2 == null && keyHandle.f32998c == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.f32998c) != null && list2.containsAll(list) && keyHandle.f32998c.containsAll(this.f32998c);
    }

    public byte[] g() {
        return this.zzb;
    }

    public ProtocolVersion h() {
        return this.f32997b;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(Arrays.hashCode(this.zzb)), this.f32997b, this.f32998c);
    }

    public List i() {
        return this.f32998c;
    }

    public int j() {
        return this.f32996a;
    }

    public String toString() {
        List list = this.f32998c;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", c.c(this.zzb), this.f32997b, list == null ? "null" : list.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, j());
        E9.b.l(parcel, 2, g(), false);
        E9.b.F(parcel, 3, this.f32997b.toString(), false);
        E9.b.J(parcel, 4, i(), false);
        E9.b.b(parcel, a10);
    }
}
