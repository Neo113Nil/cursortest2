package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.a70;
import defpackage.b1l;
import defpackage.cp4;
import defpackage.fn0;
import defpackage.is8;
import defpackage.me4;
import defpackage.njn;
import defpackage.ojn;
import defpackage.pjn;
import defpackage.qjn;
import defpackage.vp2;
import defpackage.wt3;
import defpackage.x5n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zzasy {
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile;
        Pair a;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                a = null;
            } else {
                a = zzasz.a(randomAccessFile2, 0);
                if (a == null) {
                    a = zzasz.a(randomAccessFile2, 65535);
                }
            }
        } catch (Throwable th) {
            th = th;
            randomAccessFile = randomAccessFile2;
        }
        try {
            if (a == null) {
                long length = randomAccessFile2.length();
                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new zzasv(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) a.first;
            long longValue = ((Long) a.second).longValue();
            long j = (-20) + longValue;
            if (j >= 0) {
                randomAccessFile2.seek(j);
                if (randomAccessFile2.readInt() == 1347094023) {
                    throw new zzasv("ZIP64 APK not supported");
                }
            }
            zzasz.b(byteBuffer);
            long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j2 >= longValue) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 82 + String.valueOf(longValue).length());
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(j2);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new zzasv(sb2.toString());
            }
            zzasz.b(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j2 != longValue) {
                throw new zzasv("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j2 < 32) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 67);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(j2);
                throw new zzasv(sb3.toString());
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile2.seek(j2 - allocate.capacity());
            randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new zzasv("No APK Signing Block before ZIP Central Directory");
            }
            long j3 = allocate.getLong(0);
            if (j3 < allocate.capacity() || j3 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(j3).length() + 37);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j3);
                throw new zzasv(sb4.toString());
            }
            int i = (int) (8 + j3);
            long j4 = j2 - i;
            if (j4 < 0) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(j4).length() + 39);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j4);
                throw new zzasv(sb5.toString());
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(byteOrder);
            randomAccessFile2.seek(j4);
            long j5 = j2;
            randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j6 = allocate2.getLong(0);
            if (j6 != j3) {
                StringBuilder sb6 = new StringBuilder(String.valueOf(j6).length() + 63 + String.valueOf(j3).length());
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j6);
                sb6.append(" vs ");
                sb6.append(j3);
                throw new zzasv(sb6.toString());
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j4));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            randomAccessFile = randomAccessFile2;
            if (capacity < 8) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(capacity).length() + 17);
                sb7.append("end < start: ");
                sb7.append(capacity);
                sb7.append(" < 8");
                throw new IllegalArgumentException(sb7.toString());
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(String.valueOf(capacity).length() + 19 + String.valueOf(capacity2).length());
                sb8.append("end > capacity: ");
                sb8.append(capacity);
                sb8.append(" > ");
                sb8.append(capacity2);
                throw new IllegalArgumentException(sb8.toString());
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i2 = 0;
                while (slice.hasRemaining()) {
                    i2++;
                    if (slice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(String.valueOf(i2).length() + 59);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i2);
                        throw new zzasv(sb9.toString());
                    }
                    long j7 = slice.getLong();
                    if (j7 < 4 || j7 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i2).length() + 45 + String.valueOf(j7).length());
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i2);
                        sb10.append(" size out of range: ");
                        sb10.append(j7);
                        throw new zzasv(sb10.toString());
                    }
                    int i3 = (int) j7;
                    int position2 = slice.position() + i3;
                    if (i3 > slice.remaining()) {
                        int remaining = slice.remaining();
                        StringBuilder sb11 = new StringBuilder(String.valueOf(i2).length() + 45 + String.valueOf(i3).length() + 13 + String.valueOf(remaining).length());
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i2);
                        sb11.append(" size out of range: ");
                        sb11.append(i3);
                        sb11.append(", available: ");
                        sb11.append(remaining);
                        throw new zzasv(sb11.toString());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] b = b(randomAccessFile.getChannel(), new pjn(h(i3 - 4, slice), longValue2, j5, longValue, byteBuffer));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return b;
                    }
                    long j8 = j5;
                    slice.position(position2);
                    j5 = j8;
                }
                throw new zzasv("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th2) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static X509Certificate[][] b(FileChannel fileChannel, pjn pjnVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer i = i(pjnVar.a);
                int i2 = 0;
                while (i.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(c(i(i), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(fn0.k(i2, "Failed to parse/verify signer #", " block", new StringBuilder(String.valueOf(i2).length() + 37)), e);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j = pjnVar.b;
                long j2 = pjnVar.c;
                long j3 = pjnVar.d;
                ByteBuffer byteBuffer = pjnVar.e;
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                ojn ojnVar = new ojn(fileChannel, 0L, j, 0);
                ojn ojnVar2 = new ojn(fileChannel, j2, j3 - j2, 0);
                ByteBuffer duplicate = byteBuffer.duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                zzasz.b(duplicate);
                int position = duplicate.position() + 16;
                if (j < 0 || j > 4294967295L) {
                    a70.p(x5n.m(j, "uint32 value of out range: ", new StringBuilder(String.valueOf(j).length() + 27)));
                    return null;
                }
                duplicate.putInt(duplicate.position() + position, (int) j);
                b1l b1lVar = new b1l(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    iArr[i3] = ((Integer) it.next()).intValue();
                    i3++;
                }
                try {
                    byte[][] d = d(iArr, new njn[]{ojnVar, ojnVar2, b1lVar});
                    for (int i4 = 0; i4 < size; i4++) {
                        int i5 = iArr[i4];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i5)), d[i4])) {
                            throw new SecurityException(f(i5).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            vp2.e("Failed to obtain X.509 CertificateFactory", e4);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = e(r6);
        r12 = e(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] c(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer i = i(byteBuffer);
        ByteBuffer i2 = i(byteBuffer);
        byte[] j = j(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i3 = -1;
        int i4 = 0;
        while (i2.hasRemaining()) {
            i4++;
            try {
                ByteBuffer i5 = i(i2);
                if (i5.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i6 = i5.getInt();
                arrayList.add(Integer.valueOf(i6));
                if (i6 != 513 && i6 != 514 && i6 != 769) {
                    switch (i6) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr = j(i5);
                i3 = i6;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(me4.g(i4, "Failed to parse signature record #", new StringBuilder(String.valueOf(i4).length() + 34)), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(me4.g(i4, "Failed to parse signature record #", new StringBuilder(String.valueOf(i4).length() + 34)), e);
            }
        }
        if (i3 == -1) {
            if (i4 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i3 == 513 || i3 == 514) {
            str = "EC";
        } else if (i3 != 769) {
            switch (i3) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    a70.p("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i3))));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i3 == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i3 == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i3 != 769) {
            switch (i3) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    a70.p("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i3))));
                    return null;
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(j));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(i);
            if (!signature.verify(bArr)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            i.clear();
            ByteBuffer i7 = i(i);
            ArrayList arrayList2 = new ArrayList();
            byte[] bArr2 = null;
            int i8 = 0;
            while (i7.hasRemaining()) {
                i8++;
                try {
                    ByteBuffer i9 = i(i7);
                    if (i9.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i10 = i9.getInt();
                    arrayList2.add(Integer.valueOf(i10));
                    if (i10 == i3) {
                        bArr2 = j(i9);
                    }
                } catch (IOException e3) {
                    e = e3;
                    cp4.i(me4.g(i8, "Failed to parse digest record #", new StringBuilder(String.valueOf(i8).length() + 31)), e);
                    return null;
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    cp4.i(me4.g(i8, "Failed to parse digest record #", new StringBuilder(String.valueOf(i8).length() + 31)), e);
                    return null;
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int e5 = e(i3);
            byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(e5), bArr2);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr2)) {
                throw new SecurityException(f(e5).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer i11 = i(i);
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (i11.hasRemaining()) {
                i12++;
                byte[] j2 = j(i11);
                try {
                    arrayList3.add(new qjn((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(j2)), j2, 0));
                } catch (CertificateException e6) {
                    throw new SecurityException(me4.g(i12, "Failed to decode certificate #", new StringBuilder(String.valueOf(i12).length() + 30)), e6);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(j, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        } catch (InvalidKeyException e8) {
            e = e8;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        } catch (NoSuchAlgorithmException e9) {
            e = e9;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        } catch (SignatureException e10) {
            e = e10;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        } catch (InvalidKeySpecException e11) {
            e = e11;
            throw new SecurityException(wt3.m("Failed to verify ", str2, new StringBuilder(String.valueOf(str2).length() + 27), " signature"), e);
        }
    }

    public static byte[][] d(int[] iArr, njn[] njnVarArr) {
        long j;
        int i;
        int length;
        char c;
        byte[][] bArr;
        String str;
        int i2 = 0;
        long j2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j2 += (njnVarArr[i2].zza() + 1048575) / 1048576;
            i2++;
        }
        if (j2 >= 2097151) {
            throw new DigestException(x5n.m(j2, "Too many chunks: ", new StringBuilder(String.valueOf(j2).length() + 17)));
        }
        byte[][] bArr2 = new byte[iArr.length][];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i3 >= length) {
                break;
            }
            int i4 = (int) j2;
            byte[] bArr3 = new byte[(g(iArr[i3]) * i4) + 5];
            bArr3[0] = 90;
            k(i4, bArr3);
            bArr2[i3] = bArr3;
            i3++;
        }
        byte[] bArr4 = new byte[5];
        bArr4[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i5 = 0;
        while (true) {
            bArr = null;
            str = " digest not supported";
            if (i5 >= iArr.length) {
                break;
            }
            String f = f(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(f);
                i5++;
            } catch (NoSuchAlgorithmException e) {
                vp2.e(f.concat(" digest not supported"), e);
                return null;
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            njn njnVar = njnVarArr[i6];
            int i9 = i6;
            long zza = njnVar.zza();
            long j3 = 0;
            while (zza > 0) {
                byte[][] bArr5 = bArr;
                String str2 = str;
                int min = (int) Math.min(zza, j);
                k(min, bArr4);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr4);
                }
                try {
                    njnVar.a(messageDigestArr, j3, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr6 = bArr2[i11];
                        int g = g(i12);
                        char c2 = c;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        njn njnVar2 = njnVar;
                        int digest = messageDigest.digest(bArr6, (i7 * g) + 5, g);
                        if (digest != g) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(digest).length());
                            sb.append("Unexpected output size of ");
                            sb.append(algorithm);
                            sb.append(" digest: ");
                            sb.append(digest);
                            throw new RuntimeException(sb.toString());
                        }
                        i11++;
                        c = c2;
                        njnVar = njnVar2;
                    }
                    long j4 = min;
                    j3 += j4;
                    zza -= j4;
                    i7++;
                    bArr = bArr5;
                    str = str2;
                    j = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(x5n.n(new StringBuilder(String.valueOf(i7).length() + 37 + String.valueOf(i8).length()), i7, "Failed to digest chunk #", i8, " of section #"), e2);
                }
            }
            i8++;
            i6 = i9 + 1;
            j = 1048576;
        }
        byte[][] bArr7 = bArr;
        String str3 = str;
        byte[][] bArr8 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr9 = bArr2[i13];
            String f2 = f(i14);
            try {
                bArr8[i13] = MessageDigest.getInstance(f2).digest(bArr9);
            } catch (NoSuchAlgorithmException e3) {
                vp2.e(f2.concat(str3), e3);
                return bArr7;
            }
        }
        return bArr8;
    }

    public static int e(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                a70.p("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                return 0;
        }
    }

    public static String f(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        a70.p(me4.g(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
        return null;
    }

    public static int g(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        a70.p(me4.g(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
        return 0;
    }

    public static ByteBuffer h(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer i(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            is8.e(me4.g(remaining, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", new StringBuilder(String.valueOf(remaining).length() + 82)));
            return null;
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            a70.p("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return h(i, byteBuffer);
        }
        int remaining2 = byteBuffer.remaining();
        is8.e(x5n.n(new StringBuilder(String.valueOf(i).length() + 79 + String.valueOf(remaining2).length()), i, "Length-prefixed field longer than remaining buffer. Field length: ", remaining2, ", remaining: "));
        return null;
    }

    public static byte[] j(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            is8.e("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        is8.e(x5n.n(new StringBuilder(String.valueOf(i).length() + 68 + String.valueOf(remaining).length()), i, "Underflow while reading length-prefixed value. Length: ", remaining, ", available: "));
        return null;
    }

    public static void k(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }
}
