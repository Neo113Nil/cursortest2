package com.vk.profile.community.impl.ui.trust_mark;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.Privacy;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;
import xsna.v11;
import xsna.vu5;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommunityTrustMarksArgs.kt */
/* loaded from: classes5.dex */
public final class CommunityTrustMarksArgs implements Parcelable {
    public static final Parcelable.Creator<CommunityTrustMarksArgs> CREATOR = new a();
    public final boolean b;
    public final TrustMarkData c;
    public final Map<GroupInfo, List<TrustMarkData>> d;
    public final AdminButtons e;
    public final ActionButton f;
    public final ActionButton g;
    public final ActionButton h;

    /* compiled from: CommunityTrustMarksArgs.kt */
    public static final class ActionButton implements Parcelable {
        public static final Parcelable.Creator<ActionButton> CREATOR = new a();
        public final Type b;
        public final int c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CommunityTrustMarksArgs.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type GOODS;
            public static final Type SERVICES;
            public static final Type YCLIENTS;

            static {
                Type type = new Type("YCLIENTS", 0);
                YCLIENTS = type;
                Type type2 = new Type("GOODS", 1);
                GOODS = type2;
                Type type3 = new Type("SERVICES", 2);
                SERVICES = type3;
                Type[] typeArr = {type, type2, type3};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
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
        }

        /* compiled from: CommunityTrustMarksArgs.kt */
        public static final class a implements Parcelable.Creator<ActionButton> {
            @Override // android.os.Parcelable.Creator
            public final ActionButton createFromParcel(Parcel parcel) {
                return new ActionButton(Type.valueOf(parcel.readString()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionButton[] newArray(int i) {
                return new ActionButton[i];
            }
        }

        public ActionButton(Type type, int i) {
            this.b = type;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) obj;
            return this.b == actionButton.b && this.c == actionButton.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionButton(type=");
            sb.append(this.b);
            sb.append(", textResId=");
            return vu5.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            parcel.writeInt(this.c);
        }
    }

    /* compiled from: CommunityTrustMarksArgs.kt */
    public static final class AdminButtons implements Parcelable {
        public static final Parcelable.Creator<AdminButtons> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: CommunityTrustMarksArgs.kt */
        public static final class a implements Parcelable.Creator<AdminButtons> {
            @Override // android.os.Parcelable.Creator
            public final AdminButtons createFromParcel(Parcel parcel) {
                return new AdminButtons(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AdminButtons[] newArray(int i) {
                return new AdminButtons[i];
            }
        }

        public AdminButtons(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdminButtons)) {
                return false;
            }
            AdminButtons adminButtons = (AdminButtons) obj;
            return epx.f(this.b, adminButtons.b) && epx.f(this.c, adminButtons.c) && epx.f(this.d, adminButtons.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdminButtons(deliveryUrl=");
            sb.append(this.b);
            sb.append(", paymentUrl=");
            sb.append(this.c);
            sb.append(", refundUrl=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: CommunityTrustMarksArgs.kt */
    public static final class GroupInfo implements Parcelable {
        public static final Parcelable.Creator<GroupInfo> CREATOR = new a();
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final Integer h;

        /* compiled from: CommunityTrustMarksArgs.kt */
        public static final class a implements Parcelable.Creator<GroupInfo> {
            @Override // android.os.Parcelable.Creator
            public final GroupInfo createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                String readString = parcel.readString();
                boolean z4 = false;
                boolean z5 = true;
                boolean z6 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z;
                    z = z2;
                } else {
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z3;
                }
                return new GroupInfo(readString, z6, z4, z5, z, z2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final GroupInfo[] newArray(int i) {
                return new GroupInfo[i];
            }
        }

        public GroupInfo() {
            this(null, false, false, false, false, false, null, 127, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupInfo)) {
                return false;
            }
            GroupInfo groupInfo = (GroupInfo) obj;
            return epx.f(this.b, groupInfo.b) && this.c == groupInfo.c && this.d == groupInfo.d && this.e == groupInfo.e && this.f == groupInfo.f && this.g == groupInfo.g && epx.f(this.h, groupInfo.h);
        }

        public final int hashCode() {
            String str = this.b;
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            Integer num = this.h;
            return b + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupInfo(header=");
            sb.append(this.b);
            sb.append(", isAdminGroup=");
            sb.append(this.c);
            sb.append(", primary=");
            sb.append(this.d);
            sb.append(", showTopDivider=");
            sb.append(this.e);
            sb.append(", hasBottomPadding=");
            sb.append(this.f);
            sb.append(", showMore=");
            sb.append(this.g);
            sb.append(", count=");
            return uqi.b(sb, this.h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            Integer num = this.h;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
        }

        public GroupInfo(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num) {
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = z5;
            this.h = num;
        }

        public /* synthetic */ GroupInfo(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? null : num);
        }
    }

    /* compiled from: CommunityTrustMarksArgs.kt */
    public static final class a implements Parcelable.Creator<CommunityTrustMarksArgs> {
        @Override // android.os.Parcelable.Creator
        public final CommunityTrustMarksArgs createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            TrustMarkData createFromParcel = TrustMarkData.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                GroupInfo createFromParcel2 = GroupInfo.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(TrustMarkData.CREATOR, parcel, arrayList, i2, 1);
                }
                linkedHashMap.put(createFromParcel2, arrayList);
            }
            return new CommunityTrustMarksArgs(z, createFromParcel, linkedHashMap, AdminButtons.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ActionButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityTrustMarksArgs[] newArray(int i) {
            return new CommunityTrustMarksArgs[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommunityTrustMarksArgs(boolean z, TrustMarkData trustMarkData, Map<GroupInfo, ? extends List<TrustMarkData>> map, AdminButtons adminButtons, ActionButton actionButton, ActionButton actionButton2, ActionButton actionButton3) {
        this.b = z;
        this.c = trustMarkData;
        this.d = map;
        this.e = adminButtons;
        this.f = actionButton;
        this.g = actionButton2;
        this.h = actionButton3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityTrustMarksArgs)) {
            return false;
        }
        CommunityTrustMarksArgs communityTrustMarksArgs = (CommunityTrustMarksArgs) obj;
        return this.b == communityTrustMarksArgs.b && epx.f(this.c, communityTrustMarksArgs.c) && epx.f(this.d, communityTrustMarksArgs.d) && epx.f(this.e, communityTrustMarksArgs.e) && epx.f(this.f, communityTrustMarksArgs.f) && epx.f(this.g, communityTrustMarksArgs.g) && epx.f(this.h, communityTrustMarksArgs.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + v11.a((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31, 31, this.d)) * 31;
        ActionButton actionButton = this.f;
        int hashCode2 = (hashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        ActionButton actionButton2 = this.g;
        int hashCode3 = (hashCode2 + (actionButton2 == null ? 0 : actionButton2.hashCode())) * 31;
        ActionButton actionButton3 = this.h;
        return hashCode3 + (actionButton3 != null ? actionButton3.hashCode() : 0);
    }

    public final String toString() {
        return "CommunityTrustMarksArgs(isAdmin=" + this.b + ", mainTrustMark=" + this.c + ", groups=" + this.d + ", adminButtons=" + this.e + ", bookingButton=" + this.f + ", goodButton=" + this.g + ", serviceButton=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
        Map<GroupInfo, List<TrustMarkData>> map = this.d;
        parcel.writeInt(map.size());
        for (Map.Entry<GroupInfo, List<TrustMarkData>> entry : map.entrySet()) {
            entry.getKey().writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, entry.getValue());
            while (a2.hasNext()) {
                ((TrustMarkData) a2.next()).writeToParcel(parcel, i);
            }
        }
        this.e.writeToParcel(parcel, i);
        ActionButton actionButton = this.f;
        if (actionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton.writeToParcel(parcel, i);
        }
        ActionButton actionButton2 = this.g;
        if (actionButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton2.writeToParcel(parcel, i);
        }
        ActionButton actionButton3 = this.h;
        if (actionButton3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton3.writeToParcel(parcel, i);
        }
    }

    /* compiled from: CommunityTrustMarksArgs.kt */
    public static final class TrustMarkData implements Parcelable {
        public static final Parcelable.Creator<TrustMarkData> CREATOR = new a();
        public final Type b;
        public final String c;
        public final Integer d;
        public final String e;
        public final String f;
        public final boolean g;
        public final Integer h;
        public final Integer i;
        public final String j;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CommunityTrustMarksArgs.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type DATE;
            public static final Type DELIVERY_FREE;
            public static final Type DELIVERY_INFO;
            public static final Type DELIVERY_SELF;
            public static final Type DELIVERY_TEXT;
            public static final Type DOCS;
            public static final Type FRIENDS;
            public static final Type LINKS;
            public static final Type NONE;
            public static final Type OZON;
            public static final Type OZON_DELIVERY;
            public static final Type OZON_ORDER;
            public static final Type OZON_PAYMENT;
            public static final Type PAYMENT_TEXT;
            public static final Type PAYMENT_VKPAY;
            public static final Type PHONE;
            public static final Type POPULAR;
            public static final Type REFUND;
            public static final Type YCLIENTS;
            public static final Type YCLIENTS_DATE;
            public static final Type YCLIENTS_SERVICE;

            static {
                Type type = new Type("NONE", 0);
                NONE = type;
                Type type2 = new Type("DOCS", 1);
                DOCS = type2;
                Type type3 = new Type("POPULAR", 2);
                POPULAR = type3;
                Type type4 = new Type(Privacy.FRIENDS, 3);
                FRIENDS = type4;
                Type type5 = new Type("DATE", 4);
                DATE = type5;
                Type type6 = new Type("YCLIENTS", 5);
                YCLIENTS = type6;
                Type type7 = new Type("YCLIENTS_SERVICE", 6);
                YCLIENTS_SERVICE = type7;
                Type type8 = new Type("YCLIENTS_DATE", 7);
                YCLIENTS_DATE = type8;
                Type type9 = new Type("OZON", 8);
                OZON = type9;
                Type type10 = new Type("OZON_ORDER", 9);
                OZON_ORDER = type10;
                Type type11 = new Type("OZON_PAYMENT", 10);
                OZON_PAYMENT = type11;
                Type type12 = new Type("OZON_DELIVERY", 11);
                OZON_DELIVERY = type12;
                Type type13 = new Type("DELIVERY_TEXT", 12);
                DELIVERY_TEXT = type13;
                Type type14 = new Type("DELIVERY_FREE", 13);
                DELIVERY_FREE = type14;
                Type type15 = new Type("DELIVERY_INFO", 14);
                DELIVERY_INFO = type15;
                Type type16 = new Type("DELIVERY_SELF", 15);
                DELIVERY_SELF = type16;
                Type type17 = new Type("PAYMENT_TEXT", 16);
                PAYMENT_TEXT = type17;
                Type type18 = new Type("PAYMENT_VKPAY", 17);
                PAYMENT_VKPAY = type18;
                Type type19 = new Type("REFUND", 18);
                REFUND = type19;
                Type type20 = new Type("PHONE", 19);
                PHONE = type20;
                Type type21 = new Type("LINKS", 20);
                LINKS = type21;
                Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
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
        }

        /* compiled from: CommunityTrustMarksArgs.kt */
        public static final class a implements Parcelable.Creator<TrustMarkData> {
            @Override // android.os.Parcelable.Creator
            public final TrustMarkData createFromParcel(Parcel parcel) {
                Integer valueOf;
                Integer num;
                Type valueOf2 = Type.valueOf(parcel.readString());
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                    num = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                    num = null;
                }
                String readString2 = parcel.readString();
                Integer num2 = num;
                String readString3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                Integer valueOf3 = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    num2 = Integer.valueOf(parcel.readInt());
                }
                return new TrustMarkData(valueOf2, readString, valueOf, readString2, readString3, z, valueOf3, num2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TrustMarkData[] newArray(int i) {
                return new TrustMarkData[i];
            }
        }

        public TrustMarkData(Type type, String str, Integer num, String str2, String str3, boolean z, Integer num2, Integer num3, String str4) {
            this.b = type;
            this.c = str;
            this.d = num;
            this.e = str2;
            this.f = str3;
            this.g = z;
            this.h = num2;
            this.i = num3;
            this.j = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrustMarkData)) {
                return false;
            }
            TrustMarkData trustMarkData = (TrustMarkData) obj;
            return this.b == trustMarkData.b && epx.f(this.c, trustMarkData.c) && epx.f(this.d, trustMarkData.d) && epx.f(this.e, trustMarkData.e) && epx.f(this.f, trustMarkData.f) && this.g == trustMarkData.g && epx.f(this.h, trustMarkData.h) && epx.f(this.i, trustMarkData.i) && epx.f(this.j, trustMarkData.j);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
            Integer num = this.d;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.e;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int b = qoy.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
            Integer num2 = this.h;
            int hashCode3 = (b + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.i;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str3 = this.j;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrustMarkData(type=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(this.c);
            sb.append(", imageResId=");
            sb.append(this.d);
            sb.append(", imageUrl=");
            sb.append(this.e);
            sb.append(", linkUrl=");
            sb.append(this.f);
            sb.append(", hasButton=");
            sb.append(this.g);
            sb.append(", buttonTextResId=");
            sb.append(this.h);
            sb.append(", iconResId=");
            sb.append(this.i);
            sb.append(", description=");
            return ho8.a(sb, this.j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            parcel.writeString(this.c);
            Integer num = this.d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g ? 1 : 0);
            Integer num2 = this.h;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            Integer num3 = this.i;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            parcel.writeString(this.j);
        }

        public /* synthetic */ TrustMarkData(Type type, String str, Integer num, String str2, String str3, boolean z, Integer num2, Integer num3, String str4, int i, zcl zclVar) {
            this(type, str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : str4);
        }
    }
}
