package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Hd {
    private final ArrayList<String> a = new ArrayList<>();
    private final ArrayList<String> b = new ArrayList<>();
    private final ArrayList<String> c = new ArrayList<>();
    private final ArrayList<String> d = new ArrayList<>();

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.add(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.add(str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.add(str);
    }

    public ArrayList<String> a() {
        return this.c;
    }

    public ArrayList<String> b() {
        return this.b;
    }

    public ArrayList<String> c() {
        return this.d;
    }

    public ArrayList<String> d() {
        return this.a;
    }
}
