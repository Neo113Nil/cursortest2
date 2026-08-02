package com.vk.video.ui.discovery.minimizable.dialog.related_videos.recycler;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo;
import java.util.ArrayList;
import java.util.List;
import xsna.jnr;

/* compiled from: RelatedVideosRecyclerView.kt */
/* loaded from: classes7.dex */
public final class RelatedVideosRecyclerView extends RecyclerView implements jnr {
    public boolean b;
    public boolean c;

    public RelatedVideosRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // xsna.jnr
    public List<TouchActionInfo.Direction> getAllowedScrollDirections() {
        ArrayList arrayList = new ArrayList(TouchActionInfo.Direction.h());
        if (!this.b) {
            arrayList.remove(TouchActionInfo.Direction.Up);
        }
        if (!this.c) {
            arrayList.remove(TouchActionInfo.Direction.Down);
        }
        return arrayList;
    }

    public final void setScrolledToFirstItem(boolean z) {
        this.b = z;
    }

    public final void setScrolledToLastItem(boolean z) {
        this.c = z;
    }
}
