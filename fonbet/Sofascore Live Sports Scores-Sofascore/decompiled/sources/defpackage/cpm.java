package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.widgets.skeletons.SkeletonItemCustomView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cpm implements krk {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final SkeletonItemCustomView c;

    public cpm(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, SkeletonItemCustomView skeletonItemCustomView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = skeletonItemCustomView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
