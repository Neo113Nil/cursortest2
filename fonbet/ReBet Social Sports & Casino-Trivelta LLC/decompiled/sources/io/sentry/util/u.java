package io.sentry.util;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4859w0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class u implements InterfaceC4809q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Deque f52810a;

    public u(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f52810a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    public final void B(int i10) {
        while (!this.f52810a.isEmpty() && this.f52810a.size() >= i10) {
            this.f52810a.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public Float B1() {
        Object k10 = k();
        if (k10 instanceof Number) {
            return Float.valueOf(((Number) k10).floatValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC4809q1
    public void C() {
        if (this.f52810a.isEmpty()) {
            return;
        }
        this.f52810a.removeLast();
    }

    @Override // io.sentry.InterfaceC4809q1
    public Object H1() {
        return k();
    }

    @Override // io.sentry.InterfaceC4809q1
    public String M0() {
        String str = (String) k();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.InterfaceC4809q1
    public TimeZone P(ILogger iLogger) {
        String a12 = a1();
        if (a12 != null) {
            return TimeZone.getTimeZone(a12);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC4809q1
    public List P1(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0) {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            d();
            return null;
        }
        try {
            p();
            ArrayList arrayList = new ArrayList();
            while (peek() != io.sentry.vendor.gson.stream.b.END_ARRAY) {
                int size = this.f52810a.size();
                try {
                    arrayList.add(interfaceC4859w0.a(this, iLogger));
                } catch (Exception e10) {
                    iLogger.b(EnumC4788n3.WARNING, "Failed to deserialize object in list.", e10);
                    B(size);
                }
            }
            n();
            return arrayList;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public Integer Q0() {
        Object k10 = k();
        if (k10 instanceof Number) {
            return Integer.valueOf(((Number) k10).intValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC4809q1
    public Long U0() {
        Object k10 = k();
        if (k10 instanceof Number) {
            return Long.valueOf(((Number) k10).longValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC4809q1
    public String a1() {
        return (String) k();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52810a.clear();
    }

    public void d() {
        if (k() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // io.sentry.InterfaceC4809q1
    public Double e0() {
        Object k10 = k();
        if (k10 instanceof Number) {
            return Double.valueOf(((Number) k10).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC4809q1
    public Map e1(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0) {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            d();
            return null;
        }
        try {
            m();
            HashMap hashMap = new HashMap();
            if (peek() == io.sentry.vendor.gson.stream.b.NAME) {
                while (true) {
                    String f02 = f0();
                    int size = this.f52810a.size();
                    try {
                        hashMap.put(f02, interfaceC4859w0.a(this, iLogger));
                    } catch (Exception e10) {
                        iLogger.b(EnumC4788n3.WARNING, "Failed to deserialize object in map.", e10);
                        B(size);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            t();
            return hashMap;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public String f0() {
        Map.Entry entry = (Map.Entry) this.f52810a.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.InterfaceC4809q1
    public void g1(ILogger iLogger, Map map, String str) {
        int size = this.f52810a.size();
        try {
            map.put(str, H1());
        } catch (Exception e10) {
            iLogger.a(EnumC4788n3.ERROR, e10, "Error deserializing unknown key: %s", str);
            B(size);
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public boolean hasNext() {
        return !this.f52810a.isEmpty();
    }

    @Override // io.sentry.InterfaceC4809q1
    public Date j0(ILogger iLogger) {
        return InterfaceC4809q1.E0(a1(), iLogger);
    }

    public final Object k() {
        try {
            return r(null, null);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public void m() {
        Map.Entry entry = (Map.Entry) this.f52810a.peekLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.f52810a.removeLast();
        this.f52810a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.f52810a.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public void n() {
        if (this.f52810a.size() > 1) {
            this.f52810a.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public double nextDouble() {
        Object k10 = k();
        if (k10 instanceof Number) {
            return ((Number) k10).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.InterfaceC4809q1
    public float nextFloat() {
        Object k10 = k();
        if (k10 instanceof Number) {
            return ((Number) k10).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.InterfaceC4809q1
    public int nextInt() {
        Object k10 = k();
        if (k10 instanceof Number) {
            return ((Number) k10).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.InterfaceC4809q1
    public long nextLong() {
        Object k10 = k();
        if (k10 instanceof Number) {
            return ((Number) k10).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.InterfaceC4809q1
    public void p() {
        Map.Entry entry = (Map.Entry) this.f52810a.peekLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.f52810a.removeLast();
        this.f52810a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f52810a.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public Boolean p0() {
        return (Boolean) k();
    }

    @Override // io.sentry.InterfaceC4809q1
    public io.sentry.vendor.gson.stream.b peek() {
        if (this.f52810a.isEmpty()) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        Map.Entry entry = (Map.Entry) this.f52810a.peekLast();
        if (entry == null) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        if (entry.getKey() != null) {
            return io.sentry.vendor.gson.stream.b.NAME;
        }
        Object value = entry.getValue();
        return value instanceof Map ? io.sentry.vendor.gson.stream.b.BEGIN_OBJECT : value instanceof List ? io.sentry.vendor.gson.stream.b.BEGIN_ARRAY : value instanceof String ? io.sentry.vendor.gson.stream.b.STRING : value instanceof Number ? io.sentry.vendor.gson.stream.b.NUMBER : value instanceof Boolean ? io.sentry.vendor.gson.stream.b.BOOLEAN : value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.InterfaceC4809q1
    public void q(boolean z10) {
    }

    public final Object r(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0) {
        Map.Entry entry = (Map.Entry) this.f52810a.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (interfaceC4859w0 != null && iLogger != null) {
            return interfaceC4859w0.a(this, iLogger);
        }
        this.f52810a.removeLast();
        return value;
    }

    @Override // io.sentry.InterfaceC4809q1
    public void t() {
        if (this.f52810a.size() > 1) {
            this.f52810a.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public Object x0(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0) {
        return r(iLogger, interfaceC4859w0);
    }
}
