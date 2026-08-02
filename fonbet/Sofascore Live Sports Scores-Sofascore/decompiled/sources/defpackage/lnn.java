package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class lnn implements j3o {
    public final mqn a;
    public final String b;
    public final c0l d;
    public final Context e;
    public final c7o f;
    public final nxn g;
    public final z0o h;
    public final ion i;
    public final qyn j;
    public final c0l k;
    public gmo l;
    public AdsRenderingSettingsImpl m;
    public final f0o n;
    public tgn o;
    public aeo p;
    public final ArrayList c = new ArrayList(1);
    public boolean q = false;

    public lnn(String str, mqn mqnVar, f0o f0oVar, z0o z0oVar, gbo gboVar, c7o c7oVar, nxn nxnVar, c0l c0lVar, b7p b7pVar, Context context, boolean z) {
        this.p = f0oVar;
        this.b = str;
        this.a = mqnVar;
        this.h = z0oVar;
        this.e = context;
        this.d = c0lVar;
        AdsRenderingSettingsImpl adsRenderingSettingsImpl = new AdsRenderingSettingsImpl();
        this.m = adsRenderingSettingsImpl;
        f0o f0oVar2 = new f0o(19, context, adsRenderingSettingsImpl);
        this.n = f0oVar2;
        this.i = new ion(context, b7pVar, str, gboVar, c0lVar, f0oVar2, mqnVar);
        this.j = new qyn(context, b7pVar, str, gboVar, c0lVar, f0oVar2, mqnVar);
        r1c r1cVar = null;
        if (Build.VERSION.SDK_INT >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 5) {
            r1cVar = r1c.b(context);
        }
        this.k = new c0l(15, r1cVar, b7pVar);
        this.f = c7oVar;
        c7oVar.f = z;
        this.g = nxnVar;
    }

    public final void c(String str) {
        mqn mqnVar = this.a;
        if (y9.u(this.e, mqnVar.e)) {
            this.p.mo791zzc();
            mqnVar.d(new lda(JavaScriptMessage$MsgChannel.userInteraction, JavaScriptMessage$MsgType.focusUiElement, str, null, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r1 != 28) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(ox9 ox9Var) {
        gmo gmoVar = (gmo) ox9Var.c;
        xf xfVar = (xf) ox9Var.b;
        int ordinal = xfVar.ordinal();
        c7o c7oVar = this.f;
        if (ordinal != 5) {
            if (ordinal != 6) {
                String str = this.b;
                if (ordinal != 14) {
                    if (ordinal != 16) {
                        if (ordinal == 21) {
                            this.l = gmoVar;
                        }
                    }
                    if (gmoVar != null) {
                        this.l = gmoVar;
                    }
                    if (this.m.getFocusSkipButtonWhenAvailable()) {
                        c(str);
                    }
                } else if (this.m.getFocusSkipButtonWhenAvailable()) {
                    c(str);
                }
            } else {
                c7oVar.c();
            }
        } else if (c7oVar.f) {
            Context applicationContext = c7oVar.c.getContext().getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                gt7 gt7Var = new gt7(c7oVar, 1);
                c7oVar.d = gt7Var;
                application.registerActivityLifecycleCallbacks(gt7Var);
            }
        }
        hoo hooVar = new hoo(xfVar, this.l, (Map) ox9Var.d, (v9f) ox9Var.f, (wje) ox9Var.g, (tkn) ((b2p) ox9Var.e).i());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((wf) it.next()).c(hooVar);
        }
        if (xfVar == xf.d || xfVar == xf.p) {
            this.l = null;
        }
    }

    public final void e(JavaScriptMessage$MsgType javaScriptMessage$MsgType) {
        this.a.d(new lda(JavaScriptMessage$MsgChannel.adsManager, javaScriptMessage$MsgType, this.b, null, null));
    }

    public final void f() {
        this.g.w();
        this.f.c();
        tgn tgnVar = this.o;
        if (tgnVar != null) {
            ((Application) tgnVar.b).unregisterActivityLifecycleCallbacks(tgnVar);
            ((ArrayList) tgnVar.c).clear();
        }
        this.a.a.remove(this.b);
        this.c.clear();
        ((List) this.d.b).clear();
        this.h.zzb();
        this.p.zzb();
        this.p = new g8o();
    }
}
