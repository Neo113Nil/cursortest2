package ru.ozon.app.android.storefront.core.socialAtoms.rightPanel;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelConstants;", "", "<init>", "()V", "", "BOTTOM_PADDING_NO_TEXT", "I", "getBOTTOM_PADDING_NO_TEXT", "()I", "BOTTOM_PADDING_WITH_TEXT", "getBOTTOM_PADDING_WITH_TEXT", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RightPanelConstants {

    @NotNull
    public static final RightPanelConstants INSTANCE = new RightPanelConstants();
    private static final int BOTTOM_PADDING_NO_TEXT = UiExtKt.toPx(16);
    private static final int BOTTOM_PADDING_WITH_TEXT = UiExtKt.toPx(12);

    private RightPanelConstants() {
    }

    public final int getBOTTOM_PADDING_NO_TEXT() {
        return BOTTOM_PADDING_NO_TEXT;
    }

    public final int getBOTTOM_PADDING_WITH_TEXT() {
        return BOTTOM_PADDING_WITH_TEXT;
    }
}
