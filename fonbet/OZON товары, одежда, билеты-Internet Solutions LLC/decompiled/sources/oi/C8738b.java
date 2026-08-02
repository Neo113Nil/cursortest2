package oi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: oi.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8738b implements InterfaceC8742f {

    @NotNull
    public static final Parcelable.Creator<C8738b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78363a;

    /* renamed from: oi.b$a */
    public static final class a implements Parcelable.Creator<C8738b> {
        @Override // android.os.Parcelable.Creator
        public final C8738b createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8738b(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C8738b[] newArray(int i11) {
            return new C8738b[i11];
        }
    }

    public C8738b(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f78363a = id2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8738b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.android.ds.core.token.DsGradientToken");
        return Intrinsics.d(this.f78363a, ((C8738b) obj).f78363a);
    }

    @Override // oi.InterfaceC8742f
    @NotNull
    public final String getId() {
        return this.f78363a;
    }

    public final int hashCode() {
        return this.f78363a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78363a);
    }
}
