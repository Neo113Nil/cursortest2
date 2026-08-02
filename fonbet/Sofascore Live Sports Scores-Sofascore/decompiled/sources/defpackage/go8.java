package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class go8 implements krk {
    public final SwipeRefreshLayout a;
    public final ExtendedFloatingActionButton b;
    public final RecyclerView c;
    public final SwipeRefreshLayout d;
    public final TypeHeaderView e;

    public go8(SwipeRefreshLayout swipeRefreshLayout, ExtendedFloatingActionButton extendedFloatingActionButton, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, TypeHeaderView typeHeaderView) {
        this.a = swipeRefreshLayout;
        this.b = extendedFloatingActionButton;
        this.c = recyclerView;
        this.d = swipeRefreshLayout2;
        this.e = typeHeaderView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
