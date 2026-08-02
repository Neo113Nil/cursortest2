package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.cast.zzbq;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.cast.zzce;
import com.google.android.gms.internal.cast.zzek;
import com.google.android.gms.internal.cast.zzhb;
import com.google.android.gms.internal.cast.zzwo;
import defpackage.brn;
import defpackage.ebp;
import defpackage.fjn;
import defpackage.fn0;
import defpackage.ibc;
import defpackage.igf;
import defpackage.pbc;
import defpackage.sw9;
import defpackage.tro;
import defpackage.unn;
import defpackage.zap;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CastContext {
    public static final Logger l = new Logger("CastContext", null);
    public static final Object m = new Object();
    public static volatile CastContext n;
    public final Context a;
    public final zzah b;
    public final SessionManager c;
    public final zzaa d;
    public final CastOptions e;
    public final com.google.android.gms.cast.internal.zzn f;
    public final com.google.android.gms.internal.cast.zzax g;
    public final zzbq h;
    public final List i;
    public final zzce j;
    public final com.google.android.gms.internal.cast.zzba k;

    public CastContext(Context context, CastOptions castOptions, List list, zzbx zzbxVar, com.google.android.gms.cast.internal.zzn zznVar) {
        this.a = context;
        this.e = castOptions;
        this.f = zznVar;
        this.i = list;
        this.h = new zzbq(context);
        this.j = zzbxVar.d;
        if (TextUtils.isEmpty(castOptions.a)) {
            this.k = null;
        } else {
            this.k = new com.google.android.gms.internal.cast.zzba(context, castOptions, zzbxVar);
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.zzba zzbaVar = this.k;
        if (zzbaVar != null) {
            hashMap.put(zzbaVar.b, zzbaVar.c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SessionProvider sessionProvider = (SessionProvider) it.next();
                Preconditions.j(sessionProvider, "Additional SessionProvider must not be null.");
                String str = sessionProvider.b;
                Preconditions.g(str, "Category for SessionProvider must not be null or empty string.");
                Preconditions.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, sessionProvider.c);
            }
        }
        castOptions.p = new zzl(1);
        try {
            zzah x0 = com.google.android.gms.internal.cast.zzay.a(context).x0(new ObjectWrapper(context.getApplicationContext()), castOptions, zzbxVar, hashMap);
            this.b = x0;
            try {
                this.d = new zzaa(x0.zzh());
                try {
                    SessionManager sessionManager = new SessionManager(x0.zzg(), context);
                    this.c = sessionManager;
                    new Logger("PrecacheManager", null);
                    zzce zzceVar = this.j;
                    int i = 0;
                    if (zzceVar != null) {
                        zzceVar.g = sessionManager;
                        zzceVar.c.post(new brn(zzceVar, i));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    zzek zzekVar = new zzek(context, newFixedThreadPool instanceof zzwo ? (zzwo) newFixedThreadPool : newFixedThreadPool instanceof ScheduledExecutorService ? new ebp((ScheduledExecutorService) newFixedThreadPool) : new zap(newFixedThreadPool));
                    new Logger("BaseNetUtils", null);
                    zzekVar.a();
                    com.google.android.gms.internal.cast.zzax zzaxVar = new com.google.android.gms.internal.cast.zzax();
                    this.g = zzaxVar;
                    try {
                        x0.A1(zzaxVar);
                        zzaxVar.a.add(this.h.a);
                        if (!Collections.unmodifiableList(castOptions.l).isEmpty()) {
                            l.c("Setting Route Discovery for appIds: ".concat(String.valueOf(Collections.unmodifiableList(this.e.l))), new Object[0]);
                            zzbq zzbqVar = this.h;
                            List unmodifiableList = Collections.unmodifiableList(this.e.l);
                            zzbqVar.getClass();
                            Logger logger = zzbq.f;
                            int size = unmodifiableList.size();
                            logger.a(fn0.k(size, "SetRouteDiscovery for ", " IDs", new StringBuilder(String.valueOf(size).length() + 26)), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(zzhb.a((String) it2.next()));
                            }
                            Map map = zzbqVar.c;
                            logger.a("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (map) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        unn unnVar = (unn) map.get(zzhb.a(str2));
                                        if (unnVar != null) {
                                            hashMap2.put(str2, unnVar);
                                        }
                                    }
                                    map.clear();
                                    map.putAll(hashMap2);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            logger.a("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
                            LinkedHashSet linkedHashSet2 = zzbqVar.d;
                            synchronized (linkedHashSet2) {
                                linkedHashSet2.clear();
                                linkedHashSet2.addAll(linkedHashSet);
                            }
                            zzbqVar.p();
                        }
                        zznVar.i(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"}).addOnSuccessListener(new fjn(this, 19));
                        TaskApiCall.Builder a = TaskApiCall.a();
                        a.a = new tro(zznVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 2);
                        a.c = new Feature[]{com.google.android.gms.cast.zzaq.d};
                        a.b = false;
                        a.d = 8427;
                        zznVar.h(0, a.a()).addOnSuccessListener(new igf(this, 18));
                    } catch (RemoteException e) {
                        sw9.m("Failed to call addAppVisibilityListener", e);
                        throw null;
                    }
                } catch (RemoteException e2) {
                    sw9.m("Failed to call getSessionManagerImpl", e2);
                    throw null;
                }
            } catch (RemoteException e3) {
                sw9.m("Failed to call getDiscoveryManagerImpl", e3);
                throw null;
            }
        } catch (RemoteException e4) {
            sw9.m("Failed to call newCastContextImpl", e4);
            throw null;
        }
    }

    public static CastContext c(Context context) {
        Preconditions.e("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    OptionsProvider e = e(applicationContext);
                    CastOptions castOptions = e.getCastOptions(applicationContext);
                    com.google.android.gms.cast.internal.zzn zznVar = new com.google.android.gms.cast.internal.zzn(applicationContext, com.google.android.gms.cast.internal.zzn.l, Api.ApiOptions.E7, GoogleApi.Settings.c);
                    try {
                        n = new CastContext(applicationContext, castOptions, e.getAdditionalSessionProviders(applicationContext), new zzbx(applicationContext, pbc.d(applicationContext), castOptions, zznVar), zznVar);
                    } catch (ModuleUnavailableException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
        return n;
    }

    public static CastContext d(Context context) {
        Preconditions.e("Must be called from the main thread.");
        try {
            return c(context);
        } catch (RuntimeException e) {
            l.c("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e);
            return null;
        }
    }

    public static OptionsProvider e(Context context) {
        try {
            Bundle bundle = Wrappers.a(context).a(128, context.getPackageName()).metaData;
            if (bundle == null) {
                l.c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (OptionsProvider) Class.forName(string).asSubclass(OptionsProvider.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            sw9.m("Failed to initialize CastContext.", e);
            return null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            sw9.m("Failed to initialize CastContext.", e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            sw9.m("Failed to initialize CastContext.", e);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            sw9.m("Failed to initialize CastContext.", e);
            return null;
        } catch (NoSuchMethodException e5) {
            e = e5;
            sw9.m("Failed to initialize CastContext.", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            sw9.m("Failed to initialize CastContext.", e);
            return null;
        } catch (InvocationTargetException e7) {
            e = e7;
            sw9.m("Failed to initialize CastContext.", e);
            return null;
        }
    }

    public final ibc a() {
        Preconditions.e("Must be called from the main thread.");
        try {
            return ibc.b(this.b.zze());
        } catch (RemoteException unused) {
            l.b("Unable to call %s on %s.", "getMergedSelectorAsBundle", "zzah");
            return null;
        }
    }

    public final SessionManager b() {
        Preconditions.e("Must be called from the main thread.");
        return this.c;
    }
}
