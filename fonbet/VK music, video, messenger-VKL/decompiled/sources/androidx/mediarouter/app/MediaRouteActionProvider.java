package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import xsna.ex10;
import xsna.fx10;
import xsna.i40;
import xsna.nw10;
import xsna.ww10;

/* loaded from: classes12.dex */
public class MediaRouteActionProvider extends i40 {
    public ex10 b;
    public final ww10 c;
    public nw10 d;

    public MediaRouteActionProvider(@NonNull Context context) {
        super(context);
        this.b = ex10.c;
        this.c = ww10.a;
        fx10.d(context);
    }

    @Override // xsna.i40
    @NonNull
    public final View c() {
        if (this.d != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        nw10 nw10Var = new nw10(this.a);
        this.d = nw10Var;
        nw10Var.setCheatSheetEnabled(true);
        this.d.setRouteSelector(this.b);
        this.d.setDialogFactory(this.c);
        this.d.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.d;
    }

    @Override // xsna.i40
    public final boolean e() {
        nw10 nw10Var = this.d;
        if (nw10Var != null) {
            return nw10Var.c();
        }
        return false;
    }
}
