package l10;

import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.R$drawable;

/* loaded from: classes7.dex */
public final class u implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f72535a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72536b;

    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new u(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i11) {
            return new u[i11];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f72537a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f72538b;

        /* renamed from: c, reason: collision with root package name */
        private final String f72539c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final c f72540d;

        /* renamed from: e, reason: collision with root package name */
        private final Integer f72541e;

        /* renamed from: f, reason: collision with root package name */
        private final Integer f72542f;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readInt(), parcel.readInt() != 0, parcel.readString(), c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b() {
            this(0, false, (String) null, (c) null, (Integer) null, 63);
        }

        public final Integer a() {
            return this.f72541e;
        }

        public final int b() {
            return this.f72537a;
        }

        public final Integer c() {
            return this.f72542f;
        }

        public final boolean d() {
            return this.f72538b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final c e() {
            return this.f72540d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f72537a == bVar.f72537a && this.f72538b == bVar.f72538b && Intrinsics.d(this.f72539c, bVar.f72539c) && this.f72540d == bVar.f72540d && Intrinsics.d(this.f72541e, bVar.f72541e) && Intrinsics.d(this.f72542f, bVar.f72542f);
        }

        public final String getTitle() {
            return this.f72539c;
        }

        public final int hashCode() {
            int a11 = C3532b.a(Integer.hashCode(this.f72537a) * 31, 31, this.f72538b);
            String str = this.f72539c;
            int hashCode = (this.f72540d.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Integer num = this.f72541e;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f72542f;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DefaultState(drawableId=");
            sb2.append(this.f72537a);
            sb2.append(", navigationUpEnabled=");
            sb2.append(this.f72538b);
            sb2.append(", title=");
            sb2.append(this.f72539c);
            sb2.append(", titleAlign=");
            sb2.append(this.f72540d);
            sb2.append(", backgroundColor=");
            sb2.append(this.f72541e);
            sb2.append(", iconColor=");
            return Ep.a.c(sb2, this.f72542f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f72537a);
            dest.writeInt(this.f72538b ? 1 : 0);
            dest.writeString(this.f72539c);
            dest.writeString(this.f72540d.name());
            Integer num = this.f72541e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Integer num2 = this.f72542f;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
        }

        public b(int i11, boolean z11, String str, @NotNull c titleAlign, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(titleAlign, "titleAlign");
            this.f72537a = i11;
            this.f72538b = z11;
            this.f72539c = str;
            this.f72540d = titleAlign;
            this.f72541e = num;
            this.f72542f = num2;
        }

        public /* synthetic */ b(int i11, boolean z11, String str, c cVar, Integer num, int i12) {
            this((i12 & 1) != 0 ? R$drawable.ic_m_disclosure_back_filled : i11, (i12 & 2) != 0 ? true : z11, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? c.LEFT : cVar, (i12 & 16) != 0 ? null : num, (Integer) null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c CENTER;
        public static final c LEFT;

        static {
            c cVar = new c("LEFT", 0);
            LEFT = cVar;
            c cVar2 = new c("CENTER", 1);
            CENTER = cVar2;
            c[] cVarArr = {cVar, cVar2};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
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
    }

    public u() {
        this(0);
    }

    public final b a() {
        return this.f72535a;
    }

    public final int b() {
        return this.f72536b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f72535a, uVar.f72535a) && this.f72536b == uVar.f72536b;
    }

    public final int hashCode() {
        b bVar = this.f72535a;
        return Integer.hashCode(this.f72536b) + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "ToolbarConfig(defaultState=" + this.f72535a + ", insetStart=" + this.f72536b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        b bVar = this.f72535a;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bVar.writeToParcel(dest, i11);
        }
        dest.writeInt(this.f72536b);
    }

    public u(b bVar, int i11) {
        this.f72535a = bVar;
        this.f72536b = i11;
    }

    public /* synthetic */ u(int i11) {
        this(new b(0, false, (String) null, (c) null, (Integer) null, 63), 0);
    }
}
