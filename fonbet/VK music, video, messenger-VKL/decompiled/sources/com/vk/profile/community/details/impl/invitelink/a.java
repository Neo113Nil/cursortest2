package com.vk.profile.community.details.impl.invitelink;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.vk.dto.common.id.UserId;
import com.vk.lists.DefaultErrorView;
import io.reactivex.rxjava3.disposables.c;
import xsna.f4m;
import xsna.ga;
import xsna.gm6;
import xsna.ha;
import xsna.ia;
import xsna.nr;
import xsna.rsg0;
import xsna.sn;
import xsna.tfx;
import xsna.wzf;
import xsna.yfb;
import xsna.zqu;

/* compiled from: CommunityInviteLinkContract.kt */
/* loaded from: classes5.dex */
public final class a implements gm6 {
    public final CommunityInviteLinkFragment b;
    public final UserId c;
    public final zqu d;

    public a(CommunityInviteLinkFragment communityInviteLinkFragment, UserId userId, zqu zquVar) {
        this.b = communityInviteLinkFragment;
        this.c = userId;
        this.d = zquVar;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void refresh() {
        CommunityInviteLinkFragment communityInviteLinkFragment = this.b;
        DefaultErrorView defaultErrorView = communityInviteLinkFragment.a0;
        if (defaultErrorView == null) {
            defaultErrorView = null;
        }
        f4m.j(defaultErrorView);
        ViewGroup viewGroup = communityInviteLinkFragment.U;
        if (viewGroup == null) {
            viewGroup = null;
        }
        f4m.j(viewGroup);
        ViewGroup viewGroup2 = communityInviteLinkFragment.V;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        f4m.j(viewGroup2);
        ProgressBar progressBar = communityInviteLinkFragment.T;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(0);
        this.d.getClass();
        tfx tfxVar = new tfx("groups.getSuitableInviteLink", new sn(22), new nr(15));
        tfx.n(tfxVar, "group_id", this.c, 1L, 0L, 8);
        c subscribe = rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new ga(new wzf(this, 2), 20), new ia(new ha(this, 22), 19));
        if (subscribe != null) {
            communityInviteLinkFragment.eo(subscribe);
        }
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
