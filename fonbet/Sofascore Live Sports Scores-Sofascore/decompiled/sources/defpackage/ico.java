package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzgdj;
import com.google.android.gms.internal.ads.zzgdk;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ico {
    public static final String h = new UUID(0, 0).toString();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final f0o f;
    public final zzgdk g;

    public ico(Context context, String str, String str2, String str3) {
        f0o f0oVar = f0o.d;
        if (f0oVar == null) {
            f0oVar = new f0o(context);
            f0o.d = f0oVar;
        }
        this.f = f0oVar;
        this.g = zzgdk.a(context);
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzgdj a(String str, String str2, long j, boolean z) {
        long currentTimeMillis;
        String str3 = this.b;
        f0o f0oVar = this.f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(h)) {
                    String string = ((SharedPreferences) f0oVar.c).getString(str3, null);
                    String string2 = ((SharedPreferences) f0oVar.c).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null) {
                        if (!string.equals(e(str, str2, string2))) {
                            return b(str, str2);
                        }
                        boolean z2 = str == null;
                        currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis >= 0) {
                            a70.r(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
                            return null;
                        }
                        String str4 = this.c;
                        String str5 = this.d;
                        long j2 = ((SharedPreferences) f0oVar.c).getLong(z2 ? str5 : str4, -1L);
                        if (j2 != -1) {
                            if (currentTimeMillis < j2) {
                                f0oVar.h(Long.valueOf(currentTimeMillis), z2 ? str5 : str4);
                            } else if (currentTimeMillis >= j2 + j) {
                                return b(str, str2);
                            }
                        }
                        if (!z2) {
                            str3 = this.a;
                        }
                        String string3 = ((SharedPreferences) f0oVar.c).getString(str3, null);
                        if (string3 == null && !z) {
                            return b(str, str2);
                        }
                        if (z2) {
                            str4 = str5;
                        }
                        return new zzgdj(string3, ((SharedPreferences) f0oVar.c).getLong(str4, -1L));
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzgdj();
        }
        if (str == null) {
        }
        currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
        }
    }

    public final zzgdj b(String str, String str2) {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f.h(uuid, "paid_3p_hash_key");
        return d(e(str, str2, uuid), true);
    }

    public final void c(boolean z) {
        String str = z ? this.d : this.c;
        f0o f0oVar = this.f;
        f0oVar.j(str);
        f0oVar.j(z ? this.b : this.a);
    }

    public final zzgdj d(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            a70.r(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        String str2 = z ? this.d : this.c;
        Long valueOf = Long.valueOf(currentTimeMillis);
        f0o f0oVar = this.f;
        f0oVar.h(valueOf, str2);
        f0oVar.h(str, z ? this.b : this.a);
        return new zzgdj(str, currentTimeMillis);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(wt3.m(str, str2, new StringBuilder(str2.length() + str.length() + str3.length()), str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder("not null".length() + str4.length() + 120);
        bf3.v(sb, this.e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        vp2.f(sb, "not null");
        return null;
    }
}
