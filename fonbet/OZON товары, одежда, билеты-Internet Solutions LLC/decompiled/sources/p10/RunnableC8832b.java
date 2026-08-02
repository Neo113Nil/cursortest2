package p10;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;

/* renamed from: p10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC8832b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f80016a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComposerListBehavior f80017b;

    public RunnableC8832b(View view, ComposerListBehavior composerListBehavior) {
        this.f80016a = view;
        this.f80017b = composerListBehavior;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        RecyclerView recyclerView;
        ComposerListBehavior composerListBehavior = this.f80017b;
        z11 = composerListBehavior.f94797J;
        if (z11) {
            composerListBehavior.f94797J = false;
            recyclerView = composerListBehavior.f94817y;
            composerListBehavior.I(recyclerView, true);
        }
    }
}
