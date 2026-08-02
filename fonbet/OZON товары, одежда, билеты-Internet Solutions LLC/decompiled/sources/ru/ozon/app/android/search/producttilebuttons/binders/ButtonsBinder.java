package ru.ozon.app.android.search.producttilebuttons.binders;

import android.view.View;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;
import ru.ozon.app.android.search.producttilebuttons.binders.multiButton.MultiButtonsBinder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view.VerticalMultiButtonContainerView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u00030\bj\u0006\u0012\u0002\b\u0003`\t¢\u0006\u0004\b\f\u0010\rJE\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/producttilebuttons/binders/ButtonsBinder;", "", "Lru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonsBinder;", "multiButtonsBinder", "<init>", "(Lru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonsBinder;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "", "init", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Landroid/view/View;", "button", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "composerReferences", "bind", "(Landroidx/lifecycle/J;Landroid/view/View;Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonsBinder;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonsBinder {

    @NotNull
    private final MultiButtonsBinder multiButtonsBinder;

    public ButtonsBinder(@NotNull MultiButtonsBinder multiButtonsBinder) {
        Intrinsics.checkNotNullParameter(multiButtonsBinder, "multiButtonsBinder");
        this.multiButtonsBinder = multiButtonsBinder;
    }

    public final void bind(@NotNull J lifecycleOwner, @NotNull View button, @NotNull MultiButtonVO state, @NotNull Function1<? super AtomAction, Unit> actionHandler, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        MultiButtonsBinder multiButtonsBinder = this.multiButtonsBinder;
        VerticalMultiButtonContainerView verticalMultiButtonContainerView = button instanceof VerticalMultiButtonContainerView ? (VerticalMultiButtonContainerView) button : null;
        if (verticalMultiButtonContainerView == null || composerReferences == null) {
            return;
        }
        multiButtonsBinder.bind(verticalMultiButtonContainerView, composerReferences, lifecycleOwner, actionHandler, state);
    }

    public final void init(@NotNull ComposerReferences refs, @NotNull k<?> vh2) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        this.multiButtonsBinder.init(refs, vh2);
    }
}
