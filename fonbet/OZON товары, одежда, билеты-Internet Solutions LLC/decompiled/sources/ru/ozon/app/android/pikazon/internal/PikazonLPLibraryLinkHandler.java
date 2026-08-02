package ru.ozon.app.android.pikazon.internal;

import K1.G;
import Sd0.b;
import Sd0.c;
import Sd0.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import jm.RunnableC7436a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.internal.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.logging.PikazonLogger;
import ru.ozon.app.android.pikazon.retry.RequestWithRetryCount;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pikazon/internal/PikazonLPLibraryLinkHandler;", "LSd0/f;", "<init>", "()V", "Landroid/net/Uri;", "", "isValid", "(Landroid/net/Uri;)Z", "deeplink", "LSd0/c;", "downloadImage", "(Landroid/net/Uri;)LSd0/c;", "LSd0/h;", "link", "LSd0/b;", "environment", "handle", "(LSd0/h;LSd0/b;)LSd0/c;", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonLPLibraryLinkHandler implements f {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pikazon/internal/PikazonLPLibraryLinkHandler$Companion;", "", "<init>", "()V", "PIKAZON_DEEPLINK_HOST", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final c downloadImage(Uri deeplink) {
        ImageSize imageSize;
        Long l11;
        List m11;
        ImageSize imageSize2;
        PikazonLogger pikazonLogger = PikazonLogger.INSTANCE;
        pikazonLogger.log("Image loading was started with deeplink " + deeplink);
        Context applicationContext = Pikazon.INSTANCE.getInstance().getConfig().getApplicationContext();
        if (applicationContext == null) {
            return c.d.f26178a;
        }
        String queryParameter = deeplink.getQueryParameter("image_url");
        if (queryParameter == null) {
            throw new IllegalStateException(G.b(deeplink, "Failed to parse image download URL. Deeplink: ").toString());
        }
        String queryParameter2 = deeplink.getQueryParameter("container_size");
        if (queryParameter2 == null || (m11 = h.m(queryParameter2, new String[]{"x"}, 0, 6)) == null) {
            imageSize = null;
        } else {
            if (m11.size() == 2) {
                imageSize2 = new ImageSize(Integer.parseInt((String) m11.get(0)), Integer.parseInt((String) m11.get(1)));
            } else {
                pikazonLogger.logError("Failed to parse image container size", null);
                imageSize2 = null;
            }
            imageSize = imageSize2;
        }
        boolean booleanQueryParameter = deeplink.getBooleanQueryParameter("cache_enabled", false);
        String queryParameter3 = deeplink.getQueryParameter("cancel_after");
        if (queryParameter3 == null || (l11 = h.y0(queryParameter3)) == null || l11.longValue() < 0) {
            l11 = null;
        }
        RequestWithRetryCount loadResource$default = ContextExtKt.loadResource$default(applicationContext, queryParameter, Drawable.class, null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.pikazon.internal.PikazonLPLibraryLinkHandler$downloadImage$request$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                PikazonLogger.INSTANCE.logError("onLoadFailed", e11);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                PikazonLogger.INSTANCE.logError("onLoadSuccessful", null);
            }
        }, null, false, imageSize, LoadPriority.NORMAL, !booleanQueryParameter, 52, null);
        if (l11 != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC7436a(loadResource$default, 1), l11.longValue());
        }
        return c.b.f26177a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadImage$lambda$4$lambda$3(RequestWithRetryCount requestWithRetryCount) {
        if (requestWithRetryCount != null) {
            requestWithRetryCount.cancel();
        }
    }

    private final boolean isValid(Uri uri) {
        return Intrinsics.d(uri.getHost(), "pikazonSDK");
    }

    @Override // Sd0.f
    @NotNull
    public c handle(@NotNull Sd0.h link, @NotNull b environment) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Uri c11 = link.c();
        c.d dVar = c.d.f26178a;
        if (c11 == null || !isValid(c11)) {
            return dVar;
        }
        Uri c12 = link.c();
        String path = c12 != null ? c12.getPath() : null;
        return (path != null && path.hashCode() == 2019887588 && path.equals("/downloadImage")) ? downloadImage(c11) : dVar;
    }
}
