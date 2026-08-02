package com.ironsource;

import xsna.zcl;

/* renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC4493p9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);

    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.p9$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final EnumC4493p9 a(int i) {
            EnumC4493p9 enumC4493p9;
            EnumC4493p9[] values = EnumC4493p9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4493p9 = null;
                    break;
                }
                enumC4493p9 = values[i2];
                if (enumC4493p9.a == i) {
                    break;
                }
                i2++;
            }
            return enumC4493p9 == null ? EnumC4493p9.NotSupported : enumC4493p9;
        }

        private a() {
        }
    }

    EnumC4493p9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    public final boolean b(EnumC4493p9 enumC4493p9) {
        return enumC4493p9.b() == this.a;
    }
}
