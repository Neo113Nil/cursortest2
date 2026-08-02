package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final k2.a0 f353a = new k2.a0(new u());

    /* renamed from: b, reason: collision with root package name */
    public static final int f354b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static l0.g f355c = null;

    /* renamed from: d, reason: collision with root package name */
    public static l0.g f356d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f357e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f358f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final s.f f359g = new s.f(0);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f360h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f361i = new Object();

    public static boolean b(Context context) {
        if (f357e == null) {
            try {
                int i5 = s0.f342a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) s0.class), Build.VERSION.SDK_INT >= 24 ? r0.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f357e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f357e = Boolean.FALSE;
            }
        }
        return f357e.booleanValue();
    }

    public static void e(l0 l0Var) {
        synchronized (f360h) {
            try {
                s.f fVar = f359g;
                fVar.getClass();
                s.a aVar = new s.a(fVar);
                while (aVar.hasNext()) {
                    v vVar = (v) ((WeakReference) aVar.next()).get();
                    if (vVar == l0Var || vVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i5);

    public abstract void g(int i5);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
