package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class l {
    static final byte[] MAGIC_PROF = {112, 114, 111, 0};
    static final byte[] MAGIC_PROFM = {112, 114, 109, 0};

    public static void A(byte[] bArr, int i10, int i11, d dVar) {
        int m10 = m(i10, i11, dVar.f22643g);
        int i12 = m10 / 8;
        bArr[i12] = (byte) ((1 << (m10 % 8)) | bArr[i12]);
    }

    public static void B(InputStream inputStream) {
        e.h(inputStream);
        int j10 = e.j(inputStream);
        if (j10 == 6 || j10 == 7) {
            return;
        }
        while (j10 > 0) {
            e.j(inputStream);
            for (int j11 = e.j(inputStream); j11 > 0; j11--) {
                e.h(inputStream);
            }
            j10--;
        }
    }

    public static boolean C(OutputStream outputStream, byte[] bArr, d[] dVarArr) {
        if (Arrays.equals(bArr, n.V015_S)) {
            P(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, n.V010_P)) {
            O(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, n.V005_O)) {
            M(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, n.V009_O_MR1)) {
            N(outputStream, dVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, n.V001_N)) {
            return false;
        }
        L(outputStream, dVarArr);
        return true;
    }

    public static void D(OutputStream outputStream, d dVar) {
        int[] iArr = dVar.classes;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            e.p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    public static o E(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i10 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f22639c);
                e.q(byteArrayOutputStream, dVar.f22640d);
                e.q(byteArrayOutputStream, dVar.f22643g);
                String j10 = j(dVar.f22637a, dVar.f22638b, n.V015_S);
                int k10 = e.k(j10);
                e.p(byteArrayOutputStream, k10);
                i10 = i10 + 14 + k10;
                e.n(byteArrayOutputStream, j10);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                o oVar = new o(f.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return oVar;
            }
            throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void F(OutputStream outputStream, byte[] bArr) {
        outputStream.write(MAGIC_PROF);
        outputStream.write(bArr);
    }

    public static void G(OutputStream outputStream, d dVar) {
        K(outputStream, dVar);
        D(outputStream, dVar);
        I(outputStream, dVar);
    }

    public static void H(OutputStream outputStream, d dVar, String str) {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f22641e);
        e.q(outputStream, dVar.f22642f);
        e.q(outputStream, dVar.f22639c);
        e.q(outputStream, dVar.f22643g);
        e.n(outputStream, str);
    }

    public static void I(OutputStream outputStream, d dVar) {
        byte[] bArr = new byte[k(dVar.f22643g)];
        for (Map.Entry entry : dVar.f22644h.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                A(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                A(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void J(OutputStream outputStream, int i10, d dVar) {
        byte[] bArr = new byte[l(i10, dVar.f22643g)];
        for (Map.Entry entry : dVar.f22644h.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i10) != 0) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (dVar.f22643g * i11) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        outputStream.write(bArr);
    }

    public static void K(OutputStream outputStream, d dVar) {
        int i10 = 0;
        for (Map.Entry entry : dVar.f22644h.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                e.p(outputStream, intValue - i10);
                e.p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    public static void L(OutputStream outputStream, d[] dVarArr) {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j10 = j(dVar.f22637a, dVar.f22638b, n.V001_N);
            e.p(outputStream, e.k(j10));
            e.p(outputStream, dVar.f22644h.size());
            e.p(outputStream, dVar.classes.length);
            e.q(outputStream, dVar.f22639c);
            e.n(outputStream, j10);
            Iterator it = dVar.f22644h.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i10 : dVar.classes) {
                e.p(outputStream, i10);
            }
        }
    }

    public static void M(OutputStream outputStream, d[] dVarArr) {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            int size = dVar.f22644h.size() * 4;
            String j10 = j(dVar.f22637a, dVar.f22638b, n.V005_O);
            e.p(outputStream, e.k(j10));
            e.p(outputStream, dVar.classes.length);
            e.q(outputStream, size);
            e.q(outputStream, dVar.f22639c);
            e.n(outputStream, j10);
            Iterator it = dVar.f22644h.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
                e.p(outputStream, 0);
            }
            for (int i10 : dVar.classes) {
                e.p(outputStream, i10);
            }
        }
    }

    public static void N(OutputStream outputStream, d[] dVarArr) {
        byte[] b10 = b(dVarArr, n.V009_O_MR1);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b10);
    }

    public static void O(OutputStream outputStream, d[] dVarArr) {
        byte[] b10 = b(dVarArr, n.V010_P);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b10);
    }

    public static void P(OutputStream outputStream, d[] dVarArr) {
        Q(outputStream, dVarArr);
    }

    public static void Q(OutputStream outputStream, d[] dVarArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = n.V015_S.length + MAGIC_PROF.length + 4 + (arrayList.size() * 16);
        e.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            o oVar = (o) arrayList.get(i10);
            e.q(outputStream, oVar.f22671a.b());
            e.q(outputStream, length2);
            if (oVar.f22673c) {
                byte[] bArr = oVar.mContents;
                long length3 = bArr.length;
                byte[] b10 = e.b(bArr);
                arrayList2.add(b10);
                e.q(outputStream, b10.length);
                e.q(outputStream, length3);
                length = b10.length;
            } else {
                arrayList2.add(oVar.mContents);
                e.q(outputStream, oVar.mContents.length);
                e.q(outputStream, 0L);
                length = oVar.mContents.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    public static int a(d dVar) {
        Iterator it = dVar.f22644h.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return i10;
    }

    public static byte[] b(d[] dVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (d dVar : dVarArr) {
            i11 += e.k(j(dVar.f22637a, dVar.f22638b, bArr)) + 16 + (dVar.f22641e * 2) + dVar.f22642f + k(dVar.f22643g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, n.V009_O_MR1)) {
            int length = dVarArr.length;
            while (i10 < length) {
                d dVar2 = dVarArr[i10];
                H(byteArrayOutputStream, dVar2, j(dVar2.f22637a, dVar2.f22638b, bArr));
                G(byteArrayOutputStream, dVar2);
                i10++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                H(byteArrayOutputStream, dVar3, j(dVar3.f22637a, dVar3.f22638b, bArr));
            }
            int length2 = dVarArr.length;
            while (i10 < length2) {
                G(byteArrayOutputStream, dVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static o c(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < dVarArr.length; i11++) {
            try {
                d dVar = dVarArr[i11];
                e.p(byteArrayOutputStream, i11);
                e.p(byteArrayOutputStream, dVar.f22641e);
                i10 = i10 + 4 + (dVar.f22641e * 2);
                D(byteArrayOutputStream, dVar);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            o oVar = new o(f.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return oVar;
        }
        throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static o d(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < dVarArr.length; i11++) {
            try {
                d dVar = dVarArr[i11];
                int a10 = a(dVar);
                byte[] e10 = e(a10, dVar);
                byte[] f10 = f(dVar);
                e.p(byteArrayOutputStream, i11);
                int length = e10.length + 2 + f10.length;
                e.q(byteArrayOutputStream, length);
                e.p(byteArrayOutputStream, a10);
                byteArrayOutputStream.write(e10);
                byteArrayOutputStream.write(f10);
                i10 = i10 + 6 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            o oVar = new o(f.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return oVar;
        }
        throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(int i10, d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i10, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static byte[] f(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    public static d i(d[] dVarArr, String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h10 = h(str);
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            if (dVarArr[i10].f22638b.equals(h10)) {
                return dVarArr[i10];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String a10 = n.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a10);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a10);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + n.a(bArr) + str2;
    }

    public static int k(int i10) {
        return z(i10 * 2) / 8;
    }

    public static int l(int i10, int i11) {
        return z(Integer.bitCount(i10 & (-2)) * i11) / 8;
    }

    public static int m(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw e.c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw e.c("Unexpected flag: " + i10);
    }

    public static int[] n(InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += e.h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static int o(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(m(2, i10, i11)) ? 2 : 0;
        return bitSet.get(m(4, i10, i11)) ? i12 | 4 : i12;
    }

    public static byte[] p(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, n.V010_P.length);
        }
        throw e.c("Invalid magic");
    }

    public static void q(InputStream inputStream, d dVar) {
        int available = inputStream.available() - dVar.f22642f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += e.h(inputStream);
            dVar.f22644h.put(Integer.valueOf(i10), 1);
            for (int h10 = e.h(inputStream); h10 > 0; h10--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    public static d[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) {
        if (Arrays.equals(bArr, n.METADATA_V001_N)) {
            if (Arrays.equals(n.V015_S, bArr2)) {
                throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, dVarArr);
        }
        if (Arrays.equals(bArr, n.METADATA_V002)) {
            return u(inputStream, bArr2, dVarArr);
        }
        throw e.c("Unsupported meta version");
    }

    public static d[] s(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        if (!Arrays.equals(bArr, n.METADATA_V001_N)) {
            throw e.c("Unsupported meta version");
        }
        int j10 = e.j(inputStream);
        byte[] e10 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
        try {
            d[] t10 = t(byteArrayInputStream, j10, dVarArr);
            byteArrayInputStream.close();
            return t10;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static d[] t(InputStream inputStream, int i10, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i10 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int h10 = e.h(inputStream);
            iArr[i11] = e.h(inputStream);
            strArr[i11] = e.f(inputStream, h10);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            d dVar = dVarArr[i12];
            if (!dVar.f22638b.equals(strArr[i12])) {
                throw e.c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            dVar.f22641e = i13;
            dVar.classes = n(inputStream, i13);
        }
        return dVarArr;
    }

    public static d[] u(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        int h10 = e.h(inputStream);
        byte[] e10 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
        try {
            d[] v10 = v(byteArrayInputStream, bArr, h10, dVarArr);
            byteArrayInputStream.close();
            return v10;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static d[] v(InputStream inputStream, byte[] bArr, int i10, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i10 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            e.h(inputStream);
            String f10 = e.f(inputStream, e.h(inputStream));
            long i12 = e.i(inputStream);
            int h10 = e.h(inputStream);
            d i13 = i(dVarArr, f10);
            if (i13 == null) {
                throw e.c("Missing profile key: " + f10);
            }
            i13.f22640d = i12;
            int[] n10 = n(inputStream, h10);
            if (Arrays.equals(bArr, n.V001_N)) {
                i13.f22641e = h10;
                i13.classes = n10;
            }
        }
        return dVarArr;
    }

    public static void w(InputStream inputStream, d dVar) {
        BitSet valueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f22643g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = dVar.f22643g;
            if (i10 >= i11) {
                return;
            }
            int o10 = o(valueOf, i10, i11);
            if (o10 != 0) {
                Integer num = (Integer) dVar.f22644h.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                dVar.f22644h.put(Integer.valueOf(i10), Integer.valueOf(o10 | num.intValue()));
            }
            i10++;
        }
    }

    public static d[] x(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, n.V010_P)) {
            throw e.c("Unsupported version");
        }
        int j10 = e.j(inputStream);
        byte[] e10 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
        try {
            d[] y10 = y(byteArrayInputStream, str, j10);
            byteArrayInputStream.close();
            return y10;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static d[] y(InputStream inputStream, String str, int i10) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int h10 = e.h(inputStream);
            int h11 = e.h(inputStream);
            dVarArr[i11] = new d(str, e.f(inputStream, h10), e.i(inputStream), 0L, h11, (int) e.i(inputStream), (int) e.i(inputStream), new int[h11], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            d dVar = dVarArr[i12];
            q(inputStream, dVar);
            dVar.classes = n(inputStream, dVar.f22641e);
            w(inputStream, dVar);
        }
        return dVarArr;
    }

    public static int z(int i10) {
        return (i10 + 7) & (-8);
    }
}
