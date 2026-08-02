package ru.ozon.app.android.error.summary.presentation;

import B0.A0;
import Sc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryItem;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J$\u0010\b\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/ErrorSummaryStateToViewStateMapper;", "Lkotlin/Function1;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryState;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewState;", "<init>", "()V", "invoke", "state", "addCell", "", "", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "textValue", "createInvalidWidgetItems", "", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Cell;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryStateToViewStateMapper implements Function1<ErrorSummaryState, ErrorSummaryViewState> {
    private final void addCell(List<ErrorSummaryItem> list, String str, String str2) {
        if (str2 != null) {
            list.add(new ErrorSummaryItem.Cell(str, str2));
        }
    }

    private final List<ErrorSummaryItem.Cell> createInvalidWidgetItems(ErrorSummaryState state) {
        ScreenState.ServerIssue.ComposerInfo composerInfo;
        List<ScreenState.ServerIssue.ComposerInfo.InvalidWidget> invalidWidgets;
        ErrorSummaryItem.Cell cell;
        ScreenState.ServerIssue serverIssue = state.getServerIssue();
        if (serverIssue == null || (composerInfo = serverIssue.getComposerInfo()) == null || (invalidWidgets = composerInfo.getInvalidWidgets()) == null) {
            return K.f71697a;
        }
        List<ScreenState.ServerIssue.ComposerInfo.InvalidWidget> list = invalidWidgets;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (ScreenState.ServerIssue.ComposerInfo.InvalidWidget invalidWidget : list) {
            if (invalidWidget instanceof ScreenState.ServerIssue.ComposerInfo.InvalidWidget.UnSupportedWidget) {
                cell = new ErrorSummaryItem.Cell("Invalid widget", A0.b("Widget ", ((ScreenState.ServerIssue.ComposerInfo.InvalidWidget.UnSupportedWidget) invalidWidget).getWidgetKey(), " is not supported in the application"));
            } else {
                if (!(invalidWidget instanceof ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget)) {
                    throw new o();
                }
                ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget prepareWidget = (ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget) invalidWidget;
                cell = new ErrorSummaryItem.Cell("Invalid widget", "Widget " + prepareWidget.getWidgetKey() + " failed to convert at the step = " + prepareWidget.getStep() + ", because there was an error = " + prepareWidget.getThrowable());
            }
            arrayList.add(cell);
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public ErrorSummaryViewState invoke(@NotNull ErrorSummaryState state) {
        Integer layoutVersion;
        Integer layoutId;
        Integer code;
        String timeStamp;
        Intrinsics.checkNotNullParameter(state, "state");
        ScreenState.ServerIssue serverIssue = state.getServerIssue();
        ScreenState.ServerIssue.HttpInfo httpInfo = serverIssue != null ? serverIssue.getHttpInfo() : null;
        ScreenState.ServerIssue.ComposerInfo composerInfo = serverIssue != null ? serverIssue.getComposerInfo() : null;
        ArrayList arrayList = new ArrayList();
        addCell(arrayList, "Platform", state.getPlatform());
        addCell(arrayList, "App version", state.getAppVersion());
        addCell(arrayList, "Commit hash", state.getCommitHash());
        addCell(arrayList, "Error time", (serverIssue == null || (timeStamp = serverIssue.getTimeStamp()) == null) ? null : timeStamp.concat(" GMT+3"));
        Long userId = state.getUserId();
        addCell(arrayList, "User ID", userId != null ? userId.toString() : null);
        addCell(arrayList, "Trace ID", serverIssue != null ? serverIssue.getTraceId() : null);
        arrayList.addAll(createInvalidWidgetItems(state));
        addCell(arrayList, "Response code", (httpInfo == null || (code = httpInfo.getCode()) == null) ? null : code.toString());
        addCell(arrayList, "Response message", httpInfo != null ? httpInfo.getMessage() : null);
        addCell(arrayList, "Layout Id", (composerInfo == null || (layoutId = composerInfo.getLayoutId()) == null) ? null : layoutId.toString());
        addCell(arrayList, "Layout Version", (composerInfo == null || (layoutVersion = composerInfo.getLayoutVersion()) == null) ? null : layoutVersion.toString());
        addCell(arrayList, "Page url", composerInfo != null ? composerInfo.getUrl() : null);
        addCell(arrayList, "Mesh", state.getMeshVersions());
        addCell(arrayList, "Local experiments", state.getAbVariants());
        arrayList.add(ErrorSummaryItem.Ab.FeatureFlags.INSTANCE);
        arrayList.add(ErrorSummaryItem.Ab.Experiments.INSTANCE);
        return new ErrorSummaryViewState(arrayList);
    }
}
