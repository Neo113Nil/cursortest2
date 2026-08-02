package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e {
    private static volatile e c;
    private final b a;
    private final ArrayList<a> b = new ArrayList<>();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public File a;
        public c b;

        public a(c cVar, File file) {
            this.b = cVar;
            this.a = file;
        }
    }

    private e(b bVar) {
        this.a = bVar;
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String str;
        com.mbridge.msdk.foundation.same.directory.a c2 = aVar.c();
        if (c2 == null) {
            str = aVar.b();
        } else {
            File a2 = a(c2.d());
            if (a2 == null) {
                return false;
            }
            str = a2.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> a3 = aVar.a();
        if (a3 != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = a3.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            try {
                if (c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    t0.a(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                eVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static String b(c cVar) {
        File a2 = a(cVar);
        if (a2 != null) {
            return a2.getAbsolutePath();
        }
        return null;
    }

    public static synchronized void a(b bVar) {
        synchronized (e.class) {
            if (c == null) {
                c = new e(bVar);
            }
        }
    }

    public boolean a() {
        return a(this.a.a());
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().b == null || b().b.isEmpty()) {
                return null;
            }
            Iterator<a> it = b().b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b.equals(cVar)) {
                    return next.a;
                }
            }
            return null;
        } catch (Throwable th) {
            q0.b("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }
}
