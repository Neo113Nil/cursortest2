package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.vp2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhy implements zzhs {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final zzid c;
    public zzif d;
    public zzhj e;
    public zzhp f;
    public zzhs g;
    public zzis h;
    public zzhq i;
    public zzio j;
    public zzhs k;

    public zzhy(Context context, zzid zzidVar) {
        this.a = context.getApplicationContext();
        this.c = zzidVar;
    }

    public static final void l(zzhs zzhsVar, zziq zziqVar) {
        if (zzhsVar != null) {
            zzhsVar.c(zziqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        zzhs zzhsVar;
        zzguk.f(this.k == null);
        Uri uri = zzhwVar.a;
        String scheme = uri.getScheme();
        String str = zzfm.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || Objects.equals(scheme2, U3.i.b)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    zzif zzifVar = new zzif();
                    this.d = zzifVar;
                    k(zzifVar);
                }
                zzhsVar = this.d;
                this.k = zzhsVar;
            } else {
                if (this.e == null) {
                    zzhj zzhjVar = new zzhj(context);
                    this.e = zzhjVar;
                    k(zzhjVar);
                }
                zzhsVar = this.e;
                this.k = zzhsVar;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                zzhj zzhjVar2 = new zzhj(context);
                this.e = zzhjVar2;
                k(zzhjVar2);
            }
            zzhsVar = this.e;
            this.k = zzhsVar;
        } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme)) {
            if (this.f == null) {
                zzhp zzhpVar = new zzhp(context);
                this.f = zzhpVar;
                k(zzhpVar);
            }
            zzhsVar = this.f;
            this.k = zzhsVar;
        } else {
            boolean equals = "rtmp".equals(scheme);
            zzid zzidVar = this.c;
            if (equals) {
                zzhsVar = this.g;
                if (zzhsVar == null) {
                    try {
                        zzhs zzhsVar2 = (zzhs) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = zzhsVar2;
                        k(zzhsVar2);
                    } catch (ClassNotFoundException unused) {
                        zzeh.c("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        vp2.e("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    zzhsVar = this.g;
                    if (zzhsVar == null) {
                        this.g = zzidVar;
                        zzhsVar = zzidVar;
                    }
                }
                this.k = zzhsVar;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    zzis zzisVar = new zzis(0);
                    this.h = zzisVar;
                    k(zzisVar);
                }
                zzhsVar = this.h;
                this.k = zzhsVar;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    zzhq zzhqVar = new zzhq();
                    this.i = zzhqVar;
                    k(zzhqVar);
                }
                zzhsVar = this.i;
                this.k = zzhsVar;
            } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    zzio zzioVar = new zzio(context);
                    this.j = zzioVar;
                    k(zzioVar);
                }
                zzhsVar = this.j;
                this.k = zzhsVar;
            } else {
                this.k = zzidVar;
                zzhsVar = zzidVar;
            }
        }
        return zzhsVar.a(zzhwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        zzhs zzhsVar = this.k;
        zzhsVar.getClass();
        return zzhsVar.b(i, i2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void c(zziq zziqVar) {
        zziqVar.getClass();
        this.c.c(zziqVar);
        this.b.add(zziqVar);
        l(this.d, zziqVar);
        l(this.e, zziqVar);
        l(this.f, zziqVar);
        l(this.g, zziqVar);
        l(this.h, zziqVar);
        l(this.i, zziqVar);
        l(this.j, zziqVar);
    }

    public final void k(zzhs zzhsVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            zzhsVar.c((zziq) arrayList.get(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        zzhs zzhsVar = this.k;
        if (zzhsVar == null) {
            return null;
        }
        return zzhsVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        zzhs zzhsVar = this.k;
        if (zzhsVar != null) {
            try {
                zzhsVar.zzd();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Map zzj() {
        zzhs zzhsVar = this.k;
        return zzhsVar == null ? Collections.EMPTY_MAP : zzhsVar.zzj();
    }
}
