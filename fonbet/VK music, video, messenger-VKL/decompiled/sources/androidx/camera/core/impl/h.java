package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;

/* compiled from: DeferrableSurfaces.java */
/* loaded from: classes11.dex */
public final class h {
    public static void a(@NonNull List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                list.get(i).d();
                i++;
            } catch (DeferrableSurface.SurfaceClosedException e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    list.get(i2).b();
                }
                throw e;
            }
        } while (i < list.size());
    }
}
