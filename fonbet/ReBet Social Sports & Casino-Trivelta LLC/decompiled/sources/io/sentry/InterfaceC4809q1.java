package io.sentry;

import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: io.sentry.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4809q1 extends Closeable {
    static Date E0(String str, ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return AbstractC4779m.e(str);
            } catch (Exception e10) {
                iLogger.b(EnumC4788n3.ERROR, "Error when deserializing millis timestamp format.", e10);
                return null;
            }
        } catch (Exception unused) {
            return AbstractC4779m.f(str);
        }
    }

    Float B1();

    void C();

    Object H1();

    String M0();

    TimeZone P(ILogger iLogger);

    List P1(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0);

    Integer Q0();

    Long U0();

    String a1();

    Double e0();

    Map e1(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0);

    String f0();

    void g1(ILogger iLogger, Map map, String str);

    boolean hasNext();

    Date j0(ILogger iLogger);

    void m();

    void n();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    void p();

    Boolean p0();

    io.sentry.vendor.gson.stream.b peek();

    void q(boolean z10);

    void t();

    Object x0(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0);
}
