package nd;

import Td.h;
import Xd.C4884a;
import Xd.C4885b;
import Xd.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.C6345a;
import fe.C6535n;
import fe.C6537p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.C9661c;
import td.InterfaceC9815F;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import ud.InterfaceC10023a;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;
import yd.C10884b;
import yd.k;
import zd.C11104f;
import zd.C11105g;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Sd.c f76974a = new Sd.c("kotlin.jvm.JvmStatic");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76975b = 0;

    /* loaded from: classes10.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76976a;

        static {
            int[] iArr = new int[qd.p.values().length];
            try {
                iArr[qd.p.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qd.p.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qd.p.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qd.p.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qd.p.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qd.p.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[qd.p.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[qd.p.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f76976a = iArr;
        }
    }

    public static final AbstractC8504A a(kotlin.reflect.c cVar) {
        AbstractC8504A abstractC8504A = cVar instanceof AbstractC8504A ? (AbstractC8504A) cVar : null;
        if (abstractC8504A != null) {
            return abstractC8504A;
        }
        C8545j0 b11 = b(cVar);
        return b11 != null ? b11 : c(cVar);
    }

    public static final C8545j0 b(Object obj) {
        C8545j0 c8545j0 = obj instanceof C8545j0 ? (C8545j0) obj : null;
        if (c8545j0 != null) {
            return c8545j0;
        }
        C7734p c7734p = obj instanceof C7734p ? (C7734p) obj : null;
        kotlin.reflect.c compute = c7734p != null ? c7734p.compute() : null;
        if (compute instanceof C8545j0) {
            return (C8545j0) compute;
        }
        return null;
    }

    public static final J0<?> c(Object obj) {
        J0<?> j02 = obj instanceof J0 ? (J0) obj : null;
        if (j02 != null) {
            return j02;
        }
        kotlin.jvm.internal.H h11 = obj instanceof kotlin.jvm.internal.H ? (kotlin.jvm.internal.H) obj : null;
        kotlin.reflect.c compute = h11 != null ? h11.compute() : null;
        if (compute instanceof J0) {
            return (J0) compute;
        }
        return null;
    }

    @NotNull
    public static final ArrayList d(@NotNull InterfaceC10023a interfaceC10023a) {
        List a02;
        Annotation k11;
        Intrinsics.checkNotNullParameter(interfaceC10023a, "<this>");
        InterfaceC10030h annotations = interfaceC10023a.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10025c interfaceC10025c : annotations) {
            td.d0 e11 = interfaceC10025c.e();
            if (e11 instanceof C10884b) {
                k11 = ((C10884b) e11).c();
            } else if (e11 instanceof k.a) {
                zd.y c11 = ((k.a) e11).c();
                C11105g c11105g = c11 instanceof C11105g ? (C11105g) c11 : null;
                k11 = c11105g != null ? c11105g.I() : null;
            } else {
                k11 = k(interfaceC10025c);
            }
            if (k11 != null) {
                arrayList.add(k11);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (C6345a.b(C6345a.a((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        Class b11 = C6345a.b(C6345a.a(annotation));
                        if (!b11.getSimpleName().equals("Container") || b11.getAnnotation(kotlin.jvm.internal.P.class) == null) {
                            a02 = C7714v.a0(annotation);
                        } else {
                            Object invoke = b11.getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.VALUE, new Class[0]).invoke(annotation, new Object[0]);
                            Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            a02 = C7705l.e((Annotation[]) invoke);
                        }
                        C7714v.p(a02, arrayList2);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (Intrinsics.d(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.d(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (Intrinsics.d(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (Intrinsics.d(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (Intrinsics.d(cls, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.d(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.d(cls, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.d(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (Intrinsics.d(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    @NotNull
    public static final InterfaceC9835a f(@NotNull Class moduleAnchor, @NotNull h.d proto, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, @NotNull Pd.a metadataVersion, @NotNull Function2 createDescriptor) {
        List<Nd.r> e02;
        Intrinsics.checkNotNullParameter(moduleAnchor, "moduleAnchor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(createDescriptor, "createDescriptor");
        yd.j a11 = W0.a(moduleAnchor);
        if (proto instanceof Nd.h) {
            e02 = ((Nd.h) proto).d0();
        } else {
            if (!(proto instanceof Nd.m)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            e02 = ((Nd.m) proto).e0();
        }
        List<Nd.r> list = e02;
        C6535n a12 = a11.a();
        InterfaceC9815F b11 = a11.b();
        Pd.h hVar = Pd.h.f22261b;
        Intrinsics.f(list);
        return (InterfaceC9835a) createDescriptor.invoke(new fe.K(new C6537p(a12, nameResolver, b11, typeTable, hVar, metadataVersion, null, null, list)), proto);
    }

    public static final InterfaceC9834Z g(@NotNull InterfaceC9836b interfaceC9836b) {
        Intrinsics.checkNotNullParameter(interfaceC9836b, "<this>");
        if (interfaceC9836b.c0() == null) {
            return null;
        }
        InterfaceC9845k d11 = interfaceC9836b.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC9839e) d11).W();
    }

    @NotNull
    public static final Sd.c h() {
        return f76974a;
    }

    public static final boolean i(@NotNull kotlin.reflect.q qVar) {
        je.N i11;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        R0 r02 = qVar instanceof R0 ? (R0) qVar : null;
        return (r02 == null || (i11 = r02.i()) == null || !Vd.k.h(i11)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final Class<?> j(ClassLoader classLoader, Sd.b bVar, int i11) {
        int i12 = C9661c.f98575o;
        Sd.d j11 = bVar.a().j();
        Intrinsics.checkNotNullExpressionValue(j11, "toUnsafe(...)");
        Sd.b k11 = C9661c.k(j11);
        if (k11 != null) {
            bVar = k11;
        }
        String b11 = bVar.f().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        String b12 = bVar.g().b();
        Intrinsics.checkNotNullExpressionValue(b12, "asString(...)");
        if (Intrinsics.d(b11, "kotlin")) {
            switch (b12.hashCode()) {
                case -901856463:
                    if (b12.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b12.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b12.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b12.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b12.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b12.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b12.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b12.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b12.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            for (int i13 = 0; i13 < i11; i13++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (b11.length() > 0) {
            sb2.append(b11.concat("."));
        }
        sb2.append(kotlin.text.h.Y(b12, '.', '$'));
        if (i11 > 0) {
            sb2.append(";");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return yd.e.a(classLoader, sb3);
    }

    private static final Annotation k(InterfaceC10025c interfaceC10025c) {
        InterfaceC9839e d11 = Zd.e.d(interfaceC10025c);
        Class<?> l11 = d11 != null ? l(d11) : null;
        if (l11 == null) {
            l11 = null;
        }
        if (l11 == null) {
            return null;
        }
        Set<Map.Entry<Sd.f, Xd.g<?>>> entrySet = interfaceC10025c.b().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Sd.f fVar = (Sd.f) entry.getKey();
            Xd.g gVar = (Xd.g) entry.getValue();
            ClassLoader classLoader = l11.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Object m11 = m(gVar, classLoader);
            Pair pair = m11 != null ? new Pair(fVar.b(), m11) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map s11 = kotlin.collections.U.s(arrayList);
        Set keySet = s11.keySet();
        ArrayList arrayList2 = new ArrayList(C7714v.z(keySet, 10));
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(l11.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return (Annotation) od.f.a(l11, s11, arrayList2);
    }

    public static final Class<?> l(@NotNull InterfaceC9839e interfaceC9839e) {
        Intrinsics.checkNotNullParameter(interfaceC9839e, "<this>");
        td.d0 e11 = interfaceC9839e.e();
        Intrinsics.checkNotNullExpressionValue(e11, "getSource(...)");
        if (e11 instanceof Ld.A) {
            Ld.y c11 = ((Ld.A) e11).c();
            Intrinsics.g(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((yd.f) c11).e();
        }
        if (e11 instanceof k.a) {
            zd.y c12 = ((k.a) e11).c();
            Intrinsics.g(c12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((zd.u) c12).J();
        }
        Sd.b f7 = Zd.e.f(interfaceC9839e);
        if (f7 == null) {
            return null;
        }
        return j(C11104f.f(interfaceC9839e.getClass()), f7, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object m(Xd.g<?> gVar, ClassLoader classLoader) {
        je.N c11;
        Class<?> j11;
        if (gVar instanceof C4884a) {
            return k(((C4884a) gVar).b());
        }
        int i11 = 0;
        if (gVar instanceof C4885b) {
            C4885b c4885b = (C4885b) gVar;
            Xd.z zVar = c4885b instanceof Xd.z ? (Xd.z) c4885b : null;
            if (zVar != null && (c11 = zVar.c()) != null) {
                List<? extends Xd.g<?>> b11 = c4885b.b();
                ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
                Iterator<T> it = b11.iterator();
                while (it.hasNext()) {
                    arrayList.add(m((Xd.g) it.next(), classLoader));
                }
                Sd.f fVar = qd.m.f81837e;
                InterfaceC9842h p11 = c11.H0().p();
                qd.p I11 = p11 == null ? null : qd.m.I(p11);
                switch (I11 == null ? -1 : a.f76976a[I11.ordinal()]) {
                    case -1:
                        if (!qd.m.S(c11)) {
                            throw new IllegalStateException(("Not an array type: " + c11).toString());
                        }
                        je.N type = ((je.y0) C7714v.B0(c11.F0())).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        InterfaceC9842h p12 = type.H0().p();
                        InterfaceC9839e interfaceC9839e = p12 instanceof InterfaceC9839e ? (InterfaceC9839e) p12 : null;
                        if (interfaceC9839e == null) {
                            throw new IllegalStateException(("Not a class type: " + type).toString());
                        }
                        if (qd.m.i0(type)) {
                            int size = c4885b.b().size();
                            String[] strArr = new String[size];
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
                                strArr[i11] = obj;
                                i11++;
                            }
                            return strArr;
                        }
                        if (qd.m.a0(interfaceC9839e)) {
                            int size2 = c4885b.b().size();
                            Class[] clsArr = new Class[size2];
                            while (i11 < size2) {
                                Object obj2 = arrayList.get(i11);
                                Intrinsics.g(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i11] = obj2;
                                i11++;
                            }
                            return clsArr;
                        }
                        Sd.b f7 = Zd.e.f(interfaceC9839e);
                        if (f7 != null && (j11 = j(classLoader, f7, 0)) != null) {
                            Object newInstance = Array.newInstance(j11, c4885b.b().size());
                            Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) newInstance;
                            int size3 = arrayList.size();
                            while (i11 < size3) {
                                objArr[i11] = arrayList.get(i11);
                                i11++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new Sc.o();
                    case 1:
                        int size4 = c4885b.b().size();
                        boolean[] zArr = new boolean[size4];
                        while (i11 < size4) {
                            Object obj3 = arrayList.get(i11);
                            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i11] = ((Boolean) obj3).booleanValue();
                            i11++;
                        }
                        return zArr;
                    case 2:
                        int size5 = c4885b.b().size();
                        char[] cArr = new char[size5];
                        while (i11 < size5) {
                            Object obj4 = arrayList.get(i11);
                            Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i11] = ((Character) obj4).charValue();
                            i11++;
                        }
                        return cArr;
                    case 3:
                        int size6 = c4885b.b().size();
                        byte[] bArr = new byte[size6];
                        while (i11 < size6) {
                            Object obj5 = arrayList.get(i11);
                            Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i11] = ((Byte) obj5).byteValue();
                            i11++;
                        }
                        return bArr;
                    case 4:
                        int size7 = c4885b.b().size();
                        short[] sArr = new short[size7];
                        while (i11 < size7) {
                            Object obj6 = arrayList.get(i11);
                            Intrinsics.g(obj6, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i11] = ((Short) obj6).shortValue();
                            i11++;
                        }
                        return sArr;
                    case 5:
                        int size8 = c4885b.b().size();
                        int[] iArr = new int[size8];
                        while (i11 < size8) {
                            Object obj7 = arrayList.get(i11);
                            Intrinsics.g(obj7, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i11] = ((Integer) obj7).intValue();
                            i11++;
                        }
                        return iArr;
                    case 6:
                        int size9 = c4885b.b().size();
                        float[] fArr = new float[size9];
                        while (i11 < size9) {
                            Object obj8 = arrayList.get(i11);
                            Intrinsics.g(obj8, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i11] = ((Float) obj8).floatValue();
                            i11++;
                        }
                        return fArr;
                    case 7:
                        int size10 = c4885b.b().size();
                        long[] jArr = new long[size10];
                        while (i11 < size10) {
                            Object obj9 = arrayList.get(i11);
                            Intrinsics.g(obj9, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i11] = ((Long) obj9).longValue();
                            i11++;
                        }
                        return jArr;
                    case 8:
                        int size11 = c4885b.b().size();
                        double[] dArr = new double[size11];
                        while (i11 < size11) {
                            Object obj10 = arrayList.get(i11);
                            Intrinsics.g(obj10, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i11] = ((Double) obj10).doubleValue();
                            i11++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof Xd.k) {
            Pair<? extends Sd.b, ? extends Sd.f> b12 = ((Xd.k) gVar).b();
            Sd.b a11 = b12.a();
            Sd.f b13 = b12.b();
            Class<?> j12 = j(classLoader, a11, 0);
            if (j12 != null) {
                return f1.a(j12, b13.b());
            }
        } else {
            if (!(gVar instanceof Xd.t)) {
                if ((gVar instanceof Xd.l) || (gVar instanceof Xd.v)) {
                    return null;
                }
                return gVar.b();
            }
            t.a b14 = ((Xd.t) gVar).b();
            if (b14 instanceof t.a.b) {
                t.a.b bVar = (t.a.b) b14;
                return j(classLoader, bVar.b(), bVar.a());
            }
            if (!(b14 instanceof t.a.C0620a)) {
                throw new Sc.o();
            }
            InterfaceC9842h p13 = ((t.a.C0620a) b14).a().H0().p();
            InterfaceC9839e interfaceC9839e2 = p13 instanceof InterfaceC9839e ? (InterfaceC9839e) p13 : null;
            if (interfaceC9839e2 != null) {
                return l(interfaceC9839e2);
            }
        }
        return null;
    }
}
