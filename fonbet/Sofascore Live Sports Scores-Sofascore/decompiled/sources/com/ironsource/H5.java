package com.ironsource;

import android.util.Pair;
import defpackage.wv8;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class H5 {
    private static final String e = "EventsTracker";
    private InterfaceC4142j7 a;
    private B5 b;
    private C7 c;
    private ExecutorService d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Od od = new Od();
                ArrayList<Pair<String, String>> d = H5.this.b.d();
                if (C4094gc.b.equals(H5.this.b.e())) {
                    od = Z7.b(H5.this.b.b(), this.a, d);
                } else if (C4094gc.a.equals(H5.this.b.e())) {
                    od = Z7.a(H5.this.b.b(), this.a, d);
                }
                H5.this.a("response status code: " + od.a);
            } catch (Exception e) {
                C4157k4.d().a(e);
            }
        }
    }

    public H5(B5 b5, InterfaceC4142j7 interfaceC4142j7) {
        if (b5 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (b5.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = b5;
        this.a = interfaceC4142j7;
        this.c = b5.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        Locale locale = Locale.ENGLISH;
        a(wv8.i(str, " ", map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap l = com.appsflyer.internal.i.l("eventname", str);
            a(l, this.a.a());
            a(l, map);
            b(this.c.a(l));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.b.f();
    }
}
