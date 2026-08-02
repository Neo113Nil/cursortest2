package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jrk implements krk {
    public final ConstraintLayout a;
    public final ComposeView b;

    public jrk(ConstraintLayout constraintLayout, ComposeView composeView) {
        this.a = constraintLayout;
        this.b = composeView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
