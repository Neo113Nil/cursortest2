package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* compiled from: UIEnergize.java */
/* loaded from: classes14.dex */
public class b {
    private static volatile b a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (a != null) {
            return a;
        }
        synchronized (b.class) {
            try {
                if (a == null) {
                    a = new b();
                }
                bVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private void b(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar);
    }

    private void c(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar, map);
    }

    private void b(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar, map);
    }

    public void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int g = cVar.g();
        if (g == 1) {
            a(view, map);
            return;
        }
        if (g == 2) {
            c(view, cVar, map);
            return;
        }
        if (g == 3) {
            b(view, cVar);
        } else if (g == 4) {
            b(view, cVar, map);
        } else {
            if (g != 5) {
                return;
            }
            a(view, cVar);
        }
    }

    private void a(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar);
    }

    private void a(View view, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, map);
    }
}
