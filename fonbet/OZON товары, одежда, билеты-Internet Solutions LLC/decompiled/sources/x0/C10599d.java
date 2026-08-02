package x0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10599d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C10599d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f104731a;

    /* renamed from: x0.d$a */
    public static final class a implements Parcelable.Creator<C10599d> {
        @Override // android.os.Parcelable.Creator
        public final C10599d createFromParcel(Parcel parcel) {
            return new C10599d(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C10599d[] newArray(int i11) {
            return new C10599d[i11];
        }
    }

    public C10599d(int i11) {
        this.f104731a = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10599d) && this.f104731a == ((C10599d) obj).f104731a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104731a);
    }

    @NotNull
    public final String toString() {
        return Ek.a.d(new StringBuilder("DefaultLazyKey(index="), this.f104731a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        parcel.writeInt(this.f104731a);
    }
}
