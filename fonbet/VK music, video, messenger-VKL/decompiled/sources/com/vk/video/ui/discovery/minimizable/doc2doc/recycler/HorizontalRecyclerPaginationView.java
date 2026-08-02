package com.vk.video.ui.discovery.minimizable.doc2doc.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.z6s;

/* compiled from: HorizontalRecyclerPaginationView.kt */
/* loaded from: classes7.dex */
public final class HorizontalRecyclerPaginationView extends RecyclerPaginatedView {

    /* compiled from: HorizontalRecyclerPaginationView.kt */
    public static final class a extends AbstractPaginatedView.h {
    }

    public HorizontalRecyclerPaginationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, this);
        dVar.f = 0;
        dVar.a();
        setFooterLoadingViewProvider(z6s.a);
        setFooterErrorViewProvider(z6s.b);
        this.o = true;
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.horizontal_recycler_view, (ViewGroup) this, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
        this.x = recyclerView;
        recyclerView.setHasFixedSize(false);
        this.x.setItemAnimator(null);
        this.w = new a();
        return inflate;
    }
}
