package io.sentry;

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

/* loaded from: classes3.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f50243a;

    /* renamed from: b, reason: collision with root package name */
    public F0 f50244b;

    public D0(int i10) {
        this.f50243a = i10;
    }

    public final F0 a() {
        if (this.f50244b == null) {
            this.f50244b = new F0(this.f50243a);
        }
        return this.f50244b;
    }

    public void b(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger, Object obj) {
        if (obj == null) {
            interfaceC4813r1.l();
            return;
        }
        if (obj instanceof Character) {
            interfaceC4813r1.e(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            interfaceC4813r1.e((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC4813r1.c(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            interfaceC4813r1.i((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            d(interfaceC4813r1, iLogger, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            f(interfaceC4813r1, iLogger, (TimeZone) obj);
            return;
        }
        if (obj instanceof G0) {
            ((G0) obj).serialize(interfaceC4813r1, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            c(interfaceC4813r1, iLogger, (Collection) obj);
            return;
        }
        int i10 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i10 < length) {
                arrayList.add(Boolean.valueOf(zArr[i10]));
                i10++;
            }
            c(interfaceC4813r1, iLogger, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i10 < length2) {
                arrayList2.add(Byte.valueOf(bArr[i10]));
                i10++;
            }
            c(interfaceC4813r1, iLogger, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i10 < length3) {
                arrayList3.add(Short.valueOf(sArr[i10]));
                i10++;
            }
            c(interfaceC4813r1, iLogger, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i10 < length4) {
                arrayList4.add(Character.valueOf(cArr[i10]));
                i10++;
            }
            c(interfaceC4813r1, iLogger, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i10 < length5) {
                arrayList5.add(Integer.valueOf(iArr[i10]));
                i10++;
            }
            c(interfaceC4813r1, iLogger, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i10 < length6) {
                arrayList6.add(Long.valueOf(jArr[i10]));
                i10++;
            }
            c(interfaceC4813r1, iLogger, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i10 < length7) {
                arrayList7.add(Float.valueOf(fArr[i10]));
                i10++;
            }
            c(interfaceC4813r1, iLogger, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i10 < length8) {
                arrayList8.add(Double.valueOf(dArr[i10]));
                i10++;
            }
            c(interfaceC4813r1, iLogger, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            c(interfaceC4813r1, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            e(interfaceC4813r1, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            interfaceC4813r1.e(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            c(interfaceC4813r1, iLogger, io.sentry.util.o.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            interfaceC4813r1.c(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            interfaceC4813r1.e(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            interfaceC4813r1.e(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            interfaceC4813r1.e(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            interfaceC4813r1.e(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            e(interfaceC4813r1, iLogger, io.sentry.util.o.d((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            interfaceC4813r1.e(obj.toString());
            return;
        }
        try {
            b(interfaceC4813r1, iLogger, a().e(obj, iLogger));
        } catch (Exception e10) {
            iLogger.b(EnumC4788n3.ERROR, "Failed serializing unknown object.", e10);
            interfaceC4813r1.e("[OBJECT]");
        }
    }

    public final void c(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger, Collection collection) {
        interfaceC4813r1.p();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(interfaceC4813r1, iLogger, it.next());
        }
        interfaceC4813r1.n();
    }

    public final void d(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger, Date date) {
        try {
            interfaceC4813r1.e(AbstractC4779m.g(date));
        } catch (Exception e10) {
            iLogger.b(EnumC4788n3.ERROR, "Error when serializing Date", e10);
            interfaceC4813r1.l();
        }
    }

    public final void e(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger, Map map) {
        interfaceC4813r1.m();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                interfaceC4813r1.d((String) obj);
                b(interfaceC4813r1, iLogger, map.get(obj));
            }
        }
        interfaceC4813r1.t();
    }

    public final void f(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger, TimeZone timeZone) {
        try {
            interfaceC4813r1.e(timeZone.getID());
        } catch (Exception e10) {
            iLogger.b(EnumC4788n3.ERROR, "Error when serializing TimeZone", e10);
            interfaceC4813r1.l();
        }
    }
}
