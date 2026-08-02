package com.vk.mapper.newsfeed.di;

import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.cr20;
import xsna.da50;
import xsna.e7m;
import xsna.ep;
import xsna.flu;
import xsna.fp;
import xsna.fpf0;
import xsna.gc;
import xsna.hpf0;
import xsna.io60;
import xsna.iz3;
import xsna.m960;
import xsna.msy;
import xsna.n9x0;
import xsna.nly;
import xsna.nwk;
import xsna.nwy;
import xsna.os30;
import xsna.q010;
import xsna.qcy;
import xsna.r010;
import xsna.r9x0;
import xsna.ru0;
import xsna.v3n;
import xsna.vv20;
import xsna.zax0;
import xsna.zj60;

/* compiled from: NewsfeedMappersComponent.kt */
/* loaded from: classes3.dex */
public final class NewsfeedMappersComponentImpl implements NewsfeedMappersComponent {
    public static final /* synthetic */ qcy<Object>[] o;
    public final Object a;
    public final Object b;
    public final Object c;
    public final nwy d = new nwy(new vv20(this, 6));
    public final nwy e = new nwy(new da50(this, 3));
    public final nwy f = new nwy(new io60(this, 1));
    public final nwy g = new nwy(new v3n(this, 26));
    public final nwy h = new nwy(new q010(this, 10));
    public final nwy i = new nwy(new nwk(this, 28));
    public final nwy j = new nwy(new m960(this, 3));
    public final nwy k = new nwy(new cr20(this, 12));
    public final nwy l = new nwy(new gc(22));
    public final nwy m = new nwy(new iz3(18));
    public final nwy n = new nwy(new nly(this, 17));

    /* compiled from: NewsfeedMappersComponent.kt */
    public static final class a implements b7m<NewsfeedMappersComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            os30 os30Var = new os30(e7mVar, 7);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new NewsfeedMappersComponentImpl(msy.a(lazyThreadSafetyMode, os30Var), msy.a(lazyThreadSafetyMode, new r010(e7mVar, 13)), msy.a(lazyThreadSafetyMode, new flu(e7mVar, 25)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NewsfeedMappersComponentImpl.class, "adsBlockDtoToAdsMapper", "getAdsBlockDtoToAdsMapper()Lcom/vk/mapper/newsfeed/entries/ad/AdsBlockDtoToAdsMapper;", 0);
        hpf0 hpf0Var = fpf0.a;
        o = new qcy[]{propertyReference1Impl, fp.c(0, NewsfeedMappersComponentImpl.class, "adsBlockDtoToShitAttachmentMapper", "getAdsBlockDtoToShitAttachmentMapper()Lcom/vk/mapper/newsfeed/entries/ad/AdsBlockDtoToShitAttachmentMapper;", hpf0Var), ep.a(0, NewsfeedMappersComponentImpl.class, "wallpostFullDtoToPostMapper", "getWallpostFullDtoToPostMapper()Lcom/vk/mapper/newsfeed/entries/WallpostFullDtoToPostMapper;", hpf0Var), ep.a(0, NewsfeedMappersComponentImpl.class, "wallpostFullDtoMapper", "getWallpostFullDtoMapper()Lcom/vk/mapper/newsfeed/wallget/WallpostFullDtoMapper;", hpf0Var), ep.a(0, NewsfeedMappersComponentImpl.class, "wallWallCommentDtoToCommentMapper", "getWallWallCommentDtoToCommentMapper()Lcom/vk/mapper/newsfeed/wallget/WallWallCommentDtoToCommentMapper;", hpf0Var), ep.a(0, NewsfeedMappersComponentImpl.class, "wallGetByIdResponseDtoToNewsEntryMapper", "getWallGetByIdResponseDtoToNewsEntryMapper()Lcom/vk/mapper/newsfeed/wallget/WallGetByIdResponseDtoToNewsEntryMapper;", hpf0Var), ep.a(0, NewsfeedMappersComponentImpl.class, "wallItemDtoToNewsEntryMapper", "getWallItemDtoToNewsEntryMapper()Lcom/vk/mapper/newsfeed/wallget/WallItemDtoToNewsEntryMapper;", hpf0Var), ep.a(0, NewsfeedMappersComponentImpl.class, "wallPostActivityDtoToActivityMapper", "getWallPostActivityDtoToActivityMapper()Lcom/vk/mapper/newsfeed/activities/WallPostActivityDtoToActivityMapper;", hpf0Var), ep.a(0, NewsfeedMappersComponentImpl.class, "baseCommentsInfoDtoToCommentsInfoMapper", "getBaseCommentsInfoDtoToCommentsInfoMapper()Lcom/vk/mapper/newsfeed/BaseCommentsInfoDtoToCommentsInfoMapper;", hpf0Var), ep.a(0, NewsfeedMappersComponentImpl.class, "ownerMapper", "getOwnerMapper()Lcom/vk/mapper/owner/OwnerMapper;", hpf0Var), ep.a(0, NewsfeedMappersComponentImpl.class, "getActivitiesDtoToActivityMapper", "getGetActivitiesDtoToActivityMapper()Lcom/vk/mapper/newsfeed/activities/NewsfeedGetActivitiesDtoToActivityMapper;", hpf0Var)};
    }

    public NewsfeedMappersComponentImpl(Lazy<? extends BridgeComponent> lazy, Lazy<? extends AttachmentMappersComponent> lazy2, Lazy<? extends AdPixelStatsComponent> lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mapper.newsfeed.di.NewsfeedMappersComponent
    public final n9x0 B1() {
        qcy<Object> qcyVar = o[5];
        return (n9x0) this.i.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mapper.newsfeed.di.NewsfeedMappersComponent
    public final zj60 K8() {
        qcy<Object> qcyVar = o[10];
        return (zj60) this.n.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mapper.newsfeed.di.NewsfeedMappersComponent
    public final r9x0 X8() {
        qcy<Object> qcyVar = o[6];
        return (r9x0) this.j.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mapper.newsfeed.di.NewsfeedMappersComponent
    public final zax0 a9() {
        qcy<Object> qcyVar = o[2];
        return (zax0) this.f.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mapper.newsfeed.di.NewsfeedMappersComponent
    public final ru0 xc() {
        qcy<Object> qcyVar = o[0];
        return (ru0) this.d.c();
    }
}
