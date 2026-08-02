package com.vk.photos.root.photoflow.settings.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cn70;
import xsna.dhk0;
import xsna.tf3;
import xsna.vif0;
import xsna.zoj0;

/* compiled from: PhotoFlowSettingsListSkeletonView.kt */
/* loaded from: classes4.dex */
public final class PhotoFlowSettingsListSkeletonView extends RecyclerView {

    /* compiled from: PhotoFlowSettingsListSkeletonView.kt */
    public final class a extends zoj0<Object, vif0<Object>> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return i == 0 ? R.layout.item_pfs_header : R.layout.photo_flow_settings_skeleton_item;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new com.vk.photos.root.photoflow.settings.presentation.view.a(tf3.b(viewGroup, i, viewGroup, false));
        }
    }

    public PhotoFlowSettingsListSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager());
        a aVar = new a();
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(null);
        }
        aVar.setItems(arrayList);
        setAdapter(aVar);
        addItemDecoration(new dhk0(cn70.b(16), 0, cn70.b(16), 0));
    }
}
