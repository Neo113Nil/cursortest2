package ru.ozon.app.android.pikazon.glide.loaders;

import T5.i;
import Z5.p;
import Z5.q;
import Z5.t;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.callback.raw.PikazonRawRequestsListener;
import ru.ozon.app.android.pikazon.callback.raw.RequestData;
import ru.ozon.app.android.pikazon.glide.thumbnail.Thumb;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlLoader;", "LZ5/p;", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "Ljava/io/InputStream;", "Lru/ozon/app/android/pikazon/Pikazon;", "pikazon", "", "Lru/ozon/app/android/pikazon/callback/raw/PikazonRawRequestsListener;", "rawRequestsListeners", "<init>", "(Lru/ozon/app/android/pikazon/Pikazon;Ljava/util/List;)V", "model", "", "width", "height", "LT5/i;", "options", "LZ5/p$a;", "buildLoadData", "(Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;IILT5/i;)LZ5/p$a;", "", "handles", "(Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;)Z", "Lru/ozon/app/android/pikazon/Pikazon;", "Ljava/util/List;", "Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker;", "cdnChooserUrlChecker", "Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker;", "isCdnChooserEnabled", "()Z", "Factory", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonUrlLoader implements p<PikazonUrl, InputStream> {

    @NotNull
    private final CdnChooserUrlChecker cdnChooserUrlChecker;

    @NotNull
    private final Pikazon pikazon;

    @NotNull
    private final List<PikazonRawRequestsListener> rawRequestsListeners;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlLoader$Factory;", "LZ5/q;", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "Ljava/io/InputStream;", "Lru/ozon/app/android/pikazon/Pikazon;", "pikazon", "", "Lru/ozon/app/android/pikazon/callback/raw/PikazonRawRequestsListener;", "rawRequestsListeners", "<init>", "(Lru/ozon/app/android/pikazon/Pikazon;Ljava/util/List;)V", "LZ5/t;", "multiFactory", "LZ5/p;", "build", "(LZ5/t;)LZ5/p;", "", "teardown", "()V", "Lru/ozon/app/android/pikazon/Pikazon;", "Ljava/util/List;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements q<PikazonUrl, InputStream> {

        @NotNull
        private final Pikazon pikazon;

        @NotNull
        private final List<PikazonRawRequestsListener> rawRequestsListeners;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(@NotNull Pikazon pikazon, @NotNull List<? extends PikazonRawRequestsListener> rawRequestsListeners) {
            Intrinsics.checkNotNullParameter(pikazon, "pikazon");
            Intrinsics.checkNotNullParameter(rawRequestsListeners, "rawRequestsListeners");
            this.pikazon = pikazon;
            this.rawRequestsListeners = rawRequestsListeners;
        }

        @Override // Z5.q
        @NotNull
        public p<PikazonUrl, InputStream> build(@NotNull t multiFactory) {
            Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
            return new PikazonUrlLoader(this.pikazon, this.rawRequestsListeners);
        }

        @Override // Z5.q
        public void teardown() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PikazonUrlLoader(@NotNull Pikazon pikazon, @NotNull List<? extends PikazonRawRequestsListener> rawRequestsListeners) {
        Intrinsics.checkNotNullParameter(pikazon, "pikazon");
        Intrinsics.checkNotNullParameter(rawRequestsListeners, "rawRequestsListeners");
        this.pikazon = pikazon;
        this.rawRequestsListeners = rawRequestsListeners;
        this.cdnChooserUrlChecker = pikazon.getCdnChooserUrlChecker();
    }

    private final boolean isCdnChooserEnabled() {
        return this.pikazon.getCdnChooserConfigFlow$lib_release() != null;
    }

    @Override // Z5.p
    public boolean handles(@NotNull PikazonUrl model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }

    @Override // Z5.p
    @NotNull
    public p.a<InputStream> buildLoadData(@NotNull PikazonUrl model, int width, int height, @NotNull i options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        String stringUrl = model.toStringUrl();
        String create = this.pikazon.getConfig().getPikazonUrlFactory().create(this.pikazon.getImagePathHandler().getResizedImagePath(stringUrl, width, height));
        if (isCdnChooserEnabled()) {
            create = this.cdnChooserUrlChecker.checkAndTransformUrl(create);
        }
        PikazonUrl pikazonUrl = new PikazonUrl(create, model.getUuid());
        Thumb thumb = new Thumb(pikazonUrl.getUrl(), pikazonUrl.getUuid(), width, height, true, stringUrl);
        this.pikazon.getThumbCache().put(thumb);
        b.Companion companion = b.INSTANCE;
        long h11 = c.h(System.nanoTime(), EnumC10311b.NANOSECONDS);
        PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker = this.pikazon.getConfig().getPerformanceAvailabilityChecker();
        if (performanceAvailabilityChecker.isPerformanceAnalyticsEnabled()) {
            Iterator<T> it = this.pikazon.getPerformanceListeners$lib_release().iterator();
            while (it.hasNext()) {
                ((PerformanceListener) it.next()).mo5onLoadStartedSxA4cEA(pikazonUrl.getUrl(), model.getUuid(), h11);
            }
        }
        return new p.a<>(pikazonUrl, new PikazonStreamFetcher(this.pikazon, pikazonUrl, new RequestData(model.getUuid(), stringUrl, pikazonUrl.getUrl(), h11, null), this.pikazon.getOkHttpClient(), performanceAvailabilityChecker, this.rawRequestsListeners, new PikazonUrlLoader$buildLoadData$2(this, stringUrl, thumb)));
    }
}
