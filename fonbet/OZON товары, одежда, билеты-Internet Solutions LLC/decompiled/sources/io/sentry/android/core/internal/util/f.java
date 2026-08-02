package io.sentry.android.core.internal.util;

import io.sentry.InterfaceC7097a0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f67197c = new f();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67198a = new io.sentry.util.a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f67199b = new ArrayList();

    private f() {
    }

    public static f a() {
        return f67197c;
    }

    @NotNull
    public final ArrayList b() {
        InterfaceC7097a0 a11 = this.f67198a.a();
        ArrayList arrayList = this.f67199b;
        try {
            if (!arrayList.isEmpty()) {
                a11.close();
                return arrayList;
            }
            File[] listFiles = new File("/sys/devices/system/cpu").listFiles();
            if (listFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                a11.close();
                return arrayList2;
            }
            for (File file : listFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String c11 = io.sentry.util.g.c(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (c11 != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(c11.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            a11.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
