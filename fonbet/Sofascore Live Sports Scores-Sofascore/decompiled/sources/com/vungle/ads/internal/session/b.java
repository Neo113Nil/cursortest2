package com.vungle.ads.internal.session;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.executor.d;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.m;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.cga;
import defpackage.duf;
import defpackage.ji2;
import defpackage.km5;
import defpackage.p2g;
import defpackage.s5l;
import defpackage.sha;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.xtl;
import defpackage.yea;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b {
    public static final yea f = cga.c(a.a);
    public final String a;
    public final com.vungle.ads.internal.executor.a b;
    public File c;
    public final CopyOnWriteArrayList d;
    public boolean e;

    public b(Context context, String str, com.vungle.ads.internal.executor.a aVar, PathProvider pathProvider) {
        Object u2gVar;
        context.getClass();
        str.getClass();
        aVar.getClass();
        pathProvider.getClass();
        this.a = str;
        this.b = aVar;
        this.c = pathProvider.b();
        this.d = new CopyOnWriteArrayList();
        boolean z = true;
        if (!this.c.exists()) {
            try {
                p2g p2gVar = w2g.b;
                u2gVar = Boolean.valueOf(this.c.createNewFile());
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a = w2g.a(u2gVar);
            if (a != null) {
                boolean z2 = u.a;
                StringBuilder a2 = l.a("Fail to create unclosed ad file: ");
                a2.append(a.getMessage());
                t.b("UnclosedAdDetector", a2.toString());
            }
            z = true ^ (u2gVar instanceof u2g);
        }
        this.e = z;
    }

    public static final List a(b bVar) {
        bVar.getClass();
        try {
            m mVar = n.a;
            String d = n.d(bVar.c);
            if (d != null && d.length() != 0) {
                yea yeaVar = f;
                return (List) yeaVar.b(sha.Q(yeaVar.b, duf.c(List.class, KTypeProjection.INSTANCE.invariant(duf.b(r3.class)))), d);
            }
            return new ArrayList();
        } catch (Exception e) {
            boolean z = u.a;
            StringBuilder a = l.a("Fail to read unclosed ad file ");
            a.append(e.getMessage());
            t.b("UnclosedAdDetector", a.toString());
            return new ArrayList();
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (!this.e) {
            return arrayList;
        }
        List a = a();
        if (a != null) {
            arrayList.addAll(a);
        }
        ((d) this.b).a.execute(new xtl(this, 3));
        return arrayList;
    }

    public final void b(r3 r3Var) {
        r3Var.getClass();
        if (this.e && this.d.contains(r3Var)) {
            this.d.remove(r3Var);
            a(this.d);
        }
    }

    public static final void b(b bVar) {
        bVar.getClass();
        try {
            n.b(bVar.c);
        } catch (Exception e) {
            boolean z = u.a;
            StringBuilder a = l.a("Fail to delete file ");
            a.append(e.getMessage());
            t.b("UnclosedAdDetector", a.toString());
        }
    }

    public final List a() {
        if (!this.e) {
            return km5.a;
        }
        return (List) new com.vungle.ads.internal.executor.b(((d) this.b).c().submit(new ji2(this, 11))).get(1000L, TimeUnit.MILLISECONDS);
    }

    public final void a(r3 r3Var) {
        r3Var.getClass();
        if (this.e) {
            r3Var.a(this.a);
            this.d.add(r3Var);
            a(this.d);
        }
    }

    public final void a(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (this.e) {
            try {
                yea yeaVar = f;
                ((d) this.b).c().execute(new s5l(18, this, yeaVar.c(sha.Q(yeaVar.b, duf.c(List.class, KTypeProjection.INSTANCE.invariant(duf.b(r3.class)))), copyOnWriteArrayList)));
            } catch (Throwable th) {
                boolean z = u.a;
                StringBuilder a = l.a("Fail to write unclosed ad file ");
                a.append(th.getMessage());
                t.b("UnclosedAdDetector", a.toString());
            }
        }
    }

    public static final void a(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        m mVar = n.a;
        n.a(bVar.c, str);
    }
}
