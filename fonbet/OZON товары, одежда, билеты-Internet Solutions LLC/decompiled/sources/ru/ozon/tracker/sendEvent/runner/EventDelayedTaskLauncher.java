package ru.ozon.tracker.sendEvent.runner;

import hi0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/tracker/sendEvent/runner/EventDelayedTaskLauncher;", "", "Lru/ozon/tracker/sendEvent/runner/DelayTimeProvider;", "delayTimeProvider", "Lhi0/f;", "delayedAction", "<init>", "(Lru/ozon/tracker/sendEvent/runner/DelayTimeProvider;Lhi0/f;)V", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "launch", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/tracker/sendEvent/runner/DelayTimeProvider;", "Lhi0/f;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventDelayedTaskLauncher {

    @NotNull
    private final DelayTimeProvider delayTimeProvider;

    @NotNull
    private final f delayedAction;

    public EventDelayedTaskLauncher(@NotNull DelayTimeProvider delayTimeProvider, @NotNull f delayedAction) {
        Intrinsics.checkNotNullParameter(delayTimeProvider, "delayTimeProvider");
        Intrinsics.checkNotNullParameter(delayedAction, "delayedAction");
        this.delayTimeProvider = delayTimeProvider;
        this.delayedAction = delayedAction;
    }

    public final void launch(@NotNull Function1<? super d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.delayedAction.b(this.delayTimeProvider.mo1670getUwyO8pc(), block);
    }
}
