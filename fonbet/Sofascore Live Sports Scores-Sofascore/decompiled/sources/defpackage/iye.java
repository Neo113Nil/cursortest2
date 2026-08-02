package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class iye implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pye b;
    public final /* synthetic */ sle c;

    public /* synthetic */ iye(pye pyeVar, sle sleVar, int i) {
        this.a = i;
        this.b = pyeVar;
        this.c = sleVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        sle sleVar = this.c;
        pye pyeVar = this.b;
        switch (i) {
            case 0:
                pyeVar.p(sleVar);
                break;
            default:
                pyeVar.p(sleVar);
                break;
        }
    }
}
