package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uac implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bbc b;

    public /* synthetic */ uac(bbc bbcVar, int i) {
        this.a = i;
        this.b = bbcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        bbc bbcVar = this.b;
        switch (i) {
            case 0:
                bbcVar.dismiss();
                break;
            default:
                if (bbcVar.j.g()) {
                    bbcVar.g.getClass();
                    pbc.j(2);
                }
                bbcVar.dismiss();
                break;
        }
    }
}
