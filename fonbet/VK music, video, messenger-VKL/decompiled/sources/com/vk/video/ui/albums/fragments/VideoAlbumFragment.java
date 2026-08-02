package com.vk.video.ui.albums.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import xsna.asu0;
import xsna.bp4;
import xsna.dfr0;
import xsna.dhr0;
import xsna.e6s0;
import xsna.ff20;
import xsna.fyr0;
import xsna.h3p0;
import xsna.hri0;
import xsna.ie40;
import xsna.j6i;
import xsna.jx2;
import xsna.m7m;
import xsna.mmp0;
import xsna.msy;
import xsna.o25;
import xsna.om60;
import xsna.oz50;
import xsna.rpj0;
import xsna.s6s0;
import xsna.u1u0;
import xsna.ucp;
import xsna.w6s0;
import xsna.wik0;
import xsna.wjs0;
import xsna.wxr0;
import xsna.y6s0;
import xsna.ysg0;

/* loaded from: classes7.dex */
public class VideoAlbumFragment extends AbsVideoListFragment {
    public static final /* synthetic */ int i1 = 0;
    public CharSequence a1;
    public String b1;
    public VideoAlbum d1;
    public com.vk.dto.video.VideoAlbum e1;
    public c h1;
    public final VideoApiHelperRepository X0 = ((VideoApiHelperComponent) j6i.b(m7m.d(this), VideoApiHelperComponent.class)).N4();
    public final Object Y0 = msy.a(LazyThreadSafetyMode.NONE, new om60(13));
    public int Z0 = 0;
    public String c1 = "";
    public String f1 = "";
    public boolean g1 = false;

    public class a extends rpj0<VKList<VideoFile>> {
        public a(VideoAlbumFragment videoAlbumFragment) {
            super(videoAlbumFragment);
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            boolean z;
            VKList vKList = (VKList) obj;
            int size = vKList.size();
            VideoAlbumFragment videoAlbumFragment = VideoAlbumFragment.this;
            if (size > 0) {
                int i = VideoAlbumFragment.i1;
                if (videoAlbumFragment.w0.size() + vKList.size() + videoAlbumFragment.v0.size() < vKList.i()) {
                    z = true;
                    videoAlbumFragment.Bo(vKList, z);
                    videoAlbumFragment.c1 = vKList.j();
                }
            }
            z = false;
            videoAlbumFragment.Bo(vKList, z);
            videoAlbumFragment.c1 = vKList.j();
        }
    }

    public static oz50 Ro(VideoAlbum videoAlbum, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("album_id", videoAlbum.b);
        bundle.putString("title", videoAlbum.c);
        bundle.putParcelable("uid", videoAlbum.f);
        bundle.putBoolean("select", z);
        bundle.putParcelable("album", videoAlbum);
        bundle.putBoolean("is_system", videoAlbum.j);
        return new oz50(VideoAlbumFragment.class, null, bundle);
    }

    @Override // com.vk.video.ui.albums.fragments.AbsVideoListFragment
    public final String Mo() {
        return this.f1.isEmpty() ? super.Mo() : this.f1;
    }

    @Override // com.vk.video.ui.albums.fragments.AbsVideoListFragment
    @NonNull
    public q<VKList<VideoFile>> No(int i, int i2) {
        return this.X0.g(this.O0, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.Z0));
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.video.ui.albums.fragments.AbsVideoListFragment
    public final void Qo(VideoFile videoFile) {
        b bVar = new b();
        String Mo = Mo();
        VideoAlbum videoAlbum = this.d1;
        s6s0 s6s0Var = new s6s0(videoFile, Mo, false, videoAlbum != null ? videoAlbum.f : UserId.d, null, false, (this.N0 || this.M0 || this.O0 != o25.a().c()) ? false : true, Integer.valueOf(dhr0.t.c(R.attr.vk_legacy_action_sheet_action_foreground)), null, false, false, false, Integer.valueOf(this.Z0), null, null, MobileOfficialAppsCoreNavStat$EventScreen.OTHER.name(), null, false, null, false, VideoScreenMode.PREVIEW, true, null, null, null, true);
        if (((Boolean) this.Y0.getValue()).booleanValue()) {
            new w6s0(s6s0Var, bVar).e(kn());
        } else {
            new e6s0(kn(), s6s0Var, bVar).c();
        }
    }

    @Override // com.vk.video.ui.albums.fragments.AbsVideoListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 103) {
            String str = ((VideoAlbum) intent.getParcelableExtra("album")).c;
            this.a1 = str;
            setTitle(str);
        }
    }

    @Override // com.vk.video.ui.albums.fragments.AbsVideoListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        VideoAlbum videoAlbum;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            this.Z0 = arguments.getInt("album_id", 0);
        }
        if (arguments != null && arguments.containsKey("title")) {
            ucp ucpVar = ucp.a;
            this.a1 = ucp.i(arguments.getString("title"));
        }
        if (arguments != null && arguments.containsKey("block_id")) {
            this.b1 = arguments.getString("block_id");
        }
        if (arguments != null && arguments.containsKey("album")) {
            VideoAlbum videoAlbum2 = (VideoAlbum) arguments.getParcelable("album");
            this.d1 = videoAlbum2;
            this.e1 = videoAlbum2.d();
        }
        if (arguments != null && arguments.containsKey("referrer")) {
            this.f1 = arguments.getString("referrer");
        }
        if (arguments != null) {
            this.g1 = arguments.getBoolean("is_system", false);
        }
        if (!this.N0 && Objects.equals(this.O0, o25.a().c()) && (videoAlbum = this.d1) != null && videoAlbum.h > 0) {
            z = true;
        }
        setHasOptionsMenu(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.g1) {
            return;
        }
        MenuItem add = menu.add(0, R.id.options, 0, "");
        add.setIcon(dhr0.t.a(R.drawable.vk_icon_more_vertical_24));
        Drawable icon = add.getIcon();
        if (icon != null) {
            icon.setTint(dhr0.u.c(R.attr.vk_legacy_header_tint));
        }
        add.setShowAsAction(2);
        add.setEnabled(true);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        c cVar = this.h1;
        if (cVar != null) {
            cVar.dispose();
            this.h1 = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.options) {
            return super.onOptionsItemSelected(menuItem);
        }
        View findViewById = this.Q.findViewById(R.id.options);
        int c = dhr0.t.c(R.attr.vk_legacy_accent);
        findViewById.getContext();
        e.b bVar = new e.b(findViewById, null, null, c, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        VkContextMenu.c.c(bVar, R.string.video_playlist_bottom_menu_edit_playlist, null, false, null, new com.vk.movika.sdk.base.logic.interactor.c(26, this, this), 28);
        if (!this.g1) {
            VkContextMenu.c.c(bVar, R.string.video_album_remove, null, false, null, new hri0(this, 12), 28);
        }
        dhr0.a.getClass();
        bVar.e = dhr0.E();
        bVar.j();
        return true;
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setTitle(this.a1);
        Toolbar toolbar = this.Q;
        if (toolbar != null) {
            Context context = view.getContext();
            int[] iArr = u1u0.a;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.toolbarIconsColor});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            mmp0 mmp0Var = new mmp0(toolbar.getOverflowIcon().mutate(), color, new wik0());
            if (!h3p0.f(this, toolbar)) {
                toolbar.setOverflowIcon(mmp0Var);
            }
        }
        f<Object> fVar = ysg0.b.a;
        ie40 ie40Var = new ie40(this, 20);
        fVar.getClass();
        this.h1 = new i0(fVar, ie40Var).a0(asu0.a.d()).subscribe(new dfr0(this, 1));
    }

    @Override // com.vk.video.ui.albums.fragments.AbsVideoListFragment, me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        String str = this.b1;
        if (str == null) {
            super.vo(i, i2);
            return;
        }
        bp4 bp4Var = new bp4(str, this.c1, i2);
        ff20 ff20Var = new ff20(bp4Var);
        bp4Var.c(ff20Var);
        this.i0 = new jx2(ff20Var, new a(this)).a();
    }

    public class b implements y6s0 {
        public b() {
        }

        @Override // xsna.y6s0
        public final void b(@NonNull VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, @NonNull VideoFile videoFile) {
            VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions2 = VideoBottomSheetSideEffectOptions.REMOVE_FROM_OWNER;
            VideoAlbumFragment videoAlbumFragment = VideoAlbumFragment.this;
            if (videoBottomSheetSideEffectOptions == videoBottomSheetSideEffectOptions2) {
                wjs0.a(new wxr0(videoFile, videoAlbumFragment.e1.zb(), null, 4));
                wjs0.a(new fyr0(videoFile));
                videoAlbumFragment.Po(videoFile.o0(), videoFile.I0());
                return;
            }
            if (videoBottomSheetSideEffectOptions == VideoBottomSheetSideEffectOptions.REMOVE_FROM_ALBUM) {
                videoAlbumFragment.Po(videoFile.o0(), videoFile.I0());
            }
        }

        @Override // xsna.y6s0
        public final int c2() {
            return 0;
        }

        @Override // xsna.y6s0
        public final void a(@NonNull VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, @NonNull VideoFile videoFile) {
        }
    }
}
