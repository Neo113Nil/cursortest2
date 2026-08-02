package com.vk.core.view.fresco;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.util.measure.ScaleType;
import com.vk.design.ui.themehelper.R$styleable;
import com.vk.dto.common.im.Image;
import com.vk.imageloader.fresco.CallerContext;
import com.vk.imageloader.fresco.Quality;
import com.vk.toggle.d;
import com.vk.toggle.data.ImageQualitySuppressionLevel;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.b780;
import xsna.bp10;
import xsna.bpn0;
import xsna.brm0;
import xsna.bwt0;
import xsna.dlo;
import xsna.dy2;
import xsna.e3m;
import xsna.epx;
import xsna.f5h0;
import xsna.flo;
import xsna.fxj0;
import xsna.gzs;
import xsna.h5u0;
import xsna.hhs;
import xsna.iah0;
import xsna.ixj0;
import xsna.j5g;
import xsna.jpf;
import xsna.jwx;
import xsna.kbe;
import xsna.kgw;
import xsna.kq01;
import xsna.kqj;
import xsna.ktc0;
import xsna.liw;
import xsna.lpa0;
import xsna.m33;
import xsna.ma80;
import xsna.mcr0;
import xsna.mjw;
import xsna.msx0;
import xsna.msy;
import xsna.njt;
import xsna.o19;
import xsna.o360;
import xsna.ojt;
import xsna.or4;
import xsna.ozl;
import xsna.q0v0;
import xsna.re0;
import xsna.rhs;
import xsna.s3q0;
import xsna.sa30;
import xsna.sr10;
import xsna.t2l;
import xsna.uiw;
import xsna.wgs;
import xsna.x9;
import xsna.x9g0;
import xsna.xuj;
import xsna.yce;
import xsna.yiz;

/* compiled from: FrescoImageView.kt */
@ozl
/* loaded from: classes17.dex */
public class FrescoImageView extends View implements kqj<mjw>, msx0, kgw, h5u0 {
    public static final /* synthetic */ int R = 0;
    public final or4 A;
    public final Handler B;
    public final Object C;
    public int D;
    public int E;
    public ScaleType F;
    public float G;
    public x9g0 H;
    public liw I;
    public Drawable J;
    public List<? extends fxj0> K;
    public List<? extends fxj0> L;
    public fxj0 M;
    public fxj0 N;
    public Drawable O;
    public Drawable P;
    public final Object Q;
    public final jwx b;
    public final jwx c;
    public final lpa0 d;
    public final RoundingParams e;
    public final njt f;
    public final flo<njt> g;
    public final ImageRequest[] h;
    public final bp10.a i;
    public final bp10.b j;
    public final ArrayList k;
    public final ArrayList l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p;
    public b780 q;
    public ma80 r;
    public gzs<Boolean> s;
    public boolean t;
    public boolean u;
    public final xuj v;
    public ArcStyle w;
    public ktc0 x;
    public final wgs y;
    public boolean z;

    /* compiled from: FrescoImageView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.CENTER_CROP_UPSCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScaleType.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ScaleType.TOP_CROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ScaleType.BOTTOM_CROP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ArcStyle.values().length];
            try {
                iArr2[ArcStyle.ARC_BOTTOM_LEFT_TOP_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ArcStyle.ARC_TOP_LEFT_BOTTOM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ArcStyle.ARC_TOP_RIGHT_BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ArcStyle.ARC_BOTTOM_RIGHT_TOP_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ArcStyle.ARC_BOTTOM_LEFT_BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ArcStyle.ARC_TOP_LEFT_BOTTOM_LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ArcStyle.ARC_TOP_RIGHT_TOP_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ArcStyle.ARC_BOTTOM_RIGHT_TOP_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: FrescoImageView.kt */
    public static final class b implements NetworkPerformanceMeasurer.a {
        public b() {
        }

        @Override // com.vk.core.performance.network.NetworkPerformanceMeasurer.a
        public final void a(NetworkPerformanceMeasurer.NetworkClass networkClass, boolean z) {
            if (z) {
                return;
            }
            int i = FrescoImageView.R;
            FrescoImageView.this.j(false);
        }
    }

    public FrescoImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (xsna.brm0.B(r0.getUrl(), "http", false) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImageRequest getFallbackRequest() {
        ktc0 ktc0Var;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel;
        bp10.b bVar = this.j;
        int i = bVar.a;
        int i2 = bVar.b;
        List<? extends fxj0> list = this.K;
        List<? extends fxj0> list2 = list;
        fxj0 g = g((list2 == null || list2.isEmpty()) ? null : list, i, i2, true, false);
        if (g == null) {
            List<? extends fxj0> list3 = this.L;
            if (list3 != null) {
                sr10 sr10Var = dy2.a;
                if (sr10Var == null || (imageQualitySuppressionLevel = sr10Var.d()) == null) {
                    imageQualitySuppressionLevel = ImageQualitySuppressionLevel.NONE;
                }
                g = kq01.k(list3, i, imageQualitySuppressionLevel.h(), true);
                if (g != null) {
                    if (!mcr0.p(g.getUrl())) {
                    }
                }
            }
            g = null;
        }
        if (g != null) {
            if (brm0.B(g.getUrl(), "http", false)) {
                ktc0Var = this.x;
            } else {
                ktc0Var = this.x;
                if (ktc0Var == null) {
                    ktc0Var = this.b;
                }
            }
            ImageRequestBuilder o = o(g, i, i2);
            if (o != null) {
                o.k = ktc0Var;
                return o.a();
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final b getNetworkClassChangedListener() {
        return (b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getPostImageRequest() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    public static /* synthetic */ void q(FrescoImageView frescoImageView, ImageRequest imageRequest, FrescoImageView frescoImageView2, int i) {
        if ((i & 1) != 0) {
            imageRequest = null;
        }
        if ((i & 8) != 0) {
            frescoImageView2 = null;
        }
        frescoImageView.p(imageRequest, null, null, frescoImageView2);
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        setMaximumWidth(typedArray.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(typedArray.getDimensionPixelSize(1, Integer.MAX_VALUE));
        if (typedArray.hasValue(7)) {
            setIsCircle(typedArray.getBoolean(7, false));
        }
        if (typedArray.hasValue(4)) {
            setCornerRadius(typedArray.getDimensionPixelSize(4, iah0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        }
        int i = typedArray.getInt(9, ScaleType.CENTER_INSIDE.h());
        ScaleType.Companion.getClass();
        setScaleType(ScaleType.a.a(i));
        setAspectRatio(typedArray.getFloat(2, -1.0f));
        setPlaceholder(typedArray.getDrawable(8));
        setEmptyPlaceholder(typedArray.getDrawable(5));
        setBgFillDrawable(typedArray.getDrawable(3));
        setFadeDuration(typedArray.getInt(6, 300));
        this.K = null;
        this.L = null;
    }

    private final void setupCornerStyleCircle(boolean z) {
        RoundingParams roundingParams = this.e;
        roundingParams.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        roundingParams.b = z;
        this.f.u(roundingParams);
    }

    @Override // xsna.kqj
    public final /* bridge */ /* synthetic */ void a(Object obj, String str) {
    }

    @Override // xsna.kqj
    public final void b(String str, Throwable th) {
        this.o = false;
        b780 b780Var = this.q;
        if (b780Var != null) {
            b780Var.b(str, th);
        }
        q(this, getFallbackRequest(), null, 14);
    }

    @Override // xsna.kqj
    public final void d(String str) {
        b780 b780Var = this.q;
        if (b780Var != null) {
            b780Var.onCancel(str);
        }
    }

    @Override // xsna.kqj
    public final void e(String str, mjw mjwVar, Animatable animatable) {
        mjw mjwVar2 = mjwVar;
        int width = mjwVar2 != null ? mjwVar2.getWidth() : 0;
        int height = mjwVar2 != null ? mjwVar2.getHeight() : 0;
        b780 b780Var = this.q;
        if (b780Var != null) {
            b780Var.t(width, height, str);
        }
        this.o = true;
    }

    @Override // xsna.kqj
    public final void f(Object obj, String str) {
        b780 b780Var = this.q;
        if (b780Var != null) {
            b780Var.g(str);
        }
        this.o = false;
    }

    public final fxj0 g(List<? extends fxj0> list, int i, int i2, boolean z, boolean z2) {
        ImageQualitySuppressionLevel imageQualitySuppressionLevel;
        if (list == null) {
            return null;
        }
        sr10 sr10Var = dy2.a;
        if (!(sr10Var != null ? sr10Var.c() : true)) {
            gzs<Boolean> gzsVar = this.s;
            if (!(gzsVar != null ? gzsVar.invoke().booleanValue() : false) && !z2) {
                sr10 sr10Var2 = dy2.a;
                if (sr10Var2 == null || (imageQualitySuppressionLevel = sr10Var2.d()) == null) {
                    imageQualitySuppressionLevel = ImageQualitySuppressionLevel.NONE;
                }
                double h = imageQualitySuppressionLevel.h();
                fxj0 k = kq01.k(list, i, h, z);
                if (k != null) {
                    NetworkPerformanceMeasurer networkPerformanceMeasurer = NetworkPerformanceMeasurer.a;
                    String url = k.getUrl();
                    networkPerformanceMeasurer.getClass();
                    NetworkPerformanceMeasurer.n.put(url, Double.valueOf(h));
                }
                return k;
            }
        }
        if (!this.t) {
            return ixj0.b(list);
        }
        List<? extends fxj0> list2 = list;
        fxj0 c = ixj0.c(list2, i, i2);
        return c == null ? ixj0.b(list2) : c;
    }

    public final ArcStyle getArc() {
        return this.w;
    }

    public final float getAspectRatio() {
        return this.G;
    }

    public final int getBorderColor() {
        return this.e.f;
    }

    public final float getBorderWidth() {
        return this.e.e;
    }

    public ColorFilter getColorFilter() {
        return this.f.d.getColorFilter();
    }

    public final lpa0 getControllerBuilder() {
        return this.d;
    }

    public final xuj getCorners() {
        return this.v;
    }

    public final fxj0 getCurrentLocalImage() {
        return this.M;
    }

    public final fxj0 getCurrentRemoteImage() {
        return this.N;
    }

    public final liw getCustomDecodeOptions() {
        return this.I;
    }

    public final x9g0 getCustomResizeOptions() {
        return this.H;
    }

    public final flo<njt> getDraweeHolder() {
        return this.g;
    }

    public final long getFadeDuration() {
        return this.f.e.m;
    }

    public final njt getHierarchy() {
        return this.f;
    }

    public final gzs<Boolean> getIgnoreTrafficSaverPredicate() {
        return this.s;
    }

    public final List<fxj0> getLocalImageList() {
        return this.K;
    }

    public final int getMaximumHeight() {
        return this.E;
    }

    public final int getMaximumWidth() {
        return this.D;
    }

    public final List<fxj0> getRemoteImageList() {
        return this.L;
    }

    public final ScaleType getScaleType() {
        return this.F;
    }

    @Override // xsna.h5u0
    public int getVisibleArea() {
        Rect rect = this.p;
        if (getGlobalVisibleRect(rect)) {
            return o19.b(rect);
        }
        return -1;
    }

    public final boolean getWithImageDownscale() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(int i, int i2) {
        ImageRequest imageRequest;
        ImageRequest imageRequest2;
        ImageRequest imageRequest3;
        fxj0 fxj0Var;
        fxj0 fxj0Var2;
        ktc0 ktc0Var;
        String url;
        ma80 ma80Var;
        ImageRequestBuilder o;
        ImageRequestBuilder o2;
        List<? extends fxj0> list = this.K;
        boolean z = list == null || list.isEmpty();
        List<? extends fxj0> list2 = this.L;
        boolean z2 = list2 == null || list2.isEmpty();
        if (z && z2) {
            q(this, null, this, 7);
            return;
        }
        fxj0 g = g(this.K, i, i2, false, false);
        this.M = g;
        if (g != null) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer = NetworkPerformanceMeasurer.a;
            String url2 = g.getUrl();
            networkPerformanceMeasurer.getClass();
            NetworkPerformanceMeasurer.c(url2);
        }
        if (g == null || (o2 = o(g, i, i2)) == null) {
            imageRequest = null;
        } else {
            o2.k = this.x;
            o2.l = new hhs(Quality.SUITABLE, new yce(this, 21));
            imageRequest = o2.a();
        }
        fxj0 g2 = g(this.L, i, i2, false, false);
        this.N = g2;
        if (g2 != null) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer2 = NetworkPerformanceMeasurer.a;
            String url3 = g2.getUrl();
            networkPerformanceMeasurer2.getClass();
            NetworkPerformanceMeasurer.c(url3);
        }
        if (g2 == null || (o = o(g2, i, i2)) == null) {
            imageRequest2 = null;
        } else {
            o.k = this.x;
            o.j = Priority.MEDIUM;
            o.l = new hhs(Quality.SUITABLE, new kbe(this, 24));
            imageRequest2 = o.a();
        }
        sa30.L(this, g2 != null ? g2.getUrl() : null);
        Pair m = kq01.m(this.L);
        if (m != null) {
            fxj0 fxj0Var3 = (fxj0) m.d();
            Quality quality = (Quality) m.g();
            if (quality != null && (ma80Var = this.r) != null) {
                ma80Var.a(quality);
            }
            fxj0 fxj0Var4 = (fxj0) m.i();
            if (fxj0Var4 == null || (url = fxj0Var4.getUrl()) == null || !uiw.a(url)) {
                ktc0Var = this.x;
                if (ktc0Var == null) {
                    ktc0Var = this.b;
                }
            } else {
                ktc0Var = this.c;
            }
            ImageRequestBuilder o3 = o(fxj0Var3, i, i2);
            if (o3 != null) {
                o3.k = ktc0Var;
                o3.j = Priority.HIGH;
                if (quality == null) {
                    quality = Quality.LOWEST;
                }
                o3.l = new hhs(quality, new jpf(this, 22));
                imageRequest3 = o3.a();
                bpn0 bpn0Var = o360.e;
                o360 a2 = o360.a.a();
                a2.h(g == null ? g.getUrl() : null);
                a2.h(g2 == null ? g2.getUrl() : null);
                if (m != null && (fxj0Var = (fxj0) m.i()) != null) {
                    fxj0Var2 = brm0.B(fxj0Var.getUrl(), "http", false) ? fxj0Var : null;
                    if (fxj0Var2 != null) {
                        a2.h(fxj0Var2.getUrl());
                    }
                }
                p(imageRequest, imageRequest2, imageRequest3, this);
            }
        }
        imageRequest3 = null;
        bpn0 bpn0Var2 = o360.e;
        o360 a22 = o360.a.a();
        a22.h(g == null ? g.getUrl() : null);
        a22.h(g2 == null ? g2.getUrl() : null);
        if (m != null) {
            if (brm0.B(fxj0Var.getUrl(), "http", false)) {
            }
            if (fxj0Var2 != null) {
            }
        }
        p(imageRequest, imageRequest2, imageRequest3, this);
    }

    public final void i() {
        bp10.b bVar = this.j;
        int i = bVar.c;
        boolean z = i > 0 && bVar.d > 0;
        boolean z2 = i == 0 && bVar.d == 0 && this.o;
        boolean z3 = bVar.a > 0 && bVar.b > 0 && getVisibility() == 0;
        if (this.m && z3) {
            if (z || z2) {
                h(bVar.a, bVar.b);
                this.m = false;
            }
        }
    }

    public final void j(boolean z) {
        FrescoImageView frescoImageView;
        boolean z2;
        fxj0 fxj0Var;
        if (isAttachedToWindow() && this.o && (this.M != null || this.N != null)) {
            List<? extends fxj0> list = this.K;
            if (list != null) {
                frescoImageView = this;
                z2 = z;
                fxj0Var = frescoImageView.g(list, getWidth(), getHeight(), false, z2);
            } else {
                frescoImageView = this;
                z2 = z;
                fxj0Var = null;
            }
            List<? extends fxj0> list2 = frescoImageView.L;
            fxj0 g = list2 != null ? frescoImageView.g(list2, getWidth(), getHeight(), false, z2) : null;
            fxj0 fxj0Var2 = frescoImageView.M;
            if (fxj0Var2 != null && fxj0Var != null && fxj0Var2.getWidth() < fxj0Var.getWidth()) {
                frescoImageView.m = true;
                h(getWidth(), getHeight());
                return;
            }
            fxj0 fxj0Var3 = frescoImageView.N;
            if (fxj0Var3 == null || g == null || fxj0Var3.getWidth() >= g.getWidth()) {
                return;
            }
            frescoImageView.m = true;
            h(getWidth(), getHeight());
        }
    }

    public final void k() {
        this.u = false;
        this.v.b(0, 0);
        this.w = ArcStyle.ARC_NONE;
    }

    public final void l(float f, int i) {
        this.e.c(f, i);
        this.n = true;
        invalidate();
    }

    public final void m(int i, int i2, int i3, int i4) {
        k();
        xuj xujVar = this.v;
        xujVar.a = i;
        xujVar.b = i2;
        xujVar.c = i3;
        xujVar.d = i4;
        this.n = true;
        invalidate();
    }

    public final void n(List<? extends fxj0> list, List<? extends fxj0> list2) {
        List<? extends fxj0> list3;
        this.K = list;
        this.L = list2;
        boolean z = false;
        if (mcr0.i) {
            if (list2 != null) {
                for (fxj0 fxj0Var : list2) {
                    if (uiw.a(fxj0Var.getUrl())) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            fxj0Var = null;
            if (fxj0Var != null) {
                fxj0 b2 = ixj0.b(this.L);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Image(b2 != null ? b2.getWidth() : 100, b2 != null ? b2.getHeight() : 100, fxj0Var.getUrl(), false));
                this.L = arrayList;
            }
        }
        List<? extends fxj0> list4 = list;
        if ((list4 == null || list4.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            z = true;
        }
        this.f.p(z ? this.P : this.O, 1);
        this.m = true;
        this.x = null;
        requestLayout();
        invalidate();
    }

    public final ImageRequestBuilder o(fxj0 fxj0Var, int i, int i2) {
        int round;
        x9g0 x9g0Var = null;
        if (fxj0Var == null) {
            return null;
        }
        Uri parse = Uri.parse(fxj0Var.getUrl());
        liw liwVar = this.I;
        if (liwVar == null) {
            liwVar = new q0v0(liw.a(), new Size(i, i2), parse);
        }
        ImageRequestBuilder h = ImageRequestBuilder.h(parse);
        h.f = liwVar;
        if (this.t) {
            x9g0 x9g0Var2 = this.H;
            if (x9g0Var2 == null) {
                ScaleType scaleType = this.F;
                if (fxj0Var.e6() / (i * i2) >= 1.3f) {
                    int height = fxj0Var.getHeight();
                    int width = fxj0Var.getWidth();
                    if (scaleType == ScaleType.CENTER_CROP) {
                        float f = width;
                        float f2 = height;
                        float max = Math.max(i / f, i2 / f2);
                        round = Math.round(f * max);
                        i2 = Math.round(f2 * max);
                    } else {
                        if (scaleType == ScaleType.CENTER_INSIDE || scaleType == ScaleType.FIT_START || scaleType == ScaleType.FIT_CENTER || scaleType == ScaleType.FIT_END) {
                            float f3 = width;
                            float f4 = height;
                            float min = Math.min(i / f3, i2 / f4);
                            round = Math.round(f3 * min);
                            i2 = Math.round(f4 * min);
                        }
                        if (i > 0 && i2 > 0) {
                            x9g0Var = new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, 12);
                        }
                    }
                    i = round;
                    if (i > 0) {
                        x9g0Var = new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, 12);
                    }
                }
                x9g0Var2 = x9g0Var;
            }
            h.d = x9g0Var2;
        }
        return h;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g.f();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        boolean z = this.n;
        bp10.b bVar = this.j;
        if (z) {
            int i = bVar.c;
            int i2 = bVar.d;
            boolean z2 = this.u;
            if (z2) {
                setupCornerStyleCircle(z2);
            } else {
                ArcStyle arcStyle = this.w;
                ArcStyle arcStyle2 = ArcStyle.ARC_NONE;
                njt njtVar = this.f;
                RoundingParams roundingParams = this.e;
                if (arcStyle != arcStyle2) {
                    roundingParams.b = false;
                    switch (a.$EnumSwitchMapping$1[arcStyle.ordinal()]) {
                        case 1:
                            roundingParams.e(Math.max(i, i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                        case 2:
                            roundingParams.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.max(i, i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                        case 3:
                            roundingParams.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.max(i, i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                        case 4:
                            roundingParams.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.max(i, i2));
                            break;
                        case 5:
                            float max = Math.max(i, i2);
                            roundingParams.e(max, max, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                        case 6:
                            float max2 = Math.max(i, i2);
                            roundingParams.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, max2, max2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                        case 7:
                            float max3 = Math.max(i, i2);
                            roundingParams.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, max3, max3);
                            break;
                        case 8:
                            float max4 = Math.max(i, i2);
                            roundingParams.e(max4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, max4);
                            break;
                        default:
                            roundingParams.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                    }
                    njtVar.u(roundingParams);
                } else {
                    if (this.v.a()) {
                        roundingParams.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        roundingParams.b = false;
                        njtVar.u(roundingParams);
                    } else {
                        roundingParams.b = false;
                        roundingParams.e(r0.a, r0.b, r0.d, r0.c);
                        njtVar.u(roundingParams);
                    }
                }
            }
        }
        this.n = false;
        if (!bVar.a() && (drawable = this.J) != null) {
            drawable.draw(canvas);
        }
        Drawable d = this.g.d();
        if (d != null) {
            d.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.g.f();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int b2 = x9.b(paddingRight, paddingLeft, 2, paddingLeft);
        int b3 = x9.b(paddingBottom, paddingTop, 2, paddingTop);
        bp10.b bVar = this.j;
        int i5 = bVar.c;
        int i6 = bVar.d;
        if (this.J != null && !bVar.a() && (drawable = this.J) != null) {
            drawable.setBounds(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        if (!this.v.a()) {
            ScaleType scaleType = this.F;
            if (scaleType == ScaleType.CENTER_INSIDE || scaleType == ScaleType.FIT_CENTER) {
                paddingLeft = b2 - (i5 / 2);
                paddingTop = b3 - (i6 / 2);
            } else if (scaleType != ScaleType.FIT_START) {
                if (scaleType == ScaleType.FIT_END) {
                    paddingLeft = paddingRight - i5;
                    paddingTop = paddingBottom - i6;
                }
            }
            paddingRight = paddingLeft + i5;
            paddingBottom = paddingTop + i6;
        }
        Drawable d = this.g.d();
        if (d != null) {
            d.setBounds(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x000b, B:6:0x0031, B:8:0x0036, B:11:0x003f, B:13:0x0043, B:15:0x0056, B:17:0x0060, B:21:0x006f, B:23:0x0079, B:25:0x0083, B:27:0x008b, B:28:0x0089, B:30:0x00ab, B:34:0x00b6, B:36:0x00ba, B:39:0x00c2, B:41:0x00f0, B:43:0x00f4, B:44:0x0101, B:48:0x00fe, B:51:0x006c, B:54:0x0097, B:56:0x00a1, B:58:0x0107, B:59:0x010e, B:60:0x010f, B:61:0x0116), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x000b, B:6:0x0031, B:8:0x0036, B:11:0x003f, B:13:0x0043, B:15:0x0056, B:17:0x0060, B:21:0x006f, B:23:0x0079, B:25:0x0083, B:27:0x008b, B:28:0x0089, B:30:0x00ab, B:34:0x00b6, B:36:0x00ba, B:39:0x00c2, B:41:0x00f0, B:43:0x00f4, B:44:0x0101, B:48:0x00fe, B:51:0x006c, B:54:0x0097, B:56:0x00a1, B:58:0x0107, B:59:0x010e, B:60:0x010f, B:61:0x0116), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x000b, B:6:0x0031, B:8:0x0036, B:11:0x003f, B:13:0x0043, B:15:0x0056, B:17:0x0060, B:21:0x006f, B:23:0x0079, B:25:0x0083, B:27:0x008b, B:28:0x0089, B:30:0x00ab, B:34:0x00b6, B:36:0x00ba, B:39:0x00c2, B:41:0x00f0, B:43:0x00f4, B:44:0x0101, B:48:0x00fe, B:51:0x006c, B:54:0x0097, B:56:0x00a1, B:58:0x0107, B:59:0x010e, B:60:0x010f, B:61:0x0116), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x000b, B:6:0x0031, B:8:0x0036, B:11:0x003f, B:13:0x0043, B:15:0x0056, B:17:0x0060, B:21:0x006f, B:23:0x0079, B:25:0x0083, B:27:0x008b, B:28:0x0089, B:30:0x00ab, B:34:0x00b6, B:36:0x00ba, B:39:0x00c2, B:41:0x00f0, B:43:0x00f4, B:44:0x0101, B:48:0x00fe, B:51:0x006c, B:54:0x0097, B:56:0x00a1, B:58:0x0107, B:59:0x010e, B:60:0x010f, B:61:0x0116), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x000b, B:6:0x0031, B:8:0x0036, B:11:0x003f, B:13:0x0043, B:15:0x0056, B:17:0x0060, B:21:0x006f, B:23:0x0079, B:25:0x0083, B:27:0x008b, B:28:0x0089, B:30:0x00ab, B:34:0x00b6, B:36:0x00ba, B:39:0x00c2, B:41:0x00f0, B:43:0x00f4, B:44:0x0101, B:48:0x00fe, B:51:0x006c, B:54:0x0097, B:56:0x00a1, B:58:0x0107, B:59:0x010e, B:60:0x010f, B:61:0x0116), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        ScaleType scaleType;
        float f;
        fxj0 b2;
        int width;
        int height;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel2;
        bp10.b bVar = this.j;
        bp10.a aVar = this.i;
        Trace.beginSection("FrescoImageView.onMeasure");
        try {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            int suggestedMinimumHeight = getSuggestedMinimumHeight();
            int i3 = this.D;
            int i4 = this.E;
            ScaleType scaleType2 = this.F;
            float f2 = this.G;
            if (suggestedMinimumWidth > i3) {
                throw new IllegalStateException("minWidth is greater than maxWidth");
            }
            if (suggestedMinimumHeight > i4) {
                throw new IllegalArgumentException("minHeight is greater than maxHeight");
            }
            sr10 sr10Var = dy2.a;
            if (!(sr10Var != null ? sr10Var.c() : true)) {
                gzs<Boolean> gzsVar = this.s;
                if (!(gzsVar != null ? gzsVar.invoke().booleanValue() : false)) {
                    List<? extends fxj0> list = this.K;
                    int v = iah0.v();
                    sr10 sr10Var2 = dy2.a;
                    if (sr10Var2 != null) {
                        imageQualitySuppressionLevel = sr10Var2.d();
                        if (imageQualitySuppressionLevel == null) {
                        }
                        scaleType = scaleType2;
                        f = f2;
                        b2 = kq01.k(list, v, imageQualitySuppressionLevel.h(), false);
                        if (b2 == null) {
                            List<? extends fxj0> list2 = this.L;
                            int v2 = iah0.v();
                            sr10 sr10Var3 = dy2.a;
                            if (sr10Var3 == null || (imageQualitySuppressionLevel2 = sr10Var3.d()) == null) {
                                imageQualitySuppressionLevel2 = ImageQualitySuppressionLevel.NONE;
                            }
                            b2 = kq01.k(list2, v2, imageQualitySuppressionLevel2.h(), false);
                        }
                        width = b2 != null ? b2.getWidth() : 0;
                        int i5 = 200;
                        if (width <= 0) {
                            width = 200;
                        }
                        aVar.a = width;
                        height = b2 != null ? b2.getHeight() : 0;
                        if (height > 0) {
                            i5 = height;
                        }
                        aVar.b = i5;
                        aVar.c = i;
                        aVar.d = i2;
                        aVar.e = suggestedMinimumWidth;
                        aVar.f = suggestedMinimumHeight;
                        aVar.g = i3;
                        aVar.h = i4;
                        aVar.i = paddingLeft;
                        aVar.j = paddingTop;
                        aVar.k = scaleType;
                        aVar.l = f;
                        bp10.d(aVar, bVar);
                        setMeasuredDimension(bVar.a, bVar.b);
                        if (!getPostImageRequest()) {
                            i();
                        } else if (!this.z) {
                            this.z = true;
                            this.B.post(this.A);
                        }
                        s3q0 s3q0Var = s3q0.a;
                        Trace.endSection();
                    }
                    imageQualitySuppressionLevel = ImageQualitySuppressionLevel.NONE;
                    scaleType = scaleType2;
                    f = f2;
                    b2 = kq01.k(list, v, imageQualitySuppressionLevel.h(), false);
                    if (b2 == null) {
                    }
                    if (b2 != null) {
                    }
                    int i52 = 200;
                    if (width <= 0) {
                    }
                    aVar.a = width;
                    if (b2 != null) {
                    }
                    if (height > 0) {
                    }
                    aVar.b = i52;
                    aVar.c = i;
                    aVar.d = i2;
                    aVar.e = suggestedMinimumWidth;
                    aVar.f = suggestedMinimumHeight;
                    aVar.g = i3;
                    aVar.h = i4;
                    aVar.i = paddingLeft;
                    aVar.j = paddingTop;
                    aVar.k = scaleType;
                    aVar.l = f;
                    bp10.d(aVar, bVar);
                    setMeasuredDimension(bVar.a, bVar.b);
                    if (!getPostImageRequest()) {
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    Trace.endSection();
                }
            }
            scaleType = scaleType2;
            f = f2;
            b2 = ixj0.b(this.K);
            if (b2 == null) {
                b2 = ixj0.b(this.L);
            }
            if (b2 != null) {
            }
            int i522 = 200;
            if (width <= 0) {
            }
            aVar.a = width;
            if (b2 != null) {
            }
            if (height > 0) {
            }
            aVar.b = i522;
            aVar.c = i;
            aVar.d = i2;
            aVar.e = suggestedMinimumWidth;
            aVar.f = suggestedMinimumHeight;
            aVar.g = i3;
            aVar.h = i4;
            aVar.i = paddingLeft;
            aVar.j = paddingTop;
            aVar.k = scaleType;
            aVar.l = f;
            bp10.d(aVar, bVar);
            setMeasuredDimension(bVar.a, bVar.b);
            if (!getPostImageRequest()) {
            }
            s3q0 s3q0Var22 = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.g.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(ImageRequest imageRequest, ImageRequest imageRequest2, ImageRequest imageRequest3, kqj<? super mjw> kqjVar) {
        flo<njt> floVar = this.g;
        dlo dloVar = floVar.e;
        lpa0 lpa0Var = this.d;
        lpa0Var.d();
        lpa0Var.l = dloVar;
        if (imageRequest != 0 && imageRequest2 != 0) {
            ImageRequest[] imageRequestArr = this.h;
            imageRequestArr[0] = imageRequest2;
            imageRequestArr[1] = imageRequest;
            lpa0Var.k(imageRequestArr);
        } else if (imageRequest != 0) {
            lpa0Var.c = imageRequest;
        } else if (imageRequest2 != 0) {
            if (epx.f(imageRequest2.b, imageRequest3 != 0 ? imageRequest3.b : null)) {
                lpa0Var.c = imageRequest2;
            } else {
                lpa0Var.c = imageRequest2;
                lpa0Var.d = imageRequest3;
            }
        }
        lpa0Var.h = kqjVar;
        lpa0Var.b = CallerContext.Frontend;
        yiz.b(lpa0Var, getContext(), this.y);
        floVar.h(lpa0Var.b());
    }

    public final void setArc(ArcStyle arcStyle) {
        k();
        this.w = arcStyle;
        this.n = true;
        invalidate();
    }

    public final void setAspectRatio(float f) {
        this.G = f;
        requestLayout();
        invalidate();
    }

    public final void setBackgroundImage(Drawable drawable) {
        this.f.p(drawable, 0);
    }

    public final void setBgFillDrawable(Drawable drawable) {
        Drawable drawable2 = this.J;
        if (drawable2 != null) {
            unscheduleDrawable(drawable2);
            this.J.setCallback(null);
        }
        this.J = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
        invalidate();
    }

    @Override // xsna.msx0
    public void setColorFilter(ColorFilter colorFilter) {
        this.f.d.setColorFilter(colorFilter);
        invalidate();
    }

    public final void setCornerRadius(xuj xujVar) {
        m(xujVar.a, xujVar.b, xujVar.c, xujVar.d);
    }

    public final void setCurrentLocalImage(fxj0 fxj0Var) {
        this.M = fxj0Var;
    }

    public final void setCurrentRemoteImage(fxj0 fxj0Var) {
        this.N = fxj0Var;
    }

    public final void setCustomDecodeOptions(liw liwVar) {
        this.I = liwVar;
        this.m = true;
        requestLayout();
        invalidate();
    }

    public final void setCustomResizeOptions(x9g0 x9g0Var) {
        this.H = x9g0Var;
        this.m = true;
        requestLayout();
        invalidate();
    }

    public final void setEmptyPlaceholder(Drawable drawable) {
        this.P = drawable;
    }

    public final void setFadeDuration(int i) {
        this.f.q(i);
    }

    public final void setIgnoreTrafficSaverPredicate(gzs<Boolean> gzsVar) {
        this.s = gzsVar;
    }

    public final void setIsCircle(boolean z) {
        k();
        this.u = z;
        this.n = true;
        invalidate();
    }

    public final void setLocalImage(fxj0 fxj0Var) {
        ArrayList arrayList = this.k;
        arrayList.clear();
        if (fxj0Var == null) {
            n(null, this.L);
        } else {
            arrayList.add(fxj0Var);
            n(arrayList, this.L);
        }
    }

    public final void setLocalImageList(List<? extends fxj0> list) {
        this.K = list;
    }

    public final void setMaximumHeight(int i) {
        if (this.E != i) {
            this.E = i;
            this.m = true;
            requestLayout();
            invalidate();
        }
    }

    public final void setMaximumWidth(int i) {
        if (this.D != i) {
            this.D = i;
            this.m = true;
            requestLayout();
            invalidate();
        }
    }

    @Override // xsna.kgw
    public void setOnLoadCallback(b780 b780Var) {
        this.q = b780Var;
    }

    public final void setOnQualityChangeCallback(ma80 ma80Var) {
        this.r = ma80Var;
    }

    public final void setPlaceholder(int i) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(i, context);
        this.O = a2;
        this.f.p(a2, 1);
    }

    public final void setPostprocessor(ktc0 ktc0Var) {
        this.x = ktc0Var;
    }

    public final void setRemoteImage(List<? extends fxj0> list) {
        this.l.clear();
        if (list == null) {
            n(this.K, null);
        } else {
            n(this.K, list);
        }
    }

    public final void setRemoteImageList(List<? extends fxj0> list) {
        this.L = list;
    }

    public final void setScaleType(ScaleType scaleType) {
        this.F = scaleType;
        int i = scaleType == null ? -1 : a.$EnumSwitchMapping$0[scaleType.ordinal()];
        f5h0.f fVar = f5h0.f.a;
        f5h0.o oVar = f5h0.o.a;
        f5h0.m mVar = f5h0.m.a;
        njt njtVar = this.f;
        switch (i) {
            case 1:
                njtVar.o(fVar);
                break;
            case 2:
                njtVar.o(fVar);
                break;
            case 3:
                njtVar.o(f5h0.g.a);
                break;
            case 4:
                njtVar.o(f5h0.k.a);
                break;
            case 5:
                njtVar.o(f5h0.i.a);
                break;
            case 6:
                njtVar.o(f5h0.j.a);
                break;
            case 7:
                njtVar.o(mVar);
                break;
            case 8:
                njtVar.l(2).s(new PointF(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                njtVar.o(oVar);
                break;
            case 9:
                njtVar.l(2).s(new PointF(0.5f, 1.0f));
                njtVar.o(oVar);
                break;
            default:
                njtVar.o(mVar);
                break;
        }
        this.m = true;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.m = true;
    }

    public final void setVisible(boolean z) {
        bwt0.p0(this, z);
    }

    public final void setWithImageDownscale(boolean z) {
        this.t = z;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.g.d() || drawable == this.J || super.verifyDrawable(drawable);
    }

    public /* synthetic */ FrescoImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public FrescoImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new jwx(2, 1);
        this.c = new jwx(2, 15);
        this.d = rhs.e();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.a = RoundingParams.RoundingMethod.BITMAP_ONLY;
        this.e = roundingParams;
        ojt ojtVar = new ojt(context.getResources());
        ojtVar.q = roundingParams;
        njt a2 = ojtVar.a();
        this.f = a2;
        flo<njt> floVar = new flo<>(a2);
        this.g = floVar;
        this.h = new ImageRequest[]{null, null};
        this.i = new bp10.a();
        this.j = new bp10.b();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = true;
        this.n = true;
        this.p = new Rect();
        this.t = true;
        this.v = new xuj(0);
        this.w = ArcStyle.ARC_NONE;
        this.y = new wgs();
        this.A = new or4(this, 6);
        this.B = new Handler(Looper.getMainLooper());
        re0 re0Var = new re0(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.C = msy.a(lazyThreadSafetyMode, re0Var);
        this.Q = msy.a(lazyThreadSafetyMode, new t2l(this, 9));
        Drawable d = floVar.d();
        if (d != null) {
            d.setCallback(this);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.h, 0, 0);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        if (d.D()) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer = NetworkPerformanceMeasurer.a;
            b networkClassChangedListener = getNetworkClassChangedListener();
            networkPerformanceMeasurer.getClass();
            NetworkPerformanceMeasurer.a(networkClassChangedListener);
        }
    }

    public final void setRemoteImage(Iterable<? extends fxj0> iterable) {
        setRemoteImage(iterable != null ? j5g.O0(iterable) : null);
    }

    public final void setLocalImage(List<? extends fxj0> list) {
        this.k.clear();
        if (list == null) {
            n(null, this.L);
        } else {
            n(list, this.L);
        }
    }

    public final void setRemoteImage(fxj0 fxj0Var) {
        ArrayList arrayList = this.l;
        arrayList.clear();
        if (fxj0Var == null) {
            n(this.K, null);
        } else {
            arrayList.add(fxj0Var);
            n(this.K, arrayList);
        }
    }

    public final void setCornerRadius(int i) {
        k();
        this.v.b(i, 15);
        this.n = true;
        invalidate();
    }

    public final void setPlaceholder(Drawable drawable) {
        this.O = drawable;
        this.f.p(drawable, 1);
    }

    public final void setLocalImage(Iterable<? extends fxj0> iterable) {
        setLocalImage(iterable != null ? j5g.O0(iterable) : null);
    }

    @Override // xsna.kqj
    public final void c(String str, Throwable th) {
    }
}
