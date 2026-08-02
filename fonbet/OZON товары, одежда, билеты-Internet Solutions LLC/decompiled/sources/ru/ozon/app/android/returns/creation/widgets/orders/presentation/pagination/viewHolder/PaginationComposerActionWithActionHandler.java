package ru.ozon.app.android.returns.creation.widgets.orders.presentation.pagination.viewHolder;

import A00.a;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/orders/presentation/pagination/viewHolder/PaginationComposerActionWithActionHandler;", "Lru/ozon/app/android/returns/ui/domain/actionhandlers/BaseCreationOrderComposerActionWithActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "composerAction", "", "handleRefresh", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "", "scrollKey", "Ljava/lang/Integer;", "getScrollKey", "()Ljava/lang/Integer;", "setScrollKey", "(Ljava/lang/Integer;)V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaginationComposerActionWithActionHandler extends BaseCreationOrderComposerActionWithActionHandler {

    @NotNull
    private final ComposerReferences refs;
    private Integer scrollKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginationComposerActionWithActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull ComposerReferences refs) {
        super(actionV2Repository, refs);
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
    }

    @Override // ru.ozon.app.android.returns.ui.domain.actionhandlers.BaseCreationOrderComposerActionWithActionHandler
    protected void handleRefresh(@NotNull AtomAction.ComposerAction composerAction) {
        Intrinsics.checkNotNullParameter(composerAction, "composerAction");
        Integer num = this.scrollKey;
        InterfaceC7851b.a.a(this.refs.getController(), null, null, null, new h.b(num != null ? new a.C.d(num.intValue(), getScrollOffset(), 24, true) : new a.C.C0000a(0, false), new l.a.C1079a(0L, null, 3)), 7);
    }

    public final void setScrollKey(Integer num) {
        this.scrollKey = num;
    }
}
