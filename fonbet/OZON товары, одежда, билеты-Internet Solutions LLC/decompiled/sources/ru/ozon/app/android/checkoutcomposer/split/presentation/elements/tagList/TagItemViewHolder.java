package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipHelper;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList.TagListVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002 #\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO$TooltipVO;", "tooltip", "showTooltipIfNeeded", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO$TooltipVO;)V", "subscribeToDismissEvents", "()V", "dismissTooltip", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO;)V", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "tooltipHelper", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "ru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagItemViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagItemViewHolder$lifecycleObserver$1;", "ru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagItemViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagItemViewHolder$scrollListener$1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "showTooltipRunnable", "Ljava/lang/Runnable;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagItemViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Handler handler;

    @NotNull
    private final TagItemViewHolder$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TagItemViewHolder$scrollListener$1 scrollListener;
    private Runnable showTooltipRunnable;

    @NotNull
    private final CartTooltipHelper tooltipHelper;

    @NotNull
    private final TagButtonView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagItemViewHolder$Companion;", "", "<init>", "()V", "DEFAULT_TOOLTIP_DISMISS_TIMEOUT", "", "DEFAULT_TOOLTIP_SHOW_DELAY", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.I, ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList.TagItemViewHolder$lifecycleObserver$1] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList.TagItemViewHolder$scrollListener$1] */
    public TagItemViewHolder(@NotNull TagButtonView view, @NotNull ComposerReferences references, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(view);
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view = view;
        this.references = references;
        this.actionHandler = actionHandler;
        this.tooltipHelper = new CartTooltipHelper(references.getContainer().j());
        this.handler = new Handler(Looper.getMainLooper());
        ?? r22 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList.TagItemViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Handler handler;
                Intrinsics.checkNotNullParameter(owner, "owner");
                handler = TagItemViewHolder.this.handler;
                handler.removeCallbacksAndMessages(null);
                TagItemViewHolder.this.showTooltipRunnable = null;
            }
        };
        this.lifecycleObserver = r22;
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList.TagItemViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Handler handler;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                handler = TagItemViewHolder.this.handler;
                handler.removeCallbacksAndMessages(null);
                TagItemViewHolder.this.dismissTooltip();
            }
        };
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if (c11 == null || (lifecycle = c11.getLifecycle()) == 0) {
            return;
        }
        lifecycle.a(r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissTooltip() {
        View view;
        RecyclerView composerRecyclerView;
        this.tooltipHelper.onDismissTooltip();
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.removeOnScrollListener(this.scrollListener);
    }

    private final void showTooltipIfNeeded(TagListVO.TagItemVO.TooltipVO tooltip) {
        final CartTooltipVO tooltip2;
        if (tooltip == null || (tooltip2 = tooltip.getTooltip()) == null) {
            dismissTooltip();
            return;
        }
        Long showDelay = tooltip.getShowDelay();
        long longValue = showDelay != null ? showDelay.longValue() : 500L;
        Long timeout = tooltip.getTimeout();
        final long longValue2 = timeout != null ? timeout.longValue() : 5000L;
        tooltip.getTooltip().setHideByTouchOutside(true);
        Runnable runnable = new Runnable() { // from class: ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList.TagItemViewHolder$showTooltipIfNeeded$lambda$2$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                CartTooltipHelper cartTooltipHelper;
                TagButtonView tagButtonView;
                cartTooltipHelper = TagItemViewHolder.this.tooltipHelper;
                CartTooltipVO cartTooltipVO = tooltip2;
                tagButtonView = TagItemViewHolder.this.view;
                CartTooltipHelper.onShowTooltip$default(cartTooltipHelper, cartTooltipVO, tagButtonView, 0, true, Long.valueOf(longValue2), null, 36, null);
            }
        };
        this.handler.postDelayed(runnable, longValue);
        this.showTooltipRunnable = runnable;
        subscribeToDismissEvents();
    }

    private final void subscribeToDismissEvents() {
        View view;
        RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.addOnScrollListener(this.scrollListener);
    }

    public final void bind(@NotNull TagListVO.TagItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TagButtonHolderKt.bind(this.view, item.getButton(), this.actionHandler);
        showTooltipIfNeeded(item.getTooltip());
    }
}
