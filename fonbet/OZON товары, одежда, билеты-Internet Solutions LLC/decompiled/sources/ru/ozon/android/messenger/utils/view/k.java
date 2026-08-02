package ru.ozon.android.messenger.utils.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class k {
    public static void a(RecyclerView recyclerView, int i11, boolean z11, int i12) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (z11 || Math.abs(findLastVisibleItemPosition - i11) >= 20) {
                linearLayoutManager.scrollToPosition(i11);
            } else {
                recyclerView.smoothScrollToPosition(i11);
            }
        }
    }
}
