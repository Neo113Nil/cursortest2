package ru.ozon.app.android.pdp.widgets.selectSeller.presentation;

import Lc.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\f*\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8$X¤\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerBaseView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;", "selectSeller", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "sisBrandFavoriteButtonDelegate", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;Lkotlin/jvm/functions/Function1;)V", "Landroidx/constraintlayout/widget/d;", "additionalConstraints", "(Landroidx/constraintlayout/widget/d;)V", "setupConstraints", "()V", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "favoriteBtn", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "getFavoriteBtn", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroid/view/View;", "getSubtitleContainer", "()Landroid/view/View;", "subtitleContainer", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public abstract class SelectSellerBaseView extends ConstraintLayout {

    @NotNull
    private final SisBrandFavoriteButtonView favoriteBtn;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectSellerBaseView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        SisBrandFavoriteButtonView sisBrandFavoriteButtonView = new SisBrandFavoriteButtonView(context, null, 0, 0, 14, null);
        sisBrandFavoriteButtonView.setId(R$id.selectSellerFavoriteBtn);
        sisBrandFavoriteButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.favoriteBtn = sisBrandFavoriteButtonView;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.selectSellerIcon);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        a.d(textAtomV2View, R$id.selectSellerTitle, 0, -2, false);
        this.titleTAV = textAtomV2View;
        setId(R$id.selectSellerRoot);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDP_16(), getPaddingTop(), dimens.getDP_8(), getPaddingBottom());
        addView(iconView);
        addView(textAtomV2View);
        addView(sisBrandFavoriteButtonView);
    }

    protected void additionalConstraints(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
    }

    public void bind(@NotNull SelectSellerVO selectSeller, @NotNull SisBrandFavoriteButtonDelegate sisBrandFavoriteButtonDelegate, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(selectSeller, "selectSeller");
        Intrinsics.checkNotNullParameter(sisBrandFavoriteButtonDelegate, "sisBrandFavoriteButtonDelegate");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconHolderKt.bind$default(this.iconView, selectSeller.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleTAV, selectSeller.getTitle(), null, 2, null);
        SisBrandFavoriteButtonDelegate.DefaultImpls.bind$default(sisBrandFavoriteButtonDelegate, selectSeller.getFavoriteButton(), null, 2, null);
        ViewExtKt.bindBackground(this, selectSeller.getBackgroundColor());
    }

    @NotNull
    public final SisBrandFavoriteButtonView getFavoriteBtn() {
        return this.favoriteBtn;
    }

    @NotNull
    protected abstract View getSubtitleContainer();

    protected final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new SelectSellerBaseView$setupConstraints$1(this));
    }
}
