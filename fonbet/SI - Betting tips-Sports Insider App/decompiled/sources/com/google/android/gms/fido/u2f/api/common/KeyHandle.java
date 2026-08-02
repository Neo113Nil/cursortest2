package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y6.n;
import z6.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class KeyHandle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<KeyHandle> CREATOR = new n(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f4796a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4797b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtocolVersion f4798c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4799d;

    public KeyHandle(int i5, byte[] bArr, String str, ArrayList arrayList) {
        this.f4796a = i5;
        this.f4797b = bArr;
        try {
            this.f4798c = ProtocolVersion.a(str);
            this.f4799d = arrayList;
        } catch (b e7) {
            throw new IllegalArgumentException(e7);
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
        List list = keyHandle.f4799d;
        if (!Arrays.equals(this.f4797b, keyHandle.f4797b) || !this.f4798c.equals(keyHandle.f4798c)) {
            return false;
        }
        List list2 = this.f4799d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f4797b)), this.f4798c, this.f4799d});
    }

    public final String toString() {
        List list = this.f4799d;
        String obj = list == null ? "null" : list.toString();
        byte[] bArr = this.f4797b;
        String encodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
        StringBuilder sb2 = new StringBuilder("{keyHandle: ");
        sb2.append(encodeToString);
        sb2.append(", version: ");
        sb2.append(this.f4798c);
        sb2.append(", transports: ");
        return e.l(sb2, obj, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4796a);
        h8.b.G(parcel, 2, this.f4797b, false);
        h8.b.O(parcel, 3, this.f4798c.f4802a, false);
        h8.b.R(parcel, 4, this.f4799d, false);
        h8.b.W(parcel, V);
    }
}
