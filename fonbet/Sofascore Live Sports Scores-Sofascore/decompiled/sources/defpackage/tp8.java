package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.common.SwipeRefreshLayoutFixed;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tp8 implements krk {
    public final SwipeRefreshLayoutFixed a;
    public final ViewStub b;
    public final RecyclerView c;
    public final SwipeRefreshLayoutFixed d;

    public tp8(SwipeRefreshLayoutFixed swipeRefreshLayoutFixed, ViewStub viewStub, RecyclerView recyclerView, SwipeRefreshLayoutFixed swipeRefreshLayoutFixed2) {
        this.a = swipeRefreshLayoutFixed;
        this.b = viewStub;
        this.c = recyclerView;
        this.d = swipeRefreshLayoutFixed2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
