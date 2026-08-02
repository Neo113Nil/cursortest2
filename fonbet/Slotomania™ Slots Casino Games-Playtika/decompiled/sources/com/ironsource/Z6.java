package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public enum Z6 {
    SendEvent(0),
    NativeController(1);

    public static final a b = new a(null);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Z6 a(int i) {
            Z6 z6;
            Z6[] values = Z6.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z6 = null;
                    break;
                }
                z6 = values[i2];
                if (z6.b() == i) {
                    break;
                }
                i2++;
            }
            return z6 == null ? Z6.SendEvent : z6;
        }

        private a() {
        }
    }

    Z6(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
