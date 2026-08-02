package ru.ozon.app.android.orderdetails.dateselector.presentation;

import EE.b;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.WidgetDateSelectorBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/orderdetails/dateselector/presentation/DateSelectorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/dateselector/presentation/DateSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "<init>", "(Landroid/view/View;Ll10/b;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/dateselector/presentation/DateSelectorVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetDateSelectorBinding;", "binding", "Lru/ozon/app/android/orderdetails/databinding/WidgetDateSelectorBinding;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateSelectorViewHolder extends k<DateSelectorVO> {

    @NotNull
    private final WidgetDateSelectorBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateSelectorViewHolder(@NotNull View containerView, @NotNull InterfaceC7851b controller) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(controller, "controller");
        WidgetDateSelectorBinding bind = WidgetDateSelectorBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.dateLl.setOnClickListener(new b(2, this, controller));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DateSelectorViewHolder dateSelectorViewHolder, InterfaceC7851b interfaceC7851b, View view) {
        String deeplink;
        DateSelectorVO boundData = dateSelectorViewHolder.getBoundData();
        if (boundData == null || (deeplink = boundData.getDeeplink()) == null) {
            return;
        }
        InterfaceC7851b.a.a(interfaceC7851b, deeplink, null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DateSelectorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetDateSelectorBinding widgetDateSelectorBinding = this.binding;
        widgetDateSelectorBinding.dateTitleTv.setText(item.getTitle());
        ImageView dateIconIv = widgetDateSelectorBinding.dateIconIv;
        Intrinsics.checkNotNullExpressionValue(dateIconIv, "dateIconIv");
        ViewExtKt.showOrGone(dateIconIv, Boolean.valueOf(item.getIsSelected()));
    }
}
