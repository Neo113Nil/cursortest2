package z;

import C.S;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.W;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10951i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106826a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f106827b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f106828c;

    public C10951i(@NonNull I0 i02, @NonNull I0 i03) {
        this.f106826a = i03.a(TextureViewIsClosedQuirk.class);
        this.f106827b = i02.a(PreviewOrientationIncorrectQuirk.class);
        this.f106828c = i02.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public final void a(ArrayList arrayList) {
        if ((this.f106826a || this.f106827b || this.f106828c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((W) it.next()).d();
            }
            S.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
