package org.joda.time.tz;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;

/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final File f79404a;

    /* renamed from: b, reason: collision with root package name */
    private final String f79405b;

    /* renamed from: c, reason: collision with root package name */
    private final ClassLoader f79406c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f79407d;

    /* renamed from: e, reason: collision with root package name */
    private final SortedSet f79408e;

    final class a implements PrivilegedAction<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f79409a;

        a(String str) {
            this.f79409a = str;
        }

        @Override // java.security.PrivilegedAction
        public final InputStream run() {
            e eVar = e.this;
            ClassLoader classLoader = eVar.f79406c;
            String str = this.f79409a;
            return classLoader != null ? eVar.f79406c.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
        }
    }

    public e(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("File directory doesn't exist: " + file);
        }
        if (!file.isDirectory()) {
            throw new IOException("File doesn't refer to a directory: " + file);
        }
        this.f79404a = file;
        this.f79405b = null;
        this.f79406c = null;
        ConcurrentHashMap e11 = e(f("ZoneInfoMap"));
        this.f79407d = e11;
        this.f79408e = Collections.unmodifiableSortedSet(new TreeSet(e11.keySet()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0028: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:27:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DateTimeZone d(String str) {
        InputStream inputStream;
        InputStream inputStream2;
        ConcurrentHashMap concurrentHashMap = this.f79407d;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = f(str);
                try {
                    DateTimeZone a11 = inputStream instanceof DataInput ? DateTimeZoneBuilder.a((DataInput) inputStream, str) : DateTimeZoneBuilder.a(new DataInputStream(inputStream), str);
                    concurrentHashMap.put(str, new SoftReference(a11));
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return a11;
                } catch (IOException e11) {
                    e = e11;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            inputStream = 0;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream3 != null) {
            }
            throw th;
        }
    }

    private static ConcurrentHashMap e(InputStream inputStream) throws IOException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            g(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.f78989a));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private InputStream f(String str) throws IOException {
        File file = this.f79404a;
        if (file != null) {
            return new FileInputStream(new File(file, str));
        }
        String concat = this.f79405b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new a(concat));
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Resource not found: \"");
        sb2.append(concat);
        sb2.append("\" ClassLoader: ");
        ClassLoader classLoader = this.f79406c;
        sb2.append(classLoader != null ? classLoader.toString() : "system");
        throw new IOException(sb2.toString());
    }

    private static void g(DataInputStream dataInputStream, ConcurrentHashMap concurrentHashMap) throws IOException {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i11 = 0; i11 < readUnsignedShort; i11++) {
            strArr[i11] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i12 = 0; i12 < readUnsignedShort2; i12++) {
            try {
                concurrentHashMap.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    @Override // org.joda.time.tz.c
    public final DateTimeZone a(String str) {
        Object obj = this.f79407d.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof SoftReference)) {
            return str.equals(obj) ? d(str) : a((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : d(str);
    }

    @Override // org.joda.time.tz.c
    public final Set<String> b() {
        return this.f79408e;
    }

    public e() throws IOException {
        String concat = "org/joda/time/tz/data".concat("/");
        this.f79404a = null;
        this.f79405b = concat;
        this.f79406c = e.class.getClassLoader();
        ConcurrentHashMap e11 = e(f("ZoneInfoMap"));
        this.f79407d = e11;
        this.f79408e = Collections.unmodifiableSortedSet(new TreeSet(e11.keySet()));
    }
}
