package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ac extends qfc {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ dc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(dc dcVar, Context context, sji sjiVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, sjiVar, context, view, false);
        this.n = dcVar;
        if ((sjiVar.A.x & 32) != 32) {
            View view2 = dcVar.g;
            this.f = view2 == null ? (View) dcVar.f : view2;
        }
        de0 de0Var = dcVar.u;
        this.i = de0Var;
        ofc ofcVar = this.j;
        if (ofcVar != null) {
            ofcVar.e(de0Var);
        }
    }

    @Override // defpackage.qfc
    public final void c() {
        int i = this.m;
        dc dcVar = this.n;
        switch (i) {
            case 0:
                dcVar.r = null;
                super.c();
                break;
            default:
                vec vecVar = dcVar.c;
                if (vecVar != null) {
                    vecVar.c(true);
                }
                dcVar.q = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(dc dcVar, Context context, vec vecVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, vecVar, context, view, true);
        this.n = dcVar;
        this.g = 8388613;
        de0 de0Var = dcVar.u;
        this.i = de0Var;
        ofc ofcVar = this.j;
        if (ofcVar != null) {
            ofcVar.e(de0Var);
        }
    }
}
