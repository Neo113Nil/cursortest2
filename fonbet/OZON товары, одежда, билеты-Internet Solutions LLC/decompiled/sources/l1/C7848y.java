package l1;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7848y implements InterfaceC7829k0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bitmap f72293b;

    public C7848y(@NotNull Bitmap bitmap) {
        this.f72293b = bitmap;
    }

    @NotNull
    public final Bitmap a() {
        return this.f72293b;
    }

    public final int b() {
        Bitmap.Config config = this.f72293b.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }

    public final void c() {
        this.f72293b.prepareToDraw();
    }

    @Override // l1.InterfaceC7829k0
    public final int getHeight() {
        return this.f72293b.getHeight();
    }

    @Override // l1.InterfaceC7829k0
    public final int getWidth() {
        return this.f72293b.getWidth();
    }
}
