package zc0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* renamed from: zc0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11092g {

    /* renamed from: zc0.g$a */
    public static final class a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C2345a();

        /* renamed from: a, reason: collision with root package name */
        private final String f108795a;

        /* renamed from: b, reason: collision with root package name */
        private final String f108796b;

        /* renamed from: c, reason: collision with root package name */
        private final String f108797c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final CellDTO f108798d;

        /* renamed from: zc0.g$a$a, reason: collision with other inner class name */
        public static final class C2345a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), (CellDTO) parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(String str, String str2, String str3, @NotNull CellDTO cellDTO) {
            Intrinsics.checkNotNullParameter(cellDTO, "cellDTO");
            this.f108795a = str;
            this.f108796b = str2;
            this.f108797c = str3;
            this.f108798d = cellDTO;
        }

        @NotNull
        public final CellDTO a() {
            return this.f108798d;
        }

        public final String b() {
            return this.f108795a;
        }

        public final String c() {
            return this.f108797c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f108795a, aVar.f108795a) && Intrinsics.d(this.f108796b, aVar.f108796b) && Intrinsics.d(this.f108797c, aVar.f108797c) && Intrinsics.d(this.f108798d, aVar.f108798d);
        }

        public final int hashCode() {
            String str = this.f108795a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f108796b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f108797c;
            return this.f108798d.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ItemCellDTO(deeplink=" + this.f108795a + ", action=" + this.f108796b + ", trackClick=" + this.f108797c + ", cellDTO=" + this.f108798d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f108795a);
            dest.writeString(this.f108796b);
            dest.writeString(this.f108797c);
            dest.writeParcelable(this.f108798d, i11);
        }
    }
}
