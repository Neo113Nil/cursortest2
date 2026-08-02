package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class i {
    private static i a;
    private long b = -1;
    private final List<Printer> c = new ArrayList();
    private final List<Printer> d = new ArrayList();
    private boolean e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.i.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    i.a().a(str);
                } else if (str.charAt(0) == '<') {
                    i.a().b(str);
                }
                i.c();
            }
        };
    }

    private i() {
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Printer printer = list.get(i);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
        }
    }

    public static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.b != -1 && SystemClock.uptimeMillis() - this.b > 5000;
    }

    public final void b(String str) {
        this.b = SystemClock.uptimeMillis();
        try {
            a(this.d, str);
        } catch (Exception e) {
            com.apm.insight.a.b((Throwable) e);
        }
    }

    public final void a(String str) {
        this.b = -1L;
        try {
            a(this.c, str);
        } catch (Exception e) {
            com.apm.insight.a.a((Throwable) e);
        }
    }

    public static i a() {
        i iVar;
        i iVar2 = a;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (i.class) {
            try {
                iVar = a;
                if (iVar == null) {
                    iVar = new i();
                    a = iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }
}
