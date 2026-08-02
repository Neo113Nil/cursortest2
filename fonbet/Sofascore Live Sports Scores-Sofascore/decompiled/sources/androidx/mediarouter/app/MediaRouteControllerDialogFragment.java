package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import defpackage.bbc;
import defpackage.ibc;
import defpackage.wb0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class MediaRouteControllerDialogFragment extends DialogFragment {
    public final boolean q = false;
    public wb0 r;
    public ibc s;

    public MediaRouteControllerDialogFragment() {
        this.g = true;
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        if (this.q) {
            bbc bbcVar = new bbc(getContext());
            this.r = bbcVar;
            bbcVar.i(this.s);
        } else {
            this.r = new d(getContext());
        }
        return this.r;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wb0 wb0Var = this.r;
        if (wb0Var != null) {
            if (this.q) {
                ((bbc) wb0Var).j();
            } else {
                ((d) wb0Var).s();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        wb0 wb0Var = this.r;
        if (wb0Var == null || this.q) {
            return;
        }
        ((d) wb0Var).j(false);
    }
}
