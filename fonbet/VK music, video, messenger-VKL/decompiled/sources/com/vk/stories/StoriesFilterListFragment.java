package com.vk.stories;

import android.os.Bundle;
import android.view.View;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.user.UserProfile;
import com.vk.feed.settings.impl.base.fragment.FilterListFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.fes;
import xsna.hg1;
import xsna.iah0;
import xsna.ies;
import xsna.iwg0;
import xsna.kwg0;
import xsna.lva0;
import xsna.lwt;
import xsna.msy;
import xsna.oz50;
import xsna.su80;
import xsna.tlo0;
import xsna.tq;
import xsna.xsl0;
import xsna.yul;

/* compiled from: StoriesFilterListFragment.kt */
/* loaded from: classes6.dex */
public final class StoriesFilterListFragment extends FilterListFragment implements fes, ies {
    public static final /* synthetic */ int T0 = 0;
    public final Object S0 = msy.a(LazyThreadSafetyMode.NONE, new lva0(this, 24));

    /* compiled from: StoriesFilterListFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(StoriesFilterListFragment.class, null, null);
        }
    }

    @Override // com.vk.feed.settings.impl.base.fragment.FilterListFragment, com.vkontakte.android.fragments.base.SegmenterFragment
    public final int Jo() {
        return 1;
    }

    @Override // com.vk.feed.settings.impl.base.fragment.FilterListFragment
    public final lwt Mo() {
        return new lwt("stories.getBanned");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.feed.settings.impl.base.fragment.FilterListFragment
    public final void No(UserProfile userProfile) {
        io.reactivex.rxjava3.core.a l = hg1.l(((xsl0) this.S0.getValue()).d(userProfile.c), kn(), 62);
        yul yulVar = new yul(1, this, userProfile);
        int i = kwg0.a;
        hg1.a(l.subscribe(yulVar, new iwg0()), this);
    }

    @Override // xsna.fes
    public final boolean df() {
        if (getActivity() != null) {
            return !iah0.n(r0);
        }
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        to(R.layout.appkit_loader_fragment_no_shadow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vkontakte.android.fragments.base.SegmenterFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        VkTopBar vkTopBar = new VkTopBar(requireContext(), null, 6, 0);
        if (!this.U) {
            vkTopBar.setBack(new VkTopBar.b(new su80(this, 26), tq.h(tlo0.Companion, R.string.accessibility_back), null, null, null, 28));
        }
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.hidden_from_stories), null, null, null, null, 30), cVar, objArr, objArr2, 14));
        jo(vkTopBar);
    }
}
