package com.vk.profile.community.members.impl;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.members.api.CommunityMembersComponent;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import xsna.b7m;
import xsna.e7m;
import xsna.fkq0;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CommunityMembersComponentImpl.kt */
/* loaded from: classes5.dex */
public final class CommunityMembersComponentImpl implements CommunityMembersComponent {

    /* compiled from: CommunityMembersComponentImpl.kt */
    public static final class a implements b7m<CommunityMembersComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CommunityMembersComponentImpl();
        }
    }

    @Override // com.vk.profile.community.members.api.CommunityMembersComponent
    public final Fragment x1(long j, CommunityMembersFilter communityMembersFilter) {
        MviMembersListFragment.a aVar = MviMembersListFragment.T;
        gzs<s3q0> gzsVar = fkq0.a;
        UserId userId = new UserId(j);
        aVar.getClass();
        MviMembersListFragment mviMembersListFragment = new MviMembersListFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("gid", userId);
        bundle.putSerializable("filter", communityMembersFilter);
        mviMembersListFragment.setArguments(bundle);
        return mviMembersListFragment;
    }
}
