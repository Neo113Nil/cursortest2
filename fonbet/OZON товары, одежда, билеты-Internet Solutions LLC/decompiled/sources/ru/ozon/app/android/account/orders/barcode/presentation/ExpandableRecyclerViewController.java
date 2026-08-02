package ru.ozon.app.android.account.orders.barcode.presentation;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\f\u0010\u0017\u001a\u00020\u0010*\u00020\u0012H\u0002J\f\u0010\u0018\u001a\u00020\u0010*\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/ExpandableRecyclerViewController;", "", "screenWidth", "", "screenHeight", "paddingTopBottom", "navigationBarHeight", "<init>", "(IIII)V", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "", "expandedOffset", "", "getExpandedOffset", "()F", "updateScreenSize", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "width", "height", "updateState", "resizeRecyclerView", "setStateExpanded", "setStateCollapsed", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExpandableRecyclerViewController {
    private boolean expanded;
    private final int navigationBarHeight;
    private int paddingTopBottom;
    private int screenHeight;
    private int screenWidth;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/ExpandableRecyclerViewController$Companion;", "", "<init>", "()V", "EXPANDED_ROTATION", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ExpandableRecyclerViewController(int i11, int i12, int i13, int i14) {
        this.screenWidth = i11;
        this.screenHeight = i12;
        this.paddingTopBottom = i13;
        this.navigationBarHeight = i14;
    }

    private final float getExpandedOffset() {
        return (((this.screenHeight - this.screenWidth) - this.paddingTopBottom) - this.navigationBarHeight) * 0.5f;
    }

    private final void resizeRecyclerView(RecyclerView rv) {
        if (this.expanded) {
            setStateExpanded(rv);
        } else {
            setStateCollapsed(rv);
        }
    }

    private final void setStateCollapsed(RecyclerView recyclerView) {
        recyclerView.setRotation(0.0f);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setTranslationY(0.0f);
        recyclerView.setTranslationX(0.0f);
    }

    private final void setStateExpanded(RecyclerView recyclerView) {
        recyclerView.setRotation(270.0f);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = (this.screenHeight - this.paddingTopBottom) - this.navigationBarHeight;
        layoutParams.height = this.screenWidth;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setTranslationY(getExpandedOffset());
        recyclerView.setTranslationX(-getExpandedOffset());
    }

    public final void updateScreenSize(@NotNull RecyclerView rv, int width, int height) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        if (this.screenWidth == width && this.screenHeight == height) {
            return;
        }
        this.screenWidth = width;
        this.screenHeight = height;
        if (this.expanded) {
            resizeRecyclerView(rv);
        }
    }

    public final void updateState(@NotNull RecyclerView rv, boolean expanded) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        this.expanded = expanded;
        resizeRecyclerView(rv);
    }

    public /* synthetic */ ExpandableRecyclerViewController(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, (i15 & 4) != 0 ? UiExtKt.toPx(15) : i13, (i15 & 8) != 0 ? 0 : i14);
    }
}
