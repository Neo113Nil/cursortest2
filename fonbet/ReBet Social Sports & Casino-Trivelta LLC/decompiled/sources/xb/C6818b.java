package xb;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import eb.C4196f;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6818b {
    private static final String[] ALLOWABLE_SCOPES = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f68108a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68109b;

    public C6818b(C4196f c4196f) {
        this.f68108a = c4196f.l().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f68109b = b(c4196f);
    }

    public static String b(C4196f c4196f) {
        String f10 = c4196f.q().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = c4196f.q().c();
        if (!c10.startsWith("1:") && !c10.startsWith("2:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    public String f() {
        synchronized (this.f68108a) {
            try {
                String g10 = g();
                if (g10 != null) {
                    return g10;
                }
                return h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String g() {
        String string;
        synchronized (this.f68108a) {
            string = this.f68108a.getString("|S|id", null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.f68108a) {
            try {
                String string = this.f68108a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey e10 = e(string);
                if (e10 == null) {
                    return null;
                }
                return c(e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String i() {
        synchronized (this.f68108a) {
            try {
                for (String str : ALLOWABLE_SCOPES) {
                    String string = this.f68108a.getString(a(this.f68109b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
