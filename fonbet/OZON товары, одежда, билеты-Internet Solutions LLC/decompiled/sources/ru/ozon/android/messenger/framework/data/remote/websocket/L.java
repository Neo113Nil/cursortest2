package ru.ozon.android.messenger.framework.data.remote.websocket;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class L {

    public static final class a extends L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f87933a = new a(0);
    }

    public static final class b extends L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f87934a = new b(0);
    }

    public static final class c extends L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Throwable f87935a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Throwable exception) {
            super(0);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f87935a = exception;
        }

        @NotNull
        public final Throwable a() {
            return this.f87935a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f87935a, ((c) obj).f87935a);
        }

        public final int hashCode() {
            return this.f87935a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ErrorClose(exception=" + this.f87935a + ")";
        }
    }

    public static final class d extends L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f87936a = new d(0);
    }

    public /* synthetic */ L(int i11) {
        this();
    }

    private L() {
    }
}
