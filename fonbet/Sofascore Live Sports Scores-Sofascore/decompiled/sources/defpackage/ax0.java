package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.B;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ax0(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        int i2 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                B.b((B) obj3, (AdapterErrorType) obj2, i2, (String) obj);
                return;
            default:
                ji3 ji3Var = (ji3) obj3;
                jv0 jv0Var = (jv0) obj2;
                Runnable runnable = (Runnable) obj;
                mlg mlgVar = (mlg) ji3Var.f;
                int i3 = 1;
                try {
                    try {
                        mlg mlgVar2 = (mlg) ji3Var.d;
                        Objects.requireNonNull(mlgVar2);
                        mlgVar.n(new bek(mlgVar2, i3));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) ji3Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            mlgVar.n(new j01(ji3Var, jv0Var, i2));
                        } else {
                            ji3Var.h(jv0Var, i2);
                        }
                    } catch (kqi unused) {
                        ((sx2) ji3Var.e).J(jv0Var, i2 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }
}
