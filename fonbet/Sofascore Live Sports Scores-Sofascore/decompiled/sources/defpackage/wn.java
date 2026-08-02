package defpackage;

import android.app.AlertDialog;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog b;

    public /* synthetic */ wn(AlertDialog alertDialog, int i) {
        this.a = i;
        this.b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        AlertDialog alertDialog = this.b;
        switch (i) {
            case 0:
                alertDialog.dismiss();
                break;
            case 1:
                alertDialog.dismiss();
                break;
            case 2:
                alertDialog.dismiss();
                break;
            case 3:
                alertDialog.dismiss();
                break;
            case 4:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }
}
