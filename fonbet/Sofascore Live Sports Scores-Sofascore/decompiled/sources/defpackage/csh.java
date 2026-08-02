package defpackage;

import android.app.Dialog;
import android.view.LayoutInflater;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class csh extends Dialog {
    public final dk2 a;

    public csh(BaseActivity baseActivity) {
        super(baseActivity, R.style.RedesignDialog);
        dk2 c = dk2.c(LayoutInflater.from(baseActivity));
        this.a = c;
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setContentView(c.b);
    }
}
