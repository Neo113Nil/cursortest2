package com.vk.photos.root.photoflow.tags.presentation.view;

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

/* compiled from: PhotoTagsListSkeletonView.kt */
/* loaded from: classes4.dex */
public final class PhotoTagsListSkeletonView extends RecyclerView {

    /* compiled from: PhotoTagsListSkeletonView.kt */
    /* renamed from: com.vk.photos.root.photoflow.tags.presentation.view.PhotoTagsListSkeletonView$1, reason: invalid class name */
    public final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollVertically() {
            return false;
        }
    }

    /* compiled from: PhotoTagsListSkeletonView.kt */
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
            return new com.vk.photos.root.photoflow.tags.presentation.view.a(R.layout.item_photo_with_tag_skeleton, this.e);
        }
    }

    public PhotoTagsListSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new AnonymousClass1());
        a aVar = new a(context);
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(null);
        }
        aVar.setItems(arrayList);
        setAdapter(aVar);
        addItemDecoration(new dhk0(0, cn70.b(8), 0, 0));
    }
}
