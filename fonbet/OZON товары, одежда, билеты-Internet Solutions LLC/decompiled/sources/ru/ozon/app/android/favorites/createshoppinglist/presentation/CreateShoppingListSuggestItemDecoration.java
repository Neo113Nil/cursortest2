package ru.ozon.app.android.favorites.createshoppinglist.presentation;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.spacer.CreateShoppingListSpacerVO;
import ru.ozon.app.android.favorites.feature.R$drawable;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSuggestItemDecoration;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "drawFor", "", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "child", "Landroid/view/View;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateShoppingListSuggestItemDecoration extends CustomDividerDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShoppingListSuggestItemDecoration(@NotNull Context context) {
        super(context, 1, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setDivider(a.getDrawable(context, R$drawable.divider_favorites_suggests_list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        RecyclerView.g adapter = parent.getAdapter();
        if (adapter == 0) {
            return false;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        if (isValidPos(childAdapterPosition, adapter)) {
            int i11 = childAdapterPosition + 1;
            if (!isValidPos(i11, parent.getAdapter()) || !(adapter instanceof l)) {
                return false;
            }
            l lVar = (l) adapter;
            l lVar2 = lVar.a(childAdapterPosition) ? adapter : null;
            c b11 = lVar2 != null ? lVar2.b(childAdapterPosition) : null;
            l lVar3 = adapter;
            if (!lVar.a(i11)) {
                lVar3 = null;
            }
            c b12 = lVar3 != null ? lVar3.b(i11) : null;
            if ((b11 instanceof CreateShoppingListSuggestItemVO) && !(b12 instanceof CreateShoppingListSpacerVO)) {
                return true;
            }
        }
        return false;
    }
}
