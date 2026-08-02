package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick;

import GZ.g;
import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO;", "Landroid/view/View;", "view", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Landroid/view/View;LGZ/g;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "", "updateTopMargin", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO;Ll20/d;)V", "Landroid/view/View;", "LGZ/g;", "Lru/ozon/app/android/composer/ComposerReferences;", "itemVO", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsPickViewHolder extends k<CharacteristicsPickVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;
    private CharacteristicsPickVO itemVO;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacteristicsPickViewHolder(@NotNull View view, @NotNull g ozonRouter, @NotNull ComposerReferences composerReferences, @NotNull HandlersInhibitor handlersInhibitor) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.view = view;
        this.ozonRouter = ozonRouter;
        this.composerReferences = composerReferences;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).enableClickThrottling(handlersInhibitor).onClick(new CharacteristicsPickViewHolder$actionHandler$1(this)).buildHandler();
    }

    private final void updateTopMargin(SingleAtom singleAtom) {
        View childAt;
        View childAt2 = singleAtom.getChildAt(0);
        BaseCellWithSubtitleView baseCellWithSubtitleView = childAt2 instanceof BaseCellWithSubtitleView ? (BaseCellWithSubtitleView) childAt2 : null;
        if (baseCellWithSubtitleView == null || (childAt = baseCellWithSubtitleView.getChildAt(0)) == null) {
            return;
        }
        d dVar = new d();
        dVar.p(baseCellWithSubtitleView);
        dVar.t(childAt.getId(), 3, 0, 3, ResourceExtKt.toPx(8));
        dVar.f(baseCellWithSubtitleView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CharacteristicsPickVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.itemVO = item;
        View view = this.view;
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.uni.atoms.v3.containers.SingleAtom");
        SingleAtom singleAtom = (SingleAtom) view;
        SingleAtom.bind$default(singleAtom, item.getCell(), false, 2, null);
        updateTopMargin(singleAtom);
        singleAtom.setOnAction(this.actionHandler);
    }
}
