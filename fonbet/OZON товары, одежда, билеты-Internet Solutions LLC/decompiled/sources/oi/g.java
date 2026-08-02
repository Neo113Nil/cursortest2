package oi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g implements InterfaceC8742f {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78368a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78369b;

    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new g(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i11) {
            return new g[i11];
        }
    }

    public g(@NotNull String id2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f78368a = id2;
        this.f78369b = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.android.ds.core.token.DsTypographyToken");
        return Intrinsics.d(this.f78368a, ((g) obj).f78368a);
    }

    @Override // oi.InterfaceC8742f
    @NotNull
    public final String getId() {
        return this.f78368a;
    }

    public final int hashCode() {
        return this.f78368a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78368a);
        dest.writeInt(this.f78369b ? 1 : 0);
    }
}
