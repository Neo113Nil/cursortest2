package com.vk.clips.playlists.di.stub;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.shortVideo.dto.ShortVideoDeletePlaylistsResponseDto;
import com.vk.clips.playlists.ClipsPlaylistContentLaunchParams;
import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.ClipsPlaylistsSmallFoldersLaunchParams;
import com.vk.clips.playlists.a;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.ui.g0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.l1;
import io.reactivex.rxjava3.internal.operators.single.a0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aee;
import xsna.awe;
import xsna.due;
import xsna.ep;
import xsna.eqe;
import xsna.f5z;
import xsna.fp;
import xsna.fpf0;
import xsna.fqe;
import xsna.gzs;
import xsna.hpf0;
import xsna.hy2;
import xsna.iy2;
import xsna.izs;
import xsna.nmv;
import xsna.nwy;
import xsna.qcy;
import xsna.rdi;
import xsna.s3q0;
import xsna.wte;

/* compiled from: ClipsPlaylistsComponentStub.kt */
/* loaded from: classes16.dex */
public final class ClipsPlaylistsComponentStub implements ClipsPlaylistsComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new hy2(6));
    public final nwy b = new nwy(new g0(13));
    public final nwy c = new nwy(new iy2(11));

    /* compiled from: ClipsPlaylistsComponentStub.kt */
    public static final class b implements due {
        @Override // xsna.due
        public final void a(ClipsPlaylist clipsPlaylist, VideoFile videoFile) {
            rdi.E();
        }

        @Override // xsna.due
        public final void b(ClipsPlaylist clipsPlaylist, VideoFile videoFile) {
            rdi.E();
        }

        @Override // xsna.due
        public final x c(int i, UserId userId) {
            io.reactivex.rxjava3.internal.operators.single.x k = x.k(new ShortVideoDeletePlaylistsResponseDto(EmptyList.b));
            rdi.F(k);
            return k;
        }

        @Override // xsna.due
        public final x d(int i, UserId userId, boolean z) {
            a0 a0Var = a0.b;
            rdi.F(a0Var);
            return a0Var;
        }

        @Override // xsna.due
        public final int e(UserId userId) {
            Integer num = 0;
            rdi.F(num);
            return num.intValue();
        }

        @Override // xsna.due
        public final x<ClipsPlaylist> f(ClipsPlaylist clipsPlaylist, List<? extends VideoFile> list) {
            a0 a0Var = a0.b;
            rdi.F(a0Var);
            return a0Var;
        }

        @Override // xsna.due
        public final x<ClipsPlaylist> g(ClipsPlaylist clipsPlaylist, List<? extends VideoFile> list) {
            a0 a0Var = a0.b;
            rdi.F(a0Var);
            return a0Var;
        }
    }

    /* compiled from: ClipsPlaylistsComponentStub.kt */
    public static final class c implements com.vk.clips.playlists.a {

        /* compiled from: ClipsPlaylistsComponentStub.kt */
        public static final class a implements a.InterfaceC0623a {
            @Override // com.vk.clips.playlists.a.InterfaceC0623a
            public final void a(ClipsPlaylistPickerParams.AddClips addClips) {
                rdi.E();
            }
        }

        @Override // com.vk.clips.playlists.a
        public final void a(Context context, ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams, FragmentManager fragmentManager, wte wteVar) {
            rdi.E();
        }

        @Override // com.vk.clips.playlists.a
        public final void b(Context context, ClipsPlaylistContentLaunchParams clipsPlaylistContentLaunchParams, FragmentManager fragmentManager, gzs<s3q0> gzsVar) {
            rdi.E();
        }

        @Override // com.vk.clips.playlists.a
        public final a.InterfaceC0623a c(Context context, izs<? super ClipsPlaylist, s3q0> izsVar) {
            return new a();
        }

        @Override // com.vk.clips.playlists.a
        public final void d(Context context, ClipsPlaylistPickerParams clipsPlaylistPickerParams) {
            rdi.E();
        }

        @Override // com.vk.clips.playlists.a
        public final void e(ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams, FragmentManager fragmentManager) {
            rdi.E();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsPlaylistsComponentStub.class, "launcher", "getLauncher()Lcom/vk/clips/playlists/ClipsPlaylistsLauncher;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, ClipsPlaylistsComponentStub.class, "interactor", "getInteractor()Lcom/vk/clips/playlists/ClipsPlaylistsInteractor;", hpf0Var), ep.a(0, ClipsPlaylistsComponentStub.class, "viewsProvider", "getViewsProvider()Lcom/vk/clips/playlists/ClipsPlaylistsViewsProvider;", hpf0Var)};
    }

    @Override // com.vk.clips.playlists.di.ClipsPlaylistsComponent
    public final fqe N9() {
        a aVar = new a();
        rdi.F(aVar);
        return aVar;
    }

    @Override // com.vk.clips.playlists.di.ClipsPlaylistsComponent
    public final awe S0() {
        qcy<Object> qcyVar = d[2];
        return (awe) this.c.c();
    }

    @Override // com.vk.clips.playlists.di.ClipsPlaylistsComponent
    public final due b() {
        qcy<Object> qcyVar = d[1];
        return (due) this.b.c();
    }

    @Override // com.vk.clips.playlists.di.ClipsPlaylistsComponent
    public final com.vk.clips.playlists.a e() {
        qcy<Object> qcyVar = d[0];
        return (com.vk.clips.playlists.a) this.a.c();
    }

    /* compiled from: ClipsPlaylistsComponentStub.kt */
    public static final class d implements awe {
        @Override // xsna.awe
        public final aee a(Context context, ClipsPlaylistsSmallFoldersLaunchParams clipsPlaylistsSmallFoldersLaunchParams, gzs<Boolean> gzsVar, f5z f5zVar, gzs<s3q0> gzsVar2) {
            a aVar = new a(new View(context));
            rdi.F(aVar);
            return aVar;
        }

        /* compiled from: ClipsPlaylistsComponentStub.kt */
        public static final class a extends aee {
            @Override // xsna.aee
            public final void V5(nmv nmvVar) {
            }
        }
    }

    /* compiled from: ClipsPlaylistsComponentStub.kt */
    public static final class a implements fqe {
        @Override // xsna.fqe
        public final q<eqe> a() {
            return l1.b;
        }

        @Override // xsna.hqe
        public final void b(eqe eqeVar) {
        }
    }
}
