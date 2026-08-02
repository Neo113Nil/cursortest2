package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f37936a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37937b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37938c;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f37940e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f37939d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public boolean f37941f = false;

    public d0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f37936a = sharedPreferences;
        this.f37937b = str;
        this.f37938c = str2;
        this.f37940e = executor;
    }

    public static d0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        d0 d0Var = new d0(sharedPreferences, str, str2, executor);
        d0Var.e();
        return d0Var;
    }

    public boolean b(String str) {
        boolean c10;
        if (TextUtils.isEmpty(str) || str.contains(this.f37938c)) {
            return false;
        }
        synchronized (this.f37939d) {
            c10 = c(this.f37939d.add(str));
        }
        return c10;
    }

    public final boolean c(boolean z10) {
        if (z10 && !this.f37941f) {
            j();
        }
        return z10;
    }

    public final void e() {
        synchronized (this.f37939d) {
            try {
                this.f37939d.clear();
                String string = this.f37936a.getString(this.f37937b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f37938c)) {
                    String[] split = string.split(this.f37938c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f37939d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public String f() {
        String str;
        synchronized (this.f37939d) {
            str = (String) this.f37939d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean c10;
        synchronized (this.f37939d) {
            c10 = c(this.f37939d.remove(obj));
        }
        return c10;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f37939d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f37938c);
        }
        return sb2.toString();
    }

    public final void i() {
        synchronized (this.f37939d) {
            this.f37936a.edit().putString(this.f37937b, h()).commit();
        }
    }

    public final void j() {
        this.f37940e.execute(new Runnable() { // from class: com.google.firebase.messaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0.this.i();
            }
        });
    }
}
