package com.vk.dto.newsfeed.entries;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import xsna.asp;
import xsna.zrp;

/* compiled from: Copyright.kt */
/* loaded from: classes18.dex */
public final class Copyright extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Copyright> CREATOR = new a();
    public final String b;
    public final UserId c;
    public final String d;
    public final Owner e;
    public final Type f;
    public final String g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Copyright.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type APP;
        public static final Type ARTIST;
        public static final Type EXTERNAL_LINK;
        public static final Type OWNER;
        public static final Type UNKNOWN;
        public static final Type VK_APP;

        static {
            Type type = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = type;
            Type type2 = new Type("OWNER", 1);
            OWNER = type2;
            Type type3 = new Type("VK_APP", 2);
            VK_APP = type3;
            Type type4 = new Type("APP", 3);
            APP = type4;
            Type type5 = new Type("ARTIST", 4);
            ARTIST = type5;
            Type type6 = new Type("EXTERNAL_LINK", 5);
            EXTERNAL_LINK = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
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

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Copyright> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Copyright a(Serializer serializer) {
            Type type;
            String H = serializer.H();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            String H2 = serializer.H();
            Owner owner = (Owner) serializer.G(Owner.class.getClassLoader());
            try {
                type = Type.values()[serializer.u()];
            } catch (Exception unused) {
                type = Type.UNKNOWN;
            }
            Type type2 = type;
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            return new Copyright(H, userId, H2, owner, type2, H3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Copyright[i];
        }
    }

    public Copyright(String str, UserId userId, String str2, Owner owner, Type type, String str3) {
        this.b = str;
        this.c = userId;
        this.d = str2;
        this.e = owner;
        this.f = type;
        this.g = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.S(this.f.ordinal());
        serializer.j0(this.g);
    }
}
