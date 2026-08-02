package r10;

import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: r10.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9159b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C9159b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f82843a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82844b;

    /* renamed from: c, reason: collision with root package name */
    private final String f82845c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f82846d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f82847e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f82848f;

    /* renamed from: g, reason: collision with root package name */
    private final Float f82849g;

    /* renamed from: r10.b$a */
    public static final class a implements Parcelable.Creator<C9159b> {
        @Override // android.os.Parcelable.Creator
        public final C9159b createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C9159b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final C9159b[] newArray(int i11) {
            return new C9159b[i11];
        }
    }

    public C9159b(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Float f7) {
        this.f82843a = str;
        this.f82844b = str2;
        this.f82845c = str3;
        this.f82846d = num;
        this.f82847e = num2;
        this.f82848f = num3;
        this.f82849g = f7;
    }

    public final Float a() {
        return this.f82849g;
    }

    public final Integer b() {
        return this.f82847e;
    }

    public final Integer c() {
        return this.f82848f;
    }

    public final String d() {
        return this.f82844b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f82845c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9159b)) {
            return false;
        }
        C9159b c9159b = (C9159b) obj;
        return Intrinsics.d(this.f82843a, c9159b.f82843a) && Intrinsics.d(this.f82844b, c9159b.f82844b) && Intrinsics.d(this.f82845c, c9159b.f82845c) && Intrinsics.d(this.f82846d, c9159b.f82846d) && Intrinsics.d(this.f82847e, c9159b.f82847e) && Intrinsics.d(this.f82848f, c9159b.f82848f) && Intrinsics.d(this.f82849g, c9159b.f82849g);
    }

    public final Integer f() {
        return this.f82846d;
    }

    public final String g() {
        return this.f82843a;
    }

    public final int hashCode() {
        String str = this.f82843a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82844b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82845c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f82846d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f82847e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f82848f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f7 = this.f82849g;
        return hashCode6 + (f7 != null ? f7.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PageDebugInfo(url=" + this.f82843a + ", pageType=" + this.f82844b + ", pageTypeTracking=" + this.f82845c + ", ruleId=" + this.f82846d + ", layoutId=" + this.f82847e + ", layoutVersion=" + this.f82848f + ", bottomPrefetchDepth=" + this.f82849g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82843a);
        dest.writeString(this.f82844b);
        dest.writeString(this.f82845c);
        Integer num = this.f82846d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        Integer num2 = this.f82847e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
        Integer num3 = this.f82848f;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num3);
        }
        Float f7 = this.f82849g;
        if (f7 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f7);
        }
    }
}
