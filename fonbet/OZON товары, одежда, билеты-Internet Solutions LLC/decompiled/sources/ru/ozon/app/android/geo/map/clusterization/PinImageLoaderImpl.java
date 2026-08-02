package ru.ozon.app.android.geo.map.clusterization;

import Sc.r;
import Wc.a;
import Wc.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import xe.C10720e0;
import xe.C10727i;
import xe.C10737n;
import xe.InterfaceC10733l;

@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u001c\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/PinImageLoaderImpl;", "Lru/ozon/app/android/geo/map/clusterization/PinImageLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", ImagesContract.URL, "", "downloadImage", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "hasCachedImage", "(Ljava/lang/String;)Z", "Landroid/graphics/Bitmap;", "bitmap", "saveImage", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", "urls", "loadImages", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getImage", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "Landroid/content/Context;", "Ljava/io/File;", "cacheDir", "Ljava/io/File;", "ru/ozon/app/android/geo/map/clusterization/PinImageLoaderImpl$memoryCache$1", "memoryCache", "Lru/ozon/app/android/geo/map/clusterization/PinImageLoaderImpl$memoryCache$1;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PinImageLoaderImpl implements PinImageLoader {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final File cacheDir;

    @NotNull
    private final Context context;

    @NotNull
    private final PinImageLoaderImpl$memoryCache$1 memoryCache;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/PinImageLoaderImpl$Companion;", "", "<init>", "()V", "IMAGES_DIR_NAME", "", "MEMORY_CACHE_SIZE", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ru.ozon.app.android.geo.map.clusterization.PinImageLoaderImpl$memoryCache$1] */
    public PinImageLoaderImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        File file = new File(context.getFilesDir(), "pin_images");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.cacheDir = file;
        this.memoryCache = new LruCache<String, Bitmap>() { // from class: ru.ozon.app.android.geo.map.clusterization.PinImageLoaderImpl$memoryCache$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            public int sizeOf(String key, Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                return bitmap.getByteCount();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadImage(final String str, d<? super Unit> frame) {
        final C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        ContextExtKt.load(this.context, str, (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.geo.map.clusterization.PinImageLoaderImpl$downloadImage$2$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                InterfaceC10733l<Unit> interfaceC10733l = c10737n;
                r.Companion companion = r.INSTANCE;
                interfaceC10733l.resumeWith(Unit.f71690a);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                PinImageLoaderImpl$memoryCache$1 pinImageLoaderImpl$memoryCache$1;
                if (resource != null) {
                    PinImageLoaderImpl pinImageLoaderImpl = this;
                    String str2 = str;
                    Bitmap b11 = androidx.core.graphics.drawable.b.b(resource, 0, 0, 7);
                    pinImageLoaderImpl.saveImage(str2, b11);
                    pinImageLoaderImpl$memoryCache$1 = pinImageLoaderImpl.memoryCache;
                    pinImageLoaderImpl$memoryCache$1.put(str2, b11);
                }
                InterfaceC10733l<Unit> interfaceC10733l = c10737n;
                r.Companion companion = r.INSTANCE;
                interfaceC10733l.resumeWith(Unit.f71690a);
            }
        }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : null);
        Object n11 = c10737n.n();
        a aVar = a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasCachedImage(String url) {
        return new File(this.cacheDir, String.valueOf(url.hashCode())).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveImage(String url, Bitmap bitmap) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.cacheDir, String.valueOf(url.hashCode())));
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        } finally {
        }
    }

    @Override // ru.ozon.app.android.geo.map.clusterization.PinImageLoader
    public Bitmap getImage(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Bitmap bitmap = get(url);
        if (bitmap != null) {
            return bitmap;
        }
        File file = new File(this.cacheDir, String.valueOf(url.hashCode()));
        if (!file.exists()) {
            return null;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        put(url, decodeFile);
        return decodeFile;
    }

    @Override // ru.ozon.app.android.geo.map.clusterization.PinImageLoader
    public Object loadImages(@NotNull List<String> list, @NotNull d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(He.b.f10879b, new PinImageLoaderImpl$loadImages$2(list, this, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
