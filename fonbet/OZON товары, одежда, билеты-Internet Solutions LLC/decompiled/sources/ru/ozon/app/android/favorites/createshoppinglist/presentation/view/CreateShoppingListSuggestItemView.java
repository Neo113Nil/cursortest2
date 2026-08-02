package ru.ozon.app.android.favorites.createshoppinglist.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.feature.R$id;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/view/CreateShoppingListSuggestItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textTv", "Landroidx/appcompat/widget/AppCompatTextView;", "getTextTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateShoppingListSuggestItemView extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_12 = ResourceExtKt.toPx(12);
    private static final int DP_16 = ResourceExtKt.toPx(16);

    @NotNull
    private final AppCompatTextView textTv;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/view/CreateShoppingListSuggestItemView$Companion;", "", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateShoppingListSuggestItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final AppCompatTextView getTextTv() {
        return this.textTv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShoppingListSuggestItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        appCompatTextView.setId(R$id.textTv);
        TextViewExtKt.applyStyle(appCompatTextView, context, R$style.TextStyle_Body_L);
        this.textTv = appCompatTextView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundColor(getResources().getColor(R$color.layer_floor_1, context.getTheme()));
        setForeground(a.getDrawable(context, R$drawable.bg_ripple_blue_rounded));
        int i12 = DP_16;
        int i13 = DP_12;
        setPadding(i12, i13, i12, i13);
        setClickable(true);
        setFocusable(true);
        addView(appCompatTextView);
    }
}
