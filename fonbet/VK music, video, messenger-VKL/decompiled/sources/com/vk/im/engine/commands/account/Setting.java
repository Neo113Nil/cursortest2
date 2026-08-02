package com.vk.im.engine.commands.account;

import xsna.asp;
import xsna.zrp;

/* compiled from: AccountInfoSetCmd.kt */
/* loaded from: classes2.dex */
public abstract class Setting {
    public final String a;

    /* compiled from: AccountInfoSetCmd.kt */
    public static final class ImUserNameType extends Setting {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AccountInfoSetCmd.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type CONTACT;
            public static final Type VK;
            private final String value;

            static {
                Type type = new Type("VK", 0, "vk");
                VK = type;
                Type type2 = new Type("CONTACT", 1, "contact");
                CONTACT = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            public Type(String str, int i, String str2) {
                this.value = str2;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            public final String h() {
                return this.value;
            }
        }

        public ImUserNameType(Type type) {
            super(type.h());
        }
    }

    public Setting(String str) {
        this.a = str;
    }
}
