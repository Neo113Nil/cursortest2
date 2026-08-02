package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import xsna.ggz;

/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes12.dex */
public final class b implements ggz {

    @NonNull
    public final RecyclerView.Adapter b;

    public b(@NonNull RecyclerView.Adapter adapter) {
        this.b = adapter;
    }

    @Override // xsna.ggz
    @SuppressLint({"UnknownNullness"})
    public final void onChanged(int i, int i2, Object obj) {
        this.b.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // xsna.ggz
    public final void onInserted(int i, int i2) {
        this.b.notifyItemRangeInserted(i, i2);
    }

    @Override // xsna.ggz
    public final void onMoved(int i, int i2) {
        this.b.notifyItemMoved(i, i2);
    }

    @Override // xsna.ggz
    public final void onRemoved(int i, int i2) {
        this.b.notifyItemRangeRemoved(i, i2);
    }
}
