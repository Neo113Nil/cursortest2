package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.d301;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new d301();
    public final int b;
    public final short c;
    public final short d;

    public UvmEntry(int i, short s, short s2) {
        this.b = i;
        this.c = s;
        this.d = s2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.b == uvmEntry.b && this.c == uvmEntry.c && this.d == uvmEntry.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Short.valueOf(this.c), Short.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.x(w, parcel);
    }
}
