package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.s4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC4300s4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    @NotNull
    public static final a b = new a(null);

    @NotNull
    private final String a;

    EnumC4300s4(String str) {
        this.a = str;
    }

    @NotNull
    public final String b() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.s4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4300s4 a(@Nullable String str) {
            EnumC4300s4 enumC4300s4;
            EnumC4300s4[] values = EnumC4300s4.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC4300s4 = null;
                    break;
                }
                enumC4300s4 = values[i];
                if (Intrinsics.c(enumC4300s4.b(), str)) {
                    break;
                }
                i++;
            }
            return enumC4300s4 == null ? EnumC4300s4.NONE : enumC4300s4;
        }

        private a() {
        }
    }

    @NotNull
    public static final EnumC4300s4 a(@Nullable String str) {
        return b.a(str);
    }
}
