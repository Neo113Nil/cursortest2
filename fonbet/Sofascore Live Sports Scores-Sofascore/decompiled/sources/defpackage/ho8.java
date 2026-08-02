package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ho8 implements krk {
    public final SwipeRefreshLayout a;
    public final RecyclerView b;
    public final SwipeRefreshLayout c;
    public final TypeHeaderView d;

    public ho8(SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, TypeHeaderView typeHeaderView) {
        this.a = swipeRefreshLayout;
        this.b = recyclerView;
        this.c = swipeRefreshLayout2;
        this.d = typeHeaderView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
