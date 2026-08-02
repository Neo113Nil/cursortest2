package ru.ozon.android.messenger.blocks.rateoperator;

import C.o0;
import G.g;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f86247a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f86248b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f86249c;

    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    i11 = Ak.b.b(b.CREATOR, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            return new d(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i11) {
            return new d[i11];
        }
    }

    public static final class b implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f86250a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f86251b;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(int i11, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f86250a = i11;
            this.f86251b = name;
        }

        public final int a() {
            return this.f86250a;
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
            return this.f86250a == bVar.f86250a && Intrinsics.d(this.f86251b, bVar.f86251b);
        }

        @NotNull
        public final String getName() {
            return this.f86251b;
        }

        public final int hashCode() {
            return this.f86251b.hashCode() + (Integer.hashCode(this.f86250a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReasonVO(id=");
            sb2.append(this.f86250a);
            sb2.append(", name=");
            return o0.c(sb2, this.f86251b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f86250a);
            dest.writeString(this.f86251b);
        }
    }

    public d(int i11, @NotNull String name, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f86247a = i11;
        this.f86248b = name;
        this.f86249c = arrayList;
    }

    public final int a() {
        return this.f86247a;
    }

    public final List<b> b() {
        return this.f86249c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f86247a == dVar.f86247a && Intrinsics.d(this.f86248b, dVar.f86248b) && Intrinsics.d(this.f86249c, dVar.f86249c);
    }

    @NotNull
    public final String getName() {
        return this.f86248b;
    }

    public final int hashCode() {
        int a11 = g.a(Integer.hashCode(this.f86247a) * 31, 31, this.f86248b);
        ArrayList arrayList = this.f86249c;
        return a11 + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RateVO(rate=");
        sb2.append(this.f86247a);
        sb2.append(", name=");
        sb2.append(this.f86248b);
        sb2.append(", reasons=");
        return Om.a(")", sb2, this.f86249c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f86247a);
        dest.writeString(this.f86248b);
        ArrayList arrayList = this.f86249c;
        if (arrayList == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).writeToParcel(dest, i11);
        }
    }
}
