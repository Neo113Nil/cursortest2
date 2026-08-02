package ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation;

import Kk.c;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult;", "getResultLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LW10/c;", "trackingData", "", "performAction", "(Lru/ozon/uni/atoms/af/AtomAction;LW10/c;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "resultLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lxe/B0;", "currentJob", "Lxe/B0;", "ActionResult", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InvisibleRefresherViewModel extends w0 {

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 currentJob;

    @NotNull
    private final SingleLiveEvent<ActionResult> resultLiveData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult;", "", "StartTimer", "Action", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult$Action;", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult$StartTimer;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ActionResult {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult$Action;", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Action implements ActionResult {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction action;

            public Action(@NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Action) && Intrinsics.d(this.action, ((Action) other).action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("Action(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult$StartTimer;", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StartTimer implements ActionResult {

            @NotNull
            public static final StartTimer INSTANCE = new StartTimer();

            private StartTimer() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof StartTimer);
            }

            public int hashCode() {
                return -250595005;
            }

            @NotNull
            public String toString() {
                return "StartTimer";
            }
        }
    }

    public InvisibleRefresherViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.resultLiveData = new SingleLiveEvent<>();
    }

    @NotNull
    public final P<ActionResult> getResultLiveData() {
        return this.resultLiveData;
    }

    public final void performAction(AtomAction action, @NotNull W10.c trackingData) {
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (action instanceof AtomAction.ComposerAction) {
            B0 b02 = this.currentJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.currentJob = C10727i.c(x0.a(this), null, null, new InvisibleRefresherViewModel$performAction$1(this, action, trackingData, null), 3);
        }
    }
}
