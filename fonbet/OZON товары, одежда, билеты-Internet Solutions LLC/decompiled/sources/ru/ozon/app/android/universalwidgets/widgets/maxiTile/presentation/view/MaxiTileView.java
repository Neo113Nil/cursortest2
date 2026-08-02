package ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.view;

import B90.C2618u;
import Bi.b;
import De.C2860c;
import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.labelList.presentation.view.LabelListView;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery.decoration.MaxiTileGalleryItemDecoration;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery.util.StartSnapHelper;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/view/MaxiTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "galleryRV", "Landroidx/recyclerview/widget/RecyclerView;", "getGalleryRV", "()Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Lru/ozon/app/android/product/labelList/presentation/view/LabelListView;", "labelListView", "Lru/ozon/app/android/product/labelList/presentation/view/LabelListView;", "getLabelListView", "()Lru/ozon/app/android/product/labelList/presentation/view/LabelListView;", "Landroidx/constraintlayout/widget/Barrier;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "getBarrier", "()Landroidx/constraintlayout/widget/Barrier;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "descriptionView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getDescriptionView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "detailsBtn", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getDetailsBtn", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "addToCartBtn", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "getAddToCartBtn", "()Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaxiTileView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int containerHorizontalMargin = Dimens.INSTANCE.getDP_8();

    @NotNull
    private final AddToCartButtonView addToCartBtn;

    @NotNull
    private final Barrier barrier;

    @NotNull
    private final TextAtomV2View descriptionView;

    @NotNull
    private final ButtonV3View detailsBtn;

    @NotNull
    private final RecyclerView galleryRV;

    @NotNull
    private final LabelListView labelListView;

    @NotNull
    private final PriceAtomView priceView;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/view/MaxiTileView$Companion;", "", "<init>", "()V", "containerHorizontalMargin", "", "getContainerHorizontalMargin", "()I", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getContainerHorizontalMargin() {
            return MaxiTileView.containerHorizontalMargin;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MaxiTileView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final AddToCartButtonView getAddToCartBtn() {
        return this.addToCartBtn;
    }

    @NotNull
    public final TextAtomV2View getDescriptionView() {
        return this.descriptionView;
    }

    @NotNull
    public final ButtonV3View getDetailsBtn() {
        return this.detailsBtn;
    }

    @NotNull
    public final RecyclerView getGalleryRV() {
        return this.galleryRV;
    }

    @NotNull
    public final LabelListView getLabelListView() {
        return this.labelListView;
    }

    @NotNull
    public final PriceAtomView getPriceView() {
        return this.priceView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxiTileView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.maxiTileGalleryRv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        recyclerView.setLayoutParams(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        new StartSnapHelper().attachToRecyclerView(recyclerView);
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new MaxiTileGalleryItemDecoration());
        addView(recyclerView);
        this.galleryRV = recyclerView;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.maxiTilePriceV, 0, -2);
        b11.f41656t = 0;
        b11.f41657u = R$id.maxiTileLabelListV;
        b11.f41638j = R$id.maxiTileGalleryRv;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) b11).topMargin = dimens.getDP_10();
        b11.f41605L = 2;
        b11.f41611R = 0.5f;
        b11.f41598E = 0.0f;
        priceAtomView.setLayoutParams(b11);
        priceAtomView.setPadding(dimens.getDP_12(), 0, 0, 0);
        addView(priceAtomView);
        this.priceView = priceAtomView;
        LabelListView labelListView = new LabelListView(context, null, 0, 6, null);
        labelListView.setId(R$id.maxiTileLabelListV);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41655s = R$id.maxiTilePriceV;
        bVar2.f41658v = 0;
        bVar2.f41638j = R$id.maxiTileGalleryRv;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = dimens.getDP_10();
        bVar2.setMarginEnd(dimens.getDP_12());
        bVar2.setMarginStart(dimens.getDP_4());
        labelListView.setLayoutParams(bVar2);
        labelListView.setGravity(8388613);
        addView(labelListView);
        this.labelListView = labelListView;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.f(3);
        barrier.setReferencedIds(new int[]{priceAtomView.getId(), labelListView.getId()});
        addView(barrier);
        this.barrier = barrier;
        int i12 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.maxiTileDescriptionV, 0, -2);
        d11.f41656t = 0;
        d11.f41658v = 0;
        d11.f41638j = barrier.getId();
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dimens.getDP_6();
        d11.setMarginStart(dimens.getDP_12());
        d11.setMarginEnd(dimens.getDP_12());
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setMovementMethod(null);
        addView(textAtomV2View);
        this.descriptionView = textAtomV2View;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, i12, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.maxiTileDetailsBtn, 0, -2);
        e11.f41656t = 0;
        e11.f41657u = R$id.maxiTileAddToCartBtn;
        e11.f41638j = R$id.maxiTileDescriptionV;
        e11.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) e11).topMargin = dimens.getDP_12();
        ((ViewGroup.MarginLayoutParams) e11).bottomMargin = dimens.getDP_12();
        e11.setMarginStart(dimens.getDP_12());
        e11.setMarginEnd(dimens.getDP_2());
        e11.f41599F = 0.0f;
        buttonV3View.setLayoutParams(e11);
        addView(buttonV3View);
        this.detailsBtn = buttonV3View;
        AddToCartButtonView addToCartButtonView = new AddToCartButtonView(context, null, i12, 6, null);
        addToCartButtonView.setId(R$id.maxiTileAddToCartBtn);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41655s = R$id.maxiTileDetailsBtn;
        bVar3.f41658v = 0;
        bVar3.f41638j = R$id.maxiTileDescriptionV;
        bVar3.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = dimens.getDP_12();
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = dimens.getDP_12();
        bVar3.setMarginStart(dimens.getDP_2());
        bVar3.f41594A = dimens.getDP_12();
        bVar3.setMarginEnd(dimens.getDP_12());
        addToCartButtonView.setLayoutParams(bVar3);
        addView(addToCartButtonView);
        this.addToCartBtn = addToCartButtonView;
        setId(R$id.maxiTileContainerCl);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-1, -2);
        int i13 = containerHorizontalMargin;
        bVar4.setMarginStart(i13);
        bVar4.setMarginEnd(i13);
        ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = dimens.getDP_12();
        setLayoutParams(bVar4);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.view.MaxiTileView.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), Dimens.INSTANCE.getDPF_24());
            }
        });
        setClipToOutline(true);
    }
}
