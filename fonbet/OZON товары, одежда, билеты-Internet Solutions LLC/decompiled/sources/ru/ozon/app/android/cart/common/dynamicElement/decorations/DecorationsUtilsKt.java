package ru.ozon.app.android.cart.common.dynamicElement.decorations;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementType;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"findDynamicElementType", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementType;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Landroid/view/View;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DecorationsUtilsKt {
    public static final DynamicElementType findDynamicElementType(@NotNull RecyclerView recyclerView, @NotNull View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C findContainingViewHolder = recyclerView.findContainingViewHolder(view);
        Object obj = null;
        if (findContainingViewHolder == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(findContainingViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        RecyclerView.g adapter = recyclerView.getAdapter();
        Integer valueOf2 = adapter != null ? Integer.valueOf(adapter.getItemViewType(intValue)) : null;
        if (valueOf2 == null) {
            return null;
        }
        int intValue2 = valueOf2.intValue();
        Iterator<E> it = DynamicElementType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((DynamicElementType) next).getId() == intValue2) {
                obj = next;
                break;
            }
        }
        return (DynamicElementType) obj;
    }
}
