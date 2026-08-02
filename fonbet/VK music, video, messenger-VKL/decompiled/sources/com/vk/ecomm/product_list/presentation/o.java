package com.vk.ecomm.product_list.presentation;

import com.vk.ecomm.product_list.presentation.ProductListMviTask;
import com.vk.ecomm.product_list.presentation.k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.aqd0;
import xsna.gqd0;
import xsna.hn50;
import xsna.hpj;
import xsna.hqd0;
import xsna.jn50;
import xsna.myc0;
import xsna.nn50;
import xsna.on50;
import xsna.rpd0;
import xsna.tci;
import xsna.tpd0;
import xsna.uvj;
import xsna.y330;

/* compiled from: ProductListMviTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class o extends uvj<aqd0, on50, ProductListMviTask, ProductListMviTask, k, j> {
    public final tpd0 g;
    public final y330 h;
    public final List<String> i;
    public final rpd0 j;

    public o(nn50 nn50Var, tpd0 tpd0Var, y330 y330Var, List list, rpd0 rpd0Var) {
        super(tci.c, nn50Var);
        this.g = tpd0Var;
        this.h = y330Var;
        this.i = list;
        this.j = rpd0Var;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ProductListMviTask productListMviTask = (ProductListMviTask) hn50Var;
        boolean z = productListMviTask instanceof ProductListMviTask.LoadProducts;
        hpj hpjVar = this.f;
        if (z) {
            List<String> list = ((ProductListMviTask.LoadProducts) productListMviTask).b;
            e(k.e.a);
            return m(myc0.h(hpjVar, null, null, new m(this, list, null), 3));
        }
        if (productListMviTask instanceof ProductListMviTask.RecalculateRestrictions) {
            return m(myc0.h(hpjVar, null, null, new n(this, null), 3));
        }
        if (productListMviTask instanceof ProductListMviTask.TrackProductView) {
            return m(myc0.h(hpjVar, null, null, new hqd0(this, ((ProductListMviTask.TrackProductView) productListMviTask).b, null), 3));
        }
        if (productListMviTask instanceof ProductListMviTask.TrackOpenProduct) {
            return m(myc0.h(hpjVar, null, null, new gqd0(this, ((ProductListMviTask.TrackOpenProduct) productListMviTask).b, null), 3));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dl50, xsna.mn50
    public final void init() {
        a(new ProductListMviTask.LoadProducts(this.i));
    }
}
