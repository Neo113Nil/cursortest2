package org.jsoup.parser;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.jsoup.parser.C;

/* loaded from: classes10.dex */
public final class l implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final C8818g f79564a;

    /* renamed from: b, reason: collision with root package name */
    private C8821j f79565b;

    /* renamed from: c, reason: collision with root package name */
    private k f79566c;

    /* renamed from: d, reason: collision with root package name */
    private B f79567d;

    public l(C8818g c8818g) {
        new ReentrantLock();
        this.f79564a = c8818g;
        this.f79566c = k.f79560c;
        this.f79565b = new C8821j(0);
    }

    public static Pf.f d(String str) {
        C8818g c8818g = new C8818g();
        c8818g.c(new StringReader(str), new l(c8818g));
        while (true) {
            if (c8818g.f79470g.f79414a == C.i.EOF) {
                ArrayList<Pf.h> arrayList = c8818g.f79468e;
                if (arrayList == null) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c8818g.i(c8818g.f79467d, false);
                    c8818g.f79468e = null;
                } else {
                    c8818g.d();
                }
            } else {
                C r11 = c8818g.f79466c.r();
                c8818g.f79470g = r11;
                c8818g.e(r11);
                r11.f();
            }
        }
        C8817f c8817f = c8818g.f79465b;
        if (c8817f != null) {
            c8817f.close();
            c8818g.f79465b = null;
            c8818g.f79466c = null;
            c8818g.f79468e = null;
        }
        return c8818g.f79467d;
    }

    public final void a() {
        this.f79564a.getClass();
    }

    public final C8821j b() {
        return this.f79565b;
    }

    public final boolean c() {
        this.f79565b.getClass();
        return false;
    }

    public final Object clone() throws CloneNotSupportedException {
        return new l(this);
    }

    public final k e() {
        return this.f79566c;
    }

    public final B f() {
        if (this.f79567d == null) {
            this.f79564a.getClass();
            this.f79567d = new B(B.f79411c);
        }
        return this.f79567d;
    }

    private l(l lVar) {
        new ReentrantLock();
        lVar.f79564a.getClass();
        this.f79564a = new C8818g();
        lVar.f79565b.getClass();
        this.f79565b = new C8821j(0);
        this.f79566c = new k(lVar.f79566c);
    }
}
