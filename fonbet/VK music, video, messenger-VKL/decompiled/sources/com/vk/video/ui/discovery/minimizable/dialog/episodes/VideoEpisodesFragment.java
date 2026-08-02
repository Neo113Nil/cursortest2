package com.vk.video.ui.discovery.minimizable.dialog.episodes;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.miniplayer.dialog.VideoMinimizableDialogHeaderViewHolder;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Optional;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ao50;
import xsna.atp;
import xsna.awt0;
import xsna.bpn0;
import xsna.c9m0;
import xsna.cp50;
import xsna.dhr0;
import xsna.dso0;
import xsna.e4;
import xsna.ece0;
import xsna.fi50;
import xsna.fxc0;
import xsna.gm50;
import xsna.gpu0;
import xsna.hg1;
import xsna.i8n0;
import xsna.iah0;
import xsna.isp;
import xsna.j8n0;
import xsna.jai;
import xsna.km50;
import xsna.lpj;
import xsna.mk50;
import xsna.msy;
import xsna.mut0;
import xsna.prq0;
import xsna.qjl0;
import xsna.rjs0;
import xsna.s3q0;
import xsna.u05;
import xsna.vk50;
import xsna.vts0;
import xsna.wh50;
import xsna.wmd0;
import xsna.wts0;
import xsna.y3l0;
import xsna.yg5;

/* compiled from: VideoEpisodesFragment.kt */
/* loaded from: classes7.dex */
public final class VideoEpisodesFragment extends MviImplFragment<com.vk.video.ui.discovery.minimizable.dialog.episodes.b, f, com.vk.video.ui.discovery.minimizable.dialog.episodes.a> implements com.vk.libvideo.miniplayer.dialog.a {
    public static final /* synthetic */ int V = 0;
    public a Q;
    public final bpn0 R = new bpn0(new i8n0(this, 7));
    public final Object S;
    public final Object T;
    public final wh50<List<atp>> U;

    /* compiled from: VideoEpisodesFragment.kt */
    public static final class a {
        public final VideoMinimizableDialogHeaderViewHolder a;
        public final View b;
        public final VkTopBar c;
        public final RecyclerView d;

        public a(View view) {
            this.a = new VideoMinimizableDialogHeaderViewHolder((ViewGroup) view.findViewById(fxc0.B().J().h1() ? R.id.videoDialogHeaderRootV2 : R.id.videoDialogHeaderRootLegacy));
            this.b = view.findViewById(R.id.grabber);
            this.c = (VkTopBar) view.findViewById(R.id.videoDialogTopBar);
            this.d = (RecyclerView) view.findViewById(R.id.videoDialogContentView);
        }
    }

    /* compiled from: VideoEpisodesFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoMinimizableDialogHeaderViewHolder.IconMode.values().length];
            try {
                iArr[VideoMinimizableDialogHeaderViewHolder.IconMode.Back.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoMinimizableDialogHeaderViewHolder.IconMode.Close.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoEpisodesFragment() {
        prq0 prq0Var = new prq0(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, prq0Var);
        this.T = msy.a(lazyThreadSafetyMode, new wmd0(this, 18));
        this.U = k.b(EmptyList.b);
    }

    public static s3q0 fo(VideoEpisodesFragment videoEpisodesFragment, atp atpVar) {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        yg5 e = b.C1208b.a().e(atpVar.b, null);
        if (!e.P0()) {
            if (e.J() || e.v0() == null) {
                e.S(true);
            }
            e.seek(atpVar.g * 1000);
        }
        wts0 vj = super.vj(videoEpisodesFragment);
        if (vj != null) {
            vj.T4(new vts0.i.a(atpVar));
        }
        return s3q0.a;
    }

    public static s3q0 go(VideoEpisodesFragment videoEpisodesFragment, atp atpVar) {
        wts0 vj = super.vj(videoEpisodesFragment);
        if (vj != null) {
            vj.T4(new vts0.i.a(atpVar));
        }
        return s3q0.a;
    }

    public static s3q0 ho(VideoEpisodesFragment videoEpisodesFragment) {
        wts0 vj = super.vj(videoEpisodesFragment);
        if (vj != null) {
            vj.V9();
        }
        return s3q0.a;
    }

    public static s3q0 io(VideoEpisodesFragment videoEpisodesFragment) {
        wts0 vj = super.vj(videoEpisodesFragment);
        if (vj != null) {
            vj.V9();
        }
        return s3q0.a;
    }

    public static s3q0 jo(VideoEpisodesFragment videoEpisodesFragment) {
        wts0 vj = super.vj(videoEpisodesFragment);
        if (vj != null) {
            vj.V9();
        }
        return s3q0.a;
    }

    public static boolean ko() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_DISCOVERY_EPISODES_REDESIGN;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(new lpj(mo2getContext, dhr0.u().c)).inflate(R.layout.video_minimizable_dialog_episodes, (ViewGroup) null);
        if (ko()) {
            inflate.findViewById(R.id.videoDialogHeaderRoot).setVisibility(0);
            inflate.findViewById(R.id.videoDialogHeaderRootV2).setVisibility(8);
            inflate.findViewById(R.id.videoDialogHeaderRootLegacy).setVisibility(8);
        } else if (fxc0.B().J().h1()) {
            inflate.findViewById(R.id.videoDialogHeaderRootV2).setVisibility(0);
            inflate.findViewById(R.id.videoDialogHeaderRootLegacy).setVisibility(8);
        } else {
            inflate.findViewById(R.id.videoDialogHeaderRootV2).setVisibility(8);
            inflate.findViewById(R.id.videoDialogHeaderRootLegacy).setVisibility(0);
        }
        if (ko()) {
            ComposeView composeView = (ComposeView) inflate.findViewById(R.id.videoDialogContentCompose);
            composeView.setVisibility(0);
            composeView.setViewCompositionStrategy(mut0.c.a);
            composeView.setContent(new jai(-526031175, new u05(this, 13), true));
            inflate.findViewById(R.id.videoDialogContentView).setVisibility(8);
        }
        return new mk50.c(inflate);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> r5;
        io.reactivex.rxjava3.disposables.c subscribe;
        fi50 fi50Var = ((f) ao50Var).a;
        a aVar = new a(view);
        if (ko()) {
            VkTopBar.Middle.Text text = new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(getString(R.string.video_episode_title), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14);
            VkTopBar vkTopBar = aVar.c;
            vkTopBar.setMiddle(text);
            int i = b.$EnumSwitchMapping$0[super.jh(this).ordinal()];
            if (i == 1) {
                vkTopBar.setBack(new VkTopBar.b(new j8n0(this, 12), null, null, null, null, 30));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.C0879c(new y3l0(this, 18), null), null, 6));
            }
            awt0.v(aVar.b, iah0.s(requireContext()));
        } else {
            aVar.a.a(super.jh(this), getString(R.string.video_episode_title), iah0.s(requireContext()), new c9m0(this, 12));
        }
        this.Q = aVar;
        if (ko()) {
            gm50.a.b(this, fi50Var, new qjl0(this, 13));
        } else {
            RecyclerView recyclerView = this.Q.d;
            requireContext();
            recyclerView.setTag("nested_scroll_source");
            recyclerView.setAdapter((isp) this.T.getValue());
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.setHasFixedSize(true);
            dhr0.a.getClass();
            gpu0 gpu0Var = new gpu0(dhr0.s());
            gpu0Var.j = new rjs0();
            gpu0Var.e = 0;
            recyclerView.addItemDecoration(gpu0Var);
            gm50.a.b(this, fi50Var, new ece0(this, 23));
        }
        wts0 vj = super.vj(this);
        if (vj == null || (r5 = vj.r5()) == null || (subscribe = r5.subscribe(new cp50(new dso0(this, 15), 22))) == null) {
            return;
        }
        hg1.a(subscribe, getViewLifecycleOwner());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        VideoMinimizableDialogHeaderViewHolder videoMinimizableDialogHeaderViewHolder;
        View view;
        super.onConfigurationChanged(configuration);
        if (ko()) {
            a aVar = this.Q;
            if (aVar == null || (view = aVar.b) == null) {
                return;
            }
            awt0.v(view, configuration.orientation == 1);
            return;
        }
        a aVar2 = this.Q;
        if (aVar2 == null || (videoMinimizableDialogHeaderViewHolder = aVar2.a) == null) {
            return;
        }
        boolean z = configuration.orientation == 1;
        View view2 = videoMinimizableDialogHeaderViewHolder.d;
        if (view2 != null) {
            awt0.v(view2, z);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q = null;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new com.vk.video.ui.discovery.minimizable.dialog.episodes.b();
    }
}
