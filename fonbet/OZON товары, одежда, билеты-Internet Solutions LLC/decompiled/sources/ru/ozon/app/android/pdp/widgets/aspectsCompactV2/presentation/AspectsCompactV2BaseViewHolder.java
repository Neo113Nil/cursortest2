package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation;

import A00.a;
import WZ.t;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import i10.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.AspectsDecorFactory;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005*\u0001-\b\u0001\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\"\b\u0002\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010#\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2BaseViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "Landroidx/recyclerview/widget/RecyclerView;", "variantsRv", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsAdapter;", "variantsAdapter", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory$AspectMode;", "aspectMode", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "LX4/a;", "aspectValueHolder", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsAdapter;Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory$AspectMode;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "", "addTopPadding", "", "updateTopPadding", "(Z)V", "", "variants", "setVariants", "(Ljava/util/List;)V", "scrollToSelected", "()V", "onAttach", "onDetach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;Ll20/d;)V", "onRecycle", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory;", "aspectsDecorFactory", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory;", "aspectsVO", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "ru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2BaseViewHolder$adapterDataObserver$1", "adapterDataObserver", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2BaseViewHolder$adapterDataObserver$1;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsCompactV2BaseViewHolder extends k<AspectsCompactV2VO> {

    @NotNull
    private final AspectsCompactV2BaseViewHolder$adapterDataObserver$1 adapterDataObserver;

    @NotNull
    private final AspectsDecorFactory aspectsDecorFactory;
    private AspectsCompactV2VO aspectsVO;

    @NotNull
    private final VariantsAdapter variantsAdapter;

    @NotNull
    private final RecyclerView variantsRv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "variant", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2BaseViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AspectsCompactVO$Variant, Unit> {
        final /* synthetic */ ComposerReferences $ref;
        final /* synthetic */ AspectsCompactV2BaseViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposerReferences composerReferences, AspectsCompactV2BaseViewHolder aspectsCompactV2BaseViewHolder) {
            super(1);
            this.$ref = composerReferences;
            this.this$0 = aspectsCompactV2BaseViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AspectsCompactVO$Variant aspectsCompactVO$Variant) {
            invoke2(aspectsCompactVO$Variant);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AspectsCompactVO$Variant variant) {
            h.b bVar;
            Intrinsics.checkNotNullParameter(variant, "variant");
            if (variant.getIsSelected()) {
                return;
            }
            InterfaceC7851b controller = this.$ref.getController();
            String refreshDeeplink = variant.getRefreshDeeplink();
            AspectsCompactV2VO aspectsCompactV2VO = this.this$0.aspectsVO;
            if (aspectsCompactV2VO != null) {
                int intValue = aspectsCompactV2VO.getScrollWidgetKey().intValue();
                AspectsCompactV2BaseViewHolder aspectsCompactV2BaseViewHolder = this.this$0;
                AspectsCompactV2VO boundedData = aspectsCompactV2BaseViewHolder.getBoundedData();
                bVar = new h.b((boundedData == null || !boundedData.getShouldRefreshToTop()) ? new a.C.d(intValue, ((int) aspectsCompactV2BaseViewHolder.variantsRv.getY()) - Dimens.INSTANCE.getDP_12(), 20, false) : new a.C.C0000a(0, false), null, 2);
            } else {
                bVar = null;
            }
            InterfaceC7851b.a.a(controller, refreshDeeplink, null, null, bVar, 6);
            t tokenizedEvent = variant.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.$ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2BaseViewHolder$Companion;", "", "<init>", "()V", "COUNT_ITERATION_LOAD_NEXT_PAGE_WITH_COMPOSER_SCROLL", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AspectsCompactV2BaseViewHolder(RecyclerView recyclerView, VariantsAdapter variantsAdapter, AspectsDecorFactory.AspectMode aspectMode, ComposerReferences composerReferences, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, variantsAdapter, aspectMode, composerReferences, (i11 & 16) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToSelected() {
        List<AspectsCompactVO$Variant> currentList = this.variantsAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<AspectsCompactVO$Variant> it = currentList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getIsSelected()) {
                break;
            } else {
                i11++;
            }
        }
        this.variantsRv.scrollToPosition(i11);
    }

    private final void setVariants(List<? extends AspectsCompactVO$Variant> variants) {
        List<? extends AspectsCompactVO$Variant> list = variants;
        if (list == null || list.isEmpty()) {
            ViewExtKt.gone(this.variantsRv);
            return;
        }
        this.aspectsDecorFactory.adjustPadding(this.variantsRv, variants);
        boolean z11 = this.variantsAdapter.getShimmersCount() == 0;
        this.variantsAdapter.submitList(variants);
        if (z11) {
            scrollToSelected();
            ViewExtKt.show(this.variantsRv);
        }
    }

    private final void updateTopPadding(boolean addTopPadding) {
        RecyclerView recyclerView = this.variantsRv;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.topMargin;
        int i13 = marginLayoutParams.rightMargin;
        int i14 = marginLayoutParams.bottomMargin;
        marginLayoutParams.topMargin = addTopPadding ? Dimens.INSTANCE.getDP_12() : Dimens.INSTANCE.getDP_8();
        if (i11 == marginLayoutParams.leftMargin) {
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = recyclerView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        recyclerView.setLayoutParams(marginLayoutParams);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.variantsAdapter.registerAdapterDataObserver(this.adapterDataObserver);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.variantsAdapter.unregisterAdapterDataObserver(this.adapterDataObserver);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.aspectsVO = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2BaseViewHolder$adapterDataObserver$1] */
    public AspectsCompactV2BaseViewHolder(@NotNull RecyclerView variantsRv, @NotNull VariantsAdapter variantsAdapter, @NotNull AspectsDecorFactory.AspectMode aspectMode, @NotNull ComposerReferences ref, Function1<? super ViewGroup, ? extends VariantsViewHolder<AspectsCompactVO$Variant, ? extends X4.a>> function1) {
        super(variantsRv);
        Intrinsics.checkNotNullParameter(variantsRv, "variantsRv");
        Intrinsics.checkNotNullParameter(variantsAdapter, "variantsAdapter");
        Intrinsics.checkNotNullParameter(aspectMode, "aspectMode");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.variantsRv = variantsRv;
        this.variantsAdapter = variantsAdapter;
        AspectsDecorFactory aspectsDecorFactory = new AspectsDecorFactory(getContext(), aspectMode);
        this.aspectsDecorFactory = aspectsDecorFactory;
        this.adapterDataObserver = new RecyclerView.i() { // from class: ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2BaseViewHolder$adapterDataObserver$1
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeInserted(int positionStart, int itemCount) {
                AspectsCompactV2BaseViewHolder.this.scrollToSelected();
            }
        };
        variantsAdapter.setOnVariantClick(new AnonymousClass1(ref, this));
        variantsAdapter.setVariantsHolder(function1);
        variantsRv.setAdapter(variantsAdapter);
        variantsRv.setItemAnimator(null);
        variantsRv.setLayoutManager(aspectsDecorFactory.getLayoutManager());
        variantsRv.setNestedScrollingEnabled(aspectMode == AspectsDecorFactory.AspectMode.HORIZONTAL);
        variantsRv.addItemDecoration(aspectsDecorFactory.getItemDecoration());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AspectsCompactV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.aspectsVO = item;
        updateTopPadding(item.getAddTopMargin());
        setVariants(item.getVariants());
    }
}
