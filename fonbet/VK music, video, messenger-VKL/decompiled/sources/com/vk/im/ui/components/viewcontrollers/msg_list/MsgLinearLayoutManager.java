package com.vk.im.ui.components.viewcontrollers.msg_list;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.stat.recycler.Measurement;
import com.vk.stat.recycler.d;
import java.util.Iterator;

/* compiled from: MsgLinearLayoutManager.kt */
/* loaded from: classes2.dex */
public final class MsgLinearLayoutManager extends LinearLayoutManager {
    public final d r;

    public MsgLinearLayoutManager(Context context, d dVar) {
        super(1, false);
        this.r = dVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < v()) != this.f ? -1 : 1;
        return this.b == 0 ? new PointF(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        Object obj;
        d dVar = this.r;
        if (dVar != null) {
            dVar.a();
        }
        super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
        int itemViewType = getItemViewType(view);
        if (dVar != null) {
            Measurement.Type type = Measurement.Type.Layout;
            Iterator<E> it = AdapterEntryType.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((AdapterEntryType) obj).h() == itemViewType) {
                        break;
                    }
                }
            }
            AdapterEntryType adapterEntryType = (AdapterEntryType) obj;
            dVar.b(itemViewType, type, adapterEntryType != null ? adapterEntryType.name() : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(View view, int i, int i2) {
        Object obj;
        d dVar = this.r;
        if (dVar != null) {
            dVar.a();
        }
        super.measureChildWithMargins(view, i, i2);
        int itemViewType = getItemViewType(view);
        if (dVar != null) {
            Measurement.Type type = Measurement.Type.Measure;
            Iterator<E> it = AdapterEntryType.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((AdapterEntryType) obj).h() == itemViewType) {
                        break;
                    }
                }
            }
            AdapterEntryType adapterEntryType = (AdapterEntryType) obj;
            dVar.b(itemViewType, type, adapterEntryType != null ? adapterEntryType.name() : null);
        }
    }
}
