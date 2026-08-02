package com.blaze.blazesdk.players;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import com.blaze.blazesdk.players.BlazeVideoManager;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.gson.Gson;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ale;
import defpackage.av9;
import defpackage.b78;
import defpackage.bcl;
import defpackage.bmj;
import defpackage.eam;
import defpackage.eim;
import defpackage.fam;
import defpackage.fdi;
import defpackage.g9i;
import defpackage.gdi;
import defpackage.h6c;
import defpackage.hv9;
import defpackage.iyl;
import defpackage.j4m;
import defpackage.ku3;
import defpackage.lyl;
import defpackage.m5c;
import defpackage.m7m;
import defpackage.n4m;
import defpackage.ndd;
import defpackage.o6c;
import defpackage.p5c;
import defpackage.p7m;
import defpackage.q5c;
import defpackage.q6c;
import defpackage.q7m;
import defpackage.s2m;
import defpackage.s5c;
import defpackage.scm;
import defpackage.tcm;
import defpackage.tl2;
import defpackage.u0m;
import defpackage.u5c;
import defpackage.uwl;
import defpackage.v5c;
import defpackage.vlm;
import defpackage.vvf;
import defpackage.wjm;
import defpackage.xw3;
import defpackage.z1a;
import defpackage.z5c;
import defpackage.zwl;
import defpackage.zzl;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements fam, tcm {
    public final fam a;
    public ale b;
    public n4m c;
    public boolean d;
    public s2m e;
    public tl2 f;
    public CastContext g;
    public uwl h;
    public vlm i;
    public long j;
    public final fdi k;
    public eim l;
    public eam m;
    public scm n;
    public u0m o;
    public j4m p;
    public m7m q;
    public g9i r;
    public g9i s;

    public a(@NotNull fam famVar, @NotNull Context context) {
        famVar.getClass();
        context.getClass();
        this.a = famVar;
        this.b = famVar.d();
        this.k = gdi.a(Boolean.FALSE);
        try {
            CastContext c = CastContext.c(context);
            this.g = c;
            this.f = new tl2(c);
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            this.g = null;
            p();
        }
    }

    @Override // defpackage.fam
    public final void a(long j) {
        seekTo(Math.min(this.b.getCurrentPosition() + j, this.b.getDuration()));
    }

    @Override // defpackage.fam
    public final void b(long j) {
        seekTo(Math.max(this.b.getCurrentPosition() - j, 0L));
    }

    @Override // defpackage.fam
    public final void c(n4m n4mVar, lyl lylVar) {
        n4mVar.getClass();
        h();
        m7m m7mVar = new m7m(this, n4mVar, lylVar);
        this.q = m7mVar;
        this.b.s(m7mVar);
    }

    @Override // defpackage.fam
    public final void d(n4m n4mVar, bcl bclVar) {
        n4mVar.getClass();
        k();
        u0m u0mVar = new u0m(this, n4mVar, bclVar);
        this.o = u0mVar;
        this.b.s(u0mVar);
    }

    @Override // defpackage.fam
    public final boolean e(n4m n4mVar) {
        String str;
        n4mVar.getClass();
        h6c e = this.b.e();
        if (e == null) {
            return false;
        }
        BlazeVideoManager.MediaItemIdMetadata.INSTANCE.getClass();
        Object fromJson = new Gson().fromJson(e.a, (Class<Object>) BlazeVideoManager.MediaItemIdMetadata.class);
        fromJson.getClass();
        BlazeVideoManager.MediaItemIdMetadata mediaItemIdMetadata = (BlazeVideoManager.MediaItemIdMetadata) fromJson;
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
        return mediaItemIdMetadata.equals(new BlazeVideoManager.MediaItemIdMetadata(str2, str != null ? str : null));
    }

    @Override // defpackage.fam
    public final void f() {
        try {
            this.b.setVolume(1.0f);
            this.a.f();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void g(n4m n4mVar, lyl lylVar) {
        n4mVar.getClass();
        n();
        scm scmVar = new scm(this, n4mVar, lylVar);
        this.n = scmVar;
        this.b.s(scmVar);
    }

    @Override // defpackage.fam
    public final void h(n4m n4mVar, iyl iylVar) {
        n4mVar.getClass();
        c();
        j4m j4mVar = new j4m(this, n4mVar, iylVar);
        this.p = j4mVar;
        this.b.s(j4mVar);
    }

    @Override // defpackage.fam
    public final void i(n4m n4mVar, iyl iylVar) {
        n4mVar.getClass();
        g();
        eam eamVar = new eam(this, n4mVar, iylVar);
        this.m = eamVar;
        this.b.s(eamVar);
    }

    @Override // defpackage.fam
    public final boolean isPlaying() {
        try {
            return this.b.isPlaying();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return false;
        }
    }

    @Override // defpackage.fam
    public final void j(n4m n4mVar, long j, boolean z) {
        n4mVar.getClass();
        if (!((Boolean) this.k.getValue()).booleanValue()) {
            this.c = n4mVar;
            if (e(n4mVar)) {
                return;
            }
            this.a.j(n4mVar, j, z);
            return;
        }
        n4m n4mVar2 = this.c;
        boolean c = Intrinsics.c(n4mVar2 != null ? n4mVar2.a : null, n4mVar.a);
        tl2 tl2Var = this.f;
        boolean z2 = (tl2Var != null ? tl2Var.a.e() : null) != null;
        if (c && z2) {
            this.c = n4mVar;
        } else {
            this.c = n4mVar;
            m(n4mVar, j);
        }
    }

    @Override // defpackage.fam
    public final void k(n4m n4mVar, bmj bmjVar) {
        n4mVar.getClass();
        g9i g9iVar = this.s;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.s = xw3.L(this.a.b(), null, null, new wjm(this, n4mVar, bmjVar, null), 3);
    }

    public final void l(ale aleVar) {
        eim eimVar = this.l;
        if (eimVar != null) {
            aleVar.z(eimVar);
        }
        eam eamVar = this.m;
        if (eamVar != null) {
            aleVar.z(eamVar);
        }
        scm scmVar = this.n;
        if (scmVar != null) {
            aleVar.z(scmVar);
        }
        u0m u0mVar = this.o;
        if (u0mVar != null) {
            aleVar.z(u0mVar);
        }
        j4m j4mVar = this.p;
        if (j4mVar != null) {
            aleVar.z(j4mVar);
        }
        m7m m7mVar = this.q;
        if (m7mVar != null) {
            aleVar.z(m7mVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:13:0x004d, B:15:0x0061, B:19:0x006b, B:21:0x0071, B:23:0x0075, B:27:0x007f, B:29:0x0081, B:31:0x0087, B:35:0x0091, B:37:0x0097, B:41:0x00ad, B:43:0x00d2, B:47:0x00dc, B:49:0x00e1, B:51:0x00ea, B:52:0x00f1, B:53:0x0102, B:82:0x009f, B:85:0x00a6, B:88:0x0116, B:89:0x011b), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(n4m n4mVar, long j) {
        h6c h6cVar;
        tl2 tl2Var;
        String str;
        String toMediaItemId;
        String str2;
        String str3;
        b78 b78Var;
        p5c p5cVar;
        List list;
        vvf vvfVar;
        s5c s5cVar;
        z5c z5cVar;
        q6c q6cVar;
        boolean z;
        s5c s5cVar2;
        q6c q6cVar2;
        v5c v5cVar;
        n4m a = new zwl(new q7m(2)).a(n4mVar);
        n4m.a aVar = a.c;
        n4m.a.b bVar = aVar instanceof n4m.a.b ? (n4m.a.b) aVar : null;
        if (bVar != null) {
            if (bVar instanceof n4m.a.b.C1355b) {
                str = ((n4m.a.b.C1355b) bVar).f;
            } else if (bVar instanceof n4m.a.b.c) {
                str = ((n4m.a.b.c) bVar).f;
            } else {
                if (!(bVar instanceof n4m.a.b.C1354a)) {
                    zzl.b();
                    return;
                }
                str = ((n4m.a.b.C1354a) bVar).f;
            }
            if (!StringsKt.R(str)) {
                Uri parse = Uri.parse(str);
                try {
                    toMediaItemId = new BlazeVideoManager.MediaItemIdMetadata(a.a, str).getToMediaItemId();
                    o6c o6cVar = new o6c();
                    String str4 = a.d;
                    if (str4 != null) {
                        if (StringsKt.R(str4)) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            o6cVar.a = str4;
                        }
                    }
                    String str5 = a.e;
                    if (str5 != null) {
                        if (StringsKt.R(str5)) {
                            str5 = null;
                        }
                        if (str5 != null) {
                            o6cVar.e = str5;
                        }
                    }
                    String d = bVar.d();
                    if (d != null) {
                        if (StringsKt.R(d)) {
                            d = null;
                        }
                        if (d != null) {
                            o6cVar.i = Uri.parse(d);
                        }
                    }
                    if (bVar instanceof n4m.a.b.C1355b) {
                        str2 = MimeTypes.APPLICATION_M3U8;
                    } else if (bVar instanceof n4m.a.b.c) {
                        str2 = MimeTypes.VIDEO_MP4;
                    } else {
                        if (!(bVar instanceof n4m.a.b.C1354a)) {
                            throw new ndd();
                        }
                        str2 = MimeTypes.APPLICATION_MPD;
                    }
                    str3 = str2;
                    b78Var = new b78();
                    p5cVar = new p5c(0);
                    list = Collections.EMPTY_LIST;
                    av9 av9Var = hv9.b;
                    vvfVar = vvf.e;
                    s5cVar = new s5c();
                    z5cVar = z5c.a;
                    toMediaItemId.getClass();
                    q6cVar = new q6c(o6cVar);
                } catch (Exception e) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
                }
                if (((Uri) p5cVar.c) != null && ((UUID) p5cVar.b) == null) {
                    z = false;
                    z1a.E(z);
                    if (parse == null) {
                        s5cVar2 = s5cVar;
                        q5c q5cVar = ((UUID) p5cVar.b) != null ? new q5c(p5cVar) : null;
                        q6cVar2 = q6cVar;
                        v5cVar = new v5c(parse, str3, q5cVar, null, list, null, vvfVar, C.TIME_UNSET);
                    } else {
                        s5cVar2 = s5cVar;
                        q6cVar2 = q6cVar;
                        v5cVar = null;
                    }
                    h6cVar = new h6c(toMediaItemId, new m5c(b78Var), v5cVar, new u5c(s5cVar2), q6cVar2, z5cVar);
                    if (h6cVar == null) {
                        return;
                    }
                    try {
                        vlm vlmVar = this.i;
                        if (vlmVar != null && (tl2Var = this.f) != null) {
                            tl2Var.z(vlmVar);
                        }
                        vlm vlmVar2 = new vlm();
                        this.i = vlmVar2;
                        tl2 tl2Var2 = this.f;
                        if (tl2Var2 != null) {
                            tl2Var2.s(vlmVar2);
                        }
                        tl2 tl2Var3 = this.f;
                        if (tl2Var3 != null) {
                            tl2Var3.a.Q(0, hv9.z(h6cVar), j);
                        }
                        this.d = true;
                        tl2 tl2Var4 = this.f;
                        if (tl2Var4 != null) {
                            tl2Var4.play();
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e2, null);
                        return;
                    }
                }
                z = true;
                z1a.E(z);
                if (parse == null) {
                }
                h6cVar = new h6c(toMediaItemId, new m5c(b78Var), v5cVar, new u5c(s5cVar2), q6cVar2, z5cVar);
                if (h6cVar == null) {
                }
            }
        }
        h6cVar = null;
        if (h6cVar == null) {
        }
    }

    @Override // defpackage.fam
    public final void n() {
        scm scmVar = this.n;
        if (scmVar != null) {
            this.b.z(scmVar);
        }
        this.n = null;
    }

    @Override // defpackage.fam
    public final void o() {
        this.a.o();
    }

    public final void p() {
        tl2 tl2Var = this.f;
        if (tl2Var != null) {
            tl2Var.release();
        }
        this.f = null;
    }

    @Override // defpackage.fam
    public final void pause() {
        try {
            this.b.pause();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void play() {
        try {
            this.b.play();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void q() {
        eim eimVar = this.l;
        if (eimVar != null) {
            this.b.s(eimVar);
        }
        eam eamVar = this.m;
        if (eamVar != null) {
            this.b.s(eamVar);
        }
        scm scmVar = this.n;
        if (scmVar != null) {
            this.b.s(scmVar);
        }
        u0m u0mVar = this.o;
        if (u0mVar != null) {
            this.b.s(u0mVar);
        }
        j4m j4mVar = this.p;
        if (j4mVar != null) {
            this.b.s(j4mVar);
        }
        m7m m7mVar = this.q;
        if (m7mVar != null) {
            this.b.s(m7mVar);
        }
    }

    public final void r() {
        CastContext castContext;
        SessionManager b;
        uwl uwlVar = this.h;
        if (uwlVar == null || (castContext = this.g) == null || (b = castContext.b()) == null) {
            return;
        }
        b.e(uwlVar);
    }

    @Override // defpackage.fam
    public final void release() {
        tl2 tl2Var;
        r();
        this.h = null;
        vlm vlmVar = this.i;
        if (vlmVar != null && (tl2Var = this.f) != null) {
            tl2Var.z(vlmVar);
        }
        this.i = null;
        p();
        this.g = null;
        this.a.release();
    }

    @Override // defpackage.fam
    public final void seekTo(long j) {
        try {
            this.b.seekTo(j);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void b(iyl iylVar) {
        this.a.b(iylVar);
    }

    @Override // defpackage.fam
    public final ku3 b() {
        return this.a.b();
    }

    @Override // defpackage.fam
    public final void c() {
        j4m j4mVar = this.p;
        if (j4mVar != null) {
            this.b.z(j4mVar);
        }
        this.p = null;
    }

    @Override // defpackage.fam
    public final ExoPlayer d() {
        return this.a.d();
    }

    @Override // defpackage.fam
    public final void g() {
        eam eamVar = this.m;
        if (eamVar != null) {
            this.b.z(eamVar);
        }
        this.m = null;
    }

    @Override // defpackage.fam
    public final void h() {
        m7m m7mVar = this.q;
        if (m7mVar != null) {
            this.b.z(m7mVar);
        }
        this.q = null;
    }

    @Override // defpackage.fam
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.fam
    public final tcm a() {
        return this;
    }

    @Override // defpackage.fam
    public final void a(float f) {
        this.a.a(f);
    }

    @Override // defpackage.fam
    public final void f(n4m n4mVar, iyl iylVar) {
        n4mVar.getClass();
        e();
        eim eimVar = new eim(this, n4mVar, iylVar);
        this.l = eimVar;
        this.b.s(eimVar);
    }

    @Override // defpackage.fam
    public final void k() {
        u0m u0mVar = this.o;
        if (u0mVar != null) {
            this.b.z(u0mVar);
        }
        this.o = null;
    }

    @Override // defpackage.fam
    public final void l() {
        this.a.l();
    }

    @Override // defpackage.fam
    public final void j() {
        try {
            this.b.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.j();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.fam
    public final void e() {
        eim eimVar = this.l;
        if (eimVar != null) {
            this.b.z(eimVar);
        }
        this.l = null;
        g9i g9iVar = this.r;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.r = null;
    }

    @Override // defpackage.fam
    public final void m() {
        g9i g9iVar = this.s;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.s = null;
    }
}
