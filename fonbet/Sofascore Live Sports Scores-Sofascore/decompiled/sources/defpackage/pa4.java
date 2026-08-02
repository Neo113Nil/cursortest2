package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pa4 extends ozb {
    public final RectF s;

    public pa4(pa4 pa4Var) {
        super(pa4Var);
        this.s = pa4Var.s;
    }

    @Override // defpackage.ozb, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        qa4 qa4Var = new qa4(this);
        qa4Var.H = this;
        qa4Var.invalidateSelf();
        return qa4Var;
    }

    public pa4(xah xahVar, RectF rectF) {
        super(xahVar);
        this.s = rectF;
    }
}
