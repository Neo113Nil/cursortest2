package lb;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzba;
import com.google.android.gms.internal.p002firebaseauthapi.zzcl;
import com.google.android.gms.internal.p002firebaseauthapi.zzco;
import com.google.android.gms.internal.p002firebaseauthapi.zzcv;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public static U f55708c;

    /* renamed from: a, reason: collision with root package name */
    public final String f55709a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmy f55710b;

    public U(String str, zzmy zzmyVar) {
        this.f55709a = str;
        this.f55710b = zzmyVar;
    }

    public static U b(Context context, String str) {
        U u10 = f55708c;
        if (u10 == null || !Objects.equals(u10.f55709a, str)) {
            f55708c = new U(str, e(context, str));
        }
        return f55708c;
    }

    public static zzmy c(Context context, String str) {
        return new zzmy.zza().zza(context, "StorageCryptoKeyset", f(str)).zza(zzcv.zzb).zza(String.format("android-keystore://firebear_main_key_id_for_storage_crypto.%s", str)).zza();
    }

    public static zzmy e(Context context, String str) {
        try {
            zzcl.zza();
            return c(context, str);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            if (e10 instanceof GeneralSecurityException) {
                context.getSharedPreferences(f(str), 0).edit().remove("StorageCryptoKeyset").apply();
                try {
                    return c(context, str);
                } catch (IOException | GeneralSecurityException e11) {
                    Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + e11.getMessage());
                    return null;
                }
            }
            return null;
        }
    }

    public static String f(String str) {
        return String.format("com.google.firebase.auth.api.crypto.%s", str);
    }

    public final String a(String str) {
        String str2;
        AbstractC3191o.m(str);
        zzmy zzmyVar = this.f55710b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzba) this.f55710b.zza().zza(zzco.zza(), zzba.class)).zza(Base64.decode(str, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e10) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }

    public final String d(String str) {
        String encodeToString;
        AbstractC3191o.m(str);
        zzmy zzmyVar = this.f55710b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                encodeToString = Base64.encodeToString(((zzba) this.f55710b.zza().zza(zzco.zza(), zzba.class)).zzb(str.getBytes(StandardCharsets.UTF_8), null), 2);
            }
            return encodeToString;
        } catch (GeneralSecurityException e10) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }
}
