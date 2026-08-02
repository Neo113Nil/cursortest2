package com.vk.newsfeed.impl.feedlikes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.vk.newsfeed.impl.feedlikes.FeedLikesFilter;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import xsna.a4f0;
import xsna.a5p0;
import xsna.ce60;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.nh40;
import xsna.p870;
import xsna.z1q0;

/* compiled from: FeedLikesFilterView.kt */
/* loaded from: classes4.dex */
public final class a extends FrameLayout {
    public static final int f;
    public static int g;
    public final TabLayout b;
    public final List<MobileOfficialAppsCoreNavStat$EventScreen> c;
    public InterfaceC1381a d;
    public final b e;

    /* compiled from: FeedLikesFilterView.kt */
    /* renamed from: com.vk.newsfeed.impl.feedlikes.a$a, reason: collision with other inner class name */
    public interface InterfaceC1381a {
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        f = e3m.a(R.dimen.feed_likes_filter_height, context);
    }

    public a(Context context) {
        super(context);
        List<MobileOfficialAppsCoreNavStat$EventScreen> l = e43.l(MobileOfficialAppsCoreNavStat$EventScreen.FEED_LIKES_ALL, MobileOfficialAppsCoreNavStat$EventScreen.FEED_LIKES_POSTS, MobileOfficialAppsCoreNavStat$EventScreen.FEED_LIKES_COMMENTS, MobileOfficialAppsCoreNavStat$EventScreen.FEED_LIKES_CLIPS, MobileOfficialAppsCoreNavStat$EventScreen.FEED_LIKES_VIDEO, MobileOfficialAppsCoreNavStat$EventScreen.FEED_LIKES_GOODS);
        this.c = l;
        this.e = new b(l);
        LayoutInflater.from(getContext()).inflate(R.layout.feed_likes_filter_view, (ViewGroup) this, true);
        setId(R.id.feed_likes_filter_view_id);
        setLayoutParams(new ViewGroup.LayoutParams(-1, f));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.feed_likes_tablayout);
        this.b = tabLayout;
        tabLayout.setBackground(dhr0.t.a(R.drawable.feed_likes_filter_bg));
        FeedLikesFilter.Companion.getClass();
        Iterator it = FeedLikesFilter.a.a().iterator();
        while (it.hasNext()) {
            FeedLikesFilter feedLikesFilter = (FeedLikesFilter) it.next();
            TabLayout tabLayout2 = this.b;
            TabLayout.g p = tabLayout2.p();
            p.p(feedLikesFilter.j());
            tabLayout2.h(p);
        }
        TabLayout tabLayout3 = this.b;
        b bVar = this.e;
        tabLayout3.t(bVar);
        TabLayout.g b2 = tabLayout3.b(g);
        if (b2 != null) {
            b2.j();
        }
        tabLayout3.g(bVar);
        TabLayout tabLayout4 = this.b;
        int tabCount = tabLayout4.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.g b3 = tabLayout4.b(i);
            if (b3 != null) {
                a5p0.a.a(b3.h, null);
            }
        }
    }

    public final void a(int i) {
        TabLayout tabLayout = this.b;
        b bVar = this.e;
        tabLayout.t(bVar);
        TabLayout.g b2 = tabLayout.b(i);
        if (b2 != null) {
            b2.j();
        }
        tabLayout.g(bVar);
    }

    public final void setOnFilterSelectedListener(InterfaceC1381a interfaceC1381a) {
        this.d = interfaceC1381a;
    }

    /* compiled from: FeedLikesFilterView.kt */
    public static final class b extends z1q0 {
        public b(List<? extends MobileOfficialAppsCoreNavStat$EventScreen> list) {
            super(list);
        }

        @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            super.Wd(gVar);
            int i = a.f;
            a.g = gVar.e;
            FeedLikesFilter.Companion.getClass();
            FeedLikesFilter feedLikesFilter = (FeedLikesFilter) FeedLikesFilter.a.a().get(gVar.e);
            int i2 = gVar.e;
            a aVar = a.this;
            aVar.a(i2);
            InterfaceC1381a interfaceC1381a = aVar.d;
            if (interfaceC1381a != null) {
                ((ReactionsFeedFragment.b) ((nh40) interfaceC1381a).c).b.a(new a4f0.a(feedLikesFilter.i()));
            } else {
                ce60.b.getClass();
                p870.f().e(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, feedLikesFilter);
            }
        }

        @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
        }

        @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
        }
    }
}
