package ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "fetchAction", "()V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lxe/B0;", "currentJob", "Lxe/B0;", "LAe/w0;", "", "_hasUnreadMessages", "LAe/w0;", "LAe/B0;", "hasUnreadMessages", "LAe/B0;", "getHasUnreadMessages", "()LAe/B0;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "boundAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBoundAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "setBoundAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnreadMessageIndicatorViewModel extends w0 {

    @NotNull
    private final Ae.w0<Boolean> _hasUnreadMessages;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private AtomActionDTO boundAction;
    private B0 currentJob;

    @NotNull
    private final Ae.B0<Boolean> hasUnreadMessages;

    public UnreadMessageIndicatorViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        C0 b11 = E0.b(0, 0, null, 7);
        this._hasUnreadMessages = b11;
        this.hasUnreadMessages = C2399j.a(b11);
    }

    public final void fetchAction() {
        String link;
        AtomActionDTO atomActionDTO = this.boundAction;
        if (atomActionDTO == null || (link = atomActionDTO.getLink()) == null) {
            return;
        }
        B0 b02 = this.currentJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.currentJob = C10727i.c(x0.a(this), null, null, new UnreadMessageIndicatorViewModel$fetchAction$1(this, link, null), 3);
    }

    @NotNull
    public final Ae.B0<Boolean> getHasUnreadMessages() {
        return this.hasUnreadMessages;
    }

    public final void setBoundAction(AtomActionDTO atomActionDTO) {
        this.boundAction = atomActionDTO;
    }
}
