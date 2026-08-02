package yi;

import B0.C2454a;
import C.C2697q;
import C.InterfaceC2693m;
import C.InterfaceC2694n;
import C.o0;
import Kk.C3532b;
import Qi.InterfaceC3877a;
import Sc.r;
import Sc.s;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3877a f106657a;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final float f106658a;

        /* renamed from: b, reason: collision with root package name */
        private final float f106659b;

        /* renamed from: c, reason: collision with root package name */
        private final float f106660c;

        /* renamed from: d, reason: collision with root package name */
        private final String f106661d;

        public a(float f7, float f11, float f12, String str) {
            this.f106658a = f7;
            this.f106659b = f11;
            this.f106660c = f12;
            this.f106661d = str;
        }

        public final float a() {
            return this.f106658a;
        }

        public final float b() {
            return this.f106659b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f106658a, aVar.f106658a) == 0 && Float.compare(this.f106659b, aVar.f106659b) == 0 && Float.compare(this.f106660c, aVar.f106660c) == 0 && Intrinsics.d(this.f106661d, aVar.f106661d);
        }

        public final int hashCode() {
            int a11 = Pk0.b.a(this.f106660c, Pk0.b.a(this.f106659b, Float.hashCode(this.f106658a) * 31, 31), 31);
            String str = this.f106661d;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BackCamera(focalLength=" + this.f106658a + ", minZoom=" + this.f106659b + ", maxZoom=" + this.f106660c + ", cameraId=" + this.f106661d + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f106662a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f106663b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f106664c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f106665d;

        /* renamed from: e, reason: collision with root package name */
        private final float f106666e;

        /* renamed from: f, reason: collision with root package name */
        private final String f106667f;

        public b(boolean z11, boolean z12, boolean z13, boolean z14, float f7, String str) {
            this.f106662a = z11;
            this.f106663b = z12;
            this.f106664c = z13;
            this.f106665d = z14;
            this.f106666e = f7;
            this.f106667f = str;
        }

        public final String a() {
            return this.f106667f;
        }

        public final boolean b() {
            return this.f106663b;
        }

        public final boolean c() {
            return this.f106662a;
        }

        public final boolean d() {
            return this.f106665d;
        }

        public final boolean e() {
            return this.f106664c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f106662a == bVar.f106662a && this.f106663b == bVar.f106663b && this.f106664c == bVar.f106664c && this.f106665d == bVar.f106665d && Float.compare(this.f106666e, bVar.f106666e) == 0 && Intrinsics.d(this.f106667f, bVar.f106667f);
        }

        public final float f() {
            return this.f106666e;
        }

        public final int hashCode() {
            int a11 = Pk0.b.a(this.f106666e, C3532b.a(C3532b.a(C3532b.a(Boolean.hashCode(this.f106662a) * 31, 31, this.f106663b), 31, this.f106664c), 31, this.f106665d), 31);
            String str = this.f106667f;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScanResult(hasFront=");
            sb2.append(this.f106662a);
            sb2.append(", hasBack=");
            sb2.append(this.f106663b);
            sb2.append(", ultraWide=");
            sb2.append(this.f106664c);
            sb2.append(", telephoto=");
            sb2.append(this.f106665d);
            sb2.append(", ultraWideMinZoom=");
            sb2.append(this.f106666e);
            sb2.append(", error=");
            return o0.c(sb2, this.f106667f, ")");
        }
    }

    /* renamed from: yi.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C2306c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106668a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.ULTRA_WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.WIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.TELEPHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f106668a = iArr;
        }
    }

    public static final class d<T> implements Comparator {
        public d() {
        }

        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            c cVar = c.this;
            return Vc.a.b(Float.valueOf(c.a(cVar, (InterfaceC2694n) t2)), Float.valueOf(c.a(cVar, (InterfaceC2694n) t11)));
        }
    }

    public static final class e<T> implements Comparator {
        public e() {
        }

        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            c cVar = c.this;
            return Vc.a.b(Float.valueOf(c.a(cVar, (InterfaceC2694n) t2)), Float.valueOf(c.a(cVar, (InterfaceC2694n) t11)));
        }
    }

    public c(@NotNull InterfaceC3877a logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f106657a = logger;
    }

    public static final float a(c cVar, InterfaceC2694n interfaceC2694n) {
        Object a11;
        Float D11;
        cVar.getClass();
        try {
            r.Companion companion = r.INSTANCE;
            float[] fArr = (float[]) B.h.a(interfaceC2694n).b(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            a11 = Float.valueOf((fArr == null || (D11 = C7705l.D(fArr)) == null) ? Float.MAX_VALUE : D11.floatValue());
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            cVar.d(b11, "getFocalLength exception", C2454a.b("info", interfaceC2694n.toString()));
            a11 = Float.valueOf(Float.MAX_VALUE);
        }
        return ((Number) a11).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Throwable th2, String str, Map<String, ? extends Object> map) {
        if (th2 instanceof CancellationException) {
            throw th2;
        }
        this.f106657a.b(th2, "ozon_gallery", "camera_device_scanner ".concat(str), map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[LOOP:4: B:133:0x0265->B:184:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [yi.b] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2697q c(@NotNull V.g provider, @NotNull Context context, int i11, @NotNull g lens) {
        Object a11;
        Throwable b11;
        boolean z11;
        CameraCharacteristics.Key key;
        Float f7;
        CameraManager cameraManager;
        String[] strArr;
        int i12;
        int i13;
        Object a12;
        Throwable b12;
        Set physicalCameraIds;
        Iterator it;
        int i14;
        Object obj;
        Object a13;
        String str;
        Object obj2;
        Object a14;
        Throwable b13;
        Integer num;
        boolean z12;
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lens, "lens");
        ArrayList g10 = provider.g();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = g10.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            InterfaceC2694n interfaceC2694n = (InterfaceC2694n) next;
            try {
                r.Companion companion = r.INSTANCE;
                num = (Integer) B.h.a(interfaceC2694n).b(CameraCharacteristics.LENS_FACING);
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a14 = s.a(th2);
            }
            if (num != null && num.intValue() == i11) {
                z12 = true;
                a14 = Boolean.valueOf(z12);
                b13 = r.b(a14);
                if (b13 != null) {
                    d(b13, "isLensFacing exception", U.j(new Pair("info", interfaceC2694n.toString()), new Pair("lens_facing", Integer.valueOf(i11))));
                    a14 = Boolean.FALSE;
                }
                if (!((Boolean) a14).booleanValue()) {
                    arrayList.add(next);
                }
            }
            z12 = false;
            a14 = Boolean.valueOf(z12);
            b13 = r.b(a14);
            if (b13 != null) {
            }
            if (!((Boolean) a14).booleanValue()) {
            }
        }
        ArrayList W02 = C7714v.W0(C7714v.I0(new d(), arrayList));
        if (W02.isEmpty()) {
            C2697q.a aVar = new C2697q.a();
            aVar.c(i11);
            C2697q b14 = aVar.b();
            Intrinsics.checkNotNullExpressionValue(b14, "build(...)");
            return b14;
        }
        Object systemService = context.getSystemService("camera");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager2 = (CameraManager) systemService;
        String[] cameraIdList = cameraManager2.getCameraIdList();
        int length = cameraIdList.length;
        int i15 = 0;
        while (true) {
            Object obj3 = null;
            if (i15 >= length) {
                if (W02.isEmpty()) {
                    C2697q.a aVar2 = new C2697q.a();
                    aVar2.c(i11);
                    C2697q b15 = aVar2.b();
                    Intrinsics.checkNotNullExpressionValue(b15, "build(...)");
                    return b15;
                }
                Iterator it3 = W02.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    InterfaceC2694n interfaceC2694n2 = (InterfaceC2694n) next2;
                    try {
                        r.Companion companion3 = r.INSTANCE;
                    } catch (CancellationException e12) {
                        throw e12;
                    } catch (Throwable th3) {
                        r.Companion companion4 = r.INSTANCE;
                        a11 = s.a(th3);
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        B.h a15 = B.h.a(interfaceC2694n2);
                        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                        Range range = (Range) a15.b(key);
                        if (((range == null || (f7 = (Float) range.getLower()) == null) ? 1.0f : f7.floatValue()) < 0.9f) {
                            z11 = true;
                            a11 = Boolean.valueOf(z11);
                            b11 = r.b(a11);
                            if (b11 != null) {
                                d(b11, "buildLensSelector ultraWideInfo exception", U.j(new Pair("info", interfaceC2694n2.toString()), new Pair("lens_facing", Integer.valueOf(i11)), new Pair("lens", lens.name())));
                                a11 = Boolean.FALSE;
                            }
                            if (!((Boolean) a11).booleanValue()) {
                                obj3 = next2;
                                break;
                            }
                        }
                    }
                    z11 = false;
                    a11 = Boolean.valueOf(z11);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    if (!((Boolean) a11).booleanValue()) {
                    }
                }
                final InterfaceC2694n interfaceC2694n3 = (InterfaceC2694n) obj3;
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = W02.iterator();
                while (it4.hasNext()) {
                    Object next3 = it4.next();
                    if (!Intrinsics.d((InterfaceC2694n) next3, interfaceC2694n3)) {
                        arrayList2.add(next3);
                    }
                }
                List I02 = C7714v.I0(new e(), arrayList2);
                int i16 = C2306c.f106668a[lens.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        interfaceC2694n3 = (InterfaceC2694n) C7714v.Q(0, I02);
                        if (interfaceC2694n3 == null) {
                            interfaceC2694n3 = (InterfaceC2694n) C7714v.K(W02);
                        }
                    } else {
                        if (i16 != 3) {
                            throw new Sc.o();
                        }
                        interfaceC2694n3 = (InterfaceC2694n) C7714v.Q(C7714v.P(I02), I02);
                        if (interfaceC2694n3 == null) {
                            interfaceC2694n3 = (InterfaceC2694n) C7714v.X(W02);
                        }
                    }
                } else if (interfaceC2694n3 == null) {
                    interfaceC2694n3 = (InterfaceC2694n) C7714v.K(I02);
                }
                C2697q.a aVar3 = new C2697q.a();
                aVar3.c(i11);
                aVar3.a(new InterfaceC2693m() { // from class: yi.b
                    @Override // C.InterfaceC2693m
                    public final ArrayList a(List list) {
                        Intrinsics.checkNotNullParameter(list, "list");
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : list) {
                            if (Intrinsics.d((InterfaceC2694n) obj4, InterfaceC2694n.this)) {
                                arrayList3.add(obj4);
                            }
                        }
                        return arrayList3;
                    }
                });
                C2697q b16 = aVar3.b();
                Intrinsics.checkNotNullExpressionValue(b16, "build(...)");
                return b16;
            }
            String str2 = cameraIdList[i15];
            try {
                try {
                    r.Companion companion5 = r.INSTANCE;
                    CameraCharacteristics cameraCharacteristics = cameraManager2.getCameraCharacteristics(str2);
                    try {
                        Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
                        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        if (num2 != null && num2.intValue() == i11 && Build.VERSION.SDK_INT >= 28) {
                            physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
                            Intrinsics.checkNotNullExpressionValue(physicalCameraIds, "getPhysicalCameraIds(...)");
                            Iterator it5 = physicalCameraIds.iterator();
                            while (it5.hasNext()) {
                                cameraManager = cameraManager2;
                                try {
                                    String str3 = (String) it5.next();
                                    Iterator it6 = W02.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            it = it5;
                                            strArr = cameraIdList;
                                            i12 = length;
                                            i14 = i15;
                                            obj = null;
                                            break;
                                        }
                                        obj = it6.next();
                                        InterfaceC2694n interfaceC2694n4 = (InterfaceC2694n) obj;
                                        try {
                                            r.Companion companion6 = r.INSTANCE;
                                            a13 = Boolean.valueOf(Intrinsics.d(B.h.a(interfaceC2694n4).c(), str3));
                                        } catch (CancellationException e13) {
                                            strArr = cameraIdList;
                                            i12 = length;
                                            i13 = i15;
                                            throw e13;
                                        } catch (Throwable th4) {
                                            r.Companion companion7 = r.INSTANCE;
                                            a13 = s.a(th4);
                                        }
                                        Object obj4 = a13;
                                        Throwable b17 = r.b(obj4);
                                        if (b17 == null) {
                                            str = str3;
                                            strArr = cameraIdList;
                                            i12 = length;
                                            i14 = i15;
                                            obj2 = obj4;
                                            it = it5;
                                        } else {
                                            it = it5;
                                            strArr = cameraIdList;
                                            i12 = length;
                                            try {
                                                str = str3;
                                                i14 = i15;
                                                d(b17, "buildLensSelector physical camera info exception", U.j(new Pair("camera_id", str2), new Pair("physical_camera_id", str3), new Pair("lens_facing", Integer.valueOf(i11)), new Pair("lens", lens.name())));
                                                obj2 = Boolean.FALSE;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                i13 = i15;
                                                r.Companion companion8 = r.INSTANCE;
                                                a12 = s.a(th);
                                                b12 = r.b(a12);
                                                if (b12 == null) {
                                                }
                                                i15 = i13 + 1;
                                                cameraManager2 = cameraManager;
                                                cameraIdList = strArr;
                                                length = i12;
                                            }
                                        }
                                        if (((Boolean) obj2).booleanValue()) {
                                            break;
                                        }
                                        it5 = it;
                                        cameraIdList = strArr;
                                        length = i12;
                                        str3 = str;
                                        i15 = i14;
                                    }
                                    InterfaceC2694n interfaceC2694n5 = (InterfaceC2694n) obj;
                                    if (interfaceC2694n5 != null && !W02.contains(interfaceC2694n5)) {
                                        W02.add(interfaceC2694n5);
                                    }
                                    cameraManager2 = cameraManager;
                                    it5 = it;
                                    cameraIdList = strArr;
                                    length = i12;
                                    i15 = i14;
                                } catch (Throwable th6) {
                                    th = th6;
                                    strArr = cameraIdList;
                                    i12 = length;
                                    i13 = i15;
                                    r.Companion companion82 = r.INSTANCE;
                                    a12 = s.a(th);
                                    b12 = r.b(a12);
                                    if (b12 == null) {
                                    }
                                    i15 = i13 + 1;
                                    cameraManager2 = cameraManager;
                                    cameraIdList = strArr;
                                    length = i12;
                                }
                            }
                        }
                        cameraManager = cameraManager2;
                        strArr = cameraIdList;
                        i12 = length;
                        i13 = i15;
                    } catch (Throwable th7) {
                        th = th7;
                        cameraManager = cameraManager2;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    cameraManager = cameraManager2;
                    strArr = cameraIdList;
                    i12 = length;
                    i13 = i15;
                }
                try {
                    a12 = Unit.f71690a;
                    r.Companion companion9 = r.INSTANCE;
                } catch (Throwable th9) {
                    th = th9;
                    r.Companion companion822 = r.INSTANCE;
                    a12 = s.a(th);
                    b12 = r.b(a12);
                    if (b12 == null) {
                    }
                    i15 = i13 + 1;
                    cameraManager2 = cameraManager;
                    cameraIdList = strArr;
                    length = i12;
                }
                b12 = r.b(a12);
                if (b12 == null) {
                    d(b12, "buildLensSelector camera characteristics exception", U.j(new Pair("camera_id", str2), new Pair("lens_facing", Integer.valueOf(i11)), new Pair("lens", lens.name())));
                }
                i15 = i13 + 1;
                cameraManager2 = cameraManager;
                cameraIdList = strArr;
                length = i12;
            } catch (CancellationException e14) {
                throw e14;
            }
        }
    }
}
