package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.atomElement.AtomElementVH;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.cellElement.CellElementVH;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.formBuilder.FormBuilderVH;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.logosCarousel.LogosCarouselSplitVH;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.productBlock.ProductBlockVH;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.productBlock.ProductBlockView;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.progressiveText.ProgressiveTextVH;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.separators.SeparatorVH;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.separators.VerticalSpacerVH;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.tagList.TagItemDecoration;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.tagList.TagListVH;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListVH;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListView;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveTextView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002)*Bq\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f\u0012\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R(\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/composer/ui/widget/k;", "viewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/utils/AppType;", "appType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "onSearchClicked", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "", "onShowTooltip", "<init>", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/utils/AppType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/utils/AppType;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Companion", "ElementType", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitDynamicElementsAdapter extends t<SplitDynamicElementVO, RecyclerView.C> {

    @NotNull
    private final AppType appType;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    @NotNull
    private final Function1<AtomAction, Unit> onAtomAction;

    @NotNull
    private final Function1<YandexSearchSheetFragment.Data, Unit> onSearchClicked;
    private final Function2<DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip, Integer, Unit> onShowTooltip;

    @NotNull
    private final k<?> viewHolder;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp1 = ResourceExtKt.toPx(1);
    private static final int dp8 = ResourceExtKt.toPx(Paddings.PADDING_300.getPx());
    private static final int dp16 = ResourceExtKt.toPx(Paddings.PADDING_500.getPx());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/SplitDynamicElementsAdapter$ElementType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "SELECTOR", "FORM", "ATOM", "VERTICAL_SPACER", "SEPARATOR", "CELL", "PRODUCTS_BLOCK", "PROGRESSIVE_TEXT", "CHECKOUT_CELL_LIST", "TAG_LIST", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ElementType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ElementType[] $VALUES;
        private final int id;
        public static final ElementType SELECTOR = new ElementType("SELECTOR", 0, R$id.splitDynamicElementSelector);
        public static final ElementType FORM = new ElementType("FORM", 1, R$id.splitDynamicElementForm);
        public static final ElementType ATOM = new ElementType("ATOM", 2, R$id.splitDynamicELementAtom);
        public static final ElementType VERTICAL_SPACER = new ElementType("VERTICAL_SPACER", 3, R$id.splitDynamicElementVerticalSpacer);
        public static final ElementType SEPARATOR = new ElementType("SEPARATOR", 4, R$id.splitDynamicElementSeparator);
        public static final ElementType CELL = new ElementType("CELL", 5, R$id.splitDynamicElementCell);
        public static final ElementType PRODUCTS_BLOCK = new ElementType("PRODUCTS_BLOCK", 6, R$id.splitDynamicElementProductsBlock);
        public static final ElementType PROGRESSIVE_TEXT = new ElementType("PROGRESSIVE_TEXT", 7, R$id.splitDynamicElementProgressiveText);
        public static final ElementType CHECKOUT_CELL_LIST = new ElementType("CHECKOUT_CELL_LIST", 8, R$id.splitDynamicElementCheckoutCellList);
        public static final ElementType TAG_LIST = new ElementType("TAG_LIST", 9, R$id.splitDynamicElementTagList);

        private static final /* synthetic */ ElementType[] $values() {
            return new ElementType[]{SELECTOR, FORM, ATOM, VERTICAL_SPACER, SEPARATOR, CELL, PRODUCTS_BLOCK, PROGRESSIVE_TEXT, CHECKOUT_CELL_LIST, TAG_LIST};
        }

        static {
            ElementType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ElementType(String str, int i11, int i12) {
            this.id = i12;
        }

        public static ElementType valueOf(String str) {
            return (ElementType) Enum.valueOf(ElementType.class, str);
        }

        public static ElementType[] values() {
            return (ElementType[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    public /* synthetic */ SplitDynamicElementsAdapter(k kVar, ComposerReferences composerReferences, HandlersInhibitor handlersInhibitor, AppType appType, Function1 function1, Function1 function12, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, composerReferences, handlersInhibitor, appType, function1, function12, (i11 & 64) != 0 ? null : function2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getElementType().getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SplitDynamicElementVO item = getItem(position);
        if (holder instanceof LogosCarouselSplitVH) {
            if (item instanceof SplitDynamicElementVO.LogosCarousel) {
                ((LogosCarouselSplitVH) holder).bind((SplitDynamicElementVO.LogosCarousel) item);
                return;
            }
            return;
        }
        if (holder instanceof AtomElementVH) {
            if (item instanceof SplitDynamicElementVO.AtomElement) {
                ((AtomElementVH) holder).bind((SplitDynamicElementVO.AtomElement) item);
                return;
            }
            return;
        }
        if (holder instanceof CellElementVH) {
            if (item instanceof SplitDynamicElementVO.AtomElement) {
                ((CellElementVH) holder).bind((SplitDynamicElementVO.AtomElement) item);
                return;
            }
            return;
        }
        if (holder instanceof FormBuilderVH) {
            if (item instanceof SplitDynamicElementVO.Form) {
                ((FormBuilderVH) holder).bind((SplitDynamicElementVO.Form) item);
                return;
            }
            return;
        }
        if (holder instanceof VerticalSpacerVH) {
            if (item instanceof SplitDynamicElementVO.VerticalSpacer) {
                ((VerticalSpacerVH) holder).bind((SplitDynamicElementVO.VerticalSpacer) item);
                return;
            }
            return;
        }
        if (holder instanceof SeparatorVH) {
            if (item instanceof SplitDynamicElementVO.Separator) {
                ((SeparatorVH) holder).bind((SplitDynamicElementVO.Separator) item);
                return;
            }
            return;
        }
        if (holder instanceof ProgressiveTextVH) {
            if (item instanceof SplitDynamicElementVO.ProgressiveTextElement) {
                ((ProgressiveTextVH) holder).bind((SplitDynamicElementVO.ProgressiveTextElement) item);
            }
        } else if (holder instanceof ProductBlockVH) {
            if (item instanceof SplitDynamicElementVO.ProductsBlock) {
                ((ProductBlockVH) holder).bind((SplitDynamicElementVO.ProductsBlock) item);
            }
        } else if (holder instanceof CheckoutCellListVH) {
            if (item instanceof SplitDynamicElementVO.CheckoutCellListElement) {
                ((CheckoutCellListVH) holder).bind(((SplitDynamicElementVO.CheckoutCellListElement) item).getCheckoutCellList());
            }
        } else if ((holder instanceof TagListVH) && (item instanceof SplitDynamicElementVO.TagListElement)) {
            ((TagListVH) holder).bind((SplitDynamicElementVO.TagListElement) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ElementType.SELECTOR.getId()) {
            RecyclerView recyclerView = new RecyclerView(parent.getContext());
            recyclerView.setId(R$id.carouselRV);
            recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            recyclerView.setNestedScrollingEnabled(false);
            return new LogosCarouselSplitVH(recyclerView, this.onAtomAction, this.appType);
        }
        if (viewType == ElementType.FORM.getId()) {
            FormBuilderHelper.Handling handling = new FormBuilderHelper.Handling(this.viewHolder.getContext(), this.viewHolder, this.composerReferences, this.handlersInhibitor, this.onSearchClicked);
            RecyclerView recyclerView2 = new RecyclerView(parent.getContext());
            recyclerView2.setId(R$id.formsRV);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            int i11 = dp16;
            marginLayoutParams.setMargins(i11, marginLayoutParams.topMargin, i11, marginLayoutParams.bottomMargin);
            recyclerView2.setLayoutParams(marginLayoutParams);
            recyclerView2.setNestedScrollingEnabled(false);
            return new FormBuilderVH(recyclerView2, new FormConfig(FormConfig.Mode.BORDERLESS_GRAY_FIELD), new SplitDynamicElementsAdapter$onCreateViewHolder$3(handling), new SplitDynamicElementsAdapter$onCreateViewHolder$4(handling));
        }
        if (viewType == ElementType.ATOM.getId()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
            singleAtom.setId(R$id.atomSAL);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            int i12 = dp16;
            marginLayoutParams2.setMargins(i12, marginLayoutParams2.topMargin, i12, marginLayoutParams2.bottomMargin);
            singleAtom.setLayoutParams(marginLayoutParams2);
            return new AtomElementVH(singleAtom, this.onAtomAction);
        }
        if (viewType == ElementType.CELL.getId()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            SingleAtom singleAtom2 = new SingleAtom(context2, null, 0, 0, 14, null);
            singleAtom2.setId(R$id.atomSAL);
            singleAtom2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new CellElementVH(singleAtom2, this.onAtomAction);
        }
        if (viewType == ElementType.VERTICAL_SPACER.getId()) {
            View view = new View(parent.getContext());
            view.setId(R$id.spacerFl);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            return new VerticalSpacerVH(view);
        }
        if (viewType == ElementType.SEPARATOR.getId()) {
            View view2 = new View(parent.getContext());
            view2.setId(R$id.separatorFl);
            view2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, dp1));
            return new SeparatorVH(view2);
        }
        if (viewType == ElementType.PROGRESSIVE_TEXT.getId()) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ProgressiveTextView progressiveTextView = new ProgressiveTextView(context3, null, 0, 6, null);
            progressiveTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new ProgressiveTextVH(progressiveTextView, this.onAtomAction);
        }
        if (viewType == ElementType.PRODUCTS_BLOCK.getId()) {
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            ProductBlockView productBlockView = new ProductBlockView(context4, null, 0, 0, 14, null);
            productBlockView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new ProductBlockVH(productBlockView, this.onAtomAction, this.onShowTooltip);
        }
        if (viewType == ElementType.CHECKOUT_CELL_LIST.getId()) {
            Context context5 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            CheckoutCellListView checkoutCellListView = new CheckoutCellListView(context5, null, 0, false, 14, null);
            checkoutCellListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new CheckoutCellListVH(checkoutCellListView, this.onAtomAction);
        }
        if (viewType != ElementType.TAG_LIST.getId()) {
            throw new IllegalArgumentException("Unknown view type");
        }
        RecyclerView recyclerView3 = new RecyclerView(parent.getContext());
        recyclerView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView3.setNestedScrollingEnabled(false);
        recyclerView3.setLayoutManager(new LinearLayoutManager(parent.getContext(), 0, false));
        recyclerView3.setItemAnimator(null);
        recyclerView3.setClipToPadding(false);
        int i13 = dp16;
        int i14 = dp8;
        recyclerView3.setPadding(i13, i14, i13, i14);
        recyclerView3.addItemDecoration(new TagItemDecoration());
        return new TagListVH(recyclerView3, this.composerReferences, this.onAtomAction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SplitDynamicElementsAdapter(@NotNull k<?> viewHolder, @NotNull ComposerReferences composerReferences, @NotNull HandlersInhibitor handlersInhibitor, @NotNull AppType appType, @NotNull Function1<? super AtomAction, Unit> onAtomAction, @NotNull Function1<? super YandexSearchSheetFragment.Data, Unit> onSearchClicked, Function2<? super DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip, ? super Integer, Unit> function2) {
        super(new DynamicElementsItemCallback());
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        Intrinsics.checkNotNullParameter(onSearchClicked, "onSearchClicked");
        this.viewHolder = viewHolder;
        this.composerReferences = composerReferences;
        this.handlersInhibitor = handlersInhibitor;
        this.appType = appType;
        this.onAtomAction = onAtomAction;
        this.onSearchClicked = onSearchClicked;
        this.onShowTooltip = function2;
    }
}
