package ru.ozon.app.android.barcodecache.wearable;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lru/ozon/app/android/barcodecache/wearable/NoopWearableBarcodeSyncer;", "Lru/ozon/app/android/barcodecache/wearable/WearableBarcodeSyncer;", "<init>", "()V", "isEnable", "", "()Z", "syncBarcode", "", "syncEmpty", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoopWearableBarcodeSyncer implements WearableBarcodeSyncer {
    private final boolean isEnable;

    @Override // ru.ozon.app.android.barcodecache.wearable.WearableBarcodeSyncer
    /* renamed from: isEnable, reason: from getter */
    public boolean getIsEnable() {
        return this.isEnable;
    }

    @Override // ru.ozon.app.android.barcodecache.wearable.WearableBarcodeSyncer
    public void syncBarcode() {
    }

    @Override // ru.ozon.app.android.barcodecache.wearable.WearableBarcodeSyncer
    public void syncEmpty() {
    }
}
