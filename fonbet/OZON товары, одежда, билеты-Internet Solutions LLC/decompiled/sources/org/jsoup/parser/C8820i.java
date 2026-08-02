package org.jsoup.parser;

/* renamed from: org.jsoup.parser.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8820i {

    /* renamed from: a, reason: collision with root package name */
    private final String f79558a;

    /* renamed from: b, reason: collision with root package name */
    private final String f79559b;

    C8820i(C8817f c8817f, String str) {
        c8817f.getClass();
        this.f79558a = c8817f.E0();
        this.f79559b = str;
    }

    public final String toString() {
        return "<" + this.f79558a + ">: " + this.f79559b;
    }

    C8820i(C8817f c8817f, String str, Object... objArr) {
        c8817f.getClass();
        this.f79558a = c8817f.E0();
        this.f79559b = String.format(str, objArr);
    }
}
