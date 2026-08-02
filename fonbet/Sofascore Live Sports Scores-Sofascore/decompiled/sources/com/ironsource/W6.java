package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum W6 {
    SendEvent(0),
    NativeController(1);


    @NotNull
    public static final a b = new a(null);
    private final int a;

    W6(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final W6 a(int i) {
            W6 w6;
            W6[] values = W6.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    w6 = null;
                    break;
                }
                w6 = values[i2];
                if (w6.b() == i) {
                    break;
                }
                i2++;
            }
            return w6 == null ? W6.SendEvent : w6;
        }

        private a() {
        }
    }
}
