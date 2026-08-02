package com.ironsource;

import xsna.zcl;

/* renamed from: com.ironsource.l9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC4421l9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);

    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.l9$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final EnumC4421l9 a(int i) {
            EnumC4421l9 enumC4421l9;
            EnumC4421l9[] values = EnumC4421l9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4421l9 = null;
                    break;
                }
                enumC4421l9 = values[i2];
                if (enumC4421l9.b() == i) {
                    break;
                }
                i2++;
            }
            return enumC4421l9 == null ? EnumC4421l9.APP_ACTIVITY : enumC4421l9;
        }

        private a() {
        }
    }

    EnumC4421l9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
