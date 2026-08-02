package ru.ozon.app.android.travel.actionhandler.performActionsList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/performActionsList/ActionWithDelay;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "delay", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Long;)V", "component1", "()Lru/ozon/uni/atoms/af/AtomAction;", "component2", "()Ljava/lang/Long;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "Ljava/lang/Long;", "getDelay", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ActionWithDelay {

    @NotNull
    private final AtomAction action;
    private final Long delay;

    public ActionWithDelay(@NotNull AtomAction action, Long l11) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
        this.delay = l11;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomAction getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getDelay() {
        return this.delay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionWithDelay)) {
            return false;
        }
        ActionWithDelay actionWithDelay = (ActionWithDelay) other;
        return Intrinsics.d(this.action, actionWithDelay.action) && Intrinsics.d(this.delay, actionWithDelay.delay);
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        Long l11 = this.delay;
        return hashCode + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        return "ActionWithDelay(action=" + this.action + ", delay=" + this.delay + ")";
    }
}
