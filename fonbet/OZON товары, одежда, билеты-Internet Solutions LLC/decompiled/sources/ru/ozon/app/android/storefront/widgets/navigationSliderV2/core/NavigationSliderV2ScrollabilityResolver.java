package ru.ozon.app.android.storefront.widgets.navigationSliderV2.core;

import android.content.Context;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0007J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ScrollabilityResolver;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "displayWidth", "", "dp12", "dp16", "dp64", "dp80", "dp360", "dp431", "leftMargin", "getItemWidth", "count", "isScrollable", "", "getItemWidthPrivate", "isScrollablePrivate", "itemWidth", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderV2ScrollabilityResolver {
    private final int displayWidth;
    private final int dp12;
    private final int dp16;
    private final int dp360;
    private final int dp431;
    private final int dp64;
    private final int dp80;
    private final int leftMargin;

    public NavigationSliderV2ScrollabilityResolver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.displayWidth = context.getResources().getDisplayMetrics().widthPixels;
        this.dp12 = ResourceExtKt.toPx(12);
        this.dp16 = ResourceExtKt.toPx(16);
        this.dp64 = ResourceExtKt.toPx(64);
        this.dp80 = ResourceExtKt.toPx(80);
        this.dp360 = ResourceExtKt.toPx(360);
        this.dp431 = ResourceExtKt.toPx(431);
        this.leftMargin = ResourceExtKt.toPx(8);
    }

    private final int getItemWidthPrivate() {
        int i11 = this.displayWidth;
        return i11 <= this.dp360 ? this.dp64 : i11 >= this.dp431 ? this.dp80 : C6915b.b((i11 - this.dp12) / 5.5d);
    }

    private final boolean isScrollablePrivate(int itemWidth, int count) {
        return (this.leftMargin * 2) + (itemWidth * count) > this.displayWidth;
    }

    public final int getItemWidth(int count) {
        int itemWidthPrivate = getItemWidthPrivate();
        return isScrollablePrivate(itemWidthPrivate, count) ? itemWidthPrivate : (this.displayWidth - this.dp16) / count;
    }

    public final boolean isScrollable(int count) {
        return (this.leftMargin * 2) + (getItemWidthPrivate() * count) > this.displayWidth;
    }
}
