package com.vk.newsfeed.common.recycler.holders;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.ad.BaseAdsDataProvider;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.newsfeed.presentation.model.ClickArea;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.Collections;
import java.util.List;
import xsna.a1n;
import xsna.asu0;
import xsna.bwt0;
import xsna.di60;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.fh5;
import xsna.fkq0;
import xsna.fxc0;
import xsna.gd60;
import xsna.hd60;
import xsna.j6r0;
import xsna.jgs0;
import xsna.jjc;
import xsna.ktc0;
import xsna.mdm0;
import xsna.qr0;
import xsna.r7a0;
import xsna.t0n;
import xsna.tps0;
import xsna.u1c0;
import xsna.wvn;
import xsna.ydt0;
import xsna.yg5;
import xsna.z1c0;
import xsna.zmk;

/* compiled from: VideoSnippetAutoPlayHolder.kt */
/* loaded from: classes4.dex */
public final class VideoSnippetAutoPlayHolder extends BaseVideoAutoPlayHolder<z1c0, VideoSnippetAttachment> implements a1n, t0n {
    public Integer A0;
    public final wvn s0;
    public final zmk t0;
    public final View u0;
    public final View v0;
    public final TextView w0;
    public final TextView x0;
    public boolean y0;
    public io.reactivex.rxjava3.disposables.c z0;

    public VideoSnippetAutoPlayHolder(ViewGroup viewGroup, wvn wvnVar, zmk zmkVar) {
        super(R.layout.attach_video_snippet, viewGroup, new tps0.b());
        this.s0 = wvnVar;
        this.t0 = zmkVar;
        this.u0 = this.itemView.findViewById(R.id.video_snippet_progress_view);
        View findViewById = this.itemView.findViewById(R.id.video_snippet_action_button);
        this.v0 = findViewById;
        this.w0 = (TextView) this.itemView.findViewById(R.id.video_snippet_title);
        this.x0 = (TextView) this.itemView.findViewById(R.id.video_snippet_caption);
        findViewById.setOnClickListener(this);
        this.L.z0 = this;
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        f4m.m(8388661, this.Z);
        StringBuilder sb = new StringBuilder();
        RatioFrameLayout ratioFrameLayout = this.W;
        sb.append(ratioFrameLayout.getContentDescription());
        sb.append(".");
        sb.append(di60.m(disclaimerData, this.itemView.getContext()));
        ratioFrameLayout.setContentDescription(sb.toString());
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public final void E7(Activity activity) {
        Activity h;
        yg5 yg5Var;
        com.vk.libvideo.autoplay.a config;
        SnippetAdsProvider snippetAdsProvider;
        SnippetAdsProvider snippetAdsProvider2;
        SnippetAdsProvider snippetAdsProvider3;
        VideoSnippetAttachment videoSnippetAttachment = (VideoSnippetAttachment) this.E;
        if (videoSnippetAttachment == null || (h = e3m.h(this.itemView.getContext())) == null || h.isFinishing() || (yg5Var = this.h0) == null || (config = yg5Var.getConfig()) == null || config.a) {
            return;
        }
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        NewsEntry t6 = t6();
        if (!(t6 instanceof Post)) {
            if (t6 instanceof PromoPost) {
                snippetAdsProvider2 = new SnippetAdsProvider((PromoPost) t6, videoSnippetAttachment, this.w, i, this.A0);
            } else if (t6 instanceof ShitAttachment) {
                snippetAdsProvider2 = new SnippetAdsProvider((ShitAttachment) t6, videoSnippetAttachment, this.w, i);
            } else {
                snippetAdsProvider = null;
            }
            snippetAdsProvider3 = snippetAdsProvider2;
            ydt0.s(fxc0.B().Y(), h, r7(), this, false, null, null, snippetAdsProvider3, null, null, 16096);
        }
        snippetAdsProvider = new SnippetAdsProvider((Post) t6, videoSnippetAttachment, this.w, i);
        snippetAdsProvider3 = snippetAdsProvider;
        ydt0.s(fxc0.B().Y(), h, r7(), this, false, null, null, snippetAdsProvider3, null, null, 16096);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public final void F7(View view, int i, boolean z) {
        VideoSnippetAttachment videoSnippetAttachment;
        Activity h = e3m.h(this.itemView.getContext());
        if (h == null || (videoSnippetAttachment = (VideoSnippetAttachment) this.E) == null) {
            return;
        }
        if (this.I && this.h0 != null) {
            E7(h);
            return;
        }
        if (epx.f(videoSnippetAttachment.k.toString(), h.getIntent().getStringExtra("from_video"))) {
            h.finish();
            return;
        }
        N n = this.E;
        SnippetAdsProvider snippetAdsProvider = null;
        VideoSnippetAttachment videoSnippetAttachment2 = n instanceof VideoSnippetAttachment ? (VideoSnippetAttachment) n : null;
        if (videoSnippetAttachment2 == null) {
            return;
        }
        Intent intent = new Intent(h, hd60.a().k0());
        intent.putExtra(X3.i.b, r7());
        VideoFile r7 = r7();
        intent.putExtra("ownerId", r7 != null ? r7.I0() : null);
        VideoFile r72 = r7();
        intent.putExtra("videoId", r72 != null ? Integer.valueOf(r72.o0()) : null);
        intent.putExtra("file_index", intent.hashCode());
        intent.putExtra("referrer", ((VideoSnippetAttachment) this.E).l);
        VideoFile r73 = r7();
        boolean z2 = false;
        if (r73 != null && r73.l1() == 0) {
            z2 = true;
        }
        intent.putExtra("load_likes", z2);
        intent.putExtra("hide_ui", "news".equals(videoSnippetAttachment2.l));
        intent.putExtra("autoplay", z);
        intent.putExtra("quality", i);
        u1c0 J0 = J0();
        int i2 = J0 != null ? J0.k : -1;
        NewsEntry t6 = t6();
        if (t6 instanceof Post) {
            snippetAdsProvider = new SnippetAdsProvider((Post) t6, videoSnippetAttachment2, this.w, i2);
        } else if (t6 instanceof PromoPost) {
            snippetAdsProvider = new SnippetAdsProvider((PromoPost) t6, videoSnippetAttachment2, this.w, i2, this.A0);
        } else if (t6 instanceof ShitAttachment) {
            snippetAdsProvider = new SnippetAdsProvider((ShitAttachment) t6, videoSnippetAttachment2, this.w, i2);
        }
        if (snippetAdsProvider != null) {
            intent.putExtra(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, snippetAdsProvider);
        }
        intent.putExtra("context", videoSnippetAttachment2.m);
        intent.putExtra("statistic", videoSnippetAttachment2.o);
        h.startActivity(intent);
        h.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override // xsna.qi6
    public final void I6() {
        wvn wvnVar;
        super.I6();
        this.A0 = null;
        if (q6() == 0 || (wvnVar = this.s0) == null) {
            return;
        }
        wvnVar.remove();
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    /* renamed from: J7, reason: merged with bridge method [inline-methods] */
    public final void c7(VideoSnippetAttachment videoSnippetAttachment) {
        io.reactivex.rxjava3.subjects.f<Integer> fVar;
        super.c7(videoSnippetAttachment);
        zmk zmkVar = this.t0;
        this.z0 = (zmkVar == null || (fVar = zmkVar.d) == null) ? null : fVar.a0(asu0.a.d()).subscribe(new jgs0(new mdm0(this, 19), 1), new r7a0(new qr0(com.vk.metrics.eventtracking.b.a, 14), 21));
        f4m.m(8388693, this.Z);
        this.w0.setText(videoSnippetAttachment.u);
        this.x0.setText(videoSnippetAttachment.s);
        this.y0 = false;
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.W;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0029  */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fh5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U1(fh5.a aVar) {
        boolean z;
        if (aVar.f()) {
            yg5 yg5Var = this.h0;
            if ((yg5Var != null ? yg5Var.getDuration() : 0L) > 0) {
                z = true;
                View view = this.u0;
                bwt0.p0(view, z);
                VideoSnippetAttachment videoSnippetAttachment = (VideoSnippetAttachment) this.E;
                j6r0.d(this.v0, ((videoSnippetAttachment == null ? videoSnippetAttachment.w : null) == null && aVar.b()) ? 0 : 8, false, 150, null);
                bwt0.p0(view, false);
            }
        }
        z = false;
        View view2 = this.u0;
        bwt0.p0(view2, z);
        VideoSnippetAttachment videoSnippetAttachment2 = (VideoSnippetAttachment) this.E;
        j6r0.d(this.v0, ((videoSnippetAttachment2 == null ? videoSnippetAttachment2.w : null) == null && aVar.b()) ? 0 : 8, false, 150, null);
        bwt0.p0(view2, false);
    }

    @Override // xsna.a1n
    public final void U5() {
        this.y0 = true;
    }

    @Override // xsna.fi
    public final ktc0 d7() {
        return this.t0;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fh5.b
    public final void i5(fh5.a aVar, fh5.a aVar2) {
        if (aVar.b() == aVar2.b() && aVar.f() == aVar2.f()) {
            return;
        }
        U1(aVar2);
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.y0;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        ClickArea clickArea = null;
        clickArea = null;
        if (!epx.f(view, this.v0)) {
            NewsEntry t6 = t6();
            ShitAttachment shitAttachment = t6 instanceof ShitAttachment ? (ShitAttachment) t6 : null;
            if (shitAttachment != null && (num = shitAttachment.h0) != null) {
                clickArea = new ClickArea(num.intValue());
            }
            if (clickArea != null) {
                AdClickContext adClickContext = AdClickContext.VIDEO;
                if (clickArea.a(adClickContext)) {
                    u1c0 J0 = J0();
                    hd60.a().r0(this.itemView.getContext(), shitAttachment, J0 != null ? J0.k : -1, adClickContext);
                    return;
                }
            }
            super.onClick(view);
            return;
        }
        if (jjc.b()) {
            return;
        }
        VideoSnippetAttachment videoSnippetAttachment = (VideoSnippetAttachment) this.E;
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            AwayLink awayLink = videoSnippetAttachment.p;
            postInteract.f = awayLink != null ? awayLink.b : null;
            postInteract.j = "video";
            postInteract.Cb(PostInteract.Type.snippet_button_action);
        }
        if (videoSnippetAttachment.w != null) {
            u1c0 J02 = J0();
            int i = J02 != null ? J02.k : -1;
            gd60 a = hd60.a();
            Context context = this.itemView.getContext();
            ButtonAction buttonAction = videoSnippetAttachment.w;
            PostInteract postInteract2 = this.w;
            Integer.valueOf(i);
            a.C(context, buttonAction, postInteract2, (r14 & 16) != 0 ? null : videoSnippetAttachment.h, (r14 & 32) != 0 ? null : null);
            return;
        }
        if (TextUtils.isEmpty(videoSnippetAttachment.v)) {
            return;
        }
        gd60 a2 = hd60.a();
        Context context2 = this.itemView.getContext();
        String str = videoSnippetAttachment.v;
        String str2 = videoSnippetAttachment.t;
        AwayLink awayLink2 = videoSnippetAttachment.p;
        gd60.Q0(a2, context2, str, str2, awayLink2 != null ? awayLink2.c : null, null, 16);
    }

    /* compiled from: VideoSnippetAutoPlayHolder.kt */
    public static final class SnippetAdsProvider extends BaseAdsDataProvider implements DeprecatedStatisticInterface {
        public static final Serializer.c<SnippetAdsProvider> CREATOR = new a();
        public final String b;
        public final String c;
        public final Owner d;
        public final String e;
        public final VideoSnippetAttachment f;
        public final DeprecatedStatisticInterface.a g;
        public final PostInteract h;
        public final int i;
        public final Integer j;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SnippetAdsProvider> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SnippetAdsProvider a(Serializer serializer) {
                return new SnippetAdsProvider(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SnippetAdsProvider[i];
            }
        }

        public SnippetAdsProvider(PromoPost promoPost, VideoSnippetAttachment videoSnippetAttachment, PostInteract postInteract, int i, Integer num) {
            this(promoPost.n, videoSnippetAttachment, postInteract, i);
            StringBuilder sb = new StringBuilder(promoPost.k);
            String str = promoPost.p;
            if (str.length() > 0) {
                sb.append(' ');
                sb.append(str);
            }
            this.e = sb.toString();
            this.g = promoPost.v;
            this.j = num;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final void Da(FragmentActivity fragmentActivity) {
            VideoSnippetAttachment videoSnippetAttachment;
            Owner owner = this.d;
            if (owner == null || (videoSnippetAttachment = this.f) == null) {
                return;
            }
            ShitAttachment shitAttachment = videoSnippetAttachment.h;
            Integer num = shitAttachment.h0;
            ClickArea clickArea = num != null ? new ClickArea(num.intValue()) : null;
            if (epx.f(shitAttachment.k, "site") && clickArea != null && clickArea.a(AdClickContext.TITLE)) {
                a8(fragmentActivity);
                return;
            }
            gd60.Z0(hd60.a(), fragmentActivity, owner.b, videoSnippetAttachment.l, null, 8);
            boolean d = fkq0.d(owner.b);
            PostInteract postInteract = this.h;
            if (d) {
                if (postInteract != null) {
                    postInteract.j = "video_layer";
                    postInteract.zb(PostInteract.Type.open_user);
                }
            } else if (postInteract != null) {
                postInteract.j = "video_layer";
                postInteract.zb(PostInteract.Type.open_group);
            }
            if (this.g != null) {
                com.vkontakte.android.data.b.o(this, "click_post_owner");
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.i0(this.d);
            serializer.j0(this.e);
            serializer.i0(this.f);
            DeprecatedStatisticInterface.a aVar = this.g;
            if (aVar != null) {
                aVar.e(serializer);
            } else {
                serializer.S(0);
            }
            serializer.i0(this.h);
            serializer.S(this.i);
            serializer.V(this.j);
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final List<DeprecatedStatisticUrl> R6(String str) {
            DeprecatedStatisticInterface.a aVar = this.g;
            return aVar != null ? aVar.b(str) : Collections.EMPTY_LIST;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final String S1() {
            return this.c;
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final int Wa() {
            return 0;
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final int Y7(String str) {
            DeprecatedStatisticInterface.a aVar = this.g;
            if (aVar != null) {
                return aVar.c(str);
            }
            return 0;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final void a8(Context context) {
            VideoSnippetAttachment videoSnippetAttachment = this.f;
            if (videoSnippetAttachment == null) {
                return;
            }
            AwayLink awayLink = videoSnippetAttachment.p;
            PostInteract postInteract = this.h;
            if (postInteract != null) {
                postInteract.f = awayLink != null ? awayLink.b : null;
                postInteract.j = "video_layer";
                postInteract.Cb(PostInteract.Type.snippet_button_action);
            }
            if (videoSnippetAttachment.w == null) {
                if (TextUtils.isEmpty(videoSnippetAttachment.v)) {
                    return;
                }
                gd60.Q0(hd60.a(), context, videoSnippetAttachment.v, videoSnippetAttachment.t, awayLink != null ? awayLink.c : null, null, 16);
            } else {
                gd60 a2 = hd60.a();
                ButtonAction buttonAction = videoSnippetAttachment.w;
                Integer.valueOf(this.i);
                a2.C(context, buttonAction, this.h, (r14 & 16) != 0 ? null : videoSnippetAttachment.h, (r14 & 32) != 0 ? null : null);
            }
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final String getDescription() {
            return this.e;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final int getDuration() {
            VideoFile videoFile;
            VideoSnippetAttachment videoSnippetAttachment = this.f;
            if (videoSnippetAttachment == null || (videoFile = videoSnippetAttachment.k) == null) {
                return 0;
            }
            return videoFile.getDuration();
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final String getMessage() {
            return this.b;
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final void h(DeprecatedStatisticUrl deprecatedStatisticUrl) {
            DeprecatedStatisticInterface.a aVar = this.g;
            if (aVar != null) {
                aVar.a(deprecatedStatisticUrl);
            }
        }

        @Override // com.vk.libvideo.ad.BaseAdsDataProvider, com.vk.libvideo.api.ad.AdsDataProvider
        public final Integer h4() {
            return this.j;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final Owner s() {
            return this.d;
        }

        @Override // com.vk.libvideo.ad.BaseAdsDataProvider, com.vk.libvideo.api.ad.AdsDataProvider
        public final void s8(Context context) {
            VideoSnippetAttachment videoSnippetAttachment = this.f;
            if (videoSnippetAttachment == null) {
                return;
            }
            AwayLink awayLink = videoSnippetAttachment.p;
            PostInteract postInteract = this.h;
            if (postInteract != null) {
                postInteract.f = awayLink != null ? awayLink.b : null;
                postInteract.j = "video_layer";
                postInteract.Cb(PostInteract.Type.snippet_action);
            }
            gd60.Q0(hd60.a(), context, awayLink != null ? awayLink.b : null, videoSnippetAttachment.t, awayLink != null ? awayLink.c : null, null, 16);
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final void x4(String str) {
            DeprecatedStatisticInterface.a aVar = this.g;
            if (aVar != null) {
                aVar.a.remove(str);
            }
        }

        public SnippetAdsProvider(Post post, VideoSnippetAttachment videoSnippetAttachment, PostInteract postInteract, int i) {
            this.i = -1;
            this.b = videoSnippetAttachment.q;
            this.c = videoSnippetAttachment.u;
            this.d = post.o;
            this.f = videoSnippetAttachment;
            if ("post_ads".equals(post.t)) {
                Context context = e43.a;
                this.e = (context == null ? null : context).getString(R.string.sponsored_post);
            }
            this.h = postInteract;
            this.i = i;
        }

        public SnippetAdsProvider(ShitAttachment shitAttachment, VideoSnippetAttachment videoSnippetAttachment, PostInteract postInteract, int i) {
            this.i = -1;
            this.b = videoSnippetAttachment.q;
            this.c = videoSnippetAttachment.u;
            StringBuilder sb = new StringBuilder(shitAttachment.D);
            String str = shitAttachment.J;
            if (str.length() > 0) {
                sb.append(' ');
                sb.append(str);
            }
            this.d = new Owner(UserId.d, sb.toString(), null, null, null, shitAttachment.G, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194240, null);
            this.f = videoSnippetAttachment;
            this.h = postInteract;
            this.i = i;
        }

        public SnippetAdsProvider(Serializer serializer) {
            this.i = -1;
            this.b = serializer.H();
            this.c = serializer.H();
            this.d = (Owner) serializer.G(Owner.class.getClassLoader());
            this.e = serializer.H();
            this.f = (VideoSnippetAttachment) serializer.G(VideoSnippetAttachment.class.getClassLoader());
            DeprecatedStatisticInterface.a aVar = new DeprecatedStatisticInterface.a();
            aVar.d(serializer);
            this.g = aVar;
            this.h = (PostInteract) serializer.G(PostInteract.class.getClassLoader());
            this.i = serializer.u();
            this.j = serializer.v();
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public final void H7() {
    }
}
