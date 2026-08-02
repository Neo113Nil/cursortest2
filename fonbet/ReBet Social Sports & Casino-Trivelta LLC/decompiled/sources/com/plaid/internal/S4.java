package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* loaded from: classes3.dex */
public final class S4 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<S4> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f39623a;

    public static final class a implements Parcelable.Creator<S4> {
        @Override // android.os.Parcelable.Creator
        public final S4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new S4(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final S4[] newArray(int i10) {
            return new S4[i10];
        }
    }

    public S4() {
        this.f39623a = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S4) && this.f39623a == ((S4) obj).f39623a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39623a);
    }

    @NotNull
    public final String toString() {
        return "PlaidClientSideOnlyConfiguration(noLoadingUi=" + this.f39623a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f39623a ? 1 : 0);
    }

    public S4(boolean z10) {
        this.f39623a = z10;
    }
}
