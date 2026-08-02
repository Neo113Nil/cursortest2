package defpackage;

import com.google.android.gms.internal.ads.zziof;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mco implements zziof {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mco(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* synthetic */ Object zzb() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new mxn((vdf) ((vdf) obj).a, 13);
            case 1:
                return new ohn((vdf) ((vdf) obj).a, 21);
            case 2:
                return new b1l((vdf) ((vdf) obj).a, 24);
            default:
                qpn qpnVar = (qpn) obj;
                vdf vdfVar = (vdf) qpnVar.b;
                qpn qpnVar2 = (qpn) qpnVar.c;
                ji3 ji3Var = new ji3();
                ji3Var.a = vdfVar;
                ji3Var.b = qpnVar2;
                return ji3Var;
        }
    }
}
