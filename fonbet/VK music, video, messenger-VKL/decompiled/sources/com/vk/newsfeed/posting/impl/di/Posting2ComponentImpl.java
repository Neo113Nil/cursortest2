package com.vk.newsfeed.posting.impl.di;

import android.app.Application;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import java.util.HashMap;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.bu0;
import xsna.cfc0;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.gfc0;
import xsna.hbc0;
import xsna.hfc0;
import xsna.hpf0;
import xsna.ibc0;
import xsna.jmd;
import xsna.klc0;
import xsna.ltb0;
import xsna.mbc0;
import xsna.mui0;
import xsna.nwy;
import xsna.qcy;
import xsna.re40;
import xsna.rf20;

/* compiled from: Posting2ComponentImpl.kt */
/* loaded from: classes4.dex */
public final class Posting2ComponentImpl implements Posting2Component {
    public static final /* synthetic */ qcy<Object>[] h;
    public final Application a;
    public final jmd b;
    public final mui0 c;
    public final nwy d = new nwy(new bu0(25));
    public final nwy e = new nwy(new re40(this, 13));
    public final nwy f;
    public final nwy g;

    /* compiled from: Posting2ComponentImpl.kt */
    public static final class a implements b7m<Posting2Component> {
        public final Application a;

        public a(Application application) {
            this.a = application;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            ClipsCoauthorsComponent clipsCoauthorsComponent = (ClipsCoauthorsComponent) e7mVar.b(fpf0.a(ClipsCoauthorsComponent.class));
            SessionManagementComponent sessionManagementComponent = (SessionManagementComponent) e7mVar.a(fpf0.a(SessionManagementComponent.class));
            return new Posting2ComponentImpl(this.a, clipsCoauthorsComponent.e(), sessionManagementComponent.J2());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Posting2ComponentImpl.class, "router", "getRouter()Lcom/vk/newsfeed/posting/impl/router/PostingRouterImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, Posting2ComponentImpl.class, "postingDraftsRepository", "getPostingDraftsRepository()Lcom/vk/newsfeed/posting/api/data/draft/PostingDraftsRepository;", hpf0Var), ep.a(0, Posting2ComponentImpl.class, "oldPostingDraftsRepository", "getOldPostingDraftsRepository()Lcom/vk/newsfeed/posting/api/data/draft/PostingDraftsRepository;", hpf0Var), ep.a(0, Posting2ComponentImpl.class, "analyticObjects", "getAnalyticObjects()Ljava/util/HashMap;", hpf0Var), ep.a(0, Posting2ComponentImpl.class, "filesCopier", "getFilesCopier()Lcom/vk/newsfeed/posting/impl/PostingFilesCopierImpl;", hpf0Var)};
    }

    public Posting2ComponentImpl(Application application, jmd jmdVar, mui0 mui0Var) {
        this.a = application;
        this.b = jmdVar;
        this.c = mui0Var;
        new nwy(new rf20(this, 14));
        this.f = new nwy(new ltb0(2));
        this.g = new nwy(new com.vk.movika.sdk.base.model.props.a(24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final ibc0 C9(String str) {
        qcy<Object> qcyVar = h[3];
        HashMap hashMap = (HashMap) this.f.c();
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new mbc0();
            hashMap.put(str, obj);
        }
        return (ibc0) obj;
    }

    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final jmd Cd() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final void R4(String str) {
        qcy<Object> qcyVar = h[3];
        ((HashMap) this.f.c()).remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final hbc0 a() {
        qcy<Object> qcyVar = h[0];
        return (klc0) this.d.c();
    }

    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final cfc0 qd() {
        qcy<Object> qcyVar = h[1];
        return (cfc0) this.e.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.posting.api.di.Posting2Component
    public final gfc0 w8() {
        qcy<Object> qcyVar = h[4];
        return (hfc0) this.g.c();
    }
}
