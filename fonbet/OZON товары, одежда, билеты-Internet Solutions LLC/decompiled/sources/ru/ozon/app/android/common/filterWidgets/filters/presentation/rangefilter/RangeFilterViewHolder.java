package ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter;

import U7.d;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityActionHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.RangeFilterComposerActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.core.atoms.holders.rangefilter.RangeFilterHolderKt;
import ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersRangeFilterBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersRangeFilterBinding;", "binding", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/RangeFilterComposerActionHandler;", "composerActionHandler", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;", "delayedActionHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersRangeFilterBinding;Lru/ozon/app/android/common/filterWidgets/filters/presentation/RangeFilterComposerActionHandler;Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "isNeedToDelayAction", "()Z", "", "observerKeyboard", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterVO;Ll20/d;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersRangeFilterBinding;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/RangeFilterComposerActionHandler;", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RangeFilterViewHolder extends k<RangeFilterVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetFiltersRangeFilterBinding binding;

    @NotNull
    private final RangeFilterComposerActionHandler composerActionHandler;

    @NotNull
    private final KeyboardVisibilityActionHolder delayedActionHolder;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RangeFilterViewHolder(@NotNull WidgetFiltersRangeFilterBinding binding, @NotNull RangeFilterComposerActionHandler composerActionHandler, @NotNull KeyboardVisibilityActionHolder delayedActionHolder, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerActionHandler, "composerActionHandler");
        Intrinsics.checkNotNullParameter(delayedActionHolder, "delayedActionHolder");
        Intrinsics.checkNotNullParameter(refs, "refs");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerActionHandler = composerActionHandler;
        this.delayedActionHolder = delayedActionHolder;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new RangeFilterViewHolder$actionHandler$1(this)).customAnalyticHandler(new RangeFilterViewHolder$actionHandler$2(this)).buildHandler();
        observerKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNeedToDelayAction() {
        return this.delayedActionHolder.isListenerRegistered() && this.delayedActionHolder.isKeyboardVisible(this.refs.getContainer().a());
    }

    private final void observerKeyboard() {
        d.c(this.refs).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter.RangeFilterViewHolder$observerKeyboard$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                KeyboardVisibilityActionHolder keyboardVisibilityActionHolder;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                keyboardVisibilityActionHolder = RangeFilterViewHolder.this.delayedActionHolder;
                composerReferences = RangeFilterViewHolder.this.refs;
                keyboardVisibilityActionHolder.unregister(composerReferences.getContainer().a());
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                KeyboardVisibilityActionHolder keyboardVisibilityActionHolder;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                keyboardVisibilityActionHolder = RangeFilterViewHolder.this.delayedActionHolder;
                composerReferences = RangeFilterViewHolder.this.refs;
                keyboardVisibilityActionHolder.register(composerReferences.getContainer().a(), new RangeFilterViewHolder$observerKeyboard$1$onResume$1(RangeFilterViewHolder.this));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RangeFilterVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetFiltersRangeFilterBinding widgetFiltersRangeFilterBinding = this.binding;
        RangeFilterView rangeFilter = widgetFiltersRangeFilterBinding.rangeFilter;
        Intrinsics.checkNotNullExpressionValue(rangeFilter, "rangeFilter");
        RangeFilterHolderKt.bind(rangeFilter, item.getRangeFilter(), this.actionHandler);
        View separator = widgetFiltersRangeFilterBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(item.getShowSeparator()));
    }
}
