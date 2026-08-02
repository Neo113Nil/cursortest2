package com.vk.catalog.mvi.block.video.impl.p002short.draft;

import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b2a;
import xsna.epx;
import xsna.g0t;
import xsna.s1a;
import xsna.t1a;
import xsna.xzs;

/* compiled from: DraftShortVideoListView.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements t1a, g0t {
    public static final f b = new f();

    @Override // xsna.t1a
    public final s1a a(b2a b2aVar) {
        return new DraftShortVideoListView.b(b2aVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t1a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, DraftShortVideoListView.b.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
