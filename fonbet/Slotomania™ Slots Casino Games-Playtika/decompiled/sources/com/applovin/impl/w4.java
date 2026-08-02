package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.ironsource.B5;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.ktor.util.date.GMTDateParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import kotlinx.io.files.FileSystemKt;

/* loaded from: classes3.dex */
public abstract class w4 {
    private static final byte[] a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};
    private static final byte[] b;

    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);

        private final int a;

        a(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }

        public static a a(int i) {
            return i == 0 ? DEFAULT : i == 1 ? V2 : DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        b = bArr;
        System.arraycopy(new byte[]{Ascii.DC2, Ascii.FF, Ascii.FS, Ascii.DC4, 17, Ascii.ETB, Ascii.SUB, 9, Ascii.NAK, 3, Ascii.SO, Ascii.GS, 4, 0, 2, 7, 10, Ascii.GS, 6, Ascii.DC4, 1}, 0, bArr, 0, 21);
    }

    public static byte[] a(String str, long j, a aVar, com.applovin.impl.sdk.l lVar) {
        String k0 = lVar.k0();
        if (k0 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (k0.length() >= 86) {
            return TextUtils.isEmpty(str) ? new byte[0] : a.NONE == aVar ? str.getBytes() : a.V2 == aVar ? a(str, j, false, k0, lVar) : a(str, j, k0, lVar);
        }
        throw new IllegalArgumentException("SDK key is too short");
    }

    public static String b(String str, long j, a aVar, com.applovin.impl.sdk.l lVar) {
        String k0 = lVar.k0();
        if (k0 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (k0.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] a2 = a.V2 == aVar ? a(str, j, true, k0, lVar) : a(str, j, k0, lVar);
        if (a2 != null) {
            return new String(a2);
        }
        return null;
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    private static byte[] a(String str, long j, String str2, com.applovin.impl.sdk.l lVar) {
        char c = ' ';
        try {
            String substring = str2.substring(32);
            byte b2 = 0;
            String substring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            byte[] a2 = a(substring2, a, lVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j & 255)) ^ a2[0]);
            char c2 = '\b';
            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ a2[1]);
            char c3 = 16;
            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ a2[2]);
            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ a2[3]);
            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ a2[4]);
            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ a2[5]);
            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ a2[6]);
            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ a2[7]);
            int i = 0;
            while (i < bytes.length) {
                char c4 = c2;
                char c5 = c3;
                long j2 = j + i;
                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                long j5 = j4 ^ (j4 >> c);
                char c6 = c;
                byteArrayOutputStream.write((byte) (((i >= bytes.length ? b2 : bytes[i]) ^ a2[i % a2.length]) ^ (j5 & 255)));
                byteArrayOutputStream.write((byte) ((a2[r5 % a2.length] ^ (i + 1 >= bytes.length ? (byte) 0 : bytes[r5])) ^ ((j5 >> c4) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r5 % a2.length] ^ (i + 2 >= bytes.length ? (byte) 0 : bytes[r5])) ^ ((j5 >> c5) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r5 % a2.length] ^ (i + 3 >= bytes.length ? (byte) 0 : bytes[r5])) ^ ((j5 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r5 % a2.length] ^ (i + 4 >= bytes.length ? (byte) 0 : bytes[r5])) ^ ((j5 >> c6) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r5 % a2.length] ^ (i + 5 >= bytes.length ? (byte) 0 : bytes[r5])) ^ ((j5 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r5 % a2.length] ^ (i + 6 >= bytes.length ? (byte) 0 : bytes[r5])) ^ ((j5 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((a2[r5 % a2.length] ^ (i + 7 >= bytes.length ? (byte) 0 : bytes[r5])) ^ ((j5 >> 56) & 255)));
                i += 8;
                c2 = c4;
                c3 = c5;
                c = c6;
                b2 = 0;
            }
            return ("1:" + a(a, lVar) + ":" + substring + ":" + c(byteArrayOutputStream.toByteArray())).getBytes(C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            a(str, "encode", e, lVar);
            return null;
        }
    }

    public static String b(byte[] bArr, com.applovin.impl.sdk.l lVar) {
        String k0 = lVar.k0();
        if (k0 != null) {
            if (k0.length() < 86) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return "";
            }
            a b2 = b(bArr);
            if (a.NONE == b2) {
                return new String(bArr);
            }
            if (b2 == a.V2) {
                return a(bArr, k0, lVar);
            }
            return a(new String(bArr), k0, lVar);
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c = (char) bArr[0];
            if (c == '2') {
                return a.V2;
            }
            if (c == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static int b(byte[] bArr, String str, com.applovin.impl.sdk.l lVar) {
        int a2;
        int i;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (a2 = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(b, lVar).getBytes();
        int i2 = a2 + 1;
        int length = bytes.length + i2;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i = length + 55) || bArr[i] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i2, bytes.length + i2), bytes)) {
            return 0;
        }
        int i3 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i3;
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static byte[] a(String str, long j, boolean z, String str2, com.applovin.impl.sdk.l lVar) {
        ByteBuffer allocate;
        try {
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            int length = bytes.length;
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bArr = b;
            byte[] a2 = a(substring2, bArr, lVar);
            long c = q7.c(a2) ^ j;
            byte[] bytes2 = String.format("2:%s:%s:", a(bArr, lVar), substring).getBytes();
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putLong(length);
            allocate2.putLong(c);
            allocate2.flip();
            byte[] a3 = a(q7.a(bytes), j, a2);
            if (z) {
                byte[] bytes3 = c(allocate2.array()).getBytes();
                byte[] bytes4 = c(a3).getBytes();
                allocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                allocate.put(bytes2);
                allocate.put(bytes3);
                allocate.put(bytes4);
            } else {
                allocate = ByteBuffer.allocate(bytes2.length + allocate2.remaining() + a3.length);
                allocate.put(bytes2);
                allocate.put(allocate2);
                allocate.put(a3);
            }
            allocate.flip();
            return allocate.array();
        } catch (UnsupportedEncodingException e) {
            a(str, "encode2", e, lVar);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            a(str, "encode2", e2, lVar);
            return null;
        }
    }

    private static byte[] a(byte[] bArr, long j, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        long j2 = j;
        for (int i = 0; i < bArr.length; i++) {
            if (i % 8 == 0) {
                long j3 = i + j;
                long j4 = (j3 ^ (j3 >>> 33)) * (-4417276706812531889L);
                long j5 = (j4 ^ (j4 >>> 29)) * (-8796714831421723037L);
                j2 = j5 ^ (j5 >>> 32);
            }
            byte b2 = copyOf[i];
            copyOf[i] = (byte) (b2 ^ (((j2 >> (r4 * 8)) & 255) ^ bArr2[i % bArr2.length]));
        }
        return copyOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String a(String str, String str2, com.applovin.impl.sdk.l lVar) {
        String[] split = str.split(":");
        try {
            try {
            } catch (IOException e) {
                e = e;
            }
            try {
                if ("1".equals(split[0])) {
                    if (split.length != 4) {
                        a(str, com.moloco.sdk.internal.services.init.i.a, "Invalid response format", lVar);
                        return null;
                    }
                    String str3 = split[1];
                    char c = 2;
                    String str4 = split[2];
                    char c2 = 3;
                    byte[] b2 = b(split[3]);
                    if (!str2.endsWith(str4)) {
                        a(str, com.moloco.sdk.internal.services.init.i.a, "Invalid SDK key", lVar);
                        return null;
                    }
                    byte[] bArr = a;
                    if (a(bArr, lVar).equals(str3)) {
                        byte[] a2 = a(str2.substring(0, 32), bArr, lVar);
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b2);
                        Object[] objArr = false;
                        char c3 = '(';
                        char c4 = 7;
                        long read = (((byteArrayInputStream.read() ^ a2[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ a2[0]) & 255) | (((byteArrayInputStream.read() ^ a2[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ a2[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ a2[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ a2[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ a2[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ a2[7]) & 255) << 56);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[8];
                        int read2 = byteArrayInputStream.read(bArr2);
                        int i = 0;
                        while (read2 >= 0) {
                            char c5 = c;
                            Object[] objArr2 = objArr;
                            long j = i + read;
                            long j2 = (j ^ (j >> 33)) * (-4417276706812531889L);
                            long j3 = (j2 ^ (j2 >> 29)) * (-8796714831421723037L);
                            long j4 = j3 ^ (j3 >> 32);
                            char c6 = c4;
                            byteArrayOutputStream.write((byte) ((bArr2[objArr2 == true ? 1 : 0] ^ a2[i % a2.length]) ^ (j4 & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[1] ^ a2[(i + 1) % a2.length]) ^ ((j4 >> 8) & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[c5] ^ a2[(i + 2) % a2.length]) ^ ((j4 >> 16) & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[r27] ^ a2[(i + 3) % a2.length]) ^ ((j4 >> 24) & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[4] ^ a2[(i + 4) % a2.length]) ^ ((j4 >> 32) & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[5] ^ a2[(i + 5) % a2.length]) ^ ((j4 >> r29) & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[6] ^ a2[(i + 6) % a2.length]) ^ ((j4 >> 48) & 255)));
                            byteArrayOutputStream.write((byte) (((j4 >> 56) & 255) ^ (bArr2[c6] ^ a2[(i + 7) % a2.length])));
                            int read3 = byteArrayInputStream.read(bArr2);
                            i += 8;
                            c = c5;
                            objArr = objArr2 == true ? 1 : 0;
                            c2 = c2;
                            c3 = c3;
                            read2 = read3;
                            c4 = c6;
                        }
                        return AppLovinNetworkBridge.stringInit(byteArrayOutputStream.toByteArray(), C.UTF8_NAME).trim();
                    }
                    a(str, com.moloco.sdk.internal.services.init.i.a, "Invalid salt signature", lVar);
                    return null;
                }
                a(str, com.moloco.sdk.internal.services.init.i.a, "Invalid encoding version", lVar);
                return null;
            } catch (IOException e2) {
                e = e2;
                com.applovin.impl.sdk.p.b("AppLovinSdk", "Failed to read bytes", e);
                a(str, "decode", e, lVar);
                return null;
            }
        } catch (UnsupportedEncodingException e3) {
            a(str, "decode", e3, lVar);
            throw new RuntimeException("UTF-8 encoding not found", e3);
        }
    }

    private static String a(byte[] bArr, String str, com.applovin.impl.sdk.l lVar) {
        try {
            int b2 = b(bArr, str, lVar);
            if (b2 == 0) {
                a(new String(bArr), com.moloco.sdk.internal.services.bidtoken.s.a, "Invalid payload format", lVar);
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, b2, bArr.length);
            if (copyOfRange.length < 16) {
                a(new String(bArr), com.moloco.sdk.internal.services.bidtoken.s.a, "Payload too small", lVar);
                return null;
            }
            long a2 = q7.a(copyOfRange, 8);
            byte[] a3 = a(str.substring(0, 32), b, lVar);
            return AppLovinNetworkBridge.stringInit(q7.d(a(Arrays.copyOfRange(copyOfRange, 16, copyOfRange.length), a2 ^ q7.c(a3), a3)), C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            a(new String(bArr), "decode2", e, lVar);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            com.applovin.impl.sdk.p.b("AppLovinSdk", "Failed to ungzip decode", e2);
            a(new String(bArr), "decode2", e2, lVar);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b2) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == b2) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static void a(String str, String str2, String str3, com.applovin.impl.sdk.l lVar) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("error_message", str3);
        if (((Boolean) lVar.a(z4.O5)).booleanValue()) {
            CollectionUtils.putStringIfValid("details", str, hashMap);
        }
        lVar.E().a(f2.l1, str2, hashMap);
    }

    private static void a(String str, String str2, Throwable th, com.applovin.impl.sdk.l lVar) {
        HashMap hashMap = new HashMap(1);
        if (((Boolean) lVar.a(z4.O5)).booleanValue()) {
            CollectionUtils.putStringIfValid("details", str, hashMap);
        }
        lVar.E().a("AppLovinSdk", str2, th, hashMap);
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.l lVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes(C.UTF8_NAME));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            lVar.E().a("AppLovinSdk", "SHA256", e);
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.l lVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            lVar.E().a("AppLovinSdk", "SHA1", e);
            throw new RuntimeException("SHA-1 algorithm not found", e);
        }
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', FileSystemKt.UnixPathSeparator).replace(GMTDateParser.ANY, B5.U);
    }

    private static String a(byte[] bArr) {
        return AppLovinNetworkBridge.stringInit(bArr, C.UTF8_NAME).replace('+', '-').replace(FileSystemKt.UnixPathSeparator, '_').replace(B5.U, GMTDateParser.ANY);
    }
}
