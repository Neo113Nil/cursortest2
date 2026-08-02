package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.core;

import WZ.t;
import android.content.Context;
import android.content.res.Resources;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.data.SellerTransparencyV3DTO;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3VO;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0001\u0018\u0000 &2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001&B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/core/SellerTransparencyV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO$Paddings;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO$PaddingsVO;", "toVo", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO$Paddings;)Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO$PaddingsVO;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "padding", "", "getPadding", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRightIcon", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "createChevronIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/notification/NotificationAtom;", "createDefaultNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO;Ll20/d;)Ljava/util/List;", "", "id", "toVO", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO;J)Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3VO;", "Landroid/content/Context;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerTransparencyV3Mapper implements Function2<SellerTransparencyV3DTO, d, List<? extends SellerTransparencyV3VO>> {

    @NotNull
    private final Context context;
    public static final int $stable = 8;

    public SellerTransparencyV3Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final IconDTO createChevronIcon() {
        return new IconDTO(IconDTO.IconSize.SIZE_300, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO("ic_m_chevron_right_filled", UniColors.GRAPHIC_TERTIARY.getToken()), null, null, null, null, null, null, null, null, null, null, null, 65514, null);
    }

    private final NotificationAtom createDefaultNotification() {
        return new NotificationAtom.NotificationWithIcon("ic_s_book_not_available_filled", UniColors.BG_ACCENT_PRIMARY.getToken(), UniColors.BG_ACTION_SECONDARY.getToken(), 3, StringProvider.getString(R$string.error_common_seller_favourite_add_error_text_android), StringProvider.getString(ru.ozon.app.android.marketing.R$string.try_again), NotificationAtom.Position.POSITION_ABOVE_TABBAR, null, Boolean.FALSE, null, null, null, null);
    }

    private final int getPadding(CommonCellSettings.LayoutPadding padding) {
        Resources resources = this.context.getResources();
        if (padding == null) {
            padding = CommonCellSettings.LayoutPadding.NONE;
        }
        return (int) resources.getDimension(padding.getCellLayoutPadding());
    }

    private final IconDTO getRightIcon(SellerTransparencyV3DTO sellerTransparencyV3DTO) {
        if (Intrinsics.d(sellerTransparencyV3DTO.getHideRightIcon(), Boolean.TRUE)) {
            return null;
        }
        IconDTO rightIcon = sellerTransparencyV3DTO.getRightIcon();
        if (rightIcon != null) {
            return rightIcon;
        }
        if (sellerTransparencyV3DTO.getHeaderAction() != null) {
            return createChevronIcon();
        }
        return null;
    }

    private final SellerTransparencyV3VO.PaddingsVO toVo(SellerTransparencyV3DTO.Paddings paddings) {
        return new SellerTransparencyV3VO.PaddingsVO(getPadding(paddings != null ? paddings.getLeftPadding() : null), getPadding(paddings != null ? paddings.getRightPadding() : null), getPadding(paddings != null ? paddings.getTopPadding() : null), getPadding(paddings != null ? paddings.getBottomPadding() : null));
    }

    @NotNull
    public final SellerTransparencyV3VO toVO(@NotNull SellerTransparencyV3DTO sellerTransparencyV3DTO, long j11) {
        OzonSpannableString text;
        Intrinsics.checkNotNullParameter(sellerTransparencyV3DTO, "<this>");
        if (sellerTransparencyV3DTO.getNewTitle() == null && sellerTransparencyV3DTO.getTitle() == null) {
            throw new IllegalArgumentException("title or newTitle is required");
        }
        if (sellerTransparencyV3DTO.getAvatar() == null && sellerTransparencyV3DTO.getAvatarImage() == null && sellerTransparencyV3DTO.getAvatarV2() == null) {
            throw new IllegalArgumentException("at least one type of avatar is required");
        }
        IconDTO avatar = sellerTransparencyV3DTO.getAvatar();
        ImageDTO avatarImage = sellerTransparencyV3DTO.getAvatarImage();
        IconDTO avatarV2 = sellerTransparencyV3DTO.getAvatarV2();
        IconDTO rightIcon = getRightIcon(sellerTransparencyV3DTO);
        ButtonV3Atom.SmallIconButton shareButton = sellerTransparencyV3DTO.getShareButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = sellerTransparencyV3DTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        ButtonV3Atom.SmallIconButton activeFavoriteButton = sellerTransparencyV3DTO.getActiveFavoriteButton();
        ButtonV3Atom.SmallIconButton defaultFavoriteButton = sellerTransparencyV3DTO.getDefaultFavoriteButton();
        ButtonV3DTO defaultSubscribeButton = sellerTransparencyV3DTO.getDefaultSubscribeButton();
        ButtonV3DTO activeSubscribeButton = sellerTransparencyV3DTO.getActiveSubscribeButton();
        AtomActionDTO headerAction = sellerTransparencyV3DTO.getHeaderAction();
        AtomAction atomAction = headerAction != null ? AtomActionMapperKt.toAtomAction(headerAction, sellerTransparencyV3DTO.getTrackingInfo()) : null;
        AtomActionDTO notificationAction = sellerTransparencyV3DTO.getNotificationAction();
        TextAtom title = sellerTransparencyV3DTO.getTitle();
        TextDTO newTitle = sellerTransparencyV3DTO.getNewTitle();
        TextDTO subtitle = sellerTransparencyV3DTO.getSubtitle();
        TextDTO subtitle2 = (subtitle == null || (text = subtitle.getText()) == null || text.length() != 0) ? sellerTransparencyV3DTO.getSubtitle() : null;
        Boolean isNavBarEmbedded = sellerTransparencyV3DTO.isNavBarEmbedded();
        boolean booleanValue = isNavBarEmbedded != null ? isNavBarEmbedded.booleanValue() : false;
        Boolean isFavorite = sellerTransparencyV3DTO.isFavorite();
        Boolean isSubscribe = sellerTransparencyV3DTO.isSubscribe();
        NotificationModelWrapper errorSubscribeNotification = sellerTransparencyV3DTO.getErrorSubscribeNotification();
        if (errorSubscribeNotification == null) {
            errorSubscribeNotification = createDefaultNotification();
        }
        NotificationModelWrapper notificationModelWrapper = errorSubscribeNotification;
        SisBrandFavoriteButton favoriteButton = sellerTransparencyV3DTO.getFavoriteButton();
        BadgeListDTO badges = sellerTransparencyV3DTO.getBadges();
        Integer rightMargin = sellerTransparencyV3DTO.getRightMargin();
        Boolean addExtraMargins = sellerTransparencyV3DTO.getAddExtraMargins();
        return new SellerTransparencyV3VO(j11, avatar, avatarImage, shareButton, title, newTitle, subtitle2, atomAction, notificationAction, badges, rightIcon, isFavorite, isSubscribe, booleanValue, defaultFavoriteButton, activeFavoriteButton, defaultSubscribeButton, activeSubscribeButton, notificationModelWrapper, favoriteButton, rightMargin, addExtraMargins != null ? addExtraMargins.booleanValue() : false, tokenizedEvent$default, sellerTransparencyV3DTO.getInfoIcon(), sellerTransparencyV3DTO.getBackgroundColor(), toVo(sellerTransparencyV3DTO.getPaddings()), avatarV2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SellerTransparencyV3VO> invoke(@NotNull SellerTransparencyV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, state.hashCode()));
    }
}
