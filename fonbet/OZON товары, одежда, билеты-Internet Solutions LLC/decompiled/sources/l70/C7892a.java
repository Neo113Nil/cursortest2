package l70;

import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: l70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7892a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C7892a> CREATOR = new C1216a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f72937a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f72938b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f72939c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f72940d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f72941e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f72942f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f72943g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f72944h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f72945i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final c f72946j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final b f72947k;

    /* renamed from: l70.a$a, reason: collision with other inner class name */
    public static final class C1216a implements Parcelable.Creator<C7892a> {
        @Override // android.os.Parcelable.Creator
        public final C7892a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C7892a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), c.CREATOR.createFromParcel(parcel), b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final C7892a[] newArray(int i11) {
            return new C7892a[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l70.a$b */
    public static final class b implements Parcelable {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<b> CREATOR;
        public static final b ENTERED;

        /* renamed from: ME, reason: collision with root package name */
        public static final b f72948ME;
        public static final b PHONE_BOOK;

        /* renamed from: l70.a$b$a, reason: collision with other inner class name */
        public static final class C1217a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        static {
            b bVar = new b("ENTERED", 0);
            ENTERED = bVar;
            b bVar2 = new b("PHONE_BOOK", 1);
            PHONE_BOOK = bVar2;
            b bVar3 = new b("ME", 2);
            f72948ME = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
            CREATOR = new C1217a();
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l70.a$c */
    public static final class c implements Parcelable {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c BAD;

        @NotNull
        public static final Parcelable.Creator<c> CREATOR;
        public static final c OTHERS;
        public static final c RUS;

        /* renamed from: l70.a$c$a, reason: collision with other inner class name */
        public static final class C1218a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return c.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        static {
            c cVar = new c("RUS", 0);
            RUS = cVar;
            c cVar2 = new c("OTHERS", 1);
            OTHERS = cVar2;
            c cVar3 = new c("BAD", 2);
            BAD = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
            CREATOR = new C1218a();
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    public C7892a(@NotNull String id2, @NotNull String number, @NotNull String displayName, @NotNull String photoUri, @NotNull String numberFormatted, @NotNull String numberClean, @NotNull String numberNormalized, @NotNull String numberNormalizedNoPlus, @NotNull String initials, @NotNull c type, @NotNull b source) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(photoUri, "photoUri");
        Intrinsics.checkNotNullParameter(numberFormatted, "numberFormatted");
        Intrinsics.checkNotNullParameter(numberClean, "numberClean");
        Intrinsics.checkNotNullParameter(numberNormalized, "numberNormalized");
        Intrinsics.checkNotNullParameter(numberNormalizedNoPlus, "numberNormalizedNoPlus");
        Intrinsics.checkNotNullParameter(initials, "initials");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f72937a = id2;
        this.f72938b = number;
        this.f72939c = displayName;
        this.f72940d = photoUri;
        this.f72941e = numberFormatted;
        this.f72942f = numberClean;
        this.f72943g = numberNormalized;
        this.f72944h = numberNormalizedNoPlus;
        this.f72945i = initials;
        this.f72946j = type;
        this.f72947k = source;
    }

    @NotNull
    public final String a() {
        return this.f72939c;
    }

    @NotNull
    public final String b() {
        return this.f72945i;
    }

    @NotNull
    public final String c() {
        return this.f72938b;
    }

    @NotNull
    public final String d() {
        return this.f72942f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.f72941e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7892a)) {
            return false;
        }
        C7892a c7892a = (C7892a) obj;
        return Intrinsics.d(this.f72937a, c7892a.f72937a) && Intrinsics.d(this.f72938b, c7892a.f72938b) && Intrinsics.d(this.f72939c, c7892a.f72939c) && Intrinsics.d(this.f72940d, c7892a.f72940d) && Intrinsics.d(this.f72941e, c7892a.f72941e) && Intrinsics.d(this.f72942f, c7892a.f72942f) && Intrinsics.d(this.f72943g, c7892a.f72943g) && Intrinsics.d(this.f72944h, c7892a.f72944h) && Intrinsics.d(this.f72945i, c7892a.f72945i) && this.f72946j == c7892a.f72946j && this.f72947k == c7892a.f72947k;
    }

    @NotNull
    public final String f() {
        return this.f72943g;
    }

    @NotNull
    public final String g() {
        return this.f72944h;
    }

    @NotNull
    public final String getId() {
        return this.f72937a;
    }

    @NotNull
    public final String h() {
        return this.f72940d;
    }

    public final int hashCode() {
        return this.f72947k.hashCode() + ((this.f72946j.hashCode() + g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(this.f72937a.hashCode() * 31, 31, this.f72938b), 31, this.f72939c), 31, this.f72940d), 31, this.f72941e), 31, this.f72942f), 31, this.f72943g), 31, this.f72944h), 31, this.f72945i)) * 31);
    }

    @NotNull
    public final b i() {
        return this.f72947k;
    }

    @NotNull
    public final c j() {
        return this.f72946j;
    }

    @NotNull
    public final String toString() {
        return "OfflineContact(id=" + this.f72937a + ", number=" + this.f72938b + ", displayName=" + this.f72939c + ", photoUri=" + this.f72940d + ", numberFormatted=" + this.f72941e + ", numberClean=" + this.f72942f + ", numberNormalized=" + this.f72943g + ", numberNormalizedNoPlus=" + this.f72944h + ", initials=" + this.f72945i + ", type=" + this.f72946j + ", source=" + this.f72947k + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72937a);
        dest.writeString(this.f72938b);
        dest.writeString(this.f72939c);
        dest.writeString(this.f72940d);
        dest.writeString(this.f72941e);
        dest.writeString(this.f72942f);
        dest.writeString(this.f72943g);
        dest.writeString(this.f72944h);
        dest.writeString(this.f72945i);
        this.f72946j.writeToParcel(dest, i11);
        this.f72947k.writeToParcel(dest, i11);
    }
}
