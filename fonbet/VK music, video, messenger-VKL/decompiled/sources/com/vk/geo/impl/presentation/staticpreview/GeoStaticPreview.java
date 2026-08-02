package com.vk.geo.impl.presentation.staticpreview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.vk.geo.api.data.GeoStaticPreviewInput;
import com.vk.geo.api.data.IconDrawConfig;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import xsna.akt;
import xsna.an10;
import xsna.b6l;
import xsna.bay;
import xsna.bdn;
import xsna.bpn0;
import xsna.c5g;
import xsna.cn70;
import xsna.cpv;
import xsna.dgu;
import xsna.dkt;
import xsna.ela0;
import xsna.elb0;
import xsna.epx;
import xsna.fqv;
import xsna.fto0;
import xsna.fut;
import xsna.g5g;
import xsna.ge00;
import xsna.gqr;
import xsna.gut;
import xsna.hpj;
import xsna.hqu0;
import xsna.hyk0;
import xsna.i21;
import xsna.iah0;
import xsna.ie00;
import xsna.iyx;
import xsna.j5g;
import xsna.knt;
import xsna.lg;
import xsna.lif0;
import xsna.lnt;
import xsna.lz2;
import xsna.mnt;
import xsna.msy;
import xsna.myc0;
import xsna.nnt;
import xsna.nzo;
import xsna.on00;
import xsna.ont;
import xsna.pvj;
import xsna.qqt;
import xsna.rpv;
import xsna.rqt;
import xsna.s3q0;
import xsna.s6r;
import xsna.sdi;
import xsna.spj;
import xsna.vc7;
import xsna.vhn0;
import xsna.w8i;
import xsna.whn0;
import xsna.wi50;
import xsna.wqv;
import xsna.wzs;
import xsna.x500;
import xsna.x7k;
import xsna.y8x;
import xsna.yok0;
import xsna.yvj;
import xsna.zcl;
import xsna.zk3;
import xsna.zvj;

/* compiled from: GeoStaticPreview.kt */
/* loaded from: classes2.dex */
public final class GeoStaticPreview extends View implements w8i, hyk0.b {
    public static final dkt n = new dkt(1);
    public static Pair<IconDrawConfig, rpv> o;
    public final nnt b;
    public final hpj c;
    public GeoStaticPreviewInput d;
    public yok0 e;
    public List<? extends Triple<StringId, cpv, ? extends PointF>> f;
    public BoundingBox g;
    public dgu h;
    public hyk0.c i;
    public final bpn0 j;
    public final Object k;
    public final Object l;
    public final Paint m;

    /* compiled from: GeoStaticPreview.kt */
    public static final class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public GeoStaticPreviewInput b;

        /* compiled from: GeoStaticPreview.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.b, 0);
        }

        public State(Parcel parcel) {
            super(parcel);
            GeoStaticPreviewInput geoStaticPreviewInput;
            Object readParcelable;
            if (Build.VERSION.SDK_INT >= 33) {
                readParcelable = parcel.readParcelable(null, GeoStaticPreviewInput.class);
                geoStaticPreviewInput = (GeoStaticPreviewInput) readParcelable;
            } else {
                geoStaticPreviewInput = (GeoStaticPreviewInput) parcel.readParcelable(GeoStaticPreviewInput.class.getClassLoader());
            }
            this.b = geoStaticPreviewInput;
        }
    }

    /* compiled from: GeoStaticPreview.kt */
    @b6l(c = "com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview$fetch$1", f = "GeoStaticPreview.kt", l = {260, 279, Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ GeoStaticPreviewInput $input;
        final /* synthetic */ int $width;
        float F$0;
        float F$1;
        float F$2;
        float F$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* compiled from: GeoStaticPreview.kt */
        @b6l(c = "com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview$fetch$1$1", f = "GeoStaticPreview.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview$a$a, reason: collision with other inner class name */
        public static final class C1086a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ BoundingBox $bbox;
            final /* synthetic */ dgu $gridResult;
            final /* synthetic */ Bitmap $mapBitmap;
            final /* synthetic */ List<Triple<StringId, cpv, PointF>> $resultIcons;
            int label;
            final /* synthetic */ GeoStaticPreview this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1086a(GeoStaticPreview geoStaticPreview, Bitmap bitmap, List<? extends Triple<StringId, cpv, ? extends PointF>> list, BoundingBox boundingBox, dgu dguVar, spj<? super C1086a> spjVar) {
                super(2, spjVar);
                this.this$0 = geoStaticPreview;
                this.$mapBitmap = bitmap;
                this.$resultIcons = list;
                this.$bbox = boundingBox;
                this.$gridResult = dguVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C1086a(this.this$0, this.$mapBitmap, this.$resultIcons, this.$bbox, this.$gridResult, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C1086a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                Drawable background = this.this$0.getBackground();
                BitmapDrawable bitmapDrawable = background instanceof BitmapDrawable ? (BitmapDrawable) background : null;
                Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
                if (Build.VERSION.SDK_INT < 31 || !(this.this$0.getBackground() instanceof BitmapDrawable)) {
                    this.this$0.setBackground(new BitmapDrawable(this.this$0.getContext().getResources(), this.$mapBitmap));
                } else {
                    Drawable background2 = this.this$0.getBackground();
                    BitmapDrawable bitmapDrawable2 = background2 instanceof BitmapDrawable ? (BitmapDrawable) background2 : null;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setBitmap(this.$mapBitmap);
                    }
                }
                if (bitmap != null) {
                    ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
                }
                GeoStaticPreview geoStaticPreview = this.this$0;
                geoStaticPreview.f = this.$resultIcons;
                geoStaticPreview.g = this.$bbox;
                geoStaticPreview.h = this.$gridResult;
                geoStaticPreview.invalidate();
                hyk0.c cVar = this.this$0.i;
                if (cVar != null) {
                    cVar.b();
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GeoStaticPreviewInput geoStaticPreviewInput, int i, int i2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$input = geoStaticPreviewInput;
            this.$width = i;
            this.$height = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return GeoStaticPreview.this.new a(this.$input, this.$width, this.$height, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x031c, code lost:
        
            if (xsna.myc0.k(r5, r19, r29) != r2) goto L98;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x027d A[LOOP:0: B:19:0x0277->B:21:0x027d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01de A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0354  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Pair pair;
            dgu dguVar;
            long j;
            char c;
            Pair pair2;
            y8x y8xVar;
            hyk0.c cVar;
            BoundingBox boundingBox;
            Object k;
            List list;
            y8x y8xVar2;
            Object c2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                try {
                } catch (Throwable th) {
                    L.i(th);
                    pair = new Pair(null, null);
                }
                if (i == 0) {
                    kotlin.a.a(obj);
                    GeoStaticPreview geoStaticPreview = GeoStaticPreview.this;
                    GeoStaticPreviewInput geoStaticPreviewInput = this.$input;
                    int i2 = this.$width;
                    int i3 = this.$height;
                    this.label = 1;
                    c2 = GeoStaticPreview.c(geoStaticPreview, geoStaticPreviewInput, i2, i3, this);
                    if (c2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    kotlin.a.a(obj);
                    c2 = obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    BoundingBox boundingBox2 = (BoundingBox) this.L$3;
                    list = (List) this.L$1;
                    dguVar = (dgu) this.L$0;
                    kotlin.a.a(obj);
                    k = obj;
                    boundingBox = boundingBox2;
                    j = 4294967295L;
                    c = ' ';
                    dgu dguVar2 = dguVar;
                    Bitmap bitmap = (Bitmap) k;
                    float abs = Math.abs(sdi.x(boundingBox.D()) - sdi.x(boundingBox.Z()));
                    float abs2 = Math.abs(sdi.x(boundingBox.G()) - sdi.x(boundingBox.R()));
                    float f = this.$width;
                    float f2 = this.$height;
                    List<Pair> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (Pair pair3 : list2) {
                        GeoStaticPreviewInput.Item item = (GeoStaticPreviewInput.Item) pair3.d();
                        cpv cpvVar = (cpv) pair3.g();
                        float x = ((sdi.x((float) item.e) - sdi.x(boundingBox.Z())) / abs) * f;
                        float x2 = f2 - (((sdi.x((float) item.d) - sdi.x(boundingBox.R())) / abs2) * f2);
                        long j2 = cpvVar.e;
                        Bitmap bitmap2 = cpvVar.d;
                        arrayList.add(new Triple(new StringId(item.b), cpvVar, new PointF(x - (Float.intBitsToFloat((int) (j2 >> c)) * bitmap2.getWidth()), x2 - (Float.intBitsToFloat((int) (cpvVar.e & j)) * bitmap2.getHeight()))));
                    }
                    bdn bdnVar = bdn.a;
                    ge00 ge00Var = ie00.a;
                    C1086a c1086a = new C1086a(GeoStaticPreview.this, bitmap, arrayList, boundingBox, dguVar2, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.F$0 = abs;
                    this.F$1 = abs2;
                    this.F$2 = f;
                    this.F$3 = f2;
                    this.label = 3;
                }
                pair = (Pair) c2;
                dguVar = (dgu) pair.d();
                List list3 = (List) pair.g();
                List list4 = list3;
                if (list4 == null || list4.isEmpty()) {
                    hyk0.c cVar2 = GeoStaticPreview.this.i;
                    if (cVar2 != null) {
                        cVar2.a("icons is null");
                    }
                    return s3q0.a;
                }
                GeoStaticPreview geoStaticPreview2 = GeoStaticPreview.this;
                int i4 = this.$width;
                int i5 = this.$height;
                dkt dktVar = GeoStaticPreview.n;
                geoStaticPreview2.getClass();
                List list5 = list3;
                ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList2.add((GeoStaticPreviewInput.Item) ((Pair) it.next()).i());
                }
                BoundingBox f3 = GeoStaticPreview.f(arrayList2);
                if (f3 == null || list3.isEmpty() || i4 <= 0 || i5 <= 0) {
                    j = 4294967295L;
                } else {
                    while (i4 != 0 && i5 != 0) {
                        if (i4 <= 1024 && i5 <= 1024) {
                            y8xVar2 = new y8x(y8x.a(i4, i5));
                            j = 4294967295L;
                            break;
                        }
                        j = 4294967295L;
                        int b = an10.b((i5 / i4) * 1024);
                        if (b <= 1024) {
                            y8xVar2 = new y8x(y8x.a(1024, b));
                            break;
                        }
                        int i6 = i5;
                        i5 = i4;
                        i4 = i6;
                    }
                    j = 4294967295L;
                    y8xVar2 = null;
                    if (y8xVar2 != null) {
                        long j3 = y8xVar2.a;
                        Iterator it2 = list3.iterator();
                        int i7 = 0;
                        int i8 = 0;
                        while (it2.hasNext()) {
                            cpv cpvVar2 = (cpv) ((Pair) it2.next()).g();
                            i8 = Math.max(i8, cpvVar2.d.getHeight());
                            i7 = Math.max(i7, cpvVar2.d.getWidth());
                        }
                        c = ' ';
                        float f4 = i7 * 2.5f;
                        float f5 = i8 * 2.5f;
                        float f6 = (int) (j3 >> 32);
                        float f7 = (int) (j3 & j);
                        BoundingBox f8 = nzo.f(f3, an10.b(f6 - f4), an10.b(f7 - f5));
                        if (f8 != null) {
                            float a0 = f8.a0() >= f8.F() ? f8.a0() / f6 : f8.F() / f7;
                            pair2 = new Pair(new y8x(j3), new BoundingBox(f8.d, f8.a0() + (f4 * a0), f8.F() + (f5 * a0), (zcl) null));
                            GeoStaticPreview.this.getClass();
                            y8xVar = (y8x) (pair2 != null ? pair2.i() : null);
                            GeoStaticPreview.this.getClass();
                            BoundingBox boundingBox3 = (BoundingBox) (pair2 != null ? pair2.j() : null);
                            if (y8xVar != null || boundingBox3 == null) {
                                cVar = GeoStaticPreview.this.i;
                                if (cVar != null) {
                                    cVar.a("size or bbox is null");
                                }
                                return s3q0.a;
                            }
                            gut getStaticPreviewBitmapUseCase = GeoStaticPreview.this.getGetStaticPreviewBitmapUseCase();
                            long j4 = y8xVar.a;
                            int i9 = (int) (j4 >> c);
                            int i10 = (int) (j4 & j);
                            float f9 = iah0.f().density;
                            boolean z = this.$input.g;
                            List<lif0> list6 = dguVar != null ? dguVar.e : null;
                            this.L$0 = dguVar;
                            this.L$1 = list3;
                            this.L$2 = null;
                            this.L$3 = boundingBox3;
                            this.label = 2;
                            getStaticPreviewBitmapUseCase.getClass();
                            boundingBox = boundingBox3;
                            k = myc0.k(hqu0.b(), new fut(i9, i10, getStaticPreviewBitmapUseCase, boundingBox, f9, z, list6, null), this);
                            if (k == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            list = list3;
                            dgu dguVar22 = dguVar;
                            Bitmap bitmap3 = (Bitmap) k;
                            float abs3 = Math.abs(sdi.x(boundingBox.D()) - sdi.x(boundingBox.Z()));
                            float abs22 = Math.abs(sdi.x(boundingBox.G()) - sdi.x(boundingBox.R()));
                            float f10 = this.$width;
                            float f22 = this.$height;
                            List<Pair> list22 = list;
                            ArrayList arrayList3 = new ArrayList(c5g.u(list22, 10));
                            while (r5.hasNext()) {
                            }
                            bdn bdnVar2 = bdn.a;
                            ge00 ge00Var2 = ie00.a;
                            C1086a c1086a2 = new C1086a(GeoStaticPreview.this, bitmap3, arrayList3, boundingBox, dguVar22, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.F$0 = abs3;
                            this.F$1 = abs22;
                            this.F$2 = f10;
                            this.F$3 = f22;
                            this.label = 3;
                        }
                        pair2 = null;
                        GeoStaticPreview.this.getClass();
                        y8xVar = (y8x) (pair2 != null ? pair2.i() : null);
                        GeoStaticPreview.this.getClass();
                        BoundingBox boundingBox32 = (BoundingBox) (pair2 != null ? pair2.j() : null);
                        if (y8xVar != null) {
                        }
                        cVar = GeoStaticPreview.this.i;
                        if (cVar != null) {
                        }
                        return s3q0.a;
                    }
                }
                c = ' ';
                pair2 = null;
                GeoStaticPreview.this.getClass();
                y8xVar = (y8x) (pair2 != null ? pair2.i() : null);
                GeoStaticPreview.this.getClass();
                BoundingBox boundingBox322 = (BoundingBox) (pair2 != null ? pair2.j() : null);
                if (y8xVar != null) {
                }
                cVar = GeoStaticPreview.this.i;
                if (cVar != null) {
                }
                return s3q0.a;
            } catch (Throwable th2) {
                L.i(th2);
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.w, new Object[]{"could not fetch static bitmap!"});
                }
                hyk0.c cVar3 = GeoStaticPreview.this.i;
                if (cVar3 != null) {
                    cVar3.a(th2.getLocalizedMessage());
                }
                return s3q0.a;
            }
        }
    }

    /* compiled from: GeoStaticPreview.kt */
    public static final class b extends ViewOutlineProvider {
        public final /* synthetic */ GeoStaticPreviewInput a;

        public b(GeoStaticPreviewInput geoStaticPreviewInput) {
            this.a = geoStaticPreviewInput;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), cn70.c(this.a.d));
        }
    }

    public GeoStaticPreview(Context context) {
        super(context, null);
        nnt nntVar = new nnt(pvj.a.b);
        this.b = nntVar;
        vhn0 a2 = whn0.a();
        bdn bdnVar = bdn.a;
        this.c = zvj.a(d.a.a(a2, ie00.a.U()).plus(nntVar));
        this.f = EmptyList.b;
        this.j = new bpn0(new i21(11));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.k = msy.a(lazyThreadSafetyMode, new lz2(13));
        this.l = msy.a(lazyThreadSafetyMode, new lg(16));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        this.m = paint;
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        setClipToOutline(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0188 A[LOOP:0: B:24:0x0182->B:26:0x0188, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable c(GeoStaticPreview geoStaticPreview, GeoStaticPreviewInput geoStaticPreviewInput, int i, int i2, ContinuationImpl continuationImpl) {
        com.vk.geo.impl.presentation.staticpreview.a aVar;
        com.vk.geo.impl.presentation.staticpreview.a aVar2;
        int i3;
        y8x y8xVar;
        long j;
        Pair pair;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList;
        Iterator it;
        CoroutineSingletons coroutineSingletons;
        ArrayList arrayList2;
        dgu dguVar;
        GeoStaticPreview geoStaticPreview2 = geoStaticPreview;
        GeoStaticPreviewInput geoStaticPreviewInput2 = geoStaticPreviewInput;
        nnt nntVar = geoStaticPreview2.b;
        if (continuationImpl instanceof com.vk.geo.impl.presentation.staticpreview.a) {
            aVar = (com.vk.geo.impl.presentation.staticpreview.a) continuationImpl;
            int i8 = aVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.label = i8 - Integer.MIN_VALUE;
                aVar2 = aVar;
                Object obj = aVar2.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = aVar2.label;
                Object obj2 = null;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    BoundingBox f = f(geoStaticPreviewInput2.i);
                    if (f == null) {
                        return new Pair(null, EmptyList.b);
                    }
                    int i9 = i2;
                    int i10 = i;
                    while (i10 != 0 && i9 != 0) {
                        if (i10 <= 1024 && i9 <= 1024) {
                            y8xVar = new y8x(y8x.a(i10, i9));
                            break;
                        }
                        int b2 = an10.b((i9 / i10) * 1024);
                        if (b2 <= 1024) {
                            y8xVar = new y8x(y8x.a(1024, b2));
                            break;
                        }
                        int i11 = i9;
                        i9 = i10;
                        i10 = i11;
                    }
                    y8xVar = null;
                    if (y8xVar == null) {
                        return new Pair(null, EmptyList.b);
                    }
                    long j2 = y8xVar.a;
                    BoundingBox f2 = nzo.f(f, (int) (j2 >> 32), (int) (4294967295L & j2));
                    if (f2 == null) {
                        return new Pair(null, EmptyList.b);
                    }
                    if (!geoStaticPreviewInput2.h) {
                        j = j2;
                        List<GeoStaticPreviewInput.Item> list = geoStaticPreviewInput2.i;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(new ela0((GeoStaticPreviewInput.Item) it2.next(), 33554434, null));
                        }
                        pair = new Pair(null, arrayList3);
                        i4 = i;
                        i5 = i2;
                        GeoStaticPreviewInput geoStaticPreviewInput3 = geoStaticPreviewInput2;
                        long j3 = j;
                        dgu dguVar2 = (dgu) pair.d();
                        List list2 = (List) pair.g();
                        ArrayList arrayList4 = new ArrayList(list2.size());
                        wi50 a2 = bay.a();
                        List list3 = list2;
                        arrayList = new ArrayList(c5g.u(list3, 10));
                        for (it = list3.iterator(); it.hasNext(); it = it) {
                            ela0 ela0Var = (ela0) it.next();
                            ArrayList arrayList5 = arrayList;
                            arrayList5.add(myc0.b(geoStaticPreview2.c, hqu0.b().plus(nntVar), null, new mnt(geoStaticPreview2, geoStaticPreviewInput3, ela0Var.a, ela0Var.b, ela0Var.c, a2, arrayList4, null), 2));
                            geoStaticPreview2 = geoStaticPreview;
                            obj2 = null;
                            dguVar2 = dguVar2;
                            arrayList = arrayList5;
                            nntVar = nntVar;
                            coroutineSingletons2 = coroutineSingletons2;
                            j3 = j3;
                        }
                        dgu dguVar3 = dguVar2;
                        coroutineSingletons = coroutineSingletons2;
                        Object obj3 = obj2;
                        aVar2.L$0 = obj3;
                        aVar2.L$1 = obj3;
                        aVar2.L$2 = dguVar3;
                        aVar2.L$3 = obj3;
                        aVar2.L$4 = arrayList4;
                        aVar2.L$5 = obj3;
                        aVar2.I$0 = i4;
                        aVar2.I$1 = i5;
                        aVar2.J$0 = j3;
                        aVar2.label = 2;
                        if (fto0.e(arrayList, aVar2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        arrayList2 = arrayList4;
                        dguVar = dguVar3;
                        if (arrayList2.size() > 1) {
                        }
                        return new Pair(dguVar, arrayList2);
                    }
                    rqt rqtVar = new rqt(nntVar, geoStaticPreview2.getCreateMarkerBboxUseCase(), geoStaticPreview2.getIconCache$impl_release(), new knt(geoStaticPreview2, i, 0));
                    aVar2.L$0 = geoStaticPreviewInput2;
                    aVar2.L$1 = null;
                    aVar2.L$2 = null;
                    aVar2.I$0 = i;
                    aVar2.I$1 = i2;
                    aVar2.J$0 = j2;
                    aVar2.label = 1;
                    j = j2;
                    obj = myc0.k(hqu0.a(), new qqt(geoStaticPreviewInput2, rqtVar, f2, i, i2, null), aVar2);
                    if (obj == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    i6 = i;
                    i7 = i2;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        arrayList2 = (ArrayList) aVar2.L$4;
                        dguVar = (dgu) aVar2.L$2;
                        kotlin.a.a(obj);
                        if (arrayList2.size() > 1) {
                            g5g.L(arrayList2, new lnt(0));
                        }
                        return new Pair(dguVar, arrayList2);
                    }
                    long j4 = aVar2.J$0;
                    i7 = aVar2.I$1;
                    i6 = aVar2.I$0;
                    GeoStaticPreviewInput geoStaticPreviewInput4 = (GeoStaticPreviewInput) aVar2.L$0;
                    kotlin.a.a(obj);
                    j = j4;
                    geoStaticPreviewInput2 = geoStaticPreviewInput4;
                }
                pair = (Pair) obj;
                i5 = i7;
                i4 = i6;
                GeoStaticPreviewInput geoStaticPreviewInput32 = geoStaticPreviewInput2;
                long j32 = j;
                dgu dguVar22 = (dgu) pair.d();
                List list22 = (List) pair.g();
                ArrayList arrayList42 = new ArrayList(list22.size());
                wi50 a22 = bay.a();
                List list32 = list22;
                arrayList = new ArrayList(c5g.u(list32, 10));
                while (it.hasNext()) {
                }
                dgu dguVar32 = dguVar22;
                coroutineSingletons = coroutineSingletons2;
                Object obj32 = obj2;
                aVar2.L$0 = obj32;
                aVar2.L$1 = obj32;
                aVar2.L$2 = dguVar32;
                aVar2.L$3 = obj32;
                aVar2.L$4 = arrayList42;
                aVar2.L$5 = obj32;
                aVar2.I$0 = i4;
                aVar2.I$1 = i5;
                aVar2.J$0 = j32;
                aVar2.label = 2;
                if (fto0.e(arrayList, aVar2) == coroutineSingletons) {
                }
            }
        }
        aVar = new com.vk.geo.impl.presentation.staticpreview.a(geoStaticPreview2, continuationImpl);
        aVar2 = aVar;
        Object obj4 = aVar2.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = aVar2.label;
        Object obj22 = null;
        if (i3 != 0) {
        }
        pair = (Pair) obj4;
        i5 = i7;
        i4 = i6;
        GeoStaticPreviewInput geoStaticPreviewInput322 = geoStaticPreviewInput2;
        long j322 = j;
        dgu dguVar222 = (dgu) pair.d();
        List list222 = (List) pair.g();
        ArrayList arrayList422 = new ArrayList(list222.size());
        wi50 a222 = bay.a();
        List list322 = list222;
        arrayList = new ArrayList(c5g.u(list322, 10));
        while (it.hasNext()) {
        }
        dgu dguVar322 = dguVar222;
        coroutineSingletons = coroutineSingletons22;
        Object obj322 = obj22;
        aVar2.L$0 = obj322;
        aVar2.L$1 = obj322;
        aVar2.L$2 = dguVar322;
        aVar2.L$3 = obj322;
        aVar2.L$4 = arrayList422;
        aVar2.L$5 = obj322;
        aVar2.I$0 = i4;
        aVar2.I$1 = i5;
        aVar2.J$0 = j322;
        aVar2.label = 2;
        if (fto0.e(arrayList, aVar2) == coroutineSingletons) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(GeoStaticPreview geoStaticPreview, GeoStaticPreviewInput geoStaticPreviewInput, GeoStaticPreviewInput.Item item, int i, akt aktVar, ContinuationImpl continuationImpl) {
        com.vk.geo.impl.presentation.staticpreview.b bVar;
        int i2;
        GeoStaticPreviewInput.Item item2;
        String str;
        String string;
        int i3;
        String str2;
        String str3;
        Object obj;
        Bitmap bitmap;
        geoStaticPreview.getClass();
        if (continuationImpl instanceof com.vk.geo.impl.presentation.staticpreview.b) {
            bVar = (com.vk.geo.impl.presentation.staticpreview.b) continuationImpl;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj2 = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = bVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj2);
                    item2 = item;
                    str = item2.b;
                    if (VisibleStyle.p(i)) {
                        return rpv.d(geoStaticPreview.getIconCache$impl_release(), str, i, null, null, 28);
                    }
                    cpv c = geoStaticPreview.getIconCache$impl_release().c(i, str);
                    if (c != null && c.c == i) {
                        return c;
                    }
                    wqv wqvVar = geoStaticPreview.getIconCache$impl_release().i;
                    String a2 = wqvVar.b.a(i, str);
                    wqvVar.e.remove(new StringId(a2));
                    String str4 = item2.g;
                    if (aktVar != null) {
                        LinkedHashMap<StringId, elb0> linkedHashMap = aktVar.c;
                        if (geoStaticPreviewInput.n) {
                            string = String.valueOf(item2.f);
                        } else if (linkedHashMap.size() > 1) {
                            string = geoStaticPreview.getContext().getString(R.string.geo_cluster_marker_subtitle, new Integer(linkedHashMap.size() - 1));
                        }
                        if (VisibleStyle.B(i) || str4 == null || str4.length() == 0) {
                            i3 = i;
                            return rpv.d(geoStaticPreview.getIconCache$impl_release(), str, i3, item2.c, string, 16);
                        }
                        int b2 = an10.b(cn70.a() * geoStaticPreviewInput.j.s);
                        s6r fetchMarkerIconUseCase = geoStaticPreview.getFetchMarkerIconUseCase();
                        bVar.L$0 = null;
                        bVar.L$1 = item2;
                        bVar.L$2 = null;
                        bVar.L$3 = str;
                        bVar.L$4 = null;
                        bVar.L$5 = null;
                        bVar.L$6 = string;
                        bVar.I$0 = i;
                        bVar.I$1 = b2;
                        bVar.label = 1;
                        s6r.a aVar = s6r.a;
                        fetchMarkerIconUseCase.getClass();
                        Object a3 = s6r.a(b2, b2, str4, false, bVar);
                        if (a3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        String str5 = string;
                        str2 = str;
                        str3 = str5;
                        obj = a3;
                        i3 = i;
                    }
                    string = null;
                    if (VisibleStyle.B(i)) {
                    }
                    i3 = i;
                    return rpv.d(geoStaticPreview.getIconCache$impl_release(), str, i3, item2.c, string, 16);
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = bVar.I$0;
                str3 = (String) bVar.L$6;
                str2 = (String) bVar.L$3;
                GeoStaticPreviewInput.Item item3 = (GeoStaticPreviewInput.Item) bVar.L$1;
                kotlin.a.a(obj2);
                obj = obj2;
                item2 = item3;
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    String str6 = str2;
                    string = str3;
                    str = str6;
                    return rpv.d(geoStaticPreview.getIconCache$impl_release(), str, i3, item2.c, string, 16);
                }
                rpv iconCache$impl_release = geoStaticPreview.getIconCache$impl_release();
                String str7 = item2.c;
                fqv<?> fqvVar = iconCache$impl_release.f;
                float F = VisibleStyle.F(i3);
                String str8 = VisibleStyle.f(i3) ? str7 : null;
                String str9 = VisibleStyle.e(i3) ? str3 : null;
                Regex regex = fqv.j;
                cpv.a e = fqvVar.e(bitmap, F, str8, str9);
                StringBuilder sb = new StringBuilder("#");
                sb.append(new StringId(str2));
                sb.append(";style=");
                sb.append(new VisibleStyle(iconCache$impl_release.h(i3)));
                if (e.d) {
                    sb.append(";ttl=");
                    sb.append((CharSequence) str7);
                    sb.append(';');
                }
                if (e.e) {
                    sb.append(";sbt=");
                    sb.append((CharSequence) str3);
                }
                cpv b3 = e.b(sb.toString(), false, i3, str7, str3);
                if (VisibleStyle.D(i3)) {
                    iconCache$impl_release.j.f(str2, i3, b3);
                    return b3;
                }
                iconCache$impl_release.i.f(str2, i3, b3);
                return b3;
            }
        }
        bVar = new com.vk.geo.impl.presentation.staticpreview.b(geoStaticPreview, continuationImpl);
        Object obj22 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = bVar.label;
        if (i2 != 0) {
        }
        bitmap = (Bitmap) obj;
        if (bitmap != null) {
        }
    }

    public static BoundingBox f(List list) {
        if (!list.isEmpty()) {
            if (list.size() != 1) {
                Parcelable.Creator<BoundingBox> creator = BoundingBox.CREATOR;
                List<GeoStaticPreviewInput.Item> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (GeoStaticPreviewInput.Item item : list2) {
                    arrayList.add(new Coordinate(gqr.a((float) item.d, (float) item.e)));
                }
                return BoundingBox.a.a(arrayList);
            }
            GeoStaticPreviewInput.Item item2 = (GeoStaticPreviewInput.Item) j5g.a0(list);
            if (item2 != null) {
                return new BoundingBox(gqr.a((float) item2.d, (float) item2.e), 200.0f, (zcl) null);
            }
        }
        return null;
    }

    private final x7k getCreateMarkerBboxUseCase() {
        return (x7k) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final s6r getFetchMarkerIconUseCase() {
        return (s6r) this.l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final gut getGetStaticPreviewBitmapUseCase() {
        return (gut) this.k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gut getStaticPreviewBitmapUseCase_delegate$lambda$2() {
        return new gut(0);
    }

    @Override // xsna.hyk0.b
    public final ont a() {
        Bitmap bitmap;
        zk3 zk3Var = new zk3(this.f.size());
        for (Triple<StringId, cpv, ? extends PointF> triple : this.f) {
            zk3Var.put(new StringId(triple.d().b), new VisibleStyle(triple.g().c));
        }
        rpv iconCache$impl_release = getIconCache$impl_release();
        rpv rpvVar = new rpv(iconCache$impl_release.e, iconCache$impl_release.a, iconCache$impl_release.b, iconCache$impl_release.c, iconCache$impl_release.d);
        ConcurrentHashMap<Integer, Bitmap> concurrentHashMap = rpvVar.g;
        ConcurrentHashMap<Integer, Bitmap> concurrentHashMap2 = iconCache$impl_release.g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(concurrentHashMap2.size()));
        Iterator<T> it = concurrentHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Bitmap bitmap2 = (Bitmap) entry.getValue();
            Bitmap.Config config = bitmap2.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            linkedHashMap.put(key, bitmap2.copy(config, false));
        }
        concurrentHashMap.putAll(linkedHashMap);
        rpvVar.h.b(iconCache$impl_release.h);
        rpvVar.i.b(iconCache$impl_release.i);
        rpvVar.j.b(iconCache$impl_release.j);
        cpv cpvVar = iconCache$impl_release.k;
        Bitmap bitmap3 = null;
        rpvVar.k = cpvVar != null ? cpvVar.b() : null;
        x500<Bitmap> x500Var = rpvVar.l;
        x500<Bitmap> x500Var2 = iconCache$impl_release.l;
        x500<? extends Bitmap> x500Var3 = new x500<>(x500Var2.size());
        int size = x500Var2.size();
        for (int i = 0; i < size; i++) {
            Bitmap valueAt = x500Var2.valueAt(i);
            Bitmap.Config config2 = valueAt.getConfig();
            if (config2 == null) {
                config2 = Bitmap.Config.ARGB_8888;
            }
            x500Var3.put(x500Var2.keyAt(i), valueAt.copy(config2, false));
        }
        x500Var.putAll(x500Var3);
        x500<Bitmap> x500Var4 = rpvVar.m;
        x500<Bitmap> x500Var5 = iconCache$impl_release.m;
        x500<? extends Bitmap> x500Var6 = new x500<>(x500Var5.size());
        int size2 = x500Var5.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Bitmap valueAt2 = x500Var5.valueAt(i2);
            Bitmap.Config config3 = valueAt2.getConfig();
            if (config3 == null) {
                config3 = Bitmap.Config.ARGB_8888;
            }
            x500Var6.put(x500Var5.keyAt(i2), valueAt2.copy(config3, false));
        }
        x500Var4.putAll(x500Var6);
        Bitmap bitmap4 = iconCache$impl_release.n;
        if (bitmap4 != null) {
            Bitmap.Config config4 = bitmap4.getConfig();
            if (config4 == null) {
                config4 = Bitmap.Config.ARGB_8888;
            }
            bitmap = bitmap4.copy(config4, false);
        } else {
            bitmap = null;
        }
        rpvVar.n = bitmap;
        Bitmap bitmap5 = iconCache$impl_release.o;
        if (bitmap5 != null) {
            Bitmap.Config config5 = bitmap5.getConfig();
            if (config5 == null) {
                config5 = Bitmap.Config.ARGB_8888;
            }
            bitmap3 = bitmap5.copy(config5, false);
        }
        rpvVar.o = bitmap3;
        return new ont(rpvVar, this.d, this.g, this.h, zk3Var);
    }

    public final void g(GeoStaticPreviewInput geoStaticPreviewInput, int i, int i2) {
        yok0 yok0Var = this.e;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.e = myc0.h(this.c, hqu0.a(), null, new a(geoStaticPreviewInput, i, i2, null), 2);
    }

    public GeoStaticPreviewInput getCurrentInput() {
        return this.d;
    }

    public final rpv getIconCache$impl_release() {
        IconDrawConfig iconDrawConfig;
        rpv j;
        Pair<IconDrawConfig, rpv> pair = o;
        GeoStaticPreviewInput geoStaticPreviewInput = this.d;
        if (geoStaticPreviewInput == null || (iconDrawConfig = geoStaticPreviewInput.j) == null) {
            iconDrawConfig = IconDrawConfig.x;
        }
        if (pair != null && epx.f(pair.i(), iconDrawConfig)) {
            return pair.j();
        }
        if (pair != null && (j = pair.j()) != null) {
            j.a(true);
        }
        rpv rpvVar = new rpv(getContext().getApplicationContext(), iah0.f().density, iconDrawConfig, 16);
        o = new Pair<>(iconDrawConfig, rpvVar);
        return rpvVar;
    }

    public final void h() {
        GeoStaticPreviewInput geoStaticPreviewInput = this.d;
        if (geoStaticPreviewInput == null || geoStaticPreviewInput.i.isEmpty()) {
            return;
        }
        int i = geoStaticPreviewInput.b;
        int i2 = geoStaticPreviewInput.c;
        if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            i = getMeasuredWidth();
            i2 = getMeasuredHeight();
        }
        if (i != -1 && i2 != -1) {
            g(geoStaticPreviewInput, i, i2);
            return;
        }
        yok0 yok0Var = this.e;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.e = null;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iyx.d(this.c.b);
        this.i = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Triple<StringId, cpv, ? extends PointF> triple : this.f) {
            cpv g = triple.g();
            PointF h = triple.h();
            if (!g.d.isRecycled()) {
                canvas.drawBitmap(g.d, h.x, h.y, this.m);
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        State state = (State) parcelable;
        super.onRestoreInstanceState(state.getSuperState());
        this.d = state.b;
        h();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState());
        state.b = this.d;
        return state;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        GeoStaticPreviewInput geoStaticPreviewInput;
        super.onSizeChanged(i, i2, i3, i4);
        if ((i3 == i && i4 == i2) || (geoStaticPreviewInput = this.d) == null) {
            return;
        }
        yok0 yok0Var = this.e;
        if (yok0Var == null || !yok0Var.isActive()) {
            g(geoStaticPreviewInput, i, i2);
        }
    }

    @Override // xsna.hyk0.b
    public void setInput(GeoStaticPreviewInput geoStaticPreviewInput) {
        if (geoStaticPreviewInput.i.isEmpty() || epx.f(this.d, geoStaticPreviewInput)) {
            return;
        }
        setOutlineProvider(new b(geoStaticPreviewInput));
        if (geoStaticPreviewInput.f || !(getBackground() instanceof BitmapDrawable)) {
            GeoStaticPreviewInput.Background background = geoStaticPreviewInput.e;
            if (background instanceof GeoStaticPreviewInput.Background.AsColorInt) {
                setBackgroundColor(((GeoStaticPreviewInput.Background.AsColorInt) background).b);
            } else if (background instanceof GeoStaticPreviewInput.Background.AsColorRes) {
                setBackgroundColor(getContext().getColor(((GeoStaticPreviewInput.Background.AsColorRes) background).b));
            } else {
                if (!(background instanceof GeoStaticPreviewInput.Background.AsDrawableRes)) {
                    throw new NoWhenBranchMatchedException();
                }
                setBackgroundResource(((GeoStaticPreviewInput.Background.AsDrawableRes) background).b);
            }
        }
        this.d = geoStaticPreviewInput;
        h();
    }

    public void setReadyCallback(hyk0.c cVar) {
        this.i = cVar;
    }

    @Override // xsna.hyk0.b
    public View getGeoStaticPreview() {
        return this;
    }
}
