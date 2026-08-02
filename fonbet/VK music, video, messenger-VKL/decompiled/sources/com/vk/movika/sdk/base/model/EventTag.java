package com.vk.movika.sdk.base.model;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* loaded from: classes3.dex */
public final class EventTag {
    public final f a;
    public final Type b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BIND;
        public static final Type TIMEOUT;

        static {
            Type type = new Type("BIND", 0);
            BIND = type;
            Type type2 = new Type("TIMEOUT", 1);
            TIMEOUT = type2;
            Type[] typeArr = {type, type2};
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

    public EventTag(f fVar, Type type) {
        this.a = fVar;
        this.b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventTag)) {
            return false;
        }
        EventTag eventTag = (EventTag) obj;
        return epx.f(this.a, eventTag.a) && this.b == eventTag.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventTag(event=" + this.a + ", type=" + this.b + ")";
    }
}
