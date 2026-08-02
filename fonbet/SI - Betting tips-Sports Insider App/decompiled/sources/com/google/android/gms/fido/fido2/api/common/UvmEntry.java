package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import java.util.Arrays;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new l(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f4762a;

    /* renamed from: b, reason: collision with root package name */
    public final short f4763b;

    /* renamed from: c, reason: collision with root package name */
    public final short f4764c;

    public UvmEntry(short s8, short s10, int i5) {
        this.f4762a = i5;
        this.f4763b = s8;
        this.f4764c = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f4762a == uvmEntry.f4762a && this.f4763b == uvmEntry.f4763b && this.f4764c == uvmEntry.f4764c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4762a), Short.valueOf(this.f4763b), Short.valueOf(this.f4764c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4762a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4763b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4764c);
        b.W(parcel, V);
    }
}
