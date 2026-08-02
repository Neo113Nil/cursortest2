package com.vk.clips.sdk.shared.feed.recycler.manager;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.sdk.shared.feed.recycler.adapter.b;
import com.vk.stat.recycler.Measurement;
import com.vk.stat.recycler.d;
import kotlin.NoWhenBranchMatchedException;
import xsna.t5;
import xsna.z0h0;

/* compiled from: ClipsFeedLinearLayoutManager.kt */
/* loaded from: classes17.dex */
public final class ClipsFeedLinearLayoutManager extends StartPositionLayoutManager {
    public final d s;
    public t5 t;

    public ClipsFeedLinearLayoutManager(Context context, d dVar) {
        this.r = new z0h0(5);
        this.s = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        String str;
        d dVar = this.s;
        dVar.a();
        super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
        int itemViewType = getItemViewType(view);
        ClipFeedAdapter.ViewType viewType = (ClipFeedAdapter.ViewType) ClipFeedAdapter.ViewType.h().get(itemViewType);
        Measurement.Type type = Measurement.Type.Layout;
        switch (b.$EnumSwitchMapping$0[viewType.ordinal()]) {
            case 1:
                str = "type_clip";
                break;
            case 2:
                str = "type_clip_controls";
                break;
            case 3:
                str = "type_ad";
                break;
            case 4:
                str = "type_static_ad";
                break;
            case 5:
                str = "type_market_ad";
                break;
            case 6:
                str = "type_ad_controls";
                break;
            case 7:
                str = "type_music_template";
                break;
            case 8:
                str = "type_live";
                break;
            case 9:
                str = "type_block_external_nps";
                break;
            case 10:
                str = "type_pagination_loading";
                break;
            case 11:
                str = "type_pagination_error";
                break;
            case 12:
                str = "type_pagination_empty";
                break;
            case 13:
                str = "type_shops_grid_block";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        dVar.b(itemViewType, type, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(View view, int i, int i2) {
        String str;
        d dVar = this.s;
        dVar.a();
        super.measureChildWithMargins(view, i, i2);
        int itemViewType = getItemViewType(view);
        ClipFeedAdapter.ViewType viewType = (ClipFeedAdapter.ViewType) ClipFeedAdapter.ViewType.h().get(itemViewType);
        Measurement.Type type = Measurement.Type.Measure;
        switch (b.$EnumSwitchMapping$0[viewType.ordinal()]) {
            case 1:
                str = "type_clip";
                break;
            case 2:
                str = "type_clip_controls";
                break;
            case 3:
                str = "type_ad";
                break;
            case 4:
                str = "type_static_ad";
                break;
            case 5:
                str = "type_market_ad";
                break;
            case 6:
                str = "type_ad_controls";
                break;
            case 7:
                str = "type_music_template";
                break;
            case 8:
                str = "type_live";
                break;
            case 9:
                str = "type_block_external_nps";
                break;
            case 10:
                str = "type_pagination_loading";
                break;
            case 11:
                str = "type_pagination_error";
                break;
            case 12:
                str = "type_pagination_empty";
                break;
            case 13:
                str = "type_shops_grid_block";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        dVar.b(itemViewType, type, str);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o(RecyclerView.a0 a0Var, int[] iArr) {
        iArr[1] = getHeight() - 1;
        iArr[0] = getHeight() - 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        t5 t5Var = this.t;
        if (t5Var != null) {
            t5Var.invoke();
        }
    }
}
