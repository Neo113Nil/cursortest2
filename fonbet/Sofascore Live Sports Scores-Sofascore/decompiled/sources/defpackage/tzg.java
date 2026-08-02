package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class tzg implements SharedPreferences {
    public SharedPreferences a;
    public ql b;

    public tzg(Context context) {
        if (this.a == null) {
            this.a = TextUtils.isEmpty("secure_prefs") ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences("secure_prefs", 0);
        }
        if (!TextUtils.isEmpty("secret_key")) {
            try {
                this.b = rl.d("secret_key", g(context).getBytes());
                return;
            } catch (GeneralSecurityException e) {
                yhk.q(e);
                throw null;
            }
        }
        try {
            String i = i(rl.d(context.getPackageName(), g(context).getBytes()).toString());
            String string = this.a.getString(i, null);
            if (string != null) {
                this.b = rl.e(string);
                return;
            }
            rl.c();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey generateKey = keyGenerator.generateKey();
            rl.c();
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            ql qlVar = new ql(generateKey, new SecretKeySpec(bArr, "HmacSHA256"));
            this.b = qlVar;
            this.a.edit().putString(i, qlVar.toString()).commit();
        } catch (GeneralSecurityException e2) {
            yhk.q(e2);
            throw null;
        }
    }

    public static String i(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return rl.a(new ol(str), this.b);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    public final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return rl.b(str, this.b).toString();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    public final boolean c(String str, boolean z) {
        String string = this.a.getString(i(str), null);
        if (string == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(a(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.a.contains(i(str));
    }

    public final float d(String str, float f) {
        String string = this.a.getString(i(str), null);
        if (string == null) {
            return f;
        }
        try {
            return Float.parseFloat(a(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public final int e(String str, int i) {
        String string = this.a.getString(i(str), null);
        if (string == null) {
            return i;
        }
        try {
            return Integer.parseInt(a(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new szg(this);
    }

    public final long f(String str, long j) {
        String string = this.a.getString(i(str), null);
        if (string == null) {
            return j;
        }
        try {
            return Long.parseLong(a(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public final String g(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        try {
            String str = (String) Build.class.getField("SERIAL").get(null);
            return TextUtils.isEmpty(str) ? Settings.Secure.getString(context.getContentResolver(), "android_id") : str;
        } catch (Exception unused) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        Map<String, ?> all = this.a.getAll();
        HashMap hashMap = new HashMap(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            try {
                Object value = entry.getValue();
                if (value != null && !value.equals(this.b.toString())) {
                    hashMap.put(entry.getKey(), a(value.toString()));
                }
            } catch (Exception unused) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        try {
            return c(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        try {
            return d(str, f);
        } catch (Exception unused) {
            return f;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        try {
            return e(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        try {
            return f(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        try {
            return h(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set<String> stringSet = this.a.getStringSet(i(str), null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    public final String h(String str, String str2) {
        String string = this.a.getString(i(str), null);
        String a = a(string);
        return (string == null || a == null) ? str2 : a;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
