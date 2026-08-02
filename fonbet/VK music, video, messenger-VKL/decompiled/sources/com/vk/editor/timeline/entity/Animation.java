package com.vk.editor.timeline.entity;

import xsna.asp;
import xsna.zrp;

/* compiled from: Animation.kt */
/* loaded from: classes18.dex */
public final class Animation {
    public final Type a;
    public float b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Animation.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Add;
        public static final Type Delete;
        public static final Type Split;

        static {
            Type type = new Type("Add", 0);
            Add = type;
            Type type2 = new Type("Delete", 1);
            Delete = type2;
            Type type3 = new Type("Split", 2);
            Split = type3;
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

    public Animation(Type type) {
        this.a = type;
    }
}
