package com.mbridge.msdk.foundation.same.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.tools.v0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    private static b a;

    public b(Context context) {
    }

    public static b a(Context context) {
        b bVar = a;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(context);
        a = bVar2;
        return bVar2;
    }

    public Bitmap b(String str) {
        if (v0.k(str)) {
            return null;
        }
        return d.a().c(str);
    }

    public boolean c(String str) {
        if (v0.k(str)) {
            return false;
        }
        return d.a().d(str);
    }

    public void a(String str) {
    }

    public void a() {
    }

    public void a(String str, c cVar) {
        d.a().b(str, null, cVar);
    }

    public void b() {
    }
}
