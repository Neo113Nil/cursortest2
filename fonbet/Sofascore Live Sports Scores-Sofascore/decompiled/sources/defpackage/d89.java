package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d89 implements krk {
    public final ConstraintLayout a;
    public final ComposeView b;
    public final TypeHeaderView c;

    public d89(ConstraintLayout constraintLayout, ComposeView composeView, TypeHeaderView typeHeaderView) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = typeHeaderView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
