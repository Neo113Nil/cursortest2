package oi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: oi.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8740d implements InterfaceC8742f {

    @NotNull
    public static final Parcelable.Creator<C8740d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78366a;

    /* renamed from: oi.d$a */
    public static final class a implements Parcelable.Creator<C8740d> {
        @Override // android.os.Parcelable.Creator
        public final C8740d createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8740d(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C8740d[] newArray(int i11) {
            return new C8740d[i11];
        }
    }

    public C8740d(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f78366a = id2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8740d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.android.ds.core.token.DsPaddingToken");
        return Intrinsics.d(this.f78366a, ((C8740d) obj).f78366a);
    }

    @Override // oi.InterfaceC8742f
    @NotNull
    public final String getId() {
        return this.f78366a;
    }

    public final int hashCode() {
        return this.f78366a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78366a);
    }
}
