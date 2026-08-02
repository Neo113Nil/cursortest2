package com.vk.newsfeed.common.recycler.holders;

import android.app.Activity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.VideoFile;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import xsna.fxc0;
import xsna.g620;
import xsna.gd60;
import xsna.hd60;
import xsna.j5i;
import xsna.qrq;
import xsna.u1c0;
import xsna.ydt0;
import xsna.yg5;

/* compiled from: VideoAttachmentsController.kt */
/* loaded from: classes4.dex */
public final class h {
    public static void a(Activity activity, u1c0 u1c0Var, VideoAttachment videoAttachment, VideoFile videoFile, j5i j5iVar) {
        PostInteract postInteract;
        PostInteract postInteract2;
        if (videoFile.isExternal() || !videoFile.T3()) {
            b(activity, u1c0Var, videoAttachment);
            return;
        }
        if (videoAttachment.i == null) {
            videoAttachment.Ob(videoFile);
        }
        yg5 yg5Var = videoAttachment.i;
        if (yg5Var == null || !yg5Var.p0() || !yg5Var.A().T3()) {
            b(activity, u1c0Var, videoAttachment);
            return;
        }
        if (activity.isFinishing()) {
            return;
        }
        VideoFile videoFile2 = videoAttachment.k;
        String r = videoFile2.r();
        if (r == null || r.length() == 0) {
            String c = u1c0Var != null ? u1c0Var.c() : null;
            if (c == null && (postInteract = videoAttachment.g) != null) {
                c = postInteract.h;
            }
            videoFile2.setTrackCode(c);
        }
        if (g620.f().d(videoFile2)) {
            ClipsRouter.c(g620.f().a(), activity, Collections.singletonList(new ClipFeedTab.SingleClip(g620.f().e0().c(videoFile2), null, null, true, false, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null)), j5iVar, null, null, null, null, false, null, 2016);
        } else if (!videoAttachment.k.q0()) {
            ydt0 Y = fxc0.B().Y();
            VideoFile videoFile3 = videoAttachment.k;
            String c2 = u1c0Var != null ? u1c0Var.c() : null;
            if (c2 == null && (postInteract2 = videoAttachment.g) != null) {
                c2 = postInteract2.h;
            }
            ydt0.s(Y, activity, videoFile3, j5iVar, false, null, c2, null, null, null, 16224);
        } else if (videoAttachment.k.A1() && g620.f().getExperiments().n()) {
            g620.f().a().f(activity, videoAttachment.k.I0(), Collections.singletonList(videoAttachment.k), j5iVar);
        } else {
            ydt0 Y2 = fxc0.B().Y();
            VideoFile videoFile4 = videoAttachment.k;
            String str = videoAttachment.l;
            PostInteract postInteract3 = videoAttachment.g;
            ydt0.p(Y2, activity, videoFile4, true, true, null, str, postInteract3 != null ? postInteract3.b : null, null, j5iVar, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
        }
        c(u1c0Var, videoAttachment);
    }

    public static void b(Activity activity, u1c0 u1c0Var, VideoAttachment videoAttachment) {
        BaseVideoAutoPlayHolder.ShittyAdsDataProvider shittyAdsDataProvider;
        ShitAttachment shitAttachment = videoAttachment.h;
        if (shitAttachment != null) {
            shittyAdsDataProvider = new BaseVideoAutoPlayHolder.ShittyAdsDataProvider(shitAttachment, u1c0Var != null ? u1c0Var.k : -1);
        } else {
            shittyAdsDataProvider = null;
        }
        BaseVideoAutoPlayHolder.ShittyAdsDataProvider shittyAdsDataProvider2 = shittyAdsDataProvider;
        c(u1c0Var, videoAttachment);
        gd60 a = hd60.a();
        VideoFile videoFile = videoAttachment.k;
        a.A0(activity, videoFile, videoAttachment.l, shittyAdsDataProvider2, videoAttachment.m, videoAttachment.o, videoFile.H6(), null);
    }

    public static void c(u1c0 u1c0Var, VideoAttachment videoAttachment) {
        String str = u1c0Var != null ? u1c0Var.l : null;
        if (str == null) {
            str = videoAttachment.l;
        }
        if ("fave".equals(str)) {
            qrq.a(u1c0Var != null ? u1c0Var.b : null, videoAttachment);
        }
    }
}
