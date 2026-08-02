package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.widgets.ui.WidgetItemCustomView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d6m implements krk {
    public final ConstraintLayout a;
    public final WidgetItemCustomView b;
    public final ConstraintLayout c;

    public d6m(ConstraintLayout constraintLayout, WidgetItemCustomView widgetItemCustomView, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = widgetItemCustomView;
        this.c = constraintLayout2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
