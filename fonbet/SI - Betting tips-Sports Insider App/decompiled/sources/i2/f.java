package i2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.c1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final y8.d f10883a = new y8.d();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f10884b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f10885c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f10886d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f10887e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f10888f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f10889g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f10890h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f10891i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i5 = 0;
        int i10 = 0;
        for (c cVar : cVarArr) {
            i10 += ((((cVar.f10878g * 2) + 7) & (-8)) / 8) + (cVar.f10876e * 2) + d(cVar.f10872a, cVar.f10873b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f10877f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f10888f)) {
            int length = cVarArr.length;
            while (i5 < length) {
                c cVar2 = cVarArr[i5];
                q(byteArrayOutputStream, cVar2, d(cVar2.f10872a, cVar2.f10873b, bArr));
                p(byteArrayOutputStream, cVar2);
                i5++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f10872a, cVar3.f10873b, bArr));
            }
            int length2 = cVarArr.length;
            while (i5 < length2) {
                p(byteArrayOutputStream, cVarArr[i5]);
                i5++;
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z5 = true;
        for (File file2 : listFiles) {
            z5 = c(file2) && z5;
        }
        return z5;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f10890h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f10889g;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
            }
            if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                if ("!".equals(obj)) {
                    return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
                }
                if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                    return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
            } else if (!str2.endsWith(".apk")) {
                return d9.e.l(v.f.b(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(a.a.i(new FileOutputStream(file2), file2));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i5) {
        byte[] bArr = new byte[i5];
        int i10 = 0;
        while (i10 < i5) {
            int read = inputStream.read(bArr, i10, i5 - i10);
            if (read < 0) {
                throw new IllegalStateException(c1.i(i5, "Not enough bytes to read: "));
            }
            i10 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i5) {
        int[] iArr = new int[i5];
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            i10 += (int) m(byteArrayInputStream, 2);
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i5, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int i12 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i5) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i5 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i12 += inflater.inflate(bArr, i12, i10 - i12);
                    i11 += read;
                } catch (DataFormatException e7) {
                    throw new IllegalStateException(e7.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i5 + " actual=" + i11);
        } finally {
            inflater.end();
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f10891i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m6 = (int) m(fileInputStream, 2);
            byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
            try {
                c[] k6 = k(byteArrayInputStream, bArr2, m6, cVarArr);
                byteArrayInputStream.close();
                return k6;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f10886d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m10 = (int) m(fileInputStream, 1);
        byte[] h11 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h11);
        try {
            c[] j6 = j(byteArrayInputStream2, m10, cVarArr);
            byteArrayInputStream2.close();
            return j6;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i5, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i5 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i5];
        int[] iArr = new int[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            int m6 = (int) m(byteArrayInputStream, 2);
            iArr[i10] = (int) m(byteArrayInputStream, 2);
            strArr[i10] = new String(f(byteArrayInputStream, m6), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i5; i11++) {
            c cVar = cVarArr[i11];
            if (!cVar.f10873b.equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            cVar.f10876e = i12;
            cVar.f10879h = g(byteArrayInputStream, i12);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i5, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i5 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i5; i10++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m6 = m(byteArrayInputStream, 4);
            int m10 = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i11 = 0;
                while (true) {
                    if (i11 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i11].f10873b.equals(substring)) {
                        cVar = cVarArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f10875d = m6;
            int[] g10 = g(byteArrayInputStream, m10);
            if (Arrays.equals(bArr, f10890h)) {
                cVar.f10876e = m10;
                cVar.f10879h = g10;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f10887e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m6 = (int) m(fileInputStream, 1);
        byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
        try {
            c[] n9 = n(byteArrayInputStream, str, m6);
            byteArrayInputStream.close();
            return n9;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(InputStream inputStream, int i5) {
        byte[] f6 = f(inputStream, i5);
        long j6 = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            j6 += (f6[i10] & 255) << (i10 * 8);
        }
        return j6;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i5) {
        int i10 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i5];
        for (int i11 = 0; i11 < i5; i11++) {
            int m6 = (int) m(byteArrayInputStream, 2);
            int m10 = (int) m(byteArrayInputStream, 2);
            cVarArr[i11] = new c(str, new String(f(byteArrayInputStream, m6), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m10, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m10], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i5) {
            c cVar = cVarArr[i12];
            int available = byteArrayInputStream.available();
            int i13 = cVar.f10877f;
            int i14 = cVar.f10878g;
            TreeMap treeMap = cVar.f10880i;
            int i15 = available - i13;
            int i16 = i10;
            while (byteArrayInputStream.available() > i15) {
                i16 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i16), 1);
                int m11 = (int) m(byteArrayInputStream, 2);
                while (m11 > 0) {
                    m(byteArrayInputStream, 2);
                    int m12 = (int) m(byteArrayInputStream, 1);
                    if (m12 != 6 && m12 != 7) {
                        while (m12 > 0) {
                            m(byteArrayInputStream, 1);
                            int i17 = i10;
                            int i18 = i12;
                            for (int m13 = (int) m(byteArrayInputStream, 1); m13 > 0; m13--) {
                                m(byteArrayInputStream, 2);
                            }
                            m12--;
                            i10 = i17;
                            i12 = i18;
                        }
                    }
                    m11--;
                    i10 = i10;
                    i12 = i12;
                }
            }
            int i19 = i10;
            int i20 = i12;
            if (byteArrayInputStream.available() != i15) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f10879h = g(byteArrayInputStream, cVar.f10876e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i14 * 2) + 7) & (-8)) / 8));
            for (int i21 = i19; i21 < i14; i21++) {
                int i22 = valueOf.get(i21) ? 2 : i19;
                if (valueOf.get(i21 + i14)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (num == null) {
                        num = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | num.intValue()));
                }
            }
            i12 = i20 + 1;
            i10 = i19;
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j6;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f10886d;
        int i5 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f10887e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b10 = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b10.length, 4);
                byte[] a7 = a(b10);
                u(byteArrayOutputStream, a7.length, 4);
                byteArrayOutputStream.write(a7);
                return true;
            }
            byte[] bArr4 = f10889g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f10880i.size() * 4;
                    String d10 = d(cVar.f10872a, cVar.f10873b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d10.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.f10879h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.f10874c, 4);
                    byteArrayOutputStream.write(d10.getBytes(charset));
                    Iterator it = cVar.f10880i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i10 : cVar.f10879h) {
                        v(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f10888f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b11 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b11.length, 4);
                byte[] a10 = a(b11);
                u(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr6 = f10890h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String str = cVar2.f10872a;
                TreeMap treeMap = cVar2.f10880i;
                String d11 = d(str, cVar2.f10873b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d11.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.f10879h.length);
                u(byteArrayOutputStream, cVar2.f10874c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : cVar2.f10879h) {
                    v(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.f10874c, 4);
                u(byteArrayOutputStream2, cVar3.f10875d, 4);
                u(byteArrayOutputStream2, cVar3.f10878g, 4);
                String d12 = d(cVar3.f10872a, cVar3.f10873b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d12.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(d12.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(false, 1, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i14];
                    v(byteArrayOutputStream3, i14);
                    v(byteArrayOutputStream3, cVar4.f10876e);
                    i15 = i15 + 4 + (cVar4.f10876e * i12);
                    int[] iArr = cVar4.f10879h;
                    int length3 = iArr.length;
                    int i16 = i5;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length3) {
                        int i19 = iArr[i18];
                        v(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i5 = 0;
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            k kVar2 = new k(true, 3, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i20];
                    Iterator it3 = cVar5.f10880i.entrySet().iterator();
                    int i22 = 0;
                    while (it3.hasNext()) {
                        i22 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i22, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i20);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i22);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i21 = i23 + length4;
                            i20++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            k kVar3 = new k(true, 4, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i24);
                int i25 = kVar4.f10899a;
                byte[] bArr7 = kVar4.f10900b;
                if (i25 == 1) {
                    j6 = 0;
                } else if (i25 == 2) {
                    j6 = 1;
                } else if (i25 == 3) {
                    j6 = 2;
                } else if (i25 == 4) {
                    j6 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j6 = 4;
                }
                u(byteArrayOutputStream, j6, 4);
                u(byteArrayOutputStream, size2, 4);
                if (kVar4.f10901c) {
                    long length5 = bArr7.length;
                    byte[] a11 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a11);
                    u(byteArrayOutputStream, a11.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a11.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        s(byteArrayOutputStream, cVar);
        int i5 = cVar.f10878g;
        int[] iArr = cVar.f10879h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        byte[] bArr = new byte[(((i5 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f10880i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i13 = intValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i14 = intValue + i5;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f10876e);
        u(byteArrayOutputStream, cVar.f10877f, 4);
        u(byteArrayOutputStream, cVar.f10874c, 4);
        u(byteArrayOutputStream, cVar.f10878g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i5, c cVar) {
        int i10 = cVar.f10878g;
        byte[] bArr = new byte[(((Integer.bitCount(i5 & (-2)) * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f10880i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i5) != 0) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (i11 * i10) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i5 = 0;
        for (Map.Entry entry : cVar.f10880i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i5);
                v(byteArrayOutputStream, 0);
                i5 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, e eVar, boolean z5) {
        boolean z7;
        ?? r72;
        byte[] bArr;
        c[] cVarArr;
        c[] cVarArr2;
        c[] cVarArr3;
        byte[] bArr2;
        boolean z10;
        boolean z11;
        Throwable th2;
        Throwable th3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? byteArrayOutputStream;
        b bVar;
        String str;
        String str2;
        FileInputStream a7;
        boolean z16;
        boolean z17;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z5) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(y4.a.m(new FileInputStream(file), file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z17 = readLong == packageInfo.lastUpdateTime;
                            if (z17) {
                                eVar.k(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z17) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        j.c(context, false);
                        return;
                    }
                }
                z17 = false;
                if (z17) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, eVar, name, file2);
            byte[] bArr3 = bVar2.f10866c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        bVar2.b(4, null);
                    }
                    bVar2.f10869f = true;
                    try {
                        try {
                            r72 = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e7) {
                            eVar.k(6, e7);
                            r72 = 0;
                            bArr = f10884b;
                            if (r72 != 0) {
                            }
                            cVarArr2 = bVar2.f10870g;
                            if (cVarArr2 != null) {
                            }
                            e eVar2 = bVar2.f10865b;
                            cVarArr3 = bVar2.f10870g;
                            byte[] bArr4 = bVar2.f10866c;
                            boolean z18 = r72;
                            z18 = r72;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f10871h;
                            if (bArr2 != null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z16 = z12;
                            j.c(context, (z13 || !z5) ? false : z16);
                        } catch (IOException e9) {
                            eVar.k(7, e9);
                            r72 = 0;
                            bArr = f10884b;
                            if (r72 != 0) {
                            }
                            cVarArr2 = bVar2.f10870g;
                            if (cVarArr2 != null) {
                            }
                            e eVar22 = bVar2.f10865b;
                            cVarArr3 = bVar2.f10870g;
                            byte[] bArr42 = bVar2.f10866c;
                            boolean z182 = r72;
                            z182 = r72;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f10871h;
                            if (bArr2 != null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z16 = z12;
                            j.c(context, (z13 || !z5) ? false : z16);
                        }
                        if (r72 != 0) {
                            try {
                                try {
                                } catch (IOException e10) {
                                    eVar.k(7, e10);
                                    try {
                                        r72.close();
                                    } catch (IOException e11) {
                                        eVar.k(7, e11);
                                    }
                                    cVarArr = null;
                                    bVar2.f10870g = cVarArr;
                                    cVarArr2 = bVar2.f10870g;
                                    if (cVarArr2 != null) {
                                    }
                                    e eVar222 = bVar2.f10865b;
                                    cVarArr3 = bVar2.f10870g;
                                    byte[] bArr422 = bVar2.f10866c;
                                    boolean z1822 = r72;
                                    z1822 = r72;
                                    if (cVarArr3 != null) {
                                    }
                                    bArr2 = bVar2.f10871h;
                                    if (bArr2 != null) {
                                    }
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z16 = z12;
                                    j.c(context, (z13 || !z5) ? false : z16);
                                }
                            } catch (IllegalStateException e12) {
                                eVar.k(8, e12);
                                r72.close();
                                cVarArr = null;
                                bVar2.f10870g = cVarArr;
                                cVarArr2 = bVar2.f10870g;
                                if (cVarArr2 != null) {
                                }
                                e eVar2222 = bVar2.f10865b;
                                cVarArr3 = bVar2.f10870g;
                                byte[] bArr4222 = bVar2.f10866c;
                                boolean z18222 = r72;
                                z18222 = r72;
                                if (cVarArr3 != null) {
                                }
                                bArr2 = bVar2.f10871h;
                                if (bArr2 != null) {
                                }
                                if (z11) {
                                }
                                z13 = z11;
                                z16 = z12;
                                j.c(context, (z13 || !z5) ? false : z16);
                            }
                            if (!Arrays.equals(bArr, f(r72, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            cVarArr = l(r72, f(r72, 4), bVar2.f10868e);
                            try {
                                r72.close();
                            } catch (IOException e13) {
                                eVar.k(7, e13);
                            }
                            bVar2.f10870g = cVarArr;
                        }
                        cVarArr2 = bVar2.f10870g;
                        if (cVarArr2 != null && (r72 = Build.VERSION.SDK_INT) >= 24 && (r72 >= 31 || r72 == 24 || r72 == 25)) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a7 = bVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e14) {
                                eVar.k(9, e14);
                                str = r72;
                            } catch (IOException e15) {
                                eVar.k(7, e15);
                                str = r72;
                            } catch (IllegalStateException e16) {
                                bVar2.f10870g = null;
                                eVar.k(8, e16);
                                str = r72;
                            }
                            if (a7 == null) {
                                try {
                                    if (!Arrays.equals(f10885c, f(a7, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] f6 = f(a7, 4);
                                    bVar2.f10870g = i(a7, f6, bArr3, cVarArr2);
                                    a7.close();
                                    bVar = bVar2;
                                    r72 = f6;
                                    if (bVar != null) {
                                        bVar2 = bVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a7 != null) {
                                    a7.close();
                                    str = str2;
                                }
                                bVar = null;
                                r72 = str;
                                if (bVar != null) {
                                }
                            }
                        }
                        e eVar22222 = bVar2.f10865b;
                        cVarArr3 = bVar2.f10870g;
                        byte[] bArr42222 = bVar2.f10866c;
                        boolean z182222 = r72;
                        z182222 = r72;
                        if (cVarArr3 != null && bArr42222 != null) {
                            z14 = bVar2.f10869f;
                            if (z14) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e17) {
                                eVar22222.k(7, e17);
                                z15 = z14;
                            } catch (IllegalStateException e18) {
                                eVar22222.k(8, e18);
                                z15 = z14;
                            }
                            if (o(byteArrayOutputStream, bArr42222, cVarArr3)) {
                                bVar2.f10871h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z15 = byteArrayOutputStream;
                                bVar2.f10870g = null;
                                z182222 = z15;
                            } else {
                                eVar22222.k(5, null);
                                bVar2.f10870g = null;
                                byteArrayOutputStream.close();
                                z182222 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = bVar2.f10871h;
                        if (bArr2 != null) {
                            z11 = false;
                            z12 = true;
                        } else {
                            try {
                                if (!bVar2.f10869f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                File file3 = bVar2.f10867d;
                                                FileOutputStream i5 = a.a.i(new FileOutputStream(file3), file3);
                                                try {
                                                    try {
                                                        FileChannel channel = i5.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        i5.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z12 = true;
                                                                                bVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                i5.close();
                                                                                byteArrayInputStream.close();
                                                                                bVar2.f10871h = null;
                                                                                bVar2.f10870g = null;
                                                                                z11 = true;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            Throwable th5 = th;
                                                                            if (tryLock == null) {
                                                                                throw th5;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th5;
                                                                            } catch (Throwable th6) {
                                                                                th5.addSuppressed(th6);
                                                                                throw th5;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    Throwable th8 = th;
                                                                    if (channel == null) {
                                                                        throw th8;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th8;
                                                                    } catch (Throwable th9) {
                                                                        th8.addSuppressed(th9);
                                                                        throw th8;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                        }
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        th3 = th;
                                                        try {
                                                            i5.close();
                                                            throw th3;
                                                        } catch (Throwable th13) {
                                                            th3.addSuppressed(th13);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    th3 = th;
                                                    i5.close();
                                                    throw th3;
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                                th2 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th2;
                                                } catch (Throwable th16) {
                                                    th2.addSuppressed(th16);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            th2 = th;
                                            byteArrayInputStream.close();
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException e19) {
                                        e = e19;
                                        z182222 = true;
                                        bVar2.b(6, e);
                                        z10 = z182222;
                                        z11 = false;
                                        z12 = z10;
                                        if (z11) {
                                        }
                                        z13 = z11;
                                        z16 = z12;
                                        j.c(context, (z13 || !z5) ? false : z16);
                                    } catch (IOException e20) {
                                        e = e20;
                                        z182222 = true;
                                        bVar2.b(7, e);
                                        z10 = z182222;
                                        z11 = false;
                                        z12 = z10;
                                        if (z11) {
                                        }
                                        z13 = z11;
                                        z16 = z12;
                                        j.c(context, (z13 || !z5) ? false : z16);
                                    }
                                } catch (FileNotFoundException e21) {
                                    e = e21;
                                    bVar2.b(6, e);
                                    z10 = z182222;
                                    z11 = false;
                                    z12 = z10;
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z16 = z12;
                                    j.c(context, (z13 || !z5) ? false : z16);
                                } catch (IOException e22) {
                                    e = e22;
                                    bVar2.b(7, e);
                                    z10 = z182222;
                                    z11 = false;
                                    z12 = z10;
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z16 = z12;
                                    j.c(context, (z13 || !z5) ? false : z16);
                                }
                            } finally {
                                bVar2.f10871h = null;
                                bVar2.f10870g = null;
                            }
                        }
                        if (z11) {
                            e(packageInfo, filesDir);
                        }
                        z13 = z11;
                        z16 = z12;
                    } finally {
                    }
                    bArr = f10884b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            bVar2.b(4, null);
                        }
                        bVar2.f10869f = true;
                        r72 = bVar2.a(assets, "dexopt/baseline.prof");
                        bArr = f10884b;
                        if (r72 != 0) {
                        }
                        cVarArr2 = bVar2.f10870g;
                        if (cVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a7 = bVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a7 == null) {
                            }
                        }
                        e eVar222222 = bVar2.f10865b;
                        cVarArr3 = bVar2.f10870g;
                        byte[] bArr422222 = bVar2.f10866c;
                        boolean z1822222 = r72;
                        z1822222 = r72;
                        if (cVarArr3 != null) {
                            z14 = bVar2.f10869f;
                            if (z14) {
                            }
                        }
                        bArr2 = bVar2.f10871h;
                        if (bArr2 != null) {
                        }
                        if (z11) {
                        }
                        z13 = z11;
                        z16 = z12;
                    } catch (IOException unused2) {
                        z7 = true;
                        bVar2.b(4, null);
                    }
                }
                j.c(context, (z13 || !z5) ? false : z16);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z7 = true;
            z13 = false;
            z16 = z7;
            j.c(context, (z13 || !z5) ? false : z16);
        } catch (PackageManager.NameNotFoundException e23) {
            eVar.k(7, e23);
            j.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j6, int i5) {
        byte[] bArr = new byte[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            bArr[i10] = (byte) ((j6 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i5) {
        u(byteArrayOutputStream, i5, 2);
    }
}
