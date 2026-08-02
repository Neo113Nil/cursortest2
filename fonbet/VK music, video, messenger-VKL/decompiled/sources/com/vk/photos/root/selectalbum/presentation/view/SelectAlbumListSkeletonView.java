package com.vk.photos.root.selectalbum.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cn70;
import xsna.dhk0;
import xsna.vif0;
import xsna.zoj0;

/* compiled from: SelectAlbumListSkeletonView.kt */
/* loaded from: classes4.dex */
public final class SelectAlbumListSkeletonView extends RecyclerView {
    public SelectAlbumListSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager());
        a aVar = new a(context);
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(null);
        }
        aVar.setItems(arrayList);
        setAdapter(aVar);
        addItemDecoration(new dhk0(cn70.b(16), 0, cn70.b(16), cn70.b(12)));
    }

    /* compiled from: SelectAlbumListSkeletonView.kt */
    public final class a extends zoj0<Object, vif0<Object>> {
        public final /* synthetic */ Context e;

        public a(Context context) {
            this.e = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            Context context = this.e;
            return i == 0 ? new com.vk.photos.root.selectalbum.presentation.view.a(R.layout.select_album_header_item, context) : new b(R.layout.select_album_skeleton_item, context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return i;
        }
    }
}
