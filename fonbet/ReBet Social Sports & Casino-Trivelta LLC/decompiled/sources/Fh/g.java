package Fh;

import java.util.List;
import rh.EnumC6295m;
import uh.InterfaceC6579c;

/* loaded from: classes3.dex */
public interface g {
    static g a() {
        return b.INSTANCE;
    }

    static f c(g gVar) {
        return new f(gVar);
    }

    static g d() {
        return a.INSTANCE;
    }

    static g e(g gVar) {
        return c(gVar).a();
    }

    i b(InterfaceC6579c interfaceC6579c, String str, String str2, EnumC6295m enumC6295m, oh.g gVar, List list);

    String getDescription();
}
