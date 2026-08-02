package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.ui.SimilarVideoBigView;
import com.vk.libvideo.ui.VideoHideView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c4;
import xsna.cqs0;
import xsna.e1;
import xsna.hfz;
import xsna.iah0;
import xsna.k9;
import xsna.noj0;
import xsna.p1u0;
import xsna.s3q0;
import xsna.vfz;

/* compiled from: AboutVideoSimilarBigVideoDelegate.kt */
/* loaded from: classes2.dex */
public final class w extends p1u0<AboutVideoItem.v> {
    public final c4 a;
    public final VideoScreenMode b;

    /* compiled from: AboutVideoSimilarBigVideoDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.v> {
        public final c4 l;
        public final VideoScreenMode m;
        public final cqs0 n;
        public final ViewGroup o;
        public final SimilarVideoBigView p;
        public final TextView q;
        public final VideoInfoTextView r;
        public final VKImageView s;
        public final ImageView t;
        public VideoHideView u;
        public noj0 v;

        /* compiled from: AboutVideoSimilarBigVideoDelegate.kt */
        /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.w$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1221a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoScreenMode.values().length];
                try {
                    iArr[VideoScreenMode.DISCOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(ViewGroup viewGroup, c4 c4Var, VideoScreenMode videoScreenMode) {
            super(bwt0.I(R.layout.video_about_similar_big_video, viewGroup, false));
            this.l = c4Var;
            this.m = videoScreenMode;
            this.n = new cqs0(null, 2);
            ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.content);
            this.o = viewGroup2;
            this.p = (SimilarVideoBigView) this.itemView.findViewById(R.id.similar_video);
            this.q = (TextView) this.itemView.findViewById(R.id.title);
            this.r = (VideoInfoTextView) this.itemView.findViewById(R.id.subtitle);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.menu);
            VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.avatar);
            this.s = vKImageView;
            ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.like);
            this.t = imageView2;
            bwt0.i0(viewGroup2, new com.vk.movika.sdk.base.data.a(this, 2));
            bwt0.i0(imageView, new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 2));
            bwt0.i0(imageView2, new e1(this, 2));
            bwt0.i0(vKImageView, new k9(this, 0));
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.v vVar) {
            AboutVideoItem.v vVar2 = vVar;
            boolean z = vVar2.c;
            noj0 noj0Var = vVar2.b;
            this.v = noj0Var;
            int i = SimilarVideoBigView.f;
            SimilarVideoBigView similarVideoBigView = this.p;
            similarVideoBigView.e.a(noj0Var, null, ((Boolean) similarVideoBigView.b.getValue()).booleanValue());
            VideoFile videoFile = noj0Var.a;
            ViewGroup viewGroup = this.o;
            Context context = viewGroup.getContext();
            if (context != null) {
                this.r.setText(this.n.c(videoFile, context, null));
            }
            this.q.setText(videoFile.getTitle());
            VKImageView vKImageView = this.s;
            vKImageView.setPlaceholderImage(R.drawable.user_placeholder);
            vKImageView.load(videoFile.M0());
            this.t.setSelected(videoFile.O9());
            bwt0.p0(viewGroup, !z);
            if (z && this.u == null) {
                VideoHideView videoHideView = new VideoHideView(this.itemView.getContext(), null, 0, 14, 0);
                ViewGroup viewGroup2 = (ViewGroup) this.itemView;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                float f = 6;
                marginLayoutParams.bottomMargin = iah0.a(f);
                marginLayoutParams.topMargin = iah0.a(f);
                float f2 = 16;
                marginLayoutParams.rightMargin = iah0.a(f2);
                marginLayoutParams.leftMargin = iah0.a(f2);
                s3q0 s3q0Var = s3q0.a;
                viewGroup2.addView(videoHideView, marginLayoutParams);
                this.u = videoHideView;
            }
            VideoHideView videoHideView2 = this.u;
            if (videoHideView2 != null) {
                bwt0.p0(videoHideView2, z);
                videoHideView2.setVideoFile(videoFile);
            }
        }
    }

    public w(c4 c4Var, VideoScreenMode videoScreenMode) {
        this.a = c4Var;
        this.b = videoScreenMode;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.v> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.v;
    }
}
