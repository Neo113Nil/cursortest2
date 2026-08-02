package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC2579o9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);

    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.o9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC2579o9 a(int i) {
            EnumC2579o9 enumC2579o9;
            EnumC2579o9[] values = EnumC2579o9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC2579o9 = null;
                    break;
                }
                enumC2579o9 = values[i2];
                if (enumC2579o9.a == i) {
                    break;
                }
                i2++;
            }
            return enumC2579o9 == null ? EnumC2579o9.NotSupported : enumC2579o9;
        }

        private a() {
        }
    }

    EnumC2579o9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    public final boolean b(EnumC2579o9 instanceType) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.b() == this.a;
    }
}
