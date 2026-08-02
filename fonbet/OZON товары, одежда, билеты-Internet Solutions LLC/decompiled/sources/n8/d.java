package n8;

import B0.A0;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f76575a;

    /* renamed from: b, reason: collision with root package name */
    private final a f76576b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f76577a;

        a(Class cls) {
            this.f76577a = cls;
        }

        public final List a(Context context) {
            Class<? extends Service> cls = this.f76577a;
            Bundle bundle = null;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), UserVerificationMethods.USER_VERIFY_PATTERN);
                    if (serviceInfo == null) {
                        Log.w("ComponentDiscovery", cls + " has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
            }
            if (bundle == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    d(Context context, a aVar) {
        this.f76575a = context;
        this.f76576b = aVar;
    }

    public static d<Context> b(Context context, Class<? extends Service> cls) {
        return new d<>(context, new a(cls));
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f76576b.a(this.f76575a)) {
            arrayList.add(new InterfaceC10861a() { // from class: n8.c
                @Override // y8.InterfaceC10861a
                public final Object get() {
                    String str2 = str;
                    try {
                        Class<?> cls = Class.forName(str2);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        }
                        throw new q("Class " + str2 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                    } catch (ClassNotFoundException unused) {
                        Log.w("ComponentDiscovery", "Class " + str2 + " is not an found.");
                        return null;
                    } catch (IllegalAccessException e11) {
                        throw new q(A0.b("Could not instantiate ", str2, "."), e11);
                    } catch (InstantiationException e12) {
                        throw new q(A0.b("Could not instantiate ", str2, "."), e12);
                    } catch (NoSuchMethodException e13) {
                        throw new q(Nk.a.b("Could not instantiate ", str2), e13);
                    } catch (InvocationTargetException e14) {
                        throw new q(Nk.a.b("Could not instantiate ", str2), e14);
                    }
                }
            });
        }
        return arrayList;
    }
}
