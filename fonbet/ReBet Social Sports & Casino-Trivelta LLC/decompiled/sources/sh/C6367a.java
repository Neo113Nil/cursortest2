package sh;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import ph.AbstractC6079j;
import rh.AbstractC6294l;
import rh.AbstractC6298p;
import rh.InterfaceC6290h;
import rh.InterfaceC6292j;
import rh.InterfaceC6297o;
import rh.InterfaceC6299q;
import th.AbstractC6466b;
import uh.InterfaceC6579c;
import wh.InterfaceC6756a;

/* renamed from: sh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6367a {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f64934a = Logger.getLogger(C6367a.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final List f64935b = Collections.unmodifiableList(Arrays.asList("traceparent", "tracestate"));

    /* renamed from: c, reason: collision with root package name */
    public static final int f64936c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f64937d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f64938e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f64939f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f64940g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f64941h;

    /* renamed from: i, reason: collision with root package name */
    public static final Set f64942i;

    /* renamed from: j, reason: collision with root package name */
    public static final C6367a f64943j;

    static {
        int c10 = AbstractC6298p.c();
        f64936c = c10;
        int c11 = AbstractC6294l.c();
        f64937d = c11;
        int length = InterfaceC6297o.getLength();
        f64938e = length;
        int i10 = c10 + 4;
        f64939f = i10;
        int i11 = i10 + c11 + 1;
        f64940g = i11;
        f64941h = i11 + length;
        f64943j = new C6367a();
        f64942i = new HashSet();
        for (int i12 = 0; i12 < 255; i12++) {
            String hexString = Long.toHexString(i12);
            if (hexString.length() < 2) {
                hexString = '0' + hexString;
            }
            f64942i.add(hexString);
        }
    }

    public static C6367a a() {
        return f64943j;
    }

    public void b(InterfaceC6579c interfaceC6579c, Object obj, InterfaceC6756a interfaceC6756a) {
        if (interfaceC6579c == null || interfaceC6756a == null) {
            return;
        }
        InterfaceC6292j a10 = InterfaceC6290h.f(interfaceC6579c).a();
        if (a10.isValid()) {
            int i10 = f64941h;
            char[] a11 = AbstractC6079j.a(i10);
            a11[0] = "00".charAt(0);
            a11[1] = "00".charAt(1);
            a11[2] = '-';
            String d10 = a10.d();
            d10.getChars(0, d10.length(), a11, 3);
            int i11 = f64939f;
            a11[i11 - 1] = '-';
            String c10 = a10.c();
            c10.getChars(0, c10.length(), a11, i11);
            int i12 = f64940g;
            a11[i12 - 1] = '-';
            String a12 = a10.g().a();
            a11[i12] = a12.charAt(0);
            a11[i12 + 1] = a12.charAt(1);
            interfaceC6756a.a(obj, "traceparent", new String(a11, 0, i10));
            InterfaceC6299q f10 = a10.f();
            if (f10.isEmpty()) {
                return;
            }
            interfaceC6756a.a(obj, "tracestate", AbstractC6466b.b(f10));
        }
    }

    public String toString() {
        return "W3CTraceContextPropagator";
    }
}
