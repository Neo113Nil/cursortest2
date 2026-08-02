package ru.ozon.app.android.pdfviewer.presentation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdfviewer.data.cache.DiskLruCache;
import ru.ozon.app.android.pdfviewer.data.cache.MemoryLruCache;
import ru.ozon.app.android.pdfviewer.presentation.BitmapCacheHandler;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00110\u0016J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0011J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/BitmapCacheHandler;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cacheDir", "Ljava/io/File;", "cacheExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "memoryCache", "Lru/ozon/app/android/pdfviewer/data/cache/MemoryLruCache;", "diskCache", "Lru/ozon/app/android/pdfviewer/data/cache/DiskLruCache;", "resetCache", "", "loadFromCache", "pageNo", "", "onBitmapReady", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "writeToCache", "bitmap", "clear", "initMemoryCache", "initDiscCache", "isCacheInitialized", "", "saveBitmapToFile", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BitmapCacheHandler {

    @NotNull
    private final File cacheDir;
    private final ExecutorService cacheExecutor;
    private DiskLruCache diskCache;
    private MemoryLruCache memoryCache;
    public static final int $stable = 8;

    public BitmapCacheHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cacheDir = new File(context.getCacheDir(), "pdf_cache");
        this.cacheExecutor = Executors.newFixedThreadPool(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clear$lambda$4(BitmapCacheHandler bitmapCacheHandler) {
        try {
            MemoryLruCache memoryLruCache = bitmapCacheHandler.memoryCache;
            if (memoryLruCache == null) {
                Intrinsics.n("memoryCache");
                throw null;
            }
            memoryLruCache.evictAll();
            DiskLruCache diskLruCache = bitmapCacheHandler.diskCache;
            if (diskLruCache != null) {
                diskLruCache.clearCache();
            } else {
                Intrinsics.n("diskCache");
                throw null;
            }
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
    }

    private final DiskLruCache initDiscCache() {
        Object obj = this.cacheExecutor.submit(new Callable() { // from class: nC.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                DiskLruCache initDiscCache$lambda$5;
                initDiscCache$lambda$5 = BitmapCacheHandler.initDiscCache$lambda$5(BitmapCacheHandler.this);
                return initDiscCache$lambda$5;
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (DiskLruCache) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiskLruCache initDiscCache$lambda$5(BitmapCacheHandler bitmapCacheHandler) {
        return DiskLruCache.create(bitmapCacheHandler.cacheDir, 20971520L);
    }

    private final MemoryLruCache initMemoryCache() {
        return new MemoryLruCache(((int) (Runtime.getRuntime().maxMemory() / UserVerificationMethods.USER_VERIFY_ALL)) / 4);
    }

    private final boolean isCacheInitialized() {
        return (this.memoryCache != null) & (this.diskCache != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFromCache$lambda$1(BitmapCacheHandler bitmapCacheHandler, int i11, Function1 function1) {
        try {
            DiskLruCache diskLruCache = bitmapCacheHandler.diskCache;
            if (diskLruCache == null) {
                Intrinsics.n("diskCache");
                throw null;
            }
            File file = diskLruCache.get(String.valueOf(i11));
            function1.invoke(file != null ? BitmapFactory.decodeFile(file.getAbsolutePath()) : null);
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
    }

    private final File saveBitmapToFile(int pageNo, Bitmap bitmap) {
        File file = new File(this.cacheDir, String.valueOf(pageNo));
        if (!file.createNewFile()) {
            file = null;
        }
        if (file == null) {
            return null;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.f71690a;
            fileOutputStream.close();
            return file;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeToCache$lambda$3(BitmapCacheHandler bitmapCacheHandler, int i11, Bitmap bitmap) {
        File saveBitmapToFile;
        try {
            DiskLruCache diskLruCache = bitmapCacheHandler.diskCache;
            if (diskLruCache == null) {
                Intrinsics.n("diskCache");
                throw null;
            }
            File file = diskLruCache.get(String.valueOf(i11));
            if ((file == null || !file.exists()) && (saveBitmapToFile = bitmapCacheHandler.saveBitmapToFile(i11, bitmap)) != null) {
                DiskLruCache diskLruCache2 = bitmapCacheHandler.diskCache;
                if (diskLruCache2 != null) {
                    diskLruCache2.put(String.valueOf(i11), saveBitmapToFile);
                } else {
                    Intrinsics.n("diskCache");
                    throw null;
                }
            }
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
    }

    public final void clear() {
        this.cacheExecutor.execute(new IC.b(this, 3));
        this.cacheExecutor.shutdown();
    }

    public final void loadFromCache(final int pageNo, @NotNull final Function1<? super Bitmap, Unit> onBitmapReady) {
        Intrinsics.checkNotNullParameter(onBitmapReady, "onBitmapReady");
        if (isCacheInitialized()) {
            MemoryLruCache memoryLruCache = this.memoryCache;
            if (memoryLruCache == null) {
                Intrinsics.n("memoryCache");
                throw null;
            }
            Bitmap bitmap = memoryLruCache.get(Integer.valueOf(pageNo));
            if (bitmap != null) {
                onBitmapReady.invoke(bitmap);
            } else {
                this.cacheExecutor.execute(new Runnable() { // from class: nC.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BitmapCacheHandler.loadFromCache$lambda$1(BitmapCacheHandler.this, pageNo, onBitmapReady);
                    }
                });
            }
        }
    }

    public final void resetCache() {
        this.memoryCache = initMemoryCache();
        this.diskCache = initDiscCache();
    }

    public final void writeToCache(final int pageNo, @NotNull final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        MemoryLruCache memoryLruCache = this.memoryCache;
        if (memoryLruCache == null) {
            Intrinsics.n("memoryCache");
            throw null;
        }
        memoryLruCache.putIfAbsent(pageNo, bitmap);
        this.cacheExecutor.execute(new Runnable() { // from class: nC.c
            @Override // java.lang.Runnable
            public final void run() {
                BitmapCacheHandler.writeToCache$lambda$3(BitmapCacheHandler.this, pageNo, bitmap);
            }
        });
    }
}
