package com.huawei.hms.device;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.common.Base64;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: X509CertUtil.java */
/* loaded from: classes13.dex */
public class a {
    public static boolean a(X509Certificate x509Certificate, List<X509Certificate> list) {
        if (list == null || list.size() == 0 || x509Certificate == null) {
            return false;
        }
        PublicKey publicKey = x509Certificate.getPublicKey();
        for (X509Certificate x509Certificate2 : list) {
            if (x509Certificate2 != null) {
                try {
                    x509Certificate2.checkValidity();
                    x509Certificate2.verify(publicKey);
                    publicKey = x509Certificate2.getPublicKey();
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e) {
                    e.getMessage();
                }
            }
            return false;
        }
        return a(list);
    }

    public static List<X509Certificate> b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    private static List<String> c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            e.getMessage();
            return Collections.EMPTY_LIST;
        }
    }

    public static List<X509Certificate> b(String str) {
        return b(c(str));
    }

    public static boolean b(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(a(x509Certificate.getSubjectDN().getName(), str));
    }

    public static boolean b(X509Certificate x509Certificate, String str) {
        return b(x509Certificate, "OU", str);
    }

    public static X509Certificate a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(Base64.decode(str));
        } catch (IllegalArgumentException e) {
            e.getMessage();
            return null;
        }
    }

    public static X509Certificate a(byte[] bArr) {
        try {
            return (X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            e.getMessage();
            return null;
        }
    }

    private static String a(String str, String str2) {
        int indexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2 + "=");
        if (indexOf == -1) {
            return null;
        }
        int indexOf2 = str.indexOf(StringUtils.COMMA, indexOf);
        if (indexOf2 != -1) {
            return str.substring(str2.length() + indexOf + 1, indexOf2);
        }
        return str.substring(str2.length() + indexOf + 1);
    }

    public static boolean a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (5 < keyUsage.length) {
            return keyUsage[5];
        }
        return false;
    }

    public static boolean a(List<X509Certificate> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (!a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(X509Certificate x509Certificate, String str) {
        return b(x509Certificate, "CN", str);
    }

    public static boolean a(X509Certificate x509Certificate, String str, String str2) {
        try {
            return a(x509Certificate, str.getBytes(C.UTF8_NAME), Base64.decode(str2));
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            e.getMessage();
            return false;
        }
    }

    public static boolean a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            e.getMessage();
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0037: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:38:0x0037 */
    public static X509Certificate a(Context context, String str) {
        InputStream inputStream;
        InputStream inputStream2;
        KeyStore keyStore;
        InputStream inputStream3 = null;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        keyStore = KeyStore.getInstance("bks");
                        inputStream2 = context.getAssets().open("hmsrootcas.bks");
                        try {
                            keyStore.load(inputStream2, "".toCharArray());
                        } catch (IOException e) {
                            e = e;
                            e.getMessage();
                            IOUtils.closeQuietly(inputStream2);
                            return null;
                        } catch (KeyStoreException e2) {
                            e = e2;
                            e.getMessage();
                            IOUtils.closeQuietly(inputStream2);
                            return null;
                        } catch (NoSuchAlgorithmException e3) {
                            e = e3;
                            e.getMessage();
                            IOUtils.closeQuietly(inputStream2);
                            return null;
                        } catch (CertificateException e4) {
                            e = e4;
                            e.getMessage();
                            IOUtils.closeQuietly(inputStream2);
                            return null;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        inputStream2 = null;
                        e.getMessage();
                        IOUtils.closeQuietly(inputStream2);
                        return null;
                    } catch (KeyStoreException e6) {
                        e = e6;
                        inputStream2 = null;
                        e.getMessage();
                        IOUtils.closeQuietly(inputStream2);
                        return null;
                    } catch (NoSuchAlgorithmException e7) {
                        e = e7;
                        inputStream2 = null;
                        e.getMessage();
                        IOUtils.closeQuietly(inputStream2);
                        return null;
                    } catch (CertificateException e8) {
                        e = e8;
                        inputStream2 = null;
                        e.getMessage();
                        IOUtils.closeQuietly(inputStream2);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        IOUtils.closeQuietly(inputStream3);
                        throw th;
                    }
                    if (!keyStore.containsAlias(str)) {
                        HMSPackageManager.getInstance(context).setUseOldCertificate(true);
                        IOUtils.closeQuietly(inputStream2);
                        return null;
                    }
                    Certificate certificate = keyStore.getCertificate(str);
                    if (!(certificate instanceof X509Certificate)) {
                        IOUtils.closeQuietly(inputStream2);
                        return null;
                    }
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    x509Certificate.checkValidity();
                    IOUtils.closeQuietly(inputStream2);
                    return x509Certificate;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream3 = inputStream;
            }
        }
        return null;
    }

    public static X509Certificate a(Context context) {
        return a(context, "052root");
    }
}
