package com.vk.newsfeed.impl.feedlikes;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.aq2;
import xsna.gm6;
import xsna.gmp;
import xsna.i1r;
import xsna.oq;
import xsna.tlo0;
import xsna.y8g0;

/* compiled from: FeedLikesPhotoFragment.kt */
/* loaded from: classes4.dex */
public final class FeedLikesPhotoFragment extends BasePhotoListFragment<Object> {
    public final i1r n0;

    /* compiled from: FeedLikesPhotoFragment.kt */
    public static final class a extends BasePhotoListFragment.a {
        public a() {
            super(UserId.d, FeedLikesPhotoFragment.class);
            y("feed_likes");
        }
    }

    public FeedLikesPhotoFragment() {
        i1r i1rVar = new i1r(this);
        i1rVar.l = 1;
        this.n0 = i1rVar;
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseMvpFragment
    public final gm6 io() {
        return this.n0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String e = y8g0.e(R.string.sett_reactions);
        VkTopBar vkTopBar = this.X;
        if (vkTopBar != null) {
            VkTopBar.Middle.Text.c cVar = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, e), null, null, null, null, 30), cVar, objArr, objArr2, 14));
        }
        VkTopBar vkTopBar2 = this.X;
        if (vkTopBar2 != null) {
            aq2 aq2Var = this.Y;
            if (aq2Var == null) {
                aq2Var = null;
            }
            RecyclerView recyclerView = aq2Var.getRecyclerView();
            if (recyclerView != null) {
                vkTopBar2.setOnClickListener(new gmp(new WeakReference(recyclerView), 9));
            }
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final int qo() {
        return po().getItemCount();
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    /* renamed from: ro */
    public final Object io() {
        return this.n0;
    }
}
