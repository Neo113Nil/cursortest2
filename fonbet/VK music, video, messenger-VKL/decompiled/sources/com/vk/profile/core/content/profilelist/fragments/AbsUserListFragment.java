package com.vk.profile.core.content.profilelist.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.base.GridFragment;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.atv0;
import xsna.ec;
import xsna.ekq0;
import xsna.h5;
import xsna.iah0;
import xsna.o0r0;
import xsna.vif0;
import xsna.xwk;

/* loaded from: classes5.dex */
public abstract class AbsUserListFragment extends GridFragment<UserProfile> {
    public static final /* synthetic */ int N0 = 0;
    public final ec L0;
    public final h5 M0;

    public class a extends GridFragment<UserProfile>.b<vif0<UserProfile>> {
        public a() {
            super();
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            int i3 = AbsUserListFragment.N0;
            return ((UserProfile) AbsUserListFragment.this.v0.get(i)).h;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            int i2 = AbsUserListFragment.N0;
            return ((UserProfile) AbsUserListFragment.this.v0.get(i)).c.b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            AbsUserListFragment absUserListFragment = AbsUserListFragment.this;
            ekq0 Mo = absUserListFragment.Mo(viewGroup);
            Mo.u = absUserListFragment.L0;
            Mo.t = absUserListFragment.M0;
            return Mo;
        }
    }

    public AbsUserListFragment() {
        super(50);
        this.L0 = new ec(this, 0);
        this.M0 = new h5(this, 1);
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final GridFragment<UserProfile>.b<?> Io() {
        a aVar = new a();
        aVar.setHasStableIds(false);
        return aVar;
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final int Ko() {
        int width;
        int i;
        UsableRecyclerView usableRecyclerView = this.n0;
        if (usableRecyclerView == null || (width = usableRecyclerView.getWidth()) <= 0) {
            return 1;
        }
        int paddingRight = width - (this.n0.getPaddingRight() + this.n0.getPaddingLeft());
        if (this.V >= 600) {
            i = iah0.a(this.U ? 160 : atv0.b);
        } else {
            i = paddingRight;
        }
        return paddingRight / i;
    }

    public ekq0 Mo(ViewGroup viewGroup) {
        return new ekq0(viewGroup, R.layout.user_item, false, false);
    }

    public void No(UserProfile userProfile) {
        xwk.e().m(getActivity(), userProfile.c, new o0r0.a());
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("no_autoload")) {
            if (this.f0) {
                oo();
            } else {
                qo();
            }
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("title")) {
            return;
        }
        setTitle(arguments.getString("title"));
    }
}
