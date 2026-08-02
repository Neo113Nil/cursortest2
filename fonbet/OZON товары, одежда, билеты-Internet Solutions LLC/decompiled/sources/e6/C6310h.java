package e6;

import T5.i;
import T5.k;
import V5.v;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* renamed from: e6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6310h implements k<Drawable, Drawable> {
    @Override // T5.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Drawable drawable, @NonNull i iVar) throws IOException {
        return true;
    }

    @Override // T5.k
    public final v<Drawable> b(@NonNull Drawable drawable, int i11, int i12, @NonNull i iVar) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new C6308f(drawable2);
        }
        return null;
    }
}
