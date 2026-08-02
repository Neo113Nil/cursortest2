package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.C4427z5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    public static final int UNKNOWN_ERR = 507;
    private static volatile PglCryptUtils pcc = null;
    private static volatile boolean sf = true;

    private PglCryptUtils() {
    }

    public static native byte[] bc(int i, byte[] bArr);

    public static PglCryptUtils getInstance() {
        if (pcc == null) {
            synchronized (PglCryptUtils.class) {
                try {
                    if (pcc == null) {
                        try {
                            System.loadLibrary("pglarmor");
                        } catch (Throwable unused) {
                            sf = false;
                        }
                        pcc = new PglCryptUtils();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Exception, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Exception, java.lang.Object] */
    private static String pcc(byte[] bArr) {
        ?? r2;
        Throwable th;
        ?? r7;
        ?? e;
        Exception exc;
        String str;
        GZIPInputStream gZIPInputStream;
        String str2 = null;
        str2 = null;
        r0 = null;
        GZIPInputStream gZIPInputStream2 = null;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                        ?? byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        } catch (Exception e2) {
                            exc = e2;
                            str = null;
                            e = byteArrayOutputStream;
                        }
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = gZIPInputStream.read(bArr2);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                            str2 = byteArrayOutputStream.toString(C4427z5.O);
                            byteArrayInputStream.close();
                            try {
                                gZIPInputStream.close();
                                byteArrayOutputStream.close();
                                bArr = byteArrayOutputStream;
                            } catch (Exception e3) {
                                e3.toString();
                                bArr = e3;
                            }
                        } catch (Exception e4) {
                            str = str2;
                            gZIPInputStream2 = gZIPInputStream;
                            exc = e4;
                            e = byteArrayOutputStream;
                            exc.toString();
                            if (gZIPInputStream2 != null) {
                                try {
                                    gZIPInputStream2.close();
                                } catch (Exception e5) {
                                    e = e5;
                                    e.toString();
                                    str2 = str;
                                    bArr = e;
                                    return str2;
                                }
                            }
                            if (e != 0) {
                                e.close();
                            }
                            str2 = str;
                            bArr = e;
                            return str2;
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = gZIPInputStream;
                            r7 = byteArrayOutputStream;
                            if (r2 != null) {
                                try {
                                    r2.close();
                                } catch (Exception e6) {
                                    e6.toString();
                                    throw th;
                                }
                            }
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                    } catch (Exception e7) {
                        e = 0;
                        exc = e7;
                        str = null;
                    } catch (Throwable th3) {
                        r2 = null;
                        th = th3;
                        r7 = 0;
                    }
                    return str2;
                }
            } catch (Throwable th4) {
                r2 = str2;
                th = th4;
                r7 = bArr;
            }
        }
        return null;
    }

    public Pair<Integer, String> cypher4Decrypt(String str) {
        byte[] bArr;
        if (!sf) {
            return new Pair<>(501, null);
        }
        if (str == null || str.length() == 0) {
            return new Pair<>(502, null);
        }
        byte[] decode = Base64.decode(str, 0);
        if (decode == null || decode.length == 0) {
            return new Pair<>(Integer.valueOf(BASE64_FAILED), null);
        }
        try {
            bArr = bc(1011, decode);
        } catch (Throwable th) {
            th.toString();
            bArr = null;
        }
        if (bArr == null || bArr.length == 0) {
            return new Pair<>(506, null);
        }
        String pcc2 = pcc(bArr);
        return TextUtils.isEmpty(pcc2) ? new Pair<>(Integer.valueOf(COMPRESS_FAILED), null) : new Pair<>(0, pcc2);
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) throws JSONException {
        Pair<Integer, String> cypher4EncryptWithNoWrapBase64 = cypher4EncryptWithNoWrapBase64(jSONObject.toString());
        if (cypher4EncryptWithNoWrapBase64 == null) {
            return new Pair<>(Integer.valueOf(UNKNOWN_ERR), null);
        }
        if (((Integer) cypher4EncryptWithNoWrapBase64.first).intValue() != 0) {
            return new Pair<>(cypher4EncryptWithNoWrapBase64.first, null);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = (String) cypher4EncryptWithNoWrapBase64.second;
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(Integer.valueOf(BASE64_FAILED), null);
        }
        jSONObject2.put(KEY_MESSAGE, str);
        jSONObject2.put("cypher", 4);
        return new Pair<>(0, jSONObject2);
    }

    public Pair<Integer, String> cypher4EncryptWithNoWrapBase64(String str) {
        if (!sf) {
            return new Pair<>(501, null);
        }
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(502, null);
        }
        byte[] pcc2 = pcc(str);
        if (pcc2 == null || pcc2.length == 0) {
            return new Pair<>(Integer.valueOf(COMPRESS_FAILED), null);
        }
        Pair<Integer, byte[]> cypher4Encrypt = cypher4Encrypt(pcc2);
        if (cypher4Encrypt == null) {
            return new Pair<>(Integer.valueOf(UNKNOWN_ERR), null);
        }
        if (((Integer) cypher4Encrypt.first).intValue() != 0) {
            return new Pair<>(cypher4Encrypt.first, null);
        }
        String encodeToString = Base64.encodeToString((byte[]) cypher4Encrypt.second, 2);
        return TextUtils.isEmpty(encodeToString) ? new Pair<>(Integer.valueOf(BASE64_FAILED), null) : new Pair<>(0, encodeToString);
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArr2;
        if (!sf) {
            return new Pair<>(501, null);
        }
        if (bArr != null && bArr.length != 0) {
            try {
                bArr2 = bc(1010, bArr);
            } catch (Throwable th) {
                th.toString();
                bArr2 = null;
            }
            if (bArr2 != null && bArr2.length != 0) {
                return new Pair<>(0, bArr2);
            }
            return new Pair<>(505, null);
        }
        return new Pair<>(502, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #5 {Exception -> 0x0055, blocks: (B:36:0x0051, B:29:0x0059), top: B:35:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] pcc(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                try {
                                    gZIPOutputStream.write(str.getBytes(C4427z5.O));
                                    gZIPOutputStream.close();
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    return byteArray;
                                } catch (Exception e) {
                                    e = e;
                                    e.toString();
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream == null) {
                                        return null;
                                    }
                                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    return byteArray2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                gZIPOutputStream2 = gZIPOutputStream;
                                if (gZIPOutputStream2 != null) {
                                    try {
                                        gZIPOutputStream2.close();
                                    } catch (Exception e2) {
                                        e2.toString();
                                        throw th;
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            gZIPOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (gZIPOutputStream2 != null) {
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        byteArrayOutputStream = null;
                        gZIPOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                }
            } catch (Exception e5) {
                e5.toString();
                return null;
            }
        }
        return null;
    }
}
