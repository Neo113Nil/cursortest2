package ru.ozon.app.android.bank.widgets.aboutInstallment.presentation;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.databinding.WidgetInstallmentAboutItemBinding;
import ru.ozon.app.android.bank.widgets.aboutInstallment.presentation.AboutInstallmentVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/ItemVH;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO$ItemVO;", "item", "", "bind", "(Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO$ItemVO;)V", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentAboutItemBinding;", "binding", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentAboutItemBinding;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemVH extends j {

    @NotNull
    private final WidgetInstallmentAboutItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemVH(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        WidgetInstallmentAboutItemBinding bind = WidgetInstallmentAboutItemBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    public final void bind(@NotNull AboutInstallmentVO.ItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, StyleParser.OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE.getValue());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ViewExtKt.setBackgroundTint(itemView, intValue);
        }
        ImageView imageIv = this.binding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ImageViewExtKt.load$default(imageIv, item.getImage(), null, null, null, null, false, null, 126, null);
        TextAtomView textTv = this.binding.textTv;
        Intrinsics.checkNotNullExpressionValue(textTv, "textTv");
        TextAtomHolderKt.bind$default(textTv, item.getText(), null, 2, null);
        this.itemView.setClipToOutline(true);
    }
}
