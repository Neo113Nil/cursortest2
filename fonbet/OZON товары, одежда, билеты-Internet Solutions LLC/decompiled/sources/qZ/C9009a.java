package qZ;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qZ.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9009a implements InterfaceC9014f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C9009a f81781a = new C9009a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f81782b = "ABSENT";

    @NotNull
    public static final Parcelable.Creator<C9009a> CREATOR = new C1379a();

    /* renamed from: qZ.a$a, reason: collision with other inner class name */
    public static final class C1379a implements Parcelable.Creator<C9009a> {
        @Override // android.os.Parcelable.Creator
        public final C9009a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return C9009a.f81781a;
        }

        @Override // android.os.Parcelable.Creator
        public final C9009a[] newArray(int i11) {
            return new C9009a[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C9009a);
    }

    @Override // qZ.InterfaceC9014f
    @NotNull
    public final String getName() {
        return f81782b;
    }

    public final int hashCode() {
        return 1426453846;
    }

    @NotNull
    public final String toString() {
        return "AbsentTag";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
