package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zn3 implements InvocationHandler {
    public final /* synthetic */ int a;
    public final KClass b;
    public final Function1 c;

    public zn3(KClass kClass, Function1 function1, int i) {
        this.a = i;
        kClass.getClass();
        switch (i) {
            case 1:
                this.a = 1;
                kClass.getClass();
                this.b = kClass;
                this.c = function1;
                break;
            default:
                this.b = kClass;
                this.c = function1;
                break;
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 1:
                return this.c.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int i = this.a;
        Class cls = Integer.TYPE;
        Function1 function1 = this.c;
        KClass kClass = this.b;
        Class cls2 = Boolean.TYPE;
        obj.getClass();
        method.getClass();
        switch (i) {
            case 0:
                if (Intrinsics.c(method.getName(), "accept") && objArr != null && objArr.length == 1) {
                    Object cast = KClasses.cast(kClass, objArr[0]);
                    cast.getClass();
                    function1.invoke(cast);
                    return Unit.a;
                }
                if (Intrinsics.c(method.getName(), "equals") && method.getReturnType().equals(cls2) && objArr != null && objArr.length == 1) {
                    return Boolean.valueOf(obj == objArr[0]);
                }
                if (Intrinsics.c(method.getName(), "hashCode") && method.getReturnType().equals(cls) && objArr == null) {
                    return Integer.valueOf(function1.hashCode());
                }
                if (Intrinsics.c(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                    return function1.toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            default:
                if (Intrinsics.c(method.getName(), "test") && method.getReturnType().equals(cls2) && objArr != null && objArr.length == 1) {
                    Object cast2 = KClasses.cast(kClass, objArr[0]);
                    obj.getClass();
                    cast2.getClass();
                    return Boolean.valueOf(((Boolean) function1.invoke(cast2)).booleanValue());
                }
                if (Intrinsics.c(method.getName(), "equals") && method.getReturnType().equals(cls2) && objArr != null && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    return Boolean.valueOf(obj == obj2);
                }
                if (Intrinsics.c(method.getName(), "hashCode") && method.getReturnType().equals(cls) && objArr == null) {
                    return Integer.valueOf(hashCode());
                }
                if (Intrinsics.c(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                    return toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.c.toString();
            default:
                return super.toString();
        }
    }
}
