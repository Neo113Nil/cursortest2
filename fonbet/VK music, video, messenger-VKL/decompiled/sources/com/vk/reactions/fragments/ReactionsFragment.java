package com.vk.reactions.fragments;

import android.R;
import android.content.res.Configuration;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.f;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.vk.api.likes.LikesGetList;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.VKTabLayout;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.lists.DefaultEmptyView;
import com.vk.reactions.fragments.AllReactionsTabFragment;
import com.vk.reactions.fragments.FriendsTabFragment;
import com.vk.reactions.fragments.ReactionsTabFragment;
import com.vk.reactions.fragments.SharesTabFragment;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.ai0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.by2;
import xsna.c2f0;
import xsna.e6f0;
import xsna.epx;
import xsna.fkq0;
import xsna.gxp;
import xsna.h3p0;
import xsna.h6f0;
import xsna.hai0;
import xsna.i6f0;
import xsna.i990;
import xsna.j03;
import xsna.j5g;
import xsna.k5f0;
import xsna.o25;
import xsna.oz50;
import xsna.qhh0;
import xsna.r4;
import xsna.r6f0;
import xsna.rl3;
import xsna.rtt;
import xsna.s3q0;
import xsna.t6g0;
import xsna.u1u0;
import xsna.uqm0;
import xsna.usn0;
import xsna.vid;
import xsna.vrl;

/* compiled from: ReactionsFragment.kt */
/* loaded from: classes.dex */
public class ReactionsFragment extends BaseMvpFragment<h6f0> implements i6f0, qhh0, TabLayout.d {
    public static final /* synthetic */ int j0 = 0;
    public Toolbar U;
    public AppBarShadowView V;
    public ViewPager W;
    public VKTabLayout X;
    public ProgressBar Y;
    public DefaultEmptyView Z;
    public View a0;
    public ViewGroup b0;
    public vid c0;
    public r6f0 e0;
    public final e6f0 T = new e6f0(this);
    public final b d0 = new b();
    public final HashMap<String, Integer> f0 = new HashMap<>();
    public final ArrayList<i990> g0 = new ArrayList<>();
    public final bpn0 h0 = new bpn0(new k5f0(0));
    public final c i0 = new c();

    /* compiled from: ReactionsFragment.kt */
    /* loaded from: classes5.dex */
    public final class b implements gxp {
        @Override // xsna.gxp
        public final by2 c(Throwable th) {
            j03.a.getClass();
            return new by2(j03.c(th), 14, null);
        }
    }

    /* compiled from: ReactionsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class c extends DataSetObserver {
        public c() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            r6f0 r6f0Var;
            TextView textView;
            VKImageView vKImageView;
            ReactionsFragment reactionsFragment = ReactionsFragment.this;
            VKTabLayout vKTabLayout = reactionsFragment.X;
            if (vKTabLayout != null) {
                r6f0 r6f0Var2 = reactionsFragment.e0;
                boolean z = false;
                if ((r6f0Var2 != null ? r6f0Var2.k.size() : 0) > 1) {
                    VKTabLayout vKTabLayout2 = reactionsFragment.X;
                    if (vKTabLayout2 != null) {
                        int tabCount = vKTabLayout2.getTabCount();
                        for (int i = 0; i < tabCount; i++) {
                            TabLayout.g b = vKTabLayout2.b(i);
                            if (b != null && (r6f0Var = reactionsFragment.e0) != null) {
                                ArrayList<i990> arrayList = r6f0Var.k;
                                View view = b.f;
                                if (view != null && (textView = (TextView) view.findViewById(R.id.text1)) != null && (vKImageView = (VKImageView) view.findViewById(com.vkontakte.android.R.id.icon)) != null) {
                                    i990 i990Var = (i990) j5g.b0(i, arrayList);
                                    view.setId(i990Var != null ? i990Var.c : -1);
                                    i990 i990Var2 = (i990) j5g.b0(i, arrayList);
                                    String str = i990Var2 != null ? i990Var2.d : null;
                                    if (!epx.f(b.c, str)) {
                                        textView.setText(str);
                                        bwt0.p0(textView, !(str == null || str.length() == 0));
                                    }
                                    i990 i990Var3 = (i990) j5g.b0(i, arrayList);
                                    Image image = i990Var3 != null ? i990Var3.e : null;
                                    if (image != null) {
                                        ImageSize Ab = image.Ab(r6f0.m, false);
                                        vKImageView.load(Ab != null ? Ab.d.d : null);
                                        bwt0.p0(vKImageView, true);
                                    } else {
                                        bwt0.p0(vKImageView, false);
                                    }
                                    b.h.setBackgroundResource(com.vkontakte.android.R.drawable.highlight);
                                }
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    z = true;
                }
                bwt0.p0(vKTabLayout, z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        FragmentImpl c2;
        r6f0 r6f0Var = this.e0;
        if (r6f0Var == null || (c2 = r6f0Var.c(gVar.f())) == 0) {
            return;
        }
        if (c2 instanceof hai0) {
            ((hai0) c2).q1();
        }
        Hn();
        mo(c2.getView());
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        r6f0 r6f0Var;
        i990 h;
        ViewPager viewPager = this.W;
        f fVar = null;
        if (viewPager != null && (r6f0Var = this.e0) != null && (h = r6f0Var.h(viewPager.getCurrentItem())) != null) {
            fVar = h.a();
        }
        if (fVar instanceof qhh0) {
            ((qhh0) fVar).s();
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final h6f0 io() {
        return this.T;
    }

    public final Integer jo() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt("theme"));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void kl(rtt rttVar, String str, Counters counters, boolean z) {
        int size;
        int i;
        VKList<ReactionUserProfile> vKList;
        int size2;
        ArrayList<ItemReaction> d;
        Bundle arguments;
        ViewPager viewPager;
        int size3;
        int i2;
        ArrayList<ItemReaction> arrayList;
        ReactionMeta d2;
        r6f0 r6f0Var;
        ReactionMeta reactionMeta;
        r6f0 r6f0Var2;
        VKList<ReactionUserProfile> a2;
        HashMap<String, Integer> hashMap = this.f0;
        hashMap.clear();
        r6f0 r6f0Var3 = this.e0;
        if (r6f0Var3 == null) {
            return;
        }
        rttVar.a().getClass();
        rtt.a a3 = rttVar.a();
        r6f0 r6f0Var4 = this.e0;
        e6f0 e6f0Var = this.T;
        ArrayList<i990> arrayList2 = this.g0;
        if (r6f0Var4 == null) {
            size = -1;
        } else {
            size = arrayList2.size();
            i990 g = r6f0Var4.g("all");
            if (g == null) {
                AllReactionsTabFragment.a aVar = new AllReactionsTabFragment.a();
                aVar.A(z);
                aVar.B(getArguments());
                Integer jo = jo();
                if (jo != null) {
                    aVar.w(jo.intValue());
                }
                g = new i990("all", aVar.f(), com.vkontakte.android.R.id.reaction_tab_all);
            }
            int i3 = a3.a().i();
            hashMap.put("all", Integer.valueOf(i3));
            g.c(ko(i3, "all"));
            FragmentImpl a4 = g.a();
            if (a4 instanceof BaseReactionsTabFragment) {
                ((BaseReactionsTabFragment) a4).ko(a3);
                ((BaseReactionsTabFragment) a4).jo(e6f0Var);
            }
            arrayList2.add(g);
        }
        rtt.a b2 = rttVar.b();
        if (b2 == null || (r6f0Var2 = this.e0) == null || (a2 = b2.a()) == null || a2.isEmpty()) {
            i = -1;
        } else {
            i = arrayList2.size();
            i990 g2 = r6f0Var2.g("friends");
            if (g2 == null) {
                FriendsTabFragment.a aVar2 = new FriendsTabFragment.a();
                aVar2.z("friends");
                aVar2.A(true);
                aVar2.B(getArguments());
                Integer jo2 = jo();
                if (jo2 != null) {
                    aVar2.w(jo2.intValue());
                }
                g2 = new i990("friends", aVar2.f(), com.vkontakte.android.R.id.reaction_tab_friends);
            }
            int i4 = b2.a().i();
            hashMap.put("friends", Integer.valueOf(i4));
            g2.c(ko(i4, "friends"));
            FragmentImpl a5 = g2.a();
            if (a5 instanceof BaseReactionsTabFragment) {
                BaseReactionsTabFragment baseReactionsTabFragment = (BaseReactionsTabFragment) a5;
                baseReactionsTabFragment.ko(b2);
                baseReactionsTabFragment.jo(e6f0Var);
            }
            arrayList2.add(g2);
        }
        rtt.a e = rttVar.e();
        r6f0 r6f0Var5 = this.e0;
        if (r6f0Var5 != null) {
            if (e == null || (vKList = e.a()) == null) {
                vKList = new VKList<>(0, 0);
            }
            int i5 = vKList.i() + (counters != null ? counters.zb() : 0);
            if (!vKList.isEmpty() || i5 != 0) {
                size2 = arrayList2.size();
                i990 g3 = r6f0Var5.g("shares");
                if (g3 == null) {
                    SharesTabFragment.a aVar3 = new SharesTabFragment.a();
                    aVar3.y();
                    aVar3.z("shares");
                    aVar3.C(str);
                    aVar3.B(getArguments());
                    Integer jo3 = jo();
                    if (jo3 != null) {
                        aVar3.w(jo3.intValue());
                    }
                    g3 = new i990("shares", aVar3.f(), com.vkontakte.android.R.id.reaction_tab_shares);
                }
                hashMap.put("shares", Integer.valueOf(i5));
                g3.c(ko(i5, "shares"));
                FragmentImpl a6 = g3.a();
                if (a6 instanceof BaseReactionsTabFragment) {
                    BaseReactionsTabFragment baseReactionsTabFragment2 = (BaseReactionsTabFragment) a6;
                    baseReactionsTabFragment2.ko(e);
                    baseReactionsTabFragment2.jo(e6f0Var);
                }
                arrayList2.add(g3);
                ItemReactions d3 = rttVar.d();
                d = d3 == null ? d3.d() : null;
                if (d != null && !d.isEmpty()) {
                    ReactionSet c2 = rttVar.c();
                    size3 = d.size();
                    i2 = 0;
                    while (i2 < size3) {
                        ItemReaction itemReaction = d.get(i2);
                        if (itemReaction.getCount() == 0 || (d2 = c2f0.d(c2, itemReaction.getId())) == null || (r6f0Var = this.e0) == null) {
                            arrayList = d;
                        } else {
                            arrayList = d;
                            String str2 = "reaction" + d2.getId();
                            i990 g4 = r6f0Var.g(str2);
                            if (g4 == null) {
                                ReactionsTabFragment.a aVar4 = new ReactionsTabFragment.a();
                                aVar4.D(d2);
                                aVar4.z(str2);
                                aVar4.B(getArguments());
                                Integer jo4 = jo();
                                if (jo4 != null) {
                                    aVar4.w(jo4.intValue());
                                }
                                FragmentImpl f = aVar4.f();
                                Integer R = rl3.R(i2, (int[]) this.h0.getValue());
                                reactionMeta = d2;
                                g4 = new i990(str2, f, R != null ? R.intValue() : -1);
                            } else {
                                reactionMeta = d2;
                            }
                            FragmentImpl a7 = g4.a();
                            if (a7 instanceof BaseReactionsTabFragment) {
                                ((BaseReactionsTabFragment) a7).jo(e6f0Var);
                            }
                            int count = itemReaction.getCount();
                            hashMap.put(str2, Integer.valueOf(count));
                            g4.c(ko(count, str2));
                            ReactionAsset d4 = reactionMeta.d();
                            g4.b(d4 != null ? d4.d() : null);
                            arrayList2.add(g4);
                        }
                        i2++;
                        d = arrayList;
                    }
                }
                r6f0Var3.j(arrayList2);
                arguments = getArguments();
                if (arguments != null && arguments.containsKey("tab")) {
                    int i6 = arguments.getInt("tab", 0);
                    arguments.remove("tab");
                    viewPager = this.W;
                    if (viewPager != null) {
                        if (i6 != 1) {
                            if (i6 == 2) {
                                size = i;
                            } else if (i6 == 3) {
                                size = size2;
                            }
                        }
                        viewPager.setCurrentItem(size);
                    }
                }
                arrayList2.clear();
            }
        }
        size2 = -1;
        ItemReactions d32 = rttVar.d();
        if (d32 == null) {
        }
        if (d != null) {
            ReactionSet c22 = rttVar.c();
            size3 = d.size();
            i2 = 0;
            while (i2 < size3) {
            }
        }
        r6f0Var3.j(arrayList2);
        arguments = getArguments();
        if (arguments != null) {
            int i62 = arguments.getInt("tab", 0);
            arguments.remove("tab");
            viewPager = this.W;
            if (viewPager != null) {
            }
        }
        arrayList2.clear();
    }

    public final String ko(int i, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -903566220) {
            if (hashCode != -600094315) {
                if (hashCode == 96673 && str.equals("all")) {
                    return getString(com.vkontakte.android.R.string.reactions_all_tab_formatted, uqm0.e(i));
                }
            } else if (str.equals("friends")) {
                return uqm0.i(i, com.vkontakte.android.R.plurals.reactions_friends_tab, com.vkontakte.android.R.string.reactions_friends_formatted, false);
            }
        } else if (str.equals("shares")) {
            return uqm0.i(i, com.vkontakte.android.R.plurals.reactions_shares_tab, com.vkontakte.android.R.string.reactions_shares_formatted, false);
        }
        return uqm0.e(i);
    }

    public View lo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(com.vkontakte.android.R.layout.fragment_reactions, viewGroup, false);
    }

    public final void mo(View view) {
        if (view == null) {
            return;
        }
        try {
            AppBarShadowView appBarShadowView = this.V;
            if (appBarShadowView != null) {
                appBarShadowView.V(view);
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewPager viewPager = this.W;
        if (viewPager == null) {
            return;
        }
        viewPager.postDelayed(new vrl(5, this, viewPager), 200L);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View lo = lo(layoutInflater, viewGroup);
        AppBarShadowView appBarShadowView = (AppBarShadowView) lo.findViewById(com.vkontakte.android.R.id.shadow_view);
        this.V = appBarShadowView;
        if (appBarShadowView != null) {
            appBarShadowView.setSeparatorAllowed(false);
        }
        this.X = (VKTabLayout) lo.findViewById(com.vkontakte.android.R.id.tabs);
        View findViewById = lo.findViewById(com.vkontakte.android.R.id.error_layout);
        Toolbar toolbar = null;
        if (findViewById != null) {
            this.c0 = new vid(findViewById, this.T);
        } else {
            findViewById = null;
        }
        this.a0 = findViewById;
        this.Y = (ProgressBar) lo.findViewById(com.vkontakte.android.R.id.progress);
        this.W = (ViewPager) lo.findViewById(com.vkontakte.android.R.id.viewpager);
        this.b0 = (ViewGroup) lo.findViewById(com.vkontakte.android.R.id.content);
        DefaultEmptyView defaultEmptyView = new DefaultEmptyView(getActivity(), null);
        defaultEmptyView.a();
        defaultEmptyView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        bwt0.p0(defaultEmptyView, false);
        ViewGroup viewGroup2 = this.b0;
        if (viewGroup2 != null) {
            viewGroup2.addView(defaultEmptyView);
        }
        this.Z = defaultEmptyView;
        Toolbar toolbar2 = (Toolbar) lo.findViewById(com.vkontakte.android.R.id.toolbar);
        if (toolbar2 != null) {
            if (!h3p0.f(this, toolbar2)) {
                u1u0.j(toolbar2, com.vkontakte.android.R.drawable.vk_icon_arrow_left_outline_28);
                toolbar2.setNavigationOnClickListener(new ai0(this, 8));
            }
            toolbar2.setOnClickListener(new r4(this, 9));
            toolbar = toolbar2;
        }
        this.U = toolbar;
        Bundle arguments = getArguments();
        if (arguments != null) {
            setTitle(arguments.containsKey("title") ? arguments.getString("title") : getString(com.vkontakte.android.R.string.reactions_title));
        }
        ViewPager viewPager = this.W;
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(1);
            r6f0 r6f0Var = new r6f0(this, In());
            r6f0Var.registerDataSetObserver(this.i0);
            viewPager.setAdapter(r6f0Var);
            this.e0 = r6f0Var;
        }
        VKTabLayout vKTabLayout = this.X;
        if (vKTabLayout == null) {
            return lo;
        }
        vKTabLayout.setTabMode(3);
        vKTabLayout.setForceScrolling(true);
        vKTabLayout.setCustomTabView(com.vkontakte.android.R.layout.reaction_tab);
        usn0.a(vKTabLayout);
        vKTabLayout.setupWithViewPager(this.W);
        vKTabLayout.f(this);
        return lo;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        r6f0 r6f0Var = this.e0;
        if (r6f0Var != null) {
            r6f0Var.unregisterDataSetObserver(this.i0);
        }
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e6f0 e6f0Var = this.T;
        if (e6f0Var != null) {
            e6f0Var.F(getArguments());
        }
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            io.reactivex.rxjava3.disposables.c g = e6f0Var != null ? e6f0Var.g() : null;
            if (g != null) {
                eo(g);
            }
        }
    }

    @Override // xsna.qhh0
    public final boolean s() {
        r6f0 r6f0Var;
        i990 h;
        ViewPager viewPager = this.W;
        Object a2 = (viewPager == null || (r6f0Var = this.e0) == null || (h = r6f0Var.h(viewPager.getCurrentItem())) == null) ? null : h.a();
        qhh0 qhh0Var = a2 instanceof qhh0 ? (qhh0) a2 : null;
        return qhh0Var != null && qhh0Var.s();
    }

    public void setTitle(CharSequence charSequence) {
        Toolbar toolbar = this.U;
        if (toolbar != null) {
            toolbar.setTitle(charSequence);
        }
    }

    /* compiled from: ReactionsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends oz50 {
        public a(UserId userId, int i) {
            super(ReactionsFragment.class, null, null);
            boolean g0;
            this.j.putParcelable("owner_id", userId);
            this.j.putLong("item_id", i);
            UserId c = o25.a().c();
            if (fkq0.d(userId)) {
                g0 = epx.f(c, userId);
            } else {
                t6g0 t6g0Var = t6g0.b;
                g0 = t6g0.b().g0(userId);
            }
            this.j.putBoolean("shares_available", g0);
        }

        public final void A() {
            this.j.putInt("tab", 3);
        }

        public final void B(String str) {
            LikesGetList.Type.Companion.getClass();
            this.j.putSerializable("ltype", LikesGetList.Type.a.a(str));
        }

        public final void y() {
            this.j.putInt("tab", 1);
        }

        public final void z() {
            this.j.putInt("tab", 2);
        }

        public a(VideoFile videoFile) {
            this(videoFile.I0(), videoFile.o0());
            this.j.putSerializable("ltype", LikesGetList.Type.VIDEO);
            this.j.putParcelable("counters", videoFile.H());
        }
    }

    public void Ve(Integer num) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
    }

    public void Fg(ReactionSet reactionSet, ItemReactions itemReactions) {
    }
}
