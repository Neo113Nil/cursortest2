package f0;

import W.u0;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.InterfaceC5084b0;
import androidx.camera.core.impl.InterfaceC5086c0;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import c0.k;
import d0.Y;
import d0.Z;
import d0.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x2.i;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6390a implements InterfaceC5084b0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5084b0 f62407b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f62408c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public C6390a(@NonNull H h11, @NonNull InterfaceC5084b0 interfaceC5084b0, @NonNull I0 i02) {
        this.f62407b = interfaceC5084b0;
        ArrayList c11 = i02.c(ExtraSupportedQualityQuirk.class);
        if (c11.isEmpty()) {
            return;
        }
        ?? r62 = 0;
        r62 = 0;
        r62 = 0;
        i.f(null, c11.size() == 1);
        ((ExtraSupportedQualityQuirk) c11.get(0)).getClass();
        Z z11 = a0.f60873c;
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
            r62 = Collections.EMPTY_MAP;
        } else if ("1".equals(h11.b()) && !interfaceC5084b0.b(4)) {
            InterfaceC5086c0 a11 = interfaceC5084b0.a(1);
            InterfaceC5086c0.c cVar = (a11 == null || a11.d().isEmpty()) ? null : a11.d().get(0);
            if (cVar != null) {
                Y y11 = (Y) z11.apply(k.d(cVar));
                Range<Integer> c12 = y11 != null ? y11.c() : u0.f33138b;
                Size size = M.c.f17202d;
                InterfaceC5086c0.b e11 = InterfaceC5086c0.b.e(a11.c(), a11.a(), a11.b(), Collections.singletonList(InterfaceC5086c0.c.a(cVar.e(), cVar.i(), k.c(cVar.c(), cVar.b(), cVar.b(), cVar.f(), cVar.f(), size.getWidth(), cVar.k(), size.getHeight(), cVar.h(), c12), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g())));
                r62 = new HashMap();
                r62.put(4, e11);
                Size size2 = new Size(cVar.k(), cVar.h());
                if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                    r62.put(1, e11);
                }
            }
        }
        if (r62 != 0) {
            this.f62408c = new HashMap((Map) r62);
        }
    }

    private InterfaceC5086c0 c(int i11) {
        HashMap hashMap = this.f62408c;
        return (hashMap == null || !hashMap.containsKey(Integer.valueOf(i11))) ? this.f62407b.a(i11) : (InterfaceC5086c0) hashMap.get(Integer.valueOf(i11));
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final InterfaceC5086c0 a(int i11) {
        return c(i11);
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final boolean b(int i11) {
        return c(i11) != null;
    }
}
