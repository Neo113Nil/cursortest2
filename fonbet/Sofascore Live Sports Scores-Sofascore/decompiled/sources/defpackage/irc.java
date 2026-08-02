package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class irc implements krk {
    public final SwipeRefreshLayout a;
    public final AppBarLayout b;
    public final SwipeRefreshLayout c;
    public final LinearLayout d;

    public irc(SwipeRefreshLayout swipeRefreshLayout, AppBarLayout appBarLayout, SwipeRefreshLayout swipeRefreshLayout2, LinearLayout linearLayout) {
        this.a = swipeRefreshLayout;
        this.b = appBarLayout;
        this.c = swipeRefreshLayout2;
        this.d = linearLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
