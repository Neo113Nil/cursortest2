package z;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.W;
import java.util.ArrayList;
import java.util.Iterator;
import u.C9887a;

/* renamed from: z.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10967y {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106852a;

    public C10967y() {
        this.f106852a = androidx.camera.camera2.internal.compat.quirk.b.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    @NonNull
    public static Q a(@NonNull Q q11) {
        Q.a aVar = new Q.a();
        aVar.s(q11.j());
        Iterator<W> it = q11.h().iterator();
        while (it.hasNext()) {
            aVar.f(it.next());
        }
        aVar.e(q11.f());
        C9887a.C2193a c2193a = new C9887a.C2193a();
        c2193a.e(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c2193a.c());
        return aVar.h();
    }

    public final boolean b(@NonNull ArrayList arrayList, boolean z11) {
        if (!this.f106852a || !z11) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
