package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class czl implements krk {
    public final ConstraintLayout a;
    public final LinearProgressIndicator b;

    public czl(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator) {
        this.a = constraintLayout;
        this.b = linearProgressIndicator;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
