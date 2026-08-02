package ru.ozon.app.android.storefront.widgets.financeWidget.core.single;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.utils.ImagePrefetcherWrapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.couple.ItemVO;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.single.SingleCardVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001d2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001dB\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u00020\n*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0010\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/core/single/SingleCardMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCardDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/single/SingleCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "imagePrefetcherWrapper", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;)V", "", "id", "toVO", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCardDTO;J)Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/single/SingleCardVO;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;", "", "isCompactSize", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;JZ)Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$SingleCardDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleCardMapper implements Function2<FinanceWidgetDTO.CardDTO.SingleCardDTO, d, List<? extends SingleCardVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcherWrapper<ItemVO> imagePrefetcherWrapper;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleCardMapper(@NotNull Context context, @NotNull ImagePrefetcherWrapper<? super ItemVO> imagePrefetcherWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcherWrapper, "imagePrefetcherWrapper");
        this.context = context;
        this.imagePrefetcherWrapper = imagePrefetcherWrapper;
    }

    private final SingleCardVO toVO(FinanceWidgetDTO.CardDTO.SingleCardDTO singleCardDTO, long j11) {
        ItemVO vo = toVO(singleCardDTO.getItem(), j11, singleCardDTO.getIsCompactSize());
        this.imagePrefetcherWrapper.prefetch(this.context, C7714v.a0(vo));
        Unit unit = Unit.f71690a;
        String widgetBackgroundColor = singleCardDTO.getWidgetBackgroundColor();
        boolean isCompactSize = singleCardDTO.getIsCompactSize();
        int spanIndex = singleCardDTO.getSpanIndex();
        Map<String, TokenizedTrackingInfo> widgetTrackingInfo = singleCardDTO.getWidgetTrackingInfo();
        return new SingleCardVO(j11, vo, widgetBackgroundColor, isCompactSize, spanIndex, widgetTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(widgetTrackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleCardVO> invoke(@NotNull FinanceWidgetDTO.CardDTO.SingleCardDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final ItemVO toVO(FinanceWidgetDTO.ItemDTO itemDTO, long j11, boolean z11) {
        FinanceWidgetDTO.ItemDTO.BalanceState balanceState = itemDTO.getBalanceState();
        FinanceWidgetDTO.ItemDTO.BalanceState maxLinesForBalanceState = balanceState != null ? SingleCardMapperKt.setMaxLinesForBalanceState(balanceState) : null;
        FinanceWidgetDTO.ItemDTO.PromoState promoState = itemDTO.getPromoState();
        FinanceWidgetDTO.ItemDTO.PromoState maxLinesForPromoState = promoState != null ? SingleCardMapperKt.setMaxLinesForPromoState(promoState, TextDTO.TextAlignment.CENTER) : null;
        String backgroundColor = itemDTO.getBackgroundColor();
        AtomActionDTO action = itemDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, itemDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = itemDTO.getTrackingInfo();
        return new ItemVO(maxLinesForBalanceState, maxLinesForPromoState, backgroundColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, z11);
    }
}
