package com.vk.movika.sdk.base.logic.processor.actions.openuri;

import com.vk.movika.sdk.base.model.actions.e;
import com.vk.movika.sdk.base.model.f;
import java.util.Iterator;
import java.util.List;
import xsna.fpf0;

/* loaded from: classes3.dex */
public final class d {
    public static boolean a(f fVar) {
        return com.vk.movika.sdk.base.utils.d.a(fVar, fpf0.a(com.vk.movika.sdk.base.model.actions.d.class)) && !com.vk.movika.sdk.base.utils.d.a(fVar, fpf0.a(e.class));
    }

    public static final boolean b(List<f> list) {
        if (list.isEmpty()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!a((f) it.next())) {
                return false;
            }
        }
        return true;
    }
}
