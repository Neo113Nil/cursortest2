package ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.mapper;

import WZ.t;
import WZ.x;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.labelList.presentation.vo.LabelListMapperKt;
import ru.ozon.app.android.storefront.data.tiles.common.ContentMode;
import ru.ozon.app.android.storefront.data.tiles.common.ContentModeKt;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.data.MaxiTileDTO;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.vi.MaxiTileVI;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u000e\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u0013\u0010\u000e\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u000e\u0010\u0015J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/mapper/MaxiTileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Gallery;", "", "enableParanja", "info", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery;", "toVO", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Gallery;ZLl20/d;)Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MainState;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MainState;", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MainState;)Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MainState;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MultiButton;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MultiButton;", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MultiButton;)Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MultiButton;", "dto", "invoke", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "addToCartButtonConfig", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaxiTileMapper implements Function2<MaxiTileDTO, d, List<? extends MaxiTileVI>> {

    @NotNull
    private final TileThemeConfigVO.AddToCartButtonConfigVO addToCartButtonConfig;

    public MaxiTileMapper() {
        Dimens dimens = Dimens.INSTANCE;
        this.addToCartButtonConfig = new TileThemeConfigVO.AddToCartButtonConfigVO(dimens.getDPF_12(), dimens.getDP_44(), R$drawable.ic_m_plus_sign_filled, R$drawable.ic_m_minus_filled, dimens.getDP_24(), dimens.getDP_10(), R$style.OzonTextAppearance_BodyControl_500medium, dimens.getDP_24(), R$style.OzonTextAppearance_BodyNumeric_500medium, false, true);
    }

    private final MaxiTileVI.Gallery toVO(MaxiTileDTO.Gallery gallery, boolean z11, d dVar) {
        AtomActionDTO action;
        List<MaxiTileDTO.Gallery.ImageItem> imageItems = gallery.getImageItems();
        ArrayList arrayList = new ArrayList(C7714v.z(imageItems, 10));
        Iterator<T> it = imageItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MaxiTileDTO.Gallery.ImageItem imageItem = (MaxiTileDTO.Gallery.ImageItem) it.next();
            String link = imageItem.getLink();
            ContentMode contentMode = imageItem.getContentMode();
            if (contentMode == null) {
                contentMode = ContentMode.SCALE_ASPECT_FILL;
            }
            ImageView.ScaleType mapScaleType = ContentModeKt.mapScaleType(contentMode);
            Map<String, TokenizedTrackingInfo> trackingInfo = imageItem.getTrackingInfo();
            boolean z12 = z11;
            arrayList.add(new MaxiTileVI.Gallery.ImageItem(link, mapScaleType, trackingInfo != null ? x.d(trackingInfo, dVar) : null, z12, gallery.getImageItems().size() > 1 ? MaxiTileVI.Gallery.ImageItem.DisplayMode.RATIO_3_4 : MaxiTileVI.Gallery.ImageItem.DisplayMode.FULL_WIDTH));
            z11 = z12;
        }
        CommonControlSettings common = gallery.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, gallery.getCommon().getTrackingInfo());
        CommonControlSettings common2 = gallery.getCommon();
        return new MaxiTileVI.Gallery(arrayList, atomAction, common2 != null ? common2.getTestInfo() : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MaxiTileVI> invoke(@NotNull MaxiTileDTO dto, @NotNull d info) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Boolean enableParanja;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        MaxiTileDTO.Gallery gallery = dto.getGallery();
        MaxiTileDTO.Options options = dto.getOptions();
        MaxiTileVI.Gallery vo = toVO(gallery, (options == null || (enableParanja = options.getEnableParanja()) == null) ? false : enableParanja.booleanValue(), info);
        CommonControlSettings common = dto.getCommon();
        t tVar = null;
        TestInfo testInfo = common != null ? common.getTestInfo() : null;
        CommonControlSettings common2 = dto.getCommon();
        AtomAction atomAction = (common2 == null || (action = common2.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, dto.getCommon().getTrackingInfo());
        CommonControlSettings common3 = dto.getCommon();
        if (common3 != null && (trackingInfo = common3.getTrackingInfo()) != null) {
            tVar = x.d(trackingInfo, info);
        }
        return C7714v.a0(new MaxiTileVI(hashCode, vo, testInfo, atomAction, tVar, toVO(dto.getMainState()), toVO(dto.getMultiButton())));
    }

    private final MaxiTileVI.MainState toVO(MaxiTileDTO.MainState mainState) {
        TextDTO text = mainState.getText();
        PriceDTO price = mainState.getPrice();
        LabelListDTO labelList = mainState.getLabelList();
        return new MaxiTileVI.MainState(text, price, labelList != null ? LabelListMapperKt.toVO(labelList) : null);
    }

    private final MaxiTileVI.MultiButton toVO(MaxiTileDTO.MultiButton multiButton) {
        return new MaxiTileVI.MultiButton(multiButton.getDetailsButton(), multiButton.getAddToCartButton(), this.addToCartButtonConfig);
    }
}
