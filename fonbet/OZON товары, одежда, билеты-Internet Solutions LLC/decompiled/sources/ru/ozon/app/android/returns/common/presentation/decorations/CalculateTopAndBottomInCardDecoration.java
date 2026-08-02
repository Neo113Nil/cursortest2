package ru.ozon.app.android.returns.common.presentation.decorations;

import E0.C2942q;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\b*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 ¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/common/presentation/decorations/CalculateTopAndBottomInCardDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "groupByCard", "(Lkotlin/sequences/Sequence;Landroidx/recyclerview/widget/RecyclerView;)Ljava/util/List;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "group", "", "onDrawOverCard", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;Ljava/util/List;)V", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "child", "", "calculateIsBottomInCard", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)Z", "Landroid/graphics/Rect;", "childRect", "Landroid/graphics/Rect;", "getChildRect", "()Landroid/graphics/Rect;", "Ljava/lang/reflect/Type;", "getTopItemVO", "()Ljava/lang/reflect/Type;", "topItemVO", "getMiddleItemVOs", "()Ljava/util/List;", "middleItemVOs", "getBottomItemVO", "bottomItemVO", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CalculateTopAndBottomInCardDecoration extends RecyclerView.n {

    @NotNull
    private final Rect childRect = new Rect();

    private final List<List<View>> groupByCard(Sequence<? extends View> sequence, RecyclerView recyclerView) {
        c b11;
        Object adapter = recyclerView.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar == null) {
            return K.f71697a;
        }
        ArrayList m02 = C7714v.m0(new ArrayList());
        for (View view : sequence) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != -1 && (b11 = lVar.b(childAdapterPosition)) != null) {
                if (!getMiddleItemVOs().contains(b11.getClass())) {
                    m02.add(new ArrayList());
                } else if (b11.getClass().equals(getTopItemVO())) {
                    m02.add(C7714v.m0(view));
                } else {
                    ((List) C7714v.X(m02)).add(view);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = m02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((List) next).isEmpty()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final boolean calculateIsBottomInCard(@NotNull View child, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childAdapterPosition;
        c b11;
        Intrinsics.checkNotNullParameter(child, "child");
        RecyclerView.g a11 = C2942q.a(parent, "parent", state, "state");
        if (a11 == 0 || (childAdapterPosition = parent.getChildAdapterPosition(child)) == -1) {
            return false;
        }
        RecyclerView.g adapter = parent.getAdapter();
        Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemViewType(childAdapterPosition)) : null;
        l lVar = a11 instanceof l ? (l) a11 : null;
        if (!Intrinsics.d((lVar == null || (b11 = lVar.b(childAdapterPosition)) == null) ? null : b11.getClass(), getBottomItemVO())) {
            return false;
        }
        Integer valueOf2 = Integer.valueOf(childAdapterPosition);
        if (valueOf2.intValue() >= state.b() - 1) {
            valueOf2 = null;
        }
        return !Intrinsics.d(valueOf, valueOf2 != null ? Integer.valueOf(a11.getItemViewType(valueOf2.intValue() + 1)) : null);
    }

    @NotNull
    public abstract Type getBottomItemVO();

    @NotNull
    protected final Rect getChildRect() {
        return this.childRect;
    }

    @NotNull
    public abstract List<Type> getMiddleItemVOs();

    @NotNull
    public abstract Type getTopItemVO();

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<T> it = groupByCard(C5316f0.b(parent), parent).iterator();
        while (it.hasNext()) {
            List<? extends View> list = (List) it.next();
            View view = (View) C7714v.K(list);
            View view2 = (View) C7714v.X(list);
            Rect rect = this.childRect;
            rect.left = view.getLeft();
            rect.top = view.getTop();
            rect.right = view2.getRight();
            rect.bottom = view2.getBottom();
            onDrawOverCard(c11, parent, state, list);
        }
    }

    public abstract void onDrawOverCard(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state, @NotNull List<? extends View> group);
}
