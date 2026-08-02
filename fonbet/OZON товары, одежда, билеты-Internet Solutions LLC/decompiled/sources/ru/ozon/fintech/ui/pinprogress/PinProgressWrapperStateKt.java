package ru.ozon.fintech.ui.pinprogress;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"isFirstLaunch", "", "Lru/ozon/fintech/ui/pinprogress/PinProgressWrapperState;", "shouldPlayLoaderAnimation", "shouldResetLoaderAnimation", "oldState", "newState", "fintech-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinProgressWrapperStateKt {
    public static final boolean isFirstLaunch(PinProgressWrapperState pinProgressWrapperState) {
        return pinProgressWrapperState == null;
    }

    public static final boolean shouldPlayLoaderAnimation(PinProgressWrapperState pinProgressWrapperState) {
        return (pinProgressWrapperState != null ? pinProgressWrapperState.getDotsCount() : Integer.MAX_VALUE) <= (pinProgressWrapperState != null ? pinProgressWrapperState.getSelectedDot() : LinearLayoutManager.INVALID_OFFSET);
    }

    public static final boolean shouldResetLoaderAnimation(PinProgressWrapperState pinProgressWrapperState, @NotNull PinProgressWrapperState newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (pinProgressWrapperState == null) {
            return true;
        }
        return ((Intrinsics.d(pinProgressWrapperState.getCommon(), newState.getCommon()) && Intrinsics.d(pinProgressWrapperState.getNormalColor(), newState.getNormalColor()) && Intrinsics.d(pinProgressWrapperState.getSelectedColor(), newState.getSelectedColor()) && Intrinsics.d(pinProgressWrapperState.getErrorColor(), newState.getErrorColor()) && pinProgressWrapperState.getDotsCount() == newState.getDotsCount() && (pinProgressWrapperState.getDotRadius() > newState.getDotRadius() ? 1 : (pinProgressWrapperState.getDotRadius() == newState.getDotRadius() ? 0 : -1)) == 0 && (pinProgressWrapperState.getSelectedRadius() > newState.getSelectedRadius() ? 1 : (pinProgressWrapperState.getSelectedRadius() == newState.getSelectedRadius() ? 0 : -1)) == 0) && (pinProgressWrapperState.getSelectedDot() == newState.getSelectedDot()) && (pinProgressWrapperState.getSelectedDot() >= pinProgressWrapperState.getDotsCount()) && (newState.getSelectedDot() >= newState.getDotsCount())) ? false : true;
    }
}
