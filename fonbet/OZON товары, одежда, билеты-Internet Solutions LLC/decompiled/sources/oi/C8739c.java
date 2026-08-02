package oi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: oi.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8739c implements InterfaceC8742f {

    @NotNull
    public static final Parcelable.Creator<C8739c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78364a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78365b;

    /* renamed from: oi.c$a */
    public static final class a implements Parcelable.Creator<C8739c> {
        @Override // android.os.Parcelable.Creator
        public final C8739c createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C8739c(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final C8739c[] newArray(int i11) {
            return new C8739c[i11];
        }
    }

    public C8739c(@NotNull String id2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f78364a = id2;
        this.f78365b = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8739c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.android.ds.core.token.DsIconToken");
        return Intrinsics.d(this.f78364a, ((C8739c) obj).f78364a);
    }

    @Override // oi.InterfaceC8742f
    @NotNull
    public final String getId() {
        return this.f78364a;
    }

    public final int hashCode() {
        return this.f78364a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78364a);
        dest.writeInt(this.f78365b ? 1 : 0);
    }
}
