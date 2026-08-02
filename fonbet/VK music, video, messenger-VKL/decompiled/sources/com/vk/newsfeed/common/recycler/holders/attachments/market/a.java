package com.vk.newsfeed.common.recycler.holders.attachments.market;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.log.L;
import defpackage.p;
import io.reactivex.rxjava3.internal.operators.observable.n0;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import xsna.ar;
import xsna.o2o0;
import xsna.p99;
import xsna.rd1;
import xsna.rsg0;
import xsna.sm;
import xsna.yfb;

/* compiled from: FeedGoodsRepository.kt */
/* loaded from: classes4.dex */
public final class a {
    public final o2o0 a = new o2o0();

    public final p1 a(Photo photo) {
        String h = Tag.ContentType.PHOTO.h();
        UserId userId = photo.e;
        return new p1(rsg0.y0(yfb.x(this.a.b(photo.c, userId, h, photo.v)), null, null, 3).U(new ar(new rd1(18), 15)).F(new p(new p99(L.a, 5), 25)), new n0(22, new sm(25)));
    }
}
