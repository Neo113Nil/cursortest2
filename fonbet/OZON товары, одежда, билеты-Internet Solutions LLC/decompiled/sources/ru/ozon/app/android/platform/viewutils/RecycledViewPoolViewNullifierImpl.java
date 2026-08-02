package ru.ozon.app.android.platform.viewutils;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifierImpl;", "Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;", "<init>", "()V", "countIsChanged", "", "switchMaxRecycledViewInPoolToZero", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "itemViewType", "", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RecycledViewPoolViewNullifierImpl implements RecycledViewPoolViewNullifier {
    private boolean countIsChanged;

    @Override // ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifier
    public void switchMaxRecycledViewInPoolToZero(RecyclerView recyclerView, int itemViewType) {
        if (recyclerView == null || this.countIsChanged) {
            return;
        }
        recyclerView.getRecycledViewPool().setMaxRecycledViews(itemViewType, 0);
        this.countIsChanged = true;
    }
}
