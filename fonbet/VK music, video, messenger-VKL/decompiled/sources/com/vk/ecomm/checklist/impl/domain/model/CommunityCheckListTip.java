package com.vk.ecomm.checklist.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CommunityCheckListTip.kt */
/* loaded from: classes18.dex */
public final class CommunityCheckListTip {
    public final String a;
    public final String b;
    public final String c;
    public final Type d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityCheckListTip.kt */
    public static final class Type implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ACTION_BUTTON;
        public static final Type ADDRESS;
        public static final Type ADS;
        public static final Type COVER_IMAGE;
        public static final Parcelable.Creator<Type> CREATOR;
        public static final Type DESCRIPTION;
        public static final Type INVITE_FRIENDS;
        public static final Type LOAD_AVATAR;
        public static final Type MAKE_POST;
        public static final Type MARKET_ITEM;
        public static final Type SHORT_URL;
        public static final Type SUBSCRIBE_VK_NEWS;
        public static final Type UNKNOWN;
        public static final Type VKCONNECT;

        /* compiled from: CommunityCheckListTip.kt */
        public static final class a implements Parcelable.Creator<Type> {
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                return Type.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        static {
            Type type = new Type("LOAD_AVATAR", 0);
            LOAD_AVATAR = type;
            Type type2 = new Type(NativeAdContent.ViewTag.AD_DESCRIPTION, 1);
            DESCRIPTION = type2;
            Type type3 = new Type("SHORT_URL", 2);
            SHORT_URL = type3;
            Type type4 = new Type("ADDRESS", 3);
            ADDRESS = type4;
            Type type5 = new Type("ACTION_BUTTON", 4);
            ACTION_BUTTON = type5;
            Type type6 = new Type("MARKET_ITEM", 5);
            MARKET_ITEM = type6;
            Type type7 = new Type("MAKE_POST", 6);
            MAKE_POST = type7;
            Type type8 = new Type("COVER_IMAGE", 7);
            COVER_IMAGE = type8;
            Type type9 = new Type("SUBSCRIBE_VK_NEWS", 8);
            SUBSCRIBE_VK_NEWS = type9;
            Type type10 = new Type("INVITE_FRIENDS", 9);
            INVITE_FRIENDS = type10;
            Type type11 = new Type("ADS", 10);
            ADS = type11;
            Type type12 = new Type("VKCONNECT", 11);
            VKCONNECT = type12;
            Type type13 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 12);
            UNKNOWN = type13;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            CREATOR = new a();
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public CommunityCheckListTip(String str, String str2, String str3, Type type, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = type;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityCheckListTip)) {
            return false;
        }
        CommunityCheckListTip communityCheckListTip = (CommunityCheckListTip) obj;
        return epx.f(this.a, communityCheckListTip.a) && epx.f(this.b, communityCheckListTip.b) && epx.f(this.c, communityCheckListTip.c) && this.d == communityCheckListTip.d && this.e == communityCheckListTip.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCheckListTip(title=");
        sb.append(this.a);
        sb.append(", miniAppLink=");
        sb.append(this.b);
        sb.append(", internalLink=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", isCompleted=");
        return q0.a(sb, this.e, ')');
    }
}
