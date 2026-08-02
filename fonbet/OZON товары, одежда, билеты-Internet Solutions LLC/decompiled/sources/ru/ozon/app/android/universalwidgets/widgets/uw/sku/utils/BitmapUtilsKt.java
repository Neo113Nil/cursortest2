package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"getMemorySize", "", "Landroid/graphics/Bitmap;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BitmapUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long getMemorySize(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return bitmap.getHeight() * bitmap.getWidth() * getMemorySize$getBytesPerPixel(bitmap.getConfig());
    }

    private static final int getMemorySize$getBytesPerPixel(Bitmap.Config config) {
        int i11 = config == null ? -1 : WhenMappings.$EnumSwitchMapping$0[config.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 4;
            if (i11 != 2) {
                return i11 != 3 ? 4 : 2;
            }
        }
        return i12;
    }
}
