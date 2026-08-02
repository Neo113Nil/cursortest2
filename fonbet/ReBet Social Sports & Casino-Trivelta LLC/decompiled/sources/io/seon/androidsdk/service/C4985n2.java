package io.seon.androidsdk.service;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.seon.androidsdk.service.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4985n2 extends AbstractC4950j {

    /* renamed from: e, reason: collision with root package name */
    public SeonNT f53440e = null;

    /* renamed from: g, reason: collision with root package name */
    public ClipboardManager f53441g;

    /* renamed from: j, reason: collision with root package name */
    public int[] f53442j;

    /* renamed from: n, reason: collision with root package name */
    public Context f53443n;

    /* renamed from: o, reason: collision with root package name */
    public SensorManager f53444o;

    /* renamed from: p, reason: collision with root package name */
    public List f53445p;

    /* renamed from: q, reason: collision with root package name */
    public WindowManager f53446q;

    /* renamed from: r, reason: collision with root package name */
    public O1 f53447r;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f53439m = {"android_id", "build_device", "build_model", "build_hardware", "device_orientation", "free_storage", "has_proximity_sensor", "pasteboard_hash", "screen_height", "screen_width", "screen_scale", "screen_brightness", "sensor_hash", "total_storage", "gsf_id", "is_tablet", "true_device_id_source"};

    /* renamed from: B, reason: collision with root package name */
    public static final Lh.a f53436B = Lh.a.d(C4985n2.class);

    /* renamed from: C, reason: collision with root package name */
    public static final L4 f53437C = new L4(30000);

    /* renamed from: D, reason: collision with root package name */
    public static final L4 f53438D = new L4(30000);

    public static int[] B() {
        int[] iArr = new int[27];
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 4;
        iArr[3] = 5;
        iArr[4] = 6;
        iArr[5] = 8;
        iArr[6] = 9;
        iArr[7] = 10;
        iArr[8] = 11;
        iArr[9] = 12;
        iArr[10] = 13;
        iArr[11] = 14;
        iArr[12] = 15;
        iArr[13] = 16;
        iArr[14] = 17;
        iArr[15] = 18;
        iArr[16] = 19;
        iArr[17] = 20;
        int i10 = Build.VERSION.SDK_INT;
        iArr[18] = 21;
        iArr[19] = 28;
        iArr[20] = 29;
        iArr[21] = 30;
        iArr[22] = 31;
        iArr[23] = 65536;
        if (i10 >= 26) {
            iArr[24] = 34;
            iArr[25] = 35;
        }
        if (i10 >= 30) {
            iArr[26] = 36;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        try {
            this.f53441g = (ClipboardManager) this.f53443n.getSystemService("clipboard");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f53440e = new SeonNT(this.f53443n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String o() {
        return (String) f53438D.a(new C4881a2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String p() {
        SeonNT seonNT = this.f53440e;
        seonNT.getClass();
        try {
            return seonNT.b();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String A() {
        if (this.f53445p == null) {
            this.f53445p = this.f53444o.getSensorList(-1);
        }
        List list = this.f53445p.size() != 0 ? this.f53445p : null;
        if (list == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb2.append(((Sensor) it.next()).getName());
        }
        try {
            String sb3 = sb2.toString();
            AtomicInteger atomicInteger = V.f53166a;
            byte[] bytes = sb3.getBytes("UTF-8");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            messageDigest.update(bytes);
            return V.d(messageDigest.digest());
        } catch (Exception e10) {
            V.j("SHash", e10);
            return null;
        }
    }

    public final long C() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (Exception e10) {
            V.j("TotSD", e10);
            return -1L;
        }
    }

    public final boolean D() {
        return this.f53443n.getPackageManager().hasSystemFeature("android.hardware.sensor.proximity") || this.f53444o.getDefaultSensor(8) != null;
    }

    public final boolean E() {
        try {
            return ((TelephonyManager) this.f53443n.getSystemService("phone")).getPhoneType() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public final Integer H() {
        SensorManager sensorManager = this.f53444o;
        int[] iArr = this.f53442j;
        int i10 = 0;
        if (sensorManager != null && iArr != null) {
            int i11 = 0;
            while (i10 < iArr.length) {
                if (sensorManager.getDefaultSensor(iArr[i10]) != null) {
                    i11 |= 1 << i10;
                }
                i10++;
            }
            i10 = i11;
        }
        return Integer.valueOf(i10);
    }

    public final /* synthetic */ Integer I() {
        return Integer.valueOf(z().f53090b);
    }

    public final /* synthetic */ Integer J() {
        return Integer.valueOf(z().f53089a);
    }

    public final /* synthetic */ Float K() {
        return Float.valueOf(z().f53091c);
    }

    public final /* synthetic */ Long L() {
        return (Long) f53437C.a(new P1(this));
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        try {
            this.f53443n = c4878a.a();
            this.f53368b = c4878a;
            WindowManager windowManager = null;
            this.f53441g = null;
            f53437C.a(new P1(this));
            f53438D.a(new C4881a2(this));
            try {
                Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4985n2.this.F();
                    }
                };
                synchronized (V.class) {
                    V.s(runnable);
                }
            } catch (Exception unused) {
            }
            this.f53444o = (SensorManager) this.f53443n.getSystemService("sensor");
            this.f53442j = B();
            Context context = this.f53443n;
            try {
                AtomicInteger atomicInteger = V.f53166a;
                if (!(context instanceof Activity) || ((Activity) context).getWindow().getDecorView().getRootView() == null) {
                    Activity q10 = V.q();
                    if (q10 != null) {
                        windowManager = q10.getWindowManager();
                    }
                } else {
                    windowManager = (WindowManager) context.getSystemService("window");
                }
            } catch (Exception unused2) {
            }
            this.f53446q = windowManager;
            try {
                new Runnable() { // from class: io.seon.androidsdk.service.f2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4985n2.this.G();
                    }
                }.run();
            } catch (Throwable unused3) {
            }
        } catch (Exception e10) {
            f53436B.b(e10);
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("sensors_bitmask", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.c2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Integer H10;
                H10 = C4985n2.this.H();
                return H10;
            }
        }));
        hashMap.put("nt_cb", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.d2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(SeonNT.f());
            }
        }));
        return hashMap;
    }

    public final String q() {
        return Settings.Secure.getString(this.f53443n.getContentResolver(), "android_id");
    }

    public final String r() {
        try {
            return Build.DEVICE;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String s() {
        try {
            return Build.HARDWARE;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String t() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String u() {
        Activity q10;
        WindowManager windowManager;
        try {
            Context context = this.f53443n;
            AtomicInteger atomicInteger = V.f53166a;
            if (!(context instanceof Activity) || ((Activity) context).getWindow().getDecorView().getRootView() == null) {
                q10 = V.q();
                if (q10 == null) {
                    return "NO ACCESS";
                }
            } else {
                Context context2 = this.f53443n;
                if (!(context2 instanceof Activity)) {
                    return "NO ACCESS";
                }
                q10 = (Activity) context2;
            }
            windowManager = q10.getWindowManager();
        } catch (Exception e10) {
            V.j("DOrient", e10);
        }
        if (windowManager == null) {
            return "NOT FOUND";
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (this.f53443n.getResources().getBoolean(Ih.a.f5781a)) {
            int rotation = defaultDisplay.getRotation();
            if (rotation == 0) {
                return "Landscape Left";
            }
            if (rotation == 1) {
                return "Portrait Upside Down";
            }
            if (rotation == 2) {
                return "Landscape Right";
            }
            if (rotation == 3) {
                return "Portrait";
            }
        } else {
            int rotation2 = defaultDisplay.getRotation();
            if (rotation2 == 0) {
                return "Portrait";
            }
            if (rotation2 == 1) {
                return "Landscape Right";
            }
            if (rotation2 == 2) {
                return "Portrait Upside Down";
            }
            if (rotation2 == 3) {
                return "Landscape Left";
            }
        }
        return "NOT FOUND";
    }

    public final long v() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Exception e10) {
            V.j("FreeSD", e10);
            return -1L;
        }
    }

    public final String w() {
        try {
            Cursor query = this.f53443n.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && query.getColumnCount() >= 2) {
                        try {
                            String hexString = Long.toHexString(Long.parseLong(query.getString(1)));
                            query.close();
                            return hexString;
                        } catch (NumberFormatException unused) {
                            query.close();
                            return null;
                        }
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public final String x() {
        String str;
        if (Build.VERSION.SDK_INT < 31) {
            ClipboardManager clipboardManager = this.f53441g;
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            ClipData.Item itemAt = (primaryClip == null || primaryClip.getItemCount() <= 0) ? null : primaryClip.getItemAt(0);
            if (itemAt != null) {
                str = itemAt.getText().toString();
            }
            str = "";
        } else {
            ClipboardManager clipboardManager2 = this.f53441g;
            if (clipboardManager2 != null && clipboardManager2.getPrimaryClipDescription() != null) {
                str = this.f53441g.getPrimaryClipDescription().toString();
            }
            str = "";
        }
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    AtomicInteger atomicInteger = V.f53166a;
                    byte[] bytes = str.getBytes("UTF-8");
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.reset();
                    messageDigest.update(bytes);
                    return V.d(messageDigest.digest());
                }
            } catch (Exception e10) {
                V.j("PBHash", e10);
                return null;
            }
        }
        return null;
    }

    public final int y() {
        double d10;
        try {
            new C5079z1();
            float a10 = C5079z1.a(this.f53443n, f53436B);
            float f10 = Settings.System.getFloat(this.f53443n.getContentResolver(), "screen_brightness", -1.0f);
            if (Build.VERSION.SDK_INT <= 28) {
                return Double.valueOf(((f10 - 1.0f) / (a10 - 1.0f)) * 100.0f).intValue();
            }
            int i10 = C5079z1.f53583a;
            if (r0 > i10) {
                d10 = 1.0d;
            } else {
                double d11 = 0;
                d10 = r0 < d11 ? 0.0d : (r0 - d11) / i10;
            }
            return Double.valueOf(d10 * 100.0d).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|(3:7|(1:9)|10)(1:43)|11|(3:39|40|(11:42|14|15|(3:31|32|(7:34|18|19|20|21|22|23))|17|18|19|20|21|22|23))|13|14|15|(0)|17|18|19|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        io.seon.androidsdk.service.V.j("SDens", r0);
        r0 = -1.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final O1 z() {
        Rect bounds;
        int width;
        Rect bounds2;
        int height;
        O1 o12 = this.f53447r;
        if (o12 != null) {
            return o12;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = this.f53446q;
        if (windowManager != null) {
            r3 = Build.VERSION.SDK_INT >= 30 ? windowManager.getMaximumWindowMetrics() : null;
            this.f53446q.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = this.f53443n.getResources().getDisplayMetrics();
        }
        O1 o13 = new O1();
        this.f53447r = o13;
        int i10 = -1;
        if (r3 != null) {
            try {
            } catch (Exception e10) {
                V.j("SWidth", e10);
                width = -1;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                bounds = r3.getBounds();
                width = bounds.width();
                o13.f53089a = width;
                O1 o14 = this.f53447r;
                if (r3 != null) {
                    try {
                    } catch (Exception e11) {
                        V.j("SHeight", e11);
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        bounds2 = r3.getBounds();
                        height = bounds2.height();
                        i10 = height;
                        o14.f53090b = i10;
                        O1 o15 = this.f53447r;
                        float f10 = displayMetrics.density;
                        o15.f53091c = f10;
                        return this.f53447r;
                    }
                }
                height = displayMetrics.heightPixels;
                i10 = height;
                o14.f53090b = i10;
                O1 o152 = this.f53447r;
                float f102 = displayMetrics.density;
                o152.f53091c = f102;
                return this.f53447r;
            }
        }
        width = displayMetrics.widthPixels;
        o13.f53089a = width;
        O1 o142 = this.f53447r;
        if (r3 != null) {
        }
        height = displayMetrics.heightPixels;
        i10 = height;
        o142.f53090b = i10;
        O1 o1522 = this.f53447r;
        float f1022 = displayMetrics.density;
        o1522.f53091c = f1022;
        return this.f53447r;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("android_id", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.g2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4985n2.this.q();
            }
        }));
        hashMap.put("build_device", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.S1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4985n2.this.r();
            }
        }));
        hashMap.put("build_model", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.T1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4985n2.this.t();
            }
        }));
        hashMap.put("build_hardware", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.U1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4985n2.this.s();
            }
        }));
        hashMap.put("device_orientation", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.V1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4985n2.this.u();
            }
        }));
        hashMap.put("free_storage", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.W1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Long.valueOf(C4985n2.this.v());
            }
        }));
        hashMap.put("has_proximity_sensor", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.X1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(C4985n2.this.D());
            }
        }));
        hashMap.put("pasteboard_hash", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Y1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4985n2.this.x();
            }
        }));
        hashMap.put("screen_height", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Z1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Integer I10;
                I10 = C4985n2.this.I();
                return I10;
            }
        }));
        hashMap.put("screen_width", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.b2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Integer J10;
                J10 = C4985n2.this.J();
                return J10;
            }
        }));
        hashMap.put("screen_scale", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.h2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Float K10;
                K10 = C4985n2.this.K();
                return K10;
            }
        }));
        hashMap.put("screen_brightness", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.i2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Integer.valueOf(C4985n2.this.y());
            }
        }));
        hashMap.put("sensor_hash", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.j2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4985n2.this.A();
            }
        }));
        hashMap.put("total_storage", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.k2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Long L10;
                L10 = C4985n2.this.L();
                return L10;
            }
        }));
        hashMap.put("gsf_id", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.l2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                String o10;
                o10 = C4985n2.this.o();
                return o10;
            }
        }));
        hashMap.put("is_tablet", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Q1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(C4985n2.this.E());
            }
        }));
        hashMap.put("true_device_id_source", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.R1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                String p10;
                p10 = C4985n2.this.p();
                return p10;
            }
        }));
        return hashMap;
    }
}
