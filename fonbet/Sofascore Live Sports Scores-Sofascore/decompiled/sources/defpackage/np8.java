package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class np8 implements krk {
    public final RelativeLayout a;
    public final RecyclerView b;

    public np8(RelativeLayout relativeLayout, RecyclerView recyclerView) {
        this.a = relativeLayout;
        this.b = recyclerView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
