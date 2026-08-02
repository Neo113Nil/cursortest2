package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.sofascore.results.R;
import defpackage.dac;
import defpackage.ibc;
import defpackage.tac;
import defpackage.wb0;
import defpackage.wca;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class MediaRouteChooserDialogFragment extends DialogFragment {
    public final boolean q = false;
    public wb0 r;
    public ibc s;

    public MediaRouteChooserDialogFragment() {
        this.g = true;
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        if (this.q) {
            tac tacVar = new tac(getContext());
            this.r = tacVar;
            q();
            tacVar.g(this.s);
        } else {
            dac dacVar = new dac(getContext());
            this.r = dacVar;
            q();
            dacVar.h(this.s);
        }
        return this.r;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wb0 wb0Var = this.r;
        if (wb0Var == null) {
            return;
        }
        if (!this.q) {
            dac dacVar = (dac) wb0Var;
            dacVar.getWindow().setLayout(wca.y(dacVar.getContext()), -2);
        } else {
            tac tacVar = (tac) wb0Var;
            Context context = tacVar.i;
            tacVar.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : wca.y(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }

    public final void q() {
        if (this.s == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.s = ibc.b(arguments.getBundle("selector"));
            }
            if (this.s == null) {
                this.s = ibc.c;
            }
        }
    }
}
