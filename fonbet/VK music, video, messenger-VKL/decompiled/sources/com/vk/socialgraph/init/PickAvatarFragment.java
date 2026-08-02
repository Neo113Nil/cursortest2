package com.vk.socialgraph.init;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.auth.main.j;
import com.vk.imageloader.view.VKImageView;
import com.vk.socialgraph.SocialGraphOpenParams;
import com.vk.socialgraph.SocialGraphStrategy;
import com.vk.socialgraph.SocialStatSender;
import com.vk.socialgraph.a;
import com.vk.socialgraph.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import kotlin.collections.builders.ListBuilder;
import xsna.bwt0;
import xsna.dd80;
import xsna.e750;
import xsna.k1;
import xsna.o25;
import xsna.ozg0;
import xsna.x01;

/* compiled from: PickAvatarFragment.kt */
/* loaded from: classes5.dex */
public final class PickAvatarFragment extends BaseSocialGraphInitFragment {
    public static final /* synthetic */ int P = 0;
    public VKImageView O;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 13 || i2 != -1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        Uri uri = intent != null ? (Uri) intent.getParcelableExtra("output") : null;
        if (uri != null) {
            VKImageView vKImageView = this.O;
            (vKImageView != null ? vKImageView : null).load(uri.toString());
            ozg0.a().k(uri, o25.a().c());
            j jVar = dd80.u;
            if (jVar != null) {
                jVar.k(SocialStatSender.Screen.AVATAR, SocialStatSender.Status.DEFAULT);
            }
            a aVar = dd80.t;
            if (aVar != null) {
                aVar.d(SocialGraphStrategy.Screen.AVATAR, new SocialGraphOpenParams(SocialGraphOpenParams.OpenAction.AFTER_RESULT_SUCCESS), false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.social_graph_pick_avatar_fragment, viewGroup, false);
    }

    @Override // com.vk.socialgraph.init.BaseSocialGraphInitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.O = (VKImageView) view.findViewById(R.id.avatar_image_view);
        view.findViewById(R.id.big_icon).setOnClickListener(new x01(this, 4));
        view.findViewById(R.id.pick_avatar_button).setOnClickListener(new k1(this, 10));
        bwt0.i0(view.findViewById(R.id.skip), new e750(this, 4));
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        ListBuilder listBuilder = b.a;
        return b.a(SocialGraphStrategy.Screen.AVATAR, false);
    }
}
