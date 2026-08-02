package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fv6 extends p8 {
    public final ComposeView c;
    public final e1d d;
    public final /* synthetic */ gv6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv6(gv6 gv6Var, ComposeView composeView) {
        super(composeView);
        this.e = gv6Var;
        this.c = composeView;
        this.d = e.f(Boolean.FALSE);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        ev6 ev6Var = (ev6) obj;
        ev6Var.getClass();
        this.c.setContent(new tc3(-1513105511, new uu6(1, this, this.e, ev6Var), true));
    }
}
