package l1;

import android.graphics.Shader;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.J, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7792J {
    @NotNull
    public static final Shader.TileMode a(int i11) {
        if (i11 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i11 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i11 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i11 == 3 && Build.VERSION.SDK_INT >= 31) {
            return M0.f72230a.b();
        }
        return Shader.TileMode.CLAMP;
    }
}
