package io.sentry;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7208u0 {

    /* renamed from: a, reason: collision with root package name */
    public final C7216w0 f68551a;

    public C7208u0(int i11) {
        this.f68551a = new C7216w0(i11);
    }

    private void b(@NotNull C7212v0 c7212v0, @NotNull ILogger iLogger, @NotNull Collection collection) throws IOException {
        c7212v0.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(c7212v0, iLogger, it.next());
        }
        c7212v0.c();
    }

    private void c(@NotNull C7212v0 c7212v0, @NotNull ILogger iLogger, @NotNull Map map) throws IOException {
        c7212v0.b();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                c7212v0.g((String) obj);
                a(c7212v0, iLogger, map.get(obj));
            }
        }
        c7212v0.d();
    }

    public final void a(@NotNull C7212v0 c7212v0, @NotNull ILogger iLogger, Object obj) throws IOException {
        if (obj == null) {
            c7212v0.h();
            return;
        }
        if (obj instanceof Character) {
            c7212v0.p(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            c7212v0.p((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            c7212v0.q(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            c7212v0.o((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                c7212v0.p(io.sentry.vendor.gson.internal.bind.util.a.b((Date) obj));
                return;
            } catch (Exception e11) {
                iLogger.a(I2.ERROR, "Error when serializing Date", e11);
                c7212v0.h();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                c7212v0.p(((TimeZone) obj).getID());
                return;
            } catch (Exception e12) {
                iLogger.a(I2.ERROR, "Error when serializing TimeZone", e12);
                c7212v0.h();
                return;
            }
        }
        if (obj instanceof InterfaceC7220x0) {
            ((InterfaceC7220x0) obj).serialize(c7212v0, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(c7212v0, iLogger, (Collection) obj);
            return;
        }
        int i11 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i11 < length) {
                arrayList.add(Boolean.valueOf(zArr[i11]));
                i11++;
            }
            b(c7212v0, iLogger, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i11 < length2) {
                arrayList2.add(Byte.valueOf(bArr[i11]));
                i11++;
            }
            b(c7212v0, iLogger, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i11 < length3) {
                arrayList3.add(Short.valueOf(sArr[i11]));
                i11++;
            }
            b(c7212v0, iLogger, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i11 < length4) {
                arrayList4.add(Character.valueOf(cArr[i11]));
                i11++;
            }
            b(c7212v0, iLogger, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i11 < length5) {
                arrayList5.add(Integer.valueOf(iArr[i11]));
                i11++;
            }
            b(c7212v0, iLogger, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i11 < length6) {
                arrayList6.add(Long.valueOf(jArr[i11]));
                i11++;
            }
            b(c7212v0, iLogger, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i11 < length7) {
                arrayList7.add(Float.valueOf(fArr[i11]));
                i11++;
            }
            b(c7212v0, iLogger, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i11 < length8) {
                arrayList8.add(Double.valueOf(dArr[i11]));
                i11++;
            }
            b(c7212v0, iLogger, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            b(c7212v0, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            c(c7212v0, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            c7212v0.p(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(c7212v0, iLogger, io.sentry.util.k.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            c7212v0.q(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            c7212v0.p(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            c7212v0.p(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            c7212v0.p(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            c7212v0.p(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            c(c7212v0, iLogger, io.sentry.util.k.c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            c7212v0.p(obj.toString());
            return;
        }
        try {
            a(c7212v0, iLogger, this.f68551a.b(iLogger, obj));
        } catch (Exception e13) {
            iLogger.a(I2.ERROR, "Failed serializing unknown object.", e13);
            c7212v0.p("[OBJECT]");
        }
    }
}
