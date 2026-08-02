package ru.ozon.app.android.common.navigationblocks.presentation.rv;

import GD.a;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.navigationblocks.presentation.NavigationBlock;
import ru.ozon.app.android.common.ui.naviblocks.databinding.WidgetNavigationBlocksV2ItemBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/common/navigationblocks/presentation/rv/BlocksViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlock;", "block", "bind", "(Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlock;)V", "LWZ/l;", "Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlock;", "Lru/ozon/app/android/common/ui/naviblocks/databinding/WidgetNavigationBlocksV2ItemBinding;", "binding", "Lru/ozon/app/android/common/ui/naviblocks/databinding/WidgetNavigationBlocksV2ItemBinding;", "Landroid/graphics/drawable/GradientDrawable;", "background", "Landroid/graphics/drawable/GradientDrawable;", "navigation-blocks_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BlocksViewHolder extends j {

    @NotNull
    private final GradientDrawable background;

    @NotNull
    private final WidgetNavigationBlocksV2ItemBinding binding;
    private NavigationBlock block;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlocksViewHolder(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetNavigationBlocksV2ItemBinding bind = WidgetNavigationBlocksV2ItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(12));
        this.background = gradientDrawable;
        containerView.setOnClickListener(new a(1, this, actionHandler));
        containerView.setBackground(gradientDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(BlocksViewHolder blocksViewHolder, Function1 function1, View view) {
        AtomAction action;
        NavigationBlock navigationBlock = blocksViewHolder.block;
        if (navigationBlock == null || (action = navigationBlock.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    public final void bind(@NotNull NavigationBlock block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
        this.binding.tvTitle.setText(block.getTitle());
        this.binding.tvSubtitle.setText(block.getSubtitle());
        AppCompatImageView ivIcon = this.binding.ivIcon;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        ImageViewExtKt.load$default(ivIcon, block.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        AppCompatImageView ivIcon2 = this.binding.ivIcon;
        Intrinsics.checkNotNullExpressionValue(ivIcon2, "ivIcon");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(ivIcon2, styleParser.parseColor(context, block.getIcon().getTintColor()));
        GradientDrawable gradientDrawable = this.background;
        Context context2 = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context2, block.getBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_TETRIARY));
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        NavigationBlock navigationBlock = this.block;
        if (navigationBlock == null || (tokenizedEvent = navigationBlock.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
