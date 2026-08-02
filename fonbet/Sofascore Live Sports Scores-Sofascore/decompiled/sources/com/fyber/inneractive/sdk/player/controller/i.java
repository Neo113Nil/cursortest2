package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ q a;

    public i(q qVar) {
        this.a = qVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        q qVar = this.a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureAvailable", IAlog.a(qVar));
        q.a(this.a, surfaceTexture);
        x xVar = this.a.d;
        if (xVar != null) {
            z zVar = xVar.a;
            zVar.getClass();
            IAlog.a("%s onTextureViewAvailable", IAlog.a(zVar));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        q qVar = this.a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureDestroyed", IAlog.a(qVar));
        this.a.i();
        this.a.a((Surface) null);
        q qVar2 = this.a;
        qVar2.o = true;
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.e;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
            IAlog.a("%sReleasing surface texture", IAlog.a(qVar2));
            this.a.k = null;
            return true;
        }
        IAlog.a("%s caching surface texture", IAlog.a(qVar2));
        q qVar3 = this.a;
        qVar3.k = surfaceTexture;
        qVar3.i.post(new h(this));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        q qVar = this.a;
        if (qVar.e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            int b = qVar.b();
            int c = qVar.c();
            if (b <= 0 || b > c) {
                return;
            }
            qVar.a(b - 1, false);
            qVar.a(b, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar = this.a.d;
        if (xVar != null && (fVar = xVar.a.a) != null && (qVar = fVar.a) != null) {
            qVar.i.post(new n(qVar));
        }
        q qVar2 = this.a;
        if (!qVar2.o || (surface = qVar2.l) == null) {
            return;
        }
        qVar2.a(surface);
        this.a.o = false;
    }
}
