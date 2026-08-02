package ru.ozon.android.messenger.blocks.chat.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f84553a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f84554b;

    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new m(parcel.readInt(), n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i11) {
            return new m[i11];
        }
    }

    public m(int i11, @NotNull n type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f84553a = i11;
        this.f84554b = type;
    }

    @NotNull
    public final n a() {
        return this.f84554b;
    }

    public final int b() {
        return this.f84553a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f84553a == mVar.f84553a && this.f84554b == mVar.f84554b;
    }

    public final int hashCode() {
        return this.f84554b.hashCode() + (Integer.hashCode(this.f84553a) * 31);
    }

    @NotNull
    public final String toString() {
        return "UnreadCountIndicatorVO(value=" + this.f84553a + ", type=" + this.f84554b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f84553a);
        dest.writeString(this.f84554b.name());
    }
}
