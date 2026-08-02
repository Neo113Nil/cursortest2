package ru.ozon.app.android.pdp.widgets.selectSeller.presentation;

import Bi.b;
import Kk.C3531a;
import Lc.a;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.view.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.selectSeller.presentation.SelectSellerVO;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\f*\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerView;", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerBaseView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;", "selectSeller", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "sisBrandFavoriteButtonDelegate", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;Lkotlin/jvm/functions/Function1;)V", "Landroidx/constraintlayout/widget/d;", "additionalConstraints", "(Landroidx/constraintlayout/widget/d;)V", "Lru/ozon/uni/android/atom/icon/IconView;", "ratingIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ratingTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTav", "Landroid/widget/LinearLayout;", "subtitleContainer", "Landroid/widget/LinearLayout;", "getSubtitleContainer", "()Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "chatBtn", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectSellerView extends SelectSellerBaseView {

    @NotNull
    private final IconButtonV3View chatBtn;

    @NotNull
    private final IconView ratingIcon;

    @NotNull
    private final TextAtomV2View ratingTav;

    @NotNull
    private final LinearLayout subtitleContainer;

    @NotNull
    private final TextAtomV2View subtitleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectSellerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.selectSellerRatingIcon, -2, -2);
        Dimens dimens = Dimens.INSTANCE;
        a11.setMarginEnd(dimens.getDP_2());
        iconView.setLayoutParams(a11);
        this.ratingIcon = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.selectSellerRating, -2, -2);
        d11.setMarginEnd(dimens.getDP_4());
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.ratingTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        a.d(textAtomV2View2, R$id.selectSellerSubtitle, -1, -2, false);
        this.subtitleTav = textAtomV2View2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.selectSellerSubtitlesGroup);
        linearLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.addView(iconView);
        linearLayout.addView(textAtomV2View);
        linearLayout.addView(textAtomV2View2);
        this.subtitleContainer = linearLayout;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(R$id.selectSellerChatBtn);
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.chatBtn = iconButtonV3View;
        addView(getSubtitleContainer());
        addView(iconButtonV3View);
        setupConstraints();
    }

    @Override // ru.ozon.app.android.pdp.widgets.selectSeller.presentation.SelectSellerBaseView
    protected void additionalConstraints(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConstraintSetExtKt.endToEnd$default(dVar, this.chatBtn.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.chatBtn.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.chatBtn.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart$default(dVar, getFavoriteBtn().getId(), this.chatBtn.getId(), 0, 4, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.selectSeller.presentation.SelectSellerBaseView
    public void bind(@NotNull SelectSellerVO selectSeller, @NotNull SisBrandFavoriteButtonDelegate sisBrandFavoriteButtonDelegate, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(selectSeller, "selectSeller");
        Intrinsics.checkNotNullParameter(sisBrandFavoriteButtonDelegate, "sisBrandFavoriteButtonDelegate");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        super.bind(selectSeller, sisBrandFavoriteButtonDelegate, actionHandler);
        IconView iconView = this.ratingIcon;
        SelectSellerVO.Rating rating = selectSeller.getRating();
        IconHolderKt.bindOrGone$default(iconView, rating != null ? rating.getIcon() : null, null, 2, null);
        TextAtomV2View textAtomV2View = this.ratingTav;
        SelectSellerVO.Rating rating2 = selectSeller.getRating();
        TextHolderKt.bindOrGone$default(textAtomV2View, rating2 != null ? rating2.getTitle() : null, null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTav, selectSeller.getSubtitle(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(this.chatBtn, selectSeller.getChatButton(), actionHandler);
        ViewExtKt.bindBackground(this, selectSeller.getBackgroundColor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.pdp.widgets.selectSeller.presentation.SelectSellerBaseView
    @NotNull
    public LinearLayout getSubtitleContainer() {
        return this.subtitleContainer;
    }
}
