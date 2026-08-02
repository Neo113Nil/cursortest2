package com.vk.lists;

import com.vk.lists.c;

/* compiled from: PaginationHelperExt.kt */
/* loaded from: classes3.dex */
public final class f {
    public static final c a(c.h hVar, RecyclerPaginatedView recyclerPaginatedView) {
        if (hVar.f == null) {
            hVar.f = recyclerPaginatedView.getDataInfoProvider();
        }
        return hVar.b(recyclerPaginatedView);
    }
}
