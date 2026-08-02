package com.bykv.vk.openvk.preload.geckox.c.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import defpackage.cp4;
import defpackage.mz1;
import defpackage.wt3;
import defpackage.yhk;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class b extends d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;
    private File e;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.d
    public Object a(com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String channel = updatePackage.getChannel();
        GeckoLogger.d("gecko-debug-tag", "start download full single file channel:", channel);
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getAccessKey());
        String str = File.separator;
        sb.append(str);
        sb.append(channel);
        sb.append(str);
        sb.append(updatePackage.getVersion());
        sb.append("--updating");
        File file2 = new File(file, sb.toString());
        file2.mkdirs();
        StringBuilder r = mz1.r("res", str);
        r.append(a(updatePackage, uri));
        File file3 = new File(file2, r.toString());
        this.d.a();
        com.bykv.vk.openvk.preload.geckox.buffer.a a = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file3, length);
        try {
            try {
                this.d.i().downloadFile(uri, length, new BufferOutputStream(a));
                try {
                    Object a2 = bVar.a((com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a, updatePackage));
                    try {
                        return a2;
                    } catch (Exception e) {
                        return a2;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                a.e();
                StringBuilder q = wt3.q("download full single file failed! url:", uri, ", channel:");
                q.append(updatePackage.getChannel());
                q.append(", pkg id:");
                q.append(updatePackage.getFullPackage().getId());
                q.append(", caused by:");
                q.append(th.getMessage());
                throw new com.bykv.vk.openvk.preload.geckox.b.a(q.toString(), th);
            }
        } finally {
            try {
                a.e();
            } catch (Exception e3) {
                GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e3);
            }
        }
    }

    public static String a(UpdatePackage updatePackage, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1) {
                String substring = str.substring(lastIndexOf + 1);
                if (!TextUtils.isEmpty(substring)) {
                    return substring;
                }
                cp4.h("url path illegal, url:".concat(str));
                return null;
            }
            cp4.h("url path illegal, url:".concat(str));
            return null;
        }
        yhk.w(updatePackage.getChannel(), "url empty, channel:");
        return null;
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.e = (File) objArr[1];
    }
}
