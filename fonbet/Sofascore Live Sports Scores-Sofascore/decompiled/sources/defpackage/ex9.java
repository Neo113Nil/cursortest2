package defpackage;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ex9 implements InvocationHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ ex9(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hx9 a(Context context) {
        Class cls;
        Object obj;
        Class x = qx9.x("com.android.billingclient.api.BillingClient");
        Class x2 = qx9.x("com.android.billingclient.api.Purchase");
        Class x3 = qx9.x("com.android.billingclient.api.ProductDetails");
        Class x4 = qx9.x("com.android.billingclient.api.PurchaseHistoryRecord");
        Class x5 = qx9.x("com.android.billingclient.api.QueryProductDetailsParams$Product");
        Class x6 = qx9.x("com.android.billingclient.api.BillingResult");
        Class x7 = qx9.x("com.android.billingclient.api.QueryProductDetailsParams");
        Class x8 = qx9.x("com.android.billingclient.api.QueryPurchaseHistoryParams");
        Class x9 = qx9.x("com.android.billingclient.api.QueryPurchasesParams");
        Class x10 = qx9.x("com.android.billingclient.api.QueryProductDetailsParams$Builder");
        Class x11 = qx9.x("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
        Class x12 = qx9.x("com.android.billingclient.api.QueryPurchasesParams$Builder");
        Class x13 = qx9.x("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
        Class x14 = qx9.x("com.android.billingclient.api.BillingClient$Builder");
        Class x15 = qx9.x("com.android.billingclient.api.PurchasesUpdatedListener");
        Class x16 = qx9.x("com.android.billingclient.api.BillingClientStateListener");
        Class x17 = qx9.x("com.android.billingclient.api.ProductDetailsResponseListener");
        Class x18 = qx9.x("com.android.billingclient.api.PurchasesResponseListener");
        Class x19 = qx9.x("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (x == null || x2 == null || x3 == null || x4 == null || x5 == null || x6 == null || x7 == null || x8 == null || x9 == null || x10 == null || x11 == null || x12 == null || x13 == null || x14 == null || x15 == null || x16 == null || x17 == null || x18 == null || x19 == null) {
            hx9.b();
            return null;
        }
        Method z = qx9.z(x, BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, x9, x18);
        Method z2 = qx9.z(x9, "newBuilder", new Class[0]);
        Method z3 = qx9.z(x12, "build", new Class[0]);
        Method z4 = qx9.z(x12, "setProductType", String.class);
        Method z5 = qx9.z(x2, "getOriginalJson", new Class[0]);
        Method z6 = qx9.z(x, "queryPurchaseHistoryAsync", x8, x19);
        Method z7 = qx9.z(x8, "newBuilder", new Class[0]);
        Method z8 = qx9.z(x11, "build", new Class[0]);
        Method z9 = qx9.z(x11, "setProductType", String.class);
        Method z10 = qx9.z(x4, "getOriginalJson", new Class[0]);
        Method z11 = qx9.z(x, BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, x7, x17);
        Method z12 = qx9.z(x7, "newBuilder", new Class[0]);
        Method z13 = qx9.z(x10, "build", new Class[0]);
        Method z14 = qx9.z(x10, "setProductList", List.class);
        Method z15 = qx9.z(x5, "newBuilder", new Class[0]);
        Method z16 = qx9.z(x13, "build", new Class[0]);
        Method z17 = qx9.z(x13, "setProductId", String.class);
        Method z18 = qx9.z(x13, "setProductType", String.class);
        Method z19 = qx9.z(x3, "toString", new Class[0]);
        Method z20 = qx9.z(x, "startConnection", x16);
        Method z21 = qx9.z(x6, "getResponseCode", new Class[0]);
        if (z == null || z2 == null || z3 == null || z4 == null || z5 == null || z6 == null || z7 == null || z8 == null || z9 == null || z10 == null || z11 == null || z12 == null || z13 == null || z14 == null || z15 == null || z16 == null || z17 == null || z18 == null || z19 == null || z20 == null || z21 == null) {
            hx9.b();
            return null;
        }
        Method z22 = qx9.z(x, "newBuilder", Context.class);
        Method z23 = qx9.z(x14, "setListener", x15);
        Method z24 = qx9.z(x14, "enablePendingPurchases", new Class[0]);
        Method z25 = qx9.z(x14, "build", new Class[0]);
        if (z25 == null || z23 == null || z22 == null || z24 == null) {
            cls = x;
        } else {
            cls = x;
            Object B = qx9.B(x14, qx9.B(x, null, z22, context), z23, Proxy.newProxyInstance(x15.getClassLoader(), new Class[]{x15}, this));
            if (B != null) {
                obj = qx9.B(x14, qx9.B(x14, B, z24, new Object[0]), z25, new Object[0]);
                if (obj != null) {
                    hx9.b();
                    return null;
                }
                hx9 hx9Var = new hx9(obj, cls, x2, x3, x4, x5, x6, x7, x8, x10, x11, x13, x16, x17, x19, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21);
                if (!cw3.a.contains(hx9.class)) {
                    try {
                        hx9.I = hx9Var;
                    } catch (Throwable th) {
                        cw3.a(hx9.class, th);
                    }
                }
                if (!cw3.a.contains(hx9.class)) {
                    try {
                        return hx9.I;
                    } catch (Throwable th2) {
                        cw3.a(hx9.class, th2);
                    }
                }
                return null;
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.a) {
            case 0:
                if (!cw3.a.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                        break;
                    } catch (Throwable th) {
                        cw3.a(this, th);
                        break;
                    }
                }
                break;
            default:
                obj.getClass();
                method.getClass();
                break;
        }
        return null;
        return null;
    }
}
