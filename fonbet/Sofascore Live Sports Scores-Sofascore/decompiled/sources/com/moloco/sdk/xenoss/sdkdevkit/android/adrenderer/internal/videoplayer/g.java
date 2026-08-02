package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import com.facebook.ads.AdError;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.sofascore.model.mvvm.model.StatusKt;
import defpackage.fdi;
import defpackage.lnb;
import defpackage.sf6;
import defpackage.ug6;
import defpackage.vke;
import defpackage.wt3;
import defpackage.zzl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements vke {
    public final /* synthetic */ h a;

    public g(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.vke
    public final void h(sf6 sf6Var) {
        String str;
        String str2;
        f fVar;
        sf6Var.getClass();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        h hVar = this.a;
        fdi fdiVar = hVar.f;
        StringBuilder sb = new StringBuilder("Exoplayer error (streaming enabled = ");
        boolean z = hVar.b;
        MolocoLogger.error$default(molocoLogger, "SimplifiedExoPlayer", lnb.r(sb, z, ')'), sf6Var, false, 8, null);
        com.moloco.sdk.acm.recorder.c cVar = hVar.d;
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("exoplayer_error");
        int i = sf6Var.a;
        dVar.a("error_code", String.valueOf(i));
        if (i == 5001) {
            str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        } else if (i != 5002) {
            switch (i) {
                case 1000:
                    str = "ERROR_CODE_UNSPECIFIED";
                    break;
                case 1001:
                    str = "ERROR_CODE_REMOTE_ERROR";
                    break;
                case 1002:
                    str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    break;
                case 1003:
                    str = "ERROR_CODE_TIMEOUT";
                    break;
                case 1004:
                    str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    break;
                default:
                    switch (i) {
                        case 2000:
                            str = "ERROR_CODE_IO_UNSPECIFIED";
                            break;
                        case 2001:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            break;
                        case 2002:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            break;
                        case 2003:
                            str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            break;
                        case 2004:
                            str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            break;
                        case 2005:
                            str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                            break;
                        case 2006:
                            str = "ERROR_CODE_IO_NO_PERMISSION";
                            break;
                        case 2007:
                            str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            break;
                        case 2008:
                            str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            break;
                        default:
                            switch (i) {
                                case 3001:
                                    str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    break;
                                case 3002:
                                    str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    break;
                                case BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE:
                                    str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    break;
                                case 3004:
                                    str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    break;
                                default:
                                    switch (i) {
                                        case 4001:
                                            str = "ERROR_CODE_DECODER_INIT_FAILED";
                                            break;
                                        case 4002:
                                            str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                            break;
                                        case 4003:
                                            str = "ERROR_CODE_DECODING_FAILED";
                                            break;
                                        case 4004:
                                            str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            break;
                                        case 4005:
                                            str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            break;
                                        default:
                                            switch (i) {
                                                case 6000:
                                                    str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                    break;
                                                case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                    str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                    break;
                                                case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                    str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                    break;
                                                case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                                    str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                    break;
                                                case 6004:
                                                    str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                    break;
                                                case 6005:
                                                    str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                    break;
                                                case 6006:
                                                    str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                    break;
                                                case 6007:
                                                    str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                    break;
                                                case 6008:
                                                    str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                    break;
                                                default:
                                                    if (i < 1000000) {
                                                        str = "invalid error code";
                                                        break;
                                                    } else {
                                                        str = "custom error code";
                                                        break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        dVar.a("error_code_name", str);
        f fVar2 = hVar.q;
        dVar.a("has_streaming_error", String.valueOf(fVar2 != null && fVar2.f));
        o oVar = (o) fdiVar.getValue();
        if (oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l) {
            str2 = "not_available";
        } else if (oVar instanceof n) {
            str2 = "preparing";
        } else if (oVar instanceof m) {
            str2 = "position";
        } else {
            if (!(oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k)) {
                zzl.b();
                return;
            }
            str2 = StatusKt.STATUS_FINISHED;
        }
        dVar.a("playback_progress", str2);
        cVar.a(dVar);
        if (z && (fVar = hVar.q) != null && fVar.f) {
            o oVar2 = (o) fdiVar.getValue();
            if ((oVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) || (oVar2 instanceof m)) {
                MolocoLogger.info$default(molocoLogger, "SimplifiedExoPlayer", "Ignoring exoplayer streaming error as the user has viewed some of the ad already", null, false, 12, null);
                return;
            } else {
                if (!(oVar2 instanceof n) && !Intrinsics.c(oVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a)) {
                    zzl.b();
                    return;
                }
                MolocoLogger.info$default(molocoLogger, "SimplifiedExoPlayer", "Exoplayer streaming failed before any playback started, so report that as error", null, false, 12, null);
            }
        }
        fdi fdiVar2 = hVar.j;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.a;
        fdiVar2.getClass();
        fdiVar2.m(null, lVar);
    }

    @Override // defpackage.vke
    public final void onIsPlayingChanged(boolean z) {
        h hVar = this.a;
        ug6 ug6Var = hVar.p;
        long m = ug6Var != null ? ug6Var.m() : 0L;
        ug6 ug6Var2 = hVar.p;
        boolean z2 = m - (ug6Var2 != null ? ug6Var2.h() : 0L) > 0;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", com.appsflyer.internal.i.j("onIsPlayingChanged hasMore= ", z2), null, false, 12, null);
        fdi fdiVar = hVar.h;
        d dVar = new d(z, true, z2);
        fdiVar.getClass();
        fdiVar.m(null, dVar);
    }

    @Override // defpackage.vke
    public final void onPlaybackStateChanged(int i) {
        String valueOf = i != 1 ? i != 2 ? i != 3 ? i != 4 ? String.valueOf(i) : "ENDED" : "READY" : "BUFFERING" : "IDLE";
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder q = wt3.q("onPlaybackStateChanged: ", valueOf, " pos=");
        h hVar = this.a;
        ug6 ug6Var = hVar.p;
        q.append(ug6Var != null ? Long.valueOf(ug6Var.h()) : null);
        q.append(" dur=");
        ug6 ug6Var2 = hVar.p;
        q.append(ug6Var2 != null ? Long.valueOf(ug6Var2.m()) : null);
        MolocoLogger.info$default(molocoLogger, "SimplifiedExoPlayer", q.toString(), null, false, 12, null);
        if (i == 4) {
            ug6 ug6Var3 = hVar.p;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k(ug6Var3 != null ? ug6Var3.m() : 1L);
            fdi fdiVar = hVar.f;
            fdiVar.getClass();
            fdiVar.m(null, kVar);
            hVar.r = false;
            hVar.u = 0L;
        }
    }

    @Override // defpackage.vke
    public final void onRenderedFirstFrame() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("onRenderedFirstFrame pos=");
        ug6 ug6Var = this.a.p;
        sb.append(ug6Var != null ? Long.valueOf(ug6Var.h()) : null);
        MolocoLogger.info$default(molocoLogger, "SimplifiedExoPlayer", sb.toString(), null, false, 12, null);
    }
}
