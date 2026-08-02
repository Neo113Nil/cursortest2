package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.R$drawable;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/SearchDividerDecoration;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "startOffset", "", "startDividerOffset", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "child", "Landroid/view/View;", "drawFor", "", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchDividerDecoration extends CustomDividerDecoration {
    private final int startOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDividerDecoration(@NotNull Context context) {
        super(context, 1, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.startOffset = ResourceExtKt.toPx(16);
        setDivider(a.getDrawable(context, R$drawable.divider_search));
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return true;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public int startDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return this.startOffset;
    }
}
