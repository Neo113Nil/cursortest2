package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.ISerializer;
import io.sentry.JsonSerializable;
import io.sentry.SentryLevel;
import io.sentry.metrics.MetricsUnit;
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

/* loaded from: classes9.dex */
public final class JsonSerializationUtils {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static Map<String, Object> calendarToMap(Calendar calendar) {
        HashMap hashMap = new HashMap();
        hashMap.put("year", Integer.valueOf(calendar.get(1)));
        hashMap.put("month", Integer.valueOf(calendar.get(2)));
        hashMap.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        hashMap.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        hashMap.put(MetricsUnit.Duration.MINUTE, Integer.valueOf(calendar.get(12)));
        hashMap.put(MetricsUnit.Duration.SECOND, Integer.valueOf(calendar.get(13)));
        return hashMap;
    }

    public static List<Object> atomicIntegerArrayToList(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
        }
        return arrayList;
    }

    public static byte[] bytesFrom(ISerializer iSerializer, ILogger iLogger, JsonSerializable jsonSerializable) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                try {
                    iSerializer.serialize((ISerializer) jsonSerializable, (Writer) bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Could not serialize serializable", th);
            return null;
        }
    }

    public static long byteSizeOf(ISerializer iSerializer, ILogger iLogger, JsonSerializable jsonSerializable) {
        if (jsonSerializable == null) {
            return 0L;
        }
        try {
            ByteCountingWriter byteCountingWriter = new ByteCountingWriter();
            iSerializer.serialize((ISerializer) jsonSerializable, (Writer) byteCountingWriter);
            return byteCountingWriter.getByteCount();
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Could not calculate size of serializable", th);
            return 0L;
        }
    }

    private static final class ByteCountingWriter extends Writer {
        private long byteCount;

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        private ByteCountingWriter() {
            this.byteCount = 0L;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                this.byteCount += utf8ByteCount(cArr[i3]);
            }
        }

        @Override // java.io.Writer
        public void write(int i) {
            this.byteCount += utf8ByteCount((char) i);
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                this.byteCount += utf8ByteCount(str.charAt(i3));
            }
        }

        public long getByteCount() {
            return this.byteCount;
        }

        private static int utf8ByteCount(char c) {
            if (c <= 127) {
                return 1;
            }
            return (c > 2047 && !Character.isSurrogate(c)) ? 3 : 2;
        }
    }
}
