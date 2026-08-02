package com.vk.libvideo.design.view.panel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.utils.b;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.TitleAction;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.music.Artist;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.libvideo.design.view.buttons.EpisodeButton;
import com.vk.libvideo.ui.VideoBottomBarView;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import one.video.ad.ux.AdRedirectView;
import xsna.awt0;
import xsna.bu00;
import xsna.bwt0;
import xsna.drm0;
import xsna.f4m;
import xsna.fo50;
import xsna.fxc0;
import xsna.gpt0;
import xsna.i6m0;
import xsna.iah0;
import xsna.ift0;
import xsna.j5g;
import xsna.jl80;
import xsna.l1k0;
import xsna.m33;
import xsna.ml7;
import xsna.msy;
import xsna.n8g;
import xsna.nid0;
import xsna.pvo0;
import xsna.s490;
import xsna.v0s0;
import xsna.zjq;

/* compiled from: VideoBottomPanelView.kt */
/* loaded from: classes2.dex */
public final class VideoBottomPanelView extends ConstraintLayout {
    public static final int Q = iah0.a(14);
    public boolean A;
    public boolean B;
    public boolean C;
    public View D;
    public VKCircleImageView E;
    public TextView F;
    public TextView G;
    public View H;
    public final ift0 I;
    public final boolean J;
    public final boolean K;
    public final TextView L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final Object P;
    public final AppCompatTextView t;
    public final TextView u;
    public final VideoBottomBarView v;
    public final EpisodeButton w;
    public final View x;
    public final View y;
    public View.OnClickListener z;

    public VideoBottomPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static boolean Q4(VideoFile videoFile) {
        TitleAction.Snippet snippet;
        String str;
        TitleAction Ha = videoFile.Ha();
        return (Ha == null || (snippet = Ha.e) == null || (str = snippet.b) == null || !(drm0.N(str) ^ true)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P4(VideoFile videoFile, boolean z) {
        boolean z2;
        CharSequence charSequence;
        CharSequence title;
        String i;
        Image image;
        ImageSize Cb;
        String str;
        SpannableString spannableString;
        TitleAction.Snippet snippet;
        String str2;
        this.M = this.K && videoFile.T1();
        boolean z3 = this.B;
        VideoBottomBarView videoBottomBarView = this.v;
        if (z3) {
            videoBottomBarView.setIsDiscoveryRedesignEnabled(!z && ((Boolean) this.P.getValue()).booleanValue());
            videoBottomBarView.setShowPlaylist(this.O);
            videoBottomBarView.a(videoFile);
        } else {
            bwt0.p0(videoBottomBarView, false);
        }
        if (this.N) {
            bwt0.d0(this.x, !bwt0.K(videoBottomBarView));
        }
        boolean z4 = (BuildInfo.t() && videoFile.o0() == 0) ? false : true;
        AppCompatTextView appCompatTextView = this.t;
        bwt0.p0(appCompatTextView, z4);
        boolean k = zjq.k(videoFile);
        boolean z5 = (videoFile.o0() == 0 || videoFile.Z9() || this.M) ? false : true;
        TextView textView = this.u;
        bwt0.p0(textView, z5);
        bwt0.p0(appCompatTextView, (BuildInfo.t() && videoFile.o0() == 0) ? false : true);
        int L8 = videoFile.L8();
        ift0 ift0Var = this.I;
        String b = L8 <= 0 ? null : ift0Var.b(getContext(), videoFile);
        b.C0795b c0795b = b.C0795b.a;
        if (b != null) {
            if (videoFile.p1() != null) {
                charSequence = ((CharSequence) b) + " · " + getResources().getString(R.string.video_author_ads);
            } else {
                charSequence = b;
            }
            if (videoFile.p1() != null) {
                str = "\n" + getContext().getResources().getString(R.string.video_author_ads);
            } else {
                str = null;
            }
            if (Q4(videoFile)) {
                Context context = getContext();
                TitleAction Ha = videoFile.Ha();
                String str3 = (videoFile.p1() == null || k) ? null : str;
                ift0Var.getClass();
                if (Ha != null && (snippet = Ha.e) != null && (str2 = snippet.b) != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        z2 = true;
                        String string = context.getString(R.string.video_views_dot_separator, b, str2);
                        spannableString = b.C0795b.f(Ha, context, string, string.length() - str2.length(), string.length(), str3);
                        if (spannableString == null) {
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView.setHighlightColor(0);
                            charSequence = spannableString;
                        } else {
                            textView.setMovementMethod(null);
                        }
                    }
                }
                z2 = true;
                spannableString = null;
                if (spannableString == null) {
                }
            } else {
                z2 = true;
                if (k) {
                    String string2 = getContext().getString(R.string.archival_content_title);
                    Context context2 = getContext();
                    int currentTextColor = textView.getCurrentTextColor();
                    if (videoFile.p1() == null || Q4(videoFile)) {
                        str = null;
                    }
                    b.a aVar = new b.a(b, string2, currentTextColor, str);
                    nid0 nid0Var = new nid0(this, 19);
                    ift0Var.getClass();
                    charSequence = c0795b.e(context2, aVar, nid0Var);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setHighlightColor(0);
                } else {
                    textView.setMovementMethod(null);
                }
            }
        } else {
            z2 = true;
            charSequence = null;
        }
        textView.setText(charSequence);
        f4m.t(iah0.a((!k || Q4(videoFile)) ? 2 : 4), textView);
        boolean z6 = videoFile instanceof MusicVideoFile;
        appCompatTextView.setTextColor(z6 ? -1 : z ? getContext().getColor(R.color.vk_white) : getContext().getColor(R.color.vk_white_alpha60));
        textView.setTextColor(z ? getContext().getColor(R.color.vk_white_alpha60) : getContext().getColor(R.color.vk_white_alpha40));
        int color = z ? getContext().getColor(R.color.vk_white_alpha60) : getContext().getColor(R.color.vk_white_alpha40);
        TextView textView2 = this.L;
        textView2.setTextColor(color);
        if (z6) {
            MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
            title = s490.d(getContext(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary);
        } else {
            title = videoFile.getTitle();
        }
        bu00.q(appCompatTextView, title);
        VideoRestriction O = videoFile.O();
        bwt0.p0(this.y, !(((O == null || O.f) && !fxc0.B().b0().e(videoFile)) ? false : z2));
        if (this.A) {
            if (this.D == null) {
                View inflate = ((ViewStub) findViewById(R.id.user_profile_stub)).inflate();
                this.D = inflate;
                this.E = (VKCircleImageView) inflate.findViewById(R.id.user_photo);
                View view = this.D;
                if (view == null) {
                    view = null;
                }
                this.F = (TextView) view.findViewById(R.id.title);
                View view2 = this.D;
                if (view2 == null) {
                    view2 = null;
                }
                this.G = (TextView) view2.findViewById(R.id.subtitle);
                View view3 = this.D;
                if (view3 == null) {
                    view3 = null;
                }
                this.H = view3.findViewById(R.id.share_btn);
            }
            if (z6) {
                VKCircleImageView vKCircleImageView = this.E;
                if (vKCircleImageView == null) {
                    vKCircleImageView = null;
                }
                fo50.r(vKCircleImageView, "artist_not_transparent");
                MusicVideoFile musicVideoFile2 = (MusicVideoFile) videoFile;
                VKCircleImageView vKCircleImageView2 = this.E;
                if (vKCircleImageView2 == null) {
                    vKCircleImageView2 = null;
                }
                int width = vKCircleImageView2.getWidth();
                c0795b.getClass();
                List<Artist> list = musicVideoFile2.B1;
                Artist artist = list != null ? (Artist) j5g.a0(list) : null;
                String str4 = (artist == null || (image = artist.f) == null || (Cb = image.Cb(width, z2, false)) == null) ? null : Cb.d.d;
                VKCircleImageView vKCircleImageView3 = this.E;
                if (vKCircleImageView3 == null) {
                    vKCircleImageView3 = null;
                }
                vKCircleImageView3.o0(str4, null);
                TextView textView3 = this.F;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setText(c0795b.c(getContext(), musicVideoFile2));
                TextView textView4 = this.G;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setText(b.C0795b.d(musicVideoFile2.F1, musicVideoFile2.E1));
            } else {
                VKCircleImageView vKCircleImageView4 = this.E;
                if (vKCircleImageView4 == null) {
                    vKCircleImageView4 = null;
                }
                vKCircleImageView4.o0(videoFile.M0(), null);
                VKCircleImageView vKCircleImageView5 = this.E;
                if (vKCircleImageView5 == null) {
                    vKCircleImageView5 = null;
                }
                vKCircleImageView5.setPlaceholderImage(R.drawable.user_placeholder);
                TextView textView5 = this.F;
                if (textView5 == null) {
                    textView5 = null;
                }
                String P = videoFile.P();
                textView5.setText((P == null || P.length() == 0) ? "..." : videoFile.P());
                TextView textView6 = this.G;
                if (textView6 == null) {
                    textView6 = null;
                }
                if (this.J) {
                    gpt0 gpt0Var = gpt0.a;
                    i = gpt0.k(getContext(), videoFile);
                } else {
                    i = pvo0.i(false, videoFile.b0(), false, false);
                }
                textView6.setText(i);
                View view4 = this.D;
                if (view4 == null) {
                    view4 = null;
                }
                bwt0.i0(view4, new l1k0(5, this, videoFile));
            }
            View view5 = this.H;
            if (view5 == null) {
                view5 = null;
            }
            awt0.v(view5, videoFile.Fa());
            View view6 = this.H;
            if (view6 == null) {
                view6 = null;
            }
            bwt0.i0(view6, new v0s0(1, this, videoFile));
        }
        boolean z7 = this.C && !videoFile.Y3().isEmpty();
        EpisodeButton episodeButton = this.w;
        bwt0.p0(episodeButton, z7);
        if (bwt0.K(episodeButton)) {
            episodeButton.P4(videoFile);
        }
        if (videoFile.q0()) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gpt0.f(appCompatTextView.getContext(), 6.0f, 6.0f, -1), (Drawable) null);
            appCompatTextView.setCompoundDrawablePadding(iah0.a(8.0f));
        } else if (z6 && ((MusicVideoFile) videoFile).A1) {
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, appCompatTextView.getContext()), (Drawable) null);
            appCompatTextView.setCompoundDrawablePadding(iah0.a(4));
        } else {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        boolean z8 = k && Q4(videoFile);
        bwt0.p0(textView2, z8);
        if (!z8) {
            textView2.setMovementMethod(null);
            textView2.setText((CharSequence) null);
            return;
        }
        String string3 = videoFile.p1() != null ? getContext().getResources().getString(R.string.video_author_ads) : null;
        String string4 = getContext().getString(R.string.archival_content_title);
        Context context3 = getContext();
        b.a aVar2 = new b.a(null, string4, textView2.getCurrentTextColor(), string3);
        i6m0 i6m0Var = new i6m0(this, 9);
        ift0Var.getClass();
        CharSequence e = c0795b.e(context3, aVar2, i6m0Var);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setHighlightColor(0);
        textView2.setText(e);
    }

    public final EpisodeButton getEpisodeBtn() {
        return this.w;
    }

    public final boolean getHideDividerWithBottomBar() {
        return this.N;
    }

    public final void setBottomBarVisibility(boolean z) {
        boolean z2 = false;
        this.B = z && !this.M;
        if (z && !this.M) {
            z2 = true;
        }
        bwt0.p0(this.v, z2);
    }

    public final void setButtonsOnClickListener(View.OnClickListener onClickListener) {
        this.v.setButtonsOnClickListener(onClickListener);
        bwt0.h0(onClickListener, this.y);
        bwt0.h0(onClickListener, this.w);
        bwt0.h0(onClickListener, this.t);
        bwt0.h0(onClickListener, this.u);
        bwt0.h0(onClickListener, this.L);
        this.z = onClickListener;
    }

    public final void setHideDividerWithBottomBar(boolean z) {
        this.N = z;
    }

    public final void setMarginTop(boolean z) {
        AppCompatTextView appCompatTextView = this.t;
        int i = ((ViewGroup.MarginLayoutParams) appCompatTextView.getLayoutParams()).topMargin;
        if (z && i == 0) {
            ((ViewGroup.MarginLayoutParams) appCompatTextView.getLayoutParams()).topMargin = Q;
        } else {
            if (z || i <= 0) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) appCompatTextView.getLayoutParams()).topMargin = 0;
        }
    }

    public final void setShowPlaylist(boolean z) {
        this.O = z;
    }

    public VideoBottomPanelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.A = BuildInfo.t();
        this.B = (BuildInfo.t() || BuildInfo.g()) ? false : true;
        this.C = true;
        this.I = new ift0();
        Features.Type type = Features.Type.FEATURE_VIDEO_DISCOVERY_PUBDATE;
        type.getClass();
        this.J = com.vk.toggle.b.A.a(type);
        this.K = fxc0.B().J().a2();
        this.P = msy.a(LazyThreadSafetyMode.NONE, new ml7(29));
        LayoutInflater.from(context).inflate(R.layout.video_bottom_view, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.subtitle);
        textView.setTag("bottom_subtitle");
        this.u = textView;
        this.v = (VideoBottomBarView) findViewById(R.id.bottom_bar);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.title);
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setTag("bottom_title");
        this.t = appCompatTextView;
        this.x = findViewById(R.id.divider);
        EpisodeButton episodeButton = (EpisodeButton) findViewById(R.id.episode);
        episodeButton.setTag("episode_button");
        this.w = episodeButton;
        View findViewById = findViewById(R.id.info);
        findViewById.setTag("bottom_about_video");
        this.y = findViewById;
        TextView textView2 = (TextView) findViewById(R.id.archival_content);
        textView2.setTag("archival_content");
        this.L = textView2;
        AdRedirectView adRedirectView = (AdRedirectView) findViewById(R.id.redirect_button);
        adRedirectView.setImageLoader(new jl80());
        adRedirectView.setBackgroundColor(n8g.l(-1, 7));
    }
}
