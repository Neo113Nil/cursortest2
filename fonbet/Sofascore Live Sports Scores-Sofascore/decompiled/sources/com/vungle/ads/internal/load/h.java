package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.PathProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d dVar, com.vungle.ads.internal.omsdk.c cVar, com.vungle.ads.internal.downloader.m mVar, PathProvider pathProvider, b bVar) {
        super(context, vungleApiClient, dVar, cVar, mVar, pathProvider, bVar);
        context.getClass();
        vungleApiClient.getClass();
        dVar.getClass();
        cVar.getClass();
        mVar.getClass();
        pathProvider.getClass();
        bVar.getClass();
    }

    @Override // com.vungle.ads.internal.load.g
    public final VungleError a(h0 h0Var) {
        h0Var.getClass();
        VungleError a = super.a(h0Var);
        if (a != null) {
            return a;
        }
        if (h0Var.m() == null) {
            return new AdResponseEmptyError("CSB response is missing from ad payload");
        }
        return null;
    }

    @Override // com.vungle.ads.internal.load.j
    public final String l() {
        return "CSB";
    }

    @Override // com.vungle.ads.internal.load.j
    public final com.vungle.ads.internal.network.m a(String str, VungleAdSize vungleAdSize) {
        str.getClass();
        return h().a(str, vungleAdSize, b().b());
    }
}
