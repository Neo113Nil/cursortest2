package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* renamed from: io.sentry.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4761i1 implements InterfaceC4770k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4761i1 f52101a = new C4761i1();

    public static C4761i1 g() {
        return f52101a;
    }

    @Override // io.sentry.InterfaceC4770k0
    public void a(Object obj, Writer writer) {
    }

    @Override // io.sentry.InterfaceC4770k0
    public void b(C4866x2 c4866x2, OutputStream outputStream) {
    }

    @Override // io.sentry.InterfaceC4770k0
    public Object c(Reader reader, Class cls) {
        return null;
    }

    @Override // io.sentry.InterfaceC4770k0
    public C4866x2 d(InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.InterfaceC4770k0
    public Object e(Reader reader, Class cls, InterfaceC4859w0 interfaceC4859w0) {
        return null;
    }

    @Override // io.sentry.InterfaceC4770k0
    public String f(Map map) {
        return "";
    }
}
