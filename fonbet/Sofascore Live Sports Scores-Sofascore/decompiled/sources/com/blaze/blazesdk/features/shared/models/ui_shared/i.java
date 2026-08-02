package com.blaze.blazesdk.features.shared.models.ui_shared;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.o6a;
import defpackage.w1l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new a();
    public final BlazeLinkActionHandleType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final f f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readInt() == 0 ? null : BlazeLinkActionHandleType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? f.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new i[i];
        }
    }

    public i(@Nullable BlazeLinkActionHandleType blazeLinkActionHandleType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable f fVar) {
        w1l.y(str, str2, str3, str4);
        this.a = blazeLinkActionHandleType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = fVar;
    }

    public static i copy$default(i iVar, BlazeLinkActionHandleType blazeLinkActionHandleType, String str, String str2, String str3, String str4, f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeLinkActionHandleType = iVar.a;
        }
        if ((i & 2) != 0) {
            str = iVar.b;
        }
        if ((i & 4) != 0) {
            str2 = iVar.c;
        }
        if ((i & 8) != 0) {
            str3 = iVar.d;
        }
        if ((i & 16) != 0) {
            str4 = iVar.e;
        }
        if ((i & 32) != 0) {
            fVar = iVar.f;
        }
        f fVar2 = fVar;
        iVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        String str5 = str4;
        String str6 = str2;
        return new i(blazeLinkActionHandleType, str, str6, str3, str5, fVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && Intrinsics.c(this.b, iVar.b) && Intrinsics.c(this.c, iVar.c) && Intrinsics.c(this.d, iVar.d) && Intrinsics.c(this.e, iVar.e) && Intrinsics.c(this.f, iVar.f);
    }

    public final int hashCode() {
        BlazeLinkActionHandleType blazeLinkActionHandleType = this.a;
        int k = o6a.k(this.e, o6a.k(this.d, o6a.k(this.c, o6a.k(this.b, (blazeLinkActionHandleType == null ? 0 : blazeLinkActionHandleType.hashCode()) * 31))));
        f fVar = this.f;
        return k + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "CtaModel(type=" + this.a + ", text=" + this.b + ", url=" + this.c + ", backgroundColor=" + this.d + ", textColor=" + this.e + ", enhancements=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        BlazeLinkActionHandleType blazeLinkActionHandleType = this.a;
        if (blazeLinkActionHandleType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(blazeLinkActionHandleType.name());
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        f fVar = this.f;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i);
        }
    }
}
