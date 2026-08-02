package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation;

import Ck.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.base.WidgetScrollInfoAspectsCompact;
import ru.ozon.app.android.pdp.ui.configurators.base.WidgetScrollInfoHolder$AspectsCompact;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectCompactV2FooterVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterView;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "changeWidgetScrollInfo", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO;Ll20/d;)V", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectCompactV2FooterWidgetViewHolder extends k<AspectCompactV2FooterVO> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AspectCompactV2FooterView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectCompactV2FooterWidgetViewHolder(@NotNull AspectCompactV2FooterView view, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        view.getLeftButtonV().setOnClickListener(new a(this, 6));
        view.getRightButtonV().setOnClickListener(new FG.a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AspectCompactV2FooterWidgetViewHolder aspectCompactV2FooterWidgetViewHolder, View view) {
        AspectCompactV2FooterVO.TextButton leftButton;
        AtomAction action;
        aspectCompactV2FooterWidgetViewHolder.changeWidgetScrollInfo();
        AspectCompactV2FooterVO boundedData = aspectCompactV2FooterWidgetViewHolder.getBoundedData();
        if (boundedData == null || (leftButton = boundedData.getLeftButton()) == null || (action = leftButton.getAction()) == null) {
            return;
        }
        aspectCompactV2FooterWidgetViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AspectCompactV2FooterWidgetViewHolder aspectCompactV2FooterWidgetViewHolder, View view) {
        AspectCompactV2FooterVO.TextButton rightButton;
        AtomAction action;
        aspectCompactV2FooterWidgetViewHolder.changeWidgetScrollInfo();
        AspectCompactV2FooterVO boundedData = aspectCompactV2FooterWidgetViewHolder.getBoundedData();
        if (boundedData == null || (rightButton = boundedData.getRightButton()) == null || (action = rightButton.getAction()) == null) {
            return;
        }
        aspectCompactV2FooterWidgetViewHolder.actionHandler.invoke(action);
    }

    private final void changeWidgetScrollInfo() {
        WidgetScrollInfoHolder$AspectsCompact widgetScrollInfoHolder$AspectsCompact = WidgetScrollInfoHolder$AspectsCompact.INSTANCE;
        AspectCompactV2FooterVO boundedData = getBoundedData();
        widgetScrollInfoHolder$AspectsCompact.change(new WidgetScrollInfoAspectsCompact(boundedData != null ? (int) boundedData.getId() : 0, 0, null, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AspectCompactV2FooterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item);
    }
}
