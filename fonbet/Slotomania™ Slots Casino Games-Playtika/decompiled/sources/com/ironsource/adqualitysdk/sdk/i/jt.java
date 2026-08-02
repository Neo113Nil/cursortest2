package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public abstract class jt {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static jt f2902;

    /* renamed from: ﻛ, reason: contains not printable characters */
    boolean f2904 = false;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Set<jr> f2903 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo8292();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo8293(Application application, Activity activity);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract Activity mo8296();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized jt m8290() {
        jt jtVar;
        synchronized (jt.class) {
            if (f2902 == null) {
                f2902 = new d((byte) 0);
            }
            jtVar = f2902;
        }
        return jtVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m8295(jr jrVar) {
        this.f2903.add(jrVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m8291(jr jrVar) {
        this.f2903.remove(jrVar);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    protected final synchronized List<jr> m8294() {
        return new ArrayList(this.f2903);
    }

    static class c extends jt {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2905 = 1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char f2906 = 4934;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f2907 = 0;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2908 = 28055;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f2909 = 57824;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f2910 = 44956;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private Context f2911;

        /* synthetic */ c(byte b) {
            this();
        }

        private c() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﻛ */
        public final synchronized void mo8293(Application application, Activity activity) {
            int i = 2 % 2;
            int i2 = f2905 + 63;
            f2907 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (application == null) {
                if (activity != null) {
                    this.f2911 = activity.getApplicationContext();
                    int i3 = 2 % 2;
                }
                return;
            } else {
                this.f2911 = application.getApplicationContext();
                int i4 = f2905 + 95;
                f2907 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 45 / 0;
                    return;
                }
                return;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﾒ */
        public final Activity mo8296() {
            int i = 2 % 2;
            int i2 = f2905 + 65;
            int i3 = i2 % 128;
            f2907 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 97;
            f2905 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﻐ */
        public final boolean mo8292() {
            int i = 2 % 2;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f2911.getSystemService(m8297("ꆺ㒝\ue179\uda77ᳫ₭蔜\ue3dd", TextUtils.lastIndexOf("", '0', 0, 0) + 9).intern())).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                String packageName = this.f2911.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        int i2 = f2905 + 85;
                        f2907 = i2 % 128;
                        int i3 = i2 % 2;
                        if (runningAppProcessInfo.processName.equals(packageName)) {
                            int i4 = f2905 + 5;
                            f2907 = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i5 = 1 / 0;
                            }
                            return true;
                        }
                    }
                    int i6 = f2907 + 41;
                    f2905 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 5 / 5;
                    }
                }
                return false;
            }
            int i8 = f2907 + 99;
            f2905 = i8 % 128;
            return i8 % 2 == 0;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m8297(String str, int i) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (o.f3094) {
                char[] cArr3 = new char[cArr2.length];
                o.f3095 = 0;
                char[] cArr4 = new char[2];
                while (o.f3095 < cArr2.length) {
                    cArr4[0] = cArr2[o.f3095];
                    cArr4[1] = cArr2[o.f3095 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr4[1];
                        char c2 = cArr4[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2909)) ^ ((c2 >>> 5) + f2906)));
                        cArr4[1] = c3;
                        cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2910) ^ ((c3 + i2) ^ ((c3 << 4) + f2908))));
                        i2 -= 40503;
                    }
                    cArr3[o.f3095] = cArr4[0];
                    cArr3[o.f3095 + 1] = cArr4[1];
                    o.f3095 += 2;
                }
                str2 = new String(cArr3, 0, i);
            }
            return str2;
        }
    }

    static class d extends jt implements Application.ActivityLifecycleCallbacks {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2912 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2913 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int[] f2914 = {-871357969, 1337581473, 430089141, 357984553, 2069095681, -957501125, 1709954397, 877960220, -637464995, 1727038325, 1140351433, 1094155977, 1356479358, 29226465, -1363218710, 786522359, -294517061, -508750614};

        /* renamed from: ｋ, reason: contains not printable characters */
        private Map<Activity, Boolean> f2915;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private WeakReference<Activity> f2916;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private WeakReference<Application> f2917;

        private d() {
            this.f2915 = new WeakHashMap();
        }

        /* synthetic */ d(byte b) {
            this();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﻛ */
        public final synchronized void mo8293(Application application, Activity activity) {
            if (this.f2917 == null) {
                this.f2917 = new WeakReference<>(application);
                if (activity != null) {
                    m8298(activity);
                    synchronized (this) {
                        this.f2915.put(activity, Boolean.TRUE);
                    }
                }
                application.registerActivityLifecycleCallbacks(this);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﾒ */
        public final Activity mo8296() {
            int i = 2 % 2;
            int i2 = f2913 + 1;
            f2912 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
                if (this.f2916 == null) {
                    return null;
                }
            } else if (this.f2916 == null) {
                return null;
            }
            Activity activity = this.f2916.get();
            int i4 = f2912 + 55;
            f2913 = i4 % 128;
            int i5 = i4 % 2;
            return activity;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private void m8298(final Activity activity) {
            int i = 2 % 2;
            this.f2916 = new WeakReference<>(activity);
            p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jt.d.4
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() throws Exception {
                    kf.m8369(activity);
                }
            });
            int i2 = f2913 + 103;
            f2912 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﻐ */
        public final synchronized boolean mo8292() {
            int i = 2 % 2;
            if (this.f2915.size() > 0) {
                int i2 = f2912 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f2913 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = f2912 + 95;
            f2913 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int i = 2 % 2;
            int i2 = f2912 + 53;
            f2913 = i2 % 128;
            int i3 = i2 % 2;
            try {
                m8298(activity);
                Iterator<jr> it = m8294().iterator();
                while (it.hasNext()) {
                    int i4 = f2913 + 99;
                    f2912 = i4 % 128;
                    int i5 = i4 % 2;
                    it.next().onActivityResumed(activity);
                }
            } catch (Exception e) {
                kl.m8458(m8300(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 30 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), m8300(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1385927799, 1364847630, -1899218572, -1797057217, -926562044, -1217637057}, (ViewConfiguration.getPressedStateDuration() >> 16) + 26).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            int i = 2 % 2;
            try {
                Iterator<jr> it = m8294().iterator();
                while (it.hasNext()) {
                    int i2 = f2913 + 105;
                    f2912 = i2 % 128;
                    if (i2 % 2 != 0) {
                        it.next().onActivityPaused(activity);
                        throw null;
                    }
                    it.next().onActivityPaused(activity);
                    int i3 = f2913 + 37;
                    f2912 = i3 % 128;
                    int i4 = i3 % 2;
                }
            } catch (Exception e) {
                kl.m8458(m8300(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, TextUtils.getOffsetBefore("", 0) + 30).intern(), m8300(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, -321643915, 1366169862, 1322038222, -871121847, 1041900432, 757404849}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (jt.class) {
                    if (this.f2916 == null) {
                        m8298(activity);
                        jt.class.notifyAll();
                    }
                }
                Iterator<jr> it = m8294().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e) {
                kl.m8458(m8300(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m8300(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1858328683, -689158369, 55377100, -626326503, -926562044, -1217637057}, 26 - Drawable.resolveOpacity(0, 0)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f2916 == null) {
                    m8298(activity);
                }
                synchronized (this) {
                    this.f2915.put(activity, Boolean.TRUE);
                }
                Iterator<jr> it = m8294().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m8300(new int[]{1293564134, 807685648, 1998697044, -834050683, -1550536543, 76565470, -1027350837, -843054928, 10261674, -2125008486, -1786728957, 1207954123, 662460433, 248596877, -1967419306, -725761015, -1850572200, 694134203, -1994432257, 1673985983, 1100463782, -808118632}, TextUtils.getOffsetBefore("", 0) + 43).intern())) {
                    return;
                }
                synchronized (this) {
                    if (this.f2915.size() == 1 && !this.f2904) {
                        m8301(activity);
                    }
                }
            } catch (Exception e) {
                kl.m8458(m8300(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 30 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m8300(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1889836171, -887348532, 480549063, -1535923990, -926562044, -1217637057}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int i;
            try {
                Iterator<jr> it = m8294().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f2904 = activity.isChangingConfigurations();
                synchronized (this) {
                    if (!this.f2915.containsKey(activity) || activity.getLocalClassName().equals(m8300(new int[]{1293564134, 807685648, 1998697044, -834050683, -1550536543, 76565470, -1027350837, -843054928, 10261674, -2125008486, -1786728957, 1207954123, 662460433, 248596877, -1967419306, -725761015, -1850572200, 694134203, -1994432257, 1673985983, 1100463782, -808118632}, Color.green(0) + 43).intern())) {
                        i = -1;
                    } else {
                        this.f2915.remove(activity);
                        i = this.f2915.size();
                    }
                }
                if (i < 0 || i != 0 || this.f2904) {
                    return;
                }
                m8299(activity);
            } catch (Exception e) {
                kl.m8458(m8300(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 30 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m8300(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1889836171, -887348532, 1434797394, 1790972388, -926562044, -1217637057}, 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            try {
                Iterator<jr> it = m8294().iterator();
                while (it.hasNext()) {
                    int i2 = f2913 + 49;
                    f2912 = i2 % 128;
                    int i3 = i2 % 2;
                    it.next().onActivitySaveInstanceState(activity, bundle);
                    int i4 = f2913 + 101;
                    f2912 = i4 % 128;
                    int i5 = i4 % 2;
                }
            } catch (Exception e) {
                kl.m8458(m8300(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, (Process.myPid() >> 22) + 30).intern(), m8300(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1889836171, -887348532, -1038434714, -722735429, -2003500875, 402667811, 1964754719, -2003821901, 1333325114, 1738527500}, ExpandableListView.getPackedPositionType(0L) + 36).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Iterator<jr> it;
            int i = 2 % 2;
            int i2 = f2912 + 25;
            f2913 = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    it = m8294().iterator();
                    int i3 = 95 / 0;
                } else {
                    it = m8294().iterator();
                }
                while (it.hasNext()) {
                    int i4 = f2912 + 33;
                    f2913 = i4 % 128;
                    if (i4 % 2 == 0) {
                        it.next().onActivityDestroyed(activity);
                        int i5 = 96 / 0;
                    } else {
                        it.next().onActivityDestroyed(activity);
                    }
                }
            } catch (Exception e) {
                kl.m8458(m8300(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 29 - TextUtils.indexOf((CharSequence) "", '0')).intern(), m8300(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, -858773682, -980847206, -677829030, -483398048, -775645339, -658125370}, 28 - Gravity.getAbsoluteGravity(0, 0)).intern(), (Throwable) e, false);
            }
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private void m8299(Activity activity) {
            int i = 2 % 2;
            Iterator<jr> it = m8294().iterator();
            while (it.hasNext()) {
                int i2 = f2913 + 93;
                f2912 = i2 % 128;
                int i3 = i2 % 2;
                it.next().mo5970(activity);
                int i4 = f2912 + 95;
                f2913 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private void m8301(Activity activity) {
            int i = 2 % 2;
            int i2 = f2912 + 49;
            f2913 = i2 % 128;
            if (i2 % 2 != 0) {
                Iterator<jr> it = m8294().iterator();
                while (it.hasNext()) {
                    int i3 = f2912 + 35;
                    f2913 = i3 % 128;
                    int i4 = i3 % 2;
                    it.next().mo5971(activity);
                }
                return;
            }
            m8294().iterator();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m8300(int[] iArr, int i) {
            String str;
            synchronized (a.f86) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2914.clone();
                a.f83 = 0;
                while (a.f83 < iArr.length) {
                    cArr[0] = (char) (iArr[a.f83] >> 16);
                    cArr[1] = (char) iArr[a.f83];
                    cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                    cArr[3] = (char) iArr[a.f83 + 1];
                    a.f84 = (cArr[0] << 16) + cArr[1];
                    a.f85 = (cArr[2] << 16) + cArr[3];
                    a.m5773(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = a.f84 ^ iArr2[i2];
                        a.f84 = i3;
                        a.f85 = a.m5774(i3) ^ a.f85;
                        int i4 = a.f84;
                        a.f84 = a.f85;
                        a.f85 = i4;
                    }
                    int i5 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i5;
                    a.f85 = i5 ^ iArr2[16];
                    a.f84 ^= iArr2[17];
                    int i6 = a.f84;
                    int i7 = a.f85;
                    cArr[0] = (char) (a.f84 >>> 16);
                    cArr[1] = (char) a.f84;
                    cArr[2] = (char) (a.f85 >>> 16);
                    cArr[3] = (char) a.f85;
                    a.m5773(iArr2);
                    cArr2[a.f83 << 1] = cArr[0];
                    cArr2[(a.f83 << 1) + 1] = cArr[1];
                    cArr2[(a.f83 << 1) + 2] = cArr[2];
                    cArr2[(a.f83 << 1) + 3] = cArr[3];
                    a.f83 += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }
}
