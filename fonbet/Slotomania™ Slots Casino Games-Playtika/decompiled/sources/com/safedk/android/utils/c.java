package com.safedk.android.utils;

import android.util.Base64;
import com.google.android.exoplayer2.C;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

/* loaded from: classes7.dex */
public class c {
    private static final String a = "GzipUtil";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[Catch: IOException -> 0x00ba, TryCatch #1 {IOException -> 0x00ba, blocks: (B:40:0x00b6, B:29:0x00be, B:31:0x00c3, B:33:0x00c8), top: B:39:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3 A[Catch: IOException -> 0x00ba, TryCatch #1 {IOException -> 0x00ba, blocks: (B:40:0x00b6, B:29:0x00be, B:31:0x00c3, B:33:0x00c8), top: B:39:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8 A[Catch: IOException -> 0x00ba, TRY_LEAVE, TryCatch #1 {IOException -> 0x00ba, blocks: (B:40:0x00b6, B:29:0x00be, B:31:0x00c3, B:33:0x00c8), top: B:39:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Cannot unzip null or empty bytes");
        }
        Logger.d(a, "unzip started, input size is ", Integer.valueOf(bArr.length));
        if (!b(bArr)) {
            Logger.d(a, "unzip started, input is not compressed");
            return new String(bArr);
        }
        String str = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    inputStreamReader = new InputStreamReader(gZIPInputStream, C.UTF8_NAME);
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            Logger.d(a, "unzip started, output size is ", Integer.valueOf(sb.length()));
                            str = sb.toString();
                            bufferedReader2 = bufferedReader;
                        } catch (IOException e) {
                            e = e;
                            Logger.d(a, "Exception in unzip: ", e.getMessage());
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                            }
                            if (inputStreamReader != null) {
                            }
                            if (gZIPInputStream != null) {
                            }
                            if (byteArrayInputStream != null) {
                            }
                            return str;
                        } catch (Throwable th) {
                            th = th;
                            Logger.d(a, "Exception in unzip: ", th.getMessage());
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                            }
                            if (inputStreamReader != null) {
                            }
                            if (gZIPInputStream != null) {
                            }
                            if (byteArrayInputStream != null) {
                            }
                            return str;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = 0;
                    }
                } catch (IOException e3) {
                    e = e3;
                    inputStreamReader = null;
                    bufferedReader = inputStreamReader;
                    Logger.d(a, "Exception in unzip: ", e.getMessage());
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                    }
                    if (inputStreamReader != null) {
                    }
                    if (gZIPInputStream != null) {
                    }
                    if (byteArrayInputStream != null) {
                    }
                    return str;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                    bufferedReader = inputStreamReader;
                    Logger.d(a, "Exception in unzip: ", th.getMessage());
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                    }
                    if (inputStreamReader != null) {
                    }
                    if (gZIPInputStream != null) {
                    }
                    if (byteArrayInputStream != null) {
                    }
                    return str;
                }
            } catch (IOException e4) {
                e = e4;
                gZIPInputStream = null;
                inputStreamReader = null;
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
                inputStreamReader = null;
            }
        } catch (IOException e5) {
            e = e5;
            gZIPInputStream = null;
            byteArrayInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th5) {
            th = th5;
            gZIPInputStream = null;
            byteArrayInputStream = null;
            inputStreamReader = null;
        }
        if (bufferedReader2 != null) {
            try {
                bufferedReader2.close();
            } catch (IOException e6) {
                Logger.d(a, "Exception in unzip finally block: ", e6.getMessage());
            }
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (gZIPInputStream != null) {
            gZIPInputStream.close();
        }
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
        return str;
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int[] c = c(bArr2);
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            while (i > 0 && bArr2[i] != bArr[i2]) {
                i = c[i - 1];
            }
            if (bArr2[i] == bArr[i2]) {
                i++;
            }
            if (i == bArr2.length) {
                return (i2 - bArr2.length) + 1;
            }
        }
        return -1;
    }

    private static int[] c(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i = 0;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            while (i > 0 && bArr[i] != bArr[i2]) {
                i = iArr[i - 1];
            }
            if (bArr[i] == bArr[i2]) {
                i++;
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    public static boolean b(byte[] bArr) {
        return bArr[0] == 31 && bArr[1] == -117;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPInputStream gZIPInputStream;
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] decode = Base64.decode(str, 0);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(decode));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, decode.length * 2));
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = gZIPInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        String str2 = new String(byteArrayOutputStream.toByteArray(), Charset.forName(C.UTF8_NAME));
                        try {
                            gZIPInputStream.close();
                        } catch (IOException e) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                        }
                        return str2;
                    } catch (IOException e3) {
                        e = e3;
                        Logger.d(a, "First attempt failed, trying double decode: ", e.getMessage());
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e5) {
                            }
                        }
                        byte[] decode2 = Base64.decode(new String(decode, Charset.forName(C.UTF8_NAME)), 0);
                        try {
                            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(decode2));
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, decode2.length * 2));
                                try {
                                    byte[] bArr2 = new byte[8192];
                                    while (true) {
                                        int read2 = gZIPInputStream.read(bArr2);
                                        if (read2 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, read2);
                                    }
                                    String str3 = new String(byteArrayOutputStream.toByteArray(), Charset.forName(C.UTF8_NAME));
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e6) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e7) {
                                    }
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e8) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e9) {
                                    }
                                    return str3;
                                } catch (Throwable th) {
                                    th = th;
                                    gZIPInputStream2 = gZIPInputStream;
                                    if (gZIPInputStream2 != null) {
                                        try {
                                            try {
                                                gZIPInputStream2.close();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (gZIPInputStream2 != null) {
                                                    try {
                                                        gZIPInputStream2.close();
                                                    } catch (IOException e10) {
                                                    }
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    throw th;
                                                }
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th;
                                                } catch (IOException e11) {
                                                    throw th;
                                                }
                                            }
                                        } catch (IOException e12) {
                                        }
                                    }
                                    if (byteArrayOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (IOException e13) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                byteArrayOutputStream = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = null;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    gZIPInputStream2 = gZIPInputStream;
                    if (gZIPInputStream2 != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                }
            } catch (IOException e14) {
                e = e14;
                byteArrayOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = null;
                gZIPInputStream2 = gZIPInputStream;
                if (gZIPInputStream2 != null) {
                }
                if (byteArrayOutputStream != null) {
                }
            }
        } catch (IOException e15) {
            e = e15;
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            byteArrayOutputStream = null;
            if (gZIPInputStream2 != null) {
            }
            if (byteArrayOutputStream != null) {
            }
        }
    }
}
