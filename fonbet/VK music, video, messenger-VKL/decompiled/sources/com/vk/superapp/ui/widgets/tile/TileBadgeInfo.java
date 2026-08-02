package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TileBadgeInfo.kt */
/* loaded from: classes6.dex */
public final class TileBadgeInfo implements Parcelable {
    public static final Parcelable.Creator<TileBadgeInfo> CREATOR = new a();
    public final BadgeType b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TileBadgeInfo.kt */
    public static final class BadgeType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeType[] $VALUES;
        public static final BadgeType DISCOUNT;
        public static final BadgeType NEW;
        public static final BadgeType TEXT;

        static {
            BadgeType badgeType = new BadgeType("NEW", 0);
            NEW = badgeType;
            BadgeType badgeType2 = new BadgeType("DISCOUNT", 1);
            DISCOUNT = badgeType2;
            BadgeType badgeType3 = new BadgeType("TEXT", 2);
            TEXT = badgeType3;
            BadgeType[] badgeTypeArr = {badgeType, badgeType2, badgeType3};
            $VALUES = badgeTypeArr;
            $ENTRIES = new asp(badgeTypeArr);
        }

        public BadgeType() {
            throw null;
        }

        public static BadgeType valueOf(String str) {
            return (BadgeType) Enum.valueOf(BadgeType.class, str);
        }

        public static BadgeType[] values() {
            return (BadgeType[]) $VALUES.clone();
        }
    }

    /* compiled from: TileBadgeInfo.kt */
    public static final class a implements Parcelable.Creator<TileBadgeInfo> {
        @Override // android.os.Parcelable.Creator
        public final TileBadgeInfo createFromParcel(Parcel parcel) {
            return new TileBadgeInfo(BadgeType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TileBadgeInfo[] newArray(int i) {
            return new TileBadgeInfo[i];
        }
    }

    public TileBadgeInfo(BadgeType badgeType, String str, String str2, String str3) {
        this.b = badgeType;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TileBadgeInfo)) {
            return false;
        }
        TileBadgeInfo tileBadgeInfo = (TileBadgeInfo) obj;
        return this.b == tileBadgeInfo.b && epx.f(this.c, tileBadgeInfo.c) && epx.f(this.d, tileBadgeInfo.d) && epx.f(this.e, tileBadgeInfo.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileBadgeInfo(type=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", textColor=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public /* synthetic */ TileBadgeInfo(BadgeType badgeType, String str, String str2, String str3, int i, zcl zclVar) {
        this(badgeType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
