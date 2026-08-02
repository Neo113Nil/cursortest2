package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q90 implements zff {
    public final /* synthetic */ int a;
    public final Object b;

    public q90(x6k x6kVar, p90 p90Var) {
        this.a = 0;
        this.b = p90Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        r0.e(r3, r2);
     */
    @Override // defpackage.yff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        Signature[] signatureArr;
        Signature signature;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new ekg((d4a) ((p90) obj).get());
            case 1:
                Application application = (Application) ((de0) obj).b;
                i2a.v(application);
                return application;
            case 2:
                it7 it7Var = qic.d;
                BitSet bitSet = mic.d;
                jic jicVar = new jic("X-Goog-Api-Key", it7Var);
                jic jicVar2 = new jic("X-Android-Package", it7Var);
                jic jicVar3 = new jic("X-Android-Cert", it7Var);
                qic qicVar = new qic();
                r38 r38Var = (r38) ((dad) obj).b;
                r38Var.a();
                Context context = r38Var.a;
                String packageName = context.getPackageName();
                r38Var.a();
                qicVar.e(jicVar, r38Var.c.a);
                qicVar.e(jicVar2, packageName);
                r38Var.a();
                String str = null;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
                    if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                        str = q21.g.h().c(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        break;
                    }
                } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
                    break;
                }
                return qicVar;
            default:
                return obj;
        }
        return qicVar;
    }

    public /* synthetic */ q90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
