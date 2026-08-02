package ru.ozon.android.messenger.framework.presentation.models;

import B90.C2618u;
import C.J;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* renamed from: ru.ozon.android.messenger.framework.presentation.models.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9515b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C9515b> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f91426a;

    /* renamed from: b, reason: collision with root package name */
    private final String f91427b;

    /* renamed from: c, reason: collision with root package name */
    private final IconDTO f91428c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Icon> f91429d;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.models.b$a */
    public static final class a implements Parcelable.Creator<C9515b> {
        @Override // android.os.Parcelable.Creator
        public final C9515b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            IconDTO iconDTO = (IconDTO) parcel.readParcelable(C9515b.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = Bi.b.a(C9515b.class, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            return new C9515b(readString, readString2, iconDTO, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final C9515b[] newArray(int i11) {
            return new C9515b[i11];
        }
    }

    static {
        int i11 = Icon.$stable;
        int i12 = IconDTO.$stable;
        CREATOR = new a();
    }

    public C9515b(@NotNull String id2, String str, IconDTO iconDTO, List<Icon> list) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f91426a = id2;
        this.f91427b = str;
        this.f91428c = iconDTO;
        this.f91429d = list;
    }

    public final IconDTO a() {
        return this.f91428c;
    }

    public final List<Icon> b() {
        return this.f91429d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9515b)) {
            return false;
        }
        C9515b c9515b = (C9515b) obj;
        return Intrinsics.d(this.f91426a, c9515b.f91426a) && Intrinsics.d(this.f91427b, c9515b.f91427b) && Intrinsics.d(this.f91428c, c9515b.f91428c) && Intrinsics.d(this.f91429d, c9515b.f91429d);
    }

    @NotNull
    public final String getId() {
        return this.f91426a;
    }

    public final String getName() {
        return this.f91427b;
    }

    public final int hashCode() {
        int hashCode = this.f91426a.hashCode() * 31;
        String str = this.f91427b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconDTO iconDTO = this.f91428c;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        List<Icon> list = this.f91429d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuthorVO(id=");
        sb2.append(this.f91426a);
        sb2.append(", name=");
        sb2.append(this.f91427b);
        sb2.append(", avatarIcon=");
        sb2.append(this.f91428c);
        sb2.append(", icons=");
        return C2618u.h(sb2, this.f91429d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91426a);
        dest.writeString(this.f91427b);
        dest.writeParcelable(this.f91428c, i11);
        List<Icon> list = this.f91429d;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator c11 = J.c(dest, 1, list);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), i11);
        }
    }
}
