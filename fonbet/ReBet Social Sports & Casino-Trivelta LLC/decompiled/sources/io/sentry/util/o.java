package io.sentry.util;

import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4770k0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f52796a = Charset.forName("UTF-8");

    public static final class b extends Writer {

        /* renamed from: a, reason: collision with root package name */
        public long f52797a;

        public b() {
            this.f52797a = 0L;
        }

        public static int k(char c10) {
            if (c10 <= 127) {
                return 1;
            }
            return (c10 > 2047 && !Character.isSurrogate(c10)) ? 3 : 2;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public long d() {
            return this.f52797a;
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                this.f52797a += k(cArr[i12]);
            }
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f52797a += k((char) i10);
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                this.f52797a += k(str.charAt(i12));
            }
        }
    }

    public static List a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
        }
        return arrayList;
    }

    public static long b(InterfaceC4770k0 interfaceC4770k0, ILogger iLogger, G0 g02) {
        if (g02 == null) {
            return 0L;
        }
        try {
            b bVar = new b();
            interfaceC4770k0.a(g02, bVar);
            return bVar.d();
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Could not calculate size of serializable", th2);
            return 0L;
        }
    }

    public static byte[] c(InterfaceC4770k0 interfaceC4770k0, ILogger iLogger, G0 g02) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f52796a));
                try {
                    interfaceC4770k0.a(g02, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Could not serialize serializable", th2);
            return null;
        }
    }

    public static Map d(Calendar calendar) {
        HashMap hashMap = new HashMap();
        hashMap.put("year", Integer.valueOf(calendar.get(1)));
        hashMap.put("month", Integer.valueOf(calendar.get(2)));
        hashMap.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        hashMap.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        hashMap.put("minute", Integer.valueOf(calendar.get(12)));
        hashMap.put("second", Integer.valueOf(calendar.get(13)));
        return hashMap;
    }
}
