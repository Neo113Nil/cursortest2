package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n implements h {
    public final h a;
    public final s b;
    public final d c;
    public final f d;
    public h e;

    public n(Context context, m mVar, h hVar) {
        hVar.getClass();
        this.a = hVar;
        this.b = new s(mVar);
        this.c = new d(context, mVar);
        this.d = new f(context, mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) {
        h hVar;
        if (this.e != null) {
            zzl.s();
            return 0L;
        }
        String scheme = kVar.a.getScheme();
        Uri uri = kVar.a;
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || scheme2.equals(U3.i.b)) {
            if (kVar.a.getPath().startsWith("/android_asset/")) {
                hVar = this.c;
                this.e = hVar;
            } else {
                hVar = this.b;
                this.e = hVar;
            }
        } else if ("asset".equals(scheme)) {
            hVar = this.c;
            this.e = hVar;
        } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme)) {
            hVar = this.d;
            this.e = hVar;
        } else {
            hVar = this.a;
            this.e = hVar;
        }
        return hVar.a(kVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        h hVar = this.e;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        return this.e.read(bArr, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        h hVar = this.e;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
