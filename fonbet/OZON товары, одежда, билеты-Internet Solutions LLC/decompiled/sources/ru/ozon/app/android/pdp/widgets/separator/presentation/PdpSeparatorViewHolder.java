package ru.ozon.app.android.pdp.widgets.separator.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/separator/presentation/PdpSeparatorViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/separator/presentation/PdpSeparatorVO;", "", "Landroid/view/View;", "containerView", "Ll10/i;", "container", "<init>", "(Landroid/view/View;Ll10/i;)V", "item", "", "bind", "(Lru/ozon/app/android/pdp/widgets/separator/presentation/PdpSeparatorVO;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpSeparatorViewHolder extends TabEmbeddedWidgetViewHolder<PdpSeparatorVO> {

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpSeparatorViewHolder(@NotNull View containerView, @NotNull i container) {
        super(containerView, null, container);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        this.containerView = containerView;
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    public void bind(@NotNull PdpSeparatorVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View containerView = getContainerView();
        int px = ResourceExtKt.toPx(item.getHeight());
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setBackgroundColor(ContextExtKt.parseColor(context, item.getColor()));
        containerView.setMinimumHeight(px);
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        int i11 = layoutParams.height;
        layoutParams.height = px;
        if (i11 == px) {
            return;
        }
        containerView.setLayoutParams(layoutParams);
    }
}
