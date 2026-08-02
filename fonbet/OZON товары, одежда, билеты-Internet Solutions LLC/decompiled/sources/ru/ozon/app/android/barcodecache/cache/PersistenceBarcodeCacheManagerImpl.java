package ru.ozon.app.android.barcodecache.cache;

import Je.InterfaceC3394a;
import Je.e;
import Sc.InterfaceC3999a;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcodecache.data.BarcodeCacheDTO;
import ru.ozon.app.android.barcodecache.data.BarcodeData;
import ru.ozon.app.android.barcodecache.data.PrefetchBarcodeBarcodeResult;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/barcodecache/cache/PersistenceBarcodeCacheManagerImpl;", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheSharedPreferences;", "localStorage", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheRepository;", "repository", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "<init>", "(Lru/ozon/app/android/barcodecache/cache/BarcodeCacheSharedPreferences;Lru/ozon/app/android/barcodecache/cache/BarcodeCacheRepository;Lru/ozon/app/android/storage/teensMode/TeensModeStorage;)V", "Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "barcode", "", "currentTime", "lastUpdated", "", "barcodeExpired", "(Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;JJ)Z", "errorBarcodeExpired", "(JJ)Z", "dayChanged", "Lru/ozon/app/android/barcodecache/data/BarcodeData;", "getBarcode", "()Lru/ozon/app/android/barcodecache/data/BarcodeData;", "", "fetchBarcode", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "teenBarcode", "saveBarcode", "(Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;)V", "errorOccurred", "setErrorOccurred", "(Z)V", "clearCache", "()V", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheSharedPreferences;", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheRepository;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "LJe/a;", "mutex", "LJe/a;", "Companion", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistenceBarcodeCacheManagerImpl implements BarcodeCacheManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final BarcodeCacheSharedPreferences localStorage;

    @NotNull
    private final InterfaceC3394a mutex;

    @NotNull
    private final BarcodeCacheRepository repository;

    @NotNull
    private final TeensModeStorage teensModeStorage;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/barcodecache/cache/PersistenceBarcodeCacheManagerImpl$Companion;", "", "<init>", "()V", "MILLISECONDS_IN_SECONDS", "", "TIME_ZONE_UTC", "", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PersistenceBarcodeCacheManagerImpl(@NotNull BarcodeCacheSharedPreferences localStorage, @NotNull BarcodeCacheRepository repository, @NotNull TeensModeStorage teensModeStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(teensModeStorage, "teensModeStorage");
        this.localStorage = localStorage;
        this.repository = repository;
        this.teensModeStorage = teensModeStorage;
        this.mutex = e.a();
    }

    private final boolean barcodeExpired(BarcodeCacheDTO barcode, long currentTime, long lastUpdated) {
        return (barcode.getCacheLifetime() * ((long) 1000)) + lastUpdated < currentTime;
    }

    private final boolean dayChanged(long currentTime, long lastUpdated) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(currentTime);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(lastUpdated);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2.before(calendar);
    }

    private final boolean errorBarcodeExpired(long currentTime, long lastUpdated) {
        int errorRefreshIntervalInSeconds = this.localStorage.getErrorRefreshIntervalInSeconds();
        return errorRefreshIntervalInSeconds != -1 && lastUpdated + ((long) (errorRefreshIntervalInSeconds * 1000)) < currentTime;
    }

    private static final boolean fetchBarcode$lambda$0$isBarcodeExpired(PersistenceBarcodeCacheManagerImpl persistenceBarcodeCacheManagerImpl, long j11, long j12, BarcodeCacheDTO barcodeCacheDTO) {
        return persistenceBarcodeCacheManagerImpl.barcodeExpired(barcodeCacheDTO, j11, j12);
    }

    private static final boolean fetchBarcode$lambda$0$isTeenBarcodeExpired(BarcodeCacheDTO barcodeCacheDTO, PersistenceBarcodeCacheManagerImpl persistenceBarcodeCacheManagerImpl, long j11, long j12) {
        return barcodeCacheDTO != null && persistenceBarcodeCacheManagerImpl.barcodeExpired(barcodeCacheDTO, j11, j12);
    }

    @Override // ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager
    public void clearCache() {
        this.localStorage.clearStorage();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002f, B:13:0x00b6, B:15:0x00bc, B:16:0x00dc, B:20:0x00cd, B:22:0x00d1, B:23:0x00e4, B:24:0x00e9), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002f, B:13:0x00b6, B:15:0x00bc, B:16:0x00dc, B:20:0x00cd, B:22:0x00d1, B:23:0x00e4, B:24:0x00e9), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x009f, TryCatch #1 {all -> 0x009f, blocks: (B:33:0x0061, B:35:0x0079, B:37:0x007f, B:39:0x0085, B:41:0x008d, B:43:0x0093, B:47:0x00a4), top: B:32:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchBarcode(@NotNull d<? super Unit> dVar) {
        PersistenceBarcodeCacheManagerImpl$fetchBarcode$1 persistenceBarcodeCacheManagerImpl$fetchBarcode$1;
        a aVar;
        int i11;
        InterfaceC3394a interfaceC3394a;
        PersistenceBarcodeCacheManagerImpl persistenceBarcodeCacheManagerImpl;
        InterfaceC3394a interfaceC3394a2;
        BarcodeCacheDTO commonBarcode;
        Object barcodeCache;
        PersistenceBarcodeCacheManagerImpl persistenceBarcodeCacheManagerImpl2;
        PrefetchBarcodeBarcodeResult prefetchBarcodeBarcodeResult;
        try {
            if (dVar instanceof PersistenceBarcodeCacheManagerImpl$fetchBarcode$1) {
                persistenceBarcodeCacheManagerImpl$fetchBarcode$1 = (PersistenceBarcodeCacheManagerImpl$fetchBarcode$1) dVar;
                int i12 = persistenceBarcodeCacheManagerImpl$fetchBarcode$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    persistenceBarcodeCacheManagerImpl$fetchBarcode$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = persistenceBarcodeCacheManagerImpl$fetchBarcode$1.result;
                    aVar = a.COROUTINE_SUSPENDED;
                    i11 = persistenceBarcodeCacheManagerImpl$fetchBarcode$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        interfaceC3394a = this.mutex;
                        persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$0 = this;
                        persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$1 = interfaceC3394a;
                        persistenceBarcodeCacheManagerImpl$fetchBarcode$1.label = 1;
                        if (interfaceC3394a.a(persistenceBarcodeCacheManagerImpl$fetchBarcode$1) != aVar) {
                            persistenceBarcodeCacheManagerImpl = this;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a2 = (InterfaceC3394a) persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$1;
                        persistenceBarcodeCacheManagerImpl2 = (PersistenceBarcodeCacheManagerImpl) persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$0;
                        try {
                            s.b(obj);
                            prefetchBarcodeBarcodeResult = (PrefetchBarcodeBarcodeResult) obj;
                            if (!(prefetchBarcodeBarcodeResult instanceof PrefetchBarcodeBarcodeResult.Success)) {
                                persistenceBarcodeCacheManagerImpl2.saveBarcode(((PrefetchBarcodeBarcodeResult.Success) prefetchBarcodeBarcodeResult).getBarcode(), ((PrefetchBarcodeBarcodeResult.Success) prefetchBarcodeBarcodeResult).getTeenBarcode());
                            } else {
                                if (!(prefetchBarcodeBarcodeResult instanceof PrefetchBarcodeBarcodeResult.BackendError)) {
                                    throw new o();
                                }
                                persistenceBarcodeCacheManagerImpl2.localStorage.setErrorRefreshIntervalInSeconds(((PrefetchBarcodeBarcodeResult.BackendError) prefetchBarcodeBarcodeResult).getErrorRefreshInterval());
                            }
                            Unit unit = Unit.f71690a;
                            interfaceC3394a2.c(null);
                            return Unit.f71690a;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            interfaceC3394a2.c(null);
                            throw th3;
                        }
                    }
                    InterfaceC3394a interfaceC3394a3 = (InterfaceC3394a) persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$1;
                    PersistenceBarcodeCacheManagerImpl persistenceBarcodeCacheManagerImpl3 = (PersistenceBarcodeCacheManagerImpl) persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$0;
                    s.b(obj);
                    interfaceC3394a = interfaceC3394a3;
                    persistenceBarcodeCacheManagerImpl = persistenceBarcodeCacheManagerImpl3;
                    commonBarcode = persistenceBarcodeCacheManagerImpl.localStorage.getCommonBarcode();
                    BarcodeCacheDTO teenBarcode = persistenceBarcodeCacheManagerImpl.localStorage.getTeenBarcode();
                    long currentTimeMillis = System.currentTimeMillis();
                    long timestamp = persistenceBarcodeCacheManagerImpl.localStorage.getTimestamp();
                    if (commonBarcode != null && !persistenceBarcodeCacheManagerImpl.dayChanged(currentTimeMillis, timestamp) && !persistenceBarcodeCacheManagerImpl.errorBarcodeExpired(currentTimeMillis, timestamp)) {
                        if (!persistenceBarcodeCacheManagerImpl.localStorage.getErrorOccurred()) {
                            if (!fetchBarcode$lambda$0$isBarcodeExpired(persistenceBarcodeCacheManagerImpl, currentTimeMillis, timestamp, commonBarcode)) {
                                PersistenceBarcodeCacheManagerImpl persistenceBarcodeCacheManagerImpl4 = persistenceBarcodeCacheManagerImpl;
                                persistenceBarcodeCacheManagerImpl = persistenceBarcodeCacheManagerImpl4;
                                if (fetchBarcode$lambda$0$isTeenBarcodeExpired(teenBarcode, persistenceBarcodeCacheManagerImpl4, currentTimeMillis, timestamp)) {
                                }
                            }
                        }
                        interfaceC3394a2 = interfaceC3394a;
                        Unit unit2 = Unit.f71690a;
                        interfaceC3394a2.c(null);
                        return Unit.f71690a;
                    }
                    BarcodeCacheRepository barcodeCacheRepository = persistenceBarcodeCacheManagerImpl.repository;
                    persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$0 = persistenceBarcodeCacheManagerImpl;
                    persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$1 = interfaceC3394a;
                    persistenceBarcodeCacheManagerImpl$fetchBarcode$1.label = 2;
                    barcodeCache = barcodeCacheRepository.getBarcodeCache(persistenceBarcodeCacheManagerImpl$fetchBarcode$1);
                    if (barcodeCache != aVar) {
                        interfaceC3394a2 = interfaceC3394a;
                        obj = barcodeCache;
                        persistenceBarcodeCacheManagerImpl2 = persistenceBarcodeCacheManagerImpl;
                        prefetchBarcodeBarcodeResult = (PrefetchBarcodeBarcodeResult) obj;
                        if (!(prefetchBarcodeBarcodeResult instanceof PrefetchBarcodeBarcodeResult.Success)) {
                        }
                        Unit unit22 = Unit.f71690a;
                        interfaceC3394a2.c(null);
                        return Unit.f71690a;
                    }
                    return aVar;
                }
            }
            commonBarcode = persistenceBarcodeCacheManagerImpl.localStorage.getCommonBarcode();
            BarcodeCacheDTO teenBarcode2 = persistenceBarcodeCacheManagerImpl.localStorage.getTeenBarcode();
            long currentTimeMillis2 = System.currentTimeMillis();
            long timestamp2 = persistenceBarcodeCacheManagerImpl.localStorage.getTimestamp();
            if (commonBarcode != null) {
                if (!persistenceBarcodeCacheManagerImpl.localStorage.getErrorOccurred()) {
                }
                interfaceC3394a2 = interfaceC3394a;
                Unit unit222 = Unit.f71690a;
                interfaceC3394a2.c(null);
                return Unit.f71690a;
            }
            BarcodeCacheRepository barcodeCacheRepository2 = persistenceBarcodeCacheManagerImpl.repository;
            persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$0 = persistenceBarcodeCacheManagerImpl;
            persistenceBarcodeCacheManagerImpl$fetchBarcode$1.L$1 = interfaceC3394a;
            persistenceBarcodeCacheManagerImpl$fetchBarcode$1.label = 2;
            barcodeCache = barcodeCacheRepository2.getBarcodeCache(persistenceBarcodeCacheManagerImpl$fetchBarcode$1);
            if (barcodeCache != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            th = th4;
            interfaceC3394a2 = interfaceC3394a;
            Throwable th32 = th;
            interfaceC3394a2.c(null);
            throw th32;
        }
        persistenceBarcodeCacheManagerImpl$fetchBarcode$1 = new PersistenceBarcodeCacheManagerImpl$fetchBarcode$1(this, dVar);
        Object obj2 = persistenceBarcodeCacheManagerImpl$fetchBarcode$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = persistenceBarcodeCacheManagerImpl$fetchBarcode$1.label;
        if (i11 != 0) {
        }
    }

    @Override // ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager
    public BarcodeData getBarcode() {
        BarcodeCacheDTO barcode = this.localStorage.getBarcode(this.teensModeStorage.isTeensModeEnabled());
        long currentTimeMillis = System.currentTimeMillis();
        long timestamp = this.localStorage.getTimestamp();
        if (barcode == null || barcodeExpired(barcode, currentTimeMillis, timestamp)) {
            return null;
        }
        return new BarcodeData(barcode.getCode(), barcode.getVisibleCode());
    }

    @Override // ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager
    public void saveBarcode(@NotNull BarcodeCacheDTO barcode, BarcodeCacheDTO teenBarcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        this.localStorage.saveBarcode(barcode, teenBarcode, System.currentTimeMillis());
    }

    @Override // ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager
    @InterfaceC3999a
    public void setErrorOccurred(boolean errorOccurred) {
        this.localStorage.setErrorRefreshIntervalInSeconds(errorOccurred ? 3600 : -1);
    }
}
