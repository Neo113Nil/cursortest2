package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class B5 {
    private String a;
    private boolean b;
    private String c;
    private C7 d;
    private boolean e;
    private ArrayList<Pair<String, String>> f;

    public B5(a aVar) {
        this.e = false;
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (aVar.f != null) {
            this.f = new ArrayList<>(aVar.f);
        }
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public C7 c() {
        return this.d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f);
    }

    public String e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a {
        private String a;
        private C7 d;
        private boolean b = false;
        private String c = C4094gc.b;
        private boolean e = false;
        private ArrayList<Pair<String, String>> f = new ArrayList<>();

        public a(String str) {
            this.a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.a = str;
        }

        public a a(Pair<String, String> pair) {
            this.f.add(pair);
            return this;
        }

        public a b() {
            this.c = C4094gc.a;
            return this;
        }

        public a c() {
            this.c = C4094gc.b;
            return this;
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }

        public a a(C7 c7) {
            this.d = c7;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f.addAll(list);
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public B5 a() {
            return new B5(this);
        }
    }
}
