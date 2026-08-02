package androidx.media3.exoplayer.dash;

import D1.o;
import android.net.Uri;
import h1.C4418n;
import h1.InterfaceC4411g;
import java.util.Map;
import p1.C6032b;
import p1.C6033c;
import p1.C6034d;

/* loaded from: classes.dex */
public abstract class j {
    public static C4418n a(p1.j jVar, String str, p1.i iVar, int i10, Map map) {
        return new C4418n.b().i(iVar.b(str)).h(iVar.f62942a).g(iVar.f62943b).f(c(jVar, iVar)).b(i10).e(map).a();
    }

    public static C6033c b(InterfaceC4411g interfaceC4411g, Uri uri) {
        return (C6033c) o.g(interfaceC4411g, new C6034d(), uri, 4);
    }

    public static String c(p1.j jVar, p1.i iVar) {
        String k10 = jVar.k();
        return k10 != null ? k10 : iVar.b(((C6032b) jVar.f62948c.get(0)).f62896a).toString();
    }
}
