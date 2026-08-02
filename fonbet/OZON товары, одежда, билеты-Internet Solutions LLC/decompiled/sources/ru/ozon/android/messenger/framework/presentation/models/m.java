package ru.ozon.android.messenger.framework.presentation.models;

import B0.C2454a;
import C.o0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f91446a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91447b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f91448c;

    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new m(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i11) {
            return new m[i11];
        }
    }

    public m(@NotNull String message, int i11, @NotNull String tintColor) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
        this.f91446a = message;
        this.f91447b = i11;
        this.f91448c = tintColor;
    }

    public final int a() {
        return this.f91447b;
    }

    @NotNull
    public final String b() {
        return this.f91446a;
    }

    @NotNull
    public final String c() {
        return this.f91448c;
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
        return Intrinsics.d(this.f91446a, mVar.f91446a) && this.f91447b == mVar.f91447b && Intrinsics.d(this.f91448c, mVar.f91448c);
    }

    public final int hashCode() {
        return this.f91448c.hashCode() + C2454a.a(this.f91447b, this.f91446a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlashbarState(message=");
        sb2.append(this.f91446a);
        sb2.append(", iconRes=");
        sb2.append(this.f91447b);
        sb2.append(", tintColor=");
        return o0.c(sb2, this.f91448c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91446a);
        dest.writeInt(this.f91447b);
        dest.writeString(this.f91448c);
    }
}
