package com.vk.newsfeed.posting.api.di;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.props.c;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.completable.t;
import io.reactivex.rxjava3.internal.operators.single.a0;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.cfc0;
import xsna.cy20;
import xsna.ep;
import xsna.f4;
import xsna.fp;
import xsna.fpf0;
import xsna.gfc0;
import xsna.hbc0;
import xsna.hpf0;
import xsna.ibc0;
import xsna.jmd;
import xsna.nwy;
import xsna.qcy;
import xsna.vhc0;

/* compiled from: Posting2ComponentStub.kt */
/* loaded from: classes4.dex */
public final class Posting2ComponentStub implements Posting2Component {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new f4(29));
    public final nwy b = new nwy(new c(29));
    public final nwy c = new nwy(new cy20(6));

    /* compiled from: Posting2ComponentStub.kt */
    public static final class a implements cfc0 {
        @Override // xsna.cfc0
        public final x<Long> b(UserId userId) {
            return a0.b;
        }

        @Override // xsna.cfc0
        public final boolean d(UserId userId) {
            return false;
        }

        @Override // xsna.cfc0
        public final io.reactivex.rxjava3.core.a g(long j, UserId userId) {
            return t.b;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Posting2ComponentStub.class, "router", "getRouter()Lcom/vk/newsfeed/posting/api/router/Posting2Router;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, Posting2ComponentStub.class, "coauthorsLauncher", "getCoauthorsLauncher()Lcom/vk/clips/coauthors/di/ClipsCoauthorsLauncher;", hpf0Var), ep.a(0, Posting2ComponentStub.class, "filesCopier", "getFilesCopier()Lcom/vk/newsfeed/posting/api/PostingFilesCopier;", hpf0Var)};
    }

    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final ibc0 C9(String str) {
        return ibc0.a.getSTUB();
    }

    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final jmd Cd() {
        qcy<Object> qcyVar = d[1];
        return (jmd) this.b.c();
    }

    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final hbc0 a() {
        qcy<Object> qcyVar = d[0];
        return (hbc0) this.a.c();
    }

    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final cfc0 qd() {
        return new a();
    }

    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final gfc0 w8() {
        qcy<Object> qcyVar = d[2];
        return (gfc0) this.c.c();
    }

    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final void R4(String str) {
    }

    /* compiled from: Posting2ComponentStub.kt */
    public static final class b implements hbc0 {
        @Override // xsna.hbc0
        public final void a(Context context, vhc0 vhc0Var, int i) {
        }
    }
}
