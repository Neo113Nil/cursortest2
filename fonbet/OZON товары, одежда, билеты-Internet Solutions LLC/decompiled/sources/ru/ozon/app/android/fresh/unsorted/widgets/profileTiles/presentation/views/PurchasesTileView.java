package ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views;

import Hj.C3143a;
import Nx.ViewOnClickListenerC3676a;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaView;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.domain.ProfileTilesVO;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views.PurchasesTileView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/PurchasesTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "color", "radius", "", "bindBackground", "(Ljava/lang/String;Ljava/lang/Integer;)V", "", "hasPurchases", "setupLayout", "(Z)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Purchases;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Purchases;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "media", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "getMedia", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "tagButtonView", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "getTagButtonView", "()Lru/ozon/uni/android/controls/tag/TagButtonView;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PurchasesTileView extends ConstraintLayout {
    private static final int bottomPadding;
    private static final int defaultBackgroundColor;
    private static final float defaultCornerRadius;
    private static final int leftPadding;
    private static final int textIntersectRightMargin;
    private static final int textRightMargin;
    private static final int textWidthWithPurchases;
    private static final int textWidthWithoutPurchases;
    private static final int topPadding;

    @NotNull
    private final ProductMediaView media;

    @NotNull
    private final TagButtonView tagButtonView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int collageSize = UiExtKt.toPx(92);
    private static final int imageSize = UiExtKt.toPx(115);
    private static final int imageTopMargin = UiExtKt.toPx(12);
    private static final int imageRightMargin = UiExtKt.toPx(-23);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/PurchasesTileView$Companion;", "", "<init>", "()V", "", "defaultCornerRadius", "F", "getDefaultCornerRadius", "()F", "TOP_BIAS", "LEFT_BIAS", "", "ZERO_PADDING", "I", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getDefaultCornerRadius() {
            return PurchasesTileView.defaultCornerRadius;
        }

        private Companion() {
        }
    }

    static {
        int px = UiExtKt.toPx(4);
        topPadding = px;
        bottomPadding = px;
        textRightMargin = UiExtKt.toPx(4);
        textIntersectRightMargin = UiExtKt.toPx(-8);
        leftPadding = UiExtKt.toPx(8);
        textWidthWithoutPurchases = UiExtKt.toPx(120);
        textWidthWithPurchases = UiExtKt.toPx(80);
        defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();
        defaultCornerRadius = UiExtKt.toPxF(24);
    }

    public /* synthetic */ PurchasesTileView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$9$lambda$8(ProfileTilesVO.Purchases purchases, Function1 function1, View view) {
        AtomAction action = purchases.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    private final void bindBackground(String color, final Integer radius) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, color, defaultBackgroundColor));
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views.PurchasesTileView$bindBackground$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                PurchasesTileView.Companion companion;
                float defaultCornerRadius2;
                int f7 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                Integer num = radius;
                if (num != null) {
                    defaultCornerRadius2 = UiExtKt.toPxF(num.intValue());
                } else {
                    companion = PurchasesTileView.Companion;
                    defaultCornerRadius2 = companion.getDefaultCornerRadius();
                }
                outline.setRoundRect(0, 0, f7, height, defaultCornerRadius2);
            }
        });
    }

    private final void setupLayout(boolean hasPurchases) {
        if (!hasPurchases) {
            setPadding(getPaddingLeft(), getPaddingTop(), 0, 0);
            TextAtomV2View textAtomV2View = this.titleView;
            ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41632g = R$id.profileTilesPurchasesImage;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = textIntersectRightMargin;
            ((ViewGroup.MarginLayoutParams) bVar).width = textWidthWithoutPurchases;
            textAtomV2View.setLayoutParams(bVar);
            ProductMediaView productMediaView = this.media;
            ViewGroup.LayoutParams layoutParams2 = productMediaView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.f41642l = -1;
            bVar2.f41634h = 0;
            ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = imageRightMargin;
            ((ViewGroup.MarginLayoutParams) bVar2).topMargin = imageTopMargin;
            int i11 = imageSize;
            ((ViewGroup.MarginLayoutParams) bVar2).width = i11;
            ((ViewGroup.MarginLayoutParams) bVar2).height = i11;
            productMediaView.setLayoutParams(bVar2);
            return;
        }
        int i12 = bottomPadding;
        setPadding(getPaddingLeft(), getPaddingTop(), i12, i12);
        TextAtomV2View textAtomV2View2 = this.titleView;
        ViewGroup.LayoutParams layoutParams3 = textAtomV2View2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.f41632g = R$id.profileTilesPurchasesImage;
        ((ViewGroup.MarginLayoutParams) bVar3).rightMargin = textRightMargin;
        ((ViewGroup.MarginLayoutParams) bVar3).width = textWidthWithPurchases;
        textAtomV2View2.setLayoutParams(bVar3);
        ProductMediaView productMediaView2 = this.media;
        ViewGroup.LayoutParams layoutParams4 = productMediaView2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
        bVar4.f41642l = 0;
        bVar4.f41634h = 0;
        ((ViewGroup.MarginLayoutParams) bVar4).rightMargin = 0;
        ((ViewGroup.MarginLayoutParams) bVar4).topMargin = 0;
        int i13 = collageSize;
        ((ViewGroup.MarginLayoutParams) bVar4).width = i13;
        ((ViewGroup.MarginLayoutParams) bVar4).height = i13;
        productMediaView2.setLayoutParams(bVar4);
        TagButtonView tagButtonView = this.tagButtonView;
        if (!tagButtonView.isLaidOut() || tagButtonView.isLayoutRequested()) {
            tagButtonView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views.PurchasesTileView$setupLayout$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int measuredWidth = (PurchasesTileView.this.getMeasuredWidth() - PurchasesTileView.collageSize) - PurchasesTileView.leftPadding;
                    if (view.getMeasuredWidth() > measuredWidth) {
                        MeasureExtKt.measureAtMost(PurchasesTileView.this.getTagButtonView(), measuredWidth, PurchasesTileView.this.getMeasuredHeight());
                        PurchasesTileView.this.getTagButtonView().requestLayout();
                        PurchasesTileView.this.getTagButtonView().invalidate();
                    }
                }
            });
            return;
        }
        int measuredWidth = (getMeasuredWidth() - collageSize) - leftPadding;
        if (tagButtonView.getMeasuredWidth() > measuredWidth) {
            MeasureExtKt.measureAtMost(getTagButtonView(), measuredWidth, getMeasuredHeight());
            getTagButtonView().requestLayout();
            getTagButtonView().invalidate();
        }
    }

    public final void bind(@NotNull ProfileTilesVO.Purchases item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bindOrGone$default(this.titleView, item.getTitle(), null, 2, null);
        TagButtonHolderKt.bindOrGone(this.tagButtonView, item.getTagButton(), actionHandler);
        this.media.bind(item.getProductMedia());
        bindBackground(item.getBackgroundColor(), item.getCornerRadius());
        setupLayout(item.getHasPurchases());
        setOnClickListener(new ViewOnClickListenerC3676a(0, item, actionHandler));
    }

    @NotNull
    public final TagButtonView getTagButtonView() {
        return this.tagButtonView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev == null || ev.getAction() != 1) {
            return false;
        }
        return performClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesTileView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        ProductMediaView productMediaView = new ProductMediaView(context, attributeSet2, i12, 6, null);
        productMediaView.setId(R$id.profileTilesPurchasesImage);
        int i13 = collageSize;
        ConstraintLayout.b bVar = new ConstraintLayout.b(i13, i13);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41634h = 0;
        productMediaView.setLayoutParams(bVar);
        addView(productMediaView);
        this.media = productMediaView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.profileTilesPurchasesTitle);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(textWidthWithPurchases, -2);
        bVar2.f41598E = 0.0f;
        ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = textRightMargin;
        bVar2.f41636i = 0;
        bVar2.f41628e = 0;
        bVar2.f41632g = R$id.profileTilesPurchasesImage;
        textAtomV2View.setLayoutParams(bVar2);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TagButtonView tagButtonView = new TagButtonView(context, attributeSet2, i12, 0, 14, null);
        tagButtonView.setId(R$id.profileTilesPurchasesTag);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41599F = 0.0f;
        bVar3.f41598E = 0.0f;
        int i14 = R$id.profileTilesPurchasesTitle;
        bVar3.f41634h = i14;
        bVar3.f41628e = i14;
        bVar3.f41638j = i14;
        bVar3.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = bottomPadding;
        bVar3.f41605L = 1;
        tagButtonView.setLayoutParams(bVar3);
        addView(tagButtonView);
        this.tagButtonView = tagButtonView;
        setPadding(leftPadding, topPadding, getPaddingRight(), getPaddingBottom());
    }
}
