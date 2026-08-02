package com.huawei.agconnect.core.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.ServiceDiscovery;
import com.huawei.agconnect.core.ServiceRegistrar;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {
    private final Context a;

    /* loaded from: classes13.dex */
    public static class a implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    public c(Context context) {
        this.a = context;
    }

    private <T extends ServiceRegistrar> T a(String str) {
        StringBuilder sb;
        String sb2;
        try {
            Class<?> cls = Class.forName(str);
            if (ServiceRegistrar.class.isAssignableFrom(cls)) {
                return (T) Class.forName(str).newInstance();
            }
            Log.e("AGC_Registrar", cls + " must extends from ServiceRegistrar.");
            return null;
        } catch (ClassNotFoundException e) {
            sb2 = "Can not found service class, " + e.getMessage();
            Log.e("AGC_Registrar", sb2);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            sb = new StringBuilder("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            sb2 = sb.toString();
            Log.e("AGC_Registrar", sb2);
            return null;
        } catch (InstantiationException e3) {
            e = e3;
            sb = new StringBuilder("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            sb2 = sb.toString();
            Log.e("AGC_Registrar", sb2);
            return null;
        }
    }

    private List<String> b() {
        String concat;
        ArrayList arrayList = new ArrayList();
        Bundle c = c();
        if (c != null) {
            HashMap hashMap = new HashMap(10);
            for (String str : c.keySet()) {
                if ("com.huawei.agconnect.core.ServiceRegistrar".equals(c.getString(str))) {
                    String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (split.length == 2) {
                        try {
                            hashMap.put(split[0], Integer.valueOf(split[1]));
                        } catch (NumberFormatException e) {
                            concat = "registrar configuration format error:" + e.getMessage();
                        }
                    } else if (split.length == 1) {
                        hashMap.put(split[0], 1000);
                    } else {
                        concat = "registrar configuration error, ".concat(str);
                        Log.e("AGC_Registrar", concat);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList2, new a());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Map.Entry) it.next()).getKey());
            }
        }
        return arrayList;
    }

    private Bundle c() {
        ServiceInfo serviceInfo;
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            serviceInfo = packageManager.getServiceInfo(new ComponentName(this.a, (Class<?>) ServiceDiscovery.class), 128);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AGC_Registrar", "get ServiceDiscovery exception." + e.getLocalizedMessage());
        }
        if (serviceInfo != null) {
            return serviceInfo.metaData;
        }
        Log.e("AGC_Registrar", "Can not found ServiceDiscovery service.");
        return null;
    }

    public List<Service> a() {
        List<String> b = b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            ServiceRegistrar a2 = a(it.next());
            if (a2 != null) {
                a2.initialize(this.a);
                List<Service> services = a2.getServices(this.a);
                if (services != null) {
                    arrayList.addAll(services);
                }
            }
        }
        arrayList.size();
        return arrayList;
    }
}
