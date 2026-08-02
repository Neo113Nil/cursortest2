package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class E1 {
    private String c;
    private String d;
    private int f;
    private HashSet<String> b = new HashSet<>();
    private boolean a = false;
    private boolean e = false;
    private boolean g = true;

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public HashSet<String> b() {
        return this.b;
    }

    public void c(String str) {
        this.c = str;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.a;
    }

    public boolean g() {
        return this.g;
    }

    public void b(String str) {
        this.d = str;
    }

    public String c() {
        return this.d;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(boolean z) {
        this.e = z;
    }

    public void a(boolean z) {
        this.a = z;
    }

    public int a() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }
}
