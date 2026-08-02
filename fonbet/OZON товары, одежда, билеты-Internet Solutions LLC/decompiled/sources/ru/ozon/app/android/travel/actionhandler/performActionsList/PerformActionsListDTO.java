package ru.ozon.app.android.travel.actionhandler.performActionsList;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/performActionsList/PerformActionsListDTO;", "", "actionsWithDelay", "", "Lru/ozon/app/android/travel/actionhandler/performActionsList/PerformActionsListDTO$ActionWithDelay;", "<init>", "(Ljava/util/List;)V", "getActionsWithDelay", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ActionWithDelay", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PerformActionsListDTO {

    @NotNull
    private final List<ActionWithDelay> actionsWithDelay;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/performActionsList/PerformActionsListDTO$ActionWithDelay;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "delayMs", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Long;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDelayMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Long;)Lru/ozon/app/android/travel/actionhandler/performActionsList/PerformActionsListDTO$ActionWithDelay;", "equals", "", "other", "hashCode", "", "toString", "", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionWithDelay {

        @NotNull
        private final AtomActionDTO action;
        private final Long delayMs;

        public ActionWithDelay(@NotNull AtomActionDTO action, Long l11) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.delayMs = l11;
        }

        public static /* synthetic */ ActionWithDelay copy$default(ActionWithDelay actionWithDelay, AtomActionDTO atomActionDTO, Long l11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = actionWithDelay.action;
            }
            if ((i11 & 2) != 0) {
                l11 = actionWithDelay.delayMs;
            }
            return actionWithDelay.copy(atomActionDTO, l11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getDelayMs() {
            return this.delayMs;
        }

        @NotNull
        public final ActionWithDelay copy(@NotNull AtomActionDTO action, Long delayMs) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new ActionWithDelay(action, delayMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionWithDelay)) {
                return false;
            }
            ActionWithDelay actionWithDelay = (ActionWithDelay) other;
            return Intrinsics.d(this.action, actionWithDelay.action) && Intrinsics.d(this.delayMs, actionWithDelay.delayMs);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Long getDelayMs() {
            return this.delayMs;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            Long l11 = this.delayMs;
            return hashCode + (l11 == null ? 0 : l11.hashCode());
        }

        @NotNull
        public String toString() {
            return "ActionWithDelay(action=" + this.action + ", delayMs=" + this.delayMs + ")";
        }
    }

    public PerformActionsListDTO(@NotNull List<ActionWithDelay> actionsWithDelay) {
        Intrinsics.checkNotNullParameter(actionsWithDelay, "actionsWithDelay");
        this.actionsWithDelay = actionsWithDelay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformActionsListDTO copy$default(PerformActionsListDTO performActionsListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = performActionsListDTO.actionsWithDelay;
        }
        return performActionsListDTO.copy(list);
    }

    @NotNull
    public final List<ActionWithDelay> component1() {
        return this.actionsWithDelay;
    }

    @NotNull
    public final PerformActionsListDTO copy(@NotNull List<ActionWithDelay> actionsWithDelay) {
        Intrinsics.checkNotNullParameter(actionsWithDelay, "actionsWithDelay");
        return new PerformActionsListDTO(actionsWithDelay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PerformActionsListDTO) && Intrinsics.d(this.actionsWithDelay, ((PerformActionsListDTO) other).actionsWithDelay);
    }

    @NotNull
    public final List<ActionWithDelay> getActionsWithDelay() {
        return this.actionsWithDelay;
    }

    public int hashCode() {
        return this.actionsWithDelay.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("PerformActionsListDTO(actionsWithDelay=", ")", this.actionsWithDelay);
    }
}
