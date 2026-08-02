package i10;

import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f65746a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f65747b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f65748c;

    public static abstract class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final long f65749a;

        /* renamed from: i10.l$a$a, reason: collision with other inner class name */
        public static final class C1079a extends a {

            @NotNull
            public static final Parcelable.Creator<C1079a> CREATOR = new C1080a();

            /* renamed from: b, reason: collision with root package name */
            private final long f65750b;

            /* renamed from: c, reason: collision with root package name */
            private final Integer f65751c;

            /* renamed from: i10.l$a$a$a, reason: collision with other inner class name */
            public static final class C1080a implements Parcelable.Creator<C1079a> {
                @Override // android.os.Parcelable.Creator
                public final C1079a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new C1079a(parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final C1079a[] newArray(int i11) {
                    return new C1079a[i11];
                }
            }

            public C1079a() {
                this(0L, null, 3);
            }

            @Override // i10.l.a
            public final Integer a() {
                return this.f65751c;
            }

            @Override // i10.l.a
            public final long b() {
                return this.f65750b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1079a)) {
                    return false;
                }
                C1079a c1079a = (C1079a) obj;
                return this.f65750b == c1079a.f65750b && Intrinsics.d(this.f65751c, c1079a.f65751c);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.f65750b) * 31;
                Integer num = this.f65751c;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Overlay(loaderDelay=");
                sb2.append(this.f65750b);
                sb2.append(", loaderBackground=");
                return Ep.a.c(sb2, this.f65751c, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeLong(this.f65750b);
                Integer num = this.f65751c;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
            }

            public /* synthetic */ C1079a(long j11, Integer num, int i11) {
                this((i11 & 1) != 0 ? 300L : j11, (i11 & 2) != 0 ? null : num);
            }

            public C1079a(long j11, Integer num) {
                super(j11);
                this.f65750b = j11;
                this.f65751c = num;
            }
        }

        public static final class b extends a {

            @NotNull
            public static final Parcelable.Creator<b> CREATOR = new C1081a();

            /* renamed from: b, reason: collision with root package name */
            private final long f65752b;

            /* renamed from: c, reason: collision with root package name */
            private final Integer f65753c;

            /* renamed from: i10.l$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C1081a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new b(parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            public b() {
                this(0L, null, 3);
            }

            @Override // i10.l.a
            public final Integer a() {
                return this.f65753c;
            }

            @Override // i10.l.a
            public final long b() {
                return this.f65752b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f65752b == bVar.f65752b && Intrinsics.d(this.f65753c, bVar.f65753c);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.f65752b) * 31;
                Integer num = this.f65753c;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Transparent(loaderDelay=");
                sb2.append(this.f65752b);
                sb2.append(", loaderBackground=");
                return Ep.a.c(sb2, this.f65753c, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeLong(this.f65752b);
                Integer num = this.f65753c;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
            }

            public /* synthetic */ b(long j11, Integer num, int i11) {
                this((i11 & 1) != 0 ? 300L : j11, (i11 & 2) != 0 ? null : num);
            }

            public b(long j11, Integer num) {
                super(j11);
                this.f65752b = j11;
                this.f65753c = num;
            }
        }

        public a(long j11) {
            this.f65749a = j11;
        }

        public Integer a() {
            return null;
        }

        public long b() {
            return this.f65749a;
        }
    }

    public l(boolean z11, boolean z12, @NotNull a loaderType) {
        Intrinsics.checkNotNullParameter(loaderType, "loaderType");
        this.f65746a = z11;
        this.f65747b = z12;
        this.f65748c = loaderType;
    }

    public static l a(l lVar, boolean z11, boolean z12, int i11) {
        if ((i11 & 1) != 0) {
            z11 = lVar.f65746a;
        }
        if ((i11 & 2) != 0) {
            z12 = lVar.f65747b;
        }
        a loaderType = lVar.f65748c;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(loaderType, "loaderType");
        return new l(z11, z12, loaderType);
    }

    @NotNull
    public final a b() {
        return this.f65748c;
    }

    public final boolean c() {
        return this.f65746a;
    }

    public final boolean d() {
        return this.f65747b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f65746a == lVar.f65746a && this.f65747b == lVar.f65747b && Intrinsics.d(this.f65748c, lVar.f65748c);
    }

    public final int hashCode() {
        return this.f65748c.hashCode() + C3532b.a(Boolean.hashCode(this.f65746a) * 31, 31, this.f65747b);
    }

    @NotNull
    public final String toString() {
        return "Loader(show=" + this.f65746a + ", isSnapshotRequired=" + this.f65747b + ", loaderType=" + this.f65748c + ")";
    }
}
