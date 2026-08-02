package ru.ozon.android.messenger.framework.presentation.models;

import C.o0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f91432a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f91433b;

    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new d(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i11) {
            return new d[i11];
        }
    }

    public d() {
        this(0, "");
    }

    public final int a() {
        return this.f91432a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f91432a == dVar.f91432a && Intrinsics.d(this.f91433b, dVar.f91433b);
    }

    @NotNull
    public final String getName() {
        return this.f91433b;
    }

    public final int hashCode() {
        return this.f91433b.hashCode() + (Integer.hashCode(this.f91432a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlockInfo(index=");
        sb2.append(this.f91432a);
        sb2.append(", name=");
        return o0.c(sb2, this.f91433b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f91432a);
        dest.writeString(this.f91433b);
    }

    public d(int i11, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f91432a = i11;
        this.f91433b = name;
    }
}
