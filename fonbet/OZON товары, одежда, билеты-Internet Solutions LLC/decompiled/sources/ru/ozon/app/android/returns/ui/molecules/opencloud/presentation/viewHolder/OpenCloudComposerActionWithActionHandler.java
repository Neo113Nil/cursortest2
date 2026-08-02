package ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewHolder;

import A00.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.ui.domain.actionhandlers.BaseCreationOrderComposerActionWithActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewHolder/OpenCloudComposerActionWithActionHandler;", "Lru/ozon/app/android/returns/ui/domain/actionhandlers/BaseCreationOrderComposerActionWithActionHandler;", "actionV2Repository", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/composer/ComposerReferences;)V", "handleRefresh", "", "composerAction", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Companion", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OpenCloudComposerActionWithActionHandler extends BaseCreationOrderComposerActionWithActionHandler {

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenCloudComposerActionWithActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull ComposerReferences refs) {
        super(actionV2Repository, refs);
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
    }

    @Override // ru.ozon.app.android.returns.ui.domain.actionhandlers.BaseCreationOrderComposerActionWithActionHandler
    protected void handleRefresh(@NotNull AtomAction.ComposerAction composerAction) {
        Intrinsics.checkNotNullParameter(composerAction, "composerAction");
        String actionName = composerAction.getActionName();
        Integer valueOf = Intrinsics.d(actionName, "expandOrdersAction") ? Integer.MAX_VALUE : Intrinsics.d(actionName, "collapseOrdersAction") ? Integer.valueOf(LinearLayoutManager.INVALID_OFFSET) : null;
        InterfaceC7851b.a.a(this.refs.getController(), null, null, null, new h.b(valueOf != null ? new a.C.d(valueOf.intValue(), getScrollOffset(), 24, true) : null, new l.a.C1079a(0L, null, 3)), 7);
    }
}
