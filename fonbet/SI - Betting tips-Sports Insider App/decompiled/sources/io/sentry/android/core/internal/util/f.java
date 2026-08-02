package io.sentry.android.core.internal.util;

import io.sentry.r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f15714c = new f();

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f15715a = new io.sentry.util.a();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15716b = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = this.f15716b;
        r a7 = this.f15715a.a();
        try {
            if (!arrayList.isEmpty()) {
                a7.close();
                return arrayList;
            }
            File[] listFiles = new File("/sys/devices/system/cpu").listFiles();
            if (listFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                a7.close();
                return arrayList2;
            }
            for (File file : listFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String w10 = io.sentry.config.a.w(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (w10 != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(w10.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            a7.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
