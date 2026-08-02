package com.vk.profile.community.details.impl.invitelink;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.dto.common.id.UserId;
import com.vk.lists.DefaultErrorView;
import com.vk.profile.community.details.api.invitelink.data.dto.CommunityInviteLink;
import com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkFragment;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.SimpleTimeZone;
import kotlin.LazyThreadSafetyMode;
import xsna.cpu;
import xsna.dc6;
import xsna.dkg;
import xsna.epx;
import xsna.f4m;
import xsna.fnj;
import xsna.fpf0;
import xsna.iah0;
import xsna.jjc;
import xsna.kbj0;
import xsna.la;
import xsna.m7m;
import xsna.msy;
import xsna.oz50;
import xsna.pvo0;
import xsna.qjc;
import xsna.r9e;
import xsna.u1u0;
import xsna.wm1;
import xsna.xa80;
import xsna.zqu;

/* compiled from: CommunityInviteLinkFragment.kt */
/* loaded from: classes5.dex */
public final class CommunityInviteLinkFragment extends BaseMvpFragment<com.vk.profile.community.details.impl.invitelink.a> implements dc6 {
    public static final /* synthetic */ int e0 = 0;
    public ProgressBar T;
    public ViewGroup U;
    public ViewGroup V;
    public TextView W;
    public TextView X;
    public TextView Y;
    public TextView Z;
    public DefaultErrorView a0;
    public CommunityInviteLink c0;
    public UserId b0 = UserId.d;
    public final Object d0 = msy.a(LazyThreadSafetyMode.NONE, new wm1(this, 25));

    /* compiled from: CommunityInviteLinkFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(CommunityInviteLinkFragment.class, null, null);
            this.j.putParcelable("group_id", userId);
        }
    }

    public final void jo(CommunityInviteLink communityInviteLink) {
        Resources resources;
        String str;
        int i = communityInviteLink.h;
        this.c0 = communityInviteLink;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        long j = communityInviteLink.g;
        if (j > 0) {
            int i2 = (int) j;
            FragmentActivity activity = getActivity();
            Resources resources2 = activity != null ? activity.getResources() : null;
            SimpleTimeZone simpleTimeZone = pvo0.a;
            if (resources2 == null || i2 < 0) {
                str = null;
            } else if (i2 > 86400) {
                int i3 = i2 / 86400;
                str = resources2.getQuantityString(R.plurals.days, i3, Integer.valueOf(i3));
            } else if (i2 > 3600) {
                int i4 = i2 / 3600;
                str = resources2.getQuantityString(R.plurals.hours, i4, Integer.valueOf(i4));
            } else if (i2 > 60) {
                int i5 = i2 / 60;
                str = resources2.getQuantityString(R.plurals.minutes, i5, Integer.valueOf(i5));
            } else {
                str = resources2.getString(R.string.date_ago_second_compact, Integer.valueOf(i2));
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (i > 0) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            FragmentActivity activity2 = getActivity();
            spannableStringBuilder.append((CharSequence) ((activity2 == null || (resources = activity2.getResources()) == null) ? null : resources.getQuantityString(R.plurals.invite_link_usage, i, Integer.valueOf(communityInviteLink.i), Integer.valueOf(i))));
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) " · ");
        }
        int length = spannableStringBuilder.length();
        FragmentActivity activity3 = getActivity();
        spannableStringBuilder.append((CharSequence) (activity3 != null ? activity3.getString(R.string.manage_invite_link) : null));
        b bVar = new b();
        bVar.b = true;
        spannableStringBuilder.setSpan(bVar, length, spannableStringBuilder.length(), 33);
        kbj0 h8 = ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).h8();
        TextView textView = this.X;
        if (textView == null) {
            textView = null;
        }
        jjc.g(textView, new r9e(h8, this, communityInviteLink, 2));
        TextView textView2 = this.Z;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(spannableStringBuilder);
        TextView textView3 = this.W;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(communityInviteLink.e);
        ProgressBar progressBar = this.T;
        if (progressBar == null) {
            progressBar = null;
        }
        f4m.j(progressBar);
        ViewGroup viewGroup = this.U;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = this.V;
        (viewGroup2 != null ? viewGroup2 : null).setVisibility(0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent == null) {
            return;
        }
        if (i == 1) {
            CommunityInviteLink communityInviteLink = (CommunityInviteLink) intent.getParcelableExtra("link");
            if (communityInviteLink == null) {
                return;
            }
            jo(communityInviteLink);
            return;
        }
        if (i != 2) {
            return;
        }
        CommunityInviteLink communityInviteLink2 = (CommunityInviteLink) intent.getParcelableExtra("link");
        if (communityInviteLink2 != null) {
            CommunityInviteLink communityInviteLink3 = this.c0;
            if (!epx.f(communityInviteLink3 != null ? communityInviteLink3.b : null, communityInviteLink2.b)) {
                return;
            }
        }
        com.vk.profile.community.details.impl.invitelink.a aVar = (com.vk.profile.community.details.impl.invitelink.a) this.S;
        if (aVar != null) {
            aVar.refresh();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        UserId userId;
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("group_id")) == null) {
            userId = UserId.d;
        }
        this.b0 = userId;
        this.S = new com.vk.profile.community.details.impl.invitelink.a(this, userId, new zqu());
        Context context = layoutInflater.getContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(context);
        View inflate = layoutInflater.inflate(R.layout.community_invite_link_fragment, viewGroup, false);
        this.T = (ProgressBar) inflate.findViewById(R.id.progressBar);
        this.U = (ViewGroup) inflate.findViewById(R.id.linkLayout);
        this.V = (ViewGroup) inflate.findViewById(R.id.bottomButtons);
        this.W = (TextView) inflate.findViewById(R.id.linkTextView);
        this.X = (TextView) inflate.findViewById(R.id.shareLinkButton);
        this.Y = (TextView) inflate.findViewById(R.id.showAllLinksButton);
        this.Z = (TextView) inflate.findViewById(R.id.usageTextView);
        DefaultErrorView defaultErrorView = (DefaultErrorView) inflate.findViewById(R.id.error_view);
        this.a0 = defaultErrorView;
        defaultErrorView.setRetryClickListener(new xa80() { // from class: xsna.b6h
            @Override // xsna.xa80
            public final void b() {
                int i = CommunityInviteLinkFragment.e0;
                CommunityInviteLinkFragment communityInviteLinkFragment = CommunityInviteLinkFragment.this;
                com.vk.profile.community.details.impl.invitelink.a aVar = (com.vk.profile.community.details.impl.invitelink.a) communityInviteLinkFragment.S;
                if (aVar != null) {
                    aVar.refresh();
                }
                DefaultErrorView defaultErrorView2 = communityInviteLinkFragment.a0;
                if (defaultErrorView2 == null) {
                    defaultErrorView2 = null;
                }
                f4m.j(defaultErrorView2);
            }
        });
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        if (!d) {
            u1u0.k(toolbar, R.drawable.vk_icon_cancel_outline_28, R.string.accessibility_close);
            toolbar.setNavigationOnClickListener(new la(this, 4));
        }
        toolbar.setTitle(R.string.group_invite_by_link);
        TextView textView = this.Y;
        if (textView == null) {
            textView = null;
        }
        jjc.g(textView, new dkg(this, 3));
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.vk.profile.community.details.impl.invitelink.a aVar = (com.vk.profile.community.details.impl.invitelink.a) this.S;
        if (aVar != null) {
            aVar.refresh();
        }
    }

    /* compiled from: CommunityInviteLinkFragment.kt */
    public static final class b extends qjc {
        public b() {
            super(null);
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.rku0
        public final void f(Context context, View view) {
            int i = CommunityInviteLinkFragment.e0;
            CommunityInviteLinkFragment communityInviteLinkFragment = CommunityInviteLinkFragment.this;
            ((cpu) communityInviteLinkFragment.d0.getValue()).j(communityInviteLinkFragment, communityInviteLinkFragment.b0, (r19 & 4) != 0 ? null : "/community_manage/?action=open_page&page_id=create_invite_link&group_id=" + communityInviteLinkFragment.b0, (r19 & 8) != 0 ? null : null, (r19 & 16) != 0 ? null : 1, (r19 & 32) != 0 ? null : null, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
        }

        @Override // xsna.rku0
        public final void a(Context context, View view) {
        }
    }
}
