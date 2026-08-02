package mj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj0.InterfaceC9075e;

/* renamed from: mj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8344a {

    /* renamed from: mj0.a$a, reason: collision with other inner class name */
    public static final class C1279a implements InterfaceC8344a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC9075e<?> f76004a;

        public C1279a(@NotNull InterfaceC9075e<?> configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f76004a = configuration;
        }

        @NotNull
        public final InterfaceC9075e<?> a() {
            return this.f76004a;
        }
    }

    /* renamed from: mj0.a$b */
    public static final class b implements InterfaceC8344a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC9075e<?> f76005a;

        public b(@NotNull InterfaceC9075e<?> configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f76005a = configuration;
        }

        @NotNull
        public final InterfaceC9075e<?> a() {
            return this.f76005a;
        }
    }
}
