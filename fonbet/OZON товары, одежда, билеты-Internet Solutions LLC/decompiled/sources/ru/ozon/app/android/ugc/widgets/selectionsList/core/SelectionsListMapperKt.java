package ru.ozon.app.android.ugc.widgets.selectionsList.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.BackgroundDTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionItemCommon;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListDTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SocialHeader;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.TileFooterContentDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\b0\u0006H\u0000\u001a\u0018\u0010\t\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\f\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u000bH\u0000\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u0016H\u0000\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\u000bH\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u001a"}, d2 = {"toEmptyItemVO", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$EmptyItem;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO$EmptyItem;", "voId", "", "toVO", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionItemFooter$StatusSelectionVO;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/TileFooterContentDTO$SelectionItemFooter$StatusSelection;", "toHeaderVO", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;", "", "toTopRightContent", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;", "toFavoriteProductMolecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "toSmallIconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "toBackground", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/BackgroundDTO;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionItemCommon;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionItemCommon;", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionsListMapperKt {
    public static final SelectionsListVI.Background toBackground(@NotNull BackgroundDTO backgroundDTO) {
        Intrinsics.checkNotNullParameter(backgroundDTO, "<this>");
        if (backgroundDTO.getImage() != null) {
            return new SelectionsListVI.Background.ImageWrapper(backgroundDTO.getImage());
        }
        if (backgroundDTO.getColor() != null) {
            return new SelectionsListVI.Background.ColorWrapper(backgroundDTO.getColor());
        }
        return null;
    }

    @NotNull
    public static final SelectionsListVI.SelectionsListItemVI.EmptyItem toEmptyItemVO(@NotNull SelectionsListDTO.SelectionsListItemDTO.EmptyItem emptyItem, long j11) {
        Intrinsics.checkNotNullParameter(emptyItem, "<this>");
        String overlayColor = emptyItem.getOverlayColor();
        TextDTO title = emptyItem.getTitle();
        SelectionItemCommon selectionItemCommon = emptyItem.getSelectionItemCommon();
        return new SelectionsListVI.SelectionsListItemVI.EmptyItem(j11, selectionItemCommon != null ? toVO(selectionItemCommon, j11) : null, null, emptyItem.getIcon(), title, overlayColor, 4, null);
    }

    @NotNull
    public static final FavoriteProductMolecule toFavoriteProductMolecule(@NotNull FavoriteProductMoleculeV4 favoriteProductMoleculeV4) {
        Intrinsics.checkNotNullParameter(favoriteProductMoleculeV4, "<this>");
        return new FavoriteProductMolecule(null, favoriteProductMoleculeV4.getSku(), favoriteProductMoleculeV4.isFavorite(), toSmallIconButton(favoriteProductMoleculeV4.getFavoriteButton()), toSmallIconButton(favoriteProductMoleculeV4.getUnfavoriteButton()), favoriteProductMoleculeV4.getAddToListAction(), null, 65, null);
    }

    public static final SelectionsListVI.HeaderVO toHeaderVO(Object obj, long j11) {
        if (!(obj instanceof SocialHeader)) {
            if (obj instanceof BadgeDTO) {
                return new SelectionsListVI.HeaderVO.BadgeWrapper((BadgeDTO) obj);
            }
            return null;
        }
        SocialHeader socialHeader = (SocialHeader) obj;
        IconDTO icon = socialHeader.getIcon();
        TextDTO title = socialHeader.getTitle();
        IconDTO verifyIcon = socialHeader.getVerifyIcon();
        AtomActionDTO action = socialHeader.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, socialHeader.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = socialHeader.getTrackingInfo();
        return new SelectionsListVI.HeaderVO.SocialHeader(icon, title, verifyIcon, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @NotNull
    public static final ButtonV3Atom.SmallIconButton toSmallIconButton(@NotNull IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(iconButtonV3DTO, "<this>");
        String icon = iconButtonV3DTO.getIcon();
        CommonControlSettings common = iconButtonV3DTO.getCommon();
        AtomActionDTO action = common != null ? common.getAction() : null;
        String iconColor = iconButtonV3DTO.getIconColor();
        CommonControlSettings common2 = iconButtonV3DTO.getCommon();
        TestInfo testInfo = common2 != null ? common2.getTestInfo() : null;
        CommonControlSettings common3 = iconButtonV3DTO.getCommon();
        return new ButtonV3Atom.SmallIconButton(icon, action, iconColor, null, null, testInfo, common3 != null ? common3.getTrackingInfo() : null, 24, null);
    }

    public static final SelectionsListVI.TopRightContent toTopRightContent(Object obj) {
        if (obj instanceof IconDTO) {
            return new SelectionsListVI.TopRightContent.IconWrapper((IconDTO) obj);
        }
        if (obj instanceof FavoriteProductMoleculeV4) {
            return new SelectionsListVI.TopRightContent.FavoriteWrapper(toFavoriteProductMolecule((FavoriteProductMoleculeV4) obj));
        }
        return null;
    }

    @NotNull
    public static final List<SelectionsListVI.TileFooterContent.SelectionItemFooter.StatusSelectionVO> toVO(@NotNull List<TileFooterContentDTO.SelectionItemFooter.StatusSelection> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<TileFooterContentDTO.SelectionItemFooter.StatusSelection> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (TileFooterContentDTO.SelectionItemFooter.StatusSelection statusSelection : list2) {
            arrayList.add(new SelectionsListVI.TileFooterContent.SelectionItemFooter.StatusSelectionVO(statusSelection.getIcon(), statusSelection.getText()));
        }
        return arrayList;
    }

    public static final SelectionsListVI.TileFooterContent toVO(Object obj) {
        if (obj instanceof TileFooterContentDTO.SelectionInfo) {
            TileFooterContentDTO.SelectionInfo selectionInfo = (TileFooterContentDTO.SelectionInfo) obj;
            return new SelectionsListVI.TileFooterContent.SelectionInfo(selectionInfo.getTitle(), selectionInfo.getProductImages());
        }
        if (obj instanceof TileFooterContentDTO.ReviewPreviewTitleRating) {
            TileFooterContentDTO.ReviewPreviewTitleRating reviewPreviewTitleRating = (TileFooterContentDTO.ReviewPreviewTitleRating) obj;
            return new SelectionsListVI.TileFooterContent.ReviewPreviewTitleRating(reviewPreviewTitleRating.getTitle(), reviewPreviewTitleRating.getRatingIcon(), reviewPreviewTitleRating.getRatingValue(), reviewPreviewTitleRating.getSeparator());
        }
        if (obj instanceof TileFooterContentDTO.SelectionItemFooter) {
            TileFooterContentDTO.SelectionItemFooter selectionItemFooter = (TileFooterContentDTO.SelectionItemFooter) obj;
            List<SelectionsListVI.TileFooterContent.SelectionItemFooter.StatusSelectionVO> vo = toVO(selectionItemFooter.getStatusList());
            IconDTO icon = selectionItemFooter.getIcon();
            AtomActionDTO action = selectionItemFooter.getAction();
            return new SelectionsListVI.TileFooterContent.SelectionItemFooter(vo, icon, action != null ? AtomActionMapperKt.toAtomAction(action, selectionItemFooter.getTrackingInfo()) : null);
        }
        if (obj instanceof PriceDTO) {
            return new SelectionsListVI.TileFooterContent.PriceWrapper((PriceDTO) obj);
        }
        return null;
    }

    @NotNull
    public static final SelectionsListVI.SelectionItemCommon toVO(@NotNull SelectionItemCommon selectionItemCommon, long j11) {
        Intrinsics.checkNotNullParameter(selectionItemCommon, "<this>");
        BackgroundDTO background = selectionItemCommon.getBackground();
        SelectionsListVI.Background background2 = background != null ? toBackground(background) : null;
        AtomActionDTO action = selectionItemCommon.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, selectionItemCommon.getTrackingInfo()) : null;
        SelectionsListVI.TopRightContent topRightContent = toTopRightContent(selectionItemCommon.getTopRightContent());
        List<String> topGradient = selectionItemCommon.getTopGradient();
        List<String> bottomGradient = selectionItemCommon.getBottomGradient();
        Map<String, TokenizedTrackingInfo> trackingInfo = selectionItemCommon.getTrackingInfo();
        return new SelectionsListVI.SelectionItemCommon(background2, atomAction, topRightContent, topGradient, bottomGradient, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, selectionItemCommon.getTestInfo());
    }
}
