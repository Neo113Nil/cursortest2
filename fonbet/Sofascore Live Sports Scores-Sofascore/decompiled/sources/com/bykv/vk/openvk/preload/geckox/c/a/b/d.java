package com.bykv.vk.openvk.preload.geckox.c.a.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.BsPatch;
import defpackage.mz1;
import defpackage.yhk;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class d extends com.bykv.vk.openvk.preload.a.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.d
    public Object a(com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String channel = updatePackage.getChannel();
        GeckoLogger.d("gecko-debug-tag", "start merge patch single file, channel:", channel);
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        File f = aVar.f();
        aVar.a();
        aVar.e();
        File parentFile = f.getParentFile().getParentFile();
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getLocalVersion());
        String str = File.separator;
        File file = new File(parentFile, mz1.o(sb, str, "res"));
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            yhk.w(file.getAbsolutePath(), "can not found old full single file,:");
            return null;
        }
        File file2 = listFiles[0];
        File parentFile2 = f.getParentFile();
        StringBuilder r = mz1.r("res", str);
        r.append(com.bykv.vk.openvk.preload.geckox.c.a.a.b.a(updatePackage, updatePackage.getFullPackage().getUrlList().get(0)));
        File file3 = new File(parentFile2, r.toString());
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file3);
        try {
            try {
                BsPatch.a(file2, f, file3.getParentFile(), file3.getName());
                com.bykv.vk.openvk.preload.geckox.utils.b.a(f);
                this.d.a();
                com.bykv.vk.openvk.preload.geckox.buffer.a a = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file3, file3.length());
                try {
                    return bVar.a((com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a, updatePackage));
                } finally {
                    a.e();
                }
            } catch (Exception e) {
                throw new RuntimeException("merge patch single file failed, channel：" + channel + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e.getMessage(), e);
            }
        } catch (Throwable th) {
            com.bykv.vk.openvk.preload.geckox.utils.b.a(f);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
    }
}
