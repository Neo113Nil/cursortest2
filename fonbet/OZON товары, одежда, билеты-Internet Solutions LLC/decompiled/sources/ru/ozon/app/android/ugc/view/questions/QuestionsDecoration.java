package ru.ozon.app.android.ugc.view.questions;

import E0.C2942q;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.Q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.singlequestion.presentation.SingleQuestionVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/view/questions/QuestionsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "offset", "I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuestionsDecoration extends RecyclerView.n {
    private final int offset = ResourceExtKt.toPx(8);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Object obj;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Object a11 = C2942q.a(parent, "parent", state, "state");
        l lVar = a11 instanceof l ? (l) a11 : null;
        if (lVar == null) {
            return;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        boolean z11 = lVar.b(childAdapterPosition) instanceof SingleQuestionVO;
        IntRange intRange = new IntRange(0, lVar.getItemCount(), 1);
        ArrayList arrayList = new ArrayList(C7714v.z(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int b11 = ((Q) it).b();
            arrayList.add(new Pair(lVar.b(b11), Integer.valueOf(b11)));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((Pair) obj).e() instanceof SingleQuestionVO) {
                    break;
                }
            }
        }
        Pair pair = (Pair) obj;
        Integer num = pair != null ? (Integer) pair.f() : null;
        boolean z12 = num == null || childAdapterPosition != num.intValue();
        if (z11 && z12) {
            outRect.top = this.offset;
        }
    }
}
