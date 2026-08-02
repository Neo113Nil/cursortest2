package com.vk.music.view.player;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.apps.BuildInfo;
import com.vk.music.player.domain.state.MusicBigPlayerPage;
import com.vk.music.player.presentation.main.SwipeBlockingViewPager;
import com.vk.music.view.player.MusicBigPlayerParams;
import com.vk.music.view.player.holders.tracklist.MusicBigPlayerTrackListHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c07;
import xsna.c220;
import xsna.c4r;
import xsna.e43;
import xsna.f380;
import xsna.g9o;
import xsna.izs;
import xsna.mb40;
import xsna.p4g;
import xsna.s1q0;
import xsna.too0;
import xsna.u2b0;
import xsna.wb40;
import xsna.xb40;
import xsna.xlg0;
import xsna.yb40;
import xsna.z7w;

/* compiled from: MusicBigPlayerPagesAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends s1q0 implements too0, f380, xb40, ViewPager.j {
    public static final MusicBigPlayerPage q;
    public static final List<MusicBigPlayerPage> r;
    public static final List<MusicBigPlayerPage> s;
    public final MusicBigPlayerParams f;
    public final wb40.d g;
    public final wb40.e h;
    public final c07 i;
    public final com.vk.music.podcast.api.di.a j;
    public SwipeBlockingViewPager k = null;
    public List<? extends MusicBigPlayerPage> l = r;
    public final LinkedHashMap m = new LinkedHashMap();
    public com.vk.music.player.domain.state.a n;
    public MusicBigPlayerTrackListHolder o;
    public mb40 p;

    /* compiled from: MusicBigPlayerPagesAdapter.kt */
    /* renamed from: com.vk.music.view.player.a$a, reason: collision with other inner class name */
    public static final class C1359a {
        public static final View a(Object obj) {
            View view;
            MusicBigPlayerPage musicBigPlayerPage = a.q;
            RecyclerView.e0 e0Var = obj instanceof RecyclerView.e0 ? (RecyclerView.e0) obj : null;
            if (e0Var != null && (view = e0Var.itemView) != null) {
                return view;
            }
            StringBuilder sb = new StringBuilder("Can't cast ");
            sb.append(obj);
            sb.append(" to ");
            String a = xlg0.a(RecyclerView.e0.class, sb);
            if (BuildInfo.h()) {
                throw new RuntimeException(a);
            }
            return null;
        }
    }

    /* compiled from: MusicBigPlayerPagesAdapter.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MusicBigPlayerPage.values().length];
            try {
                iArr[MusicBigPlayerPage.TRACK_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicBigPlayerPage.CONTROLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MusicBigPlayerParams.FeatureSet.values().length];
            try {
                iArr2[MusicBigPlayerParams.FeatureSet.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MusicBigPlayerParams.FeatureSet.LIMITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MusicBigPlayerParams.FeatureSet.MESSENGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        MusicBigPlayerPage musicBigPlayerPage = MusicBigPlayerPage.CONTROLS;
        q = musicBigPlayerPage;
        r = e43.l(musicBigPlayerPage, MusicBigPlayerPage.TRACK_LIST);
        s = Collections.singletonList(musicBigPlayerPage);
    }

    public a(MusicBigPlayerParams musicBigPlayerParams, wb40.d dVar, wb40.e eVar, c07 c07Var, com.vk.music.podcast.api.di.a aVar) {
        this.f = musicBigPlayerParams;
        this.g = dVar;
        this.h = eVar;
        this.i = c07Var;
        this.j = aVar;
        this.d = true;
    }

    @Override // xsna.xb40
    public final void B0(float f) {
        this.d = f < 1.0f;
        Collection<Object> values = this.m.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            xb40 xb40Var = obj instanceof xb40 ? (xb40) obj : null;
            if (xb40Var != null) {
                arrayList.add(xb40Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xb40) it.next()).B0(f);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        Collection<Object> values = this.m.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            too0 too0Var = obj instanceof too0 ? (too0) obj : null;
            if (too0Var != null) {
                arrayList.add(too0Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((too0) it.next()).Ng();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(MusicBigPlayerPage musicBigPlayerPage) {
        int i;
        SwipeBlockingViewPager swipeBlockingViewPager;
        SwipeBlockingViewPager swipeBlockingViewPager2;
        SwipeBlockingViewPager swipeBlockingViewPager3 = this.k;
        if (swipeBlockingViewPager3 != null) {
            swipeBlockingViewPager3.setAdapter(this);
        }
        Integer j = p4g.j(musicBigPlayerPage, this.l);
        if (j == null) {
            j = p4g.j(q, this.l);
            if (j == null) {
                i = 1;
                swipeBlockingViewPager = this.k;
                if (swipeBlockingViewPager != null && swipeBlockingViewPager.getCurrentItem() == i) {
                    onPageSelected(i);
                }
                swipeBlockingViewPager2 = this.k;
                if (swipeBlockingViewPager2 == null) {
                    swipeBlockingViewPager2.setCurrentItem(i);
                    return;
                }
                return;
            }
        }
        i = j.intValue();
        swipeBlockingViewPager = this.k;
        if (swipeBlockingViewPager != null) {
            onPageSelected(i);
        }
        swipeBlockingViewPager2 = this.k;
        if (swipeBlockingViewPager2 == null) {
        }
    }

    @Override // xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(C1359a.a(obj));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.l.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [xsna.mb40] */
    /* JADX WARN: Type inference failed for: r1v9, types: [xsna.mb40] */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        izs c4rVar;
        MusicBigPlayerTrackListHolder musicBigPlayerTrackListHolder;
        MusicBigPlayerPage musicBigPlayerPage = this.l.get(i);
        int i2 = b.$EnumSwitchMapping$0[musicBigPlayerPage.ordinal()];
        MusicBigPlayerParams musicBigPlayerParams = this.f;
        if (i2 == 1) {
            MusicBigPlayerTrackListHolder musicBigPlayerTrackListHolder2 = this.o;
            musicBigPlayerTrackListHolder = musicBigPlayerTrackListHolder2;
            if (musicBigPlayerTrackListHolder2 == null) {
                u2b0 u2b0Var = musicBigPlayerParams.c;
                Context context = viewGroup.getContext();
                g9o g9oVar = musicBigPlayerParams.b;
                u2b0 u2b0Var2 = musicBigPlayerParams.c;
                com.vk.music.track.a aVar = musicBigPlayerParams.d;
                int i3 = b.$EnumSwitchMapping$1[musicBigPlayerParams.j.ordinal()];
                if (i3 == 1) {
                    c4rVar = new c4r(16);
                } else if (i3 == 2) {
                    c4rVar = new c220(4);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c4rVar = new z7w(6);
                }
                MusicBigPlayerTrackListHolder musicBigPlayerTrackListHolder3 = new MusicBigPlayerTrackListHolder(viewGroup, u2b0Var, new yb40(context, g9oVar, u2b0Var2, aVar, c4rVar, this.g, musicBigPlayerParams.g), this.i, this.j);
                this.o = musicBigPlayerTrackListHolder3;
                musicBigPlayerTrackListHolder = musicBigPlayerTrackListHolder3;
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ?? r1 = this.p;
            musicBigPlayerTrackListHolder = r1;
            if (r1 == 0) {
                ?? mb40Var = new mb40(viewGroup, musicBigPlayerParams, this.i);
                this.p = mb40Var;
                musicBigPlayerTrackListHolder = mb40Var;
            }
        }
        this.m.put(musicBigPlayerPage, musicBigPlayerTrackListHolder);
        viewGroup.addView(musicBigPlayerTrackListHolder.itemView, Math.min(i, viewGroup.getChildCount()));
        com.vk.music.player.domain.state.a aVar2 = this.n;
        if (aVar2 != null) {
            musicBigPlayerTrackListHolder.V5("", false, i, aVar2);
        }
        return musicBigPlayerTrackListHolder;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == C1359a.a(obj);
    }

    @Override // xsna.f380
    public final void onConfigurationChanged(Configuration configuration) {
        Collection<Object> values = this.m.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            f380 f380Var = obj instanceof f380 ? (f380) obj : null;
            if (f380Var != null) {
                arrayList.add(f380Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f380) it.next()).onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
        this.h.onPageScrollStateChanged(i);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
        this.h.onPageScrolled(i, f, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        this.h.onPageSelected(i);
    }
}
