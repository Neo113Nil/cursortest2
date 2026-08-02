package com.vk.video.ui.discovery.minimizable.dialog.about;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.miniplayer.dialog.VideoMinimizableDialogHeaderViewHolder;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.music.api.di.MusicInVideoComponent;
import com.vk.video.ui.discovery.minimizable.dialog.about.a;
import com.vkontakte.android.R;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.awt0;
import xsna.b4;
import xsna.bpn0;
import xsna.c4;
import xsna.c9m0;
import xsna.cp50;
import xsna.dhr0;
import xsna.dso0;
import xsna.e4;
import xsna.ece0;
import xsna.fpf0;
import xsna.fxc0;
import xsna.g8n0;
import xsna.gm50;
import xsna.gpu0;
import xsna.h8n0;
import xsna.hg1;
import xsna.iah0;
import xsna.j6e0;
import xsna.km50;
import xsna.lpj;
import xsna.m7m;
import xsna.mk50;
import xsna.s1i;
import xsna.s3q0;
import xsna.t810;
import xsna.vk50;
import xsna.vts0;
import xsna.wts0;
import xsna.xn50;

/* compiled from: VideoAboutFragment.kt */
/* loaded from: classes7.dex */
public final class VideoAboutFragment extends MviImplFragment<com.vk.video.ui.discovery.minimizable.dialog.about.b, g, com.vk.video.ui.discovery.minimizable.dialog.about.a> implements com.vk.libvideo.miniplayer.dialog.a {
    public static final /* synthetic */ int S = 0;
    public a Q;
    public final bpn0 R = new bpn0(new h8n0(this, 9));

    /* compiled from: VideoAboutFragment.kt */
    public static final class a {
        public final View a;
        public final VkTopBar b;
        public final RecyclerView c;

        public a(View view) {
            this.a = view.findViewById(R.id.grabber);
            this.b = (VkTopBar) view.findViewById(R.id.videoDialogTopBar);
            this.c = (RecyclerView) view.findViewById(R.id.videoDialogContentView);
        }
    }

    /* compiled from: VideoAboutFragment.kt */
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

    /* compiled from: VideoAboutFragment.kt */
    public static final class c implements c4 {
        public c() {
        }

        @Override // xsna.c4
        public final void d(b4 b4Var) {
            boolean z = b4Var instanceof b4.g0;
            VideoAboutFragment videoAboutFragment = VideoAboutFragment.this;
            if (z) {
                xn50.a.c(videoAboutFragment, a.b.b);
                return;
            }
            wts0 k7 = videoAboutFragment.k7(videoAboutFragment);
            if (k7 != null) {
                k7.T4(new vts0.h(b4Var));
            }
        }
    }

    public static s3q0 fo(VideoAboutFragment videoAboutFragment) {
        wts0 vj = super.vj(videoAboutFragment);
        if (vj != null) {
            vj.V9();
        }
        return s3q0.a;
    }

    public static s3q0 go(VideoAboutFragment videoAboutFragment) {
        wts0 vj = super.vj(videoAboutFragment);
        if (vj != null) {
            vj.V9();
        }
        return s3q0.a;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        return new mk50.c(LayoutInflater.from(new lpj(mo2getContext, dhr0.u().c)).inflate(R.layout.video_minimizable_dialog_about, (ViewGroup) null));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> r5;
        io.reactivex.rxjava3.disposables.c subscribe;
        g gVar = (g) ao50Var;
        a aVar = new a(view);
        VkTopBar.Middle.Text text = new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(getString(R.string.video_about_title_redesign), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14);
        VkTopBar vkTopBar = aVar.b;
        vkTopBar.setMiddle(text);
        int i = b.$EnumSwitchMapping$0[super.jh(this).ordinal()];
        if (i == 1) {
            vkTopBar.setBack(new VkTopBar.b(new g8n0(this, 7), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new t810(21), 3), 14));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.C0879c(new c9m0(this, 10), com.vk.core.compose.component.semantics.b.a(null, new j6e0(17), 3)), null, 6));
        }
        awt0.v(aVar.a, iah0.s(requireContext()));
        RecyclerView recyclerView = aVar.c;
        recyclerView.setTag("nested_scroll_source");
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((com.vk.libvideo.bottomsheet.about.delegate.c) this.R.getValue());
        VideoFeatures videoFeatures = VideoFeatures.DISCOVERY_VIDEO_ABOUT_REDESIGN;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures)) {
            dhr0.a.getClass();
            gpu0 gpu0Var = new gpu0(dhr0.s());
            gpu0Var.j = new s1i(1);
            gpu0Var.e = 0;
            recyclerView.addItemDecoration(gpu0Var);
        }
        this.Q = aVar;
        gm50.a.b(this, gVar.a, new ece0(this, 21));
        wts0 k7 = super.k7(this);
        if (k7 == null || (r5 = k7.r5()) == null || (subscribe = r5.subscribe(new cp50(new dso0(this, 10), 20))) == null) {
            return;
        }
        hg1.a(subscribe, getViewLifecycleOwner());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        View view;
        super.onConfigurationChanged(configuration);
        a aVar = this.Q;
        if (aVar == null || (view = aVar.a) == null) {
            return;
        }
        awt0.v(view, configuration.orientation == 1);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q = null;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new com.vk.video.ui.discovery.minimizable.dialog.about.b(((VideoSubscriptionComponent) m7m.d(this).mo408a(fpf0.a(VideoSubscriptionComponent.class))).g0(), fxc0.B().s(), ((MusicInVideoComponent) m7m.d(this).a(fpf0.a(MusicInVideoComponent.class))).pb());
    }
}
