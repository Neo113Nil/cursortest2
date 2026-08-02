package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.internal.j;
import com.iab.omid.library.ironsrc.utils.e;
import com.iab.omid.library.ironsrc.utils.g;

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
        i.c().a(context);
        com.iab.omid.library.ironsrc.internal.b.g().a(context);
        com.iab.omid.library.ironsrc.utils.a.a(context);
        com.iab.omid.library.ironsrc.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.ironsrc.internal.g.b().a(context);
        com.iab.omid.library.ironsrc.internal.a.a().a(context);
        j.b().a(context);
    }

    public void c() {
        g.a();
        com.iab.omid.library.ironsrc.internal.a.a().d();
    }

    public boolean b() {
        return this.a;
    }

    public String a() {
        return "1.5.7-Ironsrc";
    }

    public void a(boolean z) {
        this.a = z;
    }
}
