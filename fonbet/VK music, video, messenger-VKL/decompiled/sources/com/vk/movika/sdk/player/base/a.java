package com.vk.movika.sdk.player.base;

import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.VideoVariant;
import com.vk.movika.sdk.base.model.s;
import com.vk.movika.sdk.base.model.v;
import com.vk.movika.sdk.base.ui.j;
import com.vk.movika.sdk.base.ui.y;
import com.vk.movika.sdk.base.utils.g;
import com.vk.movika.sdk.player.base.model.PlayerItemVariant;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.epx;
import xsna.go9;

/* loaded from: classes3.dex */
public final class a {
    public final j a;

    public a(j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.vk.movika.sdk.player.base.model.a a(Chapter chapter) throws Exception {
        PlayerItemVariant.Type type;
        String str = chapter.b;
        s sVar = ((y) this.a.c).j;
        v vVar = null;
        if (sVar != null) {
            Iterator it = sVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((v) next).a, str)) {
                    vVar = next;
                    break;
                }
            }
            vVar = vVar;
        }
        if (vVar == null) {
            throw new IllegalStateException(go9.b("Can not find video with id = ", str));
        }
        String str2 = vVar.a;
        String str3 = chapter.a;
        Long l = vVar.b;
        ArrayList arrayList = vVar.c;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VideoVariant videoVariant = (VideoVariant) it2.next();
            String str4 = videoVariant.a;
            int i = g.$EnumSwitchMapping$0[videoVariant.b.ordinal()];
            if (i == 1) {
                type = PlayerItemVariant.Type.HLS;
            } else if (i == 2) {
                type = PlayerItemVariant.Type.MP4;
            } else if (i == 3) {
                type = PlayerItemVariant.Type.DASH;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                type = PlayerItemVariant.Type.CUSTOM;
            }
            arrayList2.add(new PlayerItemVariant(str4, type, videoVariant.c, videoVariant.d, videoVariant.i));
        }
        return new com.vk.movika.sdk.player.base.model.a(str2, str3, l, arrayList2);
    }
}
