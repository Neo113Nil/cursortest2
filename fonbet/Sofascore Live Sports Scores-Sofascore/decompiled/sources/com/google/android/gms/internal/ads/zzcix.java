package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bf3;
import defpackage.bnn;
import defpackage.cwo;
import defpackage.eyo;
import defpackage.itn;
import defpackage.nkn;
import defpackage.q61;
import defpackage.qsn;
import defpackage.ubf;
import defpackage.wt3;
import defpackage.wwo;
import defpackage.xwo;
import defpackage.ysn;
import defpackage.zsn;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcix extends zzchl implements TextureView.SurfaceTextureListener, zzchv {
    public final zzcmi c;
    public final zzcig d;
    public final zzcie e;
    public final zzeaj f;
    public zzcht g;
    public Surface h;
    public zzcku i;
    public String j;
    public String[] k;
    public boolean l;
    public int m;
    public zzcid n;
    public final boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public float t;

    public zzcix(Context context, zzcig zzcigVar, zzcmi zzcmiVar, boolean z, zzcie zzcieVar, zzeaj zzeajVar) {
        super(context);
        this.m = 1;
        this.c = zzcmiVar;
        this.d = zzcigVar;
        this.o = z;
        this.e = zzcieVar;
        zzcigVar.a(this);
        this.f = zzeajVar;
    }

    public static String I(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(wt3.h(str.length(), 1, String.valueOf(canonicalName).length(), 1, String.valueOf(message).length()));
        bf3.v(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void A(int i) {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            zzckuVar.r(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void B(int i) {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            zzckuVar.s(i);
        }
    }

    public final boolean C() {
        zzcku zzckuVar = this.i;
        return (zzckuVar == null || !zzckuVar.p() || this.l) ? false : true;
    }

    public final boolean D() {
        return C() && this.m != 1;
    }

    public final void E(boolean z, Integer num) {
        zzcjs zzcjsVar;
        zzcku zzckuVar = this.i;
        if (zzckuVar != null && !z) {
            zzckuVar.s = num;
            return;
        }
        if (this.j == null || this.h == null) {
            return;
        }
        if (z) {
            if (!C()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzckuVar.B();
                F();
            }
        }
        if (this.j.startsWith("cache:")) {
            zzcmi zzcmiVar = this.c;
            String str = this.j;
            n nVar = zzcmiVar.a;
            synchronized (nVar) {
                HashMap hashMap = nVar.V;
                zzcjsVar = hashMap == null ? null : (zzcjs) hashMap.get(str);
            }
            if (zzcjsVar instanceof zzckb) {
                zzckb zzckbVar = (zzckb) zzcjsVar;
                synchronized (zzckbVar) {
                    zzckbVar.g = true;
                    zzckbVar.notify();
                }
                zzcku zzckuVar2 = zzckbVar.d;
                zzckuVar2.l = null;
                zzckbVar.d = null;
                this.i = zzckuVar2;
                zzckuVar2.s = num;
                if (!zzckuVar2.p()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcjsVar instanceof zzcjy)) {
                    String valueOf = String.valueOf(this.j);
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Stream cache miss: ".concat(valueOf));
                    return;
                }
                zzcjy zzcjyVar = (zzcjy) zzcjsVar;
                zzcmi zzcmiVar2 = this.c;
                com.google.android.gms.ads.internal.zzt.zzc().zze(zzcmiVar2.getContext(), zzcmiVar2.a.e.afmaVersion);
                synchronized (zzcjyVar.k) {
                    try {
                        ByteBuffer byteBuffer = zzcjyVar.i;
                        if (byteBuffer != null && !zzcjyVar.j) {
                            byteBuffer.flip();
                            zzcjyVar.j = true;
                        }
                        zzcjyVar.f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ByteBuffer byteBuffer2 = zzcjyVar.i;
                boolean z2 = zzcjyVar.n;
                String str2 = zzcjyVar.d;
                if (str2 == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Stream cache URL is null.");
                    return;
                }
                zzcie zzcieVar = this.e;
                zzcmi zzcmiVar3 = this.c;
                zzcku zzckuVar3 = new zzcku(zzcmiVar3.getContext(), zzcieVar, zzcmiVar3, num);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzh("ExoPlayerAdapter initialized.");
                this.i = zzckuVar3;
                zzckuVar3.z(new Uri[]{Uri.parse(str2)}, byteBuffer2, z2);
            }
        } else {
            zzcie zzcieVar2 = this.e;
            zzcmi zzcmiVar4 = this.c;
            zzcku zzckuVar4 = new zzcku(zzcmiVar4.getContext(), zzcieVar2, zzcmiVar4, num);
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh("ExoPlayerAdapter initialized.");
            this.i = zzckuVar4;
            zzcmi zzcmiVar5 = this.c;
            String zze = com.google.android.gms.ads.internal.zzt.zzc().zze(zzcmiVar5.getContext(), zzcmiVar5.a.e.afmaVersion);
            Uri[] uriArr = new Uri[this.k.length];
            int i7 = 0;
            while (true) {
                String[] strArr = this.k;
                if (i7 >= strArr.length) {
                    break;
                }
                uriArr[i7] = Uri.parse(strArr[i7]);
                i7++;
            }
            this.i.y(uriArr, zze);
        }
        this.i.l = this;
        G(this.h, false);
        if (this.i.p()) {
            int zzh = this.i.i.zzh();
            this.m = zzh;
            if (zzh == 3) {
                H();
            }
        }
    }

    public final void F() {
        if (this.i != null) {
            G(null, true);
            zzcku zzckuVar = this.i;
            if (zzckuVar != null) {
                zzckuVar.l = null;
                zzckuVar.A();
                this.i = null;
            }
            this.m = 1;
            this.l = false;
            this.p = false;
            this.q = false;
        }
    }

    public final void G(Surface surface, boolean z) {
        zzcku zzckuVar = this.i;
        if (zzckuVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzno zznoVar = zzckuVar.i;
            if (zznoVar != null) {
                zznoVar.c.b();
                cwo cwoVar = zznoVar.b;
                cwoVar.o();
                cwoVar.m(surface);
                int i2 = surface == null ? 0 : -1;
                cwoVar.n(i2, i2);
            }
        } catch (IOException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("", e);
        }
    }

    public final void H() {
        if (this.p) {
            return;
        }
        this.p = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new ysn(this, 0));
        x();
        zzcig zzcigVar = this.d;
        if (zzcigVar.i && !zzcigVar.j) {
            zzbjn.a(zzcigVar.e, zzcigVar.d, "vfr2");
            zzcigVar.j = true;
        }
        if (this.q) {
            l();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void a(long j, boolean z) {
        if (this.c != null) {
            zzcgj.f.execute(new zsn(this, z, j, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void b(int i, int i2) {
        this.r = i;
        this.s = i2;
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.t != f) {
            this.t = f;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void c(String str, Exception exc) {
        zzcku zzckuVar;
        String I = I(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(I);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi(concat);
        this.l = true;
        if (this.e.a && (zzckuVar = this.i) != null) {
            zzckuVar.w(false);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new bnn(6, this, I));
        com.google.android.gms.ads.internal.zzt.zzh().e("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void d(IOException iOException) {
        String I = I("onLoadException", iOException);
        String concat = "ExoPlayerAdapter exception: ".concat(I);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi(concat);
        com.google.android.gms.ads.internal.zzt.zzh().e("AdExoPlayerView.onException", iOException);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new nkn(this, I, false, 7));
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void e(int i) {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            zzckuVar.C(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void f(int i) {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            zzckuVar.D(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void g(int i) {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            Iterator it = zzckuVar.v.iterator();
            while (it.hasNext()) {
                itn itnVar = (itn) ((WeakReference) it.next()).get();
                if (itnVar != null) {
                    itnVar.r = i;
                    Iterator it2 = itnVar.s.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(itnVar.r);
                            } catch (SocketException e) {
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                zzo.zzj("Failed to update receive buffer size.", e);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final String h() {
        return "ExoPlayer/2".concat(true != this.o ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void i(zzcht zzchtVar) {
        this.g = zzchtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void j(String str) {
        if (str != null) {
            z(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void k() {
        if (C()) {
            this.i.B();
            F();
        }
        zzcig zzcigVar = this.d;
        zzcigVar.m = false;
        zzcij zzcijVar = this.b;
        zzcijVar.d = false;
        zzcijVar.a();
        zzcigVar.b();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void l() {
        zzcku zzckuVar;
        if (!D()) {
            this.q = true;
            return;
        }
        if (this.e.a && (zzckuVar = this.i) != null) {
            zzckuVar.w(true);
        }
        this.i.q(true);
        this.d.d();
        zzcij zzcijVar = this.b;
        zzcijVar.d = true;
        zzcijVar.a();
        this.a.c = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new ysn(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void m() {
        zzcku zzckuVar;
        if (D()) {
            if (this.e.a && (zzckuVar = this.i) != null) {
                zzckuVar.w(false);
            }
            this.i.q(false);
            this.d.m = false;
            zzcij zzcijVar = this.b;
            zzcijVar.d = false;
            zzcijVar.a();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new ysn(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int n() {
        if (D()) {
            return (int) this.i.i.c();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int o() {
        if (D()) {
            return (int) this.i.i.d();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.t;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.n == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcid zzcidVar = this.n;
        if (zzcidVar != null) {
            zzcidVar.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzcku zzckuVar;
        float f;
        int i3;
        SurfaceTexture surfaceTexture2;
        zzeaj zzeajVar;
        if (this.o) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.cf)).booleanValue() && (zzeajVar = this.f) != null) {
                zzeai a = zzeajVar.a();
                a.b("action", "svp_aepv");
                a.c();
            }
            zzcid zzcidVar = new zzcid(getContext());
            this.n = zzcidVar;
            zzcidVar.m = i;
            zzcidVar.l = i2;
            zzcidVar.o = surfaceTexture;
            zzcidVar.start();
            if (zzcidVar.o == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    zzcidVar.t.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = zzcidVar.n;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.n.b();
                this.n = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.h = surface;
        if (this.i == null) {
            E(false, null);
        } else {
            G(surface, true);
            if (!this.e.a && (zzckuVar = this.i) != null) {
                zzckuVar.w(true);
            }
        }
        int i4 = this.r;
        if (i4 == 0 || (i3 = this.s) == 0) {
            f = i2 > 0 ? i / i2 : 1.0f;
            if (this.t != f) {
                this.t = f;
                requestLayout();
            }
        } else {
            f = i3 > 0 ? i4 / i3 : 1.0f;
            if (this.t != f) {
                this.t = f;
                requestLayout();
            }
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new ysn(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m();
        zzcid zzcidVar = this.n;
        if (zzcidVar != null) {
            zzcidVar.b();
            this.n = null;
        }
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            if (zzckuVar != null) {
                zzckuVar.w(false);
            }
            Surface surface = this.h;
            if (surface != null) {
                surface.release();
            }
            this.h = null;
            G(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new ysn(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzcid zzcidVar = this.n;
        if (zzcidVar != null) {
            zzcidVar.a(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new qsn(this, i, i2, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d.c(this);
        this.a.a(surfaceTexture, this.g);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new q61(this, i, 9));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void p(int i) {
        if (D()) {
            long j = i;
            zzno zznoVar = this.i.i;
            int zzs = zznoVar.zzs();
            zznoVar.c.b();
            cwo cwoVar = zznoVar.b;
            cwoVar.o();
            if (zzs == -1) {
                return;
            }
            zzguk.a(zzs >= 0);
            zzbf zzbfVar = cwoVar.V.a;
            if (zzbfVar.g() || zzs < zzbfVar.a()) {
                zzpv zzpvVar = cwoVar.q;
                if (!zzpvVar.i) {
                    zznr o = zzpvVar.o();
                    zzpvVar.i = true;
                    zzpvVar.n(o, -1, new ubf(25));
                }
                cwoVar.E++;
                if (cwoVar.v()) {
                    zzeh.c("seekTo ignored because an ad is playing");
                    zzlv zzlvVar = new zzlv(cwoVar.V);
                    zzlvVar.a(1);
                    cwoVar.k.o(zzlvVar);
                    return;
                }
                eyo eyoVar = cwoVar.V;
                int i2 = eyoVar.e;
                if (i2 == 3 || (i2 == 4 && !zzbfVar.g())) {
                    eyoVar = cwoVar.V.d(2);
                }
                int zzs2 = cwoVar.zzs();
                eyo j2 = cwoVar.j(eyoVar, zzbfVar, cwoVar.l(zzbfVar, zzs, j));
                xwo xwoVar = cwoVar.l;
                long u = zzfm.u(j);
                xwoVar.getClass();
                xwoVar.g.h(3, new wwo(zzbfVar, zzs, u)).a();
                cwoVar.h(j2, 0, true, 1, cwoVar.g(j2), zzs2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void q(float f, float f2) {
        zzcid zzcidVar = this.n;
        if (zzcidVar != null) {
            zzcidVar.c(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int r() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int s() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long t() {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            return zzckuVar.t();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long u() {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            return zzckuVar.u();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long v() {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            return zzckuVar.v();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int w() {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            return zzckuVar.n;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void x() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new ysn(this, 7));
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final Integer y() {
        zzcku zzckuVar = this.i;
        if (zzckuVar != null) {
            return zzckuVar.s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void z(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.k = new String[]{str};
        } else {
            this.k = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.j;
        boolean z = false;
        if (this.e.k && str2 != null && !str.equals(str2) && this.m == 4) {
            z = true;
        }
        this.j = str;
        E(z, num);
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new ysn(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzs(int i) {
        zzcku zzckuVar;
        if (this.m != i) {
            this.m = i;
            if (i == 3) {
                H();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.e.a && (zzckuVar = this.i) != null) {
                zzckuVar.w(false);
            }
            this.d.m = false;
            zzcij zzcijVar = this.b;
            zzcijVar.d = false;
            zzcijVar.a();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new ysn(this, 2));
        }
    }
}
