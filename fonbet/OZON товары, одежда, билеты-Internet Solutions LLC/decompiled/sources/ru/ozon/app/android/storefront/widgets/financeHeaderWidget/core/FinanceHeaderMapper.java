package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.core;

import android.content.Context;
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
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.data.FinanceHeaderDTO;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceHeaderVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B%\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0015\u001a\u00020\u0018*\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/core/FinanceHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;", "imagePrefetcherWrapper", "<init>", "(Lru/ozon/app/android/utils/AppType;Landroid/content/Context;Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;)V", "", "id", "toVo", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO;J)Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$FinanceBadgeDTO;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$FinanceBadgeVO;", "toVO", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$FinanceBadgeDTO;J)Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$FinanceBadgeVO;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$TooltipDTO;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO$TooltipDTO;J)Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/data/FinanceHeaderDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/utils/AppType;", "Landroid/content/Context;", "Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceHeaderMapper implements Function2<FinanceHeaderDTO, d, List<? extends FinanceHeaderVO>> {

    @NotNull
    private final AppType appType;

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcherWrapper<FinanceHeaderVO> imagePrefetcherWrapper;

    /* JADX WARN: Multi-variable type inference failed */
    public FinanceHeaderMapper(@NotNull AppType appType, @NotNull Context context, @NotNull ImagePrefetcherWrapper<? super FinanceHeaderVO> imagePrefetcherWrapper) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcherWrapper, "imagePrefetcherWrapper");
        this.appType = appType;
        this.context = context;
        this.imagePrefetcherWrapper = imagePrefetcherWrapper;
    }

    private final FinanceHeaderVO.FinanceBadgeVO toVO(FinanceHeaderDTO.FinanceBadgeDTO financeBadgeDTO, long j11) {
        TextDTO title = financeBadgeDTO.getTitle();
        ImageDTO image = financeBadgeDTO.getImage();
        String backgroundColor = financeBadgeDTO.getBackgroundColor();
        AtomActionDTO action = financeBadgeDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, financeBadgeDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = financeBadgeDTO.getTrackingInfo();
        return new FinanceHeaderVO.FinanceBadgeVO(title, image, backgroundColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final FinanceHeaderVO toVo(FinanceHeaderDTO financeHeaderDTO, long j11) {
        TextDTO title = financeHeaderDTO.getTitle();
        FinanceHeaderDTO.FinanceBadgeDTO badge = financeHeaderDTO.getBadge();
        FinanceHeaderVO.FinanceBadgeVO vo = badge != null ? toVO(badge, j11) : null;
        boolean z11 = this.appType == AppType.SELECT;
        FinanceHeaderDTO.TooltipDTO tooltip = financeHeaderDTO.getTooltip();
        FinanceHeaderVO.TooltipVO vo2 = tooltip != null ? toVO(tooltip, j11) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = financeHeaderDTO.getTrackingInfo();
        return new FinanceHeaderVO(j11, title, vo, z11, vo2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FinanceHeaderVO> invoke(@NotNull FinanceHeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<FinanceHeaderVO> a02 = C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
        this.imagePrefetcherWrapper.prefetch(this.context, a02);
        return a02;
    }

    private final FinanceHeaderVO.TooltipVO toVO(FinanceHeaderDTO.TooltipDTO tooltipDTO, long j11) {
        TextDTO title = tooltipDTO.getTitle();
        TextDTO subtitle = tooltipDTO.getSubtitle();
        String backgroundColor = tooltipDTO.getBackgroundColor();
        long millis = TimeUnit.SECONDS.toMillis(tooltipDTO.getAutohideDelay() != null ? r4.intValue() : 0);
        Boolean isExpanded = tooltipDTO.isExpanded();
        Integer maxWidth = tooltipDTO.getMaxWidth();
        String tooltipKey = tooltipDTO.getTooltipKey();
        Map<String, TokenizedTrackingInfo> trackingInfo = tooltipDTO.getTrackingInfo();
        return new FinanceHeaderVO.TooltipVO(title, subtitle, backgroundColor, millis, maxWidth, isExpanded, tooltipKey, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
