package com.ironsource;

import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.dez0;
import xsna.pzl;

/* loaded from: classes13.dex */
public class J5 {
    private static final String e = "EventsTracker";
    private InterfaceC4455n7 a;
    private D5 b;
    private G7 c;
    private ExecutorService d;

    public class a implements Runnable {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Pd pd = new Pd();
                ArrayList<Pair<String, String>> d = J5.this.b.d();
                if ("POST".equals(J5.this.b.e())) {
                    pd = C4259c8.b(J5.this.b.b(), this.a, d);
                } else if ("GET".equals(J5.this.b.e())) {
                    pd = C4259c8.a(J5.this.b.b(), this.a, d);
                }
                J5.this.a("response status code: " + pd.a);
            } catch (Exception e) {
                C4452n4.d().a(e);
            }
        }
    }

    public J5(D5 d5, InterfaceC4455n7 interfaceC4455n7) {
        if (d5 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (d5.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = d5;
        this.a = interfaceC4455n7;
        this.c = d5.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        Locale locale = Locale.ENGLISH;
        a(pzl.b(str, " ", map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap a2 = dez0.a("eventname", str);
            a(a2, this.a.a());
            a(a2, map);
            b(this.c.a(a2));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e2) {
            C4452n4.d().a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.b.f();
    }
}
