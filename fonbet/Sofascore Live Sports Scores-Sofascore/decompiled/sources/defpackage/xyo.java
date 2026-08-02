package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xyo {
    public static final byte[] c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    public static final byte[] d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    public final byte[] a = d;
    public final byte[] b = c;

    public final boolean a(File file) {
        try {
            X509Certificate[][] M = i2a.M(file.getAbsolutePath());
            if (M.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(M[0][0].getEncoded());
                return Arrays.equals(this.b, digest) || (!"user".equals(Build.TYPE) && Arrays.equals(this.a, digest));
            }
            zzl.x("APK has more than one signature.");
            return false;
        } catch (f2o e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
