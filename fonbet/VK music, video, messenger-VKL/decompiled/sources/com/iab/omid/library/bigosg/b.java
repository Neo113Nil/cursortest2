package com.iab.omid.library.bigosg;

import android.content.Context;
import android.webkit.WebSettings;
import com.iab.omid.library.bigosg.internal.i;
import com.iab.omid.library.bigosg.internal.k;
import com.iab.omid.library.bigosg.utils.d;
import com.iab.omid.library.bigosg.utils.e;
import com.iab.omid.library.bigosg.utils.g;
import java.util.concurrent.Executors;

/* loaded from: classes13.dex */
public class b {
    private boolean a;

    public class a implements Runnable {
        final /* synthetic */ Context a;

        public a(b bVar, Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebSettings.getDefaultUserAgent(this.a);
            } catch (Throwable unused) {
                d.a("Ignoring failure while retrieving default WebView user agent");
            }
        }
    }

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.6.5-Bigosg";
    }

    public void c() {
        g.a();
        com.iab.omid.library.bigosg.internal.a.a().d();
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
        com.iab.omid.library.bigosg.internal.b.g().a(context);
        com.iab.omid.library.bigosg.utils.a.a(context);
        com.iab.omid.library.bigosg.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.bigosg.internal.g.b().a(context);
        com.iab.omid.library.bigosg.internal.a.a().a(context);
        k.b().a(context);
        c(context);
    }

    public boolean b() {
        return this.a;
    }

    public void a(boolean z) {
        this.a = z;
    }
}
