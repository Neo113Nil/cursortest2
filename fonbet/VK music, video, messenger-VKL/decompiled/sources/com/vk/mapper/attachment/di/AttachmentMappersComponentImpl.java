package com.vk.mapper.attachment.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.movika.sdk.base.ui.f;
import com.vk.movika.sdk.base.ui.g;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.jd;
import xsna.kd;
import xsna.l1;
import xsna.m1;
import xsna.msy;
import xsna.nwy;
import xsna.pax0;
import xsna.ppt0;
import xsna.qcy;
import xsna.uax0;

/* compiled from: AttachmentMappersComponent.kt */
/* loaded from: classes3.dex */
public final class AttachmentMappersComponentImpl implements AttachmentMappersComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final Object a;
    public final Object b;
    public final nwy c = new nwy(new f(this, 7));
    public final nwy d = new nwy(new l1(this, 8));
    public final nwy e = new nwy(new g(this, 9));
    public final nwy f = new nwy(new m1(this, 3));

    /* compiled from: AttachmentMappersComponent.kt */
    public static final class a implements b7m<AttachmentMappersComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            jd jdVar = new jd(e7mVar, 4);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new AttachmentMappersComponentImpl(msy.a(lazyThreadSafetyMode, jdVar), msy.a(lazyThreadSafetyMode, new kd(e7mVar, 6)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AttachmentMappersComponentImpl.class, "wallpostAttachmentDtoToEntryAttachmentMapper", "getWallpostAttachmentDtoToEntryAttachmentMapper()Lcom/vk/mapper/attachment/newsfeed/WallpostAttachmentDtoToEntryAttachmentMapper;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, AttachmentMappersComponentImpl.class, "wallWallpostAttachmentDtoToAttachmentMapper", "getWallWallpostAttachmentDtoToAttachmentMapper()Lcom/vk/mapper/attachment/WallWallpostAttachmentDtoToAttachmentMapper;", hpf0Var), ep.a(0, AttachmentMappersComponentImpl.class, "audioPlaylistDtoToAudioPlaylistAttachmentMapper", "getAudioPlaylistDtoToAudioPlaylistAttachmentMapper()Lcom/vk/mapper/attachment/audioplaylist/AudioPlaylistDtoToAudioPlaylistAttachmentMapper;", hpf0Var), ep.a(0, AttachmentMappersComponentImpl.class, "videoVideoFullDtoToVideoAttachmentMapper", "getVideoVideoFullDtoToVideoAttachmentMapper()Lcom/vk/mapper/attachment/video/VideoVideoFullDtoToVideoAttachmentMapper;", hpf0Var)};
    }

    public AttachmentMappersComponentImpl(Lazy<? extends BridgeComponent> lazy, Lazy<? extends ClipsViewerComponent> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mapper.attachment.di.AttachmentMappersComponent
    public final pax0 f3() {
        qcy<Object> qcyVar = g[1];
        return (pax0) this.d.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mapper.attachment.di.AttachmentMappersComponent
    public final uax0 fd() {
        qcy<Object> qcyVar = g[0];
        return (uax0) this.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mapper.attachment.di.AttachmentMappersComponent
    public final ppt0 g4() {
        qcy<Object> qcyVar = g[3];
        return (ppt0) this.f.c();
    }
}
