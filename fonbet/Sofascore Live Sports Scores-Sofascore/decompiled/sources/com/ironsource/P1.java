package com.ironsource;

import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class P1 {

    @NotNull
    public static final a a = new a(null);

    public static final void a() {
        a.a();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                Thread.currentThread().getStackTrace()[4].getMethodName();
            }
        }

        private a() {
        }
    }
}
