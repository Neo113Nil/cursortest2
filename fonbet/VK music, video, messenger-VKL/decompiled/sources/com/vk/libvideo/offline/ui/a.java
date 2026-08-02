package com.vk.libvideo.offline.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.ExtendedDownloadState;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.offline.ui.VideoOfflineExtendedStateView;
import com.vk.movika.tools.controls.seekbar.s;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.e0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import one.video.exo.offline.DownloadInfo;
import xsna.an10;
import xsna.ao90;
import xsna.asu0;
import xsna.avj0;
import xsna.azn;
import xsna.bpn0;
import xsna.bwt0;
import xsna.bx80;
import xsna.bzs0;
import xsna.cqr0;
import xsna.e3m;
import xsna.f4m;
import xsna.fxc0;
import xsna.fys0;
import xsna.gib0;
import xsna.gpt0;
import xsna.h270;
import xsna.hg1;
import xsna.his0;
import xsna.iah0;
import xsna.j630;
import xsna.j8n0;
import xsna.jjc;
import xsna.k5f0;
import xsna.k5o;
import xsna.kar;
import xsna.l5o;
import xsna.m33;
import xsna.msy;
import xsna.nkt0;
import xsna.ozl;
import xsna.q01;
import xsna.s4s0;
import xsna.t970;
import xsna.tj2;
import xsna.uc;
import xsna.uho0;
import xsna.vhs0;
import xsna.vif0;
import xsna.wys0;
import xsna.xqf0;
import xsna.yg5;
import xsna.zyn;

/* compiled from: VideoOfflineExtendedViewHolder.kt */
/* loaded from: classes3.dex */
public final class a extends vif0<wys0> implements View.OnClickListener {
    public final Object A;
    public final ao90 B;
    public final bzs0 n;
    public final vhs0 o;
    public final C1244a p;
    public final kar q;
    public final h270 r;
    public wys0 s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: VideoOfflineExtendedViewHolder.kt */
    /* renamed from: com.vk.libvideo.offline.ui.a$a, reason: collision with other inner class name */
    public static final class C1244a {
        public final View a;
        public final TextView b;
        public final TextView c;
        public final VideoOfflineExtendedStateView d;
        public final VKImageView e;
        public final VideoOverlayView f;
        public final View g;
        public final DurationView h;
        public final TextView i;
        public final View j;
        public final LinearProgressIndicator k;
        public final ImageButton l;
        public final View m;

        public C1244a(View view) {
            this.a = view;
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (TextView) view.findViewById(R.id.size);
            this.d = (VideoOfflineExtendedStateView) view.findViewById(R.id.downloading_extended_state_view);
            this.e = (VKImageView) view.findViewById(R.id.photo);
            this.f = (VideoOverlayView) view.findViewById(R.id.overlay_view);
            this.g = view.findViewById(R.id.options);
            this.h = (DurationView) view.findViewById(R.id.duration);
            this.i = (TextView) view.findViewById(R.id.donut_chip);
            this.j = view.findViewById(R.id.audio_only_indicator);
            this.k = (LinearProgressIndicator) view.findViewById(R.id.video_progress);
            this.l = (ImageButton) view.findViewById(R.id.retry_button);
            this.m = view.findViewById(R.id.video_not_playable_overlay);
        }
    }

    /* compiled from: VideoOfflineExtendedViewHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExtendedDownloadState.values().length];
            try {
                iArr[ExtendedDownloadState.WAITING_NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExtendedDownloadState.WAITING_WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExtendedDownloadState.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ExtendedDownloadState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ExtendedDownloadState.QUEUED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ExtendedDownloadState.PAUSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a() {
        throw null;
    }

    public a(ViewGroup viewGroup, bzs0 bzs0Var, vhs0 vhs0Var) {
        super(viewGroup, R.layout.offline_item_view_extended, 0);
        this.n = bzs0Var;
        this.o = vhs0Var;
        View view = this.itemView;
        C1244a c1244a = new C1244a(view);
        this.p = c1244a;
        this.q = new kar(this.itemView.getContext());
        this.r = new h270(c1244a.e, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c1244a.k, false, null, null, 236);
        xqf0 xqf0Var = new xqf0(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, xqf0Var);
        this.u = msy.a(lazyThreadSafetyMode, new k5f0(12));
        this.v = msy.a(lazyThreadSafetyMode, new t970(18));
        this.w = msy.a(lazyThreadSafetyMode, new tj2(29));
        this.x = msy.a(lazyThreadSafetyMode, new j8n0(this, 16));
        this.y = msy.a(lazyThreadSafetyMode, new cqr0(this, 6));
        this.z = msy.a(lazyThreadSafetyMode, new uho0(this, 11));
        this.A = msy.a(lazyThreadSafetyMode, new avj0(this, 21));
        this.B = new ao90(this, 9);
        bpn0 bpn0Var = jjc.a;
        c1244a.l.setOnClickListener(new q01(this, 2));
        c1244a.g.setOnClickListener(new q01(this, 2));
        view.setOnClickListener(new q01(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(wys0 wys0Var) {
        azn a;
        wys0 wys0Var2 = wys0Var;
        VideoFileOld videoFileOld = wys0Var2.a;
        ExtendedDownloadState extendedDownloadState = wys0Var2.c;
        DownloadInfo downloadInfo = wys0Var2.b;
        long j = downloadInfo.d;
        String str = this.q.a(j).a;
        C1244a c1244a = this.p;
        TextView textView = c1244a.c;
        TextView textView2 = c1244a.b;
        if (extendedDownloadState == ExtendedDownloadState.COMPLETED) {
            textView.setVisibility(0);
            textView.setText(str);
            his0.v(textView, R.drawable.vk_icon_check_circle_12, 0);
        } else if (j > 0) {
            textView.setVisibility(0);
            textView.setText(h6(R.string.video_download_state_progress_size, Integer.valueOf(an10.b(downloadInfo.g)), str));
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            f4m.j(textView);
        }
        bwt0.p0(c1244a.m, j == 0);
        bwt0.p0(c1244a.l, extendedDownloadState == ExtendedDownloadState.FAILED);
        VideoOfflineExtendedStateView videoOfflineExtendedStateView = c1244a.d;
        switch (b.$EnumSwitchMapping$0[extendedDownloadState.ordinal()]) {
            case 1:
                videoOfflineExtendedStateView.setVisibility(0);
                videoOfflineExtendedStateView.setState(VideoOfflineExtendedStateView.State.NetworkAwaiting);
                break;
            case 2:
                videoOfflineExtendedStateView.setVisibility(0);
                videoOfflineExtendedStateView.setState(VideoOfflineExtendedStateView.State.WiFiAwaiting);
                break;
            case 3:
                f4m.j(videoOfflineExtendedStateView);
                break;
            case 4:
                videoOfflineExtendedStateView.setVisibility(0);
                videoOfflineExtendedStateView.setState(VideoOfflineExtendedStateView.State.Error);
                break;
            case 5:
                videoOfflineExtendedStateView.setVisibility(0);
                videoOfflineExtendedStateView.setState(VideoOfflineExtendedStateView.State.Queued);
                break;
            case 6:
                videoOfflineExtendedStateView.setVisibility(0);
                videoOfflineExtendedStateView.setState(VideoOfflineExtendedStateView.State.Paused);
                break;
            default:
                videoOfflineExtendedStateView.setVisibility(0);
                videoOfflineExtendedStateView.setState(VideoOfflineExtendedStateView.State.Downloading);
                break;
        }
        wys0 wys0Var3 = this.s;
        boolean equals = videoFileOld.equals(wys0Var3 != null ? wys0Var3.a : null);
        this.s = wys0Var2;
        if (equals) {
            return;
        }
        final Image image = ((wys0) this.m).a.I0;
        x o = fxc0.B().J().M1() ? this.n.o(image, ((wys0) this.m).a.r1()) : new v(new Callable() { // from class: xsna.xys0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj;
                qyn0 qyn0Var = new qyn0(5);
                Image image2 = Image.this;
                Iterator it = j5g.y0(image2.c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Boolean) qyn0Var.invoke(obj)).booleanValue()) {
                        break;
                    }
                }
                ImageSize imageSize = (ImageSize) obj;
                if (imageSize == null) {
                    for (Object obj2 : j5g.y0(image2.b)) {
                        if (((Boolean) qyn0Var.invoke(obj2)).booleanValue()) {
                            imageSize = (ImageSize) obj2;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return Uri.parse(imageSize.d.d);
            }
        });
        asu0 asu0Var = asu0.a;
        hg1.b(this.itemView, new e0(o.q(asu0Var.c()).m(asu0Var.d()), new j630(new gib0(this, 23), 23)).subscribe(new bx80(new s(this, 18), 16)));
        DurationView durationView = c1244a.h;
        durationView.setText(gpt0.m(durationView.getContext(), videoFileOld, true, false));
        textView2.setText(gpt0.v(videoFileOld));
        MusicVideoFile musicVideoFile = videoFileOld instanceof MusicVideoFile ? (MusicVideoFile) videoFileOld : null;
        if (musicVideoFile == null || !musicVideoFile.A1) {
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView2.getContext()), (Drawable) null);
            textView2.setCompoundDrawablePadding(iah0.a(4));
        }
        bwt0.p0(c1244a.j, false);
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        yg5 e = b.C1208b.a().e(videoFileOld, null);
        String a2 = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.OFFLINE);
        yg5.o0(e, a2, null, videoFileOld.W, false, 2);
        com.vk.libvideo.autoplay.a aVar = com.vk.libvideo.autoplay.a.t;
        h270 h270Var = this.r;
        h270Var.k(videoFileOld, e, aVar);
        h270Var.w(a2);
        TextView textView3 = c1244a.i;
        bwt0.p0(textView3, false);
        DonutVideoUiModel a3 = ((l5o) this.y.getValue()).a(nkt0.a(videoFileOld), DonutVideoCardSource.SMALL_CARD);
        if (a3 == null || (a = k5o.a(a3)) == null) {
            return;
        }
        bwt0.p0(textView3, true);
        textView3.setText(((zyn) this.A.getValue()).a(a, this.itemView.getContext(), this.B));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.itemView;
        vhs0 vhs0Var = this.o;
        if (view != view2) {
            C1244a c1244a = this.p;
            if (view == c1244a.g) {
                vhs0Var.invoke(((wys0) this.m).a);
                return;
            } else {
                if (view == c1244a.l) {
                    fxc0.B().s().D(((wys0) this.m).a);
                    return;
                }
                return;
            }
        }
        wys0 wys0Var = (wys0) this.m;
        boolean z = wys0Var.b.d > 0;
        boolean z2 = wys0Var.c == ExtendedDownloadState.COMPLETED;
        Activity h = e3m.h(view.getContext());
        if (h == null) {
            return;
        }
        if (z2) {
            q6(h);
        } else if (z) {
            new fys0.a(h, new s4s0(1, this, h)).I0(null);
        } else {
            vhs0Var.invoke(((wys0) this.m).a);
        }
    }

    public final void q6(Activity activity) {
        if (fxc0.B().J().z()) {
            uc.r(this.r, activity, true, null, null, null, null, 188);
        } else {
            uc.r(this.r, activity, false, null, null, null, null, 252);
        }
    }

    @Override // xsna.vif0
    @ozl
    public final void m6() {
    }
}
