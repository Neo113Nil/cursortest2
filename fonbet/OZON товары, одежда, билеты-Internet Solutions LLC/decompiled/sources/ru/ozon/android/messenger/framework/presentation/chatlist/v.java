package ru.ozon.android.messenger.framework.presentation.chatlist;

import C.o0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class v implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f90557a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f90558b;

    /* renamed from: c, reason: collision with root package name */
    private final String f90559c;

    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new v(readString, valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i11) {
            return new v[i11];
        }
    }

    public v() {
        this(null, null, null);
    }

    public final String a() {
        return this.f90557a;
    }

    public final String b() {
        return this.f90559c;
    }

    public final Boolean c() {
        return this.f90558b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f90557a, vVar.f90557a) && Intrinsics.d(this.f90558b, vVar.f90558b) && Intrinsics.d(this.f90559c, vVar.f90559c);
    }

    public final int hashCode() {
        String str = this.f90557a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f90558b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f90559c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InitialFilterData(chatId=");
        sb2.append(this.f90557a);
        sb2.append(", onlyUnread=");
        sb2.append(this.f90558b);
        sb2.append(", chatType=");
        return o0.c(sb2, this.f90559c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90557a);
        Boolean bool = this.f90558b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool);
        }
        dest.writeString(this.f90559c);
    }

    public v(String str, Boolean bool, String str2) {
        this.f90557a = str;
        this.f90558b = bool;
        this.f90559c = str2;
    }
}
