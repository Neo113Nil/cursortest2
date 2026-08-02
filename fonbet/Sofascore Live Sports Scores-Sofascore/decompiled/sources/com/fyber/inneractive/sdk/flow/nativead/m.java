package com.fyber.inneractive.sdk.flow.nativead;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g c;
    public final /* synthetic */ p d;

    public m(p pVar, i iVar, boolean z, com.fyber.inneractive.sdk.util.g gVar) {
        this.d = pVar;
        this.a = iVar;
        this.b = z;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.fyber.inneractive.sdk.click.o oVar;
        Iterator it;
        p pVar = this.d;
        i iVar = this.a;
        boolean z = this.b;
        com.fyber.inneractive.sdk.util.g gVar = this.c;
        pVar.getClass();
        String str = iVar.a;
        String str2 = iVar.b;
        if (v.a(str)) {
            oVar = new n(pVar, iVar, str2, gVar);
        } else {
            if (!v.a(str2)) {
                j jVar = (j) pVar.a;
                i iVar2 = jVar.a;
                if (iVar2 == null || iVar2 == iVar) {
                    IAlog.a("%s : No valid link object, origin: %s", j.d, gVar);
                } else {
                    p pVar2 = jVar.c;
                    pVar2.getClass();
                    com.fyber.inneractive.sdk.util.r.a.execute(new m(pVar2, iVar2, true, gVar));
                }
                p pVar3 = this.d;
                i iVar3 = this.a;
                pVar3.getClass();
                it = iVar3.c.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (!TextUtils.isEmpty(str3)) {
                        z0.b(str3);
                    }
                }
            }
            oVar = new o(pVar, iVar, gVar);
            str = str2;
        }
        k kVar = ((j) pVar.a).b;
        if (kVar != null) {
            kVar.a(str, z, gVar, oVar);
        }
        p pVar32 = this.d;
        i iVar32 = this.a;
        pVar32.getClass();
        it = iVar32.c.iterator();
        while (it.hasNext()) {
        }
    }
}
