package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.ui.SimilarVideoBigView;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.c4;
import xsna.cqs0;
import xsna.djt0;
import xsna.e3m;
import xsna.egs0;
import xsna.ejt0;
import xsna.fnj;
import xsna.fqs0;
import xsna.fxc0;
import xsna.gzs;
import xsna.hfz;
import xsna.hg1;
import xsna.iah0;
import xsna.k7l0;
import xsna.l9;
import xsna.lzn;
import xsna.m9;
import xsna.n9;
import xsna.noj0;
import xsna.o9;
import xsna.p1u0;
import xsna.p9;
import xsna.q9;
import xsna.qan;
import xsna.qf6;
import xsna.rcg0;
import xsna.t0w0;
import xsna.vfz;
import xsna.w5;
import xsna.zps0;

/* compiled from: AboutVideoSimilarBigVideoRedesignDelegate.kt */
/* loaded from: classes2.dex */
public final class x extends p1u0<AboutVideoItem.SimilarVideoRedesign> {
    public final c4 a;
    public final boolean b;
    public final VideoScreenMode c;
    public final gzs<rcg0> d;
    public final lzn e;
    public final boolean f;
    public final egs0 g;
    public final cqs0 h = new cqs0(null, 3);

    /* compiled from: AboutVideoSimilarBigVideoRedesignDelegate.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CompactConfig(isCompact=");
            sb.append(this.a);
            sb.append(", supportRemoveFromHistory=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: AboutVideoSimilarBigVideoRedesignDelegate.kt */
    public static final class b extends qf6 implements qan {
        public static final /* synthetic */ int A = 0;
        public final c4 l;
        public final boolean m;
        public final cqs0 n;
        public final VideoScreenMode o;
        public final lzn p;
        public final gzs<rcg0> q;
        public final boolean r;
        public final ViewGroup s;
        public final SimilarVideoBigView t;
        public final TextView u;
        public final TextView v;
        public final ImageView w;
        public final VKImageView x;
        public final djt0 y;
        public AboutVideoItem.SimilarVideoRedesign z;

        /* compiled from: AboutVideoSimilarBigVideoRedesignDelegate.kt */
        public static final class a {
        }

        /* compiled from: AboutVideoSimilarBigVideoRedesignDelegate.kt */
        /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.x$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C1222b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[AboutVideoItem.SimilarVideoRedesign.Style.values().length];
                try {
                    iArr[AboutVideoItem.SimilarVideoRedesign.Style.NORMAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AboutVideoItem.SimilarVideoRedesign.Style.COMPACT_NO_OWNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AboutVideoItem.SimilarVideoRedesign.Style.COMPACT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[VideoScreenMode.values().length];
                try {
                    iArr2[VideoScreenMode.DISCOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[VideoScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(ViewGroup viewGroup, a aVar, c4 c4Var, boolean z, cqs0 cqs0Var, VideoScreenMode videoScreenMode, lzn lznVar, gzs<rcg0> gzsVar, egs0 egs0Var) {
            super(r1);
            View view;
            boolean z2 = aVar.a;
            boolean z3 = aVar.b;
            int i = R.layout.video_about_similar_big_video_redesign;
            if (z3) {
                Context context = viewGroup.getContext();
                List singletonList = Collections.singletonList(new ejt0(R.drawable.vk_icon_hide_outline_28, iah0.a(28), iah0.a(65), R.attr.vk_ui_accent_gray, R.string.video_swipe_from_view_history, new l9(0)));
                djt0 djt0Var = new djt0(context);
                djt0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                k7l0 k7l0Var = new k7l0(singletonList, 22);
                Context context2 = viewGroup.getContext();
                if (z2) {
                    i = R.layout.video_about_similar_compact_video_redesign;
                } else {
                    HashSet hashSet = iah0.a;
                    if (fnj.d(context2)) {
                        i = R.layout.video_about_similar_big_video_redesign_tablet;
                    }
                }
                View I = bwt0.I(i, djt0Var, false);
                if (I.getBackground() == null) {
                    I.setBackground(e3m.e(android.R.attr.windowBackground, context));
                }
                djt0Var.setFrontView(I);
                djt0Var.setBackView(k7l0Var);
                djt0Var.setId(R.id.video_swipe_layout_root);
                djt0Var.setCanSwipe(false);
                view = djt0Var;
            } else {
                Context context3 = viewGroup.getContext();
                if (z2) {
                    i = R.layout.video_about_similar_compact_video_redesign;
                } else {
                    HashSet hashSet2 = iah0.a;
                    if (fnj.d(context3)) {
                        i = R.layout.video_about_similar_big_video_redesign_tablet;
                    }
                }
                if (egs0Var != null) {
                    viewGroup.getContext();
                }
                view = bwt0.I(i, viewGroup, false);
            }
            this.l = c4Var;
            this.m = z;
            this.n = cqs0Var;
            this.o = videoScreenMode;
            this.p = lznVar;
            this.q = gzsVar;
            this.r = z2;
            this.s = (ViewGroup) this.itemView.findViewById(R.id.content);
            this.t = (SimilarVideoBigView) this.itemView.findViewById(R.id.similar_video);
            this.u = (TextView) this.itemView.findViewById(R.id.title);
            this.v = (TextView) this.itemView.findViewById(R.id.subtitle);
            this.w = (ImageView) this.itemView.findViewById(R.id.menu);
            this.x = (VKImageView) this.itemView.findViewById(R.id.avatar);
            djt0 djt0Var2 = (djt0) this.itemView.findViewById(R.id.video_swipe_layout_root);
            this.y = djt0Var2;
            if (djt0Var2 != null) {
                djt0Var2.setOnInflateListener(new w5(this, 1));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
        
            if ((r9 != null ? r9.b : null) != null) goto L47;
         */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void W5(hfz hfzVar) {
            fqs0 fqs0Var;
            zps0 c;
            AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = (AboutVideoItem.SimilarVideoRedesign) hfzVar;
            this.z = similarVideoRedesign;
            noj0 noj0Var = similarVideoRedesign.b;
            AboutVideoItem.SimilarVideoRedesign.Style style = similarVideoRedesign.h;
            AboutVideoItem.SimilarVideoRedesign.Source source = similarVideoRedesign.f;
            VideoFile videoFile = noj0Var.a;
            DonutVideoUiModel donutVideoUiModel = noj0Var.d;
            djt0 djt0Var = this.y;
            if (djt0Var != null) {
                djt0Var.setCanSwipe(similarVideoRedesign.g);
            }
            SimilarVideoBigView similarVideoBigView = this.t;
            similarVideoBigView.e.a(noj0Var, source, ((Boolean) similarVideoBigView.b.getValue()).booleanValue());
            if (style != AboutVideoItem.SimilarVideoRedesign.Style.NORMAL) {
                similarVideoBigView.setOutlineProvider(new t0w0(6, iah0.b(8.0f), false, false));
                similarVideoBigView.setClipToOutline(true);
            }
            CharSequence a2 = this.p.a(donutVideoUiModel, this.itemView.getContext());
            int i = 2;
            int i2 = 4;
            boolean z = this.r;
            if (a2 == null) {
                fqs0Var = null;
            } else {
                fqs0Var = new fqs0(Integer.valueOf(z ? 3 : 2), a2, null, 4);
            }
            int i3 = C1222b.$EnumSwitchMapping$0[style.ordinal()];
            cqs0 cqs0Var = this.n;
            if (i3 == 1) {
                c = cqs0Var.c(videoFile, this.itemView.getContext(), fqs0Var);
            } else if (i3 == 2) {
                c = cqs0Var.b(videoFile, this.itemView.getContext(), false, fqs0Var);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c = cqs0Var.b(videoFile, this.itemView.getContext(), true, fqs0Var);
            }
            TextView textView = this.v;
            boolean z2 = textView instanceof VideoInfoTextView;
            VideoInfoTextView videoInfoTextView = z2 ? (VideoInfoTextView) textView : null;
            if (videoInfoTextView != null) {
                videoInfoTextView.setText(c);
            }
            VideoInfoTextView videoInfoTextView2 = z2 ? (VideoInfoTextView) textView : null;
            if (videoInfoTextView2 != null) {
                if (z) {
                }
                if (!z) {
                    if ((fqs0Var != null ? fqs0Var.b : null) == null) {
                        i2 = 2;
                        videoInfoTextView2.setMaxLines(i2);
                    }
                }
                i2 = 3;
                videoInfoTextView2.setMaxLines(i2);
            }
            this.u.setText(videoFile.getTitle());
            Context context = this.itemView.getContext();
            HashSet hashSet = iah0.a;
            boolean z3 = fnj.d(context) && source == AboutVideoItem.SimilarVideoRedesign.Source.GROUP_PLAYLIST;
            VKImageView vKImageView = this.x;
            if (!z3 && vKImageView != null) {
                vKImageView.setPlaceholderImage(R.drawable.user_placeholder);
                String M0 = videoFile.M0();
                if (source == AboutVideoItem.SimilarVideoRedesign.Source.OFFLINE_VIDEOS && fxc0.B().J().M1() && M0 != null) {
                    int i4 = 0;
                    hg1.b(vKImageView, fxc0.B().s().i(videoFile.r1(), M0).subscribe(new q9(new p9(i4, this, M0), i4)));
                } else {
                    vKImageView.load(M0);
                }
                float ceil = (int) Math.ceil((Resources.getSystem().getDisplayMetrics().density * 0.5f) + 0.5f);
                Context context2 = this.itemView.getContext();
                e3m.a aVar = e3m.a;
                vKImageView.y0(ceil, context2.getColor(R.color.vk_gray_900));
            }
            if (vKImageView != null) {
                vKImageView.setVisibility(!z3 ? 0 : 8);
            }
            int i5 = similarVideoRedesign.c ? 8 : 0;
            ViewGroup viewGroup = this.s;
            viewGroup.setVisibility(i5);
            int i6 = 0;
            bwt0.i0(viewGroup, new m9(i6, videoFile, this));
            bwt0.i0(this.w, new n9(i6, this, videoFile));
            if (vKImageView != null) {
                gzs<rcg0> gzsVar = this.q;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                bwt0.i0(vKImageView, new o9(0, this, videoFile));
            }
            similarVideoBigView.setOnDonutBadgeClickListener(new com.vk.movika.sdk.base.flow.binding.j(i, donutVideoUiModel, this));
        }

        @Override // xsna.qan
        public final VideoFile f5() {
            noj0 noj0Var;
            AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = this.z;
            if (similarVideoRedesign == null || (noj0Var = similarVideoRedesign.b) == null) {
                return null;
            }
            return noj0Var.a;
        }
    }

    public x(c4 c4Var, boolean z, VideoScreenMode videoScreenMode, gzs gzsVar, lzn lznVar, boolean z2, egs0 egs0Var) {
        this.a = c4Var;
        this.b = z;
        this.c = videoScreenMode;
        this.d = gzsVar;
        this.e = lznVar;
        this.f = z2;
        this.g = egs0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.SimilarVideoRedesign> b(ViewGroup viewGroup) {
        return new b(viewGroup, new a(false, false), this.a, this.b, this.h, this.c, this.e, this.d, this.g);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return !this.f && (hfzVar instanceof AboutVideoItem.SimilarVideoRedesign) && ((AboutVideoItem.SimilarVideoRedesign) hfzVar).h == AboutVideoItem.SimilarVideoRedesign.Style.NORMAL;
    }
}
