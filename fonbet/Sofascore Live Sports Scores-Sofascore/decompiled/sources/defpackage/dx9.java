package defpackage;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dx9 implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Serializable b;
    public final Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Object[]] */
    public dx9(ox9 ox9Var, Class cls) {
        this.a = 1;
        this.d = ox9Var;
        this.c = cls;
        this.b = new Object[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x0038, Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:23:0x005c, B:28:0x006f, B:31:0x0081, B:33:0x008c, B:36:0x0093, B:39:0x009f, B:46:0x00ad, B:42:0x00b5, B:59:0x007d, B:65:0x006b), top: B:22:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Object obj, Method method, Object[] objArr) {
        Class cls;
        Method method2;
        String str;
        Runnable runnable = (Runnable) this.c;
        px9 px9Var = (px9) this.b;
        gx9 gx9Var = (gx9) this.d;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            obj.getClass();
            method.getClass();
            if (Intrinsics.c(method.getName(), "onPurchaseHistoryResponse")) {
                Object F = objArr != null ? ph0.F(1, objArr) : null;
                if (F != null && (F instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) F) {
                        if (!cw3.a.contains(gx9.class)) {
                            try {
                                cls = gx9Var.d;
                            } catch (Throwable th) {
                                cw3.a(gx9.class, th);
                            }
                            if (!cw3.a.contains(gx9.class)) {
                                try {
                                    method2 = gx9Var.h;
                                } catch (Throwable th2) {
                                    cw3.a(gx9.class, th2);
                                }
                                Object B = qx9.B(cls, obj2, method2, new Object[0]);
                                str = B instanceof String ? (String) B : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                        String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                        string.getClass();
                                        arrayList.add(string);
                                        if (px9Var == px9.INAPP) {
                                            gx9.b().put(string, jSONObject);
                                        } else {
                                            gx9.d().put(string, jSONObject);
                                        }
                                    }
                                }
                            }
                            method2 = null;
                            Object B2 = qx9.B(cls, obj2, method2, new Object[0]);
                            if (B2 instanceof String) {
                            }
                            if (str != null) {
                            }
                        }
                        cls = null;
                        if (!cw3.a.contains(gx9.class)) {
                        }
                        method2 = null;
                        Object B22 = qx9.B(cls, obj2, method2, new Object[0]);
                        if (B22 instanceof String) {
                        }
                        if (str != null) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        runnable.run();
                        return;
                    }
                    Set set = cw3.a;
                    if (set.contains(gx9.class)) {
                        return;
                    }
                    try {
                        if (!set.contains(gx9Var)) {
                            try {
                                gx9Var.f(new kx0(gx9Var, runnable, px9Var, arrayList, 4));
                            } catch (Throwable th3) {
                                cw3.a(gx9Var, th3);
                            }
                        }
                    } catch (Throwable th4) {
                        cw3.a(gx9.class, th4);
                    }
                }
            }
        } catch (Throwable th5) {
            cw3.a(this, th5);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        wk9 wk9Var;
        switch (this.a) {
            case 0:
                if (cw3.a.contains(this)) {
                    return null;
                }
                try {
                    a(obj, method, objArr);
                    return Unit.a;
                } catch (Throwable th) {
                    cw3.a(this, th);
                    return null;
                }
            default:
                Class cls = (Class) this.c;
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = (Object[]) this.b;
                }
                Object[] objArr2 = objArr;
                jle jleVar = hie.b;
                if (jleVar.p(method)) {
                    return jleVar.m(cls, obj, method, objArr2);
                }
                ox9 ox9Var = (ox9) this.d;
                while (true) {
                    Object obj2 = ((ConcurrentHashMap) ox9Var.b).get(method);
                    if (obj2 instanceof wk9) {
                        wk9Var = (wk9) obj2;
                    } else {
                        if (obj2 == null) {
                            Object obj3 = new Object();
                            synchronized (obj3) {
                                try {
                                    obj2 = ((ConcurrentHashMap) ox9Var.b).putIfAbsent(method, obj3);
                                    if (obj2 == null) {
                                        try {
                                            wk9Var = wk9.b(ox9Var, cls, method);
                                            ((ConcurrentHashMap) ox9Var.b).put(method, wk9Var);
                                        } catch (Throwable th2) {
                                            ((ConcurrentHashMap) ox9Var.b).remove(method);
                                            throw th2;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        synchronized (obj2) {
                            try {
                                Object obj4 = ((ConcurrentHashMap) ox9Var.b).get(method);
                                if (obj4 != null) {
                                    wk9Var = (wk9) obj4;
                                }
                            } finally {
                            }
                        }
                    }
                }
                return wk9Var.a(new dod(wk9Var.a, obj, objArr2, wk9Var.b, wk9Var.c), objArr2);
        }
    }

    public dx9(gx9 gx9Var, px9 px9Var, Runnable runnable) {
        this.a = 0;
        this.d = gx9Var;
        this.b = px9Var;
        this.c = runnable;
    }
}
