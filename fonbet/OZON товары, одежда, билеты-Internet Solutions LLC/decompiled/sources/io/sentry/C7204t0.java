package io.sentry;

import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7204t0 implements InterfaceC7131c1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.vendor.gson.stream.a f68497a;

    public C7204t0(Reader reader) {
        this.f68497a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Float A0() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(j0());
        }
        aVar.q();
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Integer A1() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(aVar.nextInt());
        }
        aVar.q();
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Long D1() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(aVar.nextLong());
        }
        aVar.q();
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final HashMap G1(@NotNull ILogger iLogger, @NotNull InterfaceC7174n0 interfaceC7174n0) throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            aVar.q();
            return null;
        }
        aVar.beginObject();
        HashMap hashMap = new HashMap();
        if (aVar.hasNext()) {
            while (true) {
                try {
                    hashMap.put(aVar.nextName(), interfaceC7174n0.a(this, iLogger));
                } catch (Exception e11) {
                    iLogger.a(I2.WARNING, "Failed to deserialize object in map.", e11);
                }
                if (aVar.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && aVar.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    break;
                }
            }
        }
        aVar.endObject();
        return hashMap;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final ArrayList J0(@NotNull ILogger iLogger, @NotNull InterfaceC7174n0 interfaceC7174n0) throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            aVar.q();
            return null;
        }
        aVar.beginArray();
        ArrayList arrayList = new ArrayList();
        if (aVar.hasNext()) {
            do {
                try {
                    arrayList.add(interfaceC7174n0.a(this, iLogger));
                } catch (Exception e11) {
                    iLogger.a(I2.WARNING, "Failed to deserialize object in list.", e11);
                }
            } while (aVar.peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
        }
        aVar.endArray();
        return arrayList;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Date M(ILogger iLogger) throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            aVar.q();
            return null;
        }
        String nextString = aVar.nextString();
        if (nextString == null) {
            return null;
        }
        try {
            try {
                return C7165l.d(nextString);
            } catch (Exception e11) {
                iLogger.a(I2.ERROR, "Error when deserializing millis timestamp format.", e11);
                return null;
            }
        } catch (Exception unused) {
            return C7165l.e(nextString);
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Boolean P() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(aVar.o());
        }
        aVar.q();
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void Q0(ILogger iLogger, AbstractMap abstractMap, String str) {
        try {
            abstractMap.put(str, U1());
        } catch (Exception e11) {
            iLogger.b(I2.ERROR, e11, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final <T> T S(@NotNull ILogger iLogger, @NotNull InterfaceC7174n0<T> interfaceC7174n0) throws Exception {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return interfaceC7174n0.a(this, iLogger);
        }
        aVar.q();
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Object U1() throws IOException {
        return new C7200s0().a(this);
    }

    @Override // io.sentry.InterfaceC7131c1
    public final TimeZone X0(ILogger iLogger) throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            aVar.q();
            return null;
        }
        try {
            return TimeZone.getTimeZone(aVar.nextString());
        } catch (Exception e11) {
            iLogger.a(I2.ERROR, "Error when deserializing TimeZone", e11);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void beginArray() throws IOException {
        this.f68497a.beginArray();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void beginObject() throws IOException {
        this.f68497a.beginObject();
    }

    public final boolean c() throws IOException {
        return this.f68497a.o();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f68497a.close();
    }

    public final void d() throws IOException {
        this.f68497a.q();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void endArray() throws IOException {
        this.f68497a.endArray();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void endObject() throws IOException {
        this.f68497a.endObject();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final Double g1() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(aVar.nextDouble());
        }
        aVar.q();
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final boolean hasNext() throws IOException {
        return this.f68497a.hasNext();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final float j0() throws IOException {
        return (float) this.f68497a.nextDouble();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final String k0() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.f68497a;
        if (aVar.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return aVar.nextString();
        }
        aVar.q();
        return null;
    }

    @Override // io.sentry.InterfaceC7131c1
    public final double nextDouble() throws IOException {
        return this.f68497a.nextDouble();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final int nextInt() throws IOException {
        return this.f68497a.nextInt();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final long nextLong() throws IOException {
        return this.f68497a.nextLong();
    }

    @Override // io.sentry.InterfaceC7131c1
    @NotNull
    public final String nextName() throws IOException {
        return this.f68497a.nextName();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final String nextString() throws IOException {
        return this.f68497a.nextString();
    }

    @Override // io.sentry.InterfaceC7131c1
    @NotNull
    public final io.sentry.vendor.gson.stream.b peek() throws IOException {
        return this.f68497a.peek();
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void setLenient(boolean z11) {
        this.f68497a.setLenient(z11);
    }

    @Override // io.sentry.InterfaceC7131c1
    public final void skipValue() throws IOException {
        this.f68497a.skipValue();
    }
}
