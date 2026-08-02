package ru.ozon.app.android.bank.widgets.productStarsTile.presentation;

import Cm.RunnableC2781a;
import Cm.c;
import Cm.e;
import H30.z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.res.g;
import androidx.core.graphics.drawable.a;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.R$drawable;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileVO;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001e\u0010#\u001a\u00020\u00182\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00142\b\u0010%\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\u0012\u0010'\u001a\u00020\f2\b\b\u0001\u0010(\u001a\u00020\u0007H\u0002J\u001c\u0010)\u001a\u00020\u00142\b\b\u0001\u0010(\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\fH\u0002J-\u0010+\u001a\u00020\u000f2\b\b\u0001\u0010(\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010-J1\u0010.\u001a\u00020\u0018*\u00020\f2\b\b\u0001\u0010/\u001a\u00020\u00072\b\b\u0001\u00100\u001a\u00020\u00072\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u00102R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "containerUserStar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerProductStar", "titleProductStar", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subTitleProductStar", "titleUserStar", "subTitleUserStar", "gradientView", "Landroid/view/View;", "state", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileVO;", "bind", "", "item", "updateUserStars", "stars", "", "setTitleProductStar", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "setSubTitleProductStar", "setTitleUserStar", "setSubTitleUserStar", "setBackgroundContainer", "view", "background", "createViews", "createContainer", "idView", "createGradientView", "container", "createTextAtom", "height", "(ILandroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/Integer;)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "setConstraints", "idTitle", "idSubtitle", "idGradientView", "(Landroidx/constraintlayout/widget/ConstraintLayout;IILjava/lang/Integer;)V", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductStarsTileView extends LinearLayout {
    private ConstraintLayout containerProductStar;
    private ConstraintLayout containerUserStar;
    private View gradientView;
    private ProductStarsTileVO state;
    private TextAtomV2View subTitleProductStar;
    private TextAtomV2View subTitleUserStar;
    private TextAtomV2View titleProductStar;
    private TextAtomV2View titleUserStar;
    private static int MIN_HEIGHT_VIEW_70 = ResourceExtKt.toPx(70);
    private static int PADDING_HORIZONTAL = ResourceExtKt.toPx(16);
    private static int MARGIN_ELEMENT = ResourceExtKt.toPx(4);
    private static int MARGIN_TOP = ResourceExtKt.toPx(6);
    private static int MARGIN_BOTTOM = -ResourceExtKt.toPx(4);
    private static int HEIGHT_TITLE = ResourceExtKt.toPx(30);

    public /* synthetic */ ProductStarsTileView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final ConstraintLayout createContainer(int idView) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(idView);
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 0.5f));
        constraintLayout.setMinHeight(MIN_HEIGHT_VIEW_70);
        addView(constraintLayout);
        return constraintLayout;
    }

    private final View createGradientView(int idView, ConstraintLayout container) {
        View view = new View(getContext());
        view.setId(idView);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        if (container != null) {
            container.addView(view);
        }
        return view;
    }

    private final TextAtomV2View createTextAtom(int idView, ConstraintLayout container, Integer height) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(idView);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, height != null ? height.intValue() : -2));
        if (container != null) {
            container.addView(textAtomV2View);
        }
        return textAtomV2View;
    }

    static /* synthetic */ TextAtomV2View createTextAtom$default(ProductStarsTileView productStarsTileView, int i11, ConstraintLayout constraintLayout, Integer num, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        return productStarsTileView.createTextAtom(i11, constraintLayout, num);
    }

    private final void createViews() {
        ConstraintLayout createContainer = createContainer(R$id.productStarsTileProductContainer);
        this.containerProductStar = createContainer;
        if (createContainer != null) {
            z.e(MARGIN_ELEMENT, createContainer);
        }
        ConstraintLayout createContainer2 = createContainer(R$id.productStarsTileUserContainer);
        this.containerUserStar = createContainer2;
        if (createContainer2 != null) {
            z.f(MARGIN_ELEMENT, createContainer2);
        }
        this.titleProductStar = createTextAtom(R$id.productStarsTileTitleProductView, this.containerProductStar, Integer.valueOf(HEIGHT_TITLE));
        this.subTitleProductStar = createTextAtom$default(this, R$id.productStarsTileSubtitleProductView, this.containerProductStar, null, 4, null);
        this.titleUserStar = createTextAtom(R$id.productStarsTileTitleUserView, this.containerUserStar, Integer.valueOf(HEIGHT_TITLE));
        this.subTitleUserStar = createTextAtom$default(this, R$id.productStarsTileSubtitleUserView, this.containerUserStar, null, 4, null);
        this.gradientView = createGradientView(R$id.productStarsTileGradientView, this.containerUserStar);
        ConstraintLayout constraintLayout = this.containerProductStar;
        if (constraintLayout != null) {
            setConstraints$default(this, constraintLayout, R$id.productStarsTileTitleProductView, R$id.productStarsTileSubtitleProductView, null, 4, null);
        }
        ConstraintLayout constraintLayout2 = this.containerUserStar;
        if (constraintLayout2 != null) {
            setConstraints(constraintLayout2, R$id.productStarsTileTitleUserView, R$id.productStarsTileSubtitleUserView, Integer.valueOf(R$id.productStarsTileGradientView));
        }
        View view = this.gradientView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = MARGIN_TOP;
            marginLayoutParams.bottomMargin = MARGIN_BOTTOM;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    private final void setBackgroundContainer(View view, String background) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, background);
        Drawable a11 = C7232a.a(getContext(), R$drawable.bg_rounded_12);
        if (a11 == null || parseColor == null) {
            if (view != null) {
                view.setBackground(a11);
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(a11, "wrap(...)");
            a.i(a11, parseColor.intValue());
            if (view != null) {
                view.setBackground(a11);
            }
        }
    }

    private final void setConstraints(ConstraintLayout constraintLayout, int i11, int i12, Integer num) {
        d b11 = e.b(constraintLayout);
        ConstraintSetExtKt.startToStart$default(b11, i11, 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(b11, i11, 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(b11, i11, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToTop$default(b11, i11, i12, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(b11, i12, 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(b11, i12, 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(b11, i12, i11, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(b11, i12, 0, 0, 4, null);
        if (num != null) {
            ConstraintSetExtKt.startToStart$default(b11, num.intValue(), i12, 0, 4, null);
            ConstraintSetExtKt.endToEnd$default(b11, num.intValue(), i12, 0, 4, null);
            ConstraintSetExtKt.topToTop$default(b11, num.intValue(), 0, 0, 4, null);
            ConstraintSetExtKt.bottomToTop$default(b11, num.intValue(), i12, 0, 4, null);
        }
        b11.g0(i11, 2);
        b11.f(constraintLayout);
    }

    static /* synthetic */ void setConstraints$default(ProductStarsTileView productStarsTileView, ConstraintLayout constraintLayout, int i11, int i12, Integer num, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        productStarsTileView.setConstraints(constraintLayout, i11, i12, num);
    }

    private final void setSubTitleProductStar(TextDTO title) {
        TextAtomV2View textAtomV2View = this.subTitleProductStar;
        if (textAtomV2View != null) {
            TextHolderKt.bindOrGone$default(textAtomV2View, title, null, 2, null);
        }
    }

    private final void setSubTitleUserStar(TextDTO title) {
        TextAtomV2View textAtomV2View = this.subTitleUserStar;
        if (textAtomV2View != null) {
            TextHolderKt.bindOrGone$default(textAtomV2View, title, null, 2, null);
        }
    }

    private final void setTitleProductStar(TextDTO title) {
        TextAtomV2View textAtomV2View = this.titleProductStar;
        if (textAtomV2View != null) {
            TextHolderKt.bindOrGone$default(textAtomV2View, title, null, 2, null);
        }
    }

    private final void setTitleUserStar(TextDTO title) {
        TextAtomV2View textAtomV2View = this.titleUserStar;
        if (textAtomV2View != null) {
            TextHolderKt.bindOrGone$default(textAtomV2View, title, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUserStars$lambda$4$lambda$0(ProductStarsTileView productStarsTileView, Drawable drawable) {
        View view = productStarsTileView.gradientView;
        if (view != null) {
            view.setForeground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUserStars$lambda$4$lambda$3(ProductStarsTileView productStarsTileView, TextAtomV2View textAtomV2View, String str, float f7, Drawable drawable) {
        View view = productStarsTileView.gradientView;
        if (view != null) {
            view.setForeground(null);
        }
        textAtomV2View.setText(str);
        textAtomV2View.setTranslationY(f7 * 0.3f);
        int i11 = 0;
        textAtomV2View.animate().translationY(0.0f).alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withStartAction(new c(i11, productStarsTileView, drawable)).withEndAction(new Cm.d(productStarsTileView, i11)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUserStars$lambda$4$lambda$3$lambda$1(ProductStarsTileView productStarsTileView, Drawable drawable) {
        View view = productStarsTileView.gradientView;
        if (view != null) {
            view.setForeground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUserStars$lambda$4$lambda$3$lambda$2(ProductStarsTileView productStarsTileView) {
        View view = productStarsTileView.gradientView;
        if (view != null) {
            view.setForeground(null);
        }
    }

    public final void bind(@NotNull ProductStarsTileVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
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
                setTitleProductStar(firstBlock2.getTitle());
            }
            if (!Intrinsics.d(firstBlock2.getSubtitle(), firstBlock3 != null ? firstBlock3.getSubtitle() : null)) {
                setSubTitleProductStar(firstBlock2.getSubtitle());
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
                setTitleUserStar(secondBlock2.getTitle());
            }
            if (!Intrinsics.d(secondBlock2.getSubtitle(), secondBlock3 != null ? secondBlock3.getSubtitle() : null)) {
                setSubTitleUserStar(secondBlock2.getSubtitle());
            }
            if (!Intrinsics.d(secondBlock2.getBackgroundColor(), secondBlock3 != null ? secondBlock3.getBackgroundColor() : null)) {
                setBackgroundContainer(this.containerUserStar, secondBlock2.getBackgroundColor());
            }
        }
        this.state = item;
    }

    public final void updateUserStars(@NotNull final String stars) {
        final TextAtomV2View textAtomV2View;
        Intrinsics.checkNotNullParameter(stars, "stars");
        if (stars.length() == 0) {
            return;
        }
        Integer w02 = h.w0(stars);
        int intValue = w02 != null ? w02.intValue() : 0;
        TextAtomV2View textAtomV2View2 = this.titleUserStar;
        Integer w03 = h.w0(String.valueOf(textAtomV2View2 != null ? textAtomV2View2.getText() : null));
        int intValue2 = w03 != null ? w03.intValue() : 0;
        if (intValue == intValue2 || (textAtomV2View = this.titleUserStar) == null) {
            return;
        }
        boolean z11 = intValue > intValue2;
        float height = textAtomV2View.getHeight();
        if (z11) {
            height = -height;
        }
        float height2 = textAtomV2View.getHeight();
        if (!z11) {
            height2 = -height2;
        }
        final float f7 = height2;
        Drawable d11 = z11 ? g.d(getResources(), R$drawable.bg_gradient_top, getContext().getTheme()) : g.d(getResources(), R$drawable.bg_gradient_bottom, getContext().getTheme());
        final Drawable d12 = z11 ? g.d(getResources(), R$drawable.bg_gradient_bottom, getContext().getTheme()) : g.d(getResources(), R$drawable.bg_gradient_top, getContext().getTheme());
        textAtomV2View.animate().translationY(height * 0.3f).alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withStartAction(new RunnableC2781a(0, this, d11)).withEndAction(new Runnable() { // from class: Cm.b
            @Override // java.lang.Runnable
            public final void run() {
                ProductStarsTileView.updateUserStars$lambda$4$lambda$3(ProductStarsTileView.this, textAtomV2View, stars, f7, d12);
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
        createViews();
    }
}
