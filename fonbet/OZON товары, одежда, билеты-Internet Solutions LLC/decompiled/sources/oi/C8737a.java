package oi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: oi.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8737a implements InterfaceC8742f {

    @NotNull
    public static final Parcelable.Creator<C8737a> CREATOR = new C1329a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78362a;

    /* renamed from: oi.a$a, reason: collision with other inner class name */
    public static final class C1329a implements Parcelable.Creator<C8737a> {
        @Override // android.os.Parcelable.Creator
        public final C8737a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8737a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C8737a[] newArray(int i11) {
            return new C8737a[i11];
        }
    }

    public C8737a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f78362a = id2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8737a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.android.ds.core.token.DsColorToken");
        return Intrinsics.d(this.f78362a, ((C8737a) obj).f78362a);
    }

    @Override // oi.InterfaceC8742f
    @NotNull
    public final String getId() {
        return this.f78362a;
    }

    public final int hashCode() {
        return this.f78362a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78362a);
    }
}
