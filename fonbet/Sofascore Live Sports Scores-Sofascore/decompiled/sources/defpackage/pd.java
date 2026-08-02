package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.media.highlights.MediaHighlightHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pd implements krk {
    public final ConstraintLayout a;
    public final ViewStub b;
    public final RecyclerView c;
    public final MediaHighlightHeaderView d;
    public final SwipeRefreshLayout e;

    public pd(ConstraintLayout constraintLayout, ViewStub viewStub, RecyclerView recyclerView, MediaHighlightHeaderView mediaHighlightHeaderView, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = constraintLayout;
        this.b = viewStub;
        this.c = recyclerView;
        this.d = mediaHighlightHeaderView;
        this.e = swipeRefreshLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
