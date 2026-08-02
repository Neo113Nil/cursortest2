package io.seon.androidsdk.service;

import ai.verisoul.sdk.Core;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.hardware.display.DisplayManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.view.Display;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.uimanager.ViewProps;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class T extends AbstractC4950j {

    /* renamed from: B, reason: collision with root package name */
    public static final L4 f53141B;

    /* renamed from: C, reason: collision with root package name */
    public static final L4 f53142C;

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f53143i = {"audio_mute_status", "audio_volume_current", "is_remote_control_connected", "remote_control_provider", "is_screen_being_mirrored", "is_click_automator_installed", "enabled_accessibility_apps", "interfering_apps", "media_drm_id"};

    /* renamed from: p, reason: collision with root package name */
    public static final Lh.a f53144p = Lh.a.d(T.class);

    /* renamed from: q, reason: collision with root package name */
    public static final UUID f53145q = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: r, reason: collision with root package name */
    public static final ArrayList f53146r;

    /* renamed from: e, reason: collision with root package name */
    public AccessibilityManager f53147e;

    /* renamed from: g, reason: collision with root package name */
    public DisplayManager f53148g;

    /* renamed from: n, reason: collision with root package name */
    public PackageManager f53149n;

    /* renamed from: o, reason: collision with root package name */
    public Context f53150o;

    static {
        UUID uuid = new UUID(1186680826959645954L, -5988876978535335093L);
        f53146r = new ArrayList(Arrays.asList(new UUID(7915273996377279080L, -4667308015798344538L), new UUID(-992507800680445872L, -7199381120623628549L), new UUID(7020113915151479668L, 3265235552863347572L), new UUID(-7724087898164736189L, -5928826375076672350L), new UUID(4422091961135677928L, -5169044695670406100L), new UUID(2855251872710412542L, -5915247801538268145L), new UUID(-2129748144642739255L, 8654423357094679310L), new UUID(7228250692166569901L, -7738864887904840524L), new UUID(4018110648156769406L, -5666344514801360556L), new UUID(5031789394971871680L, -5933022823712443662L), new UUID(-2525142925290940392L, 8909820388469371869L), new UUID(3872842222027031255L, -8402279516758276337L), new UUID(-9176437742005367753L, -7029884071836333870L), new UUID(6801168765294362723L, -8541191043631480108L), new UUID(-7348484286925749626L, -6083546864340672619L), new UUID(7681262094454315298L, -7309041776357940493L), new UUID(-5930083867628189075L, -7670962396607644779L), new UUID(2270907025534308109L, -5030698059018986906L), new UUID(-7409469329982928743L, -5287136925416878535L), new UUID(-6448827203737399526L, -7153349929997633597L), new UUID(-6192002537030071734L, -8171282535135843795L), new UUID(-7338653513101981915L, -8305690818819724279L), new UUID(-5458022420440088656L, -7735543098249644349L), new UUID(8735709315166652742L, -6250393853774379852L), uuid));
        f53141B = new L4(Core.sensorDataTimeout);
        f53142C = new L4(Core.sensorDataTimeout);
    }

    public final String A() {
        List supportedCryptoSchemes;
        ArrayList arrayList = new ArrayList();
        arrayList.add(f53145q);
        arrayList.addAll(f53146r);
        if (Build.VERSION.SDK_INT >= 30) {
            supportedCryptoSchemes = MediaDrm.getSupportedCryptoSchemes();
            arrayList.addAll(supportedCryptoSchemes);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                MediaDrm mediaDrm = new MediaDrm((UUID) it.next());
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(propertyByteArray);
                String d10 = V.d(messageDigest.digest());
                if (Build.VERSION.SDK_INT >= 28) {
                    mediaDrm.release();
                } else {
                    mediaDrm.release();
                }
                return d10;
            } catch (UnsupportedSchemeException unused) {
            } catch (IllegalArgumentException unused2) {
                e = new IllegalArgumentException("Suppressed");
                V.j("DRM", e);
            } catch (NoSuchAlgorithmException e10) {
                f53144p.c(e10, 6);
            } catch (Exception e11) {
                e = e11;
                V.j("DRM", e);
            }
        }
        return null;
    }

    public final String[] B() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(f53145q);
        arrayList2.addAll(f53146r);
        MediaDrm mediaDrm = null;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            try {
                MediaDrm mediaDrm2 = new MediaDrm((UUID) arrayList2.get(i10));
                try {
                    byte[] propertyByteArray = mediaDrm2.getPropertyByteArray("deviceUniqueId");
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(propertyByteArray);
                    arrayList.add(i10 + "," + V.d(messageDigest.digest()));
                    if (Build.VERSION.SDK_INT >= 28) {
                        mediaDrm2.release();
                    } else {
                        mediaDrm2.release();
                    }
                } catch (Exception unused) {
                    mediaDrm = mediaDrm2;
                    if (mediaDrm != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            mediaDrm.release();
                        } else {
                            mediaDrm.release();
                        }
                        mediaDrm = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mediaDrm = mediaDrm2;
                    if (mediaDrm != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            mediaDrm.release();
                        } else {
                            mediaDrm.release();
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
            mediaDrm = null;
        }
        String[] strArr = new String[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            strArr[i11] = (String) arrayList.get(i11);
        }
        return strArr;
    }

    public final String C() {
        Display[] displayArr;
        try {
            StringBuilder sb2 = new StringBuilder();
            try {
                displayArr = this.f53148g.getDisplays();
            } catch (Exception e10) {
                V.j("ConnDisp", e10);
                displayArr = null;
            }
            if (displayArr == null) {
                return null;
            }
            for (Display display : displayArr) {
                sb2.append(String.format(Locale.ENGLISH, "%s(%s):%s;", display.getName(), Integer.valueOf(display.getDisplayId()), Integer.valueOf(display.getFlags())));
            }
            return sb2.toString();
        } catch (Exception e11) {
            V.j("DispFl", e11);
            return null;
        }
    }

    public final boolean D() {
        return ((AudioManager) this.f53150o.getSystemService("audio")).getRingerMode() != 2;
    }

    public final ArrayList E() {
        C4982n G10 = G();
        if (G10 == null) {
            return null;
        }
        return G10.f53432a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[Catch: Exception -> 0x00b2, TryCatch #3 {Exception -> 0x00b2, blocks: (B:3:0x0001, B:7:0x0010, B:20:0x0058, B:25:0x0066, B:37:0x00a7, B:44:0x00a5, B:43:0x00a2, B:57:0x0056, B:62:0x0053, B:29:0x0074, B:13:0x0031, B:14:0x0035, B:16:0x003b, B:19:0x004f, B:60:0x002d, B:12:0x0025, B:30:0x0080, B:31:0x0084, B:33:0x008a, B:36:0x009e, B:50:0x007c), top: B:2:0x0001, inners: #1, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String F() {
        boolean z10;
        List<AccessibilityServiceInfo> list;
        Boolean bool;
        List<AccessibilityServiceInfo> list2;
        Boolean bool2;
        try {
            if (v("teamviewer").booleanValue()) {
                return "TeamViewer";
            }
            boolean z11 = false;
            if (v("screencap").booleanValue()) {
                try {
                    try {
                        list2 = this.f53147e.getEnabledAccessibilityServiceList(-1);
                    } catch (Exception e10) {
                        V.j("AccServ", e10);
                        list2 = null;
                    }
                    Iterator<AccessibilityServiceInfo> it = list2.iterator();
                    while (it.hasNext()) {
                        if (it.next().getResolveInfo().toString().contains("com.anydesk")) {
                            bool2 = Boolean.TRUE;
                            break;
                        }
                    }
                } catch (Exception e11) {
                    V.j("SimAcc", e11);
                }
                bool2 = Boolean.FALSE;
                if (bool2.booleanValue()) {
                    z10 = true;
                    if (!z10) {
                        return "AnyDesk";
                    }
                    if (v("ScreenCapture").booleanValue()) {
                        try {
                            list = this.f53147e.getEnabledAccessibilityServiceList(-1);
                        } catch (Exception e12) {
                            try {
                                V.j("AccServ", e12);
                                list = null;
                            } catch (Exception e13) {
                                V.j("SimAcc", e13);
                            }
                        }
                        Iterator<AccessibilityServiceInfo> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().getResolveInfo().toString().contains("it.nanosystems.supremo")) {
                                bool = Boolean.TRUE;
                                break;
                            }
                        }
                        bool = Boolean.FALSE;
                        if (bool.booleanValue()) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        return "Supremo";
                    }
                    return null;
                }
            }
            z10 = false;
            if (!z10) {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final C4982n G() {
        List<AccessibilityServiceInfo> list;
        String str;
        ApplicationInfo applicationInfo;
        try {
            list = this.f53147e.getEnabledAccessibilityServiceList(-1);
        } catch (Exception e10) {
            V.j("AccServ", e10);
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list == null) {
            return null;
        }
        int i10 = 0;
        for (AccessibilityServiceInfo accessibilityServiceInfo : list) {
            try {
                ServiceInfo serviceInfo = accessibilityServiceInfo.getResolveInfo().serviceInfo;
                ProviderInfo providerInfo = accessibilityServiceInfo.getResolveInfo().providerInfo;
                ActivityInfo activityInfo = accessibilityServiceInfo.getResolveInfo().activityInfo;
                if (serviceInfo != null) {
                    String replace = serviceInfo.toString().replace("ServiceInfo{", "").replace("}", "");
                    ApplicationInfo applicationInfo2 = serviceInfo.applicationInfo;
                    str = replace;
                    applicationInfo = applicationInfo2;
                } else if (providerInfo == null) {
                    str = activityInfo.toString().replace("ActivityInfo{", "").replace("}", "");
                    applicationInfo = activityInfo.applicationInfo;
                } else {
                    str = providerInfo.toString().replace("ProviderInfo{", "").replace("}", "");
                    applicationInfo = providerInfo.applicationInfo;
                }
                if (str.contains(" ")) {
                    str = str.split(" ")[1];
                }
                PackageManager packageManager = this.f53149n;
                if (packageManager != null) {
                    arrayList2.add((String) packageManager.getApplicationLabel(applicationInfo));
                }
                if (str.length() + i10 <= 900) {
                    arrayList.add(str);
                    i10 += str.length();
                }
            } catch (Exception unused) {
            }
        }
        return new C4982n(arrayList2, arrayList);
    }

    public final void H() {
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.O
            @Override // java.lang.Runnable
            public final void run() {
                T.this.t();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.P
                @Override // java.lang.Runnable
                public final void run() {
                    T.this.r();
                }
            }.run();
        } catch (Throwable unused2) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.Q
                @Override // java.lang.Runnable
                public final void run() {
                    T.this.s();
                }
            }.run();
        } catch (Throwable unused3) {
        }
    }

    public final Boolean I() {
        List<AccessibilityServiceInfo> list;
        Boolean bool;
        try {
            String[] strArr = {"autoclicker", "com.applisto.appcloner", "com.bitspice.automate", "remotebot"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                try {
                    list = this.f53147e.getEnabledAccessibilityServiceList(-1);
                } catch (Exception e10) {
                    V.j("AccServ", e10);
                    list = null;
                }
                Iterator<AccessibilityServiceInfo> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().getResolveInfo().toString().contains(str)) {
                            bool = Boolean.TRUE;
                            break;
                        }
                    } catch (Exception e11) {
                        V.j("SimAcc", e11);
                    }
                }
                bool = Boolean.FALSE;
                if (bool.booleanValue()) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (Exception e12) {
            V.j("ClickAu", e12);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r0 != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean J() {
        boolean z10;
        boolean z11;
        Boolean bool;
        List<AccessibilityServiceInfo> list;
        Boolean bool2;
        try {
            List<AccessibilityServiceInfo> list2 = null;
            boolean z12 = false;
            if (v("screencap").booleanValue()) {
                try {
                    try {
                        list = this.f53147e.getEnabledAccessibilityServiceList(-1);
                    } catch (Exception e10) {
                        V.j("AccServ", e10);
                        list = null;
                    }
                    Iterator<AccessibilityServiceInfo> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().getResolveInfo().toString().contains("com.anydesk")) {
                            bool2 = Boolean.TRUE;
                            break;
                        }
                    }
                } catch (Exception e11) {
                    V.j("SimAcc", e11);
                }
                bool2 = Boolean.FALSE;
                if (bool2.booleanValue()) {
                    z10 = true;
                    if (!z10 && !v("teamviewer").booleanValue()) {
                        if (v("ScreenCapture").booleanValue()) {
                            try {
                                try {
                                    list2 = this.f53147e.getEnabledAccessibilityServiceList(-1);
                                } catch (Exception e12) {
                                    V.j("AccServ", e12);
                                }
                                Iterator<AccessibilityServiceInfo> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (it2.next().getResolveInfo().toString().contains("it.nanosystems.supremo")) {
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                }
                            } catch (Exception e13) {
                                V.j("SimAcc", e13);
                            }
                            bool = Boolean.FALSE;
                            if (bool.booleanValue()) {
                                z11 = true;
                            }
                        }
                        z11 = false;
                    }
                    z12 = true;
                    return Boolean.valueOf(z12);
                }
            }
            z10 = false;
            if (!z10) {
                if (v("ScreenCapture").booleanValue()) {
                }
                z11 = false;
            }
            z12 = true;
            return Boolean.valueOf(z12);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public final Boolean K() {
        Display[] displayArr;
        try {
            try {
                displayArr = this.f53148g.getDisplays();
            } catch (Exception e10) {
                V.j("ConnDisp", e10);
                displayArr = null;
            }
            boolean z10 = true;
            if (displayArr.length <= 1) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public final Boolean L() {
        AudioDeviceInfo communicationDevice;
        try {
            AudioManager audioManager = (AudioManager) this.f53150o.getSystemService("audio");
            if (audioManager == null) {
                return Boolean.FALSE;
            }
            if (Build.VERSION.SDK_INT < 34) {
                return Boolean.valueOf(((AudioManager) this.f53150o.getSystemService("audio")).isSpeakerphoneOn());
            }
            communicationDevice = audioManager.getCommunicationDevice();
            boolean z10 = false;
            if (communicationDevice != null) {
                int type = communicationDevice.getType();
                if (type == 2 || type == 24 || type == 27) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                int type2 = audioDeviceInfo.getType();
                if (type2 == 2 || type2 == 24 || type2 == 27) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (Exception unused) {
            return null;
        }
    }

    public final /* synthetic */ void M() {
        f53141B.a(new J(this));
    }

    public final void N() {
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.H
            @Override // java.lang.Runnable
            public final void run() {
                T.this.M();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void O() {
        new Thread(new Runnable() { // from class: io.seon.androidsdk.service.S
            @Override // java.lang.Runnable
            public final void run() {
                T.this.N();
            }
        }).start();
    }

    public final /* synthetic */ void P() {
        f53142C.a(new I(this));
    }

    public final void Q() {
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.G
            @Override // java.lang.Runnable
            public final void run() {
                T.this.P();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void R() {
        new Thread(new Runnable() { // from class: io.seon.androidsdk.service.N
            @Override // java.lang.Runnable
            public final void run() {
                T.this.Q();
            }
        }).start();
    }

    public final /* synthetic */ String[] S() {
        return (String[]) f53142C.a(new I(this));
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        this.f53150o = c4878a.a();
        this.f53368b = c4878a;
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.K
            @Override // java.lang.Runnable
            public final void run() {
                T.this.H();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.L
                @Override // java.lang.Runnable
                public final void run() {
                    T.this.O();
                }
            }.run();
        } catch (Throwable unused2) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.M
                @Override // java.lang.Runnable
                public final void run() {
                    T.this.R();
                }
            }.run();
        } catch (Throwable unused3) {
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("codec_hash", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.s
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T.this.y();
            }
        }));
        hashMap.put("display_flags", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.t
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T.this.C();
            }
        }));
        hashMap.put("media_drm_id_list", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.u
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                String[] S10;
                S10 = T.this.S();
                return S10;
            }
        }));
        final AudioManager audioManager = (AudioManager) this.f53150o.getSystemService("audio");
        hashMap.put("current_active_audio_device", audioManager != null ? AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.v
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Integer w10;
                w10 = T.this.w(audioManager);
                return w10;
            }
        }) : null);
        hashMap.put("is_speakerphone_active", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.w
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T.this.L();
            }
        }));
        return hashMap;
    }

    public final /* synthetic */ void r() {
        this.f53148g = (DisplayManager) this.f53150o.getSystemService(ViewProps.DISPLAY);
    }

    public final /* synthetic */ void s() {
        this.f53149n = this.f53150o.getPackageManager();
    }

    public final /* synthetic */ void t() {
        this.f53147e = (AccessibilityManager) this.f53150o.getSystemService("accessibility");
    }

    public final /* synthetic */ String u() {
        return (String) f53141B.a(new J(this));
    }

    public final Boolean v(String str) {
        Display[] displayArr;
        try {
            try {
                displayArr = this.f53148g.getDisplays();
            } catch (Exception e10) {
                V.j("ConnDisp", e10);
                displayArr = null;
            }
            for (Display display : displayArr) {
                if (display.getName().contains(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        r3 = r3.getCommunicationDevice();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer w(AudioManager audioManager) {
        int i10;
        AudioDeviceInfo communicationDevice;
        try {
            i10 = (Build.VERSION.SDK_INT < 31 || communicationDevice == null) ? 0 : communicationDevice.getType();
        } catch (Exception unused) {
            i10 = -1;
        }
        return Integer.valueOf(i10);
    }

    public final ArrayList x() {
        C4982n G10 = G();
        if (G10 == null) {
            return null;
        }
        return G10.f53433b;
    }

    public final String y() {
        StringBuilder sb2 = new StringBuilder();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            sb2.append(codecInfoAt.getName());
            sb2.append(Arrays.asList((String[]) codecInfoAt.getSupportedTypes().clone()));
        }
        try {
            String sb3 = sb2.toString();
            if (!sb3.equals("") && !sb3.trim().equals("")) {
                AtomicInteger atomicInteger = V.f53166a;
                byte[] bytes = sb3.getBytes("UTF-8");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.reset();
                messageDigest.update(bytes);
                return V.d(messageDigest.digest());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final int z() {
        return (int) ((((AudioManager) this.f53150o.getSystemService("audio")).getStreamVolume(3) / ((AudioManager) this.f53150o.getSystemService("audio")).getStreamMaxVolume(3)) * 100.0d);
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("audio_mute_status", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.x
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(T.this.D());
            }
        }));
        hashMap.put("audio_volume_current", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.y
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Integer.valueOf(T.this.z());
            }
        }));
        hashMap.put("is_remote_control_connected", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.z
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T.this.J();
            }
        }));
        hashMap.put("remote_control_provider", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.A
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T.this.F();
            }
        }));
        hashMap.put("is_screen_being_mirrored", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.B
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T.this.K();
            }
        }));
        hashMap.put("is_click_automator_installed", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.C
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T.this.I();
            }
        }));
        hashMap.put("enabled_accessibility_apps", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.D
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T.this.x();
            }
        }));
        hashMap.put("interfering_apps", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.E
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T.this.E();
            }
        }));
        hashMap.put("media_drm_id", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.F
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                String u10;
                u10 = T.this.u();
                return u10;
            }
        }));
        return hashMap;
    }
}
