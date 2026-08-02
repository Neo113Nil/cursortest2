package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.ilg;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes3.dex */
public class KeyHandle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<KeyHandle> CREATOR = new zze();
    public final int a;
    public final byte[] b;
    public final ProtocolVersion c;
    public final List d;

    public KeyHandle(int i, String str, ArrayList arrayList, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.d = arrayList;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            ilg.k(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        List list = keyHandle.d;
        if (!Arrays.equals(this.b, keyHandle.b) || !this.c.equals(keyHandle.c)) {
            return false;
        }
        List list2 = this.d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    public final String toString() {
        List list = this.d;
        String obj = list == null ? "null" : list.toString();
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
        StringBuilder sb = new StringBuilder("{keyHandle: ");
        sb.append(encodeToString);
        sb.append(", version: ");
        sb.append(this.c);
        sb.append(", transports: ");
        return mz1.o(sb, obj, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.c(parcel, 2, this.b, false);
        SafeParcelWriter.m(parcel, 3, this.c.a, false);
        SafeParcelWriter.q(parcel, 4, this.d, false);
        SafeParcelWriter.t(parcel, s);
    }
}
