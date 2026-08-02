package ru.ozon.app.android.account.orders.selectPayment.presentation;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentItemDecoration;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "position", "Lm10/l;", "adapter", "", "isSameAsNext", "(ILm10/l;)Z", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "drawFor", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectPaymentItemDecoration extends CustomDividerDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentItemDecoration(@NotNull Context context) {
        super(context, 1, 0, true, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setDivider(a.getDrawable(context, R$drawable.list_divider_with_left_padding));
    }

    private final boolean isSameAsNext(int position, l adapter) {
        c b11 = adapter.b(position);
        if ((b11 instanceof SelectPaymentVO ? (SelectPaymentVO) b11 : null) == null) {
            return false;
        }
        c b12 = adapter.b(position + 1);
        return (b12 instanceof SelectPaymentVO ? (SelectPaymentVO) b12 : null) != null;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        Object adapter = parent.getAdapter();
        Intrinsics.f(adapter);
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar == null) {
            return false;
        }
        return isSameAsNext(childAdapterPosition, lVar);
    }
}
