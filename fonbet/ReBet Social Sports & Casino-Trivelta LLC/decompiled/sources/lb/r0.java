package lb;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbc;
import com.google.android.gms.internal.p002firebaseauthapi.zzbd;
import com.google.android.gms.internal.p002firebaseauthapi.zzby;
import com.google.android.gms.internal.p002firebaseauthapi.zzks;
import com.google.android.gms.internal.p002firebaseauthapi.zzkt;
import com.google.android.gms.internal.p002firebaseauthapi.zzlh;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: c, reason: collision with root package name */
    public static r0 f55785c;

    /* renamed from: a, reason: collision with root package name */
    public final String f55786a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmy f55787b;

    public r0(Context context, String str, boolean z10) {
        zzmy zzmyVar;
        this.f55786a = str;
        try {
            zzkt.zza();
            zzmy.zza zza = new zzmy.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzlh.zza);
            zza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmyVar = zza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            zzmyVar = null;
        }
        this.f55787b = zzmyVar;
    }

    public static r0 c(Context context, String str) {
        r0 r0Var = f55785c;
        if (r0Var == null || !Objects.equals(r0Var.f55786a, str)) {
            f55785c = new r0(context, str, true);
        }
        return f55785c;
    }

    public final String a() {
        if (this.f55787b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzby zza = zzbc.zza(byteArrayOutputStream);
        try {
            synchronized (this.f55787b) {
                this.f55787b.zza().zzb().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e10.getMessage());
            return null;
        }
    }

    public final String b(String str) {
        String str2;
        zzmy zzmyVar = this.f55787b;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbd) this.f55787b.zza().zza(zzks.zza(), zzbd.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }
}
