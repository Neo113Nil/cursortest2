package com.vk.search.communities.map.impl.ui.map;

import com.vk.search.communities.map.impl.ui.map.d;
import io.reactivex.rxjava3.internal.operators.observable.k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;
import xsna.fda;
import xsna.g0t;
import xsna.xzs;

/* compiled from: SearchCommunitiesOnMapFragment.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements d.a, g0t {
    public final /* synthetic */ fda b;

    public a(fda fdaVar) {
        this.b = fdaVar;
    }

    @Override // com.vk.search.communities.map.impl.ui.map.d.a
    public final void a(k kVar) {
        this.b.gb(kVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, fda.class, "setCatalogRequest", "setCatalogRequest(Lio/reactivex/rxjava3/core/Observable;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
