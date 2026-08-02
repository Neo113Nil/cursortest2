package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzex;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzje;
import com.google.android.gms.internal.ads.zzjf;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zzpv;
import com.google.android.gms.internal.ads.zzrz;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzwo;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzzu;
import com.ironsource.W3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class auo implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaey, zzrz, zzzu, zzwo, zzby, zzex {
    public final /* synthetic */ cwo a;

    public /* synthetic */ auo(cwo cwoVar) {
        this.a = cwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void a(Object obj, long j) {
        cwo cwoVar = this.a;
        zzpv zzpvVar = cwoVar.q;
        zznr r = zzpvVar.r();
        zzpvVar.n(r, 26, new wid(r, obj, j));
        if (cwoVar.J == obj) {
            zzeg zzegVar = cwoVar.m;
            zzegVar.c(26, y9f.p);
            zzegVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void b(zzv zzvVar, zzjf zzjfVar) {
        zzpv zzpvVar = this.a.q;
        zznr r = zzpvVar.r();
        zzpvVar.n(r, 1017, new gmo(r, zzvVar, zzjfVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void c(zzje zzjeVar) {
        zzpv zzpvVar = this.a.q;
        zznr q = zzpvVar.q((zzxo) zzpvVar.d.f);
        zzpvVar.n(q, 1020, new ohn(29, q, zzjeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void d(zzjc zzjcVar) {
        this.a.D.e(zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void e(int i, long j) {
        zzpv zzpvVar = this.a.q;
        zznr q = zzpvVar.q((zzxo) zzpvVar.d.f);
        zzpvVar.n(q, 1018, new zid(q, i, j));
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void f(zzbv zzbvVar) {
        fjn fjnVar = new fjn(zzbvVar, 25);
        zzeg zzegVar = this.a.m;
        zzegVar.c(25, fjnVar);
        zzegVar.d();
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void g(zzfe zzfeVar) {
        this.a.d(new zzjn(2, zzfeVar, 1003));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        cwo cwoVar = this.a;
        cwoVar.m(surface);
        cwoVar.K = surface;
        cwoVar.n(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        cwo cwoVar = this.a;
        cwoVar.m(null);
        cwoVar.n(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.n(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.n(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.n(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzb() {
        zzpv zzpvVar = this.a.q;
        zzpvVar.n(zzpvVar.r(), 1015, new w9f(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzc() {
        zzpv zzpvVar = this.a.q;
        zzpvVar.n(zzpvVar.r(), W3.l, new y9f(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzh() {
        zzpv zzpvVar = this.a.q;
        zzpvVar.n(zzpvVar.r(), 1019, new haf(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzj() {
        zzpv zzpvVar = this.a.q;
        zzpvVar.n(zzpvVar.q((zzxo) zzpvVar.d.f), IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new dff(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzk() {
        zzpv zzpvVar = this.a.q;
        zzpvVar.n(zzpvVar.r(), IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new fff(25));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
