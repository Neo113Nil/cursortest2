package com.vk.common.links.contract;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vkontakte.android.MainActivity;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: AnonymousLinker.kt */
/* loaded from: classes17.dex */
public interface AnonymousLinker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnonymousLinker.kt */
    public static final class CallLinkType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CallLinkType[] $VALUES;
        public static final CallLinkType LONG;
        public static final CallLinkType SHORT;

        static {
            CallLinkType callLinkType = new CallLinkType("LONG", 0);
            LONG = callLinkType;
            CallLinkType callLinkType2 = new CallLinkType("SHORT", 1);
            SHORT = callLinkType2;
            CallLinkType[] callLinkTypeArr = {callLinkType, callLinkType2};
            $VALUES = callLinkTypeArr;
            $ENTRIES = new asp(callLinkTypeArr);
        }

        public CallLinkType() {
            throw null;
        }

        public static CallLinkType valueOf(String str) {
            return (CallLinkType) Enum.valueOf(CallLinkType.class, str);
        }

        public static CallLinkType[] values() {
            return (CallLinkType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnonymousLinker.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CALL;
        public static final Type CALL_JOIN;
        public static final Type UNAUTH_WEB;
        public static final Type UNKNOWN;

        static {
            Type type = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = type;
            Type type2 = new Type("CALL", 1);
            CALL = type2;
            Type type3 = new Type("CALL_JOIN", 2);
            CALL_JOIN = type3;
            Type type4 = new Type("UNAUTH_WEB", 3);
            UNAUTH_WEB = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    /* compiled from: AnonymousLinker.kt */
    public static final class a {
        public final CallLinkType a;
        public final String b;

        public a(CallLinkType callLinkType, String str) {
            this.a = callLinkType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallLinkResult(callLinkType=");
            sb.append(this.a);
            sb.append(", url=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: AnonymousLinker.kt */
    public static final class b {
        public static final b c = new b(Type.UNKNOWN, "");
        public final Type a;
        public final String b;

        public b(Type type, String str) {
            this.a = type;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkResult(type=");
            sb.append(this.a);
            sb.append(", url=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: AnonymousLinker.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.CALL_JOIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    default a a(MainActivity mainActivity, String str) {
        b c2 = c(mainActivity, str);
        Type type = c2.a;
        String str2 = c2.b;
        int i = c.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return new a(CallLinkType.LONG, str2);
        }
        if (i != 2) {
            return null;
        }
        return new a(CallLinkType.SHORT, str2);
    }

    default String b(MainActivity mainActivity, String str) {
        b c2 = c(mainActivity, str);
        if (c2.a != Type.UNAUTH_WEB) {
            c2 = null;
        }
        if (c2 != null) {
            return c2.b;
        }
        return null;
    }

    b c(Context context, String str);
}
