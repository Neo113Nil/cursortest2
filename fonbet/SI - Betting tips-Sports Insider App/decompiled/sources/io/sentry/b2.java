package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b2 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16207a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16208b;

    public b2(Reader reader) {
        this.f16208b = new io.sentry.vendor.gson.stream.a(reader);
    }

    public final Double C() {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Double.valueOf(aVar.N());
                }
                aVar.Y();
                return null;
            default:
                Object k0 = k0();
                if (k0 instanceof Number) {
                    return Double.valueOf(((Number) k0).doubleValue());
                }
                return null;
        }
    }

    public final float J() {
        switch (this.f16207a) {
            case 0:
                return (float) ((io.sentry.vendor.gson.stream.a) this.f16208b).N();
            default:
                Object k0 = k0();
                if (k0 instanceof Number) {
                    return ((Number) k0).floatValue();
                }
                throw new IOException("Expected float");
        }
    }

    public final Float K() {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Float.valueOf(J());
                }
                aVar.Y();
                return null;
            default:
                Object k0 = k0();
                if (k0 instanceof Number) {
                    return Float.valueOf(((Number) k0).floatValue());
                }
                return null;
        }
    }

    public final int N() {
        switch (this.f16207a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f16208b).O();
            default:
                Object k0 = k0();
                if (k0 instanceof Number) {
                    return ((Number) k0).intValue();
                }
                throw new IOException("Expected int");
        }
    }

    public final Integer O() {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Integer.valueOf(aVar.O());
                }
                aVar.Y();
                return null;
            default:
                Object k0 = k0();
                if (k0 instanceof Number) {
                    return Integer.valueOf(((Number) k0).intValue());
                }
                return null;
        }
    }

    public final ArrayList R(ILogger iLogger, s1 s1Var) {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.Y();
                    return null;
                }
                aVar.c();
                ArrayList arrayList = new ArrayList();
                if (aVar.z()) {
                    do {
                        try {
                            arrayList.add(s1Var.a(this, iLogger));
                        } catch (Exception e7) {
                            iLogger.e(b5.WARNING, "Failed to deserialize object in list.", e7);
                        }
                    } while (aVar.h0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                }
                aVar.t();
                return arrayList;
            default:
                if (l0() == io.sentry.vendor.gson.stream.b.NULL) {
                    if (k0() == null) {
                        return null;
                    }
                    throw new IOException("Expected null but was " + l0());
                }
                try {
                    c();
                    ArrayList arrayList2 = new ArrayList();
                    if (t()) {
                        do {
                            try {
                                arrayList2.add(s1Var.a(this, iLogger));
                            } catch (Exception e9) {
                                iLogger.e(b5.WARNING, "Failed to deserialize object in list.", e9);
                            }
                        } while (l0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                    }
                    n();
                    return arrayList2;
                } catch (Exception e10) {
                    throw new IOException(e10);
                }
        }
    }

    public final long U() {
        switch (this.f16207a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f16208b).R();
            default:
                Object k0 = k0();
                if (k0 instanceof Number) {
                    return ((Number) k0).longValue();
                }
                throw new IOException("Expected long");
        }
    }

    public final Long W() {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Long.valueOf(aVar.R());
                }
                aVar.Y();
                return null;
            default:
                Object k0 = k0();
                if (k0 instanceof Number) {
                    return Long.valueOf(((Number) k0).longValue());
                }
                return null;
        }
    }

    public final HashMap Y(ILogger iLogger, s1 s1Var) {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.Y();
                    return null;
                }
                aVar.k();
                HashMap hashMap = new HashMap();
                if (aVar.z()) {
                    while (true) {
                        try {
                            hashMap.put(aVar.U(), s1Var.a(this, iLogger));
                        } catch (Exception e7) {
                            iLogger.e(b5.WARNING, "Failed to deserialize object in map.", e7);
                        }
                        if (aVar.h0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || aVar.h0() == io.sentry.vendor.gson.stream.b.NAME) {
                        }
                    }
                }
                aVar.w();
                return hashMap;
            default:
                if (l0() == io.sentry.vendor.gson.stream.b.NULL) {
                    if (k0() == null) {
                        return null;
                    }
                    throw new IOException("Expected null but was " + l0());
                }
                try {
                    k();
                    HashMap hashMap2 = new HashMap();
                    if (t()) {
                        while (true) {
                            try {
                                hashMap2.put(c0(), s1Var.a(this, iLogger));
                            } catch (Exception e9) {
                                iLogger.e(b5.WARNING, "Failed to deserialize object in map.", e9);
                            }
                            if (l0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || l0() == io.sentry.vendor.gson.stream.b.NAME) {
                            }
                        }
                    }
                    r();
                    return hashMap2;
                } catch (Exception e10) {
                    throw new IOException(e10);
                }
        }
    }

    public final void c() {
        switch (this.f16207a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f16208b).c();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f16208b;
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
                return;
        }
    }

    public final String c0() {
        switch (this.f16207a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f16208b).U();
            default:
                Map.Entry entry = (Map.Entry) ((ArrayDeque) this.f16208b).peekLast();
                if (entry != null && entry.getKey() != null) {
                    return (String) entry.getKey();
                }
                throw new IOException("Expected a name but was " + l0());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f16207a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f16208b).close();
                break;
            default:
                ((ArrayDeque) this.f16208b).clear();
                break;
        }
    }

    public final Object d0() {
        switch (this.f16207a) {
            case 0:
                com.android.billingclient.api.m mVar = new com.android.billingclient.api.m();
                mVar.d(this);
                w1 a7 = mVar.a();
                if (a7 != null) {
                    return a7.getValue();
                }
                return null;
            default:
                return k0();
        }
    }

    public final Object f0(ILogger iLogger, s1 s1Var) {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return s1Var.a(this, iLogger);
                }
                aVar.Y();
                return null;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f16208b;
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return null;
                }
                Object value = entry.getValue();
                if (iLogger != null) {
                    return s1Var.a(this, iLogger);
                }
                arrayDeque.removeLast();
                return value;
        }
    }

    public final String h0() {
        switch (this.f16207a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f16208b).d0();
            default:
                String str = (String) k0();
                if (str != null) {
                    return str;
                }
                throw new IOException("Expected string");
        }
    }

    public final String i0() {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return aVar.d0();
                }
                aVar.Y();
                return null;
            default:
                return (String) k0();
        }
    }

    public final void j0(ILogger iLogger, AbstractMap abstractMap, String str) {
        switch (this.f16207a) {
            case 0:
                try {
                    abstractMap.put(str, d0());
                    break;
                } catch (Exception e7) {
                    iLogger.b(b5.ERROR, e7, "Error deserializing unknown key: %s", str);
                }
            default:
                try {
                    abstractMap.put(str, k0());
                    break;
                } catch (Exception e9) {
                    iLogger.b(b5.ERROR, e9, "Error deserializing unknown key: %s", str);
                    return;
                }
        }
    }

    public final void k() {
        switch (this.f16207a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f16208b).k();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f16208b;
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
                return;
        }
    }

    public Object k0() {
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f16208b;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e7) {
            throw new IOException(e7);
        }
    }

    public final io.sentry.vendor.gson.stream.b l0() {
        switch (this.f16207a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f16208b).h0();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f16208b;
                if (arrayDeque.isEmpty()) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                if (entry.getKey() != null) {
                    return io.sentry.vendor.gson.stream.b.NAME;
                }
                Object value = entry.getValue();
                return value instanceof Map ? io.sentry.vendor.gson.stream.b.BEGIN_OBJECT : value instanceof List ? io.sentry.vendor.gson.stream.b.BEGIN_ARRAY : value instanceof String ? io.sentry.vendor.gson.stream.b.STRING : value instanceof Number ? io.sentry.vendor.gson.stream.b.NUMBER : value instanceof Boolean ? io.sentry.vendor.gson.stream.b.BOOLEAN : value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
    }

    public final void n() {
        switch (this.f16207a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f16208b).t();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f16208b;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                    break;
                }
                break;
        }
    }

    public final void o0(boolean z5) {
        switch (this.f16207a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f16208b).f17204b = z5;
                break;
        }
    }

    public final void r() {
        switch (this.f16207a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f16208b).w();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f16208b;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                    break;
                }
                break;
        }
    }

    public final boolean t() {
        switch (this.f16207a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f16208b).z();
            default:
                return !((ArrayDeque) this.f16208b).isEmpty();
        }
    }

    public final Boolean w() {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Boolean.valueOf(aVar.K());
                }
                aVar.Y();
                return null;
            default:
                return (Boolean) k0();
        }
    }

    public final Date y(ILogger iLogger) {
        switch (this.f16207a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f16208b;
                if (aVar.h0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.Y();
                    break;
                } else {
                    String d02 = aVar.d0();
                    if (d02 != null) {
                        try {
                            try {
                                break;
                            } catch (Exception unused) {
                                return com.google.android.play.core.appupdate.b.q(d02);
                            }
                        } catch (Exception e7) {
                            iLogger.e(b5.ERROR, "Error when deserializing millis timestamp format.", e7);
                            return null;
                        }
                    }
                }
                break;
            default:
                String str = (String) k0();
                if (str != null) {
                    try {
                        try {
                            break;
                        } catch (Exception e9) {
                            iLogger.e(b5.ERROR, "Error when deserializing millis timestamp format.", e9);
                            return null;
                        }
                    } catch (Exception unused2) {
                        return com.google.android.play.core.appupdate.b.q(str);
                    }
                }
                break;
        }
        return null;
    }

    public final double z() {
        switch (this.f16207a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f16208b).N();
            default:
                Object k0 = k0();
                if (k0 instanceof Number) {
                    return ((Number) k0).doubleValue();
                }
                throw new IOException("Expected double");
        }
    }

    public b2(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f16208b = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private final void s0() {
    }

    private final void q0(boolean z5) {
    }
}
