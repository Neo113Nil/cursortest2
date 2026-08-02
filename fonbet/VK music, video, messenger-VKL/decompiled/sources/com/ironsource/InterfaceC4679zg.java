package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.gzs;

/* renamed from: com.ironsource.zg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4679zg {
    void a() throws C4533re;

    default void a(boolean z, gzs<? extends IronSourceError> gzsVar) {
        if (!z) {
            throw new C4533re(gzsVar.invoke());
        }
    }
}
