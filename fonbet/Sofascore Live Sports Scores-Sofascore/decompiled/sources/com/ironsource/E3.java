package com.ironsource;

import defpackage.a70;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum E3 {
    Day("d", 86400000),
    Hour(com.mbridge.msdk.foundation.same.report.h.b, 3600000),
    Second("s", 1000);


    @NotNull
    public static final a c = new a(null);

    @NotNull
    private final String a;
    private final long b;

    E3(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public static /* synthetic */ long a(E3 e3, Integer num, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: inMilliseconds");
            return 0L;
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return e3.a(num);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final E3 a(@Nullable String str) {
            for (E3 e3 : E3.values()) {
                if (Intrinsics.c(e3.a, str)) {
                    return e3;
                }
            }
            return null;
        }

        private a() {
        }
    }

    public final long a(@Nullable Integer num) {
        return (num != null ? num.intValue() : 1) * this.b;
    }
}
