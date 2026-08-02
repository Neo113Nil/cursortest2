package defpackage;

import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class kjc implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mjc b;
    public final /* synthetic */ lw9 c;

    public /* synthetic */ kjc(mjc mjcVar, lw9 lw9Var, int i) {
        this.a = i;
        this.b = mjcVar;
        this.c = lw9Var;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i = this.a;
        lw9 lw9Var = this.c;
        mjc mjcVar = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                imf imfVar = mjcVar.a;
                hi2 a = mjcVar.a(lw9Var, str);
                a.k(qc6.IMPRESSION_EVENT_TYPE);
                imfVar.h(((ii2) a.build()).toByteArray());
                break;
            default:
                imf imfVar2 = mjcVar.a;
                hi2 a2 = mjcVar.a(lw9Var, str);
                a2.k(qc6.CLICK_EVENT_TYPE);
                imfVar2.h(((ii2) a2.build()).toByteArray());
                break;
        }
    }
}
