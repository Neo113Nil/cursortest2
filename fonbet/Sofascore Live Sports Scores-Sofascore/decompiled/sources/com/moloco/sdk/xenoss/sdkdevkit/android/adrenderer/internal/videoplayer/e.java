package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import com.blaze.gam.custom_native.BlazeCustomNativeAdsProvider;
import com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDelegate;
import com.blaze.ima.BlazeIMADelegate;
import com.blaze.ima.ImaHandler;
import com.google.android.gms.internal.ads.zzgbw;
import com.google.android.gms.internal.ads.zzgby;
import com.google.android.gms.internal.ads.zzgca;
import com.google.android.gms.internal.ads.zziiq;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u;
import defpackage.g9i;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.we4;
import defpackage.xw3;
import defpackage.y6a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new e((f) this.s, (we4) obj2, rq3Var, 0);
            case 1:
                return new e((f) this.s, (String) obj2, rq3Var, 1);
            case 2:
                e eVar = new e((h) obj2, rq3Var, 2);
                eVar.s = obj;
                return eVar;
            case 3:
                e eVar2 = new e((l) obj2, rq3Var, 3);
                eVar2.s = obj;
                return eVar2;
            case 4:
                return new e((BlazeCustomNativeAdsProvider) this.s, (Throwable) obj2, rq3Var, 4);
            case 5:
                return new e((ImaHandler) this.s, (Throwable) obj2, rq3Var, 5);
            case 6:
                e eVar3 = new e((String) obj2, rq3Var, 6);
                eVar3.s = obj;
                return eVar3;
            default:
                e eVar4 = new e((zzgbw) obj2, rq3Var, 7);
                eVar4.s = obj;
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        Object obj3 = this.t;
        switch (i) {
            case 4:
                break;
            case 5:
                break;
        }
        return ((e) create((zzgca) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        File file;
        BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate;
        BlazeIMADelegate blazeIMADelegate;
        int i = this.r;
        rq3 rq3Var = null;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                we4 we4Var = (we4) obj2;
                long j = we4Var.e;
                f fVar = (f) this.s;
                String str = fVar.a;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                try {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h b = fVar.b(str);
                    if (b instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) {
                        file = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) b).a;
                    } else {
                        if (!(b instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f)) {
                            fVar.f = true;
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Failed to download file: " + str, null, false, 12, null);
                            throw new IOException("Cannot read file: " + str);
                        }
                        file = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) b).a;
                    }
                    if (!file.exists()) {
                        throw new IOException("Cannot read file, does not exist yet: " + str);
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    randomAccessFile.seek(j);
                    fVar.c = randomAccessFile;
                    long j2 = we4Var.f;
                    if (j2 == -1) {
                        j2 = file.length() - j;
                    }
                    fVar.d = j2;
                    if (j2 == 0 && fVar.e && (b instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) && Intrinsics.c(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) b).b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a)) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Streaming error likely detected", null, false, 12, null);
                        fVar.f = true;
                    }
                    return new Long(fVar.d);
                } catch (IOException e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Failed to open file: " + str, e, false, 8, null);
                    throw e;
                }
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return ((f) this.s).b.a((String) obj2);
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                boolean z = ((d) this.s).a;
                h hVar = (h) obj2;
                g9i g9iVar = hVar.v;
                if (z) {
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    hVar.v = xw3.L(hVar.e, null, null, new u(hVar, rq3Var, 3), 3);
                } else if (g9iVar != null) {
                    g9iVar.e(null);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                ((l) obj2).d.l((d) this.s);
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                blazeGAMCustomNativeAdsDelegate = ((BlazeCustomNativeAdsProvider) this.s).delegate;
                if (blazeGAMCustomNativeAdsDelegate == null) {
                    return null;
                }
                blazeGAMCustomNativeAdsDelegate.onGAMCustomNativeAdError(((Throwable) obj2).toString());
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                blazeIMADelegate = ((ImaHandler) this.s).delegate;
                if (blazeIMADelegate == null) {
                    return null;
                }
                blazeIMADelegate.onIMAAdError(((Throwable) obj2).toString());
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                zzgby zzgbyVar = (zzgby) ((zzgca) this.s).w();
                Map unmodifiableMap = Collections.unmodifiableMap(((zzgca) zzgbyVar.b).E());
                unmodifiableMap.getClass();
                new zziiq(unmodifiableMap);
                String str2 = (String) obj2;
                str2.getClass();
                zzgbyVar.n();
                ((zzgca) zzgbyVar.b).H().remove(str2);
                return (zzgca) zzgbyVar.o();
            default:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                zzgby zzgbyVar2 = (zzgby) ((zzgca) this.s).w();
                Map unmodifiableMap2 = Collections.unmodifiableMap(((zzgca) zzgbyVar2.b).E());
                unmodifiableMap2.getClass();
                new zziiq(unmodifiableMap2);
                zzgbw zzgbwVar = (zzgbw) obj2;
                String G = zzgbwVar.G();
                G.getClass();
                zzgbyVar2.n();
                ((zzgca) zzgbyVar2.b).H().put(G, zzgbwVar);
                return (zzgca) zzgbyVar2.o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }
}
