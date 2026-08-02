package com.vk.movika.sdk.base.logic.dto;

import com.vk.movika.sdk.base.logic.dto.d;
import com.vk.movika.sdk.base.logic.processor.e;
import com.vk.movika.sdk.base.logic.processor.f;
import java.util.Iterator;
import java.util.List;
import xsna.dcy;
import xsna.fpf0;
import xsna.rl3;

/* loaded from: classes3.dex */
public final class b {
    public static final boolean a(d.a.f fVar) {
        List<e> list = fVar.c;
        if (list == null) {
            return false;
        }
        dcy<? extends e>[] dcyVarArr = f.a;
        if (list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (rl3.G(f.a, fpf0.a(((e) it.next()).getClass()))) {
                return true;
            }
        }
        return false;
    }
}
