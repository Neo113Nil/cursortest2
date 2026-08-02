package com.vk.newsfeed.impl.posting.viewpresenter.settings.community;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.bwt0;
import xsna.cn70;
import xsna.f4m;
import xsna.qlc0;
import xsna.r2j0;
import xsna.wmc;

/* compiled from: PostingSettingsCommunityView.kt */
/* loaded from: classes4.dex */
public final class PostingSettingsCommunityView extends FrameLayout {
    public final qlc0 b;
    public a c;

    /* compiled from: PostingSettingsCommunityView.kt */
    public interface a {
    }

    public PostingSettingsCommunityView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        RecyclerView recyclerView = new RecyclerView(context);
        qlc0 qlc0Var = new qlc0(new wmc(1, this, PostingSettingsCommunityView.class, "onItemClick", "onItemClick(Lcom/vk/newsfeed/api/posting/viewpresenter/settings/community/PostingSettingsCommunityItem;)V", 0, 6));
        this.b = qlc0Var;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(qlc0Var);
        recyclerView.setClipToPadding(false);
        f4m.l(cn70.b(16), cn70.b(16), recyclerView);
        recyclerView.addItemDecoration(new r2j0());
        addView(recyclerView);
        bwt0.c0(cn70.b(44), recyclerView);
    }

    public final void setCallback(a aVar) {
        this.c = aVar;
    }
}
