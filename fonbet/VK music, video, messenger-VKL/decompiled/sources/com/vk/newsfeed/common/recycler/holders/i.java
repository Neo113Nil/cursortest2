package com.vk.newsfeed.common.recycler.holders;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.community.design.view.donut.teaser.DonutTeaserView;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.VideoRestrictionView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.media.player.PlayerError;
import com.vk.newsfeed.api.posting.attachments.PendingVideoAttachmentWrapper;
import com.vk.newsfeed.common.presentation.model.items.attachments.video.VideoSimpleHolderUiDto;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vk.pending.PendingVideoAttachment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ComFeatures;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import org.chromium.base.version_info.VersionConstants;
import xsna.a390;
import xsna.awt0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cpo0;
import xsna.cvk;
import xsna.d3m;
import xsna.dek0;
import xsna.dhr0;
import xsna.e6o;
import xsna.eek0;
import xsna.fi;
import xsna.fxc0;
import xsna.fxj0;
import xsna.fyd0;
import xsna.g620;
import xsna.gd60;
import xsna.ghn0;
import xsna.gpt0;
import xsna.gzs;
import xsna.hc1;
import xsna.hd60;
import xsna.i1t0;
import xsna.i8c0;
import xsna.iah0;
import xsna.ixj0;
import xsna.izs;
import xsna.j6r0;
import xsna.jwx;
import xsna.k0m0;
import xsna.kyq0;
import xsna.m33;
import xsna.mrc0;
import xsna.msy;
import xsna.nhs;
import xsna.ol60;
import xsna.om60;
import xsna.oqh0;
import xsna.pdv0;
import xsna.pm60;
import xsna.pvh0;
import xsna.qrq;
import xsna.rgt0;
import xsna.s490;
import xsna.s6o;
import xsna.sgt0;
import xsna.tps0;
import xsna.u1c0;
import xsna.uyq0;
import xsna.vtk0;
import xsna.w1s0;
import xsna.w3o;
import xsna.wrl0;
import xsna.y1o;
import xsna.yg5;

/* compiled from: VideoSimpleHolder.java */
/* loaded from: classes4.dex */
public final class i extends fi<VideoSimpleHolderUiDto, VideoAttachment> implements View.OnClickListener {
    public final TextView K;
    public final TextView L;
    public final View M;
    public final FrescoImageView N;
    public final DurationView O;
    public final InteractiveDurationView P;
    public final RatioFrameLayout Q;
    public final VideoOverlayView R;
    public final DonutTeaserView S;
    public final VideoRestrictionView T;
    public final Space U;
    public io.reactivex.rxjava3.disposables.c V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public View.OnClickListener a0;
    public e6o b0;
    public final tps0 c0;
    public final int d0;
    public ScaleType e0;
    public Long f0;
    public boolean g0;
    public boolean h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;

    @Nullable
    public mrc0 o0;
    public final boolean p0;
    public Boolean q0;

    /* compiled from: VideoSimpleHolder.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ScaleType.values().length];
            c = iArr;
            try {
                iArr[ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[VideoSimpleHolderUiDto.SubtitleTextMode.values().length];
            b = iArr2;
            try {
                iArr2[VideoSimpleHolderUiDto.SubtitleTextMode.VIEWS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[VideoSimpleHolderUiDto.SubtitleTextMode.MUSIC_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[VideoSimpleHolderUiDto.SubtitleTextMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[VideoSimpleHolderUiDto.TitleTextMode.values().length];
            a = iArr3;
            try {
                iArr3[VideoSimpleHolderUiDto.TitleTextMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[VideoSimpleHolderUiDto.TitleTextMode.MUSIC_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[VideoSimpleHolderUiDto.TitleTextMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public i(ViewGroup viewGroup) {
        this(viewGroup, true, new tps0.b());
    }

    @Override // xsna.fi, xsna.io2
    public final void C() {
        RatioFrameLayout ratioFrameLayout = this.Q;
        d3m.b(ratioFrameLayout, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        ratioFrameLayout.setVisibility(0);
    }

    @Override // xsna.fi, xsna.io2
    public final void D0() {
        this.N.setVisibility(this.W ? 0 : 8);
        this.M.setVisibility(this.X ? 0 : 8);
        j6r0.d(this.Q, 4, false, 50, null);
    }

    @Override // xsna.fi, xsna.io2
    public final void J() {
        j6r0.d(this.Q, 0, false, 50, null);
    }

    @Override // xsna.io2
    public final boolean M() {
        return false;
    }

    @Override // xsna.qi6
    public final void Q6(@NonNull s6o s6oVar) {
        super.Q6(s6oVar);
        View.OnClickListener onClickListener = this.a0;
        Long l = this.f0;
        if (l == null) {
            l = Long.valueOf(ViewConfiguration.getDoubleTapTimeout() + 300);
            this.f0 = l;
        }
        this.b0 = new e6o(s6oVar, l, onClickListener, s6oVar.e);
        o7();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    @Override // xsna.eq6, xsna.rp6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R6(ol60 ol60Var) {
        RestrictionButton restrictionButton;
        CharSequence v;
        final VideoSimpleHolderUiDto videoSimpleHolderUiDto = (VideoSimpleHolderUiDto) ol60Var;
        if (this.q0 == null) {
            this.q0 = Boolean.TRUE;
        }
        if (this.q0.booleanValue()) {
            VideoAttachment videoAttachment = videoSimpleHolderUiDto.j;
            VideoFile videoFile = videoSimpleHolderUiDto.k;
            this.E = videoAttachment;
            this.Z = videoSimpleHolderUiDto.s;
            this.g0 = videoSimpleHolderUiDto.t;
            boolean z = videoSimpleHolderUiDto.u;
            FrescoImageView frescoImageView = this.N;
            if (!z) {
                int i = dek0.a;
                frescoImageView.setOnLoadCallback(new eek0(null, frescoImageView, null, false));
            }
            final boolean z2 = this.Y;
            final VideoFile videoFile2 = videoSimpleHolderUiDto.k;
            videoSimpleHolderUiDto.j.Kb(false);
            TextView textView = this.K;
            TextView textView2 = this.L;
            if (z2) {
                int i2 = a.a[videoSimpleHolderUiDto.o.ordinal()];
                CharSequence charSequence = "";
                if (i2 == 1) {
                    v = gpt0.v(videoFile);
                } else if (i2 != 2) {
                    v = "";
                } else {
                    MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
                    v = s490.d(this.itemView.getContext(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary);
                }
                int i3 = a.b[videoSimpleHolderUiDto.p.ordinal()];
                if (i3 == 1) {
                    int L8 = videoFile.L8();
                    charSequence = s6(R.plurals.video_views, L8, Integer.valueOf(L8));
                } else if (i3 == 2) {
                    MusicVideoFile musicVideoFile2 = (MusicVideoFile) videoFile;
                    charSequence = s490.d(this.itemView.getContext(), s490.i(musicVideoFile2.B1), s490.c(musicVideoFile2.C1), R.attr.vk_ui_text_secondary);
                }
                textView2.setText(v);
                textView2.setVisibility(TextUtils.isEmpty(v) ? 8 : 0);
                textView.setText(charSequence);
                textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
                textView2.setSingleLine(true);
                MusicVideoFile musicVideoFile3 = videoFile instanceof MusicVideoFile ? (MusicVideoFile) videoFile : null;
                if (musicVideoFile3 == null || !musicVideoFile3.A1) {
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView2.getContext()), (Drawable) null);
                    textView2.setCompoundDrawablePadding(iah0.a(4));
                }
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
            }
            if (this.o0 != null && this.p0) {
                VideoRestriction O = videoFile2.O();
                if ((O == null || (restrictionButton = O.e) == null) ? false : restrictionButton.b.equals(RestrictionButton.Action.DONAT.h())) {
                    i7(videoFile2);
                    final boolean z3 = videoSimpleHolderUiDto.q;
                    awt0.t(this.itemView, new gzs() { // from class: xsna.qgt0
                        /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
                        /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
                        @Override // xsna.gzs
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke() {
                            boolean z4;
                            com.vk.newsfeed.common.recycler.holders.i iVar = com.vk.newsfeed.common.recycler.holders.i.this;
                            InteractiveDurationView interactiveDurationView = iVar.P;
                            DurationView durationView = iVar.O;
                            int width = iVar.itemView.getWidth();
                            int height = iVar.itemView.getHeight();
                            boolean z5 = z3;
                            VideoSimpleHolderUiDto videoSimpleHolderUiDto2 = videoSimpleHolderUiDto;
                            if (z5 || width == 0 || height == 0) {
                                width = videoSimpleHolderUiDto2.l;
                                height = videoSimpleHolderUiDto2.m;
                            }
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (iVar.g0 ? interactiveDurationView.getLayoutParams() : durationView.getLayoutParams());
                            if (iVar.g0) {
                                interactiveDurationView.setTextDescriptionVisible(width > iah0.a((float) 160));
                                interactiveDurationView.setDurationVisible(width > iah0.a((float) 120));
                                float f = 45;
                                interactiveDurationView.setVisibility((width <= iah0.a(f) || height <= iah0.a(f)) ? 8 : 0);
                            }
                            boolean z6 = z2;
                            if (!z6) {
                                float f2 = VersionConstants.PRODUCT_MAJOR_VERSION;
                                if (width < iah0.a(f2) || height < iah0.a(f2)) {
                                    iVar.s7(false);
                                    float f3 = 4;
                                    layoutParams.setMargins(0, 0, iah0.a(f3), iah0.a(f3));
                                    WeakHashMap weakHashMap = j6r0.a;
                                    if (width >= iah0.a(135.0f)) {
                                        float f4 = 2;
                                        durationView.setPadding(iah0.a(f4), iah0.a(f4), iah0.a(5), iah0.a(f4));
                                        z4 = true;
                                    } else {
                                        float f5 = 2;
                                        durationView.setPadding(iah0.a(f5), iah0.a(f5), iah0.a(f5), iah0.a(f5));
                                        z4 = false;
                                    }
                                    durationView.setPlayIconVisibility(true);
                                    VideoFile videoFile3 = videoFile2;
                                    if (z4) {
                                        durationView.setText("");
                                    } else {
                                        durationView.setText(videoSimpleHolderUiDto2.u ? gpt0.m(iVar.itemView.getContext(), videoFile3, false, false) : z6 ? gpt0.m(iVar.itemView.getContext(), videoFile3, true, false) : width >= iah0.a((float) 100) ? gpt0.m(iVar.itemView.getContext(), videoFile3, true, false) : gpt0.m(iVar.itemView.getContext(), videoFile3, false, false));
                                    }
                                    interactiveDurationView.setDurationText(gpt0.m(iVar.itemView.getContext(), videoFile3, true, false));
                                    return s3q0.a;
                                }
                            }
                            if (z5) {
                                iVar.s7(false);
                            } else {
                                iVar.s7(!iVar.Z && iVar.X);
                            }
                            float f6 = 8;
                            layoutParams.setMargins(0, 0, iah0.a(f6), iah0.a(f6));
                            float f7 = 6;
                            float f8 = 2;
                            durationView.setPadding(iah0.a(f7), iah0.a(f8), iah0.a(f7), iah0.a(f8));
                            durationView.setPlayIconVisibility(false);
                            z4 = true;
                            VideoFile videoFile32 = videoFile2;
                            if (z4) {
                            }
                            interactiveDurationView.setDurationText(gpt0.m(iVar.itemView.getContext(), videoFile32, true, false));
                            return s3q0.a;
                        }
                    });
                    int i4 = videoSimpleHolderUiDto.v;
                    DurationView durationView = this.O;
                    durationView.setVisibility(i4);
                    this.P.setVisibility(videoSimpleHolderUiDto.w);
                    durationView.setBackgroundResource(videoSimpleHolderUiDto.x);
                    frescoImageView.setIgnoreTrafficSaverPredicate(new sgt0(videoSimpleHolderUiDto, 0));
                    frescoImageView.setLocalImage((List<? extends fxj0>) videoSimpleHolderUiDto.z);
                    frescoImageView.setRemoteImage((List<? extends fxj0>) videoSimpleHolderUiDto.A);
                    frescoImageView.setScaleType(!z3 ? ScaleType.FIT_CENTER : this.e0);
                    this.Q.setBackgroundColor(!z3 ? -16777216 : 0);
                    this.M.setBackgroundResource(videoSimpleHolderUiDto.y);
                    h7(z2);
                }
            }
            j7(videoFile2);
            final boolean z32 = videoSimpleHolderUiDto.q;
            awt0.t(this.itemView, new gzs() { // from class: xsna.qgt0
                /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
                @Override // xsna.gzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    boolean z4;
                    com.vk.newsfeed.common.recycler.holders.i iVar = com.vk.newsfeed.common.recycler.holders.i.this;
                    InteractiveDurationView interactiveDurationView = iVar.P;
                    DurationView durationView2 = iVar.O;
                    int width = iVar.itemView.getWidth();
                    int height = iVar.itemView.getHeight();
                    boolean z5 = z32;
                    VideoSimpleHolderUiDto videoSimpleHolderUiDto2 = videoSimpleHolderUiDto;
                    if (z5 || width == 0 || height == 0) {
                        width = videoSimpleHolderUiDto2.l;
                        height = videoSimpleHolderUiDto2.m;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (iVar.g0 ? interactiveDurationView.getLayoutParams() : durationView2.getLayoutParams());
                    if (iVar.g0) {
                        interactiveDurationView.setTextDescriptionVisible(width > iah0.a((float) 160));
                        interactiveDurationView.setDurationVisible(width > iah0.a((float) 120));
                        float f = 45;
                        interactiveDurationView.setVisibility((width <= iah0.a(f) || height <= iah0.a(f)) ? 8 : 0);
                    }
                    boolean z6 = z2;
                    if (!z6) {
                        float f2 = VersionConstants.PRODUCT_MAJOR_VERSION;
                        if (width < iah0.a(f2) || height < iah0.a(f2)) {
                            iVar.s7(false);
                            float f3 = 4;
                            layoutParams.setMargins(0, 0, iah0.a(f3), iah0.a(f3));
                            WeakHashMap weakHashMap = j6r0.a;
                            if (width >= iah0.a(135.0f)) {
                                float f4 = 2;
                                durationView2.setPadding(iah0.a(f4), iah0.a(f4), iah0.a(5), iah0.a(f4));
                                z4 = true;
                            } else {
                                float f5 = 2;
                                durationView2.setPadding(iah0.a(f5), iah0.a(f5), iah0.a(f5), iah0.a(f5));
                                z4 = false;
                            }
                            durationView2.setPlayIconVisibility(true);
                            VideoFile videoFile32 = videoFile2;
                            if (z4) {
                                durationView2.setText("");
                            } else {
                                durationView2.setText(videoSimpleHolderUiDto2.u ? gpt0.m(iVar.itemView.getContext(), videoFile32, false, false) : z6 ? gpt0.m(iVar.itemView.getContext(), videoFile32, true, false) : width >= iah0.a((float) 100) ? gpt0.m(iVar.itemView.getContext(), videoFile32, true, false) : gpt0.m(iVar.itemView.getContext(), videoFile32, false, false));
                            }
                            interactiveDurationView.setDurationText(gpt0.m(iVar.itemView.getContext(), videoFile32, true, false));
                            return s3q0.a;
                        }
                    }
                    if (z5) {
                        iVar.s7(false);
                    } else {
                        iVar.s7(!iVar.Z && iVar.X);
                    }
                    float f6 = 8;
                    layoutParams.setMargins(0, 0, iah0.a(f6), iah0.a(f6));
                    float f7 = 6;
                    float f8 = 2;
                    durationView2.setPadding(iah0.a(f7), iah0.a(f8), iah0.a(f7), iah0.a(f8));
                    durationView2.setPlayIconVisibility(false);
                    z4 = true;
                    VideoFile videoFile322 = videoFile2;
                    if (z4) {
                    }
                    interactiveDurationView.setDurationText(gpt0.m(iVar.itemView.getContext(), videoFile322, true, false));
                    return s3q0.a;
                }
            });
            int i42 = videoSimpleHolderUiDto.v;
            DurationView durationView2 = this.O;
            durationView2.setVisibility(i42);
            this.P.setVisibility(videoSimpleHolderUiDto.w);
            durationView2.setBackgroundResource(videoSimpleHolderUiDto.x);
            frescoImageView.setIgnoreTrafficSaverPredicate(new sgt0(videoSimpleHolderUiDto, 0));
            frescoImageView.setLocalImage((List<? extends fxj0>) videoSimpleHolderUiDto.z);
            frescoImageView.setRemoteImage((List<? extends fxj0>) videoSimpleHolderUiDto.A);
            frescoImageView.setScaleType(!z32 ? ScaleType.FIT_CENTER : this.e0);
            this.Q.setBackgroundColor(!z32 ? -16777216 : 0);
            this.M.setBackgroundResource(videoSimpleHolderUiDto.y);
            h7(z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    @Override // xsna.eq6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c7(Attachment attachment) {
        int i;
        RestrictionButton restrictionButton;
        CharSequence charSequence;
        CharSequence charSequence2;
        final VideoAttachment videoAttachment = (VideoAttachment) attachment;
        if (this.C != 0) {
            if (this.q0 == null) {
                this.q0 = Boolean.TRUE;
            }
            if (this.q0.booleanValue()) {
                return;
            }
        }
        final VideoFile videoFile = videoAttachment.k;
        this.Z = fxc0.B().c(videoFile) || videoFile.Z9();
        this.g0 = videoFile.W9();
        final boolean z = (videoAttachment instanceof PendingVideoAttachment) || (videoAttachment instanceof PendingVideoAttachmentWrapper);
        videoAttachment.Kb(false);
        final boolean z2 = this.Y;
        boolean w8 = videoFile.w8();
        FrescoImageView frescoImageView = this.N;
        if (!w8) {
            int i2 = dek0.a;
            frescoImageView.setOnLoadCallback(new eek0(null, frescoImageView, null, false));
        }
        boolean c = g620.f().c(videoFile);
        TextView textView = this.K;
        TextView textView2 = this.L;
        if (z2) {
            boolean z3 = videoFile instanceof MusicVideoFile;
            if (z3) {
                MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
                charSequence = s490.d(this.itemView.getContext(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary);
                charSequence2 = s490.d(this.itemView.getContext(), s490.i(musicVideoFile.B1), s490.c(musicVideoFile.C1), R.attr.vk_ui_text_secondary);
            } else {
                int L8 = videoFile.L8();
                String v = videoAttachment.h == null ? gpt0.v(videoFile) : "";
                String quantityString = c ? "" : textView.getResources().getQuantityString(R.plurals.video_views, L8, Integer.valueOf(L8));
                textView.setVisibility((L8 == 0 || c) ? 8 : 0);
                charSequence = v;
                charSequence2 = quantityString;
            }
            textView2.setText(charSequence);
            textView.setText(charSequence2);
            textView2.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
            textView2.setSingleLine(true);
            MusicVideoFile musicVideoFile2 = z3 ? (MusicVideoFile) videoFile : null;
            if (musicVideoFile2 == null || !musicVideoFile2.A1) {
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView2.getContext()), (Drawable) null);
                textView2.setCompoundDrawablePadding(iah0.a(4));
            }
            i = 8;
        } else {
            i = 8;
            textView2.setVisibility(8);
            textView.setVisibility(8);
        }
        if (this.o0 != null && this.p0) {
            VideoRestriction O = videoFile.O();
            if ((O == null || (restrictionButton = O.e) == null) ? false : restrictionButton.b.equals(RestrictionButton.Action.DONAT.h())) {
                i7(videoFile);
                awt0.t(this.itemView, new gzs() { // from class: xsna.ugt0
                    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x0162  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
                    @Override // xsna.gzs
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke() {
                        boolean z4;
                        VideoFile videoFile2;
                        String m;
                        com.vk.newsfeed.common.recycler.holders.i iVar = com.vk.newsfeed.common.recycler.holders.i.this;
                        View view = iVar.M;
                        InteractiveDurationView interactiveDurationView = iVar.P;
                        DurationView durationView = iVar.O;
                        int width = iVar.itemView.getWidth();
                        int height = iVar.itemView.getHeight();
                        boolean z5 = z;
                        if (z5) {
                            VideoAttachment videoAttachment2 = videoAttachment;
                            PendingVideoAttachment pendingVideoAttachment = videoAttachment2 instanceof PendingVideoAttachmentWrapper ? ((PendingVideoAttachmentWrapper) videoAttachment2).p : (PendingVideoAttachment) videoAttachment2;
                            int i3 = pendingVideoAttachment.s;
                            height = pendingVideoAttachment.t;
                            width = i3;
                        } else if (width == 0 || height == 0) {
                            width = ((VideoAttachment) iVar.E).getWidth();
                            height = ((VideoAttachment) iVar.E).getHeight();
                        }
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (iVar.g0 ? interactiveDurationView.getLayoutParams() : durationView.getLayoutParams());
                        if (iVar.g0) {
                            if (width <= iah0.a(160)) {
                                interactiveDurationView.setTextDescriptionVisible(false);
                            } else {
                                interactiveDurationView.setTextDescriptionVisible(true);
                            }
                            if (width <= iah0.a(120)) {
                                interactiveDurationView.setDurationVisible(false);
                            } else {
                                interactiveDurationView.setDurationVisible(true);
                            }
                            float f = 45;
                            if (width <= iah0.a(f) || height <= iah0.a(f)) {
                                interactiveDurationView.setVisibility(8);
                            } else {
                                interactiveDurationView.setVisibility(0);
                            }
                        }
                        boolean z6 = z2;
                        if (!z6) {
                            WeakHashMap weakHashMap = j6r0.a;
                            if (width < iah0.a(140.0f) || height < iah0.a(140.0f)) {
                                iVar.X = false;
                                view.setVisibility(8);
                                layoutParams.setMargins(0, 0, iah0.a(4.0f), iah0.a(4.0f));
                                durationView.setPlayIconVisibility(true);
                                if (width < iah0.a(135.0f)) {
                                    durationView.setPadding(iah0.a(2.0f), iah0.a(2.0f), iah0.a(2.0f), iah0.a(2.0f));
                                    z4 = false;
                                    videoFile2 = videoFile;
                                    if (videoFile2.w8()) {
                                    }
                                    if (!z4) {
                                    }
                                    durationView.setText(m);
                                    interactiveDurationView.setDurationText(gpt0.m(interactiveDurationView.getContext(), videoFile2, true, false));
                                    return s3q0.a;
                                }
                                durationView.setPadding(iah0.a(2.0f), iah0.a(2.0f), iah0.a(5.0f), iah0.a(2.0f));
                                z4 = true;
                                videoFile2 = videoFile;
                                if (videoFile2.w8()) {
                                    m = gpt0.m(durationView.getContext(), videoFile2, false, false);
                                } else if (z6) {
                                    m = gpt0.m(durationView.getContext(), videoFile2, true, false);
                                } else {
                                    Context context = durationView.getContext();
                                    gpt0 gpt0Var = gpt0.a;
                                    m = gpt0.m(context, videoFile2, width >= iah0.a(100.0f), false);
                                }
                                if (!z4) {
                                    m = "";
                                }
                                durationView.setText(m);
                                interactiveDurationView.setDurationText(gpt0.m(interactiveDurationView.getContext(), videoFile2, true, false));
                                return s3q0.a;
                            }
                        }
                        WeakHashMap weakHashMap2 = j6r0.a;
                        layoutParams.setMargins(0, 0, iah0.a(8.0f), iah0.a(8.0f));
                        durationView.setPadding(iah0.a(6.0f), iah0.a(2.0f), iah0.a(6.0f), iah0.a(2.0f));
                        durationView.setPlayIconVisibility(false);
                        if (!z5) {
                            boolean z7 = !iVar.Z && iVar.X;
                            iVar.X = z7;
                            view.setVisibility(z7 ? 0 : 8);
                        }
                        z4 = true;
                        videoFile2 = videoFile;
                        if (videoFile2.w8()) {
                        }
                        if (!z4) {
                        }
                        durationView.setText(m);
                        interactiveDurationView.setDurationText(gpt0.m(interactiveDurationView.getContext(), videoFile2, true, false));
                        return s3q0.a;
                    }
                });
                boolean z4 = this.Z && !c;
                int i3 = (z4 || this.g0) ? i : 0;
                DurationView durationView = this.O;
                durationView.setVisibility(i3);
                this.P.setVisibility((z4 || !this.g0) ? i : 0);
                durationView.setBackgroundResource(!videoFile.x0() ? R.drawable.bg_video_live : R.drawable.bg_video_duration_label_old);
                frescoImageView.setIgnoreTrafficSaverPredicate(new oqh0(this, 19));
                frescoImageView.setLocalImage((List<? extends fxj0>) null);
                frescoImageView.setRemoteImage((List<? extends fxj0>) e7(videoAttachment));
                if (z) {
                    frescoImageView.setLocalImage((List<? extends fxj0>) (videoAttachment instanceof PendingVideoAttachmentWrapper ? ((PendingVideoAttachmentWrapper) videoAttachment).p : (PendingVideoAttachment) videoAttachment).k.getImage().Fb());
                }
                frescoImageView.setScaleType(!z ? ScaleType.FIT_CENTER : this.e0);
                this.Q.setBackgroundColor(!z ? -16777216 : 0);
                this.M.setBackgroundResource(!videoFile.w8() ? R.drawable.youtube_logo : R.drawable.ic_attachment_video_play);
                h7(z2);
            }
        }
        j7(videoFile);
        awt0.t(this.itemView, new gzs() { // from class: xsna.ugt0
            /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
            @Override // xsna.gzs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean z42;
                VideoFile videoFile2;
                String m;
                com.vk.newsfeed.common.recycler.holders.i iVar = com.vk.newsfeed.common.recycler.holders.i.this;
                View view = iVar.M;
                InteractiveDurationView interactiveDurationView = iVar.P;
                DurationView durationView2 = iVar.O;
                int width = iVar.itemView.getWidth();
                int height = iVar.itemView.getHeight();
                boolean z5 = z;
                if (z5) {
                    VideoAttachment videoAttachment2 = videoAttachment;
                    PendingVideoAttachment pendingVideoAttachment = videoAttachment2 instanceof PendingVideoAttachmentWrapper ? ((PendingVideoAttachmentWrapper) videoAttachment2).p : (PendingVideoAttachment) videoAttachment2;
                    int i32 = pendingVideoAttachment.s;
                    height = pendingVideoAttachment.t;
                    width = i32;
                } else if (width == 0 || height == 0) {
                    width = ((VideoAttachment) iVar.E).getWidth();
                    height = ((VideoAttachment) iVar.E).getHeight();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (iVar.g0 ? interactiveDurationView.getLayoutParams() : durationView2.getLayoutParams());
                if (iVar.g0) {
                    if (width <= iah0.a(160)) {
                        interactiveDurationView.setTextDescriptionVisible(false);
                    } else {
                        interactiveDurationView.setTextDescriptionVisible(true);
                    }
                    if (width <= iah0.a(120)) {
                        interactiveDurationView.setDurationVisible(false);
                    } else {
                        interactiveDurationView.setDurationVisible(true);
                    }
                    float f = 45;
                    if (width <= iah0.a(f) || height <= iah0.a(f)) {
                        interactiveDurationView.setVisibility(8);
                    } else {
                        interactiveDurationView.setVisibility(0);
                    }
                }
                boolean z6 = z2;
                if (!z6) {
                    WeakHashMap weakHashMap = j6r0.a;
                    if (width < iah0.a(140.0f) || height < iah0.a(140.0f)) {
                        iVar.X = false;
                        view.setVisibility(8);
                        layoutParams.setMargins(0, 0, iah0.a(4.0f), iah0.a(4.0f));
                        durationView2.setPlayIconVisibility(true);
                        if (width < iah0.a(135.0f)) {
                            durationView2.setPadding(iah0.a(2.0f), iah0.a(2.0f), iah0.a(2.0f), iah0.a(2.0f));
                            z42 = false;
                            videoFile2 = videoFile;
                            if (videoFile2.w8()) {
                            }
                            if (!z42) {
                            }
                            durationView2.setText(m);
                            interactiveDurationView.setDurationText(gpt0.m(interactiveDurationView.getContext(), videoFile2, true, false));
                            return s3q0.a;
                        }
                        durationView2.setPadding(iah0.a(2.0f), iah0.a(2.0f), iah0.a(5.0f), iah0.a(2.0f));
                        z42 = true;
                        videoFile2 = videoFile;
                        if (videoFile2.w8()) {
                            m = gpt0.m(durationView2.getContext(), videoFile2, false, false);
                        } else if (z6) {
                            m = gpt0.m(durationView2.getContext(), videoFile2, true, false);
                        } else {
                            Context context = durationView2.getContext();
                            gpt0 gpt0Var = gpt0.a;
                            m = gpt0.m(context, videoFile2, width >= iah0.a(100.0f), false);
                        }
                        if (!z42) {
                            m = "";
                        }
                        durationView2.setText(m);
                        interactiveDurationView.setDurationText(gpt0.m(interactiveDurationView.getContext(), videoFile2, true, false));
                        return s3q0.a;
                    }
                }
                WeakHashMap weakHashMap2 = j6r0.a;
                layoutParams.setMargins(0, 0, iah0.a(8.0f), iah0.a(8.0f));
                durationView2.setPadding(iah0.a(6.0f), iah0.a(2.0f), iah0.a(6.0f), iah0.a(2.0f));
                durationView2.setPlayIconVisibility(false);
                if (!z5) {
                    boolean z7 = !iVar.Z && iVar.X;
                    iVar.X = z7;
                    view.setVisibility(z7 ? 0 : 8);
                }
                z42 = true;
                videoFile2 = videoFile;
                if (videoFile2.w8()) {
                }
                if (!z42) {
                }
                durationView2.setText(m);
                interactiveDurationView.setDurationText(gpt0.m(interactiveDurationView.getContext(), videoFile2, true, false));
                return s3q0.a;
            }
        });
        if (this.Z) {
        }
        if (z4) {
        }
        DurationView durationView2 = this.O;
        durationView2.setVisibility(i3);
        this.P.setVisibility((z4 || !this.g0) ? i : 0);
        durationView2.setBackgroundResource(!videoFile.x0() ? R.drawable.bg_video_live : R.drawable.bg_video_duration_label_old);
        frescoImageView.setIgnoreTrafficSaverPredicate(new oqh0(this, 19));
        frescoImageView.setLocalImage((List<? extends fxj0>) null);
        frescoImageView.setRemoteImage((List<? extends fxj0>) e7(videoAttachment));
        if (z) {
        }
        frescoImageView.setScaleType(!z ? ScaleType.FIT_CENTER : this.e0);
        this.Q.setBackgroundColor(!z ? -16777216 : 0);
        this.M.setBackgroundResource(!videoFile.w8() ? R.drawable.youtube_logo : R.drawable.ic_attachment_video_play);
        h7(z2);
    }

    @Override // xsna.fi, xsna.io2
    public final void e0() {
        d3m.e(this.Q, (r15 & 1) != 0 ? 300L : 50L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
    }

    @Override // xsna.fi
    @NonNull
    public final View f7() {
        N n = this.E;
        return fxc0.B().c(n != 0 ? ((VideoAttachment) n).k : null) ? this.R : this.N;
    }

    @Override // xsna.fi, xsna.io2
    @NonNull
    public final VideoResizer.VideoFitType getContentScaleType() {
        return a.c[this.e0.ordinal()] != 1 ? VideoResizer.VideoFitType.CROP : VideoResizer.VideoFitType.FIT;
    }

    public final void h7(boolean z) {
        tps0 tps0Var = this.c0;
        boolean z2 = tps0Var instanceof tps0.a;
        RatioFrameLayout ratioFrameLayout = this.Q;
        if (z2) {
            tps0.a aVar = (tps0.a) tps0Var;
            if (z) {
                bwt0.m0(aVar.a, aVar.b, ratioFrameLayout);
                ratioFrameLayout.setOrientation(aVar.d);
                FontFamily fontFamily = FontFamily.BOLD;
                Float valueOf = Float.valueOf(16.0f);
                TextView textView = this.L;
                com.vk.typography.b.k(textView, fontFamily, valueOf, 4);
                com.vk.typography.b.k(this.K, FontFamily.REGULAR, Float.valueOf(14.0f), 4);
                dhr0.a.m0(textView, R.attr.vk_ui_text_primary);
                bwt0.d(ratioFrameLayout, this.d0, true, true);
                Float f = aVar.c;
                ratioFrameLayout.setRatio(f != null ? f.floatValue() : 0.5625f);
                Integer num = aVar.f;
                if (num != null) {
                    ratioFrameLayout.setBackground(m33.a(num.intValue(), this.itemView.getContext()));
                }
                Integer num2 = aVar.g;
                if (num2 != null) {
                    ratioFrameLayout.setForeground(m33.a(num2.intValue(), this.itemView.getContext()));
                    return;
                }
                return;
            }
        }
        ratioFrameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ratioFrameLayout.setOrientation(0);
        ratioFrameLayout.setRatio(z ? 0.5625f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.fi, xsna.io2
    public final float i0() {
        return this.d0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void i7(VideoFile videoFile) {
        DonutTeaserView.a c0724a;
        this.N.setVisibility(8);
        this.R.setVisibility(8);
        this.O.setVisibility(8);
        DonutTeaserView donutTeaserView = this.S;
        donutTeaserView.setVisibility(0);
        w3o w3oVar = (w3o) this.n0.getValue();
        cpo0 cpo0Var = new cpo0(3, this, videoFile);
        w3oVar.getClass();
        VideoRestriction O = videoFile.O();
        if (O == null) {
            return;
        }
        String str = O.c;
        donutTeaserView.setCover(new DonutTeaserView.b.a(O.d ? ixj0.n(videoFile.getImage().b) : null, new nhs(new jwx(2, 8))));
        RestrictionButton restrictionButton = O.e;
        if (restrictionButton != null) {
            String str2 = restrictionButton.c;
            DonutPriceTemplate parse = ((Boolean) w3oVar.b.getValue()).booleanValue() ? w3oVar.a.parse(str2) : null;
            CharSequence charSequence = str2;
            if (parse != null) {
                charSequence = y1o.b(parse, donutTeaserView.getContext());
            }
            c0724a = new DonutTeaserView.a.b(str, charSequence, new hc1(10, restrictionButton, cpo0Var));
        } else {
            c0724a = new DonutTeaserView.a.C0724a(str);
        }
        donutTeaserView.setContent(c0724a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    public final void j7(VideoFile videoFile) {
        boolean z = this.p0;
        View view = this.O;
        if (z) {
            this.S.setVisibility(8);
            this.N.setVisibility(0);
            view.setVisibility(0);
        }
        bpn0 bpn0Var = VideoOverlayView.I;
        ghn0 ghn0Var = new ghn0(this, 15);
        kyq0 kyq0Var = new kyq0(this, 7);
        if (this.g0) {
            view = this.P;
        }
        View view2 = view;
        boolean z2 = this.h0;
        boolean c = fxc0.B().c(videoFile);
        fyd0 fyd0Var = new fyd0(videoFile, 25);
        rgt0 rgt0Var = new rgt0(0, this, videoFile);
        com.vk.libvideo.design.view.overlay.b a2 = videoFile.O() != null ? ((a390) this.k0.getValue()).a(videoFile.O()) : null;
        boolean z3 = videoFile.d8() || videoFile.z0();
        VideoPipStateHolder.a.getClass();
        yg5 c2 = VideoPipStateHolder.c();
        boolean equals = c2 != null ? c2.A().a1().equals(videoFile.a1()) : false;
        Object obj = this.j0;
        Objects.requireNonNull(obj);
        VideoOverlayView.b.a(new VideoOverlayView.a(this.N, this.R, ghn0Var, kyq0Var, view2, z2, c, fyd0Var, rgt0Var, a2, z3, equals, new uyq0(obj, 6), (i1t0) this.l0.getValue()));
    }

    public final String k7() {
        PostInteract postInteract;
        String str = this.v;
        return (str != null || (postInteract = ((VideoAttachment) this.E).g) == null) ? str : postInteract.h;
    }

    public final void o7() {
        e6o e6oVar = this.b0;
        if (e6oVar != null) {
            this.itemView.setOnClickListener(e6oVar);
        } else {
            this.itemView.setOnClickListener(this.a0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i;
        Context context = view.getContext();
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        VideoSimpleHolderUiDto videoSimpleHolderUiDto = (VideoSimpleHolderUiDto) this.C;
        if (videoSimpleHolderUiDto != null) {
            u1c0 J0 = J0();
            i = J0 != null ? J0.k : -1;
            VideoFile videoFile = videoSimpleHolderUiDto.k;
            final String str = videoSimpleHolderUiDto.n;
            final VideoAttachment videoAttachment = videoSimpleHolderUiDto.j;
            final NewsEntry newsEntry = videoSimpleHolderUiDto.i;
            if (z) {
                Activity activity = (Activity) context;
                if (videoFile.toString().equals(activity.getIntent().getStringExtra("from_video"))) {
                    activity.finish();
                    return;
                }
            }
            if (view.getId() == R.id.attach_title || view.getId() == R.id.attach_subtitle) {
                pdv0.a a2 = vtk0.c().a(videoFile);
                a2.J(str);
                a2.B(k7());
                a2.k(context);
                return;
            }
            if (videoFile.Z9() && !(videoFile instanceof MusicVideoFile) && !hd60.a().x0(videoFile)) {
                cvk.u(gpt0.n(PlayerError.ERROR_CONTENT_RESTRICTED, false), false);
                return;
            }
            if (z) {
                if (videoFile.isEmpty()) {
                    final Activity activity2 = (Activity) context;
                    final int i2 = i;
                    w1s0.g(activity2, videoFile.I0(), videoFile.o0(), videoFile.C1(), videoFile.C2(), true, false, new izs() { // from class: xsna.tgt0
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            VideoFile videoFile2;
                            VideoFile videoFile3 = (VideoFile) obj;
                            com.vk.newsfeed.common.recycler.holders.i iVar = com.vk.newsfeed.common.recycler.holders.i.this;
                            VideoAttachment videoAttachment2 = (VideoAttachment) iVar.E;
                            if (videoAttachment2 != null && videoFile3 != null) {
                                videoAttachment2.Ob(videoFile3);
                            }
                            Activity activity3 = activity2;
                            NewsEntry newsEntry2 = newsEntry;
                            VideoAttachment videoAttachment3 = videoAttachment;
                            int i3 = i2;
                            String str2 = str;
                            if (videoFile3 != null) {
                                iVar.r7(activity3, newsEntry2, videoAttachment3, videoFile3, i3, str2);
                            } else if (videoAttachment2 != null && (videoFile2 = videoAttachment2.k) != null) {
                                iVar.r7(activity3, newsEntry2, videoAttachment3, videoFile2, i3, str2);
                            }
                            return s3q0.a;
                        }
                    }, 128);
                    return;
                } else {
                    r7((Activity) context, newsEntry, videoAttachment, videoFile, i, str);
                    PostInteract postInteract = videoAttachment.g;
                    if (postInteract != null) {
                        postInteract.zb(PostInteract.Type.video_start);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        final VideoAttachment videoAttachment2 = (VideoAttachment) this.E;
        VideoFile videoFile2 = videoAttachment2.k;
        if (videoFile2 == null) {
            L.G("empty video " + videoAttachment2.k.toString());
            return;
        }
        u1c0 J02 = J0();
        i = J02 != null ? J02.k : -1;
        if (z) {
            Activity activity3 = (Activity) context;
            if (videoFile2.toString().equals(activity3.getIntent().getStringExtra("from_video"))) {
                activity3.finish();
                return;
            }
        }
        if (view.getId() == R.id.attach_title || view.getId() == R.id.attach_subtitle) {
            pdv0.a a3 = vtk0.c().a(videoFile2);
            a3.J(videoAttachment2.l);
            a3.B(k7());
            a3.k(context);
            return;
        }
        if (videoFile2.Z9() && !(videoFile2 instanceof MusicVideoFile) && !hd60.a().x0(videoFile2)) {
            cvk.u(gpt0.n(PlayerError.ERROR_CONTENT_RESTRICTED, false), false);
            return;
        }
        if (z) {
            if (videoFile2.isEmpty()) {
                final Activity activity4 = (Activity) context;
                final NewsEntry t6 = t6();
                final String str2 = videoAttachment2.l;
                final int i3 = i;
                w1s0.g(activity4, videoFile2.I0(), videoFile2.o0(), videoFile2.C1(), videoFile2.C2(), true, false, new izs() { // from class: xsna.tgt0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VideoFile videoFile22;
                        VideoFile videoFile3 = (VideoFile) obj;
                        com.vk.newsfeed.common.recycler.holders.i iVar = com.vk.newsfeed.common.recycler.holders.i.this;
                        VideoAttachment videoAttachment22 = (VideoAttachment) iVar.E;
                        if (videoAttachment22 != null && videoFile3 != null) {
                            videoAttachment22.Ob(videoFile3);
                        }
                        Activity activity32 = activity4;
                        NewsEntry newsEntry2 = t6;
                        VideoAttachment videoAttachment3 = videoAttachment2;
                        int i32 = i3;
                        String str22 = str2;
                        if (videoFile3 != null) {
                            iVar.r7(activity32, newsEntry2, videoAttachment3, videoFile3, i32, str22);
                        } else if (videoAttachment22 != null && (videoFile22 = videoAttachment22.k) != null) {
                            iVar.r7(activity32, newsEntry2, videoAttachment3, videoFile22, i32, str22);
                        }
                        return s3q0.a;
                    }
                }, 128);
                return;
            }
            r7((Activity) context, t6(), videoAttachment2, videoFile2, i, videoAttachment2.l);
            PostInteract postInteract2 = videoAttachment2.g;
            if (postInteract2 != null) {
                postInteract2.zb(PostInteract.Type.video_start);
            }
        }
    }

    public final void p7(Activity activity, NewsEntry newsEntry, VideoAttachment videoAttachment, int i, String str) {
        ShitAttachment shitAttachment = videoAttachment.h;
        BaseVideoAutoPlayHolder.ShittyAdsDataProvider shittyAdsDataProvider = shitAttachment == null ? null : new BaseVideoAutoPlayHolder.ShittyAdsDataProvider(shitAttachment, i);
        String str2 = this.u;
        if (str2 == null) {
            str2 = str;
        }
        if (MobileOfficialAppsCoreNavStat$EventScreen.FAVE.name().equals(str2)) {
            qrq.a(newsEntry, videoAttachment);
        }
        gd60 a2 = hd60.a();
        VideoFile videoFile = videoAttachment.k;
        a2.A0(activity, videoFile, videoAttachment.l, shittyAdsDataProvider, videoAttachment.m, videoAttachment.o, videoFile.H6(), null);
    }

    public final void r7(Activity activity, NewsEntry newsEntry, VideoAttachment videoAttachment, VideoFile videoFile, int i, String str) {
        if (videoFile.isExternal() || !videoFile.T3()) {
            p7(activity, newsEntry, videoAttachment, i, str);
            return;
        }
        if (videoAttachment.i == null) {
            videoAttachment.Ob(videoFile);
        }
        yg5 yg5Var = videoAttachment.i;
        if (yg5Var == null || !yg5Var.A().T3()) {
            p7(activity, newsEntry, videoAttachment, i, str);
            return;
        }
        if (activity.isFinishing()) {
            return;
        }
        VideoFile videoFile2 = videoAttachment.k;
        if (videoFile2.r() == null || videoFile2.r().isEmpty()) {
            videoFile2.setTrackCode(k7());
        }
        if (g620.f().d(videoFile2)) {
            g620.f().a().g(activity, Collections.singletonList(new ClipFeedTab.SingleClip(g620.f().e0().c(videoFile2), null, null, true)), this, null, null, null, null, false, null);
        } else if (!videoAttachment.k.z0() && !videoAttachment.k.q0() && !videoAttachment.k.x0()) {
            yg5 yg5Var2 = videoAttachment.i;
            PostInteract postInteract = videoAttachment.g;
            boolean z = postInteract != null && postInteract.g == null;
            if (yg5Var2 == null) {
                return;
            }
            VideoFile A = yg5Var2.A();
            if (!z || videoFile2.p0() || videoFile2.e2() || !gpt0.c(activity)) {
                fxc0.B().Y().l(activity, A, this, false, null, k7(), null, null, postInteract != null ? postInteract.b : null);
            } else {
                fxc0.B().Y().i(activity, A, new VideoFeedDialogParams.Discover(postInteract.b, this.v));
            }
        } else if (videoAttachment.k.A1() && g620.f().getExperiments().n()) {
            g620.f().a().f(this.itemView.getContext(), videoAttachment.k.I0(), Collections.singletonList(videoAttachment.k), this);
        } else {
            fxc0.B().Y().n(activity, videoAttachment.k, true, videoAttachment.l, null);
        }
        String str2 = this.u;
        if (str2 == null) {
            str2 = str;
        }
        if (MobileOfficialAppsCoreNavStat$EventScreen.FAVE.name().equals(str2)) {
            qrq.a(newsEntry, videoAttachment);
        }
    }

    public final void s7(boolean z) {
        this.X = z;
        this.M.setVisibility(z ? 0 : 8);
    }

    public i(ViewGroup viewGroup, boolean z) {
        this(viewGroup, z, new tps0.b());
    }

    public i(ViewGroup viewGroup, boolean z, tps0 tps0Var) {
        super(viewGroup);
        this.Y = true;
        this.Z = false;
        this.a0 = this;
        this.e0 = ScaleType.CENTER_CROP;
        this.f0 = null;
        this.g0 = false;
        this.h0 = true;
        i8c0 i8c0Var = new i8c0(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i0 = msy.a(lazyThreadSafetyMode, i8c0Var);
        this.j0 = msy.a(lazyThreadSafetyMode, new om60(15));
        this.k0 = msy.a(lazyThreadSafetyMode, new pm60(15));
        this.l0 = msy.a(lazyThreadSafetyMode, new k0m0(6));
        this.m0 = msy.a(lazyThreadSafetyMode, new wrl0(this, 20));
        this.n0 = msy.a(lazyThreadSafetyMode, new pvh0(this, 19));
        this.o0 = null;
        ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
        comFeatures.getClass();
        this.p0 = com.vk.toggle.b.A.a(comFeatures);
        this.q0 = Boolean.TRUE;
        this.O = (DurationView) this.itemView.findViewById(R.id.duration_view);
        this.P = (InteractiveDurationView) this.itemView.findViewById(R.id.interactive_duration);
        this.Q = (RatioFrameLayout) this.itemView.findViewById(R.id.video_wrap);
        this.K = (TextView) this.itemView.findViewById(R.id.attach_subtitle);
        FrescoImageView frescoImageView = (FrescoImageView) this.itemView.findViewById(R.id.video_preview);
        this.N = frescoImageView;
        this.L = (TextView) this.itemView.findViewById(R.id.attach_title);
        this.M = this.itemView.findViewById(R.id.video_play_icon);
        this.R = (VideoOverlayView) this.itemView.findViewById(R.id.attach_video_overlay);
        this.S = (DonutTeaserView) this.itemView.findViewById(R.id.attach_video_donut_teaser);
        this.T = (VideoRestrictionView) this.itemView.findViewById(R.id.media_deprecated_restriction_view);
        this.U = (Space) this.itemView.findViewById(R.id.space);
        o7();
        frescoImageView.setScaleType(this.e0);
        frescoImageView.setPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        frescoImageView.setWithImageDownscale(z);
        if (!z) {
            frescoImageView.setFadeDuration(0);
        }
        if (tps0Var instanceof tps0.a) {
            int i = ((tps0.a) tps0Var).e;
            this.d0 = i;
            bwt0.d(this.itemView, i, true, true);
        }
        this.c0 = tps0Var;
    }
}
