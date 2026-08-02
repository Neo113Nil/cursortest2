package cU;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.travel.molecules.fragment.alertDialog.TravelAlertDialogFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56871b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f56870a = i11;
        this.f56871b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f56870a) {
            case 0:
                ((TravelAlertDialogFragment) this.f56871b).sendResult(false);
                break;
            default:
                ((Function0) this.f56871b).invoke();
                break;
        }
    }
}
