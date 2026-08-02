package ru.ozon.app.android.error.summary.presentation.shared;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"mapToSharedDto", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryInvalidWidgetSharedDTO;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget;", "error-summary_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryInvalidWidgetSharedDTOKt {
    @NotNull
    public static final ErrorSummaryInvalidWidgetSharedDTO mapToSharedDto(@NotNull ScreenState.ServerIssue.ComposerInfo.InvalidWidget invalidWidget) {
        Intrinsics.checkNotNullParameter(invalidWidget, "<this>");
        if (!(invalidWidget instanceof ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget)) {
            if (!(invalidWidget instanceof ScreenState.ServerIssue.ComposerInfo.InvalidWidget.UnSupportedWidget)) {
                throw new o();
            }
            ScreenState.ServerIssue.ComposerInfo.InvalidWidget.UnSupportedWidget unSupportedWidget = (ScreenState.ServerIssue.ComposerInfo.InvalidWidget.UnSupportedWidget) invalidWidget;
            return new ErrorSummaryInvalidWidgetSharedDTO(unSupportedWidget.getWidgetKey(), Boolean.valueOf(unSupportedWidget.getIsWidgetSupported()), null, null, 12, null);
        }
        ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget prepareWidget = (ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget) invalidWidget;
        String widgetKey = prepareWidget.getWidgetKey();
        String obj = prepareWidget.getStep().toString();
        Throwable throwable = prepareWidget.getThrowable();
        return new ErrorSummaryInvalidWidgetSharedDTO(widgetKey, null, obj, throwable != null ? throwable.toString() : null, 2, null);
    }
}
