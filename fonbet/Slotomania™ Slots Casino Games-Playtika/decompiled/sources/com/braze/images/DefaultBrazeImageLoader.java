package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import com.braze.Constants;
import com.braze.R;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.ironsource.C2321a2;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J \u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\r0\r2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J2\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J2\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J.\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J,\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J$\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J&\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0012\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0012\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0007J \u0010(\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u001dH\u0007R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R#\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0,8G¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001d8G@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103¨\u00069"}, d2 = {"Lcom/braze/images/DefaultBrazeImageLoader;", "Lcom/braze/images/IBrazeImageLoader;", "Landroid/content/Context;", "context", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "", "renderUrlIntoView", "key", "Landroid/graphics/Bitmap;", "bitmap", "kotlin.jvm.PlatformType", "putBitmapIntoMemCache", "initDiskCacheTask", "renderUrlIntoViewTask", "Lcom/braze/models/cards/Card;", "card", "renderUrlIntoCardView", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "renderUrlIntoInAppMessageView", "Landroid/os/Bundle;", "extras", "getPushBitmapFromUrl", "getInAppMessageBitmapFromUrl", "", "isOffline", "setOffline", "getBitmapFromUrl", "Landroid/net/Uri;", "imageUri", "downloadBitmapFromUrl", "getBitmapFromCache", "getBitmapFromMemCache", "getBitmapFromDiskCache", "skipDiskCache", "putBitmapIntoCache", "Ljava/util/concurrent/locks/ReentrantLock;", "diskCacheLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/util/LruCache;", "memoryCache", "Landroid/util/LruCache;", "getMemoryCache", "()Landroid/util/LruCache;", "<set-?>", "isDiskCacheStarting", "Z", "()Z", "<init>", "(Landroid/content/Context;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "b", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DefaultBrazeImageLoader implements IBrazeImageLoader {
    public static final String BRAZE_LRU_CACHE_FOLDER = "appboy.imageloader.lru.cache";
    private static final int DISK_CACHE_SIZE = 52428800;
    private final ReentrantLock diskCacheLock;
    private bo.app.h diskLruCache;
    private boolean isDiskCacheStarting;
    private boolean isOffline;
    private final LruCache<String, Bitmap> memoryCache;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DefaultBrazeImageLoader.class);

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¨\u0006\b"}, d2 = {"com/braze/images/DefaultBrazeImageLoader$a", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "key", "image", "", Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a extends LruCache<String, Bitmap> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i) {
            super(i);
            this.a = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String key, Bitmap image) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(image, "image");
            return image.getByteCount();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ DefaultBrazeImageLoader c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
            super(0);
            this.b = str;
            this.c = defaultBrazeImageLoader;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got bitmap from mem cache for key " + this.b + "\nMemory cache stats: " + this.c.getMemoryCache();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Got bitmap from disk cache for key ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("No cache hit for bitmap: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Disk cache still starting. Cannot retrieve key from disk cache: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Getting bitmap from disk cache for key: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot retrieve bitmap with blank image url";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cache is currently in offline mode. Not downloading bitmap.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to get bitmap from url. Url: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.images.DefaultBrazeImageLoader$initDiskCacheTask$1", f = "DefaultBrazeImageLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ Context c;
        final /* synthetic */ DefaultBrazeImageLoader d;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Initializing disk cache";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Disk cache initialized";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            public static final c b = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught exception creating new disk cache. Unable to create new disk cache";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, Continuation<? super k> continuation) {
            super(2, continuation);
            this.c = context;
            this.d = defaultBrazeImageLoader;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new k(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File a2 = DefaultBrazeImageLoader.INSTANCE.a(this.c, DefaultBrazeImageLoader.BRAZE_LRU_CACHE_FOLDER);
            ReentrantLock reentrantLock = this.d.diskCacheLock;
            DefaultBrazeImageLoader defaultBrazeImageLoader = this.d;
            reentrantLock.lock();
            try {
                try {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) a.b, 6, (Object) null);
                    defaultBrazeImageLoader.diskLruCache = new bo.app.h(a2, 1, 1, 52428800L);
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) b.b, 6, (Object) null);
                    defaultBrazeImageLoader.isDiskCacheStarting = false;
                } catch (Exception e) {
                    BrazeLogger.INSTANCE.brazelog(DefaultBrazeImageLoader.TAG, BrazeLogger.Priority.E, (Throwable) e, (Function0<String>) c.b);
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding bitmap to mem cache for key ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Skipping disk cache for key: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding bitmap to disk cache for key ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        public static final o b = new o();

        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot retrieve bitmap with a blank image url";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to render url into view. Url: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.images.DefaultBrazeImageLoader$renderUrlIntoViewTask$1", f = "DefaultBrazeImageLoader.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ Context d;
        final /* synthetic */ String e;
        final /* synthetic */ BrazeViewBounds f;
        final /* synthetic */ ImageView g;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Failed to retrieve bitmap from url: ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.braze.images.DefaultBrazeImageLoader$renderUrlIntoViewTask$1$2", f = "DefaultBrazeImageLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int b;
            final /* synthetic */ String c;
            final /* synthetic */ ImageView d;
            final /* synthetic */ Bitmap e;
            final /* synthetic */ BrazeViewBounds f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, ImageView imageView, Bitmap bitmap, BrazeViewBounds brazeViewBounds, Continuation<? super b> continuation) {
                super(2, continuation);
                this.c = str;
                this.d = imageView;
                this.e = bitmap;
                this.f = brazeViewBounds;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = this.c;
                Object tag = this.d.getTag(R.string.com_braze_image_lru_cache_image_url_key);
                if (tag == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                if (Intrinsics.areEqual(str, (String) tag)) {
                    this.d.setImageBitmap(this.e);
                    if (this.f == BrazeViewBounds.BASE_CARD_VIEW) {
                        BrazeImageUtils.resizeImageViewToBitmapDimensions(this.e, this.d);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, Continuation<? super q> continuation) {
            super(2, continuation);
            this.d = context;
            this.e = str;
            this.f = brazeViewBounds;
            this.g = imageView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultBrazeImageLoader.this.new q(this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
                Bitmap bitmapFromUrl = DefaultBrazeImageLoader.this.getBitmapFromUrl(this.d, this.e, this.f);
                if (bitmapFromUrl == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new a(this.e), 6, (Object) null);
                } else {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    b bVar = new b(this.e, this.g, bitmapFromUrl, this.f, null);
                    this.b = 1;
                    if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r extends Lambda implements Function0<String> {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("DefaultBrazeImageLoader outbound network requests are now ", this.b ? C2321a2.e : "enabled");
        }
    }

    public DefaultBrazeImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.diskCacheLock = new ReentrantLock();
        this.isDiskCacheStarting = true;
        this.memoryCache = new a(BrazeImageUtils.getImageLoaderCacheSize());
        initDiskCacheTask(context);
    }

    @JvmStatic
    public static final void deleteStoredData(Context context) {
        INSTANCE.a(context);
    }

    public static /* synthetic */ Bitmap downloadBitmapFromUrl$default(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return defaultBrazeImageLoader.downloadBitmapFromUrl(context, uri, brazeViewBounds);
    }

    @JvmStatic
    public static final File getDiskCacheDir(Context context, String str) {
        return INSTANCE.a(context, str);
    }

    private final void initDiskCacheTask(Context context) {
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new k(context, this, null), 3, null);
    }

    private final Bitmap putBitmapIntoMemCache(String key, Bitmap bitmap) {
        return this.memoryCache.put(key, bitmap);
    }

    private final void renderUrlIntoView(Context context, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        if (StringsKt.isBlank(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, o.b, 3, (Object) null);
            return;
        }
        try {
            renderUrlIntoViewTask(context, imageView, viewBounds, imageUrl);
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new p(imageUrl));
        }
    }

    private final void renderUrlIntoViewTask(Context context, ImageView imageView, BrazeViewBounds viewBounds, String imageUrl) {
        imageView.setTag(R.string.com_braze_image_lru_cache_image_url_key, imageUrl);
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new q(context, imageUrl, viewBounds, imageView, null), 3, null);
    }

    public final Bitmap downloadBitmapFromUrl(Context context, Uri imageUri, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        if (viewBounds == null) {
            viewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeImageUtils.getBitmap(context, imageUri, viewBounds);
    }

    public final Bitmap getBitmapFromCache(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bitmap bitmap = this.memoryCache.get(key);
        if (bitmap != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(key, this), 2, (Object) null);
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(key);
        if (bitmapFromDiskCache == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(key), 3, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d(key), 2, (Object) null);
        putBitmapIntoMemCache(key, bitmapFromDiskCache);
        return bitmapFromDiskCache;
    }

    public final Bitmap getBitmapFromDiskCache(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            bo.app.h hVar = null;
            if (getIsDiskCacheStarting()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new f(key), 2, (Object) null);
            } else {
                bo.app.h hVar2 = this.diskLruCache;
                if (hVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    hVar2 = null;
                }
                if (hVar2.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new g(key), 2, (Object) null);
                    bo.app.h hVar3 = this.diskLruCache;
                    if (hVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        hVar = hVar3;
                    }
                    return hVar.b(key);
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Bitmap getBitmapFromMemCache(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.memoryCache.get(key);
    }

    public final Bitmap getBitmapFromUrl(Context context, String imageUrl, BrazeViewBounds viewBounds) {
        Bitmap bitmapFromCache;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (StringsKt.isBlank(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
            return null;
        }
        try {
            bitmapFromCache = getBitmapFromCache(imageUrl);
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new j(imageUrl));
        }
        if (bitmapFromCache != null) {
            return bitmapFromCache;
        }
        if (this.isOffline) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
        } else {
            Uri imageUri = Uri.parse(imageUrl);
            Intrinsics.checkNotNullExpressionValue(imageUri, "imageUri");
            Bitmap downloadBitmapFromUrl = downloadBitmapFromUrl(context, imageUri, viewBounds);
            if (downloadBitmapFromUrl != null) {
                putBitmapIntoCache(imageUrl, downloadBitmapFromUrl, BrazeFileUtils.isLocalUri(imageUri));
                return downloadBitmapFromUrl;
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

    public final LruCache<String, Bitmap> getMemoryCache() {
        return this.memoryCache;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle extras, String imageUrl, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return getBitmapFromUrl(context, imageUrl, viewBounds);
    }

    /* renamed from: isDiskCacheStarting, reason: from getter */
    public final boolean getIsDiskCacheStarting() {
        return this.isDiskCacheStarting;
    }

    public final void putBitmapIntoCache(String key, Bitmap bitmap, boolean skipDiskCache) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (getBitmapFromMemCache(key) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new l(key), 3, (Object) null);
            this.memoryCache.put(key, bitmap);
        }
        if (skipDiskCache) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(key), 3, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (!getIsDiskCacheStarting()) {
                bo.app.h hVar = this.diskLruCache;
                bo.app.h hVar2 = null;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    hVar = null;
                }
                if (!hVar.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new n(key), 3, (Object) null);
                    bo.app.h hVar3 = this.diskLruCache;
                    if (hVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        hVar2 = hVar3;
                    }
                    hVar2.a(key, bitmap);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
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

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(boolean isOffline) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new r(isOffline), 2, (Object) null);
        this.isOffline = isOffline;
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/braze/images/DefaultBrazeImageLoader$b;", "", "Landroid/content/Context;", "context", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "uniqueName", "Ljava/io/File;", "BRAZE_LRU_CACHE_FOLDER", "Ljava/lang/String;", "getBRAZE_LRU_CACHE_FOLDER$annotations", "()V", "", "DISK_CACHE_SIZE", "I", "TAG", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.braze.images.DefaultBrazeImageLoader$b, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.braze.images.DefaultBrazeImageLoader$b$a */
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ File b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(File file) {
                super(0);
                this.b = file;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Deleting lru image cache directory at: ", this.b.getAbsolutePath());
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.braze.images.DefaultBrazeImageLoader$b$b, reason: collision with other inner class name */
        static final class C0117b extends Lambda implements Function0<String> {
            public static final C0117b b = new C0117b();

            C0117b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to delete stored data in image loader";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(Context context) {
            File file;
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                file = new File(context.getCacheDir(), DefaultBrazeImageLoader.BRAZE_LRU_CACHE_FOLDER);
            } catch (Exception e) {
                e = e;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a(file), 2, (Object) null);
                BrazeFileUtils.deleteFileOrDirectory(file);
            } catch (Exception e2) {
                e = e2;
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, C0117b.b);
            }
        }

        @JvmStatic
        public final File a(Context context, String uniqueName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uniqueName, "uniqueName");
            return new File(context.getCacheDir().getPath() + ((Object) File.separator) + uniqueName);
        }
    }
}
