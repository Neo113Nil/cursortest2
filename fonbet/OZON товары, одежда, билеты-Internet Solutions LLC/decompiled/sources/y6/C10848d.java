package y6;

import C.o0;
import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: y6.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10848d extends Exception implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C10848d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Integer f106088a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f106089b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f106090c;

    /* renamed from: y6.d$a */
    public static final class a implements Parcelable.Creator<C10848d> {
        @Override // android.os.Parcelable.Creator
        public final C10848d createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C10848d(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C10848d[] newArray(int i11) {
            return new C10848d[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10848d() {
        this((String) null, 7, (Integer) (0 == true ? 1 : 0));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10848d)) {
            return false;
        }
        C10848d c10848d = (C10848d) obj;
        return Intrinsics.d(this.f106088a, c10848d.f106088a) && Intrinsics.d(this.f106089b, c10848d.f106089b) && Intrinsics.d(this.f106090c, c10848d.f106090c);
    }

    public final int hashCode() {
        Integer num = this.f106088a;
        return this.f106090c.hashCode() + g.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f106089b);
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EsiaErrorResponse(code=");
        sb2.append(this.f106088a);
        sb2.append(", esiaCode=");
        sb2.append(this.f106089b);
        sb2.append(", description=");
        return o0.c(sb2, this.f106090c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        Integer num = this.f106088a;
        if (num == null) {
            out.writeInt(0);
        } else {
            Nh.a.f(out, 1, num);
        }
        out.writeString(this.f106089b);
        out.writeString(this.f106090c);
    }

    public /* synthetic */ C10848d(String str, int i11, Integer num) {
        this((i11 & 1) != 0 ? 1 : num, "", (i11 & 4) != 0 ? "Something went wrong" : str);
    }

    public C10848d(Integer num, @NotNull String esiaCode, @NotNull String description) {
        Intrinsics.checkNotNullParameter(esiaCode, "esiaCode");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f106088a = num;
        this.f106089b = esiaCode;
        this.f106090c = description;
    }
}
