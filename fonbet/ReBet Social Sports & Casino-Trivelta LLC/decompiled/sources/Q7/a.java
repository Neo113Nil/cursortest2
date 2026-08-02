package Q7;

import H7.e;
import H7.g;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements G7.a {
    @Override // G7.a
    public Drawable a(e image) {
        Intrinsics.checkNotNullParameter(image, "image");
        g gVar = image instanceof g ? (g) image : null;
        if (gVar != null) {
            return gVar.l1();
        }
        return null;
    }

    @Override // G7.a
    public boolean b(e image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof g;
    }
}
