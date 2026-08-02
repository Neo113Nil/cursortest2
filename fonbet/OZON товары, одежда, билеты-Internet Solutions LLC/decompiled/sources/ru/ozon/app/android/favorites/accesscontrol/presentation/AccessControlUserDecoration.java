package ru.ozon.app.android.favorites.accesscontrol.presentation;

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
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.accesscontrol.presentation.users.AccessControlUserWidgetViewHolder;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/presentation/AccessControlUserDecoration;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "child", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "Lkotlin/reflect/d;", "supportedViewHolders", "", "shouldDrawDividerFor", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)Z", "drawFor", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "", "startDividerOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccessControlUserDecoration extends CustomDividerDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessControlUserDecoration(@NotNull Context context) {
        super(context, 1, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setDivider(a.getDrawable(context, R$drawable.list_divider));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean shouldDrawDividerFor(View child, RecyclerView parent, List<? extends d<?>> supportedViewHolders) {
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        if (childAdapterPosition != -1 && parent.getAdapter() != null) {
            boolean contains = supportedViewHolders.contains(N.b(parent.getChildViewHolder(child).getClass()));
            RecyclerView.g adapter = parent.getAdapter();
            boolean z11 = adapter != null && childAdapterPosition + 1 == adapter.getShimmersCount();
            RecyclerView.C findViewHolderForAdapterPosition = parent.findViewHolderForAdapterPosition(childAdapterPosition + 1);
            if (findViewHolderForAdapterPosition != null) {
                boolean contains2 = supportedViewHolders.contains(N.b(findViewHolderForAdapterPosition.getClass()));
                if (!contains || !contains2) {
                }
            } else if (contains && !z11) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return shouldDrawDividerFor(child, parent, C7714v.a0(N.b(AccessControlUserWidgetViewHolder.class)));
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public int startDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return ResourceExtKt.toPx(60);
    }
}
