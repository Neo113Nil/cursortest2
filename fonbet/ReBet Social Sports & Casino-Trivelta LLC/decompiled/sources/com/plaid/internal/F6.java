package com.plaid.internal;

import com.plaid.internal.C3556a6;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class F6 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public static volatile WeakReference<G6> f39250a;

    public static final class a {
        @JvmStatic
        public static void a(@NotNull String eventName, @NotNull Map metadata, @NotNull J6 logLevel) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            WeakReference weakReference = F6.f39250a;
            G6 g62 = weakReference != null ? (G6) weakReference.get() : null;
            if (g62 != null) {
                g62.a(eventName, metadata, logLevel);
                return;
            }
            C3556a6.a.a(C3556a6.f39823a, "RemoteLog: No controller registered, dropping event: " + eventName);
        }

        @JvmStatic
        public static void b(@NotNull Map metadata, @NotNull String eventName) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            a(eventName, metadata, J6.INFO);
        }

        public static void a() {
            Map metadata = MapsKt.emptyMap();
            Intrinsics.checkNotNullParameter("TwilioSNA - processUrl failure", "eventName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            a("TwilioSNA - processUrl failure", metadata, J6.ERROR);
        }

        @JvmStatic
        public static void a(@NotNull Map metadata, @NotNull String eventName) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            a(eventName, metadata, J6.ERROR);
        }
    }
}
