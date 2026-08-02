package j6;

import U7.m;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

@Deprecated
/* renamed from: j6.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7290d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69457a;

    public C7290d(Context context) {
        this.f69457a = context;
    }

    private static InterfaceC7288b b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof InterfaceC7288b) {
                    return (InterfaceC7288b) newInstance;
                }
                throw new RuntimeException(m.b(newInstance, "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e11) {
                c(cls, e11);
                throw null;
            } catch (InstantiationException e12) {
                c(cls, e12);
                throw null;
            } catch (NoSuchMethodException e13) {
                c(cls, e13);
                throw null;
            } catch (InvocationTargetException e14) {
                c(cls, e14);
                throw null;
            }
        } catch (ClassNotFoundException e15) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e15);
        }
    }

    private static void c(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(m.a(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    public final ArrayList a() {
        ApplicationInfo applicationInfo;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.f69457a;
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
        } catch (PackageManager.NameNotFoundException e11) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e11);
            }
        }
        if (applicationInfo != null && applicationInfo.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(b(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
                return arrayList;
            }
            return arrayList;
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Got null app info metadata");
            return arrayList;
        }
        return arrayList;
    }
}
