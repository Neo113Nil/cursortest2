package ru.ozon.app.android.error.summary.presentation.recycler;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryItem;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryCellViewHolder;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryViewHolder;", "titleSubtitleCellView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "<init>", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;)V", "bind", "", "item", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryCellViewHolder extends ErrorSummaryViewHolder {

    @NotNull
    private final TitleSubtitleCellView titleSubtitleCellView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorSummaryCellViewHolder(@NotNull TitleSubtitleCellView titleSubtitleCellView) {
        super(titleSubtitleCellView);
        Intrinsics.checkNotNullParameter(titleSubtitleCellView, "titleSubtitleCellView");
        this.titleSubtitleCellView = titleSubtitleCellView;
        titleSubtitleCellView.setPreset(TitleSubtitleWrapperPresets.INSTANCE.getControl500());
    }

    @Override // ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryViewHolder
    public void bind(@NotNull ErrorSummaryItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TitleSubtitleCellView titleSubtitleCellView = this.titleSubtitleCellView;
        ErrorSummaryItem.Cell cell = (ErrorSummaryItem.Cell) item;
        titleSubtitleCellView.setTitleText(cell.getTitle());
        titleSubtitleCellView.setSubtitleText(cell.getTextValue());
    }
}
