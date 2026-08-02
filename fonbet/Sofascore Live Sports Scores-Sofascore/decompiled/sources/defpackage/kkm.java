package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kkm implements krk {
    public final ConstraintLayout a;
    public final BlazeTextWithIconButton b;
    public final RecyclerView c;
    public final BlazeTextView d;
    public final BlazeTextView e;

    public kkm(ConstraintLayout constraintLayout, BlazeTextWithIconButton blazeTextWithIconButton, RecyclerView recyclerView, BlazeTextView blazeTextView, BlazeTextView blazeTextView2) {
        this.a = constraintLayout;
        this.b = blazeTextWithIconButton;
        this.c = recyclerView;
        this.d = blazeTextView;
        this.e = blazeTextView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
