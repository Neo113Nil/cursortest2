package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w5 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ fsf b;
    public final /* synthetic */ d2 c;

    public /* synthetic */ w5(d2 d2Var, fsf fsfVar, int i) {
        this.a = i;
        this.c = d2Var;
        this.b = fsfVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = this.a;
        fsf fsfVar = this.b;
        d2 d2Var = this.c;
        view.getClass();
        switch (i) {
            case 0:
                Context context = ((nr2) d2Var).b;
                nv.z0(context, kv.CLICK, "aircash_promotion", "chat");
                bea.G(context, (String) fsfVar.a);
                break;
            default:
                Context context2 = ((mr2) d2Var).b;
                nv.z0(context2, kv.CLICK, "aircash_promotion", "chat");
                bea.G(context2, (String) fsfVar.a);
                break;
        }
    }
}
