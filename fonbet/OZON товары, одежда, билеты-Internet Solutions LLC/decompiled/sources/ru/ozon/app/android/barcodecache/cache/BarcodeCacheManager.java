package ru.ozon.app.android.barcodecache.cache;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcodecache.data.BarcodeCacheDTO;
import ru.ozon.app.android.barcodecache.data.BarcodeData;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "", "Lru/ozon/app/android/barcodecache/data/BarcodeData;", "getBarcode", "()Lru/ozon/app/android/barcodecache/data/BarcodeData;", "", "fetchBarcode", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "barcode", "teenBarcode", "saveBarcode", "(Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;)V", "", "errorOccurred", "setErrorOccurred", "(Z)V", "clearCache", "()V", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeCacheManager {
    void clearCache();

    Object fetchBarcode(@NotNull d<? super Unit> dVar);

    BarcodeData getBarcode();

    void saveBarcode(@NotNull BarcodeCacheDTO barcode, BarcodeCacheDTO teenBarcode);

    @InterfaceC3999a
    void setErrorOccurred(boolean errorOccurred);
}
