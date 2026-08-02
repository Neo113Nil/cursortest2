package com.vk.core.view.fresco;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.ArcStyle;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.design.ui.themehelper.R$styleable;
import com.vk.dto.common.im.Image;
import com.vk.imageloader.fresco.Quality;
import com.vk.imageloader.view.VKImageView;
import com.vk.toggle.data.ImageQualitySuppressionLevel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.b0g;
import xsna.bp10;
import xsna.bpn0;
import xsna.brm0;
import xsna.bwt0;
import xsna.drm0;
import xsna.dy2;
import xsna.e3m;
import xsna.epx;
import xsna.f5h0;
import xsna.fpf0;
import xsna.fxj0;
import xsna.gzs;
import xsna.hbj0;
import xsna.hhs;
import xsna.i5s;
import xsna.iah0;
import xsna.ixj0;
import xsna.izs;
import xsna.j5g;
import xsna.jwx;
import xsna.kq01;
import xsna.ktc0;
import xsna.lbc0;
import xsna.m33;
import xsna.ma80;
import xsna.mcr0;
import xsna.msy;
import xsna.njt;
import xsna.ojt;
import xsna.ozl;
import xsna.p5j;
import xsna.p7f0;
import xsna.pwh0;
import xsna.qcy;
import xsna.s3q0;
import xsna.sa30;
import xsna.sr10;
import xsna.srq0;
import xsna.tv4;
import xsna.uiw;
import xsna.v5n0;
import xsna.vqf0;
import xsna.x9;
import xsna.xuj;

/* compiled from: VKEnhancedImageView.kt */
@ozl
/* loaded from: classes17.dex */
public class VKEnhancedImageView extends VKImageView {
    public static final /* synthetic */ qcy<Object>[] N = {new MutablePropertyReference1Impl(VKEnhancedImageView.class, "maximumWidth", "getMaximumWidth()I", 0), p5j.a(0, VKEnhancedImageView.class, "maximumHeight", "getMaximumHeight()I", fpf0.a), new MutablePropertyReference1Impl(VKEnhancedImageView.class, "scaleType", "getScaleType()Lcom/vk/core/util/measure/ScaleType;", 0)};
    public ArcStyle A;
    public final a B;
    public final a C;
    public final a D;
    public Drawable E;
    public List<? extends fxj0> F;
    public List<? extends fxj0> G;
    public fxj0 H;
    public fxj0 I;
    public Drawable J;
    public Drawable K;
    public boolean L;
    public final Object M;
    public final bpn0 m;
    public final jwx n;
    public final jwx o;
    public final RoundingParams p;
    public final bp10.a q;
    public final bp10.b r;
    public boolean s;
    public boolean t;
    public ma80 u;
    public gzs<Boolean> v;
    public boolean w;
    public boolean x;
    public boolean y;
    public xuj z;

    /* compiled from: VKEnhancedImageView.kt */
    public static final class a<T> implements p7f0<VKEnhancedImageView, T> {
        public final izs<T, s3q0> b;
        public T c;

        public /* synthetic */ a() {
            this(0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(VKEnhancedImageView vKEnhancedImageView, Object obj) {
            if (epx.f(obj, this.c)) {
                return;
            }
            this.c = obj;
            izs<T, s3q0> izsVar = this.b;
            if (izsVar != null) {
                izsVar.invoke(obj);
            }
            vKEnhancedImageView.s = true;
            vKEnhancedImageView.requestLayout();
            vKEnhancedImageView.invalidate();
        }

        @Override // xsna.i7f0
        public final Object getValue(Object obj, qcy qcyVar) {
            return this.c;
        }

        @Override // xsna.p7f0
        public final /* bridge */ /* synthetic */ void setValue(VKEnhancedImageView vKEnhancedImageView, qcy qcyVar, Object obj) {
            a(vKEnhancedImageView, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Integer num, e eVar) {
            this.b = eVar;
            this.c = num;
        }
    }

    /* compiled from: VKEnhancedImageView.kt */
    public static final class b implements fxj0 {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        @Override // xsna.fxj0
        public final boolean c7() {
            return false;
        }

        @Override // xsna.fxj0
        public final int e6() {
            return 0;
        }

        @Override // xsna.fxj0
        public final int getHeight() {
            return 0;
        }

        @Override // xsna.fxj0
        public final String getUrl() {
            return this.b;
        }

        @Override // xsna.fxj0
        public final int getWidth() {
            return 0;
        }

        @Override // xsna.fxj0
        public final fxj0 kb(int i, int i2, String str) {
            return new b(str);
        }
    }

    /* compiled from: VKEnhancedImageView.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.CENTER_INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScaleType.CENTER_CROP_UPSCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ScaleType.CENTER_CROP.ordinal()] = 6;
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
        }
    }

    /* compiled from: VKEnhancedImageView.kt */
    public static final class d implements NetworkPerformanceMeasurer.a {
        public d() {
        }

        @Override // com.vk.core.performance.network.NetworkPerformanceMeasurer.a
        public final void a(NetworkPerformanceMeasurer.NetworkClass networkClass, boolean z) {
            if (z) {
                return;
            }
            qcy<Object>[] qcyVarArr = VKEnhancedImageView.N;
            VKEnhancedImageView.this.X0(false);
        }
    }

    /* compiled from: VKEnhancedImageView.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<ScaleType, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ScaleType scaleType) {
            int i;
            ScaleType scaleType2 = scaleType;
            VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) this.receiver;
            qcy<Object>[] qcyVarArr = VKEnhancedImageView.N;
            if (scaleType2 == null) {
                i = -1;
            } else {
                vKEnhancedImageView.getClass();
                i = c.$EnumSwitchMapping$0[scaleType2.ordinal()];
            }
            f5h0.f fVar = f5h0.f.a;
            f5h0.o oVar = f5h0.o.a;
            f5h0.m mVar = f5h0.m.a;
            switch (i) {
                case 1:
                    vKEnhancedImageView.getHierarchy().o(f5h0.g.a);
                    break;
                case 2:
                    vKEnhancedImageView.getHierarchy().o(f5h0.i.a);
                    break;
                case 3:
                    vKEnhancedImageView.getHierarchy().o(f5h0.k.a);
                    break;
                case 4:
                    vKEnhancedImageView.getHierarchy().o(f5h0.j.a);
                    break;
                case 5:
                    vKEnhancedImageView.getHierarchy().o(fVar);
                    break;
                case 6:
                    vKEnhancedImageView.getHierarchy().o(fVar);
                    break;
                case 7:
                    vKEnhancedImageView.getHierarchy().o(mVar);
                    break;
                case 8:
                    njt hierarchy = vKEnhancedImageView.getHierarchy();
                    hierarchy.l(2).s(new PointF(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    vKEnhancedImageView.getHierarchy().o(oVar);
                    break;
                case 9:
                    njt hierarchy2 = vKEnhancedImageView.getHierarchy();
                    hierarchy2.l(2).s(new PointF(0.5f, 1.0f));
                    vKEnhancedImageView.getHierarchy().o(oVar);
                    break;
                default:
                    vKEnhancedImageView.getHierarchy().o(mVar);
                    break;
            }
            return s3q0.a;
        }
    }

    public VKEnhancedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.m = new bpn0(new vqf0(9));
        this.n = new jwx(2, 1);
        this.o = new jwx(2, 15);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.a = RoundingParams.RoundingMethod.BITMAP_ONLY;
        this.p = roundingParams;
        this.q = new bp10.a();
        this.r = new bp10.b();
        this.s = true;
        this.t = true;
        this.w = true;
        this.z = new xuj(0);
        this.A = ArcStyle.ARC_NONE;
        this.B = new a();
        this.C = new a();
        this.D = new a(null, new e(1, this, VKEnhancedImageView.class, "applyScaleType", "applyScaleType(Lcom/vk/core/util/measure/ScaleType;)V", 0));
        this.M = msy.a(LazyThreadSafetyMode.NONE, new hbj0(this, 16));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.q, 0, 0);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        if (com.vk.toggle.d.D()) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer = NetworkPerformanceMeasurer.a;
            d networkClassChangedListener = getNetworkClassChangedListener();
            networkPerformanceMeasurer.getClass();
            NetworkPerformanceMeasurer.a(networkClassChangedListener);
        }
    }

    public static void c1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((fxj0) it.next()).getUrl().length() == 0) {
                tv4.b("Url should not be empty", com.vk.metrics.eventtracking.b.a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (xsna.brm0.B(r0.getUrl(), "http", false) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImageRequest getFallbackRequest() {
        ImageQualitySuppressionLevel imageQualitySuppressionLevel;
        bp10.b bVar = this.r;
        int i = bVar.a;
        int i2 = bVar.b;
        List<? extends fxj0> list = this.F;
        List<? extends fxj0> list2 = list;
        fxj0 T0 = T0((list2 == null || list2.isEmpty()) ? null : list, i, i2, true, false);
        if (T0 == null) {
            List<? extends fxj0> list3 = this.G;
            if (list3 != null) {
                sr10 sr10Var = dy2.a;
                if (sr10Var == null || (imageQualitySuppressionLevel = sr10Var.d()) == null) {
                    imageQualitySuppressionLevel = ImageQualitySuppressionLevel.NONE;
                }
                T0 = kq01.k(list3, i, imageQualitySuppressionLevel.h(), true);
                if (T0 != null) {
                    if (!mcr0.p(T0.getUrl())) {
                    }
                }
            }
            T0 = null;
        }
        if (T0 == null) {
            return null;
        }
        ktc0 highResPostPostprocessor = getHighResPostPostprocessor();
        if (highResPostPostprocessor == null) {
            highResPostPostprocessor = getLowResPostPostprocessor();
        }
        ImageRequestBuilder r = kq01.r(T0, i, i2, this.w, getScaleType());
        r.k = highResPostPostprocessor;
        return r.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final d getNetworkClassChangedListener() {
        return (d) this.M.getValue();
    }

    private final boolean getUseThumbHash() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        setMaximumWidth(typedArray.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(typedArray.getDimensionPixelSize(1, Integer.MAX_VALUE));
        if (typedArray.hasValue(9)) {
            setIsCircle(typedArray.getBoolean(9, false));
        }
        if (typedArray.hasValue(3)) {
            setCornerRadius(typedArray.getDimensionPixelSize(3, iah0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        }
        int i = typedArray.getInt(8, ScaleType.CENTER_INSIDE.h());
        ScaleType.Companion.getClass();
        setScaleType(ScaleType.a.a(i));
        setAspectRatio(typedArray.getFloat(2, -1.0f));
        setPlaceholder(typedArray.getDrawable(10));
        setEmptyPlaceholder(typedArray.getDrawable(5));
        setBgFillDrawable(typedArray.getDrawable(7));
        boolean z = typedArray.getBoolean(4, false);
        this.L = z;
        if (z) {
            getHierarchy().q(0);
        }
        setFadeDuration(typedArray.getInt(6, 300));
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
    }

    @Override // com.vk.imageloader.view.VKImageView
    public final void K0(ojt ojtVar) {
        ojtVar.q = this.p;
    }

    @Override // com.vk.imageloader.view.VKImageView
    public final void S0(ktc0 ktc0Var) {
        if (ktc0Var == null) {
            ktc0Var = this.n;
        }
        super.S0(ktc0Var);
    }

    public final fxj0 T0(List<? extends fxj0> list, int i, int i2, boolean z, boolean z2) {
        ImageQualitySuppressionLevel imageQualitySuppressionLevel;
        if (list == null) {
            return null;
        }
        sr10 sr10Var = dy2.a;
        if (!(sr10Var != null ? sr10Var.c() : true)) {
            gzs<Boolean> gzsVar = this.v;
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
        if (!this.w) {
            return ixj0.b(list);
        }
        List<? extends fxj0> list2 = list;
        fxj0 c2 = ixj0.c(list2, i, i2);
        return c2 == null ? ixj0.b(list2) : c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void U0(int i, int i2) {
        ImageRequest imageRequest;
        ImageRequest imageRequest2;
        ma80 ma80Var;
        String str;
        b bVar;
        List<? extends fxj0> list = this.F;
        int i3 = 1;
        Object[] objArr = list == null || list.isEmpty();
        List<? extends fxj0> list2 = this.G;
        Object[] objArr2 = list2 == null || list2.isEmpty();
        if (objArr == true && objArr2 == true) {
            return;
        }
        fxj0 T0 = T0(this.F, i, i2, false, false);
        this.H = T0;
        ImageRequest imageRequest3 = null;
        imageRequest3 = null;
        imageRequest3 = null;
        if (T0 != null) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer = NetworkPerformanceMeasurer.a;
            String url = T0.getUrl();
            networkPerformanceMeasurer.getClass();
            NetworkPerformanceMeasurer.c(url);
            getBackend().Z(T0.getUrl());
            ImageRequestBuilder r = kq01.r(T0, i, i2, this.w, getScaleType());
            r.k = getHighResPostPostprocessor();
            r.l = new hhs(Quality.SUITABLE, new srq0(this, i3));
            imageRequest = r.a();
        } else {
            imageRequest = null;
        }
        fxj0 T02 = T0(this.G, i, i2, false, false);
        this.I = T02;
        sa30.L(this, T02 != null ? T02.getUrl() : null);
        if (T02 != null) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer2 = NetworkPerformanceMeasurer.a;
            String url2 = T02.getUrl();
            networkPerformanceMeasurer2.getClass();
            NetworkPerformanceMeasurer.c(url2);
            getBackend().Z(T02.getUrl());
            ImageRequestBuilder r2 = kq01.r(T02, i, i2, this.w, getScaleType());
            r2.k = getHighResPostPostprocessor();
            r2.j = Priority.MEDIUM;
            r2.l = new hhs(Quality.SUITABLE, new lbc0(this, 25));
            imageRequest2 = r2.a();
        } else {
            imageRequest2 = null;
        }
        boolean useThumbHash = getUseThumbHash();
        ktc0 ktc0Var = this.o;
        if (!useThumbHash || (str = getBackend().I) == null || drm0.N(str)) {
            Pair m = kq01.m(this.G);
            if (m != null) {
                fxj0 fxj0Var = (fxj0) m.d();
                Quality quality = (Quality) m.g();
                if (quality != null && (ma80Var = this.u) != null) {
                    ma80Var.a(quality);
                }
                if (!uiw.a(fxj0Var.getUrl())) {
                    ktc0Var = getLowResPostPostprocessor();
                }
                ImageRequestBuilder r3 = kq01.r(fxj0Var, i2, i, this.w, getScaleType());
                r3.k = ktc0Var;
                r3.j = Priority.HIGH;
                if (quality == null) {
                    quality = Quality.LOWEST;
                }
                r3.l = new hhs(quality, new v5n0(this, 8));
                ImageRequest a2 = r3.a();
                fxj0 fxj0Var2 = brm0.B(fxj0Var.getUrl(), "http", false) ? fxj0Var : null;
                if (fxj0Var2 != null) {
                    getBackend().Z(fxj0Var2.getUrl());
                }
                imageRequest3 = a2;
            }
        } else {
            String str2 = getBackend().I;
            fxj0 fxj0Var3 = this.I;
            String url3 = fxj0Var3 != null ? fxj0Var3.getUrl() : null;
            if (url3 == null || !mcr0.p(url3)) {
                if (str2 != null) {
                    bpn0 bpn0Var = uiw.a;
                    bVar = new b(i5s.a(new StringBuilder(), uiw.b, str2));
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    ImageRequestBuilder r4 = kq01.r(bVar, i2, i, this.w, getScaleType());
                    r4.k = ktc0Var;
                    r4.j = Priority.LOW;
                    r4.l = new hhs(Quality.LOWEST, new pwh0(this, 17));
                    imageRequest3 = r4.a();
                }
            }
        }
        getBackend().c0(imageRequest2, imageRequest3, imageRequest);
    }

    public final void W0() {
        bp10.b bVar = this.r;
        int i = bVar.c;
        boolean z = i > 0 && bVar.d > 0;
        boolean z2 = i == 0 && bVar.d == 0 && isImageLoaded();
        boolean z3 = bVar.a > 0 && bVar.b > 0 && getVisibility() == 0;
        if (this.s && z3) {
            if (z || z2) {
                U0(bVar.a, bVar.b);
                this.s = false;
            }
        }
    }

    public final void X0(boolean z) {
        VKEnhancedImageView vKEnhancedImageView;
        boolean z2;
        fxj0 fxj0Var;
        if (isAttachedToWindow() && isImageLoaded() && (this.H != null || this.I != null)) {
            List<? extends fxj0> list = this.F;
            if (list != null) {
                vKEnhancedImageView = this;
                z2 = z;
                fxj0Var = vKEnhancedImageView.T0(list, getWidth(), getHeight(), false, z2);
            } else {
                vKEnhancedImageView = this;
                z2 = z;
                fxj0Var = null;
            }
            List<? extends fxj0> list2 = vKEnhancedImageView.G;
            fxj0 T0 = list2 != null ? vKEnhancedImageView.T0(list2, getWidth(), getHeight(), false, z2) : null;
            fxj0 fxj0Var2 = vKEnhancedImageView.H;
            if (fxj0Var2 != null && fxj0Var != null && fxj0Var2.getWidth() < fxj0Var.getWidth()) {
                vKEnhancedImageView.s = true;
                U0(getWidth(), getHeight());
                return;
            }
            fxj0 fxj0Var3 = vKEnhancedImageView.I;
            if (fxj0Var3 == null || T0 == null || fxj0Var3.getWidth() >= T0.getWidth()) {
                return;
            }
            vKEnhancedImageView.s = true;
            U0(getWidth(), getHeight());
        }
    }

    public final void Y0(int i, int i2, int i3, int i4) {
        this.y = false;
        this.z.b(0, 0);
        this.A = ArcStyle.ARC_NONE;
        xuj xujVar = this.z;
        xujVar.a = i;
        xujVar.b = i2;
        xujVar.c = i3;
        xujVar.d = i4;
        this.t = true;
        invalidate();
    }

    public final void Z0(List<? extends fxj0> list, List<? extends fxj0> list2) {
        List<? extends fxj0> list3;
        if (list != null) {
            c1(list);
        }
        if (list2 != null) {
            c1(list2);
        }
        this.F = list;
        fxj0 fxj0Var = null;
        this.H = null;
        this.G = list2;
        this.I = null;
        boolean z = false;
        if (mcr0.i) {
            if (list2 != null) {
                for (fxj0 fxj0Var2 : list2) {
                    if (uiw.a(fxj0Var2.getUrl())) {
                        fxj0Var = fxj0Var2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (fxj0Var != null) {
                fxj0 b2 = ixj0.b(this.G);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Image(b2 != null ? b2.getWidth() : 100, b2 != null ? b2.getHeight() : 100, fxj0Var.getUrl(), false));
                this.G = arrayList;
            }
        }
        List<? extends fxj0> list4 = list;
        if ((list4 == null || list4.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            z = true;
        }
        getHierarchy().p(z ? this.K : this.J, 1);
        this.s = true;
        requestLayout();
        invalidate();
    }

    public final void a1(int i, int i2) {
        boolean z = this.y;
        RoundingParams roundingParams = this.p;
        if (z) {
            roundingParams.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            roundingParams.b = true;
            getHierarchy().u(roundingParams);
            return;
        }
        ArcStyle arcStyle = this.A;
        if (arcStyle == ArcStyle.ARC_NONE) {
            if (this.z.a()) {
                roundingParams.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                roundingParams.b = false;
                getHierarchy().u(roundingParams);
                return;
            } else {
                roundingParams.b = false;
                xuj xujVar = this.z;
                roundingParams.e(xujVar.a, xujVar.b, xujVar.d, xujVar.c);
                getHierarchy().u(roundingParams);
                return;
            }
        }
        roundingParams.b = false;
        ArcStyle.Companion.getClass();
        switch (ArcStyle.a.C0888a.$EnumSwitchMapping$0[arcStyle.ordinal()]) {
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
        getHierarchy().u(roundingParams);
    }

    @Override // xsna.zjt
    public final void clear() {
        super.clear();
        Z0(null, null);
    }

    public final ArcStyle getArc() {
        return this.A;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return getHierarchy().d.getColorFilter();
    }

    public final xuj getCorners() {
        return this.z;
    }

    public final fxj0 getCurrentLocalImage() {
        return this.H;
    }

    public final fxj0 getCurrentRemoteImage() {
        return this.I;
    }

    public final long getFadeDuration() {
        return getHierarchy().e.m;
    }

    public final gzs<Boolean> getIgnoreTrafficSaverPredicate() {
        return this.v;
    }

    public final List<fxj0> getLocalImageList() {
        return this.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMaximumHeight() {
        qcy<Object> qcyVar = N[1];
        return ((Number) this.C.c).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMaximumWidth() {
        qcy<Object> qcyVar = N[0];
        return ((Number) this.B.c).intValue();
    }

    public final List<fxj0> getRemoteImageList() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ImageView
    public final ScaleType getScaleType() {
        qcy<Object> qcyVar = N[2];
        return (ScaleType) this.D.c;
    }

    public final boolean getSimpleAspectRatio() {
        return this.x;
    }

    public final boolean getWithImageDownscale() {
        return this.w;
    }

    @Override // com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.x && getAspectRatio() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.t) {
                a1((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            }
            this.t = false;
            super.onDraw(canvas);
            return;
        }
        boolean z = this.t;
        bp10.b bVar = this.r;
        if (z) {
            a1(bVar.c, bVar.d);
        }
        this.t = false;
        if (!bVar.a() && (drawable = this.E) != null) {
            drawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        if (this.x && getAspectRatio() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = (i3 - i) - getPaddingRight();
            int paddingBottom = (i4 - i2) - getPaddingBottom();
            Drawable topLevelDrawable = getTopLevelDrawable();
            if (topLevelDrawable != null) {
                topLevelDrawable.setBounds(paddingLeft, paddingTop, paddingRight, paddingBottom);
                return;
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        int paddingRight2 = (i3 - i) - getPaddingRight();
        int paddingBottom2 = (i4 - i2) - getPaddingBottom();
        int b2 = x9.b(paddingRight2, paddingLeft2, 2, paddingLeft2);
        int b3 = x9.b(paddingBottom2, paddingTop2, 2, paddingTop2);
        bp10.b bVar = this.r;
        int i5 = bVar.c;
        int i6 = bVar.d;
        if (this.E != null && !bVar.a() && (drawable = this.E) != null) {
            drawable.setBounds(paddingLeft2, paddingTop2, paddingRight2, paddingBottom2);
        }
        if (!this.z.a()) {
            ScaleType scaleType = getScaleType();
            int i7 = scaleType == null ? -1 : c.$EnumSwitchMapping$0[scaleType.ordinal()];
            if (i7 == 1 || i7 == 2) {
                paddingLeft2 = b2 - (i5 / 2);
                paddingTop2 = b3 - (i6 / 2);
            } else if (i7 != 3) {
                if (i7 == 4) {
                    paddingLeft2 = paddingRight2 - i5;
                    paddingTop2 = paddingBottom2 - i6;
                }
            }
            paddingRight2 = paddingLeft2 + i5;
            paddingBottom2 = paddingTop2 + i6;
        }
        Drawable topLevelDrawable2 = getTopLevelDrawable();
        if (topLevelDrawable2 != null) {
            topLevelDrawable2.setBounds(paddingLeft2, paddingTop2, paddingRight2, paddingBottom2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        fxj0 b2;
        int width;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel2;
        if (this.x && getAspectRatio() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float aspectRatio = getAspectRatio();
            int size = View.MeasureSpec.getSize(i);
            float f = size;
            int ceil = (int) Math.ceil(f / aspectRatio);
            int maximumHeight = getMaximumHeight();
            if (1 <= maximumHeight && maximumHeight < ceil) {
                float f2 = ceil;
                float maximumHeight2 = getMaximumHeight() / f2;
                ceil = (int) (f2 * maximumHeight2);
                size = (int) (f * maximumHeight2);
            }
            int maximumWidth = getMaximumWidth();
            if (1 <= maximumWidth && maximumWidth < size) {
                float f3 = size;
                float maximumWidth2 = getMaximumWidth() / f3;
                ceil = (int) (ceil * maximumWidth2);
                size = (int) (f3 * maximumWidth2);
            }
            setMeasuredDimension(size, ceil);
            W0();
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int maximumWidth3 = getMaximumWidth();
        int maximumHeight3 = getMaximumHeight();
        ScaleType scaleType = getScaleType();
        float aspectRatio2 = getAspectRatio();
        if (suggestedMinimumWidth > maximumWidth3) {
            throw new IllegalStateException("minWidth is greater than maxWidth");
        }
        if (suggestedMinimumHeight > maximumHeight3) {
            throw new IllegalStateException("minHeight is greater than maxHeight");
        }
        sr10 sr10Var = dy2.a;
        if (!(sr10Var != null ? sr10Var.c() : true)) {
            gzs<Boolean> gzsVar = this.v;
            if (!(gzsVar != null ? gzsVar.invoke().booleanValue() : false)) {
                List<? extends fxj0> list = this.F;
                int v = iah0.v();
                sr10 sr10Var2 = dy2.a;
                if (sr10Var2 == null || (imageQualitySuppressionLevel = sr10Var2.d()) == null) {
                    imageQualitySuppressionLevel = ImageQualitySuppressionLevel.NONE;
                }
                b2 = kq01.k(list, v, imageQualitySuppressionLevel.h(), false);
                if (b2 == null) {
                    List<? extends fxj0> list2 = this.G;
                    int v2 = iah0.v();
                    sr10 sr10Var3 = dy2.a;
                    if (sr10Var3 == null || (imageQualitySuppressionLevel2 = sr10Var3.d()) == null) {
                        imageQualitySuppressionLevel2 = ImageQualitySuppressionLevel.NONE;
                    }
                    b2 = kq01.k(list2, v2, imageQualitySuppressionLevel2.h(), false);
                }
                width = b2 == null ? b2.getWidth() : 0;
                if (width < 200) {
                    width = 200;
                }
                bp10.a aVar = this.q;
                aVar.a = width;
                int height = b2 != null ? b2.getHeight() : 0;
                aVar.b = height >= 200 ? height : 200;
                aVar.c = i;
                aVar.d = i2;
                aVar.e = suggestedMinimumWidth;
                aVar.f = suggestedMinimumHeight;
                aVar.g = maximumWidth3;
                aVar.h = maximumHeight3;
                aVar.i = paddingRight;
                aVar.j = paddingBottom;
                aVar.k = scaleType;
                aVar.l = aspectRatio2;
                bp10.b bVar = this.r;
                bp10.d(aVar, bVar);
                setMeasuredDimension(bVar.a, bVar.b);
                W0();
            }
        }
        b2 = ixj0.b(this.F);
        if (b2 == null) {
            b2 = ixj0.b(this.G);
        }
        if (b2 == null) {
        }
        if (width < 200) {
        }
        bp10.a aVar2 = this.q;
        aVar2.a = width;
        if (b2 != null) {
        }
        aVar2.b = height >= 200 ? height : 200;
        aVar2.c = i;
        aVar2.d = i2;
        aVar2.e = suggestedMinimumWidth;
        aVar2.f = suggestedMinimumHeight;
        aVar2.g = maximumWidth3;
        aVar2.h = maximumHeight3;
        aVar2.i = paddingRight;
        aVar2.j = paddingBottom;
        aVar2.k = scaleType;
        aVar2.l = aspectRatio2;
        bp10.b bVar2 = this.r;
        bp10.d(aVar2, bVar2);
        setMeasuredDimension(bVar2.a, bVar2.b);
        W0();
    }

    public final void setBgFillDrawable(int i) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        setBgFillDrawable(m33.a(i, context));
    }

    @Override // android.widget.ImageView, xsna.msx0
    public void setColorFilter(ColorFilter colorFilter) {
        getHierarchy().d.setColorFilter(colorFilter);
        invalidate();
    }

    public final void setCornerRadius(xuj xujVar) {
        Y0(xujVar.a, xujVar.b, xujVar.c, xujVar.d);
    }

    public final void setCorners(xuj xujVar) {
        this.z = xujVar;
    }

    public final void setCurrentLocalImage(fxj0 fxj0Var) {
        this.H = fxj0Var;
    }

    public final void setCurrentRemoteImage(fxj0 fxj0Var) {
        this.I = fxj0Var;
    }

    public final void setEmptyPlaceholder(Drawable drawable) {
        this.K = drawable;
    }

    public final void setFadeDuration(final int i) {
        if (!this.L) {
            getHierarchy().q(i);
            return;
        }
        final WeakReference weakReference = new WeakReference(this);
        b0g b0gVar = b0g.a;
        b0g.a(new b0g.a() { // from class: xsna.obr0
            @Override // xsna.b0g.a
            public final void a() {
                njt hierarchy;
                qcy<Object>[] qcyVarArr = VKEnhancedImageView.N;
                VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) weakReference.get();
                if (vKEnhancedImageView == null || (hierarchy = vKEnhancedImageView.getHierarchy()) == null) {
                    return;
                }
                hierarchy.q(i);
            }
        });
    }

    public final void setIgnoreTrafficSaverPredicate(gzs<Boolean> gzsVar) {
        this.v = gzsVar;
    }

    public final void setIsCircle(boolean z) {
        this.y = false;
        this.z.b(0, 0);
        this.A = ArcStyle.ARC_NONE;
        this.y = z;
        this.t = true;
        invalidate();
    }

    public final void setLocalImage(fxj0 fxj0Var) {
        if (fxj0Var == null) {
            Z0(null, this.G);
        } else {
            Z0(Collections.singletonList(fxj0Var), this.G);
        }
    }

    public final void setLocalImageList(List<? extends fxj0> list) {
        this.F = list;
    }

    public final void setMaximumHeight(int i) {
        qcy<Object> qcyVar = N[1];
        this.C.a(this, Integer.valueOf(i));
    }

    public final void setMaximumWidth(int i) {
        qcy<Object> qcyVar = N[0];
        this.B.a(this, Integer.valueOf(i));
    }

    public final void setOnQualityChangeCallback(ma80 ma80Var) {
        this.u = ma80Var;
    }

    public final void setPlaceholder(int i) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        this.J = m33.a(i, context);
        getHierarchy().p(this.J, 1);
    }

    public final void setRemoteImage(List<? extends fxj0> list) {
        if (list == null) {
            Z0(this.F, null);
        } else {
            Z0(this.F, list);
        }
    }

    public final void setRemoteImageList(List<? extends fxj0> list) {
        this.G = list;
    }

    public final void setScaleType(ScaleType scaleType) {
        qcy<Object> qcyVar = N[2];
        this.D.a(this, scaleType);
    }

    public final void setSimpleAspectRatio(boolean z) {
        this.x = z;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.s = true;
    }

    public final void setVisible(boolean z) {
        bwt0.p0(this, z);
    }

    public final void setWithImageDownscale(boolean z) {
        this.w = z;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == getTopLevelDrawable() || drawable == this.E || super.verifyDrawable(drawable);
    }

    @Override // xsna.zjt
    public final void x0() {
        super.x0();
        X0(false);
    }

    public final void setRemoteImage(String str) {
        setRemoteImage(new Image(-1, -1, str, false));
    }

    public final void setBgFillDrawable(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            unscheduleDrawable(drawable2);
            drawable2.setCallback(null);
        }
        this.E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
        invalidate();
    }

    public final void setLocalImage(List<? extends fxj0> list) {
        Z0(list, this.G);
    }

    public final void setRemoteImage(Iterable<? extends fxj0> iterable) {
        setRemoteImage(iterable != null ? j5g.O0(iterable) : null);
    }

    public final void setLocalImage(Iterable<? extends fxj0> iterable) {
        setLocalImage(iterable != null ? j5g.O0(iterable) : null);
    }

    public final void setRemoteImage(fxj0 fxj0Var) {
        if (fxj0Var == null) {
            Z0(this.F, null);
        } else {
            Z0(this.F, Collections.singletonList(fxj0Var));
        }
    }

    public final void setCornerRadius(int i) {
        this.y = false;
        this.z.b(0, 0);
        this.A = ArcStyle.ARC_NONE;
        this.z.b(i, 15);
        this.t = true;
        invalidate();
    }

    public final void setPlaceholder(Drawable drawable) {
        this.J = drawable;
        getHierarchy().p(this.J, 1);
    }

    public VKEnhancedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
