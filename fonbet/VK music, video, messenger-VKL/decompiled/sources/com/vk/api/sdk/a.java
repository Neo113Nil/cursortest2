package com.vk.api.sdk;

import com.vk.api.sdk.VKApiConfig;
import java.util.LinkedHashMap;
import xsna.drm0;
import xsna.epx;
import xsna.xe9;

/* compiled from: VKMethodCall.kt */
/* loaded from: classes.dex */
public class a {
    public final String a;
    public final VKApiConfig.EndpointPathName b;
    public final String c;
    public final String d;
    public final String e;
    public final LinkedHashMap f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int[] l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    /* compiled from: VKMethodCall.kt */
    /* renamed from: com.vk.api.sdk.a$a, reason: collision with other inner class name */
    public static class C0374a {
        public String a;
        public String e;
        public boolean h;
        public boolean i;
        public int[] j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public VKApiConfig.EndpointPathName b = VKApiConfig.EndpointPathName.METHOD;
        public String c = "";
        public String d = "";
        public final LinkedHashMap f = new LinkedHashMap();
        public int g = 4;

        public C0374a a(boolean z) {
            this.k = z;
            return this;
        }

        public C0374a b(String str, String str2) {
            this.f.put(str, str2);
            return this;
        }

        public a c() {
            return new a(this);
        }

        public C0374a d(String str) {
            this.c = str;
            return this;
        }
    }

    public a(C0374a c0374a) {
        if (drm0.N(c0374a.c)) {
            throw new IllegalArgumentException("method is null or empty");
        }
        if (drm0.N(c0374a.d)) {
            throw new IllegalArgumentException("version is null or empty");
        }
        this.a = c0374a.a;
        this.b = c0374a.b;
        this.c = c0374a.c;
        this.d = c0374a.d;
        this.e = c0374a.e;
        this.f = c0374a.f;
        this.g = c0374a.g;
        this.h = c0374a.h;
        this.i = c0374a.i;
        this.l = c0374a.j;
        this.j = c0374a.k;
        this.k = c0374a.l;
        this.m = c0374a.m;
        this.n = c0374a.n;
        this.o = c0374a.o;
        this.p = c0374a.p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.c, aVar.c) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.e;
        return this.f.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder a = xe9.a("VKMethodCall(method='", this.c, "', cacheControl='", this.e, "', args=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
