package com.vk.attachpicker.impl.fragment.video;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.b;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.chromium.base.version_info.VersionConstants;
import xsna.a44;
import xsna.awt0;
import xsna.awu;
import xsna.b920;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.c6;
import xsna.enj;
import xsna.ens0;
import xsna.epx;
import xsna.eu;
import xsna.f1;
import xsna.f4m;
import xsna.g6;
import xsna.gpt0;
import xsna.iah0;
import xsna.igq0;
import xsna.j0r0;
import xsna.j5;
import xsna.ksn0;
import xsna.lz0;
import xsna.m33;
import xsna.msy;
import xsna.mto0;
import xsna.n1;
import xsna.p4g;
import xsna.rsg0;
import xsna.rwi;
import xsna.s34;
import xsna.s490;
import xsna.sc;
import xsna.t34;
import xsna.t9;
import xsna.te0;
import xsna.u34;
import xsna.u9;
import xsna.uqm0;
import xsna.v34;
import xsna.v5;
import xsna.vif0;
import xsna.w34;
import xsna.x34;
import xsna.y34;
import xsna.z34;
import xsna.zom0;

/* compiled from: AttachVideoFragment.kt */
/* loaded from: classes15.dex */
public final class AttachVideoFragment extends BaseAttachPickerFragment<VideoData, b> {
    public static final /* synthetic */ int F0 = 0;
    public TabView B0;
    public TabView C0;
    public View D0;
    public final bpn0 z0 = new bpn0(new f1(this, 5));
    public final int A0 = R.layout.fragment_attach_video;
    public b920 E0 = j0r0.c;

    /* compiled from: AttachVideoFragment.kt */
    public static final class a extends BaseAttachPickerFragment.a {
        public a() {
            super(AttachVideoFragment.class, null, null);
        }
    }

    /* compiled from: AttachVideoFragment.kt */
    public static final class b extends vif0<VideoData> {
        public final Object A;
        public final Object B;
        public final Object C;
        public final Object D;
        public final AttachVideoFragment n;
        public final lz0 o;
        public final BaseAttachPickerFragment.b<VideoData> p;
        public final VkImage q;
        public final TextView r;
        public final TextView s;
        public final TextView t;
        public final DurationView u;
        public final InteractiveDurationView v;
        public final VideoOverlayView w;
        public final ImageView x;
        public io.reactivex.rxjava3.disposables.c y;
        public final Object z;

        public b(ViewGroup viewGroup, zom0 zom0Var, AttachVideoFragment attachVideoFragment, lz0 lz0Var) {
            super(viewGroup, R.layout.catalog_video_small_item, 0);
            this.n = attachVideoFragment;
            this.o = lz0Var;
            BaseAttachPickerFragment.b<VideoData> bVar = new BaseAttachPickerFragment.b<>((ViewGroup) this.itemView, zom0Var);
            this.p = bVar;
            VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.preview);
            this.q = vkImage;
            this.r = (TextView) this.itemView.findViewById(R.id.title);
            this.s = (TextView) this.itemView.findViewById(R.id.subtitle_date);
            this.t = (TextView) this.itemView.findViewById(R.id.subtitle_views);
            this.u = (DurationView) this.itemView.findViewById(R.id.duration);
            InteractiveDurationView interactiveDurationView = (InteractiveDurationView) this.itemView.findViewById(R.id.interactive_duration);
            interactiveDurationView.setTextDescriptionVisible(false);
            this.v = interactiveDurationView;
            VideoOverlayView videoOverlayView = (VideoOverlayView) this.itemView.findViewById(R.id.overlay_view);
            this.w = videoOverlayView;
            this.x = (ImageView) this.itemView.findViewById(R.id.icon_verify);
            te0 te0Var = new te0(1);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.z = msy.a(lazyThreadSafetyMode, te0Var);
            this.A = msy.a(lazyThreadSafetyMode, new c6(1));
            this.B = msy.a(lazyThreadSafetyMode, new z34(0));
            this.C = msy.a(lazyThreadSafetyMode, new n1(3));
            this.D = msy.a(lazyThreadSafetyMode, new a44(0));
            vkImage.setPlaceholderImage(m33.a(R.drawable.video_placeholder_64, viewGroup.getContext()));
            ViewGroup.LayoutParams layoutParams = vkImage.getLayoutParams();
            float f = VersionConstants.PRODUCT_MAJOR_VERSION;
            layoutParams.width = iah0.a(f);
            float f2 = 80;
            vkImage.getLayoutParams().height = iah0.a(f2);
            videoOverlayView.getLayoutParams().width = iah0.a(f);
            videoOverlayView.getLayoutParams().height = iah0.a(f2);
            if (!BuildInfo.q()) {
                bwt0.i0(vkImage, new g6(1, this, viewGroup));
            }
            View view = this.itemView;
            view.setPaddingRelative(view.getPaddingStart(), this.itemView.getPaddingTop(), this.itemView.getPaddingStart(), this.itemView.getPaddingBottom());
            bwt0.i0(this.itemView, new t9(this, 5));
            bwt0.p0(this.itemView.findViewById(R.id.menu), false);
            androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
            ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView;
            bVar2.i(constraintLayout);
            bVar2.f(R.id.attachpicker_holder_check_image, 0);
            bVar2.k(R.id.attachpicker_holder_check_image, 7, 0, 7);
            bVar2.b(constraintLayout);
            bVar.d = new com.vk.attachpicker.impl.fragment.video.a(this);
        }

        @Override // xsna.vif0
        public final void i6(VideoData videoData) {
            VideoData videoData2;
            ViewGroup viewGroup;
            VideoOverlayView videoOverlayView;
            VkImage vkImage;
            boolean z;
            VideoData videoData3 = videoData;
            ViewGroup viewGroup2 = this.l;
            if (videoData3 == null) {
                return;
            }
            this.p.a(videoData3);
            VideoFile videoFile = videoData3.b;
            mto0.a.C3369a c3369a = mto0.a.C3369a.g;
            TextView textView = this.s;
            VideoOverlayView videoOverlayView2 = this.w;
            DurationView durationView = this.u;
            InteractiveDurationView interactiveDurationView = this.v;
            TextView textView2 = this.t;
            VkImage vkImage2 = this.q;
            int i = 1;
            TextView textView3 = this.r;
            if (videoFile != null) {
                bwt0.S(vkImage2, new u9(i, this, videoFile));
                textView2.setVisibility(0);
                awt0.v(interactiveDurationView, videoFile.W9());
                awt0.v(durationView, !videoFile.W9());
                videoOverlayView2.setForeground(null);
                boolean z2 = videoFile instanceof MusicVideoFile;
                if (z2) {
                    MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
                    viewGroup = viewGroup2;
                    z = z2;
                    videoOverlayView = videoOverlayView2;
                    textView3.setText(s490.d(this.itemView.getContext(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary));
                    textView3.setCompoundDrawablePadding(iah0.a(4.0f));
                    StringBuilder sb = new StringBuilder();
                    videoData2 = videoData3;
                    sb.append(s490.d(this.itemView.getContext(), s490.i(musicVideoFile.B1), s490.c(musicVideoFile.C1), R.attr.vk_ui_text_secondary));
                    sb.append(" · ");
                    vkImage = vkImage2;
                    sb.append((CharSequence) b.C0795b.d(musicVideoFile.F1, musicVideoFile.E1));
                    textView.setText(sb.toString());
                    VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                    VerifyInfoHelper.k(this.x, false, videoFile.Y(), false, false, 48);
                } else {
                    videoData2 = videoData3;
                    viewGroup = viewGroup2;
                    videoOverlayView = videoOverlayView2;
                    vkImage = vkImage2;
                    z = z2;
                    q6().setLength(0);
                    mto0.a(TimeUnit.SECONDS.toMillis(videoFile.b0()), q6(), c3369a);
                    textView3.setText(videoFile.getTitle());
                    textView2.setText(videoFile.P());
                    StringBuilder sb2 = new StringBuilder();
                    Context context = this.itemView.getContext();
                    sb2.append((CharSequence) (uqm0.g(videoFile.L8()) ? context.getResources().getString(R.string.views_count_raw, uqm0.f(videoFile.L8())) : context.getResources().getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8()))));
                    sb2.append(" · ");
                    sb2.append(b6().getString(R.string.video_updated, q6()));
                    textView.setText(sb2.toString());
                    VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
                    VerifyInfoHelper.k(this.x, false, videoFile.Y(), false, false, 48);
                }
                MusicVideoFile musicVideoFile2 = z ? (MusicVideoFile) videoFile : null;
                if (musicVideoFile2 == null || !musicVideoFile2.A1) {
                    textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView3.getContext()), (Drawable) null);
                    textView3.setCompoundDrawablePadding(iah0.a(4));
                }
                if (videoFile.q0() || videoFile.z0()) {
                    durationView.setBackgroundResource(R.drawable.bg_video_live);
                } else {
                    durationView.setBackgroundResource(R.drawable.bg_video_duration_label_old);
                }
                if (videoFile.W9()) {
                    interactiveDurationView.setDurationText(gpt0.m(durationView.getContext(), videoFile, true, false));
                } else {
                    durationView.setText(gpt0.m(durationView.getContext(), videoFile, true, false));
                }
                vkImage.setContentDescription(gpt0.g(this.itemView.getContext(), videoFile));
            } else {
                videoData2 = videoData3;
                viewGroup = viewGroup2;
                videoOverlayView = videoOverlayView2;
                vkImage = vkImage2;
            }
            VideoAlbum videoAlbum = videoData2.c;
            if (videoAlbum != null) {
                int i2 = videoAlbum.f;
                VideoOverlayView videoOverlayView3 = videoOverlayView;
                videoOverlayView3.setForeground(m33.a(R.drawable.catalog_album_label_attach, this.itemView.getContext()));
                videoOverlayView3.setVisibility(0);
                textView3.setText(videoAlbum.d);
                this.itemView.getContext().getString(R.string.vkim_msg_list_video_album_desc);
                if (i2 > 0) {
                    viewGroup.getContext().getString(R.string.vkim_msg_list_video_album_videos_count, Integer.valueOf(i2));
                } else {
                    viewGroup.getContext().getString(R.string.vkim_msg_list_video_album_videos_empty);
                }
                Resources b6 = b6();
                int i3 = videoAlbum.m;
                textView2.setText(enj.i(b6, R.plurals.followers_count, i3, R.string.video_catalog_playlist_zero_subscribers, uqm0.f(i3)));
                q6().setLength(0);
                mto0.a(TimeUnit.SECONDS.toMillis(videoAlbum.g), q6(), c3369a);
                textView.setText(b6().getString(R.string.video_album_updated, q6()));
                f4m.j(durationView);
                f4m.j(interactiveDurationView);
                ImageSize Cb = videoAlbum.h.Cb(vkImage.getWidth(), true, false);
                vkImage.o0(Cb != null ? Cb.d.d : null, null);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final StringBuffer q6() {
            return (StringBuffer) this.z.getValue();
        }
    }

    /* compiled from: AttachVideoFragment.kt */
    public static final class c implements ksn0 {
        @Override // xsna.ksn0
        public final Integer d() {
            return Integer.valueOf(R.string.video_tab_filter);
        }

        @Override // xsna.ksn0
        public final Integer g() {
            return null;
        }

        @Override // xsna.ksn0
        public final Integer h() {
            return Integer.valueOf(R.drawable.vk_icon_video_square_outline_20);
        }
    }

    /* compiled from: AttachVideoFragment.kt */
    public static final class d implements ksn0 {
        @Override // xsna.ksn0
        public final Integer d() {
            return Integer.valueOf(R.string.video_playlist_tab_filter);
        }

        @Override // xsna.ksn0
        public final Integer g() {
            return null;
        }

        @Override // xsna.ksn0
        public final Integer h() {
            return Integer.valueOf(R.drawable.vk_icon_list_play_outline_20);
        }
    }

    @Override // xsna.txt0
    public final vif0 Cl(ViewGroup viewGroup, zom0 zom0Var) {
        return new b(viewGroup, zom0Var, this, new lz0(this, 2));
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        b920 b920Var = this.E0;
        igq0 igq0Var = b920Var instanceof igq0 ? (igq0) b920Var : null;
        if ((igq0Var != null ? igq0Var.c : null) != null) {
            wo(new igq0(null));
            return true;
        }
        oo().c(this);
        return false;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final int jo() {
        return this.A0;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final q<VkPaginationList<VideoData>> ko(int i, com.vk.lists.c cVar) {
        int k = cVar.k();
        return ((VideoApiHelperRepository) this.z0.getValue()).d(new VideoApiHelperRepository.SearchVideosParams(120, Integer.valueOf(i), Integer.valueOf(k), this.q0)).U(new t34(new s34(i, this, k), 0));
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final Bundle lo(String str) {
        zom0<T> zom0Var = this.c0;
        zom0Var.getClass();
        ArrayList arrayList = new ArrayList(zom0Var.a);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((VideoData) it.next()).b);
        }
        ArrayList<? extends Parcelable> q = p4g.q(arrayList2);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(str, q);
        return bundle;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final String mo() {
        return "mVideo";
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final String no() {
        return "video";
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        super.onDestroyView();
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        eu supportActionBar;
        super.onViewCreated(view, bundle);
        TabView tabView = (TabView) view.findViewById(R.id.video_filter_tab);
        tabView.setTab(new c());
        tabView.setTabSelected(true);
        bwt0.i0(tabView, new v5(this, 9));
        this.B0 = tabView;
        TabView tabView2 = (TabView) view.findViewById(R.id.video_playlist_filter_tab);
        tabView2.setTab(new d());
        bwt0.i0(tabView2, new j5(this, 5));
        this.C0 = tabView2;
        this.D0 = view.findViewById(R.id.tabs_container);
        ((AppCompatActivity) getActivity()).setTitle(R.string.newsfeed_newpost_tab_videos_title);
        FragmentActivity activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity == null || (supportActionBar = appCompatActivity.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.n(false);
        supportActionBar.o(false);
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final q<VkPaginationList<VideoData>> po(int i, com.vk.lists.c cVar) {
        b920 b920Var = this.E0;
        boolean z = b920Var instanceof j0r0;
        bpn0 bpn0Var = this.z0;
        if (z) {
            int i2 = 0;
            return ((VideoApiHelperRepository) bpn0Var.getValue()).g(this.b0, Integer.valueOf(i), 30, null).U(new v34(new u34(i, i2), i2));
        }
        if (!(b920Var instanceof igq0)) {
            throw new NoWhenBranchMatchedException();
        }
        VideoAlbum videoAlbum = ((igq0) b920Var).c;
        if (videoAlbum == null) {
            return rsg0.y0(new ens0(this.b0, i, 30), null, null, 3).U(new y34(new sc(2), 0));
        }
        q<VKList<VideoFile>> g = ((VideoApiHelperRepository) bpn0Var.getValue()).g(this.b0, Integer.valueOf(i), 30, Integer.valueOf(videoAlbum.b));
        int i3 = 0;
        return g.U(new x34(new w34(i, i3), i3));
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final void vo(String str) {
        b920 b920Var = this.E0;
        igq0 igq0Var = b920Var instanceof igq0 ? (igq0) b920Var : null;
        VideoAlbum videoAlbum = igq0Var != null ? igq0Var.c : null;
        boolean z = false;
        boolean z2 = videoAlbum != null;
        View view = this.D0;
        if (view != null) {
            if (str.length() == 0 && !z2) {
                z = true;
            }
            awt0.v(view, z);
        }
        super.vo(str);
    }

    public final void wo(b920 b920Var) {
        eu supportActionBar;
        VideoAlbum videoAlbum;
        String str;
        if (epx.f(this.E0, b920Var)) {
            return;
        }
        com.vk.lists.c cVar = this.t0;
        if (cVar == null || !(cVar.w || cVar.x)) {
            boolean z = b920Var instanceof igq0;
            boolean z2 = true;
            boolean z3 = z && ((igq0) b920Var).c == null;
            j0r0 j0r0Var = j0r0.c;
            boolean z4 = (epx.f(b920Var, j0r0Var) || z3) ? false : true;
            igq0 igq0Var = z ? (igq0) b920Var : null;
            if (igq0Var == null || (videoAlbum = igq0Var.c) == null || (str = videoAlbum.d) == null) {
                ((AppCompatActivity) getActivity()).setTitle(R.string.newsfeed_newpost_tab_videos_title);
            } else {
                ((AppCompatActivity) getActivity()).setTitle(str);
            }
            TabView tabView = this.C0;
            if (tabView != null) {
                tabView.setTabSelected(z3);
            }
            TabView tabView2 = this.B0;
            if (tabView2 != null) {
                tabView2.setTabSelected(epx.f(b920Var, j0r0Var));
            }
            View view = this.D0;
            if (view != null) {
                if (!epx.f(b920Var, j0r0Var) && !z3) {
                    z2 = false;
                }
                awt0.v(view, z2);
            }
            if (z4) {
                rwi.d().p().b(this);
            }
            FragmentActivity activity = getActivity();
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
                supportActionBar.n(z4);
                supportActionBar.o(z4);
            }
            this.E0 = b920Var;
            EmptyList emptyList = EmptyList.b;
            ArrayList<T> arrayList = this.s0;
            arrayList.clear();
            arrayList.addAll(emptyList);
            this.r0 = 0;
            awu awuVar = this.a0;
            if (awuVar != null) {
                awuVar.clear();
            }
            com.vk.lists.c cVar2 = this.t0;
            if (cVar2 != null) {
                cVar2.p(false);
            }
        }
    }
}
