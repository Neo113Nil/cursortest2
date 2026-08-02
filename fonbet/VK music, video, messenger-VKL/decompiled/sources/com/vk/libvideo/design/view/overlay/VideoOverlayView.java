package com.vk.libvideo.design.view.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.R$styleable;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.timer.LiveTimerView;
import com.vkontakte.android.R;
import defpackage.h0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.e1;
import io.reactivex.rxjava3.internal.operators.observable.z;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$LongRef;
import one.video.transform.TransformController;
import xsna.asp;
import xsna.ayo;
import xsna.b0u0;
import xsna.bpn0;
import xsna.bv1;
import xsna.bwt0;
import xsna.dbj0;
import xsna.dck0;
import xsna.dhr0;
import xsna.dqm0;
import xsna.epx;
import xsna.erh;
import xsna.eul0;
import xsna.f4m;
import xsna.f5h0;
import xsna.fnj;
import xsna.fyd0;
import xsna.gzs;
import xsna.ho8;
import xsna.i1t0;
import xsna.ia90;
import xsna.iah0;
import xsna.iut0;
import xsna.izs;
import xsna.j1t0;
import xsna.j41;
import xsna.jjc;
import xsna.jwx;
import xsna.k41;
import xsna.ksq0;
import xsna.l6n0;
import xsna.lyl0;
import xsna.mlf0;
import xsna.mqe0;
import xsna.msy;
import xsna.pj8;
import xsna.qoy;
import xsna.s3q0;
import xsna.sf3;
import xsna.t2l;
import xsna.t970;
import xsna.tcg0;
import xsna.tqf0;
import xsna.tvs0;
import xsna.uf3;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.v43;
import xsna.vpj0;
import xsna.vr6;
import xsna.wz;
import xsna.x1c0;
import xsna.x2j0;
import xsna.xk70;
import xsna.xz;
import xsna.zrp;

/* compiled from: VideoOverlayView.kt */
/* loaded from: classes2.dex */
public final class VideoOverlayView extends ConstraintLayout {
    public static final bpn0 I = new bpn0(new t970(19));
    public static final bpn0 J = new bpn0(new j1t0(0));
    public static final bpn0 K = new bpn0(new x1c0(14));
    public static final bpn0 L = new bpn0(new ia90(15));
    public static final bpn0 M = new bpn0(new dqm0(4));
    public static final bpn0 N = new bpn0(new xk70(12));
    public static final bpn0 O = new bpn0(new eul0(4));
    public final boolean A;
    public final boolean B;
    public final float C;
    public c D;
    public i1t0 E;
    public final boolean F;
    public final bpn0 G;
    public final boolean H;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final VideoRestrictionSize z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoOverlayView.kt */
    public static final class VideoRestrictionSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoRestrictionSize[] $VALUES;
        public static final VideoRestrictionSize MEDIUM;
        public static final VideoRestrictionSize SMALL;
        public static final VideoRestrictionSize UNDEFINED;

        static {
            VideoRestrictionSize videoRestrictionSize = new VideoRestrictionSize("SMALL", 0);
            SMALL = videoRestrictionSize;
            VideoRestrictionSize videoRestrictionSize2 = new VideoRestrictionSize("MEDIUM", 1);
            MEDIUM = videoRestrictionSize2;
            VideoRestrictionSize videoRestrictionSize3 = new VideoRestrictionSize("UNDEFINED", 2);
            UNDEFINED = videoRestrictionSize3;
            VideoRestrictionSize[] videoRestrictionSizeArr = {videoRestrictionSize, videoRestrictionSize2, videoRestrictionSize3};
            $VALUES = videoRestrictionSizeArr;
            $ENTRIES = new asp(videoRestrictionSizeArr);
        }

        public VideoRestrictionSize() {
            throw null;
        }

        public static VideoRestrictionSize valueOf(String str) {
            return (VideoRestrictionSize) Enum.valueOf(VideoRestrictionSize.class, str);
        }

        public static VideoRestrictionSize[] values() {
            return (VideoRestrictionSize[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoOverlayView.kt */
    public static final class a {
        public final View a;
        public final VideoOverlayView b;
        public final gzs<s3q0> c;
        public final izs<io.reactivex.rxjava3.disposables.c, s3q0> d;
        public final View e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final gzs<s3q0> j;
        public final gzs<com.vk.libvideo.design.view.overlay.a> k;
        public final com.vk.libvideo.design.view.overlay.b l;
        public final boolean m;
        public final boolean n;
        public final gzs<tcg0> o;
        public final i1t0 p;
        public final izs<com.vk.libvideo.design.view.overlay.b, c> q;

        public a() {
            throw null;
        }

        public a(View view, VideoOverlayView videoOverlayView, gzs gzsVar, izs izsVar, View view2, boolean z, boolean z2, gzs gzsVar2, gzs gzsVar3, com.vk.libvideo.design.view.overlay.b bVar, boolean z3, boolean z4, gzs gzsVar4, i1t0 i1t0Var) {
            this(view, videoOverlayView, gzsVar, izsVar, view2, false, z, z2, gzsVar2, gzsVar3, bVar, z3, z4, gzsVar4, i1t0Var, null, 65536);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && this.m == aVar.m && this.n == aVar.n && epx.f(this.o, aVar.o) && epx.f(this.p, aVar.p) && epx.f(this.q, aVar.q);
        }

        public final int hashCode() {
            int a = sf3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            izs<io.reactivex.rxjava3.disposables.c, s3q0> izsVar = this.d;
            int hashCode = (a + (izsVar == null ? 0 : izsVar.hashCode())) * 31;
            View view = this.e;
            int a2 = sf3.a(sf3.a(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (view == null ? 0 : view.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
            com.vk.libvideo.design.view.overlay.b bVar = this.l;
            return this.q.hashCode() + ((this.p.hashCode() + sf3.a(qoy.b(qoy.b((a2 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.m), 31, this.n), 31, this.o)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BindMaybeOverlaidParams(preview=");
            sb.append(this.a);
            sb.append(", overlay=");
            sb.append(this.b);
            sb.append(", bindPreview=");
            sb.append(this.c);
            sb.append(", assignSubscription=");
            sb.append(this.d);
            sb.append(", duration=");
            sb.append(this.e);
            sb.append(", previewInvisible=");
            sb.append(this.f);
            sb.append(", forceMinifiedRestriction=");
            sb.append(this.g);
            sb.append(", allowWatchRestricted=");
            sb.append(this.h);
            sb.append(", isRestricted=");
            sb.append(this.i);
            sb.append(", onConfirmed=");
            sb.append(this.j);
            sb.append(", provideOverlayImage=");
            sb.append(this.k);
            sb.append(", overlayRestrictionState=");
            sb.append(this.l);
            sb.append(", isDurationVisible=");
            sb.append(this.m);
            sb.append(", isUsedInPip=");
            sb.append(this.n);
            sb.append(", provideRestrictionConfirmedAction=");
            sb.append(this.o);
            sb.append(", videoOverlayToggleConfig=");
            sb.append(this.p);
            sb.append(", produceOverlayState=");
            return up.c(sb, this.q, ')');
        }

        public a(View view, VideoOverlayView videoOverlayView, gzs gzsVar, izs izsVar, View view2, final boolean z, boolean z2, boolean z3, final gzs gzsVar2, final gzs gzsVar3, com.vk.libvideo.design.view.overlay.b bVar, boolean z4, boolean z5, gzs gzsVar4, i1t0 i1t0Var, izs izsVar2, int i) {
            izsVar = (i & 8) != 0 ? null : izsVar;
            view2 = (i & 16) != 0 ? null : view2;
            z = (i & 64) != 0 ? false : z;
            final boolean z6 = (i & 128) != 0 ? true : z2;
            izs izsVar3 = (i & 65536) != 0 ? new izs() { // from class: xsna.k1t0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    com.vk.libvideo.design.view.overlay.b bVar2 = (com.vk.libvideo.design.view.overlay.b) obj;
                    bpn0 bpn0Var = VideoOverlayView.I;
                    com.vk.libvideo.design.view.overlay.a aVar = (com.vk.libvideo.design.view.overlay.a) gzs.this.invoke();
                    if (!z6) {
                        bVar2 = com.vk.libvideo.design.view.overlay.b.a(bVar2, 463);
                    }
                    boolean z7 = z;
                    gzs gzsVar5 = gzsVar2;
                    return z7 ? new VideoOverlayView.c.f(bVar2, aVar, gzsVar5) : new VideoOverlayView.c.i(bVar2, aVar, false, gzsVar5);
                }
            } : izsVar2;
            this.a = view;
            this.b = videoOverlayView;
            this.c = gzsVar;
            this.d = izsVar;
            this.e = view2;
            this.f = false;
            this.g = z;
            this.h = z6;
            this.i = z3;
            this.j = gzsVar2;
            this.k = gzsVar3;
            this.l = bVar;
            this.m = z4;
            this.n = z5;
            this.o = gzsVar4;
            this.p = i1t0Var;
            this.q = izsVar3;
        }
    }

    /* compiled from: VideoOverlayView.kt */
    public static final class b {

        /* compiled from: ViewExt.kt */
        public static final class a implements View.OnLayoutChangeListener {
            public final /* synthetic */ a b;
            public final /* synthetic */ c c;

            public a(a aVar, c cVar) {
                this.b = aVar;
                this.c = cVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                a aVar = this.b;
                aVar.b.Z4(aVar.p, this.c);
            }
        }

        public static void a(a aVar) {
            VideoOverlayView videoOverlayView = aVar.b;
            i1t0 i1t0Var = aVar.p;
            if (!videoOverlayView.E.a) {
                videoOverlayView.E = i1t0Var;
                videoOverlayView.requestLayout();
            }
            b(aVar);
        }

        public static final void b(a aVar) {
            c fVar;
            izs<io.reactivex.rxjava3.disposables.c, s3q0> izsVar = aVar.d;
            gzs<s3q0> gzsVar = aVar.c;
            i1t0 i1t0Var = aVar.p;
            com.vk.libvideo.design.view.overlay.b bVar = aVar.l;
            View view = aVar.e;
            View view2 = aVar.a;
            VideoOverlayView videoOverlayView = aVar.b;
            if (izsVar != null) {
                izsVar.invoke(null);
            }
            if (!aVar.i) {
                if (!aVar.n) {
                    if (view != null) {
                        bwt0.p0(view, aVar.m);
                    }
                    f4m.j(videoOverlayView);
                    view2.setVisibility(0);
                    gzsVar.invoke();
                    return;
                }
                videoOverlayView.setVisibility(0);
                bpn0 bpn0Var = VideoOverlayView.I;
                videoOverlayView.Z4(i1t0Var, new c.b(videoOverlayView.getContext().getString(R.string.video_pip_overlay), Integer.valueOf(R.drawable.vk_icon_picture_in_picture_56), Integer.valueOf(R.color.vk_gray_900)));
                if (view != null) {
                    bwt0.p0(view, false);
                }
                view2.setVisibility(0);
                gzsVar.invoke();
                return;
            }
            if (aVar.f) {
                view2.setVisibility(4);
            } else {
                f4m.j(view2);
            }
            videoOverlayView.setVisibility(0);
            if (view != null) {
                bwt0.p0(view, true ^ ((bVar == null || bVar.d) ? false : true));
            }
            if (bVar != null) {
                if (videoOverlayView.getShowRedesign()) {
                    fVar = aVar.q.invoke(bVar);
                } else {
                    bpn0 bpn0Var2 = VideoOverlayView.I;
                    com.vk.libvideo.design.view.overlay.a invoke = aVar.k.invoke();
                    boolean z = aVar.g;
                    boolean z2 = aVar.h;
                    gzs<s3q0> gzsVar2 = aVar.j;
                    if (!z2) {
                        bVar = com.vk.libvideo.design.view.overlay.b.a(bVar, 463);
                    }
                    fVar = z ? new c.f(bVar, invoke, gzsVar2) : new c.i(bVar, invoke, false, gzsVar2);
                }
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (videoOverlayView.isLaidOut()) {
                    videoOverlayView.Z4(i1t0Var, fVar);
                } else {
                    videoOverlayView.addOnLayoutChangeListener(new a(aVar, fVar));
                }
            }
            io.reactivex.rxjava3.disposables.c a2 = aVar.o.invoke().a(videoOverlayView, new l6n0(aVar, 17));
            if (izsVar != null) {
                izsVar.invoke(a2);
            }
        }

        public static jwx c() {
            return (jwx) VideoOverlayView.O.getValue();
        }
    }

    /* compiled from: VideoOverlayView.kt */
    public static abstract class c {

        /* compiled from: VideoOverlayView.kt */
        public static final class a extends c {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("EndLiveRedirect(titleText="), this.a, ')');
            }
        }

        /* compiled from: VideoOverlayView.kt */
        public static final class b extends c {
            public final String a;
            public final Integer b;
            public final Integer c;

            public b(String str, Integer num, Integer num2) {
                this.a = str;
                this.b = num;
                this.c = num2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.c;
                return hashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("IconWithTitle(title=");
                sb.append(this.a);
                sb.append(", iconRes=");
                sb.append(this.b);
                sb.append(", backgroundColorRes=");
                return uqi.b(sb, this.c, ')');
            }
        }

        /* compiled from: VideoOverlayView.kt */
        /* renamed from: com.vk.libvideo.design.view.overlay.VideoOverlayView$c$c, reason: collision with other inner class name */
        public static final class C1234c extends c {
            public final String a;
            public final fyd0 b;

            public C1234c(String str, fyd0 fyd0Var) {
                this.a = str;
                this.b = fyd0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1234c)) {
                    return false;
                }
                C1234c c1234c = (C1234c) obj;
                return epx.f(this.a, c1234c.a) && epx.f(this.b, c1234c.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "LiveUpcoming(titleText=" + this.a + ", onCoverClick=" + this.b + ')';
            }
        }

        /* compiled from: VideoOverlayView.kt */
        public static final class d extends c {
            public final long a;
            public final boolean b;
            public final boolean c;
            public final boolean d;
            public final com.vk.libvideo.design.view.video.a e;
            public final x2j0 f;

            public d(long j, boolean z, boolean z2, boolean z3, com.vk.libvideo.design.view.video.a aVar, x2j0 x2j0Var) {
                this.a = j;
                this.b = z;
                this.c = z2;
                this.d = z3;
                this.e = aVar;
                this.f = x2j0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + ((this.e.hashCode() + qoy.b(qoy.b(qoy.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
            }

            public final String toString() {
                return "LiveUpcomingTimer(time=" + this.a + ", isMinifiedState=" + this.b + ", liveNotify=" + this.c + ", followVisible=" + this.d + ", onSubscriptionClick=" + this.e + ", onCoverClick=" + this.f + ')';
            }
        }

        /* compiled from: VideoOverlayView.kt */
        public static final class e extends c {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -990454651;
            }

            public final String toString() {
                return "LiveWaiting";
            }
        }

        /* compiled from: VideoOverlayView.kt */
        public static final class f extends c {
            public final com.vk.libvideo.design.view.overlay.b a;
            public final com.vk.libvideo.design.view.overlay.a b;
            public final gzs<s3q0> c;

            public f(com.vk.libvideo.design.view.overlay.b bVar, com.vk.libvideo.design.view.overlay.a aVar, gzs<s3q0> gzsVar) {
                this.a = bVar;
                this.b = aVar;
                this.c = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                gzs<s3q0> gzsVar = this.c;
                return hashCode + (gzsVar == null ? 0 : gzsVar.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MinifiedRestriction(overlayRestrictionState=");
                sb.append(this.a);
                sb.append(", overlayImage=");
                sb.append(this.b);
                sb.append(", onConfirmed=");
                return uf3.d(sb, this.c, ')');
            }
        }

        /* compiled from: VideoOverlayView.kt */
        public static final class g extends c {
            public final String a;
            public final String b;
            public final izs<View, s3q0> c;

            /* JADX WARN: Multi-variable type inference failed */
            public g(String str, String str2, izs<? super View, s3q0> izsVar) {
                this.a = str;
                this.b = str2;
                this.c = izsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NotInterested(titleText=");
                sb.append(this.a);
                sb.append(", buttonText=");
                sb.append(this.b);
                sb.append(", onNotInterestedAction=");
                return up.c(sb, this.c, ')');
            }
        }

        /* compiled from: VideoOverlayView.kt */
        public static final class h extends c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                ((h) obj).getClass();
                return epx.f(null, null) && epx.f(null, null) && epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "NotRecommendOwner(titleText=" + ((String) null) + ", buttonText=" + ((String) null) + ", videoCancelNotRecommendOwnerAction=" + ((Object) null) + ')';
            }
        }

        /* compiled from: VideoOverlayView.kt */
        public static final class i extends c {
            public final com.vk.libvideo.design.view.overlay.b a;
            public final com.vk.libvideo.design.view.overlay.a b;
            public final boolean c;
            public final gzs<s3q0> d;

            public i(com.vk.libvideo.design.view.overlay.b bVar, com.vk.libvideo.design.view.overlay.a aVar, boolean z, gzs<s3q0> gzsVar) {
                this.a = bVar;
                this.b = aVar;
                this.c = z;
                this.d = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b) && this.c == iVar.c && epx.f(this.d, iVar.d);
            }

            public final int hashCode() {
                int b = qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
                gzs<s3q0> gzsVar = this.d;
                return b + (gzsVar == null ? 0 : gzsVar.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Restriction(overlayRestrictionState=");
                sb.append(this.a);
                sb.append(", overlayImage=");
                sb.append(this.b);
                sb.append(", showSubtitle=");
                sb.append(this.c);
                sb.append(", onConfirmed=");
                return uf3.d(sb, this.d, ')');
            }
        }

        /* compiled from: VideoOverlayView.kt */
        public static final class j extends c {
            public final com.vk.libvideo.design.view.overlay.b a;
            public final com.vk.libvideo.design.view.overlay.a b;
            public final Integer c;
            public final Integer d;

            public j(com.vk.libvideo.design.view.overlay.b bVar, com.vk.libvideo.design.view.overlay.a aVar, Integer num, Integer num2) {
                this.a = bVar;
                this.b = aVar;
                this.c = num;
                this.d = num2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c) && epx.f(this.d, jVar.d);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                Integer num = this.c;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.d;
                return hashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RestrictionWithoutButton(overlayRestrictionState=");
                sb.append(this.a);
                sb.append(", overlayImage=");
                sb.append(this.b);
                sb.append(", iconRes=");
                sb.append(this.c);
                sb.append(", titleMarginTop=");
                return uqi.b(sb, this.d, ')');
            }
        }

        /* compiled from: VideoOverlayView.kt */
        public static final class k extends c {
            public final com.vk.libvideo.design.view.overlay.b a;

            public k(com.vk.libvideo.design.view.overlay.b bVar) {
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "TextOnly(overlayRestrictionState=" + this.a + ')';
            }
        }
    }

    /* compiled from: VideoOverlayView.kt */
    public static final class d {
        public final float a;

        public d(float f) {
            this.a = f;
        }
    }

    /* compiled from: VideoOverlayView.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransformController.ScaleType.values().length];
            try {
                iArr[TransformController.ScaleType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 12);
    }

    public static VKImageView P4(VideoOverlayView videoOverlayView) {
        videoOverlayView.f5();
        VKImageView vKImageView = (VKImageView) videoOverlayView.findViewById(R.id.video_overlay_holder_image);
        videoOverlayView.setupCover(vKImageView);
        return vKImageView;
    }

    public static VkSimpleButton Q4(VideoOverlayView videoOverlayView) {
        videoOverlayView.f5();
        VkSimpleButton vkSimpleButton = (VkSimpleButton) videoOverlayView.findViewById(R.id.video_overlay_holder_button);
        videoOverlayView.setupButton(vkSimpleButton);
        return vkSimpleButton;
    }

    public static TextView T4(VideoOverlayView videoOverlayView) {
        videoOverlayView.f5();
        TextView textView = (TextView) videoOverlayView.findViewById(R.id.video_overlay_holder_subtitle);
        videoOverlayView.setupSubtitle(textView);
        return textView;
    }

    public static TextView U4(VideoOverlayView videoOverlayView) {
        videoOverlayView.f5();
        TextView textView = (TextView) videoOverlayView.findViewById(R.id.video_overlay_holder_title);
        videoOverlayView.setupTitle(textView);
        return textView;
    }

    public static int d5(View view) {
        return view.getMeasuredWidth() / 2;
    }

    public static int g5(int i, boolean z) {
        Context y;
        if (z) {
            dhr0.a.getClass();
            y = dhr0.s();
        } else {
            dhr0.a.getClass();
            y = dhr0.y();
        }
        dhr0.a.getClass();
        return dhr0.f.a(i, y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkSimpleButton getButton() {
        return (VkSimpleButton) this.y.getValue();
    }

    private final int getHalfDefaultMargin() {
        return ((Number) this.G.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VKImageView getIcon() {
        return (VKImageView) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getSubtitle() {
        return (TextView) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTitle() {
        return (TextView) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LiveUpcomingView getUpcomingView() {
        return (LiveUpcomingView) this.w.getValue();
    }

    public static void l5(View view, boolean z) {
        bwt0.p0(view, z);
        view.setEnabled(z);
    }

    private final void setupButton(VkSimpleButton vkSimpleButton) {
        f4m.t(iah0.a(getShowRedesign() ? 12 : 20), vkSimpleButton);
        vkSimpleButton.setBackgroundTint(R.attr.vk_ui_background_secondary_alpha);
    }

    private final void setupCover(VKImageView vKImageView) {
        vKImageView.setCornerRadius(this.C);
        vKImageView.setPlaceholderColor(getShowRedesign() ? g5(R.attr.vk_ui_image_placeholder, this.A) : dhr0.t.c(R.attr.vk_ui_image_placeholder));
    }

    private final void setupSubtitle(TextView textView) {
        int n5 = n5();
        f4m.l(n5, n5, textView);
    }

    private final void setupTitle(TextView textView) {
        textView.setMaxLines(getShowRedesign() ? 3 : 2);
        boolean showRedesign = getShowRedesign();
        int i = R.style.VkUiTypography_Headline1;
        if (showRedesign) {
            VideoRestrictionSize videoRestrictionSize = VideoRestrictionSize.SMALL;
            VideoRestrictionSize videoRestrictionSize2 = this.z;
            if (videoRestrictionSize2 == videoRestrictionSize || (this.H && videoRestrictionSize2 == VideoRestrictionSize.MEDIUM)) {
                i = R.style.VkUiTypography_Caption1;
            } else if (videoRestrictionSize2 != VideoRestrictionSize.MEDIUM) {
                i = R.style.VkUiTypography_Headline2;
            }
        }
        textView.setTextAppearance(i);
        int n5 = n5();
        f4m.l(n5, n5, textView);
        if (getShowRedesign()) {
            textView.setMaxWidth(iah0.a(400));
        }
    }

    public final void V4(izs<? super TextView, s3q0> izsVar) {
        izsVar.invoke(getButton());
    }

    public final void X4(izs<? super VKImageView, s3q0> izsVar) {
        izsVar.invoke(getIcon());
    }

    public final void Y4(izs<? super TextView, s3q0> izsVar) {
        izsVar.invoke(getTitle());
    }

    public final void Z4(i1t0 i1t0Var, c cVar) {
        if (!this.E.a) {
            this.E = i1t0Var;
            requestLayout();
        }
        if (epx.f(this.D, cVar)) {
            return;
        }
        this.D = cVar;
        setTag(cVar);
        if (getChildCount() != 0) {
            bwt0.p0(getUpcomingView(), false);
            setBackgroundColor(0);
        }
        setOnClickListener(null);
        setClickable(false);
        boolean z = cVar instanceof c.i;
        if (!z) {
            l5(getSubtitle(), false);
        }
        boolean z2 = cVar instanceof c.b;
        if (z2) {
            c.b bVar = (c.b) cVar;
            l5(getButton(), false);
            TextView title = getTitle();
            l5(title, true);
            title.setTextColor(title.getContext().getColor(R.color.vk_white));
            title.setText(bVar.a);
            VKImageView icon = getIcon();
            Integer num = bVar.b;
            bwt0.p0(icon, num != null);
            if (num != null) {
                int intValue = num.intValue();
                getIcon().setColorFilter(new PorterDuffColorFilter(getContext().getColor(R.color.vk_white), PorterDuff.Mode.SRC_IN));
                getIcon().setImageResource(intValue);
            }
            VKImageView cover = getCover();
            cover.clear();
            cover.setPostprocessor(null);
            Integer num2 = bVar.c;
            if (num2 != null) {
                cover.setPlaceholderColor(cover.getContext().getColor(num2.intValue()));
            }
        } else {
            boolean z3 = cVar instanceof c.j;
            boolean z4 = this.A;
            if (z3) {
                c.j jVar = (c.j) cVar;
                com.vk.libvideo.design.view.overlay.a aVar = jVar.b;
                l5(getButton(), false);
                boolean z5 = aVar.a;
                com.vk.libvideo.design.view.overlay.b bVar2 = jVar.a;
                c5(z5, z4, bVar2);
                a5(z4, aVar, bVar2);
                Integer num3 = jVar.c;
                if (num3 != null) {
                    getIcon().setImageResource(num3.intValue());
                } else {
                    b5(aVar.a, bVar2);
                }
            } else {
                int i = 7;
                if (z) {
                    c.i iVar = (c.i) cVar;
                    com.vk.libvideo.design.view.overlay.a aVar2 = iVar.b;
                    boolean z6 = aVar2.a;
                    com.vk.libvideo.design.view.overlay.b bVar3 = iVar.a;
                    VkSimpleButton button = getButton();
                    boolean showRedesign = getShowRedesign();
                    String str = bVar3.e;
                    String str2 = bVar3.b;
                    l5(button, ((Boolean) bVar3.h.invoke(Boolean.valueOf(bVar3.g), Boolean.valueOf(showRedesign), Boolean.valueOf(str != null))).booleanValue());
                    button.setTextColor(g5(R.attr.vk_ui_text_primary, z4 || z6));
                    bwt0.i0(button, new erh(this, iVar, bVar3, i));
                    String str3 = bVar3.e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    button.setText(str3);
                    boolean z7 = aVar2.a;
                    c5(z7, z4, bVar3);
                    boolean z8 = iVar.c && getShowRedesign() && str2.length() > 0;
                    TextView subtitle = getSubtitle();
                    l5(subtitle, z8);
                    subtitle.setTextColor(z7 ? g5(R.attr.vk_ui_text_contrast, z4) : g5(R.attr.vk_ui_text_tertiary, false));
                    subtitle.setText(str2);
                    a5(z4, aVar2, bVar3);
                    b5(z7, bVar3);
                } else if (cVar instanceof c.f) {
                    c.f fVar = (c.f) cVar;
                    com.vk.libvideo.design.view.overlay.a aVar3 = fVar.b;
                    l5(getButton(), false);
                    l5(getTitle(), false);
                    l5(getUpcomingView(), false);
                    com.vk.libvideo.design.view.overlay.b bVar4 = fVar.a;
                    a5(z4, aVar3, bVar4);
                    b5(aVar3.a, bVar4);
                } else if (cVar instanceof c.g) {
                    c.g gVar = (c.g) cVar;
                    k5(gVar.a, gVar.b, new v43(20, gVar, this));
                } else if (cVar instanceof c.h) {
                    c.h hVar = (c.h) cVar;
                    hVar.getClass();
                    k5(null, null, new ksq0(hVar, i));
                } else if (cVar instanceof c.k) {
                    com.vk.libvideo.design.view.overlay.b bVar5 = ((c.k) cVar).a;
                    f4m.j(getIcon());
                    l5(getButton(), false);
                    a5(z4, new com.vk.libvideo.design.view.overlay.a(false, null), bVar5);
                    c5(false, z4, bVar5);
                } else if (cVar instanceof c.a) {
                    m5(((c.a) cVar).a);
                } else if (cVar instanceof c.C1234c) {
                    c.C1234c c1234c = (c.C1234c) cVar;
                    setOnClickListener(new vr6(c1234c, 9));
                    m5(c1234c.a);
                } else if (cVar instanceof c.d) {
                    c.d dVar = (c.d) cVar;
                    boolean z9 = dVar.b;
                    setOnClickListener(new pj8(dVar, 11));
                    l5(getIcon(), false);
                    l5(getTitle(), false);
                    l5(getButton(), false);
                    bwt0.p0(getUpcomingView(), !z9);
                    if (!z9) {
                        LiveUpcomingView upcomingView = getUpcomingView();
                        long j = dVar.a;
                        boolean z10 = dVar.c;
                        boolean z11 = dVar.d;
                        com.vk.libvideo.design.view.video.a aVar4 = dVar.e;
                        VkButton vkButton = upcomingView.d;
                        vkButton.a5(true, Integer.valueOf(z10 ? R.drawable.vk_icon_done_outline_24 : R.drawable.vk_icon_notification_outline_24));
                        vkButton.setText(z10 ? R.string.live_will_notify_about_start : R.string.live_notify_about_start);
                        LiveTimerView liveTimerView = upcomingView.b;
                        t2l t2lVar = new t2l(upcomingView, 17);
                        io.reactivex.rxjava3.disposables.c cVar2 = liveTimerView.t;
                        if (cVar2 != null) {
                            cVar2.dispose();
                        }
                        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                        Ref$LongRef ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = j - calendar.getTimeInMillis();
                        e1 Q = q.Q(0L, 1L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.a.b());
                        int i2 = 21;
                        j41 j41Var = new j41(new ayo(ref$LongRef, 14), i2);
                        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                        liveTimerView.t = new z(Q.E(j41Var, lVar, kVar, kVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new xz(new wz(ref$LongRef, t2lVar, liveTimerView, 3), 28)).subscribe(new k41(new bv1(i2, liveTimerView, ref$LongRef), 25));
                        bwt0.p0(vkButton, z11);
                        if (z11) {
                            jjc.g(vkButton, new h0(16, aVar4, upcomingView));
                        }
                    }
                } else {
                    if (!(cVar instanceof c.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m5(getContext().getString(R.string.live_waiting_title));
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
        if (z2) {
            f4m.t(((Number) N.getValue()).intValue(), getTitle());
        } else {
            if (!(cVar instanceof c.j)) {
                f4m.t(o5(), getTitle());
                return;
            }
            TextView title2 = getTitle();
            Integer num4 = ((c.j) cVar).d;
            f4m.t(num4 != null ? num4.intValue() : o5(), title2);
        }
    }

    public final void a5(boolean z, com.vk.libvideo.design.view.overlay.a aVar, com.vk.libvideo.design.view.overlay.b bVar) {
        VKImageView cover = getCover();
        izs<VideoRestrictionSize, String> izsVar = aVar.b;
        String invoke = izsVar != null ? izsVar.invoke(this.z) : null;
        cover.setPlaceholderColor(getShowRedesign() ? g5(R.attr.vk_ui_image_placeholder_alpha, z) : z ? cover.getContext().getColor(R.color.vk_gray_850) : dhr0.t.c(R.attr.vk_ui_image_placeholder));
        if (!epx.f(cover.getCurrentUrl(), invoke)) {
            cover.clear();
        }
        cover.setPostprocessor(bVar.c ? b.c() : null);
        if (bVar.c) {
            cover.setColorFilter(cover.getContext().getColor(R.color.video_overlay_blur_color_filter));
        } else if (aVar.a) {
            cover.setColorFilter(cover.getContext().getColor(R.color.vk_black_alpha60));
        } else {
            cover.clearColorFilter();
        }
        cover.load(invoke);
    }

    public final void b5(boolean z, com.vk.libvideo.design.view.overlay.b bVar) {
        String str = (String) bVar.i.invoke(this.z, Integer.valueOf(e5()));
        VKImageView icon = getIcon();
        bwt0.p0(icon, str != null);
        icon.setColorFilter(new PorterDuffColorFilter(z ? icon.getContext().getColor(R.color.vk_white) : g5(R.attr.vk_ui_icon_secondary, false), PorterDuff.Mode.SRC_IN));
        icon.load(str);
    }

    public final void c5(boolean z, boolean z2, com.vk.libvideo.design.view.overlay.b bVar) {
        TextView title = getTitle();
        setupTitle(title);
        l5(title, bVar.a.length() > 0);
        title.setTextColor(z ? g5(R.attr.vk_ui_text_contrast, z2) : g5(R.attr.vk_ui_text_tertiary, false));
        title.setText(bVar.a);
    }

    public final int e5() {
        boolean showRedesign = getShowRedesign();
        VideoRestrictionSize videoRestrictionSize = this.z;
        return (showRedesign || videoRestrictionSize != VideoRestrictionSize.SMALL) ? !getShowRedesign() ? ((Number) L.getValue()).intValue() : (videoRestrictionSize == VideoRestrictionSize.SMALL || (this.H && videoRestrictionSize == VideoRestrictionSize.MEDIUM)) ? ((Number) I.getValue()).intValue() : ((Number) J.getValue()).intValue() : ((Number) K.getValue()).intValue();
    }

    public final void f5() {
        if (getChildCount() == 0) {
            View.inflate(getContext(), R.layout.video_overlay_view, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VKImageView getCover() {
        return (VKImageView) this.t.getValue();
    }

    public final boolean getShowRedesign() {
        return this.E.b && this.F;
    }

    public final VideoRestrictionSize getSizeMode() {
        return this.z;
    }

    public final void h5(float f, float f2, float f3, float f4) {
        getCover().z0(f, f2, f3, f4);
    }

    public final void i5(int i, int i2) {
        setMaxWidth(i);
        setMaxHeight(i2);
        getTitle().setMaxWidth(i);
        getCover().setMaxHeight(i2);
    }

    public final void j5(int i, int i2) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getCover().getLayoutParams();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(':');
        sb.append(i2);
        bVar.G = sb.toString();
    }

    public final void k5(String str, String str2, gzs<s3q0> gzsVar) {
        TextView title = getTitle();
        l5(title, true);
        title.setTextColor(title.getContext().getColor(R.color.vk_white));
        title.setText(str);
        VkSimpleButton button = getButton();
        l5(button, true);
        button.setTextColor(button.getContext().getColor(R.color.vk_white));
        button.setText(str2);
        bwt0.i0(button, new lyl0(gzsVar, 13));
        f4m.j(getIcon());
        VKImageView cover = getCover();
        cover.clear();
        cover.setPostprocessor(null);
        cover.setPlaceholderColor(cover.getContext().getColor(R.color.vk_black_alpha60));
    }

    public final void m5(String str) {
        setBackgroundColor(getContext().getColor(R.color.vk_gray_850));
        int color = getContext().getColor(R.color.vk_gray_500);
        l5(getIcon(), true);
        VKImageView icon = getIcon();
        bpn0 bpn0Var = L;
        bwt0.c0(((Number) bpn0Var.getValue()).intValue(), icon);
        bwt0.r0(((Number) bpn0Var.getValue()).intValue(), getIcon());
        getIcon().setImageResource(R.drawable.vk_icon_videocam_slash_outline_56);
        bwt0.o0(getIcon(), color);
        l5(getButton(), false);
        l5(getTitle(), true);
        getTitle().setText(str);
        getTitle().setTextColor(color);
        getTitle().setTextAppearance(R.style.VkUiTypography_TextNormal);
    }

    public final int n5() {
        boolean showRedesign = getShowRedesign();
        VideoRestrictionSize videoRestrictionSize = this.z;
        return (showRedesign && videoRestrictionSize == VideoRestrictionSize.SMALL) ? iah0.a(4) : (getShowRedesign() && this.H && videoRestrictionSize == VideoRestrictionSize.MEDIUM) ? iah0.a(8) : iah0.a(32);
    }

    public final int o5() {
        return !getShowRedesign() ? ((Number) M.getValue()).intValue() : this.z == VideoRestrictionSize.SMALL ? iah0.a(2) : iah0.a(6);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        double measuredHeight = getSubtitle().getMeasuredHeight() + getButton().getMeasuredHeight() + getIcon().getMeasuredHeight() + getTitle().getMeasuredHeight();
        boolean z2 = measuredHeight / ((double) getMeasuredHeight()) <= (getShowRedesign() ? 0.9d : 0.7d);
        if (!z2) {
            measuredHeight -= getSubtitle().getMeasuredHeight();
            f4m.j(getSubtitle());
        }
        if (measuredHeight / getMeasuredHeight() <= (getShowRedesign() ? 0.9d : 0.7d)) {
            bwt0.p0(getButton(), getButton().isEnabled());
            bwt0.p0(getTitle(), getTitle().isEnabled());
            bwt0.p0(getSubtitle(), getSubtitle().isEnabled() && z2);
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        f4m.j(getTitle());
        if (getIcon().getMeasuredHeight() / getMeasuredHeight() > 0.5d && this.z != VideoRestrictionSize.SMALL) {
            int intValue = getShowRedesign() ? ((Number) I.getValue()).intValue() : ((Number) K.getValue()).intValue();
            getIcon().measure(View.MeasureSpec.makeMeasureSpec(intValue, 1073741824), View.MeasureSpec.makeMeasureSpec(intValue, 1073741824));
        }
        if (this.B && bwt0.K(getButton())) {
            int measuredHeight2 = (((getMeasuredHeight() / 2) - (getIcon().getMeasuredHeight() / 2)) - (getButton().getMeasuredHeight() / 2)) - getHalfDefaultMargin();
            getIcon().layout((getMeasuredWidth() / 2) - d5(getIcon()), measuredHeight2, d5(getIcon()) + (getMeasuredWidth() / 2), getIcon().getMeasuredHeight() + measuredHeight2);
            getButton().layout((getMeasuredWidth() / 2) - d5(getButton()), (getMeasuredHeight() - measuredHeight2) - getButton().getMeasuredHeight(), d5(getButton()) + (getMeasuredWidth() / 2), getMeasuredHeight() - measuredHeight2);
        } else {
            f4m.j(getButton());
            getIcon().layout((getMeasuredWidth() / 2) - d5(getIcon()), (getMeasuredHeight() / 2) - (getIcon().getMeasuredHeight() / 2), d5(getIcon()) + (getMeasuredWidth() / 2), (getIcon().getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
        getCover().layout(0, 0, getCover().getMeasuredWidth(), getCover().getMeasuredHeight());
    }

    public final void setCornerRadius(float f) {
        getCover().z0(f, f, f, f);
    }

    public final void setCoverContentScaleType(TransformController.ScaleType scaleType) {
        getCover().setActualScaleType(e.$EnumSwitchMapping$0[scaleType.ordinal()] == 1 ? f5h0.i.a : f5h0.f.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoOverlayView(Context context, AttributeSet attributeSet, d dVar, int i) {
        super(context, attributeSet, 0);
        boolean z;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        dVar = (i & 8) != 0 ? null : dVar;
        dck0 dck0Var = new dck0(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, dck0Var);
        this.u = msy.a(lazyThreadSafetyMode, new mqe0(this, 27));
        this.v = msy.a(lazyThreadSafetyMode, new dbj0(this, 18));
        this.w = msy.a(lazyThreadSafetyMode, new vpj0(this, 20));
        this.x = msy.a(lazyThreadSafetyMode, new mlf0(this, 19));
        this.y = msy.a(lazyThreadSafetyMode, new tvs0(this, 1));
        this.z = VideoRestrictionSize.MEDIUM;
        this.E = new i1t0(false, false);
        this.G = new bpn0(new tqf0(10));
        Context context2 = getContext();
        HashSet hashSet = iah0.a;
        this.H = !fnj.b(context2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
            if (dVar != null) {
                z = false;
            } else {
                try {
                    z = obtainStyledAttributes.getBoolean(0, false);
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
            this.B = z;
            this.A = dVar != null ? false : obtainStyledAttributes.getBoolean(3, dhr0.a.c(context));
            this.z = VideoRestrictionSize.values()[dVar != null ? 1 : obtainStyledAttributes.getInt(4, 2)];
            this.C = dVar != null ? dVar.a : obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.F = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
        }
        setClipChildren(false);
        setClipToPadding(false);
    }

    public VideoOverlayView(Context context, VideoRestrictionSize videoRestrictionSize) {
        this(context, null, null, 14);
        this.z = videoRestrictionSize;
        this.A = false;
        this.B = false;
        this.C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
