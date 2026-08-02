package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dz extends p9 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final tzc N;
    public final vzc A;
    public final szc B;
    public final szc C;
    public final String D;
    public final String E;
    public final l2a F;
    public final uzc G;
    public t3h H;
    public boolean I;
    public final szc J;
    public final y2 K;
    public final ArrayList L;
    public final cz M;
    public final xy d;
    public int e = Integer.MIN_VALUE;
    public final cz f;
    public final AccessibilityManager g;
    public long h;
    public List i;
    public final yy j;
    public int k;
    public int l;
    public da m;
    public da n;
    public boolean o;
    public final uzc p;
    public final uzc q;
    public final zwh r;
    public final zwh s;
    public int t;
    public Integer u;
    public final gh0 v;
    public final g62 w;
    public boolean x;
    public zy y;
    public uzc z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        tzc tzcVar = m6a.a;
        tzc tzcVar2 = new tzc(32);
        int i = tzcVar2.b;
        if (i < 0) {
            zzl.r("");
            return;
        }
        int i2 = i + 32;
        tzcVar2.b(i2);
        int[] iArr2 = tzcVar2.a;
        int i3 = tzcVar2.b;
        if (i != i3) {
            mh0.e(i2, i, iArr2, iArr2, i3);
        }
        mh0.j(i, 0, iArr, iArr2, 12);
        tzcVar2.b += 32;
        N = tzcVar2;
    }

    public dz(xy xyVar) {
        this.d = xyVar;
        int i = 0;
        this.f = new cz(this, i);
        Object systemService = xyVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.g = (AccessibilityManager) systemService;
        this.h = 100L;
        new Handler(Looper.getMainLooper());
        this.j = new yy(this, i);
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.p = new uzc();
        this.q = new uzc();
        this.r = new zwh(0);
        this.s = new zwh(0);
        this.t = -1;
        this.v = new gh0(0);
        this.w = ml4.g(1, 6, null);
        this.x = true;
        uzc uzcVar = q6a.a;
        uzcVar.getClass();
        this.z = uzcVar;
        this.A = new vzc();
        this.B = new szc();
        this.C = new szc();
        this.D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.F = new l2a(22);
        this.G = new uzc();
        this.H = new t3h(xyVar.getSemanticsOwner().a(), uzcVar);
        int i2 = j6a.a;
        this.J = new szc();
        xyVar.addOnAttachStateChangeListener(this);
        this.K = new y2(this, 9);
        this.L = new ArrayList();
        this.M = new cz(this, 1);
    }

    public static /* synthetic */ void E(dz dzVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        dzVar.D(i, i2, num, null);
    }

    public static Rect L(pea peaVar, float f, float f2) {
        if (!(peaVar instanceof dxd) && !(peaVar instanceof exd)) {
            return null;
        }
        oqf v = peaVar.v();
        return new Rect((int) (v.a + f), (int) (v.b + f2), (int) (v.c + f), (int) (v.d + f2));
    }

    public static float[] N(pea peaVar) {
        if (!(peaVar instanceof exd)) {
            return null;
        }
        e7g e7gVar = ((exd) peaVar).g;
        long j = e7gVar.h;
        long j2 = e7gVar.g;
        long j3 = e7gVar.f;
        long j4 = e7gVar.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(pea peaVar, float f, float f2) {
        if (peaVar instanceof cxd) {
            cxd cxdVar = (cxd) peaVar;
            oqf j = cxdVar.v().j(f, f2);
            Region region = new Region(new Rect((int) (j.a + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), (int) (j.b + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), (int) (j.c + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), (int) (j.d + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
            Region region2 = new Region();
            b20 b20Var = cxdVar.g;
            if (b20Var instanceof b20) {
                Path path = b20Var.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            a70.m("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int length = charSequence.length();
            int i = DefaultOggSeeker.MATCH_BYTE_RANGE;
            if (length > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(DefaultOggSeeker.MATCH_BYTE_RANGE))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String t(s3h s3hVar) {
        q80 q80Var;
        if (s3hVar != null) {
            l3h l3hVar = s3hVar.d;
            x0d x0dVar = l3hVar.a;
            a4h a4hVar = w3h.a;
            if (x0dVar.c(a4hVar)) {
                return ycb.a((List) l3hVar.d(a4hVar), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, 62);
            }
            a4h a4hVar2 = w3h.G;
            if (x0dVar.c(a4hVar2)) {
                Object g = x0dVar.g(a4hVar2);
                if (g == null) {
                    g = null;
                }
                q80 q80Var2 = (q80) g;
                if (q80Var2 != null) {
                    return q80Var2.b;
                }
            } else {
                Object g2 = x0dVar.g(w3h.C);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (q80Var = (q80) CollectionsKt.firstOrNull(list)) != null) {
                    return q80Var.b;
                }
            }
        }
        return null;
    }

    public static final boolean x(wtg wtgVar, float f) {
        Function0 function0 = wtgVar.a;
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ((Number) function0.invoke()).floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((Number) function0.invoke()).floatValue() < ((Number) wtgVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(wtg wtgVar) {
        Function0 function0 = wtgVar.a;
        if (((Number) function0.invoke()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        ((Number) wtgVar.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(wtg wtgVar) {
        Function0 function0 = wtgVar.a;
        if (((Number) function0.invoke()).floatValue() < ((Number) wtgVar.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.d.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    public final void B(s3h s3hVar, t3h t3hVar) {
        int[] iArr = b7a.a;
        vzc vzcVar = new vzc();
        List j = s3h.j(4, s3hVar);
        wma wmaVar = s3hVar.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            s3h s3hVar2 = (s3h) j.get(i);
            p6a s = s();
            int i2 = s3hVar2.f;
            if (s.a(i2)) {
                if (!t3hVar.b.c(i2)) {
                    w(wmaVar);
                    return;
                }
                vzcVar.a(i2);
            }
        }
        vzc vzcVar2 = t3hVar.b;
        int[] iArr2 = vzcVar2.b;
        long[] jArr = vzcVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !vzcVar.c(iArr2[(i3 << 3) + i5])) {
                            w(wmaVar);
                            return;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List j3 = s3h.j(4, s3hVar);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            s3h s3hVar3 = (s3h) j3.get(i6);
            t3h t3hVar2 = (t3h) this.G.b(s3hVar3.f);
            if (t3hVar2 != null && s().a(s3hVar3.f)) {
                B(s3hVar3, t3hVar2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.o = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.o = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent o = o(i, i2);
        if (num != null) {
            o.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            o.setContentDescription(ycb.a(list, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, 62));
        }
        return C(o);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent o = o(A(i), 32);
        o.setContentChangeTypes(i2);
        if (str != null) {
            o.getText().add(str);
        }
        C(o);
    }

    public final void G(int i) {
        zy zyVar = this.y;
        if (zyVar != null) {
            s3h s3hVar = zyVar.a;
            if (i != s3hVar.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - zyVar.f <= 1000) {
                AccessibilityEvent o = o(A(s3hVar.f), 131072);
                o.setFromIndex(zyVar.d);
                o.setToIndex(zyVar.e);
                o.setAction(zyVar.b);
                o.setMovementGranularity(zyVar.c);
                o.getText().add(t(s3hVar));
                C(o);
            }
        }
        this.y = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x050f, code lost:
    
        if (r8 != null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0514, code lost:
    
        if (r8 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0127, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r1, r13) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(p6a p6aVar) {
        Integer num;
        Integer num2;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num4;
        l3h l3hVar;
        s3h s3hVar;
        int i8;
        int i9;
        int i10;
        int i11;
        x0d x0dVar;
        wma wmaVar;
        int i12;
        l3h l3hVar2;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i13;
        int i14;
        wma wmaVar2;
        Integer num6;
        int i15;
        x0d x0dVar2;
        int i16;
        nug nugVar;
        boolean z;
        nug nugVar2;
        int i17;
        String str;
        Integer num7;
        int i18;
        int i19;
        Integer num8;
        AccessibilityEvent p;
        p6a p6aVar2 = p6aVar;
        Integer num9 = 64;
        ArrayList arrayList4 = this.L;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = p6aVar2.b;
        long[] jArr3 = p6aVar2.a;
        int i20 = 2;
        int length = jArr3.length - 2;
        int i21 = 0;
        Integer num10 = 0;
        if (length < 0) {
            return;
        }
        int i22 = 0;
        while (true) {
            long j2 = jArr3[i22];
            int i23 = i20;
            int i24 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i25 = 8;
                int i26 = 8 - ((~(i22 - i24)) >>> 31);
                long j3 = j2;
                int i27 = i21;
                while (i27 < i26) {
                    if ((j3 & 255) < 128) {
                        int i28 = iArr3[(i22 << 3) + i27];
                        t3h t3hVar = (t3h) this.G.b(i28);
                        if (t3hVar != null) {
                            l3h l3hVar3 = t3hVar.a;
                            x0d x0dVar3 = l3hVar3.a;
                            u3h u3hVar = (u3h) p6aVar2.b(i28);
                            int i29 = i25;
                            s3h s3hVar2 = u3hVar != null ? u3hVar.a : null;
                            if (s3hVar2 == null) {
                                throw wt3.j("no value for specified key");
                            }
                            wma wmaVar3 = s3hVar2.c;
                            l3h l3hVar4 = s3hVar2.d;
                            iArr2 = iArr3;
                            int i30 = s3hVar2.f;
                            jArr2 = jArr3;
                            x0d x0dVar4 = l3hVar4.a;
                            i7 = i22;
                            Object[] objArr = x0dVar4.b;
                            Object[] objArr2 = x0dVar4.c;
                            long[] jArr4 = x0dVar4.a;
                            i3 = i27;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                wma wmaVar4 = wmaVar3;
                                i5 = i26;
                                int i31 = 0;
                                i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i31];
                                    s3hVar = s3hVar2;
                                    int i32 = i31;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            if ((j4 & 255) < 128) {
                                                int i35 = (i32 << 3) + i34;
                                                Object obj = objArr[i35];
                                                int i36 = length2;
                                                Object obj2 = objArr2[i35];
                                                l3hVar2 = l3hVar3;
                                                a4h a4hVar = (a4h) obj;
                                                j = j4;
                                                a4h a4hVar2 = w3h.v;
                                                if (Intrinsics.c(a4hVar, a4hVar2) || Intrinsics.c(a4hVar, w3h.w)) {
                                                    int size = arrayList5.size();
                                                    i14 = i34;
                                                    int i37 = 0;
                                                    while (true) {
                                                        if (i37 >= size) {
                                                            nugVar = null;
                                                            break;
                                                        }
                                                        int i38 = size;
                                                        if (((nug) arrayList5.get(i37)).a == i28) {
                                                            nugVar = (nug) arrayList5.get(i37);
                                                            break;
                                                        } else {
                                                            i37++;
                                                            size = i38;
                                                        }
                                                    }
                                                    if (nugVar != null) {
                                                        z = false;
                                                    } else {
                                                        nugVar = new nug(arrayList4, i28);
                                                        z = true;
                                                    }
                                                    arrayList4.add(nugVar);
                                                } else {
                                                    i14 = i34;
                                                    z = false;
                                                }
                                                if (!z) {
                                                    Object g = x0dVar3.g(a4hVar);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                }
                                                a4h a4hVar3 = w3h.d;
                                                if (Intrinsics.c(a4hVar, a4hVar3)) {
                                                    obj2.getClass();
                                                    String str2 = (String) obj2;
                                                    boolean c = x0dVar3.c(a4hVar3);
                                                    int i39 = i29;
                                                    if (c) {
                                                        F(i28, i39, str2);
                                                    }
                                                    Unit unit = Unit.a;
                                                } else {
                                                    int i40 = i29;
                                                    if (Intrinsics.c(a4hVar, w3h.b)) {
                                                        E(this, A(i28), a.o, num9, i40);
                                                        E(this, A(i28), a.o, num10, i40);
                                                    } else if (Intrinsics.c(a4hVar, w3h.L)) {
                                                        E(this, A(i28), a.o, 8192, 8);
                                                        E(this, A(i28), a.o, num10, 8);
                                                    } else if (Intrinsics.c(a4hVar, w3h.O)) {
                                                        E(this, A(i28), a.o, 3072, 8);
                                                    } else if (Intrinsics.c(a4hVar, w3h.c)) {
                                                        E(this, A(i28), a.o, num9, 8);
                                                        E(this, A(i28), a.o, num10, 8);
                                                    } else {
                                                        a4h a4hVar4 = w3h.K;
                                                        arrayList3 = arrayList5;
                                                        int i41 = 4;
                                                        if (Intrinsics.c(a4hVar, a4hVar4)) {
                                                            Object g2 = x0dVar4.g(w3h.z);
                                                            if (g2 == null) {
                                                                g2 = null;
                                                            }
                                                            u5g u5gVar = (u5g) g2;
                                                            if (u5gVar != null && u5gVar.a == 4) {
                                                                Object g3 = x0dVar4.g(a4hVar4);
                                                                if (g3 == null) {
                                                                    g3 = null;
                                                                }
                                                                if (Intrinsics.c(g3, Boolean.TRUE)) {
                                                                    AccessibilityEvent o = o(A(i28), 4);
                                                                    s3h s3hVar3 = s3hVar;
                                                                    wmaVar2 = wmaVar4;
                                                                    s3h s3hVar4 = new s3h(s3hVar3.a, true, wmaVar2, l3hVar4);
                                                                    Object g4 = s3hVar4.k().a.g(w3h.a);
                                                                    if (g4 == null) {
                                                                        g4 = null;
                                                                    }
                                                                    List list = (List) g4;
                                                                    s3hVar = s3hVar3;
                                                                    String a = list != null ? ycb.a(list, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, 62) : null;
                                                                    Object g5 = s3hVar4.k().a.g(w3h.C);
                                                                    if (g5 == null) {
                                                                        g5 = null;
                                                                    }
                                                                    List list2 = (List) g5;
                                                                    i13 = i33;
                                                                    String a2 = list2 != null ? ycb.a(list2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, 62) : null;
                                                                    if (a != null) {
                                                                        o.setContentDescription(a);
                                                                        Unit unit2 = Unit.a;
                                                                    }
                                                                    if (a2 != null) {
                                                                        o.getText().add(a2);
                                                                    }
                                                                    C(o);
                                                                } else {
                                                                    i13 = i33;
                                                                    wmaVar2 = wmaVar4;
                                                                    E(this, A(i28), a.o, num10, 8);
                                                                }
                                                            } else {
                                                                i13 = i33;
                                                                wmaVar2 = wmaVar4;
                                                                E(this, A(i28), a.o, num9, 8);
                                                                E(this, A(i28), a.o, num10, 8);
                                                            }
                                                        } else {
                                                            i13 = i33;
                                                            wmaVar2 = wmaVar4;
                                                            if (Intrinsics.c(a4hVar, w3h.a)) {
                                                                int A = A(i28);
                                                                obj2.getClass();
                                                                D(A, a.o, 4, (List) obj2);
                                                            } else {
                                                                a4h a4hVar5 = w3h.G;
                                                                String str3 = "";
                                                                if (Intrinsics.c(a4hVar, a4hVar5)) {
                                                                    if (x0dVar4.c(k3h.k)) {
                                                                        Object g6 = x0dVar3.g(a4hVar5);
                                                                        if (g6 == null) {
                                                                            g6 = null;
                                                                        }
                                                                        q80 q80Var = (q80) g6;
                                                                        if (q80Var == null) {
                                                                            q80Var = "";
                                                                        }
                                                                        Object g7 = x0dVar4.g(a4hVar5);
                                                                        if (g7 == null) {
                                                                            g7 = null;
                                                                        }
                                                                        CharSequence charSequence = (q80) g7;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence P = P(charSequence);
                                                                        int length3 = q80Var.length();
                                                                        int length4 = charSequence.length();
                                                                        int i42 = length3 > length4 ? length4 : length3;
                                                                        Integer num11 = num10;
                                                                        int i43 = 0;
                                                                        while (true) {
                                                                            num5 = num9;
                                                                            if (i43 >= i42) {
                                                                                i18 = length3;
                                                                                break;
                                                                            }
                                                                            i18 = length3;
                                                                            if (q80Var.charAt(i43) != charSequence.charAt(i43)) {
                                                                                break;
                                                                            }
                                                                            i43++;
                                                                            length3 = i18;
                                                                            num9 = num5;
                                                                        }
                                                                        int i44 = 0;
                                                                        while (true) {
                                                                            if (i44 >= i42 - i43) {
                                                                                i19 = i44;
                                                                                break;
                                                                            }
                                                                            i19 = i44;
                                                                            if (q80Var.charAt((i18 - 1) - i44) != charSequence.charAt((length4 - 1) - i19)) {
                                                                                break;
                                                                            } else {
                                                                                i44 = i19 + 1;
                                                                            }
                                                                        }
                                                                        int i45 = (i18 - i19) - i43;
                                                                        int i46 = (length4 - i19) - i43;
                                                                        a4h a4hVar6 = w3h.N;
                                                                        boolean c2 = x0dVar3.c(a4hVar6);
                                                                        boolean c3 = x0dVar4.c(a4hVar6);
                                                                        boolean c4 = x0dVar3.c(w3h.G);
                                                                        boolean z2 = c4 && !c2 && c3;
                                                                        boolean z3 = c4 && c2 && !c3;
                                                                        if (z2 || z3) {
                                                                            i15 = i28;
                                                                            x0dVar2 = x0dVar3;
                                                                            num8 = num11;
                                                                            p = p(A(i28), num8, num11, Integer.valueOf(length4), P);
                                                                        } else {
                                                                            p = o(A(i28), 16);
                                                                            p.setFromIndex(i43);
                                                                            p.setRemovedCount(i45);
                                                                            p.setAddedCount(i46);
                                                                            p.setBeforeText(q80Var);
                                                                            p.getText().add(P);
                                                                            i15 = i28;
                                                                            x0dVar2 = x0dVar3;
                                                                            num8 = num11;
                                                                        }
                                                                        p.setClassName("android.widget.EditText");
                                                                        C(p);
                                                                        if (z2 || z3) {
                                                                            long j5 = ((pej) l3hVar4.d(w3h.H)).a;
                                                                            num7 = num8;
                                                                            p.setFromIndex((int) (j5 >> 32));
                                                                            p.setToIndex((int) (j5 & 4294967295L));
                                                                            C(p);
                                                                        } else {
                                                                            num7 = num8;
                                                                        }
                                                                        Unit unit3 = Unit.a;
                                                                    } else {
                                                                        num7 = num10;
                                                                        x0dVar2 = x0dVar3;
                                                                        num5 = num9;
                                                                        i15 = i28;
                                                                        E(this, A(i15), a.o, Integer.valueOf(i23), 8);
                                                                    }
                                                                    i16 = i36;
                                                                    num6 = num7;
                                                                } else {
                                                                    Integer num12 = num10;
                                                                    x0dVar2 = x0dVar3;
                                                                    num5 = num9;
                                                                    i15 = i28;
                                                                    a4h a4hVar7 = w3h.H;
                                                                    if (Intrinsics.c(a4hVar, a4hVar7)) {
                                                                        Object g8 = x0dVar4.g(a4hVar5);
                                                                        if (g8 == null) {
                                                                            g8 = null;
                                                                        }
                                                                        q80 q80Var2 = (q80) g8;
                                                                        if (q80Var2 != null && (str = q80Var2.b) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j6 = ((pej) l3hVar4.d(a4hVar7)).a;
                                                                        num6 = num12;
                                                                        C(p(A(i15), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), P(str3)));
                                                                        G(i30);
                                                                        Unit unit4 = Unit.a;
                                                                        i16 = i36;
                                                                    } else {
                                                                        i16 = i36;
                                                                        num6 = num12;
                                                                        if (Intrinsics.c(a4hVar, a4hVar2) || Intrinsics.c(a4hVar, w3h.w)) {
                                                                            w(wmaVar2);
                                                                            int size2 = arrayList4.size();
                                                                            int i47 = 0;
                                                                            while (true) {
                                                                                if (i47 >= size2) {
                                                                                    nugVar2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((nug) arrayList4.get(i47)).a == i15) {
                                                                                        nugVar2 = (nug) arrayList4.get(i47);
                                                                                        break;
                                                                                    }
                                                                                    i47++;
                                                                                }
                                                                            }
                                                                            nugVar2.getClass();
                                                                            Object g9 = x0dVar4.g(a4hVar2);
                                                                            if (g9 == null) {
                                                                                g9 = null;
                                                                            }
                                                                            nugVar2.e = (wtg) g9;
                                                                            Object g10 = x0dVar4.g(w3h.w);
                                                                            if (g10 == null) {
                                                                                g10 = null;
                                                                            }
                                                                            nugVar2.f = (wtg) g10;
                                                                            if (nugVar2.b.contains(nugVar2)) {
                                                                                this.d.getSnapshotObserver().a.i(nugVar2, this.M, new y1(i41, nugVar2, this));
                                                                            }
                                                                            Unit unit5 = Unit.a;
                                                                        } else if (Intrinsics.c(a4hVar, w3h.l)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i17 = 8;
                                                                                C(o(A(i30), 8));
                                                                            } else {
                                                                                i17 = 8;
                                                                            }
                                                                            E(this, A(i30), a.o, num6, i17);
                                                                        } else {
                                                                            a4h a4hVar8 = k3h.x;
                                                                            if (Intrinsics.c(a4hVar, a4hVar8)) {
                                                                                List list3 = (List) l3hVar4.d(a4hVar8);
                                                                                Object g11 = x0dVar2.g(a4hVar8);
                                                                                if (g11 == null) {
                                                                                    g11 = null;
                                                                                }
                                                                                List list4 = (List) g11;
                                                                                if (list4 != null) {
                                                                                    y0d y0dVar = rrg.a;
                                                                                    y0d y0dVar2 = new y0d();
                                                                                    if (list3.size() > 0) {
                                                                                        list3.get(0).getClass();
                                                                                        pvd.j();
                                                                                        return;
                                                                                    }
                                                                                    y0d y0dVar3 = new y0d();
                                                                                    if (list4.size() > 0) {
                                                                                        list4.get(0).getClass();
                                                                                        pvd.j();
                                                                                        return;
                                                                                    }
                                                                                    i10 = !y0dVar2.equals(y0dVar3) ? 1 : 0;
                                                                                } else if (!list3.isEmpty()) {
                                                                                    i10 = 1;
                                                                                }
                                                                                Unit unit6 = Unit.a;
                                                                            } else {
                                                                                if (obj2 instanceof m9) {
                                                                                    m9 m9Var = (m9) obj2;
                                                                                    Object g12 = x0dVar2.g(a4hVar);
                                                                                    if (g12 == null) {
                                                                                        g12 = null;
                                                                                    }
                                                                                    if (m9Var != g12) {
                                                                                        if (g12 instanceof m9) {
                                                                                            String str4 = m9Var.a;
                                                                                            m9 m9Var2 = (m9) g12;
                                                                                            dt8 dt8Var = m9Var2.b;
                                                                                            if (Intrinsics.c(str4, m9Var2.a)) {
                                                                                                dt8 dt8Var2 = m9Var.b;
                                                                                                if (dt8Var2 == null) {
                                                                                                }
                                                                                                if (dt8Var2 != null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    i10 = 0;
                                                                                    Unit unit7 = Unit.a;
                                                                                }
                                                                                i10 = 1;
                                                                                Unit unit72 = Unit.a;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        num6 = num10;
                                                        x0dVar2 = x0dVar3;
                                                        num5 = num9;
                                                        i16 = i36;
                                                        i15 = i28;
                                                    }
                                                }
                                                num6 = num10;
                                                num5 = num9;
                                                arrayList3 = arrayList5;
                                                i13 = i33;
                                                wmaVar2 = wmaVar4;
                                                i16 = i36;
                                                i15 = i28;
                                                x0dVar2 = x0dVar3;
                                            } else {
                                                l3hVar2 = l3hVar3;
                                                num5 = num9;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i13 = i33;
                                                i14 = i34;
                                                wmaVar2 = wmaVar4;
                                                num6 = num10;
                                                i15 = i28;
                                                x0dVar2 = x0dVar3;
                                                i16 = length2;
                                            }
                                            i28 = i15;
                                            x0dVar3 = x0dVar2;
                                            wmaVar4 = wmaVar2;
                                            i33 = i13;
                                            arrayList5 = arrayList3;
                                            num9 = num5;
                                            i34 = i14 + 1;
                                            length2 = i16;
                                            num10 = num6;
                                            j4 = j >> 8;
                                            i29 = 8;
                                            l3hVar3 = l3hVar2;
                                        }
                                        num4 = num10;
                                        l3hVar = l3hVar3;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        int i48 = i33;
                                        wmaVar = wmaVar4;
                                        i8 = 1;
                                        i12 = length2;
                                        i9 = i28;
                                        x0dVar = x0dVar3;
                                        i6 = 0;
                                        if (i48 != i29) {
                                            break;
                                        }
                                    } else {
                                        num4 = num10;
                                        l3hVar = l3hVar3;
                                        x0dVar = x0dVar3;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        wmaVar = wmaVar4;
                                        i6 = 0;
                                        i8 = 1;
                                        i12 = length2;
                                        i9 = i28;
                                    }
                                    if (i32 == i12) {
                                        break;
                                    }
                                    i28 = i9;
                                    x0dVar3 = x0dVar;
                                    wmaVar4 = wmaVar;
                                    s3hVar2 = s3hVar;
                                    l3hVar3 = l3hVar;
                                    arrayList5 = arrayList2;
                                    num9 = num3;
                                    i29 = 8;
                                    i31 = i32 + 1;
                                    length2 = i12;
                                    num10 = num4;
                                }
                            } else {
                                l3hVar = l3hVar3;
                                num3 = num9;
                                arrayList2 = arrayList5;
                                i5 = i26;
                                s3hVar = s3hVar2;
                                i6 = 0;
                                i8 = 1;
                                num4 = num10;
                                i9 = i28;
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                Iterator it = l3hVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i6;
                                        break;
                                    } else {
                                        if (!s3hVar.k().a.c((a4h) ((Map.Entry) it.next()).getKey())) {
                                            i11 = i8;
                                            break;
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                            if (i10 != 0) {
                                i4 = 8;
                                E(this, A(i9), a.o, num4, 8);
                            } else {
                                i4 = 8;
                            }
                            j3 >>= i4;
                            i27 = i3 + 1;
                            p6aVar2 = p6aVar;
                            i25 = i4;
                            i21 = i6;
                            num10 = num4;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i22 = i7;
                            i26 = i5;
                            arrayList5 = arrayList2;
                            num9 = num3;
                        }
                    }
                    i3 = i27;
                    num3 = num9;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i4 = i25;
                    i5 = i26;
                    i6 = i21;
                    i7 = i22;
                    num4 = num10;
                    j3 >>= i4;
                    i27 = i3 + 1;
                    p6aVar2 = p6aVar;
                    i25 = i4;
                    i21 = i6;
                    num10 = num4;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i22 = i7;
                    i26 = i5;
                    arrayList5 = arrayList2;
                    num9 = num3;
                }
                num2 = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i49 = i25;
                int i50 = i26;
                i = i21;
                int i51 = i22;
                num = num10;
                if (i50 != i49) {
                    return;
                } else {
                    i2 = i51;
                }
            } else {
                num = num10;
                num2 = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i21;
                i2 = i22;
            }
            if (i2 == i24) {
                return;
            }
            i22 = i2 + 1;
            p6aVar2 = p6aVar;
            i21 = i;
            num10 = num;
            i20 = i23;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num9 = num2;
            length = i24;
        }
    }

    public final void I(wma wmaVar, vzc vzcVar) {
        l3h x;
        if (wmaVar.H() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(wmaVar)) {
            wma wmaVar2 = null;
            if (!wmaVar.F.n(8)) {
                wmaVar = wmaVar.v();
                while (true) {
                    if (wmaVar == null) {
                        wmaVar = null;
                        break;
                    } else if (wmaVar.F.n(8)) {
                        break;
                    } else {
                        wmaVar = wmaVar.v();
                    }
                }
            }
            if (wmaVar == null || (x = wmaVar.x()) == null) {
                return;
            }
            if (!x.c) {
                wma v = wmaVar.v();
                while (true) {
                    if (v != null) {
                        l3h x2 = v.x();
                        if (x2 != null && x2.c) {
                            wmaVar2 = v;
                            break;
                        }
                        v = v.v();
                    } else {
                        break;
                    }
                }
                if (wmaVar2 != null) {
                    wmaVar = wmaVar2;
                }
            }
            int i = wmaVar.b;
            if (vzcVar.a(i)) {
                E(this, A(i), a.o, 1, 8);
            }
        }
    }

    public final void J(wma wmaVar) {
        if (wmaVar.H() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(wmaVar)) {
            int i = wmaVar.b;
            wtg wtgVar = (wtg) this.p.b(i);
            wtg wtgVar2 = (wtg) this.q.b(i);
            if (wtgVar == null && wtgVar2 == null) {
                return;
            }
            AccessibilityEvent o = o(i, 4096);
            if (wtgVar != null) {
                o.setScrollX((int) ((Number) wtgVar.a.invoke()).floatValue());
                o.setMaxScrollX((int) ((Number) wtgVar.b.invoke()).floatValue());
            }
            if (wtgVar2 != null) {
                o.setScrollY((int) ((Number) wtgVar2.a.invoke()).floatValue());
                o.setMaxScrollY((int) ((Number) wtgVar2.b.invoke()).floatValue());
            }
            C(o);
        }
    }

    public final boolean K(s3h s3hVar, int i, int i2, boolean z) {
        String t;
        l3h l3hVar = s3hVar.d;
        int i3 = s3hVar.f;
        a4h a4hVar = k3h.j;
        if (l3hVar.a.c(a4hVar) && wkn.x(s3hVar)) {
            ct8 ct8Var = (ct8) ((m9) s3hVar.d.d(a4hVar)).b;
            if (ct8Var != null) {
                return ((Boolean) ct8Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.t) && (t = t(s3hVar)) != null) {
            if (i < 0 || i != i2 || i2 > t.length()) {
                i = -1;
            }
            this.t = i;
            boolean z2 = t.length() > 0;
            C(p(A(i3), z2 ? Integer.valueOf(this.t) : null, z2 ? Integer.valueOf(this.t) : null, z2 ? Integer.valueOf(t.length()) : null, t));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        xy xyVar = this.d;
        long y = xyVar.y((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long y2 = xyVar.y((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (y >> 32);
        int i2 = (int) (y2 >> 32);
        int i3 = (int) (y & 4294967295L);
        int i4 = (int) (y2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        vzc vzcVar = new vzc();
        vzc vzcVar2 = this.A;
        int[] iArr = vzcVar2.b;
        long[] jArr3 = vzcVar2.a;
        int length = jArr3.length - 2;
        uzc uzcVar = this.G;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            u3h u3hVar = (u3h) s().b(i8);
                            s3h s3hVar = u3hVar != null ? u3hVar.a : null;
                            if (s3hVar != null) {
                                if (s3hVar.d.a.c(w3h.d)) {
                                }
                            }
                            vzcVar.a(i8);
                            t3h t3hVar = (t3h) uzcVar.b(i8);
                            if (t3hVar != null) {
                                Object g = t3hVar.a.a.g(w3h.d);
                                r23 = g != 0 ? g : null;
                            }
                            F(i8, 32, r23);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = vzcVar.b;
        long[] jArr4 = vzcVar.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                            int i15 = vzcVar2.c;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = vzcVar2.a;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (vzcVar2.b[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                vzcVar2.g(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        uzcVar.c();
        p6a s = s();
        int[] iArr3 = s.b;
        Object[] objArr = s.c;
        long[] jArr6 = s.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            s3h s3hVar2 = ((u3h) objArr[i26]).a;
                            l3h l3hVar = s3hVar2.d;
                            a4h a4hVar = w3h.d;
                            if (l3hVar.a.c(a4hVar) && vzcVar2.a(i27)) {
                                F(i27, 16, (String) s3hVar2.d.d(a4hVar));
                            }
                            uzcVar.i(i27, new t3h(s3hVar2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.H = new t3h(this.d.getSemanticsOwner().a(), s());
    }

    @Override // defpackage.p9
    public final j0l b(View view) {
        return this.j;
    }

    public final void j(int i, da daVar, String str, Bundle bundle) {
        s3h s3hVar;
        aej q;
        int i2;
        int i3;
        int i4;
        xy xyVar;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = daVar.a;
        u3h u3hVar = (u3h) s().b(i);
        if (u3hVar == null || (s3hVar = u3hVar.a) == null) {
            return;
        }
        wma wmaVar = s3hVar.c;
        l3h l3hVar = s3hVar.d;
        x0d x0dVar = l3hVar.a;
        String t = t(s3hVar);
        if (Intrinsics.c(str, this.D)) {
            int d = this.B.d(i);
            if (d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d);
                return;
            }
            return;
        }
        if (Intrinsics.c(str, this.E)) {
            int d2 = this.C.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        boolean c = x0dVar.c(k3h.a);
        xy xyVar2 = this.d;
        boolean z = false;
        if (c && bundle != null && Intrinsics.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i6 <= 0 || i5 < 0) {
                return;
            }
            if (i5 < (t != null ? t.length() : Integer.MAX_VALUE) && (q = yfa.q(l3hVar)) != null) {
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                while (i7 < i6) {
                    int i8 = i5 + i7;
                    if (i8 >= q.a.a.b.length()) {
                        arrayList.add(z);
                        i2 = i5;
                        i3 = i6;
                        i4 = i7;
                        xyVar = xyVar2;
                    } else {
                        oqf b = q.b(i8);
                        wdd d3 = s3hVar.d();
                        long j = 0;
                        if (d3 != null) {
                            if (!d3.e1().n) {
                                d3 = null;
                            }
                            if (d3 != null) {
                                j = d3.P(0L);
                            }
                        }
                        oqf k = b.k(j);
                        oqf g = s3hVar.g();
                        oqf g2 = k.i(g) ? k.g(g) : null;
                        if (g2 != null) {
                            float f = g2.a;
                            float f2 = g2.b;
                            long floatToRawIntBits = Float.floatToRawIntBits(f);
                            int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
                            xy xyVar3 = xyVar2;
                            long y = xyVar3.y((floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32));
                            long y2 = xyVar3.y((Float.floatToRawIntBits(g2.d) & 4294967295L) | (Float.floatToRawIntBits(g2.c) << 32));
                            int i9 = (int) (y >> 32);
                            i2 = i5;
                            i3 = i6;
                            int i10 = (int) (y2 >> 32);
                            float min = Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
                            i4 = i7;
                            int i11 = (int) (y & 4294967295L);
                            xyVar = xyVar3;
                            int i12 = (int) (y2 & 4294967295L);
                            rectF = new RectF(min, Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)));
                        } else {
                            i2 = i5;
                            i3 = i6;
                            i4 = i7;
                            xyVar = xyVar2;
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i7 = i4 + 1;
                    i6 = i3;
                    i5 = i2;
                    xyVar2 = xyVar;
                    z = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
            return;
        }
        a4h a4hVar = w3h.A;
        if (x0dVar.c(a4hVar) && bundle != null && Intrinsics.c(str, "androidx.compose.ui.semantics.testTag")) {
            Object g3 = x0dVar.g(a4hVar);
            String str2 = (String) (g3 == null ? null : g3);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (Intrinsics.c(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, s3hVar.f);
            return;
        }
        if (Intrinsics.c(str, "androidx.compose.ui.semantics.shapeType")) {
            Object g4 = x0dVar.g(w3h.S);
            uah uahVar = (uah) (g4 == null ? null : g4);
            if (uahVar != null) {
                Rect rect = new Rect();
                daVar.f(rect);
                oqf u = u(s3hVar, rect, uahVar);
                float f3 = u.b;
                float f4 = u.a;
                pea a = uahVar.a(u.e(), wmaVar.z, xyVar2.getDensity());
                if (a instanceof dxd) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a, f4, f3));
                    return;
                } else if (a instanceof exd) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a, f4, f3));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(a));
                    return;
                } else if (!(a instanceof cxd)) {
                    zzl.b();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(a, f4, f3));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.c(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object g5 = x0dVar.g(w3h.S);
            uah uahVar2 = (uah) (g5 == null ? null : g5);
            if (uahVar2 != null) {
                Rect rect2 = new Rect();
                daVar.f(rect2);
                oqf u2 = u(s3hVar, rect2, uahVar2);
                Rect L = L(uahVar2.a(u2.e(), wmaVar.z, xyVar2.getDensity()), u2.a, u2.b);
                if (L != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.c(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object g6 = x0dVar.g(w3h.S);
            uah uahVar3 = (uah) (g6 == null ? null : g6);
            if (uahVar3 != null) {
                Rect rect3 = new Rect();
                daVar.f(rect3);
                float[] N2 = N(uahVar3.a(u(s3hVar, rect3, uahVar3).e(), wmaVar.z, xyVar2.getDensity()));
                if (N2 != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N2);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.c(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object g7 = x0dVar.g(w3h.S);
            uah uahVar4 = (uah) (g7 == null ? null : g7);
            if (uahVar4 != null) {
                Rect rect4 = new Rect();
                daVar.f(rect4);
                oqf u3 = u(s3hVar, rect4, uahVar4);
                Region O = O(uahVar4.a(u3.e(), wmaVar.z, xyVar2.getDensity()), u3.a, u3.b);
                if (O != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O);
                }
            }
        }
    }

    public final Rect k(u3h u3hVar) {
        x6a x6aVar = u3hVar.b;
        return M(x6aVar.a, x6aVar.b, x6aVar.c, x6aVar.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (defpackage.n4o.y(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002c, B:14:0x0056, B:20:0x0067, B:22:0x006f, B:24:0x0078, B:26:0x007d, B:28:0x008c, B:31:0x009b, B:32:0x00a2, B:40:0x0040, B:42:0x0047), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bb -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(sq3 sq3Var) {
        az azVar;
        int i;
        gh0 gh0Var;
        vzc vzcVar;
        b62 b62Var;
        vzc vzcVar2;
        b62 b62Var2;
        Object a;
        try {
            if (sq3Var instanceof az) {
                azVar = (az) sq3Var;
                int i2 = azVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    azVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = azVar.t;
                    lu3 lu3Var = lu3.a;
                    i = azVar.v;
                    gh0Var = this.v;
                    if (i != 0) {
                        y6a.M(obj);
                        vzcVar = new vzc();
                        g62 g62Var = this.w;
                        g62Var.getClass();
                        b62Var = new b62(g62Var);
                        azVar.r = vzcVar;
                        azVar.s = b62Var;
                        azVar.v = 1;
                        a = b62Var.a(azVar);
                        if (a != lu3Var) {
                        }
                    } else if (i == 1) {
                        b62Var2 = azVar.s;
                        vzcVar2 = azVar.r;
                        y6a.M(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b62Var2 = azVar.s;
                        vzcVar2 = azVar.r;
                        y6a.M(obj);
                        vzcVar = vzcVar2;
                        b62Var = b62Var2;
                        azVar.r = vzcVar;
                        azVar.s = b62Var;
                        azVar.v = 1;
                        a = b62Var.a(azVar);
                        if (a != lu3Var) {
                            return lu3Var;
                        }
                        b62 b62Var3 = b62Var;
                        vzcVar2 = vzcVar;
                        obj = a;
                        b62Var2 = b62Var3;
                        if (((Boolean) obj).booleanValue()) {
                            gh0Var.clear();
                            return Unit.a;
                        }
                        b62Var2.c();
                        if (v()) {
                            int i3 = gh0Var.c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                wma wmaVar = (wma) gh0Var.b[i4];
                                I(wmaVar, vzcVar2);
                                J(wmaVar);
                            }
                            vzcVar2.b();
                            Handler handler = this.d.getHandler();
                            if (!this.I && handler != null) {
                                this.I = true;
                                handler.post(this.K);
                            }
                        }
                        gh0Var.clear();
                        this.p.c();
                        this.q.c();
                        long j = this.h;
                        azVar.r = vzcVar2;
                        azVar.s = b62Var2;
                        azVar.v = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            gh0Var.clear();
            throw th;
        }
        azVar = new az(this, sq3Var);
        Object obj2 = azVar.t;
        lu3 lu3Var2 = lu3.a;
        i = azVar.v;
        gh0Var = this.v;
    }

    public final boolean m(long j, int i, boolean z) {
        a4h a4hVar;
        int i2;
        if (Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            p6a s = s();
            if (!dnd.c(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    a4hVar = w3h.w;
                } else {
                    if (z) {
                        zzl.b();
                        return false;
                    }
                    a4hVar = w3h.v;
                }
                Object[] objArr = s.c;
                long[] jArr = s.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    u3h u3hVar = (u3h) objArr[(i3 << 3) + i6];
                                    x6a x6aVar = u3hVar.b;
                                    float f = x6aVar.a;
                                    i2 = i4;
                                    float f2 = x6aVar.b;
                                    float f3 = x6aVar.c;
                                    float f4 = x6aVar.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object g = u3hVar.a.d.a.g(a4hVar);
                                        if (g == null) {
                                            g = null;
                                        }
                                        wtg wtgVar = (wtg) g;
                                        if (wtgVar != null) {
                                            Function0 function0 = wtgVar.a;
                                            if (i < 0) {
                                                if (((Number) function0.invoke()).floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) function0.invoke()).floatValue() >= ((Number) wtgVar.b.invoke()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.d.getSemanticsOwner().a(), this.H);
            }
            Unit unit = Unit.a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        u3h u3hVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        xy xyVar = this.d;
        obtain.setPackageName(xyVar.getContext().getPackageName());
        obtain.setSource(xyVar, i);
        if (v() && (u3hVar = (u3h) s().b(i)) != null) {
            s3h s3hVar = u3hVar.a;
            obtain.setPassword(s3hVar.d.a.c(w3h.N));
            Object g = s3hVar.d.a.g(w3h.o);
            if (g == null) {
                g = null;
            }
            boolean c = Intrinsics.c(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                q9.E(obtain, c);
            }
        }
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager.isEnabled()) {
            this.i = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.d.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.K);
        AccessibilityManager accessibilityManager = this.g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent o = o(i, 8192);
        if (num != null) {
            o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            o.getText().add(charSequence);
        }
        return o;
    }

    public final int q(s3h s3hVar) {
        l3h l3hVar = s3hVar.d;
        if (!l3hVar.a.c(w3h.a)) {
            a4h a4hVar = w3h.H;
            if (l3hVar.a.c(a4hVar)) {
                return (int) (((pej) l3hVar.d(a4hVar)).a & 4294967295L);
            }
        }
        return this.t;
    }

    public final int r(s3h s3hVar) {
        l3h l3hVar = s3hVar.d;
        if (!l3hVar.a.c(w3h.a)) {
            a4h a4hVar = w3h.H;
            if (l3hVar.a.c(a4hVar)) {
                return (int) (((pej) l3hVar.d(a4hVar)).a >> 32);
            }
        }
        return this.t;
    }

    public final p6a s() {
        if (this.x) {
            this.x = false;
            xy xyVar = this.d;
            this.z = rd0.C(xyVar.getSemanticsOwner(), ry.k);
            if (v()) {
                uzc uzcVar = this.z;
                Resources resources = xyVar.getContext().getResources();
                szc szcVar = this.B;
                szcVar.a();
                szc szcVar2 = this.C;
                szcVar2.a();
                u3h u3hVar = (u3h) uzcVar.b(-1);
                s3h s3hVar = u3hVar != null ? u3hVar.a : null;
                s3hVar.getClass();
                ArrayList b = c4h.b(s3hVar, new oo(uzcVar, 3), new oo(resources, 4), kotlin.collections.a.c(s3hVar));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((s3h) b.get(i - 1)).f;
                        int i3 = ((s3h) b.get(i)).f;
                        szcVar.f(i2, i3);
                        szcVar2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.z;
    }

    public final oqf u(s3h s3hVar, Rect rect, uah uahVar) {
        bz bzVar = new bz(uahVar);
        wma wmaVar = s3hVar.c;
        wtc wtcVar = (wtc) wmaVar.F.g;
        xv4 xv4Var = null;
        if ((wtcVar.d & 8) != 0) {
            loop0: while (true) {
                if (wtcVar == null) {
                    break;
                }
                if ((wtcVar.c & 8) != 0) {
                    wtc wtcVar2 = wtcVar;
                    i1d i1dVar = null;
                    while (wtcVar2 != null) {
                        if (wtcVar2 instanceof p3h) {
                            ((p3h) wtcVar2).i(bzVar);
                            if (bzVar.a) {
                                xv4Var = wtcVar2;
                                break loop0;
                            }
                        } else if ((wtcVar2.c & 8) != 0 && (wtcVar2 instanceof bw4)) {
                            int i = 0;
                            for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                if ((wtcVar3.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        wtcVar2 = wtcVar3;
                                    } else {
                                        if (i1dVar == null) {
                                            i1dVar = new i1d(new wtc[16], 0);
                                        }
                                        if (wtcVar2 != null) {
                                            i1dVar.b(wtcVar2);
                                            wtcVar2 = null;
                                        }
                                        i1dVar.b(wtcVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        wtcVar2 = c6o.X(i1dVar);
                    }
                }
                if ((wtcVar.d & 8) == 0) {
                    break;
                }
                wtcVar = wtcVar.f;
            }
        }
        xv4 xv4Var2 = (p3h) xv4Var;
        if (xv4Var2 == null || !((wtc) xv4Var2).a.n) {
            return o6a.m((wdd) wmaVar.F.e, false);
        }
        wdd b0 = c6o.b0(xv4Var2);
        oqf p = o6a.y(b0).p(b0, false);
        Rect M = M(p.a, p.b, p.c, p.d);
        float f = M.left - rect.left;
        float f2 = M.top - rect.top;
        return new oqf(f, f2, M.width() + f, M.height() + f2);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.i;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.i = list;
        }
        return !list.isEmpty();
    }

    public final void w(wma wmaVar) {
        if (this.v.add(wmaVar)) {
            this.w.d(Unit.a);
        }
    }
}
