package l1;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7849z {
    @NotNull
    public static final Bitmap a(@NotNull InterfaceC7829k0 interfaceC7829k0) {
        if (interfaceC7829k0 instanceof C7848y) {
            return ((C7848y) interfaceC7829k0).a();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @NotNull
    public static final Bitmap.Config b(int i11) {
        return i11 == 0 ? Bitmap.Config.ARGB_8888 : i11 == 1 ? Bitmap.Config.ALPHA_8 : i11 == 2 ? Bitmap.Config.RGB_565 : i11 == 3 ? Bitmap.Config.RGBA_F16 : i11 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
