package ru.ozon.app.android.storage.logging;

import io.reactivex.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\n\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;", "", "Lio/reactivex/h;", "Lru/ozon/app/android/storage/logging/LoggingLevel;", "observeLevel", "()Lio/reactivex/h;", "getLevel", "()Lru/ozon/app/android/storage/logging/LoggingLevel;", "setLevel", "(Lru/ozon/app/android/storage/logging/LoggingLevel;)V", "level", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HttpLoggingLevelStorage {
    @NotNull
    LoggingLevel getLevel();

    @NotNull
    h<LoggingLevel> observeLevel();

    void setLevel(@NotNull LoggingLevel loggingLevel);
}
