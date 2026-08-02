package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bdh implements krk {
    public final FrameLayout a;
    public final View b;
    public final RecyclerView c;

    public bdh(FrameLayout frameLayout, View view, RecyclerView recyclerView) {
        this.a = frameLayout;
        this.b = view;
        this.c = recyclerView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
