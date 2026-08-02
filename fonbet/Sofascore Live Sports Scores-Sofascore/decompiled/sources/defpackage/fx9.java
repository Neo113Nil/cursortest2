package defpackage;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fx9 implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ cx9 c;

    public /* synthetic */ fx9(cx9 cx9Var, Object obj, int i) {
        this.a = i;
        this.c = cx9Var;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[Catch: all -> 0x002f, Exception -> 0x0041, TryCatch #2 {Exception -> 0x0041, blocks: (B:22:0x004b, B:27:0x005d, B:30:0x006f, B:32:0x007a, B:35:0x0081, B:38:0x008d, B:52:0x006b, B:57:0x0059), top: B:21:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Object obj, Method method, Object[] objArr) {
        Class cls;
        Method method2;
        String str;
        gx9 gx9Var = (gx9) this.c;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            obj.getClass();
            method.getClass();
            if (Intrinsics.c(method.getName(), "onSkuDetailsResponse")) {
                Object F = objArr != null ? ph0.F(1, objArr) : null;
                if (F != null && (F instanceof List)) {
                    for (Object obj2 : (List) F) {
                        if (!cw3.a.contains(gx9.class)) {
                            try {
                                cls = gx9Var.c;
                            } catch (Throwable th) {
                                cw3.a(gx9.class, th);
                            }
                            if (!cw3.a.contains(gx9.class)) {
                                try {
                                    method2 = gx9Var.g;
                                } catch (Throwable th2) {
                                    cw3.a(gx9.class, th2);
                                }
                                Object B = qx9.B(cls, obj2, method2, new Object[0]);
                                str = B instanceof String ? (String) B : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                                        String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                                        ConcurrentHashMap c = gx9.c();
                                        string.getClass();
                                        c.put(string, jSONObject);
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
                    ((Runnable) this.b).run();
                }
            }
        } catch (Throwable th3) {
            cw3.a(this, th3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.a) {
            case 0:
                if (!cw3.a.contains(this)) {
                    try {
                        a(obj, method, objArr);
                        break;
                    } catch (Throwable th) {
                        cw3.a(this, th);
                        return null;
                    }
                }
                break;
            default:
                Object[] objArr2 = (Object[]) this.b;
                hx9 hx9Var = (hx9) this.c;
                obj.getClass();
                method.getClass();
                String name = method.getName();
                if (name != null) {
                    switch (name.hashCode()) {
                        case -1642587947:
                            if (name.equals("onPurchaseHistoryResponse") && !cw3.a.contains(hx9.class)) {
                                try {
                                    hx9Var.j(objArr2, objArr);
                                    break;
                                } catch (Throwable th2) {
                                    cw3.a(hx9.class, th2);
                                    break;
                                }
                            }
                            break;
                        case -1599362358:
                            if (name.equals("onQueryPurchasesResponse") && !cw3.a.contains(hx9.class)) {
                                try {
                                    hx9Var.k(objArr2, objArr);
                                    break;
                                } catch (Throwable th3) {
                                    cw3.a(hx9.class, th3);
                                    break;
                                }
                            }
                            break;
                        case -79406125:
                            if (name.equals("onBillingSetupFinished") && !cw3.a.contains(hx9.class)) {
                                try {
                                    hx9Var.h(objArr2, objArr);
                                    break;
                                } catch (Throwable th4) {
                                    cw3.a(hx9.class, th4);
                                    break;
                                }
                            }
                            break;
                        case 1227540564:
                            if (name.equals("onBillingServiceDisconnected")) {
                                Set set = cw3.a;
                                if (!set.contains(hx9.class)) {
                                    try {
                                        if (!set.contains(hx9Var)) {
                                            try {
                                                hx9.H.set(false);
                                                break;
                                            } catch (Throwable th5) {
                                                cw3.a(hx9Var, th5);
                                                break;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        cw3.a(hx9.class, th6);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1940131955:
                            if (name.equals(ProductDetailsResponseListenerProxy.onProductDetailsResponseMethodName) && !cw3.a.contains(hx9.class)) {
                                try {
                                    hx9Var.i(objArr2, objArr);
                                    break;
                                } catch (Throwable th7) {
                                    cw3.a(hx9.class, th7);
                                    break;
                                }
                            }
                            break;
                    }
                }
                break;
        }
        return null;
    }
}
