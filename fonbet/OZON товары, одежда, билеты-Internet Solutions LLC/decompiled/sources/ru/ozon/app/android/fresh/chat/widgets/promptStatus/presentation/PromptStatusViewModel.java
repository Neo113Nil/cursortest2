package ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.B0;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusVO;", "item", "", "startTextSwitching", "(Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusVO;)V", "bindState", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "setErrorState", "LAe/x0;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState;", "_state", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", "Lze/h;", "_actions", "Lze/h;", "LAe/h;", "actions", "LAe/h;", "getActions", "()LAe/h;", "Lxe/B0;", "actionJob", "Lxe/B0;", "switchingTitlesJob", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromptStatusViewModel extends w0 {

    @NotNull
    private final h<AtomAction> _actions;

    @NotNull
    private final x0<PromptStatusState> _state;
    private B0 actionJob;

    @NotNull
    private final InterfaceC2395h<AtomAction> actions;

    @NotNull
    private final M0<PromptStatusState> state;
    private B0 switchingTitlesJob;

    public PromptStatusViewModel() {
        x0<PromptStatusState> a11 = O0.a(PromptStatusState.Initial.INSTANCE);
        this._state = a11;
        this.state = C2399j.b(a11);
        C11115c a12 = k.a(1, 6, null);
        this._actions = a12;
        this.actions = C2399j.H(a12);
    }

    private final void startTextSwitching(PromptStatusVO item) {
        if (item.getLoadingTitles().isEmpty() || item.getTextSwitchingTime() <= 0) {
            return;
        }
        B0 b02 = this.switchingTitlesJob;
        if (b02 != null) {
            b02.j(null);
        }
        this._state.setValue(new PromptStatusState.Progress(item.getLoadingIcon(), (TextDTO) C7714v.K(item.getLoadingTitles())));
        if (item.getLoadingTitles().size() == 1) {
            return;
        }
        this.switchingTitlesJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new PromptStatusViewModel$startTextSwitching$1(item, this, null), 3);
    }

    public final void bindState(@NotNull PromptStatusVO item) {
        B0 b02;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getCheckStatusAction() != null && (item.getCheckStatusAction() instanceof AtomAction.ComposerAction) && ((b02 = this.actionJob) == null || !b02.isActive())) {
            startTextSwitching(item);
            this._actions.b(item.getCheckStatusAction());
        } else if (item.getCheckStatusAction() == null) {
            setErrorState();
        }
    }

    @NotNull
    public final InterfaceC2395h<AtomAction> getActions() {
        return this.actions;
    }

    @NotNull
    public final M0<PromptStatusState> getState() {
        return this.state;
    }

    public final void processAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this._actions.b(action);
    }

    public final void setErrorState() {
        B0 b02 = this.switchingTitlesJob;
        if (b02 != null) {
            b02.j(null);
        }
        this._state.setValue(PromptStatusState.Error.INSTANCE);
    }
}
