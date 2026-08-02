package io.sentry.android.core.internal.util;

import io.sentry.InterfaceC4765j0;
import io.sentry.util.AbstractC4851i;
import io.sentry.util.C4843a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f51136c = new n();

    /* renamed from: a, reason: collision with root package name */
    public final C4843a f51137a = new C4843a();

    /* renamed from: b, reason: collision with root package name */
    public final List f51138b = new ArrayList();

    public static n a() {
        return f51136c;
    }

    public String b() {
        return "/sys/devices/system/cpu";
    }

    public List c() {
        InterfaceC4765j0 d10 = this.f51137a.d();
        try {
            if (!this.f51138b.isEmpty()) {
                List list = this.f51138b;
                if (d10 != null) {
                    d10.close();
                }
                return list;
            }
            File[] listFiles = new File(b()).listFiles();
            if (listFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (d10 != null) {
                    d10.close();
                }
                return arrayList;
            }
            for (File file : listFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String c10 = AbstractC4851i.c(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (c10 != null) {
                            this.f51138b.add(Integer.valueOf((int) (Long.parseLong(c10.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            List list2 = this.f51138b;
            if (d10 != null) {
                d10.close();
            }
            return list2;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
