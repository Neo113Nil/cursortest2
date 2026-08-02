package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements InvocationHandler {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ HashMap e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ Method h;
    public final /* synthetic */ Method i;

    public a(ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, ArrayList arrayList3, HashMap hashMap2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
        this.a = arrayList;
        this.b = hashMap;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = hashMap2;
        this.f = arrayList4;
        this.g = arrayList5;
        this.h = method;
        this.i = method2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        HashMap hashMap;
        boolean equalsMethods;
        boolean equalsMethods2;
        boolean equalsMethods3;
        boolean equalsMethods4;
        boolean equalsMethods5;
        WeakHashMap weakHashMap;
        boolean equalsMethods6;
        boolean reportError;
        boolean equalsMethods7;
        boolean reportError2;
        boolean isPrimitive = method.getReturnType().isPrimitive();
        HashMap hashMap2 = this.b;
        if (isPrimitive) {
            if (!method.getReturnType().equals(Void.TYPE)) {
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                equalsMethods7 = DynamicLoaderFallback.equalsMethods(method, (Method) it.next());
                if (equalsMethods7) {
                    reportError2 = DynamicLoaderFallback.reportError(obj, hashMap2);
                    if (reportError2) {
                        break;
                    }
                }
            }
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                equalsMethods6 = DynamicLoaderFallback.equalsMethods(method, (Method) it2.next());
                if (equalsMethods6) {
                    reportError = DynamicLoaderFallback.reportError(obj, hashMap2);
                    if (reportError) {
                        return null;
                    }
                }
            }
            return null;
        }
        if (method.getReturnType().equals(String.class)) {
            return "";
        }
        Object newProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
        Iterator it3 = this.d.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            hashMap = this.e;
            if (!hasNext) {
                break;
            }
            equalsMethods5 = DynamicLoaderFallback.equalsMethods(method, (Method) it3.next());
            if (equalsMethods5) {
                weakHashMap = DynamicLoaderFallback.sApiProxyToAdListenersMap;
                weakHashMap.put(hashMap.get(obj), (AdListener) objArr[0]);
                break;
            }
        }
        Iterator it4 = this.f.iterator();
        while (it4.hasNext()) {
            equalsMethods4 = DynamicLoaderFallback.equalsMethods(method, (Method) it4.next());
            if (equalsMethods4) {
                hashMap.put(newProxyInstance, obj);
            }
        }
        Iterator it5 = this.g.iterator();
        while (it5.hasNext()) {
            equalsMethods3 = DynamicLoaderFallback.equalsMethods(method, (Method) it5.next());
            if (equalsMethods3) {
                for (Object obj2 : objArr) {
                    if (obj2 instanceof Ad) {
                        hashMap2.put(newProxyInstance, (Ad) obj2);
                    }
                }
            }
        }
        equalsMethods = DynamicLoaderFallback.equalsMethods(method, this.h);
        if (equalsMethods) {
            hashMap2.put(objArr[1], (Ad) objArr[0]);
        }
        equalsMethods2 = DynamicLoaderFallback.equalsMethods(method, this.i);
        if (equalsMethods2) {
            hashMap2.put(objArr[1], (Ad) objArr[0]);
        }
        return newProxyInstance;
    }
}
