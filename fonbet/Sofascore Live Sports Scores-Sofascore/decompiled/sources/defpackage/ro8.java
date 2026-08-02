package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ro8 implements krk {
    public final SwipeRefreshLayout a;
    public final ExtendedFloatingActionButton b;
    public final CircularProgressIndicator c;
    public final RecyclerView d;
    public final FrameLayout e;

    public ro8(SwipeRefreshLayout swipeRefreshLayout, ExtendedFloatingActionButton extendedFloatingActionButton, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, FrameLayout frameLayout) {
        this.a = swipeRefreshLayout;
        this.b = extendedFloatingActionButton;
        this.c = circularProgressIndicator;
        this.d = recyclerView;
        this.e = frameLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
