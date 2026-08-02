package ru.ozon.app.android.favorites.wishlistMultiselect.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.feature.R$drawable;
import ru.ozon.app.android.favorites.feature.R$id;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStileAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "submitButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getSubmitButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WishlistMultiselectView extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_8 = ResourceExtKt.toPx(8);

    @NotNull
    private final ButtonV3View submitButton;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectView$Companion;", "", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ WishlistMultiselectView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final ButtonV3View getSubmitButton() {
        return this.submitButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WishlistMultiselectView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i12 = DP_8;
        layoutParams.setMargins(i12, i12, i12, i12);
        buttonV3View.setLayoutParams(layoutParams);
        buttonV3View.setId(R$id.saveBtn);
        this.submitButton = buttonV3View;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundResource(R$drawable.bg_wishlist_multiselect);
        addView(buttonV3View);
    }
}
