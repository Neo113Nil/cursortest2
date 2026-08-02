package ru.ozon.app.android.pdp.ui.configurators.pdp.seller;

import Go.e;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJG\u0010\u0012\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JO\u0010\u0014\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013JC\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00105\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u00109\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "setupConstraints", "()V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;", "island", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroid/view/View;", "onBindOnBoarding", "firstIslandBindOrGone", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "secondIslandBindOrGone", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "item", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "", "isSecondIslandInit", "Z", "Lkotlin/Function0;", "firstIslandClick", "Lkotlin/jvm/functions/Function0;", "secondIslandClick", "Landroid/graphics/drawable/GradientDrawable;", "islandsBgDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/uni/android/atom/icon/IconView;", "firstIv", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "firstTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroidx/constraintlayout/helper/widget/Layer;", "firstIslandLayer", "Landroidx/constraintlayout/helper/widget/Layer;", "secondIv$delegate", "LSc/j;", "getSecondIv", "()Lru/ozon/uni/android/atom/icon/IconView;", "secondIv", "secondTav$delegate", "getSecondTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "secondTav", "secondIslandLayer$delegate", "getSecondIslandLayer", "()Landroidx/constraintlayout/helper/widget/Layer;", "secondIslandLayer", "Lcom/google/android/material/imageview/ShapeableImageView;", "imageBackgroundIv$delegate", "getImageBackgroundIv", "()Lcom/google/android/material/imageview/ShapeableImageView;", "imageBackgroundIv", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class SellerV7View extends ConstraintLayout {

    @NotNull
    private final CellView cellView;
    private Function0<Unit> firstIslandClick;

    @NotNull
    private final Layer firstIslandLayer;

    @NotNull
    private final IconView firstIv;

    @NotNull
    private final TextAtomV2View firstTav;

    /* renamed from: imageBackgroundIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageBackgroundIv;
    private boolean isSecondIslandInit;

    @NotNull
    private final GradientDrawable islandsBgDrawable;
    private Function0<Unit> secondIslandClick;

    /* renamed from: secondIslandLayer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j secondIslandLayer;

    /* renamed from: secondIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j secondIv;

    /* renamed from: secondTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j secondTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerV7View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        Dimens dimens = Dimens.INSTANCE;
        gradientDrawable.setCornerRadius(dimens.getDPF_12());
        this.islandsBgDrawable = gradientDrawable;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.sellerInfo);
        cellView.setLayoutParams(new ConstraintLayout.b(0, -2));
        cellView.setElevation(1.0f);
        this.cellView = cellView;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.sellerFirstIv);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        iconView.setElevation(1.0f);
        this.firstIv = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.sellerFirstTav);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(dimens.getDP_48(), -2));
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setElevation(1.0f);
        this.firstTav = textAtomV2View;
        Layer layer = new Layer(context);
        layer.setId(R$id.sellerFirstIslandL);
        layer.setLayoutParams(new ConstraintLayout.b(-2, -2));
        layer.setReferencedIds(new int[]{iconView.getId(), textAtomV2View.getId()});
        layer.setPadding(layer.getPaddingLeft(), dimens.getDP_7(), layer.getPaddingRight(), dimens.getDP_7());
        layer.setBackground(gradientDrawable);
        layer.setOnClickListener(new e(this, 15));
        layer.setElevation(1.0f);
        layer.setClipToOutline(true);
        this.firstIslandLayer = layer;
        this.secondIv = DelegatesKt.lazyUnsafe(new SellerV7View$secondIv$2(context, this));
        this.secondTav = DelegatesKt.lazyUnsafe(new SellerV7View$secondTav$2(context, this));
        this.secondIslandLayer = DelegatesKt.lazyUnsafe(new SellerV7View$special$$inlined$lazyView$1(this, context, this));
        this.imageBackgroundIv = DelegatesKt.lazyUnsafe(new SellerV7View$special$$inlined$lazyView$2(this, context));
        setId(R$id.sellerV7Root);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.setMarginStart(dimens.getDP_16());
        bVar.setMarginEnd(dimens.getDP_16());
        setLayoutParams(bVar);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(dimens.getDPF_16());
        setBackground(gradientDrawable2);
        addView(cellView);
        addView(layer);
        addView(iconView);
        addView(textAtomV2View);
        setupConstraints();
    }

    private final void firstIslandBindOrGone(SellerV7VO.SellerIsland island, Function1<? super AtomAction, Unit> actionHandler, Function2<? super OnBoardingDTO, ? super View, Unit> onBindOnBoarding) {
        if (island == null) {
            ViewExtKt.gone(this.firstIslandLayer);
            return;
        }
        ViewExtKt.show(this.firstIslandLayer);
        IconHolderKt.bind$default(this.firstIv, island.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.firstTav, island.getTitle(), null, 2, null);
        AtomAction action = island.getAction();
        this.firstIslandClick = action != null ? new SellerV7View$firstIslandBindOrGone$1$1(actionHandler, action) : null;
        Drawable background = this.firstIslandLayer.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setColor(styleParser.parseColor(context, island.getBackgroundColor(), R$color.bg_secondary));
        }
        OnBoardingDTO onboarding = island.getOnboarding();
        if (onboarding != null) {
            onBindOnBoarding.invoke(onboarding, this.firstIslandLayer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void firstIslandLayer$lambda$5$lambda$4(SellerV7View sellerV7View, View view) {
        Function0<Unit> function0 = sellerV7View.firstIslandClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final ShapeableImageView getImageBackgroundIv() {
        return (ShapeableImageView) this.imageBackgroundIv.getValue();
    }

    private final Layer getSecondIslandLayer() {
        return (Layer) this.secondIslandLayer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconView getSecondIv() {
        return (IconView) this.secondIv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getSecondTav() {
        return (TextAtomV2View) this.secondTav.getValue();
    }

    private final void secondIslandBindOrGone(SellerV7VO.SellerIsland island, Function1<? super AtomAction, Unit> actionHandler, Function2<? super OnBoardingDTO, ? super View, Unit> onBindOnBoarding) {
        if (island == null) {
            if (this.isSecondIslandInit) {
                ViewExtKt.gone(getSecondIslandLayer());
                return;
            }
            return;
        }
        ViewExtKt.show(getSecondIslandLayer());
        IconHolderKt.bind$default(getSecondIv(), island.getIcon(), null, 2, null);
        TextHolderKt.bind$default(getSecondTav(), island.getTitle(), null, 2, null);
        AtomAction action = island.getAction();
        this.secondIslandClick = action != null ? new SellerV7View$secondIslandBindOrGone$1$1(actionHandler, action) : null;
        Drawable background = getSecondIslandLayer().getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setColor(styleParser.parseColor(context, island.getBackgroundColor(), R$color.bg_secondary));
        }
        if (!this.isSecondIslandInit) {
            d dVar = new d();
            dVar.p(this);
            ConstraintSetExtKt.endToStart$default(dVar, this.cellView.getId(), getSecondTav().getId(), 0, 4, null);
            ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, getSecondIv());
            ConstraintSetExtKt.bottomToTop$default(dVar, getSecondIv().getId(), getSecondTav().getId(), 0, 4, null);
            ConstraintSetExtKt.endToEnd$default(dVar, getSecondIv().getId(), getSecondTav().getId(), 0, 4, null);
            ConstraintSetExtKt.startToStart$default(dVar, getSecondIv().getId(), getSecondTav().getId(), 0, 4, null);
            dVar.g0(getSecondIv().getId(), 2);
            ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, getSecondTav());
            ConstraintSetExtKt.endToStart(dVar, getSecondTav().getId(), this.firstTav.getId(), Dimens.INSTANCE.getDP_4());
            ConstraintSetExtKt.topToBottom$default(dVar, getSecondTav().getId(), getSecondIv().getId(), 0, 4, null);
            dVar.f(this);
        }
        this.isSecondIslandInit = true;
        OnBoardingDTO onboarding = island.getOnboarding();
        if (onboarding == null || onBindOnBoarding == null) {
            return;
        }
        onBindOnBoarding.invoke(onboarding, getSecondIslandLayer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void secondIslandBindOrGone$default(SellerV7View sellerV7View, SellerV7VO.SellerIsland sellerIsland, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        sellerV7View.secondIslandBindOrGone(sellerIsland, function1, function2);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.cellView);
        ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.cellView);
        ConstraintSetExtKt.endToStart$default(dVar, this.cellView.getId(), this.firstTav.getId(), 0, 4, null);
        ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.firstIv);
        ConstraintSetExtKt.bottomToTop$default(dVar, this.firstIv.getId(), this.firstTav.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.firstIv.getId(), this.firstTav.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.firstIv.getId(), this.firstTav.getId(), 0, 4, null);
        dVar.g0(this.firstIv.getId(), 2);
        ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, this.firstTav);
        ConstraintSetExtKt.endToEnd(dVar, this.firstTav.getId(), 0, Dimens.INSTANCE.getDP_12());
        ConstraintSetExtKt.topToBottom$default(dVar, this.firstTav.getId(), this.firstIv.getId(), 0, 4, null);
        dVar.f(this);
    }

    public final void bind(@NotNull SellerV7VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super OnBoardingDTO, ? super View, Unit> onBindOnBoarding) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onBindOnBoarding, "onBindOnBoarding");
        String backgroundImage = item.getBackgroundImage();
        if (backgroundImage != null) {
            ImageViewExtKt.load$default(getImageBackgroundIv(), backgroundImage, null, null, null, null, false, null, 126, null);
        }
        CellHolderKt.bind(this.cellView, item.getSellerCell(), actionHandler);
        if (item.getChat() == null) {
            firstIslandBindOrGone(item.getRating(), actionHandler, onBindOnBoarding);
            secondIslandBindOrGone$default(this, null, null, null, 6, null);
        } else {
            firstIslandBindOrGone(item.getChat(), actionHandler, onBindOnBoarding);
            secondIslandBindOrGone(item.getRating(), actionHandler, onBindOnBoarding);
        }
        if (item.getBackgroundImage() == null) {
            Drawable background = getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradientDrawable.setColor(styleParser.parseColor(context, item.getInnerBackgroundColor(), R$color.bg_secondary));
            }
        }
    }

    @NotNull
    public final CellView getCellView() {
        return this.cellView;
    }
}
