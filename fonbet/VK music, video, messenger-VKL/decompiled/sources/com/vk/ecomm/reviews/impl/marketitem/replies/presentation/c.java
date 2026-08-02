package com.vk.ecomm.reviews.impl.marketitem.replies.presentation;

import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.p;
import xsna.s3q0;
import xsna.uic;
import xsna.ul50;

/* compiled from: MarketItemReviewRepliesComposition.kt */
/* loaded from: classes18.dex */
public final class c implements uic {
    public final ul50<s3q0, p.a> b;
    public final ul50<s3q0, p.b> c;
    public final ul50<s3q0, p.c> d;

    public c(int i) {
        ul50<s3q0, p.a> ul50Var = new ul50<>();
        ul50<s3q0, p.b> ul50Var2 = new ul50<>();
        ul50<s3q0, p.c> ul50Var3 = new ul50<>();
        this.b = ul50Var;
        this.c = ul50Var2;
        this.d = ul50Var3;
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }
}
