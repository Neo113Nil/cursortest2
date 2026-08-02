package com.vk.music.podcast.impl.ui.episode;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.podcast.api.menu.PodcastMenuItem;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.functions.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a0a;
import xsna.abg0;
import xsna.anj;
import xsna.ayn0;
import xsna.b290;
import xsna.b8g;
import xsna.b990;
import xsna.bjk;
import xsna.bpn0;
import xsna.c950;
import xsna.cnh;
import xsna.com;
import xsna.cvk;
import xsna.d920;
import xsna.dgb0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.f1o;
import xsna.fsv;
import xsna.gko;
import xsna.gky;
import xsna.hf8;
import xsna.hy2;
import xsna.ic40;
import xsna.izs;
import xsna.jaa0;
import xsna.k840;
import xsna.ko00;
import xsna.lqk0;
import xsna.lyd;
import xsna.mhy;
import xsna.msy;
import xsna.mzp0;
import xsna.o25;
import xsna.oz50;
import xsna.qp4;
import xsna.r11;
import xsna.rzp0;
import xsna.s750;
import xsna.se50;
import xsna.su80;
import xsna.tlo0;
import xsna.tq;
import xsna.tuq;
import xsna.u2b0;
import xsna.u750;
import xsna.uq50;
import xsna.utt0;
import xsna.wm80;
import xsna.wt30;
import xsna.wx0;
import xsna.x8m;
import xsna.xl40;
import xsna.xqq;
import xsna.yqq;
import xsna.zgb0;
import xsna.zkb0;

/* compiled from: PodcastEpisodeFragment.kt */
/* loaded from: classes3.dex */
public final class PodcastEpisodeFragment extends BaseMvpFragment<com.vk.music.podcast.impl.ui.episode.b> implements yqq, fsv<MusicTrack> {
    public static final /* synthetic */ int u0 = 0;
    public ayn0 T;
    public RecyclerPaginatedView U;
    public utt0 V;
    public zgb0 X;
    public VkTopBar Y;
    public boolean b0;
    public boolean c0;
    public final u750 e0;
    public FrameLayout f0;
    public f1o g0;
    public AppBarLayout h0;
    public ComposeView i0;
    public CoordinatorLayout.c<View> j0;
    public final PodcastEpisodeFragment$receiver$1 k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public final Object o0;
    public final Object p0;
    public final bpn0 q0;
    public final Object r0;
    public final ArrayList<MusicTrack> s0;
    public final d t0;
    public final d920 W = new d920();
    public final HashSet<PodcastMenuItem> Z = new HashSet<>();
    public final HashSet<PodcastMenuItem> a0 = new HashSet<>();
    public final u2b0 d0 = k840.a.g().b();

    /* compiled from: PodcastEpisodeFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, int i) {
            super(PodcastEpisodeFragment.class, null, null);
            this.j.putParcelable("owner_id", userId);
            this.j.putInt("id", i);
        }

        public final void A(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            if (musicPlaybackLaunchContext.equals(MusicPlaybackLaunchContext.d) || musicPlaybackLaunchContext.t().length() <= 0) {
                return;
            }
            this.j.putString("ref", musicPlaybackLaunchContext.t());
        }

        public final void B(String str) {
            A(MusicPlaybackLaunchContext.Fb(str));
        }

        public final void C(String str) {
            if (str != null) {
                this.j.putString("track_code", str);
            }
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MUSIC_PODCAST_EPISODE, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }

        public final void y(MusicTrack.AssistantData assistantData) {
            this.j.putParcelable("assistant_data", assistantData);
        }

        public final void z(String str) {
            this.j.putString("launch_origin", str);
        }
    }

    /* compiled from: PodcastEpisodeFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PodcastMenuItem.values().length];
            try {
                iArr[PodcastMenuItem.AddToBookFavorites.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PodcastMenuItem.GoToPost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PodcastMenuItem.GoToAuthor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PodcastMenuItem.SubscribeToAuthor.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PodcastMenuItem.Share.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PodcastMenuItem.CopyLink.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PodcastEpisodeFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ViewGroup, View> {
        @Override // xsna.izs
        public final View invoke(ViewGroup viewGroup) {
            PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) this.receiver;
            int i = PodcastEpisodeFragment.u0;
            podcastEpisodeFragment.getClass();
            VkGroupHeader vkGroupHeader = new VkGroupHeader(viewGroup.getContext(), null, 6);
            vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
            vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.music_podcast_recent_episodes), null, null, null, 0, 510));
            return vkGroupHeader;
        }
    }

    /* compiled from: PodcastEpisodeFragment.kt */
    public static final class d extends e.a {
        public d() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            RecyclerPaginatedView recyclerPaginatedView = PodcastEpisodeFragment.this.U;
            if (recyclerPaginatedView == null) {
                return;
            }
            RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
                if (findContainingViewHolder != null) {
                    se50 se50Var = findContainingViewHolder instanceof se50 ? (se50) findContainingViewHolder : null;
                    if (se50Var != null) {
                        se50Var.i6();
                    }
                }
            }
        }
    }

    /* compiled from: PodcastEpisodeFragment.kt */
    public static final class e implements l {
        public final /* synthetic */ com.vk.music.podcast.impl.ui.episode.a b;

        public e(com.vk.music.podcast.impl.ui.episode.a aVar) {
            this.b = aVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment$receiver$1] */
    public PodcastEpisodeFragment() {
        s750 s750Var = k840.a.e;
        this.e0 = s750Var == null ? null : s750Var;
        this.k0 = new BroadcastReceiver() { // from class: com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                String action;
                PodcastPage podcastPage;
                MusicTrack musicTrack;
                UserId userId;
                c cVar;
                b bVar = (b) PodcastEpisodeFragment.this.S;
                if (bVar == null || (action = intent.getAction()) == null || action.hashCode() != 3866578 || !action.equals("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID") || (podcastPage = bVar.e) == null || (musicTrack = podcastPage.b) == null || (userId = (UserId) intent.getParcelableExtra("id")) == null || !epx.f(musicTrack.c, userId) || musicTrack.g != 11 || (cVar = bVar.f) == null) {
                    return;
                }
                cVar.p(false);
            }
        };
        su80 su80Var = new su80(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l0 = msy.a(lazyThreadSafetyMode, su80Var);
        this.m0 = msy.a(lazyThreadSafetyMode, new wm80(this, 4));
        this.n0 = msy.a(lazyThreadSafetyMode, new c950(this, 13));
        this.o0 = msy.a(lazyThreadSafetyMode, new jaa0(this, 1));
        this.p0 = msy.a(lazyThreadSafetyMode, new b990(this, 3));
        this.q0 = new bpn0(new hy2(29));
        this.r0 = msy.a(lazyThreadSafetyMode, new uq50(this, 15));
        this.s0 = new ArrayList<>();
        this.t0 = new d();
    }

    @Override // xsna.fsv
    public final void Ig(int i, MusicTrack musicTrack) {
        MusicTrack musicTrack2 = musicTrack;
        if (musicTrack2 == null) {
            return;
        }
        if (i == R.id.audio_menu) {
            P p = this.S;
            FragmentActivity activity = getActivity();
            Activity h = activity != null ? e3m.h(activity) : null;
            if (p == 0 || h == null) {
                return;
            }
            ic40.r(lyd.g().w(), h, MusicBottomSheetLaunchPoint.App.b, musicTrack2, ((com.vk.music.podcast.impl.ui.episode.b) p).n(), null, false, false, null, null, 496);
            return;
        }
        if (i == R.id.audio_image) {
            com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) this.S;
            if (bVar != null) {
                bVar.l.N0(new lqk0((StartPlaySource) null, musicTrack2, this.s0, bVar.n().Eb(32), 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1009));
                return;
            }
            return;
        }
        com.vk.music.podcast.impl.ui.episode.b bVar2 = (com.vk.music.podcast.impl.ui.episode.b) this.S;
        if (bVar2 != null) {
            bVar2.O0(musicTrack2, this);
        }
    }

    @Override // xsna.yqq
    public final void ie(int i, UserId userId, boolean z) {
        MusicTrack musicTrack;
        PodcastPage podcastPage;
        MusicTrack musicTrack2;
        Iterator<MusicTrack> it = this.s0.iterator();
        while (true) {
            if (!it.hasNext()) {
                musicTrack = null;
                break;
            }
            musicTrack = it.next();
            MusicTrack musicTrack3 = musicTrack;
            if (epx.f(musicTrack3.c, userId) && musicTrack3.b == i) {
                break;
            }
        }
        MusicTrack musicTrack4 = musicTrack;
        if (musicTrack4 != null) {
            Episode episode = musicTrack4.w;
            if (episode != null) {
                episode.c = z;
            }
            this.W.notifyDataSetChanged();
        }
        com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) this.S;
        if (bVar == null || (podcastPage = bVar.e) == null || (musicTrack2 = podcastPage.b) == null || !epx.f(musicTrack2.c, userId) || musicTrack2.b != i) {
            return;
        }
        Episode episode2 = musicTrack2.w;
        if (episode2 != null) {
            episode2.c = z;
        }
        zgb0 zgb0Var = this.X;
        if (zgb0Var != null) {
            zgb0Var.notifyDataSetChanged();
        }
        no(musicTrack2);
    }

    public final void jo() {
        PodcastPage podcastPage;
        MusicTrack musicTrack;
        FragmentActivity activity;
        com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) this.S;
        if (bVar == null || (podcastPage = bVar.e) == null || (musicTrack = podcastPage.b) == null || (activity = getActivity()) == null) {
            return;
        }
        mhy.a(activity, "https://" + a0a.d + "/podcast" + musicTrack.Fb());
        cvk.u(R.string.link_copied, false);
        String Fb = musicTrack.Fb();
        com.vk.music.podcast.impl.ui.episode.b bVar2 = (com.vk.music.podcast.impl.ui.episode.b) this.S;
        String t = bVar2 != null ? bVar2.n().t() : null;
        String str = musicTrack.y;
        b.d dVar = new b.d("podcast_copy_link");
        dVar.b(t, "ref");
        dVar.b(Fb, "audio_id");
        dVar.b(str, "track_code");
        dVar.e();
    }

    public final void ko(MusicTrack musicTrack) {
        zgb0 zgb0Var = this.X;
        if (zgb0Var != null) {
            zgb0Var.setItems(Collections.singletonList(musicTrack));
        }
        no(musicTrack);
        for (PlayerTrack playerTrack : this.d0.g()) {
            if (epx.f(playerTrack.b, musicTrack)) {
                playerTrack.b.w = musicTrack.w;
            }
        }
    }

    public final void lo() {
        VkTopBar vkTopBar = this.Y;
        if (vkTopBar == null) {
            return;
        }
        boolean z = this.b0;
        Pair pair = this.c0 ? new Pair(Integer.valueOf(R.string.music_remove_from_favorites), Integer.valueOf(R.drawable.vk_icon_favorite_28)) : new Pair(Integer.valueOf(R.string.music_add_to_favorites), Integer.valueOf(R.drawable.vk_icon_favorite_outline_28));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        VkTopBar.a.d dVar = null;
        if (!this.a0.isEmpty()) {
            gko.b bVar = gko.Companion;
            abg0 abg0Var = dhr0.t;
            dVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_more_vertical_28), null, new wx0(17, vkTopBar, this), null, new b8g(abg0Var.c(R.attr.vk_ui_icon_accent_themed)), com.vk.core.compose.component.semantics.b.a(null, new tuq(23), 3), 10), z ? new VkTopBar.a.b.C0877b(new gko(intValue2), tq.h(tlo0.Companion, intValue), new ko00(this, 19), null, new b8g(abg0Var.c(R.attr.vk_ui_icon_accent_themed)), com.vk.core.compose.component.semantics.b.a(null, new com(26), 3), 8) : null, 4);
        } else if (z) {
            gko.b bVar2 = gko.Companion;
            dVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(intValue2), tq.h(tlo0.Companion, intValue), new wt30(this, 7), null, new b8g(dhr0.t.c(R.attr.vk_ui_icon_accent_themed)), null, 40), null, 6);
        }
        vkTopBar.setAfter(dVar);
    }

    public final void mo(PodcastMenuItem podcastMenuItem, boolean z) {
        if (this.Z.contains(podcastMenuItem)) {
            HashSet<PodcastMenuItem> hashSet = this.a0;
            if (z) {
                hashSet.add(podcastMenuItem);
            } else {
                hashSet.remove(podcastMenuItem);
            }
        }
    }

    public final void no(MusicTrack musicTrack) {
        Episode episode = musicTrack.w;
        boolean z = false;
        if (episode != null && episode.c) {
            z = true;
        }
        this.c0 = z;
        lo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ayn0 ayn0Var = this.T;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.b();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        u2b0 u2b0Var;
        super.onCreate(bundle);
        com.vk.music.podcast.impl.ui.episode.b bVar = new com.vk.music.podcast.impl.ui.episode.b(this, this.d0, o25.a(), this.e0, this.J);
        this.X = new zgb0(bVar, new bjk(this, 27));
        this.S = bVar;
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserId userId = (UserId) arguments.getParcelable("owner_id");
            if (userId == null) {
                userId = UserId.d;
            }
            String string = arguments.getString("launch_origin");
            if (string == null) {
                string = "unknown";
            }
            com.vk.music.podcast.impl.ui.episode.b bVar2 = (com.vk.music.podcast.impl.ui.episode.b) this.S;
            if (bVar2 != null) {
                int i = arguments.getInt("id");
                MusicTrack.AssistantData assistantData = (MusicTrack.AssistantData) arguments.getParcelable("assistant_data");
                bVar2.g = userId;
                bVar2.i = i;
                bVar2.j = assistantData;
                bVar2.d = string;
            }
            int i2 = arguments.getInt("state");
            int i3 = arguments.getInt("id");
            String string2 = arguments.getString("ref");
            String string3 = arguments.getString("track_code");
            String str = i2 != 16 ? i2 != 32 ? null : "cell_button" : "cell";
            b.d dVar = new b.d("podcast_open_episode");
            dVar.b(string2, "ref");
            dVar.b(str, "source");
            dVar.b(r11.b(new StringBuilder(), userId.b, '_', i3), "audio_id");
            dVar.b(string3, "track_code");
            dVar.e();
        }
        com.vk.music.podcast.impl.ui.episode.b bVar3 = (com.vk.music.podcast.impl.ui.episode.b) this.S;
        if (bVar3 != null && (u2b0Var = bVar3.l) != null) {
            u2b0Var.P0(this.t0, true);
        }
        xqq xqqVar = xqq.b;
        xqq.c.add(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
        Context context = e43.a;
        anj.d(context != null ? context : null, this.k0, intentFilter, hf8.a, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.music_fragment_podcast_screen, viewGroup, false);
        this.f0 = inflate != null ? (FrameLayout) inflate.findViewById(R.id.container) : null;
        this.h0 = (AppBarLayout) inflate.findViewById(R.id.appbar);
        this.i0 = (ComposeView) inflate.findViewById(R.id.error_compose_container);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        this.Y = vkTopBar;
        if (vkTopBar != null) {
            vkTopBar.setBack(new VkTopBar.b(new b290(this, 3), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new x8m(28), 3), 12));
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.music_title_podcast_episode), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new gky(16), 3), 14), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
            vkTopBar.setOnClickListener(new qp4(this, 8));
            lo();
        }
        for (PodcastMenuItem podcastMenuItem : ((dgb0) this.n0.getValue()).get()) {
            int i = b.$EnumSwitchMapping$0[podcastMenuItem.ordinal()];
            HashSet<PodcastMenuItem> hashSet = this.a0;
            HashSet<PodcastMenuItem> hashSet2 = this.Z;
            switch (i) {
                case 1:
                    hashSet2.add(podcastMenuItem);
                    break;
                case 2:
                    hashSet2.add(podcastMenuItem);
                    break;
                case 3:
                    hashSet2.add(podcastMenuItem);
                    hashSet.add(podcastMenuItem);
                    break;
                case 4:
                    hashSet2.add(podcastMenuItem);
                    break;
                case 5:
                    hashSet2.add(podcastMenuItem);
                    hashSet.add(podcastMenuItem);
                    break;
                case 6:
                    if (((xl40) this.o0.getValue()).isEnabled().getValue().booleanValue()) {
                        break;
                    } else {
                        hashSet2.add(podcastMenuItem);
                        hashSet.add(podcastMenuItem);
                        break;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        lo();
        this.V = new utt0(new c(1, this, PodcastEpisodeFragment.class, "createOtherEpisodesHeader", "createOtherEpisodesHeader(Landroid/view/ViewGroup;)Landroid/view/View;", 0), (cnh) null, 1);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        this.U = recyclerPaginatedView;
        zgb0 zgb0Var = this.X;
        d920 d920Var = this.W;
        if (zgb0Var != null) {
            d920Var.x0(zgb0Var);
        }
        utt0 utt0Var = this.V;
        if (utt0Var == null) {
            utt0Var = null;
        }
        d920Var.x0(utt0Var);
        d920Var.x0((zkb0) this.r0.getValue());
        RecyclerPaginatedView recyclerPaginatedView2 = this.U;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        recyclerPaginatedView2.setAdapter(d920Var);
        RecyclerPaginatedView recyclerPaginatedView3 = this.U;
        if (recyclerPaginatedView3 == null) {
            recyclerPaginatedView3 = null;
        }
        this.T = new ayn0(recyclerPaginatedView3.getRecyclerView(), null, 30);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        u2b0 u2b0Var;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        enj.s(context, this.k0);
        super.onDestroy();
        com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) this.S;
        if (bVar != null && (u2b0Var = bVar.l) != null) {
            u2b0Var.n0(this.t0);
        }
        xqq xqqVar = xqq.b;
        xqq.c.remove(this);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) this.S;
        if (bVar != null) {
            bVar.l.release();
            bVar.n.release();
        }
        ayn0 ayn0Var = this.T;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.a();
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) this.S;
        if (epx.f(bVar != null ? bVar.n().Gb() : null, "kids_section")) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_KIDS_PODCAST_EPISODE;
        }
    }
}
