package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.sofascore.results.settings.about.AboutActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class i0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog b;

    public /* synthetic */ i0(AlertDialog alertDialog, int i) {
        this.a = i;
        this.b = alertDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        AlertDialog alertDialog = this.b;
        switch (i2) {
            case 0:
                int i3 = AboutActivity.O;
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
            case 5:
                alertDialog.dismiss();
                break;
            case 6:
                alertDialog.dismiss();
                break;
            case 7:
                alertDialog.dismiss();
                break;
            case 8:
                alertDialog.dismiss();
                break;
            case 9:
                alertDialog.dismiss();
                break;
            case 10:
                alertDialog.dismiss();
                break;
            case 11:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }
}
