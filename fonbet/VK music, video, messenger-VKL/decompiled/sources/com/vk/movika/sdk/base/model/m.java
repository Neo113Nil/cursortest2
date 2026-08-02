package com.vk.movika.sdk.base.model;

import com.vk.movika.sdk.base.model.Chapter;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class m {
    public static final j a(Chapter chapter) {
        Object obj;
        Iterator<T> it = chapter.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (com.vk.movika.sdk.utils.h.a(((j) obj).a, "onSuspense")) {
                break;
            }
        }
        return (j) obj;
    }

    public static final j b(f fVar) {
        Object obj;
        Iterator<T> it = fVar.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (com.vk.movika.sdk.utils.h.a(((j) obj).a, "onSuspense")) {
                break;
            }
        }
        return (j) obj;
    }

    public static final boolean c(Chapter chapter) {
        return (chapter != null ? chapter.g : null) == Chapter.Order.START;
    }
}
