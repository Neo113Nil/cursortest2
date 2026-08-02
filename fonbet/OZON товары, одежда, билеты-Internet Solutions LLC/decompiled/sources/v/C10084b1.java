package v;

import N3.C3660k;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5081a;
import g.C6594f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import w.C10368u;
import x.C10571a;

/* renamed from: v.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10084b1 {

    /* renamed from: a, reason: collision with root package name */
    private final C10368u f101206a;

    /* renamed from: b, reason: collision with root package name */
    private final x.c f101207b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f101208c;

    /* renamed from: v.b1$a */
    static final class a {
        static C.A a(@NonNull C10368u c10368u) {
            Long l11 = (Long) c10368u.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l11 != null) {
                return C10571a.b(l11.longValue());
            }
            return null;
        }
    }

    C10084b1(@NonNull C10368u c10368u) {
        this.f101206a = c10368u;
        this.f101207b = x.c.a(c10368u);
        int[] iArr = (int[]) c10368u.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z11 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (iArr[i11] == 18) {
                    z11 = true;
                    break;
                }
                i11++;
            }
        }
        this.f101208c = z11;
    }

    private static boolean a(@NonNull C.A a11, @NonNull C.A a12) {
        x2.i.f("Fully specified range is not actually fully specified.", a12.d());
        if (a11.b() == 2 && a12.b() == 1) {
            return false;
        }
        if (a11.b() == 2 || a11.b() == 0 || a11.b() == a12.b()) {
            return a11.a() == 0 || a11.a() == a12.a();
        }
        return false;
    }

    private static boolean b(@NonNull C.A a11, @NonNull C.A a12, @NonNull HashSet hashSet) {
        if (hashSet.contains(a12)) {
            return a(a11, a12);
        }
        C.S.a("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + a11 + "\nCandidate dynamic range:\n  " + a12);
        return false;
    }

    private static C.A c(@NonNull C.A a11, @NonNull LinkedHashSet linkedHashSet, @NonNull HashSet hashSet) {
        if (a11.b() == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C.A a12 = (C.A) it.next();
            x2.i.e(a12, "Fully specified DynamicRange cannot be null.");
            int b11 = a12.b();
            x2.i.f("Fully specified DynamicRange must have fully defined encoding.", a12.d());
            if (b11 != 1 && b(a11, a12, hashSet)) {
                return a12;
            }
        }
        return null;
    }

    private static void f(@NonNull HashSet hashSet, @NonNull C.A a11, @NonNull x.c cVar) {
        x2.i.f("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set<C.A> b11 = cVar.b(a11);
        if (b11.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(b11);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + a11 + "\nConstraints:\n  " + TextUtils.join("\n  ", b11) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    final boolean d() {
        return this.f101208c;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final HashMap e(@NonNull ArrayList arrayList, @NonNull ArrayList arrayList2, @NonNull ArrayList arrayList3) {
        C.A c11;
        Iterator it;
        Set<C.A> set;
        C.A a11;
        C10084b1 c10084b1 = this;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((AbstractC5081a) it2.next()).c());
        }
        x.c cVar = c10084b1.f101207b;
        Set<C.A> c12 = cVar.c();
        HashSet hashSet = new HashSet(c12);
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            f(hashSet, (C.A) it3.next(), cVar);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            androidx.camera.core.impl.b1 b1Var = (androidx.camera.core.impl.b1) arrayList2.get(((Integer) it4.next()).intValue());
            C.A u11 = b1Var.u();
            if (u11.equals(C.A.f4075c)) {
                arrayList6.add(b1Var);
            } else if (u11.b() == 2 || ((u11.b() != 0 && u11.a() == 0) || (u11.b() == 0 && u11.a() != 0))) {
                arrayList5.add(b1Var);
            } else {
                arrayList4.add(b1Var);
            }
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        arrayList7.addAll(arrayList5);
        arrayList7.addAll(arrayList6);
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            androidx.camera.core.impl.b1 b1Var2 = (androidx.camera.core.impl.b1) it5.next();
            C.A u12 = b1Var2.u();
            String A11 = b1Var2.A();
            if (u12.d()) {
                if (hashSet.contains(u12)) {
                    set = c12;
                    it = it5;
                    c11 = u12;
                    if (c11 != null) {
                        String A12 = b1Var2.A();
                        String join = TextUtils.join("\n  ", set);
                        String join2 = TextUtils.join("\n  ", hashSet);
                        StringBuilder sb2 = new StringBuilder("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ");
                        sb2.append(A12);
                        sb2.append("\nRequested dynamic range:\n  ");
                        sb2.append(u12);
                        sb2.append("\nSupported dynamic ranges:\n  ");
                        throw new IllegalArgumentException(C6594f.a(join, "\nConstrained set of concurrent dynamic ranges:\n  ", join2, sb2));
                    }
                    f(hashSet, c11, cVar);
                    hashMap.put(b1Var2, c11);
                    if (!linkedHashSet.contains(c11)) {
                        linkedHashSet2.add(c11);
                    }
                    c10084b1 = this;
                    it5 = it;
                    c12 = set;
                }
                set = c12;
                it = it5;
            } else {
                int b11 = u12.b();
                int a12 = u12.a();
                C.A a13 = C.A.f4076d;
                if (b11 == 1 && a12 == 0) {
                    if (hashSet.contains(a13)) {
                        set = c12;
                        it = it5;
                    }
                    set = c12;
                    it = it5;
                } else {
                    c11 = c(u12, linkedHashSet, hashSet);
                    it = it5;
                    set = c12;
                    if (c11 != null) {
                        C.S.a("DynamicRangeResolver", "Resolved dynamic range for use case " + A11 + " from existing attached surface.\n" + u12 + "\n->\n" + c11);
                    } else {
                        c11 = c(u12, linkedHashSet2, hashSet);
                        if (c11 != null) {
                            C.S.a("DynamicRangeResolver", "Resolved dynamic range for use case " + A11 + " from concurrently bound use case.\n" + u12 + "\n->\n" + c11);
                        } else if (b(u12, a13, hashSet)) {
                            C.S.a("DynamicRangeResolver", "Resolved dynamic range for use case " + A11 + " to no compatible HDR dynamic ranges.\n" + u12 + "\n->\n" + a13);
                        } else {
                            if (b11 == 2 && (a12 == 10 || a12 == 0)) {
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    a11 = a.a(c10084b1.f101206a);
                                    if (a11 != null) {
                                        linkedHashSet3.add(a11);
                                    }
                                } else {
                                    a11 = null;
                                }
                                linkedHashSet3.add(C.A.f4077e);
                                C.A c13 = c(u12, linkedHashSet3, hashSet);
                                if (c13 != null) {
                                    StringBuilder d11 = C3660k.d("Resolved dynamic range for use case ", A11, " from ", c13.equals(a11) ? "recommended" : "required", " 10-bit supported dynamic range.\n");
                                    d11.append(u12);
                                    d11.append("\n->\n");
                                    d11.append(c13);
                                    C.S.a("DynamicRangeResolver", d11.toString());
                                    c11 = c13;
                                }
                            }
                            Iterator it6 = hashSet.iterator();
                            while (it6.hasNext()) {
                                c11 = (C.A) it6.next();
                                x2.i.f("Candidate dynamic range must be fully specified.", c11.d());
                                if (!c11.equals(a13) && a(u12, c11)) {
                                    C.S.a("DynamicRangeResolver", "Resolved dynamic range for use case " + A11 + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + u12 + "\n->\n" + c11);
                                    break;
                                }
                            }
                        }
                    }
                    if (c11 != null) {
                    }
                }
                c11 = a13;
                if (c11 != null) {
                }
            }
            c11 = null;
            if (c11 != null) {
            }
        }
        return hashMap;
    }
}
