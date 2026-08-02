package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.adapter;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/adapter/QuickFiltersDividerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "dividerView", "<init>", "(Landroid/view/View;)V", "", "color", "", "bind", "(Ljava/lang/String;)V", "Landroid/view/View;", "currentColor", "Ljava/lang/String;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersDividerViewHolder extends RecyclerView.C {
    private String currentColor;

    @NotNull
    private final View dividerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickFiltersDividerViewHolder(@NotNull View dividerView) {
        super(dividerView);
        Intrinsics.checkNotNullParameter(dividerView, "dividerView");
        this.dividerView = dividerView;
    }

    public final void bind(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        if (Intrinsics.d(color, this.currentColor)) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.dividerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.dividerView.setBackgroundColor(styleParser.parseColor(context, color, UniColors.GRAPHIC_NEUTRAL.getResId()));
        this.currentColor = color;
    }
}
