package com.fyber.inneractive.sdk.response.nativead;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k extends com.fyber.inneractive.sdk.response.e {
    public i M;

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar) {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode b() {
        return null;
    }

    public final e c() {
        f fVar;
        ArrayList arrayList;
        i iVar = this.M;
        if (iVar != null && (arrayList = iVar.a) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar = (f) it.next();
                if (fVar.c != null) {
                    break;
                }
            }
        }
        fVar = null;
        if (fVar != null) {
            return fVar.c;
        }
        return null;
    }

    public final boolean d() {
        String str;
        e c = c();
        return (c == null || (str = c.a) == null || str.isEmpty()) ? false : true;
    }
}
