package oi;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class t0 implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21340a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a0 f21341b;

    public t0(androidx.appcompat.widget.a0 a0Var) {
        this.f21341b = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r0 = oi.t.b(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        ((j$.util.concurrent.ConcurrentHashMap) r9.f680b).put(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0074, code lost:
    
        r0 = (oi.t) r0;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        t tVar;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f21340a;
        }
        Object[] objArr2 = objArr;
        a aVar = l0.f21277b;
        if (aVar.f(method)) {
            return aVar.d(obj, method, objArr2);
        }
        androidx.appcompat.widget.a0 a0Var = this.f21341b;
        while (true) {
            Object obj2 = ((ConcurrentHashMap) a0Var.f680b).get(method);
            if (!(obj2 instanceof t)) {
                if (obj2 == null) {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            obj2 = ((ConcurrentHashMap) a0Var.f680b).putIfAbsent(method, obj3);
                            if (obj2 == null) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    ((ConcurrentHashMap) a0Var.f680b).remove(method);
                                    throw th2;
                                }
                            }
                        } finally {
                        }
                    }
                }
                synchronized (obj2) {
                    try {
                        Object obj4 = ((ConcurrentHashMap) a0Var.f680b).get(method);
                        if (obj4 != null) {
                            break;
                        }
                    } finally {
                    }
                }
                break;
            }
            tVar = (t) obj2;
            break;
        }
        t tVar2 = tVar;
        return tVar2.a(new a0(tVar2.f21337a, obj, objArr2, tVar2.f21338b, tVar2.f21339c), objArr2);
    }
}
