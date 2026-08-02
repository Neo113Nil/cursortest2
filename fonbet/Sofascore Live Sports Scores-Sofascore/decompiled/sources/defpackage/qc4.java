package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzdek;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzjw;
import com.google.android.gms.internal.wearable.zzak;
import com.google.android.gms.internal.wearable.zzk;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qc4 implements pz8, zzdjm, zzgvc, zzak {
    public final /* synthetic */ int a;
    public Context b;

    public qc4(Context context) {
        this.a = 1;
        context.getClass();
        this.b = context;
    }

    public rc4 a() {
        Context context = this.b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        rc4 rc4Var = new rc4();
        rc4Var.a = z65.a(u6h.e);
        int i = 1;
        iy3 iy3Var = new iy3(context, i);
        rc4Var.b = iy3Var;
        int i2 = 0;
        rc4Var.c = z65.a(new tic(iy3Var, new iy3(iy3Var, i2), i2));
        iy3 iy3Var2 = rc4Var.b;
        rc4Var.d = new cc6(iy3Var2, i);
        yff a = z65.a(new tic(rc4Var.d, z65.a(new cc6(iy3Var2, i2)), i));
        rc4Var.e = a;
        re6 re6Var = new re6(i);
        iy3 iy3Var3 = rc4Var.b;
        tsg tsgVar = new tsg(iy3Var3, a, re6Var, i2);
        yff yffVar = rc4Var.a;
        yff yffVar2 = rc4Var.c;
        rc4Var.f = z65.a(new tsg(new js4(yffVar, yffVar2, tsgVar, a, a), new dek(iy3Var3, yffVar2, a, tsgVar, yffVar, a, a), new ubl(yffVar, a, tsgVar, a), i));
        return rc4Var;
    }

    public void b(String str) {
        Context context = this.b;
        Uri parse = Uri.parse(str);
        try {
            ea4 a = new da4().a();
            if (!(context instanceof Activity)) {
                a.a.setFlags(268435456);
            }
            a.a(context, parse);
        } catch (Throwable unused) {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    @Override // defpackage.pz8
    public Object get() {
        return (ConnectivityManager) this.b.getSystemService("connectivity");
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 6:
                int i = zzjw.l;
                return new zzabc(this.b);
            default:
                File filesDir = this.b.getFilesDir();
                int i2 = zzk.a;
                File file = new File(new File(filesDir, "wearos_assets").getPath());
                int i3 = zzk.a;
                File file2 = new File(new File(file, "streamtmp").getPath());
                file2.mkdirs();
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        file3.delete();
                    }
                }
                return file2;
        }
    }

    public /* synthetic */ qc4(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public /* synthetic */ qc4() {
        this.a = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zzdek) obj).c(this.b);
    }
}
