package io.seon.androidsdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.UByte;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f53166a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f53167b;

    /* renamed from: c, reason: collision with root package name */
    public static Long f53168c;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f53167b = concurrentHashMap;
        f53168c = -1L;
        try {
            concurrentHashMap.put(-1L, new ArrayList());
        } catch (Exception unused) {
        }
    }

    public static SubscriptionManager a(Context context) {
        return (SubscriptionManager) context.getSystemService("telephony_subscription_service");
    }

    public static Object b(InterfaceC4990o interfaceC4990o) {
        try {
            return interfaceC4990o.a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c(int i10) {
        try {
            return String.format(Locale.ENGLISH, "%d.%d.%d.%d", Integer.valueOf(i10 & 255), Integer.valueOf((i10 >> 8) & 255), Integer.valueOf((i10 >> 16) & 255), Integer.valueOf((i10 >> 24) & 255));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(Integer.toString((b10 & UByte.MAX_VALUE) + 256, 16).substring(1));
        }
        return sb2.toString();
    }

    public static JSONArray e(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            if (obj instanceof Map) {
                obj = f((Map) obj);
            } else if (obj instanceof Collection) {
                obj = e((Collection) obj);
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public static JSONObject f(Map... mapArr) {
        JSONObject jSONObject = new JSONObject();
        for (Map map : mapArr) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        try {
                            if (value instanceof Collection) {
                                value = e((Collection) value);
                            } else if (value instanceof Map) {
                                value = f((Map) value);
                            }
                            jSONObject.put(str, value);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static void g() {
        try {
            f53166a.decrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void h(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void i(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    public static void j(String str, Throwable th2) {
        try {
            long id2 = Thread.currentThread().getId();
            ConcurrentHashMap concurrentHashMap = f53167b;
            if (concurrentHashMap.containsKey(Long.valueOf(id2))) {
                f53168c = Long.valueOf(id2);
            }
            if (!concurrentHashMap.containsKey(f53168c)) {
                f53168c = -1L;
            }
            String format = th2 == null ? String.format("%s", str) : String.format(Locale.ENGLISH, "%s: %s-%s", str, th2.getClass().getSimpleName(), th2.getMessage());
            if (((ArrayList) concurrentHashMap.get(f53168c)).contains(format)) {
                return;
            }
            ((ArrayList) concurrentHashMap.get(f53168c)).add(format);
        } catch (Throwable unused) {
        }
    }

    public static boolean k(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean l(String str, String str2) {
        int length;
        int length2;
        try {
            length = str.length();
            length2 = str2.length();
        } catch (Exception unused) {
        }
        if (length2 == 0) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i10 = 0; i10 <= length - length2; i10++) {
            int i11 = 0;
            while (i11 < length2 && str.charAt(i10 + i11) == str2.charAt(i11)) {
                i11++;
            }
            if (i11 == length2) {
                return true;
            }
        }
        return false;
    }

    public static TelecomManager m(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.software.telecom")) {
            return (TelecomManager) context.getSystemService("telecom");
        }
        return null;
    }

    public static String n(Context context, String str) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            String str2 = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str);
            if (str2 != null) {
                if (str2.length() != 0) {
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static ArrayList o() {
        try {
            return (ArrayList) f53167b.get(-1L);
        } catch (Exception e10) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(e10.getMessage());
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized void p(Runnable runnable) {
        synchronized (V.class) {
            s(runnable);
        }
    }

    public static Activity q() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map != null) {
                for (Object obj : map.values()) {
                    Class<?> cls2 = obj.getClass();
                    Field declaredField2 = cls2.getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    if (!declaredField2.getBoolean(obj)) {
                        Field declaredField3 = cls2.getDeclaredField("activity");
                        declaredField3.setAccessible(true);
                        return (Activity) declaredField3.get(obj);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static TelephonyManager r(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            return (TelephonyManager) context.getSystemService("phone");
        }
        return null;
    }

    public static synchronized void s(final Runnable runnable) {
        synchronized (V.class) {
            try {
                Looper mainLooper = Looper.getMainLooper();
                Looper myLooper = Looper.myLooper();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                Runnable runnable2 = new Runnable() { // from class: io.seon.androidsdk.service.U
                    @Override // java.lang.Runnable
                    public final void run() {
                        V.i(runnable, countDownLatch);
                    }
                };
                if (myLooper == mainLooper) {
                    runnable2.run();
                } else {
                    if (myLooper == null) {
                        Looper.prepare();
                    }
                    new Handler(mainLooper).post(runnable2);
                }
                if (!countDownLatch.await(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, TimeUnit.MILLISECONDS)) {
                    throw new TimeoutException();
                }
                countDownLatch.countDown();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int t() {
        try {
            return f53166a.get();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static ArrayList u() {
        try {
            return (ArrayList) f53167b.get(Long.valueOf(Thread.currentThread().getId()));
        } catch (Exception e10) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(e10.getMessage());
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized void v() {
        synchronized (V.class) {
            try {
                if (f53166a.incrementAndGet() == 1) {
                    AbstractC4914e3.d();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void w() {
        try {
            long id2 = Thread.currentThread().getId();
            ConcurrentHashMap concurrentHashMap = f53167b;
            concurrentHashMap.remove(Long.valueOf(id2));
            concurrentHashMap.put(Long.valueOf(id2), new ArrayList());
        } catch (Throwable unused) {
        }
    }

    public static void x() {
        try {
            f53167b.remove(Long.valueOf(Thread.currentThread().getId()));
        } catch (Throwable unused) {
        }
    }
}
