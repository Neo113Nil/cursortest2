package com.iab.omid.library.smartadserver1;

import android.content.Context;
import android.webkit.WebSettings;
import com.iab.omid.library.smartadserver1.internal.i;
import com.iab.omid.library.smartadserver1.internal.k;
import com.iab.omid.library.smartadserver1.utils.e;
import com.iab.omid.library.smartadserver1.utils.g;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class b {
    private boolean a;

    public class a implements Runnable {
        final /* synthetic */ Context a;

        public a(b bVar, Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebSettings.getDefaultUserAgent(this.a);
        }
    }

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    private void c(Context context) {
        Executors.newSingleThreadExecutor().execute(new a(this, context));
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.smartadserver1.internal.b.g().a(context);
        com.iab.omid.library.smartadserver1.utils.a.a(context);
        com.iab.omid.library.smartadserver1.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.smartadserver1.internal.g.b().a(context);
        com.iab.omid.library.smartadserver1.internal.a.a().a(context);
        k.b().a(context);
        c(context);
    }

    public boolean b() {
        return this.a;
    }

    public void c() {
        g.a();
        com.iab.omid.library.smartadserver1.internal.a.a().d();
    }

    public String a() {
        return "1.6.1-Smartadserver1";
    }

    public void a(boolean z) {
        this.a = z;
    }
}
