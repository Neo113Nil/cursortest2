package com.vk.geo.impl.presentation;

import android.app.Application;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzbp;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.themes.VKTheme;
import com.vk.geo.api.GeoFragmentOptions;
import com.vk.geo.api.data.GeoStaticPreviewInput;
import com.vk.geo.api.data.IconDrawConfig;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.ZoomLevel;
import com.vk.geo.impl.model.id.StringId;
import com.vk.geo.impl.presentation.a;
import com.vk.geo.impl.presentation.e;
import com.vk.geo.impl.presentation.h;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.permission.PermissionHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.akt;
import xsna.b1h;
import xsna.b6l;
import xsna.bdn;
import xsna.bev;
import xsna.bpn0;
import xsna.brm0;
import xsna.cev;
import xsna.cfe0;
import xsna.cnt;
import xsna.cpv;
import xsna.dhr0;
import xsna.do00;
import xsna.drg;
import xsna.efe0;
import xsna.epx;
import xsna.eyx;
import xsna.fh50;
import xsna.fnt;
import xsna.fpf0;
import xsna.gkt;
import xsna.gqr;
import xsna.gu0;
import xsna.gzs;
import xsna.hah0;
import xsna.hkt;
import xsna.hl1;
import xsna.hpj;
import xsna.hqu0;
import xsna.i37;
import xsna.ie00;
import xsna.iyx;
import xsna.j270;
import xsna.jdr0;
import xsna.jgp;
import xsna.jkt;
import xsna.jnt;
import xsna.jo00;
import xsna.k270;
import xsna.k9x;
import xsna.kpz;
import xsna.ks2;
import xsna.l2l;
import xsna.lc7;
import xsna.lpz;
import xsna.m300;
import xsna.mkt;
import xsna.msy;
import xsna.myc0;
import xsna.mz;
import xsna.nkt;
import xsna.nv2;
import xsna.okt;
import xsna.omf;
import xsna.on00;
import xsna.ont;
import xsna.pce;
import xsna.pvj;
import xsna.q69;
import xsna.qb6;
import xsna.qcy;
import xsna.qqm0;
import xsna.rpv;
import xsna.s3q0;
import xsna.sf9;
import xsna.sni;
import xsna.spj;
import xsna.swe0;
import xsna.uee0;
import xsna.vf9;
import xsna.vhn0;
import xsna.vkq0;
import xsna.wa;
import xsna.wce0;
import xsna.whn0;
import xsna.wk50;
import xsna.wqf;
import xsna.wyz;
import xsna.wzs;
import xsna.x19;
import xsna.xf9;
import xsna.xu0;
import xsna.y8x;
import xsna.y98;
import xsna.yn7;
import xsna.yok0;
import xsna.yvj;
import xsna.zvj;

/* compiled from: GeoFeature.kt */
/* loaded from: classes2.dex */
public final class b extends wk50<j, jnt, com.vk.geo.impl.presentation.a, e> implements dhr0.e {
    public static final /* synthetic */ qcy<Object>[] H;
    public float A;
    public final Object B;
    public final Object C;
    public final float D;
    public final bpn0 E;
    public final AtomicReference<Triple<m300, Map<StringId, do00>, CameraBounds>> F;
    public final C1083b G;
    public final fnt f;
    public final Application g;
    public final GeoFragmentOptions h;
    public final ont i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final mkt m;
    public final hpj n;
    public final io.reactivex.rxjava3.disposables.b o;
    public final vkq0 p;
    public final AtomicReference<eyx> q;
    public yok0 r;
    public final GeoDataSet s;
    public final AtomicBoolean t;
    public final vf9 u;
    public final AtomicReference<do00> v;
    public final AtomicReference<a> w;
    public BoundingBox x;
    public jo00 y;
    public final nkt z;

    /* compiled from: GeoFeature.kt */
    public static final class a {
        public final BoundingBox a;

        /* compiled from: GeoFeature.kt */
        /* renamed from: com.vk.geo.impl.presentation.b$a$a, reason: collision with other inner class name */
        public static final class C1082a {
            public static a a(BoundingBox boundingBox, Coordinate coordinate, ZoomLevel zoomLevel, int i) {
                if ((i & 1) != 0) {
                    boundingBox = null;
                }
                if ((i & 2) != 0) {
                    coordinate = null;
                }
                if ((i & 4) != 0) {
                    zoomLevel = null;
                }
                if (boundingBox == null && (coordinate == null || zoomLevel == null)) {
                    return null;
                }
                return new a(boundingBox);
            }
        }

        public a(BoundingBox boundingBox) {
            this.a = boundingBox;
        }
    }

    /* compiled from: GeoFeature.kt */
    /* renamed from: com.vk.geo.impl.presentation.b$b, reason: collision with other inner class name */
    public final class C1083b implements gzs<s3q0> {
        public final boolean b;
        public CameraBounds c;

        public C1083b(boolean z) {
            this.b = z;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            b bVar = b.this;
            try {
                CameraBounds cameraBounds = this.c;
                if (cameraBounds != null) {
                    bVar.u.b(cameraBounds);
                    bVar.A = bVar.V(cameraBounds);
                    if (this.b) {
                        bVar.Z(bVar.s.b().b, this.c);
                    }
                }
                return s3q0.a;
            } finally {
                this.c = null;
            }
        }
    }

    /* compiled from: GeoFeature.kt */
    @b6l(c = "com.vk.geo.impl.presentation.GeoFeature$onThemeChanged$1", f = "GeoFeature.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ VKTheme $theme;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(VKTheme vKTheme, b bVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$theme = vKTheme;
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$theme, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map map;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            IconDrawConfig iconDrawConfig = this.$theme.b ? IconDrawConfig.y : IconDrawConfig.z;
            rpv X = this.this$0.X();
            X.getClass();
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{iconDrawConfig});
            }
            if (!epx.f(X.f.b, iconDrawConfig)) {
                X.f = X.c ? new j270(X.f.a, iconDrawConfig, new k270(iconDrawConfig)) : new bev(X.e, X.f.a, iconDrawConfig, new cev(iconDrawConfig));
            }
            this.this$0.X().a(false);
            do00 do00Var = this.this$0.v.get();
            if (do00Var != null) {
                String str = do00Var.b;
                VisibleStyle a = qqm0.a(this.this$0.s.b().e, str);
                int G = VisibleStyle.G(a != null ? a.b : 1);
                akt aktVar = this.this$0.s.b().d.get(new StringId(str));
                if (aktVar != null) {
                    this.this$0.g.getResources();
                    aktVar.c();
                }
                this.this$0.X().f(do00Var, G, null);
                this.this$0.X().f(do00Var, VisibleStyle.R(G), null);
                qqm0.b(this.this$0.s.b().e, str, G);
                map = on00.f(new Pair(new StringId(str), do00Var));
                this.this$0.f.b(new h.g(do00Var, G));
            } else {
                map = jgp.b;
            }
            b.b0(this.this$0, map, null, 2);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(b.class, "mapSize", "getMapSize-OO21N7I()J", 0);
        fpf0.a.getClass();
        H = new qcy[]{mutablePropertyReference1Impl};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(okt oktVar) {
        super(null, new g(jnt.f));
        BoundingBox boundingBox;
        Double d;
        boolean z;
        BoundingBox boundingBox2;
        vkq0 vkq0Var;
        List<GeoStaticPreviewInput.Item> list;
        a aVar;
        BoundingBox boundingBox3;
        BoundingBox boundingBox4 = oktVar.f;
        this.f = new fnt();
        this.g = oktVar.a;
        GeoFragmentOptions geoFragmentOptions = oktVar.c;
        this.h = geoFragmentOptions;
        this.i = oktVar.d;
        this.j = oktVar.h;
        this.k = oktVar.g;
        this.l = oktVar.i;
        mkt mktVar = new mkt(pvj.a.b);
        this.m = mktVar;
        vhn0 a2 = whn0.a();
        bdn bdnVar = bdn.a;
        this.n = zvj.a(d.a.a(a2, ie00.a.U()).plus(mktVar));
        this.o = new io.reactivex.rxjava3.disposables.b();
        this.q = new AtomicReference<>();
        int i = 18;
        this.s = new GeoDataSet(new wqf(this, 22), new gu0(i));
        this.t = new AtomicBoolean(false);
        this.u = new vf9();
        this.v = new AtomicReference<>(null);
        AtomicReference<a> atomicReference = new AtomicReference<>(null);
        this.w = atomicReference;
        this.z = new nkt(new y8x(y8x.a(0, 0)), this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.B = msy.a(lazyThreadSafetyMode, new pce(oktVar, 28));
        this.C = msy.a(lazyThreadSafetyMode, new ks2(13, oktVar, this));
        new bpn0(hkt.b);
        this.D = 0.01f;
        this.E = new bpn0(new b1h(this, i));
        BoundingBox boundingBox5 = BoundingBox.f;
        this.F = new AtomicReference<>(null);
        L.e(new Object[0]);
        boolean z2 = geoFragmentOptions != null ? geoFragmentOptions.d : true;
        if (boundingBox4 == null) {
            boundingBox = okt.j;
            if (geoFragmentOptions != null) {
                boundingBox = null;
            }
        } else {
            boundingBox = boundingBox4;
        }
        if (boundingBox == okt.j) {
            this.x = boundingBox5;
            z = z2;
        } else {
            if (geoFragmentOptions == null) {
                loop2: while (true) {
                    a aVar2 = atomicReference.get();
                    if (boundingBox4 == null) {
                        boundingBox2 = okt.j;
                        if (geoFragmentOptions != null) {
                            boundingBox2 = null;
                        }
                    } else {
                        boundingBox2 = boundingBox4;
                    }
                    a a3 = a.C1082a.a(boundingBox2, null, null, 6);
                    while (!atomicReference.compareAndSet(aVar2, a3)) {
                        if (atomicReference.get() != aVar2) {
                            break;
                        }
                    }
                }
                if (boundingBox4 == null) {
                    boundingBox4 = okt.j;
                    if (geoFragmentOptions != null) {
                        boundingBox4 = null;
                    }
                }
                this.x = boundingBox4;
            } else {
                yn7 yn7Var = new yn7(3, this, oktVar);
                Double d2 = geoFragmentOptions.e;
                if (d2 != null && (d = geoFragmentOptions.f) != null) {
                    yn7Var.invoke(d2, d);
                }
            }
            z = false;
        }
        GeoFragmentOptions geoFragmentOptions2 = this.h;
        int i2 = 16;
        if (geoFragmentOptions2 == null || !geoFragmentOptions2.b) {
            vkq0Var = new vkq0(this.g, this.n, geoFragmentOptions2 != null ? geoFragmentOptions2.c : true, z, new xu0(i2), new q69(this.f, 7), new i37(this.f, 9));
        } else {
            vkq0Var = null;
        }
        this.p = vkq0Var;
        L.e("init");
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        final omf omfVar = new omf(this, 20);
        final vf9 vf9Var = this.u;
        final float f = this.D;
        qb6 qb6Var = new qb6(12, this, ref$FloatRef);
        vf9Var.getClass();
        vf9Var.c = new sf9(vf9Var, f, omfVar, qb6Var);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        hpj hpjVar = this.n;
        nv2 nv2Var = new nv2(21, this, ref$ObjectRef);
        l2l<CameraBounds> l2lVar = vf9Var.a;
        if (l2lVar != null) {
            L.e(new Object[0]);
            l2lVar.d = true;
        }
        vf9Var.a = new l2l<>("CameraBoundsObserver", 200L, new l2l.a() { // from class: xsna.tf9
            @Override // xsna.l2l.a
            public final boolean a(Object obj, Object obj2, rp70 rp70Var) {
                CameraBounds cameraBounds = (CameraBounds) obj;
                CameraBounds cameraBounds2 = (CameraBounds) obj2;
                vf9 vf9Var2 = vf9.this;
                l2l<CameraBounds> l2lVar2 = vf9Var2.a;
                AtomicReference<CameraBounds> atomicReference2 = vf9Var2.d;
                boolean z3 = false;
                if (l2lVar2 == null) {
                    return false;
                }
                AtomicReference<CameraBounds> atomicReference3 = vf9Var2.h;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"fired items = [old=" + cameraBounds2 + ',' + rp70.h(rp70Var, null, 63) + ']'});
                }
                Object[] objArr = rp70Var.a;
                int i3 = rp70Var.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    CameraBounds cameraBounds3 = (CameraBounds) objArr[i4];
                    if (cameraBounds3 != cameraBounds && cameraBounds3 != cameraBounds2) {
                        xf9 xf9Var = xf9.e;
                        xf9Var.g(cameraBounds3, l2lVar2);
                        if (atomicReference2.get() != cameraBounds) {
                            xf9Var.g(cameraBounds3, vf9Var2);
                        }
                    }
                }
                if (epx.f(cameraBounds, cameraBounds2) || (cameraBounds2 != null && !vf9Var2.a(cameraBounds, cameraBounds2, f, omfVar, true))) {
                    z3 = true;
                }
                boolean z4 = !z3;
                CameraBounds cameraBounds4 = atomicReference3.get();
                if (cameraBounds4 != null && cameraBounds4 != l2lVar2.l) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.w, new Object[]{"prevNewItem: prev new item is not equal to debouncer.olditem; prevNewItem = " + atomicReference3 + "; debouncer.oldItem=" + l2lVar2.l});
                    }
                }
                L l3 = L.a;
                l3.getClass();
                LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget)) {
                    L.u(l3, L.LogType.d, new Object[]{"check: new = " + cameraBounds + ", old = " + cameraBounds2});
                }
                if (!z3) {
                    atomicReference3.set(cameraBounds);
                    xf9 xf9Var2 = xf9.e;
                    xf9.d(xf9Var2, cameraBounds, l2lVar2);
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l3, L.LogType.d, new Object[]{"handleDebounce ok: new=" + cameraBounds + ", old=" + cameraBounds2});
                    }
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l3, L.LogType.d, new Object[]{xf9Var2});
                    }
                    nv2 nv2Var2 = vf9Var2.b;
                    if (nv2Var2 != null) {
                        nv2Var2.invoke(cameraBounds);
                    }
                    if (cameraBounds != atomicReference2.get()) {
                        xf9Var2.g(cameraBounds, l2lVar2);
                    }
                    CameraBounds cameraBounds5 = l2lVar2.l;
                    if (cameraBounds5 != null) {
                        if (cameraBounds5 != cameraBounds) {
                            xf9Var2.h(cameraBounds5, l2lVar2);
                            return z4;
                        }
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l3, L.LogType.d, new Object[]{"oldItem equal current new item " + cameraBounds5});
                        }
                    }
                }
                return z4;
            }
        });
        vf9Var.b = nv2Var;
        iyx.f(hpjVar.b).E(new mz(vf9Var, i2));
        ont ontVar = this.i;
        if (ontVar != null) {
            AtomicReference<a> atomicReference2 = this.w;
            L.e(new Object[0]);
            BoundingBox boundingBox6 = ontVar.c;
            if (boundingBox6 != null) {
                loop0: while (true) {
                    a aVar3 = atomicReference2.get();
                    a a4 = a.C1082a.a(boundingBox6, null, null, 6);
                    while (!atomicReference2.compareAndSet(aVar3, a4)) {
                        if (atomicReference2.get() != aVar3) {
                            break;
                        }
                    }
                }
                this.x = boundingBox6;
            }
            GeoStaticPreviewInput geoStaticPreviewInput = ontVar.b;
            if (geoStaticPreviewInput != null && (list = geoStaticPreviewInput.i) != null) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"items.size = " + list.size()});
                }
                if (!list.isEmpty() && (aVar = atomicReference2.get()) != null && (boundingBox3 = aVar.a) != null) {
                    wa waVar = new wa(this, boundingBox3, list, ontVar, 2);
                    if (list.size() < 80) {
                        waVar.invoke(null);
                    } else {
                        x19.v(this.q, this.n, hqu0.a(), new jkt(waVar, null), 4);
                    }
                }
            }
        }
        myc0.h(this.n, hqu0.a(), null, new gkt(this, null), 2);
        dhr0.f(this);
        this.G = new C1083b(false);
        new C1083b(true);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final Object U(b bVar, Map map, spj spjVar) {
        bVar.getClass();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"urls.size=" + map.size()});
        }
        if (map.isEmpty()) {
            return s3q0.a;
        }
        lpz lpzVar = (lpz) bVar.C.getValue();
        lpzVar.getClass();
        Object k = myc0.k(hqu0.a(), new kpz(map, lpzVar, null), spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (k != coroutineSingletons) {
            k = s3q0.a;
        }
        return k == coroutineSingletons ? k : s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b0(b bVar, Map map, CameraBounds cameraBounds, int i) {
        if ((i & 1) != 0) {
            map = jgp.b;
        }
        if ((i & 2) != 0) {
            cameraBounds = bVar.u.d.get();
        }
        bVar.Z(map, cameraBounds);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(jnt jntVar, com.vk.geo.impl.presentation.a aVar) {
        Double d;
        Double d2;
        h hVar;
        com.vk.geo.impl.presentation.a aVar2 = aVar;
        if (aVar2 instanceof a.e) {
            jo00 jo00Var = this.y;
            if (jo00Var != null) {
                T(new e.a.c(jo00Var, null));
                this.y = null;
                return;
            }
            return;
        }
        if (aVar2 instanceof a.d) {
            long j = ((a.d) aVar2).b;
            L.e("map ready!");
            if (this.h == null) {
                this.f.b(new h.d());
            }
            this.z.setValue(this, H[0], new y8x(j));
            BoundingBox boundingBox = this.x;
            if (boundingBox != null) {
                if (boundingBox instanceof CameraBounds) {
                    CameraBounds cameraBounds = (CameraBounds) boundingBox;
                    Coordinate coordinate = new Coordinate(cameraBounds.C());
                    if (!Coordinate.g(coordinate.j())) {
                        coordinate = null;
                    }
                    if (coordinate != null) {
                        hVar = new h.f(coordinate.j(), new ZoomLevel(cameraBounds.F0()), false, 24);
                        if (hVar == null) {
                            hVar = new h.e(boundingBox);
                        }
                        this.f.b(hVar);
                        this.x = null;
                    }
                }
                hVar = null;
                if (hVar == null) {
                }
                this.f.b(hVar);
                this.x = null;
            }
            GeoFragmentOptions geoFragmentOptions = this.h;
            if (geoFragmentOptions != null && (d = geoFragmentOptions.e) != null && (d2 = geoFragmentOptions.f) != null) {
                double doubleValue = d.doubleValue();
                double doubleValue2 = d2.doubleValue();
                fnt fntVar = this.f;
                Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
                long a2 = gqr.a((float) doubleValue, (float) doubleValue2);
                GeoFragmentOptions geoFragmentOptions2 = this.h;
                Float f = geoFragmentOptions2.g;
                fntVar.b(new h.f(a2, f != null ? new ZoomLevel(f.floatValue()) : null, geoFragmentOptions2.h, 24));
                s3q0 s3q0Var = s3q0.a;
            }
            vkq0 vkq0Var = this.p;
            if (vkq0Var == null) {
                return;
            }
            Coordinate coordinate2 = vkq0Var.j;
            if (coordinate2 == null) {
                vkq0Var.c(new com.vk.geo.impl.presentation.c(this));
                return;
            }
            if (vkq0Var.d) {
                AtomicReference<a> atomicReference = this.w;
                while (true) {
                    a aVar3 = atomicReference.get();
                    a a3 = a.C1082a.a(null, coordinate2, new ZoomLevel(16.0f), 1);
                    while (!atomicReference.compareAndSet(aVar3, a3)) {
                        if (atomicReference.get() != aVar3) {
                            break;
                        }
                    }
                    this.f.b(new h.f(coordinate2.j(), new ZoomLevel(16.0f), false, 28));
                    return;
                }
            }
            return;
        }
        if (aVar2.equals(a.b.b)) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{aVar2.toString()});
            return;
        }
        if (aVar2 instanceof a.f) {
            Triple<m300, Map<StringId, do00>, CameraBounds> triple = this.F.get();
            m300 i = triple != null ? triple.i() : null;
            long j2 = ((a.f) aVar2).b;
            if (i == null) {
                return;
            }
            int i2 = m300.b;
            if (0 == j2) {
                L.d(new drg(triple, 17));
                Map<StringId, do00> g = triple.g();
                CameraBounds h = triple.h();
                this.F.set(null);
                Z(g, h);
                if (h != null) {
                    xf9.e.g(h, this);
                    return;
                }
                return;
            }
            return;
        }
        if (aVar2 instanceof a.c) {
            a.c cVar = (a.c) aVar2;
            String str = cVar.b;
            boolean z = cVar.c;
            fnt fntVar2 = this.f;
            L.e(new Object[0]);
            GeoDataSet geoDataSet = this.s;
            do00 do00Var = geoDataSet.b().b.get(new StringId(str));
            if (do00Var == null) {
                return;
            }
            String str2 = do00Var.b;
            if (this.i != null) {
                AtomicReference<do00> atomicReference2 = this.v;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"GeoFeature", "selectMarker " + ((Object) StringId.a(str2))});
                }
                do00 do00Var2 = atomicReference2.get();
                String str3 = do00Var2 != null ? do00Var2.b : null;
                if (!(str3 != null ? str3.equals(str2) : false)) {
                    if (atomicReference2.get() != null) {
                        W();
                    }
                    atomicReference2.set(do00Var);
                    VisibleStyle a4 = qqm0.a(geoDataSet.b().e, str2);
                    int G = a4 != null ? VisibleStyle.G(a4.b) : VisibleStyle.G(VisibleStyle.M(67108868));
                    if (X().c(G, str2) == null) {
                        akt aktVar = geoDataSet.b().d.get(new StringId(str2));
                        if (aktVar != null) {
                            this.g.getResources();
                            aktVar.c();
                        }
                        X().f(do00Var, G, null);
                        X().f(do00Var, VisibleStyle.R(G), null);
                    }
                    qqm0.b(geoDataSet.b().e, str2, G);
                    b0(this, on00.f(new Pair(new StringId(str2), do00Var)), null, 2);
                    fntVar2.b(new h.g(do00Var, G));
                }
                if (z) {
                    fntVar2.b(new h.f(do00Var.k, new ZoomLevel(16.0f), true, 24));
                    return;
                }
                return;
            }
            return;
        }
        if (aVar2 instanceof a.g) {
            return;
        }
        if (!(aVar2 instanceof a.h)) {
            if (!(aVar2 instanceof a.C1080a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str4 = ((a.C1080a) aVar2).b;
            do00 do00Var3 = this.v.get();
            String str5 = do00Var3 != null ? do00Var3.b : null;
            if ((str5 == null ? false : str4.equals(str5)) || this.s.b().b.get(new StringId(str4)) != null) {
                return;
            }
            lc7<StringId, cpv> lc7Var = X().i.c;
            Set<StringId> keySet = lc7Var.snapshot().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (brm0.B(((StringId) obj).b, "id=" + str4 + ';', false)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lc7Var.remove(new StringId(((StringId) it.next()).b));
            }
            return;
        }
        vkq0 vkq0Var2 = this.p;
        if (vkq0Var2 != null) {
            a.h hVar2 = (a.h) aVar2;
            if (hVar2.equals(a.h.b.b)) {
                vkq0Var2.b();
                return;
            }
            if (!(hVar2 instanceof a.h.c)) {
                if (!hVar2.equals(a.h.C1081a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionHelper permissionHelper = PermissionHelper.a;
                Application application = vkq0Var2.a;
                String[] strArr = PermissionHelper.i;
                permissionHelper.getClass();
                vkq0Var2.f.invoke(new cnt(PermissionHelper.b(application, strArr)));
                return;
            }
            boolean z2 = ((a.h.c) hVar2).b;
            vkq0Var2.f.invoke(new cnt(z2));
            if (vkq0Var2.k.get() == 2) {
                if (z2) {
                    vkq0Var2.b();
                }
                AtomicInteger atomicInteger = vkq0Var2.k;
                while (!atomicInteger.compareAndSet(atomicInteger.get(), 1)) {
                }
                return;
            }
            if (z2) {
                vkq0Var2.c(vkq0Var2.l);
            } else {
                vkq0Var2.e.invoke();
            }
        }
    }

    @CheckResult
    public final float V(BoundingBox boundingBox) {
        int i = (int) (this.z.getValue(this, H[0]).a >> 32);
        return (i == 0 || boundingBox == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : boundingBox.a0() / i;
    }

    public final void W() {
        AtomicReference<do00> atomicReference = this.v;
        do00 do00Var = atomicReference.get();
        if (do00Var == null) {
            return;
        }
        String str = do00Var.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"GeoFeature", "deselectCurrentMarker " + ((Object) StringId.a(str))});
        }
        atomicReference.set(null);
        GeoDataSet geoDataSet = this.s;
        VisibleStyle a2 = qqm0.a(geoDataSet.b().e, str);
        VisibleStyle visibleStyle = a2 != null ? new VisibleStyle(VisibleStyle.a(a2.b)) : null;
        if (visibleStyle != null) {
            int i = visibleStyle.b;
            qqm0.b(geoDataSet.b().e, str, i);
            this.f.b(new h.g(do00Var, i));
        }
    }

    public final rpv X() {
        return (rpv) this.j.getValue();
    }

    public final void Y(BoundingBox boundingBox, List<GeoStaticPreviewInput.Item> list, boolean z) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"items.size = " + list.size()});
        }
        AtomicReference<a> atomicReference = this.w;
        if (atomicReference.get() == null) {
            loop0: while (true) {
                a aVar = atomicReference.get();
                a a2 = a.C1082a.a(boundingBox == null ? null : !boundingBox.v0() ? boundingBox : new BoundingBox(boundingBox), null, null, 6);
                while (!atomicReference.compareAndSet(aVar, a2)) {
                    if (atomicReference.get() != aVar) {
                        break;
                    }
                }
            }
        }
        if (boundingBox instanceof CameraBounds) {
            xf9.e.g((CameraBounds) boundingBox, this);
        }
        if (list.isEmpty()) {
            return;
        }
        Map d = sni.d(list.size(), 2);
        for (GeoStaticPreviewInput.Item item : list) {
            String str = item.b;
            double d2 = item.d;
            double d3 = item.e;
            Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
            long a3 = gqr.a((float) d2, (float) d3);
            String str2 = item.g;
            String str3 = item.c;
            double d4 = item.f;
            do00 do00Var = new do00(str, str, a3, str2, str3, new hah0(d4, d4), true);
            GeoDataSet geoDataSet = this.s;
            do00 do00Var2 = geoDataSet.b().b.get(new StringId(str));
            if (do00Var2 != null) {
                if (!do00Var2.e.equals(do00Var.e)) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"SCORE_CHANGE: " + ((Object) do00Var.m) + " score was " + do00Var2.e + ", new scores " + do00Var.e});
                    }
                }
                do00Var2.e = do00Var.e;
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.w, new Object[]{"allMarkers already contains marker #" + ((Object) StringId.a(str))});
                }
                d.put(new StringId(str), do00Var2);
            } else {
                d.put(new StringId(str), do00Var);
                geoDataSet.b().b.put(new StringId(str), do00Var);
            }
        }
        if (z) {
            hl1 hl1Var = new hl1(16, this, d);
            vf9 vf9Var = this.u;
            CameraBounds cameraBounds = vf9Var.d.get();
            if (cameraBounds != null) {
                hl1Var.invoke(cameraBounds);
            } else {
                vf9Var.e = hl1Var;
            }
        }
    }

    public final void Z(Map<StringId, do00> map, CameraBounds cameraBounds) {
        BoundingBox boundingBox;
        bpn0 bpn0Var;
        Object obj;
        ReentrantLock reentrantLock;
        int i;
        int i2;
        if (cameraBounds == null) {
            return;
        }
        L.e("publishMarkers");
        xf9.d(xf9.e, cameraBounds, this);
        efe0 efe0Var = (efe0) this.E.getValue();
        AtomicReference<BoundingBox> atomicReference = efe0Var.l;
        bpn0 bpn0Var2 = efe0Var.q;
        if (!efe0Var.h().b().b.isEmpty()) {
            boolean isEmpty = map.isEmpty();
            jgp jgpVar = jgp.b;
            Object obj2 = null;
            if (!isEmpty || map == jgpVar) {
                loop0: while (true) {
                    boundingBox = atomicReference.get();
                    if (boundingBox == null || boundingBox.b(cameraBounds)) {
                        bpn0Var = bpn0Var2;
                        obj = obj2;
                    } else {
                        wce0 wce0Var = (wce0) bpn0Var2.getValue();
                        wce0Var.getClass();
                        L.e(new Object[0]);
                        l2l<uee0> l2lVar = wce0Var.d;
                        ReentrantLock reentrantLock2 = l2lVar.k;
                        reentrantLock2.lock();
                        try {
                            fh50<uee0> fh50Var = l2lVar.i;
                            int i3 = fh50Var.b;
                            Object[] objArr = fh50Var.a;
                            k9x q = swe0.q(0, i3);
                            int i4 = q.b;
                            int i5 = q.c;
                            if (i4 <= i5) {
                                i = 0;
                                while (true) {
                                    objArr[i4 - i] = objArr[i4];
                                    bpn0Var = bpn0Var2;
                                    CameraBounds cameraBounds2 = ((uee0) objArr[i4]).a;
                                    boolean z = cameraBounds2 == jgpVar;
                                    if (z) {
                                        reentrantLock = reentrantLock2;
                                        try {
                                            xf9.e.g(cameraBounds2, wce0Var);
                                        } catch (Throwable th) {
                                            th = th;
                                            reentrantLock.unlock();
                                            throw th;
                                        }
                                    } else {
                                        reentrantLock = reentrantLock2;
                                    }
                                    if (z) {
                                        i++;
                                    }
                                    if (i4 == i5) {
                                        break;
                                    }
                                    i4++;
                                    bpn0Var2 = bpn0Var;
                                    reentrantLock2 = reentrantLock;
                                }
                            } else {
                                bpn0Var = bpn0Var2;
                                reentrantLock = reentrantLock2;
                                i = 0;
                            }
                            Arrays.fill(objArr, i3 - i, i3, (Object) null);
                            fh50Var.b -= i;
                            fh50<uee0> fh50Var2 = l2lVar.j;
                            int i6 = fh50Var2.b;
                            Object[] objArr2 = fh50Var2.a;
                            boolean z2 = false;
                            k9x q2 = swe0.q(0, i6);
                            int i7 = q2.b;
                            int i8 = q2.c;
                            if (i7 <= i8) {
                                int i9 = 0;
                                while (true) {
                                    objArr2[i7 - i9] = objArr2[i7];
                                    CameraBounds cameraBounds3 = ((uee0) objArr2[i7]).a;
                                    boolean z3 = cameraBounds3 == jgpVar ? true : z2;
                                    if (z3) {
                                        xf9.e.g(cameraBounds3, wce0Var);
                                    }
                                    if (z3) {
                                        i9++;
                                    }
                                    if (i7 == i8) {
                                        break;
                                    }
                                    i7++;
                                    z2 = false;
                                }
                                i2 = i9;
                            } else {
                                i2 = 0;
                            }
                            obj = null;
                            Arrays.fill(objArr2, i6 - i2, i6, (Object) null);
                            fh50Var2.b -= i2;
                            s3q0 s3q0Var = s3q0.a;
                            reentrantLock.unlock();
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.d, new Object[]{xf9.e.toString()});
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            reentrantLock = reentrantLock2;
                        }
                    }
                    wce0 wce0Var2 = (wce0) bpn0Var.getValue();
                    AtomicInteger atomicInteger = uee0.d;
                    uee0 a2 = uee0.a.a(cameraBounds, map, efe0Var.h().b());
                    CameraBounds cameraBounds4 = a2.a;
                    wce0Var2.getClass();
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.LogType logType = L.LogType.d;
                        StringBuilder sb = new StringBuilder("geojson = ");
                        Parcelable.Creator<BoundingBox> creator = BoundingBox.CREATOR;
                        sb.append(cameraBounds4.geoJsonString(true));
                        L.u(l2, logType, new Object[]{"PublishMarkersExecutor", sb.toString()});
                    }
                    xf9 xf9Var = xf9.e;
                    xf9.d(xf9Var, cameraBounds4, wce0Var2);
                    wce0Var2.d.a(a2);
                    xf9.d(xf9Var, cameraBounds, efe0Var);
                    while (!atomicReference.compareAndSet(boundingBox, cameraBounds)) {
                        if (atomicReference.get() != boundingBox) {
                            break;
                        }
                    }
                    obj2 = obj;
                    bpn0Var2 = bpn0Var;
                }
                if (atomicReference.get() != boundingBox && (boundingBox instanceof CameraBounds)) {
                    xf9.e.g((CameraBounds) boundingBox, efe0Var);
                }
            } else {
                x19.v(efe0Var.r, efe0Var.a, efe0Var.h.plus(efe0Var.b), new cfe0(efe0Var, cameraBounds, null), 4);
            }
        }
        xf9.e.g(cameraBounds, this);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        L.e(new Object[0]);
        super.onDestroy();
        vkq0 vkq0Var = this.p;
        if (vkq0Var != null) {
            jdr0 jdr0Var = vkq0Var.h;
            if (jdr0Var != null) {
                Application application = vkq0Var.a;
                com.google.android.gms.common.api.a<a.d.c> aVar = wyz.a;
                new zzbp(application).removeLocationUpdates(jdr0Var);
            }
            vkq0Var.h = null;
            yok0 yok0Var = vkq0Var.i;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            vkq0Var.i = null;
        }
        zvj.c(this.n, null);
        this.o.e();
        dhr0.a.getClass();
        dhr0.X(this);
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{y98.e.toString()});
        }
        l.getClass();
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{xf9.e.toString()});
        }
        xf9 xf9Var = xf9.e;
        ReentrantLock reentrantLock = xf9Var.c;
        reentrantLock.lock();
        try {
            xf9Var.b.b();
            xf9Var.d = 0;
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            xf9.f.h();
            xf9.g.h();
            xf9.h.m();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        L.e(vKTheme);
        myc0.h(this.n, hqu0.a(), null, new c(vKTheme, this, null), 2);
    }
}
