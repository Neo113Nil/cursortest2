package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class J5 {
    private static final String e = "EventsTracker";
    private InterfaceC2541m7 a;
    private D5 b;
    private F7 c;
    private ExecutorService d;

    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Pd pd = new Pd();
                ArrayList<Pair<String, String>> d = J5.this.b.d();
                if ("POST".equals(J5.this.b.e())) {
                    pd = C2345b8.b(J5.this.b.b(), this.a, d);
                } else if ("GET".equals(J5.this.b.e())) {
                    pd = C2345b8.a(J5.this.b.b(), this.a, d);
                }
                J5.this.a("response status code: " + pd.a);
            } catch (Exception e) {
                C2556n4.d().a(e);
            }
        }
    }

    public J5(D5 d5, InterfaceC2541m7 interfaceC2541m7) {
        if (d5 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (d5.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = d5;
        this.a = interfaceC2541m7;
        this.c = d5.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.W, str);
            a(hashMap, this.a.a());
            a(hashMap, map);
            b(this.c.a(hashMap));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e2) {
            C2556n4.d().a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b.f()) {
            Log.d(e, str);
        }
    }
}
