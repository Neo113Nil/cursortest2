package com.vk.video.ui.discovery.minimizable.announce;

import android.content.res.Resources;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Owner;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.announce.author.AuthorAnnounceMode;
import com.vk.video.ui.discovery.minimizable.announce.author.AuthorAnnounceState;
import com.vk.video.ui.discovery.minimizable.announce.author.VideoAnnounceAuthor;
import com.vk.video.ui.discovery.minimizable.announce.author.VideoAnnounceAuthorView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.e1m0;
import xsna.e43;
import xsna.exi0;
import xsna.f4m;
import xsna.fxi0;
import xsna.gpt0;
import xsna.iml0;
import xsna.jjc;
import xsna.jwx;
import xsna.m33;
import xsna.mlf0;
import xsna.msy;
import xsna.n9m0;
import xsna.ous0;
import xsna.pus0;
import xsna.rka0;
import xsna.rrn0;
import xsna.rus0;
import xsna.srq0;
import xsna.ug;
import xsna.vg;
import xsna.xlq0;
import xsna.z8s;

/* compiled from: VideoAnnounceViewHolder.kt */
/* loaded from: classes7.dex */
public final class a {
    public final C1971a a;
    public final ous0 b;
    public final pus0 c;
    public final rus0 d;
    public final iml0 e;
    public final n9m0 f;
    public final rrn0 g;
    public final Object h;
    public final Object i;
    public final bpn0 j;
    public final bpn0 k;
    public boolean l;
    public VideoMinimizableState m;
    public VideoAnnounceState n;

    /* compiled from: VideoAnnounceViewHolder.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.announce.a$a, reason: collision with other inner class name */
    public static final class C1971a {
        public final ViewGroup a;
        public final ConstraintLayout b;
        public final VKImageView c;
        public final TextView d;
        public final TextView e;
        public final View f;
        public final TextView g;
        public final Guideline h;
        public final TextView i;
        public final ImageView j;
        public final TextView k;
        public final VKImageView l;
        public final TextView m;
        public final View n;
        public final VideoAnnounceAuthorView o;

        public C1971a(ViewGroup viewGroup) {
            this.a = viewGroup;
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.videoAnnounce);
            this.b = constraintLayout;
            this.c = (VKImageView) constraintLayout.findViewById(R.id.videoAnnounceImageView);
            this.d = (TextView) constraintLayout.findViewById(R.id.videoAnnounceTitleView);
            this.e = (TextView) constraintLayout.findViewById(R.id.videoAnnounceChannelNameView);
            this.f = constraintLayout.findViewById(R.id.videoAnnounceCloseView);
            this.g = (TextView) constraintLayout.findViewById(R.id.videoAnnounceNextTextView);
            this.h = (Guideline) constraintLayout.findViewById(R.id.guideline);
            this.i = (TextView) constraintLayout.findViewById(R.id.videoAnnounceNextAfterTextView);
            this.j = (ImageView) constraintLayout.findViewById(R.id.videoAnnouncePlayIcon);
            this.k = (TextView) constraintLayout.findViewById(R.id.videoAnnounceDurationView);
            this.l = (VKImageView) constraintLayout.findViewById(R.id.videoAnnounceRestrictionIconView);
            this.m = (TextView) constraintLayout.findViewById(R.id.videoAnnounceRestrictionTitleView);
            this.n = constraintLayout.findViewById(R.id.restrictionContainer);
            this.o = (VideoAnnounceAuthorView) viewGroup.findViewById(R.id.video_announce_author_view);
        }
    }

    /* compiled from: VideoAnnounceViewHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthorAnnounceMode.values().length];
            try {
                iArr[AuthorAnnounceMode.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthorAnnounceMode.Shown.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(C1971a c1971a, ous0 ous0Var, pus0 pus0Var, rus0 rus0Var, iml0 iml0Var, n9m0 n9m0Var, rrn0 rrn0Var) {
        this.a = c1971a;
        this.b = ous0Var;
        this.c = pus0Var;
        this.d = rus0Var;
        this.e = iml0Var;
        this.f = n9m0Var;
        this.g = rrn0Var;
        c1971a.c.setDontLoadAgainIfSameResource(true);
        c1971a.f.setOnClickListener(new ug(this, 9));
        c1971a.b.setOnClickListener(new vg(this, 10));
        c1971a.d.setAutoSizeTextTypeWithDefaults(1);
        e1m0 e1m0Var = new e1m0(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, e1m0Var);
        this.i = msy.a(lazyThreadSafetyMode, new mlf0(this, 13));
        this.j = new bpn0(new rka0(this, 26));
        this.k = new bpn0(new srq0(this, 4));
    }

    public final void a() {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        C1971a c1971a = this.a;
        bVar.i(c1971a.b);
        VKImageView vKImageView = c1971a.c;
        int id = vKImageView.getId();
        Guideline guideline = c1971a.h;
        bVar.l(id, 7, guideline.getId(), 7, 0);
        TextView textView = c1971a.d;
        bVar.l(textView.getId(), 3, vKImageView.getId(), 3, cn70.b(8));
        bVar.l(textView.getId(), 6, guideline.getId(), 7, cn70.b(12));
        bVar.l(c1971a.e.getId(), 6, guideline.getId(), 7, cn70.b(12));
        bVar.b(c1971a.b);
    }

    public final void b() {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        C1971a c1971a = this.a;
        bVar.i(c1971a.b);
        ConstraintLayout constraintLayout = c1971a.b;
        f4m.s(cn70.b(16), constraintLayout);
        f4m.r(cn70.b(16), constraintLayout);
        f4m.j(c1971a.h);
        VKImageView vKImageView = c1971a.c;
        bVar.l(vKImageView.getId(), 7, 0, 7, 0);
        TextView textView = c1971a.d;
        bVar.l(textView.getId(), 3, vKImageView.getId(), 4, cn70.b(8));
        bVar.l(textView.getId(), 6, 0, 6, 0);
        bVar.l(c1971a.e.getId(), 6, 0, 6, 0);
        bVar.b(constraintLayout);
    }

    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        ViewGroup viewGroup = this.a.a;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -1);
        bVar.G = "16:9";
        viewGroup.setLayoutParams(bVar);
    }

    public final void d() {
        if (this.l) {
            this.l = false;
            this.a.a.setLayoutParams(new ConstraintLayout.b(-1, -1));
        }
    }

    public final void e(VideoMinimizableState videoMinimizableState, VideoAnnounceState videoAnnounceState) {
        Drawable drawable;
        VideoAnnounceState.Shown shown = videoAnnounceState instanceof VideoAnnounceState.Shown ? (VideoAnnounceState.Shown) videoAnnounceState : null;
        C1971a c1971a = this.a;
        if (shown == null) {
            f4m.j(c1971a.o);
            return;
        }
        AuthorAnnounceState authorAnnounceState = shown.f;
        VideoFile videoFile = shown.b;
        if (videoFile == null) {
            f4m.j(c1971a.o);
            return;
        }
        int i = b.$EnumSwitchMapping$0[authorAnnounceState.b.ordinal()];
        if (i == 1) {
            f4m.j(c1971a.o);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = videoMinimizableState != null && com.vk.libvideo.api.minimizable.a.k(videoMinimizableState);
        Boolean bool = authorAnnounceState.d;
        boolean booleanValue = bool != null ? bool.booleanValue() : videoFile.U();
        VideoAnnounceAuthorView videoAnnounceAuthorView = c1971a.o;
        String P = videoFile.P();
        boolean z2 = videoFile.Y().b;
        Owner s = videoFile.s();
        boolean z3 = s != null && s.i(1024);
        String M0 = videoFile.M0();
        Uri parse = M0 != null ? Uri.parse(M0) : null;
        Owner s2 = videoFile.s();
        VideoAnnounceAuthor videoAnnounceAuthor = new VideoAnnounceAuthor(P, s2 != null ? s2.t : 0, booleanValue, z2, parse, z3);
        videoAnnounceAuthorView.getClass();
        videoAnnounceAuthorView.setTitle(videoAnnounceAuthor.b);
        VkAvatar vkAvatar = videoAnnounceAuthorView.t;
        Uri uri = videoAnnounceAuthor.f;
        String uri2 = uri != null ? uri.toString() : null;
        if (uri2 == null) {
            uri2 = "";
        }
        vkAvatar.o0(uri2, null);
        videoAnnounceAuthorView.setSubscribers(videoAnnounceAuthor.c);
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_verified_16);
        if (!videoAnnounceAuthor.e) {
            valueOf = null;
        }
        if (valueOf == null || (drawable = m33.a(valueOf.intValue(), e43.a)) == null) {
            drawable = null;
        } else {
            drawable.setTint(e43.a.getColor(R.color.vk_sky_300));
        }
        videoAnnounceAuthorView.u.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        videoAnnounceAuthorView.setSubscribeState(videoAnnounceAuthor.d ? VideoAnnounceAuthorView.SubscribeState.Subscribed : VideoAnnounceAuthorView.SubscribeState.Unsubscribed);
        videoAnnounceAuthorView.y = this.f;
        jjc.g(videoAnnounceAuthorView, new exi0(this.g, 20));
        videoAnnounceAuthorView.setTitleMaxLines(Integer.valueOf(z ? 2 : 1));
        int b2 = z ? cn70.b(16) : (int) (Resources.getSystem().getDisplayMetrics().widthPixels * 0.1d);
        f4m.u(videoAnnounceAuthorView, b2, z ? cn70.b(0) : cn70.b(12), b2, cn70.b(18));
        videoAnnounceAuthorView.setVisibility(0);
    }

    public final void f(VideoMinimizableState videoMinimizableState, VideoAnnounceState videoAnnounceState) {
        boolean z = videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal;
        int i = 0;
        C1971a c1971a = this.a;
        if (z) {
            g(videoAnnounceState);
            ConstraintLayout constraintLayout = c1971a.b;
            VKImageView vKImageView = c1971a.l;
            ImageView imageView = c1971a.j;
            int i2 = (int) (Resources.getSystem().getDisplayMetrics().widthPixels * 0.1d);
            f4m.s(i2, constraintLayout);
            f4m.r(i2, c1971a.b);
            bwt0.m0(cn70.b(48), cn70.b(48), imageView);
            imageView.setImageResource(R.drawable.vk_icon_play_28);
            bwt0.m0(cn70.b(32), cn70.b(32), vKImageView);
            vKImageView.setImageResource(R.drawable.vk_icon_hide_outline_28);
            c1971a.m.setVisibility(0);
            d();
            a();
            e(videoMinimizableState, videoAnnounceState);
            return;
        }
        boolean z2 = videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical;
        if (z2 && !((VideoMinimizableState.FullscreenVertical) videoMinimizableState).b) {
            g(videoAnnounceState);
            ImageView imageView2 = c1971a.j;
            VKImageView vKImageView2 = c1971a.l;
            bwt0.m0(cn70.b(48), cn70.b(48), imageView2);
            c1971a.j.setImageResource(R.drawable.vk_icon_play_28);
            bwt0.m0(cn70.b(32), cn70.b(32), vKImageView2);
            vKImageView2.setImageResource(R.drawable.vk_icon_hide_outline_28);
            c1971a.m.setVisibility(0);
            d();
            b();
            e(videoMinimizableState, videoAnnounceState);
            return;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Pip) {
            f4m.j(c1971a.a);
            e(null, null);
            return;
        }
        if (!(videoMinimizableState instanceof VideoMinimizableState.Animating)) {
            if (videoMinimizableState instanceof VideoMinimizableState.Collapsed) {
                c();
                h();
                if (videoAnnounceState instanceof VideoAnnounceState.Shown) {
                    VideoAnnounceState.Shown shown = (VideoAnnounceState.Shown) videoAnnounceState;
                    if (shown.c != null) {
                        c1971a.a.setVisibility(0);
                        VKImageView vKImageView3 = c1971a.c;
                        gpt0 gpt0Var = gpt0.a;
                        ImageSize i3 = gpt0.i(vKImageView3.getContext(), shown.c);
                        vKImageView3.load(String.valueOf(i3 != null ? i3.d.d : null));
                        e(videoMinimizableState, videoAnnounceState);
                        return;
                    }
                }
                f4m.j(c1971a.a);
                e(videoMinimizableState, videoAnnounceState);
                return;
            }
            if (!z2 && !(videoMinimizableState instanceof VideoMinimizableState.Expanded)) {
                f4m.s(cn70.b(16), c1971a.b);
                f4m.r(cn70.b(16), c1971a.b);
                a();
                e(null, null);
                return;
            }
            e(videoMinimizableState, videoAnnounceState);
            g(videoAnnounceState);
            ImageView imageView3 = c1971a.j;
            VKImageView vKImageView4 = c1971a.l;
            bwt0.m0(cn70.b(32), cn70.b(32), imageView3);
            c1971a.j.setImageResource(R.drawable.vk_icon_play_24);
            bwt0.m0(cn70.b(28), cn70.b(28), vKImageView4);
            vKImageView4.setImageResource(R.drawable.vk_icon_hide_outline_28);
            f4m.j(c1971a.m);
            a();
            d();
            return;
        }
        VideoMinimizableState.Animating animating = (VideoMinimizableState.Animating) videoMinimizableState;
        boolean b2 = com.vk.libvideo.api.minimizable.a.b(animating, VideoMinimizableState.Expanded.class, VideoMinimizableState.FullscreenVertical.class);
        VideoMinimizableState videoMinimizableState2 = animating.b;
        float f = animating.d;
        if (!b2 && !com.vk.libvideo.api.minimizable.a.i(animating, new xlq0(2), new fxi0(7))) {
            VideoMinimizableState videoMinimizableState3 = animating.c;
            if ((com.vk.libvideo.api.minimizable.a.h(videoMinimizableState2) && (videoMinimizableState3 instanceof VideoMinimizableState.Collapsed)) || (com.vk.libvideo.api.minimizable.a.h(videoMinimizableState3) && (videoMinimizableState2 instanceof VideoMinimizableState.Collapsed))) {
                c();
                h();
                return;
            }
            if (com.vk.libvideo.api.minimizable.a.a(animating, VideoMinimizableState.FullscreenVertical.class)) {
                if (!(videoMinimizableState2 instanceof VideoMinimizableState.FullscreenVertical)) {
                    f = 1.0f - f;
                }
                if (f > 0.8f) {
                    c();
                    return;
                } else {
                    d();
                    g(videoAnnounceState);
                    return;
                }
            }
            if (com.vk.libvideo.api.minimizable.a.b(animating, VideoMinimizableState.FullscreenHorizontal.class, VideoMinimizableState.Collapsed.class)) {
                c();
                h();
                return;
            } else if (com.vk.libvideo.api.minimizable.a.b(animating, VideoMinimizableState.Expanded.class, VideoMinimizableState.Collapsed.class)) {
                c();
                h();
                return;
            } else {
                d();
                g(videoAnnounceState);
                return;
            }
        }
        if (!(videoMinimizableState2 instanceof VideoMinimizableState.Expanded)) {
            f = 1.0f - f;
        }
        TextView textView = c1971a.d;
        TextView textView2 = c1971a.e;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = (f > 0.4f || f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0 : ((Number) this.j.getValue()).intValue();
        textView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (f <= 0.4f && f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = ((Number) this.k.getValue()).intValue();
        }
        layoutParams2.width = i;
        textView2.setLayoutParams(layoutParams2);
        if (f > 0.4f) {
            b();
        } else {
            a();
        }
        float f2 = f > 0.4f ? (f - 0.4f) / 0.4f : 1.0f - (f / 0.4f);
        c1971a.d.setAlpha(f2);
        textView2.setAlpha(f2);
        float f3 = 0.5f;
        if (f <= 0.4f && f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = 0.5f + (f * 1.25f);
        }
        c1971a.h.setGuidelinePercent(f3);
        d();
        g(videoAnnounceState);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(VideoAnnounceState videoAnnounceState) {
        VideoAnnounceState.Shown shown;
        VideoFile videoFile;
        VideoFile videoFile2;
        boolean z;
        C1971a c1971a = this.a;
        ConstraintLayout constraintLayout = c1971a.b;
        ViewGroup viewGroup = c1971a.a;
        f4m.s(cn70.b(16), constraintLayout);
        ConstraintLayout constraintLayout2 = c1971a.b;
        f4m.r(cn70.b(16), constraintLayout2);
        if (!(videoAnnounceState instanceof VideoAnnounceState.Shown) || (videoFile = (shown = (VideoAnnounceState.Shown) videoAnnounceState).c) == null) {
            f4m.j(viewGroup);
            return;
        }
        boolean z2 = videoFile.O() != null;
        TextView textView = c1971a.g;
        TextView textView2 = c1971a.k;
        TextView textView3 = c1971a.e;
        TextView textView4 = c1971a.d;
        TextView textView5 = c1971a.i;
        VKImageView vKImageView = c1971a.c;
        viewGroup.setVisibility(0);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout2);
        bVar.J(textView4.getId(), 0);
        bVar.J(textView3.getId(), 0);
        bVar.J(c1971a.f.getId(), 0);
        bVar.J(c1971a.j.getId(), z2 ? 8 : 0);
        bVar.J(textView2.getId(), 0);
        bVar.J(vKImageView.getId(), 0);
        bVar.J(c1971a.h.getId(), 0);
        bVar.J(c1971a.n.getId(), z2 ? 0 : 8);
        if (shown.e) {
            bVar.J(textView.getId(), 8);
            videoFile2 = videoFile;
            z = z2;
            textView5.setText(new SpannableString(viewGroup.getContext().getString(R.string.video_announce_video_next_after, Long.valueOf(shown.d))));
            bVar.J(textView5.getId(), 0);
        } else {
            videoFile2 = videoFile;
            z = z2;
            bVar.J(textView.getId(), 0);
            bVar.J(textView5.getId(), 8);
        }
        textView4.setText(videoFile2.getTitle());
        int duration = videoFile2.getDuration();
        gpt0 gpt0Var = gpt0.a;
        textView2.setText(z8s.a(duration));
        textView3.setText(videoFile2.P());
        if (z) {
            vKImageView.setActualColorFilter((PorterDuffColorFilter) this.i.getValue());
            vKImageView.setPostprocessor((jwx) this.h.getValue());
            TextView textView6 = c1971a.m;
            VideoRestriction O = videoFile2.O();
            textView6.setText(O != null ? O.b : null);
            c1971a.l.setVisibility(0);
        }
        gpt0 gpt0Var2 = gpt0.a;
        ImageSize i = gpt0.i(vKImageView.getContext(), videoFile2);
        vKImageView.load(String.valueOf(i != null ? i.d.d : null));
        bVar.b(constraintLayout2);
    }

    public final void h() {
        C1971a c1971a = this.a;
        f4m.j(c1971a.g);
        f4m.j(c1971a.i);
        f4m.j(c1971a.f);
        f4m.j(c1971a.d);
        f4m.j(c1971a.j);
        f4m.j(c1971a.k);
        f4m.j(c1971a.e);
        f4m.j(c1971a.h);
        f4m.j(c1971a.o);
        ConstraintLayout constraintLayout = c1971a.b;
        f4m.s(0, constraintLayout);
        f4m.r(0, constraintLayout);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        VKImageView vKImageView = c1971a.c;
        bVar.l(vKImageView.getId(), 7, 0, 7, 0);
        bVar.l(vKImageView.getId(), 6, 0, 6, 0);
        bVar.b(constraintLayout);
    }
}
