package ru.ozon.app.android.pdp.ui.configurators.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"ru/ozon/app/android/pdp/ui/configurators/base/WidgetScrollInfoHolder$AspectsCompact", "", "<init>", "()V", "Lru/ozon/app/android/pdp/ui/configurators/base/WidgetScrollInfo;", "widgetScrollInfo", "()Lru/ozon/app/android/pdp/ui/configurators/base/WidgetScrollInfo;", "", "change", "(Lru/ozon/app/android/pdp/ui/configurators/base/WidgetScrollInfo;)V", "Lru/ozon/app/android/pdp/ui/configurators/base/WidgetScrollInfo;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WidgetScrollInfoHolder$AspectsCompact {

    @NotNull
    public static final WidgetScrollInfoHolder$AspectsCompact INSTANCE = new WidgetScrollInfoHolder$AspectsCompact();

    @NotNull
    private static WidgetScrollInfo widgetScrollInfo = WidgetScrollInfoEmpty.INSTANCE;
    public static final int $stable = 8;

    private WidgetScrollInfoHolder$AspectsCompact() {
    }

    public void change(@NotNull WidgetScrollInfo widgetScrollInfo2) {
        Intrinsics.checkNotNullParameter(widgetScrollInfo2, "widgetScrollInfo");
        if (Intrinsics.d(widgetScrollInfo2, widgetScrollInfo)) {
            return;
        }
        widgetScrollInfo = widgetScrollInfo2;
    }

    @NotNull
    public WidgetScrollInfo widgetScrollInfo() {
        return widgetScrollInfo;
    }
}
