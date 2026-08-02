package j3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j3.G, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7251G implements Comparable<C7251G>, Parcelable {
    public static final Parcelable.Creator<C7251G> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f68934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68936c;

    /* renamed from: j3.G$a */
    final class a implements Parcelable.Creator<C7251G> {
        @Override // android.os.Parcelable.Creator
        public final C7251G createFromParcel(Parcel parcel) {
            return new C7251G(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7251G[] newArray(int i11) {
            return new C7251G[i11];
        }
    }

    static {
        m3.N.L(0);
        m3.N.L(1);
        m3.N.L(2);
    }

    public C7251G(int i11, int i12, int i13) {
        this.f68934a = i11;
        this.f68935b = i12;
        this.f68936c = i13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C7251G c7251g) {
        C7251G c7251g2 = c7251g;
        int i11 = this.f68934a - c7251g2.f68934a;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.f68935b - c7251g2.f68935b;
        return i12 == 0 ? this.f68936c - c7251g2.f68936c : i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7251G.class == obj.getClass()) {
            C7251G c7251g = (C7251G) obj;
            if (this.f68934a == c7251g.f68934a && this.f68935b == c7251g.f68935b && this.f68936c == c7251g.f68936c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f68934a * 31) + this.f68935b) * 31) + this.f68936c;
    }

    public final String toString() {
        return this.f68934a + "." + this.f68935b + "." + this.f68936c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f68934a);
        parcel.writeInt(this.f68935b);
        parcel.writeInt(this.f68936c);
    }

    C7251G(Parcel parcel) {
        this.f68934a = parcel.readInt();
        this.f68935b = parcel.readInt();
        this.f68936c = parcel.readInt();
    }
}
