package ru.ozon.app.android.pikazon.glide.loaders;

import T5.i;
import Z5.h;
import Z5.p;
import Z5.q;
import Z5.t;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/ResizeUrlLoader;", "LZ5/p;", "LZ5/h;", "Ljava/io/InputStream;", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "urlLoader", "<init>", "(LZ5/p;)V", "model", "", "width", "height", "LT5/i;", "options", "LZ5/p$a;", "buildLoadData", "(LZ5/h;IILT5/i;)LZ5/p$a;", "", "handles", "(LZ5/h;)Z", "LZ5/p;", "Factory", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ResizeUrlLoader implements p<h, InputStream> {

    @NotNull
    private final p<PikazonUrl, InputStream> urlLoader;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0005¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/ResizeUrlLoader$Factory;", "LZ5/q;", "LZ5/h;", "Ljava/io/InputStream;", "<init>", "()V", "LZ5/t;", "multiFactory", "LZ5/p;", "build", "(LZ5/t;)LZ5/p;", "", "teardown", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Factory implements q<h, InputStream> {
        @Override // Z5.q
        @NotNull
        public p<h, InputStream> build(@NotNull t multiFactory) {
            Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
            p c11 = multiFactory.c(PikazonUrl.class, InputStream.class);
            Intrinsics.checkNotNullExpressionValue(c11, "build(...)");
            return new ResizeUrlLoader(c11);
        }

        @Override // Z5.q
        public void teardown() {
        }
    }

    public ResizeUrlLoader(@NotNull p<PikazonUrl, InputStream> urlLoader) {
        Intrinsics.checkNotNullParameter(urlLoader, "urlLoader");
        this.urlLoader = urlLoader;
    }

    @Override // Z5.p
    public boolean handles(@NotNull h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }

    @Override // Z5.p
    public p.a<InputStream> buildLoadData(@NotNull h model, int width, int height, @NotNull i options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        p<PikazonUrl, InputStream> pVar = this.urlLoader;
        String d11 = model.d();
        Intrinsics.checkNotNullExpressionValue(d11, "toStringUrl(...)");
        return pVar.buildLoadData(new PikazonUrl(d11, null, 2, null), width, height, options);
    }
}
