package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b1.AbstractC2335D;
import b1.AbstractC2356j;
import e1.AbstractC4134a;
import e1.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f20462a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20463b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20464c;
    private final SchemeData[] schemeDatas;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f20465a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f20466b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20467c;

        /* renamed from: d, reason: collision with root package name */
        public final String f20468d;
        public final byte[] data;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(SchemeData schemeData) {
            return c() && !schemeData.c() && d(schemeData.f20466b);
        }

        public SchemeData b(byte[] bArr) {
            return new SchemeData(this.f20466b, this.f20467c, this.f20468d, bArr);
        }

        public boolean c() {
            return this.data != null;
        }

        public boolean d(UUID uuid) {
            return AbstractC2356j.f24591a.equals(this.f20466b) || uuid.equals(this.f20466b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Objects.equals(this.f20467c, schemeData.f20467c) && Objects.equals(this.f20468d, schemeData.f20468d) && Objects.equals(this.f20466b, schemeData.f20466b) && Arrays.equals(this.data, schemeData.data);
        }

        public int hashCode() {
            if (this.f20465a == 0) {
                int hashCode = this.f20466b.hashCode() * 31;
                String str = this.f20467c;
                this.f20465a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f20468d.hashCode()) * 31) + Arrays.hashCode(this.data);
            }
            return this.f20465a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f20466b.getMostSignificantBits());
            parcel.writeLong(this.f20466b.getLeastSignificantBits());
            parcel.writeString(this.f20467c);
            parcel.writeString(this.f20468d);
            parcel.writeByteArray(this.data);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f20466b = (UUID) AbstractC4134a.e(uuid);
            this.f20467c = str;
            this.f20468d = AbstractC2335D.u((String) AbstractC4134a.e(str2));
            this.data = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f20466b = new UUID(parcel.readLong(), parcel.readLong());
            this.f20467c = parcel.readString();
            this.f20468d = (String) Z.i(parcel.readString());
            this.data = parcel.createByteArray();
        }
    }

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(List list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public static boolean d(ArrayList arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((SchemeData) arrayList.get(i11)).f20466b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static DrmInitData h(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f20463b;
            for (SchemeData schemeData : drmInitData.schemeDatas) {
                if (schemeData.c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f20463b;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.schemeDatas) {
                if (schemeData2.c() && !d(arrayList, size, schemeData2.f20466b)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    public DrmInitData J(DrmInitData drmInitData) {
        String str;
        String str2 = this.f20463b;
        AbstractC4134a.g(str2 == null || (str = drmInitData.f20463b) == null || TextUtils.equals(str2, str));
        String str3 = this.f20463b;
        if (str3 == null) {
            str3 = drmInitData.f20463b;
        }
        return new DrmInitData(str3, (SchemeData[]) Z.f1(this.schemeDatas, drmInitData.schemeDatas));
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = AbstractC2356j.f24591a;
        return uuid.equals(schemeData.f20466b) ? uuid.equals(schemeData2.f20466b) ? 0 : 1 : schemeData.f20466b.compareTo(schemeData2.f20466b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DrmInitData e(String str) {
        return Objects.equals(this.f20463b, str) ? this : new DrmInitData(str, false, this.schemeDatas);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (Objects.equals(this.f20463b, drmInitData.f20463b) && Arrays.equals(this.schemeDatas, drmInitData.schemeDatas)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f20462a == 0) {
            String str = this.f20463b;
            this.f20462a = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.schemeDatas);
        }
        return this.f20462a;
    }

    public SchemeData i(int i10) {
        return this.schemeDatas[i10];
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20463b);
        parcel.writeTypedArray(this.schemeDatas, 0);
    }

    public DrmInitData(String str, List list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f20463b = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.schemeDatas = schemeDataArr;
        this.f20464c = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.f20463b = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) Z.i((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.schemeDatas = schemeDataArr;
        this.f20464c = schemeDataArr.length;
    }
}
