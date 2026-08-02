package com.huawei.agconnect.core.a;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.Service;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.r11;

/* loaded from: classes.dex */
public final class d {
    private static Map<Class<?>, Service> a = new HashMap();
    private static Map<Class<?>, Object> b = new HashMap();
    private Map<Class<?>, Service> c = new HashMap();
    private Map<Class<?>, Object> d = new HashMap();

    public d(List<Service> list, Context context) {
        a(list, context);
    }

    private Object a(AGConnectInstance aGConnectInstance, Service service) {
        StringBuilder sb;
        if (service.getInstance() != null) {
            return service.getInstance();
        }
        Class<?> type = service.getType();
        if (type == null) {
            return null;
        }
        try {
            Constructor a2 = a(type, Context.class, AGConnectInstance.class);
            if (a2 != null) {
                return a2.newInstance(aGConnectInstance.getContext(), aGConnectInstance);
            }
            Constructor a3 = a(type, Context.class);
            return a3 != null ? a3.newInstance(aGConnectInstance.getContext()) : type.newInstance();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder("Instantiate service exception ");
            sb.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb.toString());
            return null;
        } catch (InstantiationException e2) {
            e = e2;
            sb = new StringBuilder("Instantiate service exception ");
            sb.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb.toString());
            return null;
        } catch (InvocationTargetException e3) {
            e = e3;
            sb = new StringBuilder("Instantiate service exception ");
            sb.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb.toString());
            return null;
        }
    }

    public <T> T a(AGConnectInstance aGConnectInstance, Class<?> cls) {
        T t;
        Service service = this.c.get(cls);
        if (service == null && (service = a.get(cls)) != null) {
            return (T) b.get(cls);
        }
        if (service == null) {
            return null;
        }
        if (service.isSingleton() && (t = (T) this.d.get(cls)) != null) {
            return t;
        }
        T t2 = (T) a(aGConnectInstance, service);
        if (t2 != null && service.isSingleton()) {
            this.d.put(cls, t2);
        }
        return t2;
    }

    private static Constructor a(Class cls, Class... clsArr) {
        boolean z = false;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == clsArr.length) {
                for (int i = 0; i < clsArr.length; i++) {
                    z = parameterTypes[i] == clsArr[i];
                }
                if (z) {
                    return constructor;
                }
            }
        }
        return null;
    }

    private void a(String str, Exception exc) {
        StringBuilder c = r11.c("Instantiate shared service ", str);
        c.append(exc.getLocalizedMessage());
        Log.e("AGC_ServiceRepository", c.toString());
        StringBuilder sb = new StringBuilder("cause message:");
        sb.append(exc.getCause() != null ? exc.getCause().getMessage() : "");
        Log.e("AGC_ServiceRepository", sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[Catch: InvocationTargetException -> 0x0063, InstantiationException -> 0x0065, IllegalAccessException -> 0x0067, TryCatch #2 {IllegalAccessException -> 0x0067, InstantiationException -> 0x0065, InvocationTargetException -> 0x0063, blocks: (B:22:0x004a, B:26:0x005a, B:27:0x0071, B:30:0x0069), top: B:21:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[Catch: InvocationTargetException -> 0x0063, InstantiationException -> 0x0065, IllegalAccessException -> 0x0067, TryCatch #2 {IllegalAccessException -> 0x0067, InstantiationException -> 0x0065, InvocationTargetException -> 0x0063, blocks: (B:22:0x004a, B:26:0x005a, B:27:0x0071, B:30:0x0069), top: B:21:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(List<Service> list, Context context) {
        Map<Class<?>, Service> map;
        String str;
        if (list == null) {
            return;
        }
        for (Service service : list) {
            if (service.isSharedInstance()) {
                if (!a.containsKey(service.getInterface())) {
                    map = a;
                }
                if (service.isAutoCreated() && service.getType() != null && !b.containsKey(service.getInterface())) {
                    try {
                        Constructor a2 = a(service.getType(), Context.class);
                        b.put(service.getInterface(), a2 == null ? a2.newInstance(context) : service.getType().newInstance());
                    } catch (IllegalAccessException e) {
                        e = e;
                        str = "AccessException";
                        a(str, e);
                    } catch (InstantiationException e2) {
                        e = e2;
                        str = "InstantiationException";
                        a(str, e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        str = "TargetException";
                        a(str, e);
                    }
                }
            } else {
                map = this.c;
            }
            map.put(service.getInterface(), service);
            if (service.isAutoCreated()) {
                Constructor a22 = a(service.getType(), Context.class);
                b.put(service.getInterface(), a22 == null ? a22.newInstance(context) : service.getType().newInstance());
            }
        }
    }
}
