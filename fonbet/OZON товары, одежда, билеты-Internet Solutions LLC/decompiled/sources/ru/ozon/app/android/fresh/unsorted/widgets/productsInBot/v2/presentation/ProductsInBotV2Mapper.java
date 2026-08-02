package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.unsorted.R$plurals;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.data.ProductsInBotV2DTO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain.ProductsInBotV2VO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004*\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO$ItemDTO;", "", "widgetId", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "toVO", "(Ljava/util/List;J)Ljava/util/List;", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO$ItemDTO;J)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO;Ll20/d;)Ljava/util/List;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotV2Mapper implements Function2<ProductsInBotV2DTO, d, List<? extends ProductsInBotV2VO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String defaultButtonText = StringProvider.getQuantityString(R$plurals.products_in_bot_v2_count_plural, 0, 0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2Mapper$Companion;", "", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final List<ProductsInBotV2VO.ItemVO> toVO(List<ProductsInBotV2DTO.ItemDTO> list, long j11) {
        List<ProductsInBotV2DTO.ItemDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((ProductsInBotV2DTO.ItemDTO) it.next(), j11));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductsInBotV2VO> invoke(@NotNull ProductsInBotV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ProductsInBotV2VO.ItemVO> vo = toVO(state.getItems(), hashCode);
        ButtonV3DTO copy$default = ButtonV3DTO.copy$default(state.getButton(), null, null, null, null, null, defaultButtonText, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, 130975, null);
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ProductsInBotV2VO(hashCode, vo, copy$default, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }

    private final ProductsInBotV2VO.ItemVO toVO(ProductsInBotV2DTO.ItemDTO itemDTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        RmsCheckbox copy$default = RmsCheckbox.copy$default(itemDTO.getCheckbox(), null, Boolean.FALSE, itemDTO.isDisabled(), 1, null);
        long parseLong = Long.parseLong(itemDTO.getSkuId());
        IconDTO image = itemDTO.getImage();
        IconDTO privateIcon = itemDTO.getPrivateIcon();
        PriceDTO price = itemDTO.getPrice();
        TextDTO name = itemDTO.getName();
        RmsQuantitySelector quantitySelector = itemDTO.getQuantitySelector();
        t tVar = null;
        RmsQuantitySelector copy$default2 = quantitySelector != null ? RmsQuantitySelector.copy$default(quantitySelector, IconButtonV3DTO.copy$default(itemDTO.getQuantitySelector().getIncrease(), null, null, null, null, itemDTO.isDisabled(), null, null, null, null, null, null, null, null, null, 16367, null), IconButtonV3DTO.copy$default(itemDTO.getQuantitySelector().getDecrease(), null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, 16367, null), null, 4, null) : null;
        Integer maxQuantity = itemDTO.getMaxQuantity();
        BadgeDTO badge = itemDTO.getBadge();
        CommonControlSettings common = itemDTO.getCommon();
        if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        }
        t tVar2 = tVar;
        Boolean isDisabled = itemDTO.isDisabled();
        return new ProductsInBotV2VO.ItemVO(copy$default, parseLong, image, privateIcon, price, name, copy$default2, maxQuantity, badge, tVar2, isDisabled != null ? isDisabled.booleanValue() : false);
    }
}
