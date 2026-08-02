package ru.ozon.app.android.pdp.widgets.sellerPoints.presentation;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.PdpLayoutSellerPointsLabelsBlockBinding;
import ru.ozon.app.android.pdp.databinding.PdpWidgetSellerPointsBinding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.widgets.sellerPoints.presentation.SellerPointsVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindInternal", "(Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO;)V", "Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Size;", "size", "", "getWidgetHeight", "(Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Size;)I", "Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;", "blockVo", "Lru/ozon/app/android/pdp/databinding/PdpLayoutSellerPointsLabelsBlockBinding;", "blockBinding", "bindBlock", "(Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;Lru/ozon/app/android/pdp/databinding/PdpLayoutSellerPointsLabelsBlockBinding;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerPointsBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerPointsBinding;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerPointsViewHolder extends k<SellerPointsVO> {

    @NotNull
    private final PdpWidgetSellerPointsBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SellerPointsVO.Size.values().length];
            try {
                iArr[SellerPointsVO.Size.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SellerPointsVO.Size.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerPointsViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
        PdpWidgetSellerPointsBinding bind = PdpWidgetSellerPointsBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void bindBlock(SellerPointsVO.Block blockVo, PdpLayoutSellerPointsLabelsBlockBinding blockBinding) {
        int i11;
        TextAtomV2View sellerPointsBlockTitleTav = blockBinding.sellerPointsBlockTitleTav;
        Intrinsics.checkNotNullExpressionValue(sellerPointsBlockTitleTav, "sellerPointsBlockTitleTav");
        TextHolderKt.bindOrGone$default(sellerPointsBlockTitleTav, blockVo.getTitle(), null, 2, null);
        TextAtomV2View sellerPointsBlockSubtitleTav = blockBinding.sellerPointsBlockSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(sellerPointsBlockSubtitleTav, "sellerPointsBlockSubtitleTav");
        TextHolderKt.bindOrGone$default(sellerPointsBlockSubtitleTav, blockVo.getSubtitle(), null, 2, null);
        LinearLayout constraintLayout = blockBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.setBackgroundTint(constraintLayout, ContextExtKt.parseColor(getContext(), blockVo.getBackgroundColor()));
        TextAtomV2View sellerPointsBlockSubtitleTav2 = blockBinding.sellerPointsBlockSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(sellerPointsBlockSubtitleTav2, "sellerPointsBlockSubtitleTav");
        ViewGroup.LayoutParams layoutParams = sellerPointsBlockSubtitleTav2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        i11 = SellerPointsViewHolderKt.SUBTITLE_INTERSECTION_HEIGHT_PX;
        Integer valueOf = Integer.valueOf(-i11);
        TextAtomV2View sellerPointsBlockTitleTav2 = blockBinding.sellerPointsBlockTitleTav;
        Intrinsics.checkNotNullExpressionValue(sellerPointsBlockTitleTav2, "sellerPointsBlockTitleTav");
        Integer num = ViewExtKt.isVisible(sellerPointsBlockTitleTav2) ? valueOf : null;
        marginLayoutParams.topMargin = num != null ? num.intValue() : 0;
        sellerPointsBlockSubtitleTav2.setLayoutParams(marginLayoutParams);
    }

    private final void bindInternal(SellerPointsVO item) {
        PdpWidgetSellerPointsBinding pdpWidgetSellerPointsBinding = this.binding;
        LinearLayout linearLayout = pdpWidgetSellerPointsBinding.sellerPointsRootCl;
        Intrinsics.f(linearLayout);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = getWidgetHeight(item.getSize());
        linearLayout.setLayoutParams(layoutParams);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        linearLayout.setBackgroundColor(ContextExtKt.parseColor(context, item.getBackgroundColor()));
        SellerPointsVO.Block firstBlock = item.getFirstBlock();
        PdpLayoutSellerPointsLabelsBlockBinding firstBlockInclude = pdpWidgetSellerPointsBinding.firstBlockInclude;
        Intrinsics.checkNotNullExpressionValue(firstBlockInclude, "firstBlockInclude");
        bindBlock(firstBlock, firstBlockInclude);
        SellerPointsVO.Block secondBlock = item.getSecondBlock();
        if (secondBlock != null) {
            PdpLayoutSellerPointsLabelsBlockBinding secondBlockInclude = pdpWidgetSellerPointsBinding.secondBlockInclude;
            Intrinsics.checkNotNullExpressionValue(secondBlockInclude, "secondBlockInclude");
            bindBlock(secondBlock, secondBlockInclude);
        }
        LinearLayout sellerPointsBlockRoot = pdpWidgetSellerPointsBinding.secondBlockInclude.sellerPointsBlockRoot;
        Intrinsics.checkNotNullExpressionValue(sellerPointsBlockRoot, "sellerPointsBlockRoot");
        sellerPointsBlockRoot.setVisibility(item.getSecondBlock() != null ? 0 : 8);
    }

    private final int getWidgetHeight(SellerPointsVO.Size size) {
        int i11;
        int i12;
        int i13 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        if (i13 == 1) {
            i11 = SellerPointsViewHolderKt.WIDGET_HEIGHT_SMALL_PX;
            return i11;
        }
        if (i13 != 2) {
            throw new o();
        }
        i12 = SellerPointsViewHolderKt.WIDGET_HEIGHT_REGULAR_PX;
        return i12;
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerPointsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindInternal(item);
        TokenizedAnalyticsExtKt.processViewEvents(this.refs.getTokenizedAnalytics(), item.getTokenizedEvent());
    }
}
