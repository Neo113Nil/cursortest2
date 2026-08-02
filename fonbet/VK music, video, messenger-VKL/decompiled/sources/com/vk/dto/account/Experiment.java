package com.vk.dto.account;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* compiled from: Experiment.kt */
/* loaded from: classes18.dex */
public final class Experiment {
    public final Type a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Experiment.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type INLINE_COMMENT_PHOTO;
        public static final Type UNKNOWN;
        private final String serverName;

        static {
            Type type = new Type("INLINE_COMMENT_PHOTO", 0, "inline_comment_photo");
            INLINE_COMMENT_PHOTO = type;
            Type type2 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1, null);
            UNKNOWN = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, String str2) {
            this.serverName = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.serverName;
        }
    }

    public Experiment(Type type, String str) {
        this.a = type;
        this.b = str;
    }
}
