package com.braze.images;

import Ph.AbstractC1459k;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import bo.app.j0;
import bo.app.k0;
import bo.app.m4;
import bo.app.n4;
import bo.app.o4;
import bo.app.r4;
import com.braze.R$string;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001RB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J9\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010)J3\u0010/\u001a\u00020$2\u0006\u0010+\u001a\u00020*2\u001a\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060-\u0018\u00010,H\u0007¢\u0006\u0004\b/\u00100J+\u00101\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b1\u00102J+\u00104\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b8\u00107J\u0019\u00109\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b9\u00107J'\u0010;\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010:\u001a\u00020$H\u0007¢\u0006\u0004\b;\u0010<J1\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR#\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100C8\u0007¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010L\u001a\u00020$2\u0006\u0010K\u001a\u00020$8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bL\u0010NR\u0014\u0010%\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010P¨\u0006S"}, d2 = {"Lcom/braze/images/DefaultBrazeImageLoader;", "Lcom/braze/images/IBrazeImageLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "", "renderUrlIntoView", "(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "key", "Landroid/graphics/Bitmap;", "bitmap", "kotlin.jvm.PlatformType", "putBitmapIntoMemCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "initDiskCacheTask", "Lcom/braze/models/cards/Card;", "card", "renderUrlIntoCardView", "(Landroid/content/Context;Lcom/braze/models/cards/Card;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "renderUrlIntoInAppMessageView", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "Landroid/os/Bundle;", "extras", "getPushBitmapFromUrl", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "getInAppMessageBitmapFromUrl", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "", "isOffline", "setOffline", "(Z)V", "shutdown", "()V", "Landroid/net/Uri;", "imageUri", "", "", "headers", "shouldSkipCaching", "(Landroid/net/Uri;Ljava/util/Map;)Z", "getBitmapFromUrl", "(Landroid/content/Context;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "Lbo/app/j0;", "downloadBitmapFromUrl", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lbo/app/j0;", "getBitmapFromCache", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "getBitmapFromMemCache", "getBitmapFromDiskCache", "skipDiskCache", "putBitmapIntoCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "renderUrlIntoViewTask$android_sdk_base_release", "(Landroid/content/Context;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;Ljava/lang/String;)V", "renderUrlIntoViewTask", "Ljava/util/concurrent/locks/ReentrantLock;", "diskCacheLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/util/LruCache;", "memoryCache", "Landroid/util/LruCache;", "getMemoryCache", "()Landroid/util/LruCache;", "Lbo/app/k0;", "diskLruCache", "Lbo/app/k0;", EventKeys.VALUE_KEY, "isDiskCacheStarting", "Z", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "bo/app/n4", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultBrazeImageLoader implements IBrazeImageLoader {
    public static final n4 Companion = new n4();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DefaultBrazeImageLoader.class);
    private final ReentrantLock diskCacheLock;
    private k0 diskLruCache;
    private boolean isDiskCacheStarting;
    private final AtomicBoolean isOffline;
    private final LruCache<String, Bitmap> memoryCache;

    public DefaultBrazeImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.diskCacheLock = new ReentrantLock();
        this.isDiskCacheStarting = true;
        this.isOffline = new AtomicBoolean(false);
        this.memoryCache = new m4(BrazeImageUtils.getImageLoaderCacheSize());
        initDiskCacheTask(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$0$0(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
        return "Got bitmap from mem cache for key " + str + "\nMemory cache stats: " + defaultBrazeImageLoader.memoryCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$1$0(String str) {
        return "Got bitmap from disk cache for key " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$2(String str) {
        return "No cache hit for bitmap: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$0$0(String str) {
        return "Disk cache still starting. Cannot retrieve key from disk cache: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$0$1(String str) {
        return "Getting bitmap from disk cache for key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$0() {
        return "Cannot retrieve bitmap with blank image url";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$2() {
        return "Cache is currently in offline mode. Not downloading bitmap.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$3(String str) {
        return "Failed to get bitmap from url. Url: " + str;
    }

    private final void initDiskCacheTask(Context context) {
        AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new o4(context, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$0(String str) {
        return "Adding bitmap to mem cache for key " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$1(String str) {
        return "Skipping disk cache for key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$2$0(String str) {
        return "Adding bitmap to disk cache for key " + str;
    }

    private final Bitmap putBitmapIntoMemCache(String key, Bitmap bitmap) {
        return this.memoryCache.put(key, bitmap);
    }

    private final void renderUrlIntoView(Context context, final String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        if (StringsKt.isBlank(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L3.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String renderUrlIntoView$lambda$0;
                    renderUrlIntoView$lambda$0 = DefaultBrazeImageLoader.renderUrlIntoView$lambda$0();
                    return renderUrlIntoView$lambda$0;
                }
            }, 7, (Object) null);
            return;
        }
        try {
            renderUrlIntoViewTask$android_sdk_base_release(context, imageView, viewBounds, imageUrl);
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: L3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String renderUrlIntoView$lambda$1;
                    renderUrlIntoView$lambda$1 = DefaultBrazeImageLoader.renderUrlIntoView$lambda$1(imageUrl);
                    return renderUrlIntoView$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$0() {
        return "Cannot retrieve bitmap with a blank image url";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$1(String str) {
        return "Failed to render url into view. Url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setOffline$lambda$0(boolean z10) {
        return "DefaultBrazeImageLoader outbound network requests are now " + (z10 ? "disabled" : ViewProps.ENABLED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$0(Uri uri) {
        return "Image url specifies that it should not be cached. Not caching " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$2$1(Map.Entry entry, Uri uri) {
        return "Headers specify that this image should not be cached (" + entry + "). Not caching " + uri;
    }

    public final j0 downloadBitmapFromUrl(Context context, Uri imageUri, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        if (viewBounds == null) {
            viewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeImageUtils.getBitmap(context, imageUri, viewBounds);
    }

    public final Bitmap getBitmapFromCache(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bitmap bitmap = this.memoryCache.get(key);
        if (bitmap != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: L3.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromCache$lambda$0$0;
                    bitmapFromCache$lambda$0$0 = DefaultBrazeImageLoader.getBitmapFromCache$lambda$0$0(key, this);
                    return bitmapFromCache$lambda$0$0;
                }
            }, 6, (Object) null);
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(key);
        if (bitmapFromDiskCache == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L3.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromCache$lambda$2;
                    bitmapFromCache$lambda$2 = DefaultBrazeImageLoader.getBitmapFromCache$lambda$2(key);
                    return bitmapFromCache$lambda$2;
                }
            }, 7, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: L3.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String bitmapFromCache$lambda$1$0;
                bitmapFromCache$lambda$1$0 = DefaultBrazeImageLoader.getBitmapFromCache$lambda$1$0(key);
                return bitmapFromCache$lambda$1$0;
            }
        }, 6, (Object) null);
        putBitmapIntoMemCache(key, bitmapFromDiskCache);
        return bitmapFromDiskCache;
    }

    public final Bitmap getBitmapFromDiskCache(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            k0 k0Var = null;
            if (this.isDiskCacheStarting) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: L3.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String bitmapFromDiskCache$lambda$0$0;
                        bitmapFromDiskCache$lambda$0$0 = DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$0$0(key);
                        return bitmapFromDiskCache$lambda$0$0;
                    }
                }, 6, (Object) null);
            } else {
                k0 k0Var2 = this.diskLruCache;
                if (k0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    k0Var2 = null;
                }
                if (k0Var2.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: L3.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String bitmapFromDiskCache$lambda$0$1;
                            bitmapFromDiskCache$lambda$0$1 = DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$0$1(key);
                            return bitmapFromDiskCache$lambda$0$1;
                        }
                    }, 6, (Object) null);
                    k0 k0Var3 = this.diskLruCache;
                    if (k0Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        k0Var = k0Var3;
                    }
                    Bitmap b10 = k0Var.b(key);
                    reentrantLock.unlock();
                    return b10;
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Bitmap getBitmapFromMemCache(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.memoryCache.get(key);
    }

    public final Bitmap getBitmapFromUrl(Context context, final String imageUrl, BrazeViewBounds viewBounds) {
        Bitmap bitmapFromCache;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (StringsKt.isBlank(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L3.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromUrl$lambda$0;
                    bitmapFromUrl$lambda$0 = DefaultBrazeImageLoader.getBitmapFromUrl$lambda$0();
                    return bitmapFromUrl$lambda$0;
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            bitmapFromCache = getBitmapFromCache(imageUrl);
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: L3.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromUrl$lambda$3;
                    bitmapFromUrl$lambda$3 = DefaultBrazeImageLoader.getBitmapFromUrl$lambda$3(imageUrl);
                    return bitmapFromUrl$lambda$3;
                }
            }, 4, (Object) null);
        }
        if (bitmapFromCache != null) {
            return bitmapFromCache;
        }
        if (this.isOffline.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L3.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromUrl$lambda$2;
                    bitmapFromUrl$lambda$2 = DefaultBrazeImageLoader.getBitmapFromUrl$lambda$2();
                    return bitmapFromUrl$lambda$2;
                }
            }, 7, (Object) null);
        } else {
            Uri parse = Uri.parse(imageUrl);
            j0 downloadBitmapFromUrl = downloadBitmapFromUrl(context, parse, viewBounds);
            if (downloadBitmapFromUrl.f25583a != null) {
                if (!shouldSkipCaching(parse, downloadBitmapFromUrl.f25584b)) {
                    putBitmapIntoCache(imageUrl, downloadBitmapFromUrl.f25583a, BrazeFileUtils.isLocalUri(parse));
                }
                return downloadBitmapFromUrl.f25583a;
            }
        }
        return null;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage inAppMessage, String imageUrl, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return getBitmapFromUrl(context, imageUrl, viewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle extras, String imageUrl, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return getBitmapFromUrl(context, imageUrl, viewBounds);
    }

    public final void putBitmapIntoCache(final String key, Bitmap bitmap, boolean skipDiskCache) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (getBitmapFromMemCache(key) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L3.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String putBitmapIntoCache$lambda$0;
                    putBitmapIntoCache$lambda$0 = DefaultBrazeImageLoader.putBitmapIntoCache$lambda$0(key);
                    return putBitmapIntoCache$lambda$0;
                }
            }, 7, (Object) null);
            this.memoryCache.put(key, bitmap);
        }
        if (skipDiskCache) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String putBitmapIntoCache$lambda$1;
                    putBitmapIntoCache$lambda$1 = DefaultBrazeImageLoader.putBitmapIntoCache$lambda$1(key);
                    return putBitmapIntoCache$lambda$1;
                }
            }, 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (!this.isDiskCacheStarting) {
                k0 k0Var = this.diskLruCache;
                k0 k0Var2 = null;
                if (k0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    k0Var = null;
                }
                if (!k0Var.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L3.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String putBitmapIntoCache$lambda$2$0;
                            putBitmapIntoCache$lambda$2$0 = DefaultBrazeImageLoader.putBitmapIntoCache$lambda$2$0(key);
                            return putBitmapIntoCache$lambda$2$0;
                        }
                    }, 7, (Object) null);
                    k0 k0Var3 = this.diskLruCache;
                    if (k0Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        k0Var2 = k0Var3;
                    }
                    k0Var2.a(key, bitmap);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoCardView(Context context, Card card, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        renderUrlIntoView(context, imageUrl, imageView, viewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage inAppMessage, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        renderUrlIntoView(context, imageUrl, imageView, viewBounds);
    }

    public final void renderUrlIntoViewTask$android_sdk_base_release(Context context, ImageView imageView, BrazeViewBounds viewBounds, String imageUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        imageView.setTag(R$string.com_braze_image_lru_cache_image_url_key, imageUrl);
        AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new r4(this, context, imageUrl, viewBounds, imageView, null), 3, null);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(final boolean isOffline) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: L3.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String offline$lambda$0;
                offline$lambda$0 = DefaultBrazeImageLoader.setOffline$lambda$0(isOffline);
                return offline$lambda$0;
            }
        }, 6, (Object) null);
        this.isOffline.set(isOffline);
    }

    public final boolean shouldSkipCaching(final Uri imageUri, Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        if (!imageUri.getBooleanQueryParameter("cache", true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L3.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String shouldSkipCaching$lambda$0;
                    shouldSkipCaching$lambda$0 = DefaultBrazeImageLoader.shouldSkipCaching$lambda$0(imageUri);
                    return shouldSkipCaching$lambda$0;
                }
            }, 7, (Object) null);
            return true;
        }
        if (headers == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : headers.entrySet()) {
            if (StringsKt.equals(entry.getKey(), "cache-control", true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (final Map.Entry entry2 : linkedHashMap.entrySet()) {
            Iterable<String> iterable = (Iterable) entry2.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    if (StringsKt.contains((CharSequence) str, (CharSequence) "no-cache", true) || StringsKt.contains((CharSequence) str, (CharSequence) "max-age=0", true)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: L3.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String shouldSkipCaching$lambda$2$1;
                                shouldSkipCaching$lambda$2$1 = DefaultBrazeImageLoader.shouldSkipCaching$lambda$2$1(entry2, imageUri);
                                return shouldSkipCaching$lambda$2$1;
                            }
                        }, 7, (Object) null);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void shutdown() {
        super.shutdown();
        setOffline(true);
        k0 k0Var = this.diskLruCache;
        if (k0Var != null) {
            k0Var.a();
        }
    }
}
