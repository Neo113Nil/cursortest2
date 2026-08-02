package io.sentry.util;

import io.sentry.C7165l;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7174n0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class o implements InterfaceC7131c1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f68592a;

    public o(Map<String, Object> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f68592a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private <T> T c() throws IOException {
        try {
            ArrayDeque arrayDeque = this.f68592a;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            T t2 = (T) entry.getValue();
            arrayDeque.removeLast();
            return t2;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Float A0() throws IOException {
        Object c11 = c();
        if (c11 instanceof Number) {
            return Float.valueOf(((Number) c11).floatValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Integer A1() throws IOException {
        Object c11 = c();
        if (c11 instanceof Number) {
            return Integer.valueOf(((Number) c11).intValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Long D1() throws IOException {
        Object c11 = c();
        if (c11 instanceof Number) {
            return Long.valueOf(((Number) c11).longValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final HashMap G1(@NotNull ILogger iLogger, @NotNull InterfaceC7174n0 interfaceC7174n0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (c() == null) {
                return null;
            }
            throw new IOException("Expected null but was " + peek());
        }
        try {
            beginObject();
            HashMap hashMap = new HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        hashMap.put(nextName(), interfaceC7174n0.a(this, iLogger));
                    } catch (Exception e11) {
                        iLogger.a(I2.WARNING, "Failed to deserialize object in map.", e11);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return hashMap;
        } catch (Exception e12) {
            throw new IOException(e12);
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final ArrayList J0(@NotNull ILogger iLogger, @NotNull InterfaceC7174n0 interfaceC7174n0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (c() == null) {
                return null;
            }
            throw new IOException("Expected null but was " + peek());
        }
        try {
            beginArray();
            ArrayList arrayList = new ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(interfaceC7174n0.a(this, iLogger));
                    } catch (Exception e11) {
                        iLogger.a(I2.WARNING, "Failed to deserialize object in list.", e11);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
            }
            endArray();
            return arrayList;
        } catch (Exception e12) {
            throw new IOException(e12);
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Date M(@NotNull ILogger iLogger) throws IOException {
        String str = (String) c();
        if (str == null) {
            return null;
        }
        try {
            try {
                return C7165l.d(str);
            } catch (Exception unused) {
                return C7165l.e(str);
            }
        } catch (Exception e11) {
            iLogger.a(I2.ERROR, "Error when deserializing millis timestamp format.", e11);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Boolean P() throws IOException {
        return (Boolean) c();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void Q0(@NotNull ILogger iLogger, AbstractMap abstractMap, String str) {
        try {
            abstractMap.put(str, c());
        } catch (Exception e11) {
            iLogger.b(I2.ERROR, e11, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final <T> T S(@NotNull ILogger iLogger, @NotNull InterfaceC7174n0<T> interfaceC7174n0) throws Exception {
        ArrayDeque arrayDeque = this.f68592a;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return null;
        }
        T t2 = (T) entry.getValue();
        if (iLogger != null) {
            return interfaceC7174n0.a(this, iLogger);
        }
        arrayDeque.removeLast();
        return t2;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Object U1() throws IOException {
        return c();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final TimeZone X0(@NotNull ILogger iLogger) throws IOException {
        String str = (String) c();
        if (str != null) {
            return TimeZone.getTimeZone(str);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void beginArray() throws IOException {
        ArrayDeque arrayDeque = this.f68592a;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void beginObject() throws IOException {
        ArrayDeque arrayDeque = this.f68592a;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((Map.Entry) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f68592a.clear();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void endArray() throws IOException {
        ArrayDeque arrayDeque = this.f68592a;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void endObject() throws IOException {
        ArrayDeque arrayDeque = this.f68592a;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Double g1() throws IOException {
        Object c11 = c();
        if (c11 instanceof Number) {
            return Double.valueOf(((Number) c11).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final boolean hasNext() throws IOException {
        return !this.f68592a.isEmpty();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final float j0() throws IOException {
        Object c11 = c();
        if (c11 instanceof Number) {
            return ((Number) c11).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.InterfaceC7131c1
    public final String k0() throws IOException {
        return (String) c();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final double nextDouble() throws IOException {
        Object c11 = c();
        if (c11 instanceof Number) {
            return ((Number) c11).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.InterfaceC7131c1
    public final int nextInt() throws IOException {
        Object c11 = c();
        if (c11 instanceof Number) {
            return ((Number) c11).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.InterfaceC7131c1
    public final long nextLong() throws IOException {
        Object c11 = c();
        if (c11 instanceof Number) {
            return ((Number) c11).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.InterfaceC7131c1
    @NotNull
    public final String nextName() throws IOException {
        Map.Entry entry = (Map.Entry) this.f68592a.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.InterfaceC7131c1
    public final String nextString() throws IOException {
        String str = (String) c();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.InterfaceC7131c1
    @NotNull
    public final io.sentry.vendor.gson.stream.b peek() throws IOException {
        Map.Entry entry;
        ArrayDeque arrayDeque = this.f68592a;
        if (!arrayDeque.isEmpty() && (entry = (Map.Entry) arrayDeque.peekLast()) != null) {
            if (entry.getKey() != null) {
                return io.sentry.vendor.gson.stream.b.NAME;
            }
            Object value = entry.getValue();
            return value instanceof Map ? io.sentry.vendor.gson.stream.b.BEGIN_OBJECT : value instanceof List ? io.sentry.vendor.gson.stream.b.BEGIN_ARRAY : value instanceof String ? io.sentry.vendor.gson.stream.b.STRING : value instanceof Number ? io.sentry.vendor.gson.stream.b.NUMBER : value instanceof Boolean ? io.sentry.vendor.gson.stream.b.BOOLEAN : value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void setLenient(boolean z11) {
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void skipValue() throws IOException {
    }
}
