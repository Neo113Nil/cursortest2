package f0;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.InterfaceC5084b0;
import androidx.camera.core.impl.InterfaceC5086c0;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6391b implements InterfaceC5084b0 {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final InterfaceC5084b0 f62409b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final I0 f62410c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final HashMap f62411d = new HashMap();

    public C6391b(@NonNull InterfaceC5084b0 interfaceC5084b0, @NonNull I0 i02) {
        this.f62409b = interfaceC5084b0;
        this.f62410c = i02;
    }

    private InterfaceC5086c0 c(int i11) {
        Size size;
        HashMap hashMap = this.f62411d;
        if (hashMap.containsKey(Integer.valueOf(i11))) {
            return (InterfaceC5086c0) hashMap.get(Integer.valueOf(i11));
        }
        InterfaceC5084b0 interfaceC5084b0 = this.f62409b;
        InterfaceC5086c0 interfaceC5086c0 = null;
        if (interfaceC5084b0.b(i11)) {
            InterfaceC5086c0 a11 = interfaceC5084b0.a(i11);
            Objects.requireNonNull(a11);
            Iterator it = this.f62410c.c(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                    if (i11 == 4) {
                        size = new Size(640, 480);
                    } else if (i11 == 5) {
                        size = new Size(960, 720);
                    } else if (i11 == 6) {
                        size = new Size(1440, 1080);
                    }
                }
            }
            size = null;
            if (size == null) {
                interfaceC5086c0 = a11;
            } else {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC5086c0.c cVar : a11.d()) {
                    arrayList.add(InterfaceC5086c0.c.a(cVar.e(), cVar.i(), cVar.c(), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g()));
                }
                if (!arrayList.isEmpty()) {
                    interfaceC5086c0 = InterfaceC5086c0.b.e(a11.c(), a11.a(), a11.b(), arrayList);
                }
            }
        }
        hashMap.put(Integer.valueOf(i11), interfaceC5086c0);
        return interfaceC5086c0;
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final InterfaceC5086c0 a(int i11) {
        return c(i11);
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final boolean b(int i11) {
        return this.f62409b.b(i11) && c(i11) != null;
    }
}
