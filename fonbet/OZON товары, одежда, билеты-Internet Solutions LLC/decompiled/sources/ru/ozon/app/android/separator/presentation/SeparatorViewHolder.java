package ru.ozon.app.android.separator.presentation;

import Sc.o;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.separator.presentation.SeparatorVO;
import ru.ozon.app.android.storefront.ui.separator.databinding.WidgetSeparatorBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/separator/presentation/SeparatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/separator/presentation/SeparatorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/separator/presentation/SeparatorVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/storefront/ui/separator/databinding/WidgetSeparatorBinding;", "binding", "Lru/ozon/app/android/storefront/ui/separator/databinding/WidgetSeparatorBinding;", "separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SeparatorViewHolder extends k<SeparatorVO> {

    @NotNull
    private final WidgetSeparatorBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetSeparatorBinding bind = WidgetSeparatorBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SeparatorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R.color.transparent);
        ViewGroup.LayoutParams layoutParams = this.binding.separatorV.getLayoutParams();
        SeparatorVO.Mode sizeMode = item.getSizeMode();
        if (sizeMode instanceof SeparatorVO.Mode.Ratio) {
            layoutParams.height = 0;
            this.binding.separatorV.setRatio(Float.valueOf(((SeparatorVO.Mode.Ratio) item.getSizeMode()).getRatio()));
        } else {
            if (!(sizeMode instanceof SeparatorVO.Mode.Height)) {
                throw new o();
            }
            this.binding.separatorV.setRatio(null);
            layoutParams.height = ((SeparatorVO.Mode.Height) item.getSizeMode()).getHeight();
        }
        ExtensionsKt.getExhaustive(Unit.f71690a);
        this.binding.separatorV.setBackgroundColor(parseColor);
        this.binding.separatorV.requestLayout();
    }
}
