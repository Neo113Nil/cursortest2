package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.sofascore.results.view.graph.BasketballShotmapGraph;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ufh implements krk {
    public final LinearLayout a;
    public final BasketballShotmapGraph b;
    public final FrameLayout c;

    public ufh(LinearLayout linearLayout, BasketballShotmapGraph basketballShotmapGraph, FrameLayout frameLayout) {
        this.a = linearLayout;
        this.b = basketballShotmapGraph;
        this.c = frameLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
