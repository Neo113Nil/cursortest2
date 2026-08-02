package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class PurchaseHistoryResponseListenerProxy extends GenericListenerProxy {
    private static final String onPurchaseHistoryResponseMethodName = "onPurchaseHistoryResponse";
    private int _maxPurchases;
    private PurchaseHistoryResponseListener purchaseHistoryResponseListener;

    public PurchaseHistoryResponseListenerProxy(PurchaseHistoryResponseListener purchaseHistoryResponseListener, int i) {
        this.purchaseHistoryResponseListener = purchaseHistoryResponseListener;
        this._maxPurchases = i;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return com.android.billingclient.api.PurchaseHistoryResponseListener.class;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals(onPurchaseHistoryResponseMethodName)) {
            return super.invoke(obj, method, objArr);
        }
        onPurchaseHistoryResponse(objArr[0], (List) objArr[1]);
        return null;
    }

    public void onPurchaseHistoryResponse(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < this._maxPurchases && i < list.size(); i++) {
                arrayList.add(new PurchaseHistoryRecordBridge(list.get(i)));
            }
        } else {
            arrayList = null;
        }
        PurchaseHistoryResponseListener purchaseHistoryResponseListener = this.purchaseHistoryResponseListener;
        if (purchaseHistoryResponseListener != null) {
            purchaseHistoryResponseListener.onPurchaseHistoryUpdated(new BillingResultBridge(obj), arrayList);
        }
    }
}
