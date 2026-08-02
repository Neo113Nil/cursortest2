package com.vk.photo.editor.ivm.collage;

import com.vk.photo.editor.ivm.collage.CollageMessage;
import com.vk.photo.editor.ivm.collage.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b3g;
import xsna.b8f0;
import xsna.c5g;
import xsna.epx;
import xsna.f0g;
import xsna.owx;
import xsna.z2g;
import xsna.z9;

/* compiled from: CollageStore.kt */
/* loaded from: classes4.dex */
public final class d extends owx<c, CollageMessage, a, Object> {
    public final void a(CollageMessage collageMessage) {
        boolean z = collageMessage instanceof CollageMessage.a;
        z9 z9Var = this.a;
        if (z) {
            z9Var.d(a.C1467a.a);
            return;
        }
        if (collageMessage instanceof CollageMessage.b) {
            z9Var.d(new a.b(((CollageMessage.b) collageMessage).a));
            return;
        }
        if (!(collageMessage instanceof CollageMessage.c)) {
            throw new NoWhenBranchMatchedException();
        }
        b8f0 b8f0Var = this.b;
        List<b3g> list = ((c) b8f0Var.b.getValue()).a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (b3g b3gVar : list) {
            arrayList.add(new b3g(b3gVar.a, b3gVar.b, b3gVar.c, b3gVar.d, epx.f(b3gVar.d, ((CollageMessage.c) collageMessage).a)));
        }
        List<z2g> list2 = ((c) b8f0Var.b.getValue()).c;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (z2g z2gVar : list2) {
            arrayList2.add(new z2g(z2gVar.a, z2gVar.b, z2gVar.c, epx.a(z2gVar.c.i(), ((CollageMessage.c) collageMessage).b)));
        }
        List<f0g> list3 = ((c) b8f0Var.b.getValue()).d;
        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
        for (f0g f0gVar : list3) {
            arrayList3.add(f0g.a(f0gVar, f0gVar.b == ((CollageMessage.c) collageMessage).e.b));
        }
        CollageMessage.c cVar = (CollageMessage.c) collageMessage;
        z9Var.d(new a.c(arrayList, cVar.a, arrayList2, arrayList3, cVar.c, cVar.d, cVar.e, cVar.f));
    }
}
