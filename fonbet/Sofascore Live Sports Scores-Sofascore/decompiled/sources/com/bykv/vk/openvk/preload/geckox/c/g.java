package com.bykv.vk.openvk.preload.geckox.c;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.k;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class g extends k<UpdatePackage, Pair<Uri, UpdatePackage>> {
    private int d = 0;

    @Override // com.bykv.vk.openvk.preload.a.k
    public final boolean a(Throwable th) {
        GeckoLogger.w("gecko-debug-tag", "full update failed and retry", th);
        if (this.d >= g().getFullPackage().getUrlList().size()) {
            return false;
        }
        return (th instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        UpdatePackage g = g();
        List<String> urlList = g.getFullPackage().getUrlList();
        int i = this.d;
        this.d = i + 1;
        return new Pair<>(Uri.parse(urlList.get(i)), g);
    }
}
