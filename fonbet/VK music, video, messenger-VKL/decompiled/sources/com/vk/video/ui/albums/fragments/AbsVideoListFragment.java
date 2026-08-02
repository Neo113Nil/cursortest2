package com.vk.video.ui.albums.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.utils.b;
import com.vk.core.view.VideoRestrictionView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.albums.fragments.AbsVideoListFragment;
import com.vk.video.ui.albums.fragments.AbsVideoListFragment.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.fragments.base.GridFragment;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.functions.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.a390;
import xsna.bd70;
import xsna.bpn0;
import xsna.dhr0;
import xsna.e6s0;
import xsna.fc;
import xsna.fnj;
import xsna.fxc0;
import xsna.fyr0;
import xsna.gc;
import xsna.gpt0;
import xsna.hd60;
import xsna.i1t0;
import xsna.i8c0;
import xsna.iah0;
import xsna.ic;
import xsna.j6r0;
import xsna.jc;
import xsna.jjc;
import xsna.l5;
import xsna.m33;
import xsna.msy;
import xsna.o25;
import xsna.om60;
import xsna.p5;
import xsna.pm60;
import xsna.q01;
import xsna.rao;
import xsna.s490;
import xsna.s6s0;
import xsna.uyq0;
import xsna.vif0;
import xsna.w6s0;
import xsna.wjs0;
import xsna.wxr0;
import xsna.y6s0;
import xsna.yg5;
import xsna.z8s;

@Deprecated
/* loaded from: classes7.dex */
public abstract class AbsVideoListFragment extends GridFragment<VideoFile> {
    public static final /* synthetic */ int W0 = 0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public UserId O0;
    public int P0;
    public final c Q0;
    public final Object R0;
    public final Object S0;
    public final Object T0;
    public final Object U0;
    public final Object V0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = AbsVideoListFragment.W0;
            UsableRecyclerView usableRecyclerView = AbsVideoListFragment.this.n0;
            if (usableRecyclerView != null) {
                usableRecyclerView.scrollToPosition(0);
            }
        }
    }

    public class c implements bd70<NewsEntry> {
        public c() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, NewsEntry newsEntry) {
            VideoAttachment Nb;
            VideoFile videoFile;
            NewsEntry newsEntry2 = newsEntry;
            if (!(newsEntry2 instanceof Videos) || (Nb = ((Videos) newsEntry2).Nb()) == null || (videoFile = Nb.k) == null) {
                return;
            }
            AbsVideoListFragment.this.Po(Nb.k.o0(), videoFile.I0());
        }
    }

    public class d extends GridFragment<VideoFile>.b<e> {
        public d() {
            super();
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            AbsVideoListFragment absVideoListFragment = AbsVideoListFragment.this;
            Context mo2getContext = absVideoListFragment.mo2getContext();
            HashSet hashSet = iah0.a;
            ImageScreenSize imageScreenSize = fnj.d(mo2getContext) ? ImageScreenSize.BIG : ImageScreenSize.SMALL;
            int i3 = AbsVideoListFragment.W0;
            ImageSize Cb = ((VideoFile) absVideoListFragment.v0.get(i)).getImage().Cb(imageScreenSize.h(), true, false);
            if (Cb == null) {
                return null;
            }
            return Cb.d.d;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public final RecyclerView.e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return AbsVideoListFragment.this.new e(viewGroup);
        }
    }

    public class e extends vif0<VideoFile> implements View.OnClickListener {
        public final VkText n;
        public final VkText o;
        public final VkText p;
        public final VkText q;
        public final VkImage r;
        public final View s;
        public final VideoOverlayView t;
        public io.reactivex.rxjava3.disposables.c u;

        public e(@NonNull ViewGroup viewGroup) {
            super(viewGroup, R.layout.video_item, 0);
            this.t = (VideoOverlayView) this.itemView.findViewById(R.id.video_item_overlay);
            this.n = (VkText) this.itemView.findViewById(R.id.title);
            this.o = (VkText) this.itemView.findViewById(R.id.subtitle);
            this.p = (VkText) this.itemView.findViewById(R.id.info);
            this.q = (VkText) this.itemView.findViewById(R.id.duration);
            this.r = (VkImage) this.itemView.findViewById(R.id.photo);
            View findViewById = this.itemView.findViewById(R.id.options);
            this.s = findViewById;
            bpn0 bpn0Var = jjc.a;
            findViewById.setOnClickListener(new q01(this, 2));
            this.itemView.setOnClickListener(new q01(this, 2));
            Context context = viewGroup.getContext();
            int a = iah0.a(2);
            int i = VideoRestrictionView.d;
            VideoRestrictionView.a.a(a, context);
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vif0
        public final void i6(VideoFile videoFile) {
            String str;
            VideoFile videoFile2 = videoFile;
            bpn0 bpn0Var = VideoOverlayView.I;
            ic icVar = new ic(this, 0);
            l5 l5Var = new l5(this, 1);
            boolean c = fxc0.B().c(videoFile2);
            jc jcVar = new jc(0, videoFile2);
            p5 p5Var = new p5(1, this, videoFile2);
            VideoRestriction O = videoFile2.O();
            AbsVideoListFragment absVideoListFragment = AbsVideoListFragment.this;
            com.vk.libvideo.design.view.overlay.b a = O != null ? ((a390) absVideoListFragment.T0.getValue()).a(videoFile2.O()) : null;
            boolean z = videoFile2.d8() || videoFile2.z0();
            VideoPipStateHolder.a.getClass();
            yg5 c2 = VideoPipStateHolder.c();
            boolean equals = c2 == null ? false : c2.A().a1().equals(videoFile2.a1());
            Object obj = absVideoListFragment.S0;
            Objects.requireNonNull(obj);
            uyq0 uyq0Var = new uyq0(obj, 6);
            i1t0 i1t0Var = (i1t0) absVideoListFragment.U0.getValue();
            VkImage vkImage = this.r;
            VideoOverlayView videoOverlayView = this.t;
            VkText vkText = this.q;
            VideoOverlayView.b.a(new VideoOverlayView.a(vkImage, videoOverlayView, icVar, l5Var, vkText, true, c, jcVar, p5Var, a, z, equals, uyq0Var, i1t0Var));
            boolean z2 = videoFile2 instanceof MusicVideoFile;
            VkText vkText2 = this.p;
            VkText vkText3 = this.o;
            VkText vkText4 = this.n;
            if (z2) {
                MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile2;
                vkText4.setText(s490.d(this.itemView.getContext(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary));
                vkText4.setMaxLines(1);
                vkText3.setText(s490.d(vkText3.getContext(), s490.i(musicVideoFile.B1), s490.c(musicVideoFile.C1), R.attr.vk_ui_text_secondary));
                vkText2.setText(b.C0795b.d(musicVideoFile.F1, musicVideoFile.E1));
            } else {
                vkText4.setText(gpt0.v(videoFile2));
                vkText4.setMaxLines(2);
                vkText3.setText(videoFile2.P());
                vkText2.setText(videoFile2.L8() > 0 ? b6().getQuantityString(R.plurals.video_views, videoFile2.L8(), Integer.valueOf(videoFile2.L8())) : b6().getString(R.string.no_views));
            }
            MusicVideoFile musicVideoFile2 = z2 ? (MusicVideoFile) videoFile2 : null;
            if (musicVideoFile2 == null || !musicVideoFile2.A1) {
                vkText4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                vkText4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, vkText4.getContext()), (Drawable) null);
                vkText4.setCompoundDrawablePadding(iah0.a(4));
            }
            if (videoFile2.z0()) {
                str = g6(R.string.video_live_upcoming);
            } else if (videoFile2.q0()) {
                str = g6(R.string.video_live).toUpperCase();
            } else if (videoFile2.getDuration() > 0) {
                int duration = videoFile2.getDuration();
                gpt0 gpt0Var = gpt0.a;
                str = z8s.a(duration);
            } else {
                str = "";
            }
            vkText.setText(str);
            this.s.setVisibility(!absVideoListFragment.L0 ? 0 : 8);
            vkText.setBackgroundResource((!videoFile2.q0() || videoFile2.z0()) ? R.drawable.bg_video_duration_label_old : R.drawable.bg_video_live);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            View view2 = this.itemView;
            AbsVideoListFragment absVideoListFragment = AbsVideoListFragment.this;
            if (view != view2) {
                if (view == this.s) {
                    absVideoListFragment.Qo((VideoFile) this.m);
                    return;
                }
                return;
            }
            VideoFile videoFile = (VideoFile) this.m;
            if (absVideoListFragment.L0) {
                absVideoListFragment.Mf(-1, new Intent().putExtra("video", videoFile));
                return;
            }
            FragmentActivity activity = absVideoListFragment.getActivity();
            if (activity == null) {
                return;
            }
            fxc0.B().Y().k(activity, videoFile, absVideoListFragment.Mo(), null, null, null, false, null, null, null, true, false, false, true, -1L, null, null, false, null);
        }
    }

    public AbsVideoListFragment() {
        super(50);
        this.O0 = o25.a().c();
        this.P0 = 0;
        this.Q0 = new c();
        i8c0 i8c0Var = new i8c0(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R0 = msy.a(lazyThreadSafetyMode, i8c0Var);
        this.S0 = msy.a(lazyThreadSafetyMode, new om60(15));
        this.T0 = msy.a(lazyThreadSafetyMode, new pm60(15));
        this.U0 = msy.a(lazyThreadSafetyMode, new fc(0));
        this.V0 = msy.a(lazyThreadSafetyMode, new gc(0));
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final GridFragment<VideoFile>.b<?> Io() {
        return new d();
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final int Ko() {
        int i;
        int width = (this.n0.getWidth() - this.n0.getPaddingLeft()) - this.n0.getPaddingRight();
        if (this.V >= 600) {
            WeakHashMap weakHashMap = j6r0.a;
            i = iah0.a(256.0f);
        } else {
            i = width;
        }
        if (width * i == 0) {
            return 1;
        }
        return width / i;
    }

    public String Mo() {
        return this.O0.b >= 0 ? "videos_user" : "videos_group";
    }

    @NonNull
    public abstract q<VKList<VideoFile>> No(int i, int i2);

    public final void Oo(VideoFile videoFile) {
        ArrayList<T> arrayList = this.v0;
        if (arrayList.isEmpty() || !((VideoFile) arrayList.get(0)).equals(videoFile)) {
            arrayList.add(0, videoFile);
            wo().notifyItemInserted(0);
        } else {
            arrayList.remove(0);
            arrayList.add(0, videoFile);
            wo().notifyItemChanged(0);
        }
    }

    public final void Po(int i, UserId userId) {
        int i2 = 0;
        while (true) {
            ArrayList<T> arrayList = this.v0;
            if (i2 >= arrayList.size()) {
                return;
            }
            VideoFile videoFile = (VideoFile) arrayList.get(i2);
            if (videoFile.I0().equals(userId) && videoFile.o0() == i) {
                arrayList.remove(i2);
                wo().notifyItemRemoved(i2);
                wjs0.a(new wxr0(videoFile));
                this.P0--;
                return;
            }
            i2++;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    public void Qo(VideoFile videoFile) {
        b bVar = new b();
        s6s0 s6s0Var = new s6s0(videoFile, Mo(), false, UserId.d, null, false, false, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_action_sheet_text)), null, false, false, false, null, null, null, MobileOfficialAppsCoreNavStat$EventScreen.OTHER.name(), null, false, null, false, null, true, null, null, null, true);
        if (((Boolean) this.V0.getValue()).booleanValue()) {
            new w6s0(s6s0Var, bVar).e(kn());
        } else {
            new e6s0(kn(), s6s0Var, bVar).c();
        }
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f0) {
            oo();
        } else {
            qo();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1 || i != 8296 || !this.f0) {
            return;
        }
        VideoFile videoFile = (VideoFile) intent.getParcelableExtra("video");
        int i3 = 0;
        while (true) {
            ArrayList<T> arrayList = this.v0;
            if (i3 >= arrayList.size()) {
                return;
            }
            if (((VideoFile) arrayList.get(i3)).equals(videoFile)) {
                arrayList.set(i3, videoFile);
                wo().notifyItemChanged(i3);
                return;
            }
            i3++;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.M0 = getArguments().getBoolean("searchMode");
        this.L0 = getArguments().getBoolean("select", this.L0);
        this.O0 = (UserId) getArguments().getParcelable("uid");
        this.N0 = getArguments().getBoolean("artistMode");
        hd60.a().w().b(100, this.Q0);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        hd60.a().w().g(this.Q0);
        super.onDestroy();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public void vo(int i, final int i2) {
        if (i == 0) {
            this.P0 = 0;
        }
        this.i0 = No(this.P0, i2).subscribe(new f() { // from class: xsna.hc
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                boolean z;
                UsableRecyclerView usableRecyclerView;
                VKList vKList = (VKList) obj;
                int i3 = AbsVideoListFragment.W0;
                int size = vKList.size();
                AbsVideoListFragment absVideoListFragment = AbsVideoListFragment.this;
                if (size > 0) {
                    if (absVideoListFragment.w0.size() + vKList.size() + absVideoListFragment.v0.size() < vKList.i()) {
                        z = true;
                        absVideoListFragment.Bo(vKList, z);
                        if (absVideoListFragment.P0 == 0 && (usableRecyclerView = absVideoListFragment.n0) != null) {
                            usableRecyclerView.post(absVideoListFragment.new a());
                        }
                        absVideoListFragment.P0 += i2;
                    }
                }
                z = false;
                absVideoListFragment.Bo(vKList, z);
                if (absVideoListFragment.P0 == 0) {
                    usableRecyclerView.post(absVideoListFragment.new a());
                }
                absVideoListFragment.P0 += i2;
            }
        }, new rao());
    }

    public class b implements y6s0 {
        public b() {
        }

        @Override // xsna.y6s0
        public final void b(@NonNull VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, @NonNull VideoFile videoFile) {
            if (videoBottomSheetSideEffectOptions == VideoBottomSheetSideEffectOptions.REMOVE_FROM_OWNER) {
                UserId I0 = videoFile.I0();
                AbsVideoListFragment.this.Po(videoFile.o0(), I0);
                wjs0.a(new wxr0(videoFile));
                wjs0.a(new fyr0(videoFile));
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
