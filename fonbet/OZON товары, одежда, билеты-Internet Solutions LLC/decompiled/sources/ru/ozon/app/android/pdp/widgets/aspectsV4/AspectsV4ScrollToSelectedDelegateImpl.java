package ru.ozon.app.android.pdp.widgets.aspectsV4;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001e\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/AspectsV4ScrollToSelectedDelegateImpl;", "", "", "paddingOffset", "Lkotlin/Function0;", "Landroid/os/Parcelable;", "provideRecyclerViewSavedState", "<init>", "(ILkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "index", "itemWidth", "", "scrollToSelectedAspect", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "I", "Lkotlin/jvm/functions/Function0;", "", "isFirstPageLoad", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4ScrollToSelectedDelegateImpl {
    private boolean isFirstPageLoad;
    private final int paddingOffset;
    private final Function0<Parcelable> provideRecyclerViewSavedState;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectsV4ScrollToSelectedDelegateImpl(int i11, Function0<? extends Parcelable> function0) {
        this.paddingOffset = i11;
        this.provideRecyclerViewSavedState = function0;
        this.isFirstPageLoad = true;
    }

    public void scrollToSelectedAspect(@NotNull RecyclerView recyclerView, int i11, int i12) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Function0<Parcelable> function0 = this.provideRecyclerViewSavedState;
        Parcelable invoke = function0 != null ? function0.invoke() : null;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (this.isFirstPageLoad) {
            linearLayoutManager.scrollToPositionWithOffset(i11, (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - i12) / 2);
            this.isFirstPageLoad = false;
        } else if (i11 > findLastCompletelyVisibleItemPosition) {
            linearLayoutManager.scrollToPositionWithOffset(i11, (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - i12) - this.paddingOffset);
        } else if (i11 < findFirstCompletelyVisibleItemPosition) {
            linearLayoutManager.scrollToPositionWithOffset(i11, this.paddingOffset);
        } else if (invoke != null) {
            linearLayoutManager.onRestoreInstanceState(invoke);
        }
    }

    public /* synthetic */ AspectsV4ScrollToSelectedDelegateImpl(int i11, Function0 function0, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? Dimens.INSTANCE.getDP_6() : i11, (i12 & 2) != 0 ? null : function0);
    }
}
