package ru.ozon.app.android.travel.molecules.view.banner;

import Bi.b;
import Jm0.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.common.gradient.OzGradient;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniGradient;
import y7.k;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0014J\"\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019J\b\u0010&\u001a\u00020\u001bH\u0002J\u0012\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u001c\u0010*\u001a\u00020\u001b2\b\u0010+\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010)H\u0002J\b\u0010-\u001a\u00020\u000fH\u0002J\b\u0010.\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/banner/BannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "tinyMargin", "", "margin", "outerRadius", "", "innerRadius", "paint", "Landroid/graphics/Paint;", "rightImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "leftImageView", "backgroundView", "Landroid/view/View;", "closeButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTextView", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "item", "Lru/ozon/app/android/travel/molecules/view/banner/BannerVO;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "onAction", "setUp", "bindCountourColor", "color", "", "bindBackgroundColor", "gradientColor", "solidColor", "getShapeableImageView", "getTextAtom", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BannerView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final View backgroundView;

    @NotNull
    private final IconButtonV3View closeButtonView;
    private final float innerRadius;
    private BannerVO item;

    @NotNull
    private final ShapeableImageView leftImageView;
    private final int margin;
    private final float outerRadius;

    @NotNull
    private final Paint paint;

    @NotNull
    private final ShapeableImageView rightImageView;

    @NotNull
    private final TextAtomV2View subtitleTextView;
    private final int tinyMargin;

    @NotNull
    private final TextAtomV2View titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context) {
        super(context);
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.tinyMargin = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.margin = px2;
        this.outerRadius = ResourceExtKt.toPxF(20, context);
        float pxF = ResourceExtKt.toPxF(16, context);
        this.innerRadius = pxF;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        ShapeableImageView shapeableImageView = getShapeableImageView();
        shapeableImageView.setId(1);
        ConstraintLayout.b bVar = new ConstraintLayout.b(ResourceExtKt.toPx(122, context), 0);
        bVar.f41636i = 3;
        bVar.f41642l = 3;
        bVar.f41658v = 3;
        shapeableImageView.setLayoutParams(bVar);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        k.a aVar = new k.a(new k());
        aVar.t(pxF);
        aVar.l(pxF);
        shapeableImageView.setShapeAppearanceModel(aVar.a());
        this.rightImageView = shapeableImageView;
        ShapeableImageView shapeableImageView2 = getShapeableImageView();
        shapeableImageView2.setId(2);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, 0);
        bVar2.f41656t = 3;
        bVar2.f41636i = 3;
        bVar2.f41642l = 3;
        bVar2.f41657u = 1;
        bVar2.f41616W = true;
        shapeableImageView2.setLayoutParams(bVar2);
        k.a aVar2 = new k.a(new k());
        aVar2.p(pxF);
        aVar2.h(pxF);
        shapeableImageView2.setShapeAppearanceModel(aVar2.a());
        this.leftImageView = shapeableImageView2;
        View view2 = new View(context);
        view2.setId(3);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, 0);
        bVar3.f41636i = 0;
        bVar3.f41656t = 0;
        bVar3.f41642l = 0;
        bVar3.f41658v = 0;
        view2.setLayoutParams(bVar3);
        this.backgroundView = view2;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) q.f64554a.i(N.b(IconButtonV3View.class), context);
        if (iconButtonV3View == null) {
            view = view2;
            IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, null, 0, 0, 14, null);
            iconButtonV3View2.setId(6);
            int px3 = ResourceExtKt.toPx(24, context);
            ConstraintLayout.b bVar4 = new ConstraintLayout.b(px3, px3);
            int px4 = ResourceExtKt.toPx(12, context);
            bVar4.setMargins(0, px4, px4, 0);
            bVar4.f41636i = 3;
            bVar4.f41658v = 3;
            iconButtonV3View2.setLayoutParams(bVar4);
            iconButtonV3View = iconButtonV3View2;
        } else {
            view = view2;
        }
        this.closeButtonView = iconButtonV3View;
        TextAtomV2View textAtom = getTextAtom();
        ConstraintLayout.b d11 = b.d(textAtom, 4, 0, -2);
        d11.f41662z = px2;
        d11.f41656t = 3;
        d11.f41636i = 3;
        d11.f41657u = shapeableImageView.getId();
        d11.f41640k = 5;
        d11.f41604K = 2;
        d11.f41599F = 0.0f;
        d11.setMargins(px2, px2, px2, px);
        textAtom.setLayoutParams(d11);
        textAtom.setTextIsSelectable(false);
        this.titleTextView = textAtom;
        TextAtomV2View textAtom2 = getTextAtom();
        ConstraintLayout.b d12 = b.d(textAtom2, 5, 0, -2);
        d12.f41660x = px2;
        d12.f41656t = 3;
        d12.f41657u = shapeableImageView.getId();
        d12.f41638j = 4;
        d12.f41642l = 3;
        d12.setMargins(px2, px, px2, px2);
        textAtom2.setLayoutParams(d12);
        textAtom2.setTextIsSelectable(false);
        this.subtitleTextView = textAtom2;
        setWillNotDraw(false);
        setUp();
        addView(view);
        addView(shapeableImageView);
        addView(shapeableImageView2);
        addView(iconButtonV3View);
        addView(textAtom);
        addView(textAtom2);
    }

    private final void bindBackgroundColor(String gradientColor, String solidColor) {
        OzGradient parseGradient;
        Drawable background = this.backgroundView.getBackground();
        Unit unit = null;
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return;
        }
        if (gradientColor == null) {
            if (solidColor != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context, solidColor);
                if (parseColor != null) {
                    new Color.Solid(parseColor.intValue()).applyTo(gradientDrawable);
                    return;
                }
                return;
            }
            return;
        }
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(gradientColor);
        if (gradientByToken != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Color.Gradient gradient = TokensExtKt.toGradient(gradientByToken, context2);
            if (gradient != null) {
                gradient.applyTo(gradientDrawable);
                unit = Unit.f71690a;
            }
        }
        if (unit != null || (parseGradient = StyleParser.INSTANCE.parseGradient(gradientColor)) == null) {
            return;
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        gradientDrawable.setColors(parseGradient.getColors(context3));
        gradientDrawable.setOrientation(parseGradient.getOrientation());
    }

    private final void bindCountourColor(String color) {
        if (color == null) {
            View view = this.backgroundView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int i11 = this.margin;
            bVar.setMargins(i11, 0, i11, 0);
            view.setLayoutParams(bVar);
            return;
        }
        View view2 = this.backgroundView;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        int i12 = this.margin;
        bVar2.setMargins(i12, i12, i12, i12);
        view2.setLayoutParams(bVar2);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, color);
        if (parseColor != null) {
            this.paint.setColor(parseColor.intValue());
        }
    }

    private final ShapeableImageView getShapeableImageView() {
        ShapeableImageView shapeableImageView = (ShapeableImageView) q.f64554a.i(N.b(ShapeableImageView.class), getContext());
        return shapeableImageView == null ? new ShapeableImageView(getContext()) : shapeableImageView;
    }

    private final TextAtomV2View getTextAtom() {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), getContext());
        if (textAtomV2View != null) {
            return textAtomV2View;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new TextAtomV2View(context, null, 0, 6, null);
    }

    private final void setUp() {
        this.backgroundView.setBackground(RoundedBackgroundProducer.produceGradient$default(new RoundedBackgroundProducer(), this.innerRadius, null, 2, null));
        setOnClickListener(new a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUp$lambda$15(BannerView bannerView, View view) {
        AtomAction atomAction;
        Function1<? super AtomAction, Unit> function1;
        BannerVO bannerVO = bannerView.item;
        if (bannerVO == null || (atomAction = bannerVO.getAtomAction()) == null || (function1 = bannerView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final void bind(@NotNull BannerVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.item = item;
        this.actionHandler = onAction;
        ImageViewExtKt.load$default(this.rightImageView, item.getRightImageLink(), null, null, null, null, false, null, 126, null);
        ImageViewExtKt.loadImageOrGone(this.leftImageView, item.getLeftImageLink());
        TextHolderKt.bindOrGone$default(this.titleTextView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTextView, item.getSubtitle(), null, 2, null);
        this.titleTextView.setTextSize(1, 16.0f);
        this.subtitleTextView.setTextSize(1, 14.0f);
        bindCountourColor(item.getContourColor());
        bindBackgroundColor(item.getGradientColor(), item.getSolidColor());
        IconButtonV3HolderKt.bindOrGone(this.closeButtonView, item.getCloseButton(), onAction);
        if (this.backgroundView.getHeight() != item.getHeight()) {
            View view = this.backgroundView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).height = item.getHeight();
            view.setLayoutParams(bVar);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        BannerVO bannerVO = this.item;
        if ((bannerVO != null ? bannerVO.getContourColor() : null) != null) {
            float width = getWidth();
            float height = getHeight();
            float f7 = this.outerRadius;
            canvas.drawRoundRect(0.0f, 0.0f, width, height, f7, f7, this.paint);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        BannerVO bannerVO = this.item;
        if (bannerVO == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(bannerVO.getHeight() + ((bannerVO != null ? bannerVO.getContourColor() : null) != null ? this.margin * 2 : 0), View.MeasureSpec.getMode(heightMeasureSpec)));
        }
    }
}
