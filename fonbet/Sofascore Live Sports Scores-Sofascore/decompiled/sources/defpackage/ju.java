package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.ironsource.U3;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ju implements iu {
    public static volatile ju c;
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;

    public ju(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.i(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.iu
    public final void a(hu huVar) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        vv9 vv9Var = uqn.a;
        String str = huVar.a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = huVar.c;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException | ClassNotFoundException unused) {
                }
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    try {
                        Object readObject = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        obj2 = readObject;
                        if (obj2 == null) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream == null) {
                            throw th;
                        }
                        objectInputStream.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (uqn.a(str) && uqn.c(str, huVar.b)) {
            String str2 = huVar.k;
            if (str2 != null) {
                if (!uqn.b(huVar.l, str2)) {
                    return;
                }
                if (!uqn.d(str, huVar.l, huVar.k)) {
                    return;
                }
            }
            String str3 = huVar.h;
            if (str3 != null) {
                if (!uqn.b(huVar.i, str3)) {
                    return;
                }
                if (!uqn.d(str, huVar.i, huVar.h)) {
                    return;
                }
            }
            String str4 = huVar.f;
            if (str4 != null) {
                if (!uqn.b(huVar.g, str4)) {
                    return;
                }
                if (!uqn.d(str, huVar.g, huVar.f)) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            String str5 = huVar.a;
            if (str5 != null) {
                bundle.putString("origin", str5);
            }
            String str6 = huVar.b;
            if (str6 != null) {
                bundle.putString("name", str6);
            }
            Object obj3 = huVar.c;
            if (obj3 != null) {
                zzjh.a(bundle, obj3);
            }
            String str7 = huVar.d;
            if (str7 != null) {
                bundle.putString("trigger_event_name", str7);
            }
            bundle.putLong("trigger_timeout", huVar.e);
            String str8 = huVar.f;
            if (str8 != null) {
                bundle.putString("timed_out_event_name", str8);
            }
            Bundle bundle2 = huVar.g;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str9 = huVar.h;
            if (str9 != null) {
                bundle.putString("triggered_event_name", str9);
            }
            Bundle bundle3 = huVar.i;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", huVar.j);
            String str10 = huVar.k;
            if (str10 != null) {
                bundle.putString("expired_event_name", str10);
            }
            Bundle bundle4 = huVar.l;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", huVar.m);
            bundle.putBoolean("active", huVar.n);
            bundle.putLong("triggered_timestamp", huVar.o);
            zzez zzezVar = this.a.a;
            zzezVar.c(new wyn(zzezVar, bundle, 0));
        }
    }

    @Override // defpackage.iu
    public final void b(String str, String str2, Bundle bundle) {
        if (uqn.a(str) && uqn.b(bundle, str2) && uqn.d(str, bundle, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.a.logEvent(str, str2, bundle);
        }
    }

    @Override // defpackage.iu
    public final void c(String str) {
        zzez zzezVar = this.a.a;
        zzezVar.c(new zyn(zzezVar, str, (String) null, (Bundle) null));
    }

    @Override // defpackage.iu
    public final List d(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.a.g(str, "")) {
            vv9 vv9Var = uqn.a;
            Preconditions.i(bundle);
            hu huVar = new hu();
            String str2 = (String) zzjh.b(bundle, "origin", String.class, null);
            Preconditions.i(str2);
            huVar.a = str2;
            String str3 = (String) zzjh.b(bundle, "name", String.class, null);
            Preconditions.i(str3);
            huVar.b = str3;
            huVar.c = zzjh.b(bundle, U3.i.X, Object.class, null);
            huVar.d = (String) zzjh.b(bundle, "trigger_event_name", String.class, null);
            huVar.e = ((Long) zzjh.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            huVar.f = (String) zzjh.b(bundle, "timed_out_event_name", String.class, null);
            huVar.g = (Bundle) zzjh.b(bundle, "timed_out_event_params", Bundle.class, null);
            huVar.h = (String) zzjh.b(bundle, "triggered_event_name", String.class, null);
            huVar.i = (Bundle) zzjh.b(bundle, "triggered_event_params", Bundle.class, null);
            huVar.j = ((Long) zzjh.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            huVar.k = (String) zzjh.b(bundle, "expired_event_name", String.class, null);
            huVar.l = (Bundle) zzjh.b(bundle, "expired_event_params", Bundle.class, null);
            huVar.n = ((Boolean) zzjh.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            huVar.m = ((Long) zzjh.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            huVar.o = ((Long) zzjh.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(huVar);
        }
        return arrayList;
    }

    @Override // defpackage.iu
    public final Map e(boolean z) {
        return this.a.a.a(null, null, z);
    }

    @Override // defpackage.iu
    public final fu f(String str, gu guVar) {
        if (uqn.a(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (!isEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
                return null;
            }
            boolean equals = "fiam".equals(str);
            AppMeasurementSdk appMeasurementSdk = this.a;
            a4n e2oVar = equals ? new e2o(appMeasurementSdk, guVar) : "clx".equals(str) ? new bbo(appMeasurementSdk, guVar) : null;
            if (e2oVar != null) {
                concurrentHashMap.put(str, e2oVar);
                return new f4a(9, this, str);
            }
        }
        return null;
    }

    @Override // defpackage.iu
    public final void g(Object obj, String str) {
        if (uqn.a(str) && uqn.c(str, "_ln")) {
            zzez zzezVar = this.a.a;
            zzezVar.c(new tyn(zzezVar, str, "_ln", obj, true));
        }
    }

    @Override // defpackage.iu
    public final int h(String str) {
        return this.a.a.b(str);
    }
}
