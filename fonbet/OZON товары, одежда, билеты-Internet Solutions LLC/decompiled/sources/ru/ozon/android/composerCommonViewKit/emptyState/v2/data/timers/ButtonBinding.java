package ru.ozon.android.composerCommonViewKit.emptyState.v2.data.timers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.TimerButtonConfig;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/ButtonBinding;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerButtonConfig;", "timerConfig", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerButtonConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerButtonConfig;", "getTimerConfig", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerButtonConfig;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ButtonBinding {

    @NotNull
    private final AtomDTO atom;
    private final TimerButtonConfig timerConfig;

    public ButtonBinding(@NotNull AtomDTO atom, TimerButtonConfig timerButtonConfig) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        this.atom = atom;
        this.timerConfig = timerButtonConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonBinding)) {
            return false;
        }
        ButtonBinding buttonBinding = (ButtonBinding) other;
        return Intrinsics.d(this.atom, buttonBinding.atom) && Intrinsics.d(this.timerConfig, buttonBinding.timerConfig);
    }

    @NotNull
    public final AtomDTO getAtom() {
        return this.atom;
    }

    public final TimerButtonConfig getTimerConfig() {
        return this.timerConfig;
    }

    public int hashCode() {
        int hashCode = this.atom.hashCode() * 31;
        TimerButtonConfig timerButtonConfig = this.timerConfig;
        return hashCode + (timerButtonConfig == null ? 0 : timerButtonConfig.hashCode());
    }

    @NotNull
    public String toString() {
        return "ButtonBinding(atom=" + this.atom + ", timerConfig=" + this.timerConfig + ")";
    }
}
