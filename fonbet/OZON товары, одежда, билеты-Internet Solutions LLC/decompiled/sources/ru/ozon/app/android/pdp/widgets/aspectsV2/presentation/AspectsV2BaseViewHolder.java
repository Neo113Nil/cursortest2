package ru.ozon.app.android.pdp.widgets.aspectsV2.presentation;

import WZ.t;
import X4.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.WidgetAspectsV2LayoutBinding;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.AspectsDecorFactory;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonWithIconView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonWithIconHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004*\u00018\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\"\b\u0002\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00162\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\u001aJ\u001f\u0010%\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00160\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectsV2BaseViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "Lru/ozon/app/android/pdp/databinding/WidgetAspectsV2LayoutBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsAdapter;", "variantsAdapter", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory$AspectMode;", "aspectMode", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "LX4/a;", "aspectValueHolder", "<init>", "(Landroid/view/View;Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsAdapter;Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory$AspectMode;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "setText", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "initializedAdapter", "()V", "", "variants", "setVariants", "(Ljava/util/List;)V", "scrollToSelected", "onAttach", "onDetach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;Ll20/d;)V", "onRecycle", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory$AspectMode;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory;", "aspectsDecorFactory", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory;", "aspectsVO", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "isInitializedAdapter", "Z", "ru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectsV2BaseViewHolder$adapterDataObserver$1", "adapterDataObserver", "Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectsV2BaseViewHolder$adapterDataObserver$1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV2BaseViewHolder extends BindingWidgetViewHolder<AspectsCompactV2VO, WidgetAspectsV2LayoutBinding> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AspectsV2BaseViewHolder$adapterDataObserver$1 adapterDataObserver;

    @NotNull
    private final AspectsDecorFactory.AspectMode aspectMode;

    @NotNull
    private final AspectsDecorFactory aspectsDecorFactory;
    private AspectsCompactV2VO aspectsVO;

    @NotNull
    private final View containerView;
    private boolean isInitializedAdapter;

    @NotNull
    private final VariantsAdapter variantsAdapter;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectsV2BaseViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetAspectsV2LayoutBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetAspectsV2LayoutBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/WidgetAspectsV2LayoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetAspectsV2LayoutBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetAspectsV2LayoutBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "variant", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectsV2BaseViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AspectsCompactVO$Variant, Unit> {
        final /* synthetic */ ComposerReferences $ref;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ComposerReferences composerReferences) {
            super(1);
            this.$ref = composerReferences;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AspectsCompactVO$Variant aspectsCompactVO$Variant) {
            invoke2(aspectsCompactVO$Variant);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AspectsCompactVO$Variant variant) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            if (variant.getIsSelected()) {
                return;
            }
            InterfaceC7851b.a.a(this.$ref.getController(), variant.getRefreshDeeplink(), null, null, null, 14);
            t tokenizedEvent = variant.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.$ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }

    public /* synthetic */ AspectsV2BaseViewHolder(View view, VariantsAdapter variantsAdapter, AspectsDecorFactory.AspectMode aspectMode, ComposerReferences composerReferences, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, variantsAdapter, aspectMode, composerReferences, (i11 & 16) != 0 ? null : function1);
    }

    private final void initializedAdapter() {
        if (this.isInitializedAdapter) {
            return;
        }
        RecyclerView recyclerView = getBinding().variantsRv;
        if (this.aspectMode == AspectsDecorFactory.AspectMode.FLEXBOX) {
            Intrinsics.f(recyclerView);
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Dimens dimens = Dimens.INSTANCE;
            marginLayoutParams.leftMargin = dimens.getDP_16();
            marginLayoutParams.rightMargin = dimens.getDP_8();
            recyclerView.setLayoutParams(marginLayoutParams);
        }
        recyclerView.setAdapter(this.variantsAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(this.aspectsDecorFactory.getLayoutManager());
        recyclerView.setNestedScrollingEnabled(this.aspectMode == AspectsDecorFactory.AspectMode.HORIZONTAL);
        recyclerView.addItemDecoration(this.aspectsDecorFactory.getItemDecoration());
        this.isInitializedAdapter = true;
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
        getBinding().variantsRv.scrollToPosition(i11);
    }

    private final void setText(TextDTO title) {
        TextAtomV2View titleTv = getBinding().titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextHolderKt.bindOrGone$default(titleTv, title, null, 2, null);
    }

    private final void setVariants(List<? extends AspectsCompactVO$Variant> variants) {
        binding(new AspectsV2BaseViewHolder$setVariants$1(variants, this));
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
    /* JADX WARN: Type inference failed for: r2v4, types: [ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectsV2BaseViewHolder$adapterDataObserver$1] */
    public AspectsV2BaseViewHolder(@NotNull View containerView, @NotNull VariantsAdapter variantsAdapter, @NotNull AspectsDecorFactory.AspectMode aspectMode, @NotNull ComposerReferences ref, Function1<? super ViewGroup, ? extends VariantsViewHolder<AspectsCompactVO$Variant, ? extends a>> function1) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(variantsAdapter, "variantsAdapter");
        Intrinsics.checkNotNullParameter(aspectMode, "aspectMode");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.containerView = containerView;
        this.variantsAdapter = variantsAdapter;
        this.aspectMode = aspectMode;
        this.aspectsDecorFactory = new AspectsDecorFactory(getContext(), aspectMode);
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        this.adapterDataObserver = new RecyclerView.i() { // from class: ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectsV2BaseViewHolder$adapterDataObserver$1
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeInserted(int positionStart, int itemCount) {
                AspectsV2BaseViewHolder.this.scrollToSelected();
            }
        };
        variantsAdapter.setOnVariantClick(new AnonymousClass2(ref));
        variantsAdapter.setVariantsHolder(function1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AspectsCompactV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.aspectsVO = item;
        WidgetAspectsV2LayoutBinding binding = getBinding();
        setText(item.getTitle());
        setVariants(item.getVariants());
        SmallBorderlessButtonWithIconView additionalBtn = binding.additionalBtn;
        Intrinsics.checkNotNullExpressionValue(additionalBtn, "additionalBtn");
        WrappedBorderlessButtonWithIconHolderKt.bindOrGone(additionalBtn, item.getAdditionalButton(), this.actionHandler);
        ButtonV3View additionalBtnWithoutIcon = binding.additionalBtnWithoutIcon;
        Intrinsics.checkNotNullExpressionValue(additionalBtnWithoutIcon, "additionalBtnWithoutIcon");
        ButtonV3HolderKt.bindOrGone(additionalBtnWithoutIcon, item.getAdditionalButtonAtom(), this.actionHandler);
        initializedAdapter();
    }
}
