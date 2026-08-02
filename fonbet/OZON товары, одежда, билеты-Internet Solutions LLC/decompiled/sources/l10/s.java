package l10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<s> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Integer f72530a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f72531a;

        @NotNull
        public final void a(Integer num) {
            this.f72531a = num;
        }

        @NotNull
        public final s b() {
            return new s(this.f72531a);
        }
    }

    public static final class b implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new s(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i11) {
            return new s[i11];
        }
    }

    public s(Integer num) {
        this.f72530a = num;
    }

    public final Integer a() {
        return this.f72530a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.f72530a;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
    }
}
