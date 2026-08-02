package ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.resetbutton;

import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.af.holders.ButtonBaseAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.autopicker.databinding.WidgetProductPickerResetButtonBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/resetbutton/ResetButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/resetbutton/ResetButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/resetbutton/ResetButtonVO;Ll20/d;)V", "Lru/ozon/app/android/autopicker/databinding/WidgetProductPickerResetButtonBinding;", "binding", "Lru/ozon/app/android/autopicker/databinding/WidgetProductPickerResetButtonBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ResetButtonViewHolder extends k<ResetButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetProductPickerResetButtonBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetButtonViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor handlersInhibitor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        WidgetProductPickerResetButtonBinding bind = WidgetProductPickerResetButtonBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).onPreProcess(new ResetButtonViewHolder$actionHandler$1(refs)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(CommonButton.ButtonBorderless.class, null, 2, null), new ButtonBaseAtom.Configuration(0, 0, 0, 0, false, 0, null, 124, null))), null, null, null, 14, null);
        atomsAdapter.setOnAction(buildHandler);
        this.atomsAdapter = atomsAdapter;
        bind.atomsVal.setAdapter(atomsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ResetButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.atomsAdapter.bind(getContext(), item.getButton());
    }
}
