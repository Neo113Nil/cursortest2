package ru.ozon.app.android.pdp.widgets.aspectsV2.presentation;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsV2LayoutFlexBinding;
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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectsV2FlexViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsV2LayoutFlexBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "setText", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "variants", "setVariants", "(Ljava/util/List;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;Ll20/d;)V", "onRecycle", "()V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "getRef", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "aspectsVO", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexAdapter;", "adapter", "Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV2FlexViewHolder extends BindingWidgetViewHolder<AspectsCompactV2VO, WidgetAspectsV2LayoutFlexBinding> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AspectV2FlexAdapter adapter;
    private AspectsCompactV2VO aspectsVO;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences ref;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectsV2FlexViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetAspectsV2LayoutFlexBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetAspectsV2LayoutFlexBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsV2LayoutFlexBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetAspectsV2LayoutFlexBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetAspectsV2LayoutFlexBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV2FlexViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.containerView = containerView;
        this.ref = ref;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        AspectV2FlexAdapter aspectV2FlexAdapter = new AspectV2FlexAdapter(ref);
        this.adapter = aspectV2FlexAdapter;
        getBinding().variantsFl.setAdapter(aspectV2FlexAdapter);
        getBinding().variantsFl.setAnimation(null);
        getBinding().variantsFl.setItemAnimator(null);
        RecyclerView recyclerView = getBinding().variantsFl;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        recyclerView.setLayoutManager(flexboxLayoutManager);
    }

    private final void setText(TextDTO title) {
        TextAtomV2View titleTv = getBinding().titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextHolderKt.bindOrGone$default(titleTv, title, null, 2, null);
    }

    private final void setVariants(List<? extends AspectsCompactVO$Variant> variants) {
        binding(new AspectsV2FlexViewHolder$setVariants$1(variants, this));
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.aspectsVO = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AspectsCompactV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAspectsV2LayoutFlexBinding binding = getBinding();
        SmallBorderlessButtonWithIconView additionalBtn = binding.additionalBtn;
        Intrinsics.checkNotNullExpressionValue(additionalBtn, "additionalBtn");
        WrappedBorderlessButtonWithIconHolderKt.bindOrGone(additionalBtn, item.getAdditionalButton(), this.actionHandler);
        ButtonV3View additionalBtnWithoutIcon = binding.additionalBtnWithoutIcon;
        Intrinsics.checkNotNullExpressionValue(additionalBtnWithoutIcon, "additionalBtnWithoutIcon");
        ButtonV3HolderKt.bindOrGone(additionalBtnWithoutIcon, item.getAdditionalButtonAtom(), this.actionHandler);
        this.aspectsVO = item;
        setText(item.getTitle());
        setVariants(item.getVariants());
    }
}
