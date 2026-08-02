package com.vk.core.view.components.banner;

import com.vk.core.view.components.banner.VkBanner;
import xsna.blk;
import xsna.d16;
import xsna.ws2;
import xsna.y7g;

/* compiled from: TextBuilder.kt */
/* loaded from: classes17.dex */
public final class a {
    public static final d16.c a(VkBanner.e.a aVar, androidx.compose.runtime.a aVar2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(192206469, 0, -1, "com.vk.core.view.components.banner.buildText (TextBuilder.kt:11)");
        }
        d16.c cVar = null;
        if (aVar instanceof VkBanner.e.a.b) {
            aVar2.K(831707868);
            cVar = d16.c.b.a.a(blk.J(((VkBanner.e.a.b) aVar).a, aVar2), null, aVar2, 384, 0);
            aVar2.j();
        } else if (aVar instanceof VkBanner.e.a.C0807a) {
            aVar2.K(831969446);
            ((VkBanner.e.a.C0807a) aVar).getClass();
            cVar = d16.c.a.C2698a.a(ws2.b(blk.J(null, aVar2), aVar2, 0), false, null, blk.J(null, aVar2), 0, blk.J(null, aVar2), y7g.a(null, aVar2), y7g.a(null, aVar2), null, aVar2, 0, 0);
            aVar2.j();
        } else {
            aVar2.K(832774857);
            aVar2.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return cVar;
    }
}
