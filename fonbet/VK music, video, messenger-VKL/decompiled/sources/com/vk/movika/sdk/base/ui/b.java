package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.base.logic.dto.c;
import com.vk.movika.sdk.base.ui.y;
import java.util.Objects;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.gzs;
import xsna.hpj;
import xsna.izi0;
import xsna.myc0;
import xsna.s3q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements gzs {
    public final /* synthetic */ c b;
    public final /* synthetic */ com.vk.movika.sdk.base.asset.b c;
    public final /* synthetic */ com.vk.movika.sdk.base.c d;
    public final /* synthetic */ com.vk.movika.sdk.base.model.o e;
    public final /* synthetic */ String f;

    public /* synthetic */ b(c cVar, com.vk.movika.sdk.base.asset.b bVar, com.vk.movika.sdk.base.c cVar2, com.vk.movika.sdk.base.model.o oVar, String str) {
        this.b = cVar;
        this.c = bVar;
        this.d = cVar2;
        this.e = oVar;
        this.f = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r8 == null) goto L31;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        com.vk.movika.sdk.base.logic.e eVar;
        c cVar = this.b;
        a aVar = new a(cVar, this.d, this.e, this.f);
        com.vk.movika.sdk.base.model.s sVar = (com.vk.movika.sdk.base.model.s) this.c.b;
        c cVar2 = aVar.a;
        ?? r4 = cVar2.m;
        hpj hpjVar = cVar2.h;
        cVar2.m = izi0.f(r4, cVar2);
        cVar2.z = null;
        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(cVar2, null);
        }
        com.vk.movika.sdk.base.c cVar3 = aVar.b;
        com.vk.movika.sdk.base.presenter.a aVar2 = cVar3 != null ? cVar3.a : null;
        com.vk.movika.sdk.base.model.o oVar = aVar.c;
        if (oVar == null) {
            oVar = (aVar2 == null || (eVar = aVar2.b) == null) ? null : eVar.j;
        }
        if (oVar != null) {
            if (oVar.e) {
                oVar = null;
            }
            if (oVar != null) {
                cVar2.q.getClass();
                IllegalArgumentException illegalArgumentException = !epx.f(sVar.a.a, oVar.b) ? new IllegalArgumentException("History manifest id and manifest id is different!") : null;
                if (illegalArgumentException != null) {
                    myc0.h(hpjVar, cVar2.e, null, new b0(cVar2, illegalArgumentException, null), 2);
                } else {
                    illegalArgumentException = null;
                }
            }
        }
        oVar = null;
        cVar2.p = y.d.a(cVar2.p, null, false, null, null, 15);
        cVar2.j = sVar;
        cVar2.w(new c.e(sVar, aVar2, oVar, aVar.d, cVar2.c.a(), cVar2.v), true);
        for (com.vk.movika.sdk.base.logic.dto.c cVar4 : cVar2.l) {
            if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                com.vk.movika.sdk.utils.c.a(cVar2, null);
                Objects.toString(cVar4);
            }
            cVar2.w(cVar4, false);
        }
        cVar2.l = EmptyList.b;
        cVar.z = new com.vk.movika.sdk.base.asset.a();
        return s3q0.a;
    }
}
