package io.sentry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.sentry.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4842u3 {

    /* renamed from: a, reason: collision with root package name */
    public Set f52781a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public Set f52782b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public String f52783c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f52784d = null;

    public void a(String str) {
        this.f52781a.add(str);
        this.f52782b.remove(str);
    }

    public void b(String str) {
        this.f52782b.add(str);
        this.f52781a.remove(str);
    }

    public Set c() {
        return this.f52781a;
    }

    public String d() {
        return this.f52783c;
    }

    public Set e() {
        return this.f52782b;
    }

    public String f() {
        return this.f52784d;
    }

    public void g(boolean z10) {
        if (z10) {
            this.f52781a.add("android.widget.ImageView");
            this.f52782b.remove("android.widget.ImageView");
        } else {
            this.f52782b.add("android.widget.ImageView");
            this.f52781a.remove("android.widget.ImageView");
        }
    }

    public void h(boolean z10) {
        if (z10) {
            this.f52781a.add("android.widget.TextView");
            this.f52782b.remove("android.widget.TextView");
        } else {
            this.f52782b.add("android.widget.TextView");
            this.f52781a.remove("android.widget.TextView");
        }
    }

    public void i(String str) {
        this.f52781a.add(str);
        this.f52783c = str;
    }

    public void j(String str) {
        this.f52784d = str;
    }

    public abstract void k();
}
