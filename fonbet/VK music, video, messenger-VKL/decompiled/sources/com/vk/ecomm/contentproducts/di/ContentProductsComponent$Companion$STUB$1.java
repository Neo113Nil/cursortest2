package com.vk.ecomm.contentproducts.di;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bu0;
import xsna.ewy;
import xsna.fpf0;
import xsna.kkj;
import xsna.qcy;

/* compiled from: ContentProductsComponent.kt */
/* loaded from: classes18.dex */
public final class ContentProductsComponent$Companion$STUB$1 implements ContentProductsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new bu0(9));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ContentProductsComponent$Companion$STUB$1.class, "router", "getRouter()Lcom/vk/ecomm/contentproducts/router/ContentProductsRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.contentproducts.di.ContentProductsComponent
    public final kkj a() {
        qcy<Object> qcyVar = b[0];
        return (kkj) this.a.c();
    }

    /* compiled from: ContentProductsComponent.kt */
    public static final class a implements kkj {
        @Override // xsna.kkj
        public final void a(Context context, UserId userId, long j) {
        }
    }
}
