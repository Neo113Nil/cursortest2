package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import defpackage.fcp;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.v98;
import defpackage.xw3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ba extends hoi implements Function2 {
    public final /* synthetic */ Ha a;
    public final /* synthetic */ HtmlVideoPlayerRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ba(Ha ha, HtmlVideoPlayerRequest htmlVideoPlayerRequest, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = ha;
        this.b = htmlVideoPlayerRequest;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ba(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ba(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a.a;
        HtmlVideoPlayerRequest htmlVideoPlayerRequest = this.b;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        htmlVideoPlayerRequest.getClass();
        InterfaceC3880x9 interfaceC3880x9 = gestureDetectorOnGestureListenerC3889xi.i;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("HtmlVideoPlayer", "loadVideoPlayer");
        }
        if (gestureDetectorOnGestureListenerC3889xi.getAdConfig().getHybridNative().getIsEnabled()) {
            String maxSupportedPlayerVersion = gestureDetectorOnGestureListenerC3889xi.getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
            Hi hi = gestureDetectorOnGestureListenerC3889xi.e0;
            try {
                AbstractC3738rn.a(maxSupportedPlayerVersion);
                gestureDetectorOnGestureListenerC3889xi.a1 = true;
                gestureDetectorOnGestureListenerC3889xi.Z0 = new D8(gestureDetectorOnGestureListenerC3889xi, gestureDetectorOnGestureListenerC3889xi.getAdConfig().getHybridNative(), htmlVideoPlayerRequest, gestureDetectorOnGestureListenerC3889xi.b1, gestureDetectorOnGestureListenerC3889xi.e0, gestureDetectorOnGestureListenerC3889xi.i);
                gestureDetectorOnGestureListenerC3889xi.a(EnumC3879x8.VIDEO_PLAYER_CREATED, AbstractC3907ya.a(htmlVideoPlayerRequest, HtmlVideoPlayerRequest.class));
                D8 d8 = gestureDetectorOnGestureListenerC3889xi.Z0;
                if (d8 != null) {
                    C3682pi c3682pi = new C3682pi(gestureDetectorOnGestureListenerC3889xi);
                    if (!d8.g.get()) {
                        HtmlVideoPlayerRequest htmlVideoPlayerRequest2 = d8.a;
                        htmlVideoPlayerRequest2.getClass();
                        String valueOf = String.valueOf(AbstractC3907ya.a(htmlVideoPlayerRequest2, HtmlVideoPlayerRequest.class));
                        A8[] a8Arr = {A8.INIT};
                        EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
                        if (d8.a(a8Arr, "createVideoPlayer", valueOf, A8.LOADING)) {
                            InterfaceC3880x9 interfaceC3880x92 = d8.c;
                            if (interfaceC3880x92 != null) {
                                ((C3906y9) interfaceC3880x92).b("HybridVideoPlayerHandler", "load called with video files");
                            }
                            d8.m = c3682pi;
                            if (d8.f == null) {
                                d8.f = fcp.m0(new v98(d8.k.C, new B8(d8, null), 3), d8.e);
                            }
                            V7 v7 = d8.k;
                            if (!v7.h.get()) {
                                v7.a(new C3568l8(v7.a));
                                if (v7.b() == Jg.STATE_INITIALIZED) {
                                    v7.l.set(Jg.STATE_PREPARING);
                                    v7.s.clear();
                                    v7.s.addAll(v7.a.getVideoFiles());
                                    List list = v7.s;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((HtmlVideoFile) it.next()).getUrl());
                                    }
                                    if (arrayList.isEmpty()) {
                                        v7.a(new C3542k8(Zm.NO_URL_FOUND));
                                    } else {
                                        v7.v = xw3.L(v7.c, null, null, new K7(v7, arrayList, null), 3);
                                    }
                                } else {
                                    v7.a(new C3542k8(Zm.INVALID_STATE));
                                }
                            }
                        }
                    }
                }
                gestureDetectorOnGestureListenerC3889xi.getViewableAd();
            } catch (Ig e) {
                if (hi != null) {
                    hi.a(e.a);
                }
            }
            return Unit.a;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Hybrid video is not supported on this device.");
        EnumC3491i8[] enumC3491i8Arr2 = EnumC3491i8.a;
        jSONObject.put("jsCommand", "createVideoPlayer");
        gestureDetectorOnGestureListenerC3889xi.a(EnumC3879x8.VIDEO_COMMAND_ERROR, jSONObject);
        InterfaceC3880x9 interfaceC3880x93 = gestureDetectorOnGestureListenerC3889xi.i;
        if (interfaceC3880x93 != null) {
            ((C3906y9) interfaceC3880x93).b("HtmlVideoPlayer", "Cannot play hybrid video");
        }
        return Unit.a;
    }
}
