package com.vk.channels.impl.channel_screen.send_msg;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import xsna.bin0;
import xsna.dfd;
import xsna.di60;
import xsna.efd;
import xsna.epx;
import xsna.fnv0;
import xsna.gn60;
import xsna.ify;
import xsna.j5g;
import xsna.mds0;
import xsna.tbd;
import xsna.wm60;
import xsna.z1y0;
import xsna.zbb;

/* compiled from: ChannelMsgSendVc.kt */
/* loaded from: classes16.dex */
public final class c implements z1y0, gn60 {
    public final Object b;

    public /* synthetic */ c(Object obj) {
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.bin0] */
    public String a() {
        return (String) this.b.get();
    }

    @Override // xsna.gn60
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List x(mds0 mds0Var, wm60 wm60Var) {
        VerifyInfo verifyInfo;
        Owner owner;
        Owner owner2;
        NewsEntry newsEntry = mds0Var.a;
        VideoAttachment videoAttachment = mds0Var.c;
        int i = mds0Var.d;
        VideoFile videoFile = videoAttachment.k;
        ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
        Post R = di60.R(newsEntry);
        return Collections.singletonList(new tbd((efd) j5g.Y(((dfd) this.b).x(mds0Var, wm60Var)), clipVideoFile, R, !epx.f((clipVideoFile == null || (owner2 = clipVideoFile.v0) == null) ? null : owner2.b, (R == null || (owner = R.o) == null) ? null : owner.b), clipVideoFile != null ? clipVideoFile.p0 : null, (clipVideoFile == null || (verifyInfo = clipVideoFile.o0) == null) ? false : di60.A(verifyInfo), i));
    }

    @Override // xsna.z1y0
    public void i() {
        a aVar = (a) this.b;
        if (!aVar.K && !aVar.F().e()) {
            aVar.K = true;
            aVar.l.getClass();
            fnv0.a.h();
        }
        int i = ify.a;
        if (ify.e(ify.c)) {
            zbb.b bVar = aVar.E;
            (bVar != null ? bVar : null).getClass();
            aVar.L = true;
        } else {
            zbb.b bVar2 = aVar.E;
            (bVar2 != null ? bVar2 : null).e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        aVar.F().k();
    }

    public c(bin0 bin0Var) {
        UiTracker uiTracker = UiTracker.a;
        this.b = bin0Var;
    }

    public c(int i) {
        switch (i) {
            case 2:
                this.b = new HashMap();
                break;
            default:
                this.b = new dfd();
                break;
        }
    }

    @Override // xsna.z1y0
    public void f() {
    }

    @Override // xsna.z1y0
    public void g() {
    }
}
