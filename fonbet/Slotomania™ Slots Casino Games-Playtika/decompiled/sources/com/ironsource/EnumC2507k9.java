package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.ironsource.k9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC2507k9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);

    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.k9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC2507k9 a(int i) {
            EnumC2507k9 enumC2507k9;
            EnumC2507k9[] values = EnumC2507k9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC2507k9 = null;
                    break;
                }
                enumC2507k9 = values[i2];
                if (enumC2507k9.b() == i) {
                    break;
                }
                i2++;
            }
            return enumC2507k9 == null ? EnumC2507k9.APP_ACTIVITY : enumC2507k9;
        }

        private a() {
        }
    }

    EnumC2507k9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
