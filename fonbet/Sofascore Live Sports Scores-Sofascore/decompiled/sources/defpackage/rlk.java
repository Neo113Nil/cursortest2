package defpackage;

import android.graphics.Matrix;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rlk implements wke {
    public final String a;
    public final TextureView b;
    public final plk c;
    public final olk d;
    public final int e;
    public final List f;
    public final Matrix g;
    public final ad2 h;
    public final mqi i;
    public final mqi j;
    public ExoPlayer k;
    public boolean l;
    public boolean m;
    public boolean n;
    public g9i o;
    public g9i p;
    public zqk q;
    public long r;
    public long s;
    public int t;
    public String u;

    public rlk(String str, TextureView textureView, plk plkVar, olk olkVar, int i) {
        ArrayList arrayList = new ArrayList();
        str.getClass();
        plkVar.getClass();
        this.a = str;
        this.b = textureView;
        this.c = plkVar;
        this.d = olkVar;
        this.e = i;
        this.f = arrayList;
        this.g = new Matrix();
        this.h = s9a.k();
        this.i = ypa.b(new qlk(this, 1));
        this.j = ypa.b(new qlk(this, 0));
        this.r = C.TIME_UNSET;
    }

    public final void a() {
        ExoPlayer exoPlayer = this.k;
        if (exoPlayer != null) {
            if (((vg6) exoPlayer).getDuration() == C.TIME_UNSET) {
                exoPlayer = null;
            }
            if (exoPlayer != null) {
                vg6 vg6Var = (vg6) exoPlayer;
                this.s = vg6Var.getCurrentPosition();
                this.r = vg6Var.getDuration();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // defpackage.wke
    public final void onIsPlayingChanged(boolean z) {
        ExoPlayer exoPlayer;
        ?? r6;
        flk flkVar;
        rq3 rq3Var = null;
        olk olkVar = this.d;
        List<pkk> list = this.f;
        if (!z) {
            g9i g9iVar = this.p;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            if (this.l && (exoPlayer = this.k) != null && ((vg6) exoPlayer).getPlaybackState() == 3) {
                for (pkk pkkVar : list) {
                    pkkVar.getClass();
                    olkVar.getClass();
                    if (!pkkVar.i && pkkVar.a == 3) {
                        g7a.v(pkkVar.g, 12, pkkVar.o());
                        pkkVar.b(zf.d);
                    }
                }
                return;
            }
            return;
        }
        if (this.l) {
            for (pkk pkkVar2 : list) {
                pkkVar2.getClass();
                olkVar.getClass();
                if (!pkkVar2.i) {
                    g7a.v(pkkVar2.g, 13, pkkVar2.o());
                    pkkVar2.b(zf.e);
                }
            }
        } else {
            a();
            for (pkk pkkVar3 : list) {
                pkkVar3.getClass();
                olkVar.getClass();
                if (pkkVar3.a == 2) {
                    olk olkVar2 = pkkVar3.g;
                    Map o = pkkVar3.o();
                    olkVar2.getClass();
                    tkk tkkVar = olkVar2.b;
                    if (tkkVar == null || (flkVar = tkkVar.a) == null) {
                        r6 = km5.a;
                    } else {
                        ArrayList arrayList = flkVar.c;
                        r6 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            r6.add(((elk) it.next()).a);
                        }
                    }
                    g7a.w(o, r6, "Impression");
                    pkkVar3.n(zf.b);
                }
            }
            this.l = true;
        }
        this.p = xw3.L(this.h, null, null, new vki(this, rq3Var, 28), 3);
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        Object u2gVar;
        olk olkVar = this.d;
        List<pkk> list = this.f;
        if (i == 2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((pkk) it.next()).getClass();
                olkVar.getClass();
            }
            return;
        }
        if (i == 3) {
            if (this.m) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((pkk) it2.next()).s(olkVar);
                }
            }
            this.m = false;
            return;
        }
        if (i != 4) {
            return;
        }
        for (pkk pkkVar : list) {
            pkkVar.getClass();
            olkVar.getClass();
            if (!pkkVar.i) {
                pkkVar.l.setVisibility(8);
                pkkVar.j.setVisibility(8);
                pkkVar.m.setVisibility(8);
                pkkVar.i = true;
                u53 u53Var = pkkVar.o;
                lcd lcdVar = pkkVar.k;
                Map o = pkkVar.o();
                u53Var.getClass();
                lcdVar.getClass();
                try {
                    p2g p2gVar = w2g.b;
                    if (u53Var.a) {
                        u53Var.e(lcdVar, pkkVar);
                        u2gVar = Unit.a;
                    } else {
                        ku3 ku3Var = (ku3) u53Var.d;
                        hs4 hs4Var = z45.a;
                        u2gVar = xw3.L(ku3Var, hq4.c, null, new u1(u53Var, lcdVar, o, pkkVar, null, 9), 2);
                    }
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                Throwable a = w2g.a(u2gVar);
                if (a != null) {
                    pkkVar.r(new qcd(4, "Error rendering companion ad", a));
                }
                pkkVar.n(zf.i);
                Object obj = pkkVar.f.k;
                if (obj != null) {
                    g51 g51Var = (g51) obj;
                    g51Var.M(5, 0L);
                    g51Var.setPlayWhenReady(false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    @Override // defpackage.wke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPlayerError(dke dkeVar) {
        dkeVar.getClass();
        for (pkk pkkVar : this.f) {
            int i = dkeVar.a;
            if (i != 1003) {
                switch (i) {
                    case 2001:
                    case 2002:
                    case 2003:
                    case 2004:
                    case 2005:
                    case 2006:
                        break;
                    default:
                        switch (i) {
                            case 4003:
                            case 4004:
                            case 4005:
                                break;
                            default:
                                switch (i) {
                                }
                                while (r0.hasNext()) {
                                }
                                break;
                        }
                }
            }
            pkkVar.getClass();
            this.d.getClass();
            if (pkkVar.a != 5) {
                pkkVar.c(new qcd(5, "Error during video playback", null));
            }
        }
    }

    @Override // defpackage.wke
    public final void onVideoSizeChanged(zqk zqkVar) {
        zqkVar.getClass();
        float f = zqkVar.a;
        int i = zqkVar.b;
        float f2 = i;
        TextureView textureView = this.b;
        float min = Math.min(textureView.getWidth() / f, textureView.getHeight() / f2);
        Matrix transform = textureView.getTransform(this.g);
        transform.setScale((f / textureView.getWidth()) * min, (f2 / textureView.getHeight()) * min);
        transform.postTranslate(mz1.c(zqkVar.a, min, textureView.getWidth(), 2.0f), mz1.c(i, min, textureView.getHeight(), 2.0f));
        textureView.setTransform(transform);
        this.q = zqkVar;
    }

    @Override // defpackage.wke
    public final void onVolumeChanged(float f) {
        if (s9a.w(this.h)) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((pkk) it.next()).getClass();
                this.d.getClass();
            }
        }
    }
}
