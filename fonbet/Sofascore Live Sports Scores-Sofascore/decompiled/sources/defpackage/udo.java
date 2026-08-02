package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzgff;
import com.google.android.gms.internal.ads.zzgiw;
import com.google.android.gms.internal.ads.zzgka;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzhah;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class udo extends zzgka {
    public final Map f;
    public final Context g;
    public final zzgff h;
    public final long i;
    public final long j;

    public udo(zzaya zzayaVar, zzgiw zzgiwVar, Map map, Context context, zzgff zzgffVar, zzgei zzgeiVar, zzgrh zzgrhVar) {
        super("+PCjsR8uUrE+ODYObgFJ15LzzbP31PRWxMEYlQ7sSRGBdHPl6GvLcY6T0RM0sryv", "LK6oYs0YHGkrF/9CgiECppIXTefV1s/9lm3/dqGO06I=", zzayaVar, zzgiwVar, zzgrhVar.a(113));
        this.g = context;
        this.f = map;
        this.h = zzgffVar;
        this.i = zzgeiVar.c0();
        this.j = zzgeiVar.d0();
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void a(Method method, zzaya zzayaVar) {
        String str;
        zzaza zzazaVar;
        Object[] objArr = (Object[]) method.invoke("", this.g, Integer.valueOf(this.h.ordinal()));
        objArr.getClass();
        String str2 = "E";
        int i = 1;
        try {
            ddb ddbVar = (ddb) this.f.get("gs");
            if (ddbVar != null && ((Build.VERSION.SDK_INT < 31 || ddbVar.isDone()) && (zzazaVar = (zzaza) ddbVar.get(this.i, TimeUnit.MILLISECONDS)) != null && zzazaVar.z0().length() > 1)) {
                str2 = zzazaVar.z0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str2.equals("E")) {
            try {
                ddb ddbVar2 = (ddb) this.f.get("ai");
                if (ddbVar2 != null) {
                    String str3 = (String) ddbVar2.get(this.j, TimeUnit.MILLISECONDS);
                    if (!b0a.U(str3)) {
                        str2 = str3;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzayaVar) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    str = Base64.encodeToString(zzhah.c.j().f(bArr.length, bArr).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    str = (String) obj;
                }
                long longValue = ((Long) objArr[0]).longValue();
                zzayaVar.n();
                ((zzaza) zzayaVar.b).I(longValue);
                String str4 = (String) objArr[1];
                zzayaVar.n();
                ((zzaza) zzayaVar.b).H(str4);
                String str5 = (String) objArr[2];
                zzayaVar.n();
                ((zzaza) zzayaVar.b).R(str5);
                String str6 = (String) objArr[3];
                zzayaVar.n();
                ((zzaza) zzayaVar.b).S(str6);
                zzayaVar.n();
                ((zzaza) zzayaVar.b).D(str);
                zzayaVar.n();
                ((zzaza) zzayaVar.b).W0(str2);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).x0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
