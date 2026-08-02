package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonView;
import ru.ozon.uni.android.atom.badge.badgeList.BadgeListView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetSellerTransparencyV3Binding implements a {

    @NonNull
    public final IconView actionArrowIv;

    @NonNull
    public final LinearLayout badgesGroupLL;

    @NonNull
    public final Barrier buttonsBarrier;

    @NonNull
    public final View clickableSellerAreaView;

    @NonNull
    public final Barrier favoriteButtonsBarrier;

    @NonNull
    public final FrameLayout group;

    @NonNull
    public final IconView infoIcon;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final BadgeListView sellerBadgeList;

    @NonNull
    public final FrameLayout sellerGroup;

    @NonNull
    public final Image sellerImageView;

    @NonNull
    public final IconView sellerIv;

    @NonNull
    public final TextAtomV2View sellerNameNewTv;

    @NonNull
    public final TextAtomView sellerNameTv;

    @NonNull
    public final TextAtomV2View sellerSubtitle;

    @NonNull
    public final ConstraintLayout sellerTransparencyContainer;

    @NonNull
    public final IconView sellerV2Iv;

    @NonNull
    public final SmallIconButtonView shareBtn;

    @NonNull
    public final SisBrandFavoriteButtonView sisBrandFavoriteBtn;

    @NonNull
    public final SmallIconButtonView subscribeBtn;

    @NonNull
    public final ButtonV3View subscribeShopBtn;

    @NonNull
    public final SmallIconButtonView unsubscribeBtn;

    @NonNull
    public final ButtonV3View unsubscribeShopBtn;

    private WidgetSellerTransparencyV3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull LinearLayout linearLayout, @NonNull Barrier barrier, @NonNull View view, @NonNull Barrier barrier2, @NonNull FrameLayout frameLayout, @NonNull IconView iconView2, @NonNull BadgeListView badgeListView, @NonNull FrameLayout frameLayout2, @NonNull Image image, @NonNull IconView iconView3, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomView textAtomView, @NonNull TextAtomV2View textAtomV2View2, @NonNull ConstraintLayout constraintLayout2, @NonNull IconView iconView4, @NonNull SmallIconButtonView smallIconButtonView, @NonNull SisBrandFavoriteButtonView sisBrandFavoriteButtonView, @NonNull SmallIconButtonView smallIconButtonView2, @NonNull ButtonV3View buttonV3View, @NonNull SmallIconButtonView smallIconButtonView3, @NonNull ButtonV3View buttonV3View2) {
        this.rootView = constraintLayout;
        this.actionArrowIv = iconView;
        this.badgesGroupLL = linearLayout;
        this.buttonsBarrier = barrier;
        this.clickableSellerAreaView = view;
        this.favoriteButtonsBarrier = barrier2;
        this.group = frameLayout;
        this.infoIcon = iconView2;
        this.sellerBadgeList = badgeListView;
        this.sellerGroup = frameLayout2;
        this.sellerImageView = image;
        this.sellerIv = iconView3;
        this.sellerNameNewTv = textAtomV2View;
        this.sellerNameTv = textAtomView;
        this.sellerSubtitle = textAtomV2View2;
        this.sellerTransparencyContainer = constraintLayout2;
        this.sellerV2Iv = iconView4;
        this.shareBtn = smallIconButtonView;
        this.sisBrandFavoriteBtn = sisBrandFavoriteButtonView;
        this.subscribeBtn = smallIconButtonView2;
        this.subscribeShopBtn = buttonV3View;
        this.unsubscribeBtn = smallIconButtonView3;
        this.unsubscribeShopBtn = buttonV3View2;
    }

    @NonNull
    public static WidgetSellerTransparencyV3Binding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.actionArrowIv;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.badgesGroupLL;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.buttonsBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null && (d11 = C2548q.d((i11 = R$id.clickableSellerAreaView), view)) != null) {
                    i11 = R$id.favoriteButtonsBarrier;
                    Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                    if (barrier2 != null) {
                        i11 = R$id.group;
                        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                        if (frameLayout != null) {
                            i11 = R$id.infoIcon;
                            IconView iconView2 = (IconView) C2548q.d(i11, view);
                            if (iconView2 != null) {
                                i11 = R$id.sellerBadgeList;
                                BadgeListView badgeListView = (BadgeListView) C2548q.d(i11, view);
                                if (badgeListView != null) {
                                    i11 = R$id.sellerGroup;
                                    FrameLayout frameLayout2 = (FrameLayout) C2548q.d(i11, view);
                                    if (frameLayout2 != null) {
                                        i11 = R$id.sellerImageView;
                                        Image image = (Image) C2548q.d(i11, view);
                                        if (image != null) {
                                            i11 = R$id.sellerIv;
                                            IconView iconView3 = (IconView) C2548q.d(i11, view);
                                            if (iconView3 != null) {
                                                i11 = R$id.sellerNameNewTv;
                                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                                if (textAtomV2View != null) {
                                                    i11 = R$id.sellerNameTv;
                                                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                                                    if (textAtomView != null) {
                                                        i11 = R$id.sellerSubtitle;
                                                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                                        if (textAtomV2View2 != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                            i11 = R$id.sellerV2Iv;
                                                            IconView iconView4 = (IconView) C2548q.d(i11, view);
                                                            if (iconView4 != null) {
                                                                i11 = R$id.shareBtn;
                                                                SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                                                                if (smallIconButtonView != null) {
                                                                    i11 = R$id.sisBrandFavoriteBtn;
                                                                    SisBrandFavoriteButtonView sisBrandFavoriteButtonView = (SisBrandFavoriteButtonView) C2548q.d(i11, view);
                                                                    if (sisBrandFavoriteButtonView != null) {
                                                                        i11 = R$id.subscribeBtn;
                                                                        SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
                                                                        if (smallIconButtonView2 != null) {
                                                                            i11 = R$id.subscribeShopBtn;
                                                                            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                                                                            if (buttonV3View != null) {
                                                                                i11 = R$id.unsubscribeBtn;
                                                                                SmallIconButtonView smallIconButtonView3 = (SmallIconButtonView) C2548q.d(i11, view);
                                                                                if (smallIconButtonView3 != null) {
                                                                                    i11 = R$id.unsubscribeShopBtn;
                                                                                    ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(i11, view);
                                                                                    if (buttonV3View2 != null) {
                                                                                        return new WidgetSellerTransparencyV3Binding(constraintLayout, iconView, linearLayout, barrier, d11, barrier2, frameLayout, iconView2, badgeListView, frameLayout2, image, iconView3, textAtomV2View, textAtomView, textAtomV2View2, constraintLayout, iconView4, smallIconButtonView, sisBrandFavoriteButtonView, smallIconButtonView2, buttonV3View, smallIconButtonView3, buttonV3View2);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
