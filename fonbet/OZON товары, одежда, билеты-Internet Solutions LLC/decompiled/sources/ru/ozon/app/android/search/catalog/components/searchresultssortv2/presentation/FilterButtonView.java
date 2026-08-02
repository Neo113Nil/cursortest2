package ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.search.databinding.ViewFilterButtonBinding;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0007J\u001a\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/FilterButtonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/search/databinding/ViewFilterButtonBinding;", "setIcon", "", "icon", "", "color", "setBadge", "text", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FilterButtonView extends LinearLayout {

    @NotNull
    private final ViewFilterButtonBinding binding;
    public static final int $stable = 8;
    private static final int paddingHorizontal = ResourceExtKt.toPx(16);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setBadge(String text, int color) {
        ViewFilterButtonBinding viewFilterButtonBinding = this.binding;
        AppCompatTextView badgeTv = viewFilterButtonBinding.badgeTv;
        Intrinsics.checkNotNullExpressionValue(badgeTv, "badgeTv");
        TextViewExtKt.setTextOrGone(badgeTv, text);
        viewFilterButtonBinding.badgeTv.getBackground().setTint(color);
    }

    public final void setIcon(@NotNull String icon, int color) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        ViewFilterButtonBinding viewFilterButtonBinding = this.binding;
        ImageView iconIv = viewFilterButtonBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ImageViewExtKt.load$default(iconIv, icon, null, null, null, null, false, null, 126, null);
        ImageView iconIv2 = viewFilterButtonBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
        ThemeExtKt.tint(iconIv2, Integer.valueOf(color));
    }

    public /* synthetic */ FilterButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewFilterButtonBinding.inflate(LayoutInflater.from(context), this);
        setOrientation(0);
        int i12 = paddingHorizontal;
        ViewExtKt.updatePadding$default(this, i12, 0, i12, 0, 10, null);
        setBackgroundResource(R$drawable.selector_standard);
        setClickable(true);
        setFocusable(true);
    }
}
