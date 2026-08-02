package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import androidx.preference.ListPreferenceDialogFragmentCompat;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;
import com.google.android.gms.internal.ads.zzbyv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rcb implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rcb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = (ListPreferenceDialogFragmentCompat) obj;
                listPreferenceDialogFragmentCompat.y = i;
                listPreferenceDialogFragmentCompat.x = -1;
                dialogInterface.dismiss();
                break;
            case 1:
                TracksChooserDialogFragment tracksChooserDialogFragment = (TracksChooserDialogFragment) obj;
                AlertDialog alertDialog = tracksChooserDialogFragment.u;
                if (alertDialog != null) {
                    alertDialog.cancel();
                    tracksChooserDialogFragment.u = null;
                    break;
                }
                break;
            case 2:
                ((zzbyv) obj).b("User canceled the download.");
                break;
            default:
                ((JsPromptResult) obj).cancel();
                break;
        }
    }
}
