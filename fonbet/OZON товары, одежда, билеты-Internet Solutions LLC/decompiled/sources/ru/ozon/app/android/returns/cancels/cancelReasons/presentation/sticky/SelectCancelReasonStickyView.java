package ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/sticky/SelectCancelReasonStickyView;", "", "Lru/ozon/uni/android/cell/CellView;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getCaptionView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "captionView", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SelectCancelReasonStickyView {
    @NotNull
    ButtonV3View getButtonView();

    @NotNull
    TextAtomV2View getCaptionView();

    @NotNull
    CellView getCellView();
}
