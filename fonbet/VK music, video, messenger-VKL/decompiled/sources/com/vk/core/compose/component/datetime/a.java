package com.vk.core.compose.component.datetime;

import com.vk.core.compose.component.datetime.b;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dli0;
import xsna.j5g;
import xsna.kf7;

/* compiled from: BlockInput.kt */
/* loaded from: classes17.dex */
public final class a {
    public final char a;
    public final b.C0739b b;
    public final int c;
    public final int d;
    public final kf7 e;
    public final kf7 f;
    public final a g;

    public a(a aVar, char c, b.C0739b c0739b) {
        this.a = c;
        this.b = c0739b;
        List<b.a> list = c0739b.a;
        int i = 0;
        this.d = aVar != null ? aVar.d + aVar.c : 0;
        if (aVar != null) {
            aVar.g = this;
        }
        if (list.isEmpty()) {
            k kVar = new k(aVar != null ? aVar.f : null, new b.a.C0738b(""));
            this.e = kVar;
            this.f = kVar;
        } else {
            kf7 a = a((b.a) j5g.Y(list), aVar != null ? aVar.f : null);
            this.e = a;
            Iterator<b.a> it = list.subList(1, list.size()).iterator();
            while (it.hasNext()) {
                a = a(it.next(), a);
            }
            this.f = a;
        }
        Iterator it2 = dli0.e(this.e, new com.vk.movika.sdk.base.logic.interactor.d(this, 14)).iterator();
        while (it2.hasNext()) {
            i += ((kf7) it2.next()).e();
        }
        this.c = i;
    }

    public static kf7 a(b.a aVar, kf7 kf7Var) {
        if (aVar instanceof b.a.C0737a) {
            return new j(kf7Var, (b.a.C0737a) aVar);
        }
        if (aVar instanceof b.a.C0738b) {
            return new k(kf7Var, (b.a.C0738b) aVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
