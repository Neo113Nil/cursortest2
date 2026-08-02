package ru.ozon.android.messenger.framework.presentation.chatdetail.view;

import E0.C2942q;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i;
import ru.ozon.android.messenger.framework.presentation.models.C9515b;
import ru.ozon.android.messenger.framework.presentation.models.o;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.utils.e;

/* loaded from: classes10.dex */
public final class b extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f89950a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f89951b;

    static {
        int i11;
        int i12;
        i11 = e.f91907d;
        f89950a = i11;
        i12 = e.f91910g;
        f89951b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.A a11) {
        C9515b e11;
        C9515b e12;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.g a12 = C2942q.a(recyclerView, "parent", a11, "state");
        String str = null;
        i iVar = a12 instanceof i ? (i) a12 : null;
        if (iVar == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i11 = f89950a;
        if (childAdapterPosition < 0 || childAdapterPosition > iVar.getShimmersCount()) {
            outRect.top = i11;
            return;
        }
        List<q> currentList = iVar.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        q qVar = (q) C7714v.Q(childAdapterPosition - 1, currentList);
        q qVar2 = iVar.getCurrentList().get(childAdapterPosition);
        if (!((qVar != null ? r.b(qVar) : null) instanceof o)) {
            if (!((qVar2 != null ? r.b(qVar2) : null) instanceof o)) {
                s f7 = qVar != null ? r.f(qVar) : null;
                Intrinsics.f(qVar2);
                s f11 = r.f(qVar2);
                if (f11 == null || !f11.r() || f7 == null || !f7.p()) {
                    String id2 = (f7 == null || (e12 = f7.e()) == null) ? null : e12.getId();
                    if (f11 != null && (e11 = f11.e()) != null) {
                        str = e11.getId();
                    }
                    if (!Intrinsics.d(id2, str)) {
                        i11 = f89951b;
                    }
                }
                outRect.top = i11;
            }
        }
        i11 = 0;
        outRect.top = i11;
    }
}
