package j3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* renamed from: j3.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7270l implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<C7270l> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b[] f69084a;

    /* renamed from: b, reason: collision with root package name */
    private int f69085b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69086c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69087d;

    /* renamed from: j3.l$a */
    final class a implements Parcelable.Creator<C7270l> {
        @Override // android.os.Parcelable.Creator
        public final C7270l createFromParcel(Parcel parcel) {
            return new C7270l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7270l[] newArray(int i11) {
            return new C7270l[i11];
        }
    }

    /* renamed from: j3.l$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private int f69088a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f69089b;

        /* renamed from: c, reason: collision with root package name */
        public final String f69090c;

        /* renamed from: d, reason: collision with root package name */
        public final String f69091d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f69092e;

        /* renamed from: j3.l$b$a */
        final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = C7266h.f69061a;
            UUID uuid3 = this.f69089b;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f69090c, bVar.f69090c) && Objects.equals(this.f69091d, bVar.f69091d) && Objects.equals(this.f69089b, bVar.f69089b) && Arrays.equals(this.f69092e, bVar.f69092e);
        }

        public final int hashCode() {
            if (this.f69088a == 0) {
                int hashCode = this.f69089b.hashCode() * 31;
                String str = this.f69090c;
                this.f69088a = Arrays.hashCode(this.f69092e) + G.g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f69091d);
            }
            return this.f69088a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            UUID uuid = this.f69089b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f69090c);
            parcel.writeString(this.f69091d);
            parcel.writeByteArray(this.f69092e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f69089b = uuid;
            this.f69090c = str;
            str2.getClass();
            this.f69091d = u.m(str2);
            this.f69092e = bArr;
        }

        b(Parcel parcel) {
            this.f69089b = new UUID(parcel.readLong(), parcel.readLong());
            this.f69090c = parcel.readString();
            String readString = parcel.readString();
            int i11 = m3.N.f74289a;
            this.f69091d = readString;
            this.f69092e = parcel.createByteArray();
        }
    }

    public C7270l() {
        throw null;
    }

    public C7270l(ArrayList arrayList) {
        this(null, false, (b[]) arrayList.toArray(new b[0]));
    }

    public static C7270l b(C7270l c7270l, C7270l c7270l2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c7270l != null) {
            for (b bVar : c7270l.f69084a) {
                if (bVar.f69092e != null) {
                    arrayList.add(bVar);
                }
            }
            str = c7270l.f69086c;
        } else {
            str = null;
        }
        if (c7270l2 != null) {
            if (str == null) {
                str = c7270l2.f69086c;
            }
            int size = arrayList.size();
            for (b bVar2 : c7270l2.f69084a) {
                if (bVar2.f69092e != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            arrayList.add(bVar2);
                            break;
                        }
                        if (((b) arrayList.get(i11)).f69089b.equals(bVar2.f69089b)) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7270l(str, false, (b[]) arrayList.toArray(new b[0]));
    }

    public final C7270l a(String str) {
        return Objects.equals(this.f69086c, str) ? this : new C7270l(str, false, this.f69084a);
    }

    public final b c(int i11) {
        return this.f69084a[i11];
    }

    @Override // java.util.Comparator
    public final int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = C7266h.f69061a;
        return uuid.equals(bVar3.f69089b) ? uuid.equals(bVar4.f69089b) ? 0 : 1 : bVar3.f69089b.compareTo(bVar4.f69089b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7270l.class == obj.getClass()) {
            C7270l c7270l = (C7270l) obj;
            if (Objects.equals(this.f69086c, c7270l.f69086c) && Arrays.equals(this.f69084a, c7270l.f69084a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f69085b == 0) {
            String str = this.f69086c;
            this.f69085b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f69084a);
        }
        return this.f69085b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f69086c);
        parcel.writeTypedArray(this.f69084a, 0);
    }

    public C7270l(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C7270l(b... bVarArr) {
        this(null, true, bVarArr);
    }

    private C7270l(String str, boolean z11, b... bVarArr) {
        this.f69086c = str;
        bVarArr = z11 ? (b[]) bVarArr.clone() : bVarArr;
        this.f69084a = bVarArr;
        this.f69087d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    C7270l(Parcel parcel) {
        this.f69086c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i11 = m3.N.f74289a;
        this.f69084a = bVarArr;
        this.f69087d = bVarArr.length;
    }
}
