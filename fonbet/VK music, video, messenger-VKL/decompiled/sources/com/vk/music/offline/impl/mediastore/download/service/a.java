package com.vk.music.offline.impl.mediastore.download.service;

import android.content.Context;
import android.content.Intent;
import androidx.media3.exoplayer.offline.c;
import androidx.media3.exoplayer.scheduler.Requirements;
import com.vk.music.offline.impl.mediastore.download.service.DownloadService;
import java.util.List;
import java.util.Objects;
import xsna.bn40;
import xsna.bpn0;
import xsna.c8h0;
import xsna.o7o;
import xsna.t9o;
import xsna.y2r0;

/* compiled from: DownloadManagerHelper.kt */
/* loaded from: classes3.dex */
public final class a implements c.InterfaceC0061c {
    public final Context b;
    public final c c;
    public final c8h0 d;
    public final Class<? extends DownloadService> e;
    public DownloadService f;
    public t9o g;
    public Requirements h;

    public a(Context context, c cVar, c8h0 c8h0Var, Class<? extends DownloadService> cls) {
        this.b = context;
        this.c = cVar;
        this.d = c8h0Var;
        this.e = cls;
        cVar.f.add(this);
        i();
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void a(o7o o7oVar) {
        DownloadService downloadService = this.f;
        if (downloadService != null) {
            DownloadService.b bVar = downloadService.j;
            if (bVar.c) {
                bVar.a();
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void b() {
        DownloadService downloadService = this.f;
        if (downloadService != null) {
            downloadService.o();
        }
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void c(c cVar, boolean z) {
        if (z || cVar.j) {
            return;
        }
        DownloadService downloadService = this.f;
        if (downloadService == null || downloadService.n) {
            List<o7o> list = cVar.o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).b == 0) {
                    h();
                    return;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void d() {
        i();
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void e(c cVar, o7o o7oVar, Exception exc) {
        t9o t9oVar;
        int i = o7oVar.b;
        DownloadService downloadService = this.f;
        if (downloadService != null) {
            DownloadService.b bVar = downloadService.j;
            bpn0 bpn0Var = DownloadService.p;
            if (DownloadService.a.c(i)) {
                bVar.b = true;
                bVar.a();
            } else if (bVar.c) {
                bVar.a();
            }
        }
        DownloadService downloadService2 = this.f;
        if (downloadService2 == null || downloadService2.n) {
            bpn0 bpn0Var2 = DownloadService.p;
            if (DownloadService.a.c(i)) {
                bn40.h("DownloadService", "DownloadService wasn't running. Restarting.");
                h();
            }
        }
        if (cVar.o.isEmpty()) {
            if ((i == 3 || i == 4) && (t9oVar = this.g) != null) {
                t9oVar.d();
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void f(c cVar) {
        DownloadService downloadService = this.f;
        if (downloadService != null) {
            downloadService.n(cVar.o);
        }
    }

    public final void g() {
        Requirements requirements = new Requirements(0);
        Requirements requirements2 = this.h;
        String str = y2r0.a;
        if (Objects.equals(requirements2, requirements)) {
            return;
        }
        c8h0 c8h0Var = this.d;
        if (c8h0Var != null) {
            c8h0Var.cancel();
        }
        this.h = requirements;
    }

    public final void h() {
        Context context = this.b;
        try {
            Intent action = new Intent(context, this.e).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
            String str = y2r0.a;
            context.startForegroundService(action);
        } catch (IllegalStateException unused) {
            bn40.h("DownloadService", "Failed to restart (foreground launch restriction)");
        }
    }

    public final boolean i() {
        c cVar = this.c;
        c8h0 c8h0Var = this.d;
        if (c8h0Var == null) {
            return !cVar.n;
        }
        if (!cVar.n) {
            g();
            return true;
        }
        Requirements requirements = cVar.p.c;
        if (!c8h0Var.b(requirements).equals(requirements)) {
            g();
            return false;
        }
        Requirements requirements2 = this.h;
        String str = y2r0.a;
        if (Objects.equals(requirements2, requirements)) {
            return true;
        }
        if (c8h0Var.a(requirements, this.b.getPackageName())) {
            this.h = requirements;
            return true;
        }
        bn40.h("DownloadService", "Failed to schedule restart");
        g();
        return false;
    }
}
