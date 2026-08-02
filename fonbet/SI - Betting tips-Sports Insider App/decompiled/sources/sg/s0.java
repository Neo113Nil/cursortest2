package sg;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qg.g[] f23687a = new qg.g[0];

    /* renamed from: b, reason: collision with root package name */
    public static final og.a[] f23688b = new og.a[0];

    public static final a0 a(String name, og.a primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new a0(name, new b0(primitiveSerializer));
    }

    public static final Set b(qg.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof k) {
            return ((k) gVar).b();
        }
        HashSet hashSet = new HashSet(gVar.f());
        int f6 = gVar.f();
        for (int i5 = 0; i5 < f6; i5++) {
            hashSet.add(gVar.g(i5));
        }
        return hashSet;
    }

    public static final qg.g[] c(List list) {
        qg.g[] gVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (gVarArr = (qg.g[]) list.toArray(new qg.g[0])) == null) ? f23687a : gVarArr;
    }

    public static final int d(qg.g gVar, qg.g[] typeParams) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (gVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int f6 = gVar.f();
        int i5 = 1;
        while (true) {
            int i10 = 0;
            if (!(f6 > 0)) {
                break;
            }
            int i11 = f6 - 1;
            int i12 = i5 * 31;
            String a7 = gVar.i(gVar.f() - f6).a();
            if (a7 != null) {
                i10 = a7.hashCode();
            }
            i5 = i12 + i10;
            f6 = i11;
        }
        int f10 = gVar.f();
        int i13 = 1;
        while (true) {
            if (!(f10 > 0)) {
                return (((hashCode * 31) + i5) * 31) + i13;
            }
            int i14 = f10 - 1;
            int i15 = i13 * 31;
            a.a e7 = gVar.i(gVar.f() - f10).e();
            i13 = i15 + (e7 != null ? e7.hashCode() : 0);
            f10 = i14;
        }
    }

    public static final og.a e(Object obj, og.a... aVarArr) {
        Class[] clsArr;
        try {
            if (aVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i5 = 0; i5 < length; i5++) {
                    clsArr2[i5] = og.a.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aVarArr, aVarArr.length));
            if (invoke instanceof og.a) {
                return (og.a) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause == null) {
                throw e7;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e7.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final void f(int i5, int i10, qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList missingFields = new ArrayList();
        int i11 = (~i5) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                missingFields.add(descriptor.g(i12));
            }
            i11 >>>= 1;
        }
        String serialName = descriptor.a();
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        throw new og.b(missingFields, missingFields.size() == 1 ? d9.e.n(new StringBuilder("Field '"), (String) missingFields.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    public static final void g(ag.c baseClass, String str) {
        String sb2;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            sb2 = d9.e.e('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder q = r4.k.q("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            r4.k.s(q, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            q.append(baseClass.getSimpleName());
            q.append("' has to be sealed and '@Serializable'.");
            sb2 = q.toString();
        }
        throw new og.f(sb2);
    }

    public static final String h(qg.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return CollectionsKt.J(zf.j.d(0, gVar.f()), ", ", gVar.a() + '(', ")", new a2.f(22, gVar), 24);
    }
}
