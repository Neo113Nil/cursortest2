package com.vk.articleeditor.impl;

import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.n0;
import xsna.dr;
import xsna.fai;
import xsna.nm3;
import xsna.om3;
import xsna.r7q0;
import xsna.rsg0;
import xsna.sp3;
import xsna.tfx;
import xsna.un3;
import xsna.vn3;
import xsna.x90;
import xsna.yfb;

/* compiled from: ArticleRepositoryImpl.kt */
/* loaded from: classes15.dex */
public final class a implements sp3 {
    public final un3 a;
    public final om3 b;

    public a(vn3 vn3Var, om3 om3Var) {
        this.a = vn3Var;
        this.b = om3Var;
    }

    @Override // xsna.sp3
    public final q S(int i, UserId userId) {
        ((fai) this.b.b).getClass();
        tfx tfxVar = new tfx("articles.unpublish", new n0(5), new dr(3));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "article_id", i, 0, 0, 8);
        return rsg0.T(yfb.x(tfxVar)).U(new nm3(new x90(2), 0));
    }

    @Override // xsna.sp3
    public final q<r7q0.a> a() {
        return this.a.a();
    }
}
