package ru.ozon.app.android.storefront.widgets.navbarv2.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/core/Constants;", "", "<init>", "()V", "", "SCROLL_FLOOR_CENTER_CONTENT_HEIGHT", "I", "getSCROLL_FLOOR_CENTER_CONTENT_HEIGHT", "()I", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Constants {

    @NotNull
    public static final Constants INSTANCE = new Constants();
    private static final int SCROLL_FLOOR_CENTER_CONTENT_HEIGHT = ResourceExtKt.toPx(176);

    private Constants() {
    }

    public final int getSCROLL_FLOOR_CENTER_CONTENT_HEIGHT() {
        return SCROLL_FLOOR_CENTER_CONTENT_HEIGHT;
    }
}
