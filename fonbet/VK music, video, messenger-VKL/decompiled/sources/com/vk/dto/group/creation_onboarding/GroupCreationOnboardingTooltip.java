package com.vk.dto.group.creation_onboarding;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.cqm0;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: GroupCreationOnboardingTooltip.kt */
/* loaded from: classes18.dex */
public final class GroupCreationOnboardingTooltip extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupCreationOnboardingTooltip> CREATOR = new a();
    public final Type b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupCreationOnboardingTooltip.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type MARKET_ITEM;
        public static final Type POST;
        public static final Type SHARE_POST;
        public static final Type UNKNOWN;

        /* compiled from: GroupCreationOnboardingTooltip.kt */
        public static final class a {
            public static Type a(String str) {
                Object obj;
                Iterator<E> it = Type.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (cqm0.m(((Type) obj).name()).equals(str)) {
                        break;
                    }
                }
                Type type = (Type) obj;
                return type == null ? Type.UNKNOWN : type;
            }
        }

        static {
            Type type = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = type;
            Type type2 = new Type("POST", 1);
            POST = type2;
            Type type3 = new Type("SHARE_POST", 2);
            SHARE_POST = type3;
            Type type4 = new Type("MARKET_ITEM", 3);
            MARKET_ITEM = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type() {
            throw null;
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GroupCreationOnboardingTooltip> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupCreationOnboardingTooltip a(Serializer serializer) {
            return new GroupCreationOnboardingTooltip(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupCreationOnboardingTooltip[i];
        }
    }

    public GroupCreationOnboardingTooltip(Type type, String str) {
        this.b = type;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.name());
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCreationOnboardingTooltip)) {
            return false;
        }
        GroupCreationOnboardingTooltip groupCreationOnboardingTooltip = (GroupCreationOnboardingTooltip) obj;
        return this.b == groupCreationOnboardingTooltip.b && epx.f(this.c, groupCreationOnboardingTooltip.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupCreationOnboardingTooltip(type=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCreationOnboardingTooltip(Serializer serializer) {
        this(r0, r4 != null ? r4 : "");
        Type.a aVar = Type.Companion;
        String H = serializer.H();
        H = H == null ? "" : H;
        aVar.getClass();
        Type a2 = Type.a.a(H);
        String H2 = serializer.H();
    }
}
