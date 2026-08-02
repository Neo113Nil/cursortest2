package ru.ozon.app.android.returns.details.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/views/ReturnProductInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setupConstraints", "()V", "attributesMarginTop", "I", "quantityMarginTop", "exemplarStatesRvMarginTop", "productLinkMarginHorizontal", "Lru/ozon/app/android/cscore/databinding/ItemImageBinding;", "itemImageBinding", "Lru/ozon/app/android/cscore/databinding/ItemImageBinding;", "getItemImageBinding", "()Lru/ozon/app/android/cscore/databinding/ItemImageBinding;", "Landroid/widget/FrameLayout;", "itemImageView", "Landroid/widget/FrameLayout;", "getItemImageView", "()Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "productLinkSmallBorderlessButtonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "getProductLinkSmallBorderlessButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "attributesVerticalAtomsLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getAttributesVerticalAtomsLayout", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "priceSingleAtom", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getPriceSingleAtom", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "quantityTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getQuantityTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Landroidx/recyclerview/widget/RecyclerView;", "exemplarStatesRv", "Landroidx/recyclerview/widget/RecyclerView;", "getExemplarStatesRv", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/constraintlayout/widget/Barrier;", "quantityBarrier", "Landroidx/constraintlayout/widget/Barrier;", "productInfoBarrier", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnProductInfoView extends ConstraintLayout {
    private final int attributesMarginTop;

    @NotNull
    private final VerticalAtomsLayout attributesVerticalAtomsLayout;

    @NotNull
    private final RecyclerView exemplarStatesRv;
    private final int exemplarStatesRvMarginTop;

    @NotNull
    private final ItemImageBinding itemImageBinding;

    @NotNull
    private final FrameLayout itemImageView;

    @NotNull
    private final SingleAtom priceSingleAtom;

    @NotNull
    private final Barrier productInfoBarrier;
    private final int productLinkMarginHorizontal;

    @NotNull
    private final SmallBorderlessButtonView productLinkSmallBorderlessButtonView;

    @NotNull
    private final Barrier quantityBarrier;
    private final int quantityMarginTop;

    @NotNull
    private final TextAtomView quantityTextAtomView;

    public /* synthetic */ ReturnProductInfoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.itemImageView);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.itemImageView);
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, this.productLinkSmallBorderlessButtonView, this.quantityBarrier);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.productLinkSmallBorderlessButtonView, this.itemImageView);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.productLinkSmallBorderlessButtonView);
        ConstraintSetExtKt.layoutConstraintEndToEndOf(dVar, this.attributesVerticalAtomsLayout, this.productLinkSmallBorderlessButtonView);
        ConstraintSetExtKt.layoutConstraintStartToStartOf(dVar, this.attributesVerticalAtomsLayout, this.productLinkSmallBorderlessButtonView);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.attributesVerticalAtomsLayout, this.productLinkSmallBorderlessButtonView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.priceSingleAtom);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.priceSingleAtom);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.quantityTextAtomView);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.quantityTextAtomView, this.priceSingleAtom);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.exemplarStatesRv);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.exemplarStatesRv);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.exemplarStatesRv, this.productInfoBarrier);
        dVar.f(this);
    }

    @NotNull
    public final VerticalAtomsLayout getAttributesVerticalAtomsLayout() {
        return this.attributesVerticalAtomsLayout;
    }

    @NotNull
    public final RecyclerView getExemplarStatesRv() {
        return this.exemplarStatesRv;
    }

    @NotNull
    public final ItemImageBinding getItemImageBinding() {
        return this.itemImageBinding;
    }

    @NotNull
    public final SingleAtom getPriceSingleAtom() {
        return this.priceSingleAtom;
    }

    @NotNull
    public final SmallBorderlessButtonView getProductLinkSmallBorderlessButtonView() {
        return this.productLinkSmallBorderlessButtonView;
    }

    @NotNull
    public final TextAtomView getQuantityTextAtomView() {
        return this.quantityTextAtomView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnProductInfoView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(4);
        this.attributesMarginTop = px;
        int px2 = UiExtKt.toPx(4);
        this.quantityMarginTop = px2;
        int px3 = UiExtKt.toPx(16);
        this.exemplarStatesRvMarginTop = px3;
        int px4 = UiExtKt.toPx(16);
        this.productLinkMarginHorizontal = px4;
        ItemImageBinding inflate = ItemImageBinding.inflate(LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.itemImageBinding = inflate;
        FrameLayout constraintLayout = inflate.getConstraintLayout();
        constraintLayout.setId(View.generateViewId());
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "apply(...)");
        this.itemImageView = constraintLayout;
        SmallBorderlessButtonView smallBorderlessButtonView = new SmallBorderlessButtonView(context, null, 0, 6, null);
        smallBorderlessButtonView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.setMarginStart(px4);
        bVar.setMarginEnd(px4);
        smallBorderlessButtonView.setLayoutParams(bVar);
        smallBorderlessButtonView.setGravity(8388627);
        smallBorderlessButtonView.setSingleLine(false);
        smallBorderlessButtonView.setMaxLines(2);
        smallBorderlessButtonView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        this.productLinkSmallBorderlessButtonView = smallBorderlessButtonView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.setMargins(((ViewGroup.MarginLayoutParams) bVar2).leftMargin, px, ((ViewGroup.MarginLayoutParams) bVar2).rightMargin, ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin);
        verticalAtomsLayout.setLayoutParams(bVar2);
        ViewExtKt.gone(verticalAtomsLayout);
        this.attributesVerticalAtomsLayout = verticalAtomsLayout;
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setId(View.generateViewId());
        singleAtom.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.priceSingleAtom = singleAtom;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.setMargins(((ViewGroup.MarginLayoutParams) bVar3).leftMargin, px2, ((ViewGroup.MarginLayoutParams) bVar3).rightMargin, ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin);
        textAtomView.setLayoutParams(bVar3);
        textAtomView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textSecondary));
        this.quantityTextAtomView = textAtomView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, -2);
        bVar4.setMargins(((ViewGroup.MarginLayoutParams) bVar4).leftMargin, px3, ((ViewGroup.MarginLayoutParams) bVar4).rightMargin, ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin);
        recyclerView.setLayoutParams(bVar4);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setNestedScrollingEnabled(false);
        ViewExtKt.gone(recyclerView);
        this.exemplarStatesRv = recyclerView;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.f(5);
        barrier.setReferencedIds(new int[]{textAtomView.getId(), singleAtom.getId()});
        this.quantityBarrier = barrier;
        Barrier barrier2 = new Barrier(context);
        barrier2.setId(View.generateViewId());
        barrier2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier2.f(3);
        barrier2.setReferencedIds(new int[]{textAtomView.getId(), constraintLayout.getId(), verticalAtomsLayout.getId()});
        this.productInfoBarrier = barrier2;
        addView(constraintLayout);
        addView(smallBorderlessButtonView);
        addView(verticalAtomsLayout);
        addView(singleAtom);
        addView(textAtomView);
        addView(barrier);
        addView(barrier2);
        addView(recyclerView);
        setupConstraints();
    }
}
