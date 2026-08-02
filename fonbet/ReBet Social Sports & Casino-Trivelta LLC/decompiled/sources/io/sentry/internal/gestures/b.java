package io.sentry.internal.gestures;

import io.sentry.util.w;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f52113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52115c;

    /* renamed from: d, reason: collision with root package name */
    public final String f52116d;

    /* renamed from: e, reason: collision with root package name */
    public final String f52117e;

    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(Object obj, String str, String str2, String str3, String str4) {
        this.f52113a = new WeakReference(obj);
        this.f52114b = str;
        this.f52115c = str2;
        this.f52116d = str3;
        this.f52117e = str4;
    }

    public String a() {
        return this.f52114b;
    }

    public String b() {
        String str = this.f52115c;
        return str != null ? str : (String) w.c(this.f52116d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f52117e;
    }

    public String d() {
        return this.f52115c;
    }

    public String e() {
        return this.f52116d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (w.a(this.f52114b, bVar.f52114b) && w.a(this.f52115c, bVar.f52115c) && w.a(this.f52116d, bVar.f52116d)) {
                return true;
            }
        }
        return false;
    }

    public Object f() {
        return this.f52113a.get();
    }

    public int hashCode() {
        return w.b(this.f52113a, this.f52115c, this.f52116d);
    }
}
