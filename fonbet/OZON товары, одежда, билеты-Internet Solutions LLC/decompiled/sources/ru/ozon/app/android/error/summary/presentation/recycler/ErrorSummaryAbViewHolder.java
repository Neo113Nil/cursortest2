package ru.ozon.app.android.error.summary.presentation.recycler;

import EX.c;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryItem;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.data.DisclosureTitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryAbViewHolder;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryViewHolder;", "disclosureTitleSubtitleCellView", "Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;", "cellClickAction", "Lkotlin/Function0;", "", "<init>", "(Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;Lkotlin/jvm/functions/Function0;)V", "bind", "item", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryAbViewHolder extends ErrorSummaryViewHolder {

    @NotNull
    private final Function0<Unit> cellClickAction;

    @NotNull
    private final DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorSummaryAbViewHolder(@NotNull DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView, @NotNull Function0<Unit> cellClickAction) {
        super(disclosureTitleSubtitleCellView);
        Intrinsics.checkNotNullParameter(disclosureTitleSubtitleCellView, "disclosureTitleSubtitleCellView");
        Intrinsics.checkNotNullParameter(cellClickAction, "cellClickAction");
        this.disclosureTitleSubtitleCellView = disclosureTitleSubtitleCellView;
        this.cellClickAction = cellClickAction;
        disclosureTitleSubtitleCellView.setPreset(DisclosureTitleSubtitleWrapperPresets.INSTANCE.getControl500());
        disclosureTitleSubtitleCellView.setSubtitleVisible(false);
        disclosureTitleSubtitleCellView.setOnClickListener(new c(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ErrorSummaryAbViewHolder errorSummaryAbViewHolder, View view) {
        errorSummaryAbViewHolder.cellClickAction.invoke();
    }

    @Override // ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryViewHolder
    public void bind(@NotNull ErrorSummaryItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView = this.disclosureTitleSubtitleCellView;
        ErrorSummaryItem.Ab ab2 = item instanceof ErrorSummaryItem.Ab ? (ErrorSummaryItem.Ab) item : null;
        if (ab2 != null) {
            disclosureTitleSubtitleCellView.setTitleText(ab2.getTitle());
        }
    }
}
