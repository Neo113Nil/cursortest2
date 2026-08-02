package ru.ozon.app.android.pdp.widgets.productStarsTile.presentation;

import Bi.b;
import Cm.c;
import Cm.e;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.productStarsTile.presentation.ProductStarsTileVO;
import ru.ozon.app.android.pdp.widgets.productStarsTile.presentation.ProductStarsTileView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u0000 @2\u00020\u0001:\u0001@B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020\u000f*\u00020\u00132\b\b\u0001\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020\u00062\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b%\u0010&J)\u0010,\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000f0)¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\r¢\u0006\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0014\u0010:\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00105R\u0014\u0010;\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010<\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "", "background", "", "setBackgroundContainer", "(Landroid/view/View;Ljava/lang/String;)V", "idView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "createContainer", "(I)Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "createGradientView", "(ILandroidx/constraintlayout/widget/ConstraintLayout;)Landroid/view/View;", "width", "height", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createTextAtom", "(ILandroidx/constraintlayout/widget/ConstraintLayout;II)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/icon/IconView;", "createIconView", "(ILandroidx/constraintlayout/widget/ConstraintLayout;)Lru/ozon/uni/android/atom/icon/IconView;", "idTitle", "idSubtitle", "idIcon", "idGradientView", "setConstraints", "(Landroidx/constraintlayout/widget/ConstraintLayout;IIILjava/lang/Integer;)V", "Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO;Lkotlin/jvm/functions/Function1;)V", "stars", "updateUserStars", "(Ljava/lang/String;)V", "containerUserStar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerProductStar", "titleProductStar", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subTitleProductStar", "iconProductStar", "Lru/ozon/uni/android/atom/icon/IconView;", "titleUserStar", "subTitleUserStar", "iconUserStar", "gradientView", "Landroid/view/View;", "state", "Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductStarsTileView extends LinearLayout {
    private static final int ELEMENT_PADDING_HORIZONTAL;
    private static final int HEIGHT_TITLE;
    private static final int MARGIN_BOTTOM;
    private static final int MARGIN_ELEMENT;
    private static final int MARGIN_TOP;
    private static final int PADDING_HORIZONTAL;

    @NotNull
    private final ConstraintLayout containerProductStar;

    @NotNull
    private final ConstraintLayout containerUserStar;

    @NotNull
    private final View gradientView;

    @NotNull
    private final IconView iconProductStar;

    @NotNull
    private final IconView iconUserStar;
    private ProductStarsTileVO state;

    @NotNull
    private final TextAtomV2View subTitleProductStar;

    @NotNull
    private final TextAtomV2View subTitleUserStar;

    @NotNull
    private final TextAtomV2View titleProductStar;

    @NotNull
    private final TextAtomV2View titleUserStar;
    public static final int $stable = 8;
    private static final int MIN_HEIGHT_VIEW_70 = ResourceExtKt.toPx(70);

    static {
        Dimens dimens = Dimens.INSTANCE;
        PADDING_HORIZONTAL = dimens.getDP_16();
        ELEMENT_PADDING_HORIZONTAL = dimens.getDP_16();
        MARGIN_ELEMENT = dimens.getDP_4();
        MARGIN_TOP = dimens.getDP_6();
        MARGIN_BOTTOM = -dimens.getDP_4();
        HEIGHT_TITLE = ResourceExtKt.toPx(30);
    }

    public /* synthetic */ ProductStarsTileView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final ConstraintLayout createContainer(int idView) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(idView);
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 0.5f));
        constraintLayout.setMinHeight(MIN_HEIGHT_VIEW_70);
        int i11 = ELEMENT_PADDING_HORIZONTAL;
        constraintLayout.setPadding(i11, constraintLayout.getPaddingTop(), i11, constraintLayout.getPaddingBottom());
        addView(constraintLayout);
        return constraintLayout;
    }

    private final View createGradientView(int idView, ConstraintLayout container) {
        View view = new View(getContext());
        view.setId(idView);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        container.addView(view);
        return view;
    }

    private final IconView createIconView(int idView, ConstraintLayout container) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(idView);
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        container.addView(iconView);
        return iconView;
    }

    private final TextAtomV2View createTextAtom(int idView, ConstraintLayout container, int width, int height) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, idView, width, height);
        d11.f41616W = true;
        textAtomV2View.setLayoutParams(d11);
        container.addView(textAtomV2View);
        return textAtomV2View;
    }

    static /* synthetic */ TextAtomV2View createTextAtom$default(ProductStarsTileView productStarsTileView, int i11, ConstraintLayout constraintLayout, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = -2;
        }
        if ((i14 & 8) != 0) {
            i13 = -2;
        }
        return productStarsTileView.createTextAtom(i11, constraintLayout, i12, i13);
    }

    private final void setBackgroundContainer(View view, String background) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, background, R$color.transparent);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ShapeDrawable createRoundRectShape$default = ContextExtKt.createRoundRectShape$default(context2, Dimens.INSTANCE.getDPF_12(), CornersConfig.ALL, 0, parseColor, null, 20, null);
        if (view != null) {
            view.setBackground(createRoundRectShape$default);
        }
    }

    private final void setConstraints(ConstraintLayout constraintLayout, int i11, int i12, int i13, Integer num) {
        d b11 = e.b(constraintLayout);
        ConstraintSetExtKt.startToStart$default(b11, i11, 0, 0, 4, null);
        ConstraintSetExtKt.endToStart$default(b11, i11, i13, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(b11, i11, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToTop$default(b11, i11, i12, 0, 4, null);
        ConstraintSetExtKt.startToEnd$default(b11, i13, i11, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(b11, i13, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(b11, i13, i11, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(b11, i12, 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(b11, i12, 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(b11, i12, i11, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(b11, i12, 0, 0, 4, null);
        if (num != null) {
            ConstraintSetExtKt.startToStart$default(b11, num.intValue(), i11, 0, 4, null);
            ConstraintSetExtKt.endToEnd$default(b11, num.intValue(), i11, 0, 4, null);
            ConstraintSetExtKt.topToTop$default(b11, num.intValue(), 0, 0, 4, null);
            ConstraintSetExtKt.bottomToTop$default(b11, num.intValue(), i12, 0, 4, null);
        }
        b11.d0(i11, 2);
        b11.g0(i11, 2);
        b11.f(constraintLayout);
    }

    static /* synthetic */ void setConstraints$default(ProductStarsTileView productStarsTileView, ConstraintLayout constraintLayout, int i11, int i12, int i13, Integer num, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            num = null;
        }
        productStarsTileView.setConstraints(constraintLayout, i11, i12, i13, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUserStars$lambda$3(ProductStarsTileView productStarsTileView, Drawable drawable) {
        productStarsTileView.gradientView.setForeground(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUserStars$lambda$6(ProductStarsTileView productStarsTileView, String str, float f7, Drawable drawable) {
        if (productStarsTileView.titleUserStar.isAttachedToWindow()) {
            productStarsTileView.gradientView.setForeground(null);
            productStarsTileView.titleUserStar.setText(str);
            productStarsTileView.titleUserStar.setTranslationY(f7 * 0.3f);
            productStarsTileView.titleUserStar.animate().translationY(0.0f).alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withStartAction(new Ao.b(1, productStarsTileView, drawable)).withEndAction(new GE.b(productStarsTileView, 0)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUserStars$lambda$6$lambda$4(ProductStarsTileView productStarsTileView, Drawable drawable) {
        productStarsTileView.gradientView.setForeground(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUserStars$lambda$6$lambda$5(ProductStarsTileView productStarsTileView) {
        productStarsTileView.gradientView.setForeground(null);
    }

    public final void bind(@NotNull ProductStarsTileVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (Intrinsics.d(item, this.state)) {
            return;
        }
        String backgroundColor = item.getBackgroundColor();
        ProductStarsTileVO productStarsTileVO = this.state;
        if (!Intrinsics.d(backgroundColor, productStarsTileVO != null ? productStarsTileVO.getBackgroundColor() : null)) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
            if (parseColor != null) {
                setBackgroundColor(parseColor.intValue());
            }
        }
        ProductStarsTileVO.BlockVO firstBlock = item.getFirstBlock();
        ProductStarsTileVO productStarsTileVO2 = this.state;
        if (!Intrinsics.d(firstBlock, productStarsTileVO2 != null ? productStarsTileVO2.getFirstBlock() : null)) {
            ProductStarsTileVO.BlockVO firstBlock2 = item.getFirstBlock();
            ProductStarsTileVO productStarsTileVO3 = this.state;
            ProductStarsTileVO.BlockVO firstBlock3 = productStarsTileVO3 != null ? productStarsTileVO3.getFirstBlock() : null;
            if (!Intrinsics.d(firstBlock2.getTitle(), firstBlock3 != null ? firstBlock3.getTitle() : null)) {
                TextHolderKt.bindOrGone(this.titleProductStar, firstBlock2.getTitle(), actionHandler);
            }
            if (!Intrinsics.d(firstBlock2.getSubtitle(), firstBlock3 != null ? firstBlock3.getSubtitle() : null)) {
                TextHolderKt.bindOrGone$default(this.subTitleProductStar, firstBlock2.getSubtitle(), null, 2, null);
            }
            if (!Intrinsics.d(firstBlock2.getIcon(), firstBlock3 != null ? firstBlock3.getIcon() : null)) {
                IconHolderKt.bindOrGone$default(this.iconProductStar, firstBlock2.getIcon(), null, 2, null);
            }
            if (!Intrinsics.d(firstBlock2.getBackgroundColor(), firstBlock3 != null ? firstBlock3.getBackgroundColor() : null)) {
                setBackgroundContainer(this.containerProductStar, firstBlock2.getBackgroundColor());
            }
        }
        ProductStarsTileVO.BlockVO secondBlock = item.getSecondBlock();
        ProductStarsTileVO productStarsTileVO4 = this.state;
        if (!Intrinsics.d(secondBlock, productStarsTileVO4 != null ? productStarsTileVO4.getSecondBlock() : null)) {
            ProductStarsTileVO.BlockVO secondBlock2 = item.getSecondBlock();
            ProductStarsTileVO productStarsTileVO5 = this.state;
            ProductStarsTileVO.BlockVO secondBlock3 = productStarsTileVO5 != null ? productStarsTileVO5.getSecondBlock() : null;
            if (!Intrinsics.d(secondBlock2.getTitle(), secondBlock3 != null ? secondBlock3.getTitle() : null)) {
                TextHolderKt.bindOrGone(this.titleUserStar, secondBlock2.getTitle(), actionHandler);
            }
            if (!Intrinsics.d(secondBlock2.getSubtitle(), secondBlock3 != null ? secondBlock3.getSubtitle() : null)) {
                TextHolderKt.bindOrGone$default(this.subTitleUserStar, secondBlock2.getSubtitle(), null, 2, null);
            }
            if (!Intrinsics.d(secondBlock2.getIcon(), secondBlock3 != null ? secondBlock3.getIcon() : null)) {
                IconHolderKt.bindOrGone$default(this.iconUserStar, secondBlock2.getIcon(), null, 2, null);
            }
            if (!Intrinsics.d(secondBlock2.getBackgroundColor(), secondBlock3 != null ? secondBlock3.getBackgroundColor() : null)) {
                setBackgroundContainer(this.containerUserStar, secondBlock2.getBackgroundColor());
            }
        }
        this.state = item;
    }

    public final void updateUserStars(@NotNull final String stars) {
        Intrinsics.checkNotNullParameter(stars, "stars");
        if (stars.length() == 0) {
            return;
        }
        Integer w02 = h.w0(stars);
        int intValue = w02 != null ? w02.intValue() : 0;
        Integer w03 = h.w0(this.titleUserStar.getText().toString());
        int intValue2 = w03 != null ? w03.intValue() : 0;
        if (intValue == intValue2) {
            return;
        }
        boolean z11 = intValue > intValue2;
        float height = this.titleUserStar.getHeight();
        if (z11) {
            height = -height;
        }
        final float height2 = this.titleUserStar.getHeight();
        if (!z11) {
            height2 = -height2;
        }
        Drawable d11 = z11 ? g.d(getResources(), R$drawable.bg_stars_tile_gradient_top, getContext().getTheme()) : g.d(getResources(), R$drawable.bg_stars_tile_gradient_bottom, getContext().getTheme());
        final Drawable d12 = z11 ? g.d(getResources(), R$drawable.bg_stars_tile_gradient_bottom, getContext().getTheme()) : g.d(getResources(), R$drawable.bg_stars_tile_gradient_top, getContext().getTheme());
        this.titleUserStar.animate().translationY(height * 0.3f).alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withStartAction(new c(1, this, d11)).withEndAction(new Runnable() { // from class: GE.a
            @Override // java.lang.Runnable
            public final void run() {
                ProductStarsTileView.updateUserStars$lambda$6(ProductStarsTileView.this, stars, height2, d12);
            }
        }).start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductStarsTileView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        setId(R$id.productStarsTileContainerLL);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        setGravity(16);
        int i13 = PADDING_HORIZONTAL;
        setPadding(i13, getPaddingTop(), i13, getPaddingBottom());
        ConstraintLayout createContainer = createContainer(R$id.productStarsTileProductContainer);
        this.containerProductStar = createContainer;
        ViewGroup.LayoutParams layoutParams = createContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i14 = MARGIN_ELEMENT;
        marginLayoutParams.setMarginEnd(i14);
        createContainer.setLayoutParams(marginLayoutParams);
        ConstraintLayout createContainer2 = createContainer(R$id.productStarsTileUserContainer);
        this.containerUserStar = createContainer2;
        ViewGroup.LayoutParams layoutParams2 = createContainer2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(i14);
        createContainer2.setLayoutParams(marginLayoutParams2);
        int i15 = R$id.productStarsTileTitleProductView;
        int i16 = HEIGHT_TITLE;
        TextAtomV2View createTextAtom$default = createTextAtom$default(this, i15, createContainer, 0, i16, 4, null);
        this.titleProductStar = createTextAtom$default;
        TextAtomV2View createTextAtom$default2 = createTextAtom$default(this, R$id.productStarsTileSubtitleProductView, createContainer, 0, 0, 8, null);
        this.subTitleProductStar = createTextAtom$default2;
        IconView createIconView = createIconView(R$id.productStarsTileIconProductView, createContainer);
        this.iconProductStar = createIconView;
        TextAtomV2View createTextAtom$default3 = createTextAtom$default(this, R$id.productStarsTileTitleUserView, createContainer2, 0, i16, 4, null);
        this.titleUserStar = createTextAtom$default3;
        TextAtomV2View createTextAtom$default4 = createTextAtom$default(this, R$id.productStarsTileSubtitleUserView, createContainer2, 0, 0, 8, null);
        this.subTitleUserStar = createTextAtom$default4;
        IconView createIconView2 = createIconView(R$id.productStarsTileIconUserView, createContainer2);
        this.iconUserStar = createIconView2;
        View createGradientView = createGradientView(R$id.productStarsTileGradientView, createContainer2);
        this.gradientView = createGradientView;
        setConstraints$default(this, createContainer, createTextAtom$default.getId(), createTextAtom$default2.getId(), createIconView.getId(), null, 8, null);
        setConstraints(createContainer2, createTextAtom$default3.getId(), createTextAtom$default4.getId(), createIconView2.getId(), Integer.valueOf(createGradientView.getId()));
        ViewGroup.LayoutParams layoutParams3 = createGradientView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.topMargin = MARGIN_TOP;
        marginLayoutParams3.bottomMargin = MARGIN_BOTTOM;
        createGradientView.setLayoutParams(marginLayoutParams3);
    }
}
