package ru.ozon.app.android.commonwidgets.widgets.valuestotal.presentation;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.databinding.WidgetValuesTotalBinding;
import ru.ozon.app.android.commonwidgets.widgets.valuestotal.data.ValuesTotalDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/valuestotal/presentation/ValuesTotalViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/valuestotal/presentation/ValuesTotalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "", "bindTitle", "(Lru/ozon/app/android/commonwidgets/widgets/valuestotal/presentation/ValuesTotalVO;)V", "bindItems", "addDivider", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/valuestotal/presentation/ValuesTotalVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/commonwidgets/databinding/WidgetValuesTotalBinding;", "binding", "Lru/ozon/app/android/commonwidgets/databinding/WidgetValuesTotalBinding;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ValuesTotalViewHolder extends k<ValuesTotalVO> {

    @NotNull
    private final WidgetValuesTotalBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValuesTotalViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetValuesTotalBinding bind = WidgetValuesTotalBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void addDivider() {
        LinearLayout itemsLl = this.binding.itemsLl;
        Intrinsics.checkNotNullExpressionValue(itemsLl, "itemsLl");
        itemsLl.addView(ViewGroupExtKt.inflate(itemsLl, R$layout.widget_values_total_divider_view));
    }

    private final void bindItems(ValuesTotalVO item) {
        this.binding.itemsLl.removeAllViews();
        int i11 = 0;
        for (Object obj : item.getItems()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ValuesTotalItemView valuesTotalItemView = new ValuesTotalItemView(getContext(), null, 0, 6, null);
            valuesTotalItemView.bind((ValuesTotalDTO.Item) obj);
            this.binding.itemsLl.addView(valuesTotalItemView);
            if (i11 != C7714v.P(item.getItems())) {
                addDivider();
            }
            i11 = i12;
        }
    }

    private final void bindTitle(ValuesTotalVO item) {
        TextAtom title = item.getTitle();
        if (title == null) {
            TextAtomView headerTav = this.binding.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav, "headerTav");
            ViewExtKt.gone(headerTav);
        } else {
            TextAtomView headerTav2 = this.binding.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav2, "headerTav");
            TextAtomHolderKt.bind$default(headerTav2, title, null, 2, null);
            TextAtomView headerTav3 = this.binding.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav3, "headerTav");
            ViewExtKt.show(headerTav3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ValuesTotalVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindTitle(item);
        bindItems(item);
    }
}
