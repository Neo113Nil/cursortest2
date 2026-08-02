package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.d801;
import xsna.i5s;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes12.dex */
public class KeyHandle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<KeyHandle> CREATOR = new d801();
    public final int b;
    public final byte[] c;
    public final ProtocolVersion d;

    @Nullable
    public final List e;

    public KeyHandle(int i, String str, @Nullable ArrayList arrayList, byte[] bArr) {
        this.b = i;
        this.c = bArr;
        try {
            this.d = ProtocolVersion.a(str);
            this.e = arrayList;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        byte[] bArr = keyHandle.c;
        List list = keyHandle.e;
        if (!Arrays.equals(this.c, bArr) || !this.d.equals(keyHandle.d)) {
            return false;
        }
        List list2 = this.e;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e});
    }

    @NonNull
    public final String toString() {
        List list = this.e;
        String obj = list == null ? "null" : list.toString();
        byte[] bArr = this.c;
        String encodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
        StringBuilder sb = new StringBuilder("{keyHandle: ");
        sb.append(encodeToString);
        sb.append(", version: ");
        sb.append(this.d);
        sb.append(", transports: ");
        return i5s.a(sb, obj, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.e(parcel, 2, this.c, false);
        ozg0.q(parcel, 3, this.d.toString(), false);
        ozg0.u(parcel, 4, this.e, false);
        ozg0.x(w, parcel);
    }
}
