package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class o1g extends s18 {
    public static final uae f;
    public final ClassLoader c;
    public final s18 d;
    public final mqi e;

    static {
        String str = uae.b;
        f = tnf.j("/", false);
    }

    public o1g(ClassLoader classLoader) {
        classLoader.getClass();
        uha uhaVar = s18.a;
        uhaVar.getClass();
        this.c = classLoader;
        this.d = uhaVar;
        this.e = ypa.b(new ate(this, 27));
    }

    @Override // defpackage.s18
    public final tha C(uae uaeVar) {
        uaeVar.getClass();
        throw new IOException("resources are not writable");
    }

    @Override // defpackage.s18
    public final ejh H(uae uaeVar, boolean z) {
        uaeVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s18
    public final cwh M(uae uaeVar) {
        uaeVar.getClass();
        if (!s6a.D(uaeVar)) {
            hg6.h(uaeVar, "file not found: ");
            return null;
        }
        uae uaeVar2 = f;
        uaeVar2.getClass();
        URL resource = this.c.getResource(i.a(uaeVar2, uaeVar, false).d(uaeVar2).a.w());
        if (resource == null) {
            hg6.h(uaeVar, "file not found: ");
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        inputStream.getClass();
        return f6a.I(inputStream);
    }

    @Override // defpackage.s18
    public final ejh e(uae uaeVar) {
        uaeVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s18
    public final void f(uae uaeVar, uae uaeVar2) {
        uaeVar.getClass();
        uaeVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s18
    public final void h(uae uaeVar) {
        uaeVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s18
    public final void i(uae uaeVar) {
        uaeVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s18
    public final List m(uae uaeVar) {
        uaeVar.getClass();
        uae uaeVar2 = f;
        uaeVar2.getClass();
        String w = i.a(uaeVar2, uaeVar, true).d(uaeVar2).a.w();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.e.getValue()) {
            s18 s18Var = (s18) pair.a;
            uae uaeVar3 = (uae) pair.b;
            try {
                List m = s18Var.m(uaeVar3.e(w));
                ArrayList arrayList = new ArrayList();
                for (Object obj : m) {
                    if (s6a.D((uae) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    uae uaeVar4 = (uae) it.next();
                    uaeVar4.getClass();
                    String replace = StringsKt.V(uaeVar4.a.w(), uaeVar3.a.w()).replace('\\', '/');
                    replace.getClass();
                    arrayList2.add(uaeVar2.e(replace));
                }
                o13.v(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.S0(linkedHashSet);
        }
        hg6.h(uaeVar, "file not found: ");
        return null;
    }

    @Override // defpackage.s18
    public final ux4 p(uae uaeVar) {
        uaeVar.getClass();
        if (!s6a.D(uaeVar)) {
            return null;
        }
        uae uaeVar2 = f;
        uaeVar2.getClass();
        String w = i.a(uaeVar2, uaeVar, true).d(uaeVar2).a.w();
        for (Pair pair : (List) this.e.getValue()) {
            ux4 p = ((s18) pair.a).p(((uae) pair.b).e(w));
            if (p != null) {
                return p;
            }
        }
        return null;
    }

    @Override // defpackage.s18
    public final tha t(uae uaeVar) {
        if (!s6a.D(uaeVar)) {
            hg6.h(uaeVar, "file not found: ");
            return null;
        }
        uae uaeVar2 = f;
        uaeVar2.getClass();
        String w = i.a(uaeVar2, uaeVar, true).d(uaeVar2).a.w();
        Iterator it = ((List) this.e.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((s18) pair.a).t(((uae) pair.b).e(w));
            } catch (FileNotFoundException unused) {
            }
        }
        hg6.h(uaeVar, "file not found: ");
        return null;
    }
}
