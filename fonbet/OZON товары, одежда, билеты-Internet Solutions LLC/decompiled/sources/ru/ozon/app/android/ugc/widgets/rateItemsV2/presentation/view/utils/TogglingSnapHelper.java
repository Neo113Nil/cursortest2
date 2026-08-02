package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\n\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/utils/TogglingSnapHelper;", "Landroidx/recyclerview/widget/s;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "Landroid/view/View;", "findSnapView", "(Landroidx/recyclerview/widget/RecyclerView$o;)Landroid/view/View;", "", "ignoreNextSnap", "", "Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TogglingSnapHelper extends s {
    private boolean ignoreNextSnap;

    @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.D
    public View findSnapView(RecyclerView.o layoutManager) {
        if (!this.ignoreNextSnap) {
            return super.findSnapView(layoutManager);
        }
        this.ignoreNextSnap = false;
        return null;
    }

    public final void ignoreNextSnap() {
        this.ignoreNextSnap = true;
    }
}
