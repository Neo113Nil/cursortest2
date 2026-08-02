package com.vk.video.playlist.playlistscreen.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import com.vk.movika.tools.controls.seekbar.j;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b25;
import xsna.b410;
import xsna.b6l;
import xsna.bn50;
import xsna.cga;
import xsna.du0;
import xsna.e3m;
import xsna.epx;
import xsna.es00;
import xsna.f870;
import xsna.fes;
import xsna.fh1;
import xsna.fpf0;
import xsna.g0t;
import xsna.g7s0;
import xsna.gda0;
import xsna.hcb0;
import xsna.izs;
import xsna.jai;
import xsna.kai;
import xsna.l5g;
import xsna.l9s0;
import xsna.lj50;
import xsna.ln20;
import xsna.mri;
import xsna.msy;
import xsna.nbs;
import xsna.ncb0;
import xsna.nwy;
import xsna.nzw;
import xsna.o4e;
import xsna.om9;
import xsna.oz50;
import xsna.pp00;
import xsna.qcy;
import xsna.rrv0;
import xsna.s3q0;
import xsna.spj;
import xsna.wcy;
import xsna.wzs;
import xsna.xds;
import xsna.xy;
import xsna.xzs;
import xsna.yzs;
import xsna.z37;

/* compiled from: PlaylistScreenFragment.kt */
/* loaded from: classes6.dex */
public final class PlaylistScreenFragment extends FragmentImpl implements xds, fes {
    public static final /* synthetic */ qcy<Object>[] T;
    public final int N = f870.H(l5g.j);
    public final boolean O = true;
    public final Object P;
    public final nzw Q;
    public final nbs R;
    public final Object S;

    /* compiled from: PlaylistScreenFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: PlaylistScreenFragment.kt */
    public static final /* synthetic */ class b implements xy, g0t {
        public final /* synthetic */ bn50<PlaylistScreenState, PlaylistScreenState, hcb0, ncb0> b;

        public b(bn50<PlaylistScreenState, PlaylistScreenState, hcb0, ncb0> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((hcb0) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: PlaylistScreenFragment.kt */
    @b6l(c = "com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment$ScreenContent$1$2$1", f = "PlaylistScreenFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements yzs<z37<hcb0>, ncb0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<hcb0> z37Var, ncb0 ncb0Var, spj<? super s3q0> spjVar) {
            c cVar = PlaylistScreenFragment.this.new c(spjVar);
            cVar.L$0 = ncb0Var;
            return cVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ncb0 ncb0Var = (ncb0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            PlaylistScreenFragment playlistScreenFragment = PlaylistScreenFragment.this;
            qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
            playlistScreenFragment.getClass();
            if (epx.f(ncb0Var, ncb0.b.a)) {
                playlistScreenFragment.finish();
            } else if (epx.f(ncb0Var, ncb0.c.a)) {
                nwy nwyVar = playlistScreenFragment.go().m;
                qcy<Object> qcyVar = PlaylistScreenFragmentInternalComponent.y[3];
                b25 b25Var = (b25) nwyVar.c();
                playlistScreenFragment.requireContext();
                b25Var.getClass();
            } else if (ncb0Var instanceof ncb0.d) {
                VideoAlbum videoAlbum = ((ncb0.d) ncb0Var).a;
                g7s0 Ff = playlistScreenFragment.go().Ff();
                playlistScreenFragment.requireContext();
                Ff.getClass();
            } else if (ncb0Var instanceof ncb0.f) {
                l9s0.a.a(playlistScreenFragment.requireContext(), ((ncb0.f) ncb0Var).a);
            } else {
                int i = 1;
                if (ncb0Var instanceof ncb0.e) {
                    g7s0 Ff2 = playlistScreenFragment.go().Ff();
                    Context requireContext = playlistScreenFragment.requireContext();
                    VideoAlbum videoAlbum2 = ((ncb0.e) ncb0Var).a;
                    int i2 = g7s0.G7;
                    Ff2.g(requireContext, videoAlbum2, true);
                } else if (ncb0Var instanceof ncb0.a) {
                    nwy nwyVar2 = playlistScreenFragment.go().o;
                    qcy<Object> qcyVar2 = PlaylistScreenFragmentInternalComponent.y[5];
                    ((cga) nwyVar2.c()).a(playlistScreenFragment.requireContext(), ((ncb0.a) ncb0Var).a);
                } else if (!(ncb0Var instanceof ncb0.i)) {
                    if (ncb0Var instanceof ncb0.h) {
                        ncb0.h hVar = (ncb0.h) ncb0Var;
                        playlistScreenFragment.io(-1, hVar.b, hVar.a);
                    } else if (ncb0Var instanceof ncb0.g) {
                        ncb0.g gVar = (ncb0.g) ncb0Var;
                        List<VideoFile> list = gVar.a;
                        playlistScreenFragment.io(gVar.c, gVar.b, list);
                    } else {
                        if (!(ncb0Var instanceof ncb0.j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        VideoAlbum videoAlbum3 = ((ncb0.j) ncb0Var).a;
                        Activity h = e3m.h(playlistScreenFragment.requireContext());
                        if (h != null) {
                            String str = videoAlbum3.n;
                            if (str == null) {
                                str = playlistScreenFragment.go().a.a.d;
                            }
                            if (((Boolean) playlistScreenFragment.S.getValue()).booleanValue()) {
                                new VideoPlaylistBottomSheetRedesign(new VideoPlaylistBottomSheetRedesign.a(videoAlbum3, new es00(videoAlbum3, 19), new fh1(18, playlistScreenFragment, str), (com.vk.video.ui.share.api.b) null, 24)).c(h);
                            } else {
                                new VideoPlaylistBottomSheet(h, videoAlbum3, new gda0(videoAlbum3, i), new du0(21, playlistScreenFragment, str), (com.vk.video.ui.share.api.b) null, 48).c();
                            }
                        }
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: PlaylistScreenFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<hcb0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(hcb0 hcb0Var) {
            ((z37) this.receiver).b(hcb0Var);
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PlaylistScreenFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        T = new qcy[]{propertyReference1Impl};
    }

    public PlaylistScreenFragment() {
        int i = 10;
        b410 b410Var = new b410(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.P = msy.a(lazyThreadSafetyMode, b410Var);
        pp00 pp00Var = new pp00(this, 17);
        int i2 = wcy.c;
        this.Q = new nzw(fpf0.e(bn50.class, wcy.a.a(fpf0.d(PlaylistScreenState.class)), wcy.a.a(fpf0.d(PlaylistScreenState.class)), wcy.a.a(fpf0.d(hcb0.class)), wcy.a.a(fpf0.d(ncb0.class))).toString(), this, pp00Var);
        this.R = new nbs(this.D);
        this.S = msy.a(lazyThreadSafetyMode, new ln20(this, i));
    }

    @Override // xsna.fes
    public final boolean df() {
        return this.O;
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-72094366);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-72094366, i2, -1, "com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment.ScreenContent (PlaylistScreenFragment.kt:118)");
            }
            fo(((i2 << 3) & 112) | 6, M, kai.c(457380892, new om9(this, 13), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new o4e(this, i, 7);
        }
    }

    public final void fo(final int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        final jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-1432603887);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1432603887, i2, -1, "com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment.VkThemeRedesign (PlaylistScreenFragment.kt:149)");
            }
            M.K(387865312);
            jaiVar2 = jaiVar;
            rrv0.d(null, null, null, null, jaiVar2, M, (i2 << 12) & 57344, 15);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rcb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                    int I = ne7.I(i | 1);
                    PlaylistScreenFragment.this.fo(I, (androidx.compose.runtime.a) obj, jaiVar2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PlaylistScreenFragmentInternalComponent go() {
        return (PlaylistScreenFragmentInternalComponent) this.P.getValue();
    }

    public final bn50<PlaylistScreenState, PlaylistScreenState, hcb0, ncb0> ho() {
        qcy<Object> qcyVar = T[0];
        return (bn50) this.Q.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public final void io(int i, String str, List list) {
        VideoFile videoFile;
        Activity h = e3m.h(requireContext());
        if (h == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((VideoFile) obj).w8()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                videoFile = 0;
                break;
            }
            videoFile = it.next();
            VideoRestriction O = ((VideoFile) videoFile).O();
            if (O == null || O.f) {
                break;
            }
        }
        VideoFile videoFile2 = videoFile;
        if (videoFile2 == null) {
            return;
        }
        go().Ff().Y().i(h, videoFile2, new VideoFeedDialogParams.Playlist(null, go().a.a.d, go().a.a.b, go().a.a.c, arrayList, null, 0, str, i, null, false, null, 3616, null));
    }

    @Override // xsna.xoo0
    public final int l2() {
        return this.N;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        go().Df().d();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        mri mriVar = new mri(context, null, 0);
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        mriVar.addView(composeView);
        mriVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        go().Df().g(mriVar);
        mriVar.setContent(new jai(97799247, new j(this, 10), true));
        return mriVar;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        go().Df().e();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        go().Df().e();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        go().Df().h();
    }
}
