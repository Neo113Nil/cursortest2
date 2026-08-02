package ru.ozon.app.android.favorites.createshoppinglist.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.feature.R$id;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/view/CreateShoppingListSaveButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getButton", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateShoppingListSaveButtonView extends FrameLayout {

    @NotNull
    private final LargeButtonView button;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_16 = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/view/CreateShoppingListSaveButtonView$Companion;", "", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateShoppingListSaveButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final LargeButtonView getButton() {
        return this.button;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShoppingListSaveButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, 0, 14, null);
        largeButtonView.setId(R$id.saveBtn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i12 = DP_16;
        int i13 = DP_8;
        layoutParams.setMargins(i12, i13, i12, i13);
        largeButtonView.setLayoutParams(layoutParams);
        addView(largeButtonView);
        this.button = largeButtonView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundColor(getResources().getColor(R$color.layer_floor_1, context.getTheme()));
    }
}
