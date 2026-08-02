package ru.ozon.app.android.pikazon.glide.thumbnail;

import T5.i;
import Z5.p;
import Z5.q;
import Z5.t;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.internal.StringExtKt;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbUrlLoader;", "LZ5/p;", "Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", "Ljava/io/InputStream;", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "urlLoader", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "thumbCache", "<init>", "(LZ5/p;Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;)V", "model", "", "width", "height", "LT5/i;", "options", "LZ5/p$a;", "buildLoadData", "(Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;IILT5/i;)LZ5/p$a;", "", "handles", "(Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;)Z", "LZ5/p;", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "Factory", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ThumbUrlLoader implements p<Thumb, InputStream> {

    @NotNull
    private final ThumbCache thumbCache;

    @NotNull
    private final p<PikazonUrl, InputStream> urlLoader;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbUrlLoader$Factory;", "LZ5/q;", "Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", "Ljava/io/InputStream;", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "thumbCache", "<init>", "(Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;)V", "LZ5/t;", "multiFactory", "LZ5/p;", "build", "(LZ5/t;)LZ5/p;", "", "teardown", "()V", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Factory implements q<Thumb, InputStream> {

        @NotNull
        private final ThumbCache thumbCache;

        public Factory(@NotNull ThumbCache thumbCache) {
            Intrinsics.checkNotNullParameter(thumbCache, "thumbCache");
            this.thumbCache = thumbCache;
        }

        @Override // Z5.q
        @NotNull
        public p<Thumb, InputStream> build(@NotNull t multiFactory) {
            Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
            p c11 = multiFactory.c(PikazonUrl.class, InputStream.class);
            Intrinsics.checkNotNullExpressionValue(c11, "build(...)");
            return new ThumbUrlLoader(c11, this.thumbCache);
        }

        @Override // Z5.q
        public void teardown() {
        }
    }

    public ThumbUrlLoader(@NotNull p<PikazonUrl, InputStream> urlLoader, @NotNull ThumbCache thumbCache) {
        Intrinsics.checkNotNullParameter(urlLoader, "urlLoader");
        Intrinsics.checkNotNullParameter(thumbCache, "thumbCache");
        this.urlLoader = urlLoader;
        this.thumbCache = thumbCache;
    }

    @Override // Z5.p
    public boolean handles(@NotNull Thumb model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }

    @Override // Z5.p
    public p.a<InputStream> buildLoadData(@NotNull Thumb model, int width, int height, @NotNull i options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        Thumb findThumb = ThumbUrlLoaderKt.findThumb(this.thumbCache.get(model.getCacheKey()), width, height);
        if (findThumb == null) {
            findThumb = model;
        }
        return this.urlLoader.buildLoadData(new PikazonUrl(StringExtKt.ignoreResize(findThumb.getUrl()), model.getUuid()), width, height, options);
    }
}
