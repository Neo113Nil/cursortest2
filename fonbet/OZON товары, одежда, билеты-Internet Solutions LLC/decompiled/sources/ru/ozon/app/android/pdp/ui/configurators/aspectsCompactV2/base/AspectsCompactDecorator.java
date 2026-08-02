package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactDecorator;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "startMargin", "", "startDividerOffset", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "child", "Landroid/view/View;", "drawFor", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsCompactDecorator extends CustomDividerDecoration {
    private final int startMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsCompactDecorator(@NotNull Context context) {
        super(context, 1, 0, true, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.startMargin = ResourceExtKt.toPx(16);
        setDivider(new ColorDrawable(ThemeExtKt.themeColor(context, R$attr.graphicNeutral)));
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(child));
        int intValue = valueOf.intValue();
        if (!isValidPos(intValue, parent.getAdapter()) || !isValidPos(intValue + 1, parent.getAdapter())) {
            valueOf = null;
        }
        if (valueOf == null) {
            return false;
        }
        int intValue2 = valueOf.intValue();
        Object adapter = parent.getAdapter();
        Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.composer.ui.adapter.DecoratedAdapter");
        l lVar = (l) adapter;
        l lVar2 = lVar.a(intValue2) ? lVar : null;
        if (lVar2 != null) {
            lVar2.b(intValue2);
        }
        int i11 = intValue2 + 1;
        l lVar3 = lVar.a(i11) ? lVar : null;
        if (lVar3 == null) {
            return false;
        }
        lVar3.b(i11);
        return false;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public int startDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return this.startMargin;
    }
}
