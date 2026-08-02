package ru.ozon.app.android.marketing.widgets.actionProgress.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressMiniWidgetState;", "", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "actionProgress", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "currentMiniWidget", "<init>", "(Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "getActionProgress", "()Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ActionProgressMiniWidgetState {
    private final ActionProgressDTO actionProgress;
    private final HighlightsCurrentMiniWidget currentMiniWidget;

    public ActionProgressMiniWidgetState(ActionProgressDTO actionProgressDTO, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget) {
        this.actionProgress = actionProgressDTO;
        this.currentMiniWidget = highlightsCurrentMiniWidget;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionProgressMiniWidgetState)) {
            return false;
        }
        ActionProgressMiniWidgetState actionProgressMiniWidgetState = (ActionProgressMiniWidgetState) other;
        return Intrinsics.d(this.actionProgress, actionProgressMiniWidgetState.actionProgress) && this.currentMiniWidget == actionProgressMiniWidgetState.currentMiniWidget;
    }

    public final ActionProgressDTO getActionProgress() {
        return this.actionProgress;
    }

    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    public int hashCode() {
        ActionProgressDTO actionProgressDTO = this.actionProgress;
        int hashCode = (actionProgressDTO == null ? 0 : actionProgressDTO.hashCode()) * 31;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = this.currentMiniWidget;
        return hashCode + (highlightsCurrentMiniWidget != null ? highlightsCurrentMiniWidget.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ActionProgressMiniWidgetState(actionProgress=" + this.actionProgress + ", currentMiniWidget=" + this.currentMiniWidget + ")";
    }
}
