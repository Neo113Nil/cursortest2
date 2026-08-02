package com.vk.photos.root.albums.presentation.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import xsna.cn70;
import xsna.dhk0;
import xsna.f4m;
import xsna.fnj;
import xsna.iah0;
import xsna.jgu;
import xsna.vif0;
import xsna.zoj0;

/* compiled from: AlbumsListSkeletonView.kt */
/* loaded from: classes4.dex */
public final class AlbumsListSkeletonView extends RecyclerView {

    /* compiled from: AlbumsListSkeletonView.kt */
    /* renamed from: com.vk.photos.root.albums.presentation.skeleton.AlbumsListSkeletonView$1, reason: invalid class name */
    public final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollVertically() {
            return false;
        }
    }

    /* compiled from: AlbumsListSkeletonView.kt */
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
            return new com.vk.photos.root.albums.presentation.skeleton.a(R.layout.album_skeleton_item, this.e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumsListSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            int i = AlbumsFragment.j0;
            setLayoutManager(new GridLayoutManager(AlbumsFragment.b.a(context)));
            addItemDecoration(new jgu(AlbumsFragment.b.a(context), cn70.b(8), false, 0));
            f4m.l(cn70.b(16), cn70.b(16), this);
            setNestedScrollingEnabled(false);
        } else {
            setLayoutManager(new AnonymousClass1());
            addItemDecoration(new dhk0(0, 0, 0, cn70.b(8)));
        }
        a aVar = new a(context);
        ArrayList arrayList = new ArrayList(6);
        for (int i2 = 0; i2 < 6; i2++) {
            arrayList.add(null);
        }
        aVar.setItems(arrayList);
        setAdapter(aVar);
    }
}
