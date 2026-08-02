package defpackage;

import android.os.Bundle;
import android.widget.SeekBar;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.mediarouter.app.d;
import androidx.mediarouter.app.e;
import com.google.android.gms.cast.CastRemoteDisplayLocalService;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aac extends jbc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aac(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jbc
    public void a() {
        switch (this.a) {
            case 0:
                ((MediaRouteButton) this.b).b();
                break;
        }
    }

    @Override // defpackage.jbc
    public void b() {
        switch (this.a) {
            case 0:
                ((MediaRouteButton) this.b).b();
                break;
        }
    }

    @Override // defpackage.jbc
    public void c() {
        switch (this.a) {
            case 0:
                ((MediaRouteButton) this.b).b();
                break;
        }
    }

    @Override // defpackage.jbc
    public void d(pbc pbcVar, obc obcVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 1:
                ((dac) obj).g();
                break;
            case 3:
                ((tac) obj).f();
                break;
            case 4:
                ((bbc) obj).m();
                break;
        }
    }

    @Override // defpackage.jbc
    public void e(pbc pbcVar, obc obcVar) {
        lbc a;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 1:
                ((dac) obj).g();
                break;
            case 2:
                ((d) obj).q(true);
                break;
            case 3:
                ((tac) obj).f();
                break;
            case 4:
                bbc bbcVar = (bbc) obj;
                if (obcVar == bbcVar.j && obc.b() != null) {
                    nbc nbcVar = obcVar.a;
                    pbc.b();
                    for (obc obcVar2 : Collections.unmodifiableList(nbcVar.b)) {
                        if (!Collections.unmodifiableList(bbcVar.j.v).contains(obcVar2) && (a = bbcVar.j.a()) != null && a.o(obcVar2) && !bbcVar.l.contains(obcVar2)) {
                            bbcVar.n();
                            bbcVar.l();
                            break;
                        }
                    }
                }
                bbcVar.m();
                break;
        }
    }

    @Override // defpackage.jbc
    public void h(pbc pbcVar, obc obcVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 1:
                ((dac) obj).g();
                break;
            case 3:
                ((tac) obj).f();
                break;
            case 4:
                ((bbc) obj).m();
                break;
        }
    }

    @Override // defpackage.jbc
    public void i(obc obcVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 1:
                ((dac) obj).dismiss();
                break;
            case 3:
                ((tac) obj).dismiss();
                break;
            case 4:
                bbc bbcVar = (bbc) obj;
                bbcVar.j = obcVar;
                bbcVar.n();
                bbcVar.l();
                break;
        }
    }

    @Override // defpackage.jbc
    public void k() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 2:
                ((d) obj).q(false);
                break;
            case 4:
                ((bbc) obj).m();
                break;
            case 5:
                CastRemoteDisplayLocalService castRemoteDisplayLocalService = (CastRemoteDisplayLocalService) obj;
                castRemoteDisplayLocalService.a("onRouteUnselected");
                castRemoteDisplayLocalService.a("onRouteUnselected, no device was selected");
                break;
        }
    }

    @Override // defpackage.jbc
    public void m(obc obcVar) {
        e eVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                d dVar = (d) obj;
                SeekBar seekBar = (SeekBar) dVar.T.get(obcVar);
                int i2 = obcVar.p;
                int i3 = d.r0;
                if (seekBar != null && dVar.O != obcVar) {
                    seekBar.setProgress(i2);
                    break;
                }
                break;
            case 4:
                int i4 = bbc.U;
                bbc bbcVar = (bbc) obj;
                if (bbcVar.x != obcVar && (eVar = (e) bbcVar.w.get(obcVar.c)) != null) {
                    int i5 = eVar.b.p;
                    eVar.b(i5 == 0);
                    eVar.d.setProgress(i5);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jbc
    public void n(sbc sbcVar) {
        switch (this.a) {
            case 0:
                boolean z = sbcVar != null ? Bundle.EMPTY.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
                MediaRouteButton mediaRouteButton = (MediaRouteButton) this.b;
                if (mediaRouteButton.f != z) {
                    mediaRouteButton.f = z;
                    mediaRouteButton.refreshDrawableState();
                    break;
                }
                break;
        }
    }
}
