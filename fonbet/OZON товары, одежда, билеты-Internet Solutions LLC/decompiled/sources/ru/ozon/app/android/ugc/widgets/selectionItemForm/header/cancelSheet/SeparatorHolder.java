package ru.ozon.app.android.ugc.widgets.selectionItemForm.header.cancelSheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/SeparatorHolder;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/ItemViewHolder;", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "separatorView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "item", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SeparatorHolder extends ItemViewHolder<SeparatorDTO> {

    @NotNull
    private final View separatorView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorHolder(@NotNull View separatorView) {
        super(separatorView);
        Intrinsics.checkNotNullParameter(separatorView, "separatorView");
        this.separatorView = separatorView;
    }

    public void bind(@NotNull SeparatorDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Integer height = item.getHeight();
        int px = height != null ? ResourceExtKt.toPx(height.intValue()) : 0;
        View view = this.separatorView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i11 = layoutParams.height;
        layoutParams.height = px;
        if (i11 != px) {
            view.setLayoutParams(layoutParams);
        }
        View view2 = this.separatorView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view2.setBackgroundColor(styleParser.parseColor(context, item.getColor(), UniColors.LAYER_FLOOR_1.getResId()));
    }
}
