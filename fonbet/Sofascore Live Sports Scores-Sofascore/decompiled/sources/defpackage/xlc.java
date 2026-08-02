package defpackage;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xlc extends p8 {
    public final /* synthetic */ int c;
    public final kqb d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xlc(kqb kqbVar, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                ConstraintLayout constraintLayout = kqbVar.b;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = kqbVar;
                constraintLayout.getClass();
                aba.I(constraintLayout);
                break;
            default:
                ConstraintLayout constraintLayout2 = kqbVar.b;
                constraintLayout2.getClass();
                this.d = kqbVar;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        Context context = this.b;
        kqb kqbVar = this.d;
        switch (i3) {
            case 0:
                ylc ylcVar = (ylc) obj;
                ylcVar.getClass();
                kqbVar.d.setText(context.getString(ylcVar.a));
                break;
            default:
                r9k r9kVar = (r9k) obj;
                r9kVar.getClass();
                kqbVar.d.setText(r9kVar.b(context));
                break;
        }
    }
}
