package com.vk.api.internal;

import defpackage.k0;
import xsna.asp;
import xsna.drm0;
import xsna.l8g0;
import xsna.zrp;

/* compiled from: LongPollCall.kt */
/* loaded from: classes15.dex */
public final class LongPollCall {
    public final String a;
    public final String b;
    public final long c;
    public final l8g0 d;
    public final Type e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LongPollCall.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type GET;
        public static final Type POST;

        static {
            Type type = new Type("POST", 0);
            POST = type;
            Type type2 = new Type("GET", 1);
            GET = type2;
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

    public LongPollCall(String str, String str2, long j, l8g0 l8g0Var, Type type) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = l8g0Var;
        this.e = type;
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Illegal serverUrl value: ".concat(str));
        }
        if (drm0.N(str2)) {
            throw new IllegalArgumentException("Illegal query value: ".concat(str2));
        }
        if (j <= 0) {
            throw new IllegalArgumentException(k0.a(j, "Illegal timeout value: "));
        }
    }

    public final String a() {
        return this.a;
    }
}
