package com.vk.clips.viewer.impl.di;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFileModeration;
import com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import io.reactivex.rxjava3.internal.operators.completable.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b1r;
import xsna.c6;
import xsna.c8m;
import xsna.cjh0;
import xsna.d7d;
import xsna.ep;
import xsna.er00;
import xsna.fp;
import xsna.fpf0;
import xsna.fr00;
import xsna.g8m;
import xsna.gxk0;
import xsna.hd;
import xsna.hpf0;
import xsna.hxk0;
import xsna.izs;
import xsna.jgd;
import xsna.jih0;
import xsna.jlh0;
import xsna.jpf;
import xsna.k15;
import xsna.l35;
import xsna.lkh0;
import xsna.md8;
import xsna.ng1;
import xsna.nwy;
import xsna.ojh0;
import xsna.pkq0;
import xsna.pv7;
import xsna.pwj0;
import xsna.q5f;
import xsna.qcy;
import xsna.qw6;
import xsna.r8a0;
import xsna.se0;
import xsna.te0;
import xsna.tp00;
import xsna.up00;
import xsna.y10;
import xsna.y2f;
import xsna.ykh0;

/* compiled from: ClipsViewersSdkComponentImpl.kt */
/* loaded from: classes17.dex */
public final class ClipsViewersSdkComponentImpl implements ClipsViewersSdkComponent {
    public static final /* synthetic */ qcy<Object>[] l;
    public final BridgeComponent a;
    public final ClipsAttachmentsComponent b;
    public final nwy c = new nwy(new ng1(this, 26));
    public final nwy d = new nwy(new l35(7));
    public final nwy e = new nwy(new q5f(this, 3));
    public final nwy f = new nwy(new hd(this, 25));
    public final nwy g = new nwy(new se0(13));
    public final nwy h = new nwy(new te0(7));
    public final nwy i = new nwy(new c6(5));
    public final nwy j = new nwy(new jpf(this, 0));
    public final nwy k = new nwy(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 29));

    /* compiled from: ClipsViewersSdkComponentImpl.kt */
    public static final class a implements c8m<ClipsViewersSdkComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsViewersSdkComponentImpl((BridgeComponent) g8mVar.a(fpf0.a(BridgeComponent.class)), (ClipsAttachmentsComponent) g8mVar.a(fpf0.a(ClipsAttachmentsComponent.class)));
        }
    }

    /* compiled from: ClipsViewersSdkComponentImpl.kt */
    public static final class b implements jgd {
        public b() {
        }

        @Override // xsna.jgd
        public final boolean a(Context context) {
            if (b()) {
                return false;
            }
            ClipsViewersSdkComponentImpl.this.a.s().getClass();
            return true;
        }

        @Override // xsna.jgd
        public final boolean b() {
            return ClipsViewersSdkComponentImpl.this.Ef().b();
        }

        @Override // xsna.jgd
        public final t c() {
            return t.b;
        }
    }

    /* compiled from: ClipsViewersSdkComponentImpl.kt */
    public static final class c implements jlh0 {
        public c() {
        }

        @Override // xsna.jlh0
        public final boolean a(SdkVideoFile sdkVideoFile) {
            return ClipsViewersSdkComponentImpl.this.b.oe().a(k15.A(sdkVideoFile));
        }

        @Override // xsna.jlh0
        public final CharSequence b(Context context, SdkActionLink sdkActionLink, boolean z, SdkVideoFileModeration sdkVideoFileModeration) {
            ClipLinkModerationStatus clipLinkModerationStatus;
            pkq0 oe = ClipsViewersSdkComponentImpl.this.b.oe();
            ActionLink a = sdkActionLink != null ? y10.a(sdkActionLink) : null;
            int i = d7d.$EnumSwitchMapping$1[sdkVideoFileModeration.ordinal()];
            if (i == 1) {
                clipLinkModerationStatus = ClipLinkModerationStatus.UNDEFINED;
            } else if (i == 2) {
                clipLinkModerationStatus = ClipLinkModerationStatus.NOT_MODERATED;
            } else if (i == 3) {
                clipLinkModerationStatus = ClipLinkModerationStatus.PENDING_MODERATION;
            } else if (i == 4) {
                clipLinkModerationStatus = ClipLinkModerationStatus.REJECTED;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                clipLinkModerationStatus = ClipLinkModerationStatus.APPROVED;
            }
            return oe.b(context, a, z, clipLinkModerationStatus);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsViewersSdkComponentImpl.class, "sdkAuthBridge", "getSdkAuthBridge()Lcom/vk/clips/sdk/shared/api/deps/bridge/SdkAuthBridge;", 0);
        hpf0 hpf0Var = fpf0.a;
        l = new qcy[]{propertyReference1Impl, fp.c(0, ClipsViewersSdkComponentImpl.class, "imageLoader", "getImageLoader()Lcom/vk/clips/sdk/shared/api/deps/image/SdkImageLoader;", hpf0Var), ep.a(0, ClipsViewersSdkComponentImpl.class, "clipsGridRouter", "getClipsGridRouter()Lcom/vk/clips/sdk/shared/api/routing/ClipsSdkGridRouter;", hpf0Var), ep.a(0, ClipsViewersSdkComponentImpl.class, "reportScreenRouter", "getReportScreenRouter()Lcom/vk/clips/sdk/shared/api/routing/SdkReportScreenRouter;", hpf0Var), ep.a(0, ClipsViewersSdkComponentImpl.class, "sdkVideoRepository", "getSdkVideoRepository()Lcom/vk/clips/sdk/shared/api/feed/data/SdkVideoRepository;", hpf0Var), ep.a(0, ClipsViewersSdkComponentImpl.class, "sdkThemeHelper", "getSdkThemeHelper()Lcom/vk/clips/sdk/shared/api/ui/SdkThemeHelper;", hpf0Var), ep.a(0, ClipsViewersSdkComponentImpl.class, "sdkDescriptionSpansHelperFactory", "getSdkDescriptionSpansHelperFactory()Lcom/vk/clips/sdk/shared/api/ui/SdkDescriptionSpansHelperFactory;", hpf0Var), ep.a(0, ClipsViewersSdkComponentImpl.class, "anonymActionInterceptor", "getAnonymActionInterceptor()Lcom/vk/clips/sdk/shared/api/anonym/ClipsAnonymActionInterceptor;", hpf0Var), ep.a(0, ClipsViewersSdkComponentImpl.class, "attachmentsUserLinksRenderer", "getAttachmentsUserLinksRenderer()Lcom/vk/clips/sdk/shared/api/deps/attachments/SdkUserLinksViewerRenderer;", hpf0Var)};
    }

    public ClipsViewersSdkComponentImpl(BridgeComponent bridgeComponent, ClipsAttachmentsComponent clipsAttachmentsComponent) {
        this.a = bridgeComponent;
        this.b = clipsAttachmentsComponent;
    }

    @Override // com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent
    public final er00 D5(tp00 tp00Var, up00 up00Var, izs izsVar) {
        pv7 pv7Var = new pv7((byte) 0, 2);
        BridgeComponent bridgeComponent = this.a;
        return new fr00(pv7Var, new b1r(bridgeComponent.p(), bridgeComponent.F()), tp00Var, up00Var, izsVar);
    }

    public final jlh0 Df() {
        qcy<Object> qcyVar = l[8];
        return (jlh0) this.k.c();
    }

    public final jih0 Ef() {
        qcy<Object> qcyVar = l[0];
        return (jih0) this.c.c();
    }

    @Override // com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent
    public final ojh0 h() {
        qcy<Object> qcyVar = l[1];
        return (ojh0) this.d.c();
    }

    @Override // com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent
    public final y2f j() {
        qcy<Object> qcyVar = l[2];
        return (y2f) this.e.c();
    }

    @Override // com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent
    public final jgd k0() {
        qcy<Object> qcyVar = l[7];
        return (jgd) this.j.c();
    }

    @Override // com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent
    public final cjh0 o() {
        qcy<Object> qcyVar = l[6];
        return (cjh0) this.i.c();
    }

    @Override // com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent
    public final ykh0 q() {
        qcy<Object> qcyVar = l[5];
        return (ykh0) this.h.c();
    }

    @Override // com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent
    public final lkh0 q0() {
        qcy<Object> qcyVar = l[3];
        return (lkh0) this.f.c();
    }

    @Override // com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent
    public final gxk0 r0(qw6 qw6Var, r8a0 r8a0Var) {
        md8 md8Var = new md8((byte) 0, 1);
        BridgeComponent bridgeComponent = this.a;
        return new hxk0(md8Var, new b1r(bridgeComponent.p(), bridgeComponent.F()), q0(), qw6Var, r8a0Var);
    }
}
