package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.listener.e;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private static volatile a b;
    public com.mbridge.msdk.video.dynview.inter.a a;

    private a() {
    }

    private void b(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().b(cVar, view, map, eVar);
    }

    private void c(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().c(cVar, view, map, eVar);
    }

    public void a(View view, c cVar, Map map, e eVar) {
        int g = cVar.g();
        if (g == 1) {
            a(cVar, view, map, eVar);
            return;
        }
        if (g == 2) {
            b(cVar, view, map, eVar);
            return;
        }
        if (g == 4) {
            a(cVar, view, eVar);
        } else if (g != 5) {
            eVar.a(view, new ArrayList());
        } else {
            c(cVar, view, map, eVar);
        }
    }

    public void d() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void b() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void c() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static a a() {
        a aVar;
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a();
                    }
                    aVar = b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
        return b;
    }

    private void a(c cVar, View view, Map map, e eVar) {
        com.mbridge.msdk.video.dynview.wrapper.a aVar = new com.mbridge.msdk.video.dynview.wrapper.a();
        aVar.a(cVar, view, map, eVar);
        this.a = aVar.l;
    }

    private void a(c cVar, View view, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().a(cVar, view, eVar);
    }
}
