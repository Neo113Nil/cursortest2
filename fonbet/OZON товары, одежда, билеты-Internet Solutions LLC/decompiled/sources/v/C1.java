package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5081a;
import androidx.camera.core.impl.C5098i0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.c1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u.C9887a;
import w.C10368u;

/* loaded from: classes8.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    public static final T.a<Long> f100872a = T.a.a(Long.TYPE, "camera2.streamSpec.streamUseCase");

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f100873b;

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap f100874c;

    static {
        HashMap hashMap = new HashMap();
        f100873b = hashMap;
        HashMap hashMap2 = new HashMap();
        f100874c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            c1.b bVar = c1.b.PREVIEW;
            hashSet.add(bVar);
            c1.b bVar2 = c1.b.METERING_REPEATING;
            hashSet.add(bVar2);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(bVar2);
            hashSet2.add(c1.b.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            c1.b bVar3 = c1.b.IMAGE_CAPTURE;
            hashSet3.add(bVar3);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            c1.b bVar4 = c1.b.VIDEO_CAPTURE;
            hashSet4.add(bVar4);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar3);
            hashSet5.add(bVar4);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar4);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static boolean a(@NonNull HashMap hashMap, @NonNull HashMap hashMap2, @NonNull List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            long f7 = ((androidx.camera.core.impl.V0) list.get(i11)).f();
            if (hashMap.containsKey(Integer.valueOf(i11))) {
                AbstractC5081a abstractC5081a = (AbstractC5081a) hashMap.get(Integer.valueOf(i11));
                if (!d(abstractC5081a.b().size() == 1 ? abstractC5081a.b().get(0) : c1.b.STREAM_SHARING, f7, abstractC5081a.b())) {
                    return false;
                }
            } else {
                if (!hashMap2.containsKey(Integer.valueOf(i11))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.b1 b1Var = (androidx.camera.core.impl.b1) hashMap2.get(Integer.valueOf(i11));
                if (!d(b1Var.N(), f7, b1Var.N() == c1.b.STREAM_SHARING ? ((R.e) b1Var).P() : Collections.EMPTY_LIST)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(@NonNull ArrayList arrayList, @NonNull ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5081a abstractC5081a = (AbstractC5081a) it.next();
            if (e(abstractC5081a.e(), abstractC5081a.b().get(0))) {
                return true;
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.b1 b1Var = (androidx.camera.core.impl.b1) it2.next();
            if (e(b1Var, b1Var.N())) {
                return true;
            }
        }
        return false;
    }

    private static C9887a c(androidx.camera.core.impl.T t2, long j11) {
        T.a<Long> aVar = f100872a;
        if (t2.d(aVar) && ((Long) t2.a(aVar)).longValue() == j11) {
            return null;
        }
        C5123v0 S11 = C5123v0.S(t2);
        S11.U(aVar, Long.valueOf(j11));
        return new C9887a(S11);
    }

    private static boolean d(c1.b bVar, long j11, List<c1.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != c1.b.STREAM_SHARING) {
            HashMap hashMap = f100873b;
            return hashMap.containsKey(Long.valueOf(j11)) && ((Set) hashMap.get(Long.valueOf(j11))).contains(bVar);
        }
        HashMap hashMap2 = f100874c;
        if (!hashMap2.containsKey(Long.valueOf(j11))) {
            return false;
        }
        Set set = (Set) hashMap2.get(Long.valueOf(j11));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator<c1.b> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean e(androidx.camera.core.impl.T t2, c1.b bVar) {
        if (((Boolean) t2.c(androidx.camera.core.impl.b1.f38262B, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        T.a<Integer> aVar = C5098i0.f38313H;
        if (t2.d(aVar)) {
            return Q1.f101068a[bVar.ordinal()] == 1 && ((Integer) t2.a(aVar)).intValue() == 2;
        }
        return false;
    }

    public static boolean f(@NonNull C10368u c10368u, @NonNull ArrayList arrayList, @NonNull HashMap hashMap, @NonNull HashMap hashMap2) {
        CameraCharacteristics.Key key;
        boolean z11;
        boolean z12;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC5081a) it.next()).e().getClass();
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                androidx.camera.core.impl.T0 t02 = (androidx.camera.core.impl.T0) hashMap.get((androidx.camera.core.impl.b1) it2.next());
                t02.getClass();
                t02.d().getClass();
            }
            key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            long[] jArr = (long[]) c10368u.a(key);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j11 : jArr) {
                    hashSet.add(Long.valueOf(j11));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    AbstractC5081a abstractC5081a = (AbstractC5081a) it3.next();
                    androidx.camera.core.impl.T e11 = abstractC5081a.e();
                    T.a<Long> aVar = C9887a.f99590I;
                    if (e11.d(aVar) && ((Long) abstractC5081a.e().a(aVar)).longValue() != 0) {
                        z12 = false;
                        z11 = true;
                    } else {
                        z11 = false;
                        z12 = true;
                    }
                } else {
                    z11 = false;
                    z12 = false;
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    androidx.camera.core.impl.b1 b1Var = (androidx.camera.core.impl.b1) it4.next();
                    T.a<Long> aVar2 = C9887a.f99590I;
                    if (b1Var.d(aVar2)) {
                        Long l11 = (Long) b1Var.a(aVar2);
                        if (l11.longValue() != 0) {
                            if (z12) {
                                throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                            }
                            hashSet2.add(l11);
                            z11 = true;
                        } else if (z11) {
                            throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                        }
                    } else if (z11) {
                        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                    }
                    z12 = true;
                }
                if (!z12) {
                    Iterator it5 = hashSet2.iterator();
                    while (it5.hasNext()) {
                        if (!hashSet.contains((Long) it5.next())) {
                        }
                    }
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        AbstractC5081a abstractC5081a2 = (AbstractC5081a) it6.next();
                        androidx.camera.core.impl.T e12 = abstractC5081a2.e();
                        C9887a c11 = c(e12, ((Long) e12.a(C9887a.f99590I)).longValue());
                        if (c11 != null) {
                            hashMap2.put(abstractC5081a2, abstractC5081a2.i(c11));
                        }
                    }
                    Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        androidx.camera.core.impl.b1 b1Var2 = (androidx.camera.core.impl.b1) it7.next();
                        androidx.camera.core.impl.T0 t03 = (androidx.camera.core.impl.T0) hashMap.get(b1Var2);
                        androidx.camera.core.impl.T d11 = t03.d();
                        C9887a c12 = c(d11, ((Long) d11.a(C9887a.f99590I)).longValue());
                        if (c12 != null) {
                            T0.a g10 = t03.g();
                            g10.d(c12);
                            hashMap.put(b1Var2, g10.a());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static void g(@NonNull HashMap hashMap, @NonNull HashMap hashMap2, @NonNull HashMap hashMap3, @NonNull HashMap hashMap4, @NonNull List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            long f7 = ((androidx.camera.core.impl.V0) list.get(i11)).f();
            if (hashMap3.containsKey(Integer.valueOf(i11))) {
                AbstractC5081a abstractC5081a = (AbstractC5081a) hashMap3.get(Integer.valueOf(i11));
                C9887a c11 = c(abstractC5081a.e(), f7);
                if (c11 != null) {
                    hashMap2.put(abstractC5081a, abstractC5081a.i(c11));
                }
            } else {
                if (!hashMap4.containsKey(Integer.valueOf(i11))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.b1 b1Var = (androidx.camera.core.impl.b1) hashMap4.get(Integer.valueOf(i11));
                androidx.camera.core.impl.T0 t02 = (androidx.camera.core.impl.T0) hashMap.get(b1Var);
                C9887a c12 = c(t02.d(), f7);
                if (c12 != null) {
                    T0.a g10 = t02.g();
                    g10.d(c12);
                    hashMap.put(b1Var, g10.a());
                }
            }
        }
    }
}
