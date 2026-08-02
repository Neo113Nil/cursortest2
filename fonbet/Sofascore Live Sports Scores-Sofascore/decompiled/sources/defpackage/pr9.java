package defpackage;

import android.content.DialogInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pr9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gph b;

    public /* synthetic */ pr9(gph gphVar, int i) {
        this.a = i;
        this.b = gphVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        gph gphVar = this.b;
        switch (i2) {
            case 0:
                gphVar.dismiss();
                break;
            default:
                gphVar.dismiss();
                break;
        }
    }
}
