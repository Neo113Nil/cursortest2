package ru.ozon.app.android.favorites.shoppinglistv2.presentation.item;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.feature.R$drawable;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.createlist.ShoppingListsV2CreateListViewHolder;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2Decoration;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "drawFor", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "", "startDividerOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "", "Lkotlin/reflect/d;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "supportedViewHolders", "Ljava/util/List;", "I", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShoppingListsV2Decoration extends CustomDividerDecoration {
    private final int startDividerOffset;

    @NotNull
    private final List<d<? extends k<? extends c>>> supportedViewHolders;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListsV2Decoration(@NotNull Context context) {
        super(context, 1, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.supportedViewHolders = C7714v.b0(N.b(ShoppingListsV2ItemViewHolder.class), N.b(ShoppingListsV2CreateListViewHolder.class));
        this.startDividerOffset = ResourceExtKt.toPx(16);
        setDivider(a.getDrawable(context, R$drawable.divider_favorites_list));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        boolean A11 = C7714v.A(this.supportedViewHolders, N.b(parent.getChildViewHolder(child).getClass()));
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        RecyclerView.g adapter = parent.getAdapter();
        boolean z11 = adapter != null && childAdapterPosition + 1 == adapter.getShimmersCount();
        RecyclerView.C findViewHolderForAdapterPosition = parent.findViewHolderForAdapterPosition(childAdapterPosition + 1);
        if (findViewHolderForAdapterPosition == null) {
            return A11 && !z11;
        }
        boolean A12 = C7714v.A(this.supportedViewHolders, N.b(findViewHolderForAdapterPosition.getClass()));
        if (!A11 || !A12) {
        }
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public int startDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return this.startDividerOffset;
    }
}
