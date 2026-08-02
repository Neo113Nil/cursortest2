package com.vk.music.podcast.impl.ui.list;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.view.VKImageView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.awt0;
import xsna.ayn0;
import xsna.bwt0;
import xsna.d410;
import xsna.e3m;
import xsna.epx;
import xsna.fsv;
import xsna.ghb0;
import xsna.iah0;
import xsna.ic40;
import xsna.k840;
import xsna.lyd;
import xsna.msy;
import xsna.mzp0;
import xsna.nd50;
import xsna.o25;
import xsna.omw;
import xsna.oz50;
import xsna.p010;
import xsna.qhh0;
import xsna.rzp0;
import xsna.s750;
import xsna.se50;
import xsna.u2b0;
import xsna.u750;
import xsna.v6d;
import xsna.vv20;
import xsna.zkb0;

/* compiled from: PodcastEpisodesListFragment.kt */
/* loaded from: classes3.dex */
public final class PodcastEpisodesListFragment extends BaseMvpFragment<ghb0> implements qhh0, fsv<MusicTrack> {
    public static final /* synthetic */ int d0 = 0;
    public RecyclerPaginatedView T;
    public VKImageView U;
    public TextView V;
    public TextView W;
    public final zkb0 X;
    public ayn0 Y;
    public final u2b0 Z;
    public final u750 a0;
    public final Object b0;
    public final b c0;

    /* compiled from: PodcastEpisodesListFragment.kt */
    public static final class a extends oz50 {
        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MUSIC_PODCAST_EPISODE_LIST, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }
    }

    /* compiled from: PodcastEpisodesListFragment.kt */
    public static final class b extends e.a {
        public b() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            RecyclerPaginatedView recyclerPaginatedView = PodcastEpisodesListFragment.this.T;
            if (recyclerPaginatedView == null) {
                recyclerPaginatedView = null;
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

    public PodcastEpisodesListFragment() {
        u2b0 b2 = k840.a.g().b();
        this.Z = b2;
        s750 s750Var = k840.a.e;
        s750 s750Var2 = s750Var == null ? null : s750Var;
        this.a0 = s750Var2;
        this.b0 = msy.a(LazyThreadSafetyMode.NONE, new vv20(this, 14));
        com.vk.music.podcast.impl.ui.list.a aVar = new com.vk.music.podcast.impl.ui.list.a(this.J, this, b2, o25.a(), s750Var2);
        this.X = new zkb0(this, b2, "unknown");
        this.S = aVar;
        this.c0 = new b();
    }

    @Override // xsna.fsv
    public final void Ig(int i, MusicTrack musicTrack) {
        MusicTrack musicTrack2 = musicTrack;
        if (i != R.id.audio_menu) {
            P p = this.S;
            if (p == 0 || musicTrack2 == null) {
                return;
            }
            ((ghb0) p).O0(musicTrack2, this);
            return;
        }
        ghb0 ghb0Var = (ghb0) this.S;
        MusicPlaybackLaunchContext n = ghb0Var != null ? ghb0Var.n() : null;
        FragmentActivity activity = getActivity();
        Activity h = activity != null ? e3m.h(activity) : null;
        if (n == null || musicTrack2 == null || h == null) {
            return;
        }
        ic40.r(lyd.g().w(), h, MusicBottomSheetLaunchPoint.App.b, musicTrack2, n, null, false, false, null, null, 496);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ayn0 ayn0Var = this.Y;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.b();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ghb0 ghb0Var = (ghb0) this.S;
            if (ghb0Var != null) {
                UserId userId = (UserId) arguments.getParcelable("owner_id");
                if (userId == null) {
                    userId = UserId.d;
                }
                ghb0Var.c(userId);
            }
            ghb0 ghb0Var2 = (ghb0) this.S;
            if (ghb0Var2 != null) {
                ghb0Var2.C4(arguments.getString("arg_episodes_order", "recent"));
            }
            int i = arguments.getInt("owner_id");
            b.d a2 = io.reactivex.rxjava3.processors.b.a("podcast_open", "ref", arguments.getString("ref"));
            a2.b(Integer.valueOf(i), "podcast_id");
            a2.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.music_fragment_podcasts_list_screen, viewGroup, false);
        this.U = (VKImageView) inflate.findViewById(R.id.user_logo);
        this.V = (TextView) inflate.findViewById(R.id.title);
        TextView textView = (TextView) inflate.findViewById(R.id.subtitle);
        ghb0 ghb0Var = (ghb0) this.S;
        if (epx.f(ghb0Var != null ? ghb0Var.getOrder() : null, "popular")) {
            textView.setText(R.string.music_podcast_popular_episodes);
        } else {
            textView.setText(R.string.music_title_podcasts);
        }
        this.W = textView;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.back_btn);
        omw.b(imageView, R.attr.vk_ui_icon_accent_themed);
        bwt0.i0(imageView, new p010(this, 20));
        bwt0.i0(inflate.findViewById(R.id.toolbar), new d410(this, 19));
        VKImageView vKImageView = this.U;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.setOnClickListener(new v6d(this, 6));
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        this.T = recyclerPaginatedView;
        recyclerPaginatedView.setAdapter(this.X);
        RecyclerPaginatedView recyclerPaginatedView2 = this.T;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        RecyclerView recyclerView = recyclerPaginatedView2.getRecyclerView();
        awt0.x(recyclerView, 0, iah0.a(8), 0, 0, 13);
        recyclerView.setClipToPadding(false);
        this.Y = new ayn0(recyclerView, null, 30);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        nd50 D6;
        u2b0 r;
        ghb0 ghb0Var = (ghb0) this.S;
        if (ghb0Var != null && (r = ghb0Var.r()) != null) {
            r.release();
        }
        ghb0 ghb0Var2 = (ghb0) this.S;
        if (ghb0Var2 != null && (D6 = ghb0Var2.D6()) != null) {
            D6.release();
        }
        ayn0 ayn0Var = this.Y;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.a();
        super.onDestroyView();
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        u2b0 r;
        ghb0 ghb0Var = (ghb0) this.S;
        if (ghb0Var != null && (r = ghb0Var.r()) != null) {
            r.n0(this.c0);
        }
        super.onPause();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        u2b0 r;
        super.onResume();
        ghb0 ghb0Var = (ghb0) this.S;
        if (ghb0Var == null || (r = ghb0Var.r()) == null) {
            return;
        }
        r.P0(this.c0, true);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerPaginatedView recyclerPaginatedView = this.T;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        if (recyclerView == null) {
            return true;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
    }
}
