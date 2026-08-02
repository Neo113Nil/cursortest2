package ru.ozon.app.android.ordertracking.v4.presentation.util;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/MarqueeItemVisibilityCallback;", "", "", "isScrolling", "Landroidx/recyclerview/widget/RecyclerView$C;", "currentHolder", "", "onScrollingStateChanged", "(ZLandroidx/recyclerview/widget/RecyclerView$C;)V", "newHolder", "previousHolder", "onMostVisibleHolderChanged", "(Landroidx/recyclerview/widget/RecyclerView$C;Landroidx/recyclerview/widget/RecyclerView$C;)V", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface MarqueeItemVisibilityCallback {
    void onMostVisibleHolderChanged(@NotNull RecyclerView.C newHolder, RecyclerView.C previousHolder);

    void onScrollingStateChanged(boolean isScrolling, RecyclerView.C currentHolder);
}
