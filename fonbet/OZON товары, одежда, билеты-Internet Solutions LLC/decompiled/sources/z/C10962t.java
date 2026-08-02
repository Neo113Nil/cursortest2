package z;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.V0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10962t {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f106844a = (ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class);

    @NonNull
    public final List<Size> a(@NonNull V0.b bVar, @NonNull List<Size> list) {
        Size e11;
        if (this.f106844a == null || (e11 = ExtraCroppingQuirk.e(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(e11);
        for (Size size : list) {
            if (!size.equals(e11)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }
}
