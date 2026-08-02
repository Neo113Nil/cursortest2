package X9;

import W9.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.AbstractC3174g;
import com.google.android.gms.common.C3172e;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13664a = "m";

    /* renamed from: b, reason: collision with root package name */
    public static Context f13665b;

    /* renamed from: c, reason: collision with root package name */
    public static o f13666c;

    public static o a(Context context, d.a aVar) {
        AbstractC3191o.m(context);
        "preferredRenderer: ".concat(String.valueOf(aVar));
        o oVar = f13666c;
        if (oVar != null) {
            return oVar;
        }
        int h10 = AbstractC3174g.h(context, 13400000);
        if (h10 != 0) {
            throw new C3172e(h10);
        }
        o d10 = d(context, aVar);
        f13666c = d10;
        try {
            int zzd = d10.zzd();
            String packageName = context.getPackageName();
            if (zzd == 2 && !packageName.equals("com.google.android.apps.photos")) {
                try {
                    f13666c.X(N9.d.i(c(context, aVar)));
                } catch (RemoteException e10) {
                    throw new Y9.f(e10);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(f13664a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    f13665b = null;
                    f13666c = d(context, d.a.LEGACY);
                }
            }
            try {
                o oVar2 = f13666c;
                Context c10 = c(context, aVar);
                Objects.requireNonNull(c10);
                oVar2.A(N9.d.i(c10.getResources()), 19020000);
                return f13666c;
            } catch (RemoteException e11) {
                throw new Y9.f(e11);
            }
        } catch (RemoteException e12) {
            throw new Y9.f(e12);
        }
    }

    public static Context b(Exception exc, Context context) {
        Log.e(f13664a, "Failed to load maps module, use pre-Chimera", exc);
        return AbstractC3174g.e(context);
    }

    public static Context c(Context context, d.a aVar) {
        Context b10;
        Context context2 = f13665b;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == d.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            b10 = DynamiteModule.e(context, DynamiteModule.f32839b, str).b();
        } catch (Exception e10) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                b10 = b(e10, context);
            } else {
                try {
                    b10 = DynamiteModule.e(context, DynamiteModule.f32839b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e11) {
                    b10 = b(e11, context);
                }
            }
        }
        f13665b = b10;
        if (b10 != null) {
            return b10;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    public static o d(Context context, d.a aVar) {
        Log.i(f13664a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) e(((ClassLoader) AbstractC3191o.m(c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return queryLocalInterface instanceof o ? (o) queryLocalInterface : new n(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    public static Object e(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e11);
        }
    }
}
