package com.vk.newsfeed.impl.feed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.lists.AbstractPaginatedView;
import kotlin.Pair;
import xsna.h9n;
import xsna.i9n;
import xsna.j9n;

/* compiled from: DiscoverMediaRecyclerPaginatedViewV2.kt */
/* loaded from: classes4.dex */
public class DiscoverMediaRecyclerPaginatedViewV2 extends FeedRecyclerPaginatedViewErrorRedesign {
    public DiscoverMediaRecyclerPaginatedViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View h(Context context) {
        AbstractPaginatedView.l lVar = new AbstractPaginatedView.l(context);
        Pair a = j9n.a(context);
        RecyclerView recyclerView = (RecyclerView) a.d();
        ThemableShimmer themableShimmer = (ThemableShimmer) a.g();
        if (recyclerView.isAttachedToWindow()) {
            themableShimmer.b();
        } else {
            recyclerView.addOnAttachStateChangeListener(new h9n(recyclerView, themableShimmer));
        }
        if (recyclerView.isAttachedToWindow()) {
            recyclerView.addOnAttachStateChangeListener(new i9n(recyclerView, themableShimmer));
        } else {
            themableShimmer.c();
        }
        lVar.addView(recyclerView);
        lVar.setLayoutParams(g());
        return lVar;
    }
}
