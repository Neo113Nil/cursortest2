package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tf7 extends p8 {
    public final ComposeView c;
    public final e1d d;
    public final /* synthetic */ uf7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf7(uf7 uf7Var, ComposeView composeView) {
        super(composeView);
        this.e = uf7Var;
        this.c = composeView;
        this.d = e.f(Boolean.FALSE);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        fo7 fo7Var = (fo7) obj;
        fo7Var.getClass();
        this.c.setContent(new tc3(-1091614249, new uu6(15, this, this.e, fo7Var), true));
    }
}
