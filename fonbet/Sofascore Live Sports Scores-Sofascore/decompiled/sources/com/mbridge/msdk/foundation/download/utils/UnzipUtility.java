package com.mbridge.msdk.foundation.download.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    private static final String TAG = "UnzipUtility";

    private void extractFile(ZipInputStream zipInputStream, String str) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = zipInputStream.read(bArr);
                if (read == -1) {
                    bufferedOutputStream.close();
                    return;
                }
                bufferedOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e2) {
            e = e2;
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00f5, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00f9, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00fa, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b(com.mbridge.msdk.foundation.download.utils.UnzipUtility.TAG, r12.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0112, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0116, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0117, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b(com.mbridge.msdk.foundation.download.utils.UnzipUtility.TAG, r12.getMessage());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int unzip(String str, String str2) throws IOException {
        InputStream inputStream;
        InputStream inputStream2;
        ?? r8;
        String str3;
        if (str == null || str2 == null) {
            return -1;
        }
        if (!str2.endsWith("/")) {
            str2 = str2.concat("/");
        }
        File file = new File(str);
        if (!file.exists()) {
            return 1;
        }
        InputStream inputStream3 = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            ?? r5 = 0;
            while (entries.hasMoreElements()) {
                try {
                    try {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement == null) {
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e) {
                                    q0.b(TAG, e.getMessage());
                                }
                            }
                            if (r5 != 0) {
                                try {
                                    r5.close();
                                } catch (IOException e2) {
                                    q0.b(TAG, e2.getMessage());
                                }
                            }
                            return 2;
                        }
                        String name = nextElement.getName();
                        if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                            File file2 = new File(str2 + name);
                            try {
                                str3 = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                str3 = "";
                            }
                            if (!TextUtils.isEmpty(str3) && str3.startsWith(str2) && !str3.startsWith("..") && !str3.startsWith("../")) {
                                if (nextElement.isDirectory()) {
                                    file2.mkdirs();
                                } else {
                                    if (!file2.getParentFile().exists()) {
                                        file2.getParentFile().mkdirs();
                                    }
                                    r8 = new FileOutputStream(file2);
                                    try {
                                        inputStream3 = zipFile.getInputStream(nextElement);
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int read = inputStream3.read(bArr, 0, 1024);
                                            if (read == -1) {
                                                break;
                                            }
                                            r8.write(bArr, 0, read);
                                            r8.flush();
                                        }
                                        r5 = r8;
                                    } catch (IOException e3) {
                                        e = e3;
                                        try {
                                            q0.b(TAG, e.getMessage());
                                            if (inputStream3 != null) {
                                            }
                                            if (r8 != 0) {
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            inputStream = inputStream3;
                                            inputStream3 = r8;
                                            r8 = inputStream3;
                                            inputStream3 = inputStream;
                                            if (inputStream3 != null) {
                                            }
                                            if (r8 == 0) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (inputStream3 != null) {
                                        }
                                        if (r8 == 0) {
                                        }
                                    }
                                }
                            }
                            if (r5 != 0) {
                                try {
                                    r5.close();
                                } catch (IOException e4) {
                                    q0.b(TAG, e4.getMessage());
                                }
                            }
                            return 2;
                        }
                        if (r5 != 0) {
                            try {
                                r5.close();
                            } catch (IOException e5) {
                                q0.b(TAG, e5.getMessage());
                            }
                        }
                        return 2;
                    } catch (IOException e6) {
                        e = e6;
                        inputStream2 = inputStream3;
                        inputStream3 = r5;
                        r8 = inputStream3;
                        inputStream3 = inputStream2;
                        q0.b(TAG, e.getMessage());
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e7) {
                                q0.b(TAG, e7.getMessage());
                            }
                        }
                        if (r8 != 0) {
                            return 3;
                        }
                        try {
                            r8.close();
                            return 3;
                        } catch (IOException e8) {
                            q0.b(TAG, e8.getMessage());
                            return 3;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = inputStream3;
                    inputStream3 = r5;
                    r8 = inputStream3;
                    inputStream3 = inputStream;
                    if (inputStream3 != null) {
                        try {
                            inputStream3.close();
                        } catch (IOException e9) {
                            q0.b(TAG, e9.getMessage());
                        }
                    }
                    if (r8 == 0) {
                        throw th;
                    }
                    try {
                        r8.close();
                        throw th;
                    } catch (IOException e10) {
                        q0.b(TAG, e10.getMessage());
                        throw th;
                    }
                }
            }
            zipFile.close();
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (IOException e11) {
                    q0.b(TAG, e11.getMessage());
                }
            }
            if (r5 != 0) {
                try {
                    r5.close();
                } catch (IOException e12) {
                    q0.b(TAG, e12.getMessage());
                }
            }
            return 0;
        } catch (IOException e13) {
            e = e13;
            inputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }
}
