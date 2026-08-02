package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import Sc.s;
import WZ.e;
import WZ.t;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2BannerVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2BannerSeparatedButtonVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.data.PixelAnalyticsKey;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\b\b\u0000\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072$\u0010\u000f\u001a \u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0004\u0012\u00020\u000e0\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000eH\u0014¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010'JG\u0010-\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u001f2$\u0010\u000f\u001a \u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0004\u0012\u00020\u000e0\tH\u0016¢\u0006\u0004\b-\u0010.J?\u0010/\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u00072$\u0010\u000f\u001a \u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0004\u0012\u00020\u000e0\tH\u0016¢\u0006\u0004\b/\u0010\u0011J\u0019\u00100\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\"0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00120:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001f068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00109¨\u0006B"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BannerViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BannerViewModel;", "Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;", "pixelApiRepository", "<init>", "(Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;", "vo", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "", "trackComposerAnalytics", "trackImpressionAnalytics", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;Lkotlin/jvm/functions/Function2;)V", "", "id", "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixels", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "delayMs", "trackPixelAnalytics", "(JLjava/util/List;Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;J)V", "pixel", "safeTrackPixel", "(Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isImpressionEventAlreadySent", "(J)Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/data/PixelAnalyticsKey;", "key", "isPixelEventAlreadySent", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/data/PixelAnalyticsKey;)Z", "clearImpression", "()V", "clearPixel", "onCleared", "onRefresh", "item", "mostlyVisible", "widgetVisibilityChanged", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;ZLkotlin/jvm/functions/Function2;)V", "bannerImageLoaded", "bannerClicked", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2BannerSeparatedButtonVO;", "separatedButtonClicked", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2BannerSeparatedButtonVO;)V", "Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;", "", "Lxe/B0;", "impressionAnalyticsJobMap", "Ljava/util/Map;", "", "oneTimeImpressionEventsSet", "Ljava/util/Set;", "pixelAnalyticsJobMap", "oneTimePixelEventsSet", "bannersImageLoadedSet", "widgetMostlyVisibleMap", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2BannerViewModelImpl extends w0 implements TileGrid2BannerViewModel {

    @NotNull
    private final Set<Long> bannersImageLoadedSet;

    @NotNull
    private final Map<Long, B0> impressionAnalyticsJobMap;

    @NotNull
    private final Set<Long> oneTimeImpressionEventsSet;

    @NotNull
    private final Set<PixelAnalyticsKey> oneTimePixelEventsSet;

    @NotNull
    private final Map<PixelAnalyticsKey, B0> pixelAnalyticsJobMap;

    @NotNull
    private final PixelApiRepository pixelApiRepository;

    @NotNull
    private final Map<Long, Boolean> widgetMostlyVisibleMap;

    public TileGrid2BannerViewModelImpl(@NotNull PixelApiRepository pixelApiRepository) {
        Intrinsics.checkNotNullParameter(pixelApiRepository, "pixelApiRepository");
        this.pixelApiRepository = pixelApiRepository;
        this.impressionAnalyticsJobMap = new LinkedHashMap();
        this.oneTimeImpressionEventsSet = new LinkedHashSet();
        this.pixelAnalyticsJobMap = new LinkedHashMap();
        this.oneTimePixelEventsSet = new LinkedHashSet();
        this.bannersImageLoadedSet = new LinkedHashSet();
        this.widgetMostlyVisibleMap = new LinkedHashMap();
    }

    private final void clearImpression() {
        Iterator<Map.Entry<Long, B0>> it = this.impressionAnalyticsJobMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().j(null);
        }
        this.impressionAnalyticsJobMap.clear();
        this.oneTimeImpressionEventsSet.clear();
    }

    private final void clearPixel() {
        if (!this.pixelAnalyticsJobMap.isEmpty()) {
            Iterator<Map.Entry<PixelAnalyticsKey, B0>> it = this.pixelAnalyticsJobMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().j(null);
            }
            this.pixelAnalyticsJobMap.clear();
        }
        if (this.oneTimePixelEventsSet.isEmpty()) {
            return;
        }
        this.oneTimePixelEventsSet.clear();
    }

    private final boolean isImpressionEventAlreadySent(long id2) {
        return this.oneTimeImpressionEventsSet.contains(Long.valueOf(id2));
    }

    private final boolean isPixelEventAlreadySent(PixelAnalyticsKey key) {
        return this.oneTimePixelEventsSet.contains(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        Lm0.a.f17149a.e(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object safeTrackPixel(Pixel pixel, d<? super Unit> dVar) {
        TileGrid2BannerViewModelImpl$safeTrackPixel$1 tileGrid2BannerViewModelImpl$safeTrackPixel$1;
        int i11;
        if (dVar instanceof TileGrid2BannerViewModelImpl$safeTrackPixel$1) {
            tileGrid2BannerViewModelImpl$safeTrackPixel$1 = (TileGrid2BannerViewModelImpl$safeTrackPixel$1) dVar;
            int i12 = tileGrid2BannerViewModelImpl$safeTrackPixel$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                tileGrid2BannerViewModelImpl$safeTrackPixel$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = tileGrid2BannerViewModelImpl$safeTrackPixel$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = tileGrid2BannerViewModelImpl$safeTrackPixel$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    PixelApiRepository pixelApiRepository = this.pixelApiRepository;
                    String url = pixel.getUrl();
                    tileGrid2BannerViewModelImpl$safeTrackPixel$1.label = 1;
                    if (pixelApiRepository.track(url, tileGrid2BannerViewModelImpl$safeTrackPixel$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        tileGrid2BannerViewModelImpl$safeTrackPixel$1 = new TileGrid2BannerViewModelImpl$safeTrackPixel$1(this, dVar);
        Object obj2 = tileGrid2BannerViewModelImpl$safeTrackPixel$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = tileGrid2BannerViewModelImpl$safeTrackPixel$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    private final void trackImpressionAnalytics(TileGrid2BannerVO vo, Function2<? super t, ? super e, Unit> trackComposerAnalytics) {
        B0 b02 = this.impressionAnalyticsJobMap.get(Long.valueOf(vo.getId()));
        if ((b02 == null || !b02.isActive()) && !isImpressionEventAlreadySent(vo.getId())) {
            this.impressionAnalyticsJobMap.put(Long.valueOf(vo.getId()), C10727i.c(x0.a(this), null, null, new TileGrid2BannerViewModelImpl$trackImpressionAnalytics$1(vo, this, trackComposerAnalytics, null), 3));
        }
    }

    private final void trackPixelAnalytics(long id2, List<Pixel> pixels, Pixel.ActionType actionType, long delayMs) {
        long j11;
        if (pixels != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : pixels) {
                if (((Pixel) obj).getAction() == actionType) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pixel pixel = (Pixel) it.next();
                PixelAnalyticsKey pixelAnalyticsKey = new PixelAnalyticsKey(id2, pixel.getAction());
                B0 b02 = this.pixelAnalyticsJobMap.get(pixelAnalyticsKey);
                if ((b02 == null || !b02.isActive()) && !isPixelEventAlreadySent(pixelAnalyticsKey)) {
                    j11 = delayMs;
                    this.pixelAnalyticsJobMap.put(pixelAnalyticsKey, C10727i.c(x0.a(this), null, null, new TileGrid2BannerViewModelImpl$trackPixelAnalytics$2$1(j11, this, pixel, pixelAnalyticsKey, null), 3));
                } else {
                    j11 = delayMs;
                }
                delayMs = j11;
            }
        }
    }

    static /* synthetic */ void trackPixelAnalytics$default(TileGrid2BannerViewModelImpl tileGrid2BannerViewModelImpl, long j11, List list, Pixel.ActionType actionType, long j12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            j12 = -1;
        }
        tileGrid2BannerViewModelImpl.trackPixelAnalytics(j11, list, actionType, j12);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModel
    public void bannerClicked(TileGrid2BannerVO item) {
        if (item == null || !this.bannersImageLoadedSet.contains(Long.valueOf(item.getId()))) {
            return;
        }
        trackPixelAnalytics$default(this, item.getId(), item.getPixel(), Pixel.ActionType.CLICK, 0L, 8, null);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModel
    public void bannerImageLoaded(TileGrid2BannerVO item, @NotNull Function2<? super t, ? super e, Unit> trackComposerAnalytics) {
        Intrinsics.checkNotNullParameter(trackComposerAnalytics, "trackComposerAnalytics");
        if (item == null) {
            return;
        }
        this.bannersImageLoadedSet.add(Long.valueOf(item.getId()));
        if (Intrinsics.d(this.widgetMostlyVisibleMap.get(Long.valueOf(item.getId())), Boolean.TRUE)) {
            trackImpressionAnalytics(item, trackComposerAnalytics);
            trackPixelAnalytics$default(this, item.getId(), item.getPixel(), Pixel.ActionType.VIEW, 0L, 8, null);
            trackPixelAnalytics(item.getId(), item.getPixel(), Pixel.ActionType.IMPRESSION, 1000L);
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        clearImpression();
        clearPixel();
        this.bannersImageLoadedSet.clear();
        this.widgetMostlyVisibleMap.clear();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModel
    public void onRefresh() {
        clearImpression();
        clearPixel();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModel
    public void separatedButtonClicked(TileGrid2BannerSeparatedButtonVO item) {
        if (item == null || !this.bannersImageLoadedSet.contains(Long.valueOf(item.getRootTileWidgetId()))) {
            return;
        }
        trackPixelAnalytics$default(this, item.getRootTileWidgetId(), item.getPixel(), Pixel.ActionType.CLICK, 0L, 8, null);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModel
    public void widgetVisibilityChanged(TileGrid2BannerVO item, boolean mostlyVisible, @NotNull Function2<? super t, ? super e, Unit> trackComposerAnalytics) {
        Intrinsics.checkNotNullParameter(trackComposerAnalytics, "trackComposerAnalytics");
        if (item == null) {
            return;
        }
        this.widgetMostlyVisibleMap.put(Long.valueOf(item.getId()), Boolean.valueOf(mostlyVisible));
        if (!mostlyVisible) {
            B0 b02 = this.impressionAnalyticsJobMap.get(Long.valueOf(item.getId()));
            if (b02 != null) {
                b02.j(null);
            }
            B0 b03 = this.pixelAnalyticsJobMap.get(new PixelAnalyticsKey(item.getId(), Pixel.ActionType.VIEW));
            if (b03 != null) {
                b03.j(null);
            }
        }
        if (mostlyVisible && this.bannersImageLoadedSet.contains(Long.valueOf(item.getId()))) {
            trackImpressionAnalytics(item, trackComposerAnalytics);
            trackPixelAnalytics$default(this, item.getId(), item.getPixel(), Pixel.ActionType.VIEW, 0L, 8, null);
            trackPixelAnalytics(item.getId(), item.getPixel(), Pixel.ActionType.IMPRESSION, 1000L);
        }
    }
}
