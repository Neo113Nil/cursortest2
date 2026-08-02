package ru.ozon.app.android.uikit.view.shimmer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.shimmer.Shimmer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/ShimmerView;", "Lru/ozon/app/android/uikit/view/shimmer/ShimmerFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "addShimmerViews", "", "configShimmerAndSet", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShimmerView extends ShimmerFrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addShimmerViews() {
        View view = new View(getContext());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_primary));
        addView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    private final void configShimmerAndSet() {
        setShimmer(new Shimmer.AlphaHighlightBuilder().setDuration(800L).setRepeatDelay(800L).setBaseAlpha(1.0f).setHighlightAlpha(0.0f).setDropoff(0.34f).setIntensity(0.0f).setTilt(0.0f).setRepeatMode(1).setShape(Shimmer.Shape.LINEAR).build());
    }

    public /* synthetic */ ShimmerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        addShimmerViews();
        configShimmerAndSet();
    }
}
