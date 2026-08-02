package com.ironsource;

import xsna.zcl;

/* renamed from: com.ironsource.a7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC4222a7 {
    SendEvent(0),
    NativeController(1);

    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.a7$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final EnumC4222a7 a(int i) {
            EnumC4222a7 enumC4222a7;
            EnumC4222a7[] values = EnumC4222a7.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4222a7 = null;
                    break;
                }
                enumC4222a7 = values[i2];
                if (enumC4222a7.b() == i) {
                    break;
                }
                i2++;
            }
            return enumC4222a7 == null ? EnumC4222a7.SendEvent : enumC4222a7;
        }

        private a() {
        }
    }

    EnumC4222a7(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
