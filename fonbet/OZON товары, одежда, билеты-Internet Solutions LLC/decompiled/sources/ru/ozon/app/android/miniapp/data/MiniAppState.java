package ru.ozon.app.android.miniapp.data;

import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006J\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/miniapp/data/MiniAppState;", "", "<init>", "()V", "cache", "", "", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "get", "key", "put", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MiniAppState {

    @NotNull
    public static final MiniAppState INSTANCE = new MiniAppState();

    @NotNull
    private static final Map<String, SparseArray<Parcelable>> cache = new LinkedHashMap();

    private MiniAppState() {
    }

    public final SparseArray<Parcelable> get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return cache.get(key);
    }

    public final void put(@NotNull String key, @NotNull SparseArray<Parcelable> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        cache.put(key, value);
    }
}
