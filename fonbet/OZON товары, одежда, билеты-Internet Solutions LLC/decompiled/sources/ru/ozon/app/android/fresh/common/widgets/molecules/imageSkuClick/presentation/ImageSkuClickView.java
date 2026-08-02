package ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation;

import Au.c;
import Au.d;
import Au.e;
import Bi.b;
import D40.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.R$id;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import y7.C10856g;
import y7.k;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u000e\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cJ*\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010 \u001a\u00020\u001fJ\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180\u001eJ\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\f\u0010\"\u001a\u00020\u0018*\u00020#H\u0002J\f\u0010$\u001a\u00020\u0018*\u00020\u001aH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "quantityTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTv", "imageIv", "ru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickView$imageIv$1", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickView$imageIv$1;", "overlayIv", "Landroid/widget/ImageView;", "startGuideline", "Landroidx/constraintlayout/widget/Guideline;", "endGuideline", "bottomGuideline", "topGuideline", "bind", "", "imageSkuClickVO", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;", "onClick", "Lkotlin/Function0;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "customAction", "innerBind", "setupSpacers", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$SpacersVO;", "setupOverlay", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageSkuClickView extends ConstraintLayout {

    @NotNull
    private final Guideline bottomGuideline;

    @NotNull
    private final Guideline endGuideline;

    @NotNull
    private final ImageSkuClickView$imageIv$1 imageIv;

    @NotNull
    private final ImageView overlayIv;

    @NotNull
    private final TextAtomV2View quantityTv;

    @NotNull
    private final Guideline startGuideline;

    @NotNull
    private final TextAtomV2View subtitleTv;

    @NotNull
    private final Guideline topGuideline;

    public /* synthetic */ ImageSkuClickView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void innerBind(ImageSkuClickVO imageSkuClickVO) {
        setupSpacers(imageSkuClickVO.getSpacers());
        ImageHolderKt.bind$default(this.imageIv, imageSkuClickVO.getImage(), null, 2, null);
        setupOverlay(imageSkuClickVO);
        TextHolderKt.bind$default(this.quantityTv, imageSkuClickVO.getText().getQuantity(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleTv, imageSkuClickVO.getText().getSubtitle(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean quantityTv$lambda$2$lambda$1$lambda$0(ImageSkuClickView imageSkuClickView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        imageSkuClickView.performClick();
        return false;
    }

    private final void setupOverlay(ImageSkuClickVO imageSkuClickVO) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, imageSkuClickVO.getOverlayColor(), UniColors.GRAPHIC_TERTIARY_ON_LIGHT.getResId());
        C10856g c10856g = new C10856g();
        c10856g.B(ColorStateList.valueOf(parseColor));
        k.a aVar = new k.a();
        aVar.e(imageSkuClickVO.getViewCorner());
        c10856g.setShapeAppearanceModel(aVar.a());
        this.overlayIv.setBackground(c10856g);
    }

    private final void setupSpacers(ImageSkuClickVO.SpacersVO spacersVO) {
        this.startGuideline.a(spacersVO.getLeft());
        this.endGuideline.b(spacersVO.getRight());
        this.topGuideline.a(spacersVO.getTop());
        this.bottomGuideline.b(spacersVO.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subtitleTv$lambda$5$lambda$4$lambda$3(ImageSkuClickView imageSkuClickView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        imageSkuClickView.performClick();
        return false;
    }

    public final void bind(@NotNull ImageSkuClickVO imageSkuClickVO, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(imageSkuClickVO, "imageSkuClickVO");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        innerBind(imageSkuClickVO);
        setOnClickListener(new d(onClick, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickView$imageIv$1] */
    public ImageSkuClickView(@NotNull final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.skuImageQuantityTv, -2, -2);
        d11.f41640k = R$id.skuImageSubtitleTv;
        d11.f41655s = R$id.skuImageStartGuideline;
        d11.f41657u = R$id.skuImageEndGuideline;
        d11.f41638j = R$id.skuImageTopGuideline;
        d11.f41604K = 2;
        textAtomV2View.setTextIsSelectable(false);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        textAtomV2View.setOnTouchListener(new View.OnTouchListener() { // from class: Au.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean quantityTv$lambda$2$lambda$1$lambda$0;
                quantityTv$lambda$2$lambda$1$lambda$0 = ImageSkuClickView.quantityTv$lambda$2$lambda$1$lambda$0(ImageSkuClickView.this, view, motionEvent);
                return quantityTv$lambda$2$lambda$1$lambda$0;
            }
        });
        textAtomV2View.setLayoutParams(d11);
        this.quantityTv = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.skuImageSubtitleTv, -2, -2);
        d12.f41638j = R$id.skuImageQuantityTv;
        d12.f41655s = R$id.skuImageStartGuideline;
        d12.f41657u = R$id.skuImageEndGuideline;
        d12.f41640k = R$id.skuImageBottomGuideline;
        textAtomV2View2.setTextIsSelectable(false);
        TextViewExtKt.setTextCopyable(textAtomV2View2, false);
        textAtomV2View2.setOnTouchListener(new Au.b(this, 0));
        textAtomV2View2.setLayoutParams(d12);
        this.subtitleTv = textAtomV2View2;
        ?? r22 = new Image(context) { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickView$imageIv$1
            {
                setId(R$id.skuImageIv);
                ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
                bVar.f41636i = 0;
                bVar.f41656t = 0;
                bVar.f41658v = 0;
                bVar.f41642l = 0;
                setLayoutParams(bVar);
            }

            @Override // ru.ozon.uni.android.atom.image.Image, android.widget.ImageView, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                int size = View.MeasureSpec.getSize(heightMeasureSpec);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getAspectRatio().getHeightRatio() * (size / getAspectRatio().getWidthRatio()), 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }
        };
        this.imageIv = r22;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.skuOverlayImageIv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        int i14 = R$id.skuImageIv;
        bVar.f41636i = i14;
        bVar.f41656t = i14;
        bVar.f41658v = i14;
        bVar.f41642l = i14;
        imageView.setLayoutParams(bVar);
        this.overlayIv = imageView;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.skuImageStartGuideline, -2, -2);
        a11.f41615V = 1;
        guideline.setLayoutParams(a11);
        this.startGuideline = guideline;
        Guideline guideline2 = new Guideline(context);
        ConstraintLayout.b a12 = a.a(guideline2, R$id.skuImageEndGuideline, -2, -2);
        a12.f41615V = 1;
        guideline2.setLayoutParams(a12);
        this.endGuideline = guideline2;
        Guideline guideline3 = new Guideline(context);
        ConstraintLayout.b a13 = a.a(guideline3, R$id.skuImageBottomGuideline, -2, -2);
        a13.f41615V = 0;
        guideline3.setLayoutParams(a13);
        this.bottomGuideline = guideline3;
        Guideline guideline4 = new Guideline(context);
        ConstraintLayout.b a14 = a.a(guideline4, R$id.skuImageTopGuideline, -2, -2);
        a14.f41615V = 0;
        guideline4.setLayoutParams(a14);
        this.topGuideline = guideline4;
        addView(r22);
        addView(imageView);
        addView(guideline);
        addView(guideline2);
        addView(guideline3);
        addView(guideline4);
        addView(textAtomV2View);
        addView(textAtomV2View2);
    }

    public final void bind(@NotNull ImageSkuClickVO imageSkuClickVO, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AtomAction customAction) {
        Intrinsics.checkNotNullParameter(imageSkuClickVO, "imageSkuClickVO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(customAction, "customAction");
        bind(imageSkuClickVO, actionHandler);
        setOnClickListener(new c(0, actionHandler, customAction));
    }

    public final void bind(@NotNull ImageSkuClickVO imageSkuClickVO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(imageSkuClickVO, "imageSkuClickVO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setupSpacers(imageSkuClickVO.getSpacers());
        ImageHolderKt.bind$default(this.imageIv, imageSkuClickVO.getImage(), null, 2, null);
        setupOverlay(imageSkuClickVO);
        TextHolderKt.bind$default(this.quantityTv, imageSkuClickVO.getText().getQuantity(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleTv, imageSkuClickVO.getText().getSubtitle(), null, 2, null);
        AtomAction action = imageSkuClickVO.getAction();
        if (action != null) {
            setOnClickListener(new e(0, (Object) actionHandler, (Object) action));
        }
    }
}
