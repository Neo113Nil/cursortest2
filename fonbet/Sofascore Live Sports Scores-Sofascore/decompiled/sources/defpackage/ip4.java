package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import com.sofascore.model.newNetwork.CareerHistory;
import com.sofascore.results.manager.details.view.ManagerHistoryChartGraph;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ip4 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ float t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip4(gnh gnhVar, float f, Function1 function1, oug ougVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = gnhVar;
        this.t = f;
        this.w = function1;
        this.x = ougVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        float f = this.t;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                return new ip4(f, (jp4) obj3, (oug) obj2, rq3Var);
            case 1:
                ip4 ip4Var = new ip4((ManagerHistoryChartGraph) obj3, f, (List) obj2, rq3Var);
                ip4Var.v = obj;
                return ip4Var;
            default:
                return new ip4((gnh) this.v, this.t, (Function1) obj3, (oug) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ip4) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0229  */
    /* JADX WARN: Type inference failed for: r4v3, types: [dnh] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        csf csfVar;
        d80 d80Var;
        Object u;
        ManagerHistoryChartGraph managerHistoryChartGraph;
        boolean z;
        LinkedHashMap linkedHashMap;
        int i;
        int i2;
        int i3;
        Iterator it;
        float f;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        float f3;
        float f4;
        float f5;
        float f6;
        final csf csfVar2;
        Object d;
        int i9 = this.r;
        float f7 = this.t;
        Object obj2 = this.w;
        final int i10 = 0;
        Object obj3 = this.x;
        rq3 rq3Var = null;
        final int i11 = 1;
        switch (i9) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    if (Math.abs(f7) > 1.0f) {
                        csfVar = new csf();
                        csfVar.a = f7;
                        csf csfVar3 = new csf();
                        d80 a = t62.a(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7);
                        try {
                            jp4 jp4Var = (jp4) obj2;
                            ol4 ol4Var = jp4Var.a;
                            fa faVar = new fa(csfVar3, (oug) obj3, csfVar, jp4Var);
                            this.u = csfVar;
                            this.v = a;
                            this.s = 1;
                            if (d2a.n(a, ol4Var, false, faVar, this) == lu3Var) {
                                return lu3Var;
                            }
                        } catch (CancellationException unused) {
                            d80Var = a;
                            csfVar.a = ((Number) d80Var.c()).floatValue();
                            f7 = csfVar.a;
                            return new Float(f7);
                        }
                    }
                    return new Float(f7);
                }
                if (i12 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d80Var = (d80) this.v;
                csfVar = (csf) this.u;
                try {
                    y6a.M(obj);
                } catch (CancellationException unused2) {
                    csfVar.a = ((Number) d80Var.c()).floatValue();
                    f7 = csfVar.a;
                    return new Float(f7);
                }
                f7 = csfVar.a;
                return new Float(f7);
            case 1:
                ManagerHistoryChartGraph managerHistoryChartGraph2 = (ManagerHistoryChartGraph) obj2;
                boolean z3 = managerHistoryChartGraph2.c;
                LinkedHashMap linkedHashMap2 = managerHistoryChartGraph2.y;
                ArrayList arrayList = managerHistoryChartGraph2.x;
                int i13 = managerHistoryChartGraph2.g;
                ArrayList arrayList2 = managerHistoryChartGraph2.a;
                ku3 ku3Var = (ku3) this.v;
                int i14 = 2;
                lu3 lu3Var2 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    managerHistoryChartGraph2.i = f7 / 4.0f;
                    arrayList2.clear();
                    arrayList2.addAll(CollectionsKt.B0((List) obj3));
                    ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(xw3.t(ku3Var, null, new gjb(managerHistoryChartGraph2, (CareerHistory) it2.next(), rq3Var, 5), 3));
                    }
                    this.v = null;
                    this.u = managerHistoryChartGraph2;
                    this.s = 1;
                    u = m6k.u(arrayList3, this);
                    if (u == lu3Var2) {
                        return lu3Var2;
                    }
                    managerHistoryChartGraph = managerHistoryChartGraph2;
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ManagerHistoryChartGraph managerHistoryChartGraph3 = (ManagerHistoryChartGraph) this.u;
                    y6a.M(obj);
                    managerHistoryChartGraph = managerHistoryChartGraph3;
                    u = obj;
                }
                managerHistoryChartGraph.b = (List) u;
                int i16 = managerHistoryChartGraph2.h;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = managerHistoryChartGraph2.j;
                arrayList5.clear();
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(managerHistoryChartGraph2.b);
                Path path = managerHistoryChartGraph2.v;
                path.reset();
                arrayList.clear();
                linkedHashMap2.clear();
                if (arrayList2.isEmpty()) {
                    z = z3;
                    linkedHashMap = linkedHashMap2;
                } else {
                    float f8 = i16;
                    float width = f8 / managerHistoryChartGraph2.getWidth();
                    CareerHistory careerHistory = (CareerHistory) CollectionsKt.Y(arrayList2);
                    CareerHistory careerHistory2 = (CareerHistory) CollectionsKt.h0(arrayList2);
                    int size = arrayList2.size();
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    Integer startTimestamp = careerHistory.getStartTimestamp();
                    int intValue = startTimestamp != null ? startTimestamp.intValue() : 0;
                    if (careerHistory2.getEndTimestamp() != null) {
                        z = z3;
                        i = i16;
                        IntRange j = llf.j(1, currentTimeMillis);
                        Integer endTimestamp = careerHistory2.getEndTimestamp();
                        if (endTimestamp != null && j.d(endTimestamp.intValue())) {
                            Integer endTimestamp2 = careerHistory2.getEndTimestamp();
                            i2 = endTimestamp2 != null ? endTimestamp2.intValue() : 0;
                            Integer startTimestamp2 = careerHistory2.getStartTimestamp();
                            int intValue2 = startTimestamp2 == null ? startTimestamp2.intValue() : i2;
                            float f9 = i2 - intValue;
                            managerHistoryChartGraph2.r = f9 / f9;
                            bi4 bi4Var = bi4.PATTERN_Y_SHORT;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            linkedHashMap = linkedHashMap2;
                            String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(intValue));
                            format.getClass();
                            managerHistoryChartGraph2.t = "'".concat(format);
                            String format2 = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(intValue2));
                            format2.getClass();
                            managerHistoryChartGraph2.u = "'".concat(format2);
                            float f10 = 0.0f;
                            float f11 = 0.0f;
                            i3 = 0;
                            boolean z4 = false;
                            int i17 = 0;
                            while (i3 < size) {
                                CareerHistory careerHistory3 = (CareerHistory) arrayList2.get(i3);
                                if (z4) {
                                    f2 = f8;
                                    i5 = size;
                                    i6 = i3;
                                    z4 = false;
                                } else {
                                    Integer startTimestamp3 = careerHistory3.getStartTimestamp();
                                    int intValue3 = startTimestamp3 != null ? startTimestamp3.intValue() : 0;
                                    Integer endTimestamp3 = careerHistory3.getEndTimestamp();
                                    if (endTimestamp3 != null) {
                                        f = f10;
                                        i4 = endTimestamp3.intValue();
                                    } else {
                                        f = f10;
                                        i4 = 0;
                                    }
                                    float f12 = f11;
                                    int i18 = i4 - intValue3;
                                    if (i4 != 0) {
                                        f2 = f8;
                                        if (i3 != size - 1) {
                                            int i19 = i3 + 1;
                                            CareerHistory careerHistory4 = (CareerHistory) arrayList2.get(i19);
                                            Integer startTimestamp4 = careerHistory4.getStartTimestamp();
                                            int intValue4 = startTimestamp4 != null ? startTimestamp4.intValue() : 0;
                                            Integer endTimestamp4 = careerHistory4.getEndTimestamp();
                                            if (endTimestamp4 != null && endTimestamp4.intValue() == 0) {
                                                i7 = i19;
                                                i8 = currentTimeMillis;
                                            } else {
                                                Integer endTimestamp5 = careerHistory4.getEndTimestamp();
                                                if (endTimestamp5 != null) {
                                                    i8 = endTimestamp5.intValue();
                                                    i7 = i19;
                                                } else {
                                                    i7 = i19;
                                                    i8 = 0;
                                                }
                                            }
                                            int i20 = i8 - intValue4;
                                            i5 = size;
                                            int i21 = i4 - intValue4;
                                            if (i21 > 0) {
                                                i6 = i3;
                                                z2 = z4;
                                                if (i18 > i20 && i21 > i20 * 0.8d) {
                                                    arrayList6.remove(i7 - i17);
                                                    i17++;
                                                    z2 = true;
                                                } else if (i20 > i18 && i21 > i18 * 0.8d) {
                                                    arrayList6.remove(i6 - i17);
                                                    i17++;
                                                    f10 = f;
                                                    f11 = f12;
                                                    z4 = z2;
                                                }
                                            } else {
                                                i6 = i3;
                                                z2 = z4;
                                            }
                                            float f13 = i18 / f9;
                                            float width2 = managerHistoryChartGraph2.getWidth() * f13;
                                            float f14 = managerHistoryChartGraph2.f;
                                            boolean z5 = width2 >= f14;
                                            if (z5) {
                                                f3 = f + f13;
                                            } else {
                                                f13 = f14 / managerHistoryChartGraph2.getWidth();
                                                f3 = f;
                                            }
                                            float f15 = f12 + f13;
                                            if (careerHistory3.getPerformance() != null) {
                                                f4 = f3;
                                                f5 = (r26.getDraws() + (r26.getWins() * 3)) / r26.getTotal();
                                            } else {
                                                f4 = f3;
                                                f5 = 0.0f;
                                            }
                                            arrayList4.add(new rsb(f13, z5, Float.valueOf(i13 * (((f5 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 4.0f) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))));
                                            float f16 = (intValue4 - i4) / f9;
                                            float width3 = managerHistoryChartGraph2.getWidth() * f16;
                                            float f17 = managerHistoryChartGraph2.d;
                                            boolean z6 = width3 >= f17;
                                            if (z6) {
                                                f6 = f4 + f16;
                                            } else {
                                                f16 = f17 / managerHistoryChartGraph2.getWidth();
                                                f6 = f4;
                                            }
                                            float f18 = f15 + f16;
                                            arrayList4.add(new rsb(f16, z6, null));
                                            f10 = f6;
                                            f11 = f18;
                                            z4 = z2;
                                        }
                                    } else {
                                        f2 = f8;
                                    }
                                    i5 = size;
                                    i6 = i3;
                                    float max = Math.max(((1 > i4 || i4 >= currentTimeMillis) ? currentTimeMillis - intValue3 : i18) / f9, width);
                                    managerHistoryChartGraph2.r = max;
                                    f11 = f12 + max;
                                    arrayList4.add(new rsb(max, false, Float.valueOf(((((careerHistory3.getPerformance() != null ? (r8.getDraws() + (r8.getWins() * 3)) / r8.getTotal() : 0.0f) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 4.0f) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * i13)));
                                    f10 = f;
                                    z4 = true;
                                }
                                i3 = i6 + 1;
                                f8 = f2;
                                size = i5;
                            }
                            float f19 = f10;
                            float f20 = f8;
                            float f21 = (f19 - (f11 - 1.0f)) / f19;
                            managerHistoryChartGraph2.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (z) {
                                Collections.reverse(arrayList4);
                                Collections.reverse(arrayList6);
                            }
                            it = arrayList4.iterator();
                            int i22 = 0;
                            while (it.hasNext()) {
                                rsb rsbVar = (rsb) it.next();
                                boolean z7 = rsbVar.b;
                                float f22 = rsbVar.a;
                                if (z7) {
                                    f22 *= f21;
                                }
                                Float f23 = rsbVar.c;
                                float width4 = f22 * managerHistoryChartGraph2.getWidth();
                                if (f23 != null) {
                                    RectF rectF = managerHistoryChartGraph2.p;
                                    rectF.top = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    float f24 = i13;
                                    rectF.bottom = f24;
                                    float f25 = managerHistoryChartGraph2.s;
                                    rectF.left = f25;
                                    rectF.right = f25 + width4;
                                    path.addRoundRect(rectF, managerHistoryChartGraph2.o, Path.Direction.CW);
                                    RectF rectF2 = new RectF();
                                    rectF2.top = f24 - f23.floatValue();
                                    rectF2.bottom = f24;
                                    float f26 = managerHistoryChartGraph2.s;
                                    rectF2.left = f26;
                                    rectF2.right = f26 + width4;
                                    arrayList.add(rectF2);
                                    RectF rectF3 = new RectF();
                                    float f27 = managerHistoryChartGraph2.e;
                                    rectF3.top = f27;
                                    rectF3.bottom = f27 + f20;
                                    float f28 = (width4 / 2.0f) + managerHistoryChartGraph2.s;
                                    float f29 = i / 2;
                                    rectF3.left = f28 - f29;
                                    rectF3.right = f28 + f29;
                                    arrayList5.add(new qsb((Bitmap) CollectionsKt.a0(i22, arrayList6), rectF3, width4 >= f20));
                                    i22++;
                                }
                                managerHistoryChartGraph2.s += width4;
                            }
                        }
                    } else {
                        z = z3;
                        i = i16;
                    }
                    i2 = currentTimeMillis;
                    Integer startTimestamp22 = careerHistory2.getStartTimestamp();
                    if (startTimestamp22 == null) {
                    }
                    float f92 = i2 - intValue;
                    managerHistoryChartGraph2.r = f92 / f92;
                    bi4 bi4Var2 = bi4.PATTERN_Y_SHORT;
                    ConcurrentHashMap concurrentHashMap2 = hk4.a;
                    linkedHashMap = linkedHashMap2;
                    String format3 = hk4.a(bi4Var2.d()).format(Instant.ofEpochSecond(intValue));
                    format3.getClass();
                    managerHistoryChartGraph2.t = "'".concat(format3);
                    String format22 = hk4.a(bi4Var2.d()).format(Instant.ofEpochSecond(intValue2));
                    format22.getClass();
                    managerHistoryChartGraph2.u = "'".concat(format22);
                    float f102 = 0.0f;
                    float f112 = 0.0f;
                    i3 = 0;
                    boolean z42 = false;
                    int i172 = 0;
                    while (i3 < size) {
                    }
                    float f192 = f102;
                    float f202 = f8;
                    float f212 = (f192 - (f112 - 1.0f)) / f192;
                    managerHistoryChartGraph2.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (z) {
                    }
                    it = arrayList4.iterator();
                    int i222 = 0;
                    while (it.hasNext()) {
                    }
                }
                ArrayList arrayList7 = managerHistoryChartGraph2.z;
                arrayList7.clear();
                Iterator it3 = arrayList.iterator();
                int i23 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i24 = i23 + 1;
                    if (i23 < 0) {
                        b.q();
                        throw null;
                    }
                    LinkedHashMap linkedHashMap3 = linkedHashMap;
                    linkedHashMap3.put(Integer.valueOf(i23), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    float height = ((RectF) next).height();
                    int i25 = i14;
                    float[] fArr = new float[i25];
                    fArr[0] = 0.0f;
                    fArr[1] = height;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    ofFloat.setDuration(500L);
                    ofFloat.setStartDelay((z ? (arrayList.size() - 1) - i23 : i23) * 50);
                    ofFloat.addUpdateListener(new h14(managerHistoryChartGraph2, i23, 1));
                    arrayList7.add(ofFloat);
                    ofFloat.start();
                    i23 = i24;
                    i14 = i25;
                    linkedHashMap = linkedHashMap3;
                }
                managerHistoryChartGraph2.invalidate();
                return Unit.a;
            default:
                final Function1 function1 = (Function1) obj2;
                gnh gnhVar = (gnh) this.v;
                knh knhVar = gnhVar.a;
                lu3 lu3Var3 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    float b = knhVar.b(f7, tgj.t(gnhVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7));
                    if (Float.isNaN(b)) {
                        u3a.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    csfVar2 = new csf();
                    float signum = Math.signum(f7) * Math.abs(b);
                    csfVar2.a = signum;
                    function1.invoke(new Float(signum));
                    float f30 = csfVar2.a;
                    ?? r4 = new Function1() { // from class: dnh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i27 = i10;
                            Function1 function12 = function1;
                            csf csfVar4 = csfVar2;
                            float floatValue = ((Float) obj4).floatValue();
                            switch (i27) {
                                case 0:
                                    float f31 = csfVar4.a - floatValue;
                                    csfVar4.a = f31;
                                    function12.invoke(Float.valueOf(f31));
                                    break;
                                default:
                                    float f32 = csfVar4.a - floatValue;
                                    csfVar4.a = f32;
                                    function12.invoke(Float.valueOf(f32));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    this.u = csfVar2;
                    this.s = 1;
                    d = gnhVar.d((oug) obj3, f30, this.t, r4, this);
                    if (d == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i26 != 1) {
                        if (i26 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    csf csfVar4 = (csf) this.u;
                    y6a.M(obj);
                    csfVar2 = csfVar4;
                    d = obj;
                }
                d80 d80Var2 = (d80) d;
                float a2 = knhVar.a(((Number) d80Var2.c()).floatValue());
                if (Float.isNaN(a2)) {
                    u3a.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                csfVar2.a = a2;
                d80 B = t62.B(d80Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                c80 c80Var = gnhVar.c;
                Function1 function12 = new Function1() { // from class: dnh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i27 = i11;
                        Function1 function122 = function1;
                        csf csfVar42 = csfVar2;
                        float floatValue = ((Float) obj4).floatValue();
                        switch (i27) {
                            case 0:
                                float f31 = csfVar42.a - floatValue;
                                csfVar42.a = f31;
                                function122.invoke(Float.valueOf(f31));
                                break;
                            default:
                                float f32 = csfVar42.a - floatValue;
                                csfVar42.a = f32;
                                function122.invoke(Float.valueOf(f32));
                                break;
                        }
                        return Unit.a;
                    }
                };
                this.u = null;
                this.s = 2;
                Object o = kda.o((oug) obj3, a2, a2, B, c80Var, function12, this);
                return o == lu3Var3 ? lu3Var3 : o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip4(float f, jp4 jp4Var, oug ougVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = f;
        this.w = jp4Var;
        this.x = ougVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip4(ManagerHistoryChartGraph managerHistoryChartGraph, float f, List list, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = managerHistoryChartGraph;
        this.t = f;
        this.x = list;
    }
}
