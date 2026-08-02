package defpackage;

import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzpg;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uqo implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzjd e;

    public /* synthetic */ uqo(zzjd zzjdVar, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        zzjd zzjdVar = this.e;
        switch (i) {
            case 0:
                zzpg zzpgVar = zzjdVar.a;
                zzpgVar.W();
                hkn hknVar = zzpgVar.c;
                zzpg.U(hknVar);
                return hknVar.O0(str3, str2, str);
            case 1:
                zzpg zzpgVar2 = zzjdVar.a;
                zzpgVar2.W();
                hkn hknVar2 = zzpgVar2.c;
                zzpg.U(hknVar2);
                return hknVar2.O0(str3, str2, str);
            case 2:
                zzpg zzpgVar3 = zzjdVar.a;
                zzpgVar3.W();
                hkn hknVar3 = zzpgVar3.c;
                zzpg.U(hknVar3);
                return hknVar3.S0(str3, str2, str);
            default:
                zzpg zzpgVar4 = zzjdVar.a;
                zzpgVar4.W();
                hkn hknVar4 = zzpgVar4.c;
                zzpg.U(hknVar4);
                return hknVar4.S0(str3, str2, str);
        }
    }
}
