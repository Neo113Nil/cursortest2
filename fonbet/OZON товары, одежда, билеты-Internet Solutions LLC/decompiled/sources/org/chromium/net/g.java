package org.chromium.net;

import N3.C3660k;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.AbstractC8761e;
import org.chromium.net.impl.I;

/* loaded from: classes6.dex */
public abstract class g {
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final String TAG = "g";
    protected final Context mContext;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public g f78696a;

        /* renamed from: b, reason: collision with root package name */
        public I.d f78697b;

        a() {
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && this.f78696a.equals(((a) obj).f78696a);
        }

        public final int hashCode() {
            return this.f78696a.hashCode();
        }
    }

    protected g(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    private static boolean addCronetProviderFromResourceFile(Context context, I.d dVar, Set<a> set) {
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        boolean z11 = false;
        if (identifier == 0) {
            return false;
        }
        String string = context.getString(identifier);
        if (string != null && !string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) && !string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) && !string.equals(JAVA_CRONET_PROVIDER_CLASS) && !string.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            z11 = true;
            if (!addCronetProviderImplByClassName(context, string, dVar, set, true)) {
                Log.e(TAG, "Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
            }
        }
        return z11;
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, I.d dVar, Set<a> set, boolean z11) {
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(g.class).getConstructor(Context.class);
            a aVar = new a();
            aVar.f78696a = (g) constructor.newInstance(context);
            aVar.f78697b = dVar;
            set.add(aVar);
            return true;
        } catch (ClassNotFoundException e11) {
            logReflectiveOperationException(str, z11, e11);
            return false;
        } catch (IllegalAccessException e12) {
            logReflectiveOperationException(str, z11, e12);
            return false;
        } catch (InstantiationException e13) {
            logReflectiveOperationException(str, z11, e13);
            return false;
        } catch (NoSuchMethodException e14) {
            logReflectiveOperationException(str, z11, e14);
            return false;
        } catch (InvocationTargetException e15) {
            logReflectiveOperationException(str, z11, e15);
            return false;
        }
    }

    static List<a> getAllProviderInfos(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, I.d.CRONET_SOURCE_UNSPECIFIED, linkedHashSet);
        I.d dVar = I.d.CRONET_SOURCE_PLAY_SERVICES;
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, dVar, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, dVar, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, I.d.CRONET_SOURCE_STATICALLY_LINKED, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, I.d.CRONET_SOURCE_FALLBACK, linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public static List<g> getAllProviders(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = getAllProviderInfos(context).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f78696a);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void logReflectiveOperationException(String str, boolean z11, Exception exc) {
        if (z11) {
            Log.e(TAG, "Unable to load provider class: " + str, exc);
            return;
        }
        String str2 = TAG;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Tried to load " + str + " provider class but it wasn't included in the app classpath");
        }
    }

    public abstract AbstractC8761e.a createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public String toString() {
        String name = getClass().getName();
        String name2 = getName();
        String version = getVersion();
        boolean isEnabled = isEnabled();
        StringBuilder d11 = C3660k.d("[class=", name, ", name=", name2, ", version=");
        d11.append(version);
        d11.append(", enabled=");
        d11.append(isEnabled);
        d11.append("]");
        return d11.toString();
    }
}
