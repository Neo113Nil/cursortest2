package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class p3 extends D0<Om0.a> {

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f70823e;

    p3(@NonNull HashSet hashSet, @NonNull C7534k2 c7534k2, @NonNull u3 u3Var, @NonNull C7493a1 c7493a1, @NonNull C7536l0 c7536l0) {
        super(Mm0.e.WiFiNetworksData);
        ArrayList arrayList = new ArrayList();
        this.f70823e = arrayList;
        if (hashSet.contains(Mm0.e.BSSID)) {
            arrayList.add(c7534k2);
        }
        if (hashSet.contains(Mm0.e.SignalStrength)) {
            arrayList.add(u3Var);
        }
        if (hashSet.contains(Mm0.e.Channel)) {
            arrayList.add(c7493a1);
        }
        if (hashSet.contains(Mm0.e.SSID)) {
            arrayList.add(c7536l0);
        }
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        return new Om0.a();
    }

    @Override // k5.D0
    public final Om0.a u() throws Mm0.a, D1 {
        Om0.a aVar = (Om0.a) super.u();
        if (aVar == null) {
            return null;
        }
        Iterator it = this.f70823e.iterator();
        while (it.hasNext()) {
            D0 d02 = (D0) it.next();
            Mm0.e x11 = d02.x();
            String name = x11.name();
            try {
                Serializable u11 = d02.u();
                if (u11 != null) {
                    aVar.put(name, u11);
                } else {
                    aVar.remove(name);
                }
            } catch (D1 e11) {
                if (x11.f()) {
                    aVar.put(name, e11.a(x11));
                } else {
                    aVar.remove(name);
                }
            }
        }
        return aVar;
    }
}
