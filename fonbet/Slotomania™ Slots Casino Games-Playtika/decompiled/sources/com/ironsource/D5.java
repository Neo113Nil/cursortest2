package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class D5 {
    private String a;
    private boolean b;
    private String c;
    private F7 d;
    private boolean e;
    private ArrayList<Pair<String, String>> f;

    public static class a {
        private String a;
        private F7 d;
        private boolean b = false;
        private String c = "POST";
        private boolean e = false;
        private ArrayList<Pair<String, String>> f = new ArrayList<>();

        public a(String str) {
            this.a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.a = str;
        }

        public a a(F7 f7) {
            this.d = f7;
            return this;
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }

        public a c() {
            this.c = "POST";
            return this;
        }

        public a a(Pair<String, String> pair) {
            this.f.add(pair);
            return this;
        }

        public a b() {
            this.c = "GET";
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

        public D5 a() {
            return new D5(this);
        }
    }

    D5(a aVar) {
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

    public F7 c() {
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
}
