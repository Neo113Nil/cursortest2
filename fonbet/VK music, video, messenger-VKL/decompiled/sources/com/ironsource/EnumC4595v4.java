package com.ironsource;

import xsna.epx;
import xsna.zcl;

/* renamed from: com.ironsource.v4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC4595v4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");

    public static final a b = new a(null);
    private final String a;

    /* renamed from: com.ironsource.v4$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final EnumC4595v4 a(String str) {
            EnumC4595v4 enumC4595v4;
            EnumC4595v4[] values = EnumC4595v4.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC4595v4 = null;
                    break;
                }
                enumC4595v4 = values[i];
                if (epx.f(enumC4595v4.b(), str)) {
                    break;
                }
                i++;
            }
            return enumC4595v4 == null ? EnumC4595v4.NONE : enumC4595v4;
        }

        private a() {
        }
    }

    EnumC4595v4(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    public static final EnumC4595v4 a(String str) {
        return b.a(str);
    }
}
