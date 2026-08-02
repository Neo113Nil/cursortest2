package Fb;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import mb.C5576c;
import mb.InterfaceC5577d;
import mb.g;
import mb.i;

/* loaded from: classes3.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, C5576c c5576c, InterfaceC5577d interfaceC5577d) {
        try {
            c.b(str);
            return c5576c.h().a(interfaceC5577d);
        } finally {
            c.a();
        }
    }

    @Override // mb.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C5576c c5576c : componentRegistrar.getComponents()) {
            final String i10 = c5576c.i();
            if (i10 != null) {
                c5576c = c5576c.r(new g() { // from class: Fb.a
                    @Override // mb.g
                    public final Object a(InterfaceC5577d interfaceC5577d) {
                        return b.b(i10, c5576c, interfaceC5577d);
                    }
                });
            }
            arrayList.add(c5576c);
        }
        return arrayList;
    }
}
