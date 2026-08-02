package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.l9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC4180l9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);


    @NotNull
    public static final a b = new a(null);
    private final int a;

    EnumC4180l9(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.l9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4180l9 a(int i) {
            EnumC4180l9 enumC4180l9;
            EnumC4180l9[] values = EnumC4180l9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4180l9 = null;
                    break;
                }
                enumC4180l9 = values[i2];
                if (enumC4180l9.b() == i) {
                    break;
                }
                i2++;
            }
            return enumC4180l9 == null ? EnumC4180l9.APP_ACTIVITY : enumC4180l9;
        }

        private a() {
        }
    }
}
