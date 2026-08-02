package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared;

import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/D;", "snapHelper", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnSnapPositionChangeListener;", "onSnapPositionChangeListener", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnScrollFinishedListener;", "onScrollFinishedListener", "", "newSnapPosition", "", "attachSnapHelperWithListener", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/D;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnSnapPositionChangeListener;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnScrollFinishedListener;Ljava/lang/Integer;)V", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RecyclerViewExtKt {
    public static final void attachSnapHelperWithListener(@NotNull RecyclerView recyclerView, @NotNull D snapHelper, @NotNull OnSnapPositionChangeListener onSnapPositionChangeListener, @NotNull OnScrollFinishedListener onScrollFinishedListener, Integer num) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(snapHelper, "snapHelper");
        Intrinsics.checkNotNullParameter(onSnapPositionChangeListener, "onSnapPositionChangeListener");
        Intrinsics.checkNotNullParameter(onScrollFinishedListener, "onScrollFinishedListener");
        recyclerView.setOnFlingListener(null);
        snapHelper.attachToRecyclerView(recyclerView);
        CenterOnScrollListener centerOnScrollListener = new CenterOnScrollListener(onSnapPositionChangeListener, onScrollFinishedListener);
        if (num != null) {
            centerOnScrollListener.setSnapPosition(num.intValue());
        }
        recyclerView.addOnScrollListener(centerOnScrollListener);
    }

    public static /* synthetic */ void attachSnapHelperWithListener$default(RecyclerView recyclerView, D d11, OnSnapPositionChangeListener onSnapPositionChangeListener, OnScrollFinishedListener onScrollFinishedListener, Integer num, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        attachSnapHelperWithListener(recyclerView, d11, onSnapPositionChangeListener, onScrollFinishedListener, num);
    }
}
