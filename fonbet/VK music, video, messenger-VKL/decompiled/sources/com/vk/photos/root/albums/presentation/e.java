package com.vk.photos.root.albums.presentation;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.root.albums.presentation.c;
import com.vk.photos.root.albums.presentation.f;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dm50;
import xsna.e43;
import xsna.el1;
import xsna.epx;
import xsna.j5g;
import xsna.pd;
import xsna.rdi;
import xsna.s0e0;
import xsna.tl0;

/* compiled from: AlbumsReducer.kt */
/* loaded from: classes4.dex */
public final class e extends dm50<g, c, f> {
    public final el1 d;
    public final s0e0 e;
    public final Context f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(el1 el1Var, s0e0 s0e0Var, UserId userId, String str) {
        super(new f(null, null, r3, r3, null, userId, str, false));
        f.a.b bVar = f.a.b.a;
        this.d = el1Var;
        this.e = s0e0Var;
        Context context = e43.a;
        this.f = context == null ? null : context;
    }

    public static final boolean i(e eVar, f fVar) {
        eVar.getClass();
        List<PhotoAlbum> list = fVar.b;
        return eVar.e.a(fVar.g) && !(list != null && list.isEmpty());
    }

    @Override // xsna.dm50
    public final f c(f fVar, c cVar) {
        List list;
        List list2;
        f fVar2 = fVar;
        c cVar2 = cVar;
        List list3 = fVar2.b;
        if (cVar2.equals(c.b.b)) {
            return fVar2;
        }
        if (cVar2 instanceof c.C1495c) {
            c.C1495c c1495c = (c.C1495c) cVar2;
            f.a.C1497a c1497a = new f.a.C1497a(c1495c.b);
            return (c1495c.c || (list2 = list3) == null || list2.isEmpty()) ? f.a(fVar2, null, null, null, c1497a, null, false, 246) : f.a(fVar2, null, null, null, null, c1497a, false, 239);
        }
        if (cVar2 instanceof c.e) {
            return (((c.e) cVar2).b || (list = list3) == null || list.isEmpty()) ? f.a(fVar2, null, null, null, f.a.b.a, null, false, 231) : f.a(fVar2, null, null, null, null, f.a.b.a, false, 231);
        }
        if (cVar2 instanceof c.d) {
            if (list3 == null) {
                list3 = EmptyList.b;
            }
            return f.a(fVar2, j5g.u0(((c.d) cVar2).b, list3), null, null, null, null, false, 230);
        }
        if (cVar2 instanceof c.f) {
            return f.a(fVar2, ((c.f) cVar2).b, null, null, null, null, false, 246);
        }
        if (cVar2 instanceof c.g.b) {
            return f.a(fVar2, null, null, f.a.b.a, null, null, false, 251);
        }
        if (cVar2 instanceof c.g.C1496c) {
            return f.a(fVar2, null, ((c.g.C1496c) cVar2).b, null, null, null, false, 249);
        }
        if (cVar2 instanceof c.g.a) {
            return f.a(fVar2, null, null, new f.a.C1497a(((c.g.a) cVar2).b), null, null, false, 249);
        }
        if (!(cVar2 instanceof c.h)) {
            if (cVar2 instanceof c.a) {
                return f.a(fVar2, null, null, null, null, null, ((c.a) cVar2).b, 127);
            }
            throw new NoWhenBranchMatchedException();
        }
        c.h hVar = (c.h) cVar2;
        int i = hVar.b;
        boolean c = this.d.c(i);
        if (c) {
            list3 = fVar2.c;
        }
        Integer num = null;
        if (list3 != null) {
            Iterator it = list3.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                if (((PhotoAlbum) next).b == i) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                num = Integer.valueOf(i2);
            }
        }
        if (num != null) {
            list3 = rdi.I(num.intValue(), hVar.c.invoke((PhotoAlbum) list3.get(num.intValue())), list3);
        }
        List list4 = list3;
        return c ? f.a(fVar2, null, list4, null, null, null, false, 253) : f.a(fVar2, list4, null, null, null, null, false, 254);
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new pd(this, 3)), e(new tl0(this, 3)));
    }

    @Override // xsna.dm50
    public final void h(f fVar, g gVar) {
        f fVar2 = fVar;
        g gVar2 = gVar;
        f.a aVar = fVar2.e;
        f.a.b bVar = f.a.b.a;
        boolean z = false;
        boolean z2 = epx.f(aVar, bVar) && fVar2.b == null;
        if (epx.f(fVar2.d, bVar) && fVar2.c == null) {
            z = true;
        }
        if (z2 || z) {
            f(gVar2.b, fVar2);
        } else {
            f(gVar2.a, fVar2);
        }
    }
}
