package com.vk.photos.root.albumssettings.presentation.view;

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

/* compiled from: AlbumsSettingsListSkeletonView.kt */
/* loaded from: classes4.dex */
public final class AlbumsSettingsListSkeletonView extends RecyclerView {

    /* compiled from: AlbumsSettingsListSkeletonView.kt */
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
            return new com.vk.photos.root.albumssettings.presentation.view.a(R.layout.albums_settings_skeleton_item, this.e);
        }
    }

    public AlbumsSettingsListSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager());
        a aVar = new a(context);
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(null);
        }
        aVar.setItems(arrayList);
        setAdapter(aVar);
        addItemDecoration(new dhk0(cn70.b(16), 0, cn70.b(16), 0));
    }
}
