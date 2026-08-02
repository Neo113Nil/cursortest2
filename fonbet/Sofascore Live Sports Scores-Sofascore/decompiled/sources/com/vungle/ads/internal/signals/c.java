package com.vungle.ads.internal.signals;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.model.p3;
import defpackage.fc6;
import defpackage.oea;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public final int a;
    public final String b;
    public long c;
    public List d;
    public long e;
    public int f;
    public List g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public /* synthetic */ c(int i, int i2, String str, long j, List list, long j2, int i3, List list2, int i4, int i5, int i6, int i7, int i8) {
        if (1 != (i & 1)) {
            oea.z(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = fc6.C();
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = System.currentTimeMillis() / 1000;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = new ArrayList();
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j2;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
        if ((i & 64) == 0) {
            this.g = new ArrayList();
        } else {
            this.g = list2;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i4;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.i = 0;
        } else {
            this.i = i5;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i6;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i7;
        }
        if ((i & com.ironsource.mediationsdk.metadata.a.o) == 0) {
            this.l = 0;
        } else {
            this.l = i8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r0, r2) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(c cVar, wf3 wf3Var, uye uyeVar) {
        cVar.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.u(0, cVar.a, uyeVar);
        if (!wf3Var.o(uyeVar)) {
            String str = cVar.b;
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
        }
        wf3Var.y(uyeVar, 1, cVar.b);
        if (wf3Var.o(uyeVar) || cVar.c != System.currentTimeMillis() / 1000) {
            wf3Var.E(uyeVar, 2, cVar.c);
        }
        if (wf3Var.o(uyeVar) || !Intrinsics.c(cVar.d, new ArrayList())) {
            wf3Var.f(uyeVar, 3, new xg0(k.a, 0), cVar.d);
        }
        if (wf3Var.o(uyeVar) || cVar.e != 0) {
            wf3Var.E(uyeVar, 4, cVar.e);
        }
        if (wf3Var.o(uyeVar) || cVar.f != 0) {
            wf3Var.u(5, cVar.f, uyeVar);
        }
        if (wf3Var.o(uyeVar) || !Intrinsics.c(cVar.g, new ArrayList())) {
            wf3Var.f(uyeVar, 6, new xg0(p3.a, 0), cVar.g);
        }
        if (wf3Var.o(uyeVar) || cVar.h != 0) {
            wf3Var.u(7, cVar.h, uyeVar);
        }
        if (wf3Var.o(uyeVar) || cVar.i != 0) {
            wf3Var.u(8, cVar.i, uyeVar);
        }
        if (wf3Var.o(uyeVar) || cVar.j != 0) {
            wf3Var.u(9, cVar.j, uyeVar);
        }
        if (wf3Var.o(uyeVar) || cVar.k != 0) {
            wf3Var.u(10, cVar.k, uyeVar);
        }
        if (!wf3Var.o(uyeVar) && cVar.l == 0) {
            return;
        }
        wf3Var.u(11, cVar.l, uyeVar);
    }

    public final List b() {
        return this.d;
    }

    public final List c() {
        return this.g;
    }

    public final void d(int i) {
        this.k = i;
    }

    public final void e(int i) {
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wv8.j(com.iab.omid.library.vungle.internal.l.a("SessionData(sessionCount="), this.a, ')');
    }

    public final void b(int i) {
        this.l = i;
    }

    public final void c(int i) {
        this.j = i;
    }

    public c(int i) {
        this.a = i;
        this.b = fc6.C();
        this.c = System.currentTimeMillis() / 1000;
        this.d = new ArrayList();
        this.g = new ArrayList();
    }

    public final String a() {
        return this.b;
    }

    public final void a(ArrayList arrayList) {
        arrayList.getClass();
        this.g = arrayList;
    }

    public final void a(int i) {
        this.h = i;
    }
}
