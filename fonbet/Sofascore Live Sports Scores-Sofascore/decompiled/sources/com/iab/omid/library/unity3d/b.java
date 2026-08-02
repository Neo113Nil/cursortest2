package com.iab.omid.library.unity3d;

import android.content.Context;
import com.iab.omid.library.unity3d.internal.f;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.utils.e;
import com.iab.omid.library.unity3d.utils.g;

/* loaded from: classes4.dex */
public class b {
    private boolean a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        h.c().a(context);
        com.iab.omid.library.unity3d.internal.b.g().a(context);
        com.iab.omid.library.unity3d.utils.a.a(context);
        com.iab.omid.library.unity3d.utils.c.a(context);
        e.a(context);
        f.b().a(context);
        com.iab.omid.library.unity3d.internal.a.a().a(context);
    }

    public void c() {
        g.a();
        com.iab.omid.library.unity3d.internal.a.a().d();
    }

    public boolean b() {
        return this.a;
    }

    public String a() {
        return "1.4.9-Unity3d";
    }

    public void a(boolean z) {
        this.a = z;
    }
}
