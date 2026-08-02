package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.transfers.view.TransferFilterScrollableHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class evj implements krk {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final TextView c;
    public final TransferFilterScrollableHeaderView d;
    public final View e;

    public evj(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, TransferFilterScrollableHeaderView transferFilterScrollableHeaderView, View view) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = textView;
        this.d = transferFilterScrollableHeaderView;
        this.e = view;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
