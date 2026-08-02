package org.chromium.base;

import android.text.TextUtils;
import internal.J.N;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    private static final c f78536d = new c();

    /* renamed from: a, reason: collision with root package name */
    private HashMap f78537a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<String> f78538b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f78539c;

    private void a(String[] strArr) {
        int i11 = 1;
        boolean z11 = true;
        for (String str : strArr) {
            if (i11 > 0) {
                i11--;
            } else {
                if (str.equals("--")) {
                    z11 = false;
                }
                if (z11 && str.startsWith("--")) {
                    String[] split = str.split("=", 2);
                    String str2 = split.length > 1 ? split[1] : null;
                    String substring = split[0].substring(2);
                    synchronized (this) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        try {
                            HashMap hashMap = this.f78537a;
                            if (hashMap == null) {
                                new d();
                                N.MUoYiNbY(substring, str2);
                            } else {
                                hashMap.put(substring, str2);
                                String str3 = "--" + substring;
                                if (!str2.isEmpty()) {
                                    str3 = str3 + "=" + str2;
                                }
                                ArrayList<String> arrayList = this.f78538b;
                                int i12 = this.f78539c;
                                this.f78539c = i12 + 1;
                                arrayList.add(i12, str3);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    this.f78538b.add(str);
                }
            }
        }
    }

    public static c b() {
        return f78536d;
    }

    public static void e(String[] strArr) {
        String str;
        c cVar = f78536d;
        synchronized (cVar) {
            try {
                cVar.f78538b = new ArrayList<>();
                cVar.f78537a = new HashMap();
                cVar.f78539c = 1;
                if (strArr.length != 0 && (str = strArr[0]) != null) {
                    cVar.f78538b.add(str);
                    cVar.a(strArr);
                }
                cVar.f78538b.add("");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean f() {
        return f78536d.f78539c != 0;
    }

    public final String c(String str) {
        String str2;
        HashMap hashMap = this.f78537a;
        if (hashMap == null) {
            new d();
            str2 = (String) N.MZJ2lrZY(str);
        } else {
            synchronized (this) {
                str2 = (String) hashMap.get(str);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    public final boolean d() {
        boolean containsKey;
        HashMap hashMap = this.f78537a;
        if (hashMap == null) {
            new d();
            return N.MsCvypjU("enable-idle-tracing");
        }
        synchronized (this) {
            containsKey = hashMap.containsKey("enable-idle-tracing");
        }
        return containsKey;
    }

    public final synchronized void g() {
        if (f78536d.f78538b == null) {
            return;
        }
        new d();
        N.MDkrKi31(this.f78538b);
        this.f78538b = null;
        this.f78537a = null;
        j.d(new Object[0]);
    }
}
