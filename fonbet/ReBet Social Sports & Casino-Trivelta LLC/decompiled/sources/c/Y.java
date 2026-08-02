package c;

import D2.a;
import android.content.Context;
import android.content.SharedPreferences;
import com.surt.guardian.utils.Logger;
import java.io.File;
import java.security.KeyStore;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: b, reason: collision with root package name */
    public static final Cc.c f26507b = new Cc.c(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f26508a;

    public Y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26508a = context;
    }

    public final void a() {
        try {
            c().edit().clear().apply();
        } catch (Exception e10) {
            Logger.f41582a.f("SurtGuardian:PersistentId", "Failed to clear encrypted preferences: " + e10.getMessage());
            b();
        }
    }

    public final void b() {
        try {
            File file = new File(this.f26508a.getApplicationInfo().dataDir, "shared_prefs");
            File file2 = new File(file, "surt_guardian_prefs.xml");
            if (file2.exists()) {
                file2.delete();
                Logger.f41582a.d("SurtGuardian:PersistentId", "Deleted corrupted preferences XML file");
            }
            File file3 = new File(file, "__androidx_security_crypto_encrypted_prefs__.xml");
            if (file3.exists()) {
                file3.delete();
                Logger.f41582a.d("SurtGuardian:PersistentId", "Deleted master key preferences file");
            }
            File file4 = new File(file, "__androidx_security_crypto_encrypted_prefs_value_keyset__");
            if (file4.exists()) {
                file4.delete();
                Logger.f41582a.d("SurtGuardian:PersistentId", "Deleted keyset file");
            }
        } catch (Exception e10) {
            Logger.f41582a.b("SurtGuardian:PersistentId", "Failed to delete corrupted preferences", e10);
        }
    }

    public final SharedPreferences c() {
        SharedPreferences sharedPreferences;
        try {
            String c10 = D2.e.c(D2.e.f2522a);
            Intrinsics.checkNotNullExpressionValue(c10, "getOrCreate(...)");
            SharedPreferences b10 = D2.a.b("surt_guardian_prefs", c10, this.f26508a, a.c.AES256_SIV, a.d.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(b10, "create(...)");
            return b10;
        } catch (Exception e10) {
            Logger logger = Logger.f41582a;
            logger.f("SurtGuardian:PersistentId", "EncryptedSharedPreferences corrupted, healing: " + e10.getMessage());
            b();
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (keyStore.containsAlias("_androidx_security_master_key_")) {
                    keyStore.deleteEntry("_androidx_security_master_key_");
                    logger.d("SurtGuardian:PersistentId", "Deleted corrupted AndroidKeyStore master key");
                }
            } catch (Exception e11) {
                Logger.f41582a.b("SurtGuardian:PersistentId", "Failed to delete master key", e11);
            }
            try {
                String c11 = D2.e.c(D2.e.f2522a);
                Intrinsics.checkNotNullExpressionValue(c11, "getOrCreate(...)");
                sharedPreferences = D2.a.b("surt_guardian_prefs", c11, this.f26508a, a.c.AES256_SIV, a.d.AES256_GCM);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "create(...)");
            } catch (Exception e12) {
                Logger.f41582a.b("SurtGuardian:PersistentId", "EncryptedSharedPreferences unrecoverable, using plain-prefs fallback", e12);
                sharedPreferences = this.f26508a.getSharedPreferences("surt_guardian_prefs_plain", 0);
            }
            Intrinsics.checkNotNull(sharedPreferences);
            return sharedPreferences;
        }
    }

    public final String d() {
        SharedPreferences c10 = c();
        String string = c10.getString("device_unique_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        c10.edit().putString("device_unique_id", uuid).apply();
        Logger.f41582a.d("SurtGuardian:PersistentId", "Generated new device ID");
        return uuid;
    }
}
