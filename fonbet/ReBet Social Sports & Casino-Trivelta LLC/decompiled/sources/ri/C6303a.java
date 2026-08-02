package ri;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import li.AbstractC5470d;
import net.time4j.F;
import net.time4j.tz.m;
import net.time4j.tz.r;
import net.time4j.tz.s;
import qi.InterfaceC6182c;

/* renamed from: ri.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6303a implements r, InterfaceC6182c {

    /* renamed from: a, reason: collision with root package name */
    public final String f64410a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64411b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f64412c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f64413d;

    /* renamed from: e, reason: collision with root package name */
    public final F f64414e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f64415f;

    /* JADX WARN: Removed duplicated region for block: B:42:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6303a() {
        String str;
        String str2;
        InputStream inputStream;
        IllegalStateException illegalStateException;
        String str3;
        URI f10;
        InputStream inputStream2;
        String str4 = "";
        F f11 = (F) F.l0().J();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        boolean z10 = System.getProperty("net.time4j.scale.leapseconds.path") != null;
        if (z10) {
            this.f64415f = Collections.EMPTY_MAP;
        } else {
            this.f64415f = new LinkedHashMap(50);
        }
        String property = System.getProperty("net.time4j.tz.repository.path");
        String property2 = System.getProperty("net.time4j.tz.repository.version");
        String str5 = property2 == null ? "tzdata.repository" : "tzdata" + property2 + ".repository";
        try {
            try {
                String str6 = "tzrepo/" + str5;
                if (property != null) {
                    try {
                        File file = new File(property, str5);
                        if (!file.isAbsolute()) {
                            f10 = AbstractC5470d.c().f("tzdata", l(), file.toString());
                        } else {
                            if (!file.exists()) {
                                throw new FileNotFoundException("Path to tz-repository not found: " + file);
                            }
                            f10 = file.toURI();
                        }
                    } catch (IOException e10) {
                        e = e10;
                        str2 = "";
                        str = str2;
                        inputStream = null;
                        try {
                            IllegalStateException illegalStateException2 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                            if (inputStream != null) {
                            }
                            illegalStateException = illegalStateException2;
                            str3 = str;
                            if (illegalStateException != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                            }
                            throw th;
                        }
                    }
                } else {
                    f10 = AbstractC5470d.c().f("tzdata", l(), str6);
                }
                if (f10 != null) {
                    inputStream2 = AbstractC5470d.c().e(f10, true);
                    try {
                        try {
                            str2 = f10.toString();
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        str2 = "";
                        str = str2;
                        inputStream = inputStream2;
                        IllegalStateException illegalStateException22 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                        if (inputStream != null) {
                        }
                        illegalStateException = illegalStateException22;
                        str3 = str;
                        if (illegalStateException != null) {
                        }
                    }
                } else {
                    str2 = "";
                    inputStream2 = null;
                }
                if (inputStream2 == null) {
                    try {
                        URL resource = l().getClassLoader().getResource(str6);
                        if (resource == null) {
                            throw new FileNotFoundException("Classloader cannot access tz-repository: " + str6);
                        }
                        URLConnection openConnection = resource.openConnection();
                        openConnection.setUseCaches(false);
                        openConnection.connect();
                        inputStream2 = openConnection.getInputStream();
                        str2 = resource.toString();
                    } catch (IOException e12) {
                        e = e12;
                        str = "";
                        inputStream = inputStream2;
                        IllegalStateException illegalStateException222 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        illegalStateException = illegalStateException222;
                        str3 = str;
                        if (illegalStateException != null) {
                        }
                    }
                }
                DataInputStream dataInputStream = new DataInputStream(inputStream2);
                j(dataInputStream, str2);
                String readUTF = dataInputStream.readUTF();
                int readInt = dataInputStream.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i10 = 0;
                while (i10 < readInt) {
                    String readUTF2 = dataInputStream.readUTF();
                    int readInt2 = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt2];
                    boolean z11 = z10;
                    str = str4;
                    int i11 = 0;
                    do {
                        try {
                            i11 += dataInputStream.read(bArr, i11, readInt2 - i11);
                            if (i11 == -1) {
                                throw new EOFException("Incomplete data: " + readUTF2);
                            }
                        } catch (IOException e13) {
                            e = e13;
                            inputStream = inputStream2;
                            IllegalStateException illegalStateException2222 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                            if (inputStream != null) {
                            }
                            illegalStateException = illegalStateException2222;
                            str3 = str;
                            if (illegalStateException != null) {
                            }
                        }
                    } while (readInt2 > i11);
                    arrayList.add(readUTF2);
                    hashMap.put(readUTF2, bArr);
                    i10++;
                    z10 = z11;
                    str4 = str;
                }
                boolean z12 = z10;
                short readShort = dataInputStream.readShort();
                for (int i12 = 0; i12 < readShort; i12++) {
                    hashMap2.put(dataInputStream.readUTF(), (String) arrayList.get(dataInputStream.readShort()));
                }
                if (!z12) {
                    short readShort2 = dataInputStream.readShort();
                    for (int i13 = 0; i13 < readShort2; i13++) {
                        this.f64415f.put(F.B0(dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readByte()), Integer.valueOf(dataInputStream.readByte()));
                    }
                    f11 = F.B0(dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readByte());
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                str3 = readUTF;
                illegalStateException = null;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (IOException e14) {
            e = e14;
            str = "";
            str2 = str;
        }
        if (illegalStateException != null) {
            throw illegalStateException;
        }
        this.f64410a = str3;
        this.f64411b = str2;
        this.f64412c = Collections.unmodifiableMap(hashMap);
        this.f64413d = Collections.unmodifiableMap(hashMap2);
        this.f64414e = f11;
    }

    public static void j(DataInputStream dataInputStream, String str) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte readByte3 = dataInputStream.readByte();
        byte readByte4 = dataInputStream.readByte();
        byte readByte5 = dataInputStream.readByte();
        byte readByte6 = dataInputStream.readByte();
        if (readByte == 116 && readByte2 == 122 && readByte3 == 114 && readByte4 == 101 && readByte5 == 112 && readByte6 == 111) {
            return;
        }
        throw new IOException("Invalid tz-repository: " + str);
    }

    public static Class l() {
        if (!Boolean.getBoolean("test.environment")) {
            return C6303a.class;
        }
        try {
            return Class.forName("net.time4j.tz.spi.RepositoryTest");
        } catch (ClassNotFoundException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // net.time4j.tz.r
    public s a() {
        return null;
    }

    @Override // qi.InterfaceC6182c
    public boolean b() {
        return !this.f64415f.isEmpty();
    }

    @Override // net.time4j.tz.r
    public Map c() {
        return this.f64413d;
    }

    @Override // net.time4j.tz.r
    public String e() {
        return this.f64411b;
    }

    @Override // qi.InterfaceC6182c
    public Map f() {
        return Collections.unmodifiableMap(this.f64415f);
    }

    @Override // net.time4j.tz.r
    public Set g() {
        return this.f64412c.keySet();
    }

    @Override // net.time4j.tz.r
    public String getName() {
        return "TZDB";
    }

    @Override // net.time4j.tz.r
    public String getVersion() {
        return this.f64410a;
    }

    @Override // net.time4j.tz.r
    public String h() {
        return "";
    }

    @Override // net.time4j.tz.r
    public m i(String str) {
        try {
            byte[] bArr = (byte[]) this.f64412c.get(str);
            if (bArr != null) {
                return (m) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            }
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // qi.InterfaceC6182c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public F d() {
        return this.f64414e;
    }

    public String toString() {
        return "TZ-REPOSITORY(" + this.f64410a + ")";
    }
}
