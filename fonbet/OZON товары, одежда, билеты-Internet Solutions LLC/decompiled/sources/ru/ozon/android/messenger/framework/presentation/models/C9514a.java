package ru.ozon.android.messenger.framework.presentation.models;

import B90.C2618u;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* renamed from: ru.ozon.android.messenger.framework.presentation.models.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9514a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C9514a> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TextDTO f91423a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<CellDTO> f91424b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<ButtonV3DTO> f91425c;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.models.a$a, reason: collision with other inner class name */
    public static final class C1706a implements Parcelable.Creator<C9514a> {
        @Override // android.os.Parcelable.Creator
        public final C9514a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            TextDTO textDTO = (TextDTO) parcel.readParcelable(C9514a.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            int i12 = 0;
            while (i12 != readInt) {
                i12 = Bi.b.a(C9514a.class, parcel, arrayList, i12, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i11 != readInt2) {
                i11 = Bi.b.a(C9514a.class, parcel, arrayList2, i11, 1);
            }
            return new C9514a(textDTO, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final C9514a[] newArray(int i11) {
            return new C9514a[i11];
        }
    }

    static {
        int i11 = CellDTO.$stable;
        CREATOR = new C1706a();
    }

    public C9514a(@NotNull TextDTO title, @NotNull List<CellDTO> cells, @NotNull List<ButtonV3DTO> buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f91423a = title;
        this.f91424b = cells;
        this.f91425c = buttons;
    }

    public static C9514a a(C9514a c9514a, ArrayList cells) {
        TextDTO title = c9514a.f91423a;
        List<ButtonV3DTO> buttons = c9514a.f91425c;
        c9514a.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new C9514a(title, cells, buttons);
    }

    @NotNull
    public final List<ButtonV3DTO> b() {
        return this.f91425c;
    }

    @NotNull
    public final List<CellDTO> c() {
        return this.f91424b;
    }

    @NotNull
    public final TextDTO d() {
        return this.f91423a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9514a)) {
            return false;
        }
        C9514a c9514a = (C9514a) obj;
        return Intrinsics.d(this.f91423a, c9514a.f91423a) && Intrinsics.d(this.f91424b, c9514a.f91424b) && Intrinsics.d(this.f91425c, c9514a.f91425c);
    }

    public final int hashCode() {
        return this.f91425c.hashCode() + G.g.b(this.f91423a.hashCode() * 31, 31, this.f91424b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionsCurtainVO(title=");
        sb2.append(this.f91423a);
        sb2.append(", cells=");
        sb2.append(this.f91424b);
        sb2.append(", buttons=");
        return C2618u.h(sb2, this.f91425c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91423a, i11);
        Iterator c11 = Bi.a.c(this.f91424b, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), i11);
        }
        Iterator c12 = Bi.a.c(this.f91425c, dest);
        while (c12.hasNext()) {
            dest.writeParcelable((Parcelable) c12.next(), i11);
        }
    }
}
