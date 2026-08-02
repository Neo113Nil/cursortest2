package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\n2\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/UserLegalEntitiesItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "getTopOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "pos", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "adapter", "", "isValidPos", "(ILandroidx/recyclerview/widget/RecyclerView$g;)Z", "Landroid/graphics/Rect;", "outRect", "view", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "topOffset", "I", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserLegalEntitiesItemDecoration extends RecyclerView.n {

    @NotNull
    private final Context context;
    private final int topOffset;

    public UserLegalEntitiesItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.topOffset = ResourceExtKt.toPx(24, context);
    }

    private final int getTopOffset(RecyclerView parent, View child) {
        Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(child));
        int intValue = valueOf.intValue();
        Integer num = null;
        if (!isValidPos(intValue, parent.getAdapter()) || !isValidPos(intValue - 1, parent.getAdapter())) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        int intValue2 = valueOf.intValue();
        Object adapter = parent.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar != null) {
            l lVar2 = lVar.a(intValue2) ? lVar : null;
            c b11 = lVar2 != null ? lVar2.b(intValue2) : null;
            int i11 = intValue2 - 1;
            if (!lVar.a(i11)) {
                lVar = null;
            }
            c b12 = lVar != null ? lVar.b(i11) : null;
            if ((b11 instanceof LegalsItemVO) && !(b12 instanceof LegalsItemVO)) {
                num = Integer.valueOf(this.topOffset);
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final boolean isValidPos(int pos, RecyclerView.g<? extends RecyclerView.C> adapter) {
        if (adapter != null) {
            int cardsCount = adapter.getCardsCount();
            if (pos >= 0 && pos < cardsCount) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.top = getTopOffset(parent, view);
    }
}
