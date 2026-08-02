package com.vk.posting.presentation.video.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.lists.AbstractPaginatedView;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.bg0;
import xsna.bwt0;
import xsna.cn70;
import xsna.d2t0;
import xsna.f5z;
import xsna.gm50;
import xsna.k170;
import xsna.kv3;
import xsna.n7b0;
import xsna.w0v0;

/* compiled from: SearchVideoPickerView.kt */
/* loaded from: classes5.dex */
public final class g implements gm50 {
    public final Context b;
    public final SearchVideoPickerFragment c;
    public final f5z d;
    public final View e;
    public final VkInputSelect f;
    public final View g;
    public final UsableRecyclerPaginatedView h;
    public final d2t0 i;

    public g(Context context, f5z f5zVar, SearchVideoPickerFragment searchVideoPickerFragment) {
        this.b = context;
        this.c = searchVideoPickerFragment;
        this.d = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_search_video_picker, (ViewGroup) null);
        this.e = inflate;
        VkInputSelect vkInputSelect = (VkInputSelect) inflate.findViewById(R.id.search_input);
        this.f = vkInputSelect;
        View findViewById = inflate.findViewById(R.id.search_clear);
        this.g = findViewById;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        this.h = usableRecyclerPaginatedView;
        d2t0 d2t0Var = new d2t0(new f(this));
        this.i = d2t0Var;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        usableRecyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, usableRecyclerPaginatedView).a();
        usableRecyclerPaginatedView.setAdapter(d2t0Var);
        usableRecyclerPaginatedView.setSwipeRefreshEnabled(true);
        usableRecyclerPaginatedView.getRecyclerView().setPadding(0, 0, 0, cn70.b(16));
        usableRecyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        toolbar.setNavigationOnClickListener(new bg0(this, 13));
        bwt0.i0(findViewById, new k170(this, 23));
        vkInputSelect.g.addTextChangedListener(new w0v0(new n7b0(this, 3)));
        vkInputSelect.post(new kv3(this, 19));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
