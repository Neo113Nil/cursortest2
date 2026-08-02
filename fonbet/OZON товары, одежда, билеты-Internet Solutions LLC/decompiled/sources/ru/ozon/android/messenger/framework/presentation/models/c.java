package ru.ozon.android.messenger.framework.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f91430a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91431b;

    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new c(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(@NotNull String itemId, int i11) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f91430a = itemId;
        this.f91431b = i11;
    }

    @NotNull
    public final String a() {
        return this.f91430a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f91430a, cVar.f91430a) && this.f91431b == cVar.f91431b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91431b) + (this.f91430a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return this.f91430a + this.f91431b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91430a);
        dest.writeInt(this.f91431b);
    }
}
