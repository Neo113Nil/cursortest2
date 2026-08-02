package ru.ozon.app.android.returns.creation.widgets.methods.presentation.atom;

import Vg.d;
import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.PaddingsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00182\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u0018B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/atom/AtomElementViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/atom/AtomElementVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/atom/AtomElementView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/methods/presentation/atom/AtomElementView;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/creation/widgets/methods/presentation/atom/AtomElementVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/atom/AtomElementView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AtomElementViewHolder extends k<AtomElementVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomElementView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = SingleAtom.$stable;

    @NotNull
    private static final Set<Class<ComposerActionWithActionHandler>> SUPPORTED_ACTIONS = e0.h(ComposerActionWithActionHandler.class);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/atom/AtomElementViewHolder$Companion;", "", "<init>", "()V", "SUPPORTED_ACTIONS", "", "Ljava/lang/Class;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionHandler;", "getSUPPORTED_ACTIONS", "()Ljava/util/Set;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<ComposerActionWithActionHandler>> getSUPPORTED_ACTIONS() {
            return AtomElementViewHolder.SUPPORTED_ACTIONS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomElementViewHolder(@NotNull AtomElementView view, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new AtomElementViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        view.getAtomView().setOnAction(buildHandler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AtomElementVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AtomElementView atomElementView = this.view;
        PaddingsKt.applyTo(item.getPaddings(), atomElementView);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = atomElementView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomElementView.setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), R$color.layer_floor_1));
        SingleAtom.bind$default(atomElementView.getAtomView(), item.getAtom(), false, 2, null);
    }
}
