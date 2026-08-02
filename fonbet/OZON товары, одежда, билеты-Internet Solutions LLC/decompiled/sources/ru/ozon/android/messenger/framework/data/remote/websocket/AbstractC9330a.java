package ru.ozon.android.messenger.framework.data.remote.websocket;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9330a {

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.a$a, reason: collision with other inner class name */
    public static final class C1590a extends AbstractC9330a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1590a f87982a = new C1590a(0);
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.a$b */
    public static final class b extends AbstractC9330a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f87983a = new b(0);
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.a$c */
    public static final class c extends AbstractC9330a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f87984a = new c(0);
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.a$d */
    public static final class d extends AbstractC9330a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f87985a = new d(0);
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.a$e */
    public static final class e extends AbstractC9330a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Throwable f87986a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull Throwable exception) {
            super(0);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f87986a = exception;
        }

        @NotNull
        public final Throwable a() {
            return this.f87986a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.f87986a, ((e) obj).f87986a);
        }

        public final int hashCode() {
            return this.f87986a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Error(exception=" + this.f87986a + ")";
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.a$f */
    public static final class f extends AbstractC9330a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f87987a = new f(0);
    }

    public /* synthetic */ AbstractC9330a(int i11) {
        this();
    }

    private AbstractC9330a() {
    }
}
