package io.sentry.util;

import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7126b0;
import io.sentry.InterfaceC7220x0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f68586a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f68587b = 0;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private long f68588a = 0;

        a() {
        }

        private static int d(char c11) {
            if (c11 <= 127) {
                return 1;
            }
            return (c11 > 2047 && !Character.isSurrogate(c11)) ? 3 : 2;
        }

        public final long c() {
            return this.f68588a;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i11, int i12) {
            for (int i13 = i11; i13 < i11 + i12; i13++) {
                this.f68588a += d(cArr[i13]);
            }
        }

        @Override // java.io.Writer
        public final void write(int i11) {
            this.f68588a += d((char) i11);
        }

        @Override // java.io.Writer
        public final void write(@NotNull String str, int i11, int i12) {
            for (int i13 = i11; i13 < i11 + i12; i13++) {
                this.f68588a += d(str.charAt(i13));
            }
        }
    }

    @NotNull
    public static ArrayList a(@NotNull AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i11)));
        }
        return arrayList;
    }

    public static byte[] b(@NotNull InterfaceC7126b0 interfaceC7126b0, @NotNull ILogger iLogger, @NotNull InterfaceC7220x0 interfaceC7220x0) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f68586a));
                try {
                    interfaceC7126b0.a(bufferedWriter, interfaceC7220x0);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            iLogger.a(I2.ERROR, "Could not serialize serializable", th2);
            return null;
        }
    }

    @NotNull
    public static HashMap c(@NotNull Calendar calendar) {
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
