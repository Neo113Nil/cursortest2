package oi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: oi.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8741e implements InterfaceC8742f {

    @NotNull
    public static final Parcelable.Creator<C8741e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78367a;

    /* renamed from: oi.e$a */
    public static final class a implements Parcelable.Creator<C8741e> {
        @Override // android.os.Parcelable.Creator
        public final C8741e createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8741e(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C8741e[] newArray(int i11) {
            return new C8741e[i11];
        }
    }

    public C8741e(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f78367a = id2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8741e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.android.ds.core.token.DsRadiusToken");
        return Intrinsics.d(this.f78367a, ((C8741e) obj).f78367a);
    }

    @Override // oi.InterfaceC8742f
    @NotNull
    public final String getId() {
        return this.f78367a;
    }

    public final int hashCode() {
        return this.f78367a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78367a);
    }
}
