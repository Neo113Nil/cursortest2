package ru.ozon.app.android.initializers.sentry;

import gi.C6740b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sentry.di.SentryApiComponent;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/initializers/sentry/SentryPostInitializer;", "", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "dependencyStorage", "<init>", "(Lgi/b;)V", "", "init", "()V", "Lgi/b;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SentryPostInitializer {

    @NotNull
    private final C6740b dependencyStorage;

    public SentryPostInitializer(@NotNull C6740b dependencyStorage) {
        Intrinsics.checkNotNullParameter(dependencyStorage, "dependencyStorage");
        this.dependencyStorage = dependencyStorage;
    }

    public final void init() {
        SentryApiComponent sentryApiComponent = (SentryApiComponent) this.dependencyStorage.b(SentryApiComponent.class);
        sentryApiComponent.provideOzonSentryHelperApi().setupContextInfo();
        sentryApiComponent.provideSentryFlagsRepository().storeAllFlags();
    }
}
