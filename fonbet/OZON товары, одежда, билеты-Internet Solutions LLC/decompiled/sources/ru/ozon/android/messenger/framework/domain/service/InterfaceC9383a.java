package ru.ozon.android.messenger.framework.domain.service;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.usecases.P;

/* renamed from: ru.ozon.android.messenger.framework.domain.service.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9383a {

    /* renamed from: ru.ozon.android.messenger.framework.domain.service.a$a, reason: collision with other inner class name */
    public static final class C1636a implements InterfaceC9383a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.data.m f88860a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.core.initialization.d f88861b;

        public C1636a(@NotNull ru.ozon.android.messenger.framework.data.m errorLogger, @NotNull ru.ozon.android.messenger.framework.core.initialization.d messengerConfig) {
            Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
            Intrinsics.checkNotNullParameter(messengerConfig, "messengerConfig");
            this.f88860a = errorLogger;
            this.f88861b = messengerConfig;
        }

        @Override // ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a
        public final void a(@NotNull P.a exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f88860a.b(this.f88861b.getNetworkConfig().b(), exception);
        }
    }

    void a(@NotNull P.a aVar);
}
