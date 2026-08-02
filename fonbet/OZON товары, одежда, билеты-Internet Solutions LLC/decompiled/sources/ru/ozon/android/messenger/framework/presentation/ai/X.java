package ru.ozon.android.messenger.framework.presentation.ai;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class X implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<X> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f89402a;

    /* renamed from: b, reason: collision with root package name */
    private final int f89403b;

    public static final class a implements Parcelable.Creator<X> {
        @Override // android.os.Parcelable.Creator
        public final X createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new X(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final X[] newArray(int i11) {
            return new X[i11];
        }
    }

    public X(int i11, int i12) {
        this.f89402a = i11;
        this.f89403b = i12;
    }

    public final int a() {
        return this.f89402a;
    }

    public final int b() {
        return this.f89403b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x11 = (X) obj;
        return this.f89402a == x11.f89402a && this.f89403b == x11.f89403b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89403b) + (Integer.hashCode(this.f89402a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AiAssistantScrollParams(index=");
        sb2.append(this.f89402a);
        sb2.append(", offset=");
        return K00.b.e(this.f89403b, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f89402a);
        dest.writeInt(this.f89403b);
    }
}
