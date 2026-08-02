package ru.ozon.android.messenger.blocks.rateoperator;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
public final class e implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f86252a;

    /* renamed from: b, reason: collision with root package name */
    private final Icon f86253b;

    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new e(parcel.readString(), (Icon) parcel.readParcelable(e.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i11) {
            return new e[i11];
        }
    }

    static {
        int i11 = Icon.$stable;
        CREATOR = new a();
    }

    public e(@NotNull String text, Icon icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f86252a = text;
        this.f86253b = icon;
    }

    public final Icon a() {
        return this.f86253b;
    }

    @NotNull
    public final String b() {
        return this.f86252a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f86252a, eVar.f86252a) && Intrinsics.d(this.f86253b, eVar.f86253b);
    }

    public final int hashCode() {
        int hashCode = this.f86252a.hashCode() * 31;
        Icon icon = this.f86253b;
        return hashCode + (icon == null ? 0 : icon.hashCode());
    }

    @NotNull
    public final String toString() {
        return "SuccessStateVO(text=" + this.f86252a + ", icon=" + this.f86253b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86252a);
        dest.writeParcelable(this.f86253b, i11);
    }
}
