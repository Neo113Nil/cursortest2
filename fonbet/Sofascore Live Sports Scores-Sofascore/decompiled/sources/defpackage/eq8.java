package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eq8 implements krk {
    public final SwipeRefreshLayout a;
    public final LinearLayout b;
    public final RecyclerView c;
    public final SwipeRefreshLayout d;
    public final vxc e;
    public final TypeHeaderView f;

    public eq8(SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, vxc vxcVar, TypeHeaderView typeHeaderView) {
        this.a = swipeRefreshLayout;
        this.b = linearLayout;
        this.c = recyclerView;
        this.d = swipeRefreshLayout2;
        this.e = vxcVar;
        this.f = typeHeaderView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
