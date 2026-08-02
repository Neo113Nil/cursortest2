package com.blaze.blazesdk.players;

import android.app.Application;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.ExoPlayer;
import com.blaze.blazesdk.delegates.models.BlazePlaybackModificationRequest;
import com.blaze.blazesdk.delegates.models.BlazePlaybackModificationResponse;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.Gson;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.bcl;
import defpackage.bmj;
import defpackage.eo4;
import defpackage.etl;
import defpackage.evl;
import defpackage.fam;
import defpackage.fgm;
import defpackage.g51;
import defpackage.g9i;
import defpackage.ghh;
import defpackage.h5c;
import defpackage.h6c;
import defpackage.hke;
import defpackage.hq4;
import defpackage.hr4;
import defpackage.hs4;
import defpackage.iyl;
import defpackage.iym;
import defpackage.jdm;
import defpackage.k0n;
import defpackage.ku3;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.lyl;
import defpackage.m1n;
import defpackage.msm;
import defpackage.mtl;
import defpackage.n4m;
import defpackage.nvm;
import defpackage.oxm;
import defpackage.p7m;
import defpackage.pe2;
import defpackage.pf5;
import defpackage.pum;
import defpackage.rob;
import defpackage.sq3;
import defpackage.tul;
import defpackage.up4;
import defpackage.uul;
import defpackage.vg6;
import defpackage.wtm;
import defpackage.wwl;
import defpackage.wwm;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import defpackage.z0n;
import defpackage.z45;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class BlazeVideoManager implements fam {
    public final ExoPlayer a;
    public final ku3 b;
    public yda c;
    public g9i d;
    public k0n e;
    public yda f;
    public oxm g;
    public iym h;
    public pum i;
    public nvm j;
    public iyl k;
    public wwm l;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/players/BlazeVideoManager$MediaItemIdMetadata;", "", "", "playableId", "originalContentUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/blaze/blazesdk/players/BlazeVideoManager$MediaItemIdMetadata;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlayableId", "getOriginalContentUrl", "getToMediaItemId", "toMediaItemId", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MediaItemIdMetadata {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String originalContentUrl;

        @NotNull
        private final String playableId;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.blaze.blazesdk.players.BlazeVideoManager$MediaItemIdMetadata$a, reason: from kotlin metadata */
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public MediaItemIdMetadata(@NotNull String str, @Nullable String str2) {
            str.getClass();
            this.playableId = str;
            this.originalContentUrl = str2;
        }

        public static /* synthetic */ MediaItemIdMetadata copy$default(MediaItemIdMetadata mediaItemIdMetadata, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mediaItemIdMetadata.playableId;
            }
            if ((i & 2) != 0) {
                str2 = mediaItemIdMetadata.originalContentUrl;
            }
            return mediaItemIdMetadata.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlayableId() {
            return this.playableId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getOriginalContentUrl() {
            return this.originalContentUrl;
        }

        @NotNull
        public final MediaItemIdMetadata copy(@NotNull String playableId, @Nullable String originalContentUrl) {
            playableId.getClass();
            return new MediaItemIdMetadata(playableId, originalContentUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaItemIdMetadata)) {
                return false;
            }
            MediaItemIdMetadata mediaItemIdMetadata = (MediaItemIdMetadata) other;
            return Intrinsics.c(this.playableId, mediaItemIdMetadata.playableId) && Intrinsics.c(this.originalContentUrl, mediaItemIdMetadata.originalContentUrl);
        }

        @Nullable
        public final String getOriginalContentUrl() {
            return this.originalContentUrl;
        }

        @NotNull
        public final String getPlayableId() {
            return this.playableId;
        }

        @NotNull
        public final String getToMediaItemId() {
            String json = new Gson().toJson(this);
            json.getClass();
            return json;
        }

        public int hashCode() {
            int hashCode = this.playableId.hashCode() * 31;
            String str = this.originalContentUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItemIdMetadata(playableId=");
            sb.append(this.playableId);
            sb.append(", originalContentUrl=");
            return lnb.q(sb, this.originalContentUrl, ')');
        }
    }

    public BlazeVideoManager(@NotNull ExoPlayer exoPlayer, @NotNull ku3 ku3Var) {
        exoPlayer.getClass();
        ku3Var.getClass();
        this.a = exoPlayer;
        this.b = ku3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(BlazeVideoManager blazeVideoManager, n4m n4mVar, sq3 sq3Var) {
        msm msmVar;
        int i;
        String str;
        n4m n4mVar2;
        String str2;
        uul uulVar;
        String str3;
        n4m.a aVar;
        String str4;
        Application application$blazesdk_release;
        eo4 eo4Var;
        BlazePlaybackModificationResponse blazePlaybackModificationResponse;
        blazeVideoManager.getClass();
        if (sq3Var instanceof msm) {
            msmVar = (msm) sq3Var;
            int i2 = msmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                msmVar.v = i2 - Integer.MIN_VALUE;
                Object obj = msmVar.t;
                lu3 lu3Var = lu3.a;
                i = msmVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    n4mVar.getClass();
                    n4m.a aVar2 = n4mVar.c;
                    if (aVar2 instanceof n4m.a.b) {
                        str = ((n4m.a.b) aVar2).e();
                    } else {
                        if (!(aVar2 instanceof n4m.a.C1353a) && !(aVar2 instanceof p7m)) {
                            zzl.b();
                            return null;
                        }
                        str = null;
                    }
                    if (str == null) {
                        str = null;
                    }
                    if (str != null && fgm.j(n4mVar) != null) {
                        tul tulVar = jdm.d;
                        if (tulVar == null || (uulVar = tulVar.a) == null || !uulVar.q) {
                            n4mVar2 = n4mVar;
                            str2 = str;
                            MediaItemIdMetadata.INSTANCE.getClass();
                            n4mVar2.getClass();
                            String str5 = n4mVar2.a;
                            aVar = n4mVar2.c;
                            if (aVar instanceof n4m.a.b) {
                                str4 = ((n4m.a.b) aVar).e();
                            } else {
                                if (!(aVar instanceof n4m.a.C1353a) && !(aVar instanceof p7m)) {
                                    zzl.b();
                                    return null;
                                }
                                str4 = null;
                            }
                            if (str4 == null) {
                                str4 = null;
                            }
                            String toMediaItemId = new MediaItemIdMetadata(str5, str4).getToMediaItemId();
                            h5c h5cVar = new h5c();
                            toMediaItemId.getClass();
                            h5cVar.a = toMediaItemId;
                            h5cVar.g = str;
                            h5cVar.b(str2);
                            h6c a = h5cVar.a();
                            etl.b.getClass();
                            str.getClass();
                            application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                            if (application$blazesdk_release == null) {
                                eo4Var = null;
                            } else {
                                up4 up4Var = new up4();
                                up4Var.c = true;
                                eo4 eo4Var2 = new eo4(application$blazesdk_release, up4Var);
                                ghh ghhVar = pf5.d;
                                eo4Var = eo4Var2;
                                if (ghhVar != null) {
                                    ghh ghhVar2 = pf5.e;
                                    eo4Var = eo4Var2;
                                    if (ghhVar2 != null) {
                                        mtl mtlVar = new mtl();
                                        pe2 pe2Var = new pe2();
                                        pe2Var.a = ghhVar;
                                        pe2Var.f = eo4Var2;
                                        pe2Var.d = mtlVar;
                                        pe2Var.g = 2;
                                        pe2Var.h = new wwl("Playback Cache", str);
                                        pe2 pe2Var2 = new pe2();
                                        pe2Var2.a = ghhVar2;
                                        pe2Var2.c = null;
                                        pe2Var2.e = true;
                                        pe2Var2.f = pe2Var;
                                        pe2Var2.d = mtlVar;
                                        pe2Var2.g = 2;
                                        pe2Var2.h = new wwl("Prefetch Cache", str);
                                        eo4Var = pe2Var2;
                                    }
                                }
                            }
                            if (eo4Var != null) {
                                return new hr4(eo4Var).a(a);
                            }
                        } else {
                            BlazePlaybackModificationRequest blazePlaybackModificationRequest = new BlazePlaybackModificationRequest(str);
                            hs4 hs4Var = z45.a;
                            hq4 hq4Var = hq4.c;
                            wtm wtmVar = new wtm(blazePlaybackModificationRequest, null);
                            msmVar.r = n4mVar;
                            msmVar.s = str;
                            msmVar.v = 1;
                            Object R = xw3.R(hq4Var, wtmVar, msmVar);
                            if (R == lu3Var) {
                                return lu3Var;
                            }
                            n4mVar2 = n4mVar;
                            str3 = str;
                            obj = R;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = msmVar.s;
                n4mVar2 = msmVar.r;
                y6a.M(obj);
                blazePlaybackModificationResponse = (BlazePlaybackModificationResponse) obj;
                if (blazePlaybackModificationResponse != null || (r8 = blazePlaybackModificationResponse.getModifiedURL()) == null) {
                    String str6 = str3;
                }
                String str7 = str3;
                str2 = str6;
                str = str7;
                MediaItemIdMetadata.INSTANCE.getClass();
                n4mVar2.getClass();
                String str52 = n4mVar2.a;
                aVar = n4mVar2.c;
                if (aVar instanceof n4m.a.b) {
                }
                if (str4 == null) {
                }
                String toMediaItemId2 = new MediaItemIdMetadata(str52, str4).getToMediaItemId();
                h5c h5cVar2 = new h5c();
                toMediaItemId2.getClass();
                h5cVar2.a = toMediaItemId2;
                h5cVar2.g = str;
                h5cVar2.b(str2);
                h6c a2 = h5cVar2.a();
                etl.b.getClass();
                str.getClass();
                application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                if (application$blazesdk_release == null) {
                }
                if (eo4Var != null) {
                }
                return null;
            }
        }
        msmVar = new msm(blazeVideoManager, sq3Var);
        Object obj2 = msmVar.t;
        lu3 lu3Var2 = lu3.a;
        i = msmVar.v;
        if (i != 0) {
        }
        blazePlaybackModificationResponse = (BlazePlaybackModificationResponse) obj2;
        if (blazePlaybackModificationResponse != null) {
        }
        String str62 = str3;
        String str72 = str3;
        str2 = str62;
        str = str72;
        MediaItemIdMetadata.INSTANCE.getClass();
        n4mVar2.getClass();
        String str522 = n4mVar2.a;
        aVar = n4mVar2.c;
        if (aVar instanceof n4m.a.b) {
        }
        if (str4 == null) {
        }
        String toMediaItemId22 = new MediaItemIdMetadata(str522, str4).getToMediaItemId();
        h5c h5cVar22 = new h5c();
        toMediaItemId22.getClass();
        h5cVar22.a = toMediaItemId22;
        h5cVar22.g = str;
        h5cVar22.b(str2);
        h6c a22 = h5cVar22.a();
        etl.b.getClass();
        str.getClass();
        application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
        if (application$blazesdk_release == null) {
        }
        if (eo4Var != null) {
        }
        return null;
    }

    @Override // defpackage.fam
    public final void a(float f) {
        try {
            ((vg6) this.a).b(new hke(f));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void b(long j) {
        seekTo(Math.max(((vg6) this.a).getCurrentPosition() - j, 0L));
    }

    @Override // defpackage.fam
    public final void c(n4m n4mVar, lyl lylVar) {
        n4mVar.getClass();
        h();
        wwm wwmVar = new wwm(this, n4mVar, lylVar);
        this.l = wwmVar;
        ((vg6) this.a).m.a(wwmVar);
    }

    @Override // defpackage.fam
    public final void d(n4m n4mVar, bcl bclVar) {
        n4mVar.getClass();
        try {
            k();
            pum pumVar = new pum(this, n4mVar, bclVar);
            this.i = pumVar;
            ((vg6) this.a).m.a(pumVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final boolean e(n4m n4mVar) {
        String str;
        n4mVar.getClass();
        h6c e = ((g51) this.a).e();
        if (e == null) {
            return false;
        }
        MediaItemIdMetadata.INSTANCE.getClass();
        Object fromJson = new Gson().fromJson(e.a, (Class<Object>) MediaItemIdMetadata.class);
        fromJson.getClass();
        MediaItemIdMetadata mediaItemIdMetadata = (MediaItemIdMetadata) fromJson;
        String str2 = n4mVar.a;
        n4m.a aVar = n4mVar.c;
        if (aVar instanceof n4m.a.b) {
            str = ((n4m.a.b) aVar).e();
        } else {
            if (!(aVar instanceof n4m.a.C1353a) && !(aVar instanceof p7m)) {
                zzl.b();
                return false;
            }
            str = null;
        }
        return mediaItemIdMetadata.equals(new MediaItemIdMetadata(str2, str != null ? str : null));
    }

    @Override // defpackage.fam
    public final void f(n4m n4mVar, iyl iylVar) {
        n4mVar.getClass();
        try {
            e();
            k0n k0nVar = new k0n(this, n4mVar, iylVar);
            this.e = k0nVar;
            ((vg6) this.a).m.a(k0nVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void g(n4m n4mVar, lyl lylVar) {
        n4mVar.getClass();
        try {
            n();
            iym iymVar = new iym(this, n4mVar, lylVar);
            this.h = iymVar;
            ((vg6) this.a).m.a(iymVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void h(n4m n4mVar, iyl iylVar) {
        n4mVar.getClass();
        try {
            c();
            nvm nvmVar = new nvm(this, n4mVar, iylVar);
            this.j = nvmVar;
            ((vg6) this.a).m.a(nvmVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void i(n4m n4mVar, iyl iylVar) {
        n4mVar.getClass();
        try {
            g();
            oxm oxmVar = new oxm(this, n4mVar, iylVar);
            this.g = oxmVar;
            ((vg6) this.a).m.a(oxmVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final boolean isPlaying() {
        try {
            return ((g51) this.a).isPlaying();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return false;
        }
    }

    @Override // defpackage.fam
    public final void j(n4m n4mVar, long j, boolean z) {
        n4mVar.getClass();
        if (!e(n4mVar)) {
            hs4 hs4Var = z45.a;
            this.d = xw3.L(this.b, rob.a, null, new m1n(this, n4mVar, j, null), 2);
            return;
        }
        Object obj = this.a;
        vg6 vg6Var = (vg6) obj;
        long duration = vg6Var.getDuration();
        long currentPosition = vg6Var.getCurrentPosition();
        if (vg6Var.getPlaybackState() == 4 || (duration > 0 && currentPosition >= duration - 300)) {
            if (z) {
                ((g51) obj).M(5, 0L);
            } else {
                ((g51) obj).M(5, Math.max(0L, duration - 300));
            }
        }
    }

    @Override // defpackage.fam
    public final void k(n4m n4mVar, bmj bmjVar) {
        n4mVar.getClass();
        try {
            yda ydaVar = this.c;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            this.c = evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new z0n(this, n4mVar, bmjVar, null), 1, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void m() {
        yda ydaVar = this.c;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.c = null;
    }

    @Override // defpackage.fam
    public final void n() {
        iym iymVar = this.h;
        if (iymVar != null) {
            ((vg6) this.a).z(iymVar);
        }
        this.h = null;
    }

    @Override // defpackage.fam
    public final void o() {
        try {
            ((g51) this.a).seekToDefaultPosition();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void pause() {
        try {
            ((g51) this.a).setPlayWhenReady(false);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void play() {
        try {
            ((g51) this.a).setPlayWhenReady(true);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void release() {
        try {
            g9i g9iVar = this.d;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            this.d = null;
            ((vg6) this.a).release();
            yda ydaVar = this.c;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void seekTo(long j) {
        try {
            ((g51) this.a).M(5, j);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final ku3 b() {
        return this.b;
    }

    @Override // defpackage.fam
    public final void b(iyl iylVar) {
        this.k = iylVar;
    }

    @Override // defpackage.fam
    public final void c() {
        nvm nvmVar = this.j;
        if (nvmVar != null) {
            ((vg6) this.a).z(nvmVar);
        }
        this.j = null;
    }

    @Override // defpackage.fam
    public final void a(long j) {
        ExoPlayer exoPlayer = this.a;
        seekTo(Math.min(((vg6) exoPlayer).getCurrentPosition() + j, ((vg6) exoPlayer).getDuration()));
    }

    @Override // defpackage.fam
    public final ExoPlayer d() {
        return this.a;
    }

    @Override // defpackage.fam
    public final void f() {
        try {
            ((vg6) this.a).setVolume(1.0f);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void g() {
        oxm oxmVar = this.g;
        if (oxmVar != null) {
            ((vg6) this.a).z(oxmVar);
        }
        this.g = null;
    }

    @Override // defpackage.fam
    public final void h() {
        wwm wwmVar = this.l;
        if (wwmVar != null) {
            ((vg6) this.a).z(wwmVar);
        }
        this.l = null;
    }

    @Override // defpackage.fam
    public final void i() {
        g9i g9iVar = this.d;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.d = null;
        Object obj = this.a;
        ((vg6) obj).stop();
        ((g51) obj).t();
    }

    @Override // defpackage.fam
    public final void k() {
        pum pumVar = this.i;
        if (pumVar != null) {
            ((vg6) this.a).z(pumVar);
        }
        this.i = null;
    }

    @Override // defpackage.fam
    public final void e() {
        k0n k0nVar = this.e;
        if (k0nVar != null) {
            ((vg6) this.a).z(k0nVar);
        }
        yda ydaVar = this.f;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.fam
    public final void j() {
        try {
            ((vg6) this.a).setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void l() {
        this.k = null;
    }
}
