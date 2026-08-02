package com.vk.video.ui.discovery.minimizable.dialog.related_videos;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.core.view.components.button.VkButton;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.i;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.VideoRelatedVideosAdapter;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.j;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.recycler.RelatedVideosRecyclerView;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.acp0;
import xsna.ao50;
import xsna.awt0;
import xsna.b25;
import xsna.b8j0;
import xsna.bct0;
import xsna.bdn;
import xsna.cqr0;
import xsna.df90;
import xsna.dhr0;
import xsna.e9i0;
import xsna.ece0;
import xsna.ef90;
import xsna.enj;
import xsna.epx;
import xsna.exi0;
import xsna.f4m;
import xsna.fcs0;
import xsna.fxc0;
import xsna.gm50;
import xsna.h8n0;
import xsna.hf8;
import xsna.hfs0;
import xsna.hg1;
import xsna.hpj;
import xsna.i8n0;
import xsna.iah0;
import xsna.ie00;
import xsna.ikv0;
import xsna.iri0;
import xsna.j8n0;
import xsna.k9x;
import xsna.km50;
import xsna.l5o;
import xsna.lc1;
import xsna.lpj;
import xsna.mbt0;
import xsna.mct0;
import xsna.mk50;
import xsna.msy;
import xsna.myc0;
import xsna.ozk0;
import xsna.pnr0;
import xsna.qhg0;
import xsna.s3q0;
import xsna.s6s0;
import xsna.sbt0;
import xsna.uft0;
import xsna.uho0;
import xsna.um3;
import xsna.vk50;
import xsna.vts0;
import xsna.whn0;
import xsna.wmd0;
import xsna.wts0;
import xsna.xbt0;
import xsna.y8p0;
import xsna.ybt0;
import xsna.yvq0;
import xsna.z23;
import xsna.zkj0;
import xsna.zvj;

/* compiled from: VideoRelatedVideosFragment.kt */
/* loaded from: classes7.dex */
public final class VideoRelatedVideosFragment extends MviImplFragment<d, k, com.vk.video.ui.discovery.minimizable.dialog.related_videos.b> implements com.vk.libvideo.miniplayer.dialog.a {
    public static final /* synthetic */ int n0 = 0;
    public b Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final com.vk.video.ui.discovery.minimizable.dialog.related_videos.a Y;
    public ikv0 Z;
    public ikv0 a0;
    public ikv0 b0;
    public int c0;
    public String d0;
    public boolean e0;
    public m f0;
    public String g0;
    public VideoRelatedVideosAdapter h0;
    public final boolean i0;
    public final Object j0;
    public final Object k0;
    public final hpj l0;
    public final VideoRelatedVideosFragment$broadcastReceiver$1 m0;

    /* compiled from: VideoRelatedVideosFragment.kt */
    public static final class b {
        public final bct0 a;
        public final RelatedVideosRecyclerView b;
        public final View c;
        public final View d;
        public final VkButton e;

        public b(View view) {
            this.a = new bct0((ViewGroup) view.findViewById(fxc0.B().J().h1() ? R.id.videoDialogHeaderRootV2 : R.id.videoDialogHeaderRoot));
            this.b = (RelatedVideosRecyclerView) view.findViewById(R.id.videoDialogContentView);
            this.c = view.findViewById(R.id.videoDialogLoadingView);
            this.d = view.findViewById(R.id.videoDialogErrorView);
            this.e = (VkButton) view.findViewById(R.id.videoDialogAddPlaylistButton);
        }
    }

    /* compiled from: VideoRelatedVideosFragment.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoRelatedVideosLoopMode.values().length];
            try {
                iArr[VideoRelatedVideosLoopMode.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoRelatedVideosLoopMode.ALL_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoRelatedVideosLoopMode.SINGLE_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment$broadcastReceiver$1] */
    public VideoRelatedVideosFragment() {
        pnr0 pnr0Var = new pnr0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, pnr0Var);
        int i = 11;
        this.S = msy.a(lazyThreadSafetyMode, new h8n0(this, i));
        this.T = msy.a(lazyThreadSafetyMode, new iri0(this, 22));
        this.U = msy.a(lazyThreadSafetyMode, new xbt0(this, 0));
        this.V = msy.a(lazyThreadSafetyMode, new fcs0(this, 5));
        this.W = msy.a(lazyThreadSafetyMode, new acp0(this, 8));
        this.X = msy.a(lazyThreadSafetyMode, new i8n0(this, i));
        this.Y = new com.vk.video.ui.discovery.minimizable.dialog.related_videos.a();
        this.c0 = -1;
        this.f0 = m.c.a;
        this.i0 = fxc0.B().J().h1();
        this.j0 = msy.a(lazyThreadSafetyMode, new y8p0(2));
        this.k0 = msy.a(lazyThreadSafetyMode, new wmd0(this, 21));
        bdn bdnVar = bdn.a;
        this.l0 = zvj.a(ie00.a.U().plus(whn0.a()));
        this.m0 = new BroadcastReceiver() { // from class: com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                VideoRelatedVideosFragment videoRelatedVideosFragment;
                wts0 vj;
                String action = intent.getAction();
                if (action == null || action.hashCode() != 3866578 || !action.equals("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID") || (vj = (videoRelatedVideosFragment = VideoRelatedVideosFragment.this).vj(videoRelatedVideosFragment)) == null) {
                    return;
                }
                vj.T4(vts0.j.d.a);
            }
        };
    }

    public static void fo(VideoRelatedVideosFragment videoRelatedVideosFragment) {
        wts0 vj = super.vj(videoRelatedVideosFragment);
        if (vj != null) {
            vj.T4(vts0.j.g.a);
        }
    }

    public static s3q0 go(VideoRelatedVideosFragment videoRelatedVideosFragment) {
        wts0 vj = super.vj(videoRelatedVideosFragment);
        if (vj != null) {
            vj.T4(vts0.j.b.a);
        }
        return s3q0.a;
    }

    public static s3q0 ho(VideoRelatedVideosFragment videoRelatedVideosFragment, mbt0 mbt0Var) {
        DonutVideoUiModel.DescriptionChip descriptionChip;
        wts0 vj = super.vj(videoRelatedVideosFragment);
        if (vj != null) {
            DonutVideoUiModel donutVideoUiModel = mbt0Var.c;
            vj.T4(new vts0.a((donutVideoUiModel == null || (descriptionChip = donutVideoUiModel.c) == null) ? null : descriptionChip.e));
        }
        return s3q0.a;
    }

    public static s3q0 io(VideoRelatedVideosFragment videoRelatedVideosFragment, mbt0 mbt0Var) {
        wts0 vj = super.vj(videoRelatedVideosFragment);
        if (vj != null) {
            vj.T4(new vts0.j.f(mbt0Var.b));
        }
        return s3q0.a;
    }

    public static s3q0 jo(VideoRelatedVideosFragment videoRelatedVideosFragment) {
        wts0 vj = super.vj(videoRelatedVideosFragment);
        if (vj != null) {
            vj.T4(vts0.j.c.a);
        }
        return s3q0.a;
    }

    public static void ko(VideoRelatedVideosFragment videoRelatedVideosFragment) {
        wts0 vj = super.vj(videoRelatedVideosFragment);
        if (vj != null) {
            vj.T4(vts0.j.h.a);
        }
    }

    public static void lo(VideoRelatedVideosFragment videoRelatedVideosFragment) {
        wts0 vj = super.vj(videoRelatedVideosFragment);
        if (vj != null) {
            vj.T4(vts0.j.a.a);
        }
    }

    public static void mo(VideoRelatedVideosFragment videoRelatedVideosFragment) {
        wts0 vj = super.vj(videoRelatedVideosFragment);
        if (vj != null) {
            vj.V9();
        }
    }

    public static s3q0 no(VideoRelatedVideosFragment videoRelatedVideosFragment) {
        wts0 vj = super.vj(videoRelatedVideosFragment);
        if (vj != null) {
            vj.T4(vts0.j.d.a);
        }
        return s3q0.a;
    }

    public static void to(VkButton vkButton, boolean z) {
        if (!z) {
            vkButton.setBackgroundTint(R.attr.vk_ui_transparent);
            vkButton.setIconTint(R.attr.vk_ui_icon_medium);
        } else {
            vkButton.setBackgroundTint(-1);
            vkButton.setIconTint(-1);
            vkButton.setBackgroundColorful(true);
            vkButton.setIconColorful(true);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(new lpj(mo2getContext, dhr0.u().c)).inflate(R.layout.video_minimizable_dialog_related_videos, (ViewGroup) null);
        if (fxc0.B().J().h1()) {
            inflate.findViewById(R.id.videoDialogHeaderRootV2).setVisibility(0);
            inflate.findViewById(R.id.videoDialogHeaderRoot).setVisibility(8);
        } else {
            inflate.findViewById(R.id.videoDialogHeaderRootV2).setVisibility(8);
            inflate.findViewById(R.id.videoDialogHeaderRoot).setVisibility(0);
        }
        return new mk50.c(inflate);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        View view2;
        k kVar = (k) ao50Var;
        b bVar = new b(view);
        bct0 bct0Var = bVar.a;
        ImageButton imageButton = bct0Var.a;
        imageButton.setImageResource(getParentFragmentManager().K() > 1 ? R.drawable.vk_icon_arrow_left_outline_28 : R.drawable.vk_icon_cancel_outline_28);
        imageButton.setOnClickListener(new um3(this, 11));
        if (this.i0 && (view2 = bct0Var.h) != null) {
            awt0.v(view2, iah0.s(requireContext()));
        }
        hg1.a(((sbt0) super.vj(this)).Bh().subscribe(new yvq0(new ece0(this, 26), 1)), getViewLifecycleOwner());
        VideoRelatedVideosAdapter videoRelatedVideosAdapter = new VideoRelatedVideosAdapter((b25) this.S.getValue(), (DonutVideoComponent) this.W.getValue(), bVar.b, bVar.d, bVar.c, new j8n0(this, 19), new cqr0(this, 9), new uho0(this, 14), new b8j0(this, 18), new e9i0(this, 24), new exi0(this, 26));
        videoRelatedVideosAdapter.setHasStableIds(true);
        this.h0 = videoRelatedVideosAdapter;
        VideoRelatedVideosAdapter qo = qo();
        RelatedVideosRecyclerView relatedVideosRecyclerView = bVar.b;
        relatedVideosRecyclerView.setAdapter(qo);
        relatedVideosRecyclerView.getContext();
        relatedVideosRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        relatedVideosRecyclerView.setHasFixedSize(true);
        relatedVideosRecyclerView.setItemAnimator(null);
        relatedVideosRecyclerView.setTag("nested_scroll_source");
        relatedVideosRecyclerView.addOnScrollListener(new ef90(new a()));
        VideoRelatedVideosAdapter qo2 = qo();
        qo2.L0(VideoRelatedVideosAdapter.State.a(qo2.p, true, false, null, null, 12));
        gm50.a.b(this, kVar.a, new ozk0(4, this, bVar));
        this.Q = bVar;
        getFeature().j.a(new qhg0(this, 24), getViewLifecycleOwner());
        myc0.h(this.l0, null, null, new ybt0(this, null), 3);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        ikv0 ikv0Var = this.Z;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        ikv0 ikv0Var2 = this.a0;
        if (ikv0Var2 != null) {
            ikv0Var2.a();
        }
        ikv0 ikv0Var3 = this.b0;
        if (ikv0Var3 != null) {
            ikv0Var3.a();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        b bVar;
        bct0 bct0Var;
        View view;
        super.onConfigurationChanged(configuration);
        if (!this.i0 || (bVar = this.Q) == null || (bct0Var = bVar.a) == null || (view = bct0Var.h) == null) {
            return;
        }
        awt0.v(view, configuration.orientation == 1);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter a2 = z23.a("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.registerReceiver(this.m0, a2, hf8.a, null, 4);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            enj.s(activity, this.m0);
        }
        zvj.c(this.l0, null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.h0 = null;
        this.Q = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Rn();
    }

    public final void oo(b bVar, j.a aVar) {
        bct0 bct0Var = bVar.a;
        m mVar = aVar.e;
        List<mbt0> list = aVar.f;
        if (mVar instanceof m.a) {
            VideoRelatedVideosAdapter qo = qo();
            VideoRelatedVideosAdapter.State state = qo.p;
            VideoRelatedVideosAdapter.State.FooterHeader footerHeader = VideoRelatedVideosAdapter.State.FooterHeader.Invisible;
            state.getClass();
            qo.L0(new VideoRelatedVideosAdapter.State(false, false, footerHeader, footerHeader));
            qo().J0(list, new zkj0(6, this, aVar));
            bct0Var.d.setEnabled(list.size() > 1);
            bct0Var.e.setEnabled(list.size() > 1);
            bct0Var.f.setEnabled(true);
        } else if (mVar instanceof m.b) {
            qo().clear();
            bct0Var.d.setEnabled(false);
            bct0Var.e.setEnabled(false);
            bct0Var.f.setEnabled(false);
            VideoRelatedVideosAdapter qo2 = qo();
            qo2.L0(VideoRelatedVideosAdapter.State.a(qo2.p, false, true, null, null, 12));
        } else {
            if (!epx.f(mVar, m.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            qo().clear();
            VideoRelatedVideosAdapter qo3 = qo();
            qo3.L0(VideoRelatedVideosAdapter.State.a(qo3.p, true, false, null, null, 12));
            this.e0 = true;
        }
        this.f0 = aVar.e;
    }

    public final String po(VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource, int i) {
        String str = videoDiscoveryRelatedVideosSource.s().e;
        if (str == null) {
            str = "";
        }
        int i2 = videoDiscoveryRelatedVideosSource.b8().f;
        if (i2 > 0) {
            return getResources().getString(R.string.video_related_videos_playlist_subtitle, str, i != -1 ? getResources().getString(R.string.video_related_videos_playlist_number, Integer.valueOf(i + 1), Integer.valueOf(i2)) : String.valueOf(i2));
        }
        return str;
    }

    public final VideoRelatedVideosAdapter qo() {
        VideoRelatedVideosAdapter videoRelatedVideosAdapter = this.h0;
        if (videoRelatedVideosAdapter != null) {
            return videoRelatedVideosAdapter;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    public final s6s0 ro(i.g gVar) {
        VideoFile videoFile = gVar.a;
        VideoAlbum videoAlbum = gVar.b;
        int i = videoAlbum.b;
        UserId userId = videoAlbum.c;
        String r = videoFile.r();
        String str = gVar.c;
        ((com.vk.video.kidsprofile.restricteduseractions.a) this.R.getValue()).getClass();
        return new s6s0(videoFile, str, null, null, false, r, false, false, false, Integer.valueOf(i), userId, null, "VIDEO_DISCOVERY", false, null, false, null, false, (hfs0) this.U.getValue(), (com.vk.video.ui.share.api.b) this.V.getValue(), null, false, 432614872);
    }

    public final void so() {
        VkButton vkButton;
        b bVar = this.Q;
        if (bVar == null || (vkButton = bVar.e) == null) {
            return;
        }
        f4m.j(vkButton);
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_add_outline_24);
        int[] iArr = VkButton.W;
        vkButton.a5(true, valueOf);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new d((l5o) this.X.getValue(), new uft0(), (lc1) this.k0.getValue());
    }

    /* compiled from: VideoRelatedVideosFragment.kt */
    public final class a implements df90 {
        public a() {
        }

        @Override // xsna.df90
        public final void e(int i, int i2, int i3, int i4) {
            wts0 vj;
            wts0 vj2;
            RelatedVideosRecyclerView relatedVideosRecyclerView;
            RelatedVideosRecyclerView relatedVideosRecyclerView2;
            VideoRelatedVideosFragment videoRelatedVideosFragment = VideoRelatedVideosFragment.this;
            m mVar = videoRelatedVideosFragment.f0;
            m.a aVar = mVar instanceof m.a ? (m.a) mVar : null;
            if (aVar != null) {
                mct0 mct0Var = aVar.a;
                k9x k9xVar = mct0Var.b;
                b bVar = videoRelatedVideosFragment.Q;
                boolean z = false;
                if (bVar != null && (relatedVideosRecyclerView2 = bVar.b) != null) {
                    relatedVideosRecyclerView2.setScrolledToFirstItem(k9xVar.b == 0 && i2 == 0);
                }
                b bVar2 = videoRelatedVideosFragment.Q;
                if (bVar2 != null && (relatedVideosRecyclerView = bVar2.b) != null) {
                    if (k9xVar.c >= mct0Var.d - 1 && i3 >= i - 1) {
                        z = true;
                    }
                    relatedVideosRecyclerView.setScrolledToLastItem(z);
                }
                if (mct0.f(mct0Var, k9xVar.b + i2) && (vj2 = videoRelatedVideosFragment.vj(videoRelatedVideosFragment)) != null) {
                    vj2.T4(vts0.j.c.a);
                }
                if (!mct0.e(mct0Var, k9xVar.b + i3) || (vj = videoRelatedVideosFragment.vj(videoRelatedVideosFragment)) == null) {
                    return;
                }
                vj.T4(vts0.j.b.a);
            }
        }

        @Override // xsna.df90
        public final void l(int i) {
        }
    }
}
