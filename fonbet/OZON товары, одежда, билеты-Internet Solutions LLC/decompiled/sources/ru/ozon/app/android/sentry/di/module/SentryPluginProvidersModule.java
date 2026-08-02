package ru.ozon.app.android.sentry.di.module;

import Ld0.e;
import Od0.d;
import gg0.C6732b;
import ig0.InterfaceC7075a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/sentry/di/module/SentryPluginProvidersModule;", "", "<init>", "()V", "LOd0/d;", "LLd0/e;", "provideSentryHelperPluginProvider", "()LOd0/d;", "sentry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SentryPluginProvidersModule {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ru.ozon.app.android.sentry.di.module.SentryPluginProvidersModule$provideSentryHelperPluginProvider$sentryHelperConfig$1] */
    @NotNull
    public final d<e> provideSentryHelperPluginProvider() {
        ?? config = new InterfaceC7075a() { // from class: ru.ozon.app.android.sentry.di.module.SentryPluginProvidersModule$provideSentryHelperPluginProvider$sentryHelperConfig$1
            private final String testDsn = "https://ea6026f980bf4253b7bb0ed9cb16adb0@sentry-stage.s.o3.ru/337";
            private final String hashCommit = "668c22aa";

            @Override // ig0.InterfaceC7075a
            public String getHashCommit() {
                return this.hashCommit;
            }

            @Override // ig0.InterfaceC7075a
            public String getTestDsn() {
                return this.testDsn;
            }
        };
        Intrinsics.checkNotNullParameter(config, "config");
        int i11 = jg0.d.f70080e;
        return new C6732b(config, jg0.d.c(), jg0.d.e());
    }
}
