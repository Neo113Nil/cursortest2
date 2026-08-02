package ru.ozon.android.messenger.framework.presentation.models;

import K1.G;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;

/* loaded from: classes10.dex */
public abstract class k implements Parcelable {

    public static final class a extends k {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final IconTitleSubtitleCellDTO f91439a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f91440b;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.models.k$a$a, reason: collision with other inner class name */
        public static final class C1707a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a((IconTitleSubtitleCellDTO) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        static {
            int i11 = IconTitleSubtitleCellDTO.$stable;
            CREATOR = new C1707a();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull IconTitleSubtitleCellDTO cell, Integer num) {
            super(0);
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.f91439a = cell;
            this.f91440b = num;
        }

        @NotNull
        public final IconTitleSubtitleCellDTO a() {
            return this.f91439a;
        }

        public final Integer b() {
            return this.f91440b;
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
            return Intrinsics.d(this.f91439a, aVar.f91439a) && Intrinsics.d(this.f91440b, aVar.f91440b);
        }

        public final int hashCode() {
            int hashCode = this.f91439a.hashCode() * 31;
            Integer num = this.f91440b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Cell(cell=" + this.f91439a + ", loadingTtl=" + this.f91440b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91439a, i11);
            Integer num = this.f91440b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
        }
    }

    public static final class b extends k {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f91441a;

        /* renamed from: b, reason: collision with root package name */
        private final Icon f91442b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomActionDTO f91443c;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readString(), (Icon) parcel.readParcelable(b.class.getClassLoader()), (AtomActionDTO) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        static {
            int i11 = Icon.$stable;
            CREATOR = new a();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String text, Icon icon, AtomActionDTO atomActionDTO) {
            super(0);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f91441a = text;
            this.f91442b = icon;
            this.f91443c = atomActionDTO;
        }

        public final AtomActionDTO a() {
            return this.f91443c;
        }

        public final Icon b() {
            return this.f91442b;
        }

        @NotNull
        public final String c() {
            return this.f91441a;
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
            return Intrinsics.d(this.f91441a, bVar.f91441a) && Intrinsics.d(this.f91442b, bVar.f91442b) && Intrinsics.d(this.f91443c, bVar.f91443c);
        }

        public final int hashCode() {
            int hashCode = this.f91441a.hashCode() * 31;
            Icon icon = this.f91442b;
            int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.f91443c;
            return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Default(text=");
            sb2.append(this.f91441a);
            sb2.append(", icon=");
            sb2.append(this.f91442b);
            sb2.append(", action=");
            return G.c(sb2, this.f91443c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91441a);
            dest.writeParcelable(this.f91442b, i11);
            dest.writeParcelable(this.f91443c, i11);
        }
    }

    public /* synthetic */ k(int i11) {
        this();
    }

    private k() {
    }
}
