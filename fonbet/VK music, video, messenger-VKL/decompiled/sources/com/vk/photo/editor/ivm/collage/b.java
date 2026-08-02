package com.vk.photo.editor.ivm.collage;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.ivm.collage.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.mwx;
import xsna.utk0;
import xsna.z9;

/* compiled from: CollageReducer.kt */
/* loaded from: classes4.dex */
public final class b extends z9 {
    @Override // xsna.z9
    public final void d(mwx mwxVar) {
        Object value;
        a.c cVar;
        Object value2;
        Object value3;
        a aVar = (a) mwxVar;
        utk0 utk0Var = (utk0) this.a;
        if (aVar instanceof a.C1467a) {
            do {
                value3 = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value3, new c(0)));
        } else if (aVar instanceof a.b) {
            do {
                value2 = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value2, c.a((c) value2, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((a.b) aVar).a, null, 383)));
        } else {
            if (!(aVar instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = utk0Var.getValue();
                cVar = (a.c) aVar;
            } while (!utk0Var.compareAndSet(value, c.a((c) value, cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.g, cVar.f, null, cVar.h, 128)));
        }
    }
}
