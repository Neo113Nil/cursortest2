package com.bykv.vk.openvk.preload.geckox.c.b.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import defpackage.wt3;
import defpackage.yhk;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class f extends com.bykv.vk.openvk.preload.a.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<File, UpdatePackage>> {
    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static Object a2(com.bykv.vk.openvk.preload.a.b<Pair<File, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String channel = updatePackage.getChannel();
        GeckoLogger.d("gecko-debug-tag", "start unzip merged zip file, channel:", channel);
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        aVar.b(0L);
        File parentFile = aVar.f().getParentFile();
        try {
            h.a(new com.bykv.vk.openvk.preload.geckox.buffer.stream.a(aVar), parentFile.getAbsolutePath(), channel);
            aVar.a();
            File file = new File(parentFile, "res");
            com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
            if (new File(parentFile, channel).renameTo(file)) {
                return bVar.a((com.bykv.vk.openvk.preload.a.b<Pair<File, UpdatePackage>>) new Pair<>(aVar.f(), updatePackage));
            }
            yhk.w(parentFile.getAbsolutePath(), "rename unzip merged zip file failed:");
            return null;
        } catch (Exception e) {
            StringBuilder q = wt3.q("unzip merged zip file failed, channel:", channel, ", pkg id:");
            q.append(updatePackage.getPatch().getId());
            q.append(e.getMessage());
            throw new RuntimeException(q.toString(), e);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* bridge */ /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<Pair<File, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        return a2(bVar, pair);
    }
}
