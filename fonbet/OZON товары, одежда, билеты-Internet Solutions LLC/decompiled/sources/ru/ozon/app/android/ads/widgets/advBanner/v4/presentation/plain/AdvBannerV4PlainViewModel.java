package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain;

import Ae.E0;
import Ae.InterfaceC2395h;
import I0.C3173b;
import WZ.e;
import WZ.t;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4VO;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J;\u00100\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00062$\u0010/\u001a \u0012\b\u0012\u00060+j\u0002`,\u0012\f\u0012\n\u0018\u00010-j\u0004\u0018\u0001`.\u0012\u0004\u0012\u00020\u000f0*¢\u0006\u0004\b0\u00101J;\u00102\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00062$\u0010/\u001a \u0012\b\u0012\u00060+j\u0002`,\u0012\f\u0012\n\u0018\u00010-j\u0004\u0018\u0001`.\u0012\u0004\u0012\u00020\u000f0*¢\u0006\u0004\b2\u00101J\r\u00103\u001a\u00020\u000f¢\u0006\u0004\b3\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0016\u00105\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00180=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020A0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010<R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;", "pixelApiRepository", "<init>", "(Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;)V", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "item", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "findPixels", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;)Ljava/util/List;", "pixel", "", "trackPixel", "(Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;)V", "", "key", "Lkotlin/Function0;", "action", "checkAndExecuteActionIfNeeded", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "", "checkIsImpressionTrackNeeded", "(J)Z", "LAe/h;", "observeRotationEventsFlow", "()LAe/h;", "canTrack", "setCanTrackPixels", "(Z)V", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4VO;", "vo", "startAutoRotationByDelay", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4VO;)V", "stopAutoRotation", "()V", "trackClick", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;)V", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "trackComposerAnalytics", "trackViewV4", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;Lkotlin/jvm/functions/Function2;)V", "trackImpressionV4", "releaseAnalyticsData", "Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;", "canTrackPixels", "Z", "LAe/w0;", "rotationEventsFlow", "LAe/w0;", "", "trackedOneTimeEventsMap", "Ljava/util/Map;", "", "trackedOneTimeViewEventsSet", "Ljava/util/Set;", "trackedOneTimeImpressionEventsSet", "Lxe/B0;", "trackedImpressionJobMap", "rotationJob", "Lxe/B0;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4PlainViewModel extends w0 {
    private boolean canTrackPixels;

    @NotNull
    private final PixelApiRepository pixelApiRepository;

    @NotNull
    private final Ae.w0<Unit> rotationEventsFlow;
    private B0 rotationJob;

    @NotNull
    private final Map<Long, B0> trackedImpressionJobMap;

    @NotNull
    private final Map<String, Boolean> trackedOneTimeEventsMap;

    @NotNull
    private final Set<Long> trackedOneTimeImpressionEventsSet;

    @NotNull
    private final Set<Long> trackedOneTimeViewEventsSet;

    public AdvBannerV4PlainViewModel(@NotNull PixelApiRepository pixelApiRepository) {
        Intrinsics.checkNotNullParameter(pixelApiRepository, "pixelApiRepository");
        this.pixelApiRepository = pixelApiRepository;
        this.canTrackPixels = true;
        this.rotationEventsFlow = E0.b(0, 0, null, 7);
        this.trackedOneTimeEventsMap = new LinkedHashMap();
        this.trackedOneTimeViewEventsSet = new LinkedHashSet();
        this.trackedOneTimeImpressionEventsSet = new LinkedHashSet();
        this.trackedImpressionJobMap = new LinkedHashMap();
    }

    private final void checkAndExecuteActionIfNeeded(String key, Function0<Unit> action) {
        Map<String, Boolean> map = this.trackedOneTimeEventsMap;
        Boolean bool = map.get(key);
        if (bool == null) {
            bool = Boolean.FALSE;
            map.put(key, bool);
        }
        if (bool.booleanValue()) {
            return;
        }
        this.trackedOneTimeEventsMap.put(key, Boolean.TRUE);
        action.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIsImpressionTrackNeeded(long key) {
        return !this.trackedOneTimeImpressionEventsSet.contains(Long.valueOf(key));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pixel> findPixels(AdvBannerV4ItemVO item, Pixel.ActionType actionType) {
        List<Pixel> pixel;
        if (item == null || (pixel = item.getPixel()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : pixel) {
            if (((Pixel) obj).getAction() == actionType) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackPixel(Pixel pixel) {
        C10727i.c(x0.a(this), null, null, new AdvBannerV4PlainViewModel$trackPixel$1(this, pixel, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<Unit> observeRotationEventsFlow() {
        return this.rotationEventsFlow;
    }

    public final void releaseAnalyticsData() {
        this.trackedOneTimeEventsMap.clear();
        this.trackedOneTimeImpressionEventsSet.clear();
        this.trackedOneTimeViewEventsSet.clear();
        Iterator<Map.Entry<Long, B0>> it = this.trackedImpressionJobMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().j(null);
        }
        this.trackedImpressionJobMap.clear();
    }

    public final void setCanTrackPixels(boolean canTrack) {
        this.canTrackPixels = canTrack;
    }

    public final void startAutoRotationByDelay(@NotNull AdvBannerV4VO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        long rotationPeriod = vo.getRotationOptions().getRotationPeriod();
        B0 b02 = this.rotationJob;
        if (b02 != null) {
            b02.j(null);
        }
        if (!vo.getRotationOptions().getIsAutoRotateOn() || vo.getItems().size() < 2) {
            return;
        }
        this.rotationJob = C10727i.c(x0.a(this), C10720e0.a(), null, new AdvBannerV4PlainViewModel$startAutoRotationByDelay$1(rotationPeriod, this, null), 2);
    }

    public final void stopAutoRotation() {
        B0 b02 = this.rotationJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    public final void trackClick(@NotNull AdvBannerV4ItemVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        checkAndExecuteActionIfNeeded(C3173b.b(vo.getId(), "CLICK "), new AdvBannerV4PlainViewModel$trackClick$1(this, vo));
    }

    public final void trackImpressionV4(@NotNull AdvBannerV4ItemVO vo, @NotNull Function2<? super t, ? super e, Unit> trackComposerAnalytics) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(trackComposerAnalytics, "trackComposerAnalytics");
        if (checkIsImpressionTrackNeeded(vo.getId())) {
            B0 b02 = this.trackedImpressionJobMap.get(Long.valueOf(vo.getId()));
            if (b02 == null || !b02.isActive()) {
                this.trackedImpressionJobMap.put(Long.valueOf(vo.getId()), C10727i.c(x0.a(this), null, null, new AdvBannerV4PlainViewModel$trackImpressionV4$1(this, vo, trackComposerAnalytics, null), 3));
            }
        }
    }

    public final void trackViewV4(@NotNull AdvBannerV4ItemVO vo, @NotNull Function2<? super t, ? super e, Unit> trackComposerAnalytics) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(trackComposerAnalytics, "trackComposerAnalytics");
        if (this.trackedOneTimeViewEventsSet.contains(Long.valueOf(vo.getId()))) {
            return;
        }
        this.trackedOneTimeViewEventsSet.add(Long.valueOf(vo.getId()));
        List<Pixel> findPixels = findPixels(vo, Pixel.ActionType.VIEW);
        if (findPixels != null) {
            Iterator<T> it = findPixels.iterator();
            while (it.hasNext()) {
                trackPixel((Pixel) it.next());
            }
        }
        t tokenizedEvent = vo.getTokenizedEvent();
        if (tokenizedEvent != null) {
            trackComposerAnalytics.invoke(tokenizedEvent, null);
        }
    }
}
