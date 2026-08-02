package ru.ozon.app.android.marketing.widgets.actionProgress.core;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.actionProgress.data.ActionProgressDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/core/ActionProgressUpdateState;", "LA00/a$J$a;", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "actionProgress", "<init>", "(Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "getActionProgress", "()Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ActionProgressUpdateState implements a.J.InterfaceC0007a {
    private final ActionProgressDTO actionProgress;

    public ActionProgressUpdateState(ActionProgressDTO actionProgressDTO) {
        this.actionProgress = actionProgressDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActionProgressUpdateState) && Intrinsics.d(this.actionProgress, ((ActionProgressUpdateState) other).actionProgress);
    }

    public final ActionProgressDTO getActionProgress() {
        return this.actionProgress;
    }

    public int hashCode() {
        ActionProgressDTO actionProgressDTO = this.actionProgress;
        if (actionProgressDTO == null) {
            return 0;
        }
        return actionProgressDTO.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActionProgressUpdateState(actionProgress=" + this.actionProgress + ")";
    }
}
