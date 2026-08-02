package ru.ozon.app.android.storefront.widgets.financeWidget.core.carousel;

import WZ.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.utils.ImagePrefetcherWrapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001d2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001dB\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u00020\n*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0010\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/core/carousel/CarouselCardMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;", "imagePrefetcherWrapper", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;)V", "", "id", "toVO", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel;J)Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel$Banner;", "", "isCompactSize", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel$Banner;JZ)Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCarousel;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselCardMapper implements Function2<FinanceWidgetDTO.CardDTO.SingleCarousel, d, List<? extends CarouselCardVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcherWrapper<CarouselCardVO.Banner> imagePrefetcherWrapper;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselCardMapper(@NotNull Context context, @NotNull ImagePrefetcherWrapper<? super CarouselCardVO.Banner> imagePrefetcherWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcherWrapper, "imagePrefetcherWrapper");
        this.context = context;
        this.imagePrefetcherWrapper = imagePrefetcherWrapper;
    }

    private final CarouselCardVO toVO(FinanceWidgetDTO.CardDTO.SingleCarousel singleCarousel, long j11) {
        List<FinanceWidgetDTO.CardDTO.SingleCarousel.Banner> banners = singleCarousel.getBanners();
        ArrayList arrayList = new ArrayList(C7714v.z(banners, 10));
        Iterator<T> it = banners.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((FinanceWidgetDTO.CardDTO.SingleCarousel.Banner) it.next(), j11, singleCarousel.getIsCompactSize()));
        }
        this.imagePrefetcherWrapper.prefetch(this.context, C7714v.K0(arrayList, 1));
        long millis = TimeUnit.SECONDS.toMillis(singleCarousel.getBannerDuration() != null ? r1.intValue() : 5);
        Map<String, TokenizedTrackingInfo> trackingInfo = singleCarousel.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        String widgetBackgroundColor = singleCarousel.getWidgetBackgroundColor();
        boolean isCompactSize = singleCarousel.getIsCompactSize();
        int spanIndex = singleCarousel.getSpanIndex();
        Map<String, TokenizedTrackingInfo> widgetTrackingInfo = singleCarousel.getWidgetTrackingInfo();
        return new CarouselCardVO(j11, arrayList, millis, tokenizedEvent$default, widgetTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(widgetTrackingInfo, Long.valueOf(j11), null, 2, null) : null, widgetBackgroundColor, isCompactSize, spanIndex);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CarouselCardVO> invoke(@NotNull FinanceWidgetDTO.CardDTO.SingleCarousel state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner, still in use, count: 2, list:
          (r0v0 ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner) from 0x0067: MOVE (r24v0 ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner) = (r0v0 ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner)
          (r0v0 ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner) from 0x005d: MOVE (r24v2 ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner) = (r0v0 ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    private final ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO.Banner toVO(ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO.CardDTO.SingleCarousel.Banner r26, long r27, boolean r29) {
        /*
            r25 = this;
            ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner r0 = new ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner
            ru.ozon.uni.atoms.data.text.TextDTO r1 = r26.getTitle()
            ru.ozon.uni.atoms.data.text.TextDTO r2 = r26.getSubtitle()
            ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO r3 = r26.getButton()
            r4 = 0
            if (r3 == 0) goto L67
            ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO r5 = r26.getButton()
            ru.ozon.uni.atoms.data.controls.CommonControlSettings r6 = r5.getCommon()
            if (r6 == 0) goto L2d
            ru.ozon.uni.atoms.data.AtomActionDTO r7 = r26.getAction()
            java.util.Map r8 = r26.getTrackingInfo()
            r11 = 0
            r9 = 0
            r10 = 4
            ru.ozon.uni.atoms.data.controls.CommonControlSettings r5 = ru.ozon.uni.atoms.data.controls.CommonControlSettings.copy$default(r6, r7, r8, r9, r10, r11)
            r17 = r5
            goto L2f
        L2d:
            r17 = r4
        L2f:
            r19 = 0
            r20 = 0
            r5 = r4
            r4 = 0
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r21 = r18
            r18 = 0
            r22 = r21
            r21 = 122879(0x1dfff, float:1.7219E-40)
            r23 = r22
            r22 = 0
            r24 = r0
            r0 = r23
            ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO r4 = ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = r4
            goto L6b
        L67:
            r24 = r0
            r0 = r4
            r3 = r0
        L6b:
            java.lang.String r4 = r26.getBackgroundColor()
            java.lang.String r5 = r26.getBackgroundImage()
            ru.ozon.uni.atoms.data.AtomActionDTO r6 = r26.getAction()
            if (r6 == 0) goto L82
            java.util.Map r7 = r26.getTrackingInfo()
            ru.ozon.uni.atoms.af.AtomAction r6 = ru.ozon.uni.atoms.data.AtomActionMapperKt.toAtomAction(r6, r7)
            goto L83
        L82:
            r6 = r0
        L83:
            java.util.Map r7 = r26.getTrackingInfo()
            if (r7 == 0) goto L92
            java.lang.Long r8 = java.lang.Long.valueOf(r27)
            r9 = 2
            WZ.t r0 = ru.ozon.app.android.composer.TrackingInfoMapperKt.mapToTokenizedEvent$default(r7, r8, r0, r9, r0)
        L92:
            r8 = r29
            r7 = r0
            r0 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.storefront.widgets.financeWidget.core.carousel.CarouselCardMapper.toVO(ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO$CardDTO$SingleCarousel$Banner, long, boolean):ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO$Banner");
    }
}
