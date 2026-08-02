package Eb;

import android.content.Context;
import mb.C5576c;
import mb.InterfaceC5577d;
import mb.q;

/* loaded from: classes3.dex */
public abstract class h {

    public interface a {
        String extract(Object obj);
    }

    public static C5576c b(String str, String str2) {
        return C5576c.l(f.a(str, str2), f.class);
    }

    public static C5576c c(final String str, final a aVar) {
        return C5576c.m(f.class).b(q.j(Context.class)).f(new mb.g() { // from class: Eb.g
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                f a10;
                a10 = f.a(str, aVar.extract((Context) interfaceC5577d.a(Context.class)));
                return a10;
            }
        }).d();
    }
}
