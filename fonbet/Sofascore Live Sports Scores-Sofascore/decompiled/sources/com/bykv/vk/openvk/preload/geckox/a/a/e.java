package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class e extends b {
    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        Iterator<String> it = this.e.iterator();
        while (it.hasNext()) {
            List<File> b = com.bykv.vk.openvk.preload.geckox.utils.b.b(new File(this.d, it.next()));
            if (b != null && b.size() > this.c.a) {
                for (File file : b.subList(0, b.size() - this.c.a)) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(file.getAbsolutePath());
                    if (this.c.b != null) {
                        file.getName();
                    }
                }
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }
}
