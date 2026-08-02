package ru.ozon.app.android.storage.logging;

import Lc.b;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.h;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00070\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorageImpl;", "Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "Lio/reactivex/h;", "Lru/ozon/app/android/storage/logging/LoggingLevel;", "observeLevel", "()Lio/reactivex/h;", "Landroid/content/SharedPreferences;", "", "", "maps", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicInteger;", "cache", "Ljava/util/concurrent/atomic/AtomicInteger;", "LLc/b;", "kotlin.jvm.PlatformType", "processor", "LLc/b;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getLevel", "()Lru/ozon/app/android/storage/logging/LoggingLevel;", "setLevel", "(Lru/ozon/app/android/storage/logging/LoggingLevel;)V", "level", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpLoggingLevelStorageImpl implements HttpLoggingLevelStorage {

    @NotNull
    private static final LoggingLevel DEFAULT_LOG_LEVEL = LoggingLevel.BASIC;

    @NotNull
    private final AtomicInteger cache;

    @NotNull
    private final Map<Integer, LoggingLevel> maps;

    @NotNull
    private final b<LoggingLevel> processor;

    @NotNull
    private final SharedPreferences sharedPreferences;

    public HttpLoggingLevelStorageImpl(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
        LoggingLevel[] values = LoggingLevel.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (LoggingLevel loggingLevel : values) {
            arrayList.add(new Pair(Integer.valueOf(loggingLevel.getValue()), loggingLevel));
        }
        this.maps = U.s(arrayList);
        this.cache = new AtomicInteger(this.sharedPreferences.getInt("ru.ozon.app.android.storage.logging.HttpLoggingLevelStorageImpl.PREFS_LOG_LEVEL", DEFAULT_LOG_LEVEL.getValue()));
        b<LoggingLevel> n11 = b.n(getLevel());
        Intrinsics.checkNotNullExpressionValue(n11, "createDefault(...)");
        this.processor = n11;
    }

    @Override // ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage
    @NotNull
    public LoggingLevel getLevel() {
        LoggingLevel loggingLevel = this.maps.get(Integer.valueOf(this.cache.get()));
        return loggingLevel == null ? DEFAULT_LOG_LEVEL : loggingLevel;
    }

    @Override // ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage
    @NotNull
    public h<LoggingLevel> observeLevel() {
        return this.processor;
    }

    @Override // ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage
    public void setLevel(@NotNull LoggingLevel value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cache.set(value.getValue());
        this.processor.onNext(value);
        this.processor.o();
        this.sharedPreferences.edit().putInt("ru.ozon.app.android.storage.logging.HttpLoggingLevelStorageImpl.PREFS_LOG_LEVEL", value.getValue()).apply();
    }
}
