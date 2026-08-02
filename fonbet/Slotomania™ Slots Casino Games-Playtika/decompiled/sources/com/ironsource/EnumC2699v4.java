package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2699v4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");

    public static final a b = new a(null);
    private final String a;

    /* renamed from: com.ironsource.v4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final EnumC2699v4 a(String str) {
            EnumC2699v4 enumC2699v4;
            EnumC2699v4[] values = EnumC2699v4.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC2699v4 = null;
                    break;
                }
                enumC2699v4 = values[i];
                if (Intrinsics.areEqual(enumC2699v4.b(), str)) {
                    break;
                }
                i++;
            }
            return enumC2699v4 == null ? EnumC2699v4.NONE : enumC2699v4;
        }

        private a() {
        }
    }

    EnumC2699v4(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    @JvmStatic
    public static final EnumC2699v4 a(String str) {
        return b.a(str);
    }
}
