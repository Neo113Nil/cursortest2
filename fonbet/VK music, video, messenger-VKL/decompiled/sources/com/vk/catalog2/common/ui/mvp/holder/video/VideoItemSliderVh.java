package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.b;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.music.Artist;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.UpcomingIndicatorView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.a390;
import xsna.a5o;
import xsna.awt0;
import xsna.axf0;
import xsna.azn;
import xsna.baf0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c98;
import xsna.cn70;
import xsna.cpu;
import xsna.dei0;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.e5o;
import xsna.e6s0;
import xsna.epx;
import xsna.ew3;
import xsna.f4m;
import xsna.f5o;
import xsna.fd90;
import xsna.fkq0;
import xsna.fl4;
import xsna.fo50;
import xsna.fxc0;
import xsna.g620;
import xsna.g7s0;
import xsna.gpt0;
import xsna.hdt0;
import xsna.i1t0;
import xsna.iah0;
import xsna.ift0;
import xsna.iml0;
import xsna.j5g;
import xsna.k5o;
import xsna.kcj0;
import xsna.l5o;
import xsna.l6n0;
import xsna.lyd;
import xsna.m33;
import xsna.m6t0;
import xsna.m8s0;
import xsna.msy;
import xsna.myc0;
import xsna.nkt0;
import xsna.o0r0;
import xsna.ofc0;
import xsna.pkd;
import xsna.qkd0;
import xsna.rns0;
import xsna.rrn0;
import xsna.s0w0;
import xsna.s490;
import xsna.t970;
import xsna.tj2;
import xsna.tzx0;
import xsna.u4a;
import xsna.ucp;
import xsna.uxb0;
import xsna.vc4;
import xsna.x4o;
import xsna.xg5;
import xsna.xwk;
import xsna.y1o;
import xsna.yg5;
import xsna.zsl0;
import xsna.zyn;

/* compiled from: VideoItemSliderVh.kt */
/* loaded from: classes16.dex */
public class VideoItemSliderVh extends VideoItemVh {
    public VKImageView A;
    public TextView B;
    public View C;
    public View D;
    public LinearProgressIndicator E;
    public VKImageView F;
    public VkImageSimple G;
    public TextView H;
    public TextView I;
    public DurationView J;
    public UpcomingIndicatorView K;
    public InteractiveDurationView L;
    public VKImageView M;
    public VideoOverlayView N;
    public View O;
    public DonutBadge P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final m8s0 Y;
    public final boolean Z;
    public final boolean a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final Object f0;
    public final uxb0 g0;
    public final int m;
    public final int n;
    public final u4a o;
    public final Integer p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final Integer w;
    public final hdt0 x;
    public final boolean y;
    public final ift0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoItemSliderVh(int i, int i2, u4a u4aVar, g7s0 g7s0Var, fl4 fl4Var, o0r0 o0r0Var, cpu cpuVar, pkd pkdVar, boolean z, boolean z2, boolean z3, boolean z4, Integer num, hdt0 hdt0Var, int i3) {
        super(r15.f, r15.m, r23, r3, r4, r5, r6, r15);
        g7s0 B = (i3 & 16) != 0 ? fxc0.B() : g7s0Var;
        fl4 g = (i3 & 32) != 0 ? lyd.g() : fl4Var;
        o0r0 e = (i3 & 64) != 0 ? xwk.e() : o0r0Var;
        cpu a = (i3 & 128) != 0 ? xg5.a() : cpuVar;
        pkd f = (i3 & 256) != 0 ? g620.f() : pkdVar;
        boolean z5 = (i3 & 512) != 0 ? true : z;
        boolean z6 = (i3 & 1024) != 0 ? false : z2;
        boolean z7 = (i3 & 2048) == 0;
        boolean z8 = (i3 & 4096) != 0 ? false : z3;
        boolean z9 = (i3 & 8192) == 0;
        boolean z10 = (i3 & 16384) != 0 ? false : z4;
        Integer num2 = (i3 & 32768) != 0 ? null : num;
        u4a.a aVar = u4aVar.b;
        g7s0 g7s0Var2 = B;
        this.m = i;
        this.n = i2;
        this.o = u4aVar;
        this.p = null;
        this.q = z5;
        this.r = z6;
        this.s = z7;
        this.t = z8;
        this.u = z9;
        this.v = z10;
        this.w = num2;
        this.x = hdt0Var;
        this.y = g7s0Var2.J().N1();
        this.z = new ift0();
        this.Q = z10 ? iah0.a(2) : 0;
        this.R = z10 ? iah0.a(-0.5f) : iah0.a(-1);
        this.S = g7s0Var2.J().j0();
        this.T = g7s0Var2.J().B0();
        fd90 fd90Var = new fd90(18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, fd90Var);
        this.V = msy.a(lazyThreadSafetyMode, new t970(17));
        this.W = msy.a(lazyThreadSafetyMode, new tj2(28));
        this.X = msy.a(lazyThreadSafetyMode, new dei0(g7s0Var2, 26));
        this.Y = new m8s0();
        this.Z = g7s0Var2.J().F1();
        this.a0 = g7s0Var2.J().Y1();
        this.b0 = msy.a(lazyThreadSafetyMode, new iml0(this, 15));
        this.c0 = msy.a(lazyThreadSafetyMode, new ofc0(this, 25));
        this.d0 = msy.a(lazyThreadSafetyMode, new rrn0(this, 17));
        this.e0 = msy.a(lazyThreadSafetyMode, new kcj0(this, 19));
        this.f0 = msy.a(lazyThreadSafetyMode, new l6n0(this, 13));
        this.g0 = new uxb0(this, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:296:0x02f1, code lost:
    
        if (xsna.gpt0.C(r4) == false) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0306  */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        boolean z;
        CharSequence charSequence;
        boolean z2;
        SpannableStringBuilder e;
        UpcomingIndicatorView upcomingIndicatorView;
        View view;
        View view2;
        CharSequence charSequence2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        VKImageView vKImageView;
        TextView textView4;
        String title;
        CharSequence charSequence3;
        String P;
        azn a;
        TextView textView5;
        boolean z3;
        View view3;
        DonutVideoUiModel.PreviewBadge previewBadge;
        CharSequence charSequence4;
        VideoFile A;
        super.N6(uIBlock);
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo == null) {
            return;
        }
        VideoFile videoFile = uIBlockVideo.B;
        TextView textView6 = this.H;
        if (textView6 == null) {
            textView6 = null;
        }
        Resources resources = textView6.getResources();
        TextView textView7 = this.H;
        if (textView7 == null) {
            textView7 = null;
        }
        Context context = textView7.getContext();
        DonutVideoUiModel a2 = ((l5o) this.c0.getValue()).a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
        bpn0 bpn0Var = VideoOverlayView.I;
        VKImageView vKImageView2 = this.M;
        VKImageView vKImageView3 = vKImageView2 != null ? vKImageView2 : null;
        VideoOverlayView videoOverlayView = this.N;
        VideoOverlayView videoOverlayView2 = videoOverlayView == null ? null : videoOverlayView;
        DurationView durationView = this.J;
        DurationView durationView2 = durationView != null ? durationView : null;
        boolean c = fxc0.B().c(videoFile);
        VideoRestriction O = videoFile.O();
        com.vk.libvideo.design.view.overlay.b a3 = O != null ? ((a390) this.W.getValue()).a(O) : null;
        boolean d8 = videoFile.d8();
        boolean z4 = this.y;
        int i = 1;
        boolean z5 = (d8 || videoFile.z0()) && !(z4 && videoFile.x0());
        VideoPipStateHolder.a.getClass();
        yg5 c2 = VideoPipStateHolder.c();
        VideoOverlayView.b.a(new VideoOverlayView.a(vKImageView3, videoOverlayView2, new axf0(this, videoFile, resources, 2), null, durationView2, false, false, c, new rns0(videoFile, i), new ew3(25, this, videoFile), a3, z5, epx.f((c2 == null || (A = c2.A()) == null) ? null : A.a1(), videoFile.a1()), new qkd0(this, 24), (i1t0) this.X.getValue(), new zsl0(6, this, videoFile), 232));
        boolean z6 = this.a0;
        if (z4 && videoFile.x0()) {
            DurationView durationView3 = this.J;
            if (durationView3 == null) {
                durationView3 = null;
            }
            durationView3.setVisibility(8);
            InteractiveDurationView interactiveDurationView = this.L;
            if (interactiveDurationView != null) {
                interactiveDurationView.setVisibility(8);
            }
            boolean k = k(videoFile);
            VkImageSimple vkImageSimple = this.G;
            if (vkImageSimple != null) {
                vkImageSimple.setVisibility(!k ? 0 : 8);
            }
        } else {
            int i2 = (videoFile.x0() || (!z6 && videoFile.q0())) ? R.drawable.bg_video_live : R.drawable.bg_video_duration_label_old;
            DurationView durationView4 = this.J;
            if (durationView4 == null) {
                durationView4 = null;
            }
            durationView4.setBackgroundResource(i2);
            boolean k2 = k(videoFile);
            DurationView durationView5 = this.J;
            if (durationView5 == null) {
                durationView5 = null;
            }
            durationView5.setVisibility((videoFile.W9() || k2) ? 4 : 0);
            DurationView durationView6 = this.J;
            if (durationView6 == null) {
                durationView6 = null;
            }
            durationView5.setText(gpt0.m(durationView6.getContext(), videoFile, true, z6));
            InteractiveDurationView interactiveDurationView2 = this.L;
            if (interactiveDurationView2 != null) {
                interactiveDurationView2.setVisibility((!videoFile.W9() || k2) ? 4 : 0);
                interactiveDurationView2.setTextDescriptionVisible(true);
                DurationView durationView7 = this.J;
                if (durationView7 == null) {
                    durationView7 = null;
                }
                interactiveDurationView2.setDurationText(gpt0.m(durationView7.getContext(), videoFile, true, false));
            }
            VkImageSimple vkImageSimple2 = this.G;
            if (vkImageSimple2 != null) {
                vkImageSimple2.setVisibility(8);
            }
        }
        if (z6) {
            VKImageView vKImageView4 = this.F;
            Integer a4 = m6t0.a(videoFile.getPrivacy());
            VideoRestriction O2 = videoFile.O();
            if (vKImageView4 != null) {
                vKImageView4.setVisibility((a4 == null || !((O2 == null || O2.d) && z6)) ? 8 : 0);
            }
            if (vKImageView4 != null && vKImageView4.getVisibility() == 0) {
                vKImageView4.setContentDescription(((PrivacySetting.PrivacyRule) j5g.Y(videoFile.getPrivacy())).Ab());
                vKImageView4.setImageResource(a4.intValue());
            }
        }
        boolean z7 = videoFile instanceof MusicVideoFile;
        boolean z8 = this.Z;
        ift0 ift0Var = this.z;
        if (z7) {
            g(context, (MusicVideoFile) videoFile);
        } else {
            UIBlockVideo uIBlockVideo2 = this.j;
            if (uIBlockVideo2 != null) {
                TextView textView8 = this.I;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
                boolean z9 = this.s;
                if (z9 && (textView5 = this.I) != null) {
                    textView5.setMaxLines(2);
                    f4m.t(cn70.b(3), textView5);
                    textView5.setLineSpacing(2.0f * cn70.a(), 1.0f);
                }
                UIBlockVideo uIBlockVideo3 = this.j;
                if (uIBlockVideo3 != null) {
                    CatalogViewStyle catalogViewStyle = uIBlockVideo3.l;
                    if (z8 && (catalogViewStyle instanceof VideoCatalogViewStyle) && ((VideoCatalogViewStyle) catalogViewStyle).Ab()) {
                        z = true;
                        if (a2 != null || (a = k5o.a(a2)) == null) {
                            charSequence = null;
                        } else {
                            zyn zynVar = (zyn) this.e0.getValue();
                            View view4 = this.O;
                            if (view4 == null) {
                                view4 = null;
                            }
                            charSequence = zynVar.a(a, view4.getContext(), this.g0);
                        }
                        boolean z10 = this.v;
                        if (!z9 || z10 || this.r) {
                            z2 = z && z9;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (z2) {
                                spannableStringBuilder = spannableStringBuilder.append((CharSequence) h(videoFile));
                            }
                            SpannableStringBuilder e2 = e(spannableStringBuilder);
                            if ((videoFile.k1() <= 0 && !videoFile.z0() && (!fxc0.B().c(videoFile) || videoFile.L8() != 0)) || !z8) {
                                view2 = this.O;
                                if (view2 == null) {
                                    view2 = null;
                                }
                                e2 = e2.append((CharSequence) new Regex(" ", RegexOption.LITERAL).g(ift0Var.b(view2.getContext(), videoFile), " "));
                            }
                            e = e(e2);
                            if (videoFile.b0() == 0 && videoFile.k1() <= 0) {
                                gpt0 gpt0Var = gpt0.a;
                                charSequence2 = e;
                            }
                            upcomingIndicatorView = this.K;
                            if (upcomingIndicatorView == null) {
                                upcomingIndicatorView = null;
                            }
                            charSequence2 = e;
                            if (upcomingIndicatorView.getVisibility() == 0 || !z8) {
                                gpt0 gpt0Var2 = gpt0.a;
                                view = this.O;
                                if (view == null) {
                                    view = null;
                                }
                                charSequence2 = e.append((CharSequence) gpt0.r(view.getContext(), videoFile));
                            }
                        } else {
                            charSequence2 = (this.A != null || (P = videoFile.P()) == null || drm0.N(P) || z) ? videoFile.L8() > 0 ? ift0Var.b(context, videoFile) : null : h(videoFile);
                        }
                        if (charSequence2 == null) {
                            charSequence2 = null;
                        } else if (charSequence != null) {
                            charSequence2 = (z9 || z10) ? e(new SpannableStringBuilder().append(charSequence2)).append(charSequence) : e(new SpannableStringBuilder().append(charSequence)).append(charSequence2);
                        }
                        textView = this.I;
                        if (textView != null) {
                            textView.setText(charSequence2);
                        }
                        textView2 = this.I;
                        if (textView2 != null) {
                            awt0.v(textView2, charSequence2 != null);
                        }
                        textView3 = this.B;
                        if (textView3 != null) {
                            textView3.setText(h(videoFile));
                        }
                        vKImageView = this.A;
                        if (vKImageView != null) {
                            vKImageView.setPlaceholderImage(R.drawable.user_placeholder);
                            this.o.b.j.b(vKImageView, fkq0.b(videoFile.I0()) ? ContentType.GROUP : ContentType.PROFILE, uIBlockVideo2.e, uIBlockVideo2.d, -1.0f);
                            vKImageView.load(videoFile.M0());
                        }
                        textView4 = this.H;
                        if (textView4 == null) {
                            textView4 = null;
                        }
                        title = videoFile.getTitle();
                        if ((title != null || drm0.N(title)) && videoFile.O() != null) {
                            VideoRestriction O3 = videoFile.O();
                            charSequence3 = O3 != null ? O3.b : null;
                        } else {
                            ucp ucpVar = ucp.a;
                            charSequence3 = ucp.i(videoFile.getTitle());
                        }
                        textView4.setText(charSequence3);
                    }
                }
                z = false;
                if (a2 != null) {
                }
                charSequence = null;
                boolean z102 = this.v;
                if (z9) {
                }
                if (z) {
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (z2) {
                }
                SpannableStringBuilder e22 = e(spannableStringBuilder2);
                if (videoFile.k1() <= 0) {
                    view2 = this.O;
                    if (view2 == null) {
                    }
                    e22 = e22.append((CharSequence) new Regex(" ", RegexOption.LITERAL).g(ift0Var.b(view2.getContext(), videoFile), " "));
                    e = e(e22);
                    if (videoFile.b0() == 0) {
                        gpt0 gpt0Var3 = gpt0.a;
                        charSequence2 = e;
                    }
                    upcomingIndicatorView = this.K;
                    if (upcomingIndicatorView == null) {
                    }
                    charSequence2 = e;
                    if (upcomingIndicatorView.getVisibility() == 0) {
                    }
                    gpt0 gpt0Var22 = gpt0.a;
                    view = this.O;
                    if (view == null) {
                    }
                    charSequence2 = e.append((CharSequence) gpt0.r(view.getContext(), videoFile));
                    if (charSequence2 == null) {
                    }
                    textView = this.I;
                    if (textView != null) {
                    }
                    textView2 = this.I;
                    if (textView2 != null) {
                    }
                    textView3 = this.B;
                    if (textView3 != null) {
                    }
                    vKImageView = this.A;
                    if (vKImageView != null) {
                    }
                    textView4 = this.H;
                    if (textView4 == null) {
                    }
                    title = videoFile.getTitle();
                    if (title != null) {
                    }
                    VideoRestriction O32 = videoFile.O();
                    if (O32 != null) {
                    }
                    textView4.setText(charSequence3);
                }
                view2 = this.O;
                if (view2 == null) {
                }
                e22 = e22.append((CharSequence) new Regex(" ", RegexOption.LITERAL).g(ift0Var.b(view2.getContext(), videoFile), " "));
                e = e(e22);
                if (videoFile.b0() == 0) {
                }
                upcomingIndicatorView = this.K;
                if (upcomingIndicatorView == null) {
                }
                charSequence2 = e;
                if (upcomingIndicatorView.getVisibility() == 0) {
                }
                gpt0 gpt0Var222 = gpt0.a;
                view = this.O;
                if (view == null) {
                }
                charSequence2 = e.append((CharSequence) gpt0.r(view.getContext(), videoFile));
                if (charSequence2 == null) {
                }
                textView = this.I;
                if (textView != null) {
                }
                textView2 = this.I;
                if (textView2 != null) {
                }
                textView3 = this.B;
                if (textView3 != null) {
                }
                vKImageView = this.A;
                if (vKImageView != null) {
                }
                textView4 = this.H;
                if (textView4 == null) {
                }
                title = videoFile.getTitle();
                if (title != null) {
                }
                VideoRestriction O322 = videoFile.O();
                if (O322 != null) {
                }
                textView4.setText(charSequence3);
            }
        }
        TextView textView9 = this.H;
        if (textView9 == null) {
            textView9 = null;
        }
        ift0Var.d(textView9, videoFile);
        if (this.T) {
            int Na = (!this.S || videoFile.k1() <= 0) ? (!videoFile.z0() || videoFile.Na() <= 0) ? 0 : (int) videoFile.Na() : videoFile.k1();
            UpcomingIndicatorView upcomingIndicatorView2 = this.K;
            if (upcomingIndicatorView2 == null) {
                upcomingIndicatorView2 = null;
            }
            upcomingIndicatorView2.setVisibility(Na != 0 ? 0 : 8);
            TextView textView10 = this.I;
            if (textView10 != null) {
                textView10.setVisibility(Na > 0 ? 4 : 0);
            }
            UpcomingIndicatorView upcomingIndicatorView3 = this.K;
            if (upcomingIndicatorView3 == null) {
                upcomingIndicatorView3 = null;
            }
            upcomingIndicatorView3.setUpcoming(Na);
        } else {
            UpcomingIndicatorView upcomingIndicatorView4 = this.K;
            if (upcomingIndicatorView4 == null) {
                upcomingIndicatorView4 = null;
            }
            upcomingIndicatorView4.setVisibility(8);
        }
        LinearProgressIndicator linearProgressIndicator = this.E;
        if (linearProgressIndicator != null) {
            linearProgressIndicator.setVisibility((videoFile.O() == null && (this.t || uIBlockVideo.I || uIBlockVideo.H)) ? 0 : 8);
        }
        UIBlockVideo uIBlockVideo4 = (UIBlockVideo) uIBlock;
        if (z8) {
            CatalogViewStyle catalogViewStyle2 = uIBlockVideo4.l;
            boolean z11 = z8 && (catalogViewStyle2 instanceof VideoCatalogViewStyle) && ((VideoCatalogViewStyle) catalogViewStyle2).Ab();
            TextView textView11 = this.B;
            if (textView11 != null) {
                textView11.setVisibility(z11 ? 8 : 0);
            }
            VKImageView vKImageView5 = this.A;
            if (vKImageView5 != null) {
                vKImageView5.setVisibility(z11 ? 8 : 0);
            }
            View view5 = this.C;
            if (view5 != null) {
                view5.setVisibility(z11 ? 8 : 0);
            }
        }
        if (fxc0.B().c(uIBlockVideo4.B)) {
            int i3 = e6s0.f;
            if (!e6s0.a.a(b(uIBlockVideo4, true))) {
                z3 = true;
                view3 = this.D;
                if (view3 != null) {
                    view3.setVisibility((!this.q || z3) ? 8 : 0);
                }
                previewBadge = a2 == null ? a2.b : null;
                if (previewBadge != null) {
                    DonutBadge donutBadge = this.P;
                    if (donutBadge != null) {
                        f4m.j(donutBadge);
                        return;
                    }
                    return;
                }
                DonutBadge donutBadge2 = this.P;
                if (donutBadge2 != null) {
                    donutBadge2.setVisibility(0);
                }
                DonutBadge donutBadge3 = this.P;
                if (donutBadge3 != null) {
                    DonutPriceTemplate donutPriceTemplate = previewBadge.c;
                    if (donutPriceTemplate != null) {
                        View view6 = this.O;
                        if (view6 == null) {
                            view6 = null;
                        }
                        charSequence4 = y1o.b(donutPriceTemplate, view6.getContext());
                    } else {
                        charSequence4 = previewBadge.b;
                    }
                    donutBadge3.setText(charSequence4);
                }
                DonutBadge donutBadge4 = this.P;
                if (donutBadge4 != null) {
                    donutBadge4.setContentDescription(previewBadge.d);
                }
                DonutBadge donutBadge5 = this.P;
                if (donutBadge5 != null) {
                    donutBadge5.setOnClickListener(new vc4(3, this, previewBadge));
                    return;
                }
                return;
            }
        }
        z3 = false;
        view3 = this.D;
        if (view3 != null) {
        }
        if (a2 == null) {
        }
        if (previewBadge != null) {
        }
    }

    public final SpannableStringBuilder e(SpannableStringBuilder spannableStringBuilder) {
        if (!myc0.f(spannableStringBuilder)) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder append = spannableStringBuilder.append(" ");
        View view = this.O;
        if (view == null) {
            view = null;
        }
        return append.append((CharSequence) view.getContext().getString(R.string.dot_separator)).append(" ");
    }

    public void g(Context context, MusicVideoFile musicVideoFile) {
        Image image;
        ImageSize Cb;
        TextView textView = this.I;
        ift0 ift0Var = this.z;
        if (textView != null) {
            textView.setText(ift0Var.c(context, musicVideoFile));
        }
        TextView textView2 = this.B;
        if (textView2 != null) {
            ift0Var.getClass();
            textView2.setText(b.C0795b.d(musicVideoFile.F1, musicVideoFile.E1));
        }
        VKImageView vKImageView = this.A;
        if (vKImageView != null) {
            fo50.r(vKImageView, "artist");
            int width = vKImageView.getWidth();
            ift0Var.getClass();
            List<Artist> list = musicVideoFile.B1;
            Artist artist = list != null ? (Artist) j5g.a0(list) : null;
            vKImageView.load((artist == null || (image = artist.f) == null || (Cb = image.Cb(width, true, false)) == null) ? null : Cb.d.d);
        }
        TextView textView3 = this.H;
        if (textView3 == null) {
            textView3 = null;
        }
        ucp ucpVar = ucp.a;
        ift0Var.getClass();
        textView3.setText(ucp.i(s490.d(context, musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary)));
        TextView textView4 = this.H;
        ift0Var.d(textView4 != null ? textView4 : null, musicVideoFile);
    }

    public final SpannableStringBuilder h(VideoFile videoFile) {
        Drawable drawable;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) videoFile.P());
        if (videoFile.Y().b) {
            spannableStringBuilder.append((CharSequence) " ");
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VerifyInfo Y = videoFile.Y();
            View view = this.O;
            if (view == null) {
                view = null;
            }
            Drawable h = VerifyInfoHelper.h(verifyInfoHelper, Y, view.getContext(), null, 20);
            if (h != null) {
                baf0 baf0Var = (baf0) h;
                h.setBounds(0, 0, baf0Var.b.getIntrinsicWidth(), baf0Var.b.getIntrinsicHeight());
                drawable = h;
            } else {
                drawable = null;
            }
            View view2 = this.O;
            (view2 != null ? view2 : null).getContext();
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            newSpannable.setSpan(new tzx0(drawable, 3, -1.0f, false, 0, 0, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) newSpannable);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void j(DonutVideoAction donutVideoAction, DonutVideoClickSource donutVideoClickSource) {
        View view = this.O;
        if (view == null) {
            view = null;
        }
        Activity a = VideoItemVh.a(view);
        if (donutVideoAction == null || a == null) {
            return;
        }
        ((x4o) this.d0.getValue()).a(donutVideoAction, a, new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), donutVideoClickSource.h()), 1));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean k(VideoFile videoFile) {
        VideoRestriction O = videoFile.O();
        if (O == null || (e5o.b(O) && ((f5o) this.f0.getValue()).a())) {
            O = null;
        }
        boolean z = (O == null || (O.d && O.f)) ? false : true;
        VideoRestriction O2 = videoFile.O();
        boolean z2 = (O2 == null || O2.f) ? false : true;
        boolean z3 = this.a0;
        return (z && z3) || (z2 && !z3);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.m, viewGroup, false);
        this.O = inflate;
        this.H = (TextView) inflate.findViewById(R.id.title);
        this.I = (TextView) inflate.findViewById(R.id.subtitle_views);
        this.B = (TextView) inflate.findViewById(R.id.subtitle_author);
        this.A = (VKImageView) inflate.findViewById(R.id.avatar);
        this.J = (DurationView) inflate.findViewById(R.id.duration);
        this.K = (UpcomingIndicatorView) inflate.findViewById(R.id.video_upcoming_indicator);
        this.L = (InteractiveDurationView) inflate.findViewById(R.id.interactive_duration);
        this.F = (VKImageView) inflate.findViewById(R.id.privacy_icon);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.preview);
        Integer num = this.w;
        if (num != null) {
            vKImageView.setCornerRadius(inflate.getResources().getDimension(num.intValue()));
        }
        this.M = vKImageView;
        this.N = (VideoOverlayView) inflate.findViewById(R.id.overlay_view);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) inflate.findViewById(R.id.progress_bar);
        if (linearProgressIndicator != null) {
            linearProgressIndicator.setClipToOutline(true);
            linearProgressIndicator.setOutlineProvider(new s0w0(iah0.a(4.0f), true, false));
            linearProgressIndicator.setTrackColor(dhr0.t.c(R.attr.vk_ui_background_contrast_secondary_alpha));
        } else {
            linearProgressIndicator = null;
        }
        this.E = linearProgressIndicator;
        boolean z = this.u;
        boolean z2 = this.v;
        if (z && z2) {
            View view = this.O;
            if (view == null) {
                view = null;
            }
            Context context = view.getContext();
            this.Y.getClass();
            Pair a = m8s0.a(context);
            VKImageView vKImageView2 = this.M;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            bwt0.m0(((Number) a.i()).intValue(), ((Number) a.j()).intValue(), vKImageView2);
            VideoOverlayView videoOverlayView = this.N;
            if (videoOverlayView == null) {
                videoOverlayView = null;
            }
            bwt0.m0(((Number) a.i()).intValue(), ((Number) a.j()).intValue(), videoOverlayView);
            View view2 = this.O;
            if (view2 == null) {
                view2 = null;
            }
            bwt0.r0(((Number) a.i()).intValue(), view2);
        }
        View findViewById = inflate.findViewById(R.id.menu);
        if (findViewById != null) {
            findViewById.setOnClickListener(new c98(this, 1));
        } else {
            findViewById = null;
        }
        this.D = findViewById;
        View findViewById2 = inflate.findViewById(R.id.avatar_hover);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new c98(this, 1));
        } else {
            findViewById2 = null;
        }
        this.C = findViewById2;
        this.k = e3m.a(R.dimen.small_video_corner_radius, layoutInflater.getContext());
        View findViewById3 = inflate.findViewById(R.id.avatar_hover);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new c98(this, 1));
        }
        inflate.setOnClickListener(new c98(this, 1));
        this.P = (DonutBadge) inflate.findViewById(R.id.donut_price_badge);
        this.G = (VkImageSimple) inflate.findViewById(R.id.video_badge);
        DurationView durationView = this.J;
        if (durationView == null) {
            durationView = null;
        }
        boolean z3 = this.s;
        boolean z4 = this.t;
        if (z4 && z2 && z3) {
            f4m.q(cn70.b(8), durationView);
            f4m.r(cn70.b(8), durationView);
        }
        DonutBadge donutBadge = this.P;
        if (donutBadge != null && z4 && z2 && z3) {
            f4m.q(cn70.b(8), donutBadge);
            f4m.s(cn70.b(8), donutBadge);
        }
        VkImageSimple vkImageSimple = this.G;
        if (vkImageSimple != null) {
            f4m.q(cn70.b(8), vkImageSimple);
            f4m.r(cn70.b(8), vkImageSimple);
        }
        if (z4 && this.E == null) {
            ConstraintLayout constraintLayout = inflate instanceof ConstraintLayout ? (ConstraintLayout) inflate : null;
            if (constraintLayout != null) {
                View view3 = this.O;
                if (view3 == null) {
                    view3 = null;
                }
                ProgressBar progressBar = new ProgressBar(view3.getContext(), null, 0, android.R.style.Widget.ProgressBar.Horizontal);
                progressBar.setId(R.id.progress_bar);
                progressBar.setIndeterminate(false);
                progressBar.setLayoutParams(new ConstraintLayout.b(0, iah0.a(5.0f)));
                progressBar.setProgressDrawable(m33.a(R.drawable.video_progress_redesign, progressBar.getContext()));
                bwt0.d(progressBar, this.k, (r4 & 2) != 0, (r4 & 4) != 0);
                progressBar.setVisibility(8);
                constraintLayout.addView(progressBar);
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                bVar.i(constraintLayout);
                bVar.l(R.id.progress_bar, 6, R.id.preview, 6, this.Q);
                bVar.l(R.id.progress_bar, 7, R.id.preview, 7, this.Q);
                bVar.l(R.id.progress_bar, 4, R.id.preview, 4, this.R);
                bVar.b(constraintLayout);
            }
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
