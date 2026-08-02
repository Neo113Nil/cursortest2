package Q6;

import Lb.b;
import T7.A;
import T7.C1682w;
import T7.Q;
import T7.Y;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.google.zxing.c;
import com.google.zxing.e;
import com.google.zxing.h;
import g6.C4331C;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9517a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f9518b = a.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f9519c = new HashMap();

    /* renamed from: Q6.a$a, reason: collision with other inner class name */
    public static final class C0183a implements NsdManager.RegistrationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9520a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9521b;

        public C0183a(String str, String str2) {
            this.f9520a = str;
            this.f9521b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
            a aVar = a.f9517a;
            a.a(this.f9521b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
            Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
            if (Intrinsics.areEqual(this.f9520a, NsdServiceInfo.getServiceName())) {
                return;
            }
            a aVar = a.f9517a;
            a.a(this.f9521b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }
    }

    public static final void a(String str) {
        if (Y7.a.d(a.class)) {
            return;
        }
        try {
            f9517a.b(str);
        } catch (Throwable th2) {
            Y7.a.b(th2, a.class);
        }
    }

    public static final Bitmap c(String str) {
        if (Y7.a.d(a.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(c.class);
            enumMap.put((EnumMap) c.MARGIN, (c) 2);
            try {
                b a10 = new e().a(str, com.google.zxing.a.QR_CODE, 200, 200, enumMap);
                int e10 = a10.e();
                int f10 = a10.f();
                int[] iArr = new int[e10 * f10];
                if (e10 > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = i10 * f10;
                        if (f10 > 0) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 1;
                                iArr[i12 + i13] = a10.d(i13, i10) ? -16777216 : -1;
                                if (i14 >= f10) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        if (i11 >= e10) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(f10, e10, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, f10, 0, 0, f10, e10);
                    return createBitmap;
                } catch (h unused) {
                    return createBitmap;
                }
            } catch (h unused2) {
                return null;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, a.class);
            return null;
        }
    }

    public static final String d(Map map) {
        if (Y7.a.d(a.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap();
            } catch (Throwable th2) {
                Y7.a.b(th2, a.class);
                return null;
            }
        }
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        map.put("model", MODEL);
        String jSONObject = new JSONObject(map).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    public static final boolean e() {
        if (Y7.a.d(a.class)) {
            return false;
        }
        try {
            A a10 = A.f10965a;
            C1682w f10 = A.f(C4331C.m());
            if (f10 != null) {
                if (f10.o().contains(Q.Enabled)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, a.class);
            return false;
        }
    }

    public static final boolean f(String str) {
        if (Y7.a.d(a.class)) {
            return false;
        }
        try {
            if (e()) {
                return f9517a.g(str);
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, a.class);
            return false;
        }
    }

    public final void b(String str) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) f9519c.get(str);
            if (registrationListener != null) {
                Object systemService = C4331C.l().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    Y y10 = Y.f11042a;
                    Y.j0(f9518b, e10);
                }
                f9519c.remove(str);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final boolean g(String str) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            HashMap hashMap = f9519c;
            if (hashMap.containsKey(str)) {
                return true;
            }
            String str2 = "fbsdk_" + Intrinsics.stringPlus("android-", StringsKt.replace$default(C4331C.B(), '.', '|', false, 4, (Object) null)) + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = C4331C.l().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            C0183a c0183a = new C0183a(str2, str);
            hashMap.put(str, c0183a);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0183a);
            return true;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }
}
