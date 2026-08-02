package com.vk.core.performance.device;

import android.content.SharedPreferences;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.StringTokenizer;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.e8r;
import xsna.emb;
import xsna.hx90;
import xsna.nbr;
import xsna.zrp;

/* compiled from: DevicePerformanceInfo.kt */
/* loaded from: classes.dex */
public final class DevicePerformanceInfo {
    public static boolean f;
    public static volatile DevicePerformanceInfo g;
    public final Class a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final Class e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DevicePerformanceInfo.kt */
    /* loaded from: classes17.dex */
    public static final class Class {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Class[] $VALUES;
        public static final a Companion;
        public static final Class HIGH;
        public static final Class LOW;
        public static final Class MEDIUM;
        private final int weight;

        /* compiled from: DevicePerformanceInfo.kt */
        public static final class a {
            public static Class a(int i) {
                for (Class r3 : Class.values()) {
                    if (r3.h() == i) {
                        return r3;
                    }
                }
                return null;
            }
        }

        static {
            Class r0 = new Class("LOW", 0, 0);
            LOW = r0;
            Class r1 = new Class("MEDIUM", 1, 1);
            MEDIUM = r1;
            Class r2 = new Class("HIGH", 2, 2);
            HIGH = r2;
            Class[] classArr = {r0, r1, r2};
            $VALUES = classArr;
            $ENTRIES = new asp(classArr);
            Companion = new a();
        }

        public Class(String str, int i, int i2) {
            this.weight = i2;
        }

        public static Class valueOf(String str) {
            return (Class) Enum.valueOf(Class.class, str);
        }

        public static Class[] values() {
            return (Class[]) $VALUES.clone();
        }

        public final int h() {
            return this.weight;
        }
    }

    /* compiled from: DevicePerformanceInfo.kt */
    public static final class a {
        public static DevicePerformanceInfo a() {
            if (DevicePerformanceInfo.g != null) {
                return DevicePerformanceInfo.g;
            }
            DevicePerformanceInfo devicePerformanceInfo = null;
            if (DevicePerformanceInfo.f) {
                return null;
            }
            SharedPreferences sharedPreferences = hx90.a;
            File e = PrivateFiles.e(e8r.a, PrivateSubdir.PERFORMANCE, "device_performance_info", null, 28);
            if (e.exists()) {
                long currentTimeMillis = System.currentTimeMillis();
                StringTokenizer stringTokenizer = new StringTokenizer(nbr.r(e, emb.b), StringUtils.COMMA);
                try {
                    Class.a aVar = Class.Companion;
                    int parseInt = Integer.parseInt(stringTokenizer.nextToken());
                    aVar.getClass();
                    Class a = Class.a.a(parseInt);
                    Class a2 = Class.a.a(Integer.parseInt(stringTokenizer.nextToken()));
                    Class a3 = Class.a.a(Integer.parseInt(stringTokenizer.nextToken()));
                    Class a4 = Class.a.a(Integer.parseInt(stringTokenizer.nextToken()));
                    if (a != null && a2 != null && a3 != null && a4 != null) {
                        devicePerformanceInfo = new DevicePerformanceInfo(a, a2, a3, a4);
                    }
                } catch (Throwable unused) {
                }
                L.e("DevicePerformanceInfo", "loaded, took " + (System.currentTimeMillis() - currentTimeMillis) + UcumUtils.UCUM_MILLISECODS);
            } else {
                L.e("DevicePerformanceInfo", "file doesn't exist");
            }
            DevicePerformanceInfo.g = devicePerformanceInfo;
            DevicePerformanceInfo.f = true;
            return DevicePerformanceInfo.g;
        }
    }

    public DevicePerformanceInfo(Class r1, Class r2, Class r3, Class r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r3;
    }

    public final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = hx90.a;
        File e = PrivateFiles.e(e8r.a, PrivateSubdir.PERFORMANCE, "device_performance_info", null, 28);
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.h());
        sb.append(',');
        sb.append(this.b.h());
        sb.append(',');
        sb.append(this.c.h());
        sb.append(',');
        sb.append(this.d.h());
        sb.append(',');
        nbr.w(e, sb.toString(), emb.b);
        g = this;
        L.e("DevicePerformanceInfo", "stored, took " + (System.currentTimeMillis() - currentTimeMillis) + UcumUtils.UCUM_MILLISECODS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevicePerformanceInfo)) {
            return false;
        }
        DevicePerformanceInfo devicePerformanceInfo = (DevicePerformanceInfo) obj;
        return this.a == devicePerformanceInfo.a && this.b == devicePerformanceInfo.b && this.c == devicePerformanceInfo.c && this.d == devicePerformanceInfo.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DevicePerformanceInfo(cpuClass=" + this.a + ", diskClass=" + this.b + ", ramClass=" + this.c + ", overallClass=" + this.d + ')';
    }
}
